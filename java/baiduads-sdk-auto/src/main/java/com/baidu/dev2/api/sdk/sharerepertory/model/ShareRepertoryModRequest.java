/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.sharerepertory.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.sharerepertory.model.ShareRepertoryType;
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
 * ShareRepertoryModRequest
 */
@JsonPropertyOrder({
  ShareRepertoryModRequest.JSON_PROPERTY_SHARE_REPERTORY_TYPES
})
@JsonTypeName("ShareRepertoryModRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShareRepertoryModRequest {
  public static final String JSON_PROPERTY_SHARE_REPERTORY_TYPES = "shareRepertoryTypes";
  private List<ShareRepertoryType> shareRepertoryTypes = null;

  public ShareRepertoryModRequest() { 
  }

  public ShareRepertoryModRequest shareRepertoryTypes(List<ShareRepertoryType> shareRepertoryTypes) {
    
    this.shareRepertoryTypes = shareRepertoryTypes;
    return this;
  }

  public ShareRepertoryModRequest addShareRepertoryTypesItem(ShareRepertoryType shareRepertoryTypesItem) {
    if (this.shareRepertoryTypes == null) {
      this.shareRepertoryTypes = new ArrayList<>();
    }
    this.shareRepertoryTypes.add(shareRepertoryTypesItem);
    return this;
  }

   /**
   * Get shareRepertoryTypes
   * @return shareRepertoryTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARE_REPERTORY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ShareRepertoryType> getShareRepertoryTypes() {
    return shareRepertoryTypes;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_REPERTORY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareRepertoryTypes(List<ShareRepertoryType> shareRepertoryTypes) {
    this.shareRepertoryTypes = shareRepertoryTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareRepertoryModRequest shareRepertoryModRequest = (ShareRepertoryModRequest) o;
    return Objects.equals(this.shareRepertoryTypes, shareRepertoryModRequest.shareRepertoryTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareRepertoryTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareRepertoryModRequest {\n");
    sb.append("    shareRepertoryTypes: ").append(toIndentedString(shareRepertoryTypes)).append("\n");
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

