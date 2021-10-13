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
 * DeploymentDtoAllOf
 */
@JsonPropertyOrder({
  DeploymentDtoAllOf.JSON_PROPERTY_ID,
  DeploymentDtoAllOf.JSON_PROPERTY_TENANT_ID,
  DeploymentDtoAllOf.JSON_PROPERTY_DEPLOYMENT_TIME,
  DeploymentDtoAllOf.JSON_PROPERTY_SOURCE,
  DeploymentDtoAllOf.JSON_PROPERTY_NAME
})
@JsonTypeName("DeploymentDto_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class DeploymentDtoAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private JsonNullable<String> tenantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPLOYMENT_TIME = "deploymentTime";
  private JsonNullable<OffsetDateTime> deploymentTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();


  public DeploymentDtoAllOf id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * The id of the deployment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deployment.")
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


  public DeploymentDtoAllOf tenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
    
    return this;
  }

   /**
   * The tenant id of the deployment.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the deployment.")
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


  public DeploymentDtoAllOf deploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = JsonNullable.<OffsetDateTime>of(deploymentTime);
    
    return this;
  }

   /**
   * The time when the deployment was created.
   * @return deploymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the deployment was created.")
  @JsonIgnore

  public OffsetDateTime getDeploymentTime() {
        return deploymentTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDeploymentTime_JsonNullable() {
    return deploymentTime;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TIME)
  public void setDeploymentTime_JsonNullable(JsonNullable<OffsetDateTime> deploymentTime) {
    this.deploymentTime = deploymentTime;
  }

  public void setDeploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = JsonNullable.<OffsetDateTime>of(deploymentTime);
  }


  public DeploymentDtoAllOf source(String source) {
    this.source = JsonNullable.<String>of(source);
    
    return this;
  }

   /**
   * The source of the deployment.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the deployment.")
  @JsonIgnore

  public String getSource() {
        return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSource_JsonNullable() {
    return source;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<String> source) {
    this.source = source;
  }

  public void setSource(String source) {
    this.source = JsonNullable.<String>of(source);
  }


  public DeploymentDtoAllOf name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The name of the deployment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the deployment.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentDtoAllOf deploymentDtoAllOf = (DeploymentDtoAllOf) o;
    return Objects.equals(this.id, deploymentDtoAllOf.id) &&
        Objects.equals(this.tenantId, deploymentDtoAllOf.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentDtoAllOf.deploymentTime) &&
        Objects.equals(this.source, deploymentDtoAllOf.source) &&
        Objects.equals(this.name, deploymentDtoAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, deploymentTime, source, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

