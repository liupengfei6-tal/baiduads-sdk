/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.feeddiagnosis.model;

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
 * StrNumEChartVal
 */
@JsonPropertyOrder({
  StrNumEChartVal.JSON_PROPERTY_TIME,
  StrNumEChartVal.JSON_PROPERTY_VAL
})
@JsonTypeName("StrNumEChartVal")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StrNumEChartVal {
  public static final String JSON_PROPERTY_TIME = "time";
  private Object time;

  public static final String JSON_PROPERTY_VAL = "val";
  private Object val;

  public StrNumEChartVal() { 
  }

  public StrNumEChartVal time(Object time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(Object time) {
    this.time = time;
  }


  public StrNumEChartVal val(Object val) {
    
    this.val = val;
    return this;
  }

   /**
   * Get val
   * @return val
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getVal() {
    return val;
  }


  @JsonProperty(JSON_PROPERTY_VAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVal(Object val) {
    this.val = val;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrNumEChartVal strNumEChartVal = (StrNumEChartVal) o;
    return Objects.equals(this.time, strNumEChartVal.time) &&
        Objects.equals(this.val, strNumEChartVal.val);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, val);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrNumEChartVal {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
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
