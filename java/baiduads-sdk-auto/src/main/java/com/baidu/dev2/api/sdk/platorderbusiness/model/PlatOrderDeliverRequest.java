/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platorderbusiness.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platorderbusiness.model.PlatExpressPackageRequest;
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
 * PlatOrderDeliverRequest
 */
@JsonPropertyOrder({
  PlatOrderDeliverRequest.JSON_PROPERTY_ORDER_ID,
  PlatOrderDeliverRequest.JSON_PROPERTY_TRACKING_NUMBER,
  PlatOrderDeliverRequest.JSON_PROPERTY_EXPRESS_NAME,
  PlatOrderDeliverRequest.JSON_PROPERTY_MEMO,
  PlatOrderDeliverRequest.JSON_PROPERTY_ORDER_PACKAGE_INFOS,
  PlatOrderDeliverRequest.JSON_PROPERTY_ADDITIONAL_DELIVER_TAG,
  PlatOrderDeliverRequest.JSON_PROPERTY_UCID,
  PlatOrderDeliverRequest.JSON_PROPERTY_SHOP_ID,
  PlatOrderDeliverRequest.JSON_PROPERTY_APP_ID
})
@JsonTypeName("PlatOrderDeliverRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatOrderDeliverRequest {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  private String trackingNumber;

  public static final String JSON_PROPERTY_EXPRESS_NAME = "expressName";
  private String expressName;

  public static final String JSON_PROPERTY_MEMO = "memo";
  private String memo;

  public static final String JSON_PROPERTY_ORDER_PACKAGE_INFOS = "orderPackageInfos";
  private List<PlatExpressPackageRequest> orderPackageInfos = null;

  public static final String JSON_PROPERTY_ADDITIONAL_DELIVER_TAG = "additionalDeliverTag";
  private Integer additionalDeliverTag;

  public static final String JSON_PROPERTY_UCID = "ucid";
  private Long ucid;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public PlatOrderDeliverRequest() { 
  }

  public PlatOrderDeliverRequest orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public PlatOrderDeliverRequest trackingNumber(String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingNumber() {
    return trackingNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  public PlatOrderDeliverRequest expressName(String expressName) {
    
    this.expressName = expressName;
    return this;
  }

   /**
   * Get expressName
   * @return expressName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPRESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpressName() {
    return expressName;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpressName(String expressName) {
    this.expressName = expressName;
  }


  public PlatOrderDeliverRequest memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemo() {
    return memo;
  }


  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemo(String memo) {
    this.memo = memo;
  }


  public PlatOrderDeliverRequest orderPackageInfos(List<PlatExpressPackageRequest> orderPackageInfos) {
    
    this.orderPackageInfos = orderPackageInfos;
    return this;
  }

  public PlatOrderDeliverRequest addOrderPackageInfosItem(PlatExpressPackageRequest orderPackageInfosItem) {
    if (this.orderPackageInfos == null) {
      this.orderPackageInfos = new ArrayList<>();
    }
    this.orderPackageInfos.add(orderPackageInfosItem);
    return this;
  }

   /**
   * Get orderPackageInfos
   * @return orderPackageInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_PACKAGE_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlatExpressPackageRequest> getOrderPackageInfos() {
    return orderPackageInfos;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_PACKAGE_INFOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderPackageInfos(List<PlatExpressPackageRequest> orderPackageInfos) {
    this.orderPackageInfos = orderPackageInfos;
  }


  public PlatOrderDeliverRequest additionalDeliverTag(Integer additionalDeliverTag) {
    
    this.additionalDeliverTag = additionalDeliverTag;
    return this;
  }

   /**
   * Get additionalDeliverTag
   * @return additionalDeliverTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DELIVER_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdditionalDeliverTag() {
    return additionalDeliverTag;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DELIVER_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalDeliverTag(Integer additionalDeliverTag) {
    this.additionalDeliverTag = additionalDeliverTag;
  }


  public PlatOrderDeliverRequest ucid(Long ucid) {
    
    this.ucid = ucid;
    return this;
  }

   /**
   * Get ucid
   * @return ucid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUcid() {
    return ucid;
  }


  @JsonProperty(JSON_PROPERTY_UCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUcid(Long ucid) {
    this.ucid = ucid;
  }


  public PlatOrderDeliverRequest shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * Get shopId
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopId() {
    return shopId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public PlatOrderDeliverRequest appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatOrderDeliverRequest platOrderDeliverRequest = (PlatOrderDeliverRequest) o;
    return Objects.equals(this.orderId, platOrderDeliverRequest.orderId) &&
        Objects.equals(this.trackingNumber, platOrderDeliverRequest.trackingNumber) &&
        Objects.equals(this.expressName, platOrderDeliverRequest.expressName) &&
        Objects.equals(this.memo, platOrderDeliverRequest.memo) &&
        Objects.equals(this.orderPackageInfos, platOrderDeliverRequest.orderPackageInfos) &&
        Objects.equals(this.additionalDeliverTag, platOrderDeliverRequest.additionalDeliverTag) &&
        Objects.equals(this.ucid, platOrderDeliverRequest.ucid) &&
        Objects.equals(this.shopId, platOrderDeliverRequest.shopId) &&
        Objects.equals(this.appId, platOrderDeliverRequest.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, trackingNumber, expressName, memo, orderPackageInfos, additionalDeliverTag, ucid, shopId, appId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatOrderDeliverRequest {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    expressName: ").append(toIndentedString(expressName)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    orderPackageInfos: ").append(toIndentedString(orderPackageInfos)).append("\n");
    sb.append("    additionalDeliverTag: ").append(toIndentedString(additionalDeliverTag)).append("\n");
    sb.append("    ucid: ").append(toIndentedString(ucid)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

