package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.topology.RuleType
 */
public enum RuleType {
  
  FORWARDING("FORWARDING"),
  
  CAPACITY("CAPACITY"),
  
  COST("COST"),
  
  TIMING("TIMING"),
  
  RISK("RISK"),
  
  GROUPING("GROUPING");

  private String value;

  RuleType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


