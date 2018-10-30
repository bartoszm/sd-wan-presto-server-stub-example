package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.AdminStatePac;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.CapacityPac;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LatencyCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePoint;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePointRef;
import com.amartus.yang.sdwan.model.tapi.topology.NodeRuleGroup;
import com.amartus.yang.sdwan.model.tapi.topology.TopologyRef;
import com.amartus.yang.sdwan.model.tapi.topology.TransferCostPac;
import com.amartus.yang.sdwan.model.tapi.topology.TransferIntegrityPac;
import com.amartus.yang.sdwan.model.tapi.topology.TransferTimingPac;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Node
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Node extends com.amartus.yang.sdwan.model.tapi.common.AdminStatePac  {
  private List<LatencyCharacteristic> latencyCharacteristic = new ArrayList<LatencyCharacteristic>();

  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  private String errorCharacteristic = null;

  private String unavailableTimeCharacteristic = null;

  private String serverIntegrityProcessCharacteristic = null;

  private String deliveryOrderCharacteristic = null;

  private String repeatDeliveryCharacteristic = null;

  private String lossCharacteristic = null;

  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private Capacity availableCapacity = null;

  private Capacity totalPotentialCapacity = null;

  private List<LayerProtocolName> layerProtocolName = new ArrayList<LayerProtocolName>();

  private TopologyRef encapTopology = null;

  private List<NodeEdgePoint> ownedNodeEdgePoint = new ArrayList<NodeEdgePoint>();

  private List<NodeRuleGroup> nodeRuleGroup = new ArrayList<NodeRuleGroup>();

  private List<NodeEdgePointRef> aggregatedNodeEdgePoint = new ArrayList<NodeEdgePointRef>();

  public Node latencyCharacteristic(List<LatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public Node addLatencyCharacteristicItem(LatencyCharacteristic latencyCharacteristicItem) {
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

  public Node costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public Node addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
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

  public Node errorCharacteristic(String errorCharacteristic) {
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

  public Node unavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
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

  public Node serverIntegrityProcessCharacteristic(String serverIntegrityProcessCharacteristic) {
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

  public Node deliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
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

  public Node repeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
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

  public Node lossCharacteristic(String lossCharacteristic) {
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

  public Node name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public Node addNameItem(NameAndValue nameItem) {
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

  public Node uuid(String uuid) {
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

  public Node availableCapacity(Capacity availableCapacity) {
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

  public Node totalPotentialCapacity(Capacity totalPotentialCapacity) {
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

  public Node layerProtocolName(List<LayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public Node addLayerProtocolNameItem(LayerProtocolName layerProtocolNameItem) {
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

  public Node encapTopology(TopologyRef encapTopology) {
    this.encapTopology = encapTopology;
    return this;
  }

   /**
   * none
   * @return encapTopology
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("encap-topology")
  public TopologyRef getEncapTopology() {
    return encapTopology;
  }

  public void setEncapTopology(TopologyRef encapTopology) {
    this.encapTopology = encapTopology;
  }

  public Node ownedNodeEdgePoint(List<NodeEdgePoint> ownedNodeEdgePoint) {
    this.ownedNodeEdgePoint = ownedNodeEdgePoint;
    return this;
  }

  public Node addOwnedNodeEdgePointItem(NodeEdgePoint ownedNodeEdgePointItem) {
    this.ownedNodeEdgePoint.add(ownedNodeEdgePointItem);
    return this;
  }

   /**
   * none
   * @return ownedNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("owned-node-edge-point")
  public List<NodeEdgePoint> getOwnedNodeEdgePoint() {
    return ownedNodeEdgePoint;
  }

  public void setOwnedNodeEdgePoint(List<NodeEdgePoint> ownedNodeEdgePoint) {
    this.ownedNodeEdgePoint = ownedNodeEdgePoint;
  }

  public Node nodeRuleGroup(List<NodeRuleGroup> nodeRuleGroup) {
    this.nodeRuleGroup = nodeRuleGroup;
    return this;
  }

  public Node addNodeRuleGroupItem(NodeRuleGroup nodeRuleGroupItem) {
    this.nodeRuleGroup.add(nodeRuleGroupItem);
    return this;
  }

   /**
   * none
   * @return nodeRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-rule-group")
  public List<NodeRuleGroup> getNodeRuleGroup() {
    return nodeRuleGroup;
  }

  public void setNodeRuleGroup(List<NodeRuleGroup> nodeRuleGroup) {
    this.nodeRuleGroup = nodeRuleGroup;
  }

  public Node aggregatedNodeEdgePoint(List<NodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
    return this;
  }

  public Node addAggregatedNodeEdgePointItem(NodeEdgePointRef aggregatedNodeEdgePointItem) {
    this.aggregatedNodeEdgePoint.add(aggregatedNodeEdgePointItem);
    return this;
  }

   /**
   * none
   * @return aggregatedNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("aggregated-node-edge-point")
  public List<NodeEdgePointRef> getAggregatedNodeEdgePoint() {
    return aggregatedNodeEdgePoint;
  }

  public void setAggregatedNodeEdgePoint(List<NodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node tapiTopologyNode = (Node) o;
    return Objects.equals(this.latencyCharacteristic, tapiTopologyNode.latencyCharacteristic) &&
        Objects.equals(this.costCharacteristic, tapiTopologyNode.costCharacteristic) &&
        Objects.equals(this.errorCharacteristic, tapiTopologyNode.errorCharacteristic) &&
        Objects.equals(this.unavailableTimeCharacteristic, tapiTopologyNode.unavailableTimeCharacteristic) &&
        Objects.equals(this.serverIntegrityProcessCharacteristic, tapiTopologyNode.serverIntegrityProcessCharacteristic) &&
        Objects.equals(this.deliveryOrderCharacteristic, tapiTopologyNode.deliveryOrderCharacteristic) &&
        Objects.equals(this.repeatDeliveryCharacteristic, tapiTopologyNode.repeatDeliveryCharacteristic) &&
        Objects.equals(this.lossCharacteristic, tapiTopologyNode.lossCharacteristic) &&
        Objects.equals(this.name, tapiTopologyNode.name) &&
        Objects.equals(this.uuid, tapiTopologyNode.uuid) &&
        Objects.equals(this.availableCapacity, tapiTopologyNode.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyNode.totalPotentialCapacity) &&
        Objects.equals(this.layerProtocolName, tapiTopologyNode.layerProtocolName) &&
        Objects.equals(this.encapTopology, tapiTopologyNode.encapTopology) &&
        Objects.equals(this.ownedNodeEdgePoint, tapiTopologyNode.ownedNodeEdgePoint) &&
        Objects.equals(this.nodeRuleGroup, tapiTopologyNode.nodeRuleGroup) &&
        Objects.equals(this.aggregatedNodeEdgePoint, tapiTopologyNode.aggregatedNodeEdgePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latencyCharacteristic, costCharacteristic, errorCharacteristic, unavailableTimeCharacteristic, serverIntegrityProcessCharacteristic, deliveryOrderCharacteristic, repeatDeliveryCharacteristic, lossCharacteristic, name, uuid, availableCapacity, totalPotentialCapacity, layerProtocolName, encapTopology, ownedNodeEdgePoint, nodeRuleGroup, aggregatedNodeEdgePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    errorCharacteristic: ").append(toIndentedString(errorCharacteristic)).append("\n");
    sb.append("    unavailableTimeCharacteristic: ").append(toIndentedString(unavailableTimeCharacteristic)).append("\n");
    sb.append("    serverIntegrityProcessCharacteristic: ").append(toIndentedString(serverIntegrityProcessCharacteristic)).append("\n");
    sb.append("    deliveryOrderCharacteristic: ").append(toIndentedString(deliveryOrderCharacteristic)).append("\n");
    sb.append("    repeatDeliveryCharacteristic: ").append(toIndentedString(repeatDeliveryCharacteristic)).append("\n");
    sb.append("    lossCharacteristic: ").append(toIndentedString(lossCharacteristic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    encapTopology: ").append(toIndentedString(encapTopology)).append("\n");
    sb.append("    ownedNodeEdgePoint: ").append(toIndentedString(ownedNodeEdgePoint)).append("\n");
    sb.append("    nodeRuleGroup: ").append(toIndentedString(nodeRuleGroup)).append("\n");
    sb.append("    aggregatedNodeEdgePoint: ").append(toIndentedString(aggregatedNodeEdgePoint)).append("\n");
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

