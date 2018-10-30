package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.TerminationState
 */
public enum TerminationState {
  
  LP_CAN_NEVER_TERMINATE("LP_CAN_NEVER_TERMINATE"),
  
  LT_NOT_TERMINATED("LT_NOT_TERMINATED"),
  
  TERMINATED_SERVER_TO_CLIENT_FLOW("TERMINATED_SERVER_TO_CLIENT_FLOW"),
  
  TERMINATED_CLIENT_TO_SERVER_FLOW("TERMINATED_CLIENT_TO_SERVER_FLOW"),
  
  TERMINATED_BIDIRECTIONAL("TERMINATED_BIDIRECTIONAL"),
  
  LT_PERMENANTLY_TERMINATED("LT_PERMENANTLY_TERMINATED"),
  
  TERMINATION_STATE_UNKNOWN("TERMINATION_STATE_UNKNOWN");

  private String value;

  TerminationState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


