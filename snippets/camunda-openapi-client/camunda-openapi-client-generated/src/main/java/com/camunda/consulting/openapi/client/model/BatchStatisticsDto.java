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
import com.camunda.consulting.openapi.client.model.BatchDto;
import com.camunda.consulting.openapi.client.model.BatchStatisticsDtoAllOf;
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
 * BatchStatisticsDto
 */
@JsonPropertyOrder({
  BatchStatisticsDto.JSON_PROPERTY_REMAINING_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_COMPLETED_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_FAILED_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_ID,
  BatchStatisticsDto.JSON_PROPERTY_TYPE,
  BatchStatisticsDto.JSON_PROPERTY_TOTAL_JOBS,
  BatchStatisticsDto.JSON_PROPERTY_JOBS_CREATED,
  BatchStatisticsDto.JSON_PROPERTY_BATCH_JOBS_PER_SEED,
  BatchStatisticsDto.JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB,
  BatchStatisticsDto.JSON_PROPERTY_SEED_JOB_DEFINITION_ID,
  BatchStatisticsDto.JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID,
  BatchStatisticsDto.JSON_PROPERTY_BATCH_JOB_DEFINITION_ID,
  BatchStatisticsDto.JSON_PROPERTY_SUSPENDED,
  BatchStatisticsDto.JSON_PROPERTY_TENANT_ID,
  BatchStatisticsDto.JSON_PROPERTY_CREATE_USER_ID
})
@JsonTypeName("BatchStatisticsDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class BatchStatisticsDto {
  public static final String JSON_PROPERTY_REMAINING_JOBS = "remainingJobs";
  private JsonNullable<Integer> remainingJobs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_COMPLETED_JOBS = "completedJobs";
  private JsonNullable<Integer> completedJobs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FAILED_JOBS = "failedJobs";
  private JsonNullable<Integer> failedJobs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOTAL_JOBS = "totalJobs";
  private JsonNullable<Integer> totalJobs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_JOBS_CREATED = "jobsCreated";
  private JsonNullable<Integer> jobsCreated = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_BATCH_JOBS_PER_SEED = "batchJobsPerSeed";
  private JsonNullable<Integer> batchJobsPerSeed = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB = "invocationsPerBatchJob";
  private JsonNullable<Integer> invocationsPerBatchJob = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SEED_JOB_DEFINITION_ID = "seedJobDefinitionId";
  private JsonNullable<String> seedJobDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID = "monitorJobDefinitionId";
  private JsonNullable<String> monitorJobDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BATCH_JOB_DEFINITION_ID = "batchJobDefinitionId";
  private JsonNullable<String> batchJobDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUSPENDED = "suspended";
  private JsonNullable<Boolean> suspended = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private JsonNullable<String> tenantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_USER_ID = "createUserId";
  private JsonNullable<String> createUserId = JsonNullable.<String>undefined();


  public BatchStatisticsDto remainingJobs(Integer remainingJobs) {
    this.remainingJobs = JsonNullable.<Integer>of(remainingJobs);
    
    return this;
  }

   /**
   * The number of remaining batch execution jobs. This does include failed batch execution jobs and batch execution jobs which still have to be created by the seed job.
   * @return remainingJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of remaining batch execution jobs. This does include failed batch execution jobs and batch execution jobs which still have to be created by the seed job.")
  @JsonIgnore

  public Integer getRemainingJobs() {
        return remainingJobs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REMAINING_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getRemainingJobs_JsonNullable() {
    return remainingJobs;
  }
  
  @JsonProperty(JSON_PROPERTY_REMAINING_JOBS)
  public void setRemainingJobs_JsonNullable(JsonNullable<Integer> remainingJobs) {
    this.remainingJobs = remainingJobs;
  }

  public void setRemainingJobs(Integer remainingJobs) {
    this.remainingJobs = JsonNullable.<Integer>of(remainingJobs);
  }


  public BatchStatisticsDto completedJobs(Integer completedJobs) {
    this.completedJobs = JsonNullable.<Integer>of(completedJobs);
    
    return this;
  }

   /**
   * The number of completed batch execution jobs. This does include aborted/deleted batch execution jobs.
   * @return completedJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of completed batch execution jobs. This does include aborted/deleted batch execution jobs.")
  @JsonIgnore

  public Integer getCompletedJobs() {
        return completedJobs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getCompletedJobs_JsonNullable() {
    return completedJobs;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_JOBS)
  public void setCompletedJobs_JsonNullable(JsonNullable<Integer> completedJobs) {
    this.completedJobs = completedJobs;
  }

  public void setCompletedJobs(Integer completedJobs) {
    this.completedJobs = JsonNullable.<Integer>of(completedJobs);
  }


  public BatchStatisticsDto failedJobs(Integer failedJobs) {
    this.failedJobs = JsonNullable.<Integer>of(failedJobs);
    
    return this;
  }

   /**
   * The number of failed batch execution jobs. This does not include aborted or deleted batch execution jobs.
   * @return failedJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of failed batch execution jobs. This does not include aborted or deleted batch execution jobs.")
  @JsonIgnore

  public Integer getFailedJobs() {
        return failedJobs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFailedJobs_JsonNullable() {
    return failedJobs;
  }
  
  @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
  public void setFailedJobs_JsonNullable(JsonNullable<Integer> failedJobs) {
    this.failedJobs = failedJobs;
  }

  public void setFailedJobs(Integer failedJobs) {
    this.failedJobs = JsonNullable.<Integer>of(failedJobs);
  }


  public BatchStatisticsDto id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * The id of the batch.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the batch.")
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


  public BatchStatisticsDto type(String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

   /**
   * The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.16/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.16/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.")
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


  public BatchStatisticsDto totalJobs(Integer totalJobs) {
    this.totalJobs = JsonNullable.<Integer>of(totalJobs);
    
    return this;
  }

   /**
   * The total jobs of a batch is the number of batch execution jobs required to complete the batch.
   * @return totalJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total jobs of a batch is the number of batch execution jobs required to complete the batch.")
  @JsonIgnore

  public Integer getTotalJobs() {
        return totalJobs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTotalJobs_JsonNullable() {
    return totalJobs;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_JOBS)
  public void setTotalJobs_JsonNullable(JsonNullable<Integer> totalJobs) {
    this.totalJobs = totalJobs;
  }

  public void setTotalJobs(Integer totalJobs) {
    this.totalJobs = JsonNullable.<Integer>of(totalJobs);
  }


  public BatchStatisticsDto jobsCreated(Integer jobsCreated) {
    this.jobsCreated = JsonNullable.<Integer>of(jobsCreated);
    
    return this;
  }

   /**
   * The number of batch execution jobs already created by the seed job.
   * @return jobsCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of batch execution jobs already created by the seed job.")
  @JsonIgnore

  public Integer getJobsCreated() {
        return jobsCreated.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOBS_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getJobsCreated_JsonNullable() {
    return jobsCreated;
  }
  
  @JsonProperty(JSON_PROPERTY_JOBS_CREATED)
  public void setJobsCreated_JsonNullable(JsonNullable<Integer> jobsCreated) {
    this.jobsCreated = jobsCreated;
  }

  public void setJobsCreated(Integer jobsCreated) {
    this.jobsCreated = JsonNullable.<Integer>of(jobsCreated);
  }


  public BatchStatisticsDto batchJobsPerSeed(Integer batchJobsPerSeed) {
    this.batchJobsPerSeed = JsonNullable.<Integer>of(batchJobsPerSeed);
    
    return this;
  }

   /**
   * The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see &#x60;totalJobs&#x60; property).
   * @return batchJobsPerSeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see `totalJobs` property).")
  @JsonIgnore

  public Integer getBatchJobsPerSeed() {
        return batchJobsPerSeed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BATCH_JOBS_PER_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getBatchJobsPerSeed_JsonNullable() {
    return batchJobsPerSeed;
  }
  
  @JsonProperty(JSON_PROPERTY_BATCH_JOBS_PER_SEED)
  public void setBatchJobsPerSeed_JsonNullable(JsonNullable<Integer> batchJobsPerSeed) {
    this.batchJobsPerSeed = batchJobsPerSeed;
  }

  public void setBatchJobsPerSeed(Integer batchJobsPerSeed) {
    this.batchJobsPerSeed = JsonNullable.<Integer>of(batchJobsPerSeed);
  }


  public BatchStatisticsDto invocationsPerBatchJob(Integer invocationsPerBatchJob) {
    this.invocationsPerBatchJob = JsonNullable.<Integer>of(invocationsPerBatchJob);
    
    return this;
  }

   /**
   * Every batch execution job invokes the command executed by the batch &#x60;invocationsPerBatchJob&#x60; times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job.
   * @return invocationsPerBatchJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Every batch execution job invokes the command executed by the batch `invocationsPerBatchJob` times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job.")
  @JsonIgnore

  public Integer getInvocationsPerBatchJob() {
        return invocationsPerBatchJob.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getInvocationsPerBatchJob_JsonNullable() {
    return invocationsPerBatchJob;
  }
  
  @JsonProperty(JSON_PROPERTY_INVOCATIONS_PER_BATCH_JOB)
  public void setInvocationsPerBatchJob_JsonNullable(JsonNullable<Integer> invocationsPerBatchJob) {
    this.invocationsPerBatchJob = invocationsPerBatchJob;
  }

  public void setInvocationsPerBatchJob(Integer invocationsPerBatchJob) {
    this.invocationsPerBatchJob = JsonNullable.<Integer>of(invocationsPerBatchJob);
  }


  public BatchStatisticsDto seedJobDefinitionId(String seedJobDefinitionId) {
    this.seedJobDefinitionId = JsonNullable.<String>of(seedJobDefinitionId);
    
    return this;
  }

   /**
   * The job definition id for the seed jobs of this batch.
   * @return seedJobDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job definition id for the seed jobs of this batch.")
  @JsonIgnore

  public String getSeedJobDefinitionId() {
        return seedJobDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEED_JOB_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSeedJobDefinitionId_JsonNullable() {
    return seedJobDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SEED_JOB_DEFINITION_ID)
  public void setSeedJobDefinitionId_JsonNullable(JsonNullable<String> seedJobDefinitionId) {
    this.seedJobDefinitionId = seedJobDefinitionId;
  }

  public void setSeedJobDefinitionId(String seedJobDefinitionId) {
    this.seedJobDefinitionId = JsonNullable.<String>of(seedJobDefinitionId);
  }


  public BatchStatisticsDto monitorJobDefinitionId(String monitorJobDefinitionId) {
    this.monitorJobDefinitionId = JsonNullable.<String>of(monitorJobDefinitionId);
    
    return this;
  }

   /**
   * The job definition id for the monitor jobs of this batch.
   * @return monitorJobDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job definition id for the monitor jobs of this batch.")
  @JsonIgnore

  public String getMonitorJobDefinitionId() {
        return monitorJobDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMonitorJobDefinitionId_JsonNullable() {
    return monitorJobDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_MONITOR_JOB_DEFINITION_ID)
  public void setMonitorJobDefinitionId_JsonNullable(JsonNullable<String> monitorJobDefinitionId) {
    this.monitorJobDefinitionId = monitorJobDefinitionId;
  }

  public void setMonitorJobDefinitionId(String monitorJobDefinitionId) {
    this.monitorJobDefinitionId = JsonNullable.<String>of(monitorJobDefinitionId);
  }


  public BatchStatisticsDto batchJobDefinitionId(String batchJobDefinitionId) {
    this.batchJobDefinitionId = JsonNullable.<String>of(batchJobDefinitionId);
    
    return this;
  }

   /**
   * The job definition id for the batch execution jobs of this batch.
   * @return batchJobDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job definition id for the batch execution jobs of this batch.")
  @JsonIgnore

  public String getBatchJobDefinitionId() {
        return batchJobDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BATCH_JOB_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBatchJobDefinitionId_JsonNullable() {
    return batchJobDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_BATCH_JOB_DEFINITION_ID)
  public void setBatchJobDefinitionId_JsonNullable(JsonNullable<String> batchJobDefinitionId) {
    this.batchJobDefinitionId = batchJobDefinitionId;
  }

  public void setBatchJobDefinitionId(String batchJobDefinitionId) {
    this.batchJobDefinitionId = JsonNullable.<String>of(batchJobDefinitionId);
  }


  public BatchStatisticsDto suspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
    
    return this;
  }

   /**
   * Indicates whether this batch is suspended or not.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this batch is suspended or not.")
  @JsonIgnore

  public Boolean getSuspended() {
        return suspended.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSuspended_JsonNullable() {
    return suspended;
  }
  
  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  public void setSuspended_JsonNullable(JsonNullable<Boolean> suspended) {
    this.suspended = suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
  }


  public BatchStatisticsDto tenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
    
    return this;
  }

   /**
   * The tenant id of the batch.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the batch.")
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


  public BatchStatisticsDto createUserId(String createUserId) {
    this.createUserId = JsonNullable.<String>of(createUserId);
    
    return this;
  }

   /**
   * The id of the user that created the batch.
   * @return createUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user that created the batch.")
  @JsonIgnore

  public String getCreateUserId() {
        return createUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATE_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreateUserId_JsonNullable() {
    return createUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATE_USER_ID)
  public void setCreateUserId_JsonNullable(JsonNullable<String> createUserId) {
    this.createUserId = createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = JsonNullable.<String>of(createUserId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStatisticsDto batchStatisticsDto = (BatchStatisticsDto) o;
    return Objects.equals(this.remainingJobs, batchStatisticsDto.remainingJobs) &&
        Objects.equals(this.completedJobs, batchStatisticsDto.completedJobs) &&
        Objects.equals(this.failedJobs, batchStatisticsDto.failedJobs) &&
        Objects.equals(this.id, batchStatisticsDto.id) &&
        Objects.equals(this.type, batchStatisticsDto.type) &&
        Objects.equals(this.totalJobs, batchStatisticsDto.totalJobs) &&
        Objects.equals(this.jobsCreated, batchStatisticsDto.jobsCreated) &&
        Objects.equals(this.batchJobsPerSeed, batchStatisticsDto.batchJobsPerSeed) &&
        Objects.equals(this.invocationsPerBatchJob, batchStatisticsDto.invocationsPerBatchJob) &&
        Objects.equals(this.seedJobDefinitionId, batchStatisticsDto.seedJobDefinitionId) &&
        Objects.equals(this.monitorJobDefinitionId, batchStatisticsDto.monitorJobDefinitionId) &&
        Objects.equals(this.batchJobDefinitionId, batchStatisticsDto.batchJobDefinitionId) &&
        Objects.equals(this.suspended, batchStatisticsDto.suspended) &&
        Objects.equals(this.tenantId, batchStatisticsDto.tenantId) &&
        Objects.equals(this.createUserId, batchStatisticsDto.createUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainingJobs, completedJobs, failedJobs, id, type, totalJobs, jobsCreated, batchJobsPerSeed, invocationsPerBatchJob, seedJobDefinitionId, monitorJobDefinitionId, batchJobDefinitionId, suspended, tenantId, createUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStatisticsDto {\n");
    sb.append("    remainingJobs: ").append(toIndentedString(remainingJobs)).append("\n");
    sb.append("    completedJobs: ").append(toIndentedString(completedJobs)).append("\n");
    sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalJobs: ").append(toIndentedString(totalJobs)).append("\n");
    sb.append("    jobsCreated: ").append(toIndentedString(jobsCreated)).append("\n");
    sb.append("    batchJobsPerSeed: ").append(toIndentedString(batchJobsPerSeed)).append("\n");
    sb.append("    invocationsPerBatchJob: ").append(toIndentedString(invocationsPerBatchJob)).append("\n");
    sb.append("    seedJobDefinitionId: ").append(toIndentedString(seedJobDefinitionId)).append("\n");
    sb.append("    monitorJobDefinitionId: ").append(toIndentedString(monitorJobDefinitionId)).append("\n");
    sb.append("    batchJobDefinitionId: ").append(toIndentedString(batchJobDefinitionId)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
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

