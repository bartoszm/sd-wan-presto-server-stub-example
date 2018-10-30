package com.amartus.yang.sdwan.model.tapi.path.computation;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.LocalClass;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.amartus.yang.sdwan.model.tapi.common.PortDirection;
import com.amartus.yang.sdwan.model.tapi.common.PortRole;
import com.amartus.yang.sdwan.model.tapi.common.ServiceInterfacePointRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * PathServiceEndPoint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PathServiceEndPoint extends com.amartus.yang.sdwan.model.tapi.common.LocalClass  {
  private PortRole role = null;

  private ServiceInterfacePointRef serviceInterfacePoint = null;

  private LayerProtocolName layerProtocolName = null;

  private String layerProtocolQualifier = null;

  private PortDirection direction = null;

  private Capacity capacity = null;

  public PathServiceEndPoint role(PortRole role) {
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

  public PathServiceEndPoint serviceInterfacePoint(ServiceInterfacePointRef serviceInterfacePoint) {
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

  public PathServiceEndPoint layerProtocolName(LayerProtocolName layerProtocolName) {
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

  public PathServiceEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
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

  public PathServiceEndPoint direction(PortDirection direction) {
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

  public PathServiceEndPoint capacity(Capacity capacity) {
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
    PathServiceEndPoint tapiPathComputationPathServiceEndPoint = (PathServiceEndPoint) o;
    return Objects.equals(this.role, tapiPathComputationPathServiceEndPoint.role) &&
        Objects.equals(this.serviceInterfacePoint, tapiPathComputationPathServiceEndPoint.serviceInterfacePoint) &&
        Objects.equals(this.layerProtocolName, tapiPathComputationPathServiceEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiPathComputationPathServiceEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.direction, tapiPathComputationPathServiceEndPoint.direction) &&
        Objects.equals(this.capacity, tapiPathComputationPathServiceEndPoint.capacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, serviceInterfacePoint, layerProtocolName, layerProtocolQualifier, direction, capacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathServiceEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
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

