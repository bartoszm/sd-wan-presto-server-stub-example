package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.topology.RestorationPolicy
 */
public enum RestorationPolicy {
  
  PER_DOMAIN_RESTORATION("PER_DOMAIN_RESTORATION"),
  
  END_TO_END_RESTORATION("END_TO_END_RESTORATION"),
  
  NA("NA");

  private String value;

  RestorationPolicy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


