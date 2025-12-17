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
package com.tencentcloudapi.trocket.v20230308;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trocket.v20230308.models.*;

public class TrocketClient extends AbstractClient{
    private static String endpoint = "trocket.tencentcloudapi.com";
    private static String service = "trocket";
    private static String version = "2023-03-08";

    public TrocketClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrocketClient(Credential credential, String region, ClientProfile profile) {
        super(TrocketClient.endpoint, TrocketClient.version, credential, region, profile);
    }

    /**
     *修改迁移中的Topic状态进入下一步
     * @param req ChangeMigratingTopicToNextStageRequest
     * @return ChangeMigratingTopicToNextStageResponse
     * @throws TencentCloudSDKException
     */
    public ChangeMigratingTopicToNextStageResponse ChangeMigratingTopicToNextStage(ChangeMigratingTopicToNextStageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeMigratingTopicToNextStage", ChangeMigratingTopicToNextStageResponse.class);
    }

    /**
     *创建消费组。
当前 API 适用集群：5.x 集群。4.x 集群的创建消费组接口文档见 [CreateRocketMQGroup](https://cloud.tencent.com/document/api/1179/63428)。
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
    }

    /**
     *创建 RocketMQ 5.x 集群。
当前 API 适用集群：5.x 集群。创建 4.x 专享/通用集群的接口文档见 [CreateRocketMQVipInstance](https://cloud.tencent.com/document/product/1179/95721)。
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *下线trocket下mqtt接口

为MQTT实例创建公网接入点
     * @param req CreateMQTTInsPublicEndpointRequest
     * @return CreateMQTTInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTInsPublicEndpointResponse CreateMQTTInsPublicEndpoint(CreateMQTTInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTInsPublicEndpoint", CreateMQTTInsPublicEndpointResponse.class);
    }

    /**
     *下线trocket下mqtt接口

购买新的MQTT实例
     * @param req CreateMQTTInstanceRequest
     * @return CreateMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTInstanceResponse CreateMQTTInstance(CreateMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTInstance", CreateMQTTInstanceResponse.class);
    }

    /**
     *下线trocket下mqtt接口

创建主题
     * @param req CreateMQTTTopicRequest
     * @return CreateMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTTopicResponse CreateMQTTTopic(CreateMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTTopic", CreateMQTTTopicResponse.class);
    }

    /**
     *下线trocket下mqtt接口

添加mqtt角色
     * @param req CreateMQTTUserRequest
     * @return CreateMQTTUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTUserResponse CreateMQTTUser(CreateMQTTUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTUser", CreateMQTTUserResponse.class);
    }

    /**
     *添加角色。
当前 API 适用集群：5.x 集群。4.x 集群的创建角色接口文档见 [CreateRocketMQRole](https://cloud.tencent.com/document/product/1179/107538)，给角色授权接口文档见 [CreateRocketMQEnvironmentRole](https://cloud.tencent.com/document/product/1179/107539)。
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *创建 RocketMQ 主题。
当前 API 适用集群：5.x 集群。4.x 集群的创建主题接口文档见 [CreateRocketMQTopic](https://cloud.tencent.com/document/api/1179/63426)
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *删除消费组。消费者组删除后，消费者组的所有配置和相关数据都会被清空，且无法找回。删除后，在线的消费者客户端会出现报错，建议您提前下线客户端。
当前 API 适用集群：5.x 集群。4.x 集群的删除消费组接口文档见 [DeleteRocketMQGroup](https://cloud.tencent.com/document/api/1179/63424)。
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *删除 RocketMQ 5.x 集群，删除前请先删除正在使用的主题、消费组和角色信息。
当前 API 适用集群：5.x 集群。删除 4.x 集群接口文档见 [DeleteRocketMQVipInstance](https://cloud.tencent.com/document/product/1179/95802)。
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *下线trocket下mqtt接口

删除MQTT实例的公网接入点
     * @param req DeleteMQTTInsPublicEndpointRequest
     * @return DeleteMQTTInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTInsPublicEndpointResponse DeleteMQTTInsPublicEndpoint(DeleteMQTTInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTInsPublicEndpoint", DeleteMQTTInsPublicEndpointResponse.class);
    }

    /**
     *下线trocket下mqtt接口

删除MQTT实例
     * @param req DeleteMQTTInstanceRequest
     * @return DeleteMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTInstanceResponse DeleteMQTTInstance(DeleteMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTInstance", DeleteMQTTInstanceResponse.class);
    }

    /**
     *下线trocket下mqtt接口

删除MQTT主题
     * @param req DeleteMQTTTopicRequest
     * @return DeleteMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTTopicResponse DeleteMQTTTopic(DeleteMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTTopic", DeleteMQTTTopicResponse.class);
    }

    /**
     *下线trocket下mqtt接口

删除MQTT访问用户
     * @param req DeleteMQTTUserRequest
     * @return DeleteMQTTUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTUserResponse DeleteMQTTUser(DeleteMQTTUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTUser", DeleteMQTTUserResponse.class);
    }

    /**
     *删除角色。请确保该角色相关信息不在当前代码中被使用。删除角色后，原先使用该角色进行生产或消费消息的密钥（AccessKey 和 SecretKey）将立即失效。
当前 API 适用集群：5.x 集群。4.x 集群的删除角色接口文档见 [DeleteRocketMQRoles](https://cloud.tencent.com/document/product/1179/107536)，删除角色授权接口文档见 [DeleteRocketMQEnvironmentRoles](https://cloud.tencent.com/document/product/1179/107537)。
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
    }

    /**
     *删除平滑迁移任务，只有被取消的任务才可删除
     * @param req DeleteSmoothMigrationTaskRequest
     * @return DeleteSmoothMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSmoothMigrationTaskResponse DeleteSmoothMigrationTask(DeleteSmoothMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSmoothMigrationTask", DeleteSmoothMigrationTaskResponse.class);
    }

    /**
     *删除主题。主题删除后，主题的所有配置和相关数据都会被清空，且无法找回。
当前 API 适用集群：5.x 集群。4.x 集群的删除主题接口文档见 [DeleteRocketMQTopic](https://cloud.tencent.com/document/api/1179/63423)。
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *查询消费者客户端详情。
当前 API 适用集群：5.x 集群。4.x 集群的查询消费者客户端详情接口文档见 [DescribeRocketMQConsumerConnectionDetail](https://cloud.tencent.com/document/product/1179/102490)。
     * @param req DescribeConsumerClientRequest
     * @return DescribeConsumerClientResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerClientResponse DescribeConsumerClient(DescribeConsumerClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerClient", DescribeConsumerClientResponse.class);
    }

    /**
     *查询消费组下的客户端连接列表。
当前 API 适用集群：5.x 集群。4.x 集群的查询消费组下的客户端列表接口文档见 [DescribeRocketMQConsumerConnections](https://cloud.tencent.com/document/product/1179/100460)。
     * @param req DescribeConsumerClientListRequest
     * @return DescribeConsumerClientListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerClientListResponse DescribeConsumerClientList(DescribeConsumerClientListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerClientList", DescribeConsumerClientListResponse.class);
    }

    /**
     *查询消费组详情。
当前 API 适用集群：5.x 集群。4.x 集群的查询消费组详情接口文档见 [DescribeRocketMQConsumerConnections](https://cloud.tencent.com/document/product/1179/100460)。
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroup", DescribeConsumerGroupResponse.class);
    }

    /**
     *获取消费组列表，Filter参数使用说明如下：

- ConsumerGroupName 消费组名称，支持模糊查询，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
- ConsumeMessageOrderly，投递顺序性，枚举值如下：
    - true 顺序投递
    - false 并发投递

Filters示例： 
[{ "Name": "ConsumeMessageOrderly", "Values": ["true"] }]
当前 API 适用集群：5.x 集群。4.x 集群的获取消费组列表接口文档见 [DescribeRocketMQGroups](https://cloud.tencent.com/document/api/1179/63420)。
     * @param req DescribeConsumerGroupListRequest
     * @return DescribeConsumerGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupListResponse DescribeConsumerGroupList(DescribeConsumerGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroupList", DescribeConsumerGroupListResponse.class);
    }

    /**
     *查询指定消费组堆积数。
当前 API 适用集群：4.x 集群和 5.x 集群。
     * @param req DescribeConsumerLagRequest
     * @return DescribeConsumerLagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerLagResponse DescribeConsumerLag(DescribeConsumerLagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerLag", DescribeConsumerLagResponse.class);
    }

    /**
     *查询集群列表，支持 4.x 和 5.x 集群，其中 Filters 参数使用说明如下：

- InstanceName 集群名称，支持模糊查询，从本接口返回值或控制台获得
- InstanceId 集群ID，精确查询，从当前接口或控制台获得
- InstanceType 集群类型，可参考 [InstanceItem](https://cloud.tencent.com/document/api/1493/96031#InstanceItem) 数据结构，支持多选
- Version 集群版本，枚举值如下：
    - 4 RocketMQ 4.x 集群
    - 5 RocketMQ 5.x 集群

Filters示例：
 [{ "Name": "InstanceId", "Values": ["rmq-72mo3a9o"] }]
     * @param req DescribeFusionInstanceListRequest
     * @return DescribeFusionInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFusionInstanceListResponse DescribeFusionInstanceList(DescribeFusionInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFusionInstanceList", DescribeFusionInstanceListResponse.class);
    }

    /**
     *查询 RocketMQ 5.x 集群信息。
当前 API 适用集群：5.x 集群。查询 4.x 专享/通用集群信息的接口文档见 [DescribeRocketMQVipInstanceDetail](https://cloud.tencent.com/document/product/1179/86725)。
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *查询集群列表，仅支持 5.x 集群。Filters参数使用说明如下：

- InstanceName 集群名称，支持模糊搜索
- InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得
- InstanceType 集群类型，可参考 [InstanceItem](https://cloud.tencent.com/document/api/1493/96031#InstanceItem) 数据结构，支持多选
- InstanceStatus 集群状态，可参考 [InstanceItem](https://cloud.tencent.com/document/api/1493/96031#InstanceItem) 数据结构，支持多选

Filters示例：
[{
    "Name": "InstanceId",
    "Values": ["rmq-72mo3a9o"]
}]
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询 MQTT 客户端详情
     * @param req DescribeMQTTClientRequest
     * @return DescribeMQTTClientResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTClientResponse DescribeMQTTClient(DescribeMQTTClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTClient", DescribeMQTTClientResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询MQTT实例公网接入点
     * @param req DescribeMQTTInsPublicEndpointsRequest
     * @return DescribeMQTTInsPublicEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInsPublicEndpointsResponse DescribeMQTTInsPublicEndpoints(DescribeMQTTInsPublicEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInsPublicEndpoints", DescribeMQTTInsPublicEndpointsResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询MQTT实例公网接入点
     * @param req DescribeMQTTInsVPCEndpointsRequest
     * @return DescribeMQTTInsVPCEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInsVPCEndpointsResponse DescribeMQTTInsVPCEndpoints(DescribeMQTTInsVPCEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInsVPCEndpoints", DescribeMQTTInsVPCEndpointsResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询实例信息
     * @param req DescribeMQTTInstanceRequest
     * @return DescribeMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInstanceResponse DescribeMQTTInstance(DescribeMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInstance", DescribeMQTTInstanceResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询MQTT集群证书列表
     * @param req DescribeMQTTInstanceCertRequest
     * @return DescribeMQTTInstanceCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInstanceCertResponse DescribeMQTTInstanceCert(DescribeMQTTInstanceCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInstanceCert", DescribeMQTTInstanceCertResponse.class);
    }

    /**
     *下线trocket下mqtt接口

获取实例列表，Filters参数使用说明如下：
1. InstanceName, 名称模糊查询
2. InstanceId，实例ID查询
3. InstanceType, 实例类型查询，支持多选
3. InstanceStatus，实例状态查询，支持多选

当使用TagFilters查询时，Filters参数失效。
     * @param req DescribeMQTTInstanceListRequest
     * @return DescribeMQTTInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInstanceListResponse DescribeMQTTInstanceList(DescribeMQTTInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInstanceList", DescribeMQTTInstanceListResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询MQTT消息详情
     * @param req DescribeMQTTMessageRequest
     * @return DescribeMQTTMessageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTMessageResponse DescribeMQTTMessage(DescribeMQTTMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTMessage", DescribeMQTTMessageResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询消息列表，如查询死信，请设置ConsumerGroup参数
     * @param req DescribeMQTTMessageListRequest
     * @return DescribeMQTTMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTMessageListResponse DescribeMQTTMessageList(DescribeMQTTMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTMessageList", DescribeMQTTMessageListResponse.class);
    }

    /**
     *下线trocket下mqtt接口

获取产品售卖规格
     * @param req DescribeMQTTProductSKUListRequest
     * @return DescribeMQTTProductSKUListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTProductSKUListResponse DescribeMQTTProductSKUList(DescribeMQTTProductSKUListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTProductSKUList", DescribeMQTTProductSKUListResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询mqtt主题详情
     * @param req DescribeMQTTTopicRequest
     * @return DescribeMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTTopicResponse DescribeMQTTTopic(DescribeMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTTopic", DescribeMQTTTopicResponse.class);
    }

    /**
     *下线trocket下mqtt接口

获取主题列表，Filter参数使用说明如下：

1. TopicName，主题名称模糊搜索
2. TopicType，主题类型查询，支持多选，可选值：Normal,Order,Transaction,DelayScheduled
     * @param req DescribeMQTTTopicListRequest
     * @return DescribeMQTTTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTTopicListResponse DescribeMQTTTopicList(DescribeMQTTTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTTopicList", DescribeMQTTTopicListResponse.class);
    }

    /**
     *下线trocket下mqtt接口

查询用户列表，Filter参数使用说明如下：

1. Username，用户名称模糊搜索
     * @param req DescribeMQTTUserListRequest
     * @return DescribeMQTTUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTUserListResponse DescribeMQTTUserList(DescribeMQTTUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTUserList", DescribeMQTTUserListResponse.class);
    }

    /**
     *查询消息详情。
当前 API 适用集群：5.x 集群。4.x 集群的查询消息详情接口文档见 [DescribeRocketMQMsg](https://cloud.tencent.com/document/product/1179/91055)。
     * @param req DescribeMessageRequest
     * @return DescribeMessageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageResponse DescribeMessage(DescribeMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessage", DescribeMessageResponse.class);
    }

    /**
     *查询消息列表。如果查询死信消息，请设置ConsumerGroup参数。
当前 API 适用集群：5.x 集群。4.x 集群的查询消息列表接口文档见 [DescribeRocketMQTopicMsgs](https://cloud.tencent.com/document/product/1179/97761)。
     * @param req DescribeMessageListRequest
     * @return DescribeMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageListResponse DescribeMessageList(DescribeMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageList", DescribeMessageListResponse.class);
    }

    /**
     *根据消息 ID 查询消息轨迹。
当前 API 适用集群：5.x 集群。4.x 集群查询消息轨迹接口文档见 [DescribeRocketMQMsgTrace](https://cloud.tencent.com/document/product/1179/97760)。
     * @param req DescribeMessageTraceRequest
     * @return DescribeMessageTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageTraceResponse DescribeMessageTrace(DescribeMessageTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageTrace", DescribeMessageTraceResponse.class);
    }

    /**
     *查看迁移消费组的实时信息
     * @param req DescribeMigratingGroupStatsRequest
     * @return DescribeMigratingGroupStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigratingGroupStatsResponse DescribeMigratingGroupStats(DescribeMigratingGroupStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigratingGroupStats", DescribeMigratingGroupStatsResponse.class);
    }

    /**
     *查询Topic迁移状态列表。

Filters字段为查询过滤器，支持以下条件：
* TopicName 主题名称，支持模糊查询
* MigrationStatus 迁移状态，可参考[MigratingTopic](https://cloud.tencent.com/document/api/1493/96031#MigratingTopic)数据结构
* Namespace 命名空间，仅4.x集群有效

Filters示例：
[{
    "Name": "TopicName",
    "Values": ["topic-a"]
}]
     * @param req DescribeMigratingTopicListRequest
     * @return DescribeMigratingTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigratingTopicListResponse DescribeMigratingTopicList(DescribeMigratingTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigratingTopicList", DescribeMigratingTopicListResponse.class);
    }

    /**
     *用于查询迁移主题的实时数据
     * @param req DescribeMigratingTopicStatsRequest
     * @return DescribeMigratingTopicStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigratingTopicStatsResponse DescribeMigratingTopicStats(DescribeMigratingTopicStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigratingTopicStats", DescribeMigratingTopicStatsResponse.class);
    }

    /**
     *获取数据迁移任务列表，Filter参数使用说明如下：

TaskId，根据任务ID精确查找
InstanceId，根据实例ID精确查找
Type，根据任务类型精确查找
     * @param req DescribeMigrationTaskListRequest
     * @return DescribeMigrationTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationTaskListResponse DescribeMigrationTaskList(DescribeMigrationTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationTaskList", DescribeMigrationTaskListResponse.class);
    }

    /**
     *查询主题关联的生产者列表信息，Filters支持以下筛选条件：
- ClientIP，客户端IP
- ClientID，客户端ID
当前 API 适用集群：5.x 集群。4.x 集群的查询生产者客户端列表接口文档见 [DescribeRocketMQProducers](https://cloud.tencent.com/document/api/1179/122749)。
     * @param req DescribeProducerListRequest
     * @return DescribeProducerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProducerListResponse DescribeProducerList(DescribeProducerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducerList", DescribeProducerListResponse.class);
    }

    /**
     *查询产品售卖规格，针对 RocketMQ 5.x 集群。
     * @param req DescribeProductSKUsRequest
     * @return DescribeProductSKUsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductSKUsResponse DescribeProductSKUs(DescribeProductSKUsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductSKUs", DescribeProductSKUsResponse.class);
    }

    /**
     *查询角色列表，Filter参数使用说明如下：

- RoleName 角色名称，支持模糊搜索，从本接口返回值或控制台获得
- AccessKey AccessKey，支持模糊搜索，从本接口返回值或控制台获得

Filters示例： 
[{ "Name": "RoleName", "Values": ["test_role"] }]
当前 API 适用集群：5.x 集群。4.x 集群的查询角色列表接口文档见 [DescribeRocketMQRoles](https://cloud.tencent.com/document/product/1179/107534)，查询角色授权列表接口文档见 [DescribeRocketMQEnvironmentRoles](https://cloud.tencent.com/document/product/1179/107535)。
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *用于查询平滑迁移任务列表。

查询参数Filters， 支持的字段如下：
* TaskStatus, 任务状态，支持多选 
* ConnectionType，网络连接类型，支持多选，参考[SmoothMigrationTaskItem](https://cloud.tencent.com/document/api/1493/96031#SmoothMigrationTaskItem)的说明
* InstanceId，实例ID，精确搜索 
* TaskName，任务名称，支持模糊搜索

Filters示例：
[{
    "Name": "InstanceId",
    "Values": ["rmq-1gzecldfg"]
}]
     * @param req DescribeSmoothMigrationTaskListRequest
     * @return DescribeSmoothMigrationTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmoothMigrationTaskListResponse DescribeSmoothMigrationTaskList(DescribeSmoothMigrationTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSmoothMigrationTaskList", DescribeSmoothMigrationTaskListResponse.class);
    }

    /**
     *平滑迁移过程获取源集群group列表接口。

Filters字段为查询过滤器，支持以下字段：
* GroupName，消费组名称，支持模糊搜索
* Imported，是否已导入
* ImportStatus，导入状态，参考[SourceClusterGroupConfig](https://cloud.tencent.com/document/api/1493/96031#SourceClusterGroupConfig)的说明
* Namespace，命名空间，仅4.x集群有效

Filters示例：
[{
    "Name": "GroupName",
    "Values": ["group-a"]
}]
     * @param req DescribeSourceClusterGroupListRequest
     * @return DescribeSourceClusterGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceClusterGroupListResponse DescribeSourceClusterGroupList(DescribeSourceClusterGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceClusterGroupList", DescribeSourceClusterGroupListResponse.class);
    }

    /**
     *查询主题详情，Offset和Limit参数是指订阅该主题的消费组查询分页参数，Filter参数使用说明如下：

- ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。

Filters示例： 
[{ "Name": "ConsumerGroup", "Values": ["test_group"] }]
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopic", DescribeTopicResponse.class);
    }

    /**
     *获取主题列表，Filter参数使用说明如下：

- TopicName 主题名称，支持模糊搜索，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得
- TopicType 主题类型查询，支持多选，参考 [DescribeTopic](https://cloud.tencent.com/document/api/1493/97945) 接口 TopicType 字段

Filters示例：
 [{ "Name": "TopicName", "Values": ["test_topic"] }]
当前 API 适用集群：5.x 集群。4.x 集群的获取主题列表接口文档见 [DescribeRocketMQTopics](https://cloud.tencent.com/document/api/1179/63418)。
     * @param req DescribeTopicListRequest
     * @return DescribeTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicListResponse DescribeTopicList(DescribeTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicList", DescribeTopicListResponse.class);
    }

    /**
     *根据消费组获取主题列表，Filter参数使用说明如下：

- TopicName 主题名称，从 [DescribeTopicList](https://cloud.tencent.com/document/api/1493/96030) 接口返回的 [TopicItem](https://cloud.tencent.com/document/api/1493/96031#TopicItem) 或控制台获得。

Filters示例： 
[{ "Name": "TopicName", "Values": ["test_topic"] }]
     * @param req DescribeTopicListByGroupRequest
     * @return DescribeTopicListByGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicListByGroupResponse DescribeTopicListByGroup(DescribeTopicListByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicListByGroup", DescribeTopicListByGroupResponse.class);
    }

    /**
     *检查迁移中的主题是否处于正常状态，只有处于正常状态的主题，才可以进入下一个迁移阶段
     * @param req DoHealthCheckOnMigratingTopicRequest
     * @return DoHealthCheckOnMigratingTopicResponse
     * @throws TencentCloudSDKException
     */
    public DoHealthCheckOnMigratingTopicResponse DoHealthCheckOnMigratingTopic(DoHealthCheckOnMigratingTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DoHealthCheckOnMigratingTopic", DoHealthCheckOnMigratingTopicResponse.class);
    }

