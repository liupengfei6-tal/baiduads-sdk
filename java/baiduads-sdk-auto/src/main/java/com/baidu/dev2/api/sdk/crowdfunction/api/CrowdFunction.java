/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.crowdfunction.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.crowdfunction.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.crowdfunction.model.GetCrowdEstimateRequestWrapper;
import com.baidu.dev2.api.sdk.crowdfunction.model.GetCrowdEstimateResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrowdFunction {
  private ApiClient apiClient;

  public CrowdFunction() {
    this(Configuration.getDefaultApiClient());
  }

  public CrowdFunction(ApiClient apiClient) {
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
   * @param getCrowdEstimateRequestWrapper  (required)
   * @return GetCrowdEstimateResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCrowdEstimateResponseWrapper getCrowdEstimate(GetCrowdEstimateRequestWrapper getCrowdEstimateRequestWrapper) throws ApiException {
    Object localVarPostBody = getCrowdEstimateRequestWrapper;
    
    // verify the required parameter 'getCrowdEstimateRequestWrapper' is set
    if (getCrowdEstimateRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCrowdEstimateRequestWrapper' when calling getCrowdEstimate");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/CrowdFunction/getCrowdEstimate";

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

    TypeReference<GetCrowdEstimateResponseWrapper> localVarReturnType = new TypeReference<GetCrowdEstimateResponseWrapper>() {};
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
