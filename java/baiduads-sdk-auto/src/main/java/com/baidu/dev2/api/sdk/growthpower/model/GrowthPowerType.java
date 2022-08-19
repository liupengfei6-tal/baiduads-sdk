/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.growthpower.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.growthpower.model.GrowthIndicator;
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
 * GrowthPowerType
 */
@JsonPropertyOrder({
  GrowthPowerType.JSON_PROPERTY_GROWTH_LEVEL,
  GrowthPowerType.JSON_PROPERTY_INDICATORS
})
@JsonTypeName("GrowthPowerType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GrowthPowerType {
  public static final String JSON_PROPERTY_GROWTH_LEVEL = "growthLevel";
  private Integer growthLevel;

  public static final String JSON_PROPERTY_INDICATORS = "indicators";
  private List<GrowthIndicator> indicators = null;

  public GrowthPowerType() { 
  }

  public GrowthPowerType growthLevel(Integer growthLevel) {
    
    this.growthLevel = growthLevel;
    return this;
  }

   /**
   * Get growthLevel
   * @return growthLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROWTH_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGrowthLevel() {
    return growthLevel;
  }


  @JsonProperty(JSON_PROPERTY_GROWTH_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrowthLevel(Integer growthLevel) {
    this.growthLevel = growthLevel;
  }


  public GrowthPowerType indicators(List<GrowthIndicator> indicators) {
    
    this.indicators = indicators;
    return this;
  }

  public GrowthPowerType addIndicatorsItem(GrowthIndicator indicatorsItem) {
    if (this.indicators == null) {
      this.indicators = new ArrayList<>();
    }
    this.indicators.add(indicatorsItem);
    return this;
  }

   /**
   * Get indicators
   * @return indicators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDICATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GrowthIndicator> getIndicators() {
    return indicators;
  }


  @JsonProperty(JSON_PROPERTY_INDICATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndicators(List<GrowthIndicator> indicators) {
    this.indicators = indicators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrowthPowerType growthPowerType = (GrowthPowerType) o;
    return Objects.equals(this.growthLevel, growthPowerType.growthLevel) &&
        Objects.equals(this.indicators, growthPowerType.indicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(growthLevel, indicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrowthPowerType {\n");
    sb.append("    growthLevel: ").append(toIndentedString(growthLevel)).append("\n");
    sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
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

