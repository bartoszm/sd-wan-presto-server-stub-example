package com.amartus.yang.sdwan.model.tapi.common;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ServiceInterfacePoint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ServiceInterfacePoint extends com.amartus.yang.sdwan.model.tapi.common.AdminStatePac  {
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String uuid = null;

  private Capacity availableCapacity = null;

  private Capacity totalPotentialCapacity = null;

  private List<String> supportedLayerProtocolQualifier = new ArrayList<String>();

  private LayerProtocolName layerProtocolName = null;

  public ServiceInterfacePoint name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public ServiceInterfacePoint addNameItem(NameAndValue nameItem) {
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

  public ServiceInterfacePoint uuid(String uuid) {
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

  public ServiceInterfacePoint availableCapacity(Capacity availableCapacity) {
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

  public ServiceInterfacePoint totalPotentialCapacity(Capacity totalPotentialCapacity) {
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

  public ServiceInterfacePoint supportedLayerProtocolQualifier(List<String> supportedLayerProtocolQualifier) {
    this.supportedLayerProtocolQualifier = supportedLayerProtocolQualifier;
    return this;
  }

  public ServiceInterfacePoint addSupportedLayerProtocolQualifierItem(String supportedLayerProtocolQualifierItem) {
    this.supportedLayerProtocolQualifier.add(supportedLayerProtocolQualifierItem);
    return this;
  }

   /**
   * none
   * @return supportedLayerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("supported-layer-protocol-qualifier")
  public List<String> getSupportedLayerProtocolQualifier() {
    return supportedLayerProtocolQualifier;
  }

  public void setSupportedLayerProtocolQualifier(List<String> supportedLayerProtocolQualifier) {
    this.supportedLayerProtocolQualifier = supportedLayerProtocolQualifier;
  }

  public ServiceInterfacePoint layerProtocolName(LayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

   /**
   * Usage of layerProtocolName [>1]  in the ServiceInterfacePoint should be considered experimental
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "Usage of layerProtocolName [>1]  in the ServiceInterfacePoint should be considered experimental")
  @JsonProperty("layer-protocol-name")
  public LayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(LayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInterfacePoint tapiCommonServiceInterfacePoint = (ServiceInterfacePoint) o;
    return Objects.equals(this.name, tapiCommonServiceInterfacePoint.name) &&
        Objects.equals(this.uuid, tapiCommonServiceInterfacePoint.uuid) &&
        Objects.equals(this.availableCapacity, tapiCommonServiceInterfacePoint.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiCommonServiceInterfacePoint.totalPotentialCapacity) &&
        Objects.equals(this.supportedLayerProtocolQualifier, tapiCommonServiceInterfacePoint.supportedLayerProtocolQualifier) &&
        Objects.equals(this.layerProtocolName, tapiCommonServiceInterfacePoint.layerProtocolName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, availableCapacity, totalPotentialCapacity, supportedLayerProtocolQualifier, layerProtocolName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInterfacePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    supportedLayerProtocolQualifier: ").append(toIndentedString(supportedLayerProtocolQualifier)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
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

