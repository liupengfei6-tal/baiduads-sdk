/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platshop.model;

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
 * PlatShopCategoryItemVo
 */
@JsonPropertyOrder({
  PlatShopCategoryItemVo.JSON_PROPERTY_CATEGORY_ID,
  PlatShopCategoryItemVo.JSON_PROPERTY_CATEGORY_NAME,
  PlatShopCategoryItemVo.JSON_PROPERTY_PARENT_ID,
  PlatShopCategoryItemVo.JSON_PROPERTY_LEVEL,
  PlatShopCategoryItemVo.JSON_PROPERTY_HAS_CHILD,
  PlatShopCategoryItemVo.JSON_PROPERTY_GUARANTEE_PRICE,
  PlatShopCategoryItemVo.JSON_PROPERTY_PAID_GUARANTEE_PRICE,
  PlatShopCategoryItemVo.JSON_PROPERTY_NEED_QUALIFY,
  PlatShopCategoryItemVo.JSON_PROPERTY_QUALIFY_DESC,
  PlatShopCategoryItemVo.JSON_PROPERTY_CHILD_LIST,
  PlatShopCategoryItemVo.JSON_PROPERTY_BIG_CATEGORY_NAME,
  PlatShopCategoryItemVo.JSON_PROPERTY_HOME_CATEGORY,
  PlatShopCategoryItemVo.JSON_PROPERTY_IS_HIGH_RISK_CATEGORY
})
@JsonTypeName("PlatShopCategoryItemVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatShopCategoryItemVo {
  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private Long categoryId;

  public static final String JSON_PROPERTY_CATEGORY_NAME = "categoryName";
  private String categoryName;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private Long parentId;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level;

  public static final String JSON_PROPERTY_HAS_CHILD = "hasChild";
  private Boolean hasChild;

  public static final String JSON_PROPERTY_GUARANTEE_PRICE = "guaranteePrice";
  private Integer guaranteePrice;

  public static final String JSON_PROPERTY_PAID_GUARANTEE_PRICE = "paidGuaranteePrice";
  private Integer paidGuaranteePrice;

  public static final String JSON_PROPERTY_NEED_QUALIFY = "needQualify";
  private Integer needQualify;

  public static final String JSON_PROPERTY_QUALIFY_DESC = "qualifyDesc";
  private String qualifyDesc;

  public static final String JSON_PROPERTY_CHILD_LIST = "childList";
  private List<PlatShopCategoryItemVo> childList = null;

  public static final String JSON_PROPERTY_BIG_CATEGORY_NAME = "bigCategoryName";
  private String bigCategoryName;

  public static final String JSON_PROPERTY_HOME_CATEGORY = "homeCategory";
  private Integer homeCategory;

  public static final String JSON_PROPERTY_IS_HIGH_RISK_CATEGORY = "isHighRiskCategory";
  private Integer isHighRiskCategory;

  public PlatShopCategoryItemVo() { 
  }

  public PlatShopCategoryItemVo categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public PlatShopCategoryItemVo categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryName() {
    return categoryName;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public PlatShopCategoryItemVo parentId(Long parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public PlatShopCategoryItemVo level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(Integer level) {
    this.level = level;
  }


  public PlatShopCategoryItemVo hasChild(Boolean hasChild) {
    
    this.hasChild = hasChild;
    return this;
  }

   /**
   * Get hasChild
   * @return hasChild
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasChild() {
    return hasChild;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasChild(Boolean hasChild) {
    this.hasChild = hasChild;
  }


  public PlatShopCategoryItemVo guaranteePrice(Integer guaranteePrice) {
    
    this.guaranteePrice = guaranteePrice;
    return this;
  }

   /**
   * Get guaranteePrice
   * @return guaranteePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GUARANTEE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGuaranteePrice() {
    return guaranteePrice;
  }


  @JsonProperty(JSON_PROPERTY_GUARANTEE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuaranteePrice(Integer guaranteePrice) {
    this.guaranteePrice = guaranteePrice;
  }


  public PlatShopCategoryItemVo paidGuaranteePrice(Integer paidGuaranteePrice) {
    
    this.paidGuaranteePrice = paidGuaranteePrice;
    return this;
  }

   /**
   * Get paidGuaranteePrice
   * @return paidGuaranteePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAID_GUARANTEE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaidGuaranteePrice() {
    return paidGuaranteePrice;
  }


  @JsonProperty(JSON_PROPERTY_PAID_GUARANTEE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidGuaranteePrice(Integer paidGuaranteePrice) {
    this.paidGuaranteePrice = paidGuaranteePrice;
  }


  public PlatShopCategoryItemVo needQualify(Integer needQualify) {
    
    this.needQualify = needQualify;
    return this;
  }

   /**
   * Get needQualify
   * @return needQualify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEED_QUALIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNeedQualify() {
    return needQualify;
  }


  @JsonProperty(JSON_PROPERTY_NEED_QUALIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedQualify(Integer needQualify) {
    this.needQualify = needQualify;
  }


  public PlatShopCategoryItemVo qualifyDesc(String qualifyDesc) {
    
    this.qualifyDesc = qualifyDesc;
    return this;
  }

   /**
   * Get qualifyDesc
   * @return qualifyDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUALIFY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQualifyDesc() {
    return qualifyDesc;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQualifyDesc(String qualifyDesc) {
    this.qualifyDesc = qualifyDesc;
  }


  public PlatShopCategoryItemVo childList(List<PlatShopCategoryItemVo> childList) {
    
    this.childList = childList;
    return this;
  }

  public PlatShopCategoryItemVo addChildListItem(PlatShopCategoryItemVo childListItem) {
    if (this.childList == null) {
      this.childList = new ArrayList<>();
    }
    this.childList.add(childListItem);
    return this;
  }

   /**
   * Get childList
   * @return childList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHILD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlatShopCategoryItemVo> getChildList() {
    return childList;
  }


  @JsonProperty(JSON_PROPERTY_CHILD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildList(List<PlatShopCategoryItemVo> childList) {
    this.childList = childList;
  }


  public PlatShopCategoryItemVo bigCategoryName(String bigCategoryName) {
    
    this.bigCategoryName = bigCategoryName;
    return this;
  }

   /**
   * Get bigCategoryName
   * @return bigCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIG_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBigCategoryName() {
    return bigCategoryName;
  }


  @JsonProperty(JSON_PROPERTY_BIG_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBigCategoryName(String bigCategoryName) {
    this.bigCategoryName = bigCategoryName;
  }


  public PlatShopCategoryItemVo homeCategory(Integer homeCategory) {
    
    this.homeCategory = homeCategory;
    return this;
  }

   /**
   * Get homeCategory
   * @return homeCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOME_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHomeCategory() {
    return homeCategory;
  }


  @JsonProperty(JSON_PROPERTY_HOME_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomeCategory(Integer homeCategory) {
    this.homeCategory = homeCategory;
  }


  public PlatShopCategoryItemVo isHighRiskCategory(Integer isHighRiskCategory) {
    
    this.isHighRiskCategory = isHighRiskCategory;
    return this;
  }

   /**
   * Get isHighRiskCategory
   * @return isHighRiskCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_HIGH_RISK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsHighRiskCategory() {
    return isHighRiskCategory;
  }


  @JsonProperty(JSON_PROPERTY_IS_HIGH_RISK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHighRiskCategory(Integer isHighRiskCategory) {
    this.isHighRiskCategory = isHighRiskCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatShopCategoryItemVo platShopCategoryItemVo = (PlatShopCategoryItemVo) o;
    return Objects.equals(this.categoryId, platShopCategoryItemVo.categoryId) &&
        Objects.equals(this.categoryName, platShopCategoryItemVo.categoryName) &&
        Objects.equals(this.parentId, platShopCategoryItemVo.parentId) &&
        Objects.equals(this.level, platShopCategoryItemVo.level) &&
        Objects.equals(this.hasChild, platShopCategoryItemVo.hasChild) &&
        Objects.equals(this.guaranteePrice, platShopCategoryItemVo.guaranteePrice) &&
        Objects.equals(this.paidGuaranteePrice, platShopCategoryItemVo.paidGuaranteePrice) &&
        Objects.equals(this.needQualify, platShopCategoryItemVo.needQualify) &&
        Objects.equals(this.qualifyDesc, platShopCategoryItemVo.qualifyDesc) &&
        Objects.equals(this.childList, platShopCategoryItemVo.childList) &&
        Objects.equals(this.bigCategoryName, platShopCategoryItemVo.bigCategoryName) &&
        Objects.equals(this.homeCategory, platShopCategoryItemVo.homeCategory) &&
        Objects.equals(this.isHighRiskCategory, platShopCategoryItemVo.isHighRiskCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, parentId, level, hasChild, guaranteePrice, paidGuaranteePrice, needQualify, qualifyDesc, childList, bigCategoryName, homeCategory, isHighRiskCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatShopCategoryItemVo {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    hasChild: ").append(toIndentedString(hasChild)).append("\n");
    sb.append("    guaranteePrice: ").append(toIndentedString(guaranteePrice)).append("\n");
    sb.append("    paidGuaranteePrice: ").append(toIndentedString(paidGuaranteePrice)).append("\n");
    sb.append("    needQualify: ").append(toIndentedString(needQualify)).append("\n");
    sb.append("    qualifyDesc: ").append(toIndentedString(qualifyDesc)).append("\n");
    sb.append("    childList: ").append(toIndentedString(childList)).append("\n");
    sb.append("    bigCategoryName: ").append(toIndentedString(bigCategoryName)).append("\n");
    sb.append("    homeCategory: ").append(toIndentedString(homeCategory)).append("\n");
    sb.append("    isHighRiskCategory: ").append(toIndentedString(isHighRiskCategory)).append("\n");
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

