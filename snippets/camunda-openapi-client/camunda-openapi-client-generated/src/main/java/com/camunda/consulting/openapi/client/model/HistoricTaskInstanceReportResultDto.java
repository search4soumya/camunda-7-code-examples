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
 * HistoricTaskInstanceReportResultDto
 */
@JsonPropertyOrder({
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_TASK_NAME,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_COUNT,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_PROCESS_DEFINITION_NAME,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_PERIOD,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_PERIOD_UNIT,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_MINIMUM,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_MAXIMUM,
  HistoricTaskInstanceReportResultDto.JSON_PROPERTY_AVERAGE
})
@JsonTypeName("HistoricTaskInstanceReportResultDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class HistoricTaskInstanceReportResultDto {
  public static final String JSON_PROPERTY_TASK_NAME = "taskName";
  private JsonNullable<String> taskName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNT = "count";
  private JsonNullable<Long> count = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  private JsonNullable<String> processDefinitionKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private JsonNullable<String> processDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_NAME = "processDefinitionName";
  private JsonNullable<String> processDefinitionName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIOD = "period";
  private JsonNullable<Integer> period = JsonNullable.<Integer>undefined();

  /**
   * The unit of the given period. Possible values are &#x60;MONTH&#x60; and &#x60;QUARTER&#x60;.  **Note:** This property is only set for a duration report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;duration&#x60;.
   */
  public enum PeriodUnitEnum {
    MONTH("MONTH"),
    
    QUARTER("QUARTER");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodUnitEnum fromValue(String value) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_PERIOD_UNIT = "periodUnit";
  private JsonNullable<PeriodUnitEnum> periodUnit = JsonNullable.<PeriodUnitEnum>undefined();

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private JsonNullable<Long> minimum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private JsonNullable<Long> maximum = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AVERAGE = "average";
  private JsonNullable<Long> average = JsonNullable.<Long>undefined();


  public HistoricTaskInstanceReportResultDto taskName(String taskName) {
    this.taskName = JsonNullable.<String>of(taskName);
    
    return this;
  }

   /**
   * The name of the task. It is only available when the &#x60;groupBy&#x60; parameter is set to &#x60;taskName&#x60;. Else the value is &#x60;null&#x60;.  **Note:** This property is only set for a historic task report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;count&#x60;.
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the task. It is only available when the `groupBy` parameter is set to `taskName`. Else the value is `null`.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.")
  @JsonIgnore

  public String getTaskName() {
        return taskName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaskName_JsonNullable() {
    return taskName;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  public void setTaskName_JsonNullable(JsonNullable<String> taskName) {
    this.taskName = taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = JsonNullable.<String>of(taskName);
  }


  public HistoricTaskInstanceReportResultDto count(Long count) {
    this.count = JsonNullable.<Long>of(count);
    
    return this;
  }

   /**
   * The number of tasks which have the given definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;count&#x60;.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of tasks which have the given definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.")
  @JsonIgnore

  public Long getCount() {
        return count.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getCount_JsonNullable() {
    return count;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT)
  public void setCount_JsonNullable(JsonNullable<Long> count) {
    this.count = count;
  }

  public void setCount(Long count) {
    this.count = JsonNullable.<Long>of(count);
  }


  public HistoricTaskInstanceReportResultDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = JsonNullable.<String>of(processDefinitionKey);
    
    return this;
  }

   /**
   * The key of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;count&#x60;.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.")
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


  public HistoricTaskInstanceReportResultDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = JsonNullable.<String>of(processDefinitionId);
    
    return this;
  }

   /**
   * The id of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;count&#x60;.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.")
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


  public HistoricTaskInstanceReportResultDto processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = JsonNullable.<String>of(processDefinitionName);
    
    return this;
  }

   /**
   * The name of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;count&#x60;.
   * @return processDefinitionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.")
  @JsonIgnore

  public String getProcessDefinitionName() {
        return processDefinitionName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProcessDefinitionName_JsonNullable() {
    return processDefinitionName;
  }
  
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_NAME)
  public void setProcessDefinitionName_JsonNullable(JsonNullable<String> processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = JsonNullable.<String>of(processDefinitionName);
  }


  public HistoricTaskInstanceReportResultDto period(Integer period) {
    this.period = JsonNullable.<Integer>of(period);
    
    return this;
  }

   /**
   * Specifies a span of time within a year. **Note:** The period must be interpreted in conjunction with the returned &#x60;periodUnit&#x60;.  **Note:** This property is only set for a duration report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;duration&#x60;.
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a span of time within a year. **Note:** The period must be interpreted in conjunction with the returned `periodUnit`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.")
  @JsonIgnore

  public Integer getPeriod() {
        return period.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPeriod_JsonNullable() {
    return period;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIOD)
  public void setPeriod_JsonNullable(JsonNullable<Integer> period) {
    this.period = period;
  }

  public void setPeriod(Integer period) {
    this.period = JsonNullable.<Integer>of(period);
  }


  public HistoricTaskInstanceReportResultDto periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = JsonNullable.<PeriodUnitEnum>of(periodUnit);
    
    return this;
  }

   /**
   * The unit of the given period. Possible values are &#x60;MONTH&#x60; and &#x60;QUARTER&#x60;.  **Note:** This property is only set for a duration report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;duration&#x60;.
   * @return periodUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit of the given period. Possible values are `MONTH` and `QUARTER`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.")
  @JsonIgnore

  public PeriodUnitEnum getPeriodUnit() {
        return periodUnit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PeriodUnitEnum> getPeriodUnit_JsonNullable() {
    return periodUnit;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  public void setPeriodUnit_JsonNullable(JsonNullable<PeriodUnitEnum> periodUnit) {
    this.periodUnit = periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = JsonNullable.<PeriodUnitEnum>of(periodUnit);
  }


  public HistoricTaskInstanceReportResultDto minimum(Long minimum) {
    this.minimum = JsonNullable.<Long>of(minimum);
    
    return this;
  }

   /**
   * The smallest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;duration&#x60;.
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The smallest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.")
  @JsonIgnore

  public Long getMinimum() {
        return minimum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getMinimum_JsonNullable() {
    return minimum;
  }
  
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  public void setMinimum_JsonNullable(JsonNullable<Long> minimum) {
    this.minimum = minimum;
  }

  public void setMinimum(Long minimum) {
    this.minimum = JsonNullable.<Long>of(minimum);
  }


  public HistoricTaskInstanceReportResultDto maximum(Long maximum) {
    this.maximum = JsonNullable.<Long>of(maximum);
    
    return this;
  }

   /**
   * The greatest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;duration&#x60;.
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The greatest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.")
  @JsonIgnore

  public Long getMaximum() {
        return maximum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getMaximum_JsonNullable() {
    return maximum;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  public void setMaximum_JsonNullable(JsonNullable<Long> maximum) {
    this.maximum = maximum;
  }

  public void setMaximum(Long maximum) {
    this.maximum = JsonNullable.<Long>of(maximum);
  }


  public HistoricTaskInstanceReportResultDto average(Long average) {
    this.average = JsonNullable.<Long>of(average);
    
    return this;
  }

   /**
   * The average duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the &#x60;reportType&#x60; query parameter is &#x60;duration&#x60;.
   * @return average
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.")
  @JsonIgnore

  public Long getAverage() {
        return average.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getAverage_JsonNullable() {
    return average;
  }
  
  @JsonProperty(JSON_PROPERTY_AVERAGE)
  public void setAverage_JsonNullable(JsonNullable<Long> average) {
    this.average = average;
  }

  public void setAverage(Long average) {
    this.average = JsonNullable.<Long>of(average);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricTaskInstanceReportResultDto historicTaskInstanceReportResultDto = (HistoricTaskInstanceReportResultDto) o;
    return Objects.equals(this.taskName, historicTaskInstanceReportResultDto.taskName) &&
        Objects.equals(this.count, historicTaskInstanceReportResultDto.count) &&
        Objects.equals(this.processDefinitionKey, historicTaskInstanceReportResultDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicTaskInstanceReportResultDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionName, historicTaskInstanceReportResultDto.processDefinitionName) &&
        Objects.equals(this.period, historicTaskInstanceReportResultDto.period) &&
        Objects.equals(this.periodUnit, historicTaskInstanceReportResultDto.periodUnit) &&
        Objects.equals(this.minimum, historicTaskInstanceReportResultDto.minimum) &&
        Objects.equals(this.maximum, historicTaskInstanceReportResultDto.maximum) &&
        Objects.equals(this.average, historicTaskInstanceReportResultDto.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, count, processDefinitionKey, processDefinitionId, processDefinitionName, period, periodUnit, minimum, maximum, average);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricTaskInstanceReportResultDto {\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

