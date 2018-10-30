package com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.InputAugmentation1;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.SwvcServiceAttributes;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityConstraint;
import com.amartus.yang.sdwan.model.tapi.connectivity.ResilienceConstraint;
import com.amartus.yang.sdwan.model.tapi.connectivity.createconnectivityservice.input.EndPoint;
import com.amartus.yang.sdwan.model.tapi.path.computation.RoutingConstraint;
import com.amartus.yang.sdwan.model.tapi.path.computation.TopologyConstraint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Input
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Input extends com.amartus.yang.sdwan.model.mef.sdwan.connectivity.InputAugmentation1  {
  private TopologyConstraint topologyConstraint = null;

  private List<EndPoint> endPoint = new ArrayList<EndPoint>();

  private List<ResilienceConstraint> resilienceConstraint = new ArrayList<ResilienceConstraint>();

  private RoutingConstraint routingConstraint = null;

  private String state = null;

  private ConnectivityConstraint connectivityConstraint = null;

  public Input topologyConstraint(TopologyConstraint topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
    return this;
  }

   /**
   * none
   * @return topologyConstraint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("topology-constraint")
  public TopologyConstraint getTopologyConstraint() {
    return topologyConstraint;
  }

  public void setTopologyConstraint(TopologyConstraint topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
  }

  public Input endPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public Input addEndPointItem(EndPoint endPointItem) {
    this.endPoint.add(endPointItem);
    return this;
  }

   /**
   * none
   * @return endPoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("end-point")
  public List<EndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<EndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public Input resilienceConstraint(List<ResilienceConstraint> resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
    return this;
  }

  public Input addResilienceConstraintItem(ResilienceConstraint resilienceConstraintItem) {
    this.resilienceConstraint.add(resilienceConstraintItem);
    return this;
  }

   /**
   * none
   * @return resilienceConstraint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("resilience-constraint")
  public List<ResilienceConstraint> getResilienceConstraint() {
    return resilienceConstraint;
  }

  public void setResilienceConstraint(List<ResilienceConstraint> resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
  }

  public Input routingConstraint(RoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
    return this;
  }

   /**
   * none
   * @return routingConstraint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("routing-constraint")
  public RoutingConstraint getRoutingConstraint() {
    return routingConstraint;
  }

  public void setRoutingConstraint(RoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
  }

  public Input state(String state) {
    this.state = state;
    return this;
  }

   /**
   * none
   * @return state
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Input connectivityConstraint(ConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
    return this;
  }

   /**
   * none
   * @return connectivityConstraint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connectivity-constraint")
  public ConnectivityConstraint getConnectivityConstraint() {
    return connectivityConstraint;
  }

  public void setConnectivityConstraint(ConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiConnectivityCreateconnectivityserviceInput = (Input) o;
    return Objects.equals(this.topologyConstraint, tapiConnectivityCreateconnectivityserviceInput.topologyConstraint) &&
        Objects.equals(this.endPoint, tapiConnectivityCreateconnectivityserviceInput.endPoint) &&
        Objects.equals(this.resilienceConstraint, tapiConnectivityCreateconnectivityserviceInput.resilienceConstraint) &&
        Objects.equals(this.routingConstraint, tapiConnectivityCreateconnectivityserviceInput.routingConstraint) &&
        Objects.equals(this.state, tapiConnectivityCreateconnectivityserviceInput.state) &&
        Objects.equals(this.connectivityConstraint, tapiConnectivityCreateconnectivityserviceInput.connectivityConstraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyConstraint, endPoint, resilienceConstraint, routingConstraint, state, connectivityConstraint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    resilienceConstraint: ").append(toIndentedString(resilienceConstraint)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    connectivityConstraint: ").append(toIndentedString(connectivityConstraint)).append("\n");
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

