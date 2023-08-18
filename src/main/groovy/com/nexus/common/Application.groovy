package com.nexus.common

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@SuppressWarnings('SpringBootApplicationSetup')
@SpringBootApplication(exclude = [JmxAutoConfiguration.class, JmxEndpointAutoConfiguration.class])
@ComponentScan(['com.nexus'])
class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class)
    }

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }

}