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

import com.camunda.consulting.openapi.client.model.HistoricTaskInstanceQueryDtoSorting;
import com.camunda.consulting.openapi.client.model.VariableQueryParameterDto;
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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for HistoricTaskInstanceQueryDto
 */
public class HistoricTaskInstanceQueryDtoTest {
    private final HistoricTaskInstanceQueryDto model = new HistoricTaskInstanceQueryDto();

    /**
     * Model tests for HistoricTaskInstanceQueryDto
     */
    @Test
    public void testHistoricTaskInstanceQueryDto() {
        // TODO: test HistoricTaskInstanceQueryDto
    }

    /**
     * Test the property 'taskId'
     */
    @Test
    public void taskIdTest() {
        // TODO: test taskId
    }

    /**
     * Test the property 'taskParentTaskId'
     */
    @Test
    public void taskParentTaskIdTest() {
        // TODO: test taskParentTaskId
    }

    /**
     * Test the property 'processInstanceId'
     */
    @Test
    public void processInstanceIdTest() {
        // TODO: test processInstanceId
    }

    /**
     * Test the property 'processInstanceBusinessKey'
     */
    @Test
    public void processInstanceBusinessKeyTest() {
        // TODO: test processInstanceBusinessKey
    }

    /**
     * Test the property 'processInstanceBusinessKeyIn'
     */
    @Test
    public void processInstanceBusinessKeyInTest() {
        // TODO: test processInstanceBusinessKeyIn
    }

    /**
     * Test the property 'processInstanceBusinessKeyLike'
     */
    @Test
    public void processInstanceBusinessKeyLikeTest() {
        // TODO: test processInstanceBusinessKeyLike
    }

    /**
     * Test the property 'executionId'
     */
    @Test
    public void executionIdTest() {
        // TODO: test executionId
    }

    /**
     * Test the property 'processDefinitionId'
     */
    @Test
    public void processDefinitionIdTest() {
        // TODO: test processDefinitionId
    }

    /**
     * Test the property 'processDefinitionKey'
     */
    @Test
    public void processDefinitionKeyTest() {
        // TODO: test processDefinitionKey
    }

    /**
     * Test the property 'processDefinitionName'
     */
    @Test
    public void processDefinitionNameTest() {
        // TODO: test processDefinitionName
    }

    /**
     * Test the property 'caseInstanceId'
     */
    @Test
    public void caseInstanceIdTest() {
        // TODO: test caseInstanceId
    }

    /**
     * Test the property 'caseExecutionId'
     */
    @Test
    public void caseExecutionIdTest() {
        // TODO: test caseExecutionId
    }

    /**
     * Test the property 'caseDefinitionId'
     */
    @Test
    public void caseDefinitionIdTest() {
        // TODO: test caseDefinitionId
    }

    /**
     * Test the property 'caseDefinitionKey'
     */
    @Test
    public void caseDefinitionKeyTest() {
        // TODO: test caseDefinitionKey
    }

    /**
     * Test the property 'caseDefinitionName'
     */
    @Test
    public void caseDefinitionNameTest() {
        // TODO: test caseDefinitionName
    }

    /**
     * Test the property 'activityInstanceIdIn'
     */
    @Test
    public void activityInstanceIdInTest() {
        // TODO: test activityInstanceIdIn
    }

    /**
     * Test the property 'taskName'
     */
    @Test
    public void taskNameTest() {
        // TODO: test taskName
    }

    /**
     * Test the property 'taskNameLike'
     */
    @Test
    public void taskNameLikeTest() {
        // TODO: test taskNameLike
    }

    /**
     * Test the property 'taskDescription'
     */
    @Test
    public void taskDescriptionTest() {
        // TODO: test taskDescription
    }

    /**
     * Test the property 'taskDescriptionLike'
     */
    @Test
    public void taskDescriptionLikeTest() {
        // TODO: test taskDescriptionLike
    }

    /**
     * Test the property 'taskDefinitionKey'
     */
    @Test
    public void taskDefinitionKeyTest() {
        // TODO: test taskDefinitionKey
    }

    /**
     * Test the property 'taskDefinitionKeyIn'
     */
    @Test
    public void taskDefinitionKeyInTest() {
        // TODO: test taskDefinitionKeyIn
    }

    /**
     * Test the property 'taskDeleteReason'
     */
    @Test
    public void taskDeleteReasonTest() {
        // TODO: test taskDeleteReason
    }

    /**
     * Test the property 'taskDeleteReasonLike'
     */
    @Test
    public void taskDeleteReasonLikeTest() {
        // TODO: test taskDeleteReasonLike
    }

    /**
     * Test the property 'taskAssignee'
     */
    @Test
    public void taskAssigneeTest() {
        // TODO: test taskAssignee
    }

    /**
     * Test the property 'taskAssigneeLike'
     */
    @Test
    public void taskAssigneeLikeTest() {
        // TODO: test taskAssigneeLike
    }

    /**
     * Test the property 'taskOwner'
     */
    @Test
    public void taskOwnerTest() {
        // TODO: test taskOwner
    }

    /**
     * Test the property 'taskOwnerLike'
     */
    @Test
    public void taskOwnerLikeTest() {
        // TODO: test taskOwnerLike
    }

