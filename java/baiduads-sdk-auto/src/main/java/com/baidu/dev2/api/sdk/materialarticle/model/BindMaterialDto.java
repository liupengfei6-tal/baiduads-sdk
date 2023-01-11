/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialarticle.model;

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
 * BindMaterialDto
 */
@JsonPropertyOrder({
  BindMaterialDto.JSON_PROPERTY_MATERIAL_TYPE,
  BindMaterialDto.JSON_PROPERTY_BIND_COUNT
})
@JsonTypeName("BindMaterialDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BindMaterialDto {
  public static final String JSON_PROPERTY_MATERIAL_TYPE = "materialType";
  private Integer materialType;

  public static final String JSON_PROPERTY_BIND_COUNT = "bindCount";
  private Integer bindCount;

  public BindMaterialDto() { 
  }

  public BindMaterialDto materialType(Integer materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaterialType() {
    return materialType;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialType(Integer materialType) {
    this.materialType = materialType;
  }


  public BindMaterialDto bindCount(Integer bindCount) {
    
    this.bindCount = bindCount;
    return this;
  }

   /**
   * Get bindCount
   * @return bindCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBindCount() {
    return bindCount;
  }


  @JsonProperty(JSON_PROPERTY_BIND_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindCount(Integer bindCount) {
    this.bindCount = bindCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BindMaterialDto bindMaterialDto = (BindMaterialDto) o;
    return Objects.equals(this.materialType, bindMaterialDto.materialType) &&
        Objects.equals(this.bindCount, bindMaterialDto.bindCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialType, bindCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BindMaterialDto {\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    bindCount: ").append(toIndentedString(bindCount)).append("\n");
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

