/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videosynthetise.model;

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
 * TaskIdRequest
 */
@JsonPropertyOrder({
  TaskIdRequest.JSON_PROPERTY_TASK_IDS
})
@JsonTypeName("TaskIdRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaskIdRequest {
  public static final String JSON_PROPERTY_TASK_IDS = "taskIds";
  private List<Long> taskIds = null;

  public TaskIdRequest() { 
  }

  public TaskIdRequest taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public TaskIdRequest addTaskIdsItem(Long taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * Get taskIds
   * @return taskIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getTaskIds() {
    return taskIds;
  }


  @JsonProperty(JSON_PROPERTY_TASK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskIds(List<Long> taskIds) {
    this.taskIds = taskIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskIdRequest taskIdRequest = (TaskIdRequest) o;
    return Objects.equals(this.taskIds, taskIdRequest.taskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskIdRequest {\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
