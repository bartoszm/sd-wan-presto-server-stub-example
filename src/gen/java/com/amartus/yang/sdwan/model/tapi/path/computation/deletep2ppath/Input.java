package com.amartus.yang.sdwan.model.tapi.path.computation.deletep2ppath;

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
  private String pathIdOrName = null;

  public Input pathIdOrName(String pathIdOrName) {
    this.pathIdOrName = pathIdOrName;
    return this;
  }

   /**
   * none
   * @return pathIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("path-id-or-name")
  public String getPathIdOrName() {
    return pathIdOrName;
  }

  public void setPathIdOrName(String pathIdOrName) {
    this.pathIdOrName = pathIdOrName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiPathComputationDeletep2ppathInput = (Input) o;
    return Objects.equals(this.pathIdOrName, tapiPathComputationDeletep2ppathInput.pathIdOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathIdOrName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    pathIdOrName: ").append(toIndentedString(pathIdOrName)).append("\n");
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

