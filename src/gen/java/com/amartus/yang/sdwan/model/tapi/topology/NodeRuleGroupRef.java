package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.NodeRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NodeRuleGroupRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class NodeRuleGroupRef extends com.amartus.yang.sdwan.model.tapi.topology.NodeRef  {
  private String nodeRuleGroupUuid = null;

  public NodeRuleGroupRef nodeRuleGroupUuid(String nodeRuleGroupUuid) {
    this.nodeRuleGroupUuid = nodeRuleGroupUuid;
    return this;
  }

   /**
   * none
   * @return nodeRuleGroupUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-rule-group-uuid")
  public String getNodeRuleGroupUuid() {
    return nodeRuleGroupUuid;
  }

  public void setNodeRuleGroupUuid(String nodeRuleGroupUuid) {
    this.nodeRuleGroupUuid = nodeRuleGroupUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRuleGroupRef tapiTopologyNodeRuleGroupRef = (NodeRuleGroupRef) o;
    return Objects.equals(this.nodeRuleGroupUuid, tapiTopologyNodeRuleGroupRef.nodeRuleGroupUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeRuleGroupUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRuleGroupRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeRuleGroupUuid: ").append(toIndentedString(nodeRuleGroupUuid)).append("\n");
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

