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
package com.tencentcloudapi.adp.v20260520;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.adp.v20260520.models.*;

public class AdpClient extends AbstractClient{
    private static String endpoint = "adp.tencentcloudapi.com";
    private static String service = "adp";
    private static String version = "2026-05-20";

    public AdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AdpClient(Credential credential, String region, ClientProfile profile) {
        super(AdpClient.endpoint, AdpClient.version, credential, region, profile);
    }

    /**
     *校验标签下的标准词是否已存在
     * @param req CheckLabelRequest
     * @return CheckLabelResponse
     * @throws TencentCloudSDKException
     */
    public CheckLabelResponse CheckLabel(CheckLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckLabel", CheckLabelResponse.class);
    }

    /**
     *复制 Agent（目前仅支持claw模式））
     * @param req CopyAgentFromAppRequest
     * @return CopyAgentFromAppResponse
     * @throws TencentCloudSDKException
     */
    public CopyAgentFromAppResponse CopyAgentFromApp(CopyAgentFromAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyAgentFromApp", CopyAgentFromAppResponse.class);
    }

    /**
     *复制应用
     * @param req CopyAppRequest
     * @return CopyAppResponse
     * @throws TencentCloudSDKException
     */
    public CopyAppResponse CopyApp(CopyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyApp", CopyAppResponse.class);
    }

    /**
     *创建Agent（目前仅支持claw模式）
     * @param req CreateAgentRequest
     * @return CreateAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentResponse CreateAgent(CreateAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgent", CreateAgentResponse.class);
    }

    /**
     *创建应用
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApp", CreateAppResponse.class);
    }

    /**
     *CreateAppTrigger
     * @param req CreateAppTriggerRequest
     * @return CreateAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppTriggerResponse CreateAppTrigger(CreateAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAppTrigger", CreateAppTriggerResponse.class);
    }

    /**
     *创建分类
     * @param req CreateCategoryRequest
     * @return CreateCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateCategoryResponse CreateCategory(CreateCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCategory", CreateCategoryResponse.class);
    }

    /**
     *创建渠道（通过scene区分B端应用发布渠道与C端IM渠道）
     * @param req CreateChannelRequest
     * @return CreateChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelResponse CreateChannel(CreateChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChannel", CreateChannelResponse.class);
    }

    /**
     *新建会话
     * @param req CreateConversationRequest
     * @return CreateConversationResponse
     * @throws TencentCloudSDKException
     */
    public CreateConversationResponse CreateConversation(CreateConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConversation", CreateConversationResponse.class);
    }

    /**
     *创建知识库
     * @param req CreateKBRequest
     * @return CreateKBResponse
     * @throws TencentCloudSDKException
     */
    public CreateKBResponse CreateKB(CreateKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKB", CreateKBResponse.class);
    }

    /**
     *创建标签
     * @param req CreateLabelRequest
     * @return CreateLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateLabelResponse CreateLabel(CreateLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLabel", CreateLabelResponse.class);
    }

    /**
     *创建一条消息记录分类，支持指定分类名称与父分类（ParentId 为 0 时表示一级分类）
     * @param req CreateMsgRecordCategoryRequest
     * @return CreateMsgRecordCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateMsgRecordCategoryResponse CreateMsgRecordCategory(CreateMsgRecordCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMsgRecordCategory", CreateMsgRecordCategoryResponse.class);
    }

    /**
     *获取插件详情
     * @param req CreatePluginRequest
     * @return CreatePluginResponse
     * @throws TencentCloudSDKException
     */
    public CreatePluginResponse CreatePlugin(CreatePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlugin", CreatePluginResponse.class);
    }

    /**
     *创建 QA 生成任务
     * @param req CreateQAGenerationTaskRequest
     * @return CreateQAGenerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateQAGenerationTaskResponse CreateQAGenerationTask(CreateQAGenerationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQAGenerationTask", CreateQAGenerationTaskResponse.class);
    }

    /**
     *批量创建 QA
     * @param req CreateQAListRequest
     * @return CreateQAListResponse
     * @throws TencentCloudSDKException
     */
    public CreateQAListResponse CreateQAList(CreateQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQAList", CreateQAListResponse.class);
    }

