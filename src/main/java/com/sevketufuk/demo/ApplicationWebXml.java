package com.sevketufuk.demo;

import com.sevketufuk.demo.config.DefaultProfileUtil;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ApplicationWebXml extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        DefaultProfileUtil.addDefaultProfile(application.application());
        return application.sources(LablicatedemoApp.class);
    }
}