    /**
     *导入消费者组列表
     * @param req ImportSourceClusterConsumerGroupsRequest
     * @return ImportSourceClusterConsumerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSourceClusterConsumerGroupsResponse ImportSourceClusterConsumerGroups(ImportSourceClusterConsumerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportSourceClusterConsumerGroups", ImportSourceClusterConsumerGroupsResponse.class);
    }

    /**
     *导入topic列表
     * @param req ImportSourceClusterTopicsRequest
     * @return ImportSourceClusterTopicsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSourceClusterTopicsResponse ImportSourceClusterTopics(ImportSourceClusterTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportSourceClusterTopics", ImportSourceClusterTopicsResponse.class);
    }

    /**
     *修改消费组属性。
当前 API 适用集群：5.x 集群。4.x 集群的修改消费组属性接口文档见 [ModifyRocketMQGroup](https://cloud.tencent.com/document/api/1179/63416)。
     * @param req ModifyConsumerGroupRequest
     * @return ModifyConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupResponse ModifyConsumerGroup(ModifyConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroup", ModifyConsumerGroupResponse.class);
    }

    /**
     *修改 RocketMQ 5.x 集群属性，仅支持修改运行中的集群。
当前 API 适用集群：5.x 集群。修改 4.x 集群属性的接口文档见 [ModifyRocketMQInstance](https://cloud.tencent.com/document/product/1179/108862)。
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *修改 RocketMQ 5.x 集群接入点，操作前请先确认接入点已存在。
     * @param req ModifyInstanceEndpointRequest
     * @return ModifyInstanceEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEndpointResponse ModifyInstanceEndpoint(ModifyInstanceEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEndpoint", ModifyInstanceEndpointResponse.class);
    }

    /**
     *下线trocket下mqtt接口

更新MQTT实例公网接入点
     * @param req ModifyMQTTInsPublicEndpointRequest
     * @return ModifyMQTTInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTInsPublicEndpointResponse ModifyMQTTInsPublicEndpoint(ModifyMQTTInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTInsPublicEndpoint", ModifyMQTTInsPublicEndpointResponse.class);
    }

    /**
     *下线trocket下mqtt接口

修改实例属性
     * @param req ModifyMQTTInstanceRequest
     * @return ModifyMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTInstanceResponse ModifyMQTTInstance(ModifyMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTInstance", ModifyMQTTInstanceResponse.class);
    }

    /**
     *下线trocket下mqtt接口

更新MQTT集群绑定证书
参数传空，则为删除证书
     * @param req ModifyMQTTInstanceCertBindingRequest
     * @return ModifyMQTTInstanceCertBindingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTInstanceCertBindingResponse ModifyMQTTInstanceCertBinding(ModifyMQTTInstanceCertBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTInstanceCertBinding", ModifyMQTTInstanceCertBindingResponse.class);
    }

    /**
     *下线trocket下mqtt接口

修改主题属性
     * @param req ModifyMQTTTopicRequest
     * @return ModifyMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTTopicResponse ModifyMQTTTopic(ModifyMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTTopic", ModifyMQTTTopicResponse.class);
    }

    /**
     *下线trocket下mqtt接口

修改MQTT角色
     * @param req ModifyMQTTUserRequest
     * @return ModifyMQTTUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTUserResponse ModifyMQTTUser(ModifyMQTTUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTUser", ModifyMQTTUserResponse.class);
    }

    /**
     *修改角色。
当前 API 适用集群：5.x 集群。4.x 集群的修改角色接口文档见 [ModifyRocketMQRole](https://cloud.tencent.com/document/product/1179/107532)，修改角色的授权接口文档见 [ModifyRocketMQEnvironmentRole](https://cloud.tencent.com/document/product/1179/107533)。
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
    }

    /**
     *修改主题属性。
当前 API 适用集群：5.x 集群。4.x 集群的修改主题属性接口文档见 [ModifyRocketMQTopic](https://cloud.tencent.com/document/api/1179/63414)。
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *从迁移列表中移除主题，仅当主题处于初始状态时有效
     * @param req RemoveMigratingTopicRequest
     * @return RemoveMigratingTopicResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMigratingTopicResponse RemoveMigratingTopic(RemoveMigratingTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMigratingTopic", RemoveMigratingTopicResponse.class);
    }

    /**
     *重新发送死信消息。
当前 API 适用集群：5.x集群。4.x 集群的重发死信消息接口文档见 [RetryRocketMQDlqMessage](https://cloud.tencent.com/document/api/1179/114595)。
     * @param req ResendDeadLetterMessageRequest
     * @return ResendDeadLetterMessageResponse
     * @throws TencentCloudSDKException
     */
    public ResendDeadLetterMessageResponse ResendDeadLetterMessage(ResendDeadLetterMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResendDeadLetterMessage", ResendDeadLetterMessageResponse.class);
    }

