package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.OrderedPairs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PerformanceGroup
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PerformanceGroup   {
  private OrderedPairs orderedPairs = null;

  private String pgName = null;

  public PerformanceGroup orderedPairs(OrderedPairs orderedPairs) {
    this.orderedPairs = orderedPairs;
    return this;
  }

   /**
   * Get orderedPairs
   * @return orderedPairs
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("ordered-pairs")
  public OrderedPairs getOrderedPairs() {
    return orderedPairs;
  }

  public void setOrderedPairs(OrderedPairs orderedPairs) {
    this.orderedPairs = orderedPairs;
  }

  public PerformanceGroup pgName(String pgName) {
    this.pgName = pgName;
    return this;
  }

   /**
   * Get pgName
   * @return pgName
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("pg-name")
  public String getPgName() {
    return pgName;
  }

  public void setPgName(String pgName) {
    this.pgName = pgName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceGroup mefSdwanConnectivityPerformanceGroup = (PerformanceGroup) o;
    return Objects.equals(this.orderedPairs, mefSdwanConnectivityPerformanceGroup.orderedPairs) &&
        Objects.equals(this.pgName, mefSdwanConnectivityPerformanceGroup.pgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedPairs, pgName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceGroup {\n");
    
    sb.append("    orderedPairs: ").append(toIndentedString(orderedPairs)).append("\n");
    sb.append("    pgName: ").append(toIndentedString(pgName)).append("\n");
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

