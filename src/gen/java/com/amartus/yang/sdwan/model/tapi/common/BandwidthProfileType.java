package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.BandwidthProfileType
 */
public enum BandwidthProfileType {
  
  MEF_10_X("MEF_10.x"),
  
  RFC_2697("RFC_2697"),
  
  RFC_2698("RFC_2698"),
  
  RFC_4115("RFC_4115");

  private String value;

  BandwidthProfileType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


