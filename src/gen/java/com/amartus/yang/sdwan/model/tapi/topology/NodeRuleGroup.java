package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.CapacityPac;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.InterRuleGroup;
import com.amartus.yang.sdwan.model.tapi.topology.LatencyCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePointRef;
import com.amartus.yang.sdwan.model.tapi.topology.NodeRuleGroupRef;
import com.amartus.yang.sdwan.model.tapi.topology.RiskCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.RiskParameterPac;
import com.amartus.yang.sdwan.model.tapi.topology.Rule;
import com.amartus.yang.sdwan.model.tapi.topology.TransferCostPac;
import com.amartus.yang.sdwan.model.tapi.topology.TransferTimingPac;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * NodeRuleGroup
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class NodeRuleGroup extends com.amartus.yang.sdwan.model.tapi.topology.TransferTimingPac  {
  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  private List<RiskCharacteristic> riskCharacteristic = new ArrayList<RiskCharacteristic>();

  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private Capacity availableCapacity = null;

  private Capacity totalPotentialCapacity = null;

  private List<InterRuleGroup> interRuleGroup = new ArrayList<InterRuleGroup>();

  private List<Rule> rule = new ArrayList<Rule>();

  private List<NodeRuleGroupRef> composedRuleGroup = new ArrayList<NodeRuleGroupRef>();

  private List<NodeEdgePointRef> nodeEdgePoint = new ArrayList<NodeEdgePointRef>();

  public NodeRuleGroup costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public NodeRuleGroup addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
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

  public NodeRuleGroup riskCharacteristic(List<RiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public NodeRuleGroup addRiskCharacteristicItem(RiskCharacteristic riskCharacteristicItem) {
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

  public NodeRuleGroup name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public NodeRuleGroup addNameItem(NameAndValue nameItem) {
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

  public NodeRuleGroup uuid(String uuid) {
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

  public NodeRuleGroup availableCapacity(Capacity availableCapacity) {
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

  public NodeRuleGroup totalPotentialCapacity(Capacity totalPotentialCapacity) {
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

  public NodeRuleGroup interRuleGroup(List<InterRuleGroup> interRuleGroup) {
    this.interRuleGroup = interRuleGroup;
    return this;
  }

  public NodeRuleGroup addInterRuleGroupItem(InterRuleGroup interRuleGroupItem) {
    this.interRuleGroup.add(interRuleGroupItem);
    return this;
  }

   /**
   * none
   * @return interRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("inter-rule-group")
  public List<InterRuleGroup> getInterRuleGroup() {
    return interRuleGroup;
  }

  public void setInterRuleGroup(List<InterRuleGroup> interRuleGroup) {
    this.interRuleGroup = interRuleGroup;
  }

  public NodeRuleGroup rule(List<Rule> rule) {
    this.rule = rule;
    return this;
  }

  public NodeRuleGroup addRuleItem(Rule ruleItem) {
    this.rule.add(ruleItem);
    return this;
  }

   /**
   * none
   * @return rule
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("rule")
  public List<Rule> getRule() {
    return rule;
  }

  public void setRule(List<Rule> rule) {
    this.rule = rule;
  }

  public NodeRuleGroup composedRuleGroup(List<NodeRuleGroupRef> composedRuleGroup) {
    this.composedRuleGroup = composedRuleGroup;
    return this;
  }

  public NodeRuleGroup addComposedRuleGroupItem(NodeRuleGroupRef composedRuleGroupItem) {
    this.composedRuleGroup.add(composedRuleGroupItem);
    return this;
  }

   /**
   * none
   * @return composedRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("composed-rule-group")
  public List<NodeRuleGroupRef> getComposedRuleGroup() {
    return composedRuleGroup;
  }

  public void setComposedRuleGroup(List<NodeRuleGroupRef> composedRuleGroup) {
    this.composedRuleGroup = composedRuleGroup;
  }

  public NodeRuleGroup nodeEdgePoint(List<NodeEdgePointRef> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  public NodeRuleGroup addNodeEdgePointItem(NodeEdgePointRef nodeEdgePointItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRuleGroup tapiTopologyNodeRuleGroup = (NodeRuleGroup) o;
    return Objects.equals(this.costCharacteristic, tapiTopologyNodeRuleGroup.costCharacteristic) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyNodeRuleGroup.riskCharacteristic) &&
        Objects.equals(this.name, tapiTopologyNodeRuleGroup.name) &&
        Objects.equals(this.uuid, tapiTopologyNodeRuleGroup.uuid) &&
        Objects.equals(this.availableCapacity, tapiTopologyNodeRuleGroup.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyNodeRuleGroup.totalPotentialCapacity) &&
        Objects.equals(this.interRuleGroup, tapiTopologyNodeRuleGroup.interRuleGroup) &&
        Objects.equals(this.rule, tapiTopologyNodeRuleGroup.rule) &&
        Objects.equals(this.composedRuleGroup, tapiTopologyNodeRuleGroup.composedRuleGroup) &&
        Objects.equals(this.nodeEdgePoint, tapiTopologyNodeRuleGroup.nodeEdgePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costCharacteristic, riskCharacteristic, name, uuid, availableCapacity, totalPotentialCapacity, interRuleGroup, rule, composedRuleGroup, nodeEdgePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRuleGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    interRuleGroup: ").append(toIndentedString(interRuleGroup)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    composedRuleGroup: ").append(toIndentedString(composedRuleGroup)).append("\n");
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
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

