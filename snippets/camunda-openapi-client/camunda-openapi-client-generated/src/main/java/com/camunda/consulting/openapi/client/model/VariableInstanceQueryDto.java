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
import com.camunda.consulting.openapi.client.model.VariableInstanceQueryDtoSorting;
import com.camunda.consulting.openapi.client.model.VariableQueryParameterDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A variable instance query which defines a list of variable instances
 */
@ApiModel(description = "A variable instance query which defines a list of variable instances")
@JsonPropertyOrder({
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_NAME,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_NAME_LIKE,
  VariableInstanceQueryDto.JSON_PROPERTY_PROCESS_INSTANCE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_EXECUTION_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_CASE_INSTANCE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_CASE_EXECUTION_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_TASK_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_BATCH_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_TENANT_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_VALUES,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE,
  VariableInstanceQueryDto.JSON_PROPERTY_VARIABLE_SCOPE_ID_IN,
  VariableInstanceQueryDto.JSON_PROPERTY_SORTING
})
@JsonTypeName("VariableInstanceQueryDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class VariableInstanceQueryDto {
  public static final String JSON_PROPERTY_VARIABLE_NAME = "variableName";
  private JsonNullable<String> variableName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VARIABLE_NAME_LIKE = "variableNameLike";
  private JsonNullable<String> variableNameLike = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID_IN = "processInstanceIdIn";
  private JsonNullable<List<String>> processInstanceIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXECUTION_ID_IN = "executionIdIn";
  private JsonNullable<List<String>> executionIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CASE_INSTANCE_ID_IN = "caseInstanceIdIn";
  private JsonNullable<List<String>> caseInstanceIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CASE_EXECUTION_ID_IN = "caseExecutionIdIn";
  private JsonNullable<List<String>> caseExecutionIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TASK_ID_IN = "taskIdIn";
  private JsonNullable<List<String>> taskIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_BATCH_ID_IN = "batchIdIn";
  private JsonNullable<List<String>> batchIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN = "activityInstanceIdIn";
  private JsonNullable<List<String>> activityInstanceIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TENANT_ID_IN = "tenantIdIn";
  private JsonNullable<List<String>> tenantIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_VARIABLE_VALUES = "variableValues";
  private JsonNullable<List<VariableQueryParameterDto>> variableValues = JsonNullable.<List<VariableQueryParameterDto>>undefined();

  public static final String JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE = "variableNamesIgnoreCase";
  private JsonNullable<Boolean> variableNamesIgnoreCase = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE = "variableValuesIgnoreCase";
  private JsonNullable<Boolean> variableValuesIgnoreCase = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_VARIABLE_SCOPE_ID_IN = "variableScopeIdIn";
  private JsonNullable<List<String>> variableScopeIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_SORTING = "sorting";
  private JsonNullable<List<VariableInstanceQueryDtoSorting>> sorting = JsonNullable.<List<VariableInstanceQueryDtoSorting>>undefined();


  public VariableInstanceQueryDto variableName(String variableName) {
    this.variableName = JsonNullable.<String>of(variableName);
    
    return this;
  }

   /**
   * Filter by variable instance name.
   * @return variableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by variable instance name.")
  @JsonIgnore

  public String getVariableName() {
        return variableName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVariableName_JsonNullable() {
    return variableName;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLE_NAME)
  public void setVariableName_JsonNullable(JsonNullable<String> variableName) {
    this.variableName = variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = JsonNullable.<String>of(variableName);
  }


  public VariableInstanceQueryDto variableNameLike(String variableNameLike) {
    this.variableNameLike = JsonNullable.<String>of(variableNameLike);
    
    return this;
  }

   /**
   * Filter by the variable instance name. The parameter can include the wildcard &#x60;%&#x60; to express like-strategy such as: starts with (&#x60;%&#x60;name), ends with (name&#x60;%&#x60;) or contains (&#x60;%&#x60;name&#x60;%&#x60;).
   * @return variableNameLike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the variable instance name. The parameter can include the wildcard `%` to express like-strategy such as: starts with (`%`name), ends with (name`%`) or contains (`%`name`%`).")
  @JsonIgnore

  public String getVariableNameLike() {
        return variableNameLike.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLE_NAME_LIKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVariableNameLike_JsonNullable() {
    return variableNameLike;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLE_NAME_LIKE)
  public void setVariableNameLike_JsonNullable(JsonNullable<String> variableNameLike) {
    this.variableNameLike = variableNameLike;
  }

  public void setVariableNameLike(String variableNameLike) {
    this.variableNameLike = JsonNullable.<String>of(variableNameLike);
  }


  public VariableInstanceQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = JsonNullable.<List<String>>of(processInstanceIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null || !this.processInstanceIdIn.isPresent()) {
      this.processInstanceIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.processInstanceIdIn.get().add(processInstanceIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  process instance ids.
   * @return processInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  process instance ids.")
  @JsonIgnore

  public List<String> getProcessInstanceIdIn() {
        return processInstanceIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getProcessInstanceIdIn_JsonNullable() {
    return processInstanceIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID_IN)
  public void setProcessInstanceIdIn_JsonNullable(JsonNullable<List<String>> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = JsonNullable.<List<String>>of(processInstanceIdIn);
  }


  public VariableInstanceQueryDto executionIdIn(List<String> executionIdIn) {
    this.executionIdIn = JsonNullable.<List<String>>of(executionIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null || !this.executionIdIn.isPresent()) {
      this.executionIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.executionIdIn.get().add(executionIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  execution ids.
   * @return executionIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  execution ids.")
  @JsonIgnore

  public List<String> getExecutionIdIn() {
        return executionIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXECUTION_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getExecutionIdIn_JsonNullable() {
    return executionIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_EXECUTION_ID_IN)
  public void setExecutionIdIn_JsonNullable(JsonNullable<List<String>> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }

  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = JsonNullable.<List<String>>of(executionIdIn);
  }


  public VariableInstanceQueryDto caseInstanceIdIn(List<String> caseInstanceIdIn) {
    this.caseInstanceIdIn = JsonNullable.<List<String>>of(caseInstanceIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addCaseInstanceIdInItem(String caseInstanceIdInItem) {
    if (this.caseInstanceIdIn == null || !this.caseInstanceIdIn.isPresent()) {
      this.caseInstanceIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.caseInstanceIdIn.get().add(caseInstanceIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  case instance ids.
   * @return caseInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  case instance ids.")
  @JsonIgnore

  public List<String> getCaseInstanceIdIn() {
        return caseInstanceIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getCaseInstanceIdIn_JsonNullable() {
    return caseInstanceIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID_IN)
  public void setCaseInstanceIdIn_JsonNullable(JsonNullable<List<String>> caseInstanceIdIn) {
    this.caseInstanceIdIn = caseInstanceIdIn;
  }

  public void setCaseInstanceIdIn(List<String> caseInstanceIdIn) {
    this.caseInstanceIdIn = JsonNullable.<List<String>>of(caseInstanceIdIn);
  }


  public VariableInstanceQueryDto caseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = JsonNullable.<List<String>>of(caseExecutionIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addCaseExecutionIdInItem(String caseExecutionIdInItem) {
    if (this.caseExecutionIdIn == null || !this.caseExecutionIdIn.isPresent()) {
      this.caseExecutionIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.caseExecutionIdIn.get().add(caseExecutionIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  case execution ids.
   * @return caseExecutionIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  case execution ids.")
  @JsonIgnore

  public List<String> getCaseExecutionIdIn() {
        return caseExecutionIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getCaseExecutionIdIn_JsonNullable() {
    return caseExecutionIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_CASE_EXECUTION_ID_IN)
  public void setCaseExecutionIdIn_JsonNullable(JsonNullable<List<String>> caseExecutionIdIn) {
    this.caseExecutionIdIn = caseExecutionIdIn;
  }

  public void setCaseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = JsonNullable.<List<String>>of(caseExecutionIdIn);
  }


  public VariableInstanceQueryDto taskIdIn(List<String> taskIdIn) {
    this.taskIdIn = JsonNullable.<List<String>>of(taskIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addTaskIdInItem(String taskIdInItem) {
    if (this.taskIdIn == null || !this.taskIdIn.isPresent()) {
      this.taskIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.taskIdIn.get().add(taskIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  task ids.
   * @return taskIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  task ids.")
  @JsonIgnore

  public List<String> getTaskIdIn() {
        return taskIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTaskIdIn_JsonNullable() {
    return taskIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_ID_IN)
  public void setTaskIdIn_JsonNullable(JsonNullable<List<String>> taskIdIn) {
    this.taskIdIn = taskIdIn;
  }

  public void setTaskIdIn(List<String> taskIdIn) {
    this.taskIdIn = JsonNullable.<List<String>>of(taskIdIn);
  }


  public VariableInstanceQueryDto batchIdIn(List<String> batchIdIn) {
    this.batchIdIn = JsonNullable.<List<String>>of(batchIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addBatchIdInItem(String batchIdInItem) {
    if (this.batchIdIn == null || !this.batchIdIn.isPresent()) {
      this.batchIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.batchIdIn.get().add(batchIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  batch ids.
   * @return batchIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  batch ids.")
  @JsonIgnore

  public List<String> getBatchIdIn() {
        return batchIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BATCH_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getBatchIdIn_JsonNullable() {
    return batchIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_BATCH_ID_IN)
  public void setBatchIdIn_JsonNullable(JsonNullable<List<String>> batchIdIn) {
    this.batchIdIn = batchIdIn;
  }

  public void setBatchIdIn(List<String> batchIdIn) {
    this.batchIdIn = JsonNullable.<List<String>>of(batchIdIn);
  }


  public VariableInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = JsonNullable.<List<String>>of(activityInstanceIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null || !this.activityInstanceIdIn.isPresent()) {
      this.activityInstanceIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.activityInstanceIdIn.get().add(activityInstanceIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  activity instance ids.
   * @return activityInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  activity instance ids.")
  @JsonIgnore

  public List<String> getActivityInstanceIdIn() {
        return activityInstanceIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getActivityInstanceIdIn_JsonNullable() {
    return activityInstanceIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID_IN)
  public void setActivityInstanceIdIn_JsonNullable(JsonNullable<List<String>> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = JsonNullable.<List<String>>of(activityInstanceIdIn);
  }


  public VariableInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = JsonNullable.<List<String>>of(tenantIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null || !this.tenantIdIn.isPresent()) {
      this.tenantIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tenantIdIn.get().add(tenantIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of the passed  tenant ids.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of the passed  tenant ids.")
  @JsonIgnore

  public List<String> getTenantIdIn() {
        return tenantIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TENANT_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTenantIdIn_JsonNullable() {
    return tenantIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_TENANT_ID_IN)
  public void setTenantIdIn_JsonNullable(JsonNullable<List<String>> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = JsonNullable.<List<String>>of(tenantIdIn);
  }


  public VariableInstanceQueryDto variableValues(List<VariableQueryParameterDto> variableValues) {
    this.variableValues = JsonNullable.<List<VariableQueryParameterDto>>of(variableValues);
    
    return this;
  }

  public VariableInstanceQueryDto addVariableValuesItem(VariableQueryParameterDto variableValuesItem) {
    if (this.variableValues == null || !this.variableValues.isPresent()) {
      this.variableValues = JsonNullable.<List<VariableQueryParameterDto>>of(new ArrayList<>());
    }
    try {
      this.variableValues.get().add(variableValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * An array to only include variable instances that have the certain values. The array consists of objects with the three properties &#x60;name&#x60;, &#x60;operator&#x60; and &#x60;value&#x60;. &#x60;name (String)&#x60; is the variable name, &#x60;operator (String)&#x60; is the comparison operator to be used and &#x60;value&#x60; the variable value. &#x60;value&#x60; may be &#x60;String&#x60;, &#x60;Number&#x60; or &#x60;Boolean&#x60;.  Valid operator values are: &#x60;eq&#x60; - equal to; &#x60;neq&#x60; - not equal to; &#x60;gt&#x60; - greater than; &#x60;gteq&#x60; - greater than or equal to; &#x60;lt&#x60; - lower than; &#x60;lteq&#x60; - lower than or equal to; &#x60;like&#x60;
   * @return variableValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array to only include variable instances that have the certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`")
  @JsonIgnore

  public List<VariableQueryParameterDto> getVariableValues() {
        return variableValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<VariableQueryParameterDto>> getVariableValues_JsonNullable() {
    return variableValues;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES)
  public void setVariableValues_JsonNullable(JsonNullable<List<VariableQueryParameterDto>> variableValues) {
    this.variableValues = variableValues;
  }

  public void setVariableValues(List<VariableQueryParameterDto> variableValues) {
    this.variableValues = JsonNullable.<List<VariableQueryParameterDto>>of(variableValues);
  }


  public VariableInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = JsonNullable.<Boolean>of(variableNamesIgnoreCase);
    
    return this;
  }

   /**
   * Match all variable names provided in &#x60;variableValues&#x60; case-insensitively. If set to &#x60;true&#x60; **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match all variable names provided in `variableValues` case-insensitively. If set to `true` **variableName** and **variablename** are treated as equal.")
  @JsonIgnore

  public Boolean getVariableNamesIgnoreCase() {
        return variableNamesIgnoreCase.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getVariableNamesIgnoreCase_JsonNullable() {
    return variableNamesIgnoreCase;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLE_NAMES_IGNORE_CASE)
  public void setVariableNamesIgnoreCase_JsonNullable(JsonNullable<Boolean> variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = JsonNullable.<Boolean>of(variableNamesIgnoreCase);
  }


  public VariableInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = JsonNullable.<Boolean>of(variableValuesIgnoreCase);
    
    return this;
  }

   /**
   * Match all variable values provided in &#x60;variableValues&#x60; case-insensitively. If set to &#x60;true&#x60; **variableValue** and **variablevalue** are treated as equal.
   * @return variableValuesIgnoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match all variable values provided in `variableValues` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.")
  @JsonIgnore

  public Boolean getVariableValuesIgnoreCase() {
        return variableValuesIgnoreCase.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getVariableValuesIgnoreCase_JsonNullable() {
    return variableValuesIgnoreCase;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLE_VALUES_IGNORE_CASE)
  public void setVariableValuesIgnoreCase_JsonNullable(JsonNullable<Boolean> variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = JsonNullable.<Boolean>of(variableValuesIgnoreCase);
  }


  public VariableInstanceQueryDto variableScopeIdIn(List<String> variableScopeIdIn) {
    this.variableScopeIdIn = JsonNullable.<List<String>>of(variableScopeIdIn);
    
    return this;
  }

  public VariableInstanceQueryDto addVariableScopeIdInItem(String variableScopeIdInItem) {
    if (this.variableScopeIdIn == null || !this.variableScopeIdIn.isPresent()) {
      this.variableScopeIdIn = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.variableScopeIdIn.get().add(variableScopeIdInItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Only include variable instances which belong to one of passed scope ids.
   * @return variableScopeIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include variable instances which belong to one of passed scope ids.")
  @JsonIgnore

  public List<String> getVariableScopeIdIn() {
        return variableScopeIdIn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLE_SCOPE_ID_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getVariableScopeIdIn_JsonNullable() {
    return variableScopeIdIn;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLE_SCOPE_ID_IN)
  public void setVariableScopeIdIn_JsonNullable(JsonNullable<List<String>> variableScopeIdIn) {
    this.variableScopeIdIn = variableScopeIdIn;
  }

  public void setVariableScopeIdIn(List<String> variableScopeIdIn) {
    this.variableScopeIdIn = JsonNullable.<List<String>>of(variableScopeIdIn);
  }


  public VariableInstanceQueryDto sorting(List<VariableInstanceQueryDtoSorting> sorting) {
    this.sorting = JsonNullable.<List<VariableInstanceQueryDtoSorting>>of(sorting);
    
    return this;
  }

  public VariableInstanceQueryDto addSortingItem(VariableInstanceQueryDtoSorting sortingItem) {
    if (this.sorting == null || !this.sorting.isPresent()) {
      this.sorting = JsonNullable.<List<VariableInstanceQueryDtoSorting>>of(new ArrayList<>());
    }
    try {
      this.sorting.get().add(sortingItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for &#x60;count&#x60; endpoints
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for `count` endpoints")
  @JsonIgnore

  public List<VariableInstanceQueryDtoSorting> getSorting() {
        return sorting.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SORTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<VariableInstanceQueryDtoSorting>> getSorting_JsonNullable() {
    return sorting;
  }
  
  @JsonProperty(JSON_PROPERTY_SORTING)
  public void setSorting_JsonNullable(JsonNullable<List<VariableInstanceQueryDtoSorting>> sorting) {
    this.sorting = sorting;
  }

  public void setSorting(List<VariableInstanceQueryDtoSorting> sorting) {
    this.sorting = JsonNullable.<List<VariableInstanceQueryDtoSorting>>of(sorting);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableInstanceQueryDto variableInstanceQueryDto = (VariableInstanceQueryDto) o;
    return Objects.equals(this.variableName, variableInstanceQueryDto.variableName) &&
        Objects.equals(this.variableNameLike, variableInstanceQueryDto.variableNameLike) &&
        Objects.equals(this.processInstanceIdIn, variableInstanceQueryDto.processInstanceIdIn) &&
        Objects.equals(this.executionIdIn, variableInstanceQueryDto.executionIdIn) &&
        Objects.equals(this.caseInstanceIdIn, variableInstanceQueryDto.caseInstanceIdIn) &&
        Objects.equals(this.caseExecutionIdIn, variableInstanceQueryDto.caseExecutionIdIn) &&
        Objects.equals(this.taskIdIn, variableInstanceQueryDto.taskIdIn) &&
        Objects.equals(this.batchIdIn, variableInstanceQueryDto.batchIdIn) &&
        Objects.equals(this.activityInstanceIdIn, variableInstanceQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.tenantIdIn, variableInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.variableValues, variableInstanceQueryDto.variableValues) &&
        Objects.equals(this.variableNamesIgnoreCase, variableInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, variableInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.variableScopeIdIn, variableInstanceQueryDto.variableScopeIdIn) &&
        Objects.equals(this.sorting, variableInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, variableNameLike, processInstanceIdIn, executionIdIn, caseInstanceIdIn, caseExecutionIdIn, taskIdIn, batchIdIn, activityInstanceIdIn, tenantIdIn, variableValues, variableNamesIgnoreCase, variableValuesIgnoreCase, variableScopeIdIn, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableInstanceQueryDto {\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableNameLike: ").append(toIndentedString(variableNameLike)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    caseInstanceIdIn: ").append(toIndentedString(caseInstanceIdIn)).append("\n");
    sb.append("    caseExecutionIdIn: ").append(toIndentedString(caseExecutionIdIn)).append("\n");
    sb.append("    taskIdIn: ").append(toIndentedString(taskIdIn)).append("\n");
    sb.append("    batchIdIn: ").append(toIndentedString(batchIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    variableScopeIdIn: ").append(toIndentedString(variableScopeIdIn)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

