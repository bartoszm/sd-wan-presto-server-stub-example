package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.common.LayerProtocolName
 */
public enum LayerProtocolName {
  
  ODU("ODU"),
  
  ETH("ETH"),
  
  DSR("DSR"),
  
  PHOTONIC_MEDIA("PHOTONIC_MEDIA");

  private String value;

  LayerProtocolName(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


