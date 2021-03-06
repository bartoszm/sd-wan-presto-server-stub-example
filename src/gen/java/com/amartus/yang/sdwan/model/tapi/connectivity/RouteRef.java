package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RouteRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class RouteRef extends com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionRef  {
  private String routeLocalId = null;

  public RouteRef routeLocalId(String routeLocalId) {
    this.routeLocalId = routeLocalId;
    return this;
  }

   /**
   * none
   * @return routeLocalId
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("route-local-id")
  public String getRouteLocalId() {
    return routeLocalId;
  }

  public void setRouteLocalId(String routeLocalId) {
    this.routeLocalId = routeLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteRef tapiConnectivityRouteRef = (RouteRef) o;
    return Objects.equals(this.routeLocalId, tapiConnectivityRouteRef.routeLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    routeLocalId: ").append(toIndentedString(routeLocalId)).append("\n");
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

