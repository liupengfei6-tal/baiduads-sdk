/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.leadads.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.leadads.model.BindType;
import com.baidu.dev2.api.sdk.leadads.model.MaterialType;
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
 * StrategyType
 */
@JsonPropertyOrder({
  StrategyType.JSON_PROPERTY_STRATEGY_ID,
  StrategyType.JSON_PROPERTY_USER_ID,
  StrategyType.JSON_PROPERTY_MATERIAL_ID,
  StrategyType.JSON_PROPERTY_MATERIAL_CONTENT,
  StrategyType.JSON_PROPERTY_MATERIAL_TYPE,
  StrategyType.JSON_PROPERTY_IS_PAUSE,
  StrategyType.JSON_PROPERTY_STATUS,
  StrategyType.JSON_PROPERTY_MATERIAL,
  StrategyType.JSON_PROPERTY_BINDS,
  StrategyType.JSON_PROPERTY_ADD_TIME,
  StrategyType.JSON_PROPERTY_MOD_TIME
})
@JsonTypeName("StrategyType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StrategyType {
  public static final String JSON_PROPERTY_STRATEGY_ID = "strategyId";
  private Long strategyId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_MATERIAL_ID = "materialId";
  private Long materialId;

  public static final String JSON_PROPERTY_MATERIAL_CONTENT = "materialContent";
  private String materialContent;

  public static final String JSON_PROPERTY_MATERIAL_TYPE = "materialType";
  private Long materialType;

  public static final String JSON_PROPERTY_IS_PAUSE = "isPause";
  private Integer isPause;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_MATERIAL = "material";
  private MaterialType material;

  public static final String JSON_PROPERTY_BINDS = "binds";
  private List<BindType> binds = null;

  public static final String JSON_PROPERTY_ADD_TIME = "addTime";
  private String addTime;

  public static final String JSON_PROPERTY_MOD_TIME = "modTime";
  private String modTime;

  public StrategyType() { 
  }

  public StrategyType strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * Get strategyId
   * @return strategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrategyId() {
    return strategyId;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public StrategyType userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public StrategyType materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * Get materialId
   * @return materialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaterialId() {
    return materialId;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public StrategyType materialContent(String materialContent) {
    
    this.materialContent = materialContent;
    return this;
  }

   /**
   * Get materialContent
   * @return materialContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaterialContent() {
    return materialContent;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialContent(String materialContent) {
    this.materialContent = materialContent;
  }


  public StrategyType materialType(Long materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaterialType() {
    return materialType;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialType(Long materialType) {
    this.materialType = materialType;
  }


  public StrategyType isPause(Integer isPause) {
    
    this.isPause = isPause;
    return this;
  }

   /**
   * Get isPause
   * @return isPause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsPause() {
    return isPause;
  }


  @JsonProperty(JSON_PROPERTY_IS_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPause(Integer isPause) {
    this.isPause = isPause;
  }


  public StrategyType status(Integer status) {
    
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


  public StrategyType material(MaterialType material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaterialType getMaterial() {
    return material;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterial(MaterialType material) {
    this.material = material;
  }


  public StrategyType binds(List<BindType> binds) {
    
    this.binds = binds;
    return this;
  }

  public StrategyType addBindsItem(BindType bindsItem) {
    if (this.binds == null) {
      this.binds = new ArrayList<>();
    }
    this.binds.add(bindsItem);
    return this;
  }

   /**
   * Get binds
   * @return binds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BINDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BindType> getBinds() {
    return binds;
  }


  @JsonProperty(JSON_PROPERTY_BINDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinds(List<BindType> binds) {
    this.binds = binds;
  }


  public StrategyType addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * Get addTime
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  public StrategyType modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * Get modTime
   * @return modTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModTime() {
    return modTime;
  }


  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrategyType strategyType = (StrategyType) o;
    return Objects.equals(this.strategyId, strategyType.strategyId) &&
        Objects.equals(this.userId, strategyType.userId) &&
        Objects.equals(this.materialId, strategyType.materialId) &&
        Objects.equals(this.materialContent, strategyType.materialContent) &&
        Objects.equals(this.materialType, strategyType.materialType) &&
        Objects.equals(this.isPause, strategyType.isPause) &&
        Objects.equals(this.status, strategyType.status) &&
        Objects.equals(this.material, strategyType.material) &&
        Objects.equals(this.binds, strategyType.binds) &&
        Objects.equals(this.addTime, strategyType.addTime) &&
        Objects.equals(this.modTime, strategyType.modTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategyId, userId, materialId, materialContent, materialType, isPause, status, material, binds, addTime, modTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrategyType {\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialContent: ").append(toIndentedString(materialContent)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    isPause: ").append(toIndentedString(isPause)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    binds: ").append(toIndentedString(binds)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
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

