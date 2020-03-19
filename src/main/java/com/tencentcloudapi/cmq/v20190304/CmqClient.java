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
package com.tencentcloudapi.cmq.v20190304;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cmq.v20190304.models.*;

public class CmqClient extends AbstractClient{
    private static String endpoint = "cmq.tencentcloudapi.com";
    private static String version = "2019-03-04";

    public CmqClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmqClient(Credential credential, String region, ClientProfile profile) {
        super(CmqClient.endpoint, CmqClient.version, credential, region, profile);
    }

    /**
     *清除queue中的所有消息
     * @param req ClearQueueRequest
     * @return ClearQueueResponse
     * @throws TencentCloudSDKException
     */
    public ClearQueueResponse ClearQueue(ClearQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearQueueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ClearQueueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ClearQueue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *清空订阅者消息标签
     * @param req ClearSubscriptionFilterTagsRequest
     * @return ClearSubscriptionFilterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ClearSubscriptionFilterTagsResponse ClearSubscriptionFilterTags(ClearSubscriptionFilterTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearSubscriptionFilterTagsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ClearSubscriptionFilterTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ClearSubscriptionFilterTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建队列接口

     * @param req CreateQueueRequest
     * @return CreateQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateQueueResponse CreateQueue(CreateQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateQueueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateQueueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateQueue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建订阅接口
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DeleteQueue
     * @param req DeleteQueueRequest
     * @return DeleteQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQueueResponse DeleteQueue(DeleteQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteQueueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteQueueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteQueue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除订阅
     * @param req DeleteSubscribeRequest
     * @return DeleteSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubscribeResponse DeleteSubscribe(DeleteSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举死信队列源队列
     * @param req DescribeDeadLetterSourceQueuesRequest
     * @return DescribeDeadLetterSourceQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeadLetterSourceQueuesResponse DescribeDeadLetterSourceQueues(DescribeDeadLetterSourceQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeadLetterSourceQueuesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeadLetterSourceQueuesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeadLetterSourceQueues"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *枚举队列
     * @param req DescribeQueueDetailRequest
     * @return DescribeQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueueDetailResponse DescribeQueueDetail(DescribeQueueDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQueueDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQueueDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeQueueDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询订阅详情
     * @param req DescribeSubscriptionDetailRequest
     * @return DescribeSubscriptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionDetailResponse DescribeSubscriptionDetail(DescribeSubscriptionDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscriptionDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscriptionDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubscriptionDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主题详情
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTopicDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改队列属性
     * @param req ModifyQueueAttributeRequest
     * @return ModifyQueueAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQueueAttributeResponse ModifyQueueAttribute(ModifyQueueAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyQueueAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyQueueAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyQueueAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改订阅属性
     * @param req ModifySubscriptionAttributeRequest
     * @return ModifySubscriptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscriptionAttributeResponse ModifySubscriptionAttribute(ModifySubscriptionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscriptionAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscriptionAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubscriptionAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改主题属性
     * @param req ModifyTopicAttributeRequest
     * @return ModifyTopicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicAttributeResponse ModifyTopicAttribute(ModifyTopicAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTopicAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *回溯队列
     * @param req RewindQueueRequest
     * @return RewindQueueResponse
     * @throws TencentCloudSDKException
     */
    public RewindQueueResponse RewindQueue(RewindQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RewindQueueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RewindQueueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RewindQueue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑死信队列
     * @param req UnbindDeadLetterRequest
     * @return UnbindDeadLetterResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDeadLetterResponse UnbindDeadLetter(UnbindDeadLetterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindDeadLetterResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindDeadLetterResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindDeadLetter"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
