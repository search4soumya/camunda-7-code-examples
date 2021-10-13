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

import com.camunda.consulting.openapi.client.model.BatchDto;
import com.camunda.consulting.openapi.client.model.BatchStatisticsDto;
import com.camunda.consulting.openapi.client.model.CountResultDto;
import com.camunda.consulting.openapi.client.model.ExceptionDto;
import com.camunda.consulting.openapi.client.model.SuspensionStateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchApi
 */
@Ignore
public class BatchApiTest {

    private final BatchApi api = new BatchApi();

    
    /**
     * Delete
     *
     * Deletes a batch by id, including all related jobs and job definitions. Optionally also deletes the batch history.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBatchTest() {
        String id = null;
        Boolean cascade = null;
        api.deleteBatch(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get
     *
     * Retrieves a batch by id, according to the Batch interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTest() {
        String id = null;
        BatchDto response = api.getBatch(id);

        // TODO: test validations
    }
    
    /**
     * Get Statistics
     *
     * Queries for batch statistics that fulfill given parameters. Parameters may be the properties of batches, such as the id or type. The size of the result set can be retrieved by using the  [Get Batch Statistics Count](https://docs.camunda.org/manual/7.16/reference/rest/batch/get-statistics-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchStatisticsTest() {
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        String batchId = null;
        String type = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean suspended = null;
        List<BatchStatisticsDto> response = api.getBatchStatistics(sortBy, sortOrder, firstResult, maxResults, batchId, type, tenantIdIn, withoutTenantId, suspended);

        // TODO: test validations
    }
    
    /**
     * Get Statistics Count
     *
     * Requests the number of batch statistics that fulfill the query criteria. Takes the same filtering parameters as the [Get Batch Statistics](https://docs.camunda.org/manual/7.16/reference/rest/batch/get-statistics-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchStatisticsCountTest() {
        String batchId = null;
        String type = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean suspended = null;
        CountResultDto response = api.getBatchStatisticsCount(batchId, type, tenantIdIn, withoutTenantId, suspended);

        // TODO: test validations
    }
    
    /**
     * Get List
     *
     * Queries for batches that fulfill given parameters. Parameters may be the properties of batches, such as the id or type. The size of the result set can be retrieved by using the [Get Batch Count](https://docs.camunda.org/manual/7.16/reference/rest/batch/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchesTest() {
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        String batchId = null;
        String type = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean suspended = null;
        List<BatchDto> response = api.getBatches(sortBy, sortOrder, firstResult, maxResults, batchId, type, tenantIdIn, withoutTenantId, suspended);

        // TODO: test validations
    }
    
    /**
     * Get List Count
     *
     * Requests the number of batches that fulfill the query criteria. Takes the same filtering parameters as the [Get Batches](https://docs.camunda.org/manual/7.16/reference/rest/batch/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchesCountTest() {
        String batchId = null;
        String type = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean suspended = null;
        CountResultDto response = api.getBatchesCount(batchId, type, tenantIdIn, withoutTenantId, suspended);

        // TODO: test validations
    }
    
    /**
     * Activate/Suspend
     *
     * Activates or suspends a batch by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBatchSuspensionStateTest() {
        String id = null;
        SuspensionStateDto suspensionStateDto = null;
        api.updateBatchSuspensionState(id, suspensionStateDto);

        // TODO: test validations
    }
    
}
