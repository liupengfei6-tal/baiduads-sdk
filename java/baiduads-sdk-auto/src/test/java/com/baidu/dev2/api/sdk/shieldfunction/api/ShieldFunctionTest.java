/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shieldfunction.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.shieldfunction.model.AddIPBlackManualRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.AddIPBlackManualResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.DeleteIPBlackManualRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.DeleteIPBlackManualResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetHitBlackIPPolicyRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetHitBlackIPPolicyResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetHitCustomerPolicyRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetHitCustomerPolicyResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetIPBlackManualRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetIPBlackManualResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetShieldBlackIPRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetShieldBlackIPResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetShieldCustomerRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetShieldCustomerResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetShieldPolicyRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetShieldPolicyResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetUserDiagnoseDetailRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetUserDiagnoseDetailResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetUserDiagnoseInfoRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.GetUserDiagnoseInfoResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.UpdateAdvIPBlackManualRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.UpdateAdvIPBlackManualResponseWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.UpdateIPBlackManualRequestWrapper;
import com.baidu.dev2.api.sdk.shieldfunction.model.UpdateIPBlackManualResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShieldFunction
 */
@Ignore
public class ShieldFunctionTest {

    private final ShieldFunction api = new ShieldFunction();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addIPBlackManualTest() throws ApiException {
        AddIPBlackManualRequestWrapper addIPBlackManualRequestWrapper = null;
        AddIPBlackManualResponseWrapper response = api.addIPBlackManual(addIPBlackManualRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPBlackManualTest() throws ApiException {
        DeleteIPBlackManualRequestWrapper deleteIPBlackManualRequestWrapper = null;
        DeleteIPBlackManualResponseWrapper response = api.deleteIPBlackManual(deleteIPBlackManualRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHitBlackIPPolicyTest() throws ApiException {
        GetHitBlackIPPolicyRequestWrapper getHitBlackIPPolicyRequestWrapper = null;
        GetHitBlackIPPolicyResponseWrapper response = api.getHitBlackIPPolicy(getHitBlackIPPolicyRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHitCustomerPolicyTest() throws ApiException {
        GetHitCustomerPolicyRequestWrapper getHitCustomerPolicyRequestWrapper = null;
        GetHitCustomerPolicyResponseWrapper response = api.getHitCustomerPolicy(getHitCustomerPolicyRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPBlackManualTest() throws ApiException {
        GetIPBlackManualRequestWrapper getIPBlackManualRequestWrapper = null;
        GetIPBlackManualResponseWrapper response = api.getIPBlackManual(getIPBlackManualRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShieldBlackIPTest() throws ApiException {
        GetShieldBlackIPRequestWrapper getShieldBlackIPRequestWrapper = null;
        GetShieldBlackIPResponseWrapper response = api.getShieldBlackIP(getShieldBlackIPRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShieldCustomerTest() throws ApiException {
        GetShieldCustomerRequestWrapper getShieldCustomerRequestWrapper = null;
        GetShieldCustomerResponseWrapper response = api.getShieldCustomer(getShieldCustomerRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShieldPolicyTest() throws ApiException {
        GetShieldPolicyRequestWrapper getShieldPolicyRequestWrapper = null;
        GetShieldPolicyResponseWrapper response = api.getShieldPolicy(getShieldPolicyRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDiagnoseDetailTest() throws ApiException {
        GetUserDiagnoseDetailRequestWrapper getUserDiagnoseDetailRequestWrapper = null;
        GetUserDiagnoseDetailResponseWrapper response = api.getUserDiagnoseDetail(getUserDiagnoseDetailRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDiagnoseInfoTest() throws ApiException {
        GetUserDiagnoseInfoRequestWrapper getUserDiagnoseInfoRequestWrapper = null;
        GetUserDiagnoseInfoResponseWrapper response = api.getUserDiagnoseInfo(getUserDiagnoseInfoRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAdvIPBlackManualTest() throws ApiException {
        UpdateAdvIPBlackManualRequestWrapper updateAdvIPBlackManualRequestWrapper = null;
        UpdateAdvIPBlackManualResponseWrapper response = api.updateAdvIPBlackManual(updateAdvIPBlackManualRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPBlackManualTest() throws ApiException {
        UpdateIPBlackManualRequestWrapper updateIPBlackManualRequestWrapper = null;
        UpdateIPBlackManualResponseWrapper response = api.updateIPBlackManual(updateIPBlackManualRequestWrapper);

        // TODO: test validations
    }
}
