package com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.output;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.SwvcServiceAttributes;
import com.amartus.yang.sdwan.model.tapi.common.AdminStatePac;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.ForwardingDirection;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.common.TimeRange;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityConstraint;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityServiceRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.CoordinateType;
import com.amartus.yang.sdwan.model.tapi.connectivity.ResilienceConstraint;
import com.amartus.yang.sdwan.model.tapi.connectivity.ReversionMode;
import com.amartus.yang.sdwan.model.tapi.connectivity.ServiceType;
import com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.input.EndPoint;
import com.amartus.yang.sdwan.model.tapi.path.computation.DiversityPolicy;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathRef;
import com.amartus.yang.sdwan.model.tapi.path.computation.RouteObjectiveFunction;
import com.amartus.yang.sdwan.model.tapi.path.computation.RoutingConstraint;
import com.amartus.yang.sdwan.model.tapi.path.computation.TopologyConstraint;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LatencyCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LinkRef;
import com.amartus.yang.sdwan.model.tapi.topology.NodeRef;
import com.amartus.yang.sdwan.model.tapi.topology.ResilienceType;
import com.amartus.yang.sdwan.model.tapi.topology.RiskCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.TopologyRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Service
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Service extends com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityConstraint  {
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private Boolean isExclusive = true;

  private DiversityPolicy diversityPolicy = null;

  private RouteObjectiveFunction routeObjectiveFunction = null;

  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  private List<LatencyCharacteristic> latencyCharacteristic = new ArrayList<LatencyCharacteristic>();

  private List<RiskCharacteristic> riskDiversityCharacteristic = new ArrayList<RiskCharacteristic>();

  private ForwardingDirection routeDirection = null;

  private OperationalState operationalState = null;

  private LifecycleState lifecycleState = null;

  private AdministrativeState administrativeState = null;

  private List<NodeRef> includeNode = new ArrayList<NodeRef>();

  private List<LinkRef> excludeLink = new ArrayList<LinkRef>();

  private List<TopologyRef> avoidTopology = new ArrayList<TopologyRef>();

  private List<PathRef> excludePath = new ArrayList<PathRef>();

  private List<LinkRef> includeLink = new ArrayList<LinkRef>();

  private List<LayerProtocolName> preferredTransportLayer = new ArrayList<LayerProtocolName>();

  private List<NodeRef> excludeNode = new ArrayList<NodeRef>();

  private List<TopologyRef> includeTopology = new ArrayList<TopologyRef>();

  private List<PathRef> includePath = new ArrayList<PathRef>();

  private Boolean isLockOut = false;

  private Integer maxSwitchTimes = null;

  private CoordinateType restorationCoordinateType = null;

  private Boolean isCoordinatedSwitchingBothEnds = false;

  private Integer holdOffTime = null;

  private Boolean isFrozen = false;

  private Integer waitToRevertTime = 15;

  private ResilienceType resilienceType = null;

  private List<LayerProtocolName> preferredRestorationLayer = new ArrayList<LayerProtocolName>();

  private Integer restorePriority = null;

  private ReversionMode reversionMode = null;

  private SwvcServiceAttributes swvcServiceAttributes = null;

  private List<EndPoint> endPoint = new ArrayList<EndPoint>();

  private List<ConnectionRef> connection = new ArrayList<ConnectionRef>();

  public Service name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public Service addNameItem(NameAndValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  @JsonProperty("name")
  public List<NameAndValue> getName() {
    return name;
  }

  public void setName(List<NameAndValue> name) {
    this.name = name;
  }

  public Service uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Service isExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
    return this;
  }

   /**
   * To distinguish if the resources are to be exclusive to the service
   * @return isExclusive
  **/
  @ApiModelProperty(value = "To distinguish if the resources are to be exclusive to the service")
  @JsonProperty("is-exclusive")
  public Boolean getIsExclusive() {
    return isExclusive;
  }

  public void setIsExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
  }

  public Service diversityPolicy(DiversityPolicy diversityPolicy) {
    this.diversityPolicy = diversityPolicy;
    return this;
  }

   /**
   * none
   * @return diversityPolicy
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("diversity-policy")
  public DiversityPolicy getDiversityPolicy() {
    return diversityPolicy;
  }

  public void setDiversityPolicy(DiversityPolicy diversityPolicy) {
    this.diversityPolicy = diversityPolicy;
  }

  public Service routeObjectiveFunction(RouteObjectiveFunction routeObjectiveFunction) {
    this.routeObjectiveFunction = routeObjectiveFunction;
    return this;
  }

   /**
   * none
   * @return routeObjectiveFunction
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("route-objective-function")
  public RouteObjectiveFunction getRouteObjectiveFunction() {
    return routeObjectiveFunction;
  }

  public void setRouteObjectiveFunction(RouteObjectiveFunction routeObjectiveFunction) {
    this.routeObjectiveFunction = routeObjectiveFunction;
  }

  public Service costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public Service addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
    this.costCharacteristic.add(costCharacteristicItem);
    return this;
  }

   /**
   * The list of costs where each cost relates to some aspect of the TopologicalEntity.
   * @return costCharacteristic
  **/
  @ApiModelProperty(value = "The list of costs where each cost relates to some aspect of the TopologicalEntity.")
  @JsonProperty("cost-characteristic")
  public List<CostCharacteristic> getCostCharacteristic() {
    return costCharacteristic;
  }

  public void setCostCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
  }

  public Service latencyCharacteristic(List<LatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public Service addLatencyCharacteristicItem(LatencyCharacteristic latencyCharacteristicItem) {
    this.latencyCharacteristic.add(latencyCharacteristicItem);
    return this;
  }

   /**
   * The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.
   * @return latencyCharacteristic
  **/
  @ApiModelProperty(value = "The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.")
  @JsonProperty("latency-characteristic")
  public List<LatencyCharacteristic> getLatencyCharacteristic() {
    return latencyCharacteristic;
  }

  public void setLatencyCharacteristic(List<LatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
  }

  public Service riskDiversityCharacteristic(List<RiskCharacteristic> riskDiversityCharacteristic) {
    this.riskDiversityCharacteristic = riskDiversityCharacteristic;
    return this;
  }

  public Service addRiskDiversityCharacteristicItem(RiskCharacteristic riskDiversityCharacteristicItem) {
    this.riskDiversityCharacteristic.add(riskDiversityCharacteristicItem);
    return this;
  }

   /**
   * none
   * @return riskDiversityCharacteristic
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("risk-diversity-characteristic")
  public List<RiskCharacteristic> getRiskDiversityCharacteristic() {
    return riskDiversityCharacteristic;
  }

  public void setRiskDiversityCharacteristic(List<RiskCharacteristic> riskDiversityCharacteristic) {
    this.riskDiversityCharacteristic = riskDiversityCharacteristic;
  }

  public Service routeDirection(ForwardingDirection routeDirection) {
    this.routeDirection = routeDirection;
    return this;
  }

   /**
   * none
   * @return routeDirection
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("route-direction")
  public ForwardingDirection getRouteDirection() {
    return routeDirection;
  }

  public void setRouteDirection(ForwardingDirection routeDirection) {
    this.routeDirection = routeDirection;
  }

  public Service operationalState(OperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

   /**
   * none
   * @return operationalState
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("operational-state")
  public OperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(OperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public Service lifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

   /**
   * none
   * @return lifecycleState
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("lifecycle-state")
  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public Service administrativeState(AdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

   /**
   * none
   * @return administrativeState
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("administrative-state")
  public AdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(AdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public Service includeNode(List<NodeRef> includeNode) {
    this.includeNode = includeNode;
    return this;
  }

  public Service addIncludeNodeItem(NodeRef includeNodeItem) {
    this.includeNode.add(includeNodeItem);
    return this;
  }

   /**
   * This is a loose constraint - that is it is unordered and could be a partial list
   * @return includeNode
  **/
  @ApiModelProperty(value = "This is a loose constraint - that is it is unordered and could be a partial list")
  @JsonProperty("include-node")
  public List<NodeRef> getIncludeNode() {
    return includeNode;
  }

  public void setIncludeNode(List<NodeRef> includeNode) {
    this.includeNode = includeNode;
  }

  public Service excludeLink(List<LinkRef> excludeLink) {
    this.excludeLink = excludeLink;
    return this;
  }

  public Service addExcludeLinkItem(LinkRef excludeLinkItem) {
    this.excludeLink.add(excludeLinkItem);
    return this;
  }

   /**
   * none
   * @return excludeLink
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("exclude-link")
  public List<LinkRef> getExcludeLink() {
    return excludeLink;
  }

  public void setExcludeLink(List<LinkRef> excludeLink) {
    this.excludeLink = excludeLink;
  }

  public Service avoidTopology(List<TopologyRef> avoidTopology) {
    this.avoidTopology = avoidTopology;
    return this;
  }

  public Service addAvoidTopologyItem(TopologyRef avoidTopologyItem) {
    this.avoidTopology.add(avoidTopologyItem);
    return this;
  }

   /**
   * none
   * @return avoidTopology
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("avoid-topology")
  public List<TopologyRef> getAvoidTopology() {
    return avoidTopology;
  }

  public void setAvoidTopology(List<TopologyRef> avoidTopology) {
    this.avoidTopology = avoidTopology;
  }

  public Service excludePath(List<PathRef> excludePath) {
    this.excludePath = excludePath;
    return this;
  }

  public Service addExcludePathItem(PathRef excludePathItem) {
    this.excludePath.add(excludePathItem);
    return this;
  }

   /**
   * none
   * @return excludePath
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("exclude-path")
  public List<PathRef> getExcludePath() {
    return excludePath;
  }

  public void setExcludePath(List<PathRef> excludePath) {
    this.excludePath = excludePath;
  }

  public Service includeLink(List<LinkRef> includeLink) {
    this.includeLink = includeLink;
    return this;
  }

  public Service addIncludeLinkItem(LinkRef includeLinkItem) {
    this.includeLink.add(includeLinkItem);
    return this;
  }

   /**
   * This is a loose constraint - that is it is unordered and could be a partial list 
   * @return includeLink
  **/
  @ApiModelProperty(value = "This is a loose constraint - that is it is unordered and could be a partial list ")
  @JsonProperty("include-link")
  public List<LinkRef> getIncludeLink() {
    return includeLink;
  }

  public void setIncludeLink(List<LinkRef> includeLink) {
    this.includeLink = includeLink;
  }

  public Service preferredTransportLayer(List<LayerProtocolName> preferredTransportLayer) {
    this.preferredTransportLayer = preferredTransportLayer;
    return this;
  }

  public Service addPreferredTransportLayerItem(LayerProtocolName preferredTransportLayerItem) {
    this.preferredTransportLayer.add(preferredTransportLayerItem);
    return this;
  }

   /**
   * soft constraint requested by client to indicate the layer(s) of transport connection that it prefers to carry the service. This could be same as the service layer or one of the supported server layers
   * @return preferredTransportLayer
  **/
  @ApiModelProperty(value = "soft constraint requested by client to indicate the layer(s) of transport connection that it prefers to carry the service. This could be same as the service layer or one of the supported server layers")
  @JsonProperty("preferred-transport-layer")
  public List<LayerProtocolName> getPreferredTransportLayer() {
    return preferredTransportLayer;
  }

  public void setPreferredTransportLayer(List<LayerProtocolName> preferredTransportLayer) {
    this.preferredTransportLayer = preferredTransportLayer;
  }

  public Service excludeNode(List<NodeRef> excludeNode) {
    this.excludeNode = excludeNode;
    return this;
  }

  public Service addExcludeNodeItem(NodeRef excludeNodeItem) {
    this.excludeNode.add(excludeNodeItem);
    return this;
  }

   /**
   * none
   * @return excludeNode
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("exclude-node")
  public List<NodeRef> getExcludeNode() {
    return excludeNode;
  }

  public void setExcludeNode(List<NodeRef> excludeNode) {
    this.excludeNode = excludeNode;
  }

  public Service includeTopology(List<TopologyRef> includeTopology) {
    this.includeTopology = includeTopology;
    return this;
  }

  public Service addIncludeTopologyItem(TopologyRef includeTopologyItem) {
    this.includeTopology.add(includeTopologyItem);
    return this;
  }

   /**
   * none
   * @return includeTopology
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("include-topology")
  public List<TopologyRef> getIncludeTopology() {
    return includeTopology;
  }

  public void setIncludeTopology(List<TopologyRef> includeTopology) {
    this.includeTopology = includeTopology;
  }

  public Service includePath(List<PathRef> includePath) {
    this.includePath = includePath;
    return this;
  }

  public Service addIncludePathItem(PathRef includePathItem) {
    this.includePath.add(includePathItem);
    return this;
  }

   /**
   * none
   * @return includePath
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("include-path")
  public List<PathRef> getIncludePath() {
    return includePath;
  }

  public void setIncludePath(List<PathRef> includePath) {
    this.includePath = includePath;
  }

  public Service isLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
    return this;
  }

   /**
   * The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                      This overrides all other protection control states including forced.                      If the item is locked out then it cannot be used under any circumstances.                      Note: Only relevant when part of a protection scheme.
   * @return isLockOut
  **/
  @ApiModelProperty(value = "The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                      This overrides all other protection control states including forced.                      If the item is locked out then it cannot be used under any circumstances.                      Note: Only relevant when part of a protection scheme.")
  @JsonProperty("is-lock-out")
  public Boolean getIsLockOut() {
    return isLockOut;
  }

  public void setIsLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
  }

  public Service maxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
    return this;
  }

   /**
   * Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.
   * @return maxSwitchTimes
  **/
  @ApiModelProperty(value = "Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.")
  @JsonProperty("max-switch-times")
  public Integer getMaxSwitchTimes() {
    return maxSwitchTimes;
  }

  public void setMaxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
  }

  public Service restorationCoordinateType(CoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
    return this;
  }

   /**
   *  The coordination mechanism between multi-layers.
   * @return restorationCoordinateType
  **/
  @ApiModelProperty(value = " The coordination mechanism between multi-layers.")
  @JsonProperty("restoration-coordinate-type")
  public CoordinateType getRestorationCoordinateType() {
    return restorationCoordinateType;
  }

  public void setRestorationCoordinateType(CoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
  }

  public Service isCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
    return this;
  }

   /**
   * Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.
   * @return isCoordinatedSwitchingBothEnds
  **/
  @ApiModelProperty(value = "Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.")
  @JsonProperty("is-coordinated-switching-both-ends")
  public Boolean getIsCoordinatedSwitchingBothEnds() {
    return isCoordinatedSwitchingBothEnds;
  }

  public void setIsCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
  }

  public Service holdOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
    return this;
  }

   /**
   * This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.
   * @return holdOffTime
  **/
  @ApiModelProperty(value = "This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.")
  @JsonProperty("hold-off-time")
  public Integer getHoldOffTime() {
    return holdOffTime;
  }

  public void setHoldOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
  }

  public Service isFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
    return this;
  }

   /**
   * Temporarily prevents any switch action to be taken and, as such, freezes the current state.                       Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                      All administrative controls of any aspect of protection are rejected.
   * @return isFrozen
  **/
  @ApiModelProperty(value = "Temporarily prevents any switch action to be taken and, as such, freezes the current state.                       Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                      All administrative controls of any aspect of protection are rejected.")
  @JsonProperty("is-frozen")
  public Boolean getIsFrozen() {
    return isFrozen;
  }

  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  public Service waitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
    return this;
  }

   /**
   * If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.
   * @return waitToRevertTime
  **/
  @ApiModelProperty(value = "If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.")
  @JsonProperty("wait-to-revert-time")
  public Integer getWaitToRevertTime() {
    return waitToRevertTime;
  }

  public void setWaitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
  }

  public Service resilienceType(ResilienceType resilienceType) {
    this.resilienceType = resilienceType;
    return this;
  }

   /**
   * none
   * @return resilienceType
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("resilience-type")
  public ResilienceType getResilienceType() {
    return resilienceType;
  }

  public void setResilienceType(ResilienceType resilienceType) {
    this.resilienceType = resilienceType;
  }

  public Service preferredRestorationLayer(List<LayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
    return this;
  }

  public Service addPreferredRestorationLayerItem(LayerProtocolName preferredRestorationLayerItem) {
    this.preferredRestorationLayer.add(preferredRestorationLayerItem);
    return this;
  }

   /**
   * Indicate which layer this resilience parameters package configured for.
   * @return preferredRestorationLayer
  **/
  @ApiModelProperty(value = "Indicate which layer this resilience parameters package configured for.")
  @JsonProperty("preferred-restoration-layer")
  public List<LayerProtocolName> getPreferredRestorationLayer() {
    return preferredRestorationLayer;
  }

  public void setPreferredRestorationLayer(List<LayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
  }

  public Service restorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
    return this;
  }

   /**
   * none
   * @return restorePriority
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("restore-priority")
  public Integer getRestorePriority() {
    return restorePriority;
  }

  public void setRestorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
  }

  public Service reversionMode(ReversionMode reversionMode) {
    this.reversionMode = reversionMode;
    return this;
  }

   /**
   * Indcates whether the protection scheme is revertive or non-revertive.
   * @return reversionMode
  **/
  @ApiModelProperty(value = "Indcates whether the protection scheme is revertive or non-revertive.")
  @JsonProperty("reversion-mode")
  public ReversionMode getReversionMode() {
    return reversionMode;
  }

  public void setReversionMode(ReversionMode reversionMode) {
    this.reversionMode = reversionMode;
  }

  public Service swvcServiceAttributes(SwvcServiceAttributes swvcServiceAttributes) {
    this.swvcServiceAttributes = swvcServiceAttributes;
    return this;
  }

   /**
   * Get swvcServiceAttributes
   * @return swvcServiceAttributes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("swvc-service-attributes")
  public SwvcServiceAttributes getSwvcServiceAttributes() {
    return swvcServiceAttributes;
  }

  public void setSwvcServiceAttributes(SwvcServiceAttributes swvcServiceAttributes) {
    this.swvcServiceAttributes = swvcServiceAttributes;
  }

  public Service endPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public Service addEndPointItem(EndPoint endPointItem) {
    this.endPoint.add(endPointItem);
    return this;
  }

   /**
   * none
   * @return endPoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("end-point")
  public List<EndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public Service connection(List<ConnectionRef> connection) {
    this.connection = connection;
    return this;
  }

  public Service addConnectionItem(ConnectionRef connectionItem) {
    this.connection.add(connectionItem);
    return this;
  }

   /**
   * none
   * @return connection
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection")
  public List<ConnectionRef> getConnection() {
    return connection;
  }

  public void setConnection(List<ConnectionRef> connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service tapiConnectivityGetconnectivityservicedetailsOutputService = (Service) o;
    return Objects.equals(this.name, tapiConnectivityGetconnectivityservicedetailsOutputService.name) &&
        Objects.equals(this.uuid, tapiConnectivityGetconnectivityservicedetailsOutputService.uuid) &&
        Objects.equals(this.isExclusive, tapiConnectivityGetconnectivityservicedetailsOutputService.isExclusive) &&
        Objects.equals(this.diversityPolicy, tapiConnectivityGetconnectivityservicedetailsOutputService.diversityPolicy) &&
        Objects.equals(this.routeObjectiveFunction, tapiConnectivityGetconnectivityservicedetailsOutputService.routeObjectiveFunction) &&
        Objects.equals(this.costCharacteristic, tapiConnectivityGetconnectivityservicedetailsOutputService.costCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiConnectivityGetconnectivityservicedetailsOutputService.latencyCharacteristic) &&
        Objects.equals(this.riskDiversityCharacteristic, tapiConnectivityGetconnectivityservicedetailsOutputService.riskDiversityCharacteristic) &&
        Objects.equals(this.routeDirection, tapiConnectivityGetconnectivityservicedetailsOutputService.routeDirection) &&
        Objects.equals(this.operationalState, tapiConnectivityGetconnectivityservicedetailsOutputService.operationalState) &&
        Objects.equals(this.lifecycleState, tapiConnectivityGetconnectivityservicedetailsOutputService.lifecycleState) &&
        Objects.equals(this.administrativeState, tapiConnectivityGetconnectivityservicedetailsOutputService.administrativeState) &&
        Objects.equals(this.includeNode, tapiConnectivityGetconnectivityservicedetailsOutputService.includeNode) &&
        Objects.equals(this.excludeLink, tapiConnectivityGetconnectivityservicedetailsOutputService.excludeLink) &&
        Objects.equals(this.avoidTopology, tapiConnectivityGetconnectivityservicedetailsOutputService.avoidTopology) &&
        Objects.equals(this.excludePath, tapiConnectivityGetconnectivityservicedetailsOutputService.excludePath) &&
        Objects.equals(this.includeLink, tapiConnectivityGetconnectivityservicedetailsOutputService.includeLink) &&
        Objects.equals(this.preferredTransportLayer, tapiConnectivityGetconnectivityservicedetailsOutputService.preferredTransportLayer) &&
        Objects.equals(this.excludeNode, tapiConnectivityGetconnectivityservicedetailsOutputService.excludeNode) &&
        Objects.equals(this.includeTopology, tapiConnectivityGetconnectivityservicedetailsOutputService.includeTopology) &&
        Objects.equals(this.includePath, tapiConnectivityGetconnectivityservicedetailsOutputService.includePath) &&
        Objects.equals(this.isLockOut, tapiConnectivityGetconnectivityservicedetailsOutputService.isLockOut) &&
        Objects.equals(this.maxSwitchTimes, tapiConnectivityGetconnectivityservicedetailsOutputService.maxSwitchTimes) &&
        Objects.equals(this.restorationCoordinateType, tapiConnectivityGetconnectivityservicedetailsOutputService.restorationCoordinateType) &&
        Objects.equals(this.isCoordinatedSwitchingBothEnds, tapiConnectivityGetconnectivityservicedetailsOutputService.isCoordinatedSwitchingBothEnds) &&
        Objects.equals(this.holdOffTime, tapiConnectivityGetconnectivityservicedetailsOutputService.holdOffTime) &&
        Objects.equals(this.isFrozen, tapiConnectivityGetconnectivityservicedetailsOutputService.isFrozen) &&
        Objects.equals(this.waitToRevertTime, tapiConnectivityGetconnectivityservicedetailsOutputService.waitToRevertTime) &&
        Objects.equals(this.resilienceType, tapiConnectivityGetconnectivityservicedetailsOutputService.resilienceType) &&
        Objects.equals(this.preferredRestorationLayer, tapiConnectivityGetconnectivityservicedetailsOutputService.preferredRestorationLayer) &&
        Objects.equals(this.restorePriority, tapiConnectivityGetconnectivityservicedetailsOutputService.restorePriority) &&
        Objects.equals(this.reversionMode, tapiConnectivityGetconnectivityservicedetailsOutputService.reversionMode) &&
        Objects.equals(this.swvcServiceAttributes, tapiConnectivityGetconnectivityservicedetailsOutputService.swvcServiceAttributes) &&
        Objects.equals(this.endPoint, tapiConnectivityGetconnectivityservicedetailsOutputService.endPoint) &&
        Objects.equals(this.connection, tapiConnectivityGetconnectivityservicedetailsOutputService.connection) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, isExclusive, diversityPolicy, routeObjectiveFunction, costCharacteristic, latencyCharacteristic, riskDiversityCharacteristic, routeDirection, operationalState, lifecycleState, administrativeState, includeNode, excludeLink, avoidTopology, excludePath, includeLink, preferredTransportLayer, excludeNode, includeTopology, includePath, isLockOut, maxSwitchTimes, restorationCoordinateType, isCoordinatedSwitchingBothEnds, holdOffTime, isFrozen, waitToRevertTime, resilienceType, preferredRestorationLayer, restorePriority, reversionMode, swvcServiceAttributes, endPoint, connection, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
    sb.append("    diversityPolicy: ").append(toIndentedString(diversityPolicy)).append("\n");
    sb.append("    routeObjectiveFunction: ").append(toIndentedString(routeObjectiveFunction)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    riskDiversityCharacteristic: ").append(toIndentedString(riskDiversityCharacteristic)).append("\n");
    sb.append("    routeDirection: ").append(toIndentedString(routeDirection)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    includeNode: ").append(toIndentedString(includeNode)).append("\n");
    sb.append("    excludeLink: ").append(toIndentedString(excludeLink)).append("\n");
    sb.append("    avoidTopology: ").append(toIndentedString(avoidTopology)).append("\n");
    sb.append("    excludePath: ").append(toIndentedString(excludePath)).append("\n");
    sb.append("    includeLink: ").append(toIndentedString(includeLink)).append("\n");
    sb.append("    preferredTransportLayer: ").append(toIndentedString(preferredTransportLayer)).append("\n");
    sb.append("    excludeNode: ").append(toIndentedString(excludeNode)).append("\n");
    sb.append("    includeTopology: ").append(toIndentedString(includeTopology)).append("\n");
    sb.append("    includePath: ").append(toIndentedString(includePath)).append("\n");
    sb.append("    isLockOut: ").append(toIndentedString(isLockOut)).append("\n");
    sb.append("    maxSwitchTimes: ").append(toIndentedString(maxSwitchTimes)).append("\n");
    sb.append("    restorationCoordinateType: ").append(toIndentedString(restorationCoordinateType)).append("\n");
    sb.append("    isCoordinatedSwitchingBothEnds: ").append(toIndentedString(isCoordinatedSwitchingBothEnds)).append("\n");
    sb.append("    holdOffTime: ").append(toIndentedString(holdOffTime)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    waitToRevertTime: ").append(toIndentedString(waitToRevertTime)).append("\n");
    sb.append("    resilienceType: ").append(toIndentedString(resilienceType)).append("\n");
    sb.append("    preferredRestorationLayer: ").append(toIndentedString(preferredRestorationLayer)).append("\n");
    sb.append("    restorePriority: ").append(toIndentedString(restorePriority)).append("\n");
    sb.append("    reversionMode: ").append(toIndentedString(reversionMode)).append("\n");
    sb.append("    swvcServiceAttributes: ").append(toIndentedString(swvcServiceAttributes)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

