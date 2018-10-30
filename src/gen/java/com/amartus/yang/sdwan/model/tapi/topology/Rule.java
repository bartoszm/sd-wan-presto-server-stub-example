package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.LocalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.topology.ForwardingRule;
import com.amartus.yang.sdwan.model.tapi.topology.RuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Rule
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Rule extends com.amartus.yang.sdwan.model.tapi.common.LocalClass  {
  private Integer overridePriority = null;

  private ForwardingRule forwardingRule = null;

  private RuleType ruleType = null;

  public Rule overridePriority(Integer overridePriority) {
    this.overridePriority = overridePriority;
    return this;
  }

   /**
   * none
   * @return overridePriority
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("override-priority")
  public Integer getOverridePriority() {
    return overridePriority;
  }

  public void setOverridePriority(Integer overridePriority) {
    this.overridePriority = overridePriority;
  }

  public Rule forwardingRule(ForwardingRule forwardingRule) {
    this.forwardingRule = forwardingRule;
    return this;
  }

   /**
   * none
   * @return forwardingRule
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("forwarding-rule")
  public ForwardingRule getForwardingRule() {
    return forwardingRule;
  }

  public void setForwardingRule(ForwardingRule forwardingRule) {
    this.forwardingRule = forwardingRule;
  }

  public Rule ruleType(RuleType ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * none
   * @return ruleType
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("rule-type")
  public RuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(RuleType ruleType) {
    this.ruleType = ruleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule tapiTopologyRule = (Rule) o;
    return Objects.equals(this.overridePriority, tapiTopologyRule.overridePriority) &&
        Objects.equals(this.forwardingRule, tapiTopologyRule.forwardingRule) &&
        Objects.equals(this.ruleType, tapiTopologyRule.ruleType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overridePriority, forwardingRule, ruleType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    overridePriority: ").append(toIndentedString(overridePriority)).append("\n");
    sb.append("    forwardingRule: ").append(toIndentedString(forwardingRule)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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

