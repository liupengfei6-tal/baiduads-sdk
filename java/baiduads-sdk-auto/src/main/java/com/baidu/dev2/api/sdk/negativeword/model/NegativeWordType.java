/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.negativeword.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.negativeword.model.NegativeWordPacket;
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
 * NegativeWordType
 */
@JsonPropertyOrder({
  NegativeWordType.JSON_PROPERTY_CAMPAIGN_ID,
  NegativeWordType.JSON_PROPERTY_ADGROUP_ID,
  NegativeWordType.JSON_PROPERTY_NEGATIVE_WORDS,
  NegativeWordType.JSON_PROPERTY_EXACT_NEGATIVE_WORDS,
  NegativeWordType.JSON_PROPERTY_NEGATIVE_WORD_PACKET_IDS,
  NegativeWordType.JSON_PROPERTY_NEGATIVE_WORD_PACKETS
})
@JsonTypeName("NegativeWordType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NegativeWordType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_NEGATIVE_WORDS = "negativeWords";
  private List<String> negativeWords = null;

  public static final String JSON_PROPERTY_EXACT_NEGATIVE_WORDS = "exactNegativeWords";
  private List<String> exactNegativeWords = null;

  public static final String JSON_PROPERTY_NEGATIVE_WORD_PACKET_IDS = "negativeWordPacketIds";
  private List<Long> negativeWordPacketIds = null;

  public static final String JSON_PROPERTY_NEGATIVE_WORD_PACKETS = "negativeWordPackets";
  private List<NegativeWordPacket> negativeWordPackets = null;

  public NegativeWordType() { 
  }

  public NegativeWordType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public NegativeWordType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public NegativeWordType negativeWords(List<String> negativeWords) {
    
    this.negativeWords = negativeWords;
    return this;
  }

  public NegativeWordType addNegativeWordsItem(String negativeWordsItem) {
    if (this.negativeWords == null) {
      this.negativeWords = new ArrayList<>();
    }
    this.negativeWords.add(negativeWordsItem);
    return this;
  }

   /**
   * Get negativeWords
   * @return negativeWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNegativeWords() {
    return negativeWords;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeWords(List<String> negativeWords) {
    this.negativeWords = negativeWords;
  }


  public NegativeWordType exactNegativeWords(List<String> exactNegativeWords) {
    
    this.exactNegativeWords = exactNegativeWords;
    return this;
  }

  public NegativeWordType addExactNegativeWordsItem(String exactNegativeWordsItem) {
    if (this.exactNegativeWords == null) {
      this.exactNegativeWords = new ArrayList<>();
    }
    this.exactNegativeWords.add(exactNegativeWordsItem);
    return this;
  }

   /**
   * Get exactNegativeWords
   * @return exactNegativeWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXACT_NEGATIVE_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExactNegativeWords() {
    return exactNegativeWords;
  }


  @JsonProperty(JSON_PROPERTY_EXACT_NEGATIVE_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExactNegativeWords(List<String> exactNegativeWords) {
    this.exactNegativeWords = exactNegativeWords;
  }


  public NegativeWordType negativeWordPacketIds(List<Long> negativeWordPacketIds) {
    
    this.negativeWordPacketIds = negativeWordPacketIds;
    return this;
  }

  public NegativeWordType addNegativeWordPacketIdsItem(Long negativeWordPacketIdsItem) {
    if (this.negativeWordPacketIds == null) {
      this.negativeWordPacketIds = new ArrayList<>();
    }
    this.negativeWordPacketIds.add(negativeWordPacketIdsItem);
    return this;
  }

   /**
   * Get negativeWordPacketIds
   * @return negativeWordPacketIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD_PACKET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getNegativeWordPacketIds() {
    return negativeWordPacketIds;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD_PACKET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeWordPacketIds(List<Long> negativeWordPacketIds) {
    this.negativeWordPacketIds = negativeWordPacketIds;
  }


  public NegativeWordType negativeWordPackets(List<NegativeWordPacket> negativeWordPackets) {
    
    this.negativeWordPackets = negativeWordPackets;
    return this;
  }

  public NegativeWordType addNegativeWordPacketsItem(NegativeWordPacket negativeWordPacketsItem) {
    if (this.negativeWordPackets == null) {
      this.negativeWordPackets = new ArrayList<>();
    }
    this.negativeWordPackets.add(negativeWordPacketsItem);
    return this;
  }

   /**
   * Get negativeWordPackets
   * @return negativeWordPackets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD_PACKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NegativeWordPacket> getNegativeWordPackets() {
    return negativeWordPackets;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_WORD_PACKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeWordPackets(List<NegativeWordPacket> negativeWordPackets) {
    this.negativeWordPackets = negativeWordPackets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegativeWordType negativeWordType = (NegativeWordType) o;
    return Objects.equals(this.campaignId, negativeWordType.campaignId) &&
        Objects.equals(this.adgroupId, negativeWordType.adgroupId) &&
        Objects.equals(this.negativeWords, negativeWordType.negativeWords) &&
        Objects.equals(this.exactNegativeWords, negativeWordType.exactNegativeWords) &&
        Objects.equals(this.negativeWordPacketIds, negativeWordType.negativeWordPacketIds) &&
        Objects.equals(this.negativeWordPackets, negativeWordType.negativeWordPackets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, adgroupId, negativeWords, exactNegativeWords, negativeWordPacketIds, negativeWordPackets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeWordType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    negativeWords: ").append(toIndentedString(negativeWords)).append("\n");
    sb.append("    exactNegativeWords: ").append(toIndentedString(exactNegativeWords)).append("\n");
    sb.append("    negativeWordPacketIds: ").append(toIndentedString(negativeWordPacketIds)).append("\n");
    sb.append("    negativeWordPackets: ").append(toIndentedString(negativeWordPackets)).append("\n");
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
