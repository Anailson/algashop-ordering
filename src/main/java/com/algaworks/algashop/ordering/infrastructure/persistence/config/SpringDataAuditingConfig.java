package com.algaworks.algashop.ordering.infrastructure.persistence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.UUID;

@Configuration
@EnableJpaAuditing(
        dateTimeProviderRef = "auditingDateTimeProvider",
        auditorAwareRef = "auditorProvider"
)
public class SpringDataAuditingConfig {

    @Bean
    public DateTimeProvider auditingDateTimeProvider() {
        return () -> Optional.of(OffsetDateTime.now().truncatedTo(ChronoUnit.MILLIS));
    }

    @Bean
    public AuditorAware<UUID> auditorProvider() {
        return () -> Optional.of(UUID.randomUUID());
    }
}


/*
Auditoria
rastrear de forma transparente quem criou ou alterou uma entidade e quando a alteração ocorreu. Para aproveitar essa funcionalidade,
você precisa equipar suas classes de entidade com metadados de auditoria, que podem ser definidos usando anotações ou implementando uma interface. Além disso, a
auditoria precisa ser habilitada por meio de configuração de anotações ou configuração XML para registrar os componentes de infraestrutura necessário
 */