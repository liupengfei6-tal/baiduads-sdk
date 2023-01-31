/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialarticle.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.materialarticle.model.AddArticleRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.AddArticleResponseWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.DeleteArticleRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.DeleteArticleResponseWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.GetArticleListRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.GetArticleListResponseWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdateArticleRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdateArticleResponseWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdateCategoryRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdateCategoryResponseWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdatePutawayRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdatePutawayResponseWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdateRankRequestWrapper;
import com.baidu.dev2.api.sdk.materialarticle.model.UpdateRankResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaterialArticleService
 */
@Ignore
public class MaterialArticleServiceTest {

    private final MaterialArticleService api = new MaterialArticleService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addArticleTest() throws ApiException {
        AddArticleRequestWrapper addArticleRequestWrapper = null;
        AddArticleResponseWrapper response = api.addArticle(addArticleRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArticleTest() throws ApiException {
        DeleteArticleRequestWrapper deleteArticleRequestWrapper = null;
        DeleteArticleResponseWrapper response = api.deleteArticle(deleteArticleRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArticleListTest() throws ApiException {
        GetArticleListRequestWrapper getArticleListRequestWrapper = null;
        GetArticleListResponseWrapper response = api.getArticleList(getArticleListRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArticleTest() throws ApiException {
        UpdateArticleRequestWrapper updateArticleRequestWrapper = null;
        UpdateArticleResponseWrapper response = api.updateArticle(updateArticleRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws ApiException {
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = null;
        UpdateCategoryResponseWrapper response = api.updateCategory(updateCategoryRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePutawayTest() throws ApiException {
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = null;
        UpdatePutawayResponseWrapper response = api.updatePutaway(updatePutawayRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRankTest() throws ApiException {
        UpdateRankRequestWrapper updateRankRequestWrapper = null;
        UpdateRankResponseWrapper response = api.updateRank(updateRankRequestWrapper);

        // TODO: test validations
    }
}