package com.amartus.yang.sdwan.model.tapi.connectivity;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionRef;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * SwitchControlRef
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class SwitchControlRef extends com.amartus.yang.sdwan.model.tapi.connectivity.ConnectionRef  {
  private String switchControlUuid = null;

  public SwitchControlRef switchControlUuid(String switchControlUuid) {
    this.switchControlUuid = switchControlUuid;
    return this;
  }

   /**
   * none
   * @return switchControlUuid
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("switch-control-uuid")
  public String getSwitchControlUuid() {
    return switchControlUuid;
  }

  public void setSwitchControlUuid(String switchControlUuid) {
    this.switchControlUuid = switchControlUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchControlRef tapiConnectivitySwitchControlRef = (SwitchControlRef) o;
    return Objects.equals(this.switchControlUuid, tapiConnectivitySwitchControlRef.switchControlUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchControlUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchControlRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    switchControlUuid: ").append(toIndentedString(switchControlUuid)).append("\n");
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

