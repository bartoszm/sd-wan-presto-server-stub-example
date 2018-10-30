package com.amartus.yang.sdwan.model.mef.sdwan;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.SdwanEdgeType;
import com.amartus.yang.sdwan.model.mef.sdwan.SdwanL2Technology;
import com.amartus.yang.sdwan.model.mef.sdwan.sdwanuni.Ipv4Configuration;
import com.amartus.yang.sdwan.model.mef.sdwan.sdwanuni.Ipv6Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * SdwanUni
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class SdwanUni   {
  private SdwanL2Technology l2Technology = null;

  private Ipv4Configuration ipv4Configuration = null;

  private Ipv6Configuration ipv6Configuration = null;

  private SdwanEdgeType edgeType = null;

  private Integer mtu = null;

  public SdwanUni l2Technology(SdwanL2Technology l2Technology) {
    this.l2Technology = l2Technology;
    return this;
  }

   /**
   * Get l2Technology
   * @return l2Technology
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("l2-technology")
  public SdwanL2Technology getL2Technology() {
    return l2Technology;
  }

  public void setL2Technology(SdwanL2Technology l2Technology) {
    this.l2Technology = l2Technology;
  }

  public SdwanUni ipv4Configuration(Ipv4Configuration ipv4Configuration) {
    this.ipv4Configuration = ipv4Configuration;
    return this;
  }

   /**
   * Get ipv4Configuration
   * @return ipv4Configuration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("ipv4-configuration")
  public Ipv4Configuration getIpv4Configuration() {
    return ipv4Configuration;
  }

  public void setIpv4Configuration(Ipv4Configuration ipv4Configuration) {
    this.ipv4Configuration = ipv4Configuration;
  }

  public SdwanUni ipv6Configuration(Ipv6Configuration ipv6Configuration) {
    this.ipv6Configuration = ipv6Configuration;
    return this;
  }

   /**
   * Get ipv6Configuration
   * @return ipv6Configuration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("ipv6-configuration")
  public Ipv6Configuration getIpv6Configuration() {
    return ipv6Configuration;
  }

  public void setIpv6Configuration(Ipv6Configuration ipv6Configuration) {
    this.ipv6Configuration = ipv6Configuration;
  }

  public SdwanUni edgeType(SdwanEdgeType edgeType) {
    this.edgeType = edgeType;
    return this;
  }

   /**
   * Get edgeType
   * @return edgeType
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("edge-type")
  public SdwanEdgeType getEdgeType() {
    return edgeType;
  }

  public void setEdgeType(SdwanEdgeType edgeType) {
    this.edgeType = edgeType;
  }

  public SdwanUni mtu(Integer mtu) {
    this.mtu = mtu;
    return this;
  }

   /**
   * Maximum Transmit Unit int
   * @return mtu
  **/
  @ApiModelProperty(value = "Maximum Transmit Unit int")
  @JsonProperty("mtu")
  public Integer getMtu() {
    return mtu;
  }

  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SdwanUni mefSdwanSdwanUni = (SdwanUni) o;
    return Objects.equals(this.l2Technology, mefSdwanSdwanUni.l2Technology) &&
        Objects.equals(this.ipv4Configuration, mefSdwanSdwanUni.ipv4Configuration) &&
        Objects.equals(this.ipv6Configuration, mefSdwanSdwanUni.ipv6Configuration) &&
        Objects.equals(this.edgeType, mefSdwanSdwanUni.edgeType) &&
        Objects.equals(this.mtu, mefSdwanSdwanUni.mtu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l2Technology, ipv4Configuration, ipv6Configuration, edgeType, mtu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdwanUni {\n");
    
    sb.append("    l2Technology: ").append(toIndentedString(l2Technology)).append("\n");
    sb.append("    ipv4Configuration: ").append(toIndentedString(ipv4Configuration)).append("\n");
    sb.append("    ipv6Configuration: ").append(toIndentedString(ipv6Configuration)).append("\n");
    sb.append("    edgeType: ").append(toIndentedString(edgeType)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
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

