package com.sevketufuk.demo;

import com.sevketufuk.demo.config.ApplicationProperties;
import com.sevketufuk.demo.config.DefaultProfileUtil;

import io.github.jhipster.config.JHipsterConstants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;

@ComponentScan
@EnableAutoConfiguration(exclude = {MetricFilterAutoConfiguration.class, MetricRepositoryAutoConfiguration.class})
@EnableConfigurationProperties({LiquibaseProperties.class, ApplicationProperties.class})
public class LablicatedemoApp {

    private static final Logger log = LoggerFactory.getLogger(LablicatedemoApp.class);

    private final Environment env;

    public LablicatedemoApp(Environment env) {
        this.env = env;
    }

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(LablicatedemoApp.class);
        DefaultProfileUtil.addDefaultProfile(app);
        Environment env = app.run(args).getEnvironment();
    }
}
