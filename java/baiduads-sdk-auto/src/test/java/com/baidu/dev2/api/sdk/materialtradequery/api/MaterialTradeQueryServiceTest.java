/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialtradequery.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.materialtradequery.model.GetUserTradeRequestWrapper;
import com.baidu.dev2.api.sdk.materialtradequery.model.GetUserTradeResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaterialTradeQueryService
 */
@Ignore
public class MaterialTradeQueryServiceTest {

    private final MaterialTradeQueryService api = new MaterialTradeQueryService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTradeTest() throws ApiException {
        GetUserTradeRequestWrapper getUserTradeRequestWrapper = null;
        GetUserTradeResponseWrapper response = api.getUserTrade(getUserTradeRequestWrapper);

        // TODO: test validations
    }
}
