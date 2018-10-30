package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.TerminationDirection
 */
public enum TerminationDirection {
  
  BIDIRECTIONAL("BIDIRECTIONAL"),
  
  SINK("SINK"),
  
  SOURCE("SOURCE"),
  
  UNDEFINED_OR_UNKNOWN("UNDEFINED_OR_UNKNOWN");

  private String value;

  TerminationDirection(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


