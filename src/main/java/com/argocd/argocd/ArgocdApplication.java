package com.argocd.argocd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ArgocdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArgocdApplication.class, args);
    }

}
