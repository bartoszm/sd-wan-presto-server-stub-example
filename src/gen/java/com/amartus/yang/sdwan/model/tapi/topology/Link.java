package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.AdminStatePac;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.CapacityPac;
import com.amartus.yang.sdwan.model.tapi.common.ForwardingDirection;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LatencyCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LayerProtocolTransitionPac;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePointRef;
import com.amartus.yang.sdwan.model.tapi.topology.ResilienceType;
import com.amartus.yang.sdwan.model.tapi.topology.RiskCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.RiskParameterPac;
import com.amartus.yang.sdwan.model.tapi.topology.TransferCostPac;
import com.amartus.yang.sdwan.model.tapi.topology.TransferIntegrityPac;
import com.amartus.yang.sdwan.model.tapi.topology.TransferTimingPac;
import com.amartus.yang.sdwan.model.tapi.topology.ValidationMechanism;
import com.amartus.yang.sdwan.model.tapi.topology.ValidationPac;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Link
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Link extends com.amartus.yang.sdwan.model.tapi.common.AdminStatePac  {
  private List<LatencyCharacteristic> latencyCharacteristic = new ArrayList<LatencyCharacteristic>();

  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  private String errorCharacteristic = null;

  private String unavailableTimeCharacteristic = null;

  private String serverIntegrityProcessCharacteristic = null;

  private String deliveryOrderCharacteristic = null;

  private String repeatDeliveryCharacteristic = null;

  private String lossCharacteristic = null;

  private List<RiskCharacteristic> riskCharacteristic = new ArrayList<RiskCharacteristic>();

  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private List<String> transitionedLayerProtocolName = new ArrayList<String>();

  private List<ValidationMechanism> validationMechanism = new ArrayList<ValidationMechanism>();

  private Capacity availableCapacity = null;

  private Capacity totalPotentialCapacity = null;

  private List<LayerProtocolName> layerProtocolName = new ArrayList<LayerProtocolName>();

  private ResilienceType resilienceType = null;

  private List<NodeEdgePointRef> nodeEdgePoint = new ArrayList<NodeEdgePointRef>();

  private ForwardingDirection direction = null;

  public Link latencyCharacteristic(List<LatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public Link addLatencyCharacteristicItem(LatencyCharacteristic latencyCharacteristicItem) {
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

  public Link costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public Link addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
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

  public Link errorCharacteristic(String errorCharacteristic) {
    this.errorCharacteristic = errorCharacteristic;
    return this;
  }

   /**
   * Describes the degree to which the signal propagated can be errored.                       Applies to TDM systems as the errored signal will be propagated and not packet as errored packets will be discarded.
   * @return errorCharacteristic
  **/
  @ApiModelProperty(value = "Describes the degree to which the signal propagated can be errored.                       Applies to TDM systems as the errored signal will be propagated and not packet as errored packets will be discarded.")
  @JsonProperty("error-characteristic")
  public String getErrorCharacteristic() {
    return errorCharacteristic;
  }

  public void setErrorCharacteristic(String errorCharacteristic) {
    this.errorCharacteristic = errorCharacteristic;
  }

  public Link unavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
    this.unavailableTimeCharacteristic = unavailableTimeCharacteristic;
    return this;
  }

   /**
   * Describes the duration for which there may be no valid signal propagated.
   * @return unavailableTimeCharacteristic
  **/
  @ApiModelProperty(value = "Describes the duration for which there may be no valid signal propagated.")
  @JsonProperty("unavailable-time-characteristic")
  public String getUnavailableTimeCharacteristic() {
    return unavailableTimeCharacteristic;
  }

  public void setUnavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
    this.unavailableTimeCharacteristic = unavailableTimeCharacteristic;
  }

  public Link serverIntegrityProcessCharacteristic(String serverIntegrityProcessCharacteristic) {
    this.serverIntegrityProcessCharacteristic = serverIntegrityProcessCharacteristic;
    return this;
  }

   /**
   * Describes the effect of any server integrity enhancement process on the characteristics of the TopologicalEntity.
   * @return serverIntegrityProcessCharacteristic
  **/
  @ApiModelProperty(value = "Describes the effect of any server integrity enhancement process on the characteristics of the TopologicalEntity.")
  @JsonProperty("server-integrity-process-characteristic")
  public String getServerIntegrityProcessCharacteristic() {
    return serverIntegrityProcessCharacteristic;
  }

  public void setServerIntegrityProcessCharacteristic(String serverIntegrityProcessCharacteristic) {
    this.serverIntegrityProcessCharacteristic = serverIntegrityProcessCharacteristic;
  }

  public Link deliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
    this.deliveryOrderCharacteristic = deliveryOrderCharacteristic;
    return this;
  }

   /**
   * Describes the degree to which packets will be delivered out of sequence.                      Does not apply to TDM as the TDM protocols maintain strict order.
   * @return deliveryOrderCharacteristic
  **/
  @ApiModelProperty(value = "Describes the degree to which packets will be delivered out of sequence.                      Does not apply to TDM as the TDM protocols maintain strict order.")
  @JsonProperty("delivery-order-characteristic")
  public String getDeliveryOrderCharacteristic() {
    return deliveryOrderCharacteristic;
  }

  public void setDeliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
    this.deliveryOrderCharacteristic = deliveryOrderCharacteristic;
  }

  public Link repeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
    this.repeatDeliveryCharacteristic = repeatDeliveryCharacteristic;
    return this;
  }

   /**
   * Primarily applies to packet systems where a packet may be delivered more than once (in fault recovery for example).                       It can also apply to TDM where several frames may be received twice due to switching in a system with a large differential propagation delay.
   * @return repeatDeliveryCharacteristic
  **/
  @ApiModelProperty(value = "Primarily applies to packet systems where a packet may be delivered more than once (in fault recovery for example).                       It can also apply to TDM where several frames may be received twice due to switching in a system with a large differential propagation delay.")
  @JsonProperty("repeat-delivery-characteristic")
  public String getRepeatDeliveryCharacteristic() {
    return repeatDeliveryCharacteristic;
  }

  public void setRepeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
    this.repeatDeliveryCharacteristic = repeatDeliveryCharacteristic;
  }

  public Link lossCharacteristic(String lossCharacteristic) {
    this.lossCharacteristic = lossCharacteristic;
    return this;
  }

   /**
   * Describes the acceptable characteristic of lost packets where loss may result from discard due to errors or overflow.                      Applies to packet systems and not TDM (as for TDM errored signals are propagated unless grossly errored and overflow/underflow turns into timing slips).
   * @return lossCharacteristic
  **/
  @ApiModelProperty(value = "Describes the acceptable characteristic of lost packets where loss may result from discard due to errors or overflow.                      Applies to packet systems and not TDM (as for TDM errored signals are propagated unless grossly errored and overflow/underflow turns into timing slips).")
  @JsonProperty("loss-characteristic")
  public String getLossCharacteristic() {
    return lossCharacteristic;
  }

  public void setLossCharacteristic(String lossCharacteristic) {
    this.lossCharacteristic = lossCharacteristic;
  }

  public Link riskCharacteristic(List<RiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public Link addRiskCharacteristicItem(RiskCharacteristic riskCharacteristicItem) {
    this.riskCharacteristic.add(riskCharacteristicItem);
    return this;
  }

   /**
   * A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.
   * @return riskCharacteristic
  **/
  @ApiModelProperty(value = "A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.")
  @JsonProperty("risk-characteristic")
  public List<RiskCharacteristic> getRiskCharacteristic() {
    return riskCharacteristic;
  }

  public void setRiskCharacteristic(List<RiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
  }

  public Link name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public Link addNameItem(NameAndValue nameItem) {
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

  public Link uuid(String uuid) {
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

  public Link transitionedLayerProtocolName(List<String> transitionedLayerProtocolName) {
    this.transitionedLayerProtocolName = transitionedLayerProtocolName;
    return this;
  }

  public Link addTransitionedLayerProtocolNameItem(String transitionedLayerProtocolNameItem) {
    this.transitionedLayerProtocolName.add(transitionedLayerProtocolNameItem);
    return this;
  }

   /**
   * Provides the ordered structure of layer protocol transitions encapsulated in the TopologicalEntity. The ordering relates to the LinkPort role.
   * @return transitionedLayerProtocolName
  **/
  @ApiModelProperty(value = "Provides the ordered structure of layer protocol transitions encapsulated in the TopologicalEntity. The ordering relates to the LinkPort role.")
  @JsonProperty("transitioned-layer-protocol-name")
  public List<String> getTransitionedLayerProtocolName() {
    return transitionedLayerProtocolName;
  }

  public void setTransitionedLayerProtocolName(List<String> transitionedLayerProtocolName) {
    this.transitionedLayerProtocolName = transitionedLayerProtocolName;
  }

  public Link validationMechanism(List<ValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
    return this;
  }

  public Link addValidationMechanismItem(ValidationMechanism validationMechanismItem) {
    this.validationMechanism.add(validationMechanismItem);
    return this;
  }

   /**
   * Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.
   * @return validationMechanism
  **/
  @ApiModelProperty(value = "Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.")
  @JsonProperty("validation-mechanism")
  public List<ValidationMechanism> getValidationMechanism() {
    return validationMechanism;
  }

  public void setValidationMechanism(List<ValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
  }

  public Link availableCapacity(Capacity availableCapacity) {
    this.availableCapacity = availableCapacity;
    return this;
  }

   /**
   * Capacity available to be assigned.
   * @return availableCapacity
  **/
  @ApiModelProperty(value = "Capacity available to be assigned.")
  @JsonProperty("available-capacity")
  public Capacity getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(Capacity availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public Link totalPotentialCapacity(Capacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
    return this;
  }

   /**
   * An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.
   * @return totalPotentialCapacity
  **/
  @ApiModelProperty(value = "An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.")
  @JsonProperty("total-potential-capacity")
  public Capacity getTotalPotentialCapacity() {
    return totalPotentialCapacity;
  }

  public void setTotalPotentialCapacity(Capacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
  }

  public Link layerProtocolName(List<LayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public Link addLayerProtocolNameItem(LayerProtocolName layerProtocolNameItem) {
    this.layerProtocolName.add(layerProtocolNameItem);
    return this;
  }

   /**
   * none
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("layer-protocol-name")
  public List<LayerProtocolName> getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(List<LayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public Link resilienceType(ResilienceType resilienceType) {
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

  public Link nodeEdgePoint(List<NodeEdgePointRef> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  public Link addNodeEdgePointItem(NodeEdgePointRef nodeEdgePointItem) {
    this.nodeEdgePoint.add(nodeEdgePointItem);
    return this;
  }

   /**
   * none
   * @return nodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-edge-point")
  public List<NodeEdgePointRef> getNodeEdgePoint() {
    return nodeEdgePoint;
  }

  public void setNodeEdgePoint(List<NodeEdgePointRef> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
  }

  public Link direction(ForwardingDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The directionality of the Link.                       Is applicable to simple Links where all LinkEnds are BIDIRECTIONAL (the Link will be BIDIRECTIONAL) or UNIDIRECTIONAL (the Link will be UNIDIRECTIONAL).                       Is not present in more complex cases.
   * @return direction
  **/
  @ApiModelProperty(value = "The directionality of the Link.                       Is applicable to simple Links where all LinkEnds are BIDIRECTIONAL (the Link will be BIDIRECTIONAL) or UNIDIRECTIONAL (the Link will be UNIDIRECTIONAL).                       Is not present in more complex cases.")
  @JsonProperty("direction")
  public ForwardingDirection getDirection() {
    return direction;
  }

  public void setDirection(ForwardingDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link tapiTopologyLink = (Link) o;
    return Objects.equals(this.latencyCharacteristic, tapiTopologyLink.latencyCharacteristic) &&
        Objects.equals(this.costCharacteristic, tapiTopologyLink.costCharacteristic) &&
        Objects.equals(this.errorCharacteristic, tapiTopologyLink.errorCharacteristic) &&
        Objects.equals(this.unavailableTimeCharacteristic, tapiTopologyLink.unavailableTimeCharacteristic) &&
        Objects.equals(this.serverIntegrityProcessCharacteristic, tapiTopologyLink.serverIntegrityProcessCharacteristic) &&
        Objects.equals(this.deliveryOrderCharacteristic, tapiTopologyLink.deliveryOrderCharacteristic) &&
        Objects.equals(this.repeatDeliveryCharacteristic, tapiTopologyLink.repeatDeliveryCharacteristic) &&
        Objects.equals(this.lossCharacteristic, tapiTopologyLink.lossCharacteristic) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyLink.riskCharacteristic) &&
        Objects.equals(this.name, tapiTopologyLink.name) &&
        Objects.equals(this.uuid, tapiTopologyLink.uuid) &&
        Objects.equals(this.transitionedLayerProtocolName, tapiTopologyLink.transitionedLayerProtocolName) &&
        Objects.equals(this.validationMechanism, tapiTopologyLink.validationMechanism) &&
        Objects.equals(this.availableCapacity, tapiTopologyLink.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyLink.totalPotentialCapacity) &&
        Objects.equals(this.layerProtocolName, tapiTopologyLink.layerProtocolName) &&
        Objects.equals(this.resilienceType, tapiTopologyLink.resilienceType) &&
        Objects.equals(this.nodeEdgePoint, tapiTopologyLink.nodeEdgePoint) &&
        Objects.equals(this.direction, tapiTopologyLink.direction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latencyCharacteristic, costCharacteristic, errorCharacteristic, unavailableTimeCharacteristic, serverIntegrityProcessCharacteristic, deliveryOrderCharacteristic, repeatDeliveryCharacteristic, lossCharacteristic, riskCharacteristic, name, uuid, transitionedLayerProtocolName, validationMechanism, availableCapacity, totalPotentialCapacity, layerProtocolName, resilienceType, nodeEdgePoint, direction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    errorCharacteristic: ").append(toIndentedString(errorCharacteristic)).append("\n");
    sb.append("    unavailableTimeCharacteristic: ").append(toIndentedString(unavailableTimeCharacteristic)).append("\n");
    sb.append("    serverIntegrityProcessCharacteristic: ").append(toIndentedString(serverIntegrityProcessCharacteristic)).append("\n");
    sb.append("    deliveryOrderCharacteristic: ").append(toIndentedString(deliveryOrderCharacteristic)).append("\n");
    sb.append("    repeatDeliveryCharacteristic: ").append(toIndentedString(repeatDeliveryCharacteristic)).append("\n");
    sb.append("    lossCharacteristic: ").append(toIndentedString(lossCharacteristic)).append("\n");
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    transitionedLayerProtocolName: ").append(toIndentedString(transitionedLayerProtocolName)).append("\n");
    sb.append("    validationMechanism: ").append(toIndentedString(validationMechanism)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    resilienceType: ").append(toIndentedString(resilienceType)).append("\n");
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

