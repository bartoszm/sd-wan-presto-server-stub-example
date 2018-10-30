package com.amartus.yang.sdwan.model.mef.common.types;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets mef.common.types.OperationalState
 */
public enum OperationalState {
  
  ENABLED("ENABLED"),
  
  DISABLED("DISABLED");

  private String value;

  OperationalState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


