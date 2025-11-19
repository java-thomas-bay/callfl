package com.senai.infoa.trabalhofablab.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title="callfl",
        version="1.0",
        description = "Grupo: Pedro Francisco, João Pedro, Guilherme Rodrigues, João Francisco, Thomas Bayão"
    )
)

public class Swagger {
    
}