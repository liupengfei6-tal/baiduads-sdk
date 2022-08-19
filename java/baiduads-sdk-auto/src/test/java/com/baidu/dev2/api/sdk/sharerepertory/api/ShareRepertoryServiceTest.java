/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.sharerepertory.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.sharerepertory.model.AddShareRepertoryRequestWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.AddShareRepertoryResponseWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.DeleteShareRepertoryRequestWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.DeleteShareRepertoryResponseWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.GetShareRepertoryRequestWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.GetShareRepertoryResponseWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.UpdateShareRepertoryRequestWrapper;
import com.baidu.dev2.api.sdk.sharerepertory.model.UpdateShareRepertoryResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShareRepertoryService
 */
@Ignore
public class ShareRepertoryServiceTest {

    private final ShareRepertoryService api = new ShareRepertoryService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShareRepertoryTest() throws ApiException {
        AddShareRepertoryRequestWrapper addShareRepertoryRequestWrapper = null;
        AddShareRepertoryResponseWrapper response = api.addShareRepertory(addShareRepertoryRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShareRepertoryTest() throws ApiException {
        DeleteShareRepertoryRequestWrapper deleteShareRepertoryRequestWrapper = null;
        DeleteShareRepertoryResponseWrapper response = api.deleteShareRepertory(deleteShareRepertoryRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShareRepertoryTest() throws ApiException {
        GetShareRepertoryRequestWrapper getShareRepertoryRequestWrapper = null;
        GetShareRepertoryResponseWrapper response = api.getShareRepertory(getShareRepertoryRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShareRepertoryTest() throws ApiException {
        UpdateShareRepertoryRequestWrapper updateShareRepertoryRequestWrapper = null;
        UpdateShareRepertoryResponseWrapper response = api.updateShareRepertory(updateShareRepertoryRequestWrapper);

        // TODO: test validations
    }
}