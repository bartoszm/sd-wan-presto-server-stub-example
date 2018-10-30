package com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.connectivity.updateconnectivityservice.Input;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * InputWrapper
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class InputWrapper   {
  private Input input = null;

  public InputWrapper input(Input input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("input")
  public Input getInput() {
    return input;
  }

  public void setInput(Input input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputWrapper tapiConnectivityUpdateconnectivityserviceInputWrapper = (InputWrapper) o;
    return Objects.equals(this.input, tapiConnectivityUpdateconnectivityserviceInputWrapper.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputWrapper {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

