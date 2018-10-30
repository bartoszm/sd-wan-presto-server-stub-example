package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.CosPerformanceObjective;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * CosPerformanceObjectives
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class CosPerformanceObjectives   {
  private List<CosPerformanceObjective> cosPerformanceObjective = new ArrayList<CosPerformanceObjective>();

  public CosPerformanceObjectives cosPerformanceObjective(List<CosPerformanceObjective> cosPerformanceObjective) {
    this.cosPerformanceObjective = cosPerformanceObjective;
    return this;
  }

  public CosPerformanceObjectives addCosPerformanceObjectiveItem(CosPerformanceObjective cosPerformanceObjectiveItem) {
    this.cosPerformanceObjective.add(cosPerformanceObjectiveItem);
    return this;
  }

   /**
   * Get cosPerformanceObjective
   * @return cosPerformanceObjective
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("cos-performance-objective")
  public List<CosPerformanceObjective> getCosPerformanceObjective() {
    return cosPerformanceObjective;
  }

  public void setCosPerformanceObjective(List<CosPerformanceObjective> cosPerformanceObjective) {
    this.cosPerformanceObjective = cosPerformanceObjective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosPerformanceObjectives mefSdwanConnectivityCosPerformanceObjectives = (CosPerformanceObjectives) o;
    return Objects.equals(this.cosPerformanceObjective, mefSdwanConnectivityCosPerformanceObjectives.cosPerformanceObjective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cosPerformanceObjective);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosPerformanceObjectives {\n");
    
    sb.append("    cosPerformanceObjective: ").append(toIndentedString(cosPerformanceObjective)).append("\n");
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

