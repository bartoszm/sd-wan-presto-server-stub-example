package com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.output;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.SdwanUni;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Sip
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Sip extends com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePoint  {
  private SdwanUni sdwanUni = null;

  public Sip sdwanUni(SdwanUni sdwanUni) {
    this.sdwanUni = sdwanUni;
    return this;
  }

   /**
   * Get sdwanUni
   * @return sdwanUni
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("sdwan-uni")
  public SdwanUni getSdwanUni() {
    return sdwanUni;
  }

  public void setSdwanUni(SdwanUni sdwanUni) {
    this.sdwanUni = sdwanUni;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sip tapiCommonGetserviceinterfacepointlistOutputSip = (Sip) o;
    return Objects.equals(this.sdwanUni, tapiCommonGetserviceinterfacepointlistOutputSip.sdwanUni) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdwanUni, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sip {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sdwanUni: ").append(toIndentedString(sdwanUni)).append("\n");
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

