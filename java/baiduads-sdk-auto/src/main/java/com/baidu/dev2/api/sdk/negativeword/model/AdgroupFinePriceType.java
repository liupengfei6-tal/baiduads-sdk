/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.negativeword.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.negativeword.model.AreaPriceFactor;
import com.baidu.dev2.api.sdk.negativeword.model.CampaignExternalFlow;
import com.baidu.dev2.api.sdk.negativeword.model.CrowdPriceType;
import com.baidu.dev2.api.sdk.negativeword.model.DistancePriceFactorType;
import com.baidu.dev2.api.sdk.negativeword.model.MoreStylePriceType;
import com.baidu.dev2.api.sdk.negativeword.model.RegionPriceFactor;
import com.baidu.dev2.api.sdk.negativeword.model.SchedulePriceFactor;
import com.baidu.dev2.api.sdk.negativeword.model.StrategyPriceType;
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
 * AdgroupFinePriceType
 */
@JsonPropertyOrder({
  AdgroupFinePriceType.JSON_PROPERTY_DEVICEPREFER,
  AdgroupFinePriceType.JSON_PROPERTY_MOBILE_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_ACCU_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_WORD_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_WIDE_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_MATCH_PRICE_FACTOR_STATUS,
  AdgroupFinePriceType.JSON_PROPERTY_HCT_STATUS,
  AdgroupFinePriceType.JSON_PROPERTY_REMARKETING_STATUS,
  AdgroupFinePriceType.JSON_PROPERTY_REMARKETING_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_REMARKETING_PAUSE_STATUS,
  AdgroupFinePriceType.JSON_PROPERTY_REGION_TARGET,
  AdgroupFinePriceType.JSON_PROPERTY_REGION_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_DISTANCE_PRICE_STATUS,
  AdgroupFinePriceType.JSON_PROPERTY_DISTANCE_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_AREA_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_SCHEDULE,
  AdgroupFinePriceType.JSON_PROPERTY_SCHEDULE_PRICE_FACTORS,
  AdgroupFinePriceType.JSON_PROPERTY_EXTERNAL_FLOW_TYPE,
  AdgroupFinePriceType.JSON_PROPERTY_MORE_STYLE_BID_TYPE,
  AdgroupFinePriceType.JSON_PROPERTY_BIDPREFER,
  AdgroupFinePriceType.JSON_PROPERTY_PC_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_CM_STATUS,
  AdgroupFinePriceType.JSON_PROPERTY_STRATEGY_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_CROWD_PRICE_FACTORS,
  AdgroupFinePriceType.JSON_PROPERTY_OCPC_SECOND_STAGE,
  AdgroupFinePriceType.JSON_PROPERTY_MIN_VALID_STRATEGY_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_MAX_VALID_STRATEGY_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_MIN_UNVALID_STRATEGY_PRICE_FACTOR,
  AdgroupFinePriceType.JSON_PROPERTY_MAX_UNVALID_STRATEGY_PRICE_FACTOR
})
@JsonTypeName("AdgroupFinePriceType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdgroupFinePriceType {
  public static final String JSON_PROPERTY_DEVICEPREFER = "deviceprefer";
  private Integer deviceprefer;

  public static final String JSON_PROPERTY_MOBILE_PRICE_FACTOR = "mobilePriceFactor";
  private Double mobilePriceFactor;

  public static final String JSON_PROPERTY_ACCU_PRICE_FACTOR = "accuPriceFactor";
  private Double accuPriceFactor;

  public static final String JSON_PROPERTY_WORD_PRICE_FACTOR = "wordPriceFactor";
  private Double wordPriceFactor;

  public static final String JSON_PROPERTY_WIDE_PRICE_FACTOR = "widePriceFactor";
  private Double widePriceFactor;

  public static final String JSON_PROPERTY_MATCH_PRICE_FACTOR_STATUS = "matchPriceFactorStatus";
  private Integer matchPriceFactorStatus;

  public static final String JSON_PROPERTY_HCT_STATUS = "hctStatus";
  private Integer hctStatus;

  public static final String JSON_PROPERTY_REMARKETING_STATUS = "remarketingStatus";
  private Integer remarketingStatus;

  public static final String JSON_PROPERTY_REMARKETING_PRICE_FACTOR = "remarketingPriceFactor";
  private Double remarketingPriceFactor;

  public static final String JSON_PROPERTY_REMARKETING_PAUSE_STATUS = "remarketingPauseStatus";
  private Integer remarketingPauseStatus;

  public static final String JSON_PROPERTY_REGION_TARGET = "regionTarget";
  private List<Integer> regionTarget = null;

  public static final String JSON_PROPERTY_REGION_PRICE_FACTOR = "regionPriceFactor";
  private List<RegionPriceFactor> regionPriceFactor = null;

  public static final String JSON_PROPERTY_DISTANCE_PRICE_STATUS = "distancePriceStatus";
  private Integer distancePriceStatus;

  public static final String JSON_PROPERTY_DISTANCE_PRICE_FACTOR = "distancePriceFactor";
  private List<DistancePriceFactorType> distancePriceFactor = null;

  public static final String JSON_PROPERTY_AREA_PRICE_FACTOR = "areaPriceFactor";
  private List<AreaPriceFactor> areaPriceFactor = null;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private List<List<Integer>> schedule = null;

  public static final String JSON_PROPERTY_SCHEDULE_PRICE_FACTORS = "schedulePriceFactors";
  private List<SchedulePriceFactor> schedulePriceFactors = null;

  public static final String JSON_PROPERTY_EXTERNAL_FLOW_TYPE = "externalFlowType";
  private List<CampaignExternalFlow> externalFlowType = null;

  public static final String JSON_PROPERTY_MORE_STYLE_BID_TYPE = "moreStyleBidType";
  private MoreStylePriceType moreStyleBidType;

  public static final String JSON_PROPERTY_BIDPREFER = "bidprefer";
  private Integer bidprefer;

  public static final String JSON_PROPERTY_PC_PRICE_FACTOR = "pcPriceFactor";
  private Double pcPriceFactor;

  public static final String JSON_PROPERTY_CM_STATUS = "cmStatus";
  private Integer cmStatus;

  public static final String JSON_PROPERTY_STRATEGY_PRICE_FACTOR = "strategyPriceFactor";
  private StrategyPriceType strategyPriceFactor;

  public static final String JSON_PROPERTY_CROWD_PRICE_FACTORS = "crowdPriceFactors";
  private List<CrowdPriceType> crowdPriceFactors = null;

  public static final String JSON_PROPERTY_OCPC_SECOND_STAGE = "ocpcSecondStage";
  private Boolean ocpcSecondStage;

  public static final String JSON_PROPERTY_MIN_VALID_STRATEGY_PRICE_FACTOR = "minValidStrategyPriceFactor";
  private Double minValidStrategyPriceFactor;

  public static final String JSON_PROPERTY_MAX_VALID_STRATEGY_PRICE_FACTOR = "maxValidStrategyPriceFactor";
  private Double maxValidStrategyPriceFactor;

  public static final String JSON_PROPERTY_MIN_UNVALID_STRATEGY_PRICE_FACTOR = "minUnvalidStrategyPriceFactor";
  private Double minUnvalidStrategyPriceFactor;

  public static final String JSON_PROPERTY_MAX_UNVALID_STRATEGY_PRICE_FACTOR = "maxUnvalidStrategyPriceFactor";
  private Double maxUnvalidStrategyPriceFactor;

  public AdgroupFinePriceType() { 
  }

  public AdgroupFinePriceType deviceprefer(Integer deviceprefer) {
    
    this.deviceprefer = deviceprefer;
    return this;
  }

   /**
   * Get deviceprefer
   * @return deviceprefer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICEPREFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeviceprefer() {
    return deviceprefer;
  }


  @JsonProperty(JSON_PROPERTY_DEVICEPREFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceprefer(Integer deviceprefer) {
    this.deviceprefer = deviceprefer;
  }


  public AdgroupFinePriceType mobilePriceFactor(Double mobilePriceFactor) {
    
    this.mobilePriceFactor = mobilePriceFactor;
    return this;
  }

   /**
   * Get mobilePriceFactor
   * @return mobilePriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMobilePriceFactor() {
    return mobilePriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePriceFactor(Double mobilePriceFactor) {
    this.mobilePriceFactor = mobilePriceFactor;
  }


  public AdgroupFinePriceType accuPriceFactor(Double accuPriceFactor) {
    
    this.accuPriceFactor = accuPriceFactor;
    return this;
  }

   /**
   * Get accuPriceFactor
   * @return accuPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCU_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAccuPriceFactor() {
    return accuPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_ACCU_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccuPriceFactor(Double accuPriceFactor) {
    this.accuPriceFactor = accuPriceFactor;
  }


  public AdgroupFinePriceType wordPriceFactor(Double wordPriceFactor) {
    
    this.wordPriceFactor = wordPriceFactor;
    return this;
  }

   /**
   * Get wordPriceFactor
   * @return wordPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORD_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWordPriceFactor() {
    return wordPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_WORD_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWordPriceFactor(Double wordPriceFactor) {
    this.wordPriceFactor = wordPriceFactor;
  }


  public AdgroupFinePriceType widePriceFactor(Double widePriceFactor) {
    
    this.widePriceFactor = widePriceFactor;
    return this;
  }

   /**
   * Get widePriceFactor
   * @return widePriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDE_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWidePriceFactor() {
    return widePriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_WIDE_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidePriceFactor(Double widePriceFactor) {
    this.widePriceFactor = widePriceFactor;
  }


  public AdgroupFinePriceType matchPriceFactorStatus(Integer matchPriceFactorStatus) {
    
    this.matchPriceFactorStatus = matchPriceFactorStatus;
    return this;
  }

   /**
   * Get matchPriceFactorStatus
   * @return matchPriceFactorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_PRICE_FACTOR_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchPriceFactorStatus() {
    return matchPriceFactorStatus;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_PRICE_FACTOR_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchPriceFactorStatus(Integer matchPriceFactorStatus) {
    this.matchPriceFactorStatus = matchPriceFactorStatus;
  }


  public AdgroupFinePriceType hctStatus(Integer hctStatus) {
    
    this.hctStatus = hctStatus;
    return this;
  }

   /**
   * Get hctStatus
   * @return hctStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HCT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHctStatus() {
    return hctStatus;
  }


  @JsonProperty(JSON_PROPERTY_HCT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHctStatus(Integer hctStatus) {
    this.hctStatus = hctStatus;
  }


  public AdgroupFinePriceType remarketingStatus(Integer remarketingStatus) {
    
    this.remarketingStatus = remarketingStatus;
    return this;
  }

   /**
   * Get remarketingStatus
   * @return remarketingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMARKETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRemarketingStatus() {
    return remarketingStatus;
  }


  @JsonProperty(JSON_PROPERTY_REMARKETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemarketingStatus(Integer remarketingStatus) {
    this.remarketingStatus = remarketingStatus;
  }


  public AdgroupFinePriceType remarketingPriceFactor(Double remarketingPriceFactor) {
    
    this.remarketingPriceFactor = remarketingPriceFactor;
    return this;
  }

   /**
   * Get remarketingPriceFactor
   * @return remarketingPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMARKETING_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRemarketingPriceFactor() {
    return remarketingPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_REMARKETING_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemarketingPriceFactor(Double remarketingPriceFactor) {
    this.remarketingPriceFactor = remarketingPriceFactor;
  }


  public AdgroupFinePriceType remarketingPauseStatus(Integer remarketingPauseStatus) {
    
    this.remarketingPauseStatus = remarketingPauseStatus;
    return this;
  }

   /**
   * Get remarketingPauseStatus
   * @return remarketingPauseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMARKETING_PAUSE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRemarketingPauseStatus() {
    return remarketingPauseStatus;
  }


  @JsonProperty(JSON_PROPERTY_REMARKETING_PAUSE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemarketingPauseStatus(Integer remarketingPauseStatus) {
    this.remarketingPauseStatus = remarketingPauseStatus;
  }


  public AdgroupFinePriceType regionTarget(List<Integer> regionTarget) {
    
    this.regionTarget = regionTarget;
    return this;
  }

  public AdgroupFinePriceType addRegionTargetItem(Integer regionTargetItem) {
    if (this.regionTarget == null) {
      this.regionTarget = new ArrayList<>();
    }
    this.regionTarget.add(regionTargetItem);
    return this;
  }

   /**
   * Get regionTarget
   * @return regionTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getRegionTarget() {
    return regionTarget;
  }


  @JsonProperty(JSON_PROPERTY_REGION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionTarget(List<Integer> regionTarget) {
    this.regionTarget = regionTarget;
  }


  public AdgroupFinePriceType regionPriceFactor(List<RegionPriceFactor> regionPriceFactor) {
    
    this.regionPriceFactor = regionPriceFactor;
    return this;
  }

  public AdgroupFinePriceType addRegionPriceFactorItem(RegionPriceFactor regionPriceFactorItem) {
    if (this.regionPriceFactor == null) {
      this.regionPriceFactor = new ArrayList<>();
    }
    this.regionPriceFactor.add(regionPriceFactorItem);
    return this;
  }

   /**
   * Get regionPriceFactor
   * @return regionPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RegionPriceFactor> getRegionPriceFactor() {
    return regionPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_REGION_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionPriceFactor(List<RegionPriceFactor> regionPriceFactor) {
    this.regionPriceFactor = regionPriceFactor;
  }


  public AdgroupFinePriceType distancePriceStatus(Integer distancePriceStatus) {
    
    this.distancePriceStatus = distancePriceStatus;
    return this;
  }

   /**
   * Get distancePriceStatus
   * @return distancePriceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTANCE_PRICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDistancePriceStatus() {
    return distancePriceStatus;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE_PRICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistancePriceStatus(Integer distancePriceStatus) {
    this.distancePriceStatus = distancePriceStatus;
  }


  public AdgroupFinePriceType distancePriceFactor(List<DistancePriceFactorType> distancePriceFactor) {
    
    this.distancePriceFactor = distancePriceFactor;
    return this;
  }

  public AdgroupFinePriceType addDistancePriceFactorItem(DistancePriceFactorType distancePriceFactorItem) {
    if (this.distancePriceFactor == null) {
      this.distancePriceFactor = new ArrayList<>();
    }
    this.distancePriceFactor.add(distancePriceFactorItem);
    return this;
  }

   /**
   * Get distancePriceFactor
   * @return distancePriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTANCE_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DistancePriceFactorType> getDistancePriceFactor() {
    return distancePriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistancePriceFactor(List<DistancePriceFactorType> distancePriceFactor) {
    this.distancePriceFactor = distancePriceFactor;
  }


  public AdgroupFinePriceType areaPriceFactor(List<AreaPriceFactor> areaPriceFactor) {
    
    this.areaPriceFactor = areaPriceFactor;
    return this;
  }

  public AdgroupFinePriceType addAreaPriceFactorItem(AreaPriceFactor areaPriceFactorItem) {
    if (this.areaPriceFactor == null) {
      this.areaPriceFactor = new ArrayList<>();
    }
    this.areaPriceFactor.add(areaPriceFactorItem);
    return this;
  }

   /**
   * Get areaPriceFactor
   * @return areaPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AREA_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AreaPriceFactor> getAreaPriceFactor() {
    return areaPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_AREA_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreaPriceFactor(List<AreaPriceFactor> areaPriceFactor) {
    this.areaPriceFactor = areaPriceFactor;
  }


  public AdgroupFinePriceType schedule(List<List<Integer>> schedule) {
    
    this.schedule = schedule;
    return this;
  }

  public AdgroupFinePriceType addScheduleItem(List<Integer> scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<Integer>> getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(List<List<Integer>> schedule) {
    this.schedule = schedule;
  }


  public AdgroupFinePriceType schedulePriceFactors(List<SchedulePriceFactor> schedulePriceFactors) {
    
    this.schedulePriceFactors = schedulePriceFactors;
    return this;
  }

  public AdgroupFinePriceType addSchedulePriceFactorsItem(SchedulePriceFactor schedulePriceFactorsItem) {
    if (this.schedulePriceFactors == null) {
      this.schedulePriceFactors = new ArrayList<>();
    }
    this.schedulePriceFactors.add(schedulePriceFactorsItem);
    return this;
  }

   /**
   * Get schedulePriceFactors
   * @return schedulePriceFactors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_PRICE_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SchedulePriceFactor> getSchedulePriceFactors() {
    return schedulePriceFactors;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_PRICE_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedulePriceFactors(List<SchedulePriceFactor> schedulePriceFactors) {
    this.schedulePriceFactors = schedulePriceFactors;
  }


  public AdgroupFinePriceType externalFlowType(List<CampaignExternalFlow> externalFlowType) {
    
    this.externalFlowType = externalFlowType;
    return this;
  }

  public AdgroupFinePriceType addExternalFlowTypeItem(CampaignExternalFlow externalFlowTypeItem) {
    if (this.externalFlowType == null) {
      this.externalFlowType = new ArrayList<>();
    }
    this.externalFlowType.add(externalFlowTypeItem);
    return this;
  }

   /**
   * Get externalFlowType
   * @return externalFlowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_FLOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignExternalFlow> getExternalFlowType() {
    return externalFlowType;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_FLOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalFlowType(List<CampaignExternalFlow> externalFlowType) {
    this.externalFlowType = externalFlowType;
  }


  public AdgroupFinePriceType moreStyleBidType(MoreStylePriceType moreStyleBidType) {
    
    this.moreStyleBidType = moreStyleBidType;
    return this;
  }

   /**
   * Get moreStyleBidType
   * @return moreStyleBidType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MORE_STYLE_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MoreStylePriceType getMoreStyleBidType() {
    return moreStyleBidType;
  }


  @JsonProperty(JSON_PROPERTY_MORE_STYLE_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMoreStyleBidType(MoreStylePriceType moreStyleBidType) {
    this.moreStyleBidType = moreStyleBidType;
  }


  public AdgroupFinePriceType bidprefer(Integer bidprefer) {
    
    this.bidprefer = bidprefer;
    return this;
  }

   /**
   * Get bidprefer
   * @return bidprefer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDPREFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBidprefer() {
    return bidprefer;
  }


  @JsonProperty(JSON_PROPERTY_BIDPREFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidprefer(Integer bidprefer) {
    this.bidprefer = bidprefer;
  }


  public AdgroupFinePriceType pcPriceFactor(Double pcPriceFactor) {
    
    this.pcPriceFactor = pcPriceFactor;
    return this;
  }

   /**
   * Get pcPriceFactor
   * @return pcPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPcPriceFactor() {
    return pcPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_PC_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcPriceFactor(Double pcPriceFactor) {
    this.pcPriceFactor = pcPriceFactor;
  }


  public AdgroupFinePriceType cmStatus(Integer cmStatus) {
    
    this.cmStatus = cmStatus;
    return this;
  }

   /**
   * Get cmStatus
   * @return cmStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCmStatus() {
    return cmStatus;
  }


  @JsonProperty(JSON_PROPERTY_CM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmStatus(Integer cmStatus) {
    this.cmStatus = cmStatus;
  }


  public AdgroupFinePriceType strategyPriceFactor(StrategyPriceType strategyPriceFactor) {
    
    this.strategyPriceFactor = strategyPriceFactor;
    return this;
  }

   /**
   * Get strategyPriceFactor
   * @return strategyPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StrategyPriceType getStrategyPriceFactor() {
    return strategyPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyPriceFactor(StrategyPriceType strategyPriceFactor) {
    this.strategyPriceFactor = strategyPriceFactor;
  }


  public AdgroupFinePriceType crowdPriceFactors(List<CrowdPriceType> crowdPriceFactors) {
    
    this.crowdPriceFactors = crowdPriceFactors;
    return this;
  }

  public AdgroupFinePriceType addCrowdPriceFactorsItem(CrowdPriceType crowdPriceFactorsItem) {
    if (this.crowdPriceFactors == null) {
      this.crowdPriceFactors = new ArrayList<>();
    }
    this.crowdPriceFactors.add(crowdPriceFactorsItem);
    return this;
  }

   /**
   * Get crowdPriceFactors
   * @return crowdPriceFactors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CROWD_PRICE_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CrowdPriceType> getCrowdPriceFactors() {
    return crowdPriceFactors;
  }


  @JsonProperty(JSON_PROPERTY_CROWD_PRICE_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrowdPriceFactors(List<CrowdPriceType> crowdPriceFactors) {
    this.crowdPriceFactors = crowdPriceFactors;
  }


  public AdgroupFinePriceType ocpcSecondStage(Boolean ocpcSecondStage) {
    
    this.ocpcSecondStage = ocpcSecondStage;
    return this;
  }

   /**
   * Get ocpcSecondStage
   * @return ocpcSecondStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_SECOND_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOcpcSecondStage() {
    return ocpcSecondStage;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_SECOND_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcSecondStage(Boolean ocpcSecondStage) {
    this.ocpcSecondStage = ocpcSecondStage;
  }


  public AdgroupFinePriceType minValidStrategyPriceFactor(Double minValidStrategyPriceFactor) {
    
    this.minValidStrategyPriceFactor = minValidStrategyPriceFactor;
    return this;
  }

   /**
   * Get minValidStrategyPriceFactor
   * @return minValidStrategyPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_VALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMinValidStrategyPriceFactor() {
    return minValidStrategyPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_MIN_VALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinValidStrategyPriceFactor(Double minValidStrategyPriceFactor) {
    this.minValidStrategyPriceFactor = minValidStrategyPriceFactor;
  }


  public AdgroupFinePriceType maxValidStrategyPriceFactor(Double maxValidStrategyPriceFactor) {
    
    this.maxValidStrategyPriceFactor = maxValidStrategyPriceFactor;
    return this;
  }

   /**
   * Get maxValidStrategyPriceFactor
   * @return maxValidStrategyPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_VALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxValidStrategyPriceFactor() {
    return maxValidStrategyPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_MAX_VALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxValidStrategyPriceFactor(Double maxValidStrategyPriceFactor) {
    this.maxValidStrategyPriceFactor = maxValidStrategyPriceFactor;
  }


  public AdgroupFinePriceType minUnvalidStrategyPriceFactor(Double minUnvalidStrategyPriceFactor) {
    
    this.minUnvalidStrategyPriceFactor = minUnvalidStrategyPriceFactor;
    return this;
  }

   /**
   * Get minUnvalidStrategyPriceFactor
   * @return minUnvalidStrategyPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_UNVALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMinUnvalidStrategyPriceFactor() {
    return minUnvalidStrategyPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_MIN_UNVALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinUnvalidStrategyPriceFactor(Double minUnvalidStrategyPriceFactor) {
    this.minUnvalidStrategyPriceFactor = minUnvalidStrategyPriceFactor;
  }


  public AdgroupFinePriceType maxUnvalidStrategyPriceFactor(Double maxUnvalidStrategyPriceFactor) {
    
    this.maxUnvalidStrategyPriceFactor = maxUnvalidStrategyPriceFactor;
    return this;
  }

   /**
   * Get maxUnvalidStrategyPriceFactor
   * @return maxUnvalidStrategyPriceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_UNVALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMaxUnvalidStrategyPriceFactor() {
    return maxUnvalidStrategyPriceFactor;
  }


  @JsonProperty(JSON_PROPERTY_MAX_UNVALID_STRATEGY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxUnvalidStrategyPriceFactor(Double maxUnvalidStrategyPriceFactor) {
    this.maxUnvalidStrategyPriceFactor = maxUnvalidStrategyPriceFactor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupFinePriceType adgroupFinePriceType = (AdgroupFinePriceType) o;
    return Objects.equals(this.deviceprefer, adgroupFinePriceType.deviceprefer) &&
        Objects.equals(this.mobilePriceFactor, adgroupFinePriceType.mobilePriceFactor) &&
        Objects.equals(this.accuPriceFactor, adgroupFinePriceType.accuPriceFactor) &&
        Objects.equals(this.wordPriceFactor, adgroupFinePriceType.wordPriceFactor) &&
        Objects.equals(this.widePriceFactor, adgroupFinePriceType.widePriceFactor) &&
        Objects.equals(this.matchPriceFactorStatus, adgroupFinePriceType.matchPriceFactorStatus) &&
        Objects.equals(this.hctStatus, adgroupFinePriceType.hctStatus) &&
        Objects.equals(this.remarketingStatus, adgroupFinePriceType.remarketingStatus) &&
        Objects.equals(this.remarketingPriceFactor, adgroupFinePriceType.remarketingPriceFactor) &&
        Objects.equals(this.remarketingPauseStatus, adgroupFinePriceType.remarketingPauseStatus) &&
        Objects.equals(this.regionTarget, adgroupFinePriceType.regionTarget) &&
        Objects.equals(this.regionPriceFactor, adgroupFinePriceType.regionPriceFactor) &&
        Objects.equals(this.distancePriceStatus, adgroupFinePriceType.distancePriceStatus) &&
        Objects.equals(this.distancePriceFactor, adgroupFinePriceType.distancePriceFactor) &&
        Objects.equals(this.areaPriceFactor, adgroupFinePriceType.areaPriceFactor) &&
        Objects.equals(this.schedule, adgroupFinePriceType.schedule) &&
        Objects.equals(this.schedulePriceFactors, adgroupFinePriceType.schedulePriceFactors) &&
        Objects.equals(this.externalFlowType, adgroupFinePriceType.externalFlowType) &&
        Objects.equals(this.moreStyleBidType, adgroupFinePriceType.moreStyleBidType) &&
        Objects.equals(this.bidprefer, adgroupFinePriceType.bidprefer) &&
        Objects.equals(this.pcPriceFactor, adgroupFinePriceType.pcPriceFactor) &&
        Objects.equals(this.cmStatus, adgroupFinePriceType.cmStatus) &&
        Objects.equals(this.strategyPriceFactor, adgroupFinePriceType.strategyPriceFactor) &&
        Objects.equals(this.crowdPriceFactors, adgroupFinePriceType.crowdPriceFactors) &&
        Objects.equals(this.ocpcSecondStage, adgroupFinePriceType.ocpcSecondStage) &&
        Objects.equals(this.minValidStrategyPriceFactor, adgroupFinePriceType.minValidStrategyPriceFactor) &&
        Objects.equals(this.maxValidStrategyPriceFactor, adgroupFinePriceType.maxValidStrategyPriceFactor) &&
        Objects.equals(this.minUnvalidStrategyPriceFactor, adgroupFinePriceType.minUnvalidStrategyPriceFactor) &&
        Objects.equals(this.maxUnvalidStrategyPriceFactor, adgroupFinePriceType.maxUnvalidStrategyPriceFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceprefer, mobilePriceFactor, accuPriceFactor, wordPriceFactor, widePriceFactor, matchPriceFactorStatus, hctStatus, remarketingStatus, remarketingPriceFactor, remarketingPauseStatus, regionTarget, regionPriceFactor, distancePriceStatus, distancePriceFactor, areaPriceFactor, schedule, schedulePriceFactors, externalFlowType, moreStyleBidType, bidprefer, pcPriceFactor, cmStatus, strategyPriceFactor, crowdPriceFactors, ocpcSecondStage, minValidStrategyPriceFactor, maxValidStrategyPriceFactor, minUnvalidStrategyPriceFactor, maxUnvalidStrategyPriceFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupFinePriceType {\n");
    sb.append("    deviceprefer: ").append(toIndentedString(deviceprefer)).append("\n");
    sb.append("    mobilePriceFactor: ").append(toIndentedString(mobilePriceFactor)).append("\n");
    sb.append("    accuPriceFactor: ").append(toIndentedString(accuPriceFactor)).append("\n");
    sb.append("    wordPriceFactor: ").append(toIndentedString(wordPriceFactor)).append("\n");
    sb.append("    widePriceFactor: ").append(toIndentedString(widePriceFactor)).append("\n");
    sb.append("    matchPriceFactorStatus: ").append(toIndentedString(matchPriceFactorStatus)).append("\n");
    sb.append("    hctStatus: ").append(toIndentedString(hctStatus)).append("\n");
    sb.append("    remarketingStatus: ").append(toIndentedString(remarketingStatus)).append("\n");
    sb.append("    remarketingPriceFactor: ").append(toIndentedString(remarketingPriceFactor)).append("\n");
    sb.append("    remarketingPauseStatus: ").append(toIndentedString(remarketingPauseStatus)).append("\n");
    sb.append("    regionTarget: ").append(toIndentedString(regionTarget)).append("\n");
    sb.append("    regionPriceFactor: ").append(toIndentedString(regionPriceFactor)).append("\n");
    sb.append("    distancePriceStatus: ").append(toIndentedString(distancePriceStatus)).append("\n");
    sb.append("    distancePriceFactor: ").append(toIndentedString(distancePriceFactor)).append("\n");
    sb.append("    areaPriceFactor: ").append(toIndentedString(areaPriceFactor)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    schedulePriceFactors: ").append(toIndentedString(schedulePriceFactors)).append("\n");
    sb.append("    externalFlowType: ").append(toIndentedString(externalFlowType)).append("\n");
    sb.append("    moreStyleBidType: ").append(toIndentedString(moreStyleBidType)).append("\n");
    sb.append("    bidprefer: ").append(toIndentedString(bidprefer)).append("\n");
    sb.append("    pcPriceFactor: ").append(toIndentedString(pcPriceFactor)).append("\n");
    sb.append("    cmStatus: ").append(toIndentedString(cmStatus)).append("\n");
    sb.append("    strategyPriceFactor: ").append(toIndentedString(strategyPriceFactor)).append("\n");
    sb.append("    crowdPriceFactors: ").append(toIndentedString(crowdPriceFactors)).append("\n");
    sb.append("    ocpcSecondStage: ").append(toIndentedString(ocpcSecondStage)).append("\n");
    sb.append("    minValidStrategyPriceFactor: ").append(toIndentedString(minValidStrategyPriceFactor)).append("\n");
    sb.append("    maxValidStrategyPriceFactor: ").append(toIndentedString(maxValidStrategyPriceFactor)).append("\n");
    sb.append("    minUnvalidStrategyPriceFactor: ").append(toIndentedString(minUnvalidStrategyPriceFactor)).append("\n");
    sb.append("    maxUnvalidStrategyPriceFactor: ").append(toIndentedString(maxUnvalidStrategyPriceFactor)).append("\n");
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
