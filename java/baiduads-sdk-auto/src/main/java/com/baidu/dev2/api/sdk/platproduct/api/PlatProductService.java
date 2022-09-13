/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.platproduct.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.platproduct.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.platproduct.model.DeleteProductRequestWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.DeleteProductResponseWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.GetProductDetailRequestWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.GetProductDetailResponseWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.GetProductListRequestWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.GetProductListResponseWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.ModOnlineStatusRequestWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.ModOnlineStatusResponseWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.SaveOrUpdateProductRequestWrapper;
import com.baidu.dev2.api.sdk.platproduct.model.SaveOrUpdateProductResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatProductService {
  private ApiClient apiClient;

  public PlatProductService() {
    this(Configuration.getDefaultApiClient());
  }

  public PlatProductService(ApiClient apiClient) {
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
   * @param deleteProductRequestWrapper  (required)
   * @return DeleteProductResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteProductResponseWrapper deleteProduct(DeleteProductRequestWrapper deleteProductRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteProductRequestWrapper;
    
    // verify the required parameter 'deleteProductRequestWrapper' is set
    if (deleteProductRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteProductRequestWrapper' when calling deleteProduct");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatProductService/deleteProduct";

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

    TypeReference<DeleteProductResponseWrapper> localVarReturnType = new TypeReference<DeleteProductResponseWrapper>() {};
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
   * @param getProductDetailRequestWrapper  (required)
   * @return GetProductDetailResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetProductDetailResponseWrapper getProductDetail(GetProductDetailRequestWrapper getProductDetailRequestWrapper) throws ApiException {
    Object localVarPostBody = getProductDetailRequestWrapper;
    
    // verify the required parameter 'getProductDetailRequestWrapper' is set
    if (getProductDetailRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getProductDetailRequestWrapper' when calling getProductDetail");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatProductService/getProductDetail";

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

    TypeReference<GetProductDetailResponseWrapper> localVarReturnType = new TypeReference<GetProductDetailResponseWrapper>() {};
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
   * @param getProductListRequestWrapper  (required)
   * @return GetProductListResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetProductListResponseWrapper getProductList(GetProductListRequestWrapper getProductListRequestWrapper) throws ApiException {
    Object localVarPostBody = getProductListRequestWrapper;
    
    // verify the required parameter 'getProductListRequestWrapper' is set
    if (getProductListRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getProductListRequestWrapper' when calling getProductList");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatProductService/getProductList";

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

    TypeReference<GetProductListResponseWrapper> localVarReturnType = new TypeReference<GetProductListResponseWrapper>() {};
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
   * @param modOnlineStatusRequestWrapper  (required)
   * @return ModOnlineStatusResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public ModOnlineStatusResponseWrapper modOnlineStatus(ModOnlineStatusRequestWrapper modOnlineStatusRequestWrapper) throws ApiException {
    Object localVarPostBody = modOnlineStatusRequestWrapper;
    
    // verify the required parameter 'modOnlineStatusRequestWrapper' is set
    if (modOnlineStatusRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'modOnlineStatusRequestWrapper' when calling modOnlineStatus");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatProductService/modOnlineStatus";

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

    TypeReference<ModOnlineStatusResponseWrapper> localVarReturnType = new TypeReference<ModOnlineStatusResponseWrapper>() {};
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
   * @param saveOrUpdateProductRequestWrapper  (required)
   * @return SaveOrUpdateProductResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public SaveOrUpdateProductResponseWrapper saveOrUpdateProduct(SaveOrUpdateProductRequestWrapper saveOrUpdateProductRequestWrapper) throws ApiException {
    Object localVarPostBody = saveOrUpdateProductRequestWrapper;
    
    // verify the required parameter 'saveOrUpdateProductRequestWrapper' is set
    if (saveOrUpdateProductRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'saveOrUpdateProductRequestWrapper' when calling saveOrUpdateProduct");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/PlatProductService/saveOrUpdateProduct";

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

    TypeReference<SaveOrUpdateProductResponseWrapper> localVarReturnType = new TypeReference<SaveOrUpdateProductResponseWrapper>() {};
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
