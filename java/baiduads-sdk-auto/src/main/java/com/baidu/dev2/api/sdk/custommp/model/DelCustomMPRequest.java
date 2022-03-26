/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.custommp.model;

import java.util.Objects;
import java.util.Arrays;
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
 * DelCustomMPRequest
 */
@JsonPropertyOrder({
  DelCustomMPRequest.JSON_PROPERTY_MPIDS
})
@JsonTypeName("DelCustomMPRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DelCustomMPRequest {
  public static final String JSON_PROPERTY_MPIDS = "mpids";
  private List<Long> mpids = null;

  public DelCustomMPRequest() { 
  }

  public DelCustomMPRequest mpids(List<Long> mpids) {
    
    this.mpids = mpids;
    return this;
  }

  public DelCustomMPRequest addMpidsItem(Long mpidsItem) {
    if (this.mpids == null) {
      this.mpids = new ArrayList<>();
    }
    this.mpids.add(mpidsItem);
    return this;
  }

   /**
   * Get mpids
   * @return mpids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MPIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getMpids() {
    return mpids;
  }


  @JsonProperty(JSON_PROPERTY_MPIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMpids(List<Long> mpids) {
    this.mpids = mpids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelCustomMPRequest delCustomMPRequest = (DelCustomMPRequest) o;
    return Objects.equals(this.mpids, delCustomMPRequest.mpids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mpids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelCustomMPRequest {\n");
    sb.append("    mpids: ").append(toIndentedString(mpids)).append("\n");
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
