package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.RiskCharacteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * RiskParameterPac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class RiskParameterPac   {
  private List<RiskCharacteristic> riskCharacteristic = new ArrayList<RiskCharacteristic>();

  public RiskParameterPac riskCharacteristic(List<RiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public RiskParameterPac addRiskCharacteristicItem(RiskCharacteristic riskCharacteristicItem) {
    this.riskCharacteristic.add(riskCharacteristicItem);
    return this;
  }

   /**
   * A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.
   * @return riskCharacteristic
  **/
  @ApiModelProperty(value = "A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.")
  @JsonProperty("risk-characteristic")
  public List<RiskCharacteristic> getRiskCharacteristic() {
    return riskCharacteristic;
  }

  public void setRiskCharacteristic(List<RiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskParameterPac tapiTopologyRiskParameterPac = (RiskParameterPac) o;
    return Objects.equals(this.riskCharacteristic, tapiTopologyRiskParameterPac.riskCharacteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskCharacteristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskParameterPac {\n");
    
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
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

