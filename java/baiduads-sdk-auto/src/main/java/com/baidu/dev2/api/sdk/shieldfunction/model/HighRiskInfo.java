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
 * HighRiskInfo
 */
@JsonPropertyOrder({
  HighRiskInfo.JSON_PROPERTY_ID,
  HighRiskInfo.JSON_PROPERTY_USER_ID,
  HighRiskInfo.JSON_PROPERTY_VIEW,
  HighRiskInfo.JSON_PROPERTY_VIEW_TYPE,
  HighRiskInfo.JSON_PROPERTY_DESC,
  HighRiskInfo.JSON_PROPERTY_IP_LIST,
  HighRiskInfo.JSON_PROPERTY_DEVICE_TYPE,
  HighRiskInfo.JSON_PROPERTY_IDENTITY_SYSTEM,
  HighRiskInfo.JSON_PROPERTY_SHIELD_NUM,
  HighRiskInfo.JSON_PROPERTY_SHIELD_TYPE,
  HighRiskInfo.JSON_PROPERTY_ADD_TIME
})
@JsonTypeName("HighRiskInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HighRiskInfo {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_VIEW = "view";
  private String view;

  public static final String JSON_PROPERTY_VIEW_TYPE = "viewType";
  private Integer viewType;

  public static final String JSON_PROPERTY_DESC = "desc";
  private String desc;

  public static final String JSON_PROPERTY_IP_LIST = "ipList";
  private String ipList;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "deviceType";
  private Integer deviceType;

  public static final String JSON_PROPERTY_IDENTITY_SYSTEM = "identitySystem";
  private String identitySystem;

  public static final String JSON_PROPERTY_SHIELD_NUM = "shieldNum";
  private Long shieldNum;

  public static final String JSON_PROPERTY_SHIELD_TYPE = "shieldType";
  private Integer shieldType;

  public static final String JSON_PROPERTY_ADD_TIME = "addTime";
  private String addTime;

  public HighRiskInfo() { 
  }

  public HighRiskInfo id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public HighRiskInfo userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public HighRiskInfo view(String view) {
    
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getView() {
    return view;
  }


  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setView(String view) {
    this.view = view;
  }


  public HighRiskInfo viewType(Integer viewType) {
    
    this.viewType = viewType;
    return this;
  }

   /**
   * Get viewType
   * @return viewType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIEW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getViewType() {
    return viewType;
  }


  @JsonProperty(JSON_PROPERTY_VIEW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewType(Integer viewType) {
    this.viewType = viewType;
  }


  public HighRiskInfo desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(String desc) {
    this.desc = desc;
  }


  public HighRiskInfo ipList(String ipList) {
    
    this.ipList = ipList;
    return this;
  }

   /**
   * Get ipList
   * @return ipList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpList() {
    return ipList;
  }


  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpList(String ipList) {
    this.ipList = ipList;
  }


  public HighRiskInfo deviceType(Integer deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeviceType() {
    return deviceType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }


  public HighRiskInfo identitySystem(String identitySystem) {
    
    this.identitySystem = identitySystem;
    return this;
  }

   /**
   * Get identitySystem
   * @return identitySystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTITY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentitySystem() {
    return identitySystem;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentitySystem(String identitySystem) {
    this.identitySystem = identitySystem;
  }


  public HighRiskInfo shieldNum(Long shieldNum) {
    
    this.shieldNum = shieldNum;
    return this;
  }

   /**
   * Get shieldNum
   * @return shieldNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIELD_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShieldNum() {
    return shieldNum;
  }


  @JsonProperty(JSON_PROPERTY_SHIELD_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShieldNum(Long shieldNum) {
    this.shieldNum = shieldNum;
  }


  public HighRiskInfo shieldType(Integer shieldType) {
    
    this.shieldType = shieldType;
    return this;
  }

   /**
   * Get shieldType
   * @return shieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShieldType() {
    return shieldType;
  }


  @JsonProperty(JSON_PROPERTY_SHIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShieldType(Integer shieldType) {
    this.shieldType = shieldType;
  }


  public HighRiskInfo addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * Get addTime
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighRiskInfo highRiskInfo = (HighRiskInfo) o;
    return Objects.equals(this.id, highRiskInfo.id) &&
        Objects.equals(this.userId, highRiskInfo.userId) &&
        Objects.equals(this.view, highRiskInfo.view) &&
        Objects.equals(this.viewType, highRiskInfo.viewType) &&
        Objects.equals(this.desc, highRiskInfo.desc) &&
        Objects.equals(this.ipList, highRiskInfo.ipList) &&
        Objects.equals(this.deviceType, highRiskInfo.deviceType) &&
        Objects.equals(this.identitySystem, highRiskInfo.identitySystem) &&
        Objects.equals(this.shieldNum, highRiskInfo.shieldNum) &&
        Objects.equals(this.shieldType, highRiskInfo.shieldType) &&
        Objects.equals(this.addTime, highRiskInfo.addTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, view, viewType, desc, ipList, deviceType, identitySystem, shieldNum, shieldType, addTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighRiskInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    identitySystem: ").append(toIndentedString(identitySystem)).append("\n");
    sb.append("    shieldNum: ").append(toIndentedString(shieldNum)).append("\n");
    sb.append("    shieldType: ").append(toIndentedString(shieldType)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
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

