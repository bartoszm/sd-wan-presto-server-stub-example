package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.LocalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.PortDirection;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionEndPointRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.RouteRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.SelectionControl;
import com.amartus.yang.sdwan.model.tapi.connectivity.SelectionReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Switch
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Switch extends com.amartus.yang.sdwan.model.tapi.common.LocalClass  {
  private List<ConnectionEndPointRef> selectedConnectionEndPoint = new ArrayList<ConnectionEndPointRef>();

  private List<RouteRef> selectedRoute = new ArrayList<RouteRef>();

  private SelectionControl selectionControl = null;

  private SelectionReason selectionReason = null;

  private PortDirection switchDirection = null;

  public Switch selectedConnectionEndPoint(List<ConnectionEndPointRef> selectedConnectionEndPoint) {
    this.selectedConnectionEndPoint = selectedConnectionEndPoint;
    return this;
  }

  public Switch addSelectedConnectionEndPointItem(ConnectionEndPointRef selectedConnectionEndPointItem) {
    this.selectedConnectionEndPoint.add(selectedConnectionEndPointItem);
    return this;
  }

   /**
   * none
   * @return selectedConnectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("selected-connection-end-point")
  public List<ConnectionEndPointRef> getSelectedConnectionEndPoint() {
    return selectedConnectionEndPoint;
  }

  public void setSelectedConnectionEndPoint(List<ConnectionEndPointRef> selectedConnectionEndPoint) {
    this.selectedConnectionEndPoint = selectedConnectionEndPoint;
  }

  public Switch selectedRoute(List<RouteRef> selectedRoute) {
    this.selectedRoute = selectedRoute;
    return this;
  }

  public Switch addSelectedRouteItem(RouteRef selectedRouteItem) {
    this.selectedRoute.add(selectedRouteItem);
    return this;
  }

   /**
   * none
   * @return selectedRoute
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("selected-route")
  public List<RouteRef> getSelectedRoute() {
    return selectedRoute;
  }

  public void setSelectedRoute(List<RouteRef> selectedRoute) {
    this.selectedRoute = selectedRoute;
  }

  public Switch selectionControl(SelectionControl selectionControl) {
    this.selectionControl = selectionControl;
    return this;
  }

   /**
   * Degree of administrative control applied to the switch selection.
   * @return selectionControl
  **/
  @ApiModelProperty(value = "Degree of administrative control applied to the switch selection.")
  @JsonProperty("selection-control")
  public SelectionControl getSelectionControl() {
    return selectionControl;
  }

  public void setSelectionControl(SelectionControl selectionControl) {
    this.selectionControl = selectionControl;
  }

  public Switch selectionReason(SelectionReason selectionReason) {
    this.selectionReason = selectionReason;
    return this;
  }

   /**
   * The reason for the current switch selection.
   * @return selectionReason
  **/
  @ApiModelProperty(value = "The reason for the current switch selection.")
  @JsonProperty("selection-reason")
  public SelectionReason getSelectionReason() {
    return selectionReason;
  }

  public void setSelectionReason(SelectionReason selectionReason) {
    this.selectionReason = selectionReason;
  }

  public Switch switchDirection(PortDirection switchDirection) {
    this.switchDirection = switchDirection;
    return this;
  }

   /**
   * Indicates whether the switch selects from ingress to the FC or to egress of the FC, or both.
   * @return switchDirection
  **/
  @ApiModelProperty(value = "Indicates whether the switch selects from ingress to the FC or to egress of the FC, or both.")
  @JsonProperty("switch-direction")
  public PortDirection getSwitchDirection() {
    return switchDirection;
  }

  public void setSwitchDirection(PortDirection switchDirection) {
    this.switchDirection = switchDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Switch tapiConnectivitySwitch = (Switch) o;
    return Objects.equals(this.selectedConnectionEndPoint, tapiConnectivitySwitch.selectedConnectionEndPoint) &&
        Objects.equals(this.selectedRoute, tapiConnectivitySwitch.selectedRoute) &&
        Objects.equals(this.selectionControl, tapiConnectivitySwitch.selectionControl) &&
        Objects.equals(this.selectionReason, tapiConnectivitySwitch.selectionReason) &&
        Objects.equals(this.switchDirection, tapiConnectivitySwitch.switchDirection) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedConnectionEndPoint, selectedRoute, selectionControl, selectionReason, switchDirection, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Switch {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    selectedConnectionEndPoint: ").append(toIndentedString(selectedConnectionEndPoint)).append("\n");
    sb.append("    selectedRoute: ").append(toIndentedString(selectedRoute)).append("\n");
    sb.append("    selectionControl: ").append(toIndentedString(selectionControl)).append("\n");
    sb.append("    selectionReason: ").append(toIndentedString(selectionReason)).append("\n");
    sb.append("    switchDirection: ").append(toIndentedString(switchDirection)).append("\n");
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

