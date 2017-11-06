package com.sevketufuk.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Lablicatedemo.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
