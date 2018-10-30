package com.amartus.yang.sdwan.model.tapi.path.computation.optimizep2ppath;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathObjectiveFunction;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathOptimizationConstraint;
import com.amartus.yang.sdwan.model.tapi.path.computation.RoutingConstraint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Input
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Input   {
  private RoutingConstraint routingConstraint = null;

  private String pathIdOrName = null;

  private PathOptimizationConstraint optimizationConstraint = null;

  private PathObjectiveFunction objectiveFunction = null;

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

  public Input pathIdOrName(String pathIdOrName) {
    this.pathIdOrName = pathIdOrName;
    return this;
  }

   /**
   * none
   * @return pathIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("path-id-or-name")
  public String getPathIdOrName() {
    return pathIdOrName;
  }

  public void setPathIdOrName(String pathIdOrName) {
    this.pathIdOrName = pathIdOrName;
  }

  public Input optimizationConstraint(PathOptimizationConstraint optimizationConstraint) {
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

  public Input objectiveFunction(PathObjectiveFunction objectiveFunction) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiPathComputationOptimizep2ppathInput = (Input) o;
    return Objects.equals(this.routingConstraint, tapiPathComputationOptimizep2ppathInput.routingConstraint) &&
        Objects.equals(this.pathIdOrName, tapiPathComputationOptimizep2ppathInput.pathIdOrName) &&
        Objects.equals(this.optimizationConstraint, tapiPathComputationOptimizep2ppathInput.optimizationConstraint) &&
        Objects.equals(this.objectiveFunction, tapiPathComputationOptimizep2ppathInput.objectiveFunction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingConstraint, pathIdOrName, optimizationConstraint, objectiveFunction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    pathIdOrName: ").append(toIndentedString(pathIdOrName)).append("\n");
    sb.append("    optimizationConstraint: ").append(toIndentedString(optimizationConstraint)).append("\n");
    sb.append("    objectiveFunction: ").append(toIndentedString(objectiveFunction)).append("\n");
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

