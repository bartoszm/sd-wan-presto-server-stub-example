package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.CapacityUnit;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * CapacityValue
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class CapacityValue   {
  private Integer value = null;

  private CapacityUnit unit = null;

  public CapacityValue value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * none
   * @return value
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public CapacityValue unit(CapacityUnit unit) {
    this.unit = unit;
    return this;
  }

   /**
   * none
   * @return unit
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("unit")
  public CapacityUnit getUnit() {
    return unit;
  }

  public void setUnit(CapacityUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityValue tapiCommonCapacityValue = (CapacityValue) o;
    return Objects.equals(this.value, tapiCommonCapacityValue.value) &&
        Objects.equals(this.unit, tapiCommonCapacityValue.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

