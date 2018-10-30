package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.PerformanceGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * PerformanceGroups
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PerformanceGroups   {
  private List<PerformanceGroup> performanceGroup = new ArrayList<PerformanceGroup>();

  public PerformanceGroups performanceGroup(List<PerformanceGroup> performanceGroup) {
    this.performanceGroup = performanceGroup;
    return this;
  }

  public PerformanceGroups addPerformanceGroupItem(PerformanceGroup performanceGroupItem) {
    this.performanceGroup.add(performanceGroupItem);
    return this;
  }

   /**
   * Get performanceGroup
   * @return performanceGroup
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("performance-group")
  public List<PerformanceGroup> getPerformanceGroup() {
    return performanceGroup;
  }

  public void setPerformanceGroup(List<PerformanceGroup> performanceGroup) {
    this.performanceGroup = performanceGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceGroups mefSdwanConnectivityPerformanceGroups = (PerformanceGroups) o;
    return Objects.equals(this.performanceGroup, mefSdwanConnectivityPerformanceGroups.performanceGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceGroups {\n");
    
    sb.append("    performanceGroup: ").append(toIndentedString(performanceGroup)).append("\n");
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

