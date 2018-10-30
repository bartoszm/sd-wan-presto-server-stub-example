package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Criteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Policy
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Policy   {
  private String policyId = null;

  private List<Criteria> criteria = new ArrayList<Criteria>();

  public Policy policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("policy-id")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public Policy criteria(List<Criteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Policy addCriteriaItem(Criteria criteriaItem) {
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("criteria")
  public List<Criteria> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criteria> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy mefSdwanConnectivityPolicy = (Policy) o;
    return Objects.equals(this.policyId, mefSdwanConnectivityPolicy.policyId) &&
        Objects.equals(this.criteria, mefSdwanConnectivityPolicy.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

