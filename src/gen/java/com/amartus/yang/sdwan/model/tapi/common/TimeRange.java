package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * TimeRange
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class TimeRange   {
  private String endTime = null;

  private String startTime = null;

  public TimeRange endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * none
   * @return endTime
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("end-time")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public TimeRange startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * none
   * @return startTime
  **/
  @ApiModelProperty(value = "none")
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
    TimeRange tapiCommonTimeRange = (TimeRange) o;
    return Objects.equals(this.endTime, tapiCommonTimeRange.endTime) &&
        Objects.equals(this.startTime, tapiCommonTimeRange.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeRange {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

