package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.ForwardingDirection;
import com.amartus.yang.sdwan.model.tapi.path.computation.DiversityPolicy;
import com.amartus.yang.sdwan.model.tapi.path.computation.RouteObjectiveFunction;
import com.amartus.yang.sdwan.model.tapi.topology.CostCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.LatencyCharacteristic;
import com.amartus.yang.sdwan.model.tapi.topology.RiskCharacteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * RoutingConstraint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class RoutingConstraint   {
  private Boolean isExclusive = true;

  private DiversityPolicy diversityPolicy = null;

  private RouteObjectiveFunction routeObjectiveFunction = null;

  private List<CostCharacteristic> costCharacteristic = new ArrayList<CostCharacteristic>();

  private List<LatencyCharacteristic> latencyCharacteristic = new ArrayList<LatencyCharacteristic>();

  private List<RiskCharacteristic> riskDiversityCharacteristic = new ArrayList<RiskCharacteristic>();

  private ForwardingDirection routeDirection = null;

  public RoutingConstraint isExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
    return this;
  }

   /**
   * To distinguish if the resources are to be exclusive to the service
   * @return isExclusive
  **/
  @ApiModelProperty(value = "To distinguish if the resources are to be exclusive to the service")
  @JsonProperty("is-exclusive")
  public Boolean getIsExclusive() {
    return isExclusive;
  }

  public void setIsExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
  }

  public RoutingConstraint diversityPolicy(DiversityPolicy diversityPolicy) {
    this.diversityPolicy = diversityPolicy;
    return this;
  }

   /**
   * none
   * @return diversityPolicy
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("diversity-policy")
  public DiversityPolicy getDiversityPolicy() {
    return diversityPolicy;
  }

  public void setDiversityPolicy(DiversityPolicy diversityPolicy) {
    this.diversityPolicy = diversityPolicy;
  }

  public RoutingConstraint routeObjectiveFunction(RouteObjectiveFunction routeObjectiveFunction) {
    this.routeObjectiveFunction = routeObjectiveFunction;
    return this;
  }

   /**
   * none
   * @return routeObjectiveFunction
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("route-objective-function")
  public RouteObjectiveFunction getRouteObjectiveFunction() {
    return routeObjectiveFunction;
  }

  public void setRouteObjectiveFunction(RouteObjectiveFunction routeObjectiveFunction) {
    this.routeObjectiveFunction = routeObjectiveFunction;
  }

  public RoutingConstraint costCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public RoutingConstraint addCostCharacteristicItem(CostCharacteristic costCharacteristicItem) {
    this.costCharacteristic.add(costCharacteristicItem);
    return this;
  }

   /**
   * The list of costs where each cost relates to some aspect of the TopologicalEntity.
   * @return costCharacteristic
  **/
  @ApiModelProperty(value = "The list of costs where each cost relates to some aspect of the TopologicalEntity.")
  @JsonProperty("cost-characteristic")
  public List<CostCharacteristic> getCostCharacteristic() {
    return costCharacteristic;
  }

  public void setCostCharacteristic(List<CostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
  }

  public RoutingConstraint latencyCharacteristic(List<LatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public RoutingConstraint addLatencyCharacteristicItem(LatencyCharacteristic latencyCharacteristicItem) {
    this.latencyCharacteristic.add(latencyCharacteristicItem);
    return this;
  }

   /**
   * The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.
   * @return latencyCharacteristic
  **/
  @ApiModelProperty(value = "The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.")
  @JsonProperty("latency-characteristic")
  public List<LatencyCharacteristic> getLatencyCharacteristic() {
    return latencyCharacteristic;
  }

  public void setLatencyCharacteristic(List<LatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
  }

  public RoutingConstraint riskDiversityCharacteristic(List<RiskCharacteristic> riskDiversityCharacteristic) {
    this.riskDiversityCharacteristic = riskDiversityCharacteristic;
    return this;
  }

  public RoutingConstraint addRiskDiversityCharacteristicItem(RiskCharacteristic riskDiversityCharacteristicItem) {
    this.riskDiversityCharacteristic.add(riskDiversityCharacteristicItem);
    return this;
  }

   /**
   * none
   * @return riskDiversityCharacteristic
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("risk-diversity-characteristic")
  public List<RiskCharacteristic> getRiskDiversityCharacteristic() {
    return riskDiversityCharacteristic;
  }

  public void setRiskDiversityCharacteristic(List<RiskCharacteristic> riskDiversityCharacteristic) {
    this.riskDiversityCharacteristic = riskDiversityCharacteristic;
  }

  public RoutingConstraint routeDirection(ForwardingDirection routeDirection) {
    this.routeDirection = routeDirection;
    return this;
  }

   /**
   * none
   * @return routeDirection
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("route-direction")
  public ForwardingDirection getRouteDirection() {
    return routeDirection;
  }

  public void setRouteDirection(ForwardingDirection routeDirection) {
    this.routeDirection = routeDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingConstraint tapiPathComputationRoutingConstraint = (RoutingConstraint) o;
    return Objects.equals(this.isExclusive, tapiPathComputationRoutingConstraint.isExclusive) &&
        Objects.equals(this.diversityPolicy, tapiPathComputationRoutingConstraint.diversityPolicy) &&
        Objects.equals(this.routeObjectiveFunction, tapiPathComputationRoutingConstraint.routeObjectiveFunction) &&
        Objects.equals(this.costCharacteristic, tapiPathComputationRoutingConstraint.costCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiPathComputationRoutingConstraint.latencyCharacteristic) &&
        Objects.equals(this.riskDiversityCharacteristic, tapiPathComputationRoutingConstraint.riskDiversityCharacteristic) &&
        Objects.equals(this.routeDirection, tapiPathComputationRoutingConstraint.routeDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isExclusive, diversityPolicy, routeObjectiveFunction, costCharacteristic, latencyCharacteristic, riskDiversityCharacteristic, routeDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingConstraint {\n");
    
    sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
    sb.append("    diversityPolicy: ").append(toIndentedString(diversityPolicy)).append("\n");
    sb.append("    routeObjectiveFunction: ").append(toIndentedString(routeObjectiveFunction)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    riskDiversityCharacteristic: ").append(toIndentedString(riskDiversityCharacteristic)).append("\n");
    sb.append("    routeDirection: ").append(toIndentedString(routeDirection)).append("\n");
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

