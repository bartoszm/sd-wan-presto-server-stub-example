package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * AdminStatePac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class AdminStatePac   {
  private OperationalState operationalState = null;

  private LifecycleState lifecycleState = null;

  private AdministrativeState administrativeState = null;

  public AdminStatePac operationalState(OperationalState operationalState) {
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

  public AdminStatePac lifecycleState(LifecycleState lifecycleState) {
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

  public AdminStatePac administrativeState(AdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

   /**
   * none
   * @return administrativeState
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("administrative-state")
  public AdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(AdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminStatePac tapiCommonAdminStatePac = (AdminStatePac) o;
    return Objects.equals(this.operationalState, tapiCommonAdminStatePac.operationalState) &&
        Objects.equals(this.lifecycleState, tapiCommonAdminStatePac.lifecycleState) &&
        Objects.equals(this.administrativeState, tapiCommonAdminStatePac.administrativeState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalState, lifecycleState, administrativeState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminStatePac {\n");
    
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
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

