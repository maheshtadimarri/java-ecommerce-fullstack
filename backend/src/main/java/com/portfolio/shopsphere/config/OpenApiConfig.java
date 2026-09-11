package com.portfolio.shopsphere.config;
import io.swagger.v3.oas.models.OpenAPI; import io.swagger.v3.oas.models.info.Info; import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration;
@Configuration public class OpenApiConfig { @Bean OpenAPI shopSphereOpenAPI(){return new OpenAPI().info(new Info().title("ShopSphere API").version("1.0").description("E-commerce catalog, cart and order API."));} }
