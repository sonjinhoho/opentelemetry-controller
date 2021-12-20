package io.opentelemetry.controller.constants.configuration.resource;

public enum ResourceType {
  SERVICE(ServiceResourceConfiguration.TYPE),
  PROCESS(ProcessResourceConfiguration.TYPE),
  CLOUD(CloudResourceConfiguration.TYPE),
  CONTAINER(ContainerResourceConfiguration.TYPE),
  KUBERNETES(KubernetesResourceConfiguration.TYPE),
  TELEMETRYSDK(TelemetrySDKResourceConfiguration.TYPE);


  private final String type;
  ResourceType(String type) {
    this.type = type;
  }
  public String getType() {
    return type;
  }
}
