package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.CapacityUnit
 */
public enum CapacityUnit {
  
  TB("TB"),
  
  TBPS("TBPS"),
  
  GB("GB"),
  
  GBPS("GBPS"),
  
  MB("MB"),
  
  MBPS("MBPS"),
  
  KB("KB"),
  
  KBPS("KBPS"),
  
  GHZ("GHz"),
  
  MHZ("MHz");

  private String value;

  CapacityUnit(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


