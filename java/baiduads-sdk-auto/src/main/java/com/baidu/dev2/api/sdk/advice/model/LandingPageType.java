/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

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
 * LandingPageType
 */
@JsonPropertyOrder({
  LandingPageType.JSON_PROPERTY_CAMPAIGN_ID,
  LandingPageType.JSON_PROPERTY_CAMPAIGN_NAME,
  LandingPageType.JSON_PROPERTY_ADGROUP_ID,
  LandingPageType.JSON_PROPERTY_ADGROUP_NAME,
  LandingPageType.JSON_PROPERTY_URL_COUNT,
  LandingPageType.JSON_PROPERTY_TOP_IMPRESSION_INC_MAX,
  LandingPageType.JSON_PROPERTY_TOP_IMPRESSION_CURRENT,
  LandingPageType.JSON_PROPERTY_TOP_IMPRESSION_INCREASE,
  LandingPageType.JSON_PROPERTY_TOP_PAY,
  LandingPageType.JSON_PROPERTY_TOP_P_CLICKS,
  LandingPageType.JSON_PROPERTY_TOP_PAGE_VIEWS,
  LandingPageType.JSON_PROPERTY_BUSINESS_POINT_ID,
  LandingPageType.JSON_PROPERTY_AD_TYPE,
  LandingPageType.JSON_PROPERTY_MARKETING_TARGET_ID,
  LandingPageType.JSON_PROPERTY_ID,
  LandingPageType.JSON_PROPERTY_KEYWORD_COUNT,
  LandingPageType.JSON_PROPERTY_KEYWORD,
  LandingPageType.JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL,
  LandingPageType.JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL_COUNT,
  LandingPageType.JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL,
  LandingPageType.JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL_COUNT,
  LandingPageType.JSON_PROPERTY_QUALITY,
  LandingPageType.JSON_PROPERTY_ADD_TIME,
  LandingPageType.JSON_PROPERTY_STATUS,
  LandingPageType.JSON_PROPERTY_KEYWORD_ID,
  LandingPageType.JSON_PROPERTY_MOD_TIME,
  LandingPageType.JSON_PROPERTY_CREATIVE_ID,
  LandingPageType.JSON_PROPERTY_CONTENT_SIGN
})
@JsonTypeName("LandingPageType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LandingPageType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_URL_COUNT = "urlCount";
  private Integer urlCount;

  public static final String JSON_PROPERTY_TOP_IMPRESSION_INC_MAX = "topImpressionIncMax";
  private Long topImpressionIncMax;

  public static final String JSON_PROPERTY_TOP_IMPRESSION_CURRENT = "topImpressionCurrent";
  private Long topImpressionCurrent;

  public static final String JSON_PROPERTY_TOP_IMPRESSION_INCREASE = "topImpressionIncrease";
  private Double topImpressionIncrease;

  public static final String JSON_PROPERTY_TOP_PAY = "topPay";
  private Double topPay;

  public static final String JSON_PROPERTY_TOP_P_CLICKS = "topPClicks";
  private Double topPClicks;

  public static final String JSON_PROPERTY_TOP_PAGE_VIEWS = "topPageViews";
  private Double topPageViews;

  public static final String JSON_PROPERTY_BUSINESS_POINT_ID = "businessPointId";
  private Long businessPointId;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private Integer adType;

  public static final String JSON_PROPERTY_MARKETING_TARGET_ID = "marketingTargetId";
  private Integer marketingTargetId;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_KEYWORD_COUNT = "keywordCount";
  private Long keywordCount;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL = "keywordMobileDestinationUrl";
  private String keywordMobileDestinationUrl;

  public static final String JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL_COUNT = "keywordMobileDestinationUrlCount";
  private Integer keywordMobileDestinationUrlCount;

  public static final String JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL = "creativeMobileDestinationUrl";
  private String creativeMobileDestinationUrl;

  public static final String JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL_COUNT = "creativeMobileDestinationUrlCount";
  private Integer creativeMobileDestinationUrlCount;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private Integer quality;

  public static final String JSON_PROPERTY_ADD_TIME = "addTime";
  private String addTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_KEYWORD_ID = "keywordId";
  private Long keywordId;

  public static final String JSON_PROPERTY_MOD_TIME = "modTime";
  private String modTime;

  public static final String JSON_PROPERTY_CREATIVE_ID = "creativeId";
  private Long creativeId;

  public static final String JSON_PROPERTY_CONTENT_SIGN = "contentSign";
  private Long contentSign;

  public LandingPageType() { 
  }

  public LandingPageType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public LandingPageType campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public LandingPageType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public LandingPageType adgroupName(String adgroupName) {
    
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupName() {
    return adgroupName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }


  public LandingPageType urlCount(Integer urlCount) {
    
    this.urlCount = urlCount;
    return this;
  }

   /**
   * Get urlCount
   * @return urlCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUrlCount() {
    return urlCount;
  }


  @JsonProperty(JSON_PROPERTY_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlCount(Integer urlCount) {
    this.urlCount = urlCount;
  }


  public LandingPageType topImpressionIncMax(Long topImpressionIncMax) {
    
    this.topImpressionIncMax = topImpressionIncMax;
    return this;
  }

   /**
   * Get topImpressionIncMax
   * @return topImpressionIncMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPRESSION_INC_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTopImpressionIncMax() {
    return topImpressionIncMax;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPRESSION_INC_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpressionIncMax(Long topImpressionIncMax) {
    this.topImpressionIncMax = topImpressionIncMax;
  }


  public LandingPageType topImpressionCurrent(Long topImpressionCurrent) {
    
    this.topImpressionCurrent = topImpressionCurrent;
    return this;
  }

   /**
   * Get topImpressionCurrent
   * @return topImpressionCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPRESSION_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTopImpressionCurrent() {
    return topImpressionCurrent;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPRESSION_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpressionCurrent(Long topImpressionCurrent) {
    this.topImpressionCurrent = topImpressionCurrent;
  }


  public LandingPageType topImpressionIncrease(Double topImpressionIncrease) {
    
    this.topImpressionIncrease = topImpressionIncrease;
    return this;
  }

   /**
   * Get topImpressionIncrease
   * @return topImpressionIncrease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPRESSION_INCREASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTopImpressionIncrease() {
    return topImpressionIncrease;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPRESSION_INCREASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpressionIncrease(Double topImpressionIncrease) {
    this.topImpressionIncrease = topImpressionIncrease;
  }


  public LandingPageType topPay(Double topPay) {
    
    this.topPay = topPay;
    return this;
  }

   /**
   * Get topPay
   * @return topPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTopPay() {
    return topPay;
  }


  @JsonProperty(JSON_PROPERTY_TOP_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopPay(Double topPay) {
    this.topPay = topPay;
  }


  public LandingPageType topPClicks(Double topPClicks) {
    
    this.topPClicks = topPClicks;
    return this;
  }

   /**
   * Get topPClicks
   * @return topPClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_P_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTopPClicks() {
    return topPClicks;
  }


  @JsonProperty(JSON_PROPERTY_TOP_P_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopPClicks(Double topPClicks) {
    this.topPClicks = topPClicks;
  }


  public LandingPageType topPageViews(Double topPageViews) {
    
    this.topPageViews = topPageViews;
    return this;
  }

   /**
   * Get topPageViews
   * @return topPageViews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_PAGE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTopPageViews() {
    return topPageViews;
  }


  @JsonProperty(JSON_PROPERTY_TOP_PAGE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopPageViews(Double topPageViews) {
    this.topPageViews = topPageViews;
  }


  public LandingPageType businessPointId(Long businessPointId) {
    
    this.businessPointId = businessPointId;
    return this;
  }

   /**
   * Get businessPointId
   * @return businessPointId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBusinessPointId() {
    return businessPointId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessPointId(Long businessPointId) {
    this.businessPointId = businessPointId;
  }


  public LandingPageType adType(Integer adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(Integer adType) {
    this.adType = adType;
  }


  public LandingPageType marketingTargetId(Integer marketingTargetId) {
    
    this.marketingTargetId = marketingTargetId;
    return this;
  }

   /**
   * Get marketingTargetId
   * @return marketingTargetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETING_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMarketingTargetId() {
    return marketingTargetId;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingTargetId(Integer marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
  }


  public LandingPageType id(Long id) {
    
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


  public LandingPageType keywordCount(Long keywordCount) {
    
    this.keywordCount = keywordCount;
    return this;
  }

   /**
   * Get keywordCount
   * @return keywordCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getKeywordCount() {
    return keywordCount;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordCount(Long keywordCount) {
    this.keywordCount = keywordCount;
  }


  public LandingPageType keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public LandingPageType keywordMobileDestinationUrl(String keywordMobileDestinationUrl) {
    
    this.keywordMobileDestinationUrl = keywordMobileDestinationUrl;
    return this;
  }

   /**
   * Get keywordMobileDestinationUrl
   * @return keywordMobileDestinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeywordMobileDestinationUrl() {
    return keywordMobileDestinationUrl;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordMobileDestinationUrl(String keywordMobileDestinationUrl) {
    this.keywordMobileDestinationUrl = keywordMobileDestinationUrl;
  }


  public LandingPageType keywordMobileDestinationUrlCount(Integer keywordMobileDestinationUrlCount) {
    
    this.keywordMobileDestinationUrlCount = keywordMobileDestinationUrlCount;
    return this;
  }

   /**
   * Get keywordMobileDestinationUrlCount
   * @return keywordMobileDestinationUrlCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKeywordMobileDestinationUrlCount() {
    return keywordMobileDestinationUrlCount;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_MOBILE_DESTINATION_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordMobileDestinationUrlCount(Integer keywordMobileDestinationUrlCount) {
    this.keywordMobileDestinationUrlCount = keywordMobileDestinationUrlCount;
  }


  public LandingPageType creativeMobileDestinationUrl(String creativeMobileDestinationUrl) {
    
    this.creativeMobileDestinationUrl = creativeMobileDestinationUrl;
    return this;
  }

   /**
   * Get creativeMobileDestinationUrl
   * @return creativeMobileDestinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreativeMobileDestinationUrl() {
    return creativeMobileDestinationUrl;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeMobileDestinationUrl(String creativeMobileDestinationUrl) {
    this.creativeMobileDestinationUrl = creativeMobileDestinationUrl;
  }


  public LandingPageType creativeMobileDestinationUrlCount(Integer creativeMobileDestinationUrlCount) {
    
    this.creativeMobileDestinationUrlCount = creativeMobileDestinationUrlCount;
    return this;
  }

   /**
   * Get creativeMobileDestinationUrlCount
   * @return creativeMobileDestinationUrlCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreativeMobileDestinationUrlCount() {
    return creativeMobileDestinationUrlCount;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_MOBILE_DESTINATION_URL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeMobileDestinationUrlCount(Integer creativeMobileDestinationUrlCount) {
    this.creativeMobileDestinationUrlCount = creativeMobileDestinationUrlCount;
  }


  public LandingPageType quality(Integer quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  public LandingPageType addTime(String addTime) {
    
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


  public LandingPageType status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public LandingPageType keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * Get keywordId
   * @return keywordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getKeywordId() {
    return keywordId;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public LandingPageType modTime(String modTime) {
    
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


  public LandingPageType creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * Get creativeId
   * @return creativeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreativeId() {
    return creativeId;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public LandingPageType contentSign(Long contentSign) {
    
    this.contentSign = contentSign;
    return this;
  }

   /**
   * Get contentSign
   * @return contentSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContentSign() {
    return contentSign;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentSign(Long contentSign) {
    this.contentSign = contentSign;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPageType landingPageType = (LandingPageType) o;
    return Objects.equals(this.campaignId, landingPageType.campaignId) &&
        Objects.equals(this.campaignName, landingPageType.campaignName) &&
        Objects.equals(this.adgroupId, landingPageType.adgroupId) &&
        Objects.equals(this.adgroupName, landingPageType.adgroupName) &&
        Objects.equals(this.urlCount, landingPageType.urlCount) &&
        Objects.equals(this.topImpressionIncMax, landingPageType.topImpressionIncMax) &&
        Objects.equals(this.topImpressionCurrent, landingPageType.topImpressionCurrent) &&
        Objects.equals(this.topImpressionIncrease, landingPageType.topImpressionIncrease) &&
        Objects.equals(this.topPay, landingPageType.topPay) &&
        Objects.equals(this.topPClicks, landingPageType.topPClicks) &&
        Objects.equals(this.topPageViews, landingPageType.topPageViews) &&
        Objects.equals(this.businessPointId, landingPageType.businessPointId) &&
        Objects.equals(this.adType, landingPageType.adType) &&
        Objects.equals(this.marketingTargetId, landingPageType.marketingTargetId) &&
        Objects.equals(this.id, landingPageType.id) &&
        Objects.equals(this.keywordCount, landingPageType.keywordCount) &&
        Objects.equals(this.keyword, landingPageType.keyword) &&
        Objects.equals(this.keywordMobileDestinationUrl, landingPageType.keywordMobileDestinationUrl) &&
        Objects.equals(this.keywordMobileDestinationUrlCount, landingPageType.keywordMobileDestinationUrlCount) &&
        Objects.equals(this.creativeMobileDestinationUrl, landingPageType.creativeMobileDestinationUrl) &&
        Objects.equals(this.creativeMobileDestinationUrlCount, landingPageType.creativeMobileDestinationUrlCount) &&
        Objects.equals(this.quality, landingPageType.quality) &&
        Objects.equals(this.addTime, landingPageType.addTime) &&
        Objects.equals(this.status, landingPageType.status) &&
        Objects.equals(this.keywordId, landingPageType.keywordId) &&
        Objects.equals(this.modTime, landingPageType.modTime) &&
        Objects.equals(this.creativeId, landingPageType.creativeId) &&
        Objects.equals(this.contentSign, landingPageType.contentSign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, adgroupId, adgroupName, urlCount, topImpressionIncMax, topImpressionCurrent, topImpressionIncrease, topPay, topPClicks, topPageViews, businessPointId, adType, marketingTargetId, id, keywordCount, keyword, keywordMobileDestinationUrl, keywordMobileDestinationUrlCount, creativeMobileDestinationUrl, creativeMobileDestinationUrlCount, quality, addTime, status, keywordId, modTime, creativeId, contentSign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPageType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    urlCount: ").append(toIndentedString(urlCount)).append("\n");
    sb.append("    topImpressionIncMax: ").append(toIndentedString(topImpressionIncMax)).append("\n");
    sb.append("    topImpressionCurrent: ").append(toIndentedString(topImpressionCurrent)).append("\n");
    sb.append("    topImpressionIncrease: ").append(toIndentedString(topImpressionIncrease)).append("\n");
    sb.append("    topPay: ").append(toIndentedString(topPay)).append("\n");
    sb.append("    topPClicks: ").append(toIndentedString(topPClicks)).append("\n");
    sb.append("    topPageViews: ").append(toIndentedString(topPageViews)).append("\n");
    sb.append("    businessPointId: ").append(toIndentedString(businessPointId)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    marketingTargetId: ").append(toIndentedString(marketingTargetId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywordCount: ").append(toIndentedString(keywordCount)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordMobileDestinationUrl: ").append(toIndentedString(keywordMobileDestinationUrl)).append("\n");
    sb.append("    keywordMobileDestinationUrlCount: ").append(toIndentedString(keywordMobileDestinationUrlCount)).append("\n");
    sb.append("    creativeMobileDestinationUrl: ").append(toIndentedString(creativeMobileDestinationUrl)).append("\n");
    sb.append("    creativeMobileDestinationUrlCount: ").append(toIndentedString(creativeMobileDestinationUrlCount)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    contentSign: ").append(toIndentedString(contentSign)).append("\n");
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
