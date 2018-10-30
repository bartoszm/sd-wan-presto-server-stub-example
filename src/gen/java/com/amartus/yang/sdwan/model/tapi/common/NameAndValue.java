package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NameAndValue
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class NameAndValue   {
  private String valueName = null;

  private String value = null;

  public NameAndValue() {}
  public NameAndValue(String name, String value) {
    this.valueName(name).value(value);
  }

  public NameAndValue valueName(String valueName) {
    this.valueName = valueName;
    return this;
  }

   /**
   * The name of the value. The value need not have a name.
   * @return valueName
  **/
  @ApiModelProperty(value = "The name of the value. The value need not have a name.")
  @JsonProperty("value-name")
  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }

  public NameAndValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value
   * @return value
  **/
  @ApiModelProperty(value = "The value")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameAndValue tapiCommonNameAndValue = (NameAndValue) o;
    return Objects.equals(this.valueName, tapiCommonNameAndValue.valueName) &&
        Objects.equals(this.value, tapiCommonNameAndValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameAndValue {\n");
    
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

