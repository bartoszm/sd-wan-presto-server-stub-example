package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.topology.Link;
import com.amartus.yang.sdwan.model.tapi.topology.Node;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Topology
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Topology extends com.amartus.yang.sdwan.model.tapi.common.GlobalClass  {
  private List<LayerProtocolName> layerProtocolName = new ArrayList<LayerProtocolName>();

  private List<Link> link = new ArrayList<Link>();

  private List<Node> node = new ArrayList<Node>();

  public Topology layerProtocolName(List<LayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public Topology addLayerProtocolNameItem(LayerProtocolName layerProtocolNameItem) {
    this.layerProtocolName.add(layerProtocolNameItem);
    return this;
  }

   /**
   * none
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("layer-protocol-name")
  public List<LayerProtocolName> getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(List<LayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public Topology link(List<Link> link) {
    this.link = link;
    return this;
  }

  public Topology addLinkItem(Link linkItem) {
    this.link.add(linkItem);
    return this;
  }

   /**
   * none
   * @return link
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("link")
  public List<Link> getLink() {
    return link;
  }

  public void setLink(List<Link> link) {
    this.link = link;
  }

  public Topology node(List<Node> node) {
    this.node = node;
    return this;
  }

  public Topology addNodeItem(Node nodeItem) {
    this.node.add(nodeItem);
    return this;
  }

   /**
   * none
   * @return node
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("node")
  public List<Node> getNode() {
    return node;
  }

  public void setNode(List<Node> node) {
    this.node = node;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topology tapiTopologyTopology = (Topology) o;
    return Objects.equals(this.layerProtocolName, tapiTopologyTopology.layerProtocolName) &&
        Objects.equals(this.link, tapiTopologyTopology.link) &&
        Objects.equals(this.node, tapiTopologyTopology.node) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerProtocolName, link, node, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topology {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

