package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.connectivity.ProtectionRole
 */
public enum ProtectionRole {
  
  WORK("WORK"),
  
  PROTECT("PROTECT"),
  
  PROTECTED("PROTECTED"),
  
  NA("NA"),
  
  WORK_RESTORE("WORK_RESTORE"),
  
  PROTECT_RESTORE("PROTECT_RESTORE");

  private String value;

  ProtectionRole(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


