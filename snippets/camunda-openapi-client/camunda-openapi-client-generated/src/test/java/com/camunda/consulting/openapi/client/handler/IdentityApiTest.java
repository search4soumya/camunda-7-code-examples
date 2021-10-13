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

import com.camunda.consulting.openapi.client.model.AuthenticationResult;
import com.camunda.consulting.openapi.client.model.BasicUserCredentialsDto;
import com.camunda.consulting.openapi.client.model.CheckPasswordPolicyResultDto;
import com.camunda.consulting.openapi.client.model.ExceptionDto;
import com.camunda.consulting.openapi.client.model.IdentityServiceGroupInfoDto;
import com.camunda.consulting.openapi.client.model.PasswordPolicyDto;
import com.camunda.consulting.openapi.client.model.PasswordPolicyRequestDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentityApi
 */
@Ignore
public class IdentityApiTest {

    private final IdentityApi api = new IdentityApi();

    
    /**
     * Validate Password
     *
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. A password can be checked for compliancy via this end point. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.16/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.16/user-guide/security/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkPasswordTest() {
        PasswordPolicyRequestDto passwordPolicyRequestDto = null;
        CheckPasswordPolicyResultDto response = api.checkPassword(passwordPolicyRequestDto);

        // TODO: test validations
    }
    
    /**
     * Get a User&#39;s Groups
     *
     * Gets the groups of a user by id and includes all users that share a group with the given user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupInfoTest() {
        String userId = null;
        IdentityServiceGroupInfoDto response = api.getGroupInfo(userId);

        // TODO: test validations
    }
    
    /**
     * Get Password Policy
     *
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. This end point returns a JSON representation of the list of policy rules. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.16/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.16/user-guide/security/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPasswordPolicyTest() {
        PasswordPolicyDto response = api.getPasswordPolicy();

        // TODO: test validations
    }
    
    /**
     * Verify User
     *
     * Verifies that user credentials are valid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyUserTest() {
        BasicUserCredentialsDto basicUserCredentialsDto = null;
        AuthenticationResult response = api.verifyUser(basicUserCredentialsDto);

        // TODO: test validations
    }
    
}
