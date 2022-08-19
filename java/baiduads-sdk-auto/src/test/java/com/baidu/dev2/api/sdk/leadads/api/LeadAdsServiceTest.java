/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.leadads.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.leadads.model.AddStrategiesRequestWrapper;
import com.baidu.dev2.api.sdk.leadads.model.AddStrategiesResponseWrapper;
import com.baidu.dev2.api.sdk.leadads.model.DeleteStrategiesRequestWrapper;
import com.baidu.dev2.api.sdk.leadads.model.DeleteStrategiesResponseWrapper;
import com.baidu.dev2.api.sdk.leadads.model.GetMaterialsRequestWrapper;
import com.baidu.dev2.api.sdk.leadads.model.GetMaterialsResponseWrapper;
import com.baidu.dev2.api.sdk.leadads.model.GetStrategiesRequestWrapper;
import com.baidu.dev2.api.sdk.leadads.model.GetStrategiesResponseWrapper;
import com.baidu.dev2.api.sdk.leadads.model.UpdateStrategiesRequestWrapper;
import com.baidu.dev2.api.sdk.leadads.model.UpdateStrategiesResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeadAdsService
 */
@Ignore
public class LeadAdsServiceTest {

    private final LeadAdsService api = new LeadAdsService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStrategiesTest() throws ApiException {
        AddStrategiesRequestWrapper addStrategiesRequestWrapper = null;
        AddStrategiesResponseWrapper response = api.addStrategies(addStrategiesRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStrategiesTest() throws ApiException {
        DeleteStrategiesRequestWrapper deleteStrategiesRequestWrapper = null;
        DeleteStrategiesResponseWrapper response = api.deleteStrategies(deleteStrategiesRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaterialsTest() throws ApiException {
        GetMaterialsRequestWrapper getMaterialsRequestWrapper = null;
        GetMaterialsResponseWrapper response = api.getMaterials(getMaterialsRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStrategiesTest() throws ApiException {
        GetStrategiesRequestWrapper getStrategiesRequestWrapper = null;
        GetStrategiesResponseWrapper response = api.getStrategies(getStrategiesRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStrategiesTest() throws ApiException {
        UpdateStrategiesRequestWrapper updateStrategiesRequestWrapper = null;
        UpdateStrategiesResponseWrapper response = api.updateStrategies(updateStrategiesRequestWrapper);

        // TODO: test validations
    }
}
