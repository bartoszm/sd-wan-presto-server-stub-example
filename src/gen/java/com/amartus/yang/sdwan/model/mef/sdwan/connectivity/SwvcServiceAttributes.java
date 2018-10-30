package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.common.types.OperationalState;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.ApplicationPolicyMappings;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Applications;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.CosPerformanceObjectives;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.PerformanceGroups;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.PerformanceMonitoringSchedule;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Policies;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.ReservedPrefixes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * SwvcServiceAttributes
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class SwvcServiceAttributes   {
  private CosPerformanceObjectives cosPerformanceObjectives = null;

  private List<String> endpoints = new ArrayList<String>();

  private ApplicationPolicyMappings applicationPolicyMappings = null;

  private ReservedPrefixes reservedPrefixes = null;

  private Policies policies = null;

  private PerformanceGroups performanceGroups = null;

  private OperationalState pathMtuDiscovery = null;

  private OperationalState fragmentation = null;

  private Integer mtu = null;

  private String swvcIdentifier = null;

  private PerformanceMonitoringSchedule performanceMonitoringSchedule = null;

  private Applications applications = null;

  public SwvcServiceAttributes cosPerformanceObjectives(CosPerformanceObjectives cosPerformanceObjectives) {
    this.cosPerformanceObjectives = cosPerformanceObjectives;
    return this;
  }

   /**
   * Get cosPerformanceObjectives
   * @return cosPerformanceObjectives
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("cos-performance-objectives")
  public CosPerformanceObjectives getCosPerformanceObjectives() {
    return cosPerformanceObjectives;
  }

  public void setCosPerformanceObjectives(CosPerformanceObjectives cosPerformanceObjectives) {
    this.cosPerformanceObjectives = cosPerformanceObjectives;
  }

  public SwvcServiceAttributes endpoints(List<String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public SwvcServiceAttributes addEndpointsItem(String endpointsItem) {
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("endpoints")
  public List<String> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<String> endpoints) {
    this.endpoints = endpoints;
  }

  public SwvcServiceAttributes applicationPolicyMappings(ApplicationPolicyMappings applicationPolicyMappings) {
    this.applicationPolicyMappings = applicationPolicyMappings;
    return this;
  }

   /**
   * Get applicationPolicyMappings
   * @return applicationPolicyMappings
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("application-policy-mappings")
  public ApplicationPolicyMappings getApplicationPolicyMappings() {
    return applicationPolicyMappings;
  }

  public void setApplicationPolicyMappings(ApplicationPolicyMappings applicationPolicyMappings) {
    this.applicationPolicyMappings = applicationPolicyMappings;
  }

  public SwvcServiceAttributes reservedPrefixes(ReservedPrefixes reservedPrefixes) {
    this.reservedPrefixes = reservedPrefixes;
    return this;
  }

   /**
   * Get reservedPrefixes
   * @return reservedPrefixes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("reserved-prefixes")
  public ReservedPrefixes getReservedPrefixes() {
    return reservedPrefixes;
  }

  public void setReservedPrefixes(ReservedPrefixes reservedPrefixes) {
    this.reservedPrefixes = reservedPrefixes;
  }

  public SwvcServiceAttributes policies(Policies policies) {
    this.policies = policies;
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("policies")
  public Policies getPolicies() {
    return policies;
  }

  public void setPolicies(Policies policies) {
    this.policies = policies;
  }

  public SwvcServiceAttributes performanceGroups(PerformanceGroups performanceGroups) {
    this.performanceGroups = performanceGroups;
    return this;
  }

   /**
   * Get performanceGroups
   * @return performanceGroups
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("performance-groups")
  public PerformanceGroups getPerformanceGroups() {
    return performanceGroups;
  }

  public void setPerformanceGroups(PerformanceGroups performanceGroups) {
    this.performanceGroups = performanceGroups;
  }

  public SwvcServiceAttributes pathMtuDiscovery(OperationalState pathMtuDiscovery) {
    this.pathMtuDiscovery = pathMtuDiscovery;
    return this;
  }

   /**
   * Get pathMtuDiscovery
   * @return pathMtuDiscovery
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("path-mtu-discovery")
  public OperationalState getPathMtuDiscovery() {
    return pathMtuDiscovery;
  }

  public void setPathMtuDiscovery(OperationalState pathMtuDiscovery) {
    this.pathMtuDiscovery = pathMtuDiscovery;
  }

  public SwvcServiceAttributes fragmentation(OperationalState fragmentation) {
    this.fragmentation = fragmentation;
    return this;
  }

   /**
   * Get fragmentation
   * @return fragmentation
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("fragmentation")
  public OperationalState getFragmentation() {
    return fragmentation;
  }

  public void setFragmentation(OperationalState fragmentation) {
    this.fragmentation = fragmentation;
  }

  public SwvcServiceAttributes mtu(Integer mtu) {
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("mtu")
  public Integer getMtu() {
    return mtu;
  }

  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }

  public SwvcServiceAttributes swvcIdentifier(String swvcIdentifier) {
    this.swvcIdentifier = swvcIdentifier;
    return this;
  }

   /**
   * Get swvcIdentifier
   * @return swvcIdentifier
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("swvc-identifier")
  public String getSwvcIdentifier() {
    return swvcIdentifier;
  }

  public void setSwvcIdentifier(String swvcIdentifier) {
    this.swvcIdentifier = swvcIdentifier;
  }

  public SwvcServiceAttributes performanceMonitoringSchedule(PerformanceMonitoringSchedule performanceMonitoringSchedule) {
    this.performanceMonitoringSchedule = performanceMonitoringSchedule;
    return this;
  }

   /**
   * Get performanceMonitoringSchedule
   * @return performanceMonitoringSchedule
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("performance-monitoring-schedule")
  public PerformanceMonitoringSchedule getPerformanceMonitoringSchedule() {
    return performanceMonitoringSchedule;
  }

  public void setPerformanceMonitoringSchedule(PerformanceMonitoringSchedule performanceMonitoringSchedule) {
    this.performanceMonitoringSchedule = performanceMonitoringSchedule;
  }

  public SwvcServiceAttributes applications(Applications applications) {
    this.applications = applications;
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("applications")
  public Applications getApplications() {
    return applications;
  }

  public void setApplications(Applications applications) {
    this.applications = applications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwvcServiceAttributes mefSdwanConnectivitySwvcServiceAttributes = (SwvcServiceAttributes) o;
    return Objects.equals(this.cosPerformanceObjectives, mefSdwanConnectivitySwvcServiceAttributes.cosPerformanceObjectives) &&
        Objects.equals(this.endpoints, mefSdwanConnectivitySwvcServiceAttributes.endpoints) &&
        Objects.equals(this.applicationPolicyMappings, mefSdwanConnectivitySwvcServiceAttributes.applicationPolicyMappings) &&
        Objects.equals(this.reservedPrefixes, mefSdwanConnectivitySwvcServiceAttributes.reservedPrefixes) &&
        Objects.equals(this.policies, mefSdwanConnectivitySwvcServiceAttributes.policies) &&
        Objects.equals(this.performanceGroups, mefSdwanConnectivitySwvcServiceAttributes.performanceGroups) &&
        Objects.equals(this.pathMtuDiscovery, mefSdwanConnectivitySwvcServiceAttributes.pathMtuDiscovery) &&
        Objects.equals(this.fragmentation, mefSdwanConnectivitySwvcServiceAttributes.fragmentation) &&
        Objects.equals(this.mtu, mefSdwanConnectivitySwvcServiceAttributes.mtu) &&
        Objects.equals(this.swvcIdentifier, mefSdwanConnectivitySwvcServiceAttributes.swvcIdentifier) &&
        Objects.equals(this.performanceMonitoringSchedule, mefSdwanConnectivitySwvcServiceAttributes.performanceMonitoringSchedule) &&
        Objects.equals(this.applications, mefSdwanConnectivitySwvcServiceAttributes.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cosPerformanceObjectives, endpoints, applicationPolicyMappings, reservedPrefixes, policies, performanceGroups, pathMtuDiscovery, fragmentation, mtu, swvcIdentifier, performanceMonitoringSchedule, applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwvcServiceAttributes {\n");
    
    sb.append("    cosPerformanceObjectives: ").append(toIndentedString(cosPerformanceObjectives)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    applicationPolicyMappings: ").append(toIndentedString(applicationPolicyMappings)).append("\n");
    sb.append("    reservedPrefixes: ").append(toIndentedString(reservedPrefixes)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    performanceGroups: ").append(toIndentedString(performanceGroups)).append("\n");
    sb.append("    pathMtuDiscovery: ").append(toIndentedString(pathMtuDiscovery)).append("\n");
    sb.append("    fragmentation: ").append(toIndentedString(fragmentation)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    swvcIdentifier: ").append(toIndentedString(swvcIdentifier)).append("\n");
    sb.append("    performanceMonitoringSchedule: ").append(toIndentedString(performanceMonitoringSchedule)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

