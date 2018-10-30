package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.TopologyRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LinkRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class LinkRef extends com.amartus.yang.sdwan.model.tapi.topology.TopologyRef  {
  private String linkUuid = null;

  public LinkRef linkUuid(String linkUuid) {
    this.linkUuid = linkUuid;
    return this;
  }

   /**
   * none
   * @return linkUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("link-uuid")
  public String getLinkUuid() {
    return linkUuid;
  }

  public void setLinkUuid(String linkUuid) {
    this.linkUuid = linkUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkRef tapiTopologyLinkRef = (LinkRef) o;
    return Objects.equals(this.linkUuid, tapiTopologyLinkRef.linkUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    linkUuid: ").append(toIndentedString(linkUuid)).append("\n");
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

