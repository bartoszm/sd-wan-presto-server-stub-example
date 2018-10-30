package com.amartus.yang.sdwan.model.mef.sdwan;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.SdwanUni;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * SipAugmentation1
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class SipAugmentation1   {
  private SdwanUni sdwanUni = null;

  public SipAugmentation1 sdwanUni(SdwanUni sdwanUni) {
    this.sdwanUni = sdwanUni;
    return this;
  }

   /**
   * Get sdwanUni
   * @return sdwanUni
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("sdwan-uni")
  public SdwanUni getSdwanUni() {
    return sdwanUni;
  }

  public void setSdwanUni(SdwanUni sdwanUni) {
    this.sdwanUni = sdwanUni;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipAugmentation1 mefSdwanSipAugmentation1 = (SipAugmentation1) o;
    return Objects.equals(this.sdwanUni, mefSdwanSipAugmentation1.sdwanUni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdwanUni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipAugmentation1 {\n");
    
    sb.append("    sdwanUni: ").append(toIndentedString(sdwanUni)).append("\n");
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

