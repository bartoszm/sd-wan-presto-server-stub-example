package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePointRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ConnectionEndPointRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ConnectionEndPointRef extends com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePointRef  {
  private String connectionEndPointUuid = null;

  public ConnectionEndPointRef connectionEndPointUuid(String connectionEndPointUuid) {
    this.connectionEndPointUuid = connectionEndPointUuid;
    return this;
  }

   /**
   * none
   * @return connectionEndPointUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection-end-point-uuid")
  public String getConnectionEndPointUuid() {
    return connectionEndPointUuid;
  }

  public void setConnectionEndPointUuid(String connectionEndPointUuid) {
    this.connectionEndPointUuid = connectionEndPointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionEndPointRef tapiConnectivityConnectionEndPointRef = (ConnectionEndPointRef) o;
    return Objects.equals(this.connectionEndPointUuid, tapiConnectivityConnectionEndPointRef.connectionEndPointUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionEndPointUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionEndPointRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionEndPointUuid: ").append(toIndentedString(connectionEndPointUuid)).append("\n");
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

