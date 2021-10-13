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
import com.camunda.consulting.openapi.client.model.ExtendLockOnExternalTaskDtoAllOf;
import com.camunda.consulting.openapi.client.model.HandleExternalTaskDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ExtendLockOnExternalTaskDto
 */
@JsonPropertyOrder({
  ExtendLockOnExternalTaskDto.JSON_PROPERTY_NEW_DURATION,
  ExtendLockOnExternalTaskDto.JSON_PROPERTY_WORKER_ID
})
@JsonTypeName("ExtendLockOnExternalTaskDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class ExtendLockOnExternalTaskDto {
  public static final String JSON_PROPERTY_NEW_DURATION = "newDuration";
  private JsonNullable<Long> newDuration = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_WORKER_ID = "workerId";
  private String workerId;


  public ExtendLockOnExternalTaskDto newDuration(Long newDuration) {
    this.newDuration = JsonNullable.<Long>of(newDuration);
    
    return this;
  }

   /**
   * An amount of time (in milliseconds). This is the new lock duration starting from the current moment.
   * @return newDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An amount of time (in milliseconds). This is the new lock duration starting from the current moment.")
  @JsonIgnore

  public Long getNewDuration() {
        return newDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getNewDuration_JsonNullable() {
    return newDuration;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_DURATION)
  public void setNewDuration_JsonNullable(JsonNullable<Long> newDuration) {
    this.newDuration = newDuration;
  }

  public void setNewDuration(Long newDuration) {
    this.newDuration = JsonNullable.<Long>of(newDuration);
  }


  public ExtendLockOnExternalTaskDto workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * **Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.")
  @JsonProperty(JSON_PROPERTY_WORKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendLockOnExternalTaskDto extendLockOnExternalTaskDto = (ExtendLockOnExternalTaskDto) o;
    return Objects.equals(this.newDuration, extendLockOnExternalTaskDto.newDuration) &&
        Objects.equals(this.workerId, extendLockOnExternalTaskDto.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDuration, workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendLockOnExternalTaskDto {\n");
    sb.append("    newDuration: ").append(toIndentedString(newDuration)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

