package com.amartus.yang.sdwan.model.tapi.common.updateserviceinterfacepoint;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.AdministrativeState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Input
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Input   {
  private String sipIdOrName = null;

  private AdministrativeState state = null;

  public Input sipIdOrName(String sipIdOrName) {
    this.sipIdOrName = sipIdOrName;
    return this;
  }

   /**
   * none
   * @return sipIdOrName
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("sip-id-or-name")
  public String getSipIdOrName() {
    return sipIdOrName;
  }

  public void setSipIdOrName(String sipIdOrName) {
    this.sipIdOrName = sipIdOrName;
  }

  public Input state(AdministrativeState state) {
    this.state = state;
    return this;
  }

   /**
   * none
   * @return state
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("state")
  public AdministrativeState getState() {
    return state;
  }

  public void setState(AdministrativeState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input tapiCommonUpdateserviceinterfacepointInput = (Input) o;
    return Objects.equals(this.sipIdOrName, tapiCommonUpdateserviceinterfacepointInput.sipIdOrName) &&
        Objects.equals(this.state, tapiCommonUpdateserviceinterfacepointInput.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sipIdOrName, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    sipIdOrName: ").append(toIndentedString(sipIdOrName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

