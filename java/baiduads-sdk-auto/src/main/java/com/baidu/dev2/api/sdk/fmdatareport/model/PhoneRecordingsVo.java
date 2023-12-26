/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fmdatareport.model;

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
 * PhoneRecordingsVo
 */
@JsonPropertyOrder({
  PhoneRecordingsVo.JSON_PROPERTY_CALL_LOG_ID,
  PhoneRecordingsVo.JSON_PROPERTY_RECORDING_URL
})
@JsonTypeName("PhoneRecordingsVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneRecordingsVo {
  public static final String JSON_PROPERTY_CALL_LOG_ID = "callLogId";
  private String callLogId;

  public static final String JSON_PROPERTY_RECORDING_URL = "recordingUrl";
  private String recordingUrl;

  public PhoneRecordingsVo() { 
  }

  public PhoneRecordingsVo callLogId(String callLogId) {
    
    this.callLogId = callLogId;
    return this;
  }

   /**
   * Get callLogId
   * @return callLogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallLogId() {
    return callLogId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallLogId(String callLogId) {
    this.callLogId = callLogId;
  }


  public PhoneRecordingsVo recordingUrl(String recordingUrl) {
    
    this.recordingUrl = recordingUrl;
    return this;
  }

   /**
   * Get recordingUrl
   * @return recordingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordingUrl() {
    return recordingUrl;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingUrl(String recordingUrl) {
    this.recordingUrl = recordingUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneRecordingsVo phoneRecordingsVo = (PhoneRecordingsVo) o;
    return Objects.equals(this.callLogId, phoneRecordingsVo.callLogId) &&
        Objects.equals(this.recordingUrl, phoneRecordingsVo.recordingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callLogId, recordingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneRecordingsVo {\n");
    sb.append("    callLogId: ").append(toIndentedString(callLogId)).append("\n");
    sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
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
