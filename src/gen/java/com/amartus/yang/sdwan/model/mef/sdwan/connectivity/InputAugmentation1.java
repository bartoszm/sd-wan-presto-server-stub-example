package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.SwvcServiceAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * InputAugmentation1
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class InputAugmentation1   {
  private SwvcServiceAttributes swvcServiceAttributes = null;

  public InputAugmentation1 swvcServiceAttributes(SwvcServiceAttributes swvcServiceAttributes) {
    this.swvcServiceAttributes = swvcServiceAttributes;
    return this;
  }

   /**
   * Get swvcServiceAttributes
   * @return swvcServiceAttributes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("swvc-service-attributes")
  public SwvcServiceAttributes getSwvcServiceAttributes() {
    return swvcServiceAttributes;
  }

  public void setSwvcServiceAttributes(SwvcServiceAttributes swvcServiceAttributes) {
    this.swvcServiceAttributes = swvcServiceAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputAugmentation1 mefSdwanConnectivityInputAugmentation1 = (InputAugmentation1) o;
    return Objects.equals(this.swvcServiceAttributes, mefSdwanConnectivityInputAugmentation1.swvcServiceAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swvcServiceAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputAugmentation1 {\n");
    
    sb.append("    swvcServiceAttributes: ").append(toIndentedString(swvcServiceAttributes)).append("\n");
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

