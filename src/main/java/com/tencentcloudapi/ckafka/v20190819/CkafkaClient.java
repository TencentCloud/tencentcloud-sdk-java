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
package com.tencentcloudapi.ckafka.v20190819;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ckafka.v20190819.models.*;

public class CkafkaClient extends AbstractClient{
    private static String endpoint = "ckafka.tencentcloudapi.com";
    private static String service = "ckafka";
    private static String version = "2019-08-19";
    
    public CkafkaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CkafkaClient(Credential credential, String region, ClientProfile profile) {
        super(CkafkaClient.endpoint, CkafkaClient.version, credential, region, profile);
    }

    /**
     *给实例授权token
     * @param req AuthorizeTokenRequest
     * @return AuthorizeTokenResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeTokenResponse AuthorizeToken(AuthorizeTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuthorizeTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AuthorizeTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuthorizeToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量添加ACL策略
     * @param req BatchCreateAclRequest
     * @return BatchCreateAclResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateAclResponse BatchCreateAcl(BatchCreateAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateAclResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchCreateAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchCreateAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改消费组offset
     * @param req BatchModifyGroupOffsetsRequest
     * @return BatchModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyGroupOffsetsResponse BatchModifyGroupOffsets(BatchModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyGroupOffsetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyGroupOffsetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchModifyGroupOffsets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量设置主题属性
     * @param req BatchModifyTopicAttributesRequest
     * @return BatchModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTopicAttributesResponse BatchModifyTopicAttributes(BatchModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyTopicAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyTopicAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchModifyTopicAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消授权token
     * @param req CancelAuthorizationTokenRequest
     * @return CancelAuthorizationTokenResponse
     * @throws TencentCloudSDKException
     */
    public CancelAuthorizationTokenResponse CancelAuthorizationToken(CancelAuthorizationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelAuthorizationTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelAuthorizationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelAuthorizationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询cdc-ckafka任务状态
     * @param req CheckCdcClusterRequest
     * @return CheckCdcClusterResponse
     * @throws TencentCloudSDKException
     */
    public CheckCdcClusterResponse CheckCdcCluster(CheckCdcClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckCdcClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckCdcClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckCdcCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加 ACL 策略
     * @param req CreateAclRequest
     * @return CreateAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclResponse CreateAcl(CreateAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAclResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加 ACL 规则
     * @param req CreateAclRuleRequest
     * @return CreateAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclRuleResponse CreateAclRule(CreateAclRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAclRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAclRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAclRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于cdc的专用ckafka集群
     * @param req CreateCdcClusterRequest
     * @return CreateCdcClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdcClusterResponse CreateCdcCluster(CreateCdcClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCdcClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCdcClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCdcCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Datahub连接源
     * @param req CreateConnectResourceRequest
     * @return CreateConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateConnectResourceResponse CreateConnectResource(CreateConnectResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConnectResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConnectResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConnectResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建消费者组
     * @param req CreateConsumerRequest
     * @return CreateConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerResponse CreateConsumer(CreateConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConsumerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConsumer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建DIP转储任务
     * @param req CreateDatahubTaskRequest
     * @return CreateDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatahubTaskResponse CreateDatahubTask(CreateDatahubTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatahubTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatahubTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDatahubTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Datahub主题
     * @param req CreateDatahubTopicRequest
     * @return CreateDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatahubTopicResponse CreateDatahubTopic(CreateDatahubTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatahubTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatahubTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDatahubTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *由于出参需要更新，当前接口将会在未来版本中废弃，建议用户迁移使用 CreatePostPaidInstance 接口。创建按量计费实例。通常用于 SDK 或云 API 控制台调用接口，创建后付费 CKafka 实例。调用接口与在 CKafka 控制台购买按量付费实例效果相同。
     * @param req CreateInstancePostRequest
     * @return CreateInstancePostResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancePostResponse CreateInstancePost(CreateInstancePostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancePostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancePostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstancePost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建实例(预付费包年包月)
     * @param req CreateInstancePreRequest
     * @return CreateInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancePreResponse CreateInstancePre(CreateInstancePreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancePreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancePreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstancePre");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于增加主题中的分区
     * @param req CreatePartitionRequest
     * @return CreatePartitionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePartitionResponse CreatePartition(CreatePartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePartitionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当前接口用来替代 CreateInstancePost 接口。创建按量计费实例。通常用于 SDK 或云 API 控制台调用接口，创建后付费 CKafka 实例。调用接口与在 CKafka 控制台购买按量付费实例效果相同。
     * @param req CreatePostPaidInstanceRequest
     * @return CreatePostPaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostPaidInstanceResponse CreatePostPaidInstance(CreatePostPaidInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePostPaidInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePostPaidInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePostPaidInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加实例路由
     * @param req CreateRouteRequest
     * @return CreateRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteResponse CreateRoute(CreateRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建最高权限的token
     * @param req CreateTokenRequest
     * @return CreateTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateTokenResponse CreateToken(CreateTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建ckafka主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *创建主题ip白名单
     * @param req CreateTopicIpWhiteListRequest
     * @return CreateTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicIpWhiteListResponse CreateTopicIpWhiteList(CreateTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicIpWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicIpWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopicIpWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除ACL
     * @param req DeleteAclRequest
     * @return DeleteAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclResponse DeleteAcl(DeleteAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAclResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除ACL规则
     * @param req DeleteAclRuleRequest
     * @return DeleteAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclRuleResponse DeleteAclRule(DeleteAclRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAclRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAclRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAclRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Datahub连接源
     * @param req DeleteConnectResourceRequest
     * @return DeleteConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConnectResourceResponse DeleteConnectResource(DeleteConnectResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConnectResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConnectResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteConnectResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Datahub任务
     * @param req DeleteDatahubTaskRequest
     * @return DeleteDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatahubTaskResponse DeleteDatahubTask(DeleteDatahubTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDatahubTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDatahubTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDatahubTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Datahub主题
     * @param req DeleteDatahubTopicRequest
     * @return DeleteDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatahubTopicResponse DeleteDatahubTopic(DeleteDatahubTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDatahubTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDatahubTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDatahubTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除消费组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除预付费实例
     * @param req DeleteInstancePreRequest
     * @return DeleteInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstancePreResponse DeleteInstancePre(DeleteInstancePreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstancePreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstancePreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstancePre");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除路由
     * @param req DeleteRouteRequest
     * @return DeleteRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteResponse DeleteRoute(DeleteRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改删除路由延迟触发时间
     * @param req DeleteRouteTriggerTimeRequest
     * @return DeleteRouteTriggerTimeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTriggerTimeResponse DeleteRouteTriggerTime(DeleteRouteTriggerTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRouteTriggerTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRouteTriggerTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRouteTriggerTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除ckafka主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除主题IP白名单
     * @param req DeleteTopicIpWhiteListRequest
     * @return DeleteTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicIpWhiteListResponse DeleteTopicIpWhiteList(DeleteTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicIpWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicIpWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopicIpWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举ACL
     * @param req DescribeACLRequest
     * @return DescribeACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeACLResponse DescribeACL(DescribeACLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeACLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeACLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeACL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询ACL规则列表
     * @param req DescribeAclRuleRequest
     * @return DescribeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAclRuleResponse DescribeAclRule(DescribeAclRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAclRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAclRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAclRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户列表
     * @param req DescribeAppInfoRequest
     * @return DescribeAppInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppInfoResponse DescribeAppInfo(DescribeAppInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAppInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAppInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看ckafka的可用区列表
     * @param req DescribeCkafkaZoneRequest
     * @return DescribeCkafkaZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCkafkaZoneResponse DescribeCkafkaZone(DescribeCkafkaZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCkafkaZoneResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCkafkaZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCkafkaZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Datahub连接源
     * @param req DescribeConnectResourceRequest
     * @return DescribeConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectResourceResponse DescribeConnectResource(DescribeConnectResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConnectResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConnectResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConnectResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Datahub连接源列表
     * @param req DescribeConnectResourcesRequest
     * @return DescribeConnectResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectResourcesResponse DescribeConnectResources(DescribeConnectResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConnectResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConnectResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConnectResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询消费分组信息
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConsumerGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConsumerGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConsumerGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Datahub消费分组offset
     * @param req DescribeDatahubGroupOffsetsRequest
     * @return DescribeDatahubGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubGroupOffsetsResponse DescribeDatahubGroupOffsets(DescribeDatahubGroupOffsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatahubGroupOffsetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatahubGroupOffsetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatahubGroupOffsets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Datahub任务信息
     * @param req DescribeDatahubTaskRequest
     * @return DescribeDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTaskResponse DescribeDatahubTask(DescribeDatahubTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatahubTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatahubTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatahubTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Datahub任务列表 
     * @param req DescribeDatahubTasksRequest
     * @return DescribeDatahubTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTasksResponse DescribeDatahubTasks(DescribeDatahubTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatahubTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatahubTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatahubTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Datahub主题属性
     * @param req DescribeDatahubTopicRequest
     * @return DescribeDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTopicResponse DescribeDatahubTopic(DescribeDatahubTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatahubTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatahubTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatahubTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询DIP主题列表
     * @param req DescribeDatahubTopicsRequest
     * @return DescribeDatahubTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTopicsResponse DescribeDatahubTopics(DescribeDatahubTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatahubTopicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatahubTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatahubTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举消费分组(精简版)
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取消费分组信息
     * @param req DescribeGroupInfoRequest
     * @return DescribeGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupInfoResponse DescribeGroupInfo(DescribeGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取消费分组offset
     * @param req DescribeGroupOffsetsRequest
     * @return DescribeGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupOffsetsResponse DescribeGroupOffsets(DescribeGroupOffsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupOffsetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupOffsetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupOffsets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例属性 
     * @param req DescribeInstanceAttributesRequest
     * @return DescribeInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAttributesResponse DescribeInstanceAttributes(DescribeInstanceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstance）用于在用户账户下获取消息队列 CKafka 实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *用户账户下获取实例列表详情
     * @param req DescribeInstancesDetailRequest
     * @return DescribeInstancesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDetailResponse DescribeInstancesDetail(DescribeInstancesDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举地域,只支持广州地域
     * @param req DescribeRegionRequest
     * @return DescribeRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionResponse DescribeRegion(DescribeRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看路由信息
     * @param req DescribeRouteRequest
     * @return DescribeRouteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteResponse DescribeRoute(DescribeRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务状态
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口请求域名：https://ckafka.tencentcloudapi.com
本接口（DescribeTopic）用于在用户获取消息队列 CKafka 实例的主题列表
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主题属性

     * @param req DescribeTopicAttributesRequest
     * @return DescribeTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicAttributesResponse DescribeTopicAttributes(DescribeTopicAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主题列表详情（仅控制台调用）
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Topic流量排行，消费者流量排行
     * @param req DescribeTopicFlowRankingRequest
     * @return DescribeTopicFlowRankingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicFlowRankingResponse DescribeTopicFlowRanking(DescribeTopicFlowRankingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicFlowRankingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicFlowRankingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicFlowRanking");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询topic 生产端连接信息
     * @param req DescribeTopicProduceConnectionRequest
     * @return DescribeTopicProduceConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicProduceConnectionResponse DescribeTopicProduceConnection(DescribeTopicProduceConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicProduceConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicProduceConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicProduceConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询订阅某主题消息分组信息
     * @param req DescribeTopicSubscribeGroupRequest
     * @return DescribeTopicSubscribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicSubscribeGroupResponse DescribeTopicSubscribeGroup(DescribeTopicSubscribeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicSubscribeGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicSubscribeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicSubscribeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Topic 副本详情信息
     * @param req DescribeTopicSyncReplicaRequest
     * @return DescribeTopicSyncReplicaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicSyncReplicaResponse DescribeTopicSyncReplica(DescribeTopicSyncReplicaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicSyncReplicaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicSyncReplicaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicSyncReplica");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户信息
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据指定offset位置的消息
     * @param req FetchDatahubMessageByOffsetRequest
     * @return FetchDatahubMessageByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchDatahubMessageByOffsetResponse FetchDatahubMessageByOffset(FetchDatahubMessageByOffsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FetchDatahubMessageByOffsetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FetchDatahubMessageByOffsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FetchDatahubMessageByOffset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最新消息列表
     * @param req FetchLatestDatahubMessageListRequest
     * @return FetchLatestDatahubMessageListResponse
     * @throws TencentCloudSDKException
     */
    public FetchLatestDatahubMessageListResponse FetchLatestDatahubMessageList(FetchLatestDatahubMessageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FetchLatestDatahubMessageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FetchLatestDatahubMessageListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FetchLatestDatahubMessageList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据指定offset位置的消息
     * @param req FetchMessageByOffsetRequest
     * @return FetchMessageByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchMessageByOffsetResponse FetchMessageByOffset(FetchMessageByOffsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FetchMessageByOffsetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FetchMessageByOffsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FetchMessageByOffset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据位点查询消息列表
     * @param req FetchMessageListByOffsetRequest
     * @return FetchMessageListByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchMessageListByOffsetResponse FetchMessageListByOffset(FetchMessageListByOffsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FetchMessageListByOffsetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FetchMessageListByOffsetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FetchMessageListByOffset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Ckafka实例购买/续费询价
     * @param req InquireCkafkaPriceRequest
     * @return InquireCkafkaPriceResponse
     * @throws TencentCloudSDKException
     */
    public InquireCkafkaPriceResponse InquireCkafkaPrice(InquireCkafkaPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquireCkafkaPriceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquireCkafkaPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquireCkafkaPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按量实例缩容
     * @param req InstanceScalingDownRequest
     * @return InstanceScalingDownResponse
     * @throws TencentCloudSDKException
     */
    public InstanceScalingDownResponse InstanceScalingDown(InstanceScalingDownRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstanceScalingDownResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InstanceScalingDownResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InstanceScalingDown");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改AC策略，目前只支持预设规则的是否应用到新增topic这一项的修改
     * @param req ModifyAclRuleRequest
     * @return ModifyAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAclRuleResponse ModifyAclRule(ModifyAclRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAclRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAclRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAclRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑Datahub连接源
     * @param req ModifyConnectResourceRequest
     * @return ModifyConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConnectResourceResponse ModifyConnectResource(ModifyConnectResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConnectResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyConnectResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyConnectResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改Datahub任务
     * @param req ModifyDatahubTaskRequest
     * @return ModifyDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatahubTaskResponse ModifyDatahubTask(ModifyDatahubTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatahubTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatahubTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatahubTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改Datahub主题属性
     * @param req ModifyDatahubTopicRequest
     * @return ModifyDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatahubTopicResponse ModifyDatahubTopic(ModifyDatahubTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatahubTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatahubTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatahubTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置Groups 消费分组offset
     * @param req ModifyGroupOffsetsRequest
     * @return ModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupOffsetsResponse ModifyGroupOffsets(ModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupOffsetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupOffsetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGroupOffsets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置实例属性
     * @param req ModifyInstanceAttributesRequest
     * @return ModifyInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttributesResponse ModifyInstanceAttributes(ModifyInstanceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *预付费实例变配接口，调整磁盘，带宽
     * @param req ModifyInstancePreRequest
     * @return ModifyInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePreResponse ModifyInstancePre(ModifyInstancePreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancePreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancePreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancePre");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改密码
     * @param req ModifyPasswordRequest
     * @return ModifyPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPasswordResponse ModifyPassword(ModifyPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于修改主题属性。
     * @param req ModifyTopicAttributesRequest
     * @return ModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicAttributesResponse ModifyTopicAttributes(ModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTopicAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *续费Ckafka实例, 目前只支持国内站包年包月实例续费
     * @param req RenewCkafkaInstanceRequest
     * @return RenewCkafkaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewCkafkaInstanceResponse RenewCkafkaInstance(RenewCkafkaInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewCkafkaInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RenewCkafkaInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewCkafkaInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过HTTP接入层发送消息
     * @param req SendMessageRequest
     * @return SendMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendMessageResponse SendMessage(SendMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMessageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SendMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
