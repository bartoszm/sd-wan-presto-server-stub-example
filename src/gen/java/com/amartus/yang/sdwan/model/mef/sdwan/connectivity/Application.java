package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Criteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Application
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Application   {
  private String appId = null;

  private String appGroup = null;

  private List<Criteria> criteria = new ArrayList<Criteria>();

  public Application appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("app-id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Application appGroup(String appGroup) {
    this.appGroup = appGroup;
    return this;
  }

   /**
   * Get appGroup
   * @return appGroup
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("app-group")
  public String getAppGroup() {
    return appGroup;
  }

  public void setAppGroup(String appGroup) {
    this.appGroup = appGroup;
  }

  public Application criteria(List<Criteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Application addCriteriaItem(Criteria criteriaItem) {
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("criteria")
  public List<Criteria> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criteria> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application mefSdwanConnectivityApplication = (Application) o;
    return Objects.equals(this.appId, mefSdwanConnectivityApplication.appId) &&
        Objects.equals(this.appGroup, mefSdwanConnectivityApplication.appGroup) &&
        Objects.equals(this.criteria, mefSdwanConnectivityApplication.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appGroup, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appGroup: ").append(toIndentedString(appGroup)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