    /**
     *新增发布任务
     * @param req CreateReleaseRequest
     * @return CreateReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseResponse CreateRelease(CreateReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRelease", CreateReleaseResponse.class);
    }

    /**
     *创建相似问生成任务
     * @param req CreateSimilarQuestionRequest
     * @return CreateSimilarQuestionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSimilarQuestionResponse CreateSimilarQuestion(CreateSimilarQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSimilarQuestion", CreateSimilarQuestionResponse.class);
    }

    /**
     *创建skill
     * @param req CreateSkillRequest
     * @return CreateSkillResponse
     * @throws TencentCloudSDKException
     */
    public CreateSkillResponse CreateSkill(CreateSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSkill", CreateSkillResponse.class);
    }

    /**
     *提交自定义Skill至企业级共享审批（两段式：提交→审批→回调创建共享任务）
     * @param req CreateSkillShareRequest
     * @return CreateSkillShareResponse
     * @throws TencentCloudSDKException
     */
    public CreateSkillShareResponse CreateSkillShare(CreateSkillShareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSkillShare", CreateSkillShareResponse.class);
    }

    /**
     *创建空间
     * @param req CreateSpaceRequest
     * @return CreateSpaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSpaceResponse CreateSpace(CreateSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSpace", CreateSpaceResponse.class);
    }

    /**
     *创建参数变量
     * @param req CreateVariableRequest
     * @return CreateVariableResponse
     * @throws TencentCloudSDKException
     */
    public CreateVariableResponse CreateVariable(CreateVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVariable", CreateVariableResponse.class);
    }

    /**
     *创建 WebSocket Token
     * @param req CreateWebSocketTokenRequest
     * @return CreateWebSocketTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebSocketTokenResponse CreateWebSocketToken(CreateWebSocketTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebSocketToken", CreateWebSocketTokenResponse.class);
    }

    /**
     *创建工作空间凭证
     * @param req CreateWorkspaceCredentialRequest
     * @return CreateWorkspaceCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceCredentialResponse CreateWorkspaceCredential(CreateWorkspaceCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceCredential", CreateWorkspaceCredentialResponse.class);
    }

    /**
     *删除Agent
     * @param req DeleteAgentRequest
     * @return DeleteAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentResponse DeleteAgent(DeleteAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgent", DeleteAgentResponse.class);
    }

    /**
     *删除应用
     * @param req DeleteAppRequest
     * @return DeleteAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppResponse DeleteApp(DeleteAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApp", DeleteAppResponse.class);
    }

    /**
     *DeleteAppTrigger
     * @param req DeleteAppTriggerRequest
     * @return DeleteAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppTriggerResponse DeleteAppTrigger(DeleteAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAppTrigger", DeleteAppTriggerResponse.class);
    }

    /**
     *删除分类
     * @param req DeleteCategoryRequest
     * @return DeleteCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCategoryResponse DeleteCategory(DeleteCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCategory", DeleteCategoryResponse.class);
    }

    /**
     *删除渠道（通过scene区分场景）
     * @param req DeleteChannelRequest
     * @return DeleteChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteChannelResponse DeleteChannel(DeleteChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteChannel", DeleteChannelResponse.class);
    }

    /**
     *删除会话
     * @param req DeleteConversationRequest
     * @return DeleteConversationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConversationResponse DeleteConversation(DeleteConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConversation", DeleteConversationResponse.class);
    }

    /**
     *批量删除文档
     * @param req DeleteDocListRequest
     * @return DeleteDocListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocListResponse DeleteDocList(DeleteDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDocList", DeleteDocListResponse.class);
    }

    /**
     *删除知识库
     * @param req DeleteKBRequest
     * @return DeleteKBResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKBResponse DeleteKB(DeleteKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKB", DeleteKBResponse.class);
    }

    /**
     *批量删除标签
     * @param req DeleteLabelListRequest
     * @return DeleteLabelListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLabelListResponse DeleteLabelList(DeleteLabelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLabelList", DeleteLabelListResponse.class);
    }

    /**
     *删除指定的消息记录分类
     * @param req DeleteMsgRecordCategoryRequest
     * @return DeleteMsgRecordCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMsgRecordCategoryResponse DeleteMsgRecordCategory(DeleteMsgRecordCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMsgRecordCategory", DeleteMsgRecordCategoryResponse.class);
    }

    /**
     *修改插件
     * @param req DeletePluginRequest
     * @return DeletePluginResponse
     * @throws TencentCloudSDKException
     */
    public DeletePluginResponse DeletePlugin(DeletePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePlugin", DeletePluginResponse.class);
    }

