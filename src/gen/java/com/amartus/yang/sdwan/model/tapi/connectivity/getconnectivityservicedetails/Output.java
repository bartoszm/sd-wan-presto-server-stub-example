package com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.output.Service;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private Service service = null;

  public Output service(Service service) {
    this.service = service;
    return this;
  }

   /**
   * none
   * @return service
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service")
  public Service getService() {
    return service;
  }

  public void setService(Service service) {
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
    Output tapiConnectivityGetconnectivityservicedetailsOutput = (Output) o;
    return Objects.equals(this.service, tapiConnectivityGetconnectivityservicedetailsOutput.service);
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

