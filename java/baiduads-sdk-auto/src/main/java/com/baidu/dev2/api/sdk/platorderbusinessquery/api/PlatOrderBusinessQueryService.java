/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.platorderbusinessquery.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.platorderbusinessquery.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.platorderbusinessquery.model.GetExpressNameListRequestWrapper;
import com.baidu.dev2.api.sdk.platorderbusinessquery.model.GetExpressNameListResponseWrapper;
import com.baidu.dev2.api.sdk.platorderbusinessquery.model.GetOrderDetailRequestWrapper;
import com.baidu.dev2.api.sdk.platorderbusinessquery.model.GetOrderDetailResponseWrapper;
import com.baidu.dev2.api.sdk.platorderbusinessquery.model.GetPartConsignOrderListRequestWrapper;
import com.baidu.dev2.api.sdk.platorderbusinessquery.model.GetPartConsignOrderListResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatOrderBusinessQueryService {
  private ApiClient apiClient;

  public PlatOrderBusinessQueryService() {
    this(Configuration.getDefaultApiClient());
  }

  public PlatOrderBusinessQueryService(ApiClient apiClient) {
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
   * @param getExpressNameListRequestWrapper  (required)
   * @return GetExpressNameListResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetExpressNameListResponseWrapper getExpressNameList(GetExpressNameListRequestWrapper getExpressNameListRequestWrapper) throws ApiException {
    Object localVarPostBody = getExpressNameListRequestWrapper;
    
    // verify the required parameter 'getExpressNameListRequestWrapper' is set
    if (getExpressNameListRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getExpressNameListRequestWrapper' when calling getExpressNameList");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatOrderBusinessQueryService/getExpressNameList";

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

    TypeReference<GetExpressNameListResponseWrapper> localVarReturnType = new TypeReference<GetExpressNameListResponseWrapper>() {};
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
   * @param getOrderDetailRequestWrapper  (required)
   * @return GetOrderDetailResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetOrderDetailResponseWrapper getOrderDetail(GetOrderDetailRequestWrapper getOrderDetailRequestWrapper) throws ApiException {
    Object localVarPostBody = getOrderDetailRequestWrapper;
    
    // verify the required parameter 'getOrderDetailRequestWrapper' is set
    if (getOrderDetailRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getOrderDetailRequestWrapper' when calling getOrderDetail");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatOrderBusinessQueryService/getOrderDetail";

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

    TypeReference<GetOrderDetailResponseWrapper> localVarReturnType = new TypeReference<GetOrderDetailResponseWrapper>() {};
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
   * @param getPartConsignOrderListRequestWrapper  (required)
   * @return GetPartConsignOrderListResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetPartConsignOrderListResponseWrapper getPartConsignOrderList(GetPartConsignOrderListRequestWrapper getPartConsignOrderListRequestWrapper) throws ApiException {
    Object localVarPostBody = getPartConsignOrderListRequestWrapper;
    
    // verify the required parameter 'getPartConsignOrderListRequestWrapper' is set
    if (getPartConsignOrderListRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getPartConsignOrderListRequestWrapper' when calling getPartConsignOrderList");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatOrderBusinessQueryService/getPartConsignOrderList";

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

    TypeReference<GetPartConsignOrderListResponseWrapper> localVarReturnType = new TypeReference<GetPartConsignOrderListResponseWrapper>() {};
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