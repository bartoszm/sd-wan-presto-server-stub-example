package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ConnectivityServiceRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ConnectivityServiceRef   {
  private String connectivityServiceUuid = null;

  public ConnectivityServiceRef connectivityServiceUuid(String connectivityServiceUuid) {
    this.connectivityServiceUuid = connectivityServiceUuid;
    return this;
  }

   /**
   * none
   * @return connectivityServiceUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connectivity-service-uuid")
  public String getConnectivityServiceUuid() {
    return connectivityServiceUuid;
  }

  public void setConnectivityServiceUuid(String connectivityServiceUuid) {
    this.connectivityServiceUuid = connectivityServiceUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectivityServiceRef tapiConnectivityConnectivityServiceRef = (ConnectivityServiceRef) o;
    return Objects.equals(this.connectivityServiceUuid, tapiConnectivityConnectivityServiceRef.connectivityServiceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityServiceUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectivityServiceRef {\n");
    
    sb.append("    connectivityServiceUuid: ").append(toIndentedString(connectivityServiceUuid)).append("\n");
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

