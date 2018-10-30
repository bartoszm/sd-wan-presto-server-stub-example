package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.PerformanceGroups;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * CosPerformanceObjective
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class CosPerformanceObjective   {
  private PerformanceGroups performanceGroups = null;

  private String cosName = null;

  public CosPerformanceObjective performanceGroups(PerformanceGroups performanceGroups) {
    this.performanceGroups = performanceGroups;
    return this;
  }

   /**
   * Get performanceGroups
   * @return performanceGroups
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("performance-groups")
  public PerformanceGroups getPerformanceGroups() {
    return performanceGroups;
  }

  public void setPerformanceGroups(PerformanceGroups performanceGroups) {
    this.performanceGroups = performanceGroups;
  }

  public CosPerformanceObjective cosName(String cosName) {
    this.cosName = cosName;
    return this;
  }

   /**
   * Get cosName
   * @return cosName
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("cos-name")
  public String getCosName() {
    return cosName;
  }

  public void setCosName(String cosName) {
    this.cosName = cosName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosPerformanceObjective mefSdwanConnectivityCosPerformanceObjective = (CosPerformanceObjective) o;
    return Objects.equals(this.performanceGroups, mefSdwanConnectivityCosPerformanceObjective.performanceGroups) &&
        Objects.equals(this.cosName, mefSdwanConnectivityCosPerformanceObjective.cosName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceGroups, cosName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosPerformanceObjective {\n");
    
    sb.append("    performanceGroups: ").append(toIndentedString(performanceGroups)).append("\n");
    sb.append("    cosName: ").append(toIndentedString(cosName)).append("\n");
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