    /**
     *批量删除 QA
     * @param req DeleteQAListRequest
     * @return DeleteQAListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQAListResponse DeleteQAList(DeleteQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQAList", DeleteQAListResponse.class);
    }

    /**
     *删除自定义 Skill  鉴权：创建者 ∨ (编辑权限 ∧ 删除权限） 拒绝场景：非 Custom 类型 / 已共享 / 安全检测中 / 上架审批中 / 下架审批中
     * @param req DeleteSkillRequest
     * @return DeleteSkillResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSkillResponse DeleteSkill(DeleteSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSkill", DeleteSkillResponse.class);
    }

    /**
     *提交共享 Skill 下架审批（v2，两段式：提交→审批→回调下架共享 Skill） 鉴权：删除权 拒绝场景：未共享 / 上架审批中 / 下架审批中
     * @param req DeleteSkillShareRequest
     * @return DeleteSkillShareResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSkillShareResponse DeleteSkillShare(DeleteSkillShareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSkillShare", DeleteSkillShareResponse.class);
    }

    /**
     *删除空间
     * @param req DeleteSpaceRequest
     * @return DeleteSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSpaceResponse DeleteSpace(DeleteSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSpace", DeleteSpaceResponse.class);
    }

    /**
     *删除参数变量
     * @param req DeleteVariableRequest
     * @return DeleteVariableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVariableResponse DeleteVariable(DeleteVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVariable", DeleteVariableResponse.class);
    }

    /**
     *查看企业下的员工列表
     * @param req DescribeAccountListRequest
     * @return DescribeAccountListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountListResponse DescribeAccountList(DescribeAccountListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountList", DescribeAccountListResponse.class);
    }

    /**
     *查询 Agent 详情
     * @param req DescribeAgentDetailRequest
     * @return DescribeAgentDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDetailResponse DescribeAgentDetail(DescribeAgentDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDetail", DescribeAgentDetailResponse.class);
    }

    /**
     *获取应用下 Agent 的发布预览列表
     * @param req DescribeAgentReleasePreviewListRequest
     * @return DescribeAgentReleasePreviewListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentReleasePreviewListResponse DescribeAgentReleasePreviewList(DescribeAgentReleasePreviewListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentReleasePreviewList", DescribeAgentReleasePreviewListResponse.class);
    }

    /**
     *查询 Agent 摘要信息列表
     * @param req DescribeAgentSummaryListRequest
     * @return DescribeAgentSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentSummaryListResponse DescribeAgentSummaryList(DescribeAgentSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentSummaryList", DescribeAgentSummaryListResponse.class);
    }

    /**
     *获取应用信息
     * @param req DescribeAppRequest
     * @return DescribeAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppResponse DescribeApp(DescribeAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApp", DescribeAppResponse.class);
    }

    /**
     *获取应用摘要列表
     * @param req DescribeAppSummaryListRequest
     * @return DescribeAppSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppSummaryListResponse DescribeAppSummaryList(DescribeAppSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppSummaryList", DescribeAppSummaryListResponse.class);
    }

    /**
     *DescribeAppTrigger
     * @param req DescribeAppTriggerRequest
     * @return DescribeAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerResponse DescribeAppTrigger(DescribeAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTrigger", DescribeAppTriggerResponse.class);
    }

    /**
     *DescribeAppTriggerInstance
     * @param req DescribeAppTriggerInstanceRequest
     * @return DescribeAppTriggerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerInstanceResponse DescribeAppTriggerInstance(DescribeAppTriggerInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTriggerInstance", DescribeAppTriggerInstanceResponse.class);
    }

    /**
     *DescribeAppTriggerRunLogList
     * @param req DescribeAppTriggerRunLogListRequest
     * @return DescribeAppTriggerRunLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerRunLogListResponse DescribeAppTriggerRunLogList(DescribeAppTriggerRunLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTriggerRunLogList", DescribeAppTriggerRunLogListResponse.class);
    }

    /**
     *DescribeAppTriggerSummaryList
     * @param req DescribeAppTriggerSummaryListRequest
     * @return DescribeAppTriggerSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppTriggerSummaryListResponse DescribeAppTriggerSummaryList(DescribeAppTriggerSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppTriggerSummaryList", DescribeAppTriggerSummaryListResponse.class);
    }

    /**
     *查看操作日志列表
     * @param req DescribeAuditLogListRequest
     * @return DescribeAuditLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogListResponse DescribeAuditLogList(DescribeAuditLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogList", DescribeAuditLogListResponse.class);
    }

    /**
     *获取审计日志元信息
     * @param req DescribeAuditLogMetaRequest
     * @return DescribeAuditLogMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogMetaResponse DescribeAuditLogMeta(DescribeAuditLogMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLogMeta", DescribeAuditLogMetaResponse.class);
    }

    /**
     *查询分类列表
     * @param req DescribeCategoryListRequest
     * @return DescribeCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCategoryListResponse DescribeCategoryList(DescribeCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCategoryList", DescribeCategoryListResponse.class);
    }

    /**
     *获取渠道详情（scene区分场景）
     * @param req DescribeChannelRequest
     * @return DescribeChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelResponse DescribeChannel(DescribeChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChannel", DescribeChannelResponse.class);
    }

    /**
     *获取渠道列表（scene区分场景）
     * @param req DescribeChannelListRequest
     * @return DescribeChannelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelListResponse DescribeChannelList(DescribeChannelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChannelList", DescribeChannelListResponse.class);
    }

    /**
     *查询并发超限明细，包含QPM/TPM超限与专属并发超限记录，返回超限发生时间、空间、应用、模型及请求内容
     * @param req DescribeConcurrencyLimitDetailListRequest
     * @return DescribeConcurrencyLimitDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrencyLimitDetailListResponse DescribeConcurrencyLimitDetailList(DescribeConcurrencyLimitDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrencyLimitDetailList", DescribeConcurrencyLimitDetailListResponse.class);
    }

    /**
     *查询冲突问详情
     * @param req DescribeConflictQARequest
     * @return DescribeConflictQAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConflictQAResponse DescribeConflictQA(DescribeConflictQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConflictQA", DescribeConflictQAResponse.class);
    }

    /**
     *查询冲突问列表
     * @param req DescribeConflictQASummaryListRequest
     * @return DescribeConflictQASummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConflictQASummaryListResponse DescribeConflictQASummaryList(DescribeConflictQASummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConflictQASummaryList", DescribeConflictQASummaryListResponse.class);
    }

    /**
     *查询资源消耗明细，包含计费相关字段（消耗类型、消耗目标、消耗场景、套餐包及PU消耗等）
     * @param req DescribeConsumptionDetailListRequest
     * @return DescribeConsumptionDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumptionDetailListResponse DescribeConsumptionDetailList(DescribeConsumptionDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumptionDetailList", DescribeConsumptionDetailListResponse.class);
    }

    /**
     *查看会话信息
     * @param req DescribeConversationRequest
     * @return DescribeConversationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationResponse DescribeConversation(DescribeConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversation", DescribeConversationResponse.class);
    }

    /**
     *获取会话列表
     * @param req DescribeConversationListRequest
     * @return DescribeConversationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationListResponse DescribeConversationList(DescribeConversationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversationList", DescribeConversationListResponse.class);
    }

    /**
     *获取会话历史消息
     * @param req DescribeConversationMessageListRequest
     * @return DescribeConversationMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationMessageListResponse DescribeConversationMessageList(DescribeConversationMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversationMessageList", DescribeConversationMessageListResponse.class);
    }

    /**
     *查询文档详情
     * @param req DescribeDocRequest
     * @return DescribeDocResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocResponse DescribeDoc(DescribeDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDoc", DescribeDocResponse.class);
    }

    /**
     *查询文档摘要列表
     * @param req DescribeDocSummaryListRequest
     * @return DescribeDocSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocSummaryListResponse DescribeDocSummaryList(DescribeDocSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocSummaryList", DescribeDocSummaryListResponse.class);
    }

    /**
     *查询知识库详情
     * @param req DescribeKBRequest
     * @return DescribeKBResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBResponse DescribeKB(DescribeKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKB", DescribeKBResponse.class);
    }

    /**
     *查询知识库列表
     * @param req DescribeKBSummaryListRequest
     * @return DescribeKBSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBSummaryListResponse DescribeKBSummaryList(DescribeKBSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKBSummaryList", DescribeKBSummaryListResponse.class);
    }

    /**
     *查询标签详情
     * @param req DescribeLabelRequest
     * @return DescribeLabelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelResponse DescribeLabel(DescribeLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLabel", DescribeLabelResponse.class);
    }

    /**
     *查询标签列表
     * @param req DescribeLabelSummaryListRequest
     * @return DescribeLabelSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLabelSummaryListResponse DescribeLabelSummaryList(DescribeLabelSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLabelSummaryList", DescribeLabelSummaryListResponse.class);
    }

    /**
     *拉取最新发布信息(包含发布时间、状态、渠道)
     * @param req DescribeLatestReleaseRequest
     * @return DescribeLatestReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLatestReleaseResponse DescribeLatestRelease(DescribeLatestReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLatestRelease", DescribeLatestReleaseResponse.class);
    }

    /**
     *查询看板总览KPI卡片数据，通过resource_type区分资源看板与业务看板域，返回各域KPI指标列表
     * @param req DescribeMetricOverviewListRequest
     * @return DescribeMetricOverviewListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetricOverviewListResponse DescribeMetricOverviewList(DescribeMetricOverviewListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetricOverviewList", DescribeMetricOverviewListResponse.class);
    }

    /**
     *查询模型列表
     * @param req DescribeModelListRequest
     * @return DescribeModelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelListResponse DescribeModelList(DescribeModelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelList", DescribeModelListResponse.class);
    }

    /**
     *查询应用的消息记录分类树，返回分类及子分类、各分类下记录数量与操作权限
     * @param req DescribeMsgRecordCategoryListRequest
     * @return DescribeMsgRecordCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgRecordCategoryListResponse DescribeMsgRecordCategoryList(DescribeMsgRecordCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsgRecordCategoryList", DescribeMsgRecordCategoryListResponse.class);
    }

    /**
     *查询应用的对话消息记录列表，支持按渠道类型、反馈类型、意图、调用结果等条件过滤，并支持游标分页与按创建时间排序
     * @param req DescribeMsgRecordListRequest
     * @return DescribeMsgRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsgRecordListResponse DescribeMsgRecordList(DescribeMsgRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsgRecordList", DescribeMsgRecordListResponse.class);
    }

    /**
     *获取插件详情
     * @param req DescribePluginRequest
     * @return DescribePluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginResponse DescribePlugin(DescribePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlugin", DescribePluginResponse.class);
    }

    /**
     *获取插件列表
     * @param req DescribePluginSummaryListRequest
     * @return DescribePluginSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginSummaryListResponse DescribePluginSummaryList(DescribePluginSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePluginSummaryList", DescribePluginSummaryListResponse.class);
    }

    /**
     *查询 QA 详情
     * @param req DescribeQARequest
     * @return DescribeQAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQAResponse DescribeQA(DescribeQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQA", DescribeQAResponse.class);
    }

    /**
     *查询 QA 列表
     * @param req DescribeQASummaryListRequest
     * @return DescribeQASummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQASummaryListResponse DescribeQASummaryList(DescribeQASummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQASummaryList", DescribeQASummaryListResponse.class);
    }

    /**
     *发布记录列表
     * @param req DescribeReleaseListRequest
     * @return DescribeReleaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseListResponse DescribeReleaseList(DescribeReleaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseList", DescribeReleaseListResponse.class);
    }

    /**
     *查询发布任务
     * @param req DescribeReleaseSummaryRequest
     * @return DescribeReleaseSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseSummaryResponse DescribeReleaseSummary(DescribeReleaseSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseSummary", DescribeReleaseSummaryResponse.class);
    }

    /**
     *查询 Skill 分类列表
     * @param req DescribeSkillCategoryListRequest
     * @return DescribeSkillCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillCategoryListResponse DescribeSkillCategoryList(DescribeSkillCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillCategoryList", DescribeSkillCategoryListResponse.class);
    }

    /**
     *查询skill详情
     * @param req DescribeSkillDetailRequest
     * @return DescribeSkillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillDetailResponse DescribeSkillDetail(DescribeSkillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillDetail", DescribeSkillDetailResponse.class);
    }

    /**
     *查询某个 Skill 被引用的详情列表（按 SkillRefType 分组：OpenClaw / cloud agent / 企业助手 agent） 鉴权：同 DescribeSkillDetail（能看该 Skill 即可查）
     * @param req DescribeSkillReferenceListRequest
     * @return DescribeSkillReferenceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillReferenceListResponse DescribeSkillReferenceList(DescribeSkillReferenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillReferenceList", DescribeSkillReferenceListResponse.class);
    }

    /**
     *查询 Skill 列表
     * @param req DescribeSkillSummaryListRequest
     * @return DescribeSkillSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillSummaryListResponse DescribeSkillSummaryList(DescribeSkillSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillSummaryList", DescribeSkillSummaryListResponse.class);
    }

    /**
     *获取空间列表
     * @param req DescribeSpaceListRequest
     * @return DescribeSpaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceListResponse DescribeSpaceList(DescribeSpaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceList", DescribeSpaceListResponse.class);
    }

    /**
     *获取系统变量
     * @param req DescribeSystemVariableListRequest
     * @return DescribeSystemVariableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemVariableListResponse DescribeSystemVariableList(DescribeSystemVariableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemVariableList", DescribeSystemVariableListResponse.class);
    }

    /**
     *查询资源调用时序明细，支持模型和插件两类资源，按时间顺序返回每条调用记录的详细信息
     * @param req DescribeUsageDetailListRequest
     * @return DescribeUsageDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageDetailListResponse DescribeUsageDetailList(DescribeUsageDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageDetailList", DescribeUsageDetailListResponse.class);
    }

    /**
     *查询资源用量聚合明细，支持模型、插件、平台三类资源，按空间/应用维度聚合展示调用次数、Token消耗等指标
     * @param req DescribeUsageSummaryListRequest
     * @return DescribeUsageSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageSummaryListResponse DescribeUsageSummaryList(DescribeUsageSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageSummaryList", DescribeUsageSummaryListResponse.class);
    }

    /**
     *获取参数变量
     * @param req DescribeVariableRequest
     * @return DescribeVariableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVariableResponse DescribeVariable(DescribeVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVariable", DescribeVariableResponse.class);
    }

    /**
     *获取参数变量列表
     * @param req DescribeVariableListRequest
     * @return DescribeVariableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVariableListResponse DescribeVariableList(DescribeVariableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVariableList", DescribeVariableListResponse.class);
    }

    /**
     *异步导出 QA
     * @param req ExportQARequest
     * @return ExportQAResponse
     * @throws TencentCloudSDKException
     */
    public ExportQAResponse ExportQA(ExportQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportQA", ExportQAResponse.class);
    }

