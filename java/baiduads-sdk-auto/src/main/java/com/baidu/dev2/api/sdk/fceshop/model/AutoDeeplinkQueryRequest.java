/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fceshop.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.fceshop.model.EshopAutoDeeplinkType;
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
 * AutoDeeplinkQueryRequest
 */
@JsonPropertyOrder({
  AutoDeeplinkQueryRequest.JSON_PROPERTY_DEEPLINK_TYPES
})
@JsonTypeName("AutoDeeplinkQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoDeeplinkQueryRequest {
  public static final String JSON_PROPERTY_DEEPLINK_TYPES = "deeplinkTypes";
  private List<EshopAutoDeeplinkType> deeplinkTypes = null;

  public AutoDeeplinkQueryRequest() { 
  }

  public AutoDeeplinkQueryRequest deeplinkTypes(List<EshopAutoDeeplinkType> deeplinkTypes) {
    
    this.deeplinkTypes = deeplinkTypes;
    return this;
  }

  public AutoDeeplinkQueryRequest addDeeplinkTypesItem(EshopAutoDeeplinkType deeplinkTypesItem) {
    if (this.deeplinkTypes == null) {
      this.deeplinkTypes = new ArrayList<>();
    }
    this.deeplinkTypes.add(deeplinkTypesItem);
    return this;
  }

   /**
   * Get deeplinkTypes
   * @return deeplinkTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEPLINK_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EshopAutoDeeplinkType> getDeeplinkTypes() {
    return deeplinkTypes;
  }


  @JsonProperty(JSON_PROPERTY_DEEPLINK_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeeplinkTypes(List<EshopAutoDeeplinkType> deeplinkTypes) {
    this.deeplinkTypes = deeplinkTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoDeeplinkQueryRequest autoDeeplinkQueryRequest = (AutoDeeplinkQueryRequest) o;
    return Objects.equals(this.deeplinkTypes, autoDeeplinkQueryRequest.deeplinkTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deeplinkTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoDeeplinkQueryRequest {\n");
    sb.append("    deeplinkTypes: ").append(toIndentedString(deeplinkTypes)).append("\n");
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