    /**
     *重置消费位点。
当前 API 适用集群：5.x 集群。4.x 集群的重置消费位点接口文档见 [ResetRocketMQConsumerOffSet](https://cloud.tencent.com/document/api/1179/71662)。
     * @param req ResetConsumerGroupOffsetRequest
     * @return ResetConsumerGroupOffsetResponse
     * @throws TencentCloudSDKException
     */
    public ResetConsumerGroupOffsetResponse ResetConsumerGroupOffset(ResetConsumerGroupOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConsumerGroupOffset", ResetConsumerGroupOffsetResponse.class);
    }

    /**
     *回滚正在迁移的主题至前一个阶段
     * @param req RollbackMigratingTopicStageRequest
     * @return RollbackMigratingTopicStageResponse
     * @throws TencentCloudSDKException
     */
    public RollbackMigratingTopicStageResponse RollbackMigratingTopicStage(RollbackMigratingTopicStageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackMigratingTopicStage", RollbackMigratingTopicStageResponse.class);
    }

    /**
     *发送 RocketMQ 消息，该接口仅用于控制台发送少量测试消息，不保证 SLA，且云 API 存在限流，在真实业务场景下，请使用 RocketMQ SDK 发送消息。
当前 API 适用集群：5.x 集群。4.x 集群的发送消息接口文档见 [SendRocketMQMessage](https://cloud.tencent.com/document/api/1179/94179)。
     * @param req SendMessageRequest
     * @return SendMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendMessageResponse SendMessage(SendMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMessage", SendMessageResponse.class);
    }

    /**
     *消息消费验证。
当前 API 适用集群：5.x 集群。4.x 集群的消息消费验证接口文档见 [VerifyRocketMQConsume](https://cloud.tencent.com/document/api/1179/101061)。
     * @param req VerifyMessageConsumptionRequest
     * @return VerifyMessageConsumptionResponse
     * @throws TencentCloudSDKException
     */
    public VerifyMessageConsumptionResponse VerifyMessageConsumption(VerifyMessageConsumptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyMessageConsumption", VerifyMessageConsumptionResponse.class);
    }

}
