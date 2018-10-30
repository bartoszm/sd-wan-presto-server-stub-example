package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.ForwardingDirection
 */
public enum ForwardingDirection {
  
  BIDIRECTIONAL("BIDIRECTIONAL"),
  
  UNIDIRECTIONAL("UNIDIRECTIONAL"),
  
  UNDEFINED_OR_UNKNOWN("UNDEFINED_OR_UNKNOWN");

  private String value;

  ForwardingDirection(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


