package com.amartus.yang.sdwan.model.tapi.topology;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.AdminStatePac;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.CapacityPac;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.common.PortDirection;
import com.amartus.yang.sdwan.model.tapi.common.PortRole;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePointRef;
import com.amartus.yang.sdwan.model.tapi.common.TerminationDirection;
import com.amartus.yang.sdwan.model.tapi.common.TerminationPac;
import com.amartus.yang.sdwan.model.tapi.common.TerminationState;
import com.amartus.yang.sdwan.model.tapi.topology.NodeEdgePointRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * NodeEdgePoint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class NodeEdgePoint extends com.amartus.yang.sdwan.model.tapi.common.AdminStatePac  {
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private TerminationDirection terminationDirection = null;

  private TerminationState terminationState = null;

  private Capacity availableCapacity = null;

  private Capacity totalPotentialCapacity = null;

  private PortRole linkPortRole = null;

  private List<ServiceInterfacePointRef> mappedServiceInterfacePoint = new ArrayList<ServiceInterfacePointRef>();

  private List<NodeEdgePointRef> aggregatedNodeEdgePoint = new ArrayList<NodeEdgePointRef>();

  private LayerProtocolName layerProtocolName = null;

  private PortDirection linkPortDirection = null;

  private List<String> supportedCepLayerProtocolQualifier = new ArrayList<String>();

  public NodeEdgePoint name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public NodeEdgePoint addNameItem(NameAndValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  @JsonProperty("name")
  public List<NameAndValue> getName() {
    return name;
  }

  public void setName(List<NameAndValue> name) {
    this.name = name;
  }

  public NodeEdgePoint uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public NodeEdgePoint terminationDirection(TerminationDirection terminationDirection) {
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

  public NodeEdgePoint terminationState(TerminationState terminationState) {
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

  public NodeEdgePoint availableCapacity(Capacity availableCapacity) {
    this.availableCapacity = availableCapacity;
    return this;
  }

   /**
   * Capacity available to be assigned.
   * @return availableCapacity
  **/
  @ApiModelProperty(value = "Capacity available to be assigned.")
  @JsonProperty("available-capacity")
  public Capacity getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(Capacity availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public NodeEdgePoint totalPotentialCapacity(Capacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
    return this;
  }

   /**
   * An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.
   * @return totalPotentialCapacity
  **/
  @ApiModelProperty(value = "An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.")
  @JsonProperty("total-potential-capacity")
  public Capacity getTotalPotentialCapacity() {
    return totalPotentialCapacity;
  }

  public void setTotalPotentialCapacity(Capacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
  }

  public NodeEdgePoint linkPortRole(PortRole linkPortRole) {
    this.linkPortRole = linkPortRole;
    return this;
  }

   /**
   * Each LinkEnd of the Link has a role (e.g., symmetric, hub, spoke, leaf, root)  in the context of the Link with respect to the Link function. 
   * @return linkPortRole
  **/
  @ApiModelProperty(value = "Each LinkEnd of the Link has a role (e.g., symmetric, hub, spoke, leaf, root)  in the context of the Link with respect to the Link function. ")
  @JsonProperty("link-port-role")
  public PortRole getLinkPortRole() {
    return linkPortRole;
  }

  public void setLinkPortRole(PortRole linkPortRole) {
    this.linkPortRole = linkPortRole;
  }

  public NodeEdgePoint mappedServiceInterfacePoint(List<ServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
    return this;
  }

  public NodeEdgePoint addMappedServiceInterfacePointItem(ServiceInterfacePointRef mappedServiceInterfacePointItem) {
    this.mappedServiceInterfacePoint.add(mappedServiceInterfacePointItem);
    return this;
  }

   /**
   * NodeEdgePoint mapped to more than ServiceInterfacePoint (slicing/virtualizing) or a ServiceInterfacePoint mapped to more than one NodeEdgePoint (load balancing/Resilience) should be considered experimental
   * @return mappedServiceInterfacePoint
  **/
  @ApiModelProperty(value = "NodeEdgePoint mapped to more than ServiceInterfacePoint (slicing/virtualizing) or a ServiceInterfacePoint mapped to more than one NodeEdgePoint (load balancing/Resilience) should be considered experimental")
  @JsonProperty("mapped-service-interface-point")
  public List<ServiceInterfacePointRef> getMappedServiceInterfacePoint() {
    return mappedServiceInterfacePoint;
  }

  public void setMappedServiceInterfacePoint(List<ServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
  }

  public NodeEdgePoint aggregatedNodeEdgePoint(List<NodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
    return this;
  }

  public NodeEdgePoint addAggregatedNodeEdgePointItem(NodeEdgePointRef aggregatedNodeEdgePointItem) {
    this.aggregatedNodeEdgePoint.add(aggregatedNodeEdgePointItem);
    return this;
  }

   /**
   * none
   * @return aggregatedNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("aggregated-node-edge-point")
  public List<NodeEdgePointRef> getAggregatedNodeEdgePoint() {
    return aggregatedNodeEdgePoint;
  }

  public void setAggregatedNodeEdgePoint(List<NodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
  }

  public NodeEdgePoint layerProtocolName(LayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

   /**
   * none
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("layer-protocol-name")
  public LayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(LayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public NodeEdgePoint linkPortDirection(PortDirection linkPortDirection) {
    this.linkPortDirection = linkPortDirection;
    return this;
  }

   /**
   * The orientation of defined flow at the LinkEnd.
   * @return linkPortDirection
  **/
  @ApiModelProperty(value = "The orientation of defined flow at the LinkEnd.")
  @JsonProperty("link-port-direction")
  public PortDirection getLinkPortDirection() {
    return linkPortDirection;
  }

  public void setLinkPortDirection(PortDirection linkPortDirection) {
    this.linkPortDirection = linkPortDirection;
  }

  public NodeEdgePoint supportedCepLayerProtocolQualifier(List<String> supportedCepLayerProtocolQualifier) {
    this.supportedCepLayerProtocolQualifier = supportedCepLayerProtocolQualifier;
    return this;
  }

  public NodeEdgePoint addSupportedCepLayerProtocolQualifierItem(String supportedCepLayerProtocolQualifierItem) {
    this.supportedCepLayerProtocolQualifier.add(supportedCepLayerProtocolQualifierItem);
    return this;
  }

   /**
   * none
   * @return supportedCepLayerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("supported-cep-layer-protocol-qualifier")
  public List<String> getSupportedCepLayerProtocolQualifier() {
    return supportedCepLayerProtocolQualifier;
  }

  public void setSupportedCepLayerProtocolQualifier(List<String> supportedCepLayerProtocolQualifier) {
    this.supportedCepLayerProtocolQualifier = supportedCepLayerProtocolQualifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeEdgePoint tapiTopologyNodeEdgePoint = (NodeEdgePoint) o;
    return Objects.equals(this.name, tapiTopologyNodeEdgePoint.name) &&
        Objects.equals(this.uuid, tapiTopologyNodeEdgePoint.uuid) &&
        Objects.equals(this.terminationDirection, tapiTopologyNodeEdgePoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiTopologyNodeEdgePoint.terminationState) &&
        Objects.equals(this.availableCapacity, tapiTopologyNodeEdgePoint.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyNodeEdgePoint.totalPotentialCapacity) &&
        Objects.equals(this.linkPortRole, tapiTopologyNodeEdgePoint.linkPortRole) &&
        Objects.equals(this.mappedServiceInterfacePoint, tapiTopologyNodeEdgePoint.mappedServiceInterfacePoint) &&
        Objects.equals(this.aggregatedNodeEdgePoint, tapiTopologyNodeEdgePoint.aggregatedNodeEdgePoint) &&
        Objects.equals(this.layerProtocolName, tapiTopologyNodeEdgePoint.layerProtocolName) &&
        Objects.equals(this.linkPortDirection, tapiTopologyNodeEdgePoint.linkPortDirection) &&
        Objects.equals(this.supportedCepLayerProtocolQualifier, tapiTopologyNodeEdgePoint.supportedCepLayerProtocolQualifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, terminationDirection, terminationState, availableCapacity, totalPotentialCapacity, linkPortRole, mappedServiceInterfacePoint, aggregatedNodeEdgePoint, layerProtocolName, linkPortDirection, supportedCepLayerProtocolQualifier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeEdgePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    linkPortRole: ").append(toIndentedString(linkPortRole)).append("\n");
    sb.append("    mappedServiceInterfacePoint: ").append(toIndentedString(mappedServiceInterfacePoint)).append("\n");
    sb.append("    aggregatedNodeEdgePoint: ").append(toIndentedString(aggregatedNodeEdgePoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    linkPortDirection: ").append(toIndentedString(linkPortDirection)).append("\n");
    sb.append("    supportedCepLayerProtocolQualifier: ").append(toIndentedString(supportedCepLayerProtocolQualifier)).append("\n");
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

