package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.SwvcEndpointAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * EndPointAugmentation1
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class EndPointAugmentation1   {
  private SwvcEndpointAttributes swvcEndpointAttributes = null;

  public EndPointAugmentation1 swvcEndpointAttributes(SwvcEndpointAttributes swvcEndpointAttributes) {
    this.swvcEndpointAttributes = swvcEndpointAttributes;
    return this;
  }

   /**
   * Get swvcEndpointAttributes
   * @return swvcEndpointAttributes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("swvc-endpoint-attributes")
  public SwvcEndpointAttributes getSwvcEndpointAttributes() {
    return swvcEndpointAttributes;
  }

  public void setSwvcEndpointAttributes(SwvcEndpointAttributes swvcEndpointAttributes) {
    this.swvcEndpointAttributes = swvcEndpointAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndPointAugmentation1 mefSdwanConnectivityEndPointAugmentation1 = (EndPointAugmentation1) o;
    return Objects.equals(this.swvcEndpointAttributes, mefSdwanConnectivityEndPointAugmentation1.swvcEndpointAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swvcEndpointAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndPointAugmentation1 {\n");
    
    sb.append("    swvcEndpointAttributes: ").append(toIndentedString(swvcEndpointAttributes)).append("\n");
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

