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
    private static String service = "apigateway";
    private static String version = "2018-08-08";

    public ApigatewayClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApigatewayClient(Credential credential, String region, ClientProfile profile) {
        super(ApigatewayClient.endpoint, ApigatewayClient.version, credential, region, profile);
    }

    /**
     *绑定插件到API上。
     * @param req AttachPluginRequest
     * @return AttachPluginResponse
     * @throws TencentCloudSDKException
     */
    public AttachPluginResponse AttachPlugin(AttachPluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachPluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachPluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachPlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindApiApp）用于绑定应用到API。
     * @param req BindApiAppRequest
     * @return BindApiAppResponse
     * @throws TencentCloudSDKException
     */
    public BindApiAppResponse BindApiApp(BindApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindEnvironment）用于绑定使用计划到服务或API。
用户在发布服务到某个环境中后，如果 API 需要鉴权，还需要绑定使用计划才能进行调用，此接口用户将使用计划绑定到特定环境。
目前支持绑定使用计划到API，但是同一个服务不能同时存在绑定到服务的使用计划和绑定到API的使用计划，所以对已经绑定过服务级别使用计划的环境，请先使用 服务级别使用计划降级 接口进行降级操作。
     * @param req BindEnvironmentRequest
     * @return BindEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public BindEnvironmentResponse BindEnvironment(BindEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEnvironmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindIPStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindIPStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindSecretIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindSecretIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindSubDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindSubDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *构建 API 文档
     * @param req BuildAPIDocRequest
     * @return BuildAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public BuildAPIDocResponse BuildAPIDoc(BuildAPIDocRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BuildAPIDocResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BuildAPIDocResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BuildAPIDoc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 API 文档
     * @param req CreateAPIDocRequest
     * @return CreateAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public CreateAPIDocResponse CreateAPIDoc(CreateAPIDocRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAPIDocResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAPIDocResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAPIDoc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateApiApp）用于创建应用。
     * @param req CreateApiAppRequest
     * @return CreateApiAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiAppResponse CreateApiApp(CreateApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIPStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIPStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建API网关插件。
     * @param req CreatePluginRequest
     * @return CreatePluginResponse
     * @throws TencentCloudSDKException
     */
    public CreatePluginResponse CreatePlugin(CreatePluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建创建后端通道
     * @param req CreateUpstreamRequest
     * @return CreateUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public CreateUpstreamResponse CreateUpstream(CreateUpstreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUpstreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUpstreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUpstream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 API 文档
     * @param req DeleteAPIDocRequest
     * @return DeleteAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAPIDocResponse DeleteAPIDoc(DeleteAPIDocRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAPIDocResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAPIDocResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAPIDoc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteApiApp）用于删除已经创建的应用。
     * @param req DeleteApiAppRequest
     * @return DeleteApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiAppResponse DeleteApiApp(DeleteApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIPStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIPStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除API网关插件
     * @param req DeletePluginRequest
     * @return DeletePluginResponse
     * @throws TencentCloudSDKException
     */
    public DeletePluginResponse DeletePlugin(DeletePluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceSubDomainMappingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceSubDomainMapping");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除后端通道，需要注意有API绑定时，不允许删除
     * @param req DeleteUpstreamRequest
     * @return DeleteUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUpstreamResponse DeleteUpstream(DeleteUpstreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUpstreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUpstreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUpstream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DemoteServiceUsagePlan）用于将某个服务在某个环境的使用计划，降级到API上。
如果服务内没有API不允许进行此操作。
如果当前环境没有发布，不允许进行此操作。
     * @param req DemoteServiceUsagePlanRequest
     * @return DemoteServiceUsagePlanResponse
     * @throws TencentCloudSDKException
     */
    public DemoteServiceUsagePlanResponse DemoteServiceUsagePlan(DemoteServiceUsagePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DemoteServiceUsagePlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DemoteServiceUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DemoteServiceUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 API 文档详情
     * @param req DescribeAPIDocDetailRequest
     * @return DescribeAPIDocDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIDocDetailResponse DescribeAPIDocDetail(DescribeAPIDocDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAPIDocDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAPIDocDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAPIDocDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 API 文档列表
     * @param req DescribeAPIDocsRequest
     * @return DescribeAPIDocsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIDocsResponse DescribeAPIDocs(DescribeAPIDocsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAPIDocsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAPIDocsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAPIDocs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示插件相关的API列表，包括已绑定的和未绑定的API信息。
     * @param req DescribeAllPluginApisRequest
     * @return DescribeAllPluginApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllPluginApisResponse DescribeAllPluginApis(DescribeAllPluginApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllPluginApisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllPluginApisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllPluginApis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApi）用于查询用户 API 网关的 API 接口的详细信息。​
     * @param req DescribeApiRequest
     * @return DescribeApiResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiResponse DescribeApi(DescribeApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiApp）用于根据应用ID搜索应用。
     * @param req DescribeApiAppRequest
     * @return DescribeApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAppResponse DescribeApiApp(DescribeApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiAppBindApisStatus）查询应用绑定的Api列表。
     * @param req DescribeApiAppBindApisStatusRequest
     * @return DescribeApiAppBindApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAppBindApisStatusResponse DescribeApiAppBindApisStatus(DescribeApiAppBindApisStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiAppBindApisStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiAppBindApisStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiAppBindApisStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiAppsStatus）查询应用列表。
     * @param req DescribeApiAppsStatusRequest
     * @return DescribeApiAppsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAppsStatusResponse DescribeApiAppsStatus(DescribeApiAppsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiAppsStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiAppsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiAppsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiBindApiAppsStatus）查询Api绑定的应用列表。
     * @param req DescribeApiBindApiAppsStatusRequest
     * @return DescribeApiBindApiAppsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiBindApiAppsStatusResponse DescribeApiBindApiAppsStatus(DescribeApiBindApiAppsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiBindApiAppsStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiBindApiAppsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiBindApiAppsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiEnvironmentStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiEnvironmentStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiForApiApp）用于应用使用者查询部署于 API 网关的 API 接口的详细信息。​
     * @param req DescribeApiForApiAppRequest
     * @return DescribeApiForApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiForApiAppResponse DescribeApiForApiApp(DescribeApiForApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiForApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiForApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiForApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeApiKeysStatus）用于查询密钥列表。
当用户创建了多个密钥对时，可使用本接口查询一个或多个 API 密钥信息。
     * @param req DescribeApiKeysStatusRequest
     * @return DescribeApiKeysStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeysStatusResponse DescribeApiKeysStatus(DescribeApiKeysStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiKeysStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiKeysStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiKeysStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApisStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApisStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeExclusiveInstanceDetail）用于查询独享实例详情信息。​
     * @param req DescribeExclusiveInstanceDetailRequest
     * @return DescribeExclusiveInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExclusiveInstanceDetailResponse DescribeExclusiveInstanceDetail(DescribeExclusiveInstanceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExclusiveInstanceDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExclusiveInstanceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExclusiveInstanceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeExclusiveInstances）用于查询独享实例列表信息。​
     * @param req DescribeExclusiveInstancesRequest
     * @return DescribeExclusiveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExclusiveInstancesResponse DescribeExclusiveInstances(DescribeExclusiveInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExclusiveInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExclusiveInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExclusiveInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIPStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeIPStrategyApisStatus）用于查询IP策略可以绑定的API列表。即服务下所有API和该策略已绑定API的差集。
     * @param req DescribeIPStrategyApisStatusRequest
     * @return DescribeIPStrategyApisStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStrategyApisStatusResponse DescribeIPStrategyApisStatus(DescribeIPStrategyApisStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPStrategyApisStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStrategyApisStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIPStrategyApisStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStrategysStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIPStrategysStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口DescribeLogSearch用于搜索日志
     * @param req DescribeLogSearchRequest
     * @return DescribeLogSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSearchResponse DescribeLogSearch(DescribeLogSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogSearchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogSearchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogSearch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示插件详情，支持按照插件ID进行。
     * @param req DescribePluginRequest
     * @return DescribePluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginResponse DescribePlugin(DescribePluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定插件下绑定的API信息
     * @param req DescribePluginApisRequest
     * @return DescribePluginApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginApisResponse DescribePluginApis(DescribePluginApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePluginApisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePluginApisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePluginApis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示插件列表和详情，支持分页，支持按照插件类型查询，支持按照插件ID批量查询，支持按照插件名称查询。
     * @param req DescribePluginsRequest
     * @return DescribePluginsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginsResponse DescribePlugins(DescribePluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePluginsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceEnvironmentList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentReleaseHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceEnvironmentReleaseHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceEnvironmentStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceEnvironmentStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceForApiApp）用于应用使用者查询一个服务的详细信息、包括服务的描述、域名、协议等信息。
     * @param req DescribeServiceForApiAppRequest
     * @return DescribeServiceForApiAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceForApiAppResponse DescribeServiceForApiApp(DescribeServiceForApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceForApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceForApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceForApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceReleaseVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceReleaseVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceSubDomainMappingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceSubDomainMappings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceSubDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceSubDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServicesStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServicesStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询后端通道所绑定的API列表
     * @param req DescribeUpstreamBindApisRequest
     * @return DescribeUpstreamBindApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpstreamBindApisResponse DescribeUpstreamBindApis(DescribeUpstreamBindApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUpstreamBindApisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUpstreamBindApisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUpstreamBindApis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询后端通道列表详情
     * @param req DescribeUpstreamsRequest
     * @return DescribeUpstreamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpstreamsResponse DescribeUpstreams(DescribeUpstreamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUpstreamsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUpstreamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUpstreams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsagePlanEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlanSecretIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsagePlanSecretIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsagePlansStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsagePlansStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除插件与API绑定
     * @param req DetachPluginRequest
     * @return DetachPluginResponse
     * @throws TencentCloudSDKException
     */
    public DetachPluginResponse DetachPlugin(DetachPluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachPluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachPluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachPlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateApiDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateApiDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 API 文档
     * @param req ModifyAPIDocRequest
     * @return ModifyAPIDocResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAPIDocResponse ModifyAPIDoc(ModifyAPIDocRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAPIDocResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAPIDocResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAPIDoc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyApiApp）用于修改已经创建的应用。
     * @param req ModifyApiAppRequest
     * @return ModifyApiAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiAppResponse ModifyApiApp(ModifyApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiEnvironmentStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApiEnvironmentStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiIncrementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApiIncrement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyExclusiveInstance）用于修改独享实例信息。​
     * @param req ModifyExclusiveInstanceRequest
     * @return ModifyExclusiveInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExclusiveInstanceResponse ModifyExclusiveInstance(ModifyExclusiveInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyExclusiveInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyExclusiveInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyExclusiveInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIPStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIPStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改API网关插件。
     * @param req ModifyPluginRequest
     * @return ModifyPluginResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPluginResponse ModifyPlugin(ModifyPluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceEnvironmentStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceEnvironmentStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改后端通道
     * @param req ModifyUpstreamRequest
     * @return ModifyUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUpstreamResponse ModifyUpstream(ModifyUpstreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUpstreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUpstreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUpstream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUsagePlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUsagePlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置API文档密码
     * @param req ResetAPIDocPasswordRequest
     * @return ResetAPIDocPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAPIDocPasswordResponse ResetAPIDocPassword(ResetAPIDocPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAPIDocPasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAPIDocPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetAPIDocPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindIPStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindIPStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindSecretIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindSecretIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnBindSubDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnBindSubDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnReleaseServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnReleaseService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnbindApiApp）用于解除应用和API绑定。
     * @param req UnbindApiAppRequest
     * @return UnbindApiAppResponse
     * @throws TencentCloudSDKException
     */
    public UnbindApiAppResponse UnbindApiApp(UnbindApiAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindApiAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindApiAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindApiApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateApiAppKey）用于更新应用密钥。
     * @param req UpdateApiAppKeyRequest
     * @return UpdateApiAppKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiAppKeyResponse UpdateApiAppKey(UpdateApiAppKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiAppKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiAppKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApiAppKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApiKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
