package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.connectivity.ReversionMode
 */
public enum ReversionMode {
  
  REVERTIVE("REVERTIVE"),
  
  NON_REVERTIVE("NON-REVERTIVE");

  private String value;

  ReversionMode(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


