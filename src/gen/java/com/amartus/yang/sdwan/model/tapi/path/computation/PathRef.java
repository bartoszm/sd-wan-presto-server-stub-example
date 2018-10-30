package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PathRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PathRef   {
  private String pathUuid = null;

  public PathRef pathUuid(String pathUuid) {
    this.pathUuid = pathUuid;
    return this;
  }

   /**
   * none
   * @return pathUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("path-uuid")
  public String getPathUuid() {
    return pathUuid;
  }

  public void setPathUuid(String pathUuid) {
    this.pathUuid = pathUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathRef tapiPathComputationPathRef = (PathRef) o;
    return Objects.equals(this.pathUuid, tapiPathComputationPathRef.pathUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathRef {\n");
    
    sb.append("    pathUuid: ").append(toIndentedString(pathUuid)).append("\n");
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

