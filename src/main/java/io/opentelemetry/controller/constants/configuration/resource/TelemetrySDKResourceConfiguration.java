package io.opentelemetry.controller.constants.configuration.resource;

public class TelemetrySDKResourceConfiguration {

  public static final String TYPE = "telemetry.sdk";

  public static final String NAME = TYPE + ".name";

  public static final String LANGUAGE = TYPE + ".language";

  public static final String VERSION = TYPE + ".version";

  public static final String AUTO_VERSION = "telemetry.auto.version";

  public enum LANGUAGE {
    cpp,
    dotnet,
    erlang,
    go,
    java,
    nodejs,
    php,
    python,
    ruby,
    webjs,
    swift
  }
}
