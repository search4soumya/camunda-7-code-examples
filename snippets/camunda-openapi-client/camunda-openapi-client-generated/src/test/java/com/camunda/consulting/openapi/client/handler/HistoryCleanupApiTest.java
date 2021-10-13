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

import com.camunda.consulting.openapi.client.model.ExceptionDto;
import com.camunda.consulting.openapi.client.model.HistoryCleanupConfigurationDto;
import com.camunda.consulting.openapi.client.model.JobDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoryCleanupApi
 */
@Ignore
public class HistoryCleanupApiTest {

    private final HistoryCleanupApi api = new HistoryCleanupApi();

    
    /**
     * Clean up history (POST)
     *
     * Schedules asynchronous history cleanup (See [History cleanup](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#history-cleanup)).  **Note:** This endpoint will return at most a single history cleanup job. Since version &#x60;7.9.0&#x60; it is possible to configure multiple [parallel history cleanup jobs](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#parallel-execution). Use [&#x60;GET /history/cleanup/jobs&#x60;](https://docs.camunda.org/manual/7.16/reference/rest/history/history-cleanup/get-history-cleanup-jobs) to find all the available history cleanup jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cleanupAsyncTest() {
        Boolean immediatelyDue = null;
        JobDto response = api.cleanupAsync(immediatelyDue);

        // TODO: test validations
    }
    
    /**
     * Find clean up history job (GET)
     *
     * **Deprecated!** Use &#x60;GET /history/cleanup/jobs&#x60; instead.  Finds history cleanup job (See [History cleanup](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#history-cleanup)).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCleanupJobTest() {
        JobDto response = api.findCleanupJob();

        // TODO: test validations
    }
    
    /**
     * Find clean up history jobs (GET)
     *
     * Finds history cleanup jobs (See [History cleanup](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#history-cleanup)).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCleanupJobsTest() {
        List<JobDto> response = api.findCleanupJobs();

        // TODO: test validations
    }
    
    /**
     * Get History Cleanup Configuration
     *
     * Retrieves history cleanup batch window configuration (See [History cleanup](https://docs.camunda.org/manual/7.16/user-guide/process-engine/history/#history-cleanup)).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoryCleanupConfigurationTest() {
        HistoryCleanupConfigurationDto response = api.getHistoryCleanupConfiguration();

        // TODO: test validations
    }
    
}
