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
package com.tencentcloudapi.ags.v20250920;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ags.v20250920.models.*;

public class AgsClient extends AbstractClient{
    private static String endpoint = "ags.tencentcloudapi.com";
    private static String service = "ags";
    private static String version = "2025-09-20";

    public AgsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AgsClient(Credential credential, String region, ClientProfile profile) {
        super(AgsClient.endpoint, AgsClient.version, credential, region, profile);
    }

    /**
     *获取 Deployment 访问 Token
     * @param req AcquireDeploymentTokenRequest
     * @return AcquireDeploymentTokenResponse
     * @throws TencentCloudSDKException
     */
    public AcquireDeploymentTokenResponse AcquireDeploymentToken(AcquireDeploymentTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcquireDeploymentToken", AcquireDeploymentTokenResponse.class);
    }

    /**
     *获取访问沙箱工具时所需要使用的访问Token，创建沙箱实例后需调用此接口获取沙箱实例访问Token。
此Token可用于调用代码沙箱实例执行代码，或浏览器沙箱实例进行浏览器操作等。
     * @param req AcquireSandboxInstanceTokenRequest
     * @return AcquireSandboxInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public AcquireSandboxInstanceTokenResponse AcquireSandboxInstanceToken(AcquireSandboxInstanceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcquireSandboxInstanceToken", AcquireSandboxInstanceTokenResponse.class);
    }

    /**
     *追加事件。

向指定会话追加一条事件。
     * @param req AppendEventRequest
     * @return AppendEventResponse
     * @throws TencentCloudSDKException
     */
    public AppendEventResponse AppendEvent(AppendEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppendEvent", AppendEventResponse.class);
    }

    /**
     *通过 Version 审批：PENDING_APPROVAL → APPROVED。Comment 必填。
     * @param req ApproveRegistryRecordRequest
     * @return ApproveRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public ApproveRegistryRecordResponse ApproveRegistryRecord(ApproveRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApproveRegistryRecord", ApproveRegistryRecordResponse.class);
    }

    /**
     *PREPARING/PENDING_APPROVAL → CANCELED。Comment 必填。
     * @param req CancelRegistryRecordRequest
     * @return CancelRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public CancelRegistryRecordResponse CancelRegistryRecord(CancelRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelRegistryRecord", CancelRegistryRecordResponse.class);
    }

    /**
     *创建新的API密钥，用于调用Agent Sandbox接口。相较于腾讯云Secret ID Secret Key支持调用所有接口使用，仅有部分接口支持使用API密钥调用。
     * @param req CreateAPIKeyRequest
     * @return CreateAPIKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAPIKeyResponse CreateAPIKey(CreateAPIKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAPIKey", CreateAPIKeyResponse.class);
    }

    /**
     *创建 Deployment
     * @param req CreateDeploymentRequest
     * @return CreateDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeploymentResponse CreateDeployment(CreateDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeployment", CreateDeploymentResponse.class);
    }

    /**
     *创建镜像预热任务
     * @param req CreatePreCacheImageTaskRequest
     * @return CreatePreCacheImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePreCacheImageTaskResponse CreatePreCacheImageTask(CreatePreCacheImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePreCacheImageTask", CreatePreCacheImageTaskResponse.class);
    }

    /**
     *创建 Agent Registry（注册中心）。
     * @param req CreateRegistryRequest
     * @return CreateRegistryResponse
     * @throws TencentCloudSDKException
     */
    public CreateRegistryResponse CreateRegistry(CreateRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRegistry", CreateRegistryResponse.class);
    }

    /**
     *统一创建 Registry Record（含 revision 1）。请求通过 DescriptorType 与严格内容输入 Union 选择底层类型：MCPSource / AgentSource / SkillSource / CustomDescriptors 四选一，必须与 DescriptorType 对应。不接受 RecordId 或 ChangeLog；同名 Record 返回冲突，不隐式追加 Version。追加 Version 请使用 UpdateRegistryRecord。
     * @param req CreateRegistryRecordRequest
     * @return CreateRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRegistryRecordResponse CreateRegistryRecord(CreateRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRegistryRecord", CreateRegistryRecordResponse.class);
    }

    /**
     *创建沙箱工具
     * @param req CreateSandboxToolRequest
     * @return CreateSandboxToolResponse
     * @throws TencentCloudSDKException
     */
    public CreateSandboxToolResponse CreateSandboxTool(CreateSandboxToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSandboxTool", CreateSandboxToolResponse.class);
    }

