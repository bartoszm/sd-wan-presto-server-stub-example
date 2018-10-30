package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.PortDirection
 */
public enum PortDirection {
  
  BIDIRECTIONAL("BIDIRECTIONAL"),
  
  INPUT("INPUT"),
  
  OUTPUT("OUTPUT"),
  
  UNIDENTIFIED_OR_UNKNOWN("UNIDENTIFIED_OR_UNKNOWN");

  private String value;

  PortDirection(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


