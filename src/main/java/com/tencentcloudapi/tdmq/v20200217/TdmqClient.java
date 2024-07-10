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
package com.tencentcloudapi.tdmq.v20200217;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdmq.v20200217.models.*;

public class TdmqClient extends AbstractClient{
    private static String endpoint = "tdmq.tencentcloudapi.com";
    private static String service = "tdmq";
    private static String version = "2020-02-17";
    
    public TdmqClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdmqClient(Credential credential, String region, ClientProfile profile) {
        super(TdmqClient.endpoint, TdmqClient.version, credential, region, profile);
    }

    /**
     *根据提供的 MessageID 确认指定 topic 中的消息
     * @param req AcknowledgeMessageRequest
     * @return AcknowledgeMessageResponse
     * @throws TencentCloudSDKException
     */
    public AcknowledgeMessageResponse AcknowledgeMessage(AcknowledgeMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcknowledgeMessage", AcknowledgeMessageResponse.class);
    }

    /**
     *清空cmq消息队列中的消息
     * @param req ClearCmqQueueRequest
     * @return ClearCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqQueueResponse ClearCmqQueue(ClearCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearCmqQueue", ClearCmqQueueResponse.class);
    }

    /**
     *清空订阅者消息标签
     * @param req ClearCmqSubscriptionFilterTagsRequest
     * @return ClearCmqSubscriptionFilterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqSubscriptionFilterTagsResponse ClearCmqSubscriptionFilterTags(ClearCmqSubscriptionFilterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearCmqSubscriptionFilterTags", ClearCmqSubscriptionFilterTagsResponse.class);
    }

    /**
     *创建用户的集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *创建cmq队列接口
     * @param req CreateCmqQueueRequest
     * @return CreateCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqQueueResponse CreateCmqQueue(CreateCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmqQueue", CreateCmqQueueResponse.class);
    }

    /**
     *创建cmq订阅接口
     * @param req CreateCmqSubscribeRequest
     * @return CreateCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqSubscribeResponse CreateCmqSubscribe(CreateCmqSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmqSubscribe", CreateCmqSubscribeResponse.class);
    }

    /**
     *创建cmq主题
     * @param req CreateCmqTopicRequest
     * @return CreateCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqTopicResponse CreateCmqTopic(CreateCmqTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCmqTopic", CreateCmqTopicResponse.class);
    }

    /**
     *用于在用户账户下创建消息队列 Tdmq 命名空间
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
    }

    /**
     *创建环境角色授权
     * @param req CreateEnvironmentRoleRequest
     * @return CreateEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentRoleResponse CreateEnvironmentRole(CreateEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironmentRole", CreateEnvironmentRoleResponse.class);
    }

    /**
     *创建专业集群——预付费，仅通过api调用
     * @param req CreateProClusterRequest
     * @return CreateProClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateProClusterResponse CreateProCluster(CreateProClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProCluster", CreateProClusterResponse.class);
    }

    /**
     *创建RabbitMQ的用户
     * @param req CreateRabbitMQUserRequest
     * @return CreateRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQUserResponse CreateRabbitMQUser(CreateRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQUser", CreateRabbitMQUserResponse.class);
    }

    /**
     *创建RabbitMQ专享版实例
     * @param req CreateRabbitMQVipInstanceRequest
     * @return CreateRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQVipInstanceResponse CreateRabbitMQVipInstance(CreateRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQVipInstance", CreateRabbitMQVipInstanceResponse.class);
    }

    /**
     *创建RabbitMQ的vhost
     * @param req CreateRabbitMQVirtualHostRequest
     * @return CreateRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateRabbitMQVirtualHostResponse CreateRabbitMQVirtualHost(CreateRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRabbitMQVirtualHost", CreateRabbitMQVirtualHostResponse.class);
    }

    /**
     *此接口用于创建一个RocketMQ集群
     * @param req CreateRocketMQClusterRequest
     * @return CreateRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQClusterResponse CreateRocketMQCluster(CreateRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQCluster", CreateRocketMQClusterResponse.class);
    }

    /**
     *创建环境角色授权
     * @param req CreateRocketMQEnvironmentRoleRequest
     * @return CreateRocketMQEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQEnvironmentRoleResponse CreateRocketMQEnvironmentRole(CreateRocketMQEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQEnvironmentRole", CreateRocketMQEnvironmentRoleResponse.class);
    }

    /**
     *创建RocketMQ消费组
     * @param req CreateRocketMQGroupRequest
     * @return CreateRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQGroupResponse CreateRocketMQGroup(CreateRocketMQGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQGroup", CreateRocketMQGroupResponse.class);
    }

    /**
     *创建RocketMQ命名空间
     * @param req CreateRocketMQNamespaceRequest
     * @return CreateRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQNamespaceResponse CreateRocketMQNamespace(CreateRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQNamespace", CreateRocketMQNamespaceResponse.class);
    }

    /**
     *创建角色
     * @param req CreateRocketMQRoleRequest
     * @return CreateRocketMQRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQRoleResponse CreateRocketMQRole(CreateRocketMQRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQRole", CreateRocketMQRoleResponse.class);
    }

    /**
     *创建RocketMQ主题
     * @param req CreateRocketMQTopicRequest
     * @return CreateRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQTopicResponse CreateRocketMQTopic(CreateRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQTopic", CreateRocketMQTopicResponse.class);
    }

    /**
     *创建RocketMQ专享实例
     * @param req CreateRocketMQVipInstanceRequest
     * @return CreateRocketMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQVipInstanceResponse CreateRocketMQVipInstance(CreateRocketMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRocketMQVipInstance", CreateRocketMQVipInstanceResponse.class);
    }

    /**
     *创建角色
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *创建一个主题的订阅关系
     * @param req CreateSubscriptionRequest
     * @return CreateSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscriptionResponse CreateSubscription(CreateSubscriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscription", CreateSubscriptionResponse.class);
    }

    /**
     *新增指定分区、类型的消息主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *删除集群
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *删除cmq队列
     * @param req DeleteCmqQueueRequest
     * @return DeleteCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqQueueResponse DeleteCmqQueue(DeleteCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmqQueue", DeleteCmqQueueResponse.class);
    }

    /**
     *删除cmq订阅
     * @param req DeleteCmqSubscribeRequest
     * @return DeleteCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqSubscribeResponse DeleteCmqSubscribe(DeleteCmqSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmqSubscribe", DeleteCmqSubscribeResponse.class);
    }

    /**
     *删除cmq主题
     * @param req DeleteCmqTopicRequest
     * @return DeleteCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqTopicResponse DeleteCmqTopic(DeleteCmqTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCmqTopic", DeleteCmqTopicResponse.class);
    }

    /**
     *删除环境角色授权。
     * @param req DeleteEnvironmentRolesRequest
     * @return DeleteEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentRolesResponse DeleteEnvironmentRoles(DeleteEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironmentRoles", DeleteEnvironmentRolesResponse.class);
    }

    /**
     *批量删除租户下的命名空间
     * @param req DeleteEnvironmentsRequest
     * @return DeleteEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentsResponse DeleteEnvironments(DeleteEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironments", DeleteEnvironmentsResponse.class);
    }

    /**
     *删除专业集群——预付费，仅通过API 调用
     * @param req DeleteProClusterRequest
     * @return DeleteProClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProClusterResponse DeleteProCluster(DeleteProClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProCluster", DeleteProClusterResponse.class);
    }

    /**
     *删除RabbitMQ的用户
     * @param req DeleteRabbitMQUserRequest
     * @return DeleteRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQUserResponse DeleteRabbitMQUser(DeleteRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQUser", DeleteRabbitMQUserResponse.class);
    }

    /**
     *删除RabbitMQ专享版实例
     * @param req DeleteRabbitMQVipInstanceRequest
     * @return DeleteRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQVipInstanceResponse DeleteRabbitMQVipInstance(DeleteRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQVipInstance", DeleteRabbitMQVipInstanceResponse.class);
    }

    /**
     *删除RabbitMQ的vhost
     * @param req DeleteRabbitMQVirtualHostRequest
     * @return DeleteRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRabbitMQVirtualHostResponse DeleteRabbitMQVirtualHost(DeleteRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRabbitMQVirtualHost", DeleteRabbitMQVirtualHostResponse.class);
    }

    /**
     *删除RocketMQ集群
     * @param req DeleteRocketMQClusterRequest
     * @return DeleteRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQClusterResponse DeleteRocketMQCluster(DeleteRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQCluster", DeleteRocketMQClusterResponse.class);
    }

    /**
     *删除环境角色授权。
     * @param req DeleteRocketMQEnvironmentRolesRequest
     * @return DeleteRocketMQEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQEnvironmentRolesResponse DeleteRocketMQEnvironmentRoles(DeleteRocketMQEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQEnvironmentRoles", DeleteRocketMQEnvironmentRolesResponse.class);
    }

    /**
     *删除RocketMQ消费组
     * @param req DeleteRocketMQGroupRequest
     * @return DeleteRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQGroupResponse DeleteRocketMQGroup(DeleteRocketMQGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQGroup", DeleteRocketMQGroupResponse.class);
    }

    /**
     *删除RocketMQ命名空间
     * @param req DeleteRocketMQNamespaceRequest
     * @return DeleteRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQNamespaceResponse DeleteRocketMQNamespace(DeleteRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQNamespace", DeleteRocketMQNamespaceResponse.class);
    }

    /**
     *删除角色，支持批量。
     * @param req DeleteRocketMQRolesRequest
     * @return DeleteRocketMQRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQRolesResponse DeleteRocketMQRoles(DeleteRocketMQRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQRoles", DeleteRocketMQRolesResponse.class);
    }

    /**
     *删除RocketMQ主题
     * @param req DeleteRocketMQTopicRequest
     * @return DeleteRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQTopicResponse DeleteRocketMQTopic(DeleteRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQTopic", DeleteRocketMQTopicResponse.class);
    }

    /**
     *删除RocketMQ专享实例
     * @param req DeleteRocketMQVipInstanceRequest
     * @return DeleteRocketMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQVipInstanceResponse DeleteRocketMQVipInstance(DeleteRocketMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRocketMQVipInstance", DeleteRocketMQVipInstanceResponse.class);
    }

    /**
     *删除角色，支持批量。
     * @param req DeleteRolesRequest
     * @return DeleteRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolesResponse DeleteRoles(DeleteRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoles", DeleteRolesResponse.class);
    }

    /**
     *删除订阅关系
     * @param req DeleteSubscriptionsRequest
     * @return DeleteSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubscriptionsResponse DeleteSubscriptions(DeleteSubscriptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubscriptions", DeleteSubscriptionsResponse.class);
    }

    /**
     *批量删除topics
     * @param req DeleteTopicsRequest
     * @return DeleteTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicsResponse DeleteTopics(DeleteTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopics", DeleteTopicsResponse.class);
    }

    /**
     *获取amqp集群列表
     * @param req DescribeAMQPClustersRequest
     * @return DescribeAMQPClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPClustersResponse DescribeAMQPClusters(DescribeAMQPClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAMQPClusters", DescribeAMQPClustersResponse.class);
    }

    /**
     *获取某个租户的虚拟集群列表
     * @param req DescribeAllTenantsRequest
     * @return DescribeAllTenantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllTenantsResponse DescribeAllTenants(DescribeAllTenantsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllTenants", DescribeAllTenantsResponse.class);
    }

    /**
     *获取用户绑定的专享集群列表
     * @param req DescribeBindClustersRequest
     * @return DescribeBindClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindClustersResponse DescribeBindClusters(DescribeBindClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindClusters", DescribeBindClustersResponse.class);
    }

    /**
     *获取租户VPC绑定关系
     * @param req DescribeBindVpcsRequest
     * @return DescribeBindVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindVpcsResponse DescribeBindVpcs(DescribeBindVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindVpcs", DescribeBindVpcsResponse.class);
    }

    /**
     *获取集群的详细信息
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *获取集群列表
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *接口很久之前已删除，需下线

枚举cmq死信队列源队列
     * @param req DescribeCmqDeadLetterSourceQueuesRequest
     * @return DescribeCmqDeadLetterSourceQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqDeadLetterSourceQueuesResponse DescribeCmqDeadLetterSourceQueues(DescribeCmqDeadLetterSourceQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqDeadLetterSourceQueues", DescribeCmqDeadLetterSourceQueuesResponse.class);
    }

    /**
     *查询cmq队列详情
     * @param req DescribeCmqQueueDetailRequest
     * @return DescribeCmqQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueueDetailResponse DescribeCmqQueueDetail(DescribeCmqQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqQueueDetail", DescribeCmqQueueDetailResponse.class);
    }

    /**
     *查询cmq全量队列
     * @param req DescribeCmqQueuesRequest
     * @return DescribeCmqQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueuesResponse DescribeCmqQueues(DescribeCmqQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqQueues", DescribeCmqQueuesResponse.class);
    }

    /**
     *查询cmq订阅详情
     * @param req DescribeCmqSubscriptionDetailRequest
     * @return DescribeCmqSubscriptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqSubscriptionDetailResponse DescribeCmqSubscriptionDetail(DescribeCmqSubscriptionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqSubscriptionDetail", DescribeCmqSubscriptionDetailResponse.class);
    }

    /**
     *查询cmq主题详情
     * @param req DescribeCmqTopicDetailRequest
     * @return DescribeCmqTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicDetailResponse DescribeCmqTopicDetail(DescribeCmqTopicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqTopicDetail", DescribeCmqTopicDetailResponse.class);
    }

    /**
     *枚举cmq全量主题
     * @param req DescribeCmqTopicsRequest
     * @return DescribeCmqTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicsResponse DescribeCmqTopics(DescribeCmqTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCmqTopics", DescribeCmqTopicsResponse.class);
    }

    /**
     *获取指定命名空间的属性
     * @param req DescribeEnvironmentAttributesRequest
     * @return DescribeEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentAttributesResponse DescribeEnvironmentAttributes(DescribeEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironmentAttributes", DescribeEnvironmentAttributesResponse.class);
    }

    /**
     *获取命名空间角色列表
     * @param req DescribeEnvironmentRolesRequest
     * @return DescribeEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentRolesResponse DescribeEnvironmentRoles(DescribeEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironmentRoles", DescribeEnvironmentRolesResponse.class);
    }

    /**
     *获取租户下命名空间列表
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *查询消息轨迹
     * @param req DescribeMqMsgTraceRequest
     * @return DescribeMqMsgTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMqMsgTraceResponse DescribeMqMsgTrace(DescribeMqMsgTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMqMsgTrace", DescribeMqMsgTraceResponse.class);
    }

    /**
     *消息详情
     * @param req DescribeMsgRequest
     * @return DescribeMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgResponse DescribeMsg(DescribeMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsg", DescribeMsgResponse.class);
    }

    /**
     *查询消息轨迹
     * @param req DescribeMsgTraceRequest
     * @return DescribeMsgTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgTraceResponse DescribeMsgTrace(DescribeMsgTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsgTrace", DescribeMsgTraceResponse.class);
    }

    /**
     *运营端获取命名空间bundle列表
     * @param req DescribeNamespaceBundlesOptRequest
     * @return DescribeNamespaceBundlesOptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespaceBundlesOptResponse DescribeNamespaceBundlesOpt(DescribeNamespaceBundlesOptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespaceBundlesOpt", DescribeNamespaceBundlesOptResponse.class);
    }

    /**
     *运营端获节点健康状态
     * @param req DescribeNodeHealthOptRequest
     * @return DescribeNodeHealthOptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeHealthOptResponse DescribeNodeHealthOpt(DescribeNodeHealthOptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeHealthOpt", DescribeNodeHealthOptResponse.class);
    }

    /**
     *获取消息生产概览信息
     * @param req DescribePublisherSummaryRequest
     * @return DescribePublisherSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublisherSummaryResponse DescribePublisherSummary(DescribePublisherSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublisherSummary", DescribePublisherSummaryResponse.class);
    }

    /**
     *获取生产者信息列表
     * @param req DescribePublishersRequest
     * @return DescribePublishersResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublishersResponse DescribePublishers(DescribePublishersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublishers", DescribePublishersResponse.class);
    }

    /**
     *获取Pulsar专业版集群实例信息
     * @param req DescribePulsarProInstanceDetailRequest
     * @return DescribePulsarProInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePulsarProInstanceDetailResponse DescribePulsarProInstanceDetail(DescribePulsarProInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePulsarProInstanceDetail", DescribePulsarProInstanceDetailResponse.class);
    }

    /**
     *查询用户已购的Pulsar专业版实例列表
     * @param req DescribePulsarProInstancesRequest
     * @return DescribePulsarProInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePulsarProInstancesResponse DescribePulsarProInstances(DescribePulsarProInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePulsarProInstances", DescribePulsarProInstancesResponse.class);
    }

    /**
     *查询RabbitMQ exchange 列表
     * @param req DescribeRabbitMQExchangesRequest
     * @return DescribeRabbitMQExchangesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQExchangesResponse DescribeRabbitMQExchanges(DescribeRabbitMQExchangesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQExchanges", DescribeRabbitMQExchangesResponse.class);
    }

    /**
     *RabbitMQ专享版查询节点列表
     * @param req DescribeRabbitMQNodeListRequest
     * @return DescribeRabbitMQNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQNodeListResponse DescribeRabbitMQNodeList(DescribeRabbitMQNodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQNodeList", DescribeRabbitMQNodeListResponse.class);
    }

    /**
     *查询RabbitMQ队列详情
     * @param req DescribeRabbitMQQueueDetailRequest
     * @return DescribeRabbitMQQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQQueueDetailResponse DescribeRabbitMQQueueDetail(DescribeRabbitMQQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQQueueDetail", DescribeRabbitMQQueueDetailResponse.class);
    }

    /**
     *查询RabbitMQ队列列表
     * @param req DescribeRabbitMQQueuesRequest
     * @return DescribeRabbitMQQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQQueuesResponse DescribeRabbitMQQueues(DescribeRabbitMQQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQQueues", DescribeRabbitMQQueuesResponse.class);
    }

    /**
     *查询RabbitMQ用户列表
     * @param req DescribeRabbitMQUserRequest
     * @return DescribeRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQUserResponse DescribeRabbitMQUser(DescribeRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQUser", DescribeRabbitMQUserResponse.class);
    }

    /**
     *获取单个RabbitMQ专享实例信息
     * @param req DescribeRabbitMQVipInstanceRequest
     * @return DescribeRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVipInstanceResponse DescribeRabbitMQVipInstance(DescribeRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVipInstance", DescribeRabbitMQVipInstanceResponse.class);
    }

    /**
     *查询用户已购的RabbitMQ专享实例列表
     * @param req DescribeRabbitMQVipInstancesRequest
     * @return DescribeRabbitMQVipInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVipInstancesResponse DescribeRabbitMQVipInstances(DescribeRabbitMQVipInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVipInstances", DescribeRabbitMQVipInstancesResponse.class);
    }

    /**
     *查询RabbitMQ vhost列表
     * @param req DescribeRabbitMQVirtualHostRequest
     * @return DescribeRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVirtualHostResponse DescribeRabbitMQVirtualHost(DescribeRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVirtualHost", DescribeRabbitMQVirtualHostResponse.class);
    }

    /**
     *RabbitMQ专享版查询虚拟主机列表
     * @param req DescribeRabbitMQVirtualHostListRequest
     * @return DescribeRabbitMQVirtualHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRabbitMQVirtualHostListResponse DescribeRabbitMQVirtualHostList(DescribeRabbitMQVirtualHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRabbitMQVirtualHostList", DescribeRabbitMQVirtualHostListResponse.class);
    }

    /**
     *获取单个RocketMQ集群信息
     * @param req DescribeRocketMQClusterRequest
     * @return DescribeRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClusterResponse DescribeRocketMQCluster(DescribeRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQCluster", DescribeRocketMQClusterResponse.class);
    }

    /**
     *获取RocketMQ集群列表
     * @param req DescribeRocketMQClustersRequest
     * @return DescribeRocketMQClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClustersResponse DescribeRocketMQClusters(DescribeRocketMQClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQClusters", DescribeRocketMQClustersResponse.class);
    }

    /**
     *获取消费详情列表
     * @param req DescribeRocketMQConsumeStatsRequest
     * @return DescribeRocketMQConsumeStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQConsumeStatsResponse DescribeRocketMQConsumeStats(DescribeRocketMQConsumeStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQConsumeStats", DescribeRocketMQConsumeStatsResponse.class);
    }

    /**
     *获取在线消费端详情
     * @param req DescribeRocketMQConsumerConnectionDetailRequest
     * @return DescribeRocketMQConsumerConnectionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQConsumerConnectionDetailResponse DescribeRocketMQConsumerConnectionDetail(DescribeRocketMQConsumerConnectionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQConsumerConnectionDetail", DescribeRocketMQConsumerConnectionDetailResponse.class);
    }

    /**
     *获取指定消费组下当前客户端的连接情况
     * @param req DescribeRocketMQConsumerConnectionsRequest
     * @return DescribeRocketMQConsumerConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQConsumerConnectionsResponse DescribeRocketMQConsumerConnections(DescribeRocketMQConsumerConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQConsumerConnections", DescribeRocketMQConsumerConnectionsResponse.class);
    }

    /**
     *获取命名空间角色列表
     * @param req DescribeRocketMQEnvironmentRolesRequest
     * @return DescribeRocketMQEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQEnvironmentRolesResponse DescribeRocketMQEnvironmentRoles(DescribeRocketMQEnvironmentRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQEnvironmentRoles", DescribeRocketMQEnvironmentRolesResponse.class);
    }

    /**
     *获取RocketMQ消费组列表
     * @param req DescribeRocketMQGroupsRequest
     * @return DescribeRocketMQGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQGroupsResponse DescribeRocketMQGroups(DescribeRocketMQGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQGroups", DescribeRocketMQGroupsResponse.class);
    }

    /**
     *查询Topic迁移状态列表，源集群和目标集群客户端数量信息需要配合DescribeRocketMQSmoothMigrationTaskTopicInsNum接口查询
     * @param req DescribeRocketMQMigratingTopicListRequest
     * @return DescribeRocketMQMigratingTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQMigratingTopicListResponse DescribeRocketMQMigratingTopicList(DescribeRocketMQMigratingTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQMigratingTopicList", DescribeRocketMQMigratingTopicListResponse.class);
    }

    /**
     *rocketmq消息详情
     * @param req DescribeRocketMQMsgRequest
     * @return DescribeRocketMQMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQMsgResponse DescribeRocketMQMsg(DescribeRocketMQMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQMsg", DescribeRocketMQMsgResponse.class);
    }

    /**
     *查询消息轨迹
     * @param req DescribeRocketMQMsgTraceRequest
     * @return DescribeRocketMQMsgTraceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQMsgTraceResponse DescribeRocketMQMsgTrace(DescribeRocketMQMsgTraceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQMsgTrace", DescribeRocketMQMsgTraceResponse.class);
    }

    /**
     *获取RocketMQ命名空间列表
     * @param req DescribeRocketMQNamespacesRequest
     * @return DescribeRocketMQNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQNamespacesResponse DescribeRocketMQNamespaces(DescribeRocketMQNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQNamespaces", DescribeRocketMQNamespacesResponse.class);
    }

    /**
     *从腾讯云可观测平台拉取公网指标监控数据，目前仅支持客户端到 LB 的入带宽和出宽带指标。
     * @param req DescribeRocketMQPublicAccessMonitorDataRequest
     * @return DescribeRocketMQPublicAccessMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQPublicAccessMonitorDataResponse DescribeRocketMQPublicAccessMonitorData(DescribeRocketMQPublicAccessMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQPublicAccessMonitorData", DescribeRocketMQPublicAccessMonitorDataResponse.class);
    }

    /**
     *接口用于查询RocketMQ实例的公网接入信息
     * @param req DescribeRocketMQPublicAccessPointRequest
     * @return DescribeRocketMQPublicAccessPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQPublicAccessPointResponse DescribeRocketMQPublicAccessPoint(DescribeRocketMQPublicAccessPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQPublicAccessPoint", DescribeRocketMQPublicAccessPointResponse.class);
    }

    /**
     *获取角色列表
     * @param req DescribeRocketMQRolesRequest
     * @return DescribeRocketMQRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQRolesResponse DescribeRocketMQRoles(DescribeRocketMQRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQRoles", DescribeRocketMQRolesResponse.class);
    }

    /**
     *用于获取RocketMQ平滑迁移任务详情
     * @param req DescribeRocketMQSmoothMigrationTaskRequest
     * @return DescribeRocketMQSmoothMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQSmoothMigrationTaskResponse DescribeRocketMQSmoothMigrationTask(DescribeRocketMQSmoothMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQSmoothMigrationTask", DescribeRocketMQSmoothMigrationTaskResponse.class);
    }

    /**
     *用于查询RocketMQ平滑迁移任务列表
     * @param req DescribeRocketMQSmoothMigrationTaskListRequest
     * @return DescribeRocketMQSmoothMigrationTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQSmoothMigrationTaskListResponse DescribeRocketMQSmoothMigrationTaskList(DescribeRocketMQSmoothMigrationTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQSmoothMigrationTaskList", DescribeRocketMQSmoothMigrationTaskListResponse.class);
    }

    /**
     *平滑迁移过程获取源集群group列表接口
     * @param req DescribeRocketMQSourceClusterGroupListRequest
     * @return DescribeRocketMQSourceClusterGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQSourceClusterGroupListResponse DescribeRocketMQSourceClusterGroupList(DescribeRocketMQSourceClusterGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQSourceClusterGroupList", DescribeRocketMQSourceClusterGroupListResponse.class);
    }

    /**
     *平滑迁移过程获取源集群topic列表接口
     * @param req DescribeRocketMQSourceClusterTopicListRequest
     * @return DescribeRocketMQSourceClusterTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQSourceClusterTopicListResponse DescribeRocketMQSourceClusterTopicList(DescribeRocketMQSourceClusterTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQSourceClusterTopicList", DescribeRocketMQSourceClusterTopicListResponse.class);
    }

    /**
     *用于获取RocketMQ消费组订阅关系数据
     * @param req DescribeRocketMQSubscriptionsRequest
     * @return DescribeRocketMQSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQSubscriptionsResponse DescribeRocketMQSubscriptions(DescribeRocketMQSubscriptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQSubscriptions", DescribeRocketMQSubscriptionsResponse.class);
    }

    /**
     *rocketmq 消息查询
     * @param req DescribeRocketMQTopicMsgsRequest
     * @return DescribeRocketMQTopicMsgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicMsgsResponse DescribeRocketMQTopicMsgs(DescribeRocketMQTopicMsgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopicMsgs", DescribeRocketMQTopicMsgsResponse.class);
    }

    /**
     *获取RocketMQ主题列表
     * @param req DescribeRocketMQTopicsRequest
     * @return DescribeRocketMQTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicsResponse DescribeRocketMQTopics(DescribeRocketMQTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQTopics", DescribeRocketMQTopicsResponse.class);
    }

    /**
     *获取单个RocketMQ专享集群信息
     * @param req DescribeRocketMQVipInstanceDetailRequest
     * @return DescribeRocketMQVipInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQVipInstanceDetailResponse DescribeRocketMQVipInstanceDetail(DescribeRocketMQVipInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQVipInstanceDetail", DescribeRocketMQVipInstanceDetailResponse.class);
    }

    /**
     *查询用户已购的RocketMQ专享实例列表
     * @param req DescribeRocketMQVipInstancesRequest
     * @return DescribeRocketMQVipInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQVipInstancesResponse DescribeRocketMQVipInstances(DescribeRocketMQVipInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRocketMQVipInstances", DescribeRocketMQVipInstancesResponse.class);
    }

    /**
     *获取角色列表
     * @param req DescribeRolesRequest
     * @return DescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRolesResponse DescribeRoles(DescribeRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoles", DescribeRolesResponse.class);
    }

    /**
     *查询指定环境和主题下的订阅者列表
     * @param req DescribeSubscriptionsRequest
     * @return DescribeSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionsResponse DescribeSubscriptions(DescribeSubscriptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscriptions", DescribeSubscriptionsResponse.class);
    }

    /**
     *消息查询
     * @param req DescribeTopicMsgsRequest
     * @return DescribeTopicMsgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicMsgsResponse DescribeTopicMsgs(DescribeTopicMsgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicMsgs", DescribeTopicMsgsResponse.class);
    }

    /**
     *获取环境下主题列表
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
    }

    /**
     *导出RocketMQ消息详情
     * @param req ExportRocketMQMessageDetailRequest
     * @return ExportRocketMQMessageDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportRocketMQMessageDetailResponse ExportRocketMQMessageDetail(ExportRocketMQMessageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRocketMQMessageDetail", ExportRocketMQMessageDetailResponse.class);
    }

    /**
     *输入迁移任务id和要导入的Group，导入后台
     * @param req ImportRocketMQConsumerGroupsRequest
     * @return ImportRocketMQConsumerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ImportRocketMQConsumerGroupsResponse ImportRocketMQConsumerGroups(ImportRocketMQConsumerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportRocketMQConsumerGroups", ImportRocketMQConsumerGroupsResponse.class);
    }

    /**
     *导入topic列表
     * @param req ImportRocketMQTopicsRequest
     * @return ImportRocketMQTopicsResponse
     * @throws TencentCloudSDKException
     */
    public ImportRocketMQTopicsResponse ImportRocketMQTopics(ImportRocketMQTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportRocketMQTopics", ImportRocketMQTopicsResponse.class);
    }

