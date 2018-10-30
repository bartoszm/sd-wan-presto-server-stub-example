package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.BandwidthProfile;
import com.amartus.yang.sdwan.model.tapi.common.CapacityValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Capacity
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Capacity   {
  private BandwidthProfile bandwidthProfile = null;

  private CapacityValue totalSize = null;

  public Capacity bandwidthProfile(BandwidthProfile bandwidthProfile) {
    this.bandwidthProfile = bandwidthProfile;
    return this;
  }

   /**
   * none
   * @return bandwidthProfile
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("bandwidth-profile")
  public BandwidthProfile getBandwidthProfile() {
    return bandwidthProfile;
  }

  public void setBandwidthProfile(BandwidthProfile bandwidthProfile) {
    this.bandwidthProfile = bandwidthProfile;
  }

  public Capacity totalSize(CapacityValue totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Total capacity of the TopologicalEntity in MB/s. In case of bandwidthProfile, this is expected to same as the committedInformationRate.
   * @return totalSize
  **/
  @ApiModelProperty(value = "Total capacity of the TopologicalEntity in MB/s. In case of bandwidthProfile, this is expected to same as the committedInformationRate.")
  @JsonProperty("total-size")
  public CapacityValue getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(CapacityValue totalSize) {
    this.totalSize = totalSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capacity tapiCommonCapacity = (Capacity) o;
    return Objects.equals(this.bandwidthProfile, tapiCommonCapacity.bandwidthProfile) &&
        Objects.equals(this.totalSize, tapiCommonCapacity.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthProfile, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capacity {\n");
    
    sb.append("    bandwidthProfile: ").append(toIndentedString(bandwidthProfile)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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

