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
package com.tencentcloudapi.workbuddyenterprise.v20260709;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.workbuddyenterprise.v20260709.models.*;

public class WorkbuddyenterpriseClient extends AbstractClient{
    private static String endpoint = "workbuddyenterprise.tencentcloudapi.com";
    private static String service = "workbuddyenterprise";
    private static String version = "2026-07-09";

    public WorkbuddyenterpriseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WorkbuddyenterpriseClient(Credential credential, String region, ClientProfile profile) {
        super(WorkbuddyenterpriseClient.endpoint, WorkbuddyenterpriseClient.version, credential, region, profile);
    }

    /**
     *把外部 agent 绑定到某 managed agent
     * @param req BindExternalAgentRequest
     * @return BindExternalAgentResponse
     * @throws TencentCloudSDKException
     */
    public BindExternalAgentResponse BindExternalAgent(BindExternalAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindExternalAgent", BindExternalAgentResponse.class);
    }

    /**
     *创建一个新的 Managed Agent，同时自动生成 default 版本。配置采用 Manifest v2.0。
     * @param req CreateAgentRequest
     * @return CreateAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentResponse CreateAgent(CreateAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgent", CreateAgentResponse.class);
    }

    /**
     *为指定 Agent 创建新的会话，返回会话 ID 和聊天凭证。
     * @param req CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentSessionResponse CreateAgentSession(CreateAgentSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentSession", CreateAgentSessionResponse.class);
    }

    /**
     *完全新建版本：外部准备完整 Manifest 后直接传入，不引用任何已有版本。
     * @param req CreateAgentVersionRequest
     * @return CreateAgentVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentVersionResponse CreateAgentVersion(CreateAgentVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentVersion", CreateAgentVersionResponse.class);
    }

    /**
     *基于源版本创建新版本：Manifest / Model / Description 传入即整体覆盖，未传则沿用源版本。
     * @param req CreateAgentVersionFromSourceRequest
     * @return CreateAgentVersionFromSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentVersionFromSourceResponse CreateAgentVersionFromSource(CreateAgentVersionFromSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentVersionFromSource", CreateAgentVersionFromSourceResponse.class);
    }

    /**
     *删除指定的 Agent 及其所有版本。删除后不可恢复。
     * @param req DeleteAgentRequest
     * @return DeleteAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentResponse DeleteAgent(DeleteAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgent", DeleteAgentResponse.class);
    }

    /**
     *查询单个 Agent 的详细信息，包括基础配置和路由配置。
     * @param req DescribeAgentRequest
     * @return DescribeAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentResponse DescribeAgent(DescribeAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgent", DescribeAgentResponse.class);
    }

    /**
     *查询当前企业的 Agent 列表，支持分页、过滤和排序。
     * @param req DescribeAgentListRequest
     * @return DescribeAgentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentListResponse DescribeAgentList(DescribeAgentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentList", DescribeAgentListResponse.class);
    }

    /**
     *查询单个 Agent 会话详情：返回会话基础信息（会话名称 / Agent / 版本 / 状态 / 来源 / 发起人）与可用的聊天接入点列表（EndpointSet）。数据面鉴权走 DescribeUserAccessToken 的用户级访问令牌。
     * @param req DescribeAgentSessionRequest
     * @return DescribeAgentSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentSessionResponse DescribeAgentSession(DescribeAgentSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentSession", DescribeAgentSessionResponse.class);
    }

    /**
     *分页查询企业下所有会话（跨 Agent）：支持按 SessionId / Status / AgentId / UserId 过滤，按创建 / 更新时间排序，返回会话摘要列表。
     * @param req DescribeAgentSessionListRequest
     * @return DescribeAgentSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentSessionListResponse DescribeAgentSessionList(DescribeAgentSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentSessionList", DescribeAgentSessionListResponse.class);
    }

    /**
     *查询单个版本的详细信息，包括 Manifest、Model、状态等。
     * @param req DescribeAgentVersionRequest
     * @return DescribeAgentVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentVersionResponse DescribeAgentVersion(DescribeAgentVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentVersion", DescribeAgentVersionResponse.class);
    }

    /**
     *查询指定 Agent 下的版本列表，支持分页和版本类型过滤。
     * @param req DescribeAgentVersionListRequest
     * @return DescribeAgentVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentVersionListResponse DescribeAgentVersionList(DescribeAgentVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentVersionList", DescribeAgentVersionListResponse.class);
    }

    /**
     *查询当前企业的内置模型列表，支持分页与过滤。内置模型由平台预置，企业可按需启用/停用。过滤字段支持：ModelId（模型ID，模糊）、Name（模型名称，模糊）、Vendor（供应商，模糊）、Status（状态，精确：enabled/disabled）。
     * @param req DescribeBuiltinModelListRequest
     * @return DescribeBuiltinModelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBuiltinModelListResponse DescribeBuiltinModelList(DescribeBuiltinModelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBuiltinModelList", DescribeBuiltinModelListResponse.class);
    }

    /**
     *查询指定企业下的连接器列表（PageNumber/PageSize 分页，支持名称模糊与状态、来源过滤）。
     * @param req DescribeConnectorListRequest
     * @return DescribeConnectorListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectorListResponse DescribeConnectorList(DescribeConnectorListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConnectorList", DescribeConnectorListResponse.class);
    }

    /**
     *分页查询 Expert 列表，支持关键词、分类、发布状态过滤。
     * @param req DescribeExpertListRequest
     * @return DescribeExpertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertListResponse DescribeExpertList(DescribeExpertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExpertList", DescribeExpertListResponse.class);
    }

    /**
     *查询某 managed agent 绑定的单个外部 agent 详情
     * @param req DescribeExternalAgentRequest
     * @return DescribeExternalAgentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalAgentResponse DescribeExternalAgent(DescribeExternalAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalAgent", DescribeExternalAgentResponse.class);
    }

    /**
     *列某 managed agent 绑定的外部 agent 列表
     * @param req DescribeExternalAgentListRequest
     * @return DescribeExternalAgentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalAgentListResponse DescribeExternalAgentList(DescribeExternalAgentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalAgentList", DescribeExternalAgentListResponse.class);
    }

    /**
     *按 Session 分页查询消息事件
     * @param req DescribeMessageEventListRequest
     * @return DescribeMessageEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageEventListResponse DescribeMessageEventList(DescribeMessageEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageEventList", DescribeMessageEventListResponse.class);
    }

    /**
     *分页查询 Skill 列表，支持关键词、分类、发布状态过滤。
     * @param req DescribeSkillListRequest
     * @return DescribeSkillListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillListResponse DescribeSkillList(DescribeSkillListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillList", DescribeSkillListResponse.class);
    }

    /**
     *根据调用者的 Uin / SubAccountUin 调用 OneID 换取用户级 access_token。换取到的 token 是 OneID 用户身份的短期凭证，供调用方以用户身份访问 OneID 开平接口。默认开启 JIT，SubAccountUin 不存在时自动在目标企业下创建影子用户。
     * @param req DescribeUserAccessTokenRequest
     * @return DescribeUserAccessTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserAccessTokenResponse DescribeUserAccessToken(DescribeUserAccessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserAccessToken", DescribeUserAccessTokenResponse.class);
    }

    /**
     *将指定会话迁移到目标版本。SessionID / RuntimeID 保持不变，通过 AgentOS UpdateSession 在原沙箱上更新 manifest 到新版本；AgentId 必须与原 Session 一致（禁止跨 Agent 迁移）；ChatToken 复用旧值不轮转。
     * @param req MigrateAgentSessionRequest
     * @return MigrateAgentSessionResponse
     * @throws TencentCloudSDKException
     */
    public MigrateAgentSessionResponse MigrateAgentSession(MigrateAgentSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigrateAgentSession", MigrateAgentSessionResponse.class);
    }

