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
package com.tencentcloudapi.gse.v20191112;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gse.v20191112.models.*;

public class GseClient extends AbstractClient{
    private static String endpoint = "gse.tencentcloudapi.com";
    private static String version = "2019-11-12";

    public GseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GseClient(Credential credential, String region, ClientProfile profile) {
        super(GseClient.endpoint, GseClient.version, credential, region, profile);
    }

    /**
     *本接口（AttachCcnInstances）用于关联云联网实例
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAlias）用于创建别名
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAsset）用于创建生成包。
通过获取上传cos的临时秘钥，将文件上传至cos，然后将生成包的zip名称下发给[CreateAsset](https://tcloud-dev.oa.com/document/product/1139/46582?!preview&!document=1)完成接口创建。上传文件至 cos支持俩种方式：

 a.获取预签名， cos 调用上传 （小的文件 5G以内， 前端 1G 以内）  
  1). [GetUploadCredentials](https://tcloud-dev.oa.com/document/product/1139/39889?!preview&!document=1)  
  2). 使用 cos API 上传 （cos sdk ）  
 b.新的方式，适用场景，（大文件）  
  1). [GetUploadCredentials](https://tcloud-dev.oa.com/document/product/1139/39889?!preview&!document=1) （获取上传 bucket  第一次调用需要，后续可以不用调用 ）  
  2). GetUploadFederationToken（获取临时密钥）  
  3). 分块上传 API （cos sdk 有集成 upload_file）  
     * @param req CreateAssetRequest
     * @return CreateAssetResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetResponse CreateAsset(CreateAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAsset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateGameServerSession）用于创建游戏服务会话
     * @param req CreateGameServerSessionRequest
     * @return CreateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionResponse CreateGameServerSession(CreateGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGameServerSessionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGameServerSessionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateGameServerSession"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAlias）用于删除别名
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAsset）用于删除生成包
     * @param req DeleteAssetRequest
     * @return DeleteAssetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetResponse DeleteAsset(DeleteAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAssetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAssetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAsset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteFleet）用于删除服务器舰队
     * @param req DeleteFleetRequest
     * @return DeleteFleetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFleetResponse DeleteFleet(DeleteFleetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFleetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFleetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFleet"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteScalingPolicy）用于删除扩缩容配置
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScalingPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScalingPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteScalingPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAlias）用于获取别名详情
     * @param req DescribeAliasRequest
     * @return DescribeAliasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasResponse DescribeAlias(DescribeAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAsset）获取生成包信息
     * @param req DescribeAssetRequest
     * @return DescribeAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetResponse DescribeAsset(DescribeAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAsset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAssets）用于获取生成包列表
     * @param req DescribeAssetsRequest
     * @return DescribeAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetsResponse DescribeAssets(DescribeAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAssets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnInstances）用于查询云联网实例
     * @param req DescribeCcnInstancesRequest
     * @return DescribeCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnInstancesResponse DescribeCcnInstances(DescribeCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetAttributes）用于查询服务器舰队属性
     * @param req DescribeFleetAttributesRequest
     * @return DescribeFleetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetAttributesResponse DescribeFleetAttributes(DescribeFleetAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFleetAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetEvents）用于查询部署服务器舰队相关的事件列表
     * @param req DescribeFleetEventsRequest
     * @return DescribeFleetEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetEventsResponse DescribeFleetEvents(DescribeFleetEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetEventsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetEventsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFleetEvents"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetPortSettings）用于获取服务器舰队安全组信息
     * @param req DescribeFleetPortSettingsRequest
     * @return DescribeFleetPortSettingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetPortSettingsResponse DescribeFleetPortSettings(DescribeFleetPortSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetPortSettingsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetPortSettingsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFleetPortSettings"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetUtilization）用于查询服务器舰队的利用率信息
     * @param req DescribeFleetUtilizationRequest
     * @return DescribeFleetUtilizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetUtilizationResponse DescribeFleetUtilization(DescribeFleetUtilizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetUtilizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetUtilizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFleetUtilization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessionDetails）用于查询游戏服务器会话详情列表
     * @param req DescribeGameServerSessionDetailsRequest
     * @return DescribeGameServerSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionDetailsResponse DescribeGameServerSessionDetails(DescribeGameServerSessionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGameServerSessionDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessionPlacement）用于查询游戏服务器会话的放置
     * @param req DescribeGameServerSessionPlacementRequest
     * @return DescribeGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionPlacementResponse DescribeGameServerSessionPlacement(DescribeGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionPlacementResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionPlacementResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGameServerSessionPlacement"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessionQueues）用于查询游戏服务器会话队列
     * @param req DescribeGameServerSessionQueuesRequest
     * @return DescribeGameServerSessionQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionQueuesResponse DescribeGameServerSessionQueues(DescribeGameServerSessionQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionQueuesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionQueuesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGameServerSessionQueues"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessions）用于查询游戏服务器会话列表
     * @param req DescribeGameServerSessionsRequest
     * @return DescribeGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionsResponse DescribeGameServerSessions(DescribeGameServerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGameServerSessions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstanceTypes）用于获取服务器实例类型列表
     * @param req DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypesResponse DescribeInstanceTypes(DescribeInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTypesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTypesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceTypes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstances）用于查询服务器实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribePlayerSessions）用于获取玩家会话列表
     * @param req DescribePlayerSessionsRequest
     * @return DescribePlayerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayerSessionsResponse DescribePlayerSessions(DescribePlayerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayerSessionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayerSessionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePlayerSessions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRuntimeConfiguration）用于获取服务器舰队运行配置
     * @param req DescribeRuntimeConfigurationRequest
     * @return DescribeRuntimeConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuntimeConfigurationResponse DescribeRuntimeConfiguration(DescribeRuntimeConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuntimeConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuntimeConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRuntimeConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeScalingPolicies）用于查询服务部署的动态扩缩容配置
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScalingPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScalingPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScalingPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUserQuota）获取用户单个模块配额
     * @param req DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotaResponse DescribeUserQuota(DescribeUserQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUserQuotas）用于获取用户配额
     * @param req DescribeUserQuotasRequest
     * @return DescribeUserQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotasResponse DescribeUserQuotas(DescribeUserQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserQuotasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserQuotasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserQuotas"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachCcnInstances）用于解关联云联网实例
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetGameServerSessionLogUrl）用于获取游戏服务器会话的日志URL
     * @param req GetGameServerSessionLogUrlRequest
     * @return GetGameServerSessionLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerSessionLogUrlResponse GetGameServerSessionLogUrl(GetGameServerSessionLogUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGameServerSessionLogUrlResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetGameServerSessionLogUrlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetGameServerSessionLogUrl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetInstanceAccess）用于获取实例登录所需要的凭据
     * @param req GetInstanceAccessRequest
     * @return GetInstanceAccessResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceAccessResponse GetInstanceAccess(GetInstanceAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetInstanceAccessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetInstanceAccessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetInstanceAccess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetUploadCredentials）获取上传文件授权信息。
详细描述：通过[GetUploadCredentials](https://tcloud-dev.oa.com/document/product/1139/39889?!preview&!document=1)接口获取临时秘钥后，使用http put请求将数据上传至cos，然后将生成的生成包zip名称下发给[CreateAsset](https://tcloud-dev.oa.com/document/product/1139/46582?!preview&!document=1)接口进行asset创建
     * @param req GetUploadCredentialsRequest
     * @return GetUploadCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadCredentialsResponse GetUploadCredentials(GetUploadCredentialsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUploadCredentialsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetUploadCredentialsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetUploadCredentials"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetUploadFederationToken）用于 获取生成包上传所需要的临时密钥
     * @param req GetUploadFederationTokenRequest
     * @return GetUploadFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadFederationTokenResponse GetUploadFederationToken(GetUploadFederationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUploadFederationTokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetUploadFederationTokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetUploadFederationToken"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（JoinGameServerSession）用于加入游戏服务器会话
     * @param req JoinGameServerSessionRequest
     * @return JoinGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionResponse JoinGameServerSession(JoinGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<JoinGameServerSessionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<JoinGameServerSessionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "JoinGameServerSession"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListAliases）用于检索帐户下的所有别名
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAliasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAliasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAliases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListFleets）用于获取服务器舰队列表
     * @param req ListFleetsRequest
     * @return ListFleetsResponse
     * @throws TencentCloudSDKException
     */
    public ListFleetsResponse ListFleets(ListFleetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFleetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListFleetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListFleets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PutScalingPolicy）用于设置动态扩缩容配置
     * @param req PutScalingPolicyRequest
     * @return PutScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public PutScalingPolicyResponse PutScalingPolicy(PutScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutScalingPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PutScalingPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PutScalingPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResolveAlias）用于获取别名当前指向的fleetId
     * @param req ResolveAliasRequest
     * @return ResolveAliasResponse
     * @throws TencentCloudSDKException
     */
    public ResolveAliasResponse ResolveAlias(ResolveAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResolveAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResolveAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResolveAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SearchGameServerSessions）用于搜索游戏服务器会话列表
     * @param req SearchGameServerSessionsRequest
     * @return SearchGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public SearchGameServerSessionsResponse SearchGameServerSessions(SearchGameServerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchGameServerSessionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchGameServerSessionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchGameServerSessions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置服务器权重
     * @param req SetServerWeightRequest
     * @return SetServerWeightResponse
     * @throws TencentCloudSDKException
     */
    public SetServerWeightResponse SetServerWeight(SetServerWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetServerWeightResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetServerWeightResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetServerWeight"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartFleetActions）用于启用服务器舰队自动扩缩容
     * @param req StartFleetActionsRequest
     * @return StartFleetActionsResponse
     * @throws TencentCloudSDKException
     */
    public StartFleetActionsResponse StartFleetActions(StartFleetActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartFleetActionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartFleetActionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartFleetActions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartGameServerSessionPlacement）用于开始放置游戏服务器会话
     * @param req StartGameServerSessionPlacementRequest
     * @return StartGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StartGameServerSessionPlacementResponse StartGameServerSessionPlacement(StartGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartGameServerSessionPlacementResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartGameServerSessionPlacementResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartGameServerSessionPlacement"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartMatchPlacement）用于开始匹配放置游戏服务器会话
     * @param req StartMatchPlacementRequest
     * @return StartMatchPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchPlacementResponse StartMatchPlacement(StartMatchPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMatchPlacementResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartMatchPlacementResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartMatchPlacement"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopFleetActions）用于停止服务器舰队自动扩缩容，改为手动扩缩容
     * @param req StopFleetActionsRequest
     * @return StopFleetActionsResponse
     * @throws TencentCloudSDKException
     */
    public StopFleetActionsResponse StopFleetActions(StopFleetActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopFleetActionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopFleetActionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopFleetActions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopGameServerSessionPlacement）用于停止放置游戏服务器会话
     * @param req StopGameServerSessionPlacementRequest
     * @return StopGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StopGameServerSessionPlacementResponse StopGameServerSessionPlacement(StopGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopGameServerSessionPlacementResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopGameServerSessionPlacementResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopGameServerSessionPlacement"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateAlias）用于更新别名的属性
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateAsset）用于修改生成包信息
     * @param req UpdateAssetRequest
     * @return UpdateAssetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssetResponse UpdateAsset(UpdateAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAssetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAssetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAsset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFleetAttributes）用于更新服务器舰队属性
     * @param req UpdateFleetAttributesRequest
     * @return UpdateFleetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetAttributesResponse UpdateFleetAttributes(UpdateFleetAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFleetAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFleetAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateFleetAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFleetPortSettings）用于更新服务器舰队安全组
     * @param req UpdateFleetPortSettingsRequest
     * @return UpdateFleetPortSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetPortSettingsResponse UpdateFleetPortSettings(UpdateFleetPortSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFleetPortSettingsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFleetPortSettingsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateFleetPortSettings"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateGameServerSession）用于更新游戏服务器会话
     * @param req UpdateGameServerSessionRequest
     * @return UpdateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionResponse UpdateGameServerSession(UpdateGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGameServerSessionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGameServerSessionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateGameServerSession"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateRuntimeConfiguration）用于更新服务器舰队配置
     * @param req UpdateRuntimeConfigurationRequest
     * @return UpdateRuntimeConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuntimeConfigurationResponse UpdateRuntimeConfiguration(UpdateRuntimeConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRuntimeConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRuntimeConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateRuntimeConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
