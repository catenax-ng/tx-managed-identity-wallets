package org.eclipse.tractusx.managedidentitywallets.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Managed Identity Wallets API")
            .description("Managed Identity Wallets API")
            .license("Apache 2.0")
            .licenseUrl("https://github.com/eclipse-tractusx/managed-identity-wallets/blob/develop/LICENSE")
            .termsOfServiceUrl("https://projects.eclipse.org/projects/automotive.tractusx")
            .version("0.0.1")
            .contact(new Contact("","", "tractusx-dev@eclipse.org"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Managed Identity Wallets API")
                .description("Managed Identity Wallets API")
                .termsOfService("https://projects.eclipse.org/projects/automotive.tractusx")
                .version("0.0.1")
                .license(new License()
                    .name("Apache 2.0")
                    .url("https://github.com/eclipse-tractusx/managed-identity-wallets/blob/develop/LICENSE"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("tractusx-dev@eclipse.org")));
    }

}
