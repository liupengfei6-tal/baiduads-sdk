/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialproduct.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductExtDto;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductImage;
import com.baidu.dev2.api.sdk.materialproduct.model.ProductVideo;
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
 * TeslaProductUpdateRequest
 */
@JsonPropertyOrder({
  TeslaProductUpdateRequest.JSON_PROPERTY_PRODUCT_ID,
  TeslaProductUpdateRequest.JSON_PROPERTY_CATEGORY_ID,
  TeslaProductUpdateRequest.JSON_PROPERTY_PRODUCT_TITLE,
  TeslaProductUpdateRequest.JSON_PROPERTY_DESC,
  TeslaProductUpdateRequest.JSON_PROPERTY_CONTENT,
  TeslaProductUpdateRequest.JSON_PROPERTY_STATUS,
  TeslaProductUpdateRequest.JSON_PROPERTY_PRODUCT_SHORT_TITLE,
  TeslaProductUpdateRequest.JSON_PROPERTY_IMAGE,
  TeslaProductUpdateRequest.JSON_PROPERTY_PRODUCT_EXT,
  TeslaProductUpdateRequest.JSON_PROPERTY_VIDEO,
  TeslaProductUpdateRequest.JSON_PROPERTY_DATA_VERSION
})
@JsonTypeName("TeslaProductUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeslaProductUpdateRequest {
  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private Long productId;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private Long categoryId;

  public static final String JSON_PROPERTY_PRODUCT_TITLE = "productTitle";
  private String productTitle;

  public static final String JSON_PROPERTY_DESC = "desc";
  private String desc;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_PRODUCT_SHORT_TITLE = "productShortTitle";
  private String productShortTitle;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private List<ProductImage> image = null;

  public static final String JSON_PROPERTY_PRODUCT_EXT = "productExt";
  private ProductExtDto productExt;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private List<ProductVideo> video = null;

  public static final String JSON_PROPERTY_DATA_VERSION = "dataVersion";
  private Integer dataVersion;

  public TeslaProductUpdateRequest() { 
  }

  public TeslaProductUpdateRequest productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public TeslaProductUpdateRequest categoryId(Long categoryId) {
    
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


  public TeslaProductUpdateRequest productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * Get productTitle
   * @return productTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductTitle() {
    return productTitle;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public TeslaProductUpdateRequest desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(String desc) {
    this.desc = desc;
  }


  public TeslaProductUpdateRequest content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public TeslaProductUpdateRequest status(Integer status) {
    
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


  public TeslaProductUpdateRequest productShortTitle(String productShortTitle) {
    
    this.productShortTitle = productShortTitle;
    return this;
  }

   /**
   * Get productShortTitle
   * @return productShortTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_SHORT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductShortTitle() {
    return productShortTitle;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_SHORT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductShortTitle(String productShortTitle) {
    this.productShortTitle = productShortTitle;
  }


  public TeslaProductUpdateRequest image(List<ProductImage> image) {
    
    this.image = image;
    return this;
  }

  public TeslaProductUpdateRequest addImageItem(ProductImage imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductImage> getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(List<ProductImage> image) {
    this.image = image;
  }


  public TeslaProductUpdateRequest productExt(ProductExtDto productExt) {
    
    this.productExt = productExt;
    return this;
  }

   /**
   * Get productExt
   * @return productExt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductExtDto getProductExt() {
    return productExt;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductExt(ProductExtDto productExt) {
    this.productExt = productExt;
  }


  public TeslaProductUpdateRequest video(List<ProductVideo> video) {
    
    this.video = video;
    return this;
  }

  public TeslaProductUpdateRequest addVideoItem(ProductVideo videoItem) {
    if (this.video == null) {
      this.video = new ArrayList<>();
    }
    this.video.add(videoItem);
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductVideo> getVideo() {
    return video;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(List<ProductVideo> video) {
    this.video = video;
  }


  public TeslaProductUpdateRequest dataVersion(Integer dataVersion) {
    
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDataVersion() {
    return dataVersion;
  }


  @JsonProperty(JSON_PROPERTY_DATA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataVersion(Integer dataVersion) {
    this.dataVersion = dataVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeslaProductUpdateRequest teslaProductUpdateRequest = (TeslaProductUpdateRequest) o;
    return Objects.equals(this.productId, teslaProductUpdateRequest.productId) &&
        Objects.equals(this.categoryId, teslaProductUpdateRequest.categoryId) &&
        Objects.equals(this.productTitle, teslaProductUpdateRequest.productTitle) &&
        Objects.equals(this.desc, teslaProductUpdateRequest.desc) &&
        Objects.equals(this.content, teslaProductUpdateRequest.content) &&
        Objects.equals(this.status, teslaProductUpdateRequest.status) &&
        Objects.equals(this.productShortTitle, teslaProductUpdateRequest.productShortTitle) &&
        Objects.equals(this.image, teslaProductUpdateRequest.image) &&
        Objects.equals(this.productExt, teslaProductUpdateRequest.productExt) &&
        Objects.equals(this.video, teslaProductUpdateRequest.video) &&
        Objects.equals(this.dataVersion, teslaProductUpdateRequest.dataVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId, productTitle, desc, content, status, productShortTitle, image, productExt, video, dataVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeslaProductUpdateRequest {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productShortTitle: ").append(toIndentedString(productShortTitle)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    productExt: ").append(toIndentedString(productExt)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
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

