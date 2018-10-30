package com.amartus.yang.sdwan.model.tapi.topology.getnodeedgepointdetails;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Input
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Input   {
  private String epIdOrName = null;

  private String nodeIdOrName = null;

  private String topologyIdOrName = null;

  public Input epIdOrName(String epIdOrName) {
    this.epIdOrName = epIdOrName;
    return this;
  }

   /**
   * none
   * @return epIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("ep-id-or-name")
  public String getEpIdOrName() {
    return epIdOrName;
  }

  public void setEpIdOrName(String epIdOrName) {
    this.epIdOrName = epIdOrName;
  }

  public Input nodeIdOrName(String nodeIdOrName) {
    this.nodeIdOrName = nodeIdOrName;
    return this;
  }

   /**
   * none
   * @return nodeIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node-id-or-name")
  public String getNodeIdOrName() {
    return nodeIdOrName;
  }

  public void setNodeIdOrName(String nodeIdOrName) {
    this.nodeIdOrName = nodeIdOrName;
  }

  public Input topologyIdOrName(String topologyIdOrName) {
    this.topologyIdOrName = topologyIdOrName;
    return this;
  }

   /**
   * none
   * @return topologyIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("topology-id-or-name")
  public String getTopologyIdOrName() {
    return topologyIdOrName;
  }

  public void setTopologyIdOrName(String topologyIdOrName) {
    this.topologyIdOrName = topologyIdOrName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiTopologyGetnodeedgepointdetailsInput = (Input) o;
    return Objects.equals(this.epIdOrName, tapiTopologyGetnodeedgepointdetailsInput.epIdOrName) &&
        Objects.equals(this.nodeIdOrName, tapiTopologyGetnodeedgepointdetailsInput.nodeIdOrName) &&
        Objects.equals(this.topologyIdOrName, tapiTopologyGetnodeedgepointdetailsInput.topologyIdOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epIdOrName, nodeIdOrName, topologyIdOrName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    epIdOrName: ").append(toIndentedString(epIdOrName)).append("\n");
    sb.append("    nodeIdOrName: ").append(toIndentedString(nodeIdOrName)).append("\n");
    sb.append("    topologyIdOrName: ").append(toIndentedString(topologyIdOrName)).append("\n");
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

