package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.ProtectionType;
import com.amartus.yang.sdwan.model.tapi.topology.RestorationPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ResilienceType
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ResilienceType   {
  private RestorationPolicy restorationPolicy = null;

  private ProtectionType protectionType = null;

  public ResilienceType restorationPolicy(RestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
    return this;
  }

   /**
   * none
   * @return restorationPolicy
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("restoration-policy")
  public RestorationPolicy getRestorationPolicy() {
    return restorationPolicy;
  }

  public void setRestorationPolicy(RestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
  }

  public ResilienceType protectionType(ProtectionType protectionType) {
    this.protectionType = protectionType;
    return this;
  }

   /**
   * none
   * @return protectionType
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("protection-type")
  public ProtectionType getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(ProtectionType protectionType) {
    this.protectionType = protectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResilienceType tapiTopologyResilienceType = (ResilienceType) o;
    return Objects.equals(this.restorationPolicy, tapiTopologyResilienceType.restorationPolicy) &&
        Objects.equals(this.protectionType, tapiTopologyResilienceType.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restorationPolicy, protectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResilienceType {\n");
    
    sb.append("    restorationPolicy: ").append(toIndentedString(restorationPolicy)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
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

