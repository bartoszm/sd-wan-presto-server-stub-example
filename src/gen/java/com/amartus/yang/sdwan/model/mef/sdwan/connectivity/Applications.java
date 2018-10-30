package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.mef.sdwan.connectivity.Application;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Applications
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Applications   {
  private List<Application> application = new ArrayList<Application>();

  public Applications application(List<Application> application) {
    this.application = application;
    return this;
  }

  public Applications addApplicationItem(Application applicationItem) {
    this.application.add(applicationItem);
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  public List<Application> getApplication() {
    return application;
  }

  public void setApplication(List<Application> application) {
    this.application = application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Applications mefSdwanConnectivityApplications = (Applications) o;
    return Objects.equals(this.application, mefSdwanConnectivityApplications.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applications {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

