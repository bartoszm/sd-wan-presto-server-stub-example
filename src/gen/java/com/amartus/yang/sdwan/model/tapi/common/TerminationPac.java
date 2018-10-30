package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.TerminationDirection;
import com.amartus.yang.sdwan.model.tapi.common.TerminationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * TerminationPac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class TerminationPac   {
  private TerminationDirection terminationDirection = null;

  private TerminationState terminationState = null;

  public TerminationPac terminationDirection(TerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
    return this;
  }

   /**
   * The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows
   * @return terminationDirection
  **/
  @ApiModelProperty(value = "The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows")
  @JsonProperty("termination-direction")
  public TerminationDirection getTerminationDirection() {
    return terminationDirection;
  }

  public void setTerminationDirection(TerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
  }

  public TerminationPac terminationState(TerminationState terminationState) {
    this.terminationState = terminationState;
    return this;
  }

   /**
   * Indicates whether the layer is terminated and if so how.
   * @return terminationState
  **/
  @ApiModelProperty(value = "Indicates whether the layer is terminated and if so how.")
  @JsonProperty("termination-state")
  public TerminationState getTerminationState() {
    return terminationState;
  }

  public void setTerminationState(TerminationState terminationState) {
    this.terminationState = terminationState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminationPac tapiCommonTerminationPac = (TerminationPac) o;
    return Objects.equals(this.terminationDirection, tapiCommonTerminationPac.terminationDirection) &&
        Objects.equals(this.terminationState, tapiCommonTerminationPac.terminationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminationDirection, terminationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminationPac {\n");
    
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
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

