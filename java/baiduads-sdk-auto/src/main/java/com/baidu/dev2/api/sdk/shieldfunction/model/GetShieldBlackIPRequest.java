/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shieldfunction.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.shieldfunction.model.ShieldCondition;
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
 * GetShieldBlackIPRequest
 */
@JsonPropertyOrder({
  GetShieldBlackIPRequest.JSON_PROPERTY_SORT_FIELD,
  GetShieldBlackIPRequest.JSON_PROPERTY_IS_DESC,
  GetShieldBlackIPRequest.JSON_PROPERTY_CONDITION,
  GetShieldBlackIPRequest.JSON_PROPERTY_LIMIT
})
@JsonTypeName("GetShieldBlackIPRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetShieldBlackIPRequest {
  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_IS_DESC = "isDesc";
  private Boolean isDesc;

  public static final String JSON_PROPERTY_CONDITION = "condition";
  private ShieldCondition condition;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public GetShieldBlackIPRequest() { 
  }

  public GetShieldBlackIPRequest sortField(String sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public GetShieldBlackIPRequest isDesc(Boolean isDesc) {
    
    this.isDesc = isDesc;
    return this;
  }

   /**
   * Get isDesc
   * @return isDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDesc() {
    return isDesc;
  }


  @JsonProperty(JSON_PROPERTY_IS_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDesc(Boolean isDesc) {
    this.isDesc = isDesc;
  }


  public GetShieldBlackIPRequest condition(ShieldCondition condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShieldCondition getCondition() {
    return condition;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(ShieldCondition condition) {
    this.condition = condition;
  }


  public GetShieldBlackIPRequest limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public GetShieldBlackIPRequest addLimitItem(Integer limitItem) {
    if (this.limit == null) {
      this.limit = new ArrayList<>();
    }
    this.limit.add(limitItem);
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(List<Integer> limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShieldBlackIPRequest getShieldBlackIPRequest = (GetShieldBlackIPRequest) o;
    return Objects.equals(this.sortField, getShieldBlackIPRequest.sortField) &&
        Objects.equals(this.isDesc, getShieldBlackIPRequest.isDesc) &&
        Objects.equals(this.condition, getShieldBlackIPRequest.condition) &&
        Objects.equals(this.limit, getShieldBlackIPRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortField, isDesc, condition, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShieldBlackIPRequest {\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

