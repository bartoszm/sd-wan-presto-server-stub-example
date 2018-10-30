package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathObjectiveFunction;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathOptimizationConstraint;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathRef;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathServiceEndPoint;
import com.amartus.yang.sdwan.model.tapi.path.computation.RoutingConstraint;
import com.amartus.yang.sdwan.model.tapi.path.computation.TopologyConstraint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * PathComputationService
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PathComputationService extends com.amartus.yang.sdwan.model.tapi.common.GlobalClass  {
  private TopologyConstraint topologyConstraint = null;

  private List<PathRef> path = new ArrayList<PathRef>();

  private PathObjectiveFunction objectiveFunction = null;

  private List<PathServiceEndPoint> endPoint = new ArrayList<PathServiceEndPoint>();

  private RoutingConstraint routingConstraint = null;

  private PathOptimizationConstraint optimizationConstraint = null;

  public PathComputationService topologyConstraint(TopologyConstraint topologyConstraint) {
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

  public PathComputationService path(List<PathRef> path) {
    this.path = path;
    return this;
  }

  public PathComputationService addPathItem(PathRef pathItem) {
    this.path.add(pathItem);
    return this;
  }

   /**
   * none
   * @return path
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("path")
  public List<PathRef> getPath() {
    return path;
  }

  public void setPath(List<PathRef> path) {
    this.path = path;
  }

  public PathComputationService objectiveFunction(PathObjectiveFunction objectiveFunction) {
    this.objectiveFunction = objectiveFunction;
    return this;
  }

   /**
   * none
   * @return objectiveFunction
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("objective-function")
  public PathObjectiveFunction getObjectiveFunction() {
    return objectiveFunction;
  }

  public void setObjectiveFunction(PathObjectiveFunction objectiveFunction) {
    this.objectiveFunction = objectiveFunction;
  }

  public PathComputationService endPoint(List<PathServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public PathComputationService addEndPointItem(PathServiceEndPoint endPointItem) {
    this.endPoint.add(endPointItem);
    return this;
  }

   /**
   * none
   * @return endPoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("end-point")
  public List<PathServiceEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<PathServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public PathComputationService routingConstraint(RoutingConstraint routingConstraint) {
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

  public PathComputationService optimizationConstraint(PathOptimizationConstraint optimizationConstraint) {
    this.optimizationConstraint = optimizationConstraint;
    return this;
  }

   /**
   * none
   * @return optimizationConstraint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("optimization-constraint")
  public PathOptimizationConstraint getOptimizationConstraint() {
    return optimizationConstraint;
  }

  public void setOptimizationConstraint(PathOptimizationConstraint optimizationConstraint) {
    this.optimizationConstraint = optimizationConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathComputationService tapiPathComputationPathComputationService = (PathComputationService) o;
    return Objects.equals(this.topologyConstraint, tapiPathComputationPathComputationService.topologyConstraint) &&
        Objects.equals(this.path, tapiPathComputationPathComputationService.path) &&
        Objects.equals(this.objectiveFunction, tapiPathComputationPathComputationService.objectiveFunction) &&
        Objects.equals(this.endPoint, tapiPathComputationPathComputationService.endPoint) &&
        Objects.equals(this.routingConstraint, tapiPathComputationPathComputationService.routingConstraint) &&
        Objects.equals(this.optimizationConstraint, tapiPathComputationPathComputationService.optimizationConstraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyConstraint, path, objectiveFunction, endPoint, routingConstraint, optimizationConstraint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathComputationService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    objectiveFunction: ").append(toIndentedString(objectiveFunction)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    optimizationConstraint: ").append(toIndentedString(optimizationConstraint)).append("\n");
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

