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
     *创建消费组
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
    }

    /**
     *创建 RocketMQ 5.x 集群
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *为MQTT实例创建公网接入点
     * @param req CreateMQTTInsPublicEndpointRequest
     * @return CreateMQTTInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTInsPublicEndpointResponse CreateMQTTInsPublicEndpoint(CreateMQTTInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTInsPublicEndpoint", CreateMQTTInsPublicEndpointResponse.class);
    }

    /**
     *购买新的MQTT实例
     * @param req CreateMQTTInstanceRequest
     * @return CreateMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTInstanceResponse CreateMQTTInstance(CreateMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTInstance", CreateMQTTInstanceResponse.class);
    }

    /**
     *创建主题
     * @param req CreateMQTTTopicRequest
     * @return CreateMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTTopicResponse CreateMQTTTopic(CreateMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTTopic", CreateMQTTTopicResponse.class);
    }

    /**
     *添加mqtt角色
     * @param req CreateMQTTUserRequest
     * @return CreateMQTTUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTUserResponse CreateMQTTUser(CreateMQTTUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTUser", CreateMQTTUserResponse.class);
    }

    /**
     *添加角色
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *创建主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *删除消费组
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *删除 RocketMQ 5.x 集群。
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *删除MQTT实例的公网接入点
     * @param req DeleteMQTTInsPublicEndpointRequest
     * @return DeleteMQTTInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTInsPublicEndpointResponse DeleteMQTTInsPublicEndpoint(DeleteMQTTInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTInsPublicEndpoint", DeleteMQTTInsPublicEndpointResponse.class);
    }

    /**
     *删除MQTT实例
     * @param req DeleteMQTTInstanceRequest
     * @return DeleteMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTInstanceResponse DeleteMQTTInstance(DeleteMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTInstance", DeleteMQTTInstanceResponse.class);
    }

    /**
     *删除MQTT主题
     * @param req DeleteMQTTTopicRequest
     * @return DeleteMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTTopicResponse DeleteMQTTTopic(DeleteMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTTopic", DeleteMQTTTopicResponse.class);
    }

    /**
     *删除MQTT访问用户
     * @param req DeleteMQTTUserRequest
     * @return DeleteMQTTUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMQTTUserResponse DeleteMQTTUser(DeleteMQTTUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMQTTUser", DeleteMQTTUserResponse.class);
    }

    /**
     *删除角色
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
    }

    /**
     *删除主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *查询消费者客户端详情
     * @param req DescribeConsumerClientRequest
     * @return DescribeConsumerClientResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerClientResponse DescribeConsumerClient(DescribeConsumerClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerClient", DescribeConsumerClientResponse.class);
    }

    /**
     *查询消费组详情
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

1. ConsumerGroupName，名称模糊查询
2. ConsumeMessageOrderly，投递顺序性。"true":顺序投递；"false":并发投递
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
1. InstanceName, 名称模糊查询
2. InstanceId，集群ID查询
3. InstanceType, 集群类型查询，支持多选
4. Version，集群版本查询
当使用TagFilters查询时，Filters参数失效。
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
1. InstanceName, 名称模糊查询
2. InstanceId，集群ID查询
3. InstanceType, 集群类型查询，支持多选
3. InstanceStatus，集群状态查询，支持多选

当使用TagFilters查询时，Filters参数失效。
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *查询 MQTT 客户端详情
     * @param req DescribeMQTTClientRequest
     * @return DescribeMQTTClientResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTClientResponse DescribeMQTTClient(DescribeMQTTClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTClient", DescribeMQTTClientResponse.class);
    }

    /**
     *查询MQTT实例公网接入点
     * @param req DescribeMQTTInsPublicEndpointsRequest
     * @return DescribeMQTTInsPublicEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInsPublicEndpointsResponse DescribeMQTTInsPublicEndpoints(DescribeMQTTInsPublicEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInsPublicEndpoints", DescribeMQTTInsPublicEndpointsResponse.class);
    }

    /**
     *查询MQTT实例公网接入点
     * @param req DescribeMQTTInsVPCEndpointsRequest
     * @return DescribeMQTTInsVPCEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInsVPCEndpointsResponse DescribeMQTTInsVPCEndpoints(DescribeMQTTInsVPCEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInsVPCEndpoints", DescribeMQTTInsVPCEndpointsResponse.class);
    }

    /**
     *查询实例信息
     * @param req DescribeMQTTInstanceRequest
     * @return DescribeMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInstanceResponse DescribeMQTTInstance(DescribeMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInstance", DescribeMQTTInstanceResponse.class);
    }

    /**
     *查询MQTT集群证书列表
     * @param req DescribeMQTTInstanceCertRequest
     * @return DescribeMQTTInstanceCertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInstanceCertResponse DescribeMQTTInstanceCert(DescribeMQTTInstanceCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInstanceCert", DescribeMQTTInstanceCertResponse.class);
    }

    /**
     *获取实例列表，Filters参数使用说明如下：
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
     *查询MQTT消息详情
     * @param req DescribeMQTTMessageRequest
     * @return DescribeMQTTMessageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTMessageResponse DescribeMQTTMessage(DescribeMQTTMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTMessage", DescribeMQTTMessageResponse.class);
    }

    /**
     *查询消息列表，如查询死信，请设置ConsumerGroup参数
     * @param req DescribeMQTTMessageListRequest
     * @return DescribeMQTTMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTMessageListResponse DescribeMQTTMessageList(DescribeMQTTMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTMessageList", DescribeMQTTMessageListResponse.class);
    }

    /**
     *获取产品售卖规格
     * @param req DescribeMQTTProductSKUListRequest
     * @return DescribeMQTTProductSKUListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTProductSKUListResponse DescribeMQTTProductSKUList(DescribeMQTTProductSKUListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTProductSKUList", DescribeMQTTProductSKUListResponse.class);
    }

    /**
     *查询mqtt主题详情
     * @param req DescribeMQTTTopicRequest
     * @return DescribeMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTTopicResponse DescribeMQTTTopic(DescribeMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTTopic", DescribeMQTTTopicResponse.class);
    }

    /**
     *获取主题列表，Filter参数使用说明如下：

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
     *查询用户列表，Filter参数使用说明如下：

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
     *查询消息详情
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
     * @param req DescribeMessageTraceRequest
     * @return DescribeMessageTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageTraceResponse DescribeMessageTrace(DescribeMessageTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageTrace", DescribeMessageTraceResponse.class);
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

1. RoleName，角色名称模糊搜索
2. AccessKey，AccessKey模糊搜索
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *查询主题详情，Offset和Limit参数是指订阅该主题的消费组查询分页参数，Filter参数使用说明如下：

ConsumerGroup，消费组名称过滤
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

1. TopicName，主题名称模糊搜索
2. TopicType，主题类型查询，支持多选，可选值：Normal,Order,Transaction,DelayScheduled
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

TopicName，主题名称过滤
     * @param req DescribeTopicListByGroupRequest
     * @return DescribeTopicListByGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicListByGroupResponse DescribeTopicListByGroup(DescribeTopicListByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicListByGroup", DescribeTopicListByGroupResponse.class);
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
     *修改消费组属性
     * @param req ModifyConsumerGroupRequest
     * @return ModifyConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupResponse ModifyConsumerGroup(ModifyConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroup", ModifyConsumerGroupResponse.class);
    }

    /**
     *修改 RocketMQ 5.x 集群属性。
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *修改 RocketMQ 5.x 集群接入点。
     * @param req ModifyInstanceEndpointRequest
     * @return ModifyInstanceEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEndpointResponse ModifyInstanceEndpoint(ModifyInstanceEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEndpoint", ModifyInstanceEndpointResponse.class);
    }

    /**
     *更新MQTT实例公网接入点
     * @param req ModifyMQTTInsPublicEndpointRequest
     * @return ModifyMQTTInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTInsPublicEndpointResponse ModifyMQTTInsPublicEndpoint(ModifyMQTTInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTInsPublicEndpoint", ModifyMQTTInsPublicEndpointResponse.class);
    }

    /**
     *修改实例属性
     * @param req ModifyMQTTInstanceRequest
     * @return ModifyMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTInstanceResponse ModifyMQTTInstance(ModifyMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTInstance", ModifyMQTTInstanceResponse.class);
    }

    /**
     *更新MQTT集群绑定证书
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
     *修改主题属性
     * @param req ModifyMQTTTopicRequest
     * @return ModifyMQTTTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTTopicResponse ModifyMQTTTopic(ModifyMQTTTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTTopic", ModifyMQTTTopicResponse.class);
    }

    /**
     *修改MQTT角色
     * @param req ModifyMQTTUserRequest
     * @return ModifyMQTTUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMQTTUserResponse ModifyMQTTUser(ModifyMQTTUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMQTTUser", ModifyMQTTUserResponse.class);
    }

    /**
     *修改角色
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
    }

    /**
     *修改主题属性
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *重新发送死信消息
     * @param req ResendDeadLetterMessageRequest
     * @return ResendDeadLetterMessageResponse
     * @throws TencentCloudSDKException
     */
    public ResendDeadLetterMessageResponse ResendDeadLetterMessage(ResendDeadLetterMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResendDeadLetterMessage", ResendDeadLetterMessageResponse.class);
    }

    /**
     *重置消费位点
     * @param req ResetConsumerGroupOffsetRequest
     * @return ResetConsumerGroupOffsetResponse
     * @throws TencentCloudSDKException
     */
    public ResetConsumerGroupOffsetResponse ResetConsumerGroupOffset(ResetConsumerGroupOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConsumerGroupOffset", ResetConsumerGroupOffsetResponse.class);
    }

}
