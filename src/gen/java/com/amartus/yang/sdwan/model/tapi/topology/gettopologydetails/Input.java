package com.amartus.yang.sdwan.model.tapi.topology.gettopologydetails;

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
  private String topologyIdOrName = null;

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
    Input tapiTopologyGettopologydetailsInput = (Input) o;
    return Objects.equals(this.topologyIdOrName, tapiTopologyGettopologydetailsInput.topologyIdOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyIdOrName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
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

