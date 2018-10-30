package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * TransferCostPac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class TransferCostPac   {
  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  public TransferCostPac costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TransferCostPac addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
    this.costCharacteristic.add(costCharacteristicItem);
    return this;
  }

   /**
   * The list of costs where each cost relates to some aspect of the TopologicalEntity.
   * @return costCharacteristic
  **/
  @ApiModelProperty(value = "The list of costs where each cost relates to some aspect of the TopologicalEntity.")
  @JsonProperty("cost-characteristic")
  public List<CostCharacteristic> getCostCharacteristic() {
    return costCharacteristic;
  }

  public void setCostCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCostPac tapiTopologyTransferCostPac = (TransferCostPac) o;
    return Objects.equals(this.costCharacteristic, tapiTopologyTransferCostPac.costCharacteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costCharacteristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCostPac {\n");
    
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
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

