/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.pricestrategy.model;

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
 * PriceStrategyQueryRequest
 */
@JsonPropertyOrder({
  PriceStrategyQueryRequest.JSON_PROPERTY_ORDER_BY,
  PriceStrategyQueryRequest.JSON_PROPERTY_FIELDS,
  PriceStrategyQueryRequest.JSON_PROPERTY_STRATEGY_TYPES,
  PriceStrategyQueryRequest.JSON_PROPERTY_STRATEGY_LEVELS,
  PriceStrategyQueryRequest.JSON_PROPERTY_IDS,
  PriceStrategyQueryRequest.JSON_PROPERTY_ID_TYPE
})
@JsonTypeName("PriceStrategyQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceStrategyQueryRequest {
  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  private String orderBy;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = null;

  public static final String JSON_PROPERTY_STRATEGY_TYPES = "strategyTypes";
  private List<Integer> strategyTypes = null;

  public static final String JSON_PROPERTY_STRATEGY_LEVELS = "strategyLevels";
  private List<Integer> strategyLevels = null;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public PriceStrategyQueryRequest() { 
  }

  public PriceStrategyQueryRequest orderBy(String orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderBy() {
    return orderBy;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }


  public PriceStrategyQueryRequest fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public PriceStrategyQueryRequest addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public PriceStrategyQueryRequest strategyTypes(List<Integer> strategyTypes) {
    
    this.strategyTypes = strategyTypes;
    return this;
  }

  public PriceStrategyQueryRequest addStrategyTypesItem(Integer strategyTypesItem) {
    if (this.strategyTypes == null) {
      this.strategyTypes = new ArrayList<>();
    }
    this.strategyTypes.add(strategyTypesItem);
    return this;
  }

   /**
   * Get strategyTypes
   * @return strategyTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getStrategyTypes() {
    return strategyTypes;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyTypes(List<Integer> strategyTypes) {
    this.strategyTypes = strategyTypes;
  }


  public PriceStrategyQueryRequest strategyLevels(List<Integer> strategyLevels) {
    
    this.strategyLevels = strategyLevels;
    return this;
  }

  public PriceStrategyQueryRequest addStrategyLevelsItem(Integer strategyLevelsItem) {
    if (this.strategyLevels == null) {
      this.strategyLevels = new ArrayList<>();
    }
    this.strategyLevels.add(strategyLevelsItem);
    return this;
  }

   /**
   * Get strategyLevels
   * @return strategyLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getStrategyLevels() {
    return strategyLevels;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyLevels(List<Integer> strategyLevels) {
    this.strategyLevels = strategyLevels;
  }


  public PriceStrategyQueryRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public PriceStrategyQueryRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public PriceStrategyQueryRequest idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceStrategyQueryRequest priceStrategyQueryRequest = (PriceStrategyQueryRequest) o;
    return Objects.equals(this.orderBy, priceStrategyQueryRequest.orderBy) &&
        Objects.equals(this.fields, priceStrategyQueryRequest.fields) &&
        Objects.equals(this.strategyTypes, priceStrategyQueryRequest.strategyTypes) &&
        Objects.equals(this.strategyLevels, priceStrategyQueryRequest.strategyLevels) &&
        Objects.equals(this.ids, priceStrategyQueryRequest.ids) &&
        Objects.equals(this.idType, priceStrategyQueryRequest.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, fields, strategyTypes, strategyLevels, ids, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceStrategyQueryRequest {\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    strategyTypes: ").append(toIndentedString(strategyTypes)).append("\n");
    sb.append("    strategyLevels: ").append(toIndentedString(strategyLevels)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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
