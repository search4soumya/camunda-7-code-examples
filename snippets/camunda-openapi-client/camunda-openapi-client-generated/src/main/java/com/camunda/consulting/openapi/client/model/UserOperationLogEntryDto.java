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
 * UserOperationLogEntryDto
 */
@JsonPropertyOrder({
  UserOperationLogEntryDto.JSON_PROPERTY_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_USER_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_TIMESTAMP,
  UserOperationLogEntryDto.JSON_PROPERTY_OPERATION_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_OPERATION_TYPE,
  UserOperationLogEntryDto.JSON_PROPERTY_ENTITY_TYPE,
  UserOperationLogEntryDto.JSON_PROPERTY_CATEGORY,
  UserOperationLogEntryDto.JSON_PROPERTY_ANNOTATION,
  UserOperationLogEntryDto.JSON_PROPERTY_PROPERTY,
  UserOperationLogEntryDto.JSON_PROPERTY_ORG_VALUE,
  UserOperationLogEntryDto.JSON_PROPERTY_NEW_VALUE,
  UserOperationLogEntryDto.JSON_PROPERTY_DEPLOYMENT_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  UserOperationLogEntryDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_EXECUTION_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_CASE_DEFINITION_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_CASE_INSTANCE_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_CASE_EXECUTION_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_TASK_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_EXTERNAL_TASK_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_BATCH_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_JOB_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_JOB_DEFINITION_ID,
  UserOperationLogEntryDto.JSON_PROPERTY_REMOVAL_TIME,
  UserOperationLogEntryDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID
})
@JsonTypeName("UserOperationLogEntryDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class UserOperationLogEntryDto {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private JsonNullable<OffsetDateTime> timestamp = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_OPERATION_ID = "operationId";
  private JsonNullable<String> operationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
  private JsonNullable<String> operationType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private JsonNullable<String> entityType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ANNOTATION = "annotation";
  private JsonNullable<String> annotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private JsonNullable<String> property = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORG_VALUE = "orgValue";
  private JsonNullable<String> orgValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private JsonNullable<String> newValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
  private JsonNullable<String> deploymentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private JsonNullable<String> processDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  private JsonNullable<String> processDefinitionKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
  private JsonNullable<String> processInstanceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
  private JsonNullable<String> executionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_DEFINITION_ID = "caseDefinitionId";
  private JsonNullable<String> caseDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
  private JsonNullable<String> caseInstanceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_EXECUTION_ID = "caseExecutionId";
  private JsonNullable<String> caseExecutionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_TASK_ID = "externalTaskId";
  private JsonNullable<String> externalTaskId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private JsonNullable<String> batchId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private JsonNullable<String> jobId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_DEFINITION_ID = "jobDefinitionId";
  private JsonNullable<String> jobDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
  private JsonNullable<OffsetDateTime> removalTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  private JsonNullable<String> rootProcessInstanceId = JsonNullable.<String>undefined();


  public UserOperationLogEntryDto id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * The unique identifier of this log entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this log entry.")
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


  public UserOperationLogEntryDto userId(String userId) {
    this.userId = JsonNullable.<String>of(userId);
    
    return this;
  }

   /**
   * The user who performed this operation.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user who performed this operation.")
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


  public UserOperationLogEntryDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = JsonNullable.<OffsetDateTime>of(timestamp);
    
    return this;
  }

   /**
   * Timestamp of this operation.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of this operation.")
  @JsonIgnore

  public OffsetDateTime getTimestamp() {
        return timestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTimestamp_JsonNullable() {
    return timestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  public void setTimestamp_JsonNullable(JsonNullable<OffsetDateTime> timestamp) {
    this.timestamp = timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = JsonNullable.<OffsetDateTime>of(timestamp);
  }


  public UserOperationLogEntryDto operationId(String operationId) {
    this.operationId = JsonNullable.<String>of(operationId);
    
    return this;
  }

   /**
   * The unique identifier of this operation. A composite operation that changes multiple properties has a common &#x60;operationId&#x60;.
   * @return operationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this operation. A composite operation that changes multiple properties has a common `operationId`.")
  @JsonIgnore

  public String getOperationId() {
        return operationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOperationId_JsonNullable() {
    return operationId;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION_ID)
  public void setOperationId_JsonNullable(JsonNullable<String> operationId) {
    this.operationId = operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = JsonNullable.<String>of(operationId);
  }


  public UserOperationLogEntryDto operationType(String operationType) {
    this.operationType = JsonNullable.<String>of(operationType);
    
    return this;
  }

   /**
   * The type of this operation, e.g., &#x60;Assign&#x60;, &#x60;Claim&#x60; and so on.
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of this operation, e.g., `Assign`, `Claim` and so on.")
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


  public UserOperationLogEntryDto entityType(String entityType) {
    this.entityType = JsonNullable.<String>of(entityType);
    
    return this;
  }

   /**
   * The type of the entity on which this operation was executed, e.g., &#x60;Task&#x60; or &#x60;Attachment&#x60;.
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the entity on which this operation was executed, e.g., `Task` or `Attachment`.")
  @JsonIgnore

  public String getEntityType() {
        return entityType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityType_JsonNullable() {
    return entityType;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  public void setEntityType_JsonNullable(JsonNullable<String> entityType) {
    this.entityType = entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = JsonNullable.<String>of(entityType);
  }


  public UserOperationLogEntryDto category(String category) {
    this.category = JsonNullable.<String>of(category);
    
    return this;
  }

   /**
   * The name of the category this operation was associated with, e.g., &#x60;TaskWorker&#x60; or &#x60;Admin&#x60;.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the category this operation was associated with, e.g., `TaskWorker` or `Admin`.")
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  public UserOperationLogEntryDto annotation(String annotation) {
    this.annotation = JsonNullable.<String>of(annotation);
    
    return this;
  }

   /**
   * An arbitrary annotation set by a user for auditing reasons.
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An arbitrary annotation set by a user for auditing reasons.")
  @JsonIgnore

  public String getAnnotation() {
        return annotation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAnnotation_JsonNullable() {
    return annotation;
  }
  
  @JsonProperty(JSON_PROPERTY_ANNOTATION)
  public void setAnnotation_JsonNullable(JsonNullable<String> annotation) {
    this.annotation = annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = JsonNullable.<String>of(annotation);
  }


  public UserOperationLogEntryDto property(String property) {
    this.property = JsonNullable.<String>of(property);
    
    return this;
  }

   /**
   * The property changed by this operation.
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The property changed by this operation.")
  @JsonIgnore

  public String getProperty() {
        return property.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProperty_JsonNullable() {
    return property;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  public void setProperty_JsonNullable(JsonNullable<String> property) {
    this.property = property;
  }

  public void setProperty(String property) {
    this.property = JsonNullable.<String>of(property);
  }


  public UserOperationLogEntryDto orgValue(String orgValue) {
    this.orgValue = JsonNullable.<String>of(orgValue);
    
    return this;
  }

   /**
   * The original value of the changed property.
   * @return orgValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original value of the changed property.")
  @JsonIgnore

  public String getOrgValue() {
        return orgValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORG_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrgValue_JsonNullable() {
    return orgValue;
  }
  
  @JsonProperty(JSON_PROPERTY_ORG_VALUE)
  public void setOrgValue_JsonNullable(JsonNullable<String> orgValue) {
    this.orgValue = orgValue;
  }

  public void setOrgValue(String orgValue) {
    this.orgValue = JsonNullable.<String>of(orgValue);
  }


  public UserOperationLogEntryDto newValue(String newValue) {
    this.newValue = JsonNullable.<String>of(newValue);
    
    return this;
  }

   /**
   * The new value of the changed property.
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new value of the changed property.")
  @JsonIgnore

  public String getNewValue() {
        return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNewValue_JsonNullable() {
    return newValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<String> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = JsonNullable.<String>of(newValue);
  }


  public UserOperationLogEntryDto deploymentId(String deploymentId) {
    this.deploymentId = JsonNullable.<String>of(deploymentId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this deployment.
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this deployment.")
  @JsonIgnore

  public String getDeploymentId() {
        return deploymentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDeploymentId_JsonNullable() {
    return deploymentId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  public void setDeploymentId_JsonNullable(JsonNullable<String> deploymentId) {
    this.deploymentId = deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = JsonNullable.<String>of(deploymentId);
  }


  public UserOperationLogEntryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = JsonNullable.<String>of(processDefinitionId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this process definition.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this process definition.")
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


  public UserOperationLogEntryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = JsonNullable.<String>of(processDefinitionKey);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to process definitions with this key.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to process definitions with this key.")
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


  public UserOperationLogEntryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = JsonNullable.<String>of(processInstanceId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this process instance.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this process instance.")
  @JsonIgnore

  public String getProcessInstanceId() {
        return processInstanceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProcessInstanceId_JsonNullable() {
    return processInstanceId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
  public void setProcessInstanceId_JsonNullable(JsonNullable<String> processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = JsonNullable.<String>of(processInstanceId);
  }


  public UserOperationLogEntryDto executionId(String executionId) {
    this.executionId = JsonNullable.<String>of(executionId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this execution.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this execution.")
  @JsonIgnore

  public String getExecutionId() {
        return executionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExecutionId_JsonNullable() {
    return executionId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
  public void setExecutionId_JsonNullable(JsonNullable<String> executionId) {
    this.executionId = executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = JsonNullable.<String>of(executionId);
  }


  public UserOperationLogEntryDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = JsonNullable.<String>of(caseDefinitionId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this case definition.
   * @return caseDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this case definition.")
  @JsonIgnore

  public String getCaseDefinitionId() {
        return caseDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCaseDefinitionId_JsonNullable() {
    return caseDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
  public void setCaseDefinitionId_JsonNullable(JsonNullable<String> caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = JsonNullable.<String>of(caseDefinitionId);
  }


  public UserOperationLogEntryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = JsonNullable.<String>of(caseInstanceId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this case instance.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this case instance.")
  @JsonIgnore

  public String getCaseInstanceId() {
        return caseInstanceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCaseInstanceId_JsonNullable() {
    return caseInstanceId;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
  public void setCaseInstanceId_JsonNullable(JsonNullable<String> caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = JsonNullable.<String>of(caseInstanceId);
  }


  public UserOperationLogEntryDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = JsonNullable.<String>of(caseExecutionId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this case execution.
   * @return caseExecutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this case execution.")
  @JsonIgnore

  public String getCaseExecutionId() {
        return caseExecutionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCaseExecutionId_JsonNullable() {
    return caseExecutionId;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID)
  public void setCaseExecutionId_JsonNullable(JsonNullable<String> caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = JsonNullable.<String>of(caseExecutionId);
  }


  public UserOperationLogEntryDto taskId(String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this task.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this task.")
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


  public UserOperationLogEntryDto externalTaskId(String externalTaskId) {
    this.externalTaskId = JsonNullable.<String>of(externalTaskId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this external task.
   * @return externalTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this external task.")
  @JsonIgnore

  public String getExternalTaskId() {
        return externalTaskId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalTaskId_JsonNullable() {
    return externalTaskId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_TASK_ID)
  public void setExternalTaskId_JsonNullable(JsonNullable<String> externalTaskId) {
    this.externalTaskId = externalTaskId;
  }

  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = JsonNullable.<String>of(externalTaskId);
  }


  public UserOperationLogEntryDto batchId(String batchId) {
    this.batchId = JsonNullable.<String>of(batchId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this batch.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this batch.")
  @JsonIgnore

  public String getBatchId() {
        return batchId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBatchId_JsonNullable() {
    return batchId;
  }
  
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  public void setBatchId_JsonNullable(JsonNullable<String> batchId) {
    this.batchId = batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = JsonNullable.<String>of(batchId);
  }


  public UserOperationLogEntryDto jobId(String jobId) {
    this.jobId = JsonNullable.<String>of(jobId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this job.
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this job.")
  @JsonIgnore

  public String getJobId() {
        return jobId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobId_JsonNullable() {
    return jobId;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  public void setJobId_JsonNullable(JsonNullable<String> jobId) {
    this.jobId = jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = JsonNullable.<String>of(jobId);
  }


  public UserOperationLogEntryDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = JsonNullable.<String>of(jobDefinitionId);
    
    return this;
  }

   /**
   * If not &#x60;null&#x60;, the operation is restricted to entities in relation to this job definition.
   * @return jobDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not `null`, the operation is restricted to entities in relation to this job definition.")
  @JsonIgnore

  public String getJobDefinitionId() {
        return jobDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobDefinitionId_JsonNullable() {
    return jobDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_DEFINITION_ID)
  public void setJobDefinitionId_JsonNullable(JsonNullable<String> jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = JsonNullable.<String>of(jobDefinitionId);
  }


  public UserOperationLogEntryDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = JsonNullable.<OffsetDateTime>of(removalTime);
    
    return this;
  }

   /**
   * The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
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


  public UserOperationLogEntryDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = JsonNullable.<String>of(rootProcessInstanceId);
    
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process containing this entry.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process containing this entry.")
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
    UserOperationLogEntryDto userOperationLogEntryDto = (UserOperationLogEntryDto) o;
    return Objects.equals(this.id, userOperationLogEntryDto.id) &&
        Objects.equals(this.userId, userOperationLogEntryDto.userId) &&
        Objects.equals(this.timestamp, userOperationLogEntryDto.timestamp) &&
        Objects.equals(this.operationId, userOperationLogEntryDto.operationId) &&
        Objects.equals(this.operationType, userOperationLogEntryDto.operationType) &&
        Objects.equals(this.entityType, userOperationLogEntryDto.entityType) &&
        Objects.equals(this.category, userOperationLogEntryDto.category) &&
        Objects.equals(this.annotation, userOperationLogEntryDto.annotation) &&
        Objects.equals(this.property, userOperationLogEntryDto.property) &&
        Objects.equals(this.orgValue, userOperationLogEntryDto.orgValue) &&
        Objects.equals(this.newValue, userOperationLogEntryDto.newValue) &&
        Objects.equals(this.deploymentId, userOperationLogEntryDto.deploymentId) &&
        Objects.equals(this.processDefinitionId, userOperationLogEntryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, userOperationLogEntryDto.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, userOperationLogEntryDto.processInstanceId) &&
        Objects.equals(this.executionId, userOperationLogEntryDto.executionId) &&
        Objects.equals(this.caseDefinitionId, userOperationLogEntryDto.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, userOperationLogEntryDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, userOperationLogEntryDto.caseExecutionId) &&
        Objects.equals(this.taskId, userOperationLogEntryDto.taskId) &&
        Objects.equals(this.externalTaskId, userOperationLogEntryDto.externalTaskId) &&
        Objects.equals(this.batchId, userOperationLogEntryDto.batchId) &&
        Objects.equals(this.jobId, userOperationLogEntryDto.jobId) &&
        Objects.equals(this.jobDefinitionId, userOperationLogEntryDto.jobDefinitionId) &&
        Objects.equals(this.removalTime, userOperationLogEntryDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, userOperationLogEntryDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, timestamp, operationId, operationType, entityType, category, annotation, property, orgValue, newValue, deploymentId, processDefinitionId, processDefinitionKey, processInstanceId, executionId, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, externalTaskId, batchId, jobId, jobDefinitionId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOperationLogEntryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    orgValue: ").append(toIndentedString(orgValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
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