    /**
     * Test the property 'taskPriority'
     */
    @Test
    public void taskPriorityTest() {
        // TODO: test taskPriority
    }

    /**
     * Test the property 'assigned'
     */
    @Test
    public void assignedTest() {
        // TODO: test assigned
    }

    /**
     * Test the property 'unassigned'
     */
    @Test
    public void unassignedTest() {
        // TODO: test unassigned
    }

    /**
     * Test the property 'finished'
     */
    @Test
    public void finishedTest() {
        // TODO: test finished
    }

    /**
     * Test the property 'unfinished'
     */
    @Test
    public void unfinishedTest() {
        // TODO: test unfinished
    }

    /**
     * Test the property 'processFinished'
     */
    @Test
    public void processFinishedTest() {
        // TODO: test processFinished
    }

    /**
     * Test the property 'processUnfinished'
     */
    @Test
    public void processUnfinishedTest() {
        // TODO: test processUnfinished
    }

    /**
     * Test the property 'taskDueDate'
     */
    @Test
    public void taskDueDateTest() {
        // TODO: test taskDueDate
    }

    /**
     * Test the property 'taskDueDateBefore'
     */
    @Test
    public void taskDueDateBeforeTest() {
        // TODO: test taskDueDateBefore
    }

    /**
     * Test the property 'taskDueDateAfter'
     */
    @Test
    public void taskDueDateAfterTest() {
        // TODO: test taskDueDateAfter
    }

    /**
     * Test the property 'withoutTaskDueDate'
     */
    @Test
    public void withoutTaskDueDateTest() {
        // TODO: test withoutTaskDueDate
    }

    /**
     * Test the property 'taskFollowUpDate'
     */
    @Test
    public void taskFollowUpDateTest() {
        // TODO: test taskFollowUpDate
    }

    /**
     * Test the property 'taskFollowUpDateBefore'
     */
    @Test
    public void taskFollowUpDateBeforeTest() {
        // TODO: test taskFollowUpDateBefore
    }

    /**
     * Test the property 'taskFollowUpDateAfter'
     */
    @Test
    public void taskFollowUpDateAfterTest() {
        // TODO: test taskFollowUpDateAfter
    }

    /**
     * Test the property 'startedBefore'
     */
    @Test
    public void startedBeforeTest() {
        // TODO: test startedBefore
    }

    /**
     * Test the property 'startedAfter'
     */
    @Test
    public void startedAfterTest() {
        // TODO: test startedAfter
    }

    /**
     * Test the property 'finishedBefore'
     */
    @Test
    public void finishedBeforeTest() {
        // TODO: test finishedBefore
    }

    /**
     * Test the property 'finishedAfter'
     */
    @Test
    public void finishedAfterTest() {
        // TODO: test finishedAfter
    }

    /**
     * Test the property 'tenantIdIn'
     */
    @Test
    public void tenantIdInTest() {
        // TODO: test tenantIdIn
    }

    /**
     * Test the property 'withoutTenantId'
     */
    @Test
    public void withoutTenantIdTest() {
        // TODO: test withoutTenantId
    }

    /**
     * Test the property 'taskVariables'
     */
    @Test
    public void taskVariablesTest() {
        // TODO: test taskVariables
    }

    /**
     * Test the property 'processVariables'
     */
    @Test
    public void processVariablesTest() {
        // TODO: test processVariables
    }

    /**
     * Test the property 'variableNamesIgnoreCase'
     */
    @Test
    public void variableNamesIgnoreCaseTest() {
        // TODO: test variableNamesIgnoreCase
    }

    /**
     * Test the property 'variableValuesIgnoreCase'
     */
    @Test
    public void variableValuesIgnoreCaseTest() {
        // TODO: test variableValuesIgnoreCase
    }

    /**
     * Test the property 'taskInvolvedUser'
     */
    @Test
    public void taskInvolvedUserTest() {
        // TODO: test taskInvolvedUser
    }

    /**
     * Test the property 'taskInvolvedGroup'
     */
    @Test
    public void taskInvolvedGroupTest() {
        // TODO: test taskInvolvedGroup
    }

    /**
     * Test the property 'taskHadCandidateUser'
     */
    @Test
    public void taskHadCandidateUserTest() {
        // TODO: test taskHadCandidateUser
    }

    /**
     * Test the property 'taskHadCandidateGroup'
     */
    @Test
    public void taskHadCandidateGroupTest() {
        // TODO: test taskHadCandidateGroup
    }

    /**
     * Test the property 'withCandidateGroups'
     */
    @Test
    public void withCandidateGroupsTest() {
        // TODO: test withCandidateGroups
    }

    /**
     * Test the property 'withoutCandidateGroups'
     */
    @Test
    public void withoutCandidateGroupsTest() {
        // TODO: test withoutCandidateGroups
    }

    /**
     * Test the property 'orQueries'
     */
    @Test
    public void orQueriesTest() {
        // TODO: test orQueries
    }

    /**
     * Test the property 'sorting'
     */
    @Test
    public void sortingTest() {
        // TODO: test sorting
    }

}
