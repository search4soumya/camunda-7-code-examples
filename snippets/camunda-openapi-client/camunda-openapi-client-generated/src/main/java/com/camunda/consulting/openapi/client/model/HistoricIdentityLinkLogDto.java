/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HistoricIdentityLinkLogDto
 */
@JsonPropertyOrder({
  HistoricIdentityLinkLogDto.JSON_PROPERTY_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TIME,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TYPE,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_USER_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_GROUP_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TASK_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_OPERATION_TYPE,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_ASSIGNER_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TENANT_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_REMOVAL_TIME,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID
})
@JsonTypeName("HistoricIdentityLinkLogDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class HistoricIdentityLinkLogDto {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<OffsetDateTime> time = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private JsonNullable<String> groupId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private JsonNullable<String> processDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  private JsonNullable<String> processDefinitionKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
  private JsonNullable<String> operationType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ASSIGNER_ID = "assignerId";
  private JsonNullable<String> assignerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private JsonNullable<String> tenantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
  private JsonNullable<OffsetDateTime> removalTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  private JsonNullable<String> rootProcessInstanceId = JsonNullable.<String>undefined();


  public HistoricIdentityLinkLogDto id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * Id of the Historic identity link entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the Historic identity link entry.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public HistoricIdentityLinkLogDto time(OffsetDateTime time) {
    this.time = JsonNullable.<OffsetDateTime>of(time);
    
    return this;
  }

   /**
   * The time when the identity link is logged.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the identity link is logged.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  @JsonIgnore

  public OffsetDateTime getTime() {
        return time.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTime_JsonNullable() {
    return time;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME)
  public void setTime_JsonNullable(JsonNullable<OffsetDateTime> time) {
    this.time = time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = JsonNullable.<OffsetDateTime>of(time);
  }


  public HistoricIdentityLinkLogDto type(String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

   /**
   * The type of identity link (candidate/assignee/owner).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of identity link (candidate/assignee/owner).")
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }


  public HistoricIdentityLinkLogDto userId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
    
    return this;
  }

   /**
   * The id of the user/assignee.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user/assignee.")
  @JsonIgnore

  public String getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
  }


  public HistoricIdentityLinkLogDto groupId(String groupId) {
    this.groupId = JsonNullable.<String>of(groupId);
    
    return this;
  }

   /**
   * The id of the group.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the group.")
  @JsonIgnore

  public String getGroupId() {
        return groupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGroupId_JsonNullable() {
    return groupId;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  public void setGroupId_JsonNullable(JsonNullable<String> groupId) {
    this.groupId = groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = JsonNullable.<String>of(groupId);
  }


  public HistoricIdentityLinkLogDto taskId(String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
    
    return this;
  }

   /**
   * The id of the task.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the task.")
  @JsonIgnore

  public String getTaskId() {
        return taskId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaskId_JsonNullable() {
    return taskId;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  public void setTaskId_JsonNullable(JsonNullable<String> taskId) {
    this.taskId = taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
  }


  public HistoricIdentityLinkLogDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = JsonNullable.<String>of(processDefinitionId);
    
    return this;
  }

   /**
   * The id of the process definition.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition.")
  @JsonIgnore

  public String getProcessDefinitionId() {
        return processDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProcessDefinitionId_JsonNullable() {
    return processDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  public void setProcessDefinitionId_JsonNullable(JsonNullable<String> processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = JsonNullable.<String>of(processDefinitionId);
  }


  public HistoricIdentityLinkLogDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = JsonNullable.<String>of(processDefinitionKey);
    
    return this;
  }

   /**
   * The key of the process definition.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition.")
  @JsonIgnore

  public String getProcessDefinitionKey() {
        return processDefinitionKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProcessDefinitionKey_JsonNullable() {
    return processDefinitionKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
  public void setProcessDefinitionKey_JsonNullable(JsonNullable<String> processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = JsonNullable.<String>of(processDefinitionKey);
  }


  public HistoricIdentityLinkLogDto operationType(String operationType) {
    this.operationType = JsonNullable.<String>of(operationType);
    
    return this;
  }

   /**
   * Type of operation (add/delete).
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of operation (add/delete).")
  @JsonIgnore

  public String getOperationType() {
        return operationType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOperationType_JsonNullable() {
    return operationType;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  public void setOperationType_JsonNullable(JsonNullable<String> operationType) {
    this.operationType = operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = JsonNullable.<String>of(operationType);
  }


  public HistoricIdentityLinkLogDto assignerId(String assignerId) {
    this.assignerId = JsonNullable.<String>of(assignerId);
    
    return this;
  }

   /**
   * The id of the assigner.
   * @return assignerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the assigner.")
  @JsonIgnore

  public String getAssignerId() {
        return assignerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAssignerId_JsonNullable() {
    return assignerId;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSIGNER_ID)
  public void setAssignerId_JsonNullable(JsonNullable<String> assignerId) {
    this.assignerId = assignerId;
  }

  public void setAssignerId(String assignerId) {
    this.assignerId = JsonNullable.<String>of(assignerId);
  }


  public HistoricIdentityLinkLogDto tenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
    
    return this;
  }

   /**
   * The id of the tenant.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant.")
  @JsonIgnore

  public String getTenantId() {
        return tenantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTenantId_JsonNullable() {
    return tenantId;
  }
  
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  public void setTenantId_JsonNullable(JsonNullable<String> tenantId) {
    this.tenantId = tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
  }


  public HistoricIdentityLinkLogDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = JsonNullable.<OffsetDateTime>of(removalTime);
    
    return this;
  }

   /**
   * The time after which the identity link should be removed by the History Cleanup job.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the identity link should be removed by the History Cleanup job.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  @JsonIgnore

  public OffsetDateTime getRemovalTime() {
        return removalTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getRemovalTime_JsonNullable() {
    return removalTime;
  }
  
  @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
  public void setRemovalTime_JsonNullable(JsonNullable<OffsetDateTime> removalTime) {
    this.removalTime = removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = JsonNullable.<OffsetDateTime>of(removalTime);
  }


  public HistoricIdentityLinkLogDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = JsonNullable.<String>of(rootProcessInstanceId);
    
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process containing this identity link.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process containing this identity link.")
  @JsonIgnore

  public String getRootProcessInstanceId() {
        return rootProcessInstanceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRootProcessInstanceId_JsonNullable() {
    return rootProcessInstanceId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
  public void setRootProcessInstanceId_JsonNullable(JsonNullable<String> rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = JsonNullable.<String>of(rootProcessInstanceId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricIdentityLinkLogDto historicIdentityLinkLogDto = (HistoricIdentityLinkLogDto) o;
    return Objects.equals(this.id, historicIdentityLinkLogDto.id) &&
        Objects.equals(this.time, historicIdentityLinkLogDto.time) &&
        Objects.equals(this.type, historicIdentityLinkLogDto.type) &&
        Objects.equals(this.userId, historicIdentityLinkLogDto.userId) &&
        Objects.equals(this.groupId, historicIdentityLinkLogDto.groupId) &&
        Objects.equals(this.taskId, historicIdentityLinkLogDto.taskId) &&
        Objects.equals(this.processDefinitionId, historicIdentityLinkLogDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicIdentityLinkLogDto.processDefinitionKey) &&
        Objects.equals(this.operationType, historicIdentityLinkLogDto.operationType) &&
        Objects.equals(this.assignerId, historicIdentityLinkLogDto.assignerId) &&
        Objects.equals(this.tenantId, historicIdentityLinkLogDto.tenantId) &&
        Objects.equals(this.removalTime, historicIdentityLinkLogDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicIdentityLinkLogDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, type, userId, groupId, taskId, processDefinitionId, processDefinitionKey, operationType, assignerId, tenantId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricIdentityLinkLogDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    assignerId: ").append(toIndentedString(assignerId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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

