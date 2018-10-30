package com.amartus.yang.sdwan.model.mef.sdwan;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets mef.sdwan.SdwanL2Technology
 */
public enum SdwanL2Technology {
  
  _802_11("802_11"),
  
  _802_1AX("802_1ax"),
  
  P2P("p2p");

  private String value;

  SdwanL2Technology(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


