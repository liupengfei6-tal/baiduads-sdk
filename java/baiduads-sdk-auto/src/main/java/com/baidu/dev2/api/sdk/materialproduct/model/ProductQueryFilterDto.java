/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialproduct.model;

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
 * ProductQueryFilterDto
 */
@JsonPropertyOrder({
  ProductQueryFilterDto.JSON_PROPERTY_FILTER_QUERY_FIELD,
  ProductQueryFilterDto.JSON_PROPERTY_EXT_QUERY_FIELD
})
@JsonTypeName("ProductQueryFilterDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductQueryFilterDto {
  public static final String JSON_PROPERTY_FILTER_QUERY_FIELD = "filterQueryField";
  private List<String> filterQueryField = null;

  public static final String JSON_PROPERTY_EXT_QUERY_FIELD = "extQueryField";
  private List<String> extQueryField = null;

  public ProductQueryFilterDto() { 
  }

  public ProductQueryFilterDto filterQueryField(List<String> filterQueryField) {
    
    this.filterQueryField = filterQueryField;
    return this;
  }

  public ProductQueryFilterDto addFilterQueryFieldItem(String filterQueryFieldItem) {
    if (this.filterQueryField == null) {
      this.filterQueryField = new ArrayList<>();
    }
    this.filterQueryField.add(filterQueryFieldItem);
    return this;
  }

   /**
   * Get filterQueryField
   * @return filterQueryField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER_QUERY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFilterQueryField() {
    return filterQueryField;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_QUERY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterQueryField(List<String> filterQueryField) {
    this.filterQueryField = filterQueryField;
  }


  public ProductQueryFilterDto extQueryField(List<String> extQueryField) {
    
    this.extQueryField = extQueryField;
    return this;
  }

  public ProductQueryFilterDto addExtQueryFieldItem(String extQueryFieldItem) {
    if (this.extQueryField == null) {
      this.extQueryField = new ArrayList<>();
    }
    this.extQueryField.add(extQueryFieldItem);
    return this;
  }

   /**
   * Get extQueryField
   * @return extQueryField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXT_QUERY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExtQueryField() {
    return extQueryField;
  }


  @JsonProperty(JSON_PROPERTY_EXT_QUERY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtQueryField(List<String> extQueryField) {
    this.extQueryField = extQueryField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductQueryFilterDto productQueryFilterDto = (ProductQueryFilterDto) o;
    return Objects.equals(this.filterQueryField, productQueryFilterDto.filterQueryField) &&
        Objects.equals(this.extQueryField, productQueryFilterDto.extQueryField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterQueryField, extQueryField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductQueryFilterDto {\n");
    sb.append("    filterQueryField: ").append(toIndentedString(filterQueryField)).append("\n");
    sb.append("    extQueryField: ").append(toIndentedString(extQueryField)).append("\n");
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

