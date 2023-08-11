package com.springboot.api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Bean
    OpenAPI openAPI() {

        Info info = new Info()
                .version("v1.0.0")
                .title("Spring Boot Open API Test with Swagger")
                .description("Spring Boot Open API");

        return new OpenAPI()
                .info(info)
                .components(new Components());
    }

}
