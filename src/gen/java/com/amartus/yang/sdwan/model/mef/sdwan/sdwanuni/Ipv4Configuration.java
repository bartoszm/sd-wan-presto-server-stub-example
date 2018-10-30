package com.amartus.yang.sdwan.model.mef.sdwan.sdwanuni;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.IpConfig;
import com.amartus.yang.sdwan.model.mef.sdwan.sdwanuni.ipv4configuration.PrimarySubnet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Ipv4Configuration
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Ipv4Configuration   {
  private List<IpConfig> secondarySubnet = new ArrayList<IpConfig>();

  private PrimarySubnet primarySubnet = null;

  public Ipv4Configuration secondarySubnet(List<IpConfig> secondarySubnet) {
    this.secondarySubnet = secondarySubnet;
    return this;
  }

  public Ipv4Configuration addSecondarySubnetItem(IpConfig secondarySubnetItem) {
    this.secondarySubnet.add(secondarySubnetItem);
    return this;
  }

   /**
   * Get secondarySubnet
   * @return secondarySubnet
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("secondary-subnet")
  public List<IpConfig> getSecondarySubnet() {
    return secondarySubnet;
  }

  public void setSecondarySubnet(List<IpConfig> secondarySubnet) {
    this.secondarySubnet = secondarySubnet;
  }

  public Ipv4Configuration primarySubnet(PrimarySubnet primarySubnet) {
    this.primarySubnet = primarySubnet;
    return this;
  }

   /**
   * Get primarySubnet
   * @return primarySubnet
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("primary-subnet")
  public PrimarySubnet getPrimarySubnet() {
    return primarySubnet;
  }

  public void setPrimarySubnet(PrimarySubnet primarySubnet) {
    this.primarySubnet = primarySubnet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipv4Configuration mefSdwanSdwanuniIpv4Configuration = (Ipv4Configuration) o;
    return Objects.equals(this.secondarySubnet, mefSdwanSdwanuniIpv4Configuration.secondarySubnet) &&
        Objects.equals(this.primarySubnet, mefSdwanSdwanuniIpv4Configuration.primarySubnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondarySubnet, primarySubnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv4Configuration {\n");
    
    sb.append("    secondarySubnet: ").append(toIndentedString(secondarySubnet)).append("\n");
    sb.append("    primarySubnet: ").append(toIndentedString(primarySubnet)).append("\n");
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

