/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shield.model;

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
 * ShieldPolicyType
 */
@JsonPropertyOrder({
  ShieldPolicyType.JSON_PROPERTY_POLICY_ID,
  ShieldPolicyType.JSON_PROPERTY_USER_ID,
  ShieldPolicyType.JSON_PROPERTY_POLICY_NAME,
  ShieldPolicyType.JSON_PROPERTY_TIME_SLOT,
  ShieldPolicyType.JSON_PROPERTY_THRESHOLD,
  ShieldPolicyType.JSON_PROPERTY_CAMPAIGN_IDS,
  ShieldPolicyType.JSON_PROPERTY_BIND_TYPE,
  ShieldPolicyType.JSON_PROPERTY_POLICY_TYPE,
  ShieldPolicyType.JSON_PROPERTY_IS_DEL,
  ShieldPolicyType.JSON_PROPERTY_IS_PAUSE,
  ShieldPolicyType.JSON_PROPERTY_SUGGESTION,
  ShieldPolicyType.JSON_PROPERTY_ADD_TIME,
  ShieldPolicyType.JSON_PROPERTY_MOD_TIME,
  ShieldPolicyType.JSON_PROPERTY_ANTI_POLICY_ID
})
@JsonTypeName("ShieldPolicyType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShieldPolicyType {
  public static final String JSON_PROPERTY_POLICY_ID = "policyId";
  private Long policyId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_POLICY_NAME = "policyName";
  private String policyName;

  public static final String JSON_PROPERTY_TIME_SLOT = "timeSlot";
  private Long timeSlot;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Long threshold;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_BIND_TYPE = "bindType";
  private Integer bindType;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policyType";
  private Integer policyType;

  public static final String JSON_PROPERTY_IS_DEL = "isDel";
  private Integer isDel;

  public static final String JSON_PROPERTY_IS_PAUSE = "isPause";
  private Integer isPause;

  public static final String JSON_PROPERTY_SUGGESTION = "suggestion";
  private Integer suggestion;

  public static final String JSON_PROPERTY_ADD_TIME = "addTime";
  private String addTime;

  public static final String JSON_PROPERTY_MOD_TIME = "modTime";
  private String modTime;

  public static final String JSON_PROPERTY_ANTI_POLICY_ID = "antiPolicyId";
  private Long antiPolicyId;

  public ShieldPolicyType() { 
  }

  public ShieldPolicyType policyId(Long policyId) {
    
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPolicyId() {
    return policyId;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }


  public ShieldPolicyType userId(Long userId) {
    
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


  public ShieldPolicyType policyName(String policyName) {
    
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolicyName() {
    return policyName;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public ShieldPolicyType timeSlot(Long timeSlot) {
    
    this.timeSlot = timeSlot;
    return this;
  }

   /**
   * Get timeSlot
   * @return timeSlot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_SLOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeSlot() {
    return timeSlot;
  }


  @JsonProperty(JSON_PROPERTY_TIME_SLOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeSlot(Long timeSlot) {
    this.timeSlot = timeSlot;
  }


  public ShieldPolicyType threshold(Long threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getThreshold() {
    return threshold;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }


  public ShieldPolicyType campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ShieldPolicyType addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public ShieldPolicyType bindType(Integer bindType) {
    
    this.bindType = bindType;
    return this;
  }

   /**
   * Get bindType
   * @return bindType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBindType() {
    return bindType;
  }


  @JsonProperty(JSON_PROPERTY_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindType(Integer bindType) {
    this.bindType = bindType;
  }


  public ShieldPolicyType policyType(Integer policyType) {
    
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPolicyType() {
    return policyType;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyType(Integer policyType) {
    this.policyType = policyType;
  }


  public ShieldPolicyType isDel(Integer isDel) {
    
    this.isDel = isDel;
    return this;
  }

   /**
   * Get isDel
   * @return isDel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsDel() {
    return isDel;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDel(Integer isDel) {
    this.isDel = isDel;
  }


  public ShieldPolicyType isPause(Integer isPause) {
    
    this.isPause = isPause;
    return this;
  }

   /**
   * Get isPause
   * @return isPause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsPause() {
    return isPause;
  }


  @JsonProperty(JSON_PROPERTY_IS_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPause(Integer isPause) {
    this.isPause = isPause;
  }


  public ShieldPolicyType suggestion(Integer suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSuggestion() {
    return suggestion;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestion(Integer suggestion) {
    this.suggestion = suggestion;
  }


  public ShieldPolicyType addTime(String addTime) {
    
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


  public ShieldPolicyType modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * Get modTime
   * @return modTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModTime() {
    return modTime;
  }


  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  public ShieldPolicyType antiPolicyId(Long antiPolicyId) {
    
    this.antiPolicyId = antiPolicyId;
    return this;
  }

   /**
   * Get antiPolicyId
   * @return antiPolicyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANTI_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAntiPolicyId() {
    return antiPolicyId;
  }


  @JsonProperty(JSON_PROPERTY_ANTI_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntiPolicyId(Long antiPolicyId) {
    this.antiPolicyId = antiPolicyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldPolicyType shieldPolicyType = (ShieldPolicyType) o;
    return Objects.equals(this.policyId, shieldPolicyType.policyId) &&
        Objects.equals(this.userId, shieldPolicyType.userId) &&
        Objects.equals(this.policyName, shieldPolicyType.policyName) &&
        Objects.equals(this.timeSlot, shieldPolicyType.timeSlot) &&
        Objects.equals(this.threshold, shieldPolicyType.threshold) &&
        Objects.equals(this.campaignIds, shieldPolicyType.campaignIds) &&
        Objects.equals(this.bindType, shieldPolicyType.bindType) &&
        Objects.equals(this.policyType, shieldPolicyType.policyType) &&
        Objects.equals(this.isDel, shieldPolicyType.isDel) &&
        Objects.equals(this.isPause, shieldPolicyType.isPause) &&
        Objects.equals(this.suggestion, shieldPolicyType.suggestion) &&
        Objects.equals(this.addTime, shieldPolicyType.addTime) &&
        Objects.equals(this.modTime, shieldPolicyType.modTime) &&
        Objects.equals(this.antiPolicyId, shieldPolicyType.antiPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, userId, policyName, timeSlot, threshold, campaignIds, bindType, policyType, isDel, isPause, suggestion, addTime, modTime, antiPolicyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShieldPolicyType {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    isDel: ").append(toIndentedString(isDel)).append("\n");
    sb.append("    isPause: ").append(toIndentedString(isPause)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    antiPolicyId: ").append(toIndentedString(antiPolicyId)).append("\n");
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

