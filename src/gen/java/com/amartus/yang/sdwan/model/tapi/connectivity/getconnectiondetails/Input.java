package com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails;

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
  private String serviceIdOrName = null;

  private String connectionIdOrName = null;

  public Input serviceIdOrName(String serviceIdOrName) {
    this.serviceIdOrName = serviceIdOrName;
    return this;
  }

   /**
   * none
   * @return serviceIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service-id-or-name")
  public String getServiceIdOrName() {
    return serviceIdOrName;
  }

  public void setServiceIdOrName(String serviceIdOrName) {
    this.serviceIdOrName = serviceIdOrName;
  }

  public Input connectionIdOrName(String connectionIdOrName) {
    this.connectionIdOrName = connectionIdOrName;
    return this;
  }

   /**
   * none
   * @return connectionIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection-id-or-name")
  public String getConnectionIdOrName() {
    return connectionIdOrName;
  }

  public void setConnectionIdOrName(String connectionIdOrName) {
    this.connectionIdOrName = connectionIdOrName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiConnectivityGetconnectiondetailsInput = (Input) o;
    return Objects.equals(this.serviceIdOrName, tapiConnectivityGetconnectiondetailsInput.serviceIdOrName) &&
        Objects.equals(this.connectionIdOrName, tapiConnectivityGetconnectiondetailsInput.connectionIdOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceIdOrName, connectionIdOrName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    serviceIdOrName: ").append(toIndentedString(serviceIdOrName)).append("\n");
    sb.append("    connectionIdOrName: ").append(toIndentedString(connectionIdOrName)).append("\n");
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

