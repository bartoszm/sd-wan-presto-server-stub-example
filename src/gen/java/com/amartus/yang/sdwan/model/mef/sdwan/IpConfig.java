package com.amartus.yang.sdwan.model.mef.sdwan;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * IpConfig
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class IpConfig   {
  private List<String> reservedIpPrefix = new ArrayList<String>();

  private List<String> providerAddresses = new ArrayList<String>();

  private String ipPrefix = null;

  public IpConfig reservedIpPrefix(List<String> reservedIpPrefix) {
    this.reservedIpPrefix = reservedIpPrefix;
    return this;
  }

  public IpConfig addReservedIpPrefixItem(String reservedIpPrefixItem) {
    this.reservedIpPrefix.add(reservedIpPrefixItem);
    return this;
  }

   /**
   * Specify IP addresses that are not available for the Subscriber to assign statically.                           If DHCP is used, the IP address range from which addresses are dynamically assigned                           is taken from this pool of reserved addresses
   * @return reservedIpPrefix
  **/
  @ApiModelProperty(value = "Specify IP addresses that are not available for the Subscriber to assign statically.                           If DHCP is used, the IP address range from which addresses are dynamically assigned                           is taken from this pool of reserved addresses")
  @JsonProperty("reserved-ip-prefix")
  public List<String> getReservedIpPrefix() {
    return reservedIpPrefix;
  }

  public void setReservedIpPrefix(List<String> reservedIpPrefix) {
    this.reservedIpPrefix = reservedIpPrefix;
  }

  public IpConfig providerAddresses(List<String> providerAddresses) {
    this.providerAddresses = providerAddresses;
    return this;
  }

  public IpConfig addProviderAddressesItem(String providerAddressesItem) {
    this.providerAddresses.add(providerAddressesItem);
    return this;
  }

   /**
   * Get providerAddresses
   * @return providerAddresses
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("provider-addresses")
  public List<String> getProviderAddresses() {
    return providerAddresses;
  }

  public void setProviderAddresses(List<String> providerAddresses) {
    this.providerAddresses = providerAddresses;
  }

  public IpConfig ipPrefix(String ipPrefix) {
    this.ipPrefix = ipPrefix;
    return this;
  }

   /**
   * Get ipPrefix
   * @return ipPrefix
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("ip-prefix")
  public String getIpPrefix() {
    return ipPrefix;
  }

  public void setIpPrefix(String ipPrefix) {
    this.ipPrefix = ipPrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpConfig mefSdwanIpConfig = (IpConfig) o;
    return Objects.equals(this.reservedIpPrefix, mefSdwanIpConfig.reservedIpPrefix) &&
        Objects.equals(this.providerAddresses, mefSdwanIpConfig.providerAddresses) &&
        Objects.equals(this.ipPrefix, mefSdwanIpConfig.ipPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservedIpPrefix, providerAddresses, ipPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpConfig {\n");
    
    sb.append("    reservedIpPrefix: ").append(toIndentedString(reservedIpPrefix)).append("\n");
    sb.append("    providerAddresses: ").append(toIndentedString(providerAddresses)).append("\n");
    sb.append("    ipPrefix: ").append(toIndentedString(ipPrefix)).append("\n");
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

