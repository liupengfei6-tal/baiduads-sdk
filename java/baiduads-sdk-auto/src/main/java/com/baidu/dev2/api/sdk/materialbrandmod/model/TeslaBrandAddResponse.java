/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialbrandmod.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TeslaBrandAddResponse
 */
@JsonPropertyOrder({
  TeslaBrandAddResponse.JSON_PROPERTY_BRAND_ID
})
@JsonTypeName("TeslaBrandAddResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaBrandAddResponse {
  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private Long brandId;

  public TeslaBrandAddResponse() { 
  }

  public TeslaBrandAddResponse brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaBrandAddResponse teslaBrandAddResponse = (TeslaBrandAddResponse) o;
    return Objects.equals(this.brandId, teslaBrandAddResponse.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaBrandAddResponse {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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

