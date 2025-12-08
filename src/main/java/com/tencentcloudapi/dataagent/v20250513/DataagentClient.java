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
package com.tencentcloudapi.dataagent.v20250513;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dataagent.v20250513.models.*;

public class DataagentClient extends AbstractClient{
    private static String endpoint = "dataagent.tencentcloudapi.com";
    private static String service = "dataagent";
    private static String version = "2025-05-13";

    public DataagentClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DataagentClient(Credential credential, String region, ClientProfile profile) {
        super(DataagentClient.endpoint, DataagentClient.version, credential, region, profile);
    }

    /**
     *文档切片新增
     * @param req AddChunkRequest
     * @return AddChunkResponse
     * @throws TencentCloudSDKException
     */
    public AddChunkResponse AddChunk(AddChunkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddChunk", AddChunkResponse.class);
    }

    /**
     *提供DataAgent 产品服务API
     * @param req ChatAIRequest
     * @return ChatAIResponse
     * @throws TencentCloudSDKException
     */
    public ChatAIResponse ChatAI(ChatAIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatAI", ChatAIResponse.class);
    }

    /**
     *生成DataAgent 会话ID
     * @param req CreateDataAgentSessionRequest
     * @return CreateDataAgentSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataAgentSessionResponse CreateDataAgentSession(CreateDataAgentSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataAgentSession", CreateDataAgentSessionResponse.class);
    }

    /**
     *文档切片删除
     * @param req DeleteChunkRequest
     * @return DeleteChunkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteChunkResponse DeleteChunk(DeleteChunkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteChunk", DeleteChunkResponse.class);
    }

    /**
     *删除会话
     * @param req DeleteDataAgentSessionRequest
     * @return DeleteDataAgentSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataAgentSessionResponse DeleteDataAgentSession(DeleteDataAgentSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataAgentSession", DeleteDataAgentSessionResponse.class);
    }

    /**
     *获取知识库文件信息列表
     * @param req GetKnowledgeBaseFileListRequest
     * @return GetKnowledgeBaseFileListResponse
     * @throws TencentCloudSDKException
     */
    public GetKnowledgeBaseFileListResponse GetKnowledgeBaseFileList(GetKnowledgeBaseFileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetKnowledgeBaseFileList", GetKnowledgeBaseFileListResponse.class);
    }

    /**
     *获取知识库列表
     * @param req GetKnowledgeBaseListRequest
     * @return GetKnowledgeBaseListResponse
     * @throws TencentCloudSDKException
     */
    public GetKnowledgeBaseListResponse GetKnowledgeBaseList(GetKnowledgeBaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetKnowledgeBaseList", GetKnowledgeBaseListResponse.class);
    }

    /**
     *获取用户会话记录详情列表
     * @param req GetSessionDetailsRequest
     * @return GetSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public GetSessionDetailsResponse GetSessionDetails(GetSessionDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSessionDetails", GetSessionDetailsResponse.class);
    }

    /**
     *查询上传任务
     * @param req GetUploadJobDetailsRequest
     * @return GetUploadJobDetailsResponse
     * @throws TencentCloudSDKException
     */
    public GetUploadJobDetailsResponse GetUploadJobDetails(GetUploadJobDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUploadJobDetails", GetUploadJobDetailsResponse.class);
    }

    /**
     *编辑修改分片
     * @param req ModifyChunkRequest
     * @return ModifyChunkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyChunkResponse ModifyChunk(ModifyChunkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyChunk", ModifyChunkResponse.class);
    }

    /**
     *操作知识库
     * @param req ModifyKnowledgeBaseRequest
     * @return ModifyKnowledgeBaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKnowledgeBaseResponse ModifyKnowledgeBase(ModifyKnowledgeBaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKnowledgeBase", ModifyKnowledgeBaseResponse.class);
    }

    /**
     *文档切片查询
     * @param req QueryChunkListRequest
     * @return QueryChunkListResponse
     * @throws TencentCloudSDKException
     */
    public QueryChunkListResponse QueryChunkList(QueryChunkListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryChunkList", QueryChunkListResponse.class);
    }

    /**
     *中断DataAgent的回答输出
     * @param req StopChatAIRequest
     * @return StopChatAIResponse
     * @throws TencentCloudSDKException
     */
    public StopChatAIResponse StopChatAI(StopChatAIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopChatAI", StopChatAIResponse.class);
    }

    /**
     *上传提交文件
     * @param req UploadAndCommitFileRequest
     * @return UploadAndCommitFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadAndCommitFileResponse UploadAndCommitFile(UploadAndCommitFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadAndCommitFile", UploadAndCommitFileResponse.class);
    }

}
