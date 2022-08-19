/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shield.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.shield.model.ShieldBlackIPType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ShieldIPModRequest
 */
@JsonPropertyOrder({
  ShieldIPModRequest.JSON_PROPERTY_BLACK_I_P_TYPES
})
@JsonTypeName("ShieldIPModRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShieldIPModRequest {
  public static final String JSON_PROPERTY_BLACK_I_P_TYPES = "blackIPTypes";
  private List<ShieldBlackIPType> blackIPTypes = null;

  public ShieldIPModRequest() { 
  }

  public ShieldIPModRequest blackIPTypes(List<ShieldBlackIPType> blackIPTypes) {
    
    this.blackIPTypes = blackIPTypes;
    return this;
  }

  public ShieldIPModRequest addBlackIPTypesItem(ShieldBlackIPType blackIPTypesItem) {
    if (this.blackIPTypes == null) {
      this.blackIPTypes = new ArrayList<>();
    }
    this.blackIPTypes.add(blackIPTypesItem);
    return this;
  }

   /**
   * Get blackIPTypes
   * @return blackIPTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BLACK_I_P_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ShieldBlackIPType> getBlackIPTypes() {
    return blackIPTypes;
  }


  @JsonProperty(JSON_PROPERTY_BLACK_I_P_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlackIPTypes(List<ShieldBlackIPType> blackIPTypes) {
    this.blackIPTypes = blackIPTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldIPModRequest shieldIPModRequest = (ShieldIPModRequest) o;
    return Objects.equals(this.blackIPTypes, shieldIPModRequest.blackIPTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blackIPTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShieldIPModRequest {\n");
    sb.append("    blackIPTypes: ").append(toIndentedString(blackIPTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
