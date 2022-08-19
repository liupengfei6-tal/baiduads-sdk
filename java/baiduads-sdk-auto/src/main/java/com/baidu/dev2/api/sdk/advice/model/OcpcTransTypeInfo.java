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
import com.baidu.dev2.api.sdk.advice.model.RecommendReasonType;
import com.baidu.dev2.api.sdk.advice.model.TargetPackageDataflowInfo;
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
 * OcpcTransTypeInfo
 */
@JsonPropertyOrder({
  OcpcTransTypeInfo.JSON_PROPERTY_TARGET_PACKAGE_ID,
  OcpcTransTypeInfo.JSON_PROPERTY_TARGET_PACKAGE_NAME,
  OcpcTransTypeInfo.JSON_PROPERTY_OCPC_BID,
  OcpcTransTypeInfo.JSON_PROPERTY_DATA_FLOW_DATA,
  OcpcTransTypeInfo.JSON_PROPERTY_OCPC_BID_TYPE,
  OcpcTransTypeInfo.JSON_PROPERTY_COST,
  OcpcTransTypeInfo.JSON_PROPERTY_CLICK,
  OcpcTransTypeInfo.JSON_PROPERTY_IMPRESSION,
  OcpcTransTypeInfo.JSON_PROPERTY_CONVERSION,
  OcpcTransTypeInfo.JSON_PROPERTY_TRANS_PRICE,
  OcpcTransTypeInfo.JSON_PROPERTY_IMPROVE_COST,
  OcpcTransTypeInfo.JSON_PROPERTY_IMPROVE_CONVERSION,
  OcpcTransTypeInfo.JSON_PROPERTY_CAMPAIGN_IDS,
  OcpcTransTypeInfo.JSON_PROPERTY_RECOMMEND_DATA_FLOW_DATA,
  OcpcTransTypeInfo.JSON_PROPERTY_RECOMMEND_OCPC_BID,
  OcpcTransTypeInfo.JSON_PROPERTY_RECOMMEND_REASONS
})
@JsonTypeName("OcpcTransTypeInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OcpcTransTypeInfo {
  public static final String JSON_PROPERTY_TARGET_PACKAGE_ID = "targetPackageId";
  private Long targetPackageId;

  public static final String JSON_PROPERTY_TARGET_PACKAGE_NAME = "targetPackageName";
  private String targetPackageName;

  public static final String JSON_PROPERTY_OCPC_BID = "ocpcBid";
  private Double ocpcBid;

  public static final String JSON_PROPERTY_DATA_FLOW_DATA = "dataFlowData";
  private List<TargetPackageDataflowInfo> dataFlowData = null;

  public static final String JSON_PROPERTY_OCPC_BID_TYPE = "ocpcBidType";
  private Integer ocpcBidType;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Long click;

  public static final String JSON_PROPERTY_IMPRESSION = "impression";
  private Long impression;

  public static final String JSON_PROPERTY_CONVERSION = "conversion";
  private Long conversion;

  public static final String JSON_PROPERTY_TRANS_PRICE = "transPrice";
  private Double transPrice;

  public static final String JSON_PROPERTY_IMPROVE_COST = "improveCost";
  private Long improveCost;

  public static final String JSON_PROPERTY_IMPROVE_CONVERSION = "improveConversion";
  private Long improveConversion;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_RECOMMEND_DATA_FLOW_DATA = "recommendDataFlowData";
  private List<TargetPackageDataflowInfo> recommendDataFlowData = null;

  public static final String JSON_PROPERTY_RECOMMEND_OCPC_BID = "recommendOcpcBid";
  private Double recommendOcpcBid;

  public static final String JSON_PROPERTY_RECOMMEND_REASONS = "recommendReasons";
  private List<RecommendReasonType> recommendReasons = null;

  public OcpcTransTypeInfo() { 
  }

  public OcpcTransTypeInfo targetPackageId(Long targetPackageId) {
    
    this.targetPackageId = targetPackageId;
    return this;
  }

   /**
   * Get targetPackageId
   * @return targetPackageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetPackageId() {
    return targetPackageId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageId(Long targetPackageId) {
    this.targetPackageId = targetPackageId;
  }


  public OcpcTransTypeInfo targetPackageName(String targetPackageName) {
    
    this.targetPackageName = targetPackageName;
    return this;
  }

   /**
   * Get targetPackageName
   * @return targetPackageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetPackageName() {
    return targetPackageName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageName(String targetPackageName) {
    this.targetPackageName = targetPackageName;
  }


  public OcpcTransTypeInfo ocpcBid(Double ocpcBid) {
    
    this.ocpcBid = ocpcBid;
    return this;
  }

   /**
   * Get ocpcBid
   * @return ocpcBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOcpcBid() {
    return ocpcBid;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcBid(Double ocpcBid) {
    this.ocpcBid = ocpcBid;
  }


  public OcpcTransTypeInfo dataFlowData(List<TargetPackageDataflowInfo> dataFlowData) {
    
    this.dataFlowData = dataFlowData;
    return this;
  }

  public OcpcTransTypeInfo addDataFlowDataItem(TargetPackageDataflowInfo dataFlowDataItem) {
    if (this.dataFlowData == null) {
      this.dataFlowData = new ArrayList<>();
    }
    this.dataFlowData.add(dataFlowDataItem);
    return this;
  }

   /**
   * Get dataFlowData
   * @return dataFlowData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_FLOW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TargetPackageDataflowInfo> getDataFlowData() {
    return dataFlowData;
  }


  @JsonProperty(JSON_PROPERTY_DATA_FLOW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataFlowData(List<TargetPackageDataflowInfo> dataFlowData) {
    this.dataFlowData = dataFlowData;
  }


  public OcpcTransTypeInfo ocpcBidType(Integer ocpcBidType) {
    
    this.ocpcBidType = ocpcBidType;
    return this;
  }

   /**
   * Get ocpcBidType
   * @return ocpcBidType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOcpcBidType() {
    return ocpcBidType;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcBidType(Integer ocpcBidType) {
    this.ocpcBidType = ocpcBidType;
  }


  public OcpcTransTypeInfo cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(Double cost) {
    this.cost = cost;
  }


  public OcpcTransTypeInfo click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(Long click) {
    this.click = click;
  }


  public OcpcTransTypeInfo impression(Long impression) {
    
    this.impression = impression;
    return this;
  }

   /**
   * Get impression
   * @return impression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImpression() {
    return impression;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpression(Long impression) {
    this.impression = impression;
  }


  public OcpcTransTypeInfo conversion(Long conversion) {
    
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversion() {
    return conversion;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversion(Long conversion) {
    this.conversion = conversion;
  }


  public OcpcTransTypeInfo transPrice(Double transPrice) {
    
    this.transPrice = transPrice;
    return this;
  }

   /**
   * Get transPrice
   * @return transPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTransPrice() {
    return transPrice;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransPrice(Double transPrice) {
    this.transPrice = transPrice;
  }


  public OcpcTransTypeInfo improveCost(Long improveCost) {
    
    this.improveCost = improveCost;
    return this;
  }

   /**
   * Get improveCost
   * @return improveCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPROVE_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImproveCost() {
    return improveCost;
  }


  @JsonProperty(JSON_PROPERTY_IMPROVE_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImproveCost(Long improveCost) {
    this.improveCost = improveCost;
  }


  public OcpcTransTypeInfo improveConversion(Long improveConversion) {
    
    this.improveConversion = improveConversion;
    return this;
  }

   /**
   * Get improveConversion
   * @return improveConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPROVE_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImproveConversion() {
    return improveConversion;
  }


  @JsonProperty(JSON_PROPERTY_IMPROVE_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImproveConversion(Long improveConversion) {
    this.improveConversion = improveConversion;
  }


  public OcpcTransTypeInfo campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public OcpcTransTypeInfo addCampaignIdsItem(Long campaignIdsItem) {
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


  public OcpcTransTypeInfo recommendDataFlowData(List<TargetPackageDataflowInfo> recommendDataFlowData) {
    
    this.recommendDataFlowData = recommendDataFlowData;
    return this;
  }

  public OcpcTransTypeInfo addRecommendDataFlowDataItem(TargetPackageDataflowInfo recommendDataFlowDataItem) {
    if (this.recommendDataFlowData == null) {
      this.recommendDataFlowData = new ArrayList<>();
    }
    this.recommendDataFlowData.add(recommendDataFlowDataItem);
    return this;
  }

   /**
   * Get recommendDataFlowData
   * @return recommendDataFlowData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND_DATA_FLOW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TargetPackageDataflowInfo> getRecommendDataFlowData() {
    return recommendDataFlowData;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND_DATA_FLOW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendDataFlowData(List<TargetPackageDataflowInfo> recommendDataFlowData) {
    this.recommendDataFlowData = recommendDataFlowData;
  }


  public OcpcTransTypeInfo recommendOcpcBid(Double recommendOcpcBid) {
    
    this.recommendOcpcBid = recommendOcpcBid;
    return this;
  }

   /**
   * Get recommendOcpcBid
   * @return recommendOcpcBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRecommendOcpcBid() {
    return recommendOcpcBid;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendOcpcBid(Double recommendOcpcBid) {
    this.recommendOcpcBid = recommendOcpcBid;
  }


  public OcpcTransTypeInfo recommendReasons(List<RecommendReasonType> recommendReasons) {
    
    this.recommendReasons = recommendReasons;
    return this;
  }

  public OcpcTransTypeInfo addRecommendReasonsItem(RecommendReasonType recommendReasonsItem) {
    if (this.recommendReasons == null) {
      this.recommendReasons = new ArrayList<>();
    }
    this.recommendReasons.add(recommendReasonsItem);
    return this;
  }

   /**
   * Get recommendReasons
   * @return recommendReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMEND_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendReasonType> getRecommendReasons() {
    return recommendReasons;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMEND_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendReasons(List<RecommendReasonType> recommendReasons) {
    this.recommendReasons = recommendReasons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcpcTransTypeInfo ocpcTransTypeInfo = (OcpcTransTypeInfo) o;
    return Objects.equals(this.targetPackageId, ocpcTransTypeInfo.targetPackageId) &&
        Objects.equals(this.targetPackageName, ocpcTransTypeInfo.targetPackageName) &&
        Objects.equals(this.ocpcBid, ocpcTransTypeInfo.ocpcBid) &&
        Objects.equals(this.dataFlowData, ocpcTransTypeInfo.dataFlowData) &&
        Objects.equals(this.ocpcBidType, ocpcTransTypeInfo.ocpcBidType) &&
        Objects.equals(this.cost, ocpcTransTypeInfo.cost) &&
        Objects.equals(this.click, ocpcTransTypeInfo.click) &&
        Objects.equals(this.impression, ocpcTransTypeInfo.impression) &&
        Objects.equals(this.conversion, ocpcTransTypeInfo.conversion) &&
        Objects.equals(this.transPrice, ocpcTransTypeInfo.transPrice) &&
        Objects.equals(this.improveCost, ocpcTransTypeInfo.improveCost) &&
        Objects.equals(this.improveConversion, ocpcTransTypeInfo.improveConversion) &&
        Objects.equals(this.campaignIds, ocpcTransTypeInfo.campaignIds) &&
        Objects.equals(this.recommendDataFlowData, ocpcTransTypeInfo.recommendDataFlowData) &&
        Objects.equals(this.recommendOcpcBid, ocpcTransTypeInfo.recommendOcpcBid) &&
        Objects.equals(this.recommendReasons, ocpcTransTypeInfo.recommendReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPackageId, targetPackageName, ocpcBid, dataFlowData, ocpcBidType, cost, click, impression, conversion, transPrice, improveCost, improveConversion, campaignIds, recommendDataFlowData, recommendOcpcBid, recommendReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcpcTransTypeInfo {\n");
    sb.append("    targetPackageId: ").append(toIndentedString(targetPackageId)).append("\n");
    sb.append("    targetPackageName: ").append(toIndentedString(targetPackageName)).append("\n");
    sb.append("    ocpcBid: ").append(toIndentedString(ocpcBid)).append("\n");
    sb.append("    dataFlowData: ").append(toIndentedString(dataFlowData)).append("\n");
    sb.append("    ocpcBidType: ").append(toIndentedString(ocpcBidType)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    transPrice: ").append(toIndentedString(transPrice)).append("\n");
    sb.append("    improveCost: ").append(toIndentedString(improveCost)).append("\n");
    sb.append("    improveConversion: ").append(toIndentedString(improveConversion)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    recommendDataFlowData: ").append(toIndentedString(recommendDataFlowData)).append("\n");
    sb.append("    recommendOcpcBid: ").append(toIndentedString(recommendOcpcBid)).append("\n");
    sb.append("    recommendReasons: ").append(toIndentedString(recommendReasons)).append("\n");
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
