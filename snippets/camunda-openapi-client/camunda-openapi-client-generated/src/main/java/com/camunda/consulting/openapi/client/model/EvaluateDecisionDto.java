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
import com.camunda.consulting.openapi.client.model.VariableValueDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * EvaluateDecisionDto
 */
@JsonPropertyOrder({
  EvaluateDecisionDto.JSON_PROPERTY_VARIABLES
})
@JsonTypeName("EvaluateDecisionDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class EvaluateDecisionDto {
  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private JsonNullable<Map<String, VariableValueDto>> variables = JsonNullable.<Map<String, VariableValueDto>>undefined();


  public EvaluateDecisionDto variables(Map<String, VariableValueDto> variables) {
    this.variables = JsonNullable.<Map<String, VariableValueDto>>of(variables);
    
    return this;
  }

  public EvaluateDecisionDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null || !this.variables.isPresent()) {
      this.variables = JsonNullable.<Map<String, VariableValueDto>>of(new HashMap<>());
    }
    try {
      this.variables.get().put(key, variablesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, VariableValueDto> getVariables() {
        return variables.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, VariableValueDto>> getVariables_JsonNullable() {
    return variables;
  }
  
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  public void setVariables_JsonNullable(JsonNullable<Map<String, VariableValueDto>> variables) {
    this.variables = variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = JsonNullable.<Map<String, VariableValueDto>>of(variables);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateDecisionDto evaluateDecisionDto = (EvaluateDecisionDto) o;
    return Objects.equals(this.variables, evaluateDecisionDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateDecisionDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

