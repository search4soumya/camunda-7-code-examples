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
import com.camunda.consulting.openapi.client.model.HistoricBatchQueryDtoSorting;
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
 * Query for the historic batches to set the removal time for.
 */
@ApiModel(description = "Query for the historic batches to set the removal time for.")
@JsonPropertyOrder({
  HistoricBatchQueryDto.JSON_PROPERTY_BATCH_ID,
  HistoricBatchQueryDto.JSON_PROPERTY_TYPE,
  HistoricBatchQueryDto.JSON_PROPERTY_COMPLETED,
  HistoricBatchQueryDto.JSON_PROPERTY_TENANT_ID_IN,
  HistoricBatchQueryDto.JSON_PROPERTY_WITHOUT_TENANT_ID,
  HistoricBatchQueryDto.JSON_PROPERTY_SORTING
})
@JsonTypeName("HistoricBatchQueryDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class HistoricBatchQueryDto {
  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private JsonNullable<String> batchId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private JsonNullable<Boolean> completed = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TENANT_ID_IN = "tenantIdIn";
  private JsonNullable<List<String>> tenantIdIn = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_WITHOUT_TENANT_ID = "withoutTenantId";
  private JsonNullable<Boolean> withoutTenantId = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SORTING = "sorting";
  private JsonNullable<List<HistoricBatchQueryDtoSorting>> sorting = JsonNullable.<List<HistoricBatchQueryDtoSorting>>undefined();


  public HistoricBatchQueryDto batchId(String batchId) {
    this.batchId = JsonNullable.<String>of(batchId);
    
    return this;
  }

   /**
   * Filter by batch id.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by batch id.")
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


  public HistoricBatchQueryDto type(String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

   /**
   * Filter by batch type. See the [User Guide](https://docs.camunda.org/manual/7.16/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by batch type. See the [User Guide](https://docs.camunda.org/manual/7.16/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.")
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


  public HistoricBatchQueryDto completed(Boolean completed) {
    this.completed = JsonNullable.<Boolean>of(completed);
    
    return this;
  }

   /**
   *  Filter completed or not completed batches. If the value is &#x60;true&#x60;, only completed batches, i.e., end time is set, are returned. Otherwise, if the value is &#x60;false&#x60;, only running batches, i.e., end time is null, are returned.
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Filter completed or not completed batches. If the value is `true`, only completed batches, i.e., end time is set, are returned. Otherwise, if the value is `false`, only running batches, i.e., end time is null, are returned.")
  @JsonIgnore

  public Boolean getCompleted() {
        return completed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCompleted_JsonNullable() {
    return completed;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  public void setCompleted_JsonNullable(JsonNullable<Boolean> completed) {
    this.completed = completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = JsonNullable.<Boolean>of(completed);
  }


  public HistoricBatchQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = JsonNullable.<List<String>>of(tenantIdIn);
    
    return this;
  }

  public HistoricBatchQueryDto addTenantIdInItem(String tenantIdInItem) {
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
   * Filter by a comma-separated list of tenant ids. A batch matches if it has one of the given tenant ids.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a comma-separated list of tenant ids. A batch matches if it has one of the given tenant ids.")
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


  public HistoricBatchQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = JsonNullable.<Boolean>of(withoutTenantId);
    
    return this;
  }

   /**
   * Only include batches which belong to no tenant. Value can effectively only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return withoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include batches which belong to no tenant. Value can effectively only be `true`, as `false` is the default behavior.")
  @JsonIgnore

  public Boolean getWithoutTenantId() {
        return withoutTenantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WITHOUT_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getWithoutTenantId_JsonNullable() {
    return withoutTenantId;
  }
  
  @JsonProperty(JSON_PROPERTY_WITHOUT_TENANT_ID)
  public void setWithoutTenantId_JsonNullable(JsonNullable<Boolean> withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = JsonNullable.<Boolean>of(withoutTenantId);
  }


  public HistoricBatchQueryDto sorting(List<HistoricBatchQueryDtoSorting> sorting) {
    this.sorting = JsonNullable.<List<HistoricBatchQueryDtoSorting>>of(sorting);
    
    return this;
  }

  public HistoricBatchQueryDto addSortingItem(HistoricBatchQueryDtoSorting sortingItem) {
    if (this.sorting == null || !this.sorting.isPresent()) {
      this.sorting = JsonNullable.<List<HistoricBatchQueryDtoSorting>>of(new ArrayList<>());
    }
    try {
      this.sorting.get().add(sortingItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the &#x60;/count&#x60; endpoint
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint")
  @JsonIgnore

  public List<HistoricBatchQueryDtoSorting> getSorting() {
        return sorting.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SORTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<HistoricBatchQueryDtoSorting>> getSorting_JsonNullable() {
    return sorting;
  }
  
  @JsonProperty(JSON_PROPERTY_SORTING)
  public void setSorting_JsonNullable(JsonNullable<List<HistoricBatchQueryDtoSorting>> sorting) {
    this.sorting = sorting;
  }

  public void setSorting(List<HistoricBatchQueryDtoSorting> sorting) {
    this.sorting = JsonNullable.<List<HistoricBatchQueryDtoSorting>>of(sorting);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricBatchQueryDto historicBatchQueryDto = (HistoricBatchQueryDto) o;
    return Objects.equals(this.batchId, historicBatchQueryDto.batchId) &&
        Objects.equals(this.type, historicBatchQueryDto.type) &&
        Objects.equals(this.completed, historicBatchQueryDto.completed) &&
        Objects.equals(this.tenantIdIn, historicBatchQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicBatchQueryDto.withoutTenantId) &&
        Objects.equals(this.sorting, historicBatchQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, type, completed, tenantIdIn, withoutTenantId, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricBatchQueryDto {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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

