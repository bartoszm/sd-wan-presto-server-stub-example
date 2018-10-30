package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Mapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ApplicationPolicyMappings
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ApplicationPolicyMappings   {
  private List<Mapping> mapping = new ArrayList<Mapping>();

  public ApplicationPolicyMappings mapping(List<Mapping> mapping) {
    this.mapping = mapping;
    return this;
  }

  public ApplicationPolicyMappings addMappingItem(Mapping mappingItem) {
    this.mapping.add(mappingItem);
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  public List<Mapping> getMapping() {
    return mapping;
  }

  public void setMapping(List<Mapping> mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationPolicyMappings mefSdwanConnectivityApplicationPolicyMappings = (ApplicationPolicyMappings) o;
    return Objects.equals(this.mapping, mefSdwanConnectivityApplicationPolicyMappings.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationPolicyMappings {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

