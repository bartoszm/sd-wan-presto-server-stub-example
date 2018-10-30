package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.connectivity.CoordinateType
 */
public enum CoordinateType {
  
  NO_COORDINATE("NO_COORDINATE"),
  
  HOLD_OFF_TIME("HOLD_OFF_TIME"),
  
  WAIT_FOR_NOTIFICATION("WAIT_FOR_NOTIFICATION");

  private String value;

  CoordinateType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


