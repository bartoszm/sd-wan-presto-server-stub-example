package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.DirectiveValue;
import com.amartus.yang.sdwan.model.tapi.common.LocalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * PathObjectiveFunction
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PathObjectiveFunction extends com.amartus.yang.sdwan.model.tapi.common.LocalClass  {
  private DirectiveValue linkUtilization = null;

  private DirectiveValue bandwidthOptimization = null;

  private DirectiveValue costOptimization = null;

  private DirectiveValue resourceSharing = null;

  private DirectiveValue concurrentPaths = null;

  public PathObjectiveFunction linkUtilization(DirectiveValue linkUtilization) {
    this.linkUtilization = linkUtilization;
    return this;
  }

   /**
   * none
   * @return linkUtilization
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("link-utilization")
  public DirectiveValue getLinkUtilization() {
    return linkUtilization;
  }

  public void setLinkUtilization(DirectiveValue linkUtilization) {
    this.linkUtilization = linkUtilization;
  }

  public PathObjectiveFunction bandwidthOptimization(DirectiveValue bandwidthOptimization) {
    this.bandwidthOptimization = bandwidthOptimization;
    return this;
  }

   /**
   * none
   * @return bandwidthOptimization
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("bandwidth-optimization")
  public DirectiveValue getBandwidthOptimization() {
    return bandwidthOptimization;
  }

  public void setBandwidthOptimization(DirectiveValue bandwidthOptimization) {
    this.bandwidthOptimization = bandwidthOptimization;
  }

  public PathObjectiveFunction costOptimization(DirectiveValue costOptimization) {
    this.costOptimization = costOptimization;
    return this;
  }

   /**
   * none
   * @return costOptimization
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("cost-optimization")
  public DirectiveValue getCostOptimization() {
    return costOptimization;
  }

  public void setCostOptimization(DirectiveValue costOptimization) {
    this.costOptimization = costOptimization;
  }

  public PathObjectiveFunction resourceSharing(DirectiveValue resourceSharing) {
    this.resourceSharing = resourceSharing;
    return this;
  }

   /**
   * none
   * @return resourceSharing
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("resource-sharing")
  public DirectiveValue getResourceSharing() {
    return resourceSharing;
  }

  public void setResourceSharing(DirectiveValue resourceSharing) {
    this.resourceSharing = resourceSharing;
  }

  public PathObjectiveFunction concurrentPaths(DirectiveValue concurrentPaths) {
    this.concurrentPaths = concurrentPaths;
    return this;
  }

   /**
   * none
   * @return concurrentPaths
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("concurrent-paths")
  public DirectiveValue getConcurrentPaths() {
    return concurrentPaths;
  }

  public void setConcurrentPaths(DirectiveValue concurrentPaths) {
    this.concurrentPaths = concurrentPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathObjectiveFunction tapiPathComputationPathObjectiveFunction = (PathObjectiveFunction) o;
    return Objects.equals(this.linkUtilization, tapiPathComputationPathObjectiveFunction.linkUtilization) &&
        Objects.equals(this.bandwidthOptimization, tapiPathComputationPathObjectiveFunction.bandwidthOptimization) &&
        Objects.equals(this.costOptimization, tapiPathComputationPathObjectiveFunction.costOptimization) &&
        Objects.equals(this.resourceSharing, tapiPathComputationPathObjectiveFunction.resourceSharing) &&
        Objects.equals(this.concurrentPaths, tapiPathComputationPathObjectiveFunction.concurrentPaths) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUtilization, bandwidthOptimization, costOptimization, resourceSharing, concurrentPaths, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathObjectiveFunction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    linkUtilization: ").append(toIndentedString(linkUtilization)).append("\n");
    sb.append("    bandwidthOptimization: ").append(toIndentedString(bandwidthOptimization)).append("\n");
    sb.append("    costOptimization: ").append(toIndentedString(costOptimization)).append("\n");
    sb.append("    resourceSharing: ").append(toIndentedString(resourceSharing)).append("\n");
    sb.append("    concurrentPaths: ").append(toIndentedString(concurrentPaths)).append("\n");
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

