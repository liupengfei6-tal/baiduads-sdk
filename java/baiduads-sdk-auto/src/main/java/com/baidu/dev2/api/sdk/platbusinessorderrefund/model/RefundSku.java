/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platbusinessorderrefund.model;

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
 * RefundSku
 */
@JsonPropertyOrder({
  RefundSku.JSON_PROPERTY_SKU_ID,
  RefundSku.JSON_PROPERTY_REFUND_NUM,
  RefundSku.JSON_PROPERTY_SPU_ID,
  RefundSku.JSON_PROPERTY_SPU_NAME,
  RefundSku.JSON_PROPERTY_PRODUCT_URL,
  RefundSku.JSON_PROPERTY_PRODUCT_IMAGE,
  RefundSku.JSON_PROPERTY_SKU_DESC,
  RefundSku.JSON_PROPERTY_SALE_PRICE,
  RefundSku.JSON_PROPERTY_ACTUAL_PRICE,
  RefundSku.JSON_PROPERTY_ORDER_GOODS_STATUS,
  RefundSku.JSON_PROPERTY_ORDER_GOODS_STATUS_TEXT,
  RefundSku.JSON_PROPERTY_SELL_PRICE
})
@JsonTypeName("RefundSku")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundSku {
  public static final String JSON_PROPERTY_SKU_ID = "skuId";
  private String skuId;

  public static final String JSON_PROPERTY_REFUND_NUM = "refundNum";
  private Integer refundNum;

  public static final String JSON_PROPERTY_SPU_ID = "spuId";
  private String spuId;

  public static final String JSON_PROPERTY_SPU_NAME = "spuName";
  private String spuName;

  public static final String JSON_PROPERTY_PRODUCT_URL = "productUrl";
  private String productUrl;

  public static final String JSON_PROPERTY_PRODUCT_IMAGE = "productImage";
  private String productImage;

  public static final String JSON_PROPERTY_SKU_DESC = "skuDesc";
  private String skuDesc;

  public static final String JSON_PROPERTY_SALE_PRICE = "salePrice";
  private String salePrice;

  public static final String JSON_PROPERTY_ACTUAL_PRICE = "actualPrice";
  private String actualPrice;

  public static final String JSON_PROPERTY_ORDER_GOODS_STATUS = "orderGoodsStatus";
  private Integer orderGoodsStatus;

  public static final String JSON_PROPERTY_ORDER_GOODS_STATUS_TEXT = "orderGoodsStatusText";
  private String orderGoodsStatusText;

  public static final String JSON_PROPERTY_SELL_PRICE = "sellPrice";
  private String sellPrice;

  public RefundSku() { 
  }

  public RefundSku skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * Get skuId
   * @return skuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSkuId() {
    return skuId;
  }


  @JsonProperty(JSON_PROPERTY_SKU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public RefundSku refundNum(Integer refundNum) {
    
    this.refundNum = refundNum;
    return this;
  }

   /**
   * Get refundNum
   * @return refundNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundNum() {
    return refundNum;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundNum(Integer refundNum) {
    this.refundNum = refundNum;
  }


  public RefundSku spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * Get spuId
   * @return spuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpuId() {
    return spuId;
  }


  @JsonProperty(JSON_PROPERTY_SPU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public RefundSku spuName(String spuName) {
    
    this.spuName = spuName;
    return this;
  }

   /**
   * Get spuName
   * @return spuName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPU_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpuName() {
    return spuName;
  }


  @JsonProperty(JSON_PROPERTY_SPU_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpuName(String spuName) {
    this.spuName = spuName;
  }


  public RefundSku productUrl(String productUrl) {
    
    this.productUrl = productUrl;
    return this;
  }

   /**
   * Get productUrl
   * @return productUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductUrl() {
    return productUrl;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }


  public RefundSku productImage(String productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * Get productImage
   * @return productImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductImage() {
    return productImage;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductImage(String productImage) {
    this.productImage = productImage;
  }


  public RefundSku skuDesc(String skuDesc) {
    
    this.skuDesc = skuDesc;
    return this;
  }

   /**
   * Get skuDesc
   * @return skuDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSkuDesc() {
    return skuDesc;
  }


  @JsonProperty(JSON_PROPERTY_SKU_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuDesc(String skuDesc) {
    this.skuDesc = skuDesc;
  }


  public RefundSku salePrice(String salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Get salePrice
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalePrice() {
    return salePrice;
  }


  @JsonProperty(JSON_PROPERTY_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }


  public RefundSku actualPrice(String actualPrice) {
    
    this.actualPrice = actualPrice;
    return this;
  }

   /**
   * Get actualPrice
   * @return actualPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTUAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActualPrice() {
    return actualPrice;
  }


  @JsonProperty(JSON_PROPERTY_ACTUAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActualPrice(String actualPrice) {
    this.actualPrice = actualPrice;
  }


  public RefundSku orderGoodsStatus(Integer orderGoodsStatus) {
    
    this.orderGoodsStatus = orderGoodsStatus;
    return this;
  }

   /**
   * Get orderGoodsStatus
   * @return orderGoodsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_GOODS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrderGoodsStatus() {
    return orderGoodsStatus;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_GOODS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderGoodsStatus(Integer orderGoodsStatus) {
    this.orderGoodsStatus = orderGoodsStatus;
  }


  public RefundSku orderGoodsStatusText(String orderGoodsStatusText) {
    
    this.orderGoodsStatusText = orderGoodsStatusText;
    return this;
  }

   /**
   * Get orderGoodsStatusText
   * @return orderGoodsStatusText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_GOODS_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderGoodsStatusText() {
    return orderGoodsStatusText;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_GOODS_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderGoodsStatusText(String orderGoodsStatusText) {
    this.orderGoodsStatusText = orderGoodsStatusText;
  }


  public RefundSku sellPrice(String sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * Get sellPrice
   * @return sellPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSellPrice() {
    return sellPrice;
  }


  @JsonProperty(JSON_PROPERTY_SELL_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundSku refundSku = (RefundSku) o;
    return Objects.equals(this.skuId, refundSku.skuId) &&
        Objects.equals(this.refundNum, refundSku.refundNum) &&
        Objects.equals(this.spuId, refundSku.spuId) &&
        Objects.equals(this.spuName, refundSku.spuName) &&
        Objects.equals(this.productUrl, refundSku.productUrl) &&
        Objects.equals(this.productImage, refundSku.productImage) &&
        Objects.equals(this.skuDesc, refundSku.skuDesc) &&
        Objects.equals(this.salePrice, refundSku.salePrice) &&
        Objects.equals(this.actualPrice, refundSku.actualPrice) &&
        Objects.equals(this.orderGoodsStatus, refundSku.orderGoodsStatus) &&
        Objects.equals(this.orderGoodsStatusText, refundSku.orderGoodsStatusText) &&
        Objects.equals(this.sellPrice, refundSku.sellPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, refundNum, spuId, spuName, productUrl, productImage, skuDesc, salePrice, actualPrice, orderGoodsStatus, orderGoodsStatusText, sellPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundSku {\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    refundNum: ").append(toIndentedString(refundNum)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    spuName: ").append(toIndentedString(spuName)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    skuDesc: ").append(toIndentedString(skuDesc)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    actualPrice: ").append(toIndentedString(actualPrice)).append("\n");
    sb.append("    orderGoodsStatus: ").append(toIndentedString(orderGoodsStatus)).append("\n");
    sb.append("    orderGoodsStatusText: ").append(toIndentedString(orderGoodsStatusText)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
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
