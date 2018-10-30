package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.CapacityPac;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LatencyCharacteristic;
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
 * InterRuleGroup
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class InterRuleGroup extends com.amartus.yang.sdwan.model.tapi.topology.TransferTimingPac  {
  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  private List<RiskCharacteristic> riskCharacteristic = new ArrayList<RiskCharacteristic>();

  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private Capacity availableCapacity = null;

  private Capacity totalPotentialCapacity = null;

  private List<NodeRuleGroupRef> associatedNodeRuleGroup = new ArrayList<NodeRuleGroupRef>();

  private List<Rule> rule = new ArrayList<Rule>();

  public InterRuleGroup costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public InterRuleGroup addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
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

  public InterRuleGroup riskCharacteristic(List<RiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public InterRuleGroup addRiskCharacteristicItem(RiskCharacteristic riskCharacteristicItem) {
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

  public InterRuleGroup name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public InterRuleGroup addNameItem(NameAndValue nameItem) {
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

  public InterRuleGroup uuid(String uuid) {
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

  public InterRuleGroup availableCapacity(Capacity availableCapacity) {
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

  public InterRuleGroup totalPotentialCapacity(Capacity totalPotentialCapacity) {
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

  public InterRuleGroup associatedNodeRuleGroup(List<NodeRuleGroupRef> associatedNodeRuleGroup) {
    this.associatedNodeRuleGroup = associatedNodeRuleGroup;
    return this;
  }

  public InterRuleGroup addAssociatedNodeRuleGroupItem(NodeRuleGroupRef associatedNodeRuleGroupItem) {
    this.associatedNodeRuleGroup.add(associatedNodeRuleGroupItem);
    return this;
  }

   /**
   * none
   * @return associatedNodeRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("associated-node-rule-group")
  public List<NodeRuleGroupRef> getAssociatedNodeRuleGroup() {
    return associatedNodeRuleGroup;
  }

  public void setAssociatedNodeRuleGroup(List<NodeRuleGroupRef> associatedNodeRuleGroup) {
    this.associatedNodeRuleGroup = associatedNodeRuleGroup;
  }

  public InterRuleGroup rule(List<Rule> rule) {
    this.rule = rule;
    return this;
  }

  public InterRuleGroup addRuleItem(Rule ruleItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterRuleGroup tapiTopologyInterRuleGroup = (InterRuleGroup) o;
    return Objects.equals(this.costCharacteristic, tapiTopologyInterRuleGroup.costCharacteristic) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyInterRuleGroup.riskCharacteristic) &&
        Objects.equals(this.name, tapiTopologyInterRuleGroup.name) &&
        Objects.equals(this.uuid, tapiTopologyInterRuleGroup.uuid) &&
        Objects.equals(this.availableCapacity, tapiTopologyInterRuleGroup.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyInterRuleGroup.totalPotentialCapacity) &&
        Objects.equals(this.associatedNodeRuleGroup, tapiTopologyInterRuleGroup.associatedNodeRuleGroup) &&
        Objects.equals(this.rule, tapiTopologyInterRuleGroup.rule) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costCharacteristic, riskCharacteristic, name, uuid, availableCapacity, totalPotentialCapacity, associatedNodeRuleGroup, rule, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterRuleGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    associatedNodeRuleGroup: ").append(toIndentedString(associatedNodeRuleGroup)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

