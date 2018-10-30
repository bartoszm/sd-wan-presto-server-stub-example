package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.TopologyRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NodeRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class NodeRef extends com.amartus.yang.sdwan.model.tapi.topology.TopologyRef  {
  private String nodeUuid = null;

  public NodeRef nodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
    return this;
  }

   /**
   * none
   * @return nodeUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-uuid")
  public String getNodeUuid() {
    return nodeUuid;
  }

  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRef tapiTopologyNodeRef = (NodeRef) o;
    return Objects.equals(this.nodeUuid, tapiTopologyNodeRef.nodeUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
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

