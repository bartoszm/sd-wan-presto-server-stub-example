package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ReservedPrefixes
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ReservedPrefixes   {
  private List<String> prefix = new ArrayList<String>();

  public ReservedPrefixes prefix(List<String> prefix) {
    this.prefix = prefix;
    return this;
  }

  public ReservedPrefixes addPrefixItem(String prefixItem) {
    this.prefix.add(prefixItem);
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("prefix")
  public List<String> getPrefix() {
    return prefix;
  }

  public void setPrefix(List<String> prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedPrefixes mefSdwanConnectivityReservedPrefixes = (ReservedPrefixes) o;
    return Objects.equals(this.prefix, mefSdwanConnectivityReservedPrefixes.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedPrefixes {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

