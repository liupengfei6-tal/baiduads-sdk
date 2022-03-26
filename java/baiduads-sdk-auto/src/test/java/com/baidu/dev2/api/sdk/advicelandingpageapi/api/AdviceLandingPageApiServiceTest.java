/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advicelandingpageapi.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.advicelandingpageapi.model.QueryLandingPageCorrelationRequestWrapper;
import com.baidu.dev2.api.sdk.advicelandingpageapi.model.QueryLandingPageCorrelationResponseWrapper;
import com.baidu.dev2.api.sdk.advicelandingpageapi.model.QueryLandingPageQualityRequestWrapper;
import com.baidu.dev2.api.sdk.advicelandingpageapi.model.QueryLandingPageQualityResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdviceLandingPageApiService
 */
@Ignore
public class AdviceLandingPageApiServiceTest {

    private final AdviceLandingPageApiService api = new AdviceLandingPageApiService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryLandingPageCorrelationTest() throws ApiException {
        QueryLandingPageCorrelationRequestWrapper queryLandingPageCorrelationRequestWrapper = null;
        QueryLandingPageCorrelationResponseWrapper response = api.queryLandingPageCorrelation(queryLandingPageCorrelationRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryLandingPageQualityTest() throws ApiException {
        QueryLandingPageQualityRequestWrapper queryLandingPageQualityRequestWrapper = null;
        QueryLandingPageQualityResponseWrapper response = api.queryLandingPageQuality(queryLandingPageQualityRequestWrapper);

        // TODO: test validations
    }
}