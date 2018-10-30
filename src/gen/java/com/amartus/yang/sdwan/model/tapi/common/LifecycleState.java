package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.LifecycleState
 */
public enum LifecycleState {
  
  PLANNED("PLANNED"),
  
  POTENTIAL_AVAILABLE("POTENTIAL_AVAILABLE"),
  
  POTENTIAL_BUSY("POTENTIAL_BUSY"),
  
  INSTALLED("INSTALLED"),
  
  PENDING_REMOVAL("PENDING_REMOVAL");

  private String value;

  LifecycleState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