    /**
     *更新Amqp集群信息
     * @param req ModifyAMQPClusterRequest
     * @return ModifyAMQPClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAMQPClusterResponse ModifyAMQPCluster(ModifyAMQPClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAMQPCluster", ModifyAMQPClusterResponse.class);
    }

    /**
     *更新集群信息
     * @param req ModifyClusterRequest
     * @return ModifyClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterResponse ModifyCluster(ModifyClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCluster", ModifyClusterResponse.class);
    }

    /**
     *修改cmq队列属性
     * @param req ModifyCmqQueueAttributeRequest
     * @return ModifyCmqQueueAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqQueueAttributeResponse ModifyCmqQueueAttribute(ModifyCmqQueueAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmqQueueAttribute", ModifyCmqQueueAttributeResponse.class);
    }

    /**
     *修改cmq订阅属性
     * @param req ModifyCmqSubscriptionAttributeRequest
     * @return ModifyCmqSubscriptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqSubscriptionAttributeResponse ModifyCmqSubscriptionAttribute(ModifyCmqSubscriptionAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmqSubscriptionAttribute", ModifyCmqSubscriptionAttributeResponse.class);
    }

    /**
     *修改cmq主题属性
     * @param req ModifyCmqTopicAttributeRequest
     * @return ModifyCmqTopicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqTopicAttributeResponse ModifyCmqTopicAttribute(ModifyCmqTopicAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCmqTopicAttribute", ModifyCmqTopicAttributeResponse.class);
    }

    /**
     *修改指定命名空间的属性值
     * @param req ModifyEnvironmentAttributesRequest
     * @return ModifyEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentAttributesResponse ModifyEnvironmentAttributes(ModifyEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvironmentAttributes", ModifyEnvironmentAttributesResponse.class);
    }

    /**
     *修改环境角色授权。
     * @param req ModifyEnvironmentRoleRequest
     * @return ModifyEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentRoleResponse ModifyEnvironmentRole(ModifyEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvironmentRole", ModifyEnvironmentRoleResponse.class);
    }

    /**
     *RabbitMQ专享版修改公网管控台，vpc15672开关
     * @param req ModifyPublicNetworkAccessPointRequest
     * @return ModifyPublicNetworkAccessPointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublicNetworkAccessPointResponse ModifyPublicNetworkAccessPoint(ModifyPublicNetworkAccessPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublicNetworkAccessPoint", ModifyPublicNetworkAccessPointResponse.class);
    }

    /**
     *修改RabbitMQ的用户
     * @param req ModifyRabbitMQUserRequest
     * @return ModifyRabbitMQUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQUserResponse ModifyRabbitMQUser(ModifyRabbitMQUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQUser", ModifyRabbitMQUserResponse.class);
    }

    /**
     *修改RabbitMQ专享版实例
     * @param req ModifyRabbitMQVipInstanceRequest
     * @return ModifyRabbitMQVipInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQVipInstanceResponse ModifyRabbitMQVipInstance(ModifyRabbitMQVipInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQVipInstance", ModifyRabbitMQVipInstanceResponse.class);
    }

    /**
     *修改RabbitMQ的vhost
     * @param req ModifyRabbitMQVirtualHostRequest
     * @return ModifyRabbitMQVirtualHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRabbitMQVirtualHostResponse ModifyRabbitMQVirtualHost(ModifyRabbitMQVirtualHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRabbitMQVirtualHost", ModifyRabbitMQVirtualHostResponse.class);
    }

    /**
     *更新RocketMQ集群信息
     * @param req ModifyRocketMQClusterRequest
     * @return ModifyRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQClusterResponse ModifyRocketMQCluster(ModifyRocketMQClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQCluster", ModifyRocketMQClusterResponse.class);
    }

    /**
     *修改环境角色授权。
     * @param req ModifyRocketMQEnvironmentRoleRequest
     * @return ModifyRocketMQEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQEnvironmentRoleResponse ModifyRocketMQEnvironmentRole(ModifyRocketMQEnvironmentRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQEnvironmentRole", ModifyRocketMQEnvironmentRoleResponse.class);
    }

    /**
     *更新RocketMQ消费组信息
     * @param req ModifyRocketMQGroupRequest
     * @return ModifyRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQGroupResponse ModifyRocketMQGroup(ModifyRocketMQGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQGroup", ModifyRocketMQGroupResponse.class);
    }

    /**
     *本API用于修改RocketMQ专享实例配置，可以支持实例规格、节点数和存储的升配和实例规格的降配。本API发起订单并成功支付后进入实例配置变更的流程，可通过DescribeRocketMQVipInstances查询实例是否已变更完成。
     * @param req ModifyRocketMQInstanceSpecRequest
     * @return ModifyRocketMQInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQInstanceSpecResponse ModifyRocketMQInstanceSpec(ModifyRocketMQInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQInstanceSpec", ModifyRocketMQInstanceSpecResponse.class);
    }

    /**
     *更新RocketMQ命名空间
     * @param req ModifyRocketMQNamespaceRequest
     * @return ModifyRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQNamespaceResponse ModifyRocketMQNamespace(ModifyRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQNamespace", ModifyRocketMQNamespaceResponse.class);
    }

    /**
     *角色修改
     * @param req ModifyRocketMQRoleRequest
     * @return ModifyRocketMQRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQRoleResponse ModifyRocketMQRole(ModifyRocketMQRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQRole", ModifyRocketMQRoleResponse.class);
    }

    /**
     *更新RocketMQ主题信息
     * @param req ModifyRocketMQTopicRequest
     * @return ModifyRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQTopicResponse ModifyRocketMQTopic(ModifyRocketMQTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRocketMQTopic", ModifyRocketMQTopicResponse.class);
    }

    /**
     *角色修改
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
    }

    /**
     *修改主题备注和分区数
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *发送cmq主题消息
     * @param req PublishCmqMsgRequest
     * @return PublishCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishCmqMsgResponse PublishCmqMsg(PublishCmqMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishCmqMsg", PublishCmqMsgResponse.class);
    }

    /**
     *当前 ReceiveMessage 接口只支持 Partitioned 类型的 Topic。该接口用于接收发送到指定 Partitioned Topic 中的消息，当 Partitioned Topic 中没有消息但还去尝试调用该接口时，会抛出 ReceiveTimeout 的异常。

如何使用 BatchReceivePolicy：

BatchReceive 接口提供了如下三个参数：

● MaxNumMessages: 即每次使用 BatchReceive 的时候，最多一次Receive接口返回多少条消息。
● MaxNumBytes：即每次使用 BatchReceive 的时候，最多一次Receive接口返回多大内容的消息，单位是：bytes。
● Timeout：即每次使用 BatchReceive 的时候，最多一次 Receive 接口的超时时间是多久，单位是：MS。

默认如果上述三个参数都不指定，即关闭 BatchReceive 的特性。如果三个参数中的任意一个参数指定的数值大于 0，即开启 BatchReceive。BatchReceive 的结束条件为到达上述三个参数中任意一个指定的阈值。

注意：MaxNumMessages 和 MaxNumBytes 每一次接收的最大消息同时受限于 ReceiveQueueSize 的大小，如果 ReceiveQueueSize 的大小设置为 5，MaxNumMessages 设置为10，那么一次 BatchReceive 接收的最多的消息是 5条，而不是10条。



BatchReceivePolicy 的接口会一次性返回多条消息：

1. 多条消息的内容之间使用特殊字符 '###' 来进行分割，业务侧接收到消息之后，可以利用不同语言提供的 Split 工具分割不同的消息。
2. 多条消息的 MessageID 之间使用特殊字符 '###' 来进行分割，业务侧接收到消息之后，可以利用不同语言提供的 Split 工具分割不同的消息。（用于在调用 AcknowledgeMessage 接口中填入所需要的 MessageID 字段信息）
     * @param req ReceiveMessageRequest
     * @return ReceiveMessageResponse
     * @throws TencentCloudSDKException
     */
    public ReceiveMessageResponse ReceiveMessage(ReceiveMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReceiveMessage", ReceiveMessageResponse.class);
    }

