package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.connectivity.CoordinateType;
import com.amartus.yang.sdwan.model.tapi.connectivity.ReversionMode;
import com.amartus.yang.sdwan.model.tapi.topology.ResilienceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ResilienceConstraint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ResilienceConstraint   {
  private Boolean isLockOut = false;

  private Integer maxSwitchTimes = null;

  private CoordinateType restorationCoordinateType = null;

  private Boolean isCoordinatedSwitchingBothEnds = false;

  private Integer holdOffTime = null;

  private Boolean isFrozen = false;

  private Integer waitToRevertTime = 15;

  private ResilienceType resilienceType = null;

  private List<LayerProtocolName> preferredRestorationLayer = new ArrayList<LayerProtocolName>();

  private Integer restorePriority = null;

  private ReversionMode reversionMode = null;

  public ResilienceConstraint isLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
    return this;
  }

   /**
   * The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                      This overrides all other protection control states including forced.                      If the item is locked out then it cannot be used under any circumstances.                      Note: Only relevant when part of a protection scheme.
   * @return isLockOut
  **/
  @ApiModelProperty(value = "The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                      This overrides all other protection control states including forced.                      If the item is locked out then it cannot be used under any circumstances.                      Note: Only relevant when part of a protection scheme.")
  @JsonProperty("is-lock-out")
  public Boolean getIsLockOut() {
    return isLockOut;
  }

  public void setIsLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
  }

  public ResilienceConstraint maxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
    return this;
  }

   /**
   * Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.
   * @return maxSwitchTimes
  **/
  @ApiModelProperty(value = "Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.")
  @JsonProperty("max-switch-times")
  public Integer getMaxSwitchTimes() {
    return maxSwitchTimes;
  }

  public void setMaxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
  }

  public ResilienceConstraint restorationCoordinateType(CoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
    return this;
  }

   /**
   *  The coordination mechanism between multi-layers.
   * @return restorationCoordinateType
  **/
  @ApiModelProperty(value = " The coordination mechanism between multi-layers.")
  @JsonProperty("restoration-coordinate-type")
  public CoordinateType getRestorationCoordinateType() {
    return restorationCoordinateType;
  }

  public void setRestorationCoordinateType(CoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
  }

  public ResilienceConstraint isCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
    return this;
  }

   /**
   * Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.
   * @return isCoordinatedSwitchingBothEnds
  **/
  @ApiModelProperty(value = "Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.")
  @JsonProperty("is-coordinated-switching-both-ends")
  public Boolean getIsCoordinatedSwitchingBothEnds() {
    return isCoordinatedSwitchingBothEnds;
  }

  public void setIsCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
  }

  public ResilienceConstraint holdOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
    return this;
  }

   /**
   * This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.
   * @return holdOffTime
  **/
  @ApiModelProperty(value = "This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.")
  @JsonProperty("hold-off-time")
  public Integer getHoldOffTime() {
    return holdOffTime;
  }

  public void setHoldOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
  }

  public ResilienceConstraint isFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
    return this;
  }

   /**
   * Temporarily prevents any switch action to be taken and, as such, freezes the current state.                       Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                      All administrative controls of any aspect of protection are rejected.
   * @return isFrozen
  **/
  @ApiModelProperty(value = "Temporarily prevents any switch action to be taken and, as such, freezes the current state.                       Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                      All administrative controls of any aspect of protection are rejected.")
  @JsonProperty("is-frozen")
  public Boolean getIsFrozen() {
    return isFrozen;
  }

  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  public ResilienceConstraint waitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
    return this;
  }

   /**
   * If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.
   * @return waitToRevertTime
  **/
  @ApiModelProperty(value = "If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.")
  @JsonProperty("wait-to-revert-time")
  public Integer getWaitToRevertTime() {
    return waitToRevertTime;
  }

  public void setWaitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
  }

  public ResilienceConstraint resilienceType(ResilienceType resilienceType) {
    this.resilienceType = resilienceType;
    return this;
  }

   /**
   * none
   * @return resilienceType
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("resilience-type")
  public ResilienceType getResilienceType() {
    return resilienceType;
  }

  public void setResilienceType(ResilienceType resilienceType) {
    this.resilienceType = resilienceType;
  }

  public ResilienceConstraint preferredRestorationLayer(List<LayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
    return this;
  }

  public ResilienceConstraint addPreferredRestorationLayerItem(LayerProtocolName preferredRestorationLayerItem) {
    this.preferredRestorationLayer.add(preferredRestorationLayerItem);
    return this;
  }

   /**
   * Indicate which layer this resilience parameters package configured for.
   * @return preferredRestorationLayer
  **/
  @ApiModelProperty(value = "Indicate which layer this resilience parameters package configured for.")
  @JsonProperty("preferred-restoration-layer")
  public List<LayerProtocolName> getPreferredRestorationLayer() {
    return preferredRestorationLayer;
  }

  public void setPreferredRestorationLayer(List<LayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
  }

  public ResilienceConstraint restorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
    return this;
  }

   /**
   * none
   * @return restorePriority
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("restore-priority")
  public Integer getRestorePriority() {
    return restorePriority;
  }

  public void setRestorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
  }

  public ResilienceConstraint reversionMode(ReversionMode reversionMode) {
    this.reversionMode = reversionMode;
    return this;
  }

   /**
   * Indcates whether the protection scheme is revertive or non-revertive.
   * @return reversionMode
  **/
  @ApiModelProperty(value = "Indcates whether the protection scheme is revertive or non-revertive.")
  @JsonProperty("reversion-mode")
  public ReversionMode getReversionMode() {
    return reversionMode;
  }

  public void setReversionMode(ReversionMode reversionMode) {
    this.reversionMode = reversionMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResilienceConstraint tapiConnectivityResilienceConstraint = (ResilienceConstraint) o;
    return Objects.equals(this.isLockOut, tapiConnectivityResilienceConstraint.isLockOut) &&
        Objects.equals(this.maxSwitchTimes, tapiConnectivityResilienceConstraint.maxSwitchTimes) &&
        Objects.equals(this.restorationCoordinateType, tapiConnectivityResilienceConstraint.restorationCoordinateType) &&
        Objects.equals(this.isCoordinatedSwitchingBothEnds, tapiConnectivityResilienceConstraint.isCoordinatedSwitchingBothEnds) &&
        Objects.equals(this.holdOffTime, tapiConnectivityResilienceConstraint.holdOffTime) &&
        Objects.equals(this.isFrozen, tapiConnectivityResilienceConstraint.isFrozen) &&
        Objects.equals(this.waitToRevertTime, tapiConnectivityResilienceConstraint.waitToRevertTime) &&
        Objects.equals(this.resilienceType, tapiConnectivityResilienceConstraint.resilienceType) &&
        Objects.equals(this.preferredRestorationLayer, tapiConnectivityResilienceConstraint.preferredRestorationLayer) &&
        Objects.equals(this.restorePriority, tapiConnectivityResilienceConstraint.restorePriority) &&
        Objects.equals(this.reversionMode, tapiConnectivityResilienceConstraint.reversionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLockOut, maxSwitchTimes, restorationCoordinateType, isCoordinatedSwitchingBothEnds, holdOffTime, isFrozen, waitToRevertTime, resilienceType, preferredRestorationLayer, restorePriority, reversionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResilienceConstraint {\n");
    
    sb.append("    isLockOut: ").append(toIndentedString(isLockOut)).append("\n");
    sb.append("    maxSwitchTimes: ").append(toIndentedString(maxSwitchTimes)).append("\n");
    sb.append("    restorationCoordinateType: ").append(toIndentedString(restorationCoordinateType)).append("\n");
    sb.append("    isCoordinatedSwitchingBothEnds: ").append(toIndentedString(isCoordinatedSwitchingBothEnds)).append("\n");
    sb.append("    holdOffTime: ").append(toIndentedString(holdOffTime)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    waitToRevertTime: ").append(toIndentedString(waitToRevertTime)).append("\n");
    sb.append("    resilienceType: ").append(toIndentedString(resilienceType)).append("\n");
    sb.append("    preferredRestorationLayer: ").append(toIndentedString(preferredRestorationLayer)).append("\n");
    sb.append("    restorePriority: ").append(toIndentedString(restorePriority)).append("\n");
    sb.append("    reversionMode: ").append(toIndentedString(reversionMode)).append("\n");
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

