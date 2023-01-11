/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.ocpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.ocpc.model.TargetPackageBindInfo;
import com.baidu.dev2.api.sdk.ocpc.model.TargetPackageDataflowInfo;
import com.baidu.dev2.api.sdk.ocpc.model.UnbindSharedBudgetInfo;
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
 * TargetPackageType
 */
@JsonPropertyOrder({
  TargetPackageType.JSON_PROPERTY_TARGET_PACKAGE_ID,
  TargetPackageType.JSON_PROPERTY_TARGET_PACKAGE_NAME,
  TargetPackageType.JSON_PROPERTY_OCPC_BID_TYPE,
  TargetPackageType.JSON_PROPERTY_EQUIPMENT_TYPE,
  TargetPackageType.JSON_PROPERTY_OCPC_BID,
  TargetPackageType.JSON_PROPERTY_ECPC_MAX_BID_RATIO,
  TargetPackageType.JSON_PROPERTY_SCOPE,
  TargetPackageType.JSON_PROPERTY_DATA_FLOW_DATA,
  TargetPackageType.JSON_PROPERTY_OCPC_STAGE,
  TargetPackageType.JSON_PROPERTY_ADOPT_NO_THRESHOLD,
  TargetPackageType.JSON_PROPERTY_ASTAT,
  TargetPackageType.JSON_PROPERTY_ADOPT_OCPC_BID,
  TargetPackageType.JSON_PROPERTY_WISE_AUDIT_TIME,
  TargetPackageType.JSON_PROPERTY_ASSIST_TRANS_TYPES,
  TargetPackageType.JSON_PROPERTY_PACKAGE_STATUS,
  TargetPackageType.JSON_PROPERTY_OCPC_DEEP_CPA,
  TargetPackageType.JSON_PROPERTY_DEEP_TYPE_STAT,
  TargetPackageType.JSON_PROPERTY_DEEP_TRANS_TYPE_MODE,
  TargetPackageType.JSON_PROPERTY_CV_SOURCES,
  TargetPackageType.JSON_PROPERTY_TRANS_TYPES,
  TargetPackageType.JSON_PROPERTY_CV_SOURCES_SHADOW,
  TargetPackageType.JSON_PROPERTY_TRANS_TYPES_SHADOW,
  TargetPackageType.JSON_PROPERTY_OCPC_DEEP_BID,
  TargetPackageType.JSON_PROPERTY_SHARED_BUDGET,
  TargetPackageType.JSON_PROPERTY_UNBIND_SHARED_BUDGET_INFO,
  TargetPackageType.JSON_PROPERTY_SHARED_BUDGET_ID,
  TargetPackageType.JSON_PROPERTY_USE_SHARED_BUDGET
})
@JsonTypeName("TargetPackageType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetPackageType {
  public static final String JSON_PROPERTY_TARGET_PACKAGE_ID = "targetPackageId";
  private Long targetPackageId;

  public static final String JSON_PROPERTY_TARGET_PACKAGE_NAME = "targetPackageName";
  private String targetPackageName;

  public static final String JSON_PROPERTY_OCPC_BID_TYPE = "ocpcBidType";
  private Integer ocpcBidType;

  public static final String JSON_PROPERTY_EQUIPMENT_TYPE = "equipmentType";
  private Integer equipmentType;

  public static final String JSON_PROPERTY_OCPC_BID = "ocpcBid";
  private Double ocpcBid;

  public static final String JSON_PROPERTY_ECPC_MAX_BID_RATIO = "ecpcMaxBidRatio";
  private Double ecpcMaxBidRatio;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<TargetPackageBindInfo> scope = null;

  public static final String JSON_PROPERTY_DATA_FLOW_DATA = "dataFlowData";
  private List<TargetPackageDataflowInfo> dataFlowData = null;

  public static final String JSON_PROPERTY_OCPC_STAGE = "ocpcStage";
  private Integer ocpcStage;

  public static final String JSON_PROPERTY_ADOPT_NO_THRESHOLD = "adoptNoThreshold";
  private Integer adoptNoThreshold;

  public static final String JSON_PROPERTY_ASTAT = "astat";
  private Integer astat;

  public static final String JSON_PROPERTY_ADOPT_OCPC_BID = "adoptOcpcBid";
  private Integer adoptOcpcBid;

  public static final String JSON_PROPERTY_WISE_AUDIT_TIME = "wiseAuditTime";
  private String wiseAuditTime;

  public static final String JSON_PROPERTY_ASSIST_TRANS_TYPES = "assistTransTypes";
  private List<Integer> assistTransTypes = null;

  public static final String JSON_PROPERTY_PACKAGE_STATUS = "packageStatus";
  private Integer packageStatus;

  public static final String JSON_PROPERTY_OCPC_DEEP_CPA = "ocpcDeepCpa";
  private Double ocpcDeepCpa;

  public static final String JSON_PROPERTY_DEEP_TYPE_STAT = "deepTypeStat";
  private Integer deepTypeStat;

  public static final String JSON_PROPERTY_DEEP_TRANS_TYPE_MODE = "deepTransTypeMode";
  private Integer deepTransTypeMode;

  public static final String JSON_PROPERTY_CV_SOURCES = "cvSources";
  private List<Integer> cvSources = null;

  public static final String JSON_PROPERTY_TRANS_TYPES = "transTypes";
  private List<Integer> transTypes = null;

  public static final String JSON_PROPERTY_CV_SOURCES_SHADOW = "cvSourcesShadow";
  private List<Integer> cvSourcesShadow = null;

  public static final String JSON_PROPERTY_TRANS_TYPES_SHADOW = "transTypesShadow";
  private List<Integer> transTypesShadow = null;

  public static final String JSON_PROPERTY_OCPC_DEEP_BID = "ocpcDeepBid";
  private Double ocpcDeepBid;

  public static final String JSON_PROPERTY_SHARED_BUDGET = "sharedBudget";
  private Double sharedBudget;

  public static final String JSON_PROPERTY_UNBIND_SHARED_BUDGET_INFO = "unbindSharedBudgetInfo";
  private List<UnbindSharedBudgetInfo> unbindSharedBudgetInfo = null;

  public static final String JSON_PROPERTY_SHARED_BUDGET_ID = "sharedBudgetId";
  private Long sharedBudgetId;

  public static final String JSON_PROPERTY_USE_SHARED_BUDGET = "useSharedBudget";
  private Integer useSharedBudget;

  public TargetPackageType() { 
  }

  public TargetPackageType targetPackageId(Long targetPackageId) {
    
    this.targetPackageId = targetPackageId;
    return this;
  }

   /**
   * Get targetPackageId
   * @return targetPackageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetPackageId() {
    return targetPackageId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageId(Long targetPackageId) {
    this.targetPackageId = targetPackageId;
  }


  public TargetPackageType targetPackageName(String targetPackageName) {
    
    this.targetPackageName = targetPackageName;
    return this;
  }

   /**
   * Get targetPackageName
   * @return targetPackageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetPackageName() {
    return targetPackageName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageName(String targetPackageName) {
    this.targetPackageName = targetPackageName;
  }


  public TargetPackageType ocpcBidType(Integer ocpcBidType) {
    
    this.ocpcBidType = ocpcBidType;
    return this;
  }

   /**
   * Get ocpcBidType
   * @return ocpcBidType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOcpcBidType() {
    return ocpcBidType;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcBidType(Integer ocpcBidType) {
    this.ocpcBidType = ocpcBidType;
  }


  public TargetPackageType equipmentType(Integer equipmentType) {
    
    this.equipmentType = equipmentType;
    return this;
  }

   /**
   * Get equipmentType
   * @return equipmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EQUIPMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEquipmentType() {
    return equipmentType;
  }


  @JsonProperty(JSON_PROPERTY_EQUIPMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEquipmentType(Integer equipmentType) {
    this.equipmentType = equipmentType;
  }


  public TargetPackageType ocpcBid(Double ocpcBid) {
    
    this.ocpcBid = ocpcBid;
    return this;
  }

   /**
   * Get ocpcBid
   * @return ocpcBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOcpcBid() {
    return ocpcBid;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcBid(Double ocpcBid) {
    this.ocpcBid = ocpcBid;
  }


  public TargetPackageType ecpcMaxBidRatio(Double ecpcMaxBidRatio) {
    
    this.ecpcMaxBidRatio = ecpcMaxBidRatio;
    return this;
  }

   /**
   * Get ecpcMaxBidRatio
   * @return ecpcMaxBidRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ECPC_MAX_BID_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getEcpcMaxBidRatio() {
    return ecpcMaxBidRatio;
  }


  @JsonProperty(JSON_PROPERTY_ECPC_MAX_BID_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcpcMaxBidRatio(Double ecpcMaxBidRatio) {
    this.ecpcMaxBidRatio = ecpcMaxBidRatio;
  }


  public TargetPackageType scope(List<TargetPackageBindInfo> scope) {
    
    this.scope = scope;
    return this;
  }

  public TargetPackageType addScopeItem(TargetPackageBindInfo scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TargetPackageBindInfo> getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(List<TargetPackageBindInfo> scope) {
    this.scope = scope;
  }


  public TargetPackageType dataFlowData(List<TargetPackageDataflowInfo> dataFlowData) {
    
    this.dataFlowData = dataFlowData;
    return this;
  }

  public TargetPackageType addDataFlowDataItem(TargetPackageDataflowInfo dataFlowDataItem) {
    if (this.dataFlowData == null) {
      this.dataFlowData = new ArrayList<>();
    }
    this.dataFlowData.add(dataFlowDataItem);
    return this;
  }

   /**
   * Get dataFlowData
   * @return dataFlowData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_FLOW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TargetPackageDataflowInfo> getDataFlowData() {
    return dataFlowData;
  }


  @JsonProperty(JSON_PROPERTY_DATA_FLOW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataFlowData(List<TargetPackageDataflowInfo> dataFlowData) {
    this.dataFlowData = dataFlowData;
  }


  public TargetPackageType ocpcStage(Integer ocpcStage) {
    
    this.ocpcStage = ocpcStage;
    return this;
  }

   /**
   * Get ocpcStage
   * @return ocpcStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOcpcStage() {
    return ocpcStage;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcStage(Integer ocpcStage) {
    this.ocpcStage = ocpcStage;
  }


  public TargetPackageType adoptNoThreshold(Integer adoptNoThreshold) {
    
    this.adoptNoThreshold = adoptNoThreshold;
    return this;
  }

   /**
   * Get adoptNoThreshold
   * @return adoptNoThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADOPT_NO_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdoptNoThreshold() {
    return adoptNoThreshold;
  }


  @JsonProperty(JSON_PROPERTY_ADOPT_NO_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdoptNoThreshold(Integer adoptNoThreshold) {
    this.adoptNoThreshold = adoptNoThreshold;
  }


  public TargetPackageType astat(Integer astat) {
    
    this.astat = astat;
    return this;
  }

   /**
   * Get astat
   * @return astat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASTAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAstat() {
    return astat;
  }


  @JsonProperty(JSON_PROPERTY_ASTAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAstat(Integer astat) {
    this.astat = astat;
  }


  public TargetPackageType adoptOcpcBid(Integer adoptOcpcBid) {
    
    this.adoptOcpcBid = adoptOcpcBid;
    return this;
  }

   /**
   * Get adoptOcpcBid
   * @return adoptOcpcBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADOPT_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdoptOcpcBid() {
    return adoptOcpcBid;
  }


  @JsonProperty(JSON_PROPERTY_ADOPT_OCPC_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdoptOcpcBid(Integer adoptOcpcBid) {
    this.adoptOcpcBid = adoptOcpcBid;
  }


  public TargetPackageType wiseAuditTime(String wiseAuditTime) {
    
    this.wiseAuditTime = wiseAuditTime;
    return this;
  }

   /**
   * Get wiseAuditTime
   * @return wiseAuditTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WISE_AUDIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWiseAuditTime() {
    return wiseAuditTime;
  }


  @JsonProperty(JSON_PROPERTY_WISE_AUDIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWiseAuditTime(String wiseAuditTime) {
    this.wiseAuditTime = wiseAuditTime;
  }


  public TargetPackageType assistTransTypes(List<Integer> assistTransTypes) {
    
    this.assistTransTypes = assistTransTypes;
    return this;
  }

  public TargetPackageType addAssistTransTypesItem(Integer assistTransTypesItem) {
    if (this.assistTransTypes == null) {
      this.assistTransTypes = new ArrayList<>();
    }
    this.assistTransTypes.add(assistTransTypesItem);
    return this;
  }

   /**
   * Get assistTransTypes
   * @return assistTransTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSIST_TRANS_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getAssistTransTypes() {
    return assistTransTypes;
  }


  @JsonProperty(JSON_PROPERTY_ASSIST_TRANS_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssistTransTypes(List<Integer> assistTransTypes) {
    this.assistTransTypes = assistTransTypes;
  }


  public TargetPackageType packageStatus(Integer packageStatus) {
    
    this.packageStatus = packageStatus;
    return this;
  }

   /**
   * Get packageStatus
   * @return packageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPackageStatus() {
    return packageStatus;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageStatus(Integer packageStatus) {
    this.packageStatus = packageStatus;
  }


  public TargetPackageType ocpcDeepCpa(Double ocpcDeepCpa) {
    
    this.ocpcDeepCpa = ocpcDeepCpa;
    return this;
  }

   /**
   * Get ocpcDeepCpa
   * @return ocpcDeepCpa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_DEEP_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOcpcDeepCpa() {
    return ocpcDeepCpa;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_DEEP_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcDeepCpa(Double ocpcDeepCpa) {
    this.ocpcDeepCpa = ocpcDeepCpa;
  }


  public TargetPackageType deepTypeStat(Integer deepTypeStat) {
    
    this.deepTypeStat = deepTypeStat;
    return this;
  }

   /**
   * Get deepTypeStat
   * @return deepTypeStat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEP_TYPE_STAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeepTypeStat() {
    return deepTypeStat;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_TYPE_STAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepTypeStat(Integer deepTypeStat) {
    this.deepTypeStat = deepTypeStat;
  }


  public TargetPackageType deepTransTypeMode(Integer deepTransTypeMode) {
    
    this.deepTransTypeMode = deepTransTypeMode;
    return this;
  }

   /**
   * Get deepTransTypeMode
   * @return deepTransTypeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEP_TRANS_TYPE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeepTransTypeMode() {
    return deepTransTypeMode;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_TRANS_TYPE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepTransTypeMode(Integer deepTransTypeMode) {
    this.deepTransTypeMode = deepTransTypeMode;
  }


  public TargetPackageType cvSources(List<Integer> cvSources) {
    
    this.cvSources = cvSources;
    return this;
  }

  public TargetPackageType addCvSourcesItem(Integer cvSourcesItem) {
    if (this.cvSources == null) {
      this.cvSources = new ArrayList<>();
    }
    this.cvSources.add(cvSourcesItem);
    return this;
  }

   /**
   * Get cvSources
   * @return cvSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CV_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getCvSources() {
    return cvSources;
  }


  @JsonProperty(JSON_PROPERTY_CV_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvSources(List<Integer> cvSources) {
    this.cvSources = cvSources;
  }


  public TargetPackageType transTypes(List<Integer> transTypes) {
    
    this.transTypes = transTypes;
    return this;
  }

  public TargetPackageType addTransTypesItem(Integer transTypesItem) {
    if (this.transTypes == null) {
      this.transTypes = new ArrayList<>();
    }
    this.transTypes.add(transTypesItem);
    return this;
  }

   /**
   * Get transTypes
   * @return transTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTransTypes() {
    return transTypes;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransTypes(List<Integer> transTypes) {
    this.transTypes = transTypes;
  }


  public TargetPackageType cvSourcesShadow(List<Integer> cvSourcesShadow) {
    
    this.cvSourcesShadow = cvSourcesShadow;
    return this;
  }

  public TargetPackageType addCvSourcesShadowItem(Integer cvSourcesShadowItem) {
    if (this.cvSourcesShadow == null) {
      this.cvSourcesShadow = new ArrayList<>();
    }
    this.cvSourcesShadow.add(cvSourcesShadowItem);
    return this;
  }

   /**
   * Get cvSourcesShadow
   * @return cvSourcesShadow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CV_SOURCES_SHADOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getCvSourcesShadow() {
    return cvSourcesShadow;
  }


  @JsonProperty(JSON_PROPERTY_CV_SOURCES_SHADOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvSourcesShadow(List<Integer> cvSourcesShadow) {
    this.cvSourcesShadow = cvSourcesShadow;
  }


  public TargetPackageType transTypesShadow(List<Integer> transTypesShadow) {
    
    this.transTypesShadow = transTypesShadow;
    return this;
  }

  public TargetPackageType addTransTypesShadowItem(Integer transTypesShadowItem) {
    if (this.transTypesShadow == null) {
      this.transTypesShadow = new ArrayList<>();
    }
    this.transTypesShadow.add(transTypesShadowItem);
    return this;
  }

   /**
   * Get transTypesShadow
   * @return transTypesShadow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_TYPES_SHADOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTransTypesShadow() {
    return transTypesShadow;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_TYPES_SHADOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransTypesShadow(List<Integer> transTypesShadow) {
    this.transTypesShadow = transTypesShadow;
  }


  public TargetPackageType ocpcDeepBid(Double ocpcDeepBid) {
    
    this.ocpcDeepBid = ocpcDeepBid;
    return this;
  }

   /**
   * Get ocpcDeepBid
   * @return ocpcDeepBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCPC_DEEP_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOcpcDeepBid() {
    return ocpcDeepBid;
  }


  @JsonProperty(JSON_PROPERTY_OCPC_DEEP_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcpcDeepBid(Double ocpcDeepBid) {
    this.ocpcDeepBid = ocpcDeepBid;
  }


  public TargetPackageType sharedBudget(Double sharedBudget) {
    
    this.sharedBudget = sharedBudget;
    return this;
  }

   /**
   * Get sharedBudget
   * @return sharedBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSharedBudget() {
    return sharedBudget;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedBudget(Double sharedBudget) {
    this.sharedBudget = sharedBudget;
  }


  public TargetPackageType unbindSharedBudgetInfo(List<UnbindSharedBudgetInfo> unbindSharedBudgetInfo) {
    
    this.unbindSharedBudgetInfo = unbindSharedBudgetInfo;
    return this;
  }

  public TargetPackageType addUnbindSharedBudgetInfoItem(UnbindSharedBudgetInfo unbindSharedBudgetInfoItem) {
    if (this.unbindSharedBudgetInfo == null) {
      this.unbindSharedBudgetInfo = new ArrayList<>();
    }
    this.unbindSharedBudgetInfo.add(unbindSharedBudgetInfoItem);
    return this;
  }

   /**
   * Get unbindSharedBudgetInfo
   * @return unbindSharedBudgetInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNBIND_SHARED_BUDGET_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UnbindSharedBudgetInfo> getUnbindSharedBudgetInfo() {
    return unbindSharedBudgetInfo;
  }


  @JsonProperty(JSON_PROPERTY_UNBIND_SHARED_BUDGET_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnbindSharedBudgetInfo(List<UnbindSharedBudgetInfo> unbindSharedBudgetInfo) {
    this.unbindSharedBudgetInfo = unbindSharedBudgetInfo;
  }


  public TargetPackageType sharedBudgetId(Long sharedBudgetId) {
    
    this.sharedBudgetId = sharedBudgetId;
    return this;
  }

   /**
   * Get sharedBudgetId
   * @return sharedBudgetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_BUDGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSharedBudgetId() {
    return sharedBudgetId;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_BUDGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedBudgetId(Long sharedBudgetId) {
    this.sharedBudgetId = sharedBudgetId;
  }


  public TargetPackageType useSharedBudget(Integer useSharedBudget) {
    
    this.useSharedBudget = useSharedBudget;
    return this;
  }

   /**
   * Get useSharedBudget
   * @return useSharedBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_SHARED_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUseSharedBudget() {
    return useSharedBudget;
  }


  @JsonProperty(JSON_PROPERTY_USE_SHARED_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseSharedBudget(Integer useSharedBudget) {
    this.useSharedBudget = useSharedBudget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetPackageType targetPackageType = (TargetPackageType) o;
    return Objects.equals(this.targetPackageId, targetPackageType.targetPackageId) &&
        Objects.equals(this.targetPackageName, targetPackageType.targetPackageName) &&
        Objects.equals(this.ocpcBidType, targetPackageType.ocpcBidType) &&
        Objects.equals(this.equipmentType, targetPackageType.equipmentType) &&
        Objects.equals(this.ocpcBid, targetPackageType.ocpcBid) &&
        Objects.equals(this.ecpcMaxBidRatio, targetPackageType.ecpcMaxBidRatio) &&
        Objects.equals(this.scope, targetPackageType.scope) &&
        Objects.equals(this.dataFlowData, targetPackageType.dataFlowData) &&
        Objects.equals(this.ocpcStage, targetPackageType.ocpcStage) &&
        Objects.equals(this.adoptNoThreshold, targetPackageType.adoptNoThreshold) &&
        Objects.equals(this.astat, targetPackageType.astat) &&
        Objects.equals(this.adoptOcpcBid, targetPackageType.adoptOcpcBid) &&
        Objects.equals(this.wiseAuditTime, targetPackageType.wiseAuditTime) &&
        Objects.equals(this.assistTransTypes, targetPackageType.assistTransTypes) &&
        Objects.equals(this.packageStatus, targetPackageType.packageStatus) &&
        Objects.equals(this.ocpcDeepCpa, targetPackageType.ocpcDeepCpa) &&
        Objects.equals(this.deepTypeStat, targetPackageType.deepTypeStat) &&
        Objects.equals(this.deepTransTypeMode, targetPackageType.deepTransTypeMode) &&
        Objects.equals(this.cvSources, targetPackageType.cvSources) &&
        Objects.equals(this.transTypes, targetPackageType.transTypes) &&
        Objects.equals(this.cvSourcesShadow, targetPackageType.cvSourcesShadow) &&
        Objects.equals(this.transTypesShadow, targetPackageType.transTypesShadow) &&
        Objects.equals(this.ocpcDeepBid, targetPackageType.ocpcDeepBid) &&
        Objects.equals(this.sharedBudget, targetPackageType.sharedBudget) &&
        Objects.equals(this.unbindSharedBudgetInfo, targetPackageType.unbindSharedBudgetInfo) &&
        Objects.equals(this.sharedBudgetId, targetPackageType.sharedBudgetId) &&
        Objects.equals(this.useSharedBudget, targetPackageType.useSharedBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPackageId, targetPackageName, ocpcBidType, equipmentType, ocpcBid, ecpcMaxBidRatio, scope, dataFlowData, ocpcStage, adoptNoThreshold, astat, adoptOcpcBid, wiseAuditTime, assistTransTypes, packageStatus, ocpcDeepCpa, deepTypeStat, deepTransTypeMode, cvSources, transTypes, cvSourcesShadow, transTypesShadow, ocpcDeepBid, sharedBudget, unbindSharedBudgetInfo, sharedBudgetId, useSharedBudget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetPackageType {\n");
    sb.append("    targetPackageId: ").append(toIndentedString(targetPackageId)).append("\n");
    sb.append("    targetPackageName: ").append(toIndentedString(targetPackageName)).append("\n");
    sb.append("    ocpcBidType: ").append(toIndentedString(ocpcBidType)).append("\n");
    sb.append("    equipmentType: ").append(toIndentedString(equipmentType)).append("\n");
    sb.append("    ocpcBid: ").append(toIndentedString(ocpcBid)).append("\n");
    sb.append("    ecpcMaxBidRatio: ").append(toIndentedString(ecpcMaxBidRatio)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    dataFlowData: ").append(toIndentedString(dataFlowData)).append("\n");
    sb.append("    ocpcStage: ").append(toIndentedString(ocpcStage)).append("\n");
    sb.append("    adoptNoThreshold: ").append(toIndentedString(adoptNoThreshold)).append("\n");
    sb.append("    astat: ").append(toIndentedString(astat)).append("\n");
    sb.append("    adoptOcpcBid: ").append(toIndentedString(adoptOcpcBid)).append("\n");
    sb.append("    wiseAuditTime: ").append(toIndentedString(wiseAuditTime)).append("\n");
    sb.append("    assistTransTypes: ").append(toIndentedString(assistTransTypes)).append("\n");
    sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
    sb.append("    ocpcDeepCpa: ").append(toIndentedString(ocpcDeepCpa)).append("\n");
    sb.append("    deepTypeStat: ").append(toIndentedString(deepTypeStat)).append("\n");
    sb.append("    deepTransTypeMode: ").append(toIndentedString(deepTransTypeMode)).append("\n");
    sb.append("    cvSources: ").append(toIndentedString(cvSources)).append("\n");
    sb.append("    transTypes: ").append(toIndentedString(transTypes)).append("\n");
    sb.append("    cvSourcesShadow: ").append(toIndentedString(cvSourcesShadow)).append("\n");
    sb.append("    transTypesShadow: ").append(toIndentedString(transTypesShadow)).append("\n");
    sb.append("    ocpcDeepBid: ").append(toIndentedString(ocpcDeepBid)).append("\n");
    sb.append("    sharedBudget: ").append(toIndentedString(sharedBudget)).append("\n");
    sb.append("    unbindSharedBudgetInfo: ").append(toIndentedString(unbindSharedBudgetInfo)).append("\n");
    sb.append("    sharedBudgetId: ").append(toIndentedString(sharedBudgetId)).append("\n");
    sb.append("    useSharedBudget: ").append(toIndentedString(useSharedBudget)).append("\n");
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

