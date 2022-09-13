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
 * PlatAgreeOrderReturnRequest
 */
@JsonPropertyOrder({
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_APP_ID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_REFUND_ID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_ORDER_ID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_SUB_ORDER_ID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_COMPLAINT_ID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_UCID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_SHOP_ID,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_REFUND_NAME,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_REFUND_PHONE,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_REFUND_ADDRESS,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_OPERATOR_TYPE,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_OPERATOR_DESC,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_SHOP_NAME,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_SHOP_LOGO_URL,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_MEMO,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_PROVINCE_CODE,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_PROVINCE,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_CITY_CODE,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_CITY,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_AREA_CODE,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_AREA,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_ADDRESS,
  PlatAgreeOrderReturnRequest.JSON_PROPERTY_RETURN_DESC
})
@JsonTypeName("PlatAgreeOrderReturnRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatAgreeOrderReturnRequest {
  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_REFUND_ID = "refundId";
  private Long refundId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_SUB_ORDER_ID = "subOrderId";
  private Long subOrderId;

  public static final String JSON_PROPERTY_COMPLAINT_ID = "complaintId";
  private Long complaintId;

  public static final String JSON_PROPERTY_UCID = "ucid";
  private Long ucid;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_REFUND_NAME = "refundName";
  private String refundName;

  public static final String JSON_PROPERTY_REFUND_PHONE = "refundPhone";
  private String refundPhone;

  public static final String JSON_PROPERTY_REFUND_ADDRESS = "refundAddress";
  private String refundAddress;

  public static final String JSON_PROPERTY_OPERATOR_TYPE = "operatorType";
  private Integer operatorType;

  public static final String JSON_PROPERTY_OPERATOR_DESC = "operatorDesc";
  private String operatorDesc;

  public static final String JSON_PROPERTY_SHOP_NAME = "shopName";
  private String shopName;

  public static final String JSON_PROPERTY_SHOP_LOGO_URL = "shopLogoUrl";
  private String shopLogoUrl;

  public static final String JSON_PROPERTY_MEMO = "memo";
  private String memo;

  public static final String JSON_PROPERTY_PROVINCE_CODE = "provinceCode";
  private String provinceCode;

  public static final String JSON_PROPERTY_PROVINCE = "province";
  private String province;

  public static final String JSON_PROPERTY_CITY_CODE = "cityCode";
  private String cityCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_AREA_CODE = "areaCode";
  private String areaCode;

  public static final String JSON_PROPERTY_AREA = "area";
  private String area;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_RETURN_DESC = "returnDesc";
  private String returnDesc;

  public PlatAgreeOrderReturnRequest() { 
  }

  public PlatAgreeOrderReturnRequest appId(Integer appId) {
    
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


  public PlatAgreeOrderReturnRequest refundId(Long refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Get refundId
   * @return refundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRefundId() {
    return refundId;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundId(Long refundId) {
    this.refundId = refundId;
  }


  public PlatAgreeOrderReturnRequest orderId(Long orderId) {
    
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


  public PlatAgreeOrderReturnRequest subOrderId(Long subOrderId) {
    
    this.subOrderId = subOrderId;
    return this;
  }

   /**
   * Get subOrderId
   * @return subOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubOrderId() {
    return subOrderId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
  }


  public PlatAgreeOrderReturnRequest complaintId(Long complaintId) {
    
    this.complaintId = complaintId;
    return this;
  }

   /**
   * Get complaintId
   * @return complaintId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLAINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getComplaintId() {
    return complaintId;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplaintId(Long complaintId) {
    this.complaintId = complaintId;
  }


  public PlatAgreeOrderReturnRequest ucid(Long ucid) {
    
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


  public PlatAgreeOrderReturnRequest shopId(Long shopId) {
    
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


  public PlatAgreeOrderReturnRequest refundName(String refundName) {
    
    this.refundName = refundName;
    return this;
  }

   /**
   * Get refundName
   * @return refundName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundName() {
    return refundName;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundName(String refundName) {
    this.refundName = refundName;
  }


  public PlatAgreeOrderReturnRequest refundPhone(String refundPhone) {
    
    this.refundPhone = refundPhone;
    return this;
  }

   /**
   * Get refundPhone
   * @return refundPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundPhone() {
    return refundPhone;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundPhone(String refundPhone) {
    this.refundPhone = refundPhone;
  }


  public PlatAgreeOrderReturnRequest refundAddress(String refundAddress) {
    
    this.refundAddress = refundAddress;
    return this;
  }

   /**
   * Get refundAddress
   * @return refundAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundAddress() {
    return refundAddress;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundAddress(String refundAddress) {
    this.refundAddress = refundAddress;
  }


  public PlatAgreeOrderReturnRequest operatorType(Integer operatorType) {
    
    this.operatorType = operatorType;
    return this;
  }

   /**
   * Get operatorType
   * @return operatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOperatorType() {
    return operatorType;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatorType(Integer operatorType) {
    this.operatorType = operatorType;
  }


  public PlatAgreeOrderReturnRequest operatorDesc(String operatorDesc) {
    
    this.operatorDesc = operatorDesc;
    return this;
  }

   /**
   * Get operatorDesc
   * @return operatorDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATOR_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperatorDesc() {
    return operatorDesc;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatorDesc(String operatorDesc) {
    this.operatorDesc = operatorDesc;
  }


  public PlatAgreeOrderReturnRequest shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * Get shopName
   * @return shopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopName() {
    return shopName;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public PlatAgreeOrderReturnRequest shopLogoUrl(String shopLogoUrl) {
    
    this.shopLogoUrl = shopLogoUrl;
    return this;
  }

   /**
   * Get shopLogoUrl
   * @return shopLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopLogoUrl() {
    return shopLogoUrl;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopLogoUrl(String shopLogoUrl) {
    this.shopLogoUrl = shopLogoUrl;
  }


  public PlatAgreeOrderReturnRequest memo(String memo) {
    
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


  public PlatAgreeOrderReturnRequest provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * Get provinceCode
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVINCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvinceCode() {
    return provinceCode;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public PlatAgreeOrderReturnRequest province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvince() {
    return province;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvince(String province) {
    this.province = province;
  }


  public PlatAgreeOrderReturnRequest cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * Get cityCode
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCityCode() {
    return cityCode;
  }


  @JsonProperty(JSON_PROPERTY_CITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public PlatAgreeOrderReturnRequest city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public PlatAgreeOrderReturnRequest areaCode(String areaCode) {
    
    this.areaCode = areaCode;
    return this;
  }

   /**
   * Get areaCode
   * @return areaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AREA_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAreaCode() {
    return areaCode;
  }


  @JsonProperty(JSON_PROPERTY_AREA_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public PlatAgreeOrderReturnRequest area(String area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArea() {
    return area;
  }


  @JsonProperty(JSON_PROPERTY_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArea(String area) {
    this.area = area;
  }


  public PlatAgreeOrderReturnRequest address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public PlatAgreeOrderReturnRequest returnDesc(String returnDesc) {
    
    this.returnDesc = returnDesc;
    return this;
  }

   /**
   * Get returnDesc
   * @return returnDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnDesc() {
    return returnDesc;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnDesc(String returnDesc) {
    this.returnDesc = returnDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatAgreeOrderReturnRequest platAgreeOrderReturnRequest = (PlatAgreeOrderReturnRequest) o;
    return Objects.equals(this.appId, platAgreeOrderReturnRequest.appId) &&
        Objects.equals(this.refundId, platAgreeOrderReturnRequest.refundId) &&
        Objects.equals(this.orderId, platAgreeOrderReturnRequest.orderId) &&
        Objects.equals(this.subOrderId, platAgreeOrderReturnRequest.subOrderId) &&
        Objects.equals(this.complaintId, platAgreeOrderReturnRequest.complaintId) &&
        Objects.equals(this.ucid, platAgreeOrderReturnRequest.ucid) &&
        Objects.equals(this.shopId, platAgreeOrderReturnRequest.shopId) &&
        Objects.equals(this.refundName, platAgreeOrderReturnRequest.refundName) &&
        Objects.equals(this.refundPhone, platAgreeOrderReturnRequest.refundPhone) &&
        Objects.equals(this.refundAddress, platAgreeOrderReturnRequest.refundAddress) &&
        Objects.equals(this.operatorType, platAgreeOrderReturnRequest.operatorType) &&
        Objects.equals(this.operatorDesc, platAgreeOrderReturnRequest.operatorDesc) &&
        Objects.equals(this.shopName, platAgreeOrderReturnRequest.shopName) &&
        Objects.equals(this.shopLogoUrl, platAgreeOrderReturnRequest.shopLogoUrl) &&
        Objects.equals(this.memo, platAgreeOrderReturnRequest.memo) &&
        Objects.equals(this.provinceCode, platAgreeOrderReturnRequest.provinceCode) &&
        Objects.equals(this.province, platAgreeOrderReturnRequest.province) &&
        Objects.equals(this.cityCode, platAgreeOrderReturnRequest.cityCode) &&
        Objects.equals(this.city, platAgreeOrderReturnRequest.city) &&
        Objects.equals(this.areaCode, platAgreeOrderReturnRequest.areaCode) &&
        Objects.equals(this.area, platAgreeOrderReturnRequest.area) &&
        Objects.equals(this.address, platAgreeOrderReturnRequest.address) &&
        Objects.equals(this.returnDesc, platAgreeOrderReturnRequest.returnDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, refundId, orderId, subOrderId, complaintId, ucid, shopId, refundName, refundPhone, refundAddress, operatorType, operatorDesc, shopName, shopLogoUrl, memo, provinceCode, province, cityCode, city, areaCode, area, address, returnDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatAgreeOrderReturnRequest {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    subOrderId: ").append(toIndentedString(subOrderId)).append("\n");
    sb.append("    complaintId: ").append(toIndentedString(complaintId)).append("\n");
    sb.append("    ucid: ").append(toIndentedString(ucid)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    refundName: ").append(toIndentedString(refundName)).append("\n");
    sb.append("    refundPhone: ").append(toIndentedString(refundPhone)).append("\n");
    sb.append("    refundAddress: ").append(toIndentedString(refundAddress)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    operatorDesc: ").append(toIndentedString(operatorDesc)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopLogoUrl: ").append(toIndentedString(shopLogoUrl)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    returnDesc: ").append(toIndentedString(returnDesc)).append("\n");
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

