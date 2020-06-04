/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.apigateway.v20180808;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apigateway.v20180808.models.*;

public class ApigatewayClient extends AbstractClient{
    private static String endpoint = "apigateway.tencentcloudapi.com";
    private static String version = "2018-08-08";

    public ApigatewayClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApigatewayClient(Credential credential, String region, ClientProfile profile) {
        super(ApigatewayClient.endpoint, ApigatewayClient.version, credential, region, profile);
    }

    /**
     *本接口（BindEnvironment）用于绑定使用计划到服务环境。
用户在发布服务到某个环境中后，如此 API 需要鉴权，还需要绑定使用计划才能进行调用，此接口用户将使用计划绑定到特定环境。
目前支持绑定使用计划到API，但是同一个服务不能同时存在绑定到服务的使用计划和绑定到API的使用计划，所以对已经绑定过服务级别使用计划的环境，请先使用 服务级别使用计划降级 接口进行降级操作。
     * @param req BindEnvironmentRequest
     * @return BindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public BindEnvironmentResponse BindEnvironment(BindEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEnvironmentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindEnvironmentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindEnvironment"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindIPStrategy）用于API绑定IP策略。
     * @param req BindIPStrategyRequest
     * @return BindIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public BindIPStrategyResponse BindIPStrategy(BindIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindSecretIds）用于为使用计划绑定密钥。
将密钥绑定到某个使用计划，并将此使用计划绑定到某个服务发布的环境上，调用者方可使用此密钥调用这个服务中的 API，可使用本接口为使用计划绑定密钥。
     * @param req BindSecretIdsRequest
     * @return BindSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public BindSecretIdsResponse BindSecretIds(BindSecretIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindSecretIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindSecretIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindSecretIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindSubDomain）用于绑定自定义域名到服务。
API 网关中每个服务都会提供一个默认的域名供用户调用，但当用户想使用自己的已有域名时，也可以将自定义域名绑定到此服务，在做好备案、与默认域名的 CNAME 后，可直接调用自定义域名。
     * @param req BindSubDomainRequest
     * @return BindSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public BindSubDomainResponse BindSubDomain(BindSubDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindSubDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindSubDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindSubDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateApi）用于创建 API 接口，创建 API 前，用户需要先创建服务，每个 API 都有自己归属的服务。
     * @param req CreateApiRequest
     * @return CreateApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiResponse CreateApi(CreateApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateApiKey）用于创建一对新的 API 密钥。
     * @param req CreateApiKeyRequest
     * @return CreateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiKeyResponse CreateApiKey(CreateApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateIPStrategy）用于创建服务IP策略。
     * @param req CreateIPStrategyRequest
     * @return CreateIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateIPStrategyResponse CreateIPStrategy(CreateIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateService）用于创建服务。
API 网关使用的最大单元为服务，每个服务中可创建多个 API 接口。每个服务有一个默认域名供客户调用，用户也可绑定自定义域名到此服务中。
     * @param req CreateServiceRequest
     * @return CreateServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceResponse CreateService(CreateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateUsagePlan）用于创建使用计划。
用户在使用 API 网关时，需要创建使用计划并将其绑定到服务的环境中使用。
     * @param req CreateUsagePlanRequest
     * @return CreateUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsagePlanResponse CreateUsagePlan(CreateUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteApi）用于删除已经创建的API。
     * @param req DeleteApiRequest
     * @return DeleteApiResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiResponse DeleteApi(DeleteApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteApiKey）用于删除一对 API 密钥。
     * @param req DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiKeyResponse DeleteApiKey(DeleteApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteIPStrategy）用于删除服务IP策略。
     * @param req DeleteIPStrategyRequest
     * @return DeleteIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIPStrategyResponse DeleteIPStrategy(DeleteIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteService）用于删除 API 网关中某个服务。
     * @param req DeleteServiceRequest
     * @return DeleteServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceResponse DeleteService(DeleteServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteServiceSubDomainMapping）用于删除服务中某个环境的自定义域名映射。
当用户使用自定义域名，并使用了自定义映射时，可使用此接口。但需注意，若删除了所有环境的映射时，调用此 API 均会返回失败。
     * @param req DeleteServiceSubDomainMappingRequest
     * @return DeleteServiceSubDomainMappingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceSubDomainMappingResponse DeleteServiceSubDomainMapping(DeleteServiceSubDomainMappingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceSubDomainMappingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceSubDomainMappingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceSubDomainMapping"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteUsagePlan）用于删除使用计划。
     * @param req DeleteUsagePlanRequest
     * @return DeleteUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsagePlanResponse DeleteUsagePlan(DeleteUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DemoteServiceUsagePlan）用于将某个服务在某个环境的使用计划，降级到API上。
服务若需要鉴权限流生效，则需要绑定使用计划到此服务中，本接口用于查询绑定到一个服务的所有使用计划。
如果服务内没有API不允许进行此操作。
如果当前环境没有发布，不允许进行此操作。
     * @param req DemoteServiceUsagePlanRequest
     * @return DemoteServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DemoteServiceUsagePlanResponse DemoteServiceUsagePlan(DemoteServiceUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DemoteServiceUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DemoteServiceUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DemoteServiceUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApi）用于查询用户部署于 API 网关的 API 接口的详细信息。​
     * @param req DescribeApiRequest
     * @return DescribeApiResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiResponse DescribeApi(DescribeApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiEnvironmentStrategy）用于展示API绑定的限流策略。
     * @param req DescribeApiEnvironmentStrategyRequest
     * @return DescribeApiEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiEnvironmentStrategyResponse DescribeApiEnvironmentStrategy(DescribeApiEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiKey）用于查询密钥详情。
用户在创建密钥后，可用此接口查询一个 API 密钥的详情，该接口会显示密钥 Key。
     * @param req DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyResponse DescribeApiKey(DescribeApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiKeysStatus）用于查询密钥列表。
当用户创建了多个密钥对时，可使用本接口查询一个或多个 API 密钥信息，本接口不会显示密钥 Key。
     * @param req DescribeApiKeysStatusRequest
     * @return DescribeApiKeysStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeysStatusResponse DescribeApiKeysStatus(DescribeApiKeysStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiKeysStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiKeysStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiKeysStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiUsagePlan）用于查询服务中 API 使用计划详情。
服务若需要鉴权限流生效，则需要绑定使用计划到此服务中，本接口用于查询绑定到一个服务及其中 API 的所有使用计划。
     * @param req DescribeApiUsagePlanRequest
     * @return DescribeApiUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiUsagePlanResponse DescribeApiUsagePlan(DescribeApiUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApiUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApisStatus）用于查看一个服务下的某个 API 或所有 API 列表及其相关信息。
     * @param req DescribeApisStatusRequest
     * @return DescribeApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApisStatusResponse DescribeApisStatus(DescribeApisStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApisStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApisStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApisStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeIPStrategy）用于查询IP策略详情。
     * @param req DescribeIPStrategyRequest
     * @return DescribeIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategyResponse DescribeIPStrategy(DescribeIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeIPStrategyApisStatus）用于查询IP策略绑定的API列表
     * @param req DescribeIPStrategyApisStatusRequest
     * @return DescribeIPStrategyApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategyApisStatusResponse DescribeIPStrategyApisStatus(DescribeIPStrategyApisStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPStrategyApisStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStrategyApisStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIPStrategyApisStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeIPStrategysStatus）用于查询服务IP策略列表。
     * @param req DescribeIPStrategysStatusRequest
     * @return DescribeIPStrategysStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategysStatusResponse DescribeIPStrategysStatus(DescribeIPStrategysStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPStrategysStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStrategysStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIPStrategysStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于搜索日志
     * @param req DescribeLogSearchRequest
     * @return DescribeLogSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSearchResponse DescribeLogSearch(DescribeLogSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogSearchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogSearchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLogSearch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeService）用于查询一个服务的详细信息、包括服务的描述、域名、协议、创建时间、发布情况等信息。
     * @param req DescribeServiceRequest
     * @return DescribeServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceResponse DescribeService(DescribeServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceEnvironmentList）用于查询一个服务的环境列表，可查询到此服务下所有环境及其状态。
     * @param req DescribeServiceEnvironmentListRequest
     * @return DescribeServiceEnvironmentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentListResponse DescribeServiceEnvironmentList(DescribeServiceEnvironmentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceEnvironmentListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceEnvironmentList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceEnvironmentReleaseHistory）用于查询服务环境的发布历史。
用户在创建好服务后需要发布到某个环境中才能进行使用，本接口用于查询一个服务某个环境的发布记录。
     * @param req DescribeServiceEnvironmentReleaseHistoryRequest
     * @return DescribeServiceEnvironmentReleaseHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentReleaseHistoryResponse DescribeServiceEnvironmentReleaseHistory(DescribeServiceEnvironmentReleaseHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceEnvironmentReleaseHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentReleaseHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceEnvironmentReleaseHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceEnvironmentStrategy）用于展示服务限流策略。
     * @param req DescribeServiceEnvironmentStrategyRequest
     * @return DescribeServiceEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceEnvironmentStrategyResponse DescribeServiceEnvironmentStrategy(DescribeServiceEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceReleaseVersion）查询一个服务下面所有已经发布的版本列表。
用户在发布服务时，常有多个版本发布，可使用本接口查询已发布的版本。
     * @param req DescribeServiceReleaseVersionRequest
     * @return DescribeServiceReleaseVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceReleaseVersionResponse DescribeServiceReleaseVersion(DescribeServiceReleaseVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceReleaseVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceReleaseVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceReleaseVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceSubDomainMappings）用于查询自定义域名的路径映射。
API 网关可绑定自定义域名到服务，并且可以对自定义域名的路径进行映射，可自定义不同的路径映射到服务中的三个环境，本接口用于查询绑定服务的自定义域名的路径映射列表。
     * @param req DescribeServiceSubDomainMappingsRequest
     * @return DescribeServiceSubDomainMappingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceSubDomainMappingsResponse DescribeServiceSubDomainMappings(DescribeServiceSubDomainMappingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceSubDomainMappingsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceSubDomainMappingsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceSubDomainMappings"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceSubDomains）用于查询自定义域名列表。
API 网关可绑定自定义域名到服务，用于服务调用。此接口用于查询用户绑定在服务的自定义域名列表。
     * @param req DescribeServiceSubDomainsRequest
     * @return DescribeServiceSubDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceSubDomainsResponse DescribeServiceSubDomains(DescribeServiceSubDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceSubDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceSubDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceSubDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceUsagePlan）用于查询服务使用计划详情。
服务若需要鉴权限流生效，则需要绑定使用计划到此服务中，本接口用于查询绑定到一个服务的所有使用计划。
     * @param req DescribeServiceUsagePlanRequest
     * @return DescribeServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceUsagePlanResponse DescribeServiceUsagePlan(DescribeServiceUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServicesStatus）用于搜索查询某一个服务或多个服务的列表，并返回服务相关的域名、时间等信息。
     * @param req DescribeServicesStatusRequest
     * @return DescribeServicesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServicesStatusResponse DescribeServicesStatus(DescribeServicesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServicesStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServicesStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServicesStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUsagePlan）用于查询一个使用计划的详细信息，包括名称、QPS、创建时间绑定的环境等。
     * @param req DescribeUsagePlanRequest
     * @return DescribeUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanResponse DescribeUsagePlan(DescribeUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUsagePlanEnvironments）用于查询使用计划绑定的环境列表。
用户在绑定了某个使用计划到环境后，可使用本接口查询这个使用计划绑定的所有服务的环境。
     * @param req DescribeUsagePlanEnvironmentsRequest
     * @return DescribeUsagePlanEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanEnvironmentsResponse DescribeUsagePlanEnvironments(DescribeUsagePlanEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlanEnvironmentsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanEnvironmentsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlanEnvironments"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUsagePlanSecretIds）用于查询使用计划绑定的密钥列表。
在 API 网关中，一个使用计划可绑定多个密钥对，可使用本接口查询使用计划绑定的密钥列表。
     * @param req DescribeUsagePlanSecretIdsRequest
     * @return DescribeUsagePlanSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlanSecretIdsResponse DescribeUsagePlanSecretIds(DescribeUsagePlanSecretIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlanSecretIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanSecretIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlanSecretIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUsagePlanStatus）用于查询使用计划的列表。
     * @param req DescribeUsagePlansStatusRequest
     * @return DescribeUsagePlansStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsagePlansStatusResponse DescribeUsagePlansStatus(DescribeUsagePlansStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsagePlansStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlansStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsagePlansStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableApiKey）用于禁用一对 API 密钥。
     * @param req DisableApiKeyRequest
     * @return DisableApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableApiKeyResponse DisableApiKey(DisableApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableApiKey）用于启动一对被禁用的 API 密钥。
     * @param req EnableApiKeyRequest
     * @return EnableApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableApiKeyResponse EnableApiKey(EnableApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GenerateApiDocument）用于自动生成 API 文档和 SDK，一个服务的一个环境生成一份文档和 SDK。
     * @param req GenerateApiDocumentRequest
     * @return GenerateApiDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GenerateApiDocumentResponse GenerateApiDocument(GenerateApiDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateApiDocumentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateApiDocumentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GenerateApiDocument"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyApi）用于修改 API 接口，可调用此接口对已经配置的 API 接口进行编辑修改。修改后的 API 需要重新发布 API 所在的服务到对应环境方能生效。
     * @param req ModifyApiRequest
     * @return ModifyApiResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiResponse ModifyApi(ModifyApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApi"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyApiEnvironmentStrategy）用于修改API限流策略
     * @param req ModifyApiEnvironmentStrategyRequest
     * @return ModifyApiEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiEnvironmentStrategyResponse ModifyApiEnvironmentStrategy(ModifyApiEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApiEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供增量更新API能力，主要是给程序调用（区别于ModifyApi，该接口是需要传入API的全量参数，对console使用较友好）
     * @param req ModifyApiIncrementRequest
     * @return ModifyApiIncrementResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiIncrementResponse ModifyApiIncrement(ModifyApiIncrementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiIncrementResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiIncrementResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApiIncrement"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyIPStrategy）用于修改服务IP策略。
     * @param req ModifyIPStrategyRequest
     * @return ModifyIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIPStrategyResponse ModifyIPStrategy(ModifyIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyService）用于修改服务的相关信息。当服务创建后，服务的名称、描述和服务类型均可被修改。
     * @param req ModifyServiceRequest
     * @return ModifyServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceResponse ModifyService(ModifyServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyServiceEnvironmentStrategy）用于修改服务限流策略
     * @param req ModifyServiceEnvironmentStrategyRequest
     * @return ModifyServiceEnvironmentStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceEnvironmentStrategyResponse ModifyServiceEnvironmentStrategy(ModifyServiceEnvironmentStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceEnvironmentStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceEnvironmentStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyServiceEnvironmentStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySubDomain）用于修改服务的自定义域名设置中的路径映射，可以修改绑定自定义域名之前的路径映射规则。
     * @param req ModifySubDomainRequest
     * @return ModifySubDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubDomainResponse ModifySubDomain(ModifySubDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyUsagePlan）用于修改使用计划的名称，描述及 QPS。
     * @param req ModifyUsagePlanRequest
     * @return ModifyUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsagePlanResponse ModifyUsagePlan(ModifyUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUsagePlanResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUsagePlanResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUsagePlan"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReleaseService）用于发布服务。
API 网关的服务创建后，需要发布到某个环境方生效后，使用者才能进行调用，此接口用于发布服务到环境，如 release 环境。
     * @param req ReleaseServiceRequest
     * @return ReleaseServiceResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseServiceResponse ReleaseService(ReleaseServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnBindEnvironment）用于将使用计划从特定环境解绑。
     * @param req UnBindEnvironmentRequest
     * @return UnBindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public UnBindEnvironmentResponse UnBindEnvironment(UnBindEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindEnvironmentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindEnvironmentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindEnvironment"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnBindIPStrategy）用于服务解绑IP策略。
     * @param req UnBindIPStrategyRequest
     * @return UnBindIPStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UnBindIPStrategyResponse UnBindIPStrategy(UnBindIPStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindIPStrategyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindIPStrategyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindIPStrategy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnBindSecretIds）用于为使用计划解绑密钥。
     * @param req UnBindSecretIdsRequest
     * @return UnBindSecretIdsResponse
     * @throws TencentCloudSDKException
     */
    public UnBindSecretIdsResponse UnBindSecretIds(UnBindSecretIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindSecretIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindSecretIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindSecretIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnBindSubDomain）用于解绑自定义域名。
用户使用 API 网关绑定了自定义域名到服务中后，若想要解绑此自定义域名，可使用此接口。
     * @param req UnBindSubDomainRequest
     * @return UnBindSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public UnBindSubDomainResponse UnBindSubDomain(UnBindSubDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnBindSubDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindSubDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnBindSubDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnReleaseService）用于下线服务。
用户发布服务到某个环境后，此服务中的 API 方可被调用者进行调用，当用户需要将此服务从发布环境中下线时，可调用此 API。下线后的服务不可被调用。
     * @param req UnReleaseServiceRequest
     * @return UnReleaseServiceResponse
     * @throws TencentCloudSDKException
     */
    public UnReleaseServiceResponse UnReleaseService(UnReleaseServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnReleaseServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnReleaseServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnReleaseService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateApiKey）用于更换用户已创建的一对 API 密钥。
     * @param req UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateApiKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateService）用于从服务发布的环境中运行版本切换到特定版本。用户在使用 API 网关创建服务并发布服务到某个环境后，多因为开发过程会产生多个版本，此时可调用本接口。
     * @param req UpdateServiceRequest
     * @return UpdateServiceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServiceResponse UpdateService(UpdateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
