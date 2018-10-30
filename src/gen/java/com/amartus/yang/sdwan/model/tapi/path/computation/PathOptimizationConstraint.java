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
 * PathOptimizationConstraint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PathOptimizationConstraint extends com.amartus.yang.sdwan.model.tapi.common.LocalClass  {
  private DirectiveValue trafficInterruption = null;

  public PathOptimizationConstraint trafficInterruption(DirectiveValue trafficInterruption) {
    this.trafficInterruption = trafficInterruption;
    return this;
  }

   /**
   * none
   * @return trafficInterruption
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("traffic-interruption")
  public DirectiveValue getTrafficInterruption() {
    return trafficInterruption;
  }

  public void setTrafficInterruption(DirectiveValue trafficInterruption) {
    this.trafficInterruption = trafficInterruption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathOptimizationConstraint tapiPathComputationPathOptimizationConstraint = (PathOptimizationConstraint) o;
    return Objects.equals(this.trafficInterruption, tapiPathComputationPathOptimizationConstraint.trafficInterruption) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trafficInterruption, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathOptimizationConstraint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    trafficInterruption: ").append(toIndentedString(trafficInterruption)).append("\n");
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

