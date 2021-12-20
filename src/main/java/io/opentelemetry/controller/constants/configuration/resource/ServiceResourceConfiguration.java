package io.opentelemetry.controller.constants.configuration.resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceResourceConfiguration {

  public static final String TYPE = "service";

  public static final String NAME = TYPE + ".name";

  public static final String INSTANCE_ID = TYPE + ".instance_id";

  public static final String VERSION = TYPE + ".version";

}
