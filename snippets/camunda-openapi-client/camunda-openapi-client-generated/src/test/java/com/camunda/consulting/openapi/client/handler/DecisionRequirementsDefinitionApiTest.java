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


package com.camunda.consulting.openapi.client.handler;

import com.camunda.consulting.openapi.client.model.CountResultDto;
import com.camunda.consulting.openapi.client.model.DecisionRequirementsDefinitionDto;
import com.camunda.consulting.openapi.client.model.DecisionRequirementsDefinitionXmlDto;
import com.camunda.consulting.openapi.client.model.ExceptionDto;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DecisionRequirementsDefinitionApi
 */
@Ignore
public class DecisionRequirementsDefinitionApiTest {

    private final DecisionRequirementsDefinitionApi api = new DecisionRequirementsDefinitionApi();

    
    /**
     * Get Decision Requirements Definition by ID
     *
     * Retrieves a decision requirements definition according to the &#x60;DecisionRequirementsDefinition&#x60; interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionByIdTest() {
        String id = null;
        DecisionRequirementsDefinitionDto response = api.getDecisionRequirementsDefinitionById(id);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Definition by Key
     *
     * Retrieves a decision requirements definition according to the &#x60;DecisionRequirementsDefinition&#x60; interface in the engine.  Returns the latest version of the decision requirements definition  which belongs to no tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionByKeyTest() {
        String key = null;
        DecisionRequirementsDefinitionDto response = api.getDecisionRequirementsDefinitionByKey(key);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Definition by Key and Tenant ID
     *
     * Retrieves a decision requirements definition according to the &#x60;DecisionRequirementsDefinition&#x60; interface in the engine. Returns the latest version of the decision requirements definition  for a tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionByKeyAndTenantIdTest() {
        String key = null;
        String tenantId = null;
        DecisionRequirementsDefinitionDto response = api.getDecisionRequirementsDefinitionByKeyAndTenantId(key, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Diagram by ID
     *
     * Retrieves the diagram of a decision requirements definition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionDiagramByIdTest() {
        String id = null;
        File response = api.getDecisionRequirementsDefinitionDiagramById(id);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Diagram by Key
     *
     * Retrieves the diagram of a decision requirements definition. Returns the diagram for the latest version of the decision requirements  definition which belongs to no tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionDiagramByKeyTest() {
        String key = null;
        File response = api.getDecisionRequirementsDefinitionDiagramByKey(key);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Diagram by Key and Tenant ID
     *
     * Retrieves the diagram of a decision requirements definition. Returns the diagram of the latest version of the decision requirements  definition for a tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionDiagramByKeyAndTenantIdTest() {
        String key = null;
        String tenantId = null;
        File response = api.getDecisionRequirementsDefinitionDiagramByKeyAndTenantId(key, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get DMN XML by ID
     *
     * Retrieves the DMN XML of a decision requirements definition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionDmnXmlByIdTest() {
        String id = null;
        DecisionRequirementsDefinitionXmlDto response = api.getDecisionRequirementsDefinitionDmnXmlById(id);

        // TODO: test validations
    }
    
    /**
     * Get DMN XML by Key
     *
     * Retrieves the DMN XML of a decision requirements definition. Returns the XML for the latest version of the decision requirements  definition which belongs to no tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionDmnXmlByKeyTest() {
        String key = null;
        DecisionRequirementsDefinitionXmlDto response = api.getDecisionRequirementsDefinitionDmnXmlByKey(key);

        // TODO: test validations
    }
    
    /**
     * Get DMN XML by Key and Tenant ID
     *
     * Retrieves the DMN XML of a decision requirements definition. Returns the XML of the latest version of the decision requirements  definition for a tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionDmnXmlByKeyAndTenantIdTest() {
        String key = null;
        String tenantId = null;
        DecisionRequirementsDefinitionXmlDto response = api.getDecisionRequirementsDefinitionDmnXmlByKeyAndTenantId(key, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Definitions
     *
     * Queries for decision requirements definitions that fulfill given parameters. Parameters may be the properties of decision requirements definitions, such as the name, key or version.  The size of the result set can be retrieved by using the [Get Decision Requirements Definition Count](https://docs.camunda.org/manual/7.16/reference/rest/decision-requirements-definition/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionsTest() {
        String decisionRequirementsDefinitionId = null;
        String decisionRequirementsDefinitionIdIn = null;
        String name = null;
        String nameLike = null;
        String deploymentId = null;
        String key = null;
        String keyLike = null;
        String category = null;
        String categoryLike = null;
        Integer version = null;
        Boolean latestVersion = null;
        String resourceName = null;
        String resourceNameLike = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDecisionRequirementsDefinitionsWithoutTenantId = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<DecisionRequirementsDefinitionDto> response = api.getDecisionRequirementsDefinitions(decisionRequirementsDefinitionId, decisionRequirementsDefinitionIdIn, name, nameLike, deploymentId, key, keyLike, category, categoryLike, version, latestVersion, resourceName, resourceNameLike, tenantIdIn, withoutTenantId, includeDecisionRequirementsDefinitionsWithoutTenantId, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * Get Decision Requirements Definition Count
     *
     * Requests the number of decision requirements definitions that fulfill the query criteria. Takes the same filtering parameters as the [Get Decision Requirements Definitions](https://docs.camunda.org/manual/7.16/reference/rest/decision-requirements-definition/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionRequirementsDefinitionsCountTest() {
        String decisionRequirementsDefinitionId = null;
        String decisionRequirementsDefinitionIdIn = null;
        String name = null;
        String nameLike = null;
        String deploymentId = null;
        String key = null;
        String keyLike = null;
        String category = null;
        String categoryLike = null;
        Integer version = null;
        Boolean latestVersion = null;
        String resourceName = null;
        String resourceNameLike = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDecisionRequirementsDefinitionsWithoutTenantId = null;
        CountResultDto response = api.getDecisionRequirementsDefinitionsCount(decisionRequirementsDefinitionId, decisionRequirementsDefinitionIdIn, name, nameLike, deploymentId, key, keyLike, category, categoryLike, version, latestVersion, resourceName, resourceNameLike, tenantIdIn, withoutTenantId, includeDecisionRequirementsDefinitionsWithoutTenantId);

        // TODO: test validations
    }
    
}
