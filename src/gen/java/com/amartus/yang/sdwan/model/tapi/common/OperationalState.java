package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.OperationalState
 */
public enum OperationalState {
  
  DISABLED("DISABLED"),
  
  ENABLED("ENABLED");

  private String value;

  OperationalState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


