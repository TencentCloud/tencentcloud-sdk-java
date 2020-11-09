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
     *用于在用户账户下创建消息队列 Tdmq环境（命名空间）
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
     *批量删除租户下的环境
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
     *获取指定环境的属性
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
     *获取环境角色列表
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
     *获取租户下环境列表
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
     *获取生产者列表，仅显示在线的生产者
     * @param req DescribeProducersRequest
     * @return DescribeProducersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProducersResponse DescribeProducers(DescribeProducersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProducersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProducersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProducers");
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
     *修改指定环境的属性值
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

}
