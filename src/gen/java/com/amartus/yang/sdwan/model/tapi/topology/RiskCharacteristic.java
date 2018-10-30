package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * RiskCharacteristic
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class RiskCharacteristic   {
  private String riskCharacteristicName = null;

  private List<String> riskIdentifierList = new ArrayList<String>();

  public RiskCharacteristic riskCharacteristicName(String riskCharacteristicName) {
    this.riskCharacteristicName = riskCharacteristicName;
    return this;
  }

   /**
   * The name of the risk characteristic. The characteristic may be related to a specific degree of closeness.                       For example a particular characteristic may apply to failures that are localized (e.g. to one side of a road) where as another characteristic may relate to failures that have a broader impact (e.g. both sides of a road that crosses a bridge).                      Depending upon the importance of the traffic being routed different risk characteristics will be evaluated.
   * @return riskCharacteristicName
  **/
  @ApiModelProperty(value = "The name of the risk characteristic. The characteristic may be related to a specific degree of closeness.                       For example a particular characteristic may apply to failures that are localized (e.g. to one side of a road) where as another characteristic may relate to failures that have a broader impact (e.g. both sides of a road that crosses a bridge).                      Depending upon the importance of the traffic being routed different risk characteristics will be evaluated.")
  @JsonProperty("risk-characteristic-name")
  public String getRiskCharacteristicName() {
    return riskCharacteristicName;
  }

  public void setRiskCharacteristicName(String riskCharacteristicName) {
    this.riskCharacteristicName = riskCharacteristicName;
  }

  public RiskCharacteristic riskIdentifierList(List<String> riskIdentifierList) {
    this.riskIdentifierList = riskIdentifierList;
    return this;
  }

  public RiskCharacteristic addRiskIdentifierListItem(String riskIdentifierListItem) {
    this.riskIdentifierList.add(riskIdentifierListItem);
    return this;
  }

   /**
   * A list of the identifiers of each physical/geographic unit (with the specific risk characteristic) that is related to a segment of the TopologicalEntity.
   * @return riskIdentifierList
  **/
  @ApiModelProperty(value = "A list of the identifiers of each physical/geographic unit (with the specific risk characteristic) that is related to a segment of the TopologicalEntity.")
  @JsonProperty("risk-identifier-list")
  public List<String> getRiskIdentifierList() {
    return riskIdentifierList;
  }

  public void setRiskIdentifierList(List<String> riskIdentifierList) {
    this.riskIdentifierList = riskIdentifierList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCharacteristic tapiTopologyRiskCharacteristic = (RiskCharacteristic) o;
    return Objects.equals(this.riskCharacteristicName, tapiTopologyRiskCharacteristic.riskCharacteristicName) &&
        Objects.equals(this.riskIdentifierList, tapiTopologyRiskCharacteristic.riskIdentifierList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskCharacteristicName, riskIdentifierList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCharacteristic {\n");
    
    sb.append("    riskCharacteristicName: ").append(toIndentedString(riskCharacteristicName)).append("\n");
    sb.append("    riskIdentifierList: ").append(toIndentedString(riskIdentifierList)).append("\n");
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