    /**
     *创建会话。

为指定 Agent 和用户创建会话，创建成功后返回会话信息。
     * @param req CreateSessionRequest
     * @return CreateSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSessionResponse CreateSession(CreateSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSession", CreateSessionResponse.class);
    }

    /**
     *创建会话空间。
为当前应用在指定地域创建会话空间，创建成功后返回会话空间信息。会话空间用于隔离不同业务场景下的用户、会话、事件及状态数据。
     * @param req CreateSessionSpaceRequest
     * @return CreateSessionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSessionSpaceResponse CreateSessionSpace(CreateSessionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSessionSpace", CreateSessionSpaceResponse.class);
    }

    /**
     *删除API密钥。注意区别于腾讯云Secret ID Secret Key，本接口删除的是Agent Sandbox专用API key。
     * @param req DeleteAPIKeyRequest
     * @return DeleteAPIKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAPIKeyResponse DeleteAPIKey(DeleteAPIKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAPIKey", DeleteAPIKeyResponse.class);
    }

    /**
     *删除 Deployment
     * @param req DeleteDeploymentRequest
     * @return DeleteDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeploymentResponse DeleteDeployment(DeleteDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeployment", DeleteDeploymentResponse.class);
    }

    /**
     *删除 Registry。
     * @param req DeleteRegistryRequest
     * @return DeleteRegistryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRegistryResponse DeleteRegistry(DeleteRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRegistry", DeleteRegistryResponse.class);
    }

    /**
     *删除 Registry Record 或指定 Version。省略 VersionId 时对整个 Record 进行软删除；传入 VersionId 时只删除指定 Version（Stable 指向的 Version 不允许删除；仅剩一个 Approved Version 时不允许删除）。取代原 DeleteRegistryRecordVersion。
     * @param req DeleteRegistryRecordRequest
     * @return DeleteRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRegistryRecordResponse DeleteRegistryRecord(DeleteRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRegistryRecord", DeleteRegistryRecordResponse.class);
    }

    /**
     *删除沙箱工具
     * @param req DeleteSandboxToolRequest
     * @return DeleteSandboxToolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSandboxToolResponse DeleteSandboxTool(DeleteSandboxToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSandboxTool", DeleteSandboxToolResponse.class);
    }

    /**
     *删除会话
     * @param req DeleteSessionRequest
     * @return DeleteSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionResponse DeleteSession(DeleteSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSession", DeleteSessionResponse.class);
    }

    /**
     *删除会话空间。
删除指定的会话空间。仅允许删除不包含会话、事件或用户状态数据的非默认会话空间；系统默认会话空间不能删除。删除成功后不再返回会话空间信息。
     * @param req DeleteSessionSpaceRequest
     * @return DeleteSessionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionSpaceResponse DeleteSessionSpace(DeleteSessionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSessionSpace", DeleteSessionSpaceResponse.class);
    }

    /**
     *获取API密钥列表，包含API密钥简略信息，包含名称、创建时间等。
     * @param req DescribeAPIKeyListRequest
     * @return DescribeAPIKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIKeyListResponse DescribeAPIKeyList(DescribeAPIKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPIKeyList", DescribeAPIKeyListResponse.class);
    }

    /**
     *查询 Deployment 信息
     * @param req DescribeDeploymentRequest
     * @return DescribeDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeploymentResponse DescribeDeployment(DescribeDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployment", DescribeDeploymentResponse.class);
    }

    /**
     *查询 Deployment 列表
     * @param req DescribeDeploymentListRequest
     * @return DescribeDeploymentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeploymentListResponse DescribeDeploymentList(DescribeDeploymentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeploymentList", DescribeDeploymentListResponse.class);
    }

    /**
     *查询事件列表。

查询指定会话的事件流，支持按作者和起始时间筛选。
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
    }

    /**
     *查询镜像预热任务信息
     * @param req DescribePreCacheImageTaskRequest
     * @return DescribePreCacheImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreCacheImageTaskResponse DescribePreCacheImageTask(DescribePreCacheImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreCacheImageTask", DescribePreCacheImageTaskResponse.class);
    }

    /**
     *查询当前调用账号的资源配额和当前总用量，以及账号下各配额组的资源配额和当前用量
     * @param req DescribeQuotaOverviewRequest
     * @return DescribeQuotaOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaOverviewResponse DescribeQuotaOverview(DescribeQuotaOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuotaOverview", DescribeQuotaOverviewResponse.class);
    }

    /**
     *按 RegistryId 查询 Registry 详情。
     * @param req DescribeRegistryRequest
     * @return DescribeRegistryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryResponse DescribeRegistry(DescribeRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistry", DescribeRegistryResponse.class);
    }

    /**
     *分页查询指定Registry / Record / Version的审计日志。
     * @param req DescribeRegistryAuditLogListRequest
     * @return DescribeRegistryAuditLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryAuditLogListResponse DescribeRegistryAuditLogList(DescribeRegistryAuditLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryAuditLogList", DescribeRegistryAuditLogListResponse.class);
    }

    /**
     *分页查询当前租户可见的 Registry 列表。
     * @param req DescribeRegistryListRequest
     * @return DescribeRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryListResponse DescribeRegistryList(DescribeRegistryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryList", DescribeRegistryListResponse.class);
    }

    /**
     *查询 Record 详情和其中一个 Version。请求可通过互斥的 VersionId 或 Label 选择 Version；均省略时默认 Label=stable。取代原 DescribeRegistryRecordVersion。
     * @param req DescribeRegistryRecordRequest
     * @return DescribeRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryRecordResponse DescribeRegistryRecord(DescribeRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryRecord", DescribeRegistryRecordResponse.class);
    }

    /**
     *分页查询 Registry 下的 Record 列表。list 类接口不接入 CAM 转发鉴权；业务侧按 CAM 二次过滤。
     * @param req DescribeRegistryRecordListRequest
     * @return DescribeRegistryRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryRecordListResponse DescribeRegistryRecordList(DescribeRegistryRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryRecordList", DescribeRegistryRecordListResponse.class);
    }

    /**
     *分页查询 Record 的 Version 列表。list 类接口不接入 CAM 转发鉴权。
     * @param req DescribeRegistryRecordVersionListRequest
     * @return DescribeRegistryRecordVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryRecordVersionListResponse DescribeRegistryRecordVersionList(DescribeRegistryRecordVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryRecordVersionList", DescribeRegistryRecordVersionListResponse.class);
    }

    /**
     *查询沙箱实例列表
     * @param req DescribeSandboxInstanceListRequest
     * @return DescribeSandboxInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxInstanceListResponse DescribeSandboxInstanceList(DescribeSandboxInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxInstanceList", DescribeSandboxInstanceListResponse.class);
    }

    /**
     *查询沙箱工具列表
     * @param req DescribeSandboxToolListRequest
     * @return DescribeSandboxToolListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxToolListResponse DescribeSandboxToolList(DescribeSandboxToolListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxToolList", DescribeSandboxToolListResponse.class);
    }

    /**
     *查询会话。

查询指定会话的信息。
     * @param req DescribeSessionRequest
     * @return DescribeSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionResponse DescribeSession(DescribeSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSession", DescribeSessionResponse.class);
    }

    /**
     *查询会话空间详情。
查询指定会话空间的详细信息，查询成功后返回会话空间的名称、描述、状态、所属地域及创建时间等信息。
     * @param req DescribeSessionSpaceRequest
     * @return DescribeSessionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionSpaceResponse DescribeSessionSpace(DescribeSessionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionSpace", DescribeSessionSpaceResponse.class);
    }

    /**
     *分页查询当前应用和地域下的会话空间。
     * @param req DescribeSessionSpacesRequest
     * @return DescribeSessionSpacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionSpacesResponse DescribeSessionSpaces(DescribeSessionSpacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionSpaces", DescribeSessionSpacesResponse.class);
    }

    /**
     *查询会话列表
     * @param req DescribeSessionsRequest
     * @return DescribeSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionsResponse DescribeSessions(DescribeSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessions", DescribeSessionsResponse.class);
    }

    /**
     *获取 Skill 包下载 URL。VersionId 与 Label 互斥；均省略时使用 Stable。响应包含 ResolvedVersionId，便于调用方回填。
     * @param req GetSkillPackageDownloadURLRequest
     * @return GetSkillPackageDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public GetSkillPackageDownloadURLResponse GetSkillPackageDownloadURL(GetSkillPackageDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSkillPackageDownloadURL", GetSkillPackageDownloadURLResponse.class);
    }

    /**
     *为 FAILED / EXPIRED 的 TAR Skill Version 生成新的上传尝试；VersionId 与 Revision 保持不变。
     * @param req GetSkillPackageUploadURLRequest
     * @return GetSkillPackageUploadURLResponse
     * @throws TencentCloudSDKException
     */
    public GetSkillPackageUploadURLResponse GetSkillPackageUploadURL(GetSkillPackageUploadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSkillPackageUploadURL", GetSkillPackageUploadURLResponse.class);
    }

