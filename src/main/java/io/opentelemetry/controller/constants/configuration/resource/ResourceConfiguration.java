package io.opentelemetry.controller.constants.configuration.resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResourceConfiguration {

    //key1=val1,key2=val2,key3=val3
    public static final String OTEL_RESOURCE_ATTRIBUTES = "otel.resource.attributes";

    public static final String OTEL_SERVICE_NAME = "otel.service.name";

    public static final String OTEL_JAVA_DISABLED_RESOURCE_PROVIDERS = "otel.java.disabled.resource-providers";
}
