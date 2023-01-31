/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialpersonmod.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.materialpersonmod.model.AddPersonRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.AddPersonResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.DeletePersonRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.DeletePersonResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateCategoryRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateCategoryResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePersonRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePersonResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePutawayRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdatePutawayResponseWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateRankRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonmod.model.UpdateRankResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaterialPersonModService
 */
@Ignore
public class MaterialPersonModServiceTest {

    private final MaterialPersonModService api = new MaterialPersonModService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPersonTest() throws ApiException {
        AddPersonRequestWrapper addPersonRequestWrapper = null;
        AddPersonResponseWrapper response = api.addPerson(addPersonRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePersonTest() throws ApiException {
        DeletePersonRequestWrapper deletePersonRequestWrapper = null;
        DeletePersonResponseWrapper response = api.deletePerson(deletePersonRequestWrapper);

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
    public void updatePersonTest() throws ApiException {
        UpdatePersonRequestWrapper updatePersonRequestWrapper = null;
        UpdatePersonResponseWrapper response = api.updatePerson(updatePersonRequestWrapper);

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