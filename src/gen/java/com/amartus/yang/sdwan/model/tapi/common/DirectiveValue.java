package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.DirectiveValue
 */
public enum DirectiveValue {
  
  MINIMIZE("MINIMIZE"),
  
  MAXIMIZE("MAXIMIZE"),
  
  ALLOW("ALLOW"),
  
  DISALLOW("DISALLOW"),
  
  DONT_CARE("DONT_CARE");

  private String value;

  DirectiveValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


