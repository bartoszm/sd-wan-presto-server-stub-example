package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.PortRole
 */
public enum PortRole {
  
  SYMMETRIC("SYMMETRIC"),
  
  ROOT("ROOT"),
  
  LEAF("LEAF"),
  
  TRUNK("TRUNK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PortRole(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


