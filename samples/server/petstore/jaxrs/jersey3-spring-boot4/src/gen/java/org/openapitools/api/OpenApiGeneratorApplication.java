package org.openapitools.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.23.0-SNAPSHOT")
@SpringBootApplication(nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
@ComponentScan(
    basePackages = {"org.openapitools.api", "org.openapitools.api", "org.openapitools.model"},
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class OpenApiGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenApiGeneratorApplication.class, args);
    }
}
