package org.openapitools.api;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.23.0-SNAPSHOT")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("org.openapitools.api");
        register(MultiPartFeature.class);
    }
}
