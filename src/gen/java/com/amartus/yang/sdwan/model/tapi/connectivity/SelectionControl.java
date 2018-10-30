package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.connectivity.SelectionControl
 */
public enum SelectionControl {
  
  LOCK_OUT("LOCK_OUT"),
  
  NORMAL("NORMAL"),
  
  MANUAL("MANUAL"),
  
  FORCED("FORCED");

  private String value;

  SelectionControl(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


