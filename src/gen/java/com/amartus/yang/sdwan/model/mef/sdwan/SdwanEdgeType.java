package com.amartus.yang.sdwan.model.mef.sdwan;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets mef.sdwan.SdwanEdgeType
 */
public enum SdwanEdgeType {
  
  PHYSICAL("physical"),
  
  VIRTUAL("virtual");

  private String value;

  SdwanEdgeType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


