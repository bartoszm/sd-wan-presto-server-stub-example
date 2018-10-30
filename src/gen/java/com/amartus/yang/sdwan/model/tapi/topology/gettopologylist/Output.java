package com.amartus.yang.sdwan.model.tapi.topology.gettopologylist;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.topology.Topology;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private List<Topology> topology = new ArrayList<Topology>();

  public Output topology(List<Topology> topology) {
    this.topology = topology;
    return this;
  }

  public Output addTopologyItem(Topology topologyItem) {
    this.topology.add(topologyItem);
    return this;
  }

   /**
   * none
   * @return topology
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("topology")
  public List<Topology> getTopology() {
    return topology;
  }

  public void setTopology(List<Topology> topology) {
    this.topology = topology;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output tapiTopologyGettopologylistOutput = (Output) o;
    return Objects.equals(this.topology, tapiTopologyGettopologylistOutput.topology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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

