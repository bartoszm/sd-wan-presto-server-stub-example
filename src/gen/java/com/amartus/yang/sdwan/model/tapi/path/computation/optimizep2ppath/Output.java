package com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathComputationService;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private PathComputationService service = null;

  public Output service(PathComputationService service) {
    this.service = service;
    return this;
  }

   /**
   * none
   * @return service
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service")
  public PathComputationService getService() {
    return service;
  }

  public void setService(PathComputationService service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output tapiPathComputationOptimizep2ppathOutput = (Output) o;
    return Objects.equals(this.service, tapiPathComputationOptimizep2ppathOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

