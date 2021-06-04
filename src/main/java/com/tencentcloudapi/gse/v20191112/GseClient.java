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
    private static String service = "gse";
    private static String version = "2019-11-12";

    public GseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GseClient(Credential credential, String region, ClientProfile profile) {
        super(GseClient.endpoint, GseClient.version, credential, region, profile);
    }

    /**
     *本接口（AttachCcnInstances）用于关联云联网实例。
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CopyFleet）用于复制服务器舰队。
     * @param req CopyFleetRequest
     * @return CopyFleetResponse
     * @throws TencentCloudSDKException
     */
    public CopyFleetResponse CopyFleet(CopyFleetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyFleetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopyFleetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyFleet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAlias）用于创建别名。
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAsset）用于创建生成包。
通过获取上传cos的临时密钥，将文件上传至cos，然后将生成包的zip名称下发给本接口完成资源创建。  

上传文件至 cos支持俩种方式：

- 获取预签名方式，COS 简单上传
    1. [GetUploadCredentials](https://cloud.tencent.com/document/product/1165/48727) 获取预签名信息
    2. 使用 COS API 进行上传([参考文档](https://cloud.tencent.com/document/product/436/7749))
-  临时密钥方式，COS 简单上传或者分块上传方式
    1. [GetUploadCredentials](https://cloud.tencent.com/document/product/1165/48727)（获取上传 bucket  第一次调用需要，后续可以不用调用）
    2. [GetUploadFederationToken](https://cloud.tencent.com/document/product/1165/48742) 获取临时密钥
    3. 使用 COS API 进行上传([参考文档](https://cloud.tencent.com/document/product/436/7742))

具体使用场景可以参考 [GetUploadCredentials](https://cloud.tencent.com/document/product/1165/48727) ,  [GetUploadFederationToken](https://cloud.tencent.com/document/product/1165/48742)和下面 CreateAsset 示例。  
     * @param req CreateAssetRequest
     * @return CreateAssetResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetResponse CreateAsset(CreateAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAssetWithImage）用于创建生成包镜像信息。
     * @param req CreateAssetWithImageRequest
     * @return CreateAssetWithImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetWithImageResponse CreateAssetWithImage(CreateAssetWithImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetWithImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetWithImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetWithImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateFleet）用于创建服务器舰队。
     * @param req CreateFleetRequest
     * @return CreateFleetResponse
     * @throws TencentCloudSDKException
     */
    public CreateFleetResponse CreateFleet(CreateFleetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFleetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFleetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFleet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateGameServerSession）用于创建游戏服务会话。
     * @param req CreateGameServerSessionRequest
     * @return CreateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionResponse CreateGameServerSession(CreateGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGameServerSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGameServerSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGameServerSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateGameServerSessionQueue）用于创建游戏服务器会话队列。
     * @param req CreateGameServerSessionQueueRequest
     * @return CreateGameServerSessionQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionQueueResponse CreateGameServerSessionQueue(CreateGameServerSessionQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGameServerSessionQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGameServerSessionQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGameServerSessionQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAlias）用于删除别名。
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAsset）用于删除生成包。
     * @param req DeleteAssetRequest
     * @return DeleteAssetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetResponse DeleteAsset(DeleteAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteFleet）用于删除服务器舰队。
     * @param req DeleteFleetRequest
     * @return DeleteFleetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFleetResponse DeleteFleet(DeleteFleetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFleetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFleetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFleet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteGameServerSessionQueue）用于删除游戏服务器会话队列。
     * @param req DeleteGameServerSessionQueueRequest
     * @return DeleteGameServerSessionQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGameServerSessionQueueResponse DeleteGameServerSessionQueue(DeleteGameServerSessionQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGameServerSessionQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGameServerSessionQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGameServerSessionQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteScalingPolicy）用于删除服务器舰队的扩缩容策略。
通过服务器舰队ID和策略名称删除服务器舰队的扩缩容策略，只传递服务器舰队ID时，会将这个服务器舰队下的所有策略都删除。
传递策略名称时，单独删除策略名称对应的策略。
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteTimerScalingPolicy）用于删除fleet下的定时器。

     * @param req DeleteTimerScalingPolicyRequest
     * @return DeleteTimerScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimerScalingPolicyResponse DeleteTimerScalingPolicy(DeleteTimerScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTimerScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTimerScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTimerScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAlias）用于获取别名详情。
     * @param req DescribeAliasRequest
     * @return DescribeAliasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasResponse DescribeAlias(DescribeAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAsset）获取生成包信息。
     * @param req DescribeAssetRequest
     * @return DescribeAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetResponse DescribeAsset(DescribeAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAssetSystems）用于获取生成包支持的操作系统。
     * @param req DescribeAssetSystemsRequest
     * @return DescribeAssetSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSystemsResponse DescribeAssetSystems(DescribeAssetSystemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetSystemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetSystemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetSystems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAssets）用于获取生成包列表。
     * @param req DescribeAssetsRequest
     * @return DescribeAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetsResponse DescribeAssets(DescribeAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnInstances）用于查询云联网实例。
     * @param req DescribeCcnInstancesRequest
     * @return DescribeCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnInstancesResponse DescribeCcnInstances(DescribeCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetAttributes）用于查询服务器舰队属性。
     * @param req DescribeFleetAttributesRequest
     * @return DescribeFleetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetAttributesResponse DescribeFleetAttributes(DescribeFleetAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetCapacity）用于查询服务部署容量配置。
     * @param req DescribeFleetCapacityRequest
     * @return DescribeFleetCapacityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetCapacityResponse DescribeFleetCapacity(DescribeFleetCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetCapacityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetCapacityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetCapacity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetEvents）用于查询服务器舰队相关的事件列表。
     * @param req DescribeFleetEventsRequest
     * @return DescribeFleetEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetEventsResponse DescribeFleetEvents(DescribeFleetEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetPortSettings）用于获取服务器舰队安全组信息。
     * @param req DescribeFleetPortSettingsRequest
     * @return DescribeFleetPortSettingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetPortSettingsResponse DescribeFleetPortSettings(DescribeFleetPortSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetPortSettingsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetPortSettingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetPortSettings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetRelatedResources）用于获取与游戏服务器舰队关联的资源信息，如别名、队列
     * @param req DescribeFleetRelatedResourcesRequest
     * @return DescribeFleetRelatedResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetRelatedResourcesResponse DescribeFleetRelatedResources(DescribeFleetRelatedResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetRelatedResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetRelatedResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetRelatedResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetStatisticDetails）用于查询服务部署统计详情。
     * @param req DescribeFleetStatisticDetailsRequest
     * @return DescribeFleetStatisticDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetStatisticDetailsResponse DescribeFleetStatisticDetails(DescribeFleetStatisticDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetStatisticDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetStatisticDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetStatisticDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetStatisticFlows）用于查询服务部署统计用量。
     * @param req DescribeFleetStatisticFlowsRequest
     * @return DescribeFleetStatisticFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetStatisticFlowsResponse DescribeFleetStatisticFlows(DescribeFleetStatisticFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetStatisticFlowsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetStatisticFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetStatisticFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetStatisticSummary）用于查询服务部署统计汇总信息。
     * @param req DescribeFleetStatisticSummaryRequest
     * @return DescribeFleetStatisticSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetStatisticSummaryResponse DescribeFleetStatisticSummary(DescribeFleetStatisticSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetStatisticSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetStatisticSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetStatisticSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFleetUtilization）用于查询服务器舰队的利用率信息。
     * @param req DescribeFleetUtilizationRequest
     * @return DescribeFleetUtilizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetUtilizationResponse DescribeFleetUtilization(DescribeFleetUtilizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFleetUtilizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFleetUtilizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFleetUtilization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessionDetails）用于查询游戏服务器会话详情列表。
     * @param req DescribeGameServerSessionDetailsRequest
     * @return DescribeGameServerSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionDetailsResponse DescribeGameServerSessionDetails(DescribeGameServerSessionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessionDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessionPlacement）用于查询游戏服务器会话的放置。
     * @param req DescribeGameServerSessionPlacementRequest
     * @return DescribeGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionPlacementResponse DescribeGameServerSessionPlacement(DescribeGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionPlacementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionPlacementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessionPlacement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessionQueues）用于查询游戏服务器会话队列。
     * @param req DescribeGameServerSessionQueuesRequest
     * @return DescribeGameServerSessionQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionQueuesResponse DescribeGameServerSessionQueues(DescribeGameServerSessionQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionQueuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionQueuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessionQueues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGameServerSessions）用于查询游戏服务器会话列表。
     * @param req DescribeGameServerSessionsRequest
     * @return DescribeGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionsResponse DescribeGameServerSessions(DescribeGameServerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGameServerSessionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGameServerSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGameServerSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstanceLimit）用于查询用户实例数限额。
     * @param req DescribeInstanceLimitRequest
     * @return DescribeInstanceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLimitResponse DescribeInstanceLimit(DescribeInstanceLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLimitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstanceTypes）用于获取服务器实例类型列表。
     * @param req DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypesResponse DescribeInstanceTypes(DescribeInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstances）用于查询服务器实例列表。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstancesExtend）用于查询实例扩展信息列表。
     * @param req DescribeInstancesExtendRequest
     * @return DescribeInstancesExtendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesExtendResponse DescribeInstancesExtend(DescribeInstancesExtendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesExtendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesExtendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesExtend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribePlayerSessions）用于获取玩家会话列表。
     * @param req DescribePlayerSessionsRequest
     * @return DescribePlayerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayerSessionsResponse DescribePlayerSessions(DescribePlayerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayerSessionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayerSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlayerSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRuntimeConfiguration）用于获取服务器舰队运行配置。
     * @param req DescribeRuntimeConfigurationRequest
     * @return DescribeRuntimeConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuntimeConfigurationResponse DescribeRuntimeConfiguration(DescribeRuntimeConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuntimeConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuntimeConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuntimeConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeScalingPolicies）用于查询服务器舰队的动态扩缩容策略列表。
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScalingPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScalingPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScalingPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTimerScalingPolicies）用于查询fleet下的定时器列表。可以通过fleetid，定时器名称分页查询。

     * @param req DescribeTimerScalingPoliciesRequest
     * @return DescribeTimerScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimerScalingPoliciesResponse DescribeTimerScalingPolicies(DescribeTimerScalingPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimerScalingPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimerScalingPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimerScalingPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeUserQuota）获取用户单个模块配额。
     * @param req DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotaResponse DescribeUserQuota(DescribeUserQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachCcnInstances）用于解关联云联网实例。
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EndGameServerSessionAndProcess）用于终止游戏服务器会话和对应的进程，适用于时限保护和不保护。
     * @param req EndGameServerSessionAndProcessRequest
     * @return EndGameServerSessionAndProcessResponse
     * @throws TencentCloudSDKException
     */
    public EndGameServerSessionAndProcessResponse EndGameServerSessionAndProcess(EndGameServerSessionAndProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EndGameServerSessionAndProcessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EndGameServerSessionAndProcessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EndGameServerSessionAndProcess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取游戏服务器实例的日志URL。
     * @param req GetGameServerInstanceLogUrlRequest
     * @return GetGameServerInstanceLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerInstanceLogUrlResponse GetGameServerInstanceLogUrl(GetGameServerInstanceLogUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGameServerInstanceLogUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGameServerInstanceLogUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGameServerInstanceLogUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetGameServerSessionLogUrl）用于获取游戏服务器会话的日志URL。
     * @param req GetGameServerSessionLogUrlRequest
     * @return GetGameServerSessionLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerSessionLogUrlResponse GetGameServerSessionLogUrl(GetGameServerSessionLogUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGameServerSessionLogUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetGameServerSessionLogUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetGameServerSessionLogUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetInstanceAccess）用于获取实例登录所需要的凭据。
     * @param req GetInstanceAccessRequest
     * @return GetInstanceAccessResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceAccessResponse GetInstanceAccess(GetInstanceAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetInstanceAccessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetInstanceAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetInstanceAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetUploadCredentials）获取上传文件授权信息。
通过 [GetUploadCredentials](https://cloud.tencent.com/document/product/1165/48727) 接口获取临时授权信息后，调用 COS API将数据上传，根据上传的 BucketKey 信息进行生成包 [CreateAsset](https://cloud.tencent.com/document/product/1165/48731) 的创建。参考下面的示例部分。
     * @param req GetUploadCredentialsRequest
     * @return GetUploadCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadCredentialsResponse GetUploadCredentials(GetUploadCredentialsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUploadCredentialsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUploadCredentialsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUploadCredentials");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetUploadFederationToken）用于 获取生成包上传所需要的临时密钥。
     * @param req GetUploadFederationTokenRequest
     * @return GetUploadFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadFederationTokenResponse GetUploadFederationToken(GetUploadFederationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUploadFederationTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUploadFederationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUploadFederationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（JoinGameServerSession）用于加入游戏服务器会话。
     * @param req JoinGameServerSessionRequest
     * @return JoinGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionResponse JoinGameServerSession(JoinGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<JoinGameServerSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<JoinGameServerSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "JoinGameServerSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（JoinGameServerSessionBatch）用于批量加入游戏服务器会话。
     * @param req JoinGameServerSessionBatchRequest
     * @return JoinGameServerSessionBatchResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionBatchResponse JoinGameServerSessionBatch(JoinGameServerSessionBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<JoinGameServerSessionBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<JoinGameServerSessionBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "JoinGameServerSessionBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListAliases）用于检索帐户下的所有别名。
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAliasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAliasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAliases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListFleets）用于获取服务器舰队列表。
     * @param req ListFleetsRequest
     * @return ListFleetsResponse
     * @throws TencentCloudSDKException
     */
    public ListFleetsResponse ListFleets(ListFleetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFleetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListFleetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListFleets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PutScalingPolicy）用于设置服务器舰队的动态扩缩容策略。

通过此接口可以增加或者更新服务器舰队的扩缩容策略。
服务器舰队可以有多个扩缩容策略，但是只有一个TargetBased基于目标的策略。

## TargetBased基于目标的策略

TargetBased策略计算的指标是PercentAvailableGameSessions，这个策略用于计算当前服务器舰队应该有多少个CVM实例来支撑和分配游戏会话。
PercentAvailableGameSessions表示服务器舰队的缓冲值；用来计算服务器舰队在当前容量下可以处理的额外玩家会话数量。
如果使用基于目标的策略，可以按照业务需求设置一个期望的缓冲区大小，GSE的会按照配置的策略来扩容和缩容到这个目标要求的CVM实例数。

例如：客户可以设置同时承载100个游戏会话的服务器舰队预留10%的缓冲区。GSE会按照这个策略执行时，若服务器舰队的可用容量低于或高于10%的游戏服务器会话时，执行扩缩容动作。
GSE按照策略期望，扩容新CVM实例或缩容未使用的实例，保持在10%左右的缓冲区。

#### 请求参数取值说明

```
Name取值策略名称，
FleetId取值为选择的服务器舰队ID，
PolicyType取值TargetBased，
MetricName取值PercentAvailableGameSessions，
TargetConfiguration取值为所需的缓冲区值对象，
其他参数不用传递。
请求成功时，将返回策略名称。扩缩容策略在成功创建立即自动生效。
```



## RuleBased基于规则的策略

####  请求参数取值说明

```
Name取值策略名称，
FleetId取值为选择的服务器舰队ID，
PolicyType取值RuleBased，
MetricName取值（AvailableGameServerSessions，AvailableCustomCount，PercentAvailableCustomCount，ActiveInstances，IdleInstances，CurrentPlayerSessions和PercentIdleInstances）说明见备注1，
其他参数不用传递。
ComparisonOperator取值为 >,>=,<,<=这4个比较符号中的一个，
Threshold取值为指标MetricName达到的阈值是多少，
EvaluationPeriods取值为指标MetricName达到的阈值持续了多少时间，单位是分钟，
ScalingAdjustmentType取值（ChangeInCapacity，ExactCapacity，PercentChangeInCapacity）说明见备注2
ScalingAdjustment取值为指标MetricName达到的阈值的条件后，扩缩容多少个CVM实例。
请求成功时，将返回策略名称。扩缩容策略在成功创建立即自动生效。
```

规则执行的条件表达式如下所示：

```
若 [MetricName] 是 [ComparisonOperator] [Threshold] 持续 [EvaluationPeriods] 分钟, 则 [ScalingAdjustmentType] 调整 [ScalingAdjustment]个实例。
```
```
if [MetricName] ComparisonOperator [Threshold] for [EvaluationPeriods] minutes, then scaling up by/to  [ScalingAdjustment]
```
例如1：如果当前AvailableCustomCount值大于等于10，持续5分钟，扩容1台CVM实例。
```
ScalingAdjustmentType = ChangeInCapacity
if [AvailableGameServerSessions] >= [10] for [5] minutes, then scaling up [1]
```
例如2：如果当前AvailableGameServerSessions值大于等于200，持续5分钟，扩容到2台CVM实例。
```
ScalingAdjustmentType = ExactCapacity
if [AvailableGameServerSessions] >= [200] for [5] minutes, then scaling to [2]
```
例如3：如果当前AvailableCustomCount值大于等于400，持续5分钟，扩容20%台CVM实例。
当前CVM实例数为10台。扩容20%台CVM实例就是增加 10*20%等于2台
```
ScalingAdjustmentType = PercentChangeInCapacity
if [AvailableGameServerSessions] >= [400] for [5] minutes, then scaling by [currentCVMCount * 20 %]
```
**备注1**

- | 策略名称（MetricName）                                       | 计算公式                                   | 场景                                        | 场景使用举例                                                 |
  | :----------------------------------------------------------- | :----------------------------------------- | :------------------------------------------ | :----------------------------------------------------------- |
  | CurrentPlayerSessions<br>当前玩家数指标                      | = 当前在线的玩家数                         | CVM随着玩家会话数变化做扩缩容。             | 例如：<br>MetricName: CurrentPlayerSessions<br>ComparisonOperator: '<=' <br>Threshold: 300<br/>EvaluationPeriods: 1<br/>ScalingAdjustment: 2<br/>ScalingAdjustment: ChangeInCapacity<br>说明：若当前CurrentPlayerSessions小于等于300，持续1分钟，则扩容2台CVM。 |
  | AvailableGameServerSessions<br>可用游戏服务器会话数          | = 可用游戏服务会话数                       | CVM随着可用游戏会话数变化做扩缩容。         | 例如：<br/>MetricName: AvailableGameServerSessions<br/>ComparisonOperator: '<' <br/>Threshold: 50<br/>EvaluationPeriods: 5<br/>ScalingAdjustment: 2<br/>ScalingAdjustment: ExactCapacity<br/>说明：若当前AvailableGameServerSessions小于50，持续5分钟，则扩容到2台CVM。 |
  | PercentAvailableGameServerSessions<br>可用游戏服务器会话百分比 | = 空闲游戏会话数 / 所有的游戏会话数 * 100% | CVM随着可用游戏会话数百分比变化做扩缩容。   | 例如：<br/>MetricName: PercentAvailableGameServerSessions<br/>ComparisonOperator: '<' <br/>Threshold: 50<br/>EvaluationPeriods: 1<br/>ScalingAdjustment: -30<br/>ScalingAdjustment: PercentChangeInCapacity<br/>说明：若当前PercentAvailableGameServerSessions小于50%，持续1分钟，则缩容当前实例数30%台CVM。 |
  | AvailableCustomCount<br>可用客户自定义数指标                 | = 客户自定义的数                           | CVM随着可用客户自定义数变化做扩缩容。       | 例如：<br/>MetricName: AvailableCustomCount<br/>ComparisonOperator: '>=' <br/>Threshold: 6<br/>EvaluationPeriods: 3<br/>ScalingAdjustment: -1<br/>ScalingAdjustment: ExactCapacity<br/>说明：若当前AvailableCustomCount大于等于6，持续3分钟，则缩容到1台CVM。 |
  | PercentAvailableCustomCount<br>可用客户自定义数百分比        | = 客户自定义数 / 客户最大自定义数* 100%    | CVM随着可用客户自定义数百分比变化做扩缩容。 | 例如：<br/>MetricName: PercentAvailableCustomCount<br/>ComparisonOperator: '<' <br/>Threshold: 15<br/>EvaluationPeriods: 3<br/>ScalingAdjustment: 1<br/>ScalingAdjustment: ChangeInCapacity<br/>说明：若当前PercentAvailableCustomCount小于15%，持续3分钟，则扩容1台CVM。 |
  | ActiveInstances<br>活跃实例数指标                            | = 总实例数 - 缩容中的实例数                | CVM随着活跃实例数变化做扩缩容。             | 例如：<br/>MetricName: ActiveInstances<br/>ComparisonOperator: '<' <br/>Threshold: 3<br/>EvaluationPeriods: 1<br/>ScalingAdjustment: 3<br/>ScalingAdjustment: ExactCapacity<br/>说明：若当前ActiveInstances小于3台，持续1分钟，则扩容保留到3台CVM。 |
  | IdleInstances<br>空闲实例数指标                              | = 未使用的进程数 / 每实例进程数            | CVM随着空闲实例数变化做扩缩容。             | 例如：<br/>MetricName: IdleInstances<br/>ComparisonOperator: '<' <br/>Threshold: 2<br/>EvaluationPeriods: 3<br/>ScalingAdjustment: 1<br/>ScalingAdjustment: ChangeInCapacity<br/>说明：若当前IdleInstances小于2台，持续3分钟，则扩容1台CVM。 |
  | PercentIdleInstances<br>空闲实例百分比                       | = IdleInstances / ActiveInstances * 100%   | CVM随着空闲实例百分比变化做扩缩容。         | 例如：<br/>MetricName: PercentIdleInstances<br/>ComparisonOperator: '<' <br/>Threshold: 50<br/>EvaluationPeriods: 3<br/>ScalingAdjustment: 1<br/>ScalingAdjustment: ChangeInCapacity<br/>说明：若当前PercentIdleInstances小于50%，持续3分钟，则扩容1台CVM。 |



**备注2**

**ChangeInCapacity**

    当前CVM实例个数的扩容或缩容的调整值。正值按值扩容，负值按值缩容。

**ExactCapacity**

    把当前CVM实例个数调整为ScalingAdjustment设置的CVM实例数。

**PercentChangeInCapacity**

    按比例增加或减少的百分比。正值按比例扩容，负值按比例缩容；例如，值“-10”将按10%的比例缩容CVM实例。
     * @param req PutScalingPolicyRequest
     * @return PutScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public PutScalingPolicyResponse PutScalingPolicy(PutScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PutTimerScalingPolicy）用于给fleet创建或更新定时器。

填写字段timer_id，表示更新；不填字段timer_id表示新增。

     * @param req PutTimerScalingPolicyRequest
     * @return PutTimerScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public PutTimerScalingPolicyResponse PutTimerScalingPolicy(PutTimerScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutTimerScalingPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutTimerScalingPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutTimerScalingPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResolveAlias）用于获取别名当前指向的fleetId。
     * @param req ResolveAliasRequest
     * @return ResolveAliasResponse
     * @throws TencentCloudSDKException
     */
    public ResolveAliasResponse ResolveAlias(ResolveAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResolveAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResolveAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResolveAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SearchGameServerSessions）用于搜索游戏服务器会话列表。
     * @param req SearchGameServerSessionsRequest
     * @return SearchGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public SearchGameServerSessionsResponse SearchGameServerSessions(SearchGameServerSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchGameServerSessionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchGameServerSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchGameServerSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetServerReserved）用于将异常的实例标记为保留，用于问题排查。

字段ReserveValue：0默认值，不保留；1 保留

     * @param req SetServerReservedRequest
     * @return SetServerReservedResponse
     * @throws TencentCloudSDKException
     */
    public SetServerReservedResponse SetServerReserved(SetServerReservedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetServerReservedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetServerReservedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetServerReserved");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetServerWeight）用于设置服务器权重。
     * @param req SetServerWeightRequest
     * @return SetServerWeightResponse
     * @throws TencentCloudSDKException
     */
    public SetServerWeightResponse SetServerWeight(SetServerWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetServerWeightResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetServerWeightResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetServerWeight");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartFleetActions）用于启用服务器舰队自动扩缩容。
     * @param req StartFleetActionsRequest
     * @return StartFleetActionsResponse
     * @throws TencentCloudSDKException
     */
    public StartFleetActionsResponse StartFleetActions(StartFleetActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartFleetActionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartFleetActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartFleetActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartGameServerSessionPlacement）用于开始放置游戏服务器会话。
     * @param req StartGameServerSessionPlacementRequest
     * @return StartGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StartGameServerSessionPlacementResponse StartGameServerSessionPlacement(StartGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartGameServerSessionPlacementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartGameServerSessionPlacementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartGameServerSessionPlacement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopFleetActions）用于停止服务器舰队自动扩缩容，改为手动扩缩容。
     * @param req StopFleetActionsRequest
     * @return StopFleetActionsResponse
     * @throws TencentCloudSDKException
     */
    public StopFleetActionsResponse StopFleetActions(StopFleetActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopFleetActionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopFleetActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopFleetActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopGameServerSessionPlacement）用于停止放置游戏服务器会话。
     * @param req StopGameServerSessionPlacementRequest
     * @return StopGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StopGameServerSessionPlacementResponse StopGameServerSessionPlacement(StopGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopGameServerSessionPlacementResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopGameServerSessionPlacementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopGameServerSessionPlacement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateAlias）用于更新别名的属性。
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateAsset）用于修改生成包信息。
     * @param req UpdateAssetRequest
     * @return UpdateAssetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssetResponse UpdateAsset(UpdateAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateBucketAccelerateOpt）用于开启cos全球加速。
     * @param req UpdateBucketAccelerateOptRequest
     * @return UpdateBucketAccelerateOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketAccelerateOptResponse UpdateBucketAccelerateOpt(UpdateBucketAccelerateOptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateBucketAccelerateOptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateBucketAccelerateOptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateBucketAccelerateOpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateBucketCORSOpt）用于设置cos跨域访问。
     * @param req UpdateBucketCORSOptRequest
     * @return UpdateBucketCORSOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketCORSOptResponse UpdateBucketCORSOpt(UpdateBucketCORSOptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateBucketCORSOptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateBucketCORSOptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateBucketCORSOpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFleetAttributes）用于更新服务器舰队属性。
     * @param req UpdateFleetAttributesRequest
     * @return UpdateFleetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetAttributesResponse UpdateFleetAttributes(UpdateFleetAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFleetAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFleetAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFleetAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFleetCapacity）用于更新服务器舰队容量配置。
     * @param req UpdateFleetCapacityRequest
     * @return UpdateFleetCapacityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetCapacityResponse UpdateFleetCapacity(UpdateFleetCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFleetCapacityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFleetCapacityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFleetCapacity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFleetName）用于更新服务器舰队名称。
     * @param req UpdateFleetNameRequest
     * @return UpdateFleetNameResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetNameResponse UpdateFleetName(UpdateFleetNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFleetNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFleetNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFleetName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFleetPortSettings）用于更新服务器舰队安全组。
     * @param req UpdateFleetPortSettingsRequest
     * @return UpdateFleetPortSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetPortSettingsResponse UpdateFleetPortSettings(UpdateFleetPortSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFleetPortSettingsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFleetPortSettingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFleetPortSettings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateGameServerSession）用于更新游戏服务器会话。
     * @param req UpdateGameServerSessionRequest
     * @return UpdateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionResponse UpdateGameServerSession(UpdateGameServerSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGameServerSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGameServerSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGameServerSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateGameServerSessionQueue）用于修改游戏服务器会话队列。
     * @param req UpdateGameServerSessionQueueRequest
     * @return UpdateGameServerSessionQueueResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionQueueResponse UpdateGameServerSessionQueue(UpdateGameServerSessionQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGameServerSessionQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGameServerSessionQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGameServerSessionQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateRuntimeConfiguration）用于更新服务器舰队配置。
     * @param req UpdateRuntimeConfigurationRequest
     * @return UpdateRuntimeConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuntimeConfigurationResponse UpdateRuntimeConfiguration(UpdateRuntimeConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRuntimeConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRuntimeConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRuntimeConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