    /**
     *修改 Agent 基础信息（名称、描述、头像）。AgentName / Description / AvatarUrl 均为可选，仅传递需要更新的字段。
     * @param req ModifyAgentRequest
     * @return ModifyAgentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentResponse ModifyAgent(ModifyAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgent", ModifyAgentResponse.class);
    }

    /**
     *修改 Agent 的 A2A 配置。A2AEnabled 是 Agent 级唯一开关，与具体版本和流量分发策略无关。
     * @param req ModifyAgentA2AConfigRequest
     * @return ModifyAgentA2AConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentA2AConfigResponse ModifyAgentA2AConfig(ModifyAgentA2AConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentA2AConfig", ModifyAgentA2AConfigResponse.class);
    }

    /**
     *覆盖式写入 Agent 路由配置（版本权重）。所有 VersionId 必须属于同一 Agent 且未弃用；允许空数组（下线 Agent 对外流量）；非空时权重总和须等于 1。
     * @param req ModifyAgentRoutingRequest
     * @return ModifyAgentRoutingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentRoutingResponse ModifyAgentRouting(ModifyAgentRoutingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentRouting", ModifyAgentRoutingResponse.class);
    }

    /**
     *原地更新 default 或 test 版本的 Manifest / Model / Description / SandboxTemplateId / ConnectorSet（prod 版本冻结不可修改），五个可选字段至少提供一个。ConnectorSet 为全量覆盖语义：缺省表示不改动连接器绑定；空数组表示解绑全部连接器。
     * @param req ModifyAgentVersionRequest
     * @return ModifyAgentVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentVersionResponse ModifyAgentVersion(ModifyAgentVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentVersion", ModifyAgentVersionResponse.class);
    }

    /**
     *解除外部 agent 与 managed agent 的绑定
     * @param req UnbindExternalAgentRequest
     * @return UnbindExternalAgentResponse
     * @throws TencentCloudSDKException
     */
    public UnbindExternalAgentResponse UnbindExternalAgent(UnbindExternalAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindExternalAgent", UnbindExternalAgentResponse.class);
    }

}
