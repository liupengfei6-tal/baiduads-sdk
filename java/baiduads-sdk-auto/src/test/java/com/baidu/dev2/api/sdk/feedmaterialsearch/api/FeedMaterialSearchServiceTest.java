/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.feedmaterialsearch.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.feedmaterialsearch.model.GetMaterialInfoBySearchRequestWrapper;
import com.baidu.dev2.api.sdk.feedmaterialsearch.model.GetMaterialInfoBySearchResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedMaterialSearchService
 */
@Ignore
public class FeedMaterialSearchServiceTest {

    private final FeedMaterialSearchService api = new FeedMaterialSearchService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaterialInfoBySearchTest() throws ApiException {
        GetMaterialInfoBySearchRequestWrapper getMaterialInfoBySearchRequestWrapper = null;
        GetMaterialInfoBySearchResponseWrapper response = api.getMaterialInfoBySearch(getMaterialInfoBySearchRequestWrapper);

        // TODO: test validations
    }
}