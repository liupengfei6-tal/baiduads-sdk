/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialarticle.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialarticle.model.AuthorInfo;
import com.baidu.dev2.api.sdk.materialarticle.model.CaseFee;
import com.baidu.dev2.api.sdk.materialarticle.model.DetailCategoryDto;
import com.baidu.dev2.api.sdk.materialarticle.model.TpInfo;
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
 * ArticleExtDto
 */
@JsonPropertyOrder({
  ArticleExtDto.JSON_PROPERTY_APARTMENT_LAYOUT,
  ArticleExtDto.JSON_PROPERTY_SIZE,
  ArticleExtDto.JSON_PROPERTY_DECORATION_TYPE,
  ArticleExtDto.JSON_PROPERTY_COMMUNITY_NAME,
  ArticleExtDto.JSON_PROPERTY_DECORATION_METHOD,
  ArticleExtDto.JSON_PROPERTY_DESIGN_TYPE,
  ArticleExtDto.JSON_PROPERTY_DESIGN_FEE,
  ArticleExtDto.JSON_PROPERTY_MATERIAL_FEE,
  ArticleExtDto.JSON_PROPERTY_CONSTRUCTION_FEE,
  ArticleExtDto.JSON_PROPERTY_AUTHOR,
  ArticleExtDto.JSON_PROPERTY_DETAIL_CATEGORY,
  ArticleExtDto.JSON_PROPERTY_TP_INFO
})
@JsonTypeName("ArticleExtDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArticleExtDto {
  public static final String JSON_PROPERTY_APARTMENT_LAYOUT = "apartmentLayout";
  private String apartmentLayout;

  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public static final String JSON_PROPERTY_DECORATION_TYPE = "decorationType";
  private Integer decorationType;

  public static final String JSON_PROPERTY_COMMUNITY_NAME = "communityName";
  private String communityName;

  public static final String JSON_PROPERTY_DECORATION_METHOD = "decorationMethod";
  private Integer decorationMethod;

  public static final String JSON_PROPERTY_DESIGN_TYPE = "designType";
  private String designType;

  public static final String JSON_PROPERTY_DESIGN_FEE = "designFee";
  private CaseFee designFee;

  public static final String JSON_PROPERTY_MATERIAL_FEE = "materialFee";
  private CaseFee materialFee;

  public static final String JSON_PROPERTY_CONSTRUCTION_FEE = "constructionFee";
  private CaseFee constructionFee;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private AuthorInfo author;

  public static final String JSON_PROPERTY_DETAIL_CATEGORY = "detailCategory";
  private List<DetailCategoryDto> detailCategory = null;

  public static final String JSON_PROPERTY_TP_INFO = "tpInfo";
  private TpInfo tpInfo;

  public ArticleExtDto() { 
  }

  public ArticleExtDto apartmentLayout(String apartmentLayout) {
    
    this.apartmentLayout = apartmentLayout;
    return this;
  }

   /**
   * Get apartmentLayout
   * @return apartmentLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APARTMENT_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApartmentLayout() {
    return apartmentLayout;
  }


  @JsonProperty(JSON_PROPERTY_APARTMENT_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApartmentLayout(String apartmentLayout) {
    this.apartmentLayout = apartmentLayout;
  }


  public ArticleExtDto size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(String size) {
    this.size = size;
  }


  public ArticleExtDto decorationType(Integer decorationType) {
    
    this.decorationType = decorationType;
    return this;
  }

   /**
   * Get decorationType
   * @return decorationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DECORATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDecorationType() {
    return decorationType;
  }


  @JsonProperty(JSON_PROPERTY_DECORATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecorationType(Integer decorationType) {
    this.decorationType = decorationType;
  }


  public ArticleExtDto communityName(String communityName) {
    
    this.communityName = communityName;
    return this;
  }

   /**
   * Get communityName
   * @return communityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMUNITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommunityName() {
    return communityName;
  }


  @JsonProperty(JSON_PROPERTY_COMMUNITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommunityName(String communityName) {
    this.communityName = communityName;
  }


  public ArticleExtDto decorationMethod(Integer decorationMethod) {
    
    this.decorationMethod = decorationMethod;
    return this;
  }

   /**
   * Get decorationMethod
   * @return decorationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DECORATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDecorationMethod() {
    return decorationMethod;
  }


  @JsonProperty(JSON_PROPERTY_DECORATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecorationMethod(Integer decorationMethod) {
    this.decorationMethod = decorationMethod;
  }


  public ArticleExtDto designType(String designType) {
    
    this.designType = designType;
    return this;
  }

   /**
   * Get designType
   * @return designType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESIGN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesignType() {
    return designType;
  }


  @JsonProperty(JSON_PROPERTY_DESIGN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesignType(String designType) {
    this.designType = designType;
  }


  public ArticleExtDto designFee(CaseFee designFee) {
    
    this.designFee = designFee;
    return this;
  }

   /**
   * Get designFee
   * @return designFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESIGN_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CaseFee getDesignFee() {
    return designFee;
  }


  @JsonProperty(JSON_PROPERTY_DESIGN_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesignFee(CaseFee designFee) {
    this.designFee = designFee;
  }


  public ArticleExtDto materialFee(CaseFee materialFee) {
    
    this.materialFee = materialFee;
    return this;
  }

   /**
   * Get materialFee
   * @return materialFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CaseFee getMaterialFee() {
    return materialFee;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialFee(CaseFee materialFee) {
    this.materialFee = materialFee;
  }


  public ArticleExtDto constructionFee(CaseFee constructionFee) {
    
    this.constructionFee = constructionFee;
    return this;
  }

   /**
   * Get constructionFee
   * @return constructionFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRUCTION_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CaseFee getConstructionFee() {
    return constructionFee;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRUCTION_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructionFee(CaseFee constructionFee) {
    this.constructionFee = constructionFee;
  }


  public ArticleExtDto author(AuthorInfo author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorInfo getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(AuthorInfo author) {
    this.author = author;
  }


  public ArticleExtDto detailCategory(List<DetailCategoryDto> detailCategory) {
    
    this.detailCategory = detailCategory;
    return this;
  }

  public ArticleExtDto addDetailCategoryItem(DetailCategoryDto detailCategoryItem) {
    if (this.detailCategory == null) {
      this.detailCategory = new ArrayList<>();
    }
    this.detailCategory.add(detailCategoryItem);
    return this;
  }

   /**
   * Get detailCategory
   * @return detailCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAIL_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DetailCategoryDto> getDetailCategory() {
    return detailCategory;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailCategory(List<DetailCategoryDto> detailCategory) {
    this.detailCategory = detailCategory;
  }


  public ArticleExtDto tpInfo(TpInfo tpInfo) {
    
    this.tpInfo = tpInfo;
    return this;
  }

   /**
   * Get tpInfo
   * @return tpInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TpInfo getTpInfo() {
    return tpInfo;
  }


  @JsonProperty(JSON_PROPERTY_TP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTpInfo(TpInfo tpInfo) {
    this.tpInfo = tpInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleExtDto articleExtDto = (ArticleExtDto) o;
    return Objects.equals(this.apartmentLayout, articleExtDto.apartmentLayout) &&
        Objects.equals(this.size, articleExtDto.size) &&
        Objects.equals(this.decorationType, articleExtDto.decorationType) &&
        Objects.equals(this.communityName, articleExtDto.communityName) &&
        Objects.equals(this.decorationMethod, articleExtDto.decorationMethod) &&
        Objects.equals(this.designType, articleExtDto.designType) &&
        Objects.equals(this.designFee, articleExtDto.designFee) &&
        Objects.equals(this.materialFee, articleExtDto.materialFee) &&
        Objects.equals(this.constructionFee, articleExtDto.constructionFee) &&
        Objects.equals(this.author, articleExtDto.author) &&
        Objects.equals(this.detailCategory, articleExtDto.detailCategory) &&
        Objects.equals(this.tpInfo, articleExtDto.tpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apartmentLayout, size, decorationType, communityName, decorationMethod, designType, designFee, materialFee, constructionFee, author, detailCategory, tpInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleExtDto {\n");
    sb.append("    apartmentLayout: ").append(toIndentedString(apartmentLayout)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    decorationType: ").append(toIndentedString(decorationType)).append("\n");
    sb.append("    communityName: ").append(toIndentedString(communityName)).append("\n");
    sb.append("    decorationMethod: ").append(toIndentedString(decorationMethod)).append("\n");
    sb.append("    designType: ").append(toIndentedString(designType)).append("\n");
    sb.append("    designFee: ").append(toIndentedString(designFee)).append("\n");
    sb.append("    materialFee: ").append(toIndentedString(materialFee)).append("\n");
    sb.append("    constructionFee: ").append(toIndentedString(constructionFee)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    detailCategory: ").append(toIndentedString(detailCategory)).append("\n");
    sb.append("    tpInfo: ").append(toIndentedString(tpInfo)).append("\n");
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

