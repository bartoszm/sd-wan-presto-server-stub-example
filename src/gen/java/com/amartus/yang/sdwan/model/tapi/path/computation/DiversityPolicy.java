package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.path.computation.DiversityPolicy
 */
public enum DiversityPolicy {
  
  SRLG("SRLG"),
  
  SRNG("SRNG"),
  
  SNG("SNG"),
  
  NODE("NODE"),
  
  LINK("LINK");

  private String value;

  DiversityPolicy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


