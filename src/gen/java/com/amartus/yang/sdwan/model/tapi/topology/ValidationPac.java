package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.ValidationMechanism;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ValidationPac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ValidationPac   {
  private List<ValidationMechanism> validationMechanism = new ArrayList<ValidationMechanism>();

  public ValidationPac validationMechanism(List<ValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
    return this;
  }

  public ValidationPac addValidationMechanismItem(ValidationMechanism validationMechanismItem) {
    this.validationMechanism.add(validationMechanismItem);
    return this;
  }

   /**
   * Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.
   * @return validationMechanism
  **/
  @ApiModelProperty(value = "Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.")
  @JsonProperty("validation-mechanism")
  public List<ValidationMechanism> getValidationMechanism() {
    return validationMechanism;
  }

  public void setValidationMechanism(List<ValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationPac tapiTopologyValidationPac = (ValidationPac) o;
    return Objects.equals(this.validationMechanism, tapiTopologyValidationPac.validationMechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationMechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationPac {\n");
    
    sb.append("    validationMechanism: ").append(toIndentedString(validationMechanism)).append("\n");
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

