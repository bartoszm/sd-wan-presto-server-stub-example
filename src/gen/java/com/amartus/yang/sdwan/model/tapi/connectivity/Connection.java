package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.ForwardingDirection;
import com.amartus.yang.sdwan.model.tapi.common.GlobalClass;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.common.OperationalStatePac;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionEndPointRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.Route;
import com.amartus.yang.sdwan.model.tapi.connectivity.SwitchControl;
import com.amartus.yang.sdwan.model.tapi.topology.LinkRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Connection
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Connection extends com.amartus.yang.sdwan.model.tapi.common.OperationalStatePac  {
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private List<LinkRef> supportedClientLink = new ArrayList<LinkRef>();

  private List<ConnectionRef> lowerConnection = new ArrayList<ConnectionRef>();

  private List<SwitchControl> switchControl = new ArrayList<SwitchControl>();

  private List<Route> route = new ArrayList<Route>();

  private LayerProtocolName layerProtocolName = null;

  private List<ConnectionEndPointRef> connectionEndPoint = new ArrayList<ConnectionEndPointRef>();

  private ForwardingDirection direction = null;

  public Connection name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public Connection addNameItem(NameAndValue nameItem) {
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

  public Connection uuid(String uuid) {
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

  public Connection supportedClientLink(List<LinkRef> supportedClientLink) {
    this.supportedClientLink = supportedClientLink;
    return this;
  }

  public Connection addSupportedClientLinkItem(LinkRef supportedClientLinkItem) {
    this.supportedClientLink.add(supportedClientLinkItem);
    return this;
  }

   /**
   * none
   * @return supportedClientLink
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("supported-client-link")
  public List<LinkRef> getSupportedClientLink() {
    return supportedClientLink;
  }

  public void setSupportedClientLink(List<LinkRef> supportedClientLink) {
    this.supportedClientLink = supportedClientLink;
  }

  public Connection lowerConnection(List<ConnectionRef> lowerConnection) {
    this.lowerConnection = lowerConnection;
    return this;
  }

  public Connection addLowerConnectionItem(ConnectionRef lowerConnectionItem) {
    this.lowerConnection.add(lowerConnectionItem);
    return this;
  }

   /**
   * An Connection object supports a recursive aggregation relationship such that the internal construction of an Connection can be exposed as multiple lower level Connection objects (partitioning).                      Aggregation is used as for the Node/Topology  to allow changes in hierarchy.                       Connection aggregation reflects Node/Topology aggregation.                       The FC represents a Cross-Connection in an NE. The Cross-Connection in an NE is not necessarily the lowest level of FC partitioning.
   * @return lowerConnection
  **/
  @ApiModelProperty(value = "An Connection object supports a recursive aggregation relationship such that the internal construction of an Connection can be exposed as multiple lower level Connection objects (partitioning).                      Aggregation is used as for the Node/Topology  to allow changes in hierarchy.                       Connection aggregation reflects Node/Topology aggregation.                       The FC represents a Cross-Connection in an NE. The Cross-Connection in an NE is not necessarily the lowest level of FC partitioning.")
  @JsonProperty("lower-connection")
  public List<ConnectionRef> getLowerConnection() {
    return lowerConnection;
  }

  public void setLowerConnection(List<ConnectionRef> lowerConnection) {
    this.lowerConnection = lowerConnection;
  }

  public Connection switchControl(List<SwitchControl> switchControl) {
    this.switchControl = switchControl;
    return this;
  }

  public Connection addSwitchControlItem(SwitchControl switchControlItem) {
    this.switchControl.add(switchControlItem);
    return this;
  }

   /**
   * none
   * @return switchControl
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("switch-control")
  public List<SwitchControl> getSwitchControl() {
    return switchControl;
  }

  public void setSwitchControl(List<SwitchControl> switchControl) {
    this.switchControl = switchControl;
  }

  public Connection route(List<Route> route) {
    this.route = route;
    return this;
  }

  public Connection addRouteItem(Route routeItem) {
    this.route.add(routeItem);
    return this;
  }

   /**
   * none
   * @return route
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("route")
  public List<Route> getRoute() {
    return route;
  }

  public void setRoute(List<Route> route) {
    this.route = route;
  }

  public Connection layerProtocolName(LayerProtocolName layerProtocolName) {
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

  public Connection connectionEndPoint(List<ConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public Connection addConnectionEndPointItem(ConnectionEndPointRef connectionEndPointItem) {
    this.connectionEndPoint.add(connectionEndPointItem);
    return this;
  }

   /**
   * none
   * @return connectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection-end-point")
  public List<ConnectionEndPointRef> getConnectionEndPoint() {
    return connectionEndPoint;
  }

  public void setConnectionEndPoint(List<ConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
  }

  public Connection direction(ForwardingDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * none
   * @return direction
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("direction")
  public ForwardingDirection getDirection() {
    return direction;
  }

  public void setDirection(ForwardingDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection tapiConnectivityConnection = (Connection) o;
    return Objects.equals(this.name, tapiConnectivityConnection.name) &&
        Objects.equals(this.uuid, tapiConnectivityConnection.uuid) &&
        Objects.equals(this.supportedClientLink, tapiConnectivityConnection.supportedClientLink) &&
        Objects.equals(this.lowerConnection, tapiConnectivityConnection.lowerConnection) &&
        Objects.equals(this.switchControl, tapiConnectivityConnection.switchControl) &&
        Objects.equals(this.route, tapiConnectivityConnection.route) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityConnection.layerProtocolName) &&
        Objects.equals(this.connectionEndPoint, tapiConnectivityConnection.connectionEndPoint) &&
        Objects.equals(this.direction, tapiConnectivityConnection.direction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, supportedClientLink, lowerConnection, switchControl, route, layerProtocolName, connectionEndPoint, direction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    supportedClientLink: ").append(toIndentedString(supportedClientLink)).append("\n");
    sb.append("    lowerConnection: ").append(toIndentedString(lowerConnection)).append("\n");
    sb.append("    switchControl: ").append(toIndentedString(switchControl)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