    /**
     *修改 Deployment
     * @param req ModifyDeploymentRequest
     * @return ModifyDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeploymentResponse ModifyDeployment(ModifyDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeployment", ModifyDeploymentResponse.class);
    }

    /**
     *修改会话信息
     * @param req ModifySessionRequest
     * @return ModifySessionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySessionResponse ModifySession(ModifySessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySession", ModifySessionResponse.class);
    }

    /**
     *修改会话空间。
修改指定会话空间的名称和描述，修改成功后返回更新后的会话空间信息。默认会话空间允许修改名称和描述。
     * @param req ModifySessionSpaceRequest
     * @return ModifySessionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySessionSpaceResponse ModifySessionSpace(ModifySessionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySessionSpace", ModifySessionSpaceResponse.class);
    }

    /**
     *暂停沙箱实例
     * @param req PauseSandboxInstanceRequest
     * @return PauseSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public PauseSandboxInstanceResponse PauseSandboxInstance(PauseSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseSandboxInstance", PauseSandboxInstanceResponse.class);
    }

    /**
     *对 Record 的指定 Version 或 Label 目标发起一次预览调用。VersionId 与 Label 互斥；均省略时使用 Stable。不创建 Version、不修改 Label。
     * @param req PreviewRegistryRecordRequest
     * @return PreviewRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public PreviewRegistryRecordResponse PreviewRegistryRecord(PreviewRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PreviewRegistryRecord", PreviewRegistryRecordResponse.class);
    }

    /**
     *驳回 Version 审批：PENDING_APPROVAL → REJECTED。Comment 必填。
     * @param req RejectRegistryRecordRequest
     * @return RejectRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public RejectRegistryRecordResponse RejectRegistryRecord(RejectRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RejectRegistryRecord", RejectRegistryRecordResponse.class);
    }

    /**
     *恢复沙箱实例
     * @param req ResumeSandboxInstanceRequest
     * @return ResumeSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSandboxInstanceResponse ResumeSandboxInstance(ResumeSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeSandboxInstance", ResumeSandboxInstanceResponse.class);
    }

    /**
     *启动沙箱实例
     * @param req StartSandboxInstanceRequest
     * @return StartSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartSandboxInstanceResponse StartSandboxInstance(StartSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartSandboxInstance", StartSandboxInstanceResponse.class);
    }

    /**
     *停止沙箱实例
     * @param req StopSandboxInstanceRequest
     * @return StopSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopSandboxInstanceResponse StopSandboxInstance(StopSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSandboxInstance", StopSandboxInstanceResponse.class);
    }

    /**
     *触发一次从远端拉取描述符 / 元数据的同步。可通过互斥的 VersionId 或 Label 指定来源 Version，均省略时默认使用 Stable。有变化时创建新 Version 并移动 Latest；来源必须 SourceType=URL_IMPORT，否则返回 UnsupportedOperation.SourceType。
     * @param req SyncRegistryRecordRequest
     * @return SyncRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public SyncRegistryRecordResponse SyncRegistryRecord(SyncRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncRegistryRecord", SyncRegistryRecordResponse.class);
    }

    /**
     *更新 Registry 的可变元数据。
     * @param req UpdateRegistryRequest
     * @return UpdateRegistryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRegistryResponse UpdateRegistry(UpdateRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRegistry", UpdateRegistryResponse.class);
    }

    /**
     *更新 Registry Record。两种互斥模式：①Record 更新模式：不提交任何 Source / CustomDescriptors，可通过 Description、LabelMutations 修改元数据与 Label（至少提交一项）；②Version 创建模式：提交且仅提交一种与现有 DescriptorType 匹配的内容输入，可选 VersionName / ChangeLog，禁止 Description / LabelMutations，服务端在 Record 下创建下一个 Revision。取代原 ChangeRegistryRecordStableVersion / RollbackRegistryRecordVersion / Create*RegistryRecordVersion。
     * @param req UpdateRegistryRecordRequest
     * @return UpdateRegistryRecordResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRegistryRecordResponse UpdateRegistryRecord(UpdateRegistryRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRegistryRecord", UpdateRegistryRecordResponse.class);
    }

    /**
     *更新沙箱实例
     * @param req UpdateSandboxInstanceRequest
     * @return UpdateSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSandboxInstanceResponse UpdateSandboxInstance(UpdateSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSandboxInstance", UpdateSandboxInstanceResponse.class);
    }

    /**
     *更新沙箱工具
     * @param req UpdateSandboxToolRequest
     * @return UpdateSandboxToolResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSandboxToolResponse UpdateSandboxTool(UpdateSandboxToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSandboxTool", UpdateSandboxToolResponse.class);
    }

}
