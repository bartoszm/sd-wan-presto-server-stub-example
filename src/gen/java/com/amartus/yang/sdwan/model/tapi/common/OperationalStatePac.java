package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * OperationalStatePac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class OperationalStatePac   {
  private OperationalState operationalState = null;

  private LifecycleState lifecycleState = null;

  public OperationalStatePac operationalState(OperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

   /**
   * none
   * @return operationalState
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("operational-state")
  public OperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(OperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public OperationalStatePac lifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

   /**
   * none
   * @return lifecycleState
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("lifecycle-state")
  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalStatePac tapiCommonOperationalStatePac = (OperationalStatePac) o;
    return Objects.equals(this.operationalState, tapiCommonOperationalStatePac.operationalState) &&
        Objects.equals(this.lifecycleState, tapiCommonOperationalStatePac.lifecycleState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalState, lifecycleState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalStatePac {\n");
    
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
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

