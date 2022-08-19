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
import com.baidu.dev2.api.sdk.feeddiagnosis.model.BidDiagnosisRes;
import com.baidu.dev2.api.sdk.feeddiagnosis.model.DiagnosisRes;
import com.baidu.dev2.api.sdk.feeddiagnosis.model.IdeaDiagnosisRes;
import com.baidu.dev2.api.sdk.feeddiagnosis.model.KeyFactor;
import com.baidu.dev2.api.sdk.feeddiagnosis.model.LpDiagnosisRes;
import com.baidu.dev2.api.sdk.feeddiagnosis.model.TargetDiagnosisRes;
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
 * FeedUnitDiagnosisDetail
 */
@JsonPropertyOrder({
  FeedUnitDiagnosisDetail.JSON_PROPERTY_UNIT_DIAGNOSIS_RES,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_KEY_FACTOR,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_TARGET_DIAGNOSIS_RES,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_BID_DIAGNOSIS_RES,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_IDEA_DIAGNOSIS_RES,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_LP_DIAGNOSIS_RES,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_ADGROUP_FEED_ID,
  FeedUnitDiagnosisDetail.JSON_PROPERTY_UNEFFICIENT_ADGROUP
})
@JsonTypeName("FeedUnitDiagnosisDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedUnitDiagnosisDetail {
  public static final String JSON_PROPERTY_UNIT_DIAGNOSIS_RES = "unitDiagnosisRes";
  private DiagnosisRes unitDiagnosisRes;

  public static final String JSON_PROPERTY_KEY_FACTOR = "keyFactor";
  private KeyFactor keyFactor;

  public static final String JSON_PROPERTY_TARGET_DIAGNOSIS_RES = "targetDiagnosisRes";
  private TargetDiagnosisRes targetDiagnosisRes;

  public static final String JSON_PROPERTY_BID_DIAGNOSIS_RES = "bidDiagnosisRes";
  private BidDiagnosisRes bidDiagnosisRes;

  public static final String JSON_PROPERTY_IDEA_DIAGNOSIS_RES = "ideaDiagnosisRes";
  private IdeaDiagnosisRes ideaDiagnosisRes;

  public static final String JSON_PROPERTY_LP_DIAGNOSIS_RES = "lpDiagnosisRes";
  private LpDiagnosisRes lpDiagnosisRes;

  public static final String JSON_PROPERTY_ADGROUP_FEED_ID = "adgroupFeedId";
  private Long adgroupFeedId;

  public static final String JSON_PROPERTY_UNEFFICIENT_ADGROUP = "unefficientAdgroup";
  private Integer unefficientAdgroup;

  public FeedUnitDiagnosisDetail() { 
  }

  public FeedUnitDiagnosisDetail unitDiagnosisRes(DiagnosisRes unitDiagnosisRes) {
    
    this.unitDiagnosisRes = unitDiagnosisRes;
    return this;
  }

   /**
   * Get unitDiagnosisRes
   * @return unitDiagnosisRes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiagnosisRes getUnitDiagnosisRes() {
    return unitDiagnosisRes;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitDiagnosisRes(DiagnosisRes unitDiagnosisRes) {
    this.unitDiagnosisRes = unitDiagnosisRes;
  }


  public FeedUnitDiagnosisDetail keyFactor(KeyFactor keyFactor) {
    
    this.keyFactor = keyFactor;
    return this;
  }

   /**
   * Get keyFactor
   * @return keyFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyFactor getKeyFactor() {
    return keyFactor;
  }


  @JsonProperty(JSON_PROPERTY_KEY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyFactor(KeyFactor keyFactor) {
    this.keyFactor = keyFactor;
  }


  public FeedUnitDiagnosisDetail targetDiagnosisRes(TargetDiagnosisRes targetDiagnosisRes) {
    
    this.targetDiagnosisRes = targetDiagnosisRes;
    return this;
  }

   /**
   * Get targetDiagnosisRes
   * @return targetDiagnosisRes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TargetDiagnosisRes getTargetDiagnosisRes() {
    return targetDiagnosisRes;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetDiagnosisRes(TargetDiagnosisRes targetDiagnosisRes) {
    this.targetDiagnosisRes = targetDiagnosisRes;
  }


  public FeedUnitDiagnosisDetail bidDiagnosisRes(BidDiagnosisRes bidDiagnosisRes) {
    
    this.bidDiagnosisRes = bidDiagnosisRes;
    return this;
  }

   /**
   * Get bidDiagnosisRes
   * @return bidDiagnosisRes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BID_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BidDiagnosisRes getBidDiagnosisRes() {
    return bidDiagnosisRes;
  }


  @JsonProperty(JSON_PROPERTY_BID_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidDiagnosisRes(BidDiagnosisRes bidDiagnosisRes) {
    this.bidDiagnosisRes = bidDiagnosisRes;
  }


  public FeedUnitDiagnosisDetail ideaDiagnosisRes(IdeaDiagnosisRes ideaDiagnosisRes) {
    
    this.ideaDiagnosisRes = ideaDiagnosisRes;
    return this;
  }

   /**
   * Get ideaDiagnosisRes
   * @return ideaDiagnosisRes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDEA_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdeaDiagnosisRes getIdeaDiagnosisRes() {
    return ideaDiagnosisRes;
  }


  @JsonProperty(JSON_PROPERTY_IDEA_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdeaDiagnosisRes(IdeaDiagnosisRes ideaDiagnosisRes) {
    this.ideaDiagnosisRes = ideaDiagnosisRes;
  }


  public FeedUnitDiagnosisDetail lpDiagnosisRes(LpDiagnosisRes lpDiagnosisRes) {
    
    this.lpDiagnosisRes = lpDiagnosisRes;
    return this;
  }

   /**
   * Get lpDiagnosisRes
   * @return lpDiagnosisRes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LP_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LpDiagnosisRes getLpDiagnosisRes() {
    return lpDiagnosisRes;
  }


  @JsonProperty(JSON_PROPERTY_LP_DIAGNOSIS_RES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLpDiagnosisRes(LpDiagnosisRes lpDiagnosisRes) {
    this.lpDiagnosisRes = lpDiagnosisRes;
  }


  public FeedUnitDiagnosisDetail adgroupFeedId(Long adgroupFeedId) {
    
    this.adgroupFeedId = adgroupFeedId;
    return this;
  }

   /**
   * Get adgroupFeedId
   * @return adgroupFeedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupFeedId() {
    return adgroupFeedId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupFeedId(Long adgroupFeedId) {
    this.adgroupFeedId = adgroupFeedId;
  }


  public FeedUnitDiagnosisDetail unefficientAdgroup(Integer unefficientAdgroup) {
    
    this.unefficientAdgroup = unefficientAdgroup;
    return this;
  }

   /**
   * Get unefficientAdgroup
   * @return unefficientAdgroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNEFFICIENT_ADGROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnefficientAdgroup() {
    return unefficientAdgroup;
  }


  @JsonProperty(JSON_PROPERTY_UNEFFICIENT_ADGROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnefficientAdgroup(Integer unefficientAdgroup) {
    this.unefficientAdgroup = unefficientAdgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedUnitDiagnosisDetail feedUnitDiagnosisDetail = (FeedUnitDiagnosisDetail) o;
    return Objects.equals(this.unitDiagnosisRes, feedUnitDiagnosisDetail.unitDiagnosisRes) &&
        Objects.equals(this.keyFactor, feedUnitDiagnosisDetail.keyFactor) &&
        Objects.equals(this.targetDiagnosisRes, feedUnitDiagnosisDetail.targetDiagnosisRes) &&
        Objects.equals(this.bidDiagnosisRes, feedUnitDiagnosisDetail.bidDiagnosisRes) &&
        Objects.equals(this.ideaDiagnosisRes, feedUnitDiagnosisDetail.ideaDiagnosisRes) &&
        Objects.equals(this.lpDiagnosisRes, feedUnitDiagnosisDetail.lpDiagnosisRes) &&
        Objects.equals(this.adgroupFeedId, feedUnitDiagnosisDetail.adgroupFeedId) &&
        Objects.equals(this.unefficientAdgroup, feedUnitDiagnosisDetail.unefficientAdgroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitDiagnosisRes, keyFactor, targetDiagnosisRes, bidDiagnosisRes, ideaDiagnosisRes, lpDiagnosisRes, adgroupFeedId, unefficientAdgroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedUnitDiagnosisDetail {\n");
    sb.append("    unitDiagnosisRes: ").append(toIndentedString(unitDiagnosisRes)).append("\n");
    sb.append("    keyFactor: ").append(toIndentedString(keyFactor)).append("\n");
    sb.append("    targetDiagnosisRes: ").append(toIndentedString(targetDiagnosisRes)).append("\n");
    sb.append("    bidDiagnosisRes: ").append(toIndentedString(bidDiagnosisRes)).append("\n");
    sb.append("    ideaDiagnosisRes: ").append(toIndentedString(ideaDiagnosisRes)).append("\n");
    sb.append("    lpDiagnosisRes: ").append(toIndentedString(lpDiagnosisRes)).append("\n");
    sb.append("    adgroupFeedId: ").append(toIndentedString(adgroupFeedId)).append("\n");
    sb.append("    unefficientAdgroup: ").append(toIndentedString(unefficientAdgroup)).append("\n");
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
