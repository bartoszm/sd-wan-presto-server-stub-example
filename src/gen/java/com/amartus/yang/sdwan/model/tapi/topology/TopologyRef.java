package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * TopologyRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class TopologyRef   {
  private String topologyUuid = null;

  public TopologyRef topologyUuid(String topologyUuid) {
    this.topologyUuid = topologyUuid;
    return this;
  }

   /**
   * none
   * @return topologyUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("topology-uuid")
  public String getTopologyUuid() {
    return topologyUuid;
  }

  public void setTopologyUuid(String topologyUuid) {
    this.topologyUuid = topologyUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyRef tapiTopologyTopologyRef = (TopologyRef) o;
    return Objects.equals(this.topologyUuid, tapiTopologyTopologyRef.topologyUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyRef {\n");
    
    sb.append("    topologyUuid: ").append(toIndentedString(topologyUuid)).append("\n");
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

