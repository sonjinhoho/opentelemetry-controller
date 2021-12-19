package io.opentelemetry.controller.constants.configuration.resource;

public class KubernetesResourceConfiguration {

  public static final String TYPE = "k8s";

  public static final String CLUSTER = TYPE + ".cluster";

  public static final String CLUSTER_NAME = CLUSTER + ".name";

  public static final String NODE = TYPE + ".node";

  public static final String NODE_NAME = NODE + ".name";

  public static final String NODE_UID = NODE + ".uid";

  public static final String NAMESPACE = TYPE + ".namespace";

  public static final String NAMESPACE_NAME = NAMESPACE + ".name";

  public static final String POD = TYPE + ".pod";

  public static final String POD_UID = POD + ".uid";

  public static final String POD_NAME = POD + ".name";

  public static final String CONTAINER = TYPE + ".container";

  public static final String CONTAINER_NAME = CONTAINER + ".name";

  public static final String CONTAINER_RESTART_COUNT = CONTAINER + ".restart_count";

  public static final String REPLICASET = TYPE + ".replicaset";

  public static final String REPLICASET_UID = REPLICASET + ".uid";

  public static final String REPLICASET_NAME = REPLICASET + ".name";

  public static final String DEPLOYMENT = TYPE + ".deployment";

  public static final String DEPLOYMENT_UID = DEPLOYMENT + ".uid";

  public static final String DEPLOYMENT_NAME = DEPLOYMENT + ".name";

  public static final String STATEFULSET = TYPE + ".statefulset";

  public static final String STATEFULSET_UID = STATEFULSET + ".uid";

  public static final String STAETFULSET_NAME = STATEFULSET + ".name";

  public static final String DAEMONSET = TYPE + ".daemonset";

  public static final String DAEMONSET_UID = DAEMONSET + ".uid";

  public static final String DAEMONSET_NAME = DAEMONSET + ".name";

  public static final String JOB = TYPE + ".job";

  public static final String JOB_UID = JOB + ".uid";

  public static final String JOB_NAME = JOB + ".name";

  public static final String CRONJOB = TYPE + ".cronjob";

  public static final String CRONJOB_UID = CRONJOB + ".uid";

  public static final String CRONJOB_NAME = CRONJOB + ".name";



}
