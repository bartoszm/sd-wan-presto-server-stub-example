package com.amartus.yang.sdwan.model.mef.sdwan.connectivity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PerformanceMonitoringSchedule
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class PerformanceMonitoringSchedule   {
  private String duration = null;

  private String startTime = null;

  public PerformanceMonitoringSchedule duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public PerformanceMonitoringSchedule startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  @JsonProperty("start-time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceMonitoringSchedule mefSdwanConnectivityPerformanceMonitoringSchedule = (PerformanceMonitoringSchedule) o;
    return Objects.equals(this.duration, mefSdwanConnectivityPerformanceMonitoringSchedule.duration) &&
        Objects.equals(this.startTime, mefSdwanConnectivityPerformanceMonitoringSchedule.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceMonitoringSchedule {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

