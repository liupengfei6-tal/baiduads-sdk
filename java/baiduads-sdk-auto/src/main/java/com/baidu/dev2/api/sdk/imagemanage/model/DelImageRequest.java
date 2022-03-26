/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imagemanage.model;

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
 * DelImageRequest
 */
@JsonPropertyOrder({
  DelImageRequest.JSON_PROPERTY_PRODUCT_LINE,
  DelImageRequest.JSON_PROPERTY_URL_LIST,
  DelImageRequest.JSON_PROPERTY_PIC_IDS,
  DelImageRequest.JSON_PROPERTY_IMAGE_IDS
})
@JsonTypeName("DelImageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DelImageRequest {
  public static final String JSON_PROPERTY_PRODUCT_LINE = "productLine";
  private String productLine;

  public static final String JSON_PROPERTY_URL_LIST = "urlList";
  private List<String> urlList = null;

  public static final String JSON_PROPERTY_PIC_IDS = "picIds";
  private List<Long> picIds = null;

  public static final String JSON_PROPERTY_IMAGE_IDS = "imageIds";
  private List<Long> imageIds = null;

  public DelImageRequest() { 
  }

  public DelImageRequest productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * Get productLine
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductLine() {
    return productLine;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  public DelImageRequest urlList(List<String> urlList) {
    
    this.urlList = urlList;
    return this;
  }

  public DelImageRequest addUrlListItem(String urlListItem) {
    if (this.urlList == null) {
      this.urlList = new ArrayList<>();
    }
    this.urlList.add(urlListItem);
    return this;
  }

   /**
   * Get urlList
   * @return urlList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUrlList() {
    return urlList;
  }


  @JsonProperty(JSON_PROPERTY_URL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlList(List<String> urlList) {
    this.urlList = urlList;
  }


  public DelImageRequest picIds(List<Long> picIds) {
    
    this.picIds = picIds;
    return this;
  }

  public DelImageRequest addPicIdsItem(Long picIdsItem) {
    if (this.picIds == null) {
      this.picIds = new ArrayList<>();
    }
    this.picIds.add(picIdsItem);
    return this;
  }

   /**
   * Get picIds
   * @return picIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PIC_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPicIds() {
    return picIds;
  }


  @JsonProperty(JSON_PROPERTY_PIC_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPicIds(List<Long> picIds) {
    this.picIds = picIds;
  }


  public DelImageRequest imageIds(List<Long> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public DelImageRequest addImageIdsItem(Long imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * Get imageIds
   * @return imageIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getImageIds() {
    return imageIds;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageIds(List<Long> imageIds) {
    this.imageIds = imageIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelImageRequest delImageRequest = (DelImageRequest) o;
    return Objects.equals(this.productLine, delImageRequest.productLine) &&
        Objects.equals(this.urlList, delImageRequest.urlList) &&
        Objects.equals(this.picIds, delImageRequest.picIds) &&
        Objects.equals(this.imageIds, delImageRequest.imageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLine, urlList, picIds, imageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelImageRequest {\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
    sb.append("    picIds: ").append(toIndentedString(picIds)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
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
