package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Policy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Policies
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Policies   {
  private List<Policy> policy = new ArrayList<Policy>();

  public Policies policy(List<Policy> policy) {
    this.policy = policy;
    return this;
  }

  public Policies addPolicyItem(Policy policyItem) {
    this.policy.add(policyItem);
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("policy")
  public List<Policy> getPolicy() {
    return policy;
  }

  public void setPolicy(List<Policy> policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policies mefSdwanConnectivityPolicies = (Policies) o;
    return Objects.equals(this.policy, mefSdwanConnectivityPolicies.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policies {\n");
    
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

