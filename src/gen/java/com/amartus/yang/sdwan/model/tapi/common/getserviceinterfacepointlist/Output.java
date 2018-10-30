package com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.getserviceinterfacepointlist.output.Sip;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private List<Sip> sip = new ArrayList<Sip>();

  public Output sip(List<Sip> sip) {
    this.sip = sip;
    return this;
  }

  public Output addSipItem(Sip sipItem) {
    this.sip.add(sipItem);
    return this;
  }

   /**
   * none
   * @return sip
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("sip")
  public List<Sip> getSip() {
    return sip;
  }

  public void setSip(List<Sip> sip) {
    this.sip = sip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output tapiCommonGetserviceinterfacepointlistOutput = (Output) o;
    return Objects.equals(this.sip, tapiCommonGetserviceinterfacepointlistOutput.sip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
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

