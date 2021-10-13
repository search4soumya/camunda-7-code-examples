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
import com.camunda.consulting.openapi.client.model.CalledProcessDefinitionDtoAllOf;
import com.camunda.consulting.openapi.client.model.ProcessDefinitionDto;
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
 * CalledProcessDefinitionDto
 */
@JsonPropertyOrder({
  CalledProcessDefinitionDto.JSON_PROPERTY_CALLED_FROM_ACTIVITY_IDS,
  CalledProcessDefinitionDto.JSON_PROPERTY_CALLING_PROCESS_DEFINITION_ID,
  CalledProcessDefinitionDto.JSON_PROPERTY_ID,
  CalledProcessDefinitionDto.JSON_PROPERTY_KEY,
  CalledProcessDefinitionDto.JSON_PROPERTY_CATEGORY,
  CalledProcessDefinitionDto.JSON_PROPERTY_DESCRIPTION,
  CalledProcessDefinitionDto.JSON_PROPERTY_NAME,
  CalledProcessDefinitionDto.JSON_PROPERTY_VERSION,
  CalledProcessDefinitionDto.JSON_PROPERTY_RESOURCE,
  CalledProcessDefinitionDto.JSON_PROPERTY_DEPLOYMENT_ID,
  CalledProcessDefinitionDto.JSON_PROPERTY_DIAGRAM,
  CalledProcessDefinitionDto.JSON_PROPERTY_SUSPENDED,
  CalledProcessDefinitionDto.JSON_PROPERTY_TENANT_ID,
  CalledProcessDefinitionDto.JSON_PROPERTY_VERSION_TAG,
  CalledProcessDefinitionDto.JSON_PROPERTY_HISTORY_TIME_TO_LIVE,
  CalledProcessDefinitionDto.JSON_PROPERTY_STARTABLE_IN_TASKLIST
})
@JsonTypeName("CalledProcessDefinitionDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class CalledProcessDefinitionDto {
  public static final String JSON_PROPERTY_CALLED_FROM_ACTIVITY_IDS = "calledFromActivityIds";
  private JsonNullable<List<String>> calledFromActivityIds = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CALLING_PROCESS_DEFINITION_ID = "callingProcessDefinitionId";
  private JsonNullable<String> callingProcessDefinitionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<Integer> version = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private JsonNullable<String> resource = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
  private JsonNullable<String> deploymentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DIAGRAM = "diagram";
  private JsonNullable<String> diagram = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUSPENDED = "suspended";
  private JsonNullable<Boolean> suspended = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private JsonNullable<String> tenantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION_TAG = "versionTag";
  private JsonNullable<String> versionTag = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
  private JsonNullable<Integer> historyTimeToLive = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_STARTABLE_IN_TASKLIST = "startableInTasklist";
  private JsonNullable<Boolean> startableInTasklist = JsonNullable.<Boolean>undefined();


  public CalledProcessDefinitionDto calledFromActivityIds(List<String> calledFromActivityIds) {
    this.calledFromActivityIds = JsonNullable.<List<String>>of(calledFromActivityIds);
    
    return this;
  }

  public CalledProcessDefinitionDto addCalledFromActivityIdsItem(String calledFromActivityIdsItem) {
    if (this.calledFromActivityIds == null || !this.calledFromActivityIds.isPresent()) {
      this.calledFromActivityIds = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.calledFromActivityIds.get().add(calledFromActivityIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Ids of the CallActivities which call this process.
   * @return calledFromActivityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ids of the CallActivities which call this process.")
  @JsonIgnore

  public List<String> getCalledFromActivityIds() {
        return calledFromActivityIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLED_FROM_ACTIVITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getCalledFromActivityIds_JsonNullable() {
    return calledFromActivityIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLED_FROM_ACTIVITY_IDS)
  public void setCalledFromActivityIds_JsonNullable(JsonNullable<List<String>> calledFromActivityIds) {
    this.calledFromActivityIds = calledFromActivityIds;
  }

  public void setCalledFromActivityIds(List<String> calledFromActivityIds) {
    this.calledFromActivityIds = JsonNullable.<List<String>>of(calledFromActivityIds);
  }


  public CalledProcessDefinitionDto callingProcessDefinitionId(String callingProcessDefinitionId) {
    this.callingProcessDefinitionId = JsonNullable.<String>of(callingProcessDefinitionId);
    
    return this;
  }

   /**
   * The id of the calling process definition
   * @return callingProcessDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the calling process definition")
  @JsonIgnore

  public String getCallingProcessDefinitionId() {
        return callingProcessDefinitionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLING_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCallingProcessDefinitionId_JsonNullable() {
    return callingProcessDefinitionId;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLING_PROCESS_DEFINITION_ID)
  public void setCallingProcessDefinitionId_JsonNullable(JsonNullable<String> callingProcessDefinitionId) {
    this.callingProcessDefinitionId = callingProcessDefinitionId;
  }

  public void setCallingProcessDefinitionId(String callingProcessDefinitionId) {
    this.callingProcessDefinitionId = JsonNullable.<String>of(callingProcessDefinitionId);
  }


  public CalledProcessDefinitionDto id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * The id of the process definition
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition")
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


  public CalledProcessDefinitionDto key(String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

   /**
   * The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.")
  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(String key) {
    this.key = JsonNullable.<String>of(key);
  }


  public CalledProcessDefinitionDto category(String category) {
    this.category = JsonNullable.<String>of(category);
    
    return this;
  }

   /**
   * The category of the process definition.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the process definition.")
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  public CalledProcessDefinitionDto description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * The description of the process definition.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the process definition.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public CalledProcessDefinitionDto name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The name of the process definition.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the process definition.")
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


  public CalledProcessDefinitionDto version(Integer version) {
    this.version = JsonNullable.<Integer>of(version);
    
    return this;
  }

   /**
   * The version of the process definition that the engine assigned to it.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the process definition that the engine assigned to it.")
  @JsonIgnore

  public Integer getVersion() {
        return version.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getVersion_JsonNullable() {
    return version;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<Integer> version) {
    this.version = version;
  }

  public void setVersion(Integer version) {
    this.version = JsonNullable.<Integer>of(version);
  }


  public CalledProcessDefinitionDto resource(String resource) {
    this.resource = JsonNullable.<String>of(resource);
    
    return this;
  }

   /**
   * The file name of the process definition.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the process definition.")
  @JsonIgnore

  public String getResource() {
        return resource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getResource_JsonNullable() {
    return resource;
  }
  
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  public void setResource_JsonNullable(JsonNullable<String> resource) {
    this.resource = resource;
  }

  public void setResource(String resource) {
    this.resource = JsonNullable.<String>of(resource);
  }


  public CalledProcessDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = JsonNullable.<String>of(deploymentId);
    
    return this;
  }

   /**
   * The deployment id of the process definition.
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The deployment id of the process definition.")
  @JsonIgnore

  public String getDeploymentId() {
        return deploymentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDeploymentId_JsonNullable() {
    return deploymentId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  public void setDeploymentId_JsonNullable(JsonNullable<String> deploymentId) {
    this.deploymentId = deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = JsonNullable.<String>of(deploymentId);
  }


  public CalledProcessDefinitionDto diagram(String diagram) {
    this.diagram = JsonNullable.<String>of(diagram);
    
    return this;
  }

   /**
   * The file name of the process definition diagram, if it exists.
   * @return diagram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the process definition diagram, if it exists.")
  @JsonIgnore

  public String getDiagram() {
        return diagram.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIAGRAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDiagram_JsonNullable() {
    return diagram;
  }
  
  @JsonProperty(JSON_PROPERTY_DIAGRAM)
  public void setDiagram_JsonNullable(JsonNullable<String> diagram) {
    this.diagram = diagram;
  }

  public void setDiagram(String diagram) {
    this.diagram = JsonNullable.<String>of(diagram);
  }


  public CalledProcessDefinitionDto suspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
    
    return this;
  }

   /**
   * A flag indicating whether the definition is suspended or not.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the definition is suspended or not.")
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


  public CalledProcessDefinitionDto tenantId(String tenantId) {
    this.tenantId = JsonNullable.<String>of(tenantId);
    
    return this;
  }

   /**
   * The tenant id of the process definition.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the process definition.")
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


  public CalledProcessDefinitionDto versionTag(String versionTag) {
    this.versionTag = JsonNullable.<String>of(versionTag);
    
    return this;
  }

   /**
   * The version tag of the process definition.
   * @return versionTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version tag of the process definition.")
  @JsonIgnore

  public String getVersionTag() {
        return versionTag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVersionTag_JsonNullable() {
    return versionTag;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION_TAG)
  public void setVersionTag_JsonNullable(JsonNullable<String> versionTag) {
    this.versionTag = versionTag;
  }

  public void setVersionTag(String versionTag) {
    this.versionTag = JsonNullable.<String>of(versionTag);
  }


  public CalledProcessDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = JsonNullable.<Integer>of(historyTimeToLive);
    
    return this;
  }

   /**
   * History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#history-cleanup).")
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


  public CalledProcessDefinitionDto startableInTasklist(Boolean startableInTasklist) {
    this.startableInTasklist = JsonNullable.<Boolean>of(startableInTasklist);
    
    return this;
  }

   /**
   * A flag indicating whether the process definition is startable in Tasklist or not.
   * @return startableInTasklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the process definition is startable in Tasklist or not.")
  @JsonIgnore

  public Boolean getStartableInTasklist() {
        return startableInTasklist.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTABLE_IN_TASKLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getStartableInTasklist_JsonNullable() {
    return startableInTasklist;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTABLE_IN_TASKLIST)
  public void setStartableInTasklist_JsonNullable(JsonNullable<Boolean> startableInTasklist) {
    this.startableInTasklist = startableInTasklist;
  }

  public void setStartableInTasklist(Boolean startableInTasklist) {
    this.startableInTasklist = JsonNullable.<Boolean>of(startableInTasklist);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalledProcessDefinitionDto calledProcessDefinitionDto = (CalledProcessDefinitionDto) o;
    return Objects.equals(this.calledFromActivityIds, calledProcessDefinitionDto.calledFromActivityIds) &&
        Objects.equals(this.callingProcessDefinitionId, calledProcessDefinitionDto.callingProcessDefinitionId) &&
        Objects.equals(this.id, calledProcessDefinitionDto.id) &&
        Objects.equals(this.key, calledProcessDefinitionDto.key) &&
        Objects.equals(this.category, calledProcessDefinitionDto.category) &&
        Objects.equals(this.description, calledProcessDefinitionDto.description) &&
        Objects.equals(this.name, calledProcessDefinitionDto.name) &&
        Objects.equals(this.version, calledProcessDefinitionDto.version) &&
        Objects.equals(this.resource, calledProcessDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, calledProcessDefinitionDto.deploymentId) &&
        Objects.equals(this.diagram, calledProcessDefinitionDto.diagram) &&
        Objects.equals(this.suspended, calledProcessDefinitionDto.suspended) &&
        Objects.equals(this.tenantId, calledProcessDefinitionDto.tenantId) &&
        Objects.equals(this.versionTag, calledProcessDefinitionDto.versionTag) &&
        Objects.equals(this.historyTimeToLive, calledProcessDefinitionDto.historyTimeToLive) &&
        Objects.equals(this.startableInTasklist, calledProcessDefinitionDto.startableInTasklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calledFromActivityIds, callingProcessDefinitionId, id, key, category, description, name, version, resource, deploymentId, diagram, suspended, tenantId, versionTag, historyTimeToLive, startableInTasklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalledProcessDefinitionDto {\n");
    sb.append("    calledFromActivityIds: ").append(toIndentedString(calledFromActivityIds)).append("\n");
    sb.append("    callingProcessDefinitionId: ").append(toIndentedString(callingProcessDefinitionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    startableInTasklist: ").append(toIndentedString(startableInTasklist)).append("\n");
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

