package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.PolicyOverride;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * PolicyOverrides
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PolicyOverrides   {
  private List<PolicyOverride> policyOverride = new ArrayList<PolicyOverride>();

  public PolicyOverrides policyOverride(List<PolicyOverride> policyOverride) {
    this.policyOverride = policyOverride;
    return this;
  }

  public PolicyOverrides addPolicyOverrideItem(PolicyOverride policyOverrideItem) {
    this.policyOverride.add(policyOverrideItem);
    return this;
  }

   /**
   * Get policyOverride
   * @return policyOverride
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("policy-override")
  public List<PolicyOverride> getPolicyOverride() {
    return policyOverride;
  }

  public void setPolicyOverride(List<PolicyOverride> policyOverride) {
    this.policyOverride = policyOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyOverrides mefSdwanConnectivityPolicyOverrides = (PolicyOverrides) o;
    return Objects.equals(this.policyOverride, mefSdwanConnectivityPolicyOverrides.policyOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyOverrides {\n");
    
    sb.append("    policyOverride: ").append(toIndentedString(policyOverride)).append("\n");
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

