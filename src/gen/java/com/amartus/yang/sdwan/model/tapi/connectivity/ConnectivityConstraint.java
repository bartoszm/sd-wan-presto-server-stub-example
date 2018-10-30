package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.Capacity;
import com.amartus.yang.sdwan.model.tapi.common.ForwardingDirection;
import com.amartus.yang.sdwan.model.tapi.common.LayerProtocolName;
import com.amartus.yang.sdwan.model.tapi.common.TimeRange;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectivityServiceRef;
import com.amartus.yang.sdwan.model.tapi.connectivity.ServiceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * ConnectivityConstraint
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class ConnectivityConstraint   {
  private LayerProtocolName serviceLayer = null;

  private TimeRange schedule = null;

  private ForwardingDirection connectivityDirection = null;

  private Capacity requestedCapacity = null;

  private List<ConnectivityServiceRef> diversityExclusion = new ArrayList<ConnectivityServiceRef>();

  private String serviceLevel = null;

  private ServiceType serviceType = null;

  private ConnectivityServiceRef corouteInclusion = null;

  public ConnectivityConstraint serviceLayer(LayerProtocolName serviceLayer) {
    this.serviceLayer = serviceLayer;
    return this;
  }

   /**
   * none
   * @return serviceLayer
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service-layer")
  public LayerProtocolName getServiceLayer() {
    return serviceLayer;
  }

  public void setServiceLayer(LayerProtocolName serviceLayer) {
    this.serviceLayer = serviceLayer;
  }

  public ConnectivityConstraint schedule(TimeRange schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * none
   * @return schedule
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("schedule")
  public TimeRange getSchedule() {
    return schedule;
  }

  public void setSchedule(TimeRange schedule) {
    this.schedule = schedule;
  }

  public ConnectivityConstraint connectivityDirection(ForwardingDirection connectivityDirection) {
    this.connectivityDirection = connectivityDirection;
    return this;
  }

   /**
   * none
   * @return connectivityDirection
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connectivity-direction")
  public ForwardingDirection getConnectivityDirection() {
    return connectivityDirection;
  }

  public void setConnectivityDirection(ForwardingDirection connectivityDirection) {
    this.connectivityDirection = connectivityDirection;
  }

  public ConnectivityConstraint requestedCapacity(Capacity requestedCapacity) {
    this.requestedCapacity = requestedCapacity;
    return this;
  }

   /**
   * none
   * @return requestedCapacity
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("requested-capacity")
  public Capacity getRequestedCapacity() {
    return requestedCapacity;
  }

  public void setRequestedCapacity(Capacity requestedCapacity) {
    this.requestedCapacity = requestedCapacity;
  }

  public ConnectivityConstraint diversityExclusion(List<ConnectivityServiceRef> diversityExclusion) {
    this.diversityExclusion = diversityExclusion;
    return this;
  }

  public ConnectivityConstraint addDiversityExclusionItem(ConnectivityServiceRef diversityExclusionItem) {
    this.diversityExclusion.add(diversityExclusionItem);
    return this;
  }

   /**
   * none
   * @return diversityExclusion
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("diversity-exclusion")
  public List<ConnectivityServiceRef> getDiversityExclusion() {
    return diversityExclusion;
  }

  public void setDiversityExclusion(List<ConnectivityServiceRef> diversityExclusion) {
    this.diversityExclusion = diversityExclusion;
  }

  public ConnectivityConstraint serviceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * An abstract value the meaning of which is mutually agreed – typically represents metrics such as - Class of service, priority, resiliency, availability
   * @return serviceLevel
  **/
  @ApiModelProperty(value = "An abstract value the meaning of which is mutually agreed – typically represents metrics such as - Class of service, priority, resiliency, availability")
  @JsonProperty("service-level")
  public String getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public ConnectivityConstraint serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * none
   * @return serviceType
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("service-type")
  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public ConnectivityConstraint corouteInclusion(ConnectivityServiceRef corouteInclusion) {
    this.corouteInclusion = corouteInclusion;
    return this;
  }

   /**
   * none
   * @return corouteInclusion
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("coroute-inclusion")
  public ConnectivityServiceRef getCorouteInclusion() {
    return corouteInclusion;
  }

  public void setCorouteInclusion(ConnectivityServiceRef corouteInclusion) {
    this.corouteInclusion = corouteInclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectivityConstraint tapiConnectivityConnectivityConstraint = (ConnectivityConstraint) o;
    return Objects.equals(this.serviceLayer, tapiConnectivityConnectivityConstraint.serviceLayer) &&
        Objects.equals(this.schedule, tapiConnectivityConnectivityConstraint.schedule) &&
        Objects.equals(this.connectivityDirection, tapiConnectivityConnectivityConstraint.connectivityDirection) &&
        Objects.equals(this.requestedCapacity, tapiConnectivityConnectivityConstraint.requestedCapacity) &&
        Objects.equals(this.diversityExclusion, tapiConnectivityConnectivityConstraint.diversityExclusion) &&
        Objects.equals(this.serviceLevel, tapiConnectivityConnectivityConstraint.serviceLevel) &&
        Objects.equals(this.serviceType, tapiConnectivityConnectivityConstraint.serviceType) &&
        Objects.equals(this.corouteInclusion, tapiConnectivityConnectivityConstraint.corouteInclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLayer, schedule, connectivityDirection, requestedCapacity, diversityExclusion, serviceLevel, serviceType, corouteInclusion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectivityConstraint {\n");
    
    sb.append("    serviceLayer: ").append(toIndentedString(serviceLayer)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    connectivityDirection: ").append(toIndentedString(connectivityDirection)).append("\n");
    sb.append("    requestedCapacity: ").append(toIndentedString(requestedCapacity)).append("\n");
    sb.append("    diversityExclusion: ").append(toIndentedString(diversityExclusion)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    corouteInclusion: ").append(toIndentedString(corouteInclusion)).append("\n");
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

