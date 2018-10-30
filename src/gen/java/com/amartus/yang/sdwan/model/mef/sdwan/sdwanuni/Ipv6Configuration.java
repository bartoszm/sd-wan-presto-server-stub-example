package com.amartus.yang.sdwan.model.mef.sdwan.sdwanuni;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.IpConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Ipv6Configuration
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Ipv6Configuration   {
  private List<IpConfig> subnet = new ArrayList<IpConfig>();

  private String subscriberAddress = null;

  public Ipv6Configuration subnet(List<IpConfig> subnet) {
    this.subnet = subnet;
    return this;
  }

  public Ipv6Configuration addSubnetItem(IpConfig subnetItem) {
    this.subnet.add(subnetItem);
    return this;
  }

   /**
   * Get subnet
   * @return subnet
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("subnet")
  public List<IpConfig> getSubnet() {
    return subnet;
  }

  public void setSubnet(List<IpConfig> subnet) {
    this.subnet = subnet;
  }

  public Ipv6Configuration subscriberAddress(String subscriberAddress) {
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
    Ipv6Configuration mefSdwanSdwanuniIpv6Configuration = (Ipv6Configuration) o;
    return Objects.equals(this.subnet, mefSdwanSdwanuniIpv6Configuration.subnet) &&
        Objects.equals(this.subscriberAddress, mefSdwanSdwanuniIpv6Configuration.subscriberAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnet, subscriberAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv6Configuration {\n");
    
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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

