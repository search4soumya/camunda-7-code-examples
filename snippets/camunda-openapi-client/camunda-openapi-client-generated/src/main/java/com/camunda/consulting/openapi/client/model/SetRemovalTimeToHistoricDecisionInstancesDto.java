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
import com.camunda.consulting.openapi.client.model.AbstractSetRemovalTimeDto;
import com.camunda.consulting.openapi.client.model.HistoricDecisionInstanceQueryDto;
import com.camunda.consulting.openapi.client.model.SetRemovalTimeToHistoricDecisionInstancesDtoAllOf;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SetRemovalTimeToHistoricDecisionInstancesDto
 */
@JsonPropertyOrder({
  SetRemovalTimeToHistoricDecisionInstancesDto.JSON_PROPERTY_HIERARCHICAL,
  SetRemovalTimeToHistoricDecisionInstancesDto.JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY,
  SetRemovalTimeToHistoricDecisionInstancesDto.JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS,
  SetRemovalTimeToHistoricDecisionInstancesDto.JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME,
  SetRemovalTimeToHistoricDecisionInstancesDto.JSON_PROPERTY_CLEARED_REMOVAL_TIME,
  SetRemovalTimeToHistoricDecisionInstancesDto.JSON_PROPERTY_CALCULATED_REMOVAL_TIME
})
@JsonTypeName("SetRemovalTimeToHistoricDecisionInstancesDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class SetRemovalTimeToHistoricDecisionInstancesDto {
  public static final String JSON_PROPERTY_HIERARCHICAL = "hierarchical";
  private JsonNullable<Boolean> hierarchical = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY = "historicDecisionInstanceQuery";
  private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

  public static final String JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS = "historicDecisionInstanceIds";
  private JsonNullable<List<String>> historicDecisionInstanceIds = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME = "absoluteRemovalTime";
  private JsonNullable<OffsetDateTime> absoluteRemovalTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CLEARED_REMOVAL_TIME = "clearedRemovalTime";
  private JsonNullable<Boolean> clearedRemovalTime = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CALCULATED_REMOVAL_TIME = "calculatedRemovalTime";
  private JsonNullable<Boolean> calculatedRemovalTime = JsonNullable.<Boolean>undefined();


  public SetRemovalTimeToHistoricDecisionInstancesDto hierarchical(Boolean hierarchical) {
    this.hierarchical = JsonNullable.<Boolean>of(hierarchical);
    
    return this;
  }

   /**
   * Sets the removal time to all historic decision instances in the hierarchy. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return hierarchical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the removal time to all historic decision instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.")
  @JsonIgnore

  public Boolean getHierarchical() {
        return hierarchical.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIERARCHICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getHierarchical_JsonNullable() {
    return hierarchical;
  }
  
  @JsonProperty(JSON_PROPERTY_HIERARCHICAL)
  public void setHierarchical_JsonNullable(JsonNullable<Boolean> hierarchical) {
    this.hierarchical = hierarchical;
  }

  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = JsonNullable.<Boolean>of(hierarchical);
  }


  public SetRemovalTimeToHistoricDecisionInstancesDto historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
    
    this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
    return this;
  }

   /**
   * Get historicDecisionInstanceQuery
   * @return historicDecisionInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoricDecisionInstanceQueryDto getHistoricDecisionInstanceQuery() {
    return historicDecisionInstanceQuery;
  }


  public void setHistoricDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
    this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
  }


  public SetRemovalTimeToHistoricDecisionInstancesDto historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = JsonNullable.<List<String>>of(historicDecisionInstanceIds);
    
    return this;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDto addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
    if (this.historicDecisionInstanceIds == null || !this.historicDecisionInstanceIds.isPresent()) {
      this.historicDecisionInstanceIds = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.historicDecisionInstanceIds.get().add(historicDecisionInstanceIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The ids of the historic decision instances to set the removal time for.
   * @return historicDecisionInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the historic decision instances to set the removal time for.")
  @JsonIgnore

  public List<String> getHistoricDecisionInstanceIds() {
        return historicDecisionInstanceIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getHistoricDecisionInstanceIds_JsonNullable() {
    return historicDecisionInstanceIds;
  }
  
  @JsonProperty(JSON_PROPERTY_HISTORIC_DECISION_INSTANCE_IDS)
  public void setHistoricDecisionInstanceIds_JsonNullable(JsonNullable<List<String>> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
  }

  public void setHistoricDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = JsonNullable.<List<String>>of(historicDecisionInstanceIds);
  }


  public SetRemovalTimeToHistoricDecisionInstancesDto absoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
    this.absoluteRemovalTime = JsonNullable.<OffsetDateTime>of(absoluteRemovalTime);
    
    return this;
  }

   /**
   * The date for which the instances shall be removed. Value may not be &#x60;null&#x60;.  **Note:** Cannot be set in conjunction with &#x60;clearedRemovalTime&#x60; or &#x60;calculatedRemovalTime&#x60;.
   * @return absoluteRemovalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date for which the instances shall be removed. Value may not be `null`.  **Note:** Cannot be set in conjunction with `clearedRemovalTime` or `calculatedRemovalTime`.")
  @JsonIgnore

  public OffsetDateTime getAbsoluteRemovalTime() {
        return absoluteRemovalTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getAbsoluteRemovalTime_JsonNullable() {
    return absoluteRemovalTime;
  }
  
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_REMOVAL_TIME)
  public void setAbsoluteRemovalTime_JsonNullable(JsonNullable<OffsetDateTime> absoluteRemovalTime) {
    this.absoluteRemovalTime = absoluteRemovalTime;
  }

  public void setAbsoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
    this.absoluteRemovalTime = JsonNullable.<OffsetDateTime>of(absoluteRemovalTime);
  }


  public SetRemovalTimeToHistoricDecisionInstancesDto clearedRemovalTime(Boolean clearedRemovalTime) {
    this.clearedRemovalTime = JsonNullable.<Boolean>of(clearedRemovalTime);
    
    return this;
  }

   /**
   * Sets the removal time to &#x60;null&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  **Note:** Cannot be set in conjunction with &#x60;absoluteRemovalTime&#x60; or &#x60;calculatedRemovalTime&#x60;.
   * @return clearedRemovalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the removal time to `null`. Value may only be `true`, as `false` is the default behavior.  **Note:** Cannot be set in conjunction with `absoluteRemovalTime` or `calculatedRemovalTime`.")
  @JsonIgnore

  public Boolean getClearedRemovalTime() {
        return clearedRemovalTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLEARED_REMOVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getClearedRemovalTime_JsonNullable() {
    return clearedRemovalTime;
  }
  
  @JsonProperty(JSON_PROPERTY_CLEARED_REMOVAL_TIME)
  public void setClearedRemovalTime_JsonNullable(JsonNullable<Boolean> clearedRemovalTime) {
    this.clearedRemovalTime = clearedRemovalTime;
  }

  public void setClearedRemovalTime(Boolean clearedRemovalTime) {
    this.clearedRemovalTime = JsonNullable.<Boolean>of(clearedRemovalTime);
  }


  public SetRemovalTimeToHistoricDecisionInstancesDto calculatedRemovalTime(Boolean calculatedRemovalTime) {
    this.calculatedRemovalTime = JsonNullable.<Boolean>of(calculatedRemovalTime);
    
    return this;
  }

   /**
   * The removal time is calculated based on the engine&#39;s configuration settings. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  **Note:** Cannot be set in conjunction with &#x60;absoluteRemovalTime&#x60; or &#x60;clearedRemovalTime&#x60;.
   * @return calculatedRemovalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The removal time is calculated based on the engine's configuration settings. Value may only be `true`, as `false` is the default behavior.  **Note:** Cannot be set in conjunction with `absoluteRemovalTime` or `clearedRemovalTime`.")
  @JsonIgnore

  public Boolean getCalculatedRemovalTime() {
        return calculatedRemovalTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALCULATED_REMOVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCalculatedRemovalTime_JsonNullable() {
    return calculatedRemovalTime;
  }
  
  @JsonProperty(JSON_PROPERTY_CALCULATED_REMOVAL_TIME)
  public void setCalculatedRemovalTime_JsonNullable(JsonNullable<Boolean> calculatedRemovalTime) {
    this.calculatedRemovalTime = calculatedRemovalTime;
  }

  public void setCalculatedRemovalTime(Boolean calculatedRemovalTime) {
    this.calculatedRemovalTime = JsonNullable.<Boolean>of(calculatedRemovalTime);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricDecisionInstancesDto setRemovalTimeToHistoricDecisionInstancesDto = (SetRemovalTimeToHistoricDecisionInstancesDto) o;
    return Objects.equals(this.hierarchical, setRemovalTimeToHistoricDecisionInstancesDto.hierarchical) &&
        Objects.equals(this.historicDecisionInstanceQuery, setRemovalTimeToHistoricDecisionInstancesDto.historicDecisionInstanceQuery) &&
        Objects.equals(this.historicDecisionInstanceIds, setRemovalTimeToHistoricDecisionInstancesDto.historicDecisionInstanceIds) &&
        Objects.equals(this.absoluteRemovalTime, setRemovalTimeToHistoricDecisionInstancesDto.absoluteRemovalTime) &&
        Objects.equals(this.clearedRemovalTime, setRemovalTimeToHistoricDecisionInstancesDto.clearedRemovalTime) &&
        Objects.equals(this.calculatedRemovalTime, setRemovalTimeToHistoricDecisionInstancesDto.calculatedRemovalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchical, historicDecisionInstanceQuery, historicDecisionInstanceIds, absoluteRemovalTime, clearedRemovalTime, calculatedRemovalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricDecisionInstancesDto {\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
    sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
    sb.append("    absoluteRemovalTime: ").append(toIndentedString(absoluteRemovalTime)).append("\n");
    sb.append("    clearedRemovalTime: ").append(toIndentedString(clearedRemovalTime)).append("\n");
    sb.append("    calculatedRemovalTime: ").append(toIndentedString(calculatedRemovalTime)).append("\n");
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

