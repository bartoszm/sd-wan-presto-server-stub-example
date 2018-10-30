package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.connectivity.ServiceType
 */
public enum ServiceType {
  
  POINT_TO_POINT_CONNECTIVITY("POINT_TO_POINT_CONNECTIVITY"),
  
  POINT_TO_MULTIPOINT_CONNECTIVITY("POINT_TO_MULTIPOINT_CONNECTIVITY"),
  
  MULTIPOINT_CONNECTIVITY("MULTIPOINT_CONNECTIVITY"),
  
  ROOTED_MULTIPOINT_CONNECTIVITY("ROOTED_MULTIPOINT_CONNECTIVITY");

  private String value;

  ServiceType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


