package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.topology.ForwardingRule
 */
public enum ForwardingRule {
  
  MAY_FORWARD_ACROSS_GROUP("MAY_FORWARD_ACROSS_GROUP"),
  
  MUST_FORWARD_ACROSS_GROUP("MUST_FORWARD_ACROSS_GROUP"),
  
  CANNOT_FORWARD_ACROSS_GROUP("CANNOT_FORWARD_ACROSS_GROUP"),
  
  NO_STATEMENT_ON_FORWARDING("NO_STATEMENT_ON_FORWARDING");

  private String value;

  ForwardingRule(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


