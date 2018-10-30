package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.LocalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionEndPointRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Route
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Route extends com.amartus.yang.sdwan.model.tapi.common.LocalClass  {
  private List<ConnectionEndPointRef> connectionEndPoint = new ArrayList<ConnectionEndPointRef>();

  public Route connectionEndPoint(List<ConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public Route addConnectionEndPointItem(ConnectionEndPointRef connectionEndPointItem) {
    this.connectionEndPoint.add(connectionEndPointItem);
    return this;
  }

   /**
   * none
   * @return connectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection-end-point")
  public List<ConnectionEndPointRef> getConnectionEndPoint() {
    return connectionEndPoint;
  }

  public void setConnectionEndPoint(List<ConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route tapiConnectivityRoute = (Route) o;
    return Objects.equals(this.connectionEndPoint, tapiConnectivityRoute.connectionEndPoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionEndPoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
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

