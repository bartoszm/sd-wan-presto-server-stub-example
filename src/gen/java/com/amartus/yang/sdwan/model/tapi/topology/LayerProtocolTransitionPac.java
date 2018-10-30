package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * LayerProtocolTransitionPac
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class LayerProtocolTransitionPac   {
  private List<String> transitionedLayerProtocolName = new ArrayList<String>();

  public LayerProtocolTransitionPac transitionedLayerProtocolName(List<String> transitionedLayerProtocolName) {
    this.transitionedLayerProtocolName = transitionedLayerProtocolName;
    return this;
  }

  public LayerProtocolTransitionPac addTransitionedLayerProtocolNameItem(String transitionedLayerProtocolNameItem) {
    this.transitionedLayerProtocolName.add(transitionedLayerProtocolNameItem);
    return this;
  }

   /**
   * Provides the ordered structure of layer protocol transitions encapsulated in the TopologicalEntity. The ordering relates to the LinkPort role.
   * @return transitionedLayerProtocolName
  **/
  @ApiModelProperty(value = "Provides the ordered structure of layer protocol transitions encapsulated in the TopologicalEntity. The ordering relates to the LinkPort role.")
  @JsonProperty("transitioned-layer-protocol-name")
  public List<String> getTransitionedLayerProtocolName() {
    return transitionedLayerProtocolName;
  }

  public void setTransitionedLayerProtocolName(List<String> transitionedLayerProtocolName) {
    this.transitionedLayerProtocolName = transitionedLayerProtocolName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerProtocolTransitionPac tapiTopologyLayerProtocolTransitionPac = (LayerProtocolTransitionPac) o;
    return Objects.equals(this.transitionedLayerProtocolName, tapiTopologyLayerProtocolTransitionPac.transitionedLayerProtocolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transitionedLayerProtocolName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerProtocolTransitionPac {\n");
    
    sb.append("    transitionedLayerProtocolName: ").append(toIndentedString(transitionedLayerProtocolName)).append("\n");
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

