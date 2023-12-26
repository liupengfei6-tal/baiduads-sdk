/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.accountshopping.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.accountshopping.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.accountshopping.model.GetAccountShoppingRequestWrapper;
import com.baidu.dev2.api.sdk.accountshopping.model.GetAccountShoppingResponseWrapper;
import com.baidu.dev2.api.sdk.accountshopping.model.UpdateAccountShoppingRequestWrapper;
import com.baidu.dev2.api.sdk.accountshopping.model.UpdateAccountShoppingResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountShoppingService {
  private ApiClient apiClient;

  public AccountShoppingService() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountShoppingService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param getAccountShoppingRequestWrapper  (required)
   * @return GetAccountShoppingResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetAccountShoppingResponseWrapper getAccountShopping(GetAccountShoppingRequestWrapper getAccountShoppingRequestWrapper) throws ApiException {
    Object localVarPostBody = getAccountShoppingRequestWrapper;
    
    // verify the required parameter 'getAccountShoppingRequestWrapper' is set
    if (getAccountShoppingRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getAccountShoppingRequestWrapper' when calling getAccountShopping");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AccountShoppingService/getAccountShopping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetAccountShoppingResponseWrapper> localVarReturnType = new TypeReference<GetAccountShoppingResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param updateAccountShoppingRequestWrapper  (required)
   * @return UpdateAccountShoppingResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateAccountShoppingResponseWrapper updateAccountShopping(UpdateAccountShoppingRequestWrapper updateAccountShoppingRequestWrapper) throws ApiException {
    Object localVarPostBody = updateAccountShoppingRequestWrapper;
    
    // verify the required parameter 'updateAccountShoppingRequestWrapper' is set
    if (updateAccountShoppingRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAccountShoppingRequestWrapper' when calling updateAccountShopping");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AccountShoppingService/updateAccountShopping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<UpdateAccountShoppingResponseWrapper> localVarReturnType = new TypeReference<UpdateAccountShoppingResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}