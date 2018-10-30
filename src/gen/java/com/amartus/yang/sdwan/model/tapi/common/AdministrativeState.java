package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.AdministrativeState
 */
public enum AdministrativeState {
  
  LOCKED("LOCKED"),
  
  UNLOCKED("UNLOCKED");

  private String value;

  AdministrativeState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


