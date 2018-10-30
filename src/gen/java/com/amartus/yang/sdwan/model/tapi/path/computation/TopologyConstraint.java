package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.path.computation.PathRef;
import com.amartus.yang.sdwan.model.tapi.topology.LinkRef;
import com.amartus.yang.sdwan.model.tapi.topology.NodeRef;
import com.amartus.yang.sdwan.model.tapi.topology.TopologyRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * TopologyConstraint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class TopologyConstraint   {
  private List<NodeRef> includeNode = new ArrayList<NodeRef>();

  private List<LinkRef> excludeLink = new ArrayList<LinkRef>();

  private List<TopologyRef> avoidTopology = new ArrayList<TopologyRef>();

  private List<PathRef> excludePath = new ArrayList<PathRef>();

  private List<LinkRef> includeLink = new ArrayList<LinkRef>();

  private List<LayerProtocolName> preferredTransportLayer = new ArrayList<LayerProtocolName>();

  private List<NodeRef> excludeNode = new ArrayList<NodeRef>();

  private List<TopologyRef> includeTopology = new ArrayList<TopologyRef>();

  private List<PathRef> includePath = new ArrayList<PathRef>();

  public TopologyConstraint includeNode(List<NodeRef> includeNode) {
    this.includeNode = includeNode;
    return this;
  }

  public TopologyConstraint addIncludeNodeItem(NodeRef includeNodeItem) {
    this.includeNode.add(includeNodeItem);
    return this;
  }

   /**
   * This is a loose constraint - that is it is unordered and could be a partial list
   * @return includeNode
  **/
  @ApiModelProperty(value = "This is a loose constraint - that is it is unordered and could be a partial list")
  @JsonProperty("include-node")
  public List<NodeRef> getIncludeNode() {
    return includeNode;
  }

  public void setIncludeNode(List<NodeRef> includeNode) {
    this.includeNode = includeNode;
  }

  public TopologyConstraint excludeLink(List<LinkRef> excludeLink) {
    this.excludeLink = excludeLink;
    return this;
  }

  public TopologyConstraint addExcludeLinkItem(LinkRef excludeLinkItem) {
    this.excludeLink.add(excludeLinkItem);
    return this;
  }

   /**
   * none
   * @return excludeLink
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("exclude-link")
  public List<LinkRef> getExcludeLink() {
    return excludeLink;
  }

  public void setExcludeLink(List<LinkRef> excludeLink) {
    this.excludeLink = excludeLink;
  }

  public TopologyConstraint avoidTopology(List<TopologyRef> avoidTopology) {
    this.avoidTopology = avoidTopology;
    return this;
  }

  public TopologyConstraint addAvoidTopologyItem(TopologyRef avoidTopologyItem) {
    this.avoidTopology.add(avoidTopologyItem);
    return this;
  }

   /**
   * none
   * @return avoidTopology
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("avoid-topology")
  public List<TopologyRef> getAvoidTopology() {
    return avoidTopology;
  }

  public void setAvoidTopology(List<TopologyRef> avoidTopology) {
    this.avoidTopology = avoidTopology;
  }

  public TopologyConstraint excludePath(List<PathRef> excludePath) {
    this.excludePath = excludePath;
    return this;
  }

  public TopologyConstraint addExcludePathItem(PathRef excludePathItem) {
    this.excludePath.add(excludePathItem);
    return this;
  }

   /**
   * none
   * @return excludePath
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("exclude-path")
  public List<PathRef> getExcludePath() {
    return excludePath;
  }

  public void setExcludePath(List<PathRef> excludePath) {
    this.excludePath = excludePath;
  }

  public TopologyConstraint includeLink(List<LinkRef> includeLink) {
    this.includeLink = includeLink;
    return this;
  }

  public TopologyConstraint addIncludeLinkItem(LinkRef includeLinkItem) {
    this.includeLink.add(includeLinkItem);
    return this;
  }

   /**
   * This is a loose constraint - that is it is unordered and could be a partial list 
   * @return includeLink
  **/
  @ApiModelProperty(value = "This is a loose constraint - that is it is unordered and could be a partial list ")
  @JsonProperty("include-link")
  public List<LinkRef> getIncludeLink() {
    return includeLink;
  }

  public void setIncludeLink(List<LinkRef> includeLink) {
    this.includeLink = includeLink;
  }

  public TopologyConstraint preferredTransportLayer(List<LayerProtocolName> preferredTransportLayer) {
    this.preferredTransportLayer = preferredTransportLayer;
    return this;
  }

  public TopologyConstraint addPreferredTransportLayerItem(LayerProtocolName preferredTransportLayerItem) {
    this.preferredTransportLayer.add(preferredTransportLayerItem);
    return this;
  }

   /**
   * soft constraint requested by client to indicate the layer(s) of transport connection that it prefers to carry the service. This could be same as the service layer or one of the supported server layers
   * @return preferredTransportLayer
  **/
  @ApiModelProperty(value = "soft constraint requested by client to indicate the layer(s) of transport connection that it prefers to carry the service. This could be same as the service layer or one of the supported server layers")
  @JsonProperty("preferred-transport-layer")
  public List<LayerProtocolName> getPreferredTransportLayer() {
    return preferredTransportLayer;
  }

  public void setPreferredTransportLayer(List<LayerProtocolName> preferredTransportLayer) {
    this.preferredTransportLayer = preferredTransportLayer;
  }

  public TopologyConstraint excludeNode(List<NodeRef> excludeNode) {
    this.excludeNode = excludeNode;
    return this;
  }

  public TopologyConstraint addExcludeNodeItem(NodeRef excludeNodeItem) {
    this.excludeNode.add(excludeNodeItem);
    return this;
  }

   /**
   * none
   * @return excludeNode
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("exclude-node")
  public List<NodeRef> getExcludeNode() {
    return excludeNode;
  }

  public void setExcludeNode(List<NodeRef> excludeNode) {
    this.excludeNode = excludeNode;
  }

  public TopologyConstraint includeTopology(List<TopologyRef> includeTopology) {
    this.includeTopology = includeTopology;
    return this;
  }

  public TopologyConstraint addIncludeTopologyItem(TopologyRef includeTopologyItem) {
    this.includeTopology.add(includeTopologyItem);
    return this;
  }

   /**
   * none
   * @return includeTopology
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("include-topology")
  public List<TopologyRef> getIncludeTopology() {
    return includeTopology;
  }

  public void setIncludeTopology(List<TopologyRef> includeTopology) {
    this.includeTopology = includeTopology;
  }

  public TopologyConstraint includePath(List<PathRef> includePath) {
    this.includePath = includePath;
    return this;
  }

  public TopologyConstraint addIncludePathItem(PathRef includePathItem) {
    this.includePath.add(includePathItem);
    return this;
  }

   /**
   * none
   * @return includePath
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("include-path")
  public List<PathRef> getIncludePath() {
    return includePath;
  }

  public void setIncludePath(List<PathRef> includePath) {
    this.includePath = includePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyConstraint tapiPathComputationTopologyConstraint = (TopologyConstraint) o;
    return Objects.equals(this.includeNode, tapiPathComputationTopologyConstraint.includeNode) &&
        Objects.equals(this.excludeLink, tapiPathComputationTopologyConstraint.excludeLink) &&
        Objects.equals(this.avoidTopology, tapiPathComputationTopologyConstraint.avoidTopology) &&
        Objects.equals(this.excludePath, tapiPathComputationTopologyConstraint.excludePath) &&
        Objects.equals(this.includeLink, tapiPathComputationTopologyConstraint.includeLink) &&
        Objects.equals(this.preferredTransportLayer, tapiPathComputationTopologyConstraint.preferredTransportLayer) &&
        Objects.equals(this.excludeNode, tapiPathComputationTopologyConstraint.excludeNode) &&
        Objects.equals(this.includeTopology, tapiPathComputationTopologyConstraint.includeTopology) &&
        Objects.equals(this.includePath, tapiPathComputationTopologyConstraint.includePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeNode, excludeLink, avoidTopology, excludePath, includeLink, preferredTransportLayer, excludeNode, includeTopology, includePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyConstraint {\n");
    
    sb.append("    includeNode: ").append(toIndentedString(includeNode)).append("\n");
    sb.append("    excludeLink: ").append(toIndentedString(excludeLink)).append("\n");
    sb.append("    avoidTopology: ").append(toIndentedString(avoidTopology)).append("\n");
    sb.append("    excludePath: ").append(toIndentedString(excludePath)).append("\n");
    sb.append("    includeLink: ").append(toIndentedString(includeLink)).append("\n");
    sb.append("    preferredTransportLayer: ").append(toIndentedString(preferredTransportLayer)).append("\n");
    sb.append("    excludeNode: ").append(toIndentedString(excludeNode)).append("\n");
    sb.append("    includeTopology: ").append(toIndentedString(includeTopology)).append("\n");
    sb.append("    includePath: ").append(toIndentedString(includePath)).append("\n");
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

