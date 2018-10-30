package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Criteria
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Criteria   {
  private List<String> pcParam = new ArrayList<String>();

  private String pcName = null;

  public Criteria pcParam(List<String> pcParam) {
    this.pcParam = pcParam;
    return this;
  }

  public Criteria addPcParamItem(String pcParamItem) {
    this.pcParam.add(pcParamItem);
    return this;
  }

   /**
   * Get pcParam
   * @return pcParam
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("pc-param")
  public List<String> getPcParam() {
    return pcParam;
  }

  public void setPcParam(List<String> pcParam) {
    this.pcParam = pcParam;
  }

  public Criteria pcName(String pcName) {
    this.pcName = pcName;
    return this;
  }

   /**
   * Get pcName
   * @return pcName
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("pc-name")
  public String getPcName() {
    return pcName;
  }

  public void setPcName(String pcName) {
    this.pcName = pcName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criteria mefSdwanConnectivityCriteria = (Criteria) o;
    return Objects.equals(this.pcParam, mefSdwanConnectivityCriteria.pcParam) &&
        Objects.equals(this.pcName, mefSdwanConnectivityCriteria.pcName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pcParam, pcName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criteria {\n");
    
    sb.append("    pcParam: ").append(toIndentedString(pcParam)).append("\n");
    sb.append("    pcName: ").append(toIndentedString(pcName)).append("\n");
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

