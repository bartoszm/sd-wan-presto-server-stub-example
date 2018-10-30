package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.OrderedPair;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * OrderedPairs
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class OrderedPairs   {
  private List<OrderedPair> orderedPair = new ArrayList<OrderedPair>();

  public OrderedPairs orderedPair(List<OrderedPair> orderedPair) {
    this.orderedPair = orderedPair;
    return this;
  }

  public OrderedPairs addOrderedPairItem(OrderedPair orderedPairItem) {
    this.orderedPair.add(orderedPairItem);
    return this;
  }

   /**
   * Get orderedPair
   * @return orderedPair
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("ordered-pair")
  public List<OrderedPair> getOrderedPair() {
    return orderedPair;
  }

  public void setOrderedPair(List<OrderedPair> orderedPair) {
    this.orderedPair = orderedPair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderedPairs mefSdwanConnectivityOrderedPairs = (OrderedPairs) o;
    return Objects.equals(this.orderedPair, mefSdwanConnectivityOrderedPairs.orderedPair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedPair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderedPairs {\n");
    
    sb.append("    orderedPair: ").append(toIndentedString(orderedPair)).append("\n");
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