    /**
     *收藏插件
     * @param req FavoritePluginRequest
     * @return FavoritePluginResponse
     * @throws TencentCloudSDKException
     */
    public FavoritePluginResponse FavoritePlugin(FavoritePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FavoritePlugin", FavoritePluginResponse.class);
    }

    /**
     *收藏skill
     * @param req FavoriteSkillRequest
     * @return FavoriteSkillResponse
     * @throws TencentCloudSDKException
     */
    public FavoriteSkillResponse FavoriteSkill(FavoriteSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FavoriteSkill", FavoriteSkillResponse.class);
    }

    /**
     *批量导入文档
     * @param req ImportDocListRequest
     * @return ImportDocListResponse
     * @throws TencentCloudSDKException
     */
    public ImportDocListResponse ImportDocList(ImportDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportDocList", ImportDocListResponse.class);
    }

    /**
     *修改Agent配置信息
     * @param req ModifyAgentRequest
     * @return ModifyAgentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentResponse ModifyAgent(ModifyAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgent", ModifyAgentResponse.class);
    }

    /**
     *修改应用
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApp", ModifyAppResponse.class);
    }

    /**
     *ModifyAppTrigger
     * @param req ModifyAppTriggerRequest
     * @return ModifyAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppTriggerResponse ModifyAppTrigger(ModifyAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAppTrigger", ModifyAppTriggerResponse.class);
    }

    /**
     *修改分类
     * @param req ModifyCategoryRequest
     * @return ModifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCategoryResponse ModifyCategory(ModifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCategory", ModifyCategoryResponse.class);
    }

    /**
     *修改渠道（支持修改备注与企微机器人渠道回调机器人ID）
     * @param req ModifyChannelRequest
     * @return ModifyChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyChannelResponse ModifyChannel(ModifyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyChannel", ModifyChannelResponse.class);
    }

    /**
     *修改冲突问
     * @param req ModifyConflictQARequest
     * @return ModifyConflictQAResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConflictQAResponse ModifyConflictQA(ModifyConflictQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConflictQA", ModifyConflictQAResponse.class);
    }

    /**
     *修改会话信息
     * @param req ModifyConversationRequest
     * @return ModifyConversationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConversationResponse ModifyConversation(ModifyConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConversation", ModifyConversationResponse.class);
    }

    /**
     *修改单个文档
     * @param req ModifyDocRequest
     * @return ModifyDocResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocResponse ModifyDoc(ModifyDocRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDoc", ModifyDocResponse.class);
    }

    /**
     *批量修改文档
     * @param req ModifyDocListRequest
     * @return ModifyDocListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDocListResponse ModifyDocList(ModifyDocListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDocList", ModifyDocListResponse.class);
    }

    /**
     *修改知识库
     * @param req ModifyKBRequest
     * @return ModifyKBResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKBResponse ModifyKB(ModifyKBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKB", ModifyKBResponse.class);
    }

    /**
     *修改标签
     * @param req ModifyLabelRequest
     * @return ModifyLabelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLabelResponse ModifyLabel(ModifyLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLabel", ModifyLabelResponse.class);
    }

    /**
     *修改指定消息记录分类的名称
     * @param req ModifyMsgRecordCategoryRequest
     * @return ModifyMsgRecordCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMsgRecordCategoryResponse ModifyMsgRecordCategory(ModifyMsgRecordCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMsgRecordCategory", ModifyMsgRecordCategoryResponse.class);
    }

    /**
     *修改插件
     * @param req ModifyPluginRequest
     * @return ModifyPluginResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPluginResponse ModifyPlugin(ModifyPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlugin", ModifyPluginResponse.class);
    }

    /**
     *修改单个 QA
     * @param req ModifyQARequest
     * @return ModifyQAResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAResponse ModifyQA(ModifyQARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQA", ModifyQAResponse.class);
    }

    /**
     *批量修改 QA
     * @param req ModifyQAListRequest
     * @return ModifyQAListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyQAListResponse ModifyQAList(ModifyQAListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyQAList", ModifyQAListResponse.class);
    }

    /**
     *Skill修改
     * @param req ModifySkillRequest
     * @return ModifySkillResponse
     * @throws TencentCloudSDKException
     */
    public ModifySkillResponse ModifySkill(ModifySkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySkill", ModifySkillResponse.class);
    }