    /**
     *根据时间戳进行消息回溯，精确到毫秒
     * @param req ResetMsgSubOffsetByTimestampRequest
     * @return ResetMsgSubOffsetByTimestampResponse
     * @throws TencentCloudSDKException
     */
    public ResetMsgSubOffsetByTimestampResponse ResetMsgSubOffsetByTimestamp(ResetMsgSubOffsetByTimestampRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetMsgSubOffsetByTimestamp", ResetMsgSubOffsetByTimestampResponse.class);
    }

    /**
     *重置指定Group的消费位点到指定时间戳
     * @param req ResetRocketMQConsumerOffSetRequest
     * @return ResetRocketMQConsumerOffSetResponse
     * @throws TencentCloudSDKException
     */
    public ResetRocketMQConsumerOffSetResponse ResetRocketMQConsumerOffSet(ResetRocketMQConsumerOffSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRocketMQConsumerOffSet", ResetRocketMQConsumerOffSetResponse.class);
    }

    /**
     *回溯cmq队列
     * @param req RewindCmqQueueRequest
     * @return RewindCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public RewindCmqQueueResponse RewindCmqQueue(RewindCmqQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RewindCmqQueue", RewindCmqQueueResponse.class);
    }

    /**
     *批量发送消息

注意：TDMQ 批量发送消息的接口是在 TDMQ-HTTP 的服务侧将消息打包为一个 Batch，然后将该 Batch 在服务内部当作一次 TCP 请求发送出去。所以在使用过程中，用户还是按照单条消息发送的逻辑，每一条消息是一个独立的 HTTP 的请求，在 TDMQ-HTTP 的服务内部，会将多个 HTTP 的请求聚合为一个 Batch 发送到服务端。即，批量发送消息在使用上与发送单条消息是一致的，batch 的聚合是在 TDMQ-HTTP 的服务内部完成的。
     * @param req SendBatchMessagesRequest
     * @return SendBatchMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendBatchMessagesResponse SendBatchMessages(SendBatchMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendBatchMessages", SendBatchMessagesResponse.class);
    }

    /**
     *发送cmq消息
     * @param req SendCmqMsgRequest
     * @return SendCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCmqMsgResponse SendCmqMsg(SendCmqMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendCmqMsg", SendCmqMsgResponse.class);
    }

    /**
     *发送单条消息
不支持持久topic
     * @param req SendMessagesRequest
     * @return SendMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendMessagesResponse SendMessages(SendMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMessages", SendMessagesResponse.class);
    }

    /**
     *此接口仅用于测试发生消息，不能作为现网正式生产使用
     * @param req SendMsgRequest
     * @return SendMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendMsgResponse SendMsg(SendMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMsg", SendMsgResponse.class);
    }

    /**
     *发送RocketMQ消息
     * @param req SendRocketMQMessageRequest
     * @return SendRocketMQMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendRocketMQMessageResponse SendRocketMQMessage(SendRocketMQMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendRocketMQMessage", SendRocketMQMessageResponse.class);
    }

    /**
     *该接口用于开启关闭公网访问、设置安全访问策略
     * @param req SetRocketMQPublicAccessPointRequest
     * @return SetRocketMQPublicAccessPointResponse
     * @throws TencentCloudSDKException
     */
    public SetRocketMQPublicAccessPointResponse SetRocketMQPublicAccessPoint(SetRocketMQPublicAccessPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetRocketMQPublicAccessPoint", SetRocketMQPublicAccessPointResponse.class);
    }

    /**
     *解绑cmq死信队列
     * @param req UnbindCmqDeadLetterRequest
     * @return UnbindCmqDeadLetterResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCmqDeadLetterResponse UnbindCmqDeadLetter(UnbindCmqDeadLetterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCmqDeadLetter", UnbindCmqDeadLetterResponse.class);
    }

    /**
     *Rocketmq消费验证
     * @param req VerifyRocketMQConsumeRequest
     * @return VerifyRocketMQConsumeResponse
     * @throws TencentCloudSDKException
     */
    public VerifyRocketMQConsumeResponse VerifyRocketMQConsume(VerifyRocketMQConsumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyRocketMQConsume", VerifyRocketMQConsumeResponse.class);
    }

}
