package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets tapi.path.computation.RouteObjectiveFunction
 */
public enum RouteObjectiveFunction {
  
  MIN_WORK_ROUTE_HOP("MIN_WORK_ROUTE_HOP"),
  
  MIN_WORK_ROUTE_COST("MIN_WORK_ROUTE_COST"),
  
  MIN_WORK_ROUTE_LATENCY("MIN_WORK_ROUTE_LATENCY"),
  
  MIN_SUM_OF_WORK_AND_PROTECTION_ROUTE_HOP("MIN_SUM_OF_WORK_AND_PROTECTION_ROUTE_HOP"),
  
  MIN_SUM_OF_WORK_AND_PROTECTION_ROUTE_COST("MIN_SUM_OF_WORK_AND_PROTECTION_ROUTE_COST"),
  
  MIN_SUM_OF_WORK_AND_PROTECTION_ROUTE_LATENCY("MIN_SUM_OF_WORK_AND_PROTECTION_ROUTE_LATENCY"),
  
  LOAD_BALANCE_MAX_UNUSED_CAPACITY("LOAD_BALANCE_MAX_UNUSED_CAPACITY");

  private String value;

  RouteObjectiveFunction(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}


