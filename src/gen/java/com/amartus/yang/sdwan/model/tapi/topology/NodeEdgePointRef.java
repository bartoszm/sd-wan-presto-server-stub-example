package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.NodeRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NodeEdgePointRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class NodeEdgePointRef extends com.amartus.yang.sdwan.model.tapi.topology.NodeRef  {
  private String nodeEdgePointUuid = null;

  public NodeEdgePointRef nodeEdgePointUuid(String nodeEdgePointUuid) {
    this.nodeEdgePointUuid = nodeEdgePointUuid;
    return this;
  }

   /**
   * none
   * @return nodeEdgePointUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-edge-point-uuid")
  public String getNodeEdgePointUuid() {
    return nodeEdgePointUuid;
  }

  public void setNodeEdgePointUuid(String nodeEdgePointUuid) {
    this.nodeEdgePointUuid = nodeEdgePointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeEdgePointRef tapiTopologyNodeEdgePointRef = (NodeEdgePointRef) o;
    return Objects.equals(this.nodeEdgePointUuid, tapiTopologyNodeEdgePointRef.nodeEdgePointUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeEdgePointUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeEdgePointRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeEdgePointUuid: ").append(toIndentedString(nodeEdgePointUuid)).append("\n");
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

