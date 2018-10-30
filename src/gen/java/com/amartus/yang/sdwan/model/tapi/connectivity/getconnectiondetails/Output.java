package com.amartus.yang.sdwan.model.tapi.connectivity.getconnectiondetails;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.connectivity.Connection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Output
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class Output   {
  private Connection connection = null;

  public Output connection(Connection connection) {
    this.connection = connection;
    return this;
  }

   /**
   * none
   * @return connection
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("connection")
  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output tapiConnectivityGetconnectiondetailsOutput = (Output) o;
    return Objects.equals(this.connection, tapiConnectivityGetconnectiondetailsOutput.connection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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

