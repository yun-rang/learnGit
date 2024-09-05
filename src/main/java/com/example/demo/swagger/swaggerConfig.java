package com.example.demo.swagger;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class swaggerConfig {
    /**
     * 
     *
     * @return
     */
    @Bean
    public GroupedOpenApi usersGroup(){
        return  GroupedOpenApi.builder()
                .group("employee")
                .packagesToScan("com.example.demo")
                .build();
    }

    /**
     *
     * @return
     */
    @Bean
    public OpenAPI springShopOpenApi(){
        return new OpenAPI()
                .info(new Info().title("云的program")
                        .contact(new Contact())
                        .version("v1.0.0")
                );
    }
}
