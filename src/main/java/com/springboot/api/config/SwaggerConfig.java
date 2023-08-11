package com.test.security.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// https://happy-jjang-a.tistory.com/165
// https://stackoverflow.com/questions/76702213/configure-jwt-token-in-swagger-3-0-in-spring-boot-3
// https://www.baeldung.com/spring-boot-swagger-jwt
// https://velog.io/@junho5336/SpringBoot-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-with.-SpringSecurity-JWT

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Bean
    OpenAPI openAPI() {

        Info info = new Info()
                .version("v1.0.0")
                .title("Spring Security Test")
                .description("Security API 테스트 명세서");


        return new OpenAPI()
                .info(info)
                .components(new Components())
                ;
    }

}
