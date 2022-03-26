/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.appcenterpackage.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.appcenterpackage.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.appcenterpackage.model.GetAppPackagelistRequestWrapper;
import com.baidu.dev2.api.sdk.appcenterpackage.model.GetAppPackagelistResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppCenterPackageService {
  private ApiClient apiClient;

  public AppCenterPackageService() {
    this(Configuration.getDefaultApiClient());
  }

  public AppCenterPackageService(ApiClient apiClient) {
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
   * @param getAppPackagelistRequestWrapper  (required)
   * @return GetAppPackagelistResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetAppPackagelistResponseWrapper getAppPackagelist(GetAppPackagelistRequestWrapper getAppPackagelistRequestWrapper) throws ApiException {
    Object localVarPostBody = getAppPackagelistRequestWrapper;
    
    // verify the required parameter 'getAppPackagelistRequestWrapper' is set
    if (getAppPackagelistRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getAppPackagelistRequestWrapper' when calling getAppPackagelist");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AppCenterPackageService/getAppPackagelist";

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

    TypeReference<GetAppPackagelistResponseWrapper> localVarReturnType = new TypeReference<GetAppPackagelistResponseWrapper>() {};
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