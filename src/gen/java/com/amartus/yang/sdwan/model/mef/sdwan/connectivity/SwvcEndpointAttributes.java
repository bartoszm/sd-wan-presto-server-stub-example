package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.PolicyOverrides;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * SwvcEndpointAttributes
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class SwvcEndpointAttributes   {
  private String endpointUni = null;

  private String endpointIdentifier = null;

  private PolicyOverrides policyOverrides = null;

  public SwvcEndpointAttributes endpointUni(String endpointUni) {
    this.endpointUni = endpointUni;
    return this;
  }

   /**
   * Get endpointUni
   * @return endpointUni
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("endpoint-uni")
  public String getEndpointUni() {
    return endpointUni;
  }

  public void setEndpointUni(String endpointUni) {
    this.endpointUni = endpointUni;
  }

  public SwvcEndpointAttributes endpointIdentifier(String endpointIdentifier) {
    this.endpointIdentifier = endpointIdentifier;
    return this;
  }

   /**
   * Get endpointIdentifier
   * @return endpointIdentifier
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("endpoint-identifier")
  public String getEndpointIdentifier() {
    return endpointIdentifier;
  }

  public void setEndpointIdentifier(String endpointIdentifier) {
    this.endpointIdentifier = endpointIdentifier;
  }

  public SwvcEndpointAttributes policyOverrides(PolicyOverrides policyOverrides) {
    this.policyOverrides = policyOverrides;
    return this;
  }

   /**
   * Get policyOverrides
   * @return policyOverrides
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("policy-overrides")
  public PolicyOverrides getPolicyOverrides() {
    return policyOverrides;
  }

  public void setPolicyOverrides(PolicyOverrides policyOverrides) {
    this.policyOverrides = policyOverrides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwvcEndpointAttributes mefSdwanConnectivitySwvcEndpointAttributes = (SwvcEndpointAttributes) o;
    return Objects.equals(this.endpointUni, mefSdwanConnectivitySwvcEndpointAttributes.endpointUni) &&
        Objects.equals(this.endpointIdentifier, mefSdwanConnectivitySwvcEndpointAttributes.endpointIdentifier) &&
        Objects.equals(this.policyOverrides, mefSdwanConnectivitySwvcEndpointAttributes.policyOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUni, endpointIdentifier, policyOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwvcEndpointAttributes {\n");
    
    sb.append("    endpointUni: ").append(toIndentedString(endpointUni)).append("\n");
    sb.append("    endpointIdentifier: ").append(toIndentedString(endpointIdentifier)).append("\n");
    sb.append("    policyOverrides: ").append(toIndentedString(policyOverrides)).append("\n");
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

