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
 * JobDuedateDto
 */
@JsonPropertyOrder({
  JobDuedateDto.JSON_PROPERTY_DUEDATE,
  JobDuedateDto.JSON_PROPERTY_CASCADE
})
@JsonTypeName("JobDuedateDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class JobDuedateDto {
  public static final String JSON_PROPERTY_DUEDATE = "duedate";
  private JsonNullable<OffsetDateTime> duedate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CASCADE = "cascade";
  private JsonNullable<Boolean> cascade = JsonNullable.<Boolean>undefined();


  public JobDuedateDto duedate(OffsetDateTime duedate) {
    this.duedate = JsonNullable.<OffsetDateTime>of(duedate);
    
    return this;
  }

   /**
   * The date to set when the job has the next execution.
   * @return duedate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date to set when the job has the next execution.")
  @JsonIgnore

  public OffsetDateTime getDuedate() {
        return duedate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUEDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDuedate_JsonNullable() {
    return duedate;
  }
  
  @JsonProperty(JSON_PROPERTY_DUEDATE)
  public void setDuedate_JsonNullable(JsonNullable<OffsetDateTime> duedate) {
    this.duedate = duedate;
  }

  public void setDuedate(OffsetDateTime duedate) {
    this.duedate = JsonNullable.<OffsetDateTime>of(duedate);
  }


  public JobDuedateDto cascade(Boolean cascade) {
    this.cascade = JsonNullable.<Boolean>of(cascade);
    
    return this;
  }

   /**
   * A boolean value to indicate if modifications to the due date should cascade to subsequent jobs. (e.g. Modify the due date of a timer by +15 minutes. This flag indicates if a +15 minutes should be applied to all subsequent timers.) This flag only affects timer jobs and only works if due date is not null. Default: &#x60;false&#x60;
   * @return cascade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean value to indicate if modifications to the due date should cascade to subsequent jobs. (e.g. Modify the due date of a timer by +15 minutes. This flag indicates if a +15 minutes should be applied to all subsequent timers.) This flag only affects timer jobs and only works if due date is not null. Default: `false`")
  @JsonIgnore

  public Boolean getCascade() {
        return cascade.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASCADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCascade_JsonNullable() {
    return cascade;
  }
  
  @JsonProperty(JSON_PROPERTY_CASCADE)
  public void setCascade_JsonNullable(JsonNullable<Boolean> cascade) {
    this.cascade = cascade;
  }

  public void setCascade(Boolean cascade) {
    this.cascade = JsonNullable.<Boolean>of(cascade);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDuedateDto jobDuedateDto = (JobDuedateDto) o;
    return Objects.equals(this.duedate, jobDuedateDto.duedate) &&
        Objects.equals(this.cascade, jobDuedateDto.cascade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duedate, cascade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDuedateDto {\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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

