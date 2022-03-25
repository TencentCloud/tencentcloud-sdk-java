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
        JsonResponseModel<AcknowledgeMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcknowledgeMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcknowledgeMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *清空cmq消息队列中的消息
     * @param req ClearCmqQueueRequest
     * @return ClearCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqQueueResponse ClearCmqQueue(ClearCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearCmqQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ClearCmqQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClearCmqQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *清空订阅者消息标签
     * @param req ClearCmqSubscriptionFilterTagsRequest
     * @return ClearCmqSubscriptionFilterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ClearCmqSubscriptionFilterTagsResponse ClearCmqSubscriptionFilterTags(ClearCmqSubscriptionFilterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearCmqSubscriptionFilterTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ClearCmqSubscriptionFilterTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClearCmqSubscriptionFilterTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建AMQP集群
     * @param req CreateAMQPClusterRequest
     * @return CreateAMQPClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateAMQPClusterResponse CreateAMQPCluster(CreateAMQPClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAMQPClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAMQPClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAMQPCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建AMQP Exchange
     * @param req CreateAMQPExchangeRequest
     * @return CreateAMQPExchangeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAMQPExchangeResponse CreateAMQPExchange(CreateAMQPExchangeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAMQPExchangeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAMQPExchangeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAMQPExchange");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建AMQP队列
     * @param req CreateAMQPQueueRequest
     * @return CreateAMQPQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateAMQPQueueResponse CreateAMQPQueue(CreateAMQPQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAMQPQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAMQPQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAMQPQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建AMQP路由关系
     * @param req CreateAMQPRouteRelationRequest
     * @return CreateAMQPRouteRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateAMQPRouteRelationResponse CreateAMQPRouteRelation(CreateAMQPRouteRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAMQPRouteRelationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAMQPRouteRelationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAMQPRouteRelation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Amqp Vhost
     * @param req CreateAMQPVHostRequest
     * @return CreateAMQPVHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateAMQPVHostResponse CreateAMQPVHost(CreateAMQPVHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAMQPVHostResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAMQPVHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAMQPVHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户的集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建cmq队列接口
     * @param req CreateCmqQueueRequest
     * @return CreateCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqQueueResponse CreateCmqQueue(CreateCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCmqQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCmqQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCmqQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建cmq订阅接口
     * @param req CreateCmqSubscribeRequest
     * @return CreateCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqSubscribeResponse CreateCmqSubscribe(CreateCmqSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCmqSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCmqSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCmqSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建cmq主题
     * @param req CreateCmqTopicRequest
     * @return CreateCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateCmqTopicResponse CreateCmqTopic(CreateCmqTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCmqTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCmqTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCmqTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在用户账户下创建消息队列 Tdmq 命名空间
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnvironmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建环境角色授权
     * @param req CreateEnvironmentRoleRequest
     * @return CreateEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentRoleResponse CreateEnvironmentRole(CreateEnvironmentRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnvironmentRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEnvironmentRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEnvironmentRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于创建一个RocketMQ集群
     * @param req CreateRocketMQClusterRequest
     * @return CreateRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQClusterResponse CreateRocketMQCluster(CreateRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRocketMQClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRocketMQCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建RocketMQ消费组
     * @param req CreateRocketMQGroupRequest
     * @return CreateRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQGroupResponse CreateRocketMQGroup(CreateRocketMQGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRocketMQGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRocketMQGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建RocketMQ命名空间
     * @param req CreateRocketMQNamespaceRequest
     * @return CreateRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQNamespaceResponse CreateRocketMQNamespace(CreateRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRocketMQNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRocketMQNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建RocketMQ主题
     * @param req CreateRocketMQTopicRequest
     * @return CreateRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateRocketMQTopicResponse CreateRocketMQTopic(CreateRocketMQTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRocketMQTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRocketMQTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRocketMQTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建角色
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个主题的订阅关系
     * @param req CreateSubscriptionRequest
     * @return CreateSubscriptionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscriptionResponse CreateSubscription(CreateSubscriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubscriptionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubscriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubscription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增指定分区、类型的消息主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除AMQP集群
     * @param req DeleteAMQPClusterRequest
     * @return DeleteAMQPClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAMQPClusterResponse DeleteAMQPCluster(DeleteAMQPClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAMQPClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAMQPClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAMQPCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Amqp交换机
     * @param req DeleteAMQPExchangeRequest
     * @return DeleteAMQPExchangeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAMQPExchangeResponse DeleteAMQPExchange(DeleteAMQPExchangeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAMQPExchangeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAMQPExchangeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAMQPExchange");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Amqp队列
     * @param req DeleteAMQPQueueRequest
     * @return DeleteAMQPQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAMQPQueueResponse DeleteAMQPQueue(DeleteAMQPQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAMQPQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAMQPQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAMQPQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Amqp路由关系
     * @param req DeleteAMQPRouteRelationRequest
     * @return DeleteAMQPRouteRelationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAMQPRouteRelationResponse DeleteAMQPRouteRelation(DeleteAMQPRouteRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAMQPRouteRelationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAMQPRouteRelationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAMQPRouteRelation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Vhost
     * @param req DeleteAMQPVHostRequest
     * @return DeleteAMQPVHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAMQPVHostResponse DeleteAMQPVHost(DeleteAMQPVHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAMQPVHostResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAMQPVHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAMQPVHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除cmq队列
     * @param req DeleteCmqQueueRequest
     * @return DeleteCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqQueueResponse DeleteCmqQueue(DeleteCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCmqQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCmqQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCmqQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除cmq订阅
     * @param req DeleteCmqSubscribeRequest
     * @return DeleteCmqSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqSubscribeResponse DeleteCmqSubscribe(DeleteCmqSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCmqSubscribeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCmqSubscribeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCmqSubscribe");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除cmq主题
     * @param req DeleteCmqTopicRequest
     * @return DeleteCmqTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCmqTopicResponse DeleteCmqTopic(DeleteCmqTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCmqTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCmqTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCmqTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除环境角色授权。
     * @param req DeleteEnvironmentRolesRequest
     * @return DeleteEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentRolesResponse DeleteEnvironmentRoles(DeleteEnvironmentRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEnvironmentRolesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEnvironmentRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEnvironmentRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除租户下的命名空间
     * @param req DeleteEnvironmentsRequest
     * @return DeleteEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentsResponse DeleteEnvironments(DeleteEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEnvironmentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除RocketMQ集群
     * @param req DeleteRocketMQClusterRequest
     * @return DeleteRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQClusterResponse DeleteRocketMQCluster(DeleteRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRocketMQClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRocketMQCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除RocketMQ消费组
     * @param req DeleteRocketMQGroupRequest
     * @return DeleteRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQGroupResponse DeleteRocketMQGroup(DeleteRocketMQGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRocketMQGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRocketMQGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除RocketMQ命名空间
     * @param req DeleteRocketMQNamespaceRequest
     * @return DeleteRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQNamespaceResponse DeleteRocketMQNamespace(DeleteRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRocketMQNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRocketMQNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除RocketMQ主题
     * @param req DeleteRocketMQTopicRequest
     * @return DeleteRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRocketMQTopicResponse DeleteRocketMQTopic(DeleteRocketMQTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRocketMQTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRocketMQTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRocketMQTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除角色，支持批量。
     * @param req DeleteRolesRequest
     * @return DeleteRolesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRolesResponse DeleteRoles(DeleteRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRolesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除订阅关系
     * @param req DeleteSubscriptionsRequest
     * @return DeleteSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubscriptionsResponse DeleteSubscriptions(DeleteSubscriptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubscriptionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSubscriptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSubscriptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除topics
     * @param req DeleteTopicsRequest
     * @return DeleteTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicsResponse DeleteTopics(DeleteTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个Amqp集群信息
     * @param req DescribeAMQPClusterRequest
     * @return DescribeAMQPClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPClusterResponse DescribeAMQPCluster(DescribeAMQPClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取amqp集群列表
     * @param req DescribeAMQPClustersRequest
     * @return DescribeAMQPClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPClustersResponse DescribeAMQPClusters(DescribeAMQPClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户的配额，如Queue容量，Exchange容量，Vhost容量，单Vhost Tps数,剩余可创建集群数
     * @param req DescribeAMQPCreateQuotaRequest
     * @return DescribeAMQPCreateQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPCreateQuotaResponse DescribeAMQPCreateQuota(DescribeAMQPCreateQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPCreateQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPCreateQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPCreateQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取AMQP Exchange列表
     * @param req DescribeAMQPExchangesRequest
     * @return DescribeAMQPExchangesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPExchangesResponse DescribeAMQPExchanges(DescribeAMQPExchangesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPExchangesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPExchangesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPExchanges");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Amqp队列列表
     * @param req DescribeAMQPQueuesRequest
     * @return DescribeAMQPQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPQueuesResponse DescribeAMQPQueues(DescribeAMQPQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPQueuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPQueuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPQueues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Amqp路由关系列表
     * @param req DescribeAMQPRouteRelationsRequest
     * @return DescribeAMQPRouteRelationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPRouteRelationsResponse DescribeAMQPRouteRelations(DescribeAMQPRouteRelationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPRouteRelationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPRouteRelationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPRouteRelations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Amqp Vhost 列表
     * @param req DescribeAMQPVHostsRequest
     * @return DescribeAMQPVHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAMQPVHostsResponse DescribeAMQPVHosts(DescribeAMQPVHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAMQPVHostsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAMQPVHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAMQPVHosts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个租户的虚拟集群列表
     * @param req DescribeAllTenantsRequest
     * @return DescribeAllTenantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllTenantsResponse DescribeAllTenants(DescribeAllTenantsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllTenantsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllTenantsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllTenants");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户绑定的专享集群列表
     * @param req DescribeBindClustersRequest
     * @return DescribeBindClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindClustersResponse DescribeBindClusters(DescribeBindClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取租户VPC绑定关系
     * @param req DescribeBindVpcsRequest
     * @return DescribeBindVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindVpcsResponse DescribeBindVpcs(DescribeBindVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindVpcsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindVpcsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindVpcs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群的详细信息
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群列表
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举cmq死信队列源队列
     * @param req DescribeCmqDeadLetterSourceQueuesRequest
     * @return DescribeCmqDeadLetterSourceQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqDeadLetterSourceQueuesResponse DescribeCmqDeadLetterSourceQueues(DescribeCmqDeadLetterSourceQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqDeadLetterSourceQueuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCmqDeadLetterSourceQueuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCmqDeadLetterSourceQueues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询cmq队列详情
     * @param req DescribeCmqQueueDetailRequest
     * @return DescribeCmqQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueueDetailResponse DescribeCmqQueueDetail(DescribeCmqQueueDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqQueueDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCmqQueueDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCmqQueueDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询cmq全量队列
     * @param req DescribeCmqQueuesRequest
     * @return DescribeCmqQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqQueuesResponse DescribeCmqQueues(DescribeCmqQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqQueuesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCmqQueuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCmqQueues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询cmq订阅详情
     * @param req DescribeCmqSubscriptionDetailRequest
     * @return DescribeCmqSubscriptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqSubscriptionDetailResponse DescribeCmqSubscriptionDetail(DescribeCmqSubscriptionDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqSubscriptionDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCmqSubscriptionDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCmqSubscriptionDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询cmq主题详情
     * @param req DescribeCmqTopicDetailRequest
     * @return DescribeCmqTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicDetailResponse DescribeCmqTopicDetail(DescribeCmqTopicDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqTopicDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCmqTopicDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCmqTopicDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举cmq全量主题
     * @param req DescribeCmqTopicsRequest
     * @return DescribeCmqTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCmqTopicsResponse DescribeCmqTopics(DescribeCmqTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCmqTopicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCmqTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCmqTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定命名空间的属性
     * @param req DescribeEnvironmentAttributesRequest
     * @return DescribeEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentAttributesResponse DescribeEnvironmentAttributes(DescribeEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironmentAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取命名空间角色列表
     * @param req DescribeEnvironmentRolesRequest
     * @return DescribeEnvironmentRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentRolesResponse DescribeEnvironmentRoles(DescribeEnvironmentRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentRolesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironmentRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取租户下命名空间列表
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvironmentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvironmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvironments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运营端获取命名空间bundle列表
     * @param req DescribeNamespaceBundlesOptRequest
     * @return DescribeNamespaceBundlesOptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespaceBundlesOptResponse DescribeNamespaceBundlesOpt(DescribeNamespaceBundlesOptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespaceBundlesOptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespaceBundlesOptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaceBundlesOpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运营端获节点健康状态
     * @param req DescribeNodeHealthOptRequest
     * @return DescribeNodeHealthOptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeHealthOptResponse DescribeNodeHealthOpt(DescribeNodeHealthOptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNodeHealthOptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNodeHealthOptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNodeHealthOpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取消息生产概览信息
     * @param req DescribePublisherSummaryRequest
     * @return DescribePublisherSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublisherSummaryResponse DescribePublisherSummary(DescribePublisherSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublisherSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublisherSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublisherSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取生产者信息列表
     * @param req DescribePublishersRequest
     * @return DescribePublishersResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublishersResponse DescribePublishers(DescribePublishersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublishersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublishersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublishers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个RocketMQ集群信息
     * @param req DescribeRocketMQClusterRequest
     * @return DescribeRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClusterResponse DescribeRocketMQCluster(DescribeRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRocketMQClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRocketMQCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取RocketMQ集群列表
     * @param req DescribeRocketMQClustersRequest
     * @return DescribeRocketMQClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQClustersResponse DescribeRocketMQClusters(DescribeRocketMQClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRocketMQClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRocketMQClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取RocketMQ消费组列表
     * @param req DescribeRocketMQGroupsRequest
     * @return DescribeRocketMQGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQGroupsResponse DescribeRocketMQGroups(DescribeRocketMQGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRocketMQGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRocketMQGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取RocketMQ命名空间列表
     * @param req DescribeRocketMQNamespacesRequest
     * @return DescribeRocketMQNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQNamespacesResponse DescribeRocketMQNamespaces(DescribeRocketMQNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRocketMQNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRocketMQNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取RocketMQ主题列表
     * @param req DescribeRocketMQTopicsRequest
     * @return DescribeRocketMQTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRocketMQTopicsResponse DescribeRocketMQTopics(DescribeRocketMQTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRocketMQTopicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRocketMQTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRocketMQTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取角色列表
     * @param req DescribeRolesRequest
     * @return DescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRolesResponse DescribeRoles(DescribeRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRolesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定环境和主题下的订阅者列表
     * @param req DescribeSubscriptionsRequest
     * @return DescribeSubscriptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionsResponse DescribeSubscriptions(DescribeSubscriptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscriptionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscriptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubscriptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境下主题列表
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新Amqp集群信息
     * @param req ModifyAMQPClusterRequest
     * @return ModifyAMQPClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAMQPClusterResponse ModifyAMQPCluster(ModifyAMQPClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAMQPClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAMQPClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAMQPCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新Amqp交换机
     * @param req ModifyAMQPExchangeRequest
     * @return ModifyAMQPExchangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAMQPExchangeResponse ModifyAMQPExchange(ModifyAMQPExchangeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAMQPExchangeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAMQPExchangeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAMQPExchange");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新Amqp队列
     * @param req ModifyAMQPQueueRequest
     * @return ModifyAMQPQueueResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAMQPQueueResponse ModifyAMQPQueue(ModifyAMQPQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAMQPQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAMQPQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAMQPQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新Vhost
     * @param req ModifyAMQPVHostRequest
     * @return ModifyAMQPVHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAMQPVHostResponse ModifyAMQPVHost(ModifyAMQPVHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAMQPVHostResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAMQPVHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAMQPVHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新集群信息
     * @param req ModifyClusterRequest
     * @return ModifyClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterResponse ModifyCluster(ModifyClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改cmq队列属性
     * @param req ModifyCmqQueueAttributeRequest
     * @return ModifyCmqQueueAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqQueueAttributeResponse ModifyCmqQueueAttribute(ModifyCmqQueueAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCmqQueueAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCmqQueueAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCmqQueueAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改cmq订阅属性
     * @param req ModifyCmqSubscriptionAttributeRequest
     * @return ModifyCmqSubscriptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqSubscriptionAttributeResponse ModifyCmqSubscriptionAttribute(ModifyCmqSubscriptionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCmqSubscriptionAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCmqSubscriptionAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCmqSubscriptionAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改cmq主题属性
     * @param req ModifyCmqTopicAttributeRequest
     * @return ModifyCmqTopicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCmqTopicAttributeResponse ModifyCmqTopicAttribute(ModifyCmqTopicAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCmqTopicAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCmqTopicAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCmqTopicAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改指定命名空间的属性值
     * @param req ModifyEnvironmentAttributesRequest
     * @return ModifyEnvironmentAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentAttributesResponse ModifyEnvironmentAttributes(ModifyEnvironmentAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvironmentAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEnvironmentAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改环境角色授权。
     * @param req ModifyEnvironmentRoleRequest
     * @return ModifyEnvironmentRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvironmentRoleResponse ModifyEnvironmentRole(ModifyEnvironmentRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvironmentRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvironmentRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEnvironmentRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新RocketMQ集群信息
     * @param req ModifyRocketMQClusterRequest
     * @return ModifyRocketMQClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQClusterResponse ModifyRocketMQCluster(ModifyRocketMQClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRocketMQClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRocketMQCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新RocketMQ消费组信息
     * @param req ModifyRocketMQGroupRequest
     * @return ModifyRocketMQGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQGroupResponse ModifyRocketMQGroup(ModifyRocketMQGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRocketMQGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRocketMQGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新RocketMQ命名空间
     * @param req ModifyRocketMQNamespaceRequest
     * @return ModifyRocketMQNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQNamespaceResponse ModifyRocketMQNamespace(ModifyRocketMQNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRocketMQNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRocketMQNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新RocketMQ主题信息
     * @param req ModifyRocketMQTopicRequest
     * @return ModifyRocketMQTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRocketMQTopicResponse ModifyRocketMQTopic(ModifyRocketMQTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRocketMQTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRocketMQTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRocketMQTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *角色修改
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改主题备注和分区数
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送cmq主题消息
     * @param req PublishCmqMsgRequest
     * @return PublishCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishCmqMsgResponse PublishCmqMsg(PublishCmqMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishCmqMsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishCmqMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishCmqMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接收发送到指定 topic 中的消息
     * @param req ReceiveMessageRequest
     * @return ReceiveMessageResponse
     * @throws TencentCloudSDKException
     */
    public ReceiveMessageResponse ReceiveMessage(ReceiveMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReceiveMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReceiveMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReceiveMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据时间戳进行消息回溯，精确到毫秒
     * @param req ResetMsgSubOffsetByTimestampRequest
     * @return ResetMsgSubOffsetByTimestampResponse
     * @throws TencentCloudSDKException
     */
    public ResetMsgSubOffsetByTimestampResponse ResetMsgSubOffsetByTimestamp(ResetMsgSubOffsetByTimestampRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetMsgSubOffsetByTimestampResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetMsgSubOffsetByTimestampResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetMsgSubOffsetByTimestamp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置指定Group的消费位点到指定时间戳
     * @param req ResetRocketMQConsumerOffSetRequest
     * @return ResetRocketMQConsumerOffSetResponse
     * @throws TencentCloudSDKException
     */
    public ResetRocketMQConsumerOffSetResponse ResetRocketMQConsumerOffSet(ResetRocketMQConsumerOffSetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRocketMQConsumerOffSetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetRocketMQConsumerOffSetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetRocketMQConsumerOffSet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *回溯cmq队列
     * @param req RewindCmqQueueRequest
     * @return RewindCmqQueueResponse
     * @throws TencentCloudSDKException
     */
    public RewindCmqQueueResponse RewindCmqQueue(RewindCmqQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RewindCmqQueueResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RewindCmqQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RewindCmqQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量发送消息

注意：TDMQ 批量发送消息的接口是在 TDMQ-HTTP 的服务侧将消息打包为一个 Batch，然后将该 Batch 在服务内部当作一次 TCP 请求发送出去。所以在使用过程中，用户还是按照单条消息发送的逻辑，每一条消息是一个独立的 HTTP 的请求，在 TDMQ-HTTP 的服务内部，会将多个 HTTP 的请求聚合为一个 Batch 发送到服务端。即，批量发送消息在使用上与发送单条消息是一致的，batch 的聚合是在 TDMQ-HTTP 的服务内部完成的。
     * @param req SendBatchMessagesRequest
     * @return SendBatchMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendBatchMessagesResponse SendBatchMessages(SendBatchMessagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendBatchMessagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendBatchMessagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendBatchMessages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送cmq消息
     * @param req SendCmqMsgRequest
     * @return SendCmqMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendCmqMsgResponse SendCmqMsg(SendCmqMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendCmqMsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendCmqMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendCmqMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送单条消息
     * @param req SendMessagesRequest
     * @return SendMessagesResponse
     * @throws TencentCloudSDKException
     */
    public SendMessagesResponse SendMessages(SendMessagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMessagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendMessagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendMessages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口仅用于测试发生消息，不能作为现网正式生产使用
     * @param req SendMsgRequest
     * @return SendMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendMsgResponse SendMsg(SendMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑cmq死信队列
     * @param req UnbindCmqDeadLetterRequest
     * @return UnbindCmqDeadLetterResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCmqDeadLetterResponse UnbindCmqDeadLetter(UnbindCmqDeadLetterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindCmqDeadLetterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindCmqDeadLetterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindCmqDeadLetter");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