    /**
     *编辑空间
     * @param req ModifySpaceRequest
     * @return ModifySpaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpaceResponse ModifySpace(ModifySpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpace", ModifySpaceResponse.class);
    }

    /**
     *更新参数变量
     * @param req ModifyVariableRequest
     * @return ModifyVariableResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVariableResponse ModifyVariable(ModifyVariableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVariable", ModifyVariableResponse.class);
    }

    /**
     *PauseAppTrigger
     * @param req PauseAppTriggerRequest
     * @return PauseAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public PauseAppTriggerResponse PauseAppTrigger(PauseAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseAppTrigger", PauseAppTriggerResponse.class);
    }

    /**
     *上架skill
     * @param req ReleaseSkillRequest
     * @return ReleaseSkillResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseSkillResponse ReleaseSkill(ReleaseSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseSkill", ReleaseSkillResponse.class);
    }

    /**
     *重置会话
注意：当前Claw模式应用会话不支持重置
     * @param req ResetConversationRequest
     * @return ResetConversationResponse
     * @throws TencentCloudSDKException
     */
    public ResetConversationResponse ResetConversation(ResetConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConversation", ResetConversationResponse.class);
    }

    /**
     *ResumeAppTrigger
     * @param req ResumeAppTriggerRequest
     * @return ResumeAppTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ResumeAppTriggerResponse ResumeAppTrigger(ResumeAppTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeAppTrigger", ResumeAppTriggerResponse.class);
    }

    /**
     *重试发布(发布暂停之后再次重新发布)
     * @param req RetryReleaseRequest
     * @return RetryReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RetryReleaseResponse RetryRelease(RetryReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRelease", RetryReleaseResponse.class);
    }

    /**
     *回滚发布
     * @param req RollbackReleaseRequest
     * @return RollbackReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RollbackReleaseResponse RollbackRelease(RollbackReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackRelease", RollbackReleaseResponse.class);
    }

    /**
     *RunAppTriggerNow
     * @param req RunAppTriggerNowRequest
     * @return RunAppTriggerNowResponse
     * @throws TencentCloudSDKException
     */
    public RunAppTriggerNowResponse RunAppTriggerNow(RunAppTriggerNowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunAppTriggerNow", RunAppTriggerNowResponse.class);
    }

    /**
     *知识检索
     * @param req SearchKnowledgeRequest
     * @return SearchKnowledgeResponse
     * @throws TencentCloudSDKException
     */
    public SearchKnowledgeResponse SearchKnowledge(SearchKnowledgeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchKnowledge", SearchKnowledgeResponse.class);
    }

    /**
     *取消收藏插件
     * @param req UnfavoritePluginRequest
     * @return UnfavoritePluginResponse
     * @throws TencentCloudSDKException
     */
    public UnfavoritePluginResponse UnfavoritePlugin(UnfavoritePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnfavoritePlugin", UnfavoritePluginResponse.class);
    }

    /**
     *取消收藏skill
     * @param req UnfavoriteSkillRequest
     * @return UnfavoriteSkillResponse
     * @throws TencentCloudSDKException
     */
    public UnfavoriteSkillResponse UnfavoriteSkill(UnfavoriteSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnfavoriteSkill", UnfavoriteSkillResponse.class);
    }

}
