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
package com.tencentcloudapi.tdai.v20250717;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdai.v20250717.models.*;

public class TdaiClient extends AbstractClient{
    private static String endpoint = "tdai.tencentcloudapi.com";
    private static String service = "tdai";
    private static String version = "2025-07-17";

    public TdaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdaiClient(Credential credential, String region, ClientProfile profile) {
        super(TdaiClient.endpoint, TdaiClient.version, credential, region, profile);
    }

    /**
     *本接口（ContinueAgentWork）用于重启智能体实例的值守任务，通常在用户需要重启时使用。
     * @param req ContinueAgentWorkRequest
     * @return ContinueAgentWorkResponse
     * @throws TencentCloudSDKException
     */
    public ContinueAgentWorkResponse ContinueAgentWork(ContinueAgentWorkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ContinueAgentWork", ContinueAgentWorkResponse.class);
    }

    /**
     *本接口（CreateAgentInstance）用于创建一个智能体实例，通常在用户购买一个智能体实例时使用。
     * @param req CreateAgentInstanceRequest
     * @return CreateAgentInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentInstanceResponse CreateAgentInstance(CreateAgentInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentInstance", CreateAgentInstanceResponse.class);
    }

    /**
     *用于创建一次回话的SSE接口
     * @param req CreateChatCompletionRequest
     * @return CreateChatCompletionResponse
     * @throws TencentCloudSDKException
     */
    public CreateChatCompletionResponse CreateChatCompletion(CreateChatCompletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChatCompletion", CreateChatCompletionResponse.class);
    }

    /**
     *查询智能体值守任务详情
     * @param req DescribeAgentDutyTaskDetailRequest
     * @return DescribeAgentDutyTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDutyTaskDetailResponse DescribeAgentDutyTaskDetail(DescribeAgentDutyTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDutyTaskDetail", DescribeAgentDutyTaskDetailResponse.class);
    }

    /**
     *查询智能体值守任务列表
     * @param req DescribeAgentDutyTasksRequest
     * @return DescribeAgentDutyTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDutyTasksResponse DescribeAgentDutyTasks(DescribeAgentDutyTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDutyTasks", DescribeAgentDutyTasksResponse.class);
    }

    /**
     *本接口（DescribeAgentInstance）用于查询智能体实例详情，通常在用户查询所购买的所有智能体实例详情时使用。
     * @param req DescribeAgentInstanceRequest
     * @return DescribeAgentInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstanceResponse DescribeAgentInstance(DescribeAgentInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstance", DescribeAgentInstanceResponse.class);
    }

    /**
     *本接口（DescribeAgentInstances）用于查询智能体实例列表，通常在用户查询所购买的所有智能体列表。
     * @param req DescribeAgentInstancesRequest
     * @return DescribeAgentInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstancesResponse DescribeAgentInstances(DescribeAgentInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstances", DescribeAgentInstancesResponse.class);
    }

    /**
     *本接口（DescribeAgents）用于查询智能体列表，通常在用户查询所购买的所有智能体列表。
     * @param req DescribeAgentsRequest
     * @return DescribeAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentsResponse DescribeAgents(DescribeAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgents", DescribeAgentsResponse.class);
    }

    /**
     *本接口（DescribeChatDetail）用于查询对话详情，通常在用户查询会话的历史记录时使用。
     * @param req DescribeChatDetailRequest
     * @return DescribeChatDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatDetailResponse DescribeChatDetail(DescribeChatDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChatDetail", DescribeChatDetailResponse.class);
    }

    /**
     *本接口（DescribeChats）用于查询对话列表，通常在用户查询会话列表时使用。
     * @param req DescribeChatsRequest
     * @return DescribeChatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatsResponse DescribeChats(DescribeChatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChats", DescribeChatsResponse.class);
    }

    /**
     *智能体报告地址生成并下载
     * @param req DescribeReportUrlRequest
     * @return DescribeReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportUrlResponse DescribeReportUrl(DescribeReportUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportUrl", DescribeReportUrlResponse.class);
    }

    /**
     *本接口（IsolateAgentInstance）用于隔离智能体实例，通常在用户需要隔离智能体实例时使用。
     * @param req IsolateAgentInstanceRequest
     * @return IsolateAgentInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateAgentInstanceResponse IsolateAgentInstance(IsolateAgentInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateAgentInstance", IsolateAgentInstanceResponse.class);
    }

    /**
     *本接口（ModifyAgentInstanceParameters）用于修改智能体实例的参数列表，通常在用户需要配置智能体实例时使用。
     * @param req ModifyAgentInstanceParametersRequest
     * @return ModifyAgentInstanceParametersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentInstanceParametersResponse ModifyAgentInstanceParameters(ModifyAgentInstanceParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentInstanceParameters", ModifyAgentInstanceParametersResponse.class);
    }

    /**
     *本接口（ModifyChatTitle）用于修改会话标题，通常在用户修改会话标题时使用。
     * @param req ModifyChatTitleRequest
     * @return ModifyChatTitleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyChatTitleResponse ModifyChatTitle(ModifyChatTitleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyChatTitle", ModifyChatTitleResponse.class);
    }

    /**
     *本接口（PauseAgentWork）用于暂停智能体实例的值守任务，通常在用户需要暂停时使用。
     * @param req PauseAgentWorkRequest
     * @return PauseAgentWorkResponse
     * @throws TencentCloudSDKException
     */
    public PauseAgentWorkResponse PauseAgentWork(PauseAgentWorkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseAgentWork", PauseAgentWorkResponse.class);
    }

    /**
     *本接口（RecoverAgentInstance）用于解隔离智能体实例，通常在用户需要解隔离智能体实例时使用。
     * @param req RecoverAgentInstanceRequest
     * @return RecoverAgentInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RecoverAgentInstanceResponse RecoverAgentInstance(RecoverAgentInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverAgentInstance", RecoverAgentInstanceResponse.class);
    }

    /**
     *本接口（RemoveChat）用于删除会话，通常在用户删除会话时使用。
     * @param req RemoveChatRequest
     * @return RemoveChatResponse
     * @throws TencentCloudSDKException
     */
    public RemoveChatResponse RemoveChat(RemoveChatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveChat", RemoveChatResponse.class);
    }

    /**
     *本接口（TerminateAgentInstance）用于下线智能体实例，通常在用户需要下线智能体实例时使用。
     * @param req TerminateAgentInstanceRequest
     * @return TerminateAgentInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateAgentInstanceResponse TerminateAgentInstance(TerminateAgentInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateAgentInstance", TerminateAgentInstanceResponse.class);
    }

}
