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
    private static String service = "cmq";
    private static String version = "2019-03-04";
    
    public CmqClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmqClient(Credential credential, String region, ClientProfile profile) {
        super(CmqClient.endpoint, CmqClient.version, credential, region, profile);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

清除queue中的所有消息
     * @param req ClearQueueRequest
     * @return ClearQueueResponse
     * @throws TencentCloudSDKException
     */
    public ClearQueueResponse ClearQueue(ClearQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearQueue", ClearQueueResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

清空订阅者消息标签
     * @param req ClearSubscriptionFilterTagsRequest
     * @return ClearSubscriptionFilterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ClearSubscriptionFilterTagsResponse ClearSubscriptionFilterTags(ClearSubscriptionFilterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearSubscriptionFilterTags", ClearSubscriptionFilterTagsResponse.class);
    }

    /**
     *创建队列接口

     * @param req CreateQueueRequest
     * @return CreateQueueResponse
     * @throws TencentCloudSDKException
     */
    public CreateQueueResponse CreateQueue(CreateQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQueue", CreateQueueResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

创建订阅接口
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscribe", CreateSubscribeResponse.class);
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
     *DeleteQueue
     * @param req DeleteQueueRequest
     * @return DeleteQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQueueResponse DeleteQueue(DeleteQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQueue", DeleteQueueResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

删除订阅
     * @param req DeleteSubscribeRequest
     * @return DeleteSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubscribeResponse DeleteSubscribe(DeleteSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubscribe", DeleteSubscribeResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

删除主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

枚举死信队列源队列
     * @param req DescribeDeadLetterSourceQueuesRequest
     * @return DescribeDeadLetterSourceQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeadLetterSourceQueuesResponse DescribeDeadLetterSourceQueues(DescribeDeadLetterSourceQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeadLetterSourceQueues", DescribeDeadLetterSourceQueuesResponse.class);
    }

    /**
     *枚举队列列表
     * @param req DescribeQueueDetailRequest
     * @return DescribeQueueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueueDetailResponse DescribeQueueDetail(DescribeQueueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQueueDetail", DescribeQueueDetailResponse.class);
    }

    /**
     *查询订阅详情
     * @param req DescribeSubscriptionDetailRequest
     * @return DescribeSubscriptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionDetailResponse DescribeSubscriptionDetail(DescribeSubscriptionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscriptionDetail", DescribeSubscriptionDetailResponse.class);
    }

    /**
     *查询主题详情
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicDetail", DescribeTopicDetailResponse.class);
    }

    /**
     *修改队列属性
     * @param req ModifyQueueAttributeRequest
     * @return ModifyQueueAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQueueAttributeResponse ModifyQueueAttribute(ModifyQueueAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQueueAttribute", ModifyQueueAttributeResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

修改订阅属性
     * @param req ModifySubscriptionAttributeRequest
     * @return ModifySubscriptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscriptionAttributeResponse ModifySubscriptionAttribute(ModifySubscriptionAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscriptionAttribute", ModifySubscriptionAttributeResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

修改主题属性
     * @param req ModifyTopicAttributeRequest
     * @return ModifyTopicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicAttributeResponse ModifyTopicAttribute(ModifyTopicAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopicAttribute", ModifyTopicAttributeResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

回溯队列
     * @param req RewindQueueRequest
     * @return RewindQueueResponse
     * @throws TencentCloudSDKException
     */
    public RewindQueueResponse RewindQueue(RewindQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RewindQueue", RewindQueueResponse.class);
    }

    /**
     *下线老cmq云API 3.0 无调用量接口

解绑死信队列
     * @param req UnbindDeadLetterRequest
     * @return UnbindDeadLetterResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDeadLetterResponse UnbindDeadLetter(UnbindDeadLetterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindDeadLetter", UnbindDeadLetterResponse.class);
    }

}
