package com.amartus.yang.sdwan.model.mef.sdwan.sdwanuni.ipv4configuration;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.IpConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * PrimarySubnet
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PrimarySubnet extends com.amartus.yang.sdwan.model.mef.sdwan.IpConfig  {
  private String subscriberAddress = null;

  public PrimarySubnet subscriberAddress(String subscriberAddress) {
    this.subscriberAddress = subscriberAddress;
    return this;
  }

   /**
   * Get subscriberAddress
   * @return subscriberAddress
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("subscriber-address")
  public String getSubscriberAddress() {
    return subscriberAddress;
  }

  public void setSubscriberAddress(String subscriberAddress) {
    this.subscriberAddress = subscriberAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimarySubnet mefSdwanSdwanuniIpv4configurationPrimarySubnet = (PrimarySubnet) o;
    return Objects.equals(this.subscriberAddress, mefSdwanSdwanuniIpv4configurationPrimarySubnet.subscriberAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimarySubnet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subscriberAddress: ").append(toIndentedString(subscriberAddress)).append("\n");
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

