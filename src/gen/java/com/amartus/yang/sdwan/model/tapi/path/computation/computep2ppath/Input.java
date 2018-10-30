package com.amartus.yang.sdwan.model.tapi.path.computation.computep2ppath;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathObjectiveFunction;
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
 * Input
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Input   {
  private TopologyConstraint topologyConstraint = null;

  private RoutingConstraint routingConstraint = null;

  private PathObjectiveFunction objectiveFunction = null;

  private List<PathServiceEndPoint> sep = new ArrayList<PathServiceEndPoint>();

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

  public Input sep(List<PathServiceEndPoint> sep) {
    this.sep = sep;
    return this;
  }

  public Input addSepItem(PathServiceEndPoint sepItem) {
    this.sep.add(sepItem);
    return this;
  }

   /**
   * none
   * @return sep
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("sep")
  public List<PathServiceEndPoint> getSep() {
    return sep;
  }

  public void setSep(List<PathServiceEndPoint> sep) {
    this.sep = sep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiPathComputationComputep2ppathInput = (Input) o;
    return Objects.equals(this.topologyConstraint, tapiPathComputationComputep2ppathInput.topologyConstraint) &&
        Objects.equals(this.routingConstraint, tapiPathComputationComputep2ppathInput.routingConstraint) &&
        Objects.equals(this.objectiveFunction, tapiPathComputationComputep2ppathInput.objectiveFunction) &&
        Objects.equals(this.sep, tapiPathComputationComputep2ppathInput.sep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyConstraint, routingConstraint, objectiveFunction, sep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    objectiveFunction: ").append(toIndentedString(objectiveFunction)).append("\n");
    sb.append("    sep: ").append(toIndentedString(sep)).append("\n");
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

