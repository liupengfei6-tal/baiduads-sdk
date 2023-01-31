/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platproduct.model;

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
 * PlatProductDeliveryConfigVo
 */
@JsonPropertyOrder({
  PlatProductDeliveryConfigVo.JSON_PROPERTY_SWITCHER,
  PlatProductDeliveryConfigVo.JSON_PROPERTY_PREDICT_DELIVERY_DAY
})
@JsonTypeName("PlatProductDeliveryConfigVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatProductDeliveryConfigVo {
  public static final String JSON_PROPERTY_SWITCHER = "switcher";
  private Boolean switcher;

  public static final String JSON_PROPERTY_PREDICT_DELIVERY_DAY = "predictDeliveryDay";
  private Integer predictDeliveryDay;

  public PlatProductDeliveryConfigVo() { 
  }

  public PlatProductDeliveryConfigVo switcher(Boolean switcher) {
    
    this.switcher = switcher;
    return this;
  }

   /**
   * Get switcher
   * @return switcher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SWITCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSwitcher() {
    return switcher;
  }


  @JsonProperty(JSON_PROPERTY_SWITCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwitcher(Boolean switcher) {
    this.switcher = switcher;
  }


  public PlatProductDeliveryConfigVo predictDeliveryDay(Integer predictDeliveryDay) {
    
    this.predictDeliveryDay = predictDeliveryDay;
    return this;
  }

   /**
   * Get predictDeliveryDay
   * @return predictDeliveryDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREDICT_DELIVERY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPredictDeliveryDay() {
    return predictDeliveryDay;
  }


  @JsonProperty(JSON_PROPERTY_PREDICT_DELIVERY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredictDeliveryDay(Integer predictDeliveryDay) {
    this.predictDeliveryDay = predictDeliveryDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatProductDeliveryConfigVo platProductDeliveryConfigVo = (PlatProductDeliveryConfigVo) o;
    return Objects.equals(this.switcher, platProductDeliveryConfigVo.switcher) &&
        Objects.equals(this.predictDeliveryDay, platProductDeliveryConfigVo.predictDeliveryDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switcher, predictDeliveryDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatProductDeliveryConfigVo {\n");
    sb.append("    switcher: ").append(toIndentedString(switcher)).append("\n");
    sb.append("    predictDeliveryDay: ").append(toIndentedString(predictDeliveryDay)).append("\n");
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
