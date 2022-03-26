/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imagemanagement.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.imagemanagement.model.FilterCondition;
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
 * VideoExtractRequest
 */
@JsonPropertyOrder({
  VideoExtractRequest.JSON_PROPERTY_VIDEO_ID,
  VideoExtractRequest.JSON_PROPERTY_FILTERS,
  VideoExtractRequest.JSON_PROPERTY_PRODUCT_LINE,
  VideoExtractRequest.JSON_PROPERTY_SORT_FIELD,
  VideoExtractRequest.JSON_PROPERTY_SORT_ORDER,
  VideoExtractRequest.JSON_PROPERTY_PAGE_NO,
  VideoExtractRequest.JSON_PROPERTY_PAGE_SIZE
})
@JsonTypeName("VideoExtractRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoExtractRequest {
  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Long videoId;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FilterCondition> filters = null;

  public static final String JSON_PROPERTY_PRODUCT_LINE = "productLine";
  private String productLine;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private String sortOrder;

  public static final String JSON_PROPERTY_PAGE_NO = "pageNo";
  private Integer pageNo;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public VideoExtractRequest() { 
  }

  public VideoExtractRequest videoId(Long videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVideoId() {
    return videoId;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public VideoExtractRequest filters(List<FilterCondition> filters) {
    
    this.filters = filters;
    return this;
  }

  public VideoExtractRequest addFiltersItem(FilterCondition filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FilterCondition> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FilterCondition> filters) {
    this.filters = filters;
  }


  public VideoExtractRequest productLine(String productLine) {
    
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


  public VideoExtractRequest sortField(String sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public VideoExtractRequest sortOrder(String sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }


  public VideoExtractRequest pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * Get pageNo
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNo() {
    return pageNo;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public VideoExtractRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoExtractRequest videoExtractRequest = (VideoExtractRequest) o;
    return Objects.equals(this.videoId, videoExtractRequest.videoId) &&
        Objects.equals(this.filters, videoExtractRequest.filters) &&
        Objects.equals(this.productLine, videoExtractRequest.productLine) &&
        Objects.equals(this.sortField, videoExtractRequest.sortField) &&
        Objects.equals(this.sortOrder, videoExtractRequest.sortOrder) &&
        Objects.equals(this.pageNo, videoExtractRequest.pageNo) &&
        Objects.equals(this.pageSize, videoExtractRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, filters, productLine, sortField, sortOrder, pageNo, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoExtractRequest {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
