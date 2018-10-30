package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ValidationMechanism
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ValidationMechanism   {
  private String layerProtocolAdjacencyValidated = null;

  private String validationMechanism = null;

  private String validationRobustness = null;

  public ValidationMechanism layerProtocolAdjacencyValidated(String layerProtocolAdjacencyValidated) {
    this.layerProtocolAdjacencyValidated = layerProtocolAdjacencyValidated;
    return this;
  }

   /**
   * State of validatiion
   * @return layerProtocolAdjacencyValidated
  **/
  @ApiModelProperty(value = "State of validatiion")
  @JsonProperty("layer-protocol-adjacency-validated")
  public String getLayerProtocolAdjacencyValidated() {
    return layerProtocolAdjacencyValidated;
  }

  public void setLayerProtocolAdjacencyValidated(String layerProtocolAdjacencyValidated) {
    this.layerProtocolAdjacencyValidated = layerProtocolAdjacencyValidated;
  }

  public ValidationMechanism validationMechanism(String validationMechanism) {
    this.validationMechanism = validationMechanism;
    return this;
  }

   /**
   * Name of mechanism used to validate adjacency
   * @return validationMechanism
  **/
  @ApiModelProperty(value = "Name of mechanism used to validate adjacency")
  @JsonProperty("validation-mechanism")
  public String getValidationMechanism() {
    return validationMechanism;
  }

  public void setValidationMechanism(String validationMechanism) {
    this.validationMechanism = validationMechanism;
  }

  public ValidationMechanism validationRobustness(String validationRobustness) {
    this.validationRobustness = validationRobustness;
    return this;
  }

   /**
   * Quality of validation (i.e. how likely is the stated validation to be invalid)
   * @return validationRobustness
  **/
  @ApiModelProperty(value = "Quality of validation (i.e. how likely is the stated validation to be invalid)")
  @JsonProperty("validation-robustness")
  public String getValidationRobustness() {
    return validationRobustness;
  }

  public void setValidationRobustness(String validationRobustness) {
    this.validationRobustness = validationRobustness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationMechanism tapiTopologyValidationMechanism = (ValidationMechanism) o;
    return Objects.equals(this.layerProtocolAdjacencyValidated, tapiTopologyValidationMechanism.layerProtocolAdjacencyValidated) &&
        Objects.equals(this.validationMechanism, tapiTopologyValidationMechanism.validationMechanism) &&
        Objects.equals(this.validationRobustness, tapiTopologyValidationMechanism.validationRobustness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerProtocolAdjacencyValidated, validationMechanism, validationRobustness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationMechanism {\n");
    
    sb.append("    layerProtocolAdjacencyValidated: ").append(toIndentedString(layerProtocolAdjacencyValidated)).append("\n");
    sb.append("    validationMechanism: ").append(toIndentedString(validationMechanism)).append("\n");
    sb.append("    validationRobustness: ").append(toIndentedString(validationRobustness)).append("\n");
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

