package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.AdminStatePac;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LifecycleState;
import com.amartus.yang.sdwan.model.tapi.common.LocalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.OperationalState;
import com.amartus.yang.sdwan.model.tapi.common.PortDirection;
import com.amartus.yang.sdwan.model.tapi.common.PortRole;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePointRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionEndPointRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ProtectionRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ConnectivityServiceEndPoint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ConnectivityServiceEndPoint extends com.amartus.yang.sdwan.model.tapi.common.AdminStatePac  {
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String localId = null;

  private ProtectionRole protectionRole = null;

  private PortRole role = null;

  private ServiceInterfacePointRef serviceInterfacePoint = null;

  private LayerProtocolName layerProtocolName = null;

  private String layerProtocolQualifier = null;

  private List<ConnectionEndPointRef> connectionEndPoint = new ArrayList<ConnectionEndPointRef>();

  private PortDirection direction = null;

  private Capacity capacity = null;

  public ConnectivityServiceEndPoint name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public ConnectivityServiceEndPoint addNameItem(NameAndValue nameItem) {
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

  public ConnectivityServiceEndPoint localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * none
   * @return localId
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("local-id")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public ConnectivityServiceEndPoint protectionRole(ProtectionRole protectionRole) {
    this.protectionRole = protectionRole;
    return this;
  }

   /**
   * To specify the protection role of this Port when create or update ConnectivityService.
   * @return protectionRole
  **/
  @ApiModelProperty(value = "To specify the protection role of this Port when create or update ConnectivityService.")
  @JsonProperty("protection-role")
  public ProtectionRole getProtectionRole() {
    return protectionRole;
  }

  public void setProtectionRole(ProtectionRole protectionRole) {
    this.protectionRole = protectionRole;
  }

  public ConnectivityServiceEndPoint role(PortRole role) {
    this.role = role;
    return this;
  }

   /**
   * Each EP of the FC has a role (e.g., working, protection, protected, symmetric, hub, spoke, leaf, root)  in the context of the FC with respect to the FC function. 
   * @return role
  **/
  @ApiModelProperty(value = "Each EP of the FC has a role (e.g., working, protection, protected, symmetric, hub, spoke, leaf, root)  in the context of the FC with respect to the FC function. ")
  @JsonProperty("role")
  public PortRole getRole() {
    return role;
  }

  public void setRole(PortRole role) {
    this.role = role;
  }

  public ConnectivityServiceEndPoint serviceInterfacePoint(ServiceInterfacePointRef serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
    return this;
  }

   /**
   * none
   * @return serviceInterfacePoint
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service-interface-point")
  public ServiceInterfacePointRef getServiceInterfacePoint() {
    return serviceInterfacePoint;
  }

  public void setServiceInterfacePoint(ServiceInterfacePointRef serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
  }

  public ConnectivityServiceEndPoint layerProtocolName(LayerProtocolName layerProtocolName) {
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

  public ConnectivityServiceEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
    return this;
  }

   /**
   * none
   * @return layerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("layer-protocol-qualifier")
  public String getLayerProtocolQualifier() {
    return layerProtocolQualifier;
  }

  public void setLayerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
  }

  public ConnectivityServiceEndPoint connectionEndPoint(List<ConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public ConnectivityServiceEndPoint addConnectionEndPointItem(ConnectionEndPointRef connectionEndPointItem) {
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

  public ConnectivityServiceEndPoint direction(PortDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The orientation of defined flow at the EndPoint.
   * @return direction
  **/
  @ApiModelProperty(value = "The orientation of defined flow at the EndPoint.")
  @JsonProperty("direction")
  public PortDirection getDirection() {
    return direction;
  }

  public void setDirection(PortDirection direction) {
    this.direction = direction;
  }

  public ConnectivityServiceEndPoint capacity(Capacity capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * none
   * @return capacity
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("capacity")
  public Capacity getCapacity() {
    return capacity;
  }

  public void setCapacity(Capacity capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectivityServiceEndPoint tapiConnectivityConnectivityServiceEndPoint = (ConnectivityServiceEndPoint) o;
    return Objects.equals(this.name, tapiConnectivityConnectivityServiceEndPoint.name) &&
        Objects.equals(this.localId, tapiConnectivityConnectivityServiceEndPoint.localId) &&
        Objects.equals(this.protectionRole, tapiConnectivityConnectivityServiceEndPoint.protectionRole) &&
        Objects.equals(this.role, tapiConnectivityConnectivityServiceEndPoint.role) &&
        Objects.equals(this.serviceInterfacePoint, tapiConnectivityConnectivityServiceEndPoint.serviceInterfacePoint) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityConnectivityServiceEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiConnectivityConnectivityServiceEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.connectionEndPoint, tapiConnectivityConnectivityServiceEndPoint.connectionEndPoint) &&
        Objects.equals(this.direction, tapiConnectivityConnectivityServiceEndPoint.direction) &&
        Objects.equals(this.capacity, tapiConnectivityConnectivityServiceEndPoint.capacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId, protectionRole, role, serviceInterfacePoint, layerProtocolName, layerProtocolQualifier, connectionEndPoint, direction, capacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectivityServiceEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    protectionRole: ").append(toIndentedString(protectionRole)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

