package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ConnectionRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ConnectionRef   {
  private String connectionUuid = null;

  public ConnectionRef connectionUuid(String connectionUuid) {
    this.connectionUuid = connectionUuid;
    return this;
  }

   /**
   * none
   * @return connectionUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection-uuid")
  public String getConnectionUuid() {
    return connectionUuid;
  }

  public void setConnectionUuid(String connectionUuid) {
    this.connectionUuid = connectionUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionRef tapiConnectivityConnectionRef = (ConnectionRef) o;
    return Objects.equals(this.connectionUuid, tapiConnectivityConnectionRef.connectionUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionRef {\n");
    
    sb.append("    connectionUuid: ").append(toIndentedString(connectionUuid)).append("\n");
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

