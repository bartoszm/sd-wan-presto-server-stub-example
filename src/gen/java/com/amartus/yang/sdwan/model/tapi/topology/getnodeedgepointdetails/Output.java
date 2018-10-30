package com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private NodeEdgePoint nodeEdgePoint = null;

  public Output nodeEdgePoint(NodeEdgePoint nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

   /**
   * none
   * @return nodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-edge-point")
  public NodeEdgePoint getNodeEdgePoint() {
    return nodeEdgePoint;
  }

  public void setNodeEdgePoint(NodeEdgePoint nodeEdgePoint) {
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
    Output tapiTopologyGetnodeedgepointdetailsOutput = (Output) o;
    return Objects.equals(this.nodeEdgePoint, tapiTopologyGetnodeedgepointdetailsOutput.nodeEdgePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeEdgePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
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

