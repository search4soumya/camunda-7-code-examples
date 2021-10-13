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
 * HistoricVariableInstanceDtoAllOf
 */
@JsonPropertyOrder({
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_NAME,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_EXECUTION_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_CASE_DEFINITION_KEY,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_CASE_DEFINITION_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_CASE_INSTANCE_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_CASE_EXECUTION_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_TASK_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_TENANT_ID,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_ERROR_MESSAGE,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_STATE,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_CREATE_TIME,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_REMOVAL_TIME,
  HistoricVariableInstanceDtoAllOf.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID
})
@JsonTypeName("HistoricVariableInstanceDto_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class HistoricVariableInstanceDtoAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  private JsonNullable<String> processDefinitionKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private JsonNullable<String> processDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
  private JsonNullable<String> processInstanceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
  private JsonNullable<String> executionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
  private JsonNullable<String> activityInstanceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_DEFINITION_KEY = "caseDefinitionKey";
  private JsonNullable<String> caseDefinitionKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_DEFINITION_ID = "caseDefinitionId";
  private JsonNullable<String> caseDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
  private JsonNullable<String> caseInstanceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CASE_EXECUTION_ID = "caseExecutionId";
  private JsonNullable<String> caseExecutionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private JsonNullable<String> tenantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private JsonNullable<OffsetDateTime> createTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
  private JsonNullable<OffsetDateTime> removalTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  private JsonNullable<String> rootProcessInstanceId = JsonNullable.<String>undefined();


  public HistoricVariableInstanceDtoAllOf id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * The id of the variable instance.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the variable instance.")
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


  public HistoricVariableInstanceDtoAllOf name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The name of the variable instance.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the variable instance.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public HistoricVariableInstanceDtoAllOf processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = JsonNullable.<String>of(processDefinitionKey);
    
    return this;
  }

   /**
   * The key of the process definition the variable instance belongs to.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = JsonNullable.<String>of(processDefinitionId);
    
    return this;
  }

   /**
   * The id of the process definition the variable instance belongs to.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf processInstanceId(String processInstanceId) {
    this.processInstanceId = JsonNullable.<String>of(processInstanceId);
    
    return this;
  }

   /**
   * The process instance id the variable instance belongs to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf executionId(String executionId) {
    this.executionId = JsonNullable.<String>of(executionId);
    
    return this;
  }

   /**
   * The execution id the variable instance belongs to.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The execution id the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = JsonNullable.<String>of(activityInstanceId);
    
    return this;
  }

   /**
   * The id of the activity instance in which the variable is valid.
   * @return activityInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity instance in which the variable is valid.")
  @JsonIgnore

  public String getActivityInstanceId() {
        return activityInstanceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getActivityInstanceId_JsonNullable() {
    return activityInstanceId;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
  public void setActivityInstanceId_JsonNullable(JsonNullable<String> activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = JsonNullable.<String>of(activityInstanceId);
  }


  public HistoricVariableInstanceDtoAllOf caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = JsonNullable.<String>of(caseDefinitionKey);
    
    return this;
  }

   /**
   * The key of the case definition the variable instance belongs to.
   * @return caseDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the case definition the variable instance belongs to.")
  @JsonIgnore

  public String getCaseDefinitionKey() {
        return caseDefinitionKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCaseDefinitionKey_JsonNullable() {
    return caseDefinitionKey;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_DEFINITION_KEY)
  public void setCaseDefinitionKey_JsonNullable(JsonNullable<String> caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = JsonNullable.<String>of(caseDefinitionKey);
  }


  public HistoricVariableInstanceDtoAllOf caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = JsonNullable.<String>of(caseDefinitionId);
    
    return this;
  }

   /**
   * The id of the case definition the variable instance belongs to.
   * @return caseDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case definition the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = JsonNullable.<String>of(caseInstanceId);
    
    return this;
  }

   /**
   * The case instance id the variable instance belongs to.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The case instance id the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = JsonNullable.<String>of(caseExecutionId);
    
    return this;
  }

   /**
   * The case execution id the variable instance belongs to.
   * @return caseExecutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The case execution id the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf taskId(String taskId) {
    this.taskId = JsonNullable.<String>of(taskId);
    
    return this;
  }

   /**
   * The id of the task the variable instance belongs to.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the task the variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf tenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
    
    return this;
  }

   /**
   * The id of the tenant that this variable instance belongs to.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant that this variable instance belongs to.")
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


  public HistoricVariableInstanceDtoAllOf errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

   /**
   * An error message in case a Java Serialized Object could not be de-serialized.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An error message in case a Java Serialized Object could not be de-serialized.")
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }


  public HistoricVariableInstanceDtoAllOf state(String state) {
    this.state = JsonNullable.<String>of(state);
    
    return this;
  }

   /**
   * The current state of the variable. Can be &#39;CREATED&#39; or &#39;DELETED&#39;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current state of the variable. Can be 'CREATED' or 'DELETED'.")
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public HistoricVariableInstanceDtoAllOf createTime(OffsetDateTime createTime) {
    this.createTime = JsonNullable.<OffsetDateTime>of(createTime);
    
    return this;
  }

   /**
   * The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  @JsonIgnore

  public OffsetDateTime getCreateTime() {
        return createTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreateTime_JsonNullable() {
    return createTime;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  public void setCreateTime_JsonNullable(JsonNullable<OffsetDateTime> createTime) {
    this.createTime = createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = JsonNullable.<OffsetDateTime>of(createTime);
  }


  public HistoricVariableInstanceDtoAllOf removalTime(OffsetDateTime removalTime) {
    this.removalTime = JsonNullable.<OffsetDateTime>of(removalTime);
    
    return this;
  }

   /**
   * The time after which the variable should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the variable should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
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


  public HistoricVariableInstanceDtoAllOf rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = JsonNullable.<String>of(rootProcessInstanceId);
    
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process containing this variable.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process containing this variable.")
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
    HistoricVariableInstanceDtoAllOf historicVariableInstanceDtoAllOf = (HistoricVariableInstanceDtoAllOf) o;
    return Objects.equals(this.id, historicVariableInstanceDtoAllOf.id) &&
        Objects.equals(this.name, historicVariableInstanceDtoAllOf.name) &&
        Objects.equals(this.processDefinitionKey, historicVariableInstanceDtoAllOf.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicVariableInstanceDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicVariableInstanceDtoAllOf.processInstanceId) &&
        Objects.equals(this.executionId, historicVariableInstanceDtoAllOf.executionId) &&
        Objects.equals(this.activityInstanceId, historicVariableInstanceDtoAllOf.activityInstanceId) &&
        Objects.equals(this.caseDefinitionKey, historicVariableInstanceDtoAllOf.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionId, historicVariableInstanceDtoAllOf.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, historicVariableInstanceDtoAllOf.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicVariableInstanceDtoAllOf.caseExecutionId) &&
        Objects.equals(this.taskId, historicVariableInstanceDtoAllOf.taskId) &&
        Objects.equals(this.tenantId, historicVariableInstanceDtoAllOf.tenantId) &&
        Objects.equals(this.errorMessage, historicVariableInstanceDtoAllOf.errorMessage) &&
        Objects.equals(this.state, historicVariableInstanceDtoAllOf.state) &&
        Objects.equals(this.createTime, historicVariableInstanceDtoAllOf.createTime) &&
        Objects.equals(this.removalTime, historicVariableInstanceDtoAllOf.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicVariableInstanceDtoAllOf.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, processDefinitionKey, processDefinitionId, processInstanceId, executionId, activityInstanceId, caseDefinitionKey, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, tenantId, errorMessage, state, createTime, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricVariableInstanceDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

