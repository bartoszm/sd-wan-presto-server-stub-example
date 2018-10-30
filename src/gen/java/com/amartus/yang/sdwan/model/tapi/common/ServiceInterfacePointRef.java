package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ServiceInterfacePointRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ServiceInterfacePointRef   {
  private String serviceInterfacePointUuid = null;

  public ServiceInterfacePointRef serviceInterfacePointUuid(String serviceInterfacePointUuid) {
    this.serviceInterfacePointUuid = serviceInterfacePointUuid;
    return this;
  }

   /**
   * none
   * @return serviceInterfacePointUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service-interface-point-uuid")
  public String getServiceInterfacePointUuid() {
    return serviceInterfacePointUuid;
  }

  public void setServiceInterfacePointUuid(String serviceInterfacePointUuid) {
    this.serviceInterfacePointUuid = serviceInterfacePointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInterfacePointRef tapiCommonServiceInterfacePointRef = (ServiceInterfacePointRef) o;
    return Objects.equals(this.serviceInterfacePointUuid, tapiCommonServiceInterfacePointRef.serviceInterfacePointUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceInterfacePointUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInterfacePointRef {\n");
    
    sb.append("    serviceInterfacePointUuid: ").append(toIndentedString(serviceInterfacePointUuid)).append("\n");
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

