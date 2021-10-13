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
import com.camunda.consulting.openapi.client.model.AtomLink;
import com.camunda.consulting.openapi.client.model.LinkableDto;
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
 * ResourceOptionsDto
 */
@JsonPropertyOrder({
  ResourceOptionsDto.JSON_PROPERTY_LINKS
})
@JsonTypeName("ResourceOptionsDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T16:56:52.297572+02:00[Europe/Berlin]")
public class ResourceOptionsDto {
  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<List<AtomLink>> links = JsonNullable.<List<AtomLink>>undefined();


  public ResourceOptionsDto links(List<AtomLink> links) {
    this.links = JsonNullable.<List<AtomLink>>of(links);
    
    return this;
  }

  public ResourceOptionsDto addLinksItem(AtomLink linksItem) {
    if (this.links == null || !this.links.isPresent()) {
      this.links = JsonNullable.<List<AtomLink>>of(new ArrayList<>());
    }
    try {
      this.links.get().add(linksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The links associated to this resource, with &#x60;method&#x60;, &#x60;href&#x60; and &#x60;rel&#x60;.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The links associated to this resource, with `method`, `href` and `rel`.")
  @JsonIgnore

  public List<AtomLink> getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AtomLink>> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<List<AtomLink>> links) {
    this.links = links;
  }

  public void setLinks(List<AtomLink> links) {
    this.links = JsonNullable.<List<AtomLink>>of(links);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceOptionsDto resourceOptionsDto = (ResourceOptionsDto) o;
    return Objects.equals(this.links, resourceOptionsDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceOptionsDto {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

