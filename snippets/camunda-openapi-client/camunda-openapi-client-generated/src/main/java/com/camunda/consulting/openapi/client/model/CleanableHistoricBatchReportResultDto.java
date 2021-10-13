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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CleanableHistoricBatchReportResultDto
 */
@JsonPropertyOrder({
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_BATCH_TYPE,
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_HISTORY_TIME_TO_LIVE,
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_FINISHED_BATCHES_COUNT,
  CleanableHistoricBatchReportResultDto.JSON_PROPERTY_CLEANABLE_BATCHES_COUNT
})
@JsonTypeName("CleanableHistoricBatchReportResultDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class CleanableHistoricBatchReportResultDto {
  public static final String JSON_PROPERTY_BATCH_TYPE = "batchType";
  private JsonNullable<String> batchType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
  private JsonNullable<Integer> historyTimeToLive = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FINISHED_BATCHES_COUNT = "finishedBatchesCount";
  private JsonNullable<Long> finishedBatchesCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CLEANABLE_BATCHES_COUNT = "cleanableBatchesCount";
  private JsonNullable<Long> cleanableBatchesCount = JsonNullable.<Long>undefined();


  public CleanableHistoricBatchReportResultDto batchType(String batchType) {
    this.batchType = JsonNullable.<String>of(batchType);
    
    return this;
  }

   /**
   * The type of the batch operation.
   * @return batchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the batch operation.")
  @JsonIgnore

  public String getBatchType() {
        return batchType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBatchType_JsonNullable() {
    return batchType;
  }
  
  @JsonProperty(JSON_PROPERTY_BATCH_TYPE)
  public void setBatchType_JsonNullable(JsonNullable<String> batchType) {
    this.batchType = batchType;
  }

  public void setBatchType(String batchType) {
    this.batchType = JsonNullable.<String>of(batchType);
  }


  public CleanableHistoricBatchReportResultDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = JsonNullable.<Integer>of(historyTimeToLive);
    
    return this;
  }

   /**
   * The history time to live of the batch operation.
   * @return historyTimeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The history time to live of the batch operation.")
  @JsonIgnore

  public Integer getHistoryTimeToLive() {
        return historyTimeToLive.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HISTORY_TIME_TO_LIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getHistoryTimeToLive_JsonNullable() {
    return historyTimeToLive;
  }
  
  @JsonProperty(JSON_PROPERTY_HISTORY_TIME_TO_LIVE)
  public void setHistoryTimeToLive_JsonNullable(JsonNullable<Integer> historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = JsonNullable.<Integer>of(historyTimeToLive);
  }


  public CleanableHistoricBatchReportResultDto finishedBatchesCount(Long finishedBatchesCount) {
    this.finishedBatchesCount = JsonNullable.<Long>of(finishedBatchesCount);
    
    return this;
  }

   /**
   * The count of the finished batch operations.
   * @return finishedBatchesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of the finished batch operations.")
  @JsonIgnore

  public Long getFinishedBatchesCount() {
        return finishedBatchesCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINISHED_BATCHES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getFinishedBatchesCount_JsonNullable() {
    return finishedBatchesCount;
  }
  
  @JsonProperty(JSON_PROPERTY_FINISHED_BATCHES_COUNT)
  public void setFinishedBatchesCount_JsonNullable(JsonNullable<Long> finishedBatchesCount) {
    this.finishedBatchesCount = finishedBatchesCount;
  }

  public void setFinishedBatchesCount(Long finishedBatchesCount) {
    this.finishedBatchesCount = JsonNullable.<Long>of(finishedBatchesCount);
  }


  public CleanableHistoricBatchReportResultDto cleanableBatchesCount(Long cleanableBatchesCount) {
    this.cleanableBatchesCount = JsonNullable.<Long>of(cleanableBatchesCount);
    
    return this;
  }

   /**
   * The count of the cleanable historic batch operations, referring to history time to live.
   * @return cleanableBatchesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of the cleanable historic batch operations, referring to history time to live.")
  @JsonIgnore

  public Long getCleanableBatchesCount() {
        return cleanableBatchesCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLEANABLE_BATCHES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getCleanableBatchesCount_JsonNullable() {
    return cleanableBatchesCount;
  }
  
  @JsonProperty(JSON_PROPERTY_CLEANABLE_BATCHES_COUNT)
  public void setCleanableBatchesCount_JsonNullable(JsonNullable<Long> cleanableBatchesCount) {
    this.cleanableBatchesCount = cleanableBatchesCount;
  }

  public void setCleanableBatchesCount(Long cleanableBatchesCount) {
    this.cleanableBatchesCount = JsonNullable.<Long>of(cleanableBatchesCount);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanableHistoricBatchReportResultDto cleanableHistoricBatchReportResultDto = (CleanableHistoricBatchReportResultDto) o;
    return Objects.equals(this.batchType, cleanableHistoricBatchReportResultDto.batchType) &&
        Objects.equals(this.historyTimeToLive, cleanableHistoricBatchReportResultDto.historyTimeToLive) &&
        Objects.equals(this.finishedBatchesCount, cleanableHistoricBatchReportResultDto.finishedBatchesCount) &&
        Objects.equals(this.cleanableBatchesCount, cleanableHistoricBatchReportResultDto.cleanableBatchesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchType, historyTimeToLive, finishedBatchesCount, cleanableBatchesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanableHistoricBatchReportResultDto {\n");
    sb.append("    batchType: ").append(toIndentedString(batchType)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    finishedBatchesCount: ").append(toIndentedString(finishedBatchesCount)).append("\n");
    sb.append("    cleanableBatchesCount: ").append(toIndentedString(cleanableBatchesCount)).append("\n");
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

