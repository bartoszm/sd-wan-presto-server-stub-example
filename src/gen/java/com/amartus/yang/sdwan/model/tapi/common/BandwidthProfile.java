package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.BandwidthProfileType;
import com.amartus.yang.sdwan.model.tapi.common.CapacityValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * BandwidthProfile
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class BandwidthProfile   {
  private CapacityValue committedInformationRate = null;

  private Boolean couplingFlag = false;

  private BandwidthProfileType bwProfileType = null;

  private CapacityValue peakInformationRate = null;

  private CapacityValue committedBurstSize = null;

  private CapacityValue peakBurstSize = null;

  private Boolean colorAware = false;

  public BandwidthProfile committedInformationRate(CapacityValue committedInformationRate) {
    this.committedInformationRate = committedInformationRate;
    return this;
  }

   /**
   * none
   * @return committedInformationRate
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("committed-information-rate")
  public CapacityValue getCommittedInformationRate() {
    return committedInformationRate;
  }

  public void setCommittedInformationRate(CapacityValue committedInformationRate) {
    this.committedInformationRate = committedInformationRate;
  }

  public BandwidthProfile couplingFlag(Boolean couplingFlag) {
    this.couplingFlag = couplingFlag;
    return this;
  }

   /**
   * none
   * @return couplingFlag
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("coupling-flag")
  public Boolean getCouplingFlag() {
    return couplingFlag;
  }

  public void setCouplingFlag(Boolean couplingFlag) {
    this.couplingFlag = couplingFlag;
  }

  public BandwidthProfile bwProfileType(BandwidthProfileType bwProfileType) {
    this.bwProfileType = bwProfileType;
    return this;
  }

   /**
   * none
   * @return bwProfileType
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("bw-profile-type")
  public BandwidthProfileType getBwProfileType() {
    return bwProfileType;
  }

  public void setBwProfileType(BandwidthProfileType bwProfileType) {
    this.bwProfileType = bwProfileType;
  }

  public BandwidthProfile peakInformationRate(CapacityValue peakInformationRate) {
    this.peakInformationRate = peakInformationRate;
    return this;
  }

   /**
   * none
   * @return peakInformationRate
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("peak-information-rate")
  public CapacityValue getPeakInformationRate() {
    return peakInformationRate;
  }

  public void setPeakInformationRate(CapacityValue peakInformationRate) {
    this.peakInformationRate = peakInformationRate;
  }

  public BandwidthProfile committedBurstSize(CapacityValue committedBurstSize) {
    this.committedBurstSize = committedBurstSize;
    return this;
  }

   /**
   * none
   * @return committedBurstSize
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("committed-burst-size")
  public CapacityValue getCommittedBurstSize() {
    return committedBurstSize;
  }

  public void setCommittedBurstSize(CapacityValue committedBurstSize) {
    this.committedBurstSize = committedBurstSize;
  }

  public BandwidthProfile peakBurstSize(CapacityValue peakBurstSize) {
    this.peakBurstSize = peakBurstSize;
    return this;
  }

   /**
   * none
   * @return peakBurstSize
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("peak-burst-size")
  public CapacityValue getPeakBurstSize() {
    return peakBurstSize;
  }

  public void setPeakBurstSize(CapacityValue peakBurstSize) {
    this.peakBurstSize = peakBurstSize;
  }

  public BandwidthProfile colorAware(Boolean colorAware) {
    this.colorAware = colorAware;
    return this;
  }

   /**
   * none
   * @return colorAware
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("color-aware")
  public Boolean getColorAware() {
    return colorAware;
  }

  public void setColorAware(Boolean colorAware) {
    this.colorAware = colorAware;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthProfile tapiCommonBandwidthProfile = (BandwidthProfile) o;
    return Objects.equals(this.committedInformationRate, tapiCommonBandwidthProfile.committedInformationRate) &&
        Objects.equals(this.couplingFlag, tapiCommonBandwidthProfile.couplingFlag) &&
        Objects.equals(this.bwProfileType, tapiCommonBandwidthProfile.bwProfileType) &&
        Objects.equals(this.peakInformationRate, tapiCommonBandwidthProfile.peakInformationRate) &&
        Objects.equals(this.committedBurstSize, tapiCommonBandwidthProfile.committedBurstSize) &&
        Objects.equals(this.peakBurstSize, tapiCommonBandwidthProfile.peakBurstSize) &&
        Objects.equals(this.colorAware, tapiCommonBandwidthProfile.colorAware);
  }

  @Override
  public int hashCode() {
    return Objects.hash(committedInformationRate, couplingFlag, bwProfileType, peakInformationRate, committedBurstSize, peakBurstSize, colorAware);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthProfile {\n");
    
    sb.append("    committedInformationRate: ").append(toIndentedString(committedInformationRate)).append("\n");
    sb.append("    couplingFlag: ").append(toIndentedString(couplingFlag)).append("\n");
    sb.append("    bwProfileType: ").append(toIndentedString(bwProfileType)).append("\n");
    sb.append("    peakInformationRate: ").append(toIndentedString(peakInformationRate)).append("\n");
    sb.append("    committedBurstSize: ").append(toIndentedString(committedBurstSize)).append("\n");
    sb.append("    peakBurstSize: ").append(toIndentedString(peakBurstSize)).append("\n");
    sb.append("    colorAware: ").append(toIndentedString(colorAware)).append("\n");
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

