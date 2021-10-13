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
 * HistoricJobLogQueryDtoSorting
 */
@JsonPropertyOrder({
  HistoricJobLogQueryDtoSorting.JSON_PROPERTY_SORT_BY,
  HistoricJobLogQueryDtoSorting.JSON_PROPERTY_SORT_ORDER
})
@JsonTypeName("HistoricJobLogQueryDto_sorting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class HistoricJobLogQueryDtoSorting {
  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   */
  public enum SortByEnum {
    TIMESTAMP("timestamp"),
    
    JOBID("jobId"),
    
    JOBDEFINITIONID("jobDefinitionId"),
    
    JOBDUEDATE("jobDueDate"),
    
    JOBRETRIES("jobRetries"),
    
    JOBPRIORITY("jobPriority"),
    
    ACTIVITYID("activityId"),
    
    EXECUTIONID("executionId"),
    
    PROCESSINSTANCEID("processInstanceId"),
    
    PROCESSDEFINITIONID("processDefinitionId"),
    
    PROCESSDEFINITIONKEY("processDefinitionKey"),
    
    DEPLOYMENTID("deploymentId"),
    
    HOSTNAME("hostname"),
    
    OCCURRENCE("occurrence"),
    
    TENANTID("tenantId");

    private String value;

    SortByEnum(String value) {
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
    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private JsonNullable<SortByEnum> sortBy = JsonNullable.<SortByEnum>undefined();

  /**
   * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
   */
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
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
    public static SortOrderEnum fromValue(String value) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private JsonNullable<SortOrderEnum> sortOrder = JsonNullable.<SortOrderEnum>undefined();


  public HistoricJobLogQueryDtoSorting sortBy(SortByEnum sortBy) {
    this.sortBy = JsonNullable.<SortByEnum>of(sortBy);
    
    return this;
  }

   /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.")
  @JsonIgnore

  public SortByEnum getSortBy() {
        return sortBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SortByEnum> getSortBy_JsonNullable() {
    return sortBy;
  }
  
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  public void setSortBy_JsonNullable(JsonNullable<SortByEnum> sortBy) {
    this.sortBy = sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = JsonNullable.<SortByEnum>of(sortBy);
  }


  public HistoricJobLogQueryDtoSorting sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = JsonNullable.<SortOrderEnum>of(sortOrder);
    
    return this;
  }

   /**
   * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.")
  @JsonIgnore

  public SortOrderEnum getSortOrder() {
        return sortOrder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SortOrderEnum> getSortOrder_JsonNullable() {
    return sortOrder;
  }
  
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  public void setSortOrder_JsonNullable(JsonNullable<SortOrderEnum> sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = JsonNullable.<SortOrderEnum>of(sortOrder);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricJobLogQueryDtoSorting historicJobLogQueryDtoSorting = (HistoricJobLogQueryDtoSorting) o;
    return Objects.equals(this.sortBy, historicJobLogQueryDtoSorting.sortBy) &&
        Objects.equals(this.sortOrder, historicJobLogQueryDtoSorting.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricJobLogQueryDtoSorting {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

