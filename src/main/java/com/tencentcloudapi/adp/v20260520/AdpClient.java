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
     *创建Agent
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
     *创建Agent
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
     * @param req ResetConversationRequest
     * @return ResetConversationResponse
     * @throws TencentCloudSDKException
     */
    public ResetConversationResponse ResetConversation(ResetConversationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConversation", ResetConversationResponse.class);
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
