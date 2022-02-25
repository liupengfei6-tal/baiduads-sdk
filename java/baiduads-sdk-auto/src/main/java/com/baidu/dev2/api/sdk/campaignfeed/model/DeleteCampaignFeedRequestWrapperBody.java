/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaignfeed.model;

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
 * DeleteCampaignFeedRequestWrapperBody
 */
@JsonPropertyOrder({
  DeleteCampaignFeedRequestWrapperBody.JSON_PROPERTY_CAMPAIGN_FEED_IDS
})
@JsonTypeName("DeleteCampaignFeedRequestWrapperBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteCampaignFeedRequestWrapperBody {
  public static final String JSON_PROPERTY_CAMPAIGN_FEED_IDS = "campaignFeedIds";
  private List<Long> campaignFeedIds = null;

  public DeleteCampaignFeedRequestWrapperBody() { 
  }

  public DeleteCampaignFeedRequestWrapperBody campaignFeedIds(List<Long> campaignFeedIds) {
    
    this.campaignFeedIds = campaignFeedIds;
    return this;
  }

  public DeleteCampaignFeedRequestWrapperBody addCampaignFeedIdsItem(Long campaignFeedIdsItem) {
    if (this.campaignFeedIds == null) {
      this.campaignFeedIds = new ArrayList<>();
    }
    this.campaignFeedIds.add(campaignFeedIdsItem);
    return this;
  }

   /**
   * Get campaignFeedIds
   * @return campaignFeedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignFeedIds() {
    return campaignFeedIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignFeedIds(List<Long> campaignFeedIds) {
    this.campaignFeedIds = campaignFeedIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCampaignFeedRequestWrapperBody deleteCampaignFeedRequestWrapperBody = (DeleteCampaignFeedRequestWrapperBody) o;
    return Objects.equals(this.campaignFeedIds, deleteCampaignFeedRequestWrapperBody.campaignFeedIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignFeedIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCampaignFeedRequestWrapperBody {\n");
    sb.append("    campaignFeedIds: ").append(toIndentedString(campaignFeedIds)).append("\n");
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

