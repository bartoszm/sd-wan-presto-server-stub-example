package com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.connectivity.getconnectivityservicedetails.Output;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * OutputWrapper
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class OutputWrapper   {
  private Output output = null;

  public OutputWrapper output(Output output) {
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("output")
  public Output getOutput() {
    return output;
  }

  public void setOutput(Output output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputWrapper tapiConnectivityGetconnectivityservicedetailsOutputWrapper = (OutputWrapper) o;
    return Objects.equals(this.output, tapiConnectivityGetconnectivityservicedetailsOutputWrapper.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputWrapper {\n");
    
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

