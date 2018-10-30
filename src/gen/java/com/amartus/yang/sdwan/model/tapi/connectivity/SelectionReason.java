package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.connectivity.SelectionReason
 */
public enum SelectionReason {
  
  LOCKOUT("LOCKOUT"),
  
  NORMAL("NORMAL"),
  
  MANUAL("MANUAL"),
  
  FORCED("FORCED"),
  
  WAIT_TO_REVERT("WAIT_TO_REVERT"),
  
  SIGNAL_DEGRADE("SIGNAL_DEGRADE"),
  
  SIGNAL_FAIL("SIGNAL_FAIL");

  private String value;

  SelectionReason(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


