package com.amartus.yang.sdwan.model.tapi.topology.getnodedetails;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.Node;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private Node node = null;

  public Output node(Node node) {
    this.node = node;
    return this;
  }

   /**
   * none
   * @return node
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node")
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output tapiTopologyGetnodedetailsOutput = (Output) o;
    return Objects.equals(this.node, tapiTopologyGetnodedetailsOutput.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(node);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

