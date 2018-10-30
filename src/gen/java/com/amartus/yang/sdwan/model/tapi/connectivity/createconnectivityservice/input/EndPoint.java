package com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.input;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.SwvcEndpointAttributes;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.common.PortDirection;
import com.amartus.yang.sdwan.model.tapi.common.PortRole;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePointRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionEndPointRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityServiceEndPoint;
import com.amartus.yang.sdwan.model.tapi.connectivity.ProtectionRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * EndPoint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class EndPoint extends com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityServiceEndPoint  {
  private SwvcEndpointAttributes swvcEndpointAttributes = null;

  public EndPoint swvcEndpointAttributes(SwvcEndpointAttributes swvcEndpointAttributes) {
    this.swvcEndpointAttributes = swvcEndpointAttributes;
    return this;
  }

   /**
   * Get swvcEndpointAttributes
   * @return swvcEndpointAttributes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("swvc-endpoint-attributes")
  public SwvcEndpointAttributes getSwvcEndpointAttributes() {
    return swvcEndpointAttributes;
  }

  public void setSwvcEndpointAttributes(SwvcEndpointAttributes swvcEndpointAttributes) {
    this.swvcEndpointAttributes = swvcEndpointAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndPoint tapiConnectivityCreateconnectivityserviceInputEndPoint = (EndPoint) o;
    return Objects.equals(this.swvcEndpointAttributes, tapiConnectivityCreateconnectivityserviceInputEndPoint.swvcEndpointAttributes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swvcEndpointAttributes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    swvcEndpointAttributes: ").append(toIndentedString(swvcEndpointAttributes)).append("\n");
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

