/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（AttachCcnInstances）用于关联云联网实例。
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachCcnInstances", AttachCcnInstancesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CopyFleet）用于复制服务器舰队。
     * @param req CopyFleetRequest
     * @return CopyFleetResponse
     * @throws TencentCloudSDKException
     */
    public CopyFleetResponse CopyFleet(CopyFleetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyFleet", CopyFleetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CreateAlias）用于创建别名。
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlias", CreateAliasResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CreateAsset）用于创建生成包。
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAsset", CreateAssetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CreateAssetWithImage）用于创建生成包镜像信息。
     * @param req CreateAssetWithImageRequest
     * @return CreateAssetWithImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetWithImageResponse CreateAssetWithImage(CreateAssetWithImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetWithImage", CreateAssetWithImageResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CreateFleet）用于创建服务器舰队。
     * @param req CreateFleetRequest
     * @return CreateFleetResponse
     * @throws TencentCloudSDKException
     */
    public CreateFleetResponse CreateFleet(CreateFleetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFleet", CreateFleetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CreateGameServerSession）用于创建游戏服务会话。
     * @param req CreateGameServerSessionRequest
     * @return CreateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionResponse CreateGameServerSession(CreateGameServerSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGameServerSession", CreateGameServerSessionResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（CreateGameServerSessionQueue）用于创建游戏服务器会话队列。
     * @param req CreateGameServerSessionQueueRequest
     * @return CreateGameServerSessionQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateGameServerSessionQueueResponse CreateGameServerSessionQueue(CreateGameServerSessionQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGameServerSessionQueue", CreateGameServerSessionQueueResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DeleteAlias）用于删除别名。
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlias", DeleteAliasResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DeleteAsset）用于删除生成包。
     * @param req DeleteAssetRequest
     * @return DeleteAssetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetResponse DeleteAsset(DeleteAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAsset", DeleteAssetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DeleteFleet）用于删除服务器舰队。
     * @param req DeleteFleetRequest
     * @return DeleteFleetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFleetResponse DeleteFleet(DeleteFleetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFleet", DeleteFleetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DeleteGameServerSessionQueue）用于删除游戏服务器会话队列。
     * @param req DeleteGameServerSessionQueueRequest
     * @return DeleteGameServerSessionQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGameServerSessionQueueResponse DeleteGameServerSessionQueue(DeleteGameServerSessionQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGameServerSessionQueue", DeleteGameServerSessionQueueResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DeleteScalingPolicy）用于删除服务器舰队的扩缩容策略。
通过服务器舰队ID和策略名称删除服务器舰队的扩缩容策略，只传递服务器舰队ID时，会将这个服务器舰队下的所有策略都删除。
传递策略名称时，单独删除策略名称对应的策略。
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScalingPolicy", DeleteScalingPolicyResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DeleteTimerScalingPolicy）用于删除fleet下的定时器。

     * @param req DeleteTimerScalingPolicyRequest
     * @return DeleteTimerScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimerScalingPolicyResponse DeleteTimerScalingPolicy(DeleteTimerScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTimerScalingPolicy", DeleteTimerScalingPolicyResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeAlias）用于获取别名详情。
     * @param req DescribeAliasRequest
     * @return DescribeAliasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasResponse DescribeAlias(DescribeAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlias", DescribeAliasResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeAsset）获取生成包信息。
     * @param req DescribeAssetRequest
     * @return DescribeAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetResponse DescribeAsset(DescribeAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsset", DescribeAssetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeAssetSystems）用于获取生成包支持的操作系统。
     * @param req DescribeAssetSystemsRequest
     * @return DescribeAssetSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSystemsResponse DescribeAssetSystems(DescribeAssetSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSystems", DescribeAssetSystemsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeAssets）用于获取生成包列表。
     * @param req DescribeAssetsRequest
     * @return DescribeAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetsResponse DescribeAssets(DescribeAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssets", DescribeAssetsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeCcnInstances）用于查询云联网实例。
     * @param req DescribeCcnInstancesRequest
     * @return DescribeCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnInstancesResponse DescribeCcnInstances(DescribeCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcnInstances", DescribeCcnInstancesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetAttributes）用于查询服务器舰队属性。
     * @param req DescribeFleetAttributesRequest
     * @return DescribeFleetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetAttributesResponse DescribeFleetAttributes(DescribeFleetAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetAttributes", DescribeFleetAttributesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetCapacity）用于查询服务部署容量配置。
     * @param req DescribeFleetCapacityRequest
     * @return DescribeFleetCapacityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetCapacityResponse DescribeFleetCapacity(DescribeFleetCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetCapacity", DescribeFleetCapacityResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetEvents）用于查询服务器舰队相关的事件列表。
     * @param req DescribeFleetEventsRequest
     * @return DescribeFleetEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetEventsResponse DescribeFleetEvents(DescribeFleetEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetEvents", DescribeFleetEventsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetPortSettings）用于获取服务器舰队安全组信息。
     * @param req DescribeFleetPortSettingsRequest
     * @return DescribeFleetPortSettingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetPortSettingsResponse DescribeFleetPortSettings(DescribeFleetPortSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetPortSettings", DescribeFleetPortSettingsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetRelatedResources）用于获取与游戏服务器舰队关联的资源信息，如别名、队列
     * @param req DescribeFleetRelatedResourcesRequest
     * @return DescribeFleetRelatedResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetRelatedResourcesResponse DescribeFleetRelatedResources(DescribeFleetRelatedResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetRelatedResources", DescribeFleetRelatedResourcesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetStatisticDetails）用于查询服务部署统计详情。
     * @param req DescribeFleetStatisticDetailsRequest
     * @return DescribeFleetStatisticDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetStatisticDetailsResponse DescribeFleetStatisticDetails(DescribeFleetStatisticDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetStatisticDetails", DescribeFleetStatisticDetailsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetStatisticFlows）用于查询服务部署统计用量。
     * @param req DescribeFleetStatisticFlowsRequest
     * @return DescribeFleetStatisticFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetStatisticFlowsResponse DescribeFleetStatisticFlows(DescribeFleetStatisticFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetStatisticFlows", DescribeFleetStatisticFlowsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetStatisticSummary）用于查询服务部署统计汇总信息。
     * @param req DescribeFleetStatisticSummaryRequest
     * @return DescribeFleetStatisticSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetStatisticSummaryResponse DescribeFleetStatisticSummary(DescribeFleetStatisticSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetStatisticSummary", DescribeFleetStatisticSummaryResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeFleetUtilization）用于查询服务器舰队的利用率信息。
     * @param req DescribeFleetUtilizationRequest
     * @return DescribeFleetUtilizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFleetUtilizationResponse DescribeFleetUtilization(DescribeFleetUtilizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFleetUtilization", DescribeFleetUtilizationResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeGameServerSessionDetails）用于查询游戏服务器会话详情列表。
     * @param req DescribeGameServerSessionDetailsRequest
     * @return DescribeGameServerSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionDetailsResponse DescribeGameServerSessionDetails(DescribeGameServerSessionDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessionDetails", DescribeGameServerSessionDetailsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeGameServerSessionPlacement）用于查询游戏服务器会话的放置。
     * @param req DescribeGameServerSessionPlacementRequest
     * @return DescribeGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionPlacementResponse DescribeGameServerSessionPlacement(DescribeGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessionPlacement", DescribeGameServerSessionPlacementResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeGameServerSessionQueues）用于查询游戏服务器会话队列。
     * @param req DescribeGameServerSessionQueuesRequest
     * @return DescribeGameServerSessionQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionQueuesResponse DescribeGameServerSessionQueues(DescribeGameServerSessionQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessionQueues", DescribeGameServerSessionQueuesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeGameServerSessions）用于查询游戏服务器会话列表。
     * @param req DescribeGameServerSessionsRequest
     * @return DescribeGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGameServerSessionsResponse DescribeGameServerSessions(DescribeGameServerSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGameServerSessions", DescribeGameServerSessionsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeInstanceLimit）用于查询用户实例数限额。
     * @param req DescribeInstanceLimitRequest
     * @return DescribeInstanceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLimitResponse DescribeInstanceLimit(DescribeInstanceLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLimit", DescribeInstanceLimitResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeInstanceTypes）用于获取服务器实例类型列表。
     * @param req DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypesResponse DescribeInstanceTypes(DescribeInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTypes", DescribeInstanceTypesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeInstances）用于查询服务器实例列表。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeInstancesExtend）用于查询实例扩展信息列表。
     * @param req DescribeInstancesExtendRequest
     * @return DescribeInstancesExtendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesExtendResponse DescribeInstancesExtend(DescribeInstancesExtendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesExtend", DescribeInstancesExtendResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribePlayerSessions）用于获取玩家会话列表。
     * @param req DescribePlayerSessionsRequest
     * @return DescribePlayerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayerSessionsResponse DescribePlayerSessions(DescribePlayerSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlayerSessions", DescribePlayerSessionsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeRuntimeConfiguration）用于获取服务器舰队运行配置。
     * @param req DescribeRuntimeConfigurationRequest
     * @return DescribeRuntimeConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuntimeConfigurationResponse DescribeRuntimeConfiguration(DescribeRuntimeConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuntimeConfiguration", DescribeRuntimeConfigurationResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeScalingPolicies）用于查询服务器舰队的动态扩缩容策略列表。
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScalingPolicies", DescribeScalingPoliciesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeTimerScalingPolicies）用于查询fleet下的定时器列表。可以通过fleetid，定时器名称分页查询。

     * @param req DescribeTimerScalingPoliciesRequest
     * @return DescribeTimerScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimerScalingPoliciesResponse DescribeTimerScalingPolicies(DescribeTimerScalingPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimerScalingPolicies", DescribeTimerScalingPoliciesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeUserQuota）获取用户单个模块配额。
     * @param req DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotaResponse DescribeUserQuota(DescribeUserQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserQuota", DescribeUserQuotaResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DescribeUserQuotas）用于获取用户配额
     * @param req DescribeUserQuotasRequest
     * @return DescribeUserQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotasResponse DescribeUserQuotas(DescribeUserQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserQuotas", DescribeUserQuotasResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（DetachCcnInstances）用于解关联云联网实例。
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachCcnInstances", DetachCcnInstancesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（EndGameServerSessionAndProcess）用于终止游戏服务器会话和对应的进程，适用于时限保护和不保护。
     * @param req EndGameServerSessionAndProcessRequest
     * @return EndGameServerSessionAndProcessResponse
     * @throws TencentCloudSDKException
     */
    public EndGameServerSessionAndProcessResponse EndGameServerSessionAndProcess(EndGameServerSessionAndProcessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EndGameServerSessionAndProcess", EndGameServerSessionAndProcessResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口用于获取游戏服务器实例的日志URL。
     * @param req GetGameServerInstanceLogUrlRequest
     * @return GetGameServerInstanceLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerInstanceLogUrlResponse GetGameServerInstanceLogUrl(GetGameServerInstanceLogUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGameServerInstanceLogUrl", GetGameServerInstanceLogUrlResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（GetGameServerSessionLogUrl）用于获取游戏服务器会话的日志URL。
     * @param req GetGameServerSessionLogUrlRequest
     * @return GetGameServerSessionLogUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetGameServerSessionLogUrlResponse GetGameServerSessionLogUrl(GetGameServerSessionLogUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGameServerSessionLogUrl", GetGameServerSessionLogUrlResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（GetInstanceAccess）用于获取实例登录所需要的凭据。
     * @param req GetInstanceAccessRequest
     * @return GetInstanceAccessResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceAccessResponse GetInstanceAccess(GetInstanceAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInstanceAccess", GetInstanceAccessResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（GetUploadCredentials）获取上传文件授权信息。
通过 [GetUploadCredentials](https://cloud.tencent.com/document/product/1165/48727) 接口获取临时授权信息后，调用 COS API将数据上传，根据上传的 BucketKey 信息进行生成包 [CreateAsset](https://cloud.tencent.com/document/product/1165/48731) 的创建。参考下面的示例部分。
     * @param req GetUploadCredentialsRequest
     * @return GetUploadCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadCredentialsResponse GetUploadCredentials(GetUploadCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUploadCredentials", GetUploadCredentialsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（GetUploadFederationToken）用于 获取生成包上传所需要的临时密钥。
     * @param req GetUploadFederationTokenRequest
     * @return GetUploadFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadFederationTokenResponse GetUploadFederationToken(GetUploadFederationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUploadFederationToken", GetUploadFederationTokenResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（JoinGameServerSession）用于加入游戏服务器会话。
     * @param req JoinGameServerSessionRequest
     * @return JoinGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionResponse JoinGameServerSession(JoinGameServerSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "JoinGameServerSession", JoinGameServerSessionResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（JoinGameServerSessionBatch）用于批量加入游戏服务器会话。
     * @param req JoinGameServerSessionBatchRequest
     * @return JoinGameServerSessionBatchResponse
     * @throws TencentCloudSDKException
     */
    public JoinGameServerSessionBatchResponse JoinGameServerSessionBatch(JoinGameServerSessionBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "JoinGameServerSessionBatch", JoinGameServerSessionBatchResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（ListAliases）用于检索帐户下的所有别名。
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAliases", ListAliasesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（ListFleets）用于获取服务器舰队列表。
     * @param req ListFleetsRequest
     * @return ListFleetsResponse
     * @throws TencentCloudSDKException
     */
    public ListFleetsResponse ListFleets(ListFleetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFleets", ListFleetsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（PutScalingPolicy）用于设置服务器舰队的动态扩缩容策略。

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
        req.setSkipSign(false);
        return this.internalRequest(req, "PutScalingPolicy", PutScalingPolicyResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（PutTimerScalingPolicy）用于给fleet创建或更新定时器。

填写字段timer_id，表示更新；不填字段timer_id表示新增。

     * @param req PutTimerScalingPolicyRequest
     * @return PutTimerScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public PutTimerScalingPolicyResponse PutTimerScalingPolicy(PutTimerScalingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutTimerScalingPolicy", PutTimerScalingPolicyResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（ResolveAlias）用于获取别名当前指向的fleetId。
     * @param req ResolveAliasRequest
     * @return ResolveAliasResponse
     * @throws TencentCloudSDKException
     */
    public ResolveAliasResponse ResolveAlias(ResolveAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResolveAlias", ResolveAliasResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（SearchGameServerSessions）用于搜索游戏服务器会话列表。
     * @param req SearchGameServerSessionsRequest
     * @return SearchGameServerSessionsResponse
     * @throws TencentCloudSDKException
     */
    public SearchGameServerSessionsResponse SearchGameServerSessions(SearchGameServerSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchGameServerSessions", SearchGameServerSessionsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（SetServerReserved）用于将异常的实例标记为保留，用于问题排查。

字段ReserveValue：0默认值，不保留；1 保留

     * @param req SetServerReservedRequest
     * @return SetServerReservedResponse
     * @throws TencentCloudSDKException
     */
    public SetServerReservedResponse SetServerReserved(SetServerReservedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetServerReserved", SetServerReservedResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（SetServerWeight）用于设置服务器权重。
     * @param req SetServerWeightRequest
     * @return SetServerWeightResponse
     * @throws TencentCloudSDKException
     */
    public SetServerWeightResponse SetServerWeight(SetServerWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetServerWeight", SetServerWeightResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（StartFleetActions）用于启用服务器舰队自动扩缩容。
     * @param req StartFleetActionsRequest
     * @return StartFleetActionsResponse
     * @throws TencentCloudSDKException
     */
    public StartFleetActionsResponse StartFleetActions(StartFleetActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartFleetActions", StartFleetActionsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（StartGameServerSessionPlacement）用于开始放置游戏服务器会话。
     * @param req StartGameServerSessionPlacementRequest
     * @return StartGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StartGameServerSessionPlacementResponse StartGameServerSessionPlacement(StartGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartGameServerSessionPlacement", StartGameServerSessionPlacementResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（StopFleetActions）用于停止服务器舰队自动扩缩容，改为手动扩缩容。
     * @param req StopFleetActionsRequest
     * @return StopFleetActionsResponse
     * @throws TencentCloudSDKException
     */
    public StopFleetActionsResponse StopFleetActions(StopFleetActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopFleetActions", StopFleetActionsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（StopGameServerSessionPlacement）用于停止放置游戏服务器会话。
     * @param req StopGameServerSessionPlacementRequest
     * @return StopGameServerSessionPlacementResponse
     * @throws TencentCloudSDKException
     */
    public StopGameServerSessionPlacementResponse StopGameServerSessionPlacement(StopGameServerSessionPlacementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopGameServerSessionPlacement", StopGameServerSessionPlacementResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateAlias）用于更新别名的属性。
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlias", UpdateAliasResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateAsset）用于修改生成包信息。
     * @param req UpdateAssetRequest
     * @return UpdateAssetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssetResponse UpdateAsset(UpdateAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAsset", UpdateAssetResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateBucketAccelerateOpt）用于开启cos全球加速。
     * @param req UpdateBucketAccelerateOptRequest
     * @return UpdateBucketAccelerateOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketAccelerateOptResponse UpdateBucketAccelerateOpt(UpdateBucketAccelerateOptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBucketAccelerateOpt", UpdateBucketAccelerateOptResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateBucketCORSOpt）用于设置cos跨域访问。
     * @param req UpdateBucketCORSOptRequest
     * @return UpdateBucketCORSOptResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBucketCORSOptResponse UpdateBucketCORSOpt(UpdateBucketCORSOptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBucketCORSOpt", UpdateBucketCORSOptResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateFleetAttributes）用于更新服务器舰队属性。
     * @param req UpdateFleetAttributesRequest
     * @return UpdateFleetAttributesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetAttributesResponse UpdateFleetAttributes(UpdateFleetAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFleetAttributes", UpdateFleetAttributesResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateFleetCapacity）用于更新服务器舰队容量配置。
     * @param req UpdateFleetCapacityRequest
     * @return UpdateFleetCapacityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetCapacityResponse UpdateFleetCapacity(UpdateFleetCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFleetCapacity", UpdateFleetCapacityResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateFleetName）用于更新服务器舰队名称。
     * @param req UpdateFleetNameRequest
     * @return UpdateFleetNameResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetNameResponse UpdateFleetName(UpdateFleetNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFleetName", UpdateFleetNameResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateFleetPortSettings）用于更新服务器舰队安全组。
     * @param req UpdateFleetPortSettingsRequest
     * @return UpdateFleetPortSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFleetPortSettingsResponse UpdateFleetPortSettings(UpdateFleetPortSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFleetPortSettings", UpdateFleetPortSettingsResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateGameServerSession）用于更新游戏服务器会话。
     * @param req UpdateGameServerSessionRequest
     * @return UpdateGameServerSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionResponse UpdateGameServerSession(UpdateGameServerSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGameServerSession", UpdateGameServerSessionResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateGameServerSessionQueue）用于修改游戏服务器会话队列。
     * @param req UpdateGameServerSessionQueueRequest
     * @return UpdateGameServerSessionQueueResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGameServerSessionQueueResponse UpdateGameServerSessionQueue(UpdateGameServerSessionQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGameServerSessionQueue", UpdateGameServerSessionQueueResponse.class);
    }

    /**
     *此接口无法使用，游戏服务器引擎GSE已于6.1正式下架，感谢您的支持

本接口（UpdateRuntimeConfiguration）用于更新服务器舰队配置。
     * @param req UpdateRuntimeConfigurationRequest
     * @return UpdateRuntimeConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuntimeConfigurationResponse UpdateRuntimeConfiguration(UpdateRuntimeConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRuntimeConfiguration", UpdateRuntimeConfigurationResponse.class);
    }

}
