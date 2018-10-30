package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.topology.ProtectionType
 */
public enum ProtectionType {
  
  NO_PROTECTON("NO_PROTECTON"),
  
  ONE_PLUS_ONE_PROTECTION("ONE_PLUS_ONE_PROTECTION"),
  
  ONE_PLUS_ONE_PROTECTION_WITH_DYNAMIC_RESTORATION("ONE_PLUS_ONE_PROTECTION_WITH_DYNAMIC_RESTORATION"),
  
  PERMANENT_ONE_PLUS_ONE_PROTECTION("PERMANENT_ONE_PLUS_ONE_PROTECTION"),
  
  ONE_FOR_ONE_PROTECTION("ONE_FOR_ONE_PROTECTION"),
  
  DYNAMIC_RESTORATION("DYNAMIC_RESTORATION"),
  
  PRE_COMPUTED_RESTORATION("PRE_COMPUTED_RESTORATION");

  private String value;

  ProtectionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


