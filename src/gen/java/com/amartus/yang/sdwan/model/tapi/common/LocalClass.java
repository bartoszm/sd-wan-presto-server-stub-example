package com.amartus.yang.sdwan.model.tapi.common;

import java.util.Objects;
import com.amartus.yang.sdwan.model.tapi.common.NameAndValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * LocalClass
 */
@javax.annotation.Generated(value = "class com.mrv.yangutils.codegen.JerseyServerCodegen", date = "2018-10-26T16:19:33.232+02:00")
public class LocalClass   {
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  private String localId = null;

  public LocalClass name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public LocalClass addNameItem(NameAndValue nameItem) {
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

  public LocalClass localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * none
   * @return localId
  **/
  @ApiModelProperty(value = "none")
  @JsonProperty("local-id")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalClass tapiCommonLocalClass = (LocalClass) o;
    return Objects.equals(this.name, tapiCommonLocalClass.name) &&
        Objects.equals(this.localId, tapiCommonLocalClass.localId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalClass {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
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

