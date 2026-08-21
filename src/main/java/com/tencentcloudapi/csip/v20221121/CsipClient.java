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
package com.tencentcloudapi.csip.v20221121;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.csip.v20221121.models.*;

public class CsipClient extends AbstractClient{
    private static String endpoint = "csip.tencentcloudapi.com";
    private static String service = "csip";
    private static String version = "2022-11-21";

    public CsipClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CsipClient(Credential credential, String region, ClientProfile profile) {
        super(CsipClient.endpoint, CsipClient.version, credential, region, profile);
    }

    /**
     *创建/修改SMTP邮箱接入请求
     * @param req AccessAIAnalysisSMTPRequest
     * @return AccessAIAnalysisSMTPResponse
     * @throws TencentCloudSDKException
     */
    public AccessAIAnalysisSMTPResponse AccessAIAnalysisSMTP(AccessAIAnalysisSMTPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AccessAIAnalysisSMTP", AccessAIAnalysisSMTPResponse.class);
    }

    /**
     *添加资产管理员
     * @param req AddDspmAssetManagerRequest
     * @return AddDspmAssetManagerResponse
     * @throws TencentCloudSDKException
     */
    public AddDspmAssetManagerResponse AddDspmAssetManager(AddDspmAssetManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDspmAssetManager", AddDspmAssetManagerResponse.class);
    }

    /**
     *批量添加异地登录白名单
     * @param req AddLoginWhiteListsRequest
     * @return AddLoginWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public AddLoginWhiteListsResponse AddLoginWhiteLists(AddLoginWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLoginWhiteLists", AddLoginWhiteListsResponse.class);
    }

    /**
     *csip角色授权绑定接口
     * @param req AddNewBindRoleUserRequest
     * @return AddNewBindRoleUserResponse
     * @throws TencentCloudSDKException
     */
    public AddNewBindRoleUserResponse AddNewBindRoleUser(AddNewBindRoleUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNewBindRoleUser", AddNewBindRoleUserResponse.class);
    }

    /**
     *添加漏洞白名单
     * @param req AddVulWhitelistRequest
     * @return AddVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddVulWhitelistResponse AddVulWhitelist(AddVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddVulWhitelist", AddVulWhitelistResponse.class);
    }

    /**
     *批量修改基线策略的“周期扫描配置 / 自动同步新增检测项 / 检测项命中配置 / 自定义检测项”等设置。仅修改请求中传入的字段。
     * @param req BatchModifyBaselinePolicyRequest
     * @return BatchModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyBaselinePolicyResponse BatchModifyBaselinePolicy(BatchModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyBaselinePolicy", BatchModifyBaselinePolicyResponse.class);
    }

    /**
     *绑定集群负责人
     * @param req BindClusterOwnerRequest
     * @return BindClusterOwnerResponse
     * @throws TencentCloudSDKException
     */
    public BindClusterOwnerResponse BindClusterOwner(BindClusterOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindClusterOwner", BindClusterOwnerResponse.class);
    }

    /**
     *取消已永久忽略的EDR多行为告警，从AI-Link永久忽略白名单移除对应主机+规则记录，并将告警状态恢复为待处理（PENDING）
     * @param req CancelEdrAlertIgnoreRequest
     * @return CancelEdrAlertIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public CancelEdrAlertIgnoreResponse CancelEdrAlertIgnore(CancelEdrAlertIgnoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelEdrAlertIgnore", CancelEdrAlertIgnoreResponse.class);
    }

    /**
     *判断当前用户是否旗舰版(适用于主机)
     * @param req CheckCWPExposePathPermissionRequest
     * @return CheckCWPExposePathPermissionResponse
     * @throws TencentCloudSDKException
     */
    public CheckCWPExposePathPermissionResponse CheckCWPExposePathPermission(CheckCWPExposePathPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCWPExposePathPermission", CheckCWPExposePathPermissionResponse.class);
    }

    /**
     *判断当前用户是否旗舰版
     * @param req CheckIsUltimateVersionRequest
     * @return CheckIsUltimateVersionResponse
     * @throws TencentCloudSDKException
     */
    public CheckIsUltimateVersionResponse CheckIsUltimateVersion(CheckIsUltimateVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIsUltimateVersion", CheckIsUltimateVersionResponse.class);
    }

    /**
     *风险验证示例
     * @param req CheckRiskRequest
     * @return CheckRiskResponse
     * @throws TencentCloudSDKException
     */
    public CheckRiskResponse CheckRisk(CheckRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRisk", CheckRiskResponse.class);
    }

    /**
     *复制自定义基线策略
     * @param req CopyBaselinePolicyRequest
     * @return CopyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CopyBaselinePolicyResponse CopyBaselinePolicy(CopyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyBaselinePolicy", CopyBaselinePolicyResponse.class);
    }

    /**
     *创建AI 定时任务。

创建一个新的AI 定时任务，需传入任务名称、执行提示词和触发器配置。创建成功后返回AI 定时任务 ID。
     * @param req CreateAIScheduleRequest
     * @return CreateAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIScheduleResponse CreateAISchedule(CreateAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAISchedule", CreateAIScheduleResponse.class);
    }

    /**
     *检测AK 异步任务
     * @param req CreateAccessKeyCheckTaskRequest
     * @return CreateAccessKeyCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeyCheckTaskResponse CreateAccessKeyCheckTask(CreateAccessKeyCheckTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeyCheckTask", CreateAccessKeyCheckTaskResponse.class);
    }

    /**
     *发起AK资产同步任务
     * @param req CreateAccessKeySyncTaskRequest
     * @return CreateAccessKeySyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeySyncTaskResponse CreateAccessKeySyncTask(CreateAccessKeySyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeySyncTask", CreateAccessKeySyncTaskResponse.class);
    }

    /**
     *创建全部资产导出任务
     * @param req CreateAllAssetsExportJobRequest
     * @return CreateAllAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllAssetsExportJobResponse CreateAllAssetsExportJob(CreateAllAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllAssetsExportJob", CreateAllAssetsExportJobResponse.class);
    }

    /**
     *创建资产搜索视图
     * @param req CreateAssetFilterViewRequest
     * @return CreateAssetFilterViewResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetFilterViewResponse CreateAssetFilterView(CreateAssetFilterViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetFilterView", CreateAssetFilterViewResponse.class);
    }

    /**
     *创建主机进程列表导出任务
     * @param req CreateAssetProcessExportJobRequest
     * @return CreateAssetProcessExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetProcessExportJobResponse CreateAssetProcessExportJob(CreateAssetProcessExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetProcessExportJob", CreateAssetProcessExportJobResponse.class);
    }

    /**
     *创建资产同步任务
     * @param req CreateAssetSyncTaskRequest
     * @return CreateAssetSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSyncTaskResponse CreateAssetSyncTask(CreateAssetSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetSyncTask", CreateAssetSyncTaskResponse.class);
    }

    /**
     *创建资产标签
     * @param req CreateAssetTagRequest
     * @return CreateAssetTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetTagResponse CreateAssetTag(CreateAssetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetTag", CreateAssetTagResponse.class);
    }

    /**
     *创建资产视角下风险列表导出任务示例
     * @param req CreateAssetViewRisksExportJobRequest
     * @return CreateAssetViewRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetViewRisksExportJobResponse CreateAssetViewRisksExportJob(CreateAssetViewRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetViewRisksExportJob", CreateAssetViewRisksExportJobResponse.class);
    }

    /**
     *创建基线聚合检测项导出任务。通过 ExportType 选择导出统计结果或风险明细，可按策略、分类等条件限定范围；任务在后台异步执行，完成后可在导出任务列表中下载结果文件。
     * @param req CreateBaselineAggregatedItemExportJobRequest
     * @return CreateBaselineAggregatedItemExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineAggregatedItemExportJobResponse CreateBaselineAggregatedItemExportJob(CreateBaselineAggregatedItemExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineAggregatedItemExportJob", CreateBaselineAggregatedItemExportJobResponse.class);
    }

    /**
     *创建基线修复记录导出任务，导出已修复检测项的记录数据（含检测项信息、资产信息、修复时间等）。任务在后台异步执行，完成后可在导出任务列表中下载结果文件。
     * @param req CreateBaselineFixRecordExportJobRequest
     * @return CreateBaselineFixRecordExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineFixRecordExportJobResponse CreateBaselineFixRecordExportJob(CreateBaselineFixRecordExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineFixRecordExportJob", CreateBaselineFixRecordExportJobResponse.class);
    }

    /**
     *创建基线主任务导出任务，导出指定主任务下的检测项与子任务数据。任务在后台异步执行，完成后可在导出任务列表中下载结果文件。
     * @param req CreateBaselineMainTaskExportJobRequest
     * @return CreateBaselineMainTaskExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineMainTaskExportJobResponse CreateBaselineMainTaskExportJob(CreateBaselineMainTaskExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineMainTaskExportJob", CreateBaselineMainTaskExportJobResponse.class);
    }

    /**
     *创建云资源配置检测PDF报告导出任务示例
     * @param req CreateCFGRiskPDFReportExportJobRequest
     * @return CreateCFGRiskPDFReportExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCFGRiskPDFReportExportJobResponse CreateCFGRiskPDFReportExportJob(CreateCFGRiskPDFReportExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCFGRiskPDFReportExportJob", CreateCFGRiskPDFReportExportJobResponse.class);
    }

    /**
     *创建资产视角下风险列表导出任务示例
     * @param req CreateCFGRisksExportJobRequest
     * @return CreateCFGRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCFGRisksExportJobResponse CreateCFGRisksExportJob(CreateCFGRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCFGRisksExportJob", CreateCFGRisksExportJobResponse.class);
    }

    /**
     *CSIP 手动扫描创建接口
     * @param req CreateCSIPManualMalwareScanRequest
     * @return CreateCSIPManualMalwareScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateCSIPManualMalwareScanResponse CreateCSIPManualMalwareScan(CreateCSIPManualMalwareScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCSIPManualMalwareScan", CreateCSIPManualMalwareScanResponse.class);
    }

    /**
     *创建资产视角下风险列表导出任务示例
     * @param req CreateCheckViewRisksExportJobRequest
     * @return CreateCheckViewRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckViewRisksExportJobResponse CreateCheckViewRisksExportJob(CreateCheckViewRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCheckViewRisksExportJob", CreateCheckViewRisksExportJobResponse.class);
    }

    /**
     *创建云函数导出任务
     * @param req CreateCloudFunctionExportJobRequest
     * @return CreateCloudFunctionExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudFunctionExportJobResponse CreateCloudFunctionExportJob(CreateCloudFunctionExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudFunctionExportJob", CreateCloudFunctionExportJobResponse.class);
    }

    /**
     *创建集群资产同步任务
     * @param req CreateClusterAssetSyncTaskRequest
     * @return CreateClusterAssetSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterAssetSyncTaskResponse CreateClusterAssetSyncTask(CreateClusterAssetSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterAssetSyncTask", CreateClusterAssetSyncTaskResponse.class);
    }

    /**
     *创建集群容器列表导出任务
     * @param req CreateClusterContainerListExportJobRequest
     * @return CreateClusterContainerListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterContainerListExportJobResponse CreateClusterContainerListExportJob(CreateClusterContainerListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterContainerListExportJob", CreateClusterContainerListExportJobResponse.class);
    }

    /**
     *创建集群列表导出任务
     * @param req CreateClusterListExportJobRequest
     * @return CreateClusterListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterListExportJobResponse CreateClusterListExportJob(CreateClusterListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterListExportJob", CreateClusterListExportJobResponse.class);
    }

    /**
     *创建集群命名空间列表导出任务。导出字段包含命名空间名称、Labels、创建时间。支持Filter过滤。导出通过异步任务实现，返回JobId后前端轮询查询导出任务状态。
     * @param req CreateClusterNamespaceListExportJobRequest
     * @return CreateClusterNamespaceListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNamespaceListExportJobResponse CreateClusterNamespaceListExportJob(CreateClusterNamespaceListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterNamespaceListExportJob", CreateClusterNamespaceListExportJobResponse.class);
    }

    /**
     *创建集群节点列表导出任务。导出字段包含节点ID、节点名称、公网IP、内网IP、节点类型、核数、客户端状态、运行状态。NodeType和ClientStatus、RunStatus均经过国际化翻译。支持Filter过滤（含ClientStatus内存过滤）。导出通过异步任务实现，返回JobId后前端轮询查询导出任务状态。
     * @param req CreateClusterNodeListExportJobRequest
     * @return CreateClusterNodeListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodeListExportJobResponse CreateClusterNodeListExportJob(CreateClusterNodeListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterNodeListExportJob", CreateClusterNodeListExportJobResponse.class);
    }

    /**
     *创建合规标准聚合视角下风险列表导出任务示例
     * @param req CreateComplianceRiskExportJobRequest
     * @return CreateComplianceRiskExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplianceRiskExportJobResponse CreateComplianceRiskExportJob(CreateComplianceRiskExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComplianceRiskExportJob", CreateComplianceRiskExportJobResponse.class);
    }

    /**
     *创建资产同步任务
     * @param req CreateCosAssetSyncTaskRequest
     * @return CreateCosAssetSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosAssetSyncTaskResponse CreateCosAssetSyncTask(CreateCosAssetSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosAssetSyncTask", CreateCosAssetSyncTaskResponse.class);
    }

    /**
     *创建cos病毒扫描、敏感数据识别任务
     * @param req CreateCosObjectScanTaskRequest
     * @return CreateCosObjectScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosObjectScanTaskResponse CreateCosObjectScanTask(CreateCosObjectScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosObjectScanTask", CreateCosObjectScanTaskResponse.class);
    }

    /**
     *添加cos告警策略
     * @param req CreateCosPolicyRequest
     * @return CreateCosPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosPolicyResponse CreateCosPolicy(CreateCosPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosPolicy", CreateCosPolicyResponse.class);
    }

    /**
     *创建风险监测任务
     * @param req CreateCosRiskScanTaskRequest
     * @return CreateCosRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosRiskScanTaskResponse CreateCosRiskScanTask(CreateCosRiskScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosRiskScanTask", CreateCosRiskScanTaskResponse.class);
    }

    /**
     *创建域名、ip相关信息
     * @param req CreateDomainAndIpRequest
     * @return CreateDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAndIpResponse CreateDomainAndIp(CreateDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainAndIp", CreateDomainAndIpResponse.class);
    }

    /**
     *创建Dspm访问记录导出任务
     * @param req CreateDspmAccessExportJobRequest
     * @return CreateDspmAccessExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAccessExportJobResponse CreateDspmAccessExportJob(CreateDspmAccessExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAccessExportJob", CreateDspmAccessExportJobResponse.class);
    }

    /**
     *创建Dspm申请单
     * @param req CreateDspmApplyOrderRequest
     * @return CreateDspmApplyOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmApplyOrderResponse CreateDspmApplyOrder(CreateDspmApplyOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmApplyOrder", CreateDspmApplyOrderResponse.class);
    }

    /**
     *创建Dspm审批历史导出任务
     * @param req CreateDspmApproveHistoryExportJobRequest
     * @return CreateDspmApproveHistoryExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmApproveHistoryExportJobResponse CreateDspmApproveHistoryExportJob(CreateDspmApproveHistoryExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmApproveHistoryExportJob", CreateDspmApproveHistoryExportJobResponse.class);
    }

    /**
     *创建Dspm资产访问拓扑导出任务
     * @param req CreateDspmAssetAccessTopologyExportJobRequest
     * @return CreateDspmAssetAccessTopologyExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAssetAccessTopologyExportJobResponse CreateDspmAssetAccessTopologyExportJob(CreateDspmAssetAccessTopologyExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAssetAccessTopologyExportJob", CreateDspmAssetAccessTopologyExportJobResponse.class);
    }

    /**
     *创建Dspm资产列表导出任务
     * @param req CreateDspmAssetIdentifyInfoExportJobRequest
     * @return CreateDspmAssetIdentifyInfoExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAssetIdentifyInfoExportJobResponse CreateDspmAssetIdentifyInfoExportJob(CreateDspmAssetIdentifyInfoExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAssetIdentifyInfoExportJob", CreateDspmAssetIdentifyInfoExportJobResponse.class);
    }

    /**
     *创建Dspm资产列表导出任务
     * @param req CreateDspmAssetsExportJobRequest
     * @return CreateDspmAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAssetsExportJobResponse CreateDspmAssetsExportJob(CreateDspmAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAssetsExportJob", CreateDspmAssetsExportJobResponse.class);
    }

    /**
     *创建日志导出任务
     * @param req CreateDspmExportTaskRequest
     * @return CreateDspmExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmExportTaskResponse CreateDspmExportTask(CreateDspmExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmExportTask", CreateDspmExportTaskResponse.class);
    }

    /**
     *创建dspm数据识别分类
     * @param req CreateDspmIdentifyCategoryRequest
     * @return CreateDspmIdentifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyCategoryResponse CreateDspmIdentifyCategory(CreateDspmIdentifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyCategory", CreateDspmIdentifyCategoryResponse.class);
    }

    /**
     *创建dspm数据识别模板分类关联
     * @param req CreateDspmIdentifyComplianceCategoryRelationRequest
     * @return CreateDspmIdentifyComplianceCategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceCategoryRelationResponse CreateDspmIdentifyComplianceCategoryRelation(CreateDspmIdentifyComplianceCategoryRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceCategoryRelation", CreateDspmIdentifyComplianceCategoryRelationResponse.class);
    }

    /**
     *创建dspm数据识别模板
     * @param req CreateDspmIdentifyComplianceGroupRequest
     * @return CreateDspmIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceGroupResponse CreateDspmIdentifyComplianceGroup(CreateDspmIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceGroup", CreateDspmIdentifyComplianceGroupResponse.class);
    }

    /**
     *复制dspm数据识别模板
     * @param req CreateDspmIdentifyComplianceGroupCopyRequest
     * @return CreateDspmIdentifyComplianceGroupCopyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceGroupCopyResponse CreateDspmIdentifyComplianceGroupCopy(CreateDspmIdentifyComplianceGroupCopyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceGroupCopy", CreateDspmIdentifyComplianceGroupCopyResponse.class);
    }

    /**
     *创建dspm数据识别模板数据项关联
     * @param req CreateDspmIdentifyComplianceRuleRelationRequest
     * @return CreateDspmIdentifyComplianceRuleRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceRuleRelationResponse CreateDspmIdentifyComplianceRuleRelation(CreateDspmIdentifyComplianceRuleRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceRuleRelation", CreateDspmIdentifyComplianceRuleRelationResponse.class);
    }

    /**
     *创建Dspm身份列表导出任务
     * @param req CreateDspmIdentifyInfoListExportJobRequest
     * @return CreateDspmIdentifyInfoListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyInfoListExportJobResponse CreateDspmIdentifyInfoListExportJob(CreateDspmIdentifyInfoListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyInfoListExportJob", CreateDspmIdentifyInfoListExportJobResponse.class);
    }

    /**
     *创建dspm数据识别分级组
     * @param req CreateDspmIdentifyLevelGroupRequest
     * @return CreateDspmIdentifyLevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyLevelGroupResponse CreateDspmIdentifyLevelGroup(CreateDspmIdentifyLevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyLevelGroup", CreateDspmIdentifyLevelGroupResponse.class);
    }

    /**
     *创建dspm数据识别数据项
     * @param req CreateDspmIdentifyRuleRequest
     * @return CreateDspmIdentifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyRuleResponse CreateDspmIdentifyRule(CreateDspmIdentifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyRule", CreateDspmIdentifyRuleResponse.class);
    }

    /**
     *创建Dspm个人身份id
     * @param req CreateDspmPersonalIdentifyRequest
     * @return CreateDspmPersonalIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmPersonalIdentifyResponse CreateDspmPersonalIdentify(CreateDspmPersonalIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmPersonalIdentify", CreateDspmPersonalIdentifyResponse.class);
    }

    /**
     *创建Dspm风险导出任务
     * @param req CreateDspmRiskExportJobRequest
     * @return CreateDspmRiskExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmRiskExportJobResponse CreateDspmRiskExportJob(CreateDspmRiskExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmRiskExportJob", CreateDspmRiskExportJobResponse.class);
    }

    /**
     *创建Dspm白名单策略
     * @param req CreateDspmWhitelistStrategyRequest
     * @return CreateDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmWhitelistStrategyResponse CreateDspmWhitelistStrategy(CreateDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmWhitelistStrategy", CreateDspmWhitelistStrategyResponse.class);
    }

    /**
     *创建公网资产导出任务
     * @param req CreateDynamicAssetsExportJobRequest
     * @return CreateDynamicAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDynamicAssetsExportJobResponse CreateDynamicAssetsExportJob(CreateDynamicAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDynamicAssetsExportJob", CreateDynamicAssetsExportJobResponse.class);
    }

    /**
     *点击开始扫描后触发，支持多账号、多资产类型。同时选主机和容器集群时拆分为两个独立任务（主机+容器）。
     * @param req CreateEDRManualScanRequest
     * @return CreateEDRManualScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateEDRManualScanResponse CreateEDRManualScan(CreateEDRManualScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEDRManualScan", CreateEDRManualScanResponse.class);
    }

    /**
     *创建EDR告警导出任务
     * @param req CreateEdrAlertExportJobRequest
     * @return CreateEdrAlertExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdrAlertExportJobResponse CreateEdrAlertExportJob(CreateEdrAlertExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdrAlertExportJob", CreateEdrAlertExportJobResponse.class);
    }

    /**
     *创建EDR告警普通导出任务
     * @param req CreateEdrLessAlertExportJobRequest
     * @return CreateEdrLessAlertExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdrLessAlertExportJobResponse CreateEdrLessAlertExportJob(CreateEdrLessAlertExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdrLessAlertExportJob", CreateEdrLessAlertExportJobResponse.class);
    }

    /**
     *云边界自动打标-创建规则
     * @param req CreateExposureAutoTagRuleRequest
     * @return CreateExposureAutoTagRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateExposureAutoTagRuleResponse CreateExposureAutoTagRule(CreateExposureAutoTagRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExposureAutoTagRule", CreateExposureAutoTagRuleResponse.class);
    }

    /**
     *暴露资产导出任务
     * @param req CreateExposuresExportJobRequest
     * @return CreateExposuresExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateExposuresExportJobResponse CreateExposuresExportJob(CreateExposuresExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExposuresExportJob", CreateExposuresExportJobResponse.class);
    }

    /**
     *创建高危基线风险导出任务
     * @param req CreateHighBaseLineRisksExportJobRequest
     * @return CreateHighBaseLineRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHighBaseLineRisksExportJobResponse CreateHighBaseLineRisksExportJob(CreateHighBaseLineRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHighBaseLineRisksExportJob", CreateHighBaseLineRisksExportJobResponse.class);
    }

    /**
     *创建主机列漏洞表导出任务
     * @param req CreateHostVulExportJobRequest
     * @return CreateHostVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostVulExportJobResponse CreateHostVulExportJob(CreateHostVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHostVulExportJob", CreateHostVulExportJobResponse.class);
    }

    /**
     *创建IaC检测接入Token
     * @param req CreateIaCAccessTokenRequest
     * @return CreateIaCAccessTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateIaCAccessTokenResponse CreateIaCAccessToken(CreateIaCAccessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIaCAccessToken", CreateIaCAccessTokenResponse.class);
    }

    /**
     *创建IaC检测文件导出任务
     * @param req CreateIaCFileExportJobRequest
     * @return CreateIaCFileExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateIaCFileExportJobResponse CreateIaCFileExportJob(CreateIaCFileExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIaCFileExportJob", CreateIaCFileExportJobResponse.class);
    }

    /**
     *创建IaC检测文件重新扫描任务
     * @param req CreateIaCFileReScanTaskRequest
     * @return CreateIaCFileReScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateIaCFileReScanTaskResponse CreateIaCFileReScanTask(CreateIaCFileReScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIaCFileReScanTask", CreateIaCFileReScanTaskResponse.class);
    }

    /**
     *创建Pod关联容器列表导出任务。导出字段包含容器ID、容器名称、运行状态、节点ID、节点类型、镜像ID、镜像名称、隔离状态。支持Filter过滤。导出通过异步任务实现，返回JobId后前端轮询查询导出任务状态。
     * @param req CreatePodContainerListExportJobRequest
     * @return CreatePodContainerListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePodContainerListExportJobResponse CreatePodContainerListExportJob(CreatePodContainerListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePodContainerListExportJob", CreatePodContainerListExportJobResponse.class);
    }

    /**
     *创建Pod关联服务列表导出任务。导出字段包含服务名称、类型、Selector、命名空间、创建时间。支持Filter过滤。当传入PodUniqueID时，复用DescribeClusterServiceList的Pod关联匹配逻辑。导出通过异步任务实现，返回JobId后前端轮询查询导出任务状态。
     * @param req CreatePodServiceListExportJobRequest
     * @return CreatePodServiceListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePodServiceListExportJobResponse CreatePodServiceListExportJob(CreatePodServiceListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePodServiceListExportJob", CreatePodServiceListExportJobResponse.class);
    }

    /**
     *创建公网资产导出任务
     * @param req CreatePublicAssetsExportJobRequest
     * @return CreatePublicAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicAssetsExportJobResponse CreatePublicAssetsExportJob(CreatePublicAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublicAssetsExportJob", CreatePublicAssetsExportJobResponse.class);
    }

    /**
     *创建风险中心扫描任务
     * @param req CreateRiskCenterScanTaskRequest
     * @return CreateRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskCenterScanTaskResponse CreateRiskCenterScanTask(CreateRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskCenterScanTask", CreateRiskCenterScanTaskResponse.class);
    }

    /**
     *创建云资源配置检查风险详情导出任务示例
     * @param req CreateRiskDetailExportJobRequest
     * @return CreateRiskDetailExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskDetailExportJobResponse CreateRiskDetailExportJob(CreateRiskDetailExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskDetailExportJob", CreateRiskDetailExportJobResponse.class);
    }

    /**
     *暴露面扫描结果导出任务
     * @param req CreateScanStatisticExportJobRequest
     * @return CreateScanStatisticExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanStatisticExportJobResponse CreateScanStatisticExportJob(CreateScanStatisticExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScanStatisticExportJob", CreateScanStatisticExportJobResponse.class);
    }

    /**
     *创建立即检测任务
     * @param req CreateScanTaskRequest
     * @return CreateScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanTaskResponse CreateScanTask(CreateScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScanTask", CreateScanTaskResponse.class);
    }

    /**
     *上传 Skill ZIP 文件，触发异步安全检测。上传成功后应使用返回的 ContentHash + EngineVersion 轮询 DescribeSkillScanResult 接口获取结果。上传接口具备幂等性，同一 Hash 的文件重复上传不会创建重复任务。检测结果保留90天，超期后需重新上传检测。
     * @param req CreateSkillScanRequest
     * @return CreateSkillScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateSkillScanResponse CreateSkillScan(CreateSkillScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSkillScan", CreateSkillScanResponse.class);
    }

    /**
     *对修复失败的漏洞修复任务进行重试，仅针对原任务中修复失败的主机重新下发修复指令。仅当任务状态为部分修复失败或全部修复失败时允许重试。
     * @param req CreateVulFixRetryTaskRequest
     * @return CreateVulFixRetryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixRetryTaskResponse CreateVulFixRetryTask(CreateVulFixRetryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFixRetryTask", CreateVulFixRetryTaskResponse.class);
    }

    /**
     *用户手动提交漏洞修复任务，指定需要修复的漏洞和目标主机，系统创建修复任务并下发执行。支持指定修复超时时间、是否创建快照等选项。通过FixItems数组精确控制每个漏洞/KB补丁修复哪些主机。
     * @param req CreateVulFixTaskRequest
     * @return CreateVulFixTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixTaskResponse CreateVulFixTask(CreateVulFixTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFixTask", CreateVulFixTaskResponse.class);
    }

    /**
     *创建已修复漏洞列表的导出任务。支持与 DescribeVulFixedList 相同的过滤条件，导出通过异步任务实现，返回 JobID 后前端轮询查询导出任务状态。导出字段包含漏洞ID、漏洞名称、漏洞等级、VPR评级、漏洞类型、CVE编号、主机名称、实例ID、关联组件&路径、修复时间。
     * @param req CreateVulFixedExportJobRequest
     * @return CreateVulFixedExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixedExportJobResponse CreateVulFixedExportJob(CreateVulFixedExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFixedExportJob", CreateVulFixedExportJobResponse.class);
    }

    /**
     *创建漏洞重新扫描
     * @param req CreateVulReScanRequest
     * @return CreateVulReScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulReScanResponse CreateVulReScan(CreateVulReScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulReScan", CreateVulReScanResponse.class);
    }

    /**
     *创建漏洞风险导出任务
     * @param req CreateVulRisksExportJobRequest
     * @return CreateVulRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulRisksExportJobResponse CreateVulRisksExportJob(CreateVulRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulRisksExportJob", CreateVulRisksExportJobResponse.class);
    }

    /**
     *创建漏洞扫描（一键扫描）
     * @param req CreateVulScanManualRequest
     * @return CreateVulScanManualResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulScanManualResponse CreateVulScanManual(CreateVulScanManualRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulScanManual", CreateVulScanManualResponse.class);
    }

    /**
     *删除AI助手的SMTP邮箱接入信息
     * @param req DeleteAIAnalysisSMTPAccessRequest
     * @return DeleteAIAnalysisSMTPAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisSMTPAccessResponse DeleteAIAnalysisSMTPAccess(DeleteAIAnalysisSMTPAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIAnalysisSMTPAccess", DeleteAIAnalysisSMTPAccessResponse.class);
    }

    /**
     *删除AI 定时任务。

根据指定的AI 定时任务 ID 删除对应的定时任务。删除后不可恢复。
     * @param req DeleteAIScheduleRequest
     * @return DeleteAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIScheduleResponse DeleteAISchedule(DeleteAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAISchedule", DeleteAIScheduleResponse.class);
    }

    /**
     *删除用户创建的指定资产搜索视图
     * @param req DeleteAssetFilterViewRequest
     * @return DeleteAssetFilterViewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetFilterViewResponse DeleteAssetFilterView(DeleteAssetFilterViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAssetFilterView", DeleteAssetFilterViewResponse.class);
    }

    /**
     *删除资产标签
     * @param req DeleteAssetTagRequest
     * @return DeleteAssetTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetTagResponse DeleteAssetTag(DeleteAssetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAssetTag", DeleteAssetTagResponse.class);
    }

    /**
     *批量删除自定义基线策略。仅支持删除 PolicyType=SELF 的策略；删除后历史风险记录保留，但不再产生新结果。
     * @param req DeleteBaselineSelfDefinedPolicyListRequest
     * @return DeleteBaselineSelfDefinedPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineSelfDefinedPolicyListResponse DeleteBaselineSelfDefinedPolicyList(DeleteBaselineSelfDefinedPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineSelfDefinedPolicyList", DeleteBaselineSelfDefinedPolicyListResponse.class);
    }

    /**
     *CSIP 手动扫描任务删除接口
     * @param req DeleteCSIPMalwareScanTaskRequest
     * @return DeleteCSIPMalwareScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCSIPMalwareScanTaskResponse DeleteCSIPMalwareScanTask(DeleteCSIPMalwareScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCSIPMalwareScanTask", DeleteCSIPMalwareScanTaskResponse.class);
    }

    /**
     *删除集群
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *删除已删除的cos ak资产
     * @param req DeleteCosAkAssetRequest
     * @return DeleteCosAkAssetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCosAkAssetResponse DeleteCosAkAsset(DeleteCosAkAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCosAkAsset", DeleteCosAkAssetResponse.class);
    }

    /**
     *删除策略
     * @param req DeleteCosPolicyRequest
     * @return DeleteCosPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCosPolicyResponse DeleteCosPolicy(DeleteCosPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCosPolicy", DeleteCosPolicyResponse.class);
    }

    /**
     *删除域名和ip请求
     * @param req DeleteDomainAndIpRequest
     * @return DeleteDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAndIpResponse DeleteDomainAndIp(DeleteDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainAndIp", DeleteDomainAndIpResponse.class);
    }

    /**
     *删除Dspm申请单
     * @param req DeleteDspmApplyOrderRequest
     * @return DeleteDspmApplyOrderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmApplyOrderResponse DeleteDspmApplyOrder(DeleteDspmApplyOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmApplyOrder", DeleteDspmApplyOrderResponse.class);
    }

    /**
     *删除Dspm资产账号
     * @param req DeleteDspmAssetAccountRequest
     * @return DeleteDspmAssetAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmAssetAccountResponse DeleteDspmAssetAccount(DeleteDspmAssetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmAssetAccount", DeleteDspmAssetAccountResponse.class);
    }

    /**
     *删除备份日志
     * @param req DeleteDspmBackupLogListRequest
     * @return DeleteDspmBackupLogListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmBackupLogListResponse DeleteDspmBackupLogList(DeleteDspmBackupLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmBackupLogList", DeleteDspmBackupLogListResponse.class);
    }

    /**
     *删除导出任务
     * @param req DeleteDspmExportTaskRequest
     * @return DeleteDspmExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmExportTaskResponse DeleteDspmExportTask(DeleteDspmExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmExportTask", DeleteDspmExportTaskResponse.class);
    }

    /**
     *删除dspm数据识别分类
     * @param req DeleteDspmIdentifyCategoryRequest
     * @return DeleteDspmIdentifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyCategoryResponse DeleteDspmIdentifyCategory(DeleteDspmIdentifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyCategory", DeleteDspmIdentifyCategoryResponse.class);
    }

    /**
     *删除dspm数据识别模板分类关联
     * @param req DeleteDspmIdentifyComplianceCategoryRelationRequest
     * @return DeleteDspmIdentifyComplianceCategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyComplianceCategoryRelationResponse DeleteDspmIdentifyComplianceCategoryRelation(DeleteDspmIdentifyComplianceCategoryRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyComplianceCategoryRelation", DeleteDspmIdentifyComplianceCategoryRelationResponse.class);
    }

    /**
     *删除dspm数据识别模板
     * @param req DeleteDspmIdentifyComplianceGroupRequest
     * @return DeleteDspmIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyComplianceGroupResponse DeleteDspmIdentifyComplianceGroup(DeleteDspmIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyComplianceGroup", DeleteDspmIdentifyComplianceGroupResponse.class);
    }

    /**
     *删除dspm数据识别模板数据项关联
     * @param req DeleteDspmIdentifyComplianceRuleRelationRequest
     * @return DeleteDspmIdentifyComplianceRuleRelationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyComplianceRuleRelationResponse DeleteDspmIdentifyComplianceRuleRelation(DeleteDspmIdentifyComplianceRuleRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyComplianceRuleRelation", DeleteDspmIdentifyComplianceRuleRelationResponse.class);
    }

    /**
     *删除dspm数据识别分级组
     * @param req DeleteDspmIdentifyLevelGroupRequest
     * @return DeleteDspmIdentifyLevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyLevelGroupResponse DeleteDspmIdentifyLevelGroup(DeleteDspmIdentifyLevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyLevelGroup", DeleteDspmIdentifyLevelGroupResponse.class);
    }

    /**
     *删除dspm数据识别数据项
     * @param req DeleteDspmIdentifyRuleRequest
     * @return DeleteDspmIdentifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyRuleResponse DeleteDspmIdentifyRule(DeleteDspmIdentifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyRule", DeleteDspmIdentifyRuleResponse.class);
    }

    /**
     *删除Dspm个人身份id
     * @param req DeleteDspmPersonalIdentifyRequest
     * @return DeleteDspmPersonalIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmPersonalIdentifyResponse DeleteDspmPersonalIdentify(DeleteDspmPersonalIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmPersonalIdentify", DeleteDspmPersonalIdentifyResponse.class);
    }

    /**
     *删除恢复日志
     * @param req DeleteDspmRestoreLogListRequest
     * @return DeleteDspmRestoreLogListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmRestoreLogListResponse DeleteDspmRestoreLogList(DeleteDspmRestoreLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmRestoreLogList", DeleteDspmRestoreLogListResponse.class);
    }

    /**
     *删除Dspm白名单策略
     * @param req DeleteDspmWhitelistStrategyRequest
     * @return DeleteDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmWhitelistStrategyResponse DeleteDspmWhitelistStrategy(DeleteDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmWhitelistStrategy", DeleteDspmWhitelistStrategyResponse.class);
    }

    /**
     *删除EDR策略
     * @param req DeleteEDRRulesRequest
     * @return DeleteEDRRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEDRRulesResponse DeleteEDRRules(DeleteEDRRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEDRRules", DeleteEDRRulesResponse.class);
    }

    /**
     *删除已终止的扫描任务（物理删除主表及明细表）。只允许删除终态任务，只有创建者可操作。
     * @param req DeleteEDRScanTaskRequest
     * @return DeleteEDRScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEDRScanTaskResponse DeleteEDRScanTask(DeleteEDRScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEDRScanTask", DeleteEDRScanTaskResponse.class);
    }

    /**
     *批量删除EDR日志采集路径配置
     * @param req DeleteEdrLogCollectPathsRequest
     * @return DeleteEdrLogCollectPathsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdrLogCollectPathsResponse DeleteEdrLogCollectPaths(DeleteEdrLogCollectPathsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdrLogCollectPaths", DeleteEdrLogCollectPathsResponse.class);
    }

    /**
     *云边界自动打标-删除规则
     * @param req DeleteExposureAutoTagRuleRequest
     * @return DeleteExposureAutoTagRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExposureAutoTagRuleResponse DeleteExposureAutoTagRule(DeleteExposureAutoTagRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExposureAutoTagRule", DeleteExposureAutoTagRuleResponse.class);
    }

    /**
     *删除IaC检测接入Token
     * @param req DeleteIaCAccessTokenRequest
     * @return DeleteIaCAccessTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIaCAccessTokenResponse DeleteIaCAccessToken(DeleteIaCAccessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIaCAccessToken", DeleteIaCAccessTokenResponse.class);
    }

    /**
     *删除IaC检测文件
     * @param req DeleteIaCFileRequest
     * @return DeleteIaCFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIaCFileResponse DeleteIaCFile(DeleteIaCFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIaCFile", DeleteIaCFileResponse.class);
    }

    /**
     *本接口用于删除异地登录白名单规则。
     * @param req DeleteLoginWhiteListRequest
     * @return DeleteLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginWhiteListResponse DeleteLoginWhiteList(DeleteLoginWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoginWhiteList", DeleteLoginWhiteListResponse.class);
    }

    /**
     *删除机器清理记录
     * @param req DeleteMachineClearHistoryRequest
     * @return DeleteMachineClearHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineClearHistoryResponse DeleteMachineClearHistory(DeleteMachineClearHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineClearHistory", DeleteMachineClearHistoryResponse.class);
    }

    /**
     *删除风险中心扫描任务
     * @param req DeleteRiskScanTaskRequest
     * @return DeleteRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskScanTaskResponse DeleteRiskScanTask(DeleteRiskScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskScanTask", DeleteRiskScanTaskResponse.class);
    }

    /**
     *删除漏洞白名单
     * @param req DeleteVulWhitelistRequest
     * @return DeleteVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVulWhitelistResponse DeleteVulWhitelist(DeleteVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVulWhitelist", DeleteVulWhitelistResponse.class);
    }

    /**
     *批量删除通知策略。
     * @param req DeleteWebhookPoliciesRequest
     * @return DeleteWebhookPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookPoliciesResponse DeleteWebhookPolicies(DeleteWebhookPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebhookPolicies", DeleteWebhookPoliciesResponse.class);
    }

    /**
     *批量删除接收机器人。删除前会自动从所有引用了这些机器人的策略中移除引用关系。
     * @param req DeleteWebhookReceiversRequest
     * @return DeleteWebhookReceiversResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookReceiversResponse DeleteWebhookReceivers(DeleteWebhookReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebhookReceivers", DeleteWebhookReceiversResponse.class);
    }

    /**
     *获取 AI agent 资产列表
     * @param req DescribeAIAgentAssetListRequest
     * @return DescribeAIAgentAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAgentAssetListResponse DescribeAIAgentAssetList(DescribeAIAgentAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAgentAssetList", DescribeAIAgentAssetListResponse.class);
    }

    /**
     *获取 AI 分析文件的临时下载链接。

传入文件的原始地址，返回带签名的临时下载链接，链接有效期为 2 小时。
     * @param req DescribeAIAnalysisFileDownloadURLRequest
     * @return DescribeAIAnalysisFileDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisFileDownloadURLResponse DescribeAIAnalysisFileDownloadURL(DescribeAIAnalysisFileDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisFileDownloadURL", DescribeAIAnalysisFileDownloadURLResponse.class);
    }

    /**
     *获取云安全AI助手历史分析记录
     * @param req DescribeAIAnalysisHistoryRequest
     * @return DescribeAIAnalysisHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisHistoryResponse DescribeAIAnalysisHistory(DescribeAIAnalysisHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisHistory", DescribeAIAnalysisHistoryResponse.class);
    }

    /**
     *获取AI问答推荐问题
     * @param req DescribeAIAnalysisRecommendQuestionsRequest
     * @return DescribeAIAnalysisRecommendQuestionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisRecommendQuestionsResponse DescribeAIAnalysisRecommendQuestions(DescribeAIAnalysisRecommendQuestionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisRecommendQuestions", DescribeAIAnalysisRecommendQuestionsResponse.class);
    }

    /**
     *获取云安全AI助手基础信息
     * @param req DescribeAIAnalysisRobotInfoRequest
     * @return DescribeAIAnalysisRobotInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisRobotInfoResponse DescribeAIAnalysisRobotInfo(DescribeAIAnalysisRobotInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisRobotInfo", DescribeAIAnalysisRobotInfoResponse.class);
    }

    /**
     *查询AI助手的SMTP邮箱接入信息
     * @param req DescribeAIAnalysisSMTPRequest
     * @return DescribeAIAnalysisSMTPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisSMTPResponse DescribeAIAnalysisSMTP(DescribeAIAnalysisSMTPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisSMTP", DescribeAIAnalysisSMTPResponse.class);
    }

    /**
     *查询AI-Link智链引擎配置
     * @param req DescribeAILinkSettingRequest
     * @return DescribeAILinkSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAILinkSettingResponse DescribeAILinkSetting(DescribeAILinkSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAILinkSetting", DescribeAILinkSettingResponse.class);
    }

    /**
     *查询AI 定时任务列表。

支持分页查询和状态过滤，返回定时任务列表及总条数。
     * @param req DescribeAIScheduleListRequest
     * @return DescribeAIScheduleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleListResponse DescribeAIScheduleList(DescribeAIScheduleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleList", DescribeAIScheduleListResponse.class);
    }

    /**
     *查询AI 定时任务触发计划。

查询指定AI 定时任务在给定时间窗口内的未来触发计划列表。
     * @param req DescribeAISchedulePlanListRequest
     * @return DescribeAISchedulePlanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAISchedulePlanListResponse DescribeAISchedulePlanList(DescribeAISchedulePlanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAISchedulePlanList", DescribeAISchedulePlanListResponse.class);
    }

    /**
     *查询AI 定时任务统计信息。

返回当前用户的定时任务总数和当前运行中的任务数量。
     * @param req DescribeAIScheduleStatsRequest
     * @return DescribeAIScheduleStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleStatsResponse DescribeAIScheduleStats(DescribeAIScheduleStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleStats", DescribeAIScheduleStatsResponse.class);
    }

    /**
     *查询AI 定时任务执行详情。

根据任务 ID 查询指定执行任务的详细信息，包括执行状态、结果等。
     * @param req DescribeAIScheduleTaskDetailRequest
     * @return DescribeAIScheduleTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleTaskDetailResponse DescribeAIScheduleTaskDetail(DescribeAIScheduleTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleTaskDetail", DescribeAIScheduleTaskDetailResponse.class);
    }

    /**
     *查询AI 定时任务执行列表。

查询AI 定时任务的历史执行记录，支持分页和按定时任务 ID 过滤。
     * @param req DescribeAIScheduleTaskListRequest
     * @return DescribeAIScheduleTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleTaskListResponse DescribeAIScheduleTaskList(DescribeAIScheduleTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleTaskList", DescribeAIScheduleTaskListResponse.class);
    }

    /**
     *访问密钥告警记录AI分析结果详情
     * @param req DescribeAKAnalysisDetailRequest
     * @return DescribeAKAnalysisDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAKAnalysisDetailResponse DescribeAKAnalysisDetail(DescribeAKAnalysisDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAKAnalysisDetail", DescribeAKAnalysisDetailResponse.class);
    }

    /**
     *判断用户是否灰度用户
     * @param req DescribeAbTestUserRequest
     * @return DescribeAbTestUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbTestUserResponse DescribeAbTestUser(DescribeAbTestUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbTestUser", DescribeAbTestUserResponse.class);
    }

    /**
     *获取调用记录列表
     * @param req DescribeAbnormalCallRecordRequest
     * @return DescribeAbnormalCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalCallRecordResponse DescribeAbnormalCallRecord(DescribeAbnormalCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalCallRecord", DescribeAbnormalCallRecordResponse.class);
    }

    /**
     *访问密钥告警记录列表
     * @param req DescribeAccessKeyAlarmRequest
     * @return DescribeAccessKeyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmResponse DescribeAccessKeyAlarm(DescribeAccessKeyAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarm", DescribeAccessKeyAlarmResponse.class);
    }

    /**
     *访问密钥告警记录详情
     * @param req DescribeAccessKeyAlarmDetailRequest
     * @return DescribeAccessKeyAlarmDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmDetailResponse DescribeAccessKeyAlarmDetail(DescribeAccessKeyAlarmDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarmDetail", DescribeAccessKeyAlarmDetailResponse.class);
    }

    /**
     *获取用户访问密钥资产列表
     * @param req DescribeAccessKeyAssetRequest
     * @return DescribeAccessKeyAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAssetResponse DescribeAccessKeyAsset(DescribeAccessKeyAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAsset", DescribeAccessKeyAssetResponse.class);
    }

    /**
     *访问密钥风险记录列表
     * @param req DescribeAccessKeyRiskRequest
     * @return DescribeAccessKeyRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskResponse DescribeAccessKeyRisk(DescribeAccessKeyRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRisk", DescribeAccessKeyRiskResponse.class);
    }

    /**
     *访问密钥风险记录详情
     * @param req DescribeAccessKeyRiskDetailRequest
     * @return DescribeAccessKeyRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskDetailResponse DescribeAccessKeyRiskDetail(DescribeAccessKeyRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRiskDetail", DescribeAccessKeyRiskDetailResponse.class);
    }

    /**
     *查询用户的账号详情
     * @param req DescribeAccessKeyUserDetailRequest
     * @return DescribeAccessKeyUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserDetailResponse DescribeAccessKeyUserDetail(DescribeAccessKeyUserDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserDetail", DescribeAccessKeyUserDetailResponse.class);
    }

    /**
     *查询用户的账号列表
     * @param req DescribeAccessKeyUserListRequest
     * @return DescribeAccessKeyUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserListResponse DescribeAccessKeyUserList(DescribeAccessKeyUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserList", DescribeAccessKeyUserListResponse.class);
    }

    /**
     *查询客户端配置设置（配置组），从DescribeAgentRunMode拆分出的独立接口
     * @param req DescribeAgentConfigSettingRequest
     * @return DescribeAgentConfigSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentConfigSettingResponse DescribeAgentConfigSetting(DescribeAgentConfigSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentConfigSetting", DescribeAgentConfigSettingResponse.class);
    }

    /**
     *获取客户端运行模式和运行配置信息
     * @param req DescribeAgentRunModeRequest
     * @return DescribeAgentRunModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentRunModeResponse DescribeAgentRunMode(DescribeAgentRunModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentRunMode", DescribeAgentRunModeResponse.class);
    }

    /**
     *查询客户端运行策略（策略组），从DescribeAgentRunMode拆分出的独立接口
     * @param req DescribeAgentRunPolicyRequest
     * @return DescribeAgentRunPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentRunPolicyResponse DescribeAgentRunPolicy(DescribeAgentRunPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentRunPolicy", DescribeAgentRunPolicyResponse.class);
    }

    /**
     *告警中心全量告警列表接口
     * @param req DescribeAlertListRequest
     * @return DescribeAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertListResponse DescribeAlertList(DescribeAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertList", DescribeAlertListResponse.class);
    }

    /**
     *资产详情信息
     * @param req DescribeAssetDetailRequest
     * @return DescribeAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailResponse DescribeAssetDetail(DescribeAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDetail", DescribeAssetDetailResponse.class);
    }

    /**
     *资产搜索视图
     * @param req DescribeAssetFilterViewsRequest
     * @return DescribeAssetFilterViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetFilterViewsResponse DescribeAssetFilterViews(DescribeAssetFilterViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetFilterViews", DescribeAssetFilterViewsResponse.class);
    }

    /**
     *资产信息
     * @param req DescribeAssetInfoRequest
     * @return DescribeAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInfoResponse DescribeAssetInfo(DescribeAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetInfo", DescribeAssetInfoResponse.class);
    }

    /**
     *资产最近同步时间
     * @param req DescribeAssetLastSyncTimeRequest
     * @return DescribeAssetLastSyncTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetLastSyncTimeResponse DescribeAssetLastSyncTime(DescribeAssetLastSyncTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetLastSyncTime", DescribeAssetLastSyncTimeResponse.class);
    }

    /**
     *资产概览统计
     * @param req DescribeAssetOverviewRequest
     * @return DescribeAssetOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetOverviewResponse DescribeAssetOverview(DescribeAssetOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetOverview", DescribeAssetOverviewResponse.class);
    }

    /**
     *查询云边界分析-暴露路径下主机节点的进程列表
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessList", DescribeAssetProcessListResponse.class);
    }

    /**
     *资产风险详情
     * @param req DescribeAssetRiskDetailRequest
     * @return DescribeAssetRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRiskDetailResponse DescribeAssetRiskDetail(DescribeAssetRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRiskDetail", DescribeAssetRiskDetailResponse.class);
    }

    /**
     *资产视角下云资源配置风险列表
     * @param req DescribeAssetRiskListRequest
     * @return DescribeAssetRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRiskListResponse DescribeAssetRiskList(DescribeAssetRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRiskList", DescribeAssetRiskListResponse.class);
    }

    /**
     *资产同步任务状态
     * @param req DescribeAssetSyncTaskStatusRequest
     * @return DescribeAssetSyncTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncTaskStatusResponse DescribeAssetSyncTaskStatus(DescribeAssetSyncTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSyncTaskStatus", DescribeAssetSyncTaskStatusResponse.class);
    }

    /**
     *获取资产标签属性
     * @param req DescribeAssetTagAttributesRequest
     * @return DescribeAssetTagAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTagAttributesResponse DescribeAssetTagAttributes(DescribeAssetTagAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTagAttributes", DescribeAssetTagAttributesResponse.class);
    }

    /**
     *资产标签树结构数据
     * @param req DescribeAssetTagTreeRequest
     * @return DescribeAssetTagTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTagTreeResponse DescribeAssetTagTree(DescribeAssetTagTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTagTree", DescribeAssetTagTreeResponse.class);
    }

    /**
     *全部资产
     * @param req DescribeAssetTagsRequest
     * @return DescribeAssetTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTagsResponse DescribeAssetTags(DescribeAssetTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTags", DescribeAssetTagsResponse.class);
    }

    /**
     *资产树结构
     * @param req DescribeAssetTreeRequest
     * @return DescribeAssetTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTreeResponse DescribeAssetTree(DescribeAssetTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTree", DescribeAssetTreeResponse.class);
    }

    /**
     *获取资产视角的漏洞风险列表
     * @param req DescribeAssetViewVulRiskListRequest
     * @return DescribeAssetViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetViewVulRiskListResponse DescribeAssetViewVulRiskList(DescribeAssetViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetViewVulRiskList", DescribeAssetViewVulRiskListResponse.class);
    }

    /**
     *查询是否绑定角色
     * @param req DescribeAssumeRoleRequest
     * @return DescribeAssumeRoleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssumeRoleResponse DescribeAssumeRole(DescribeAssumeRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssumeRole", DescribeAssumeRoleResponse.class);
    }

    /**
     *获取爆破阻断模式
     * @param req DescribeBanModeRequest
     * @return DescribeBanModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanModeResponse DescribeBanMode(DescribeBanModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanMode", DescribeBanModeResponse.class);
    }

    /**
     *获取阻断按钮状态
     * @param req DescribeBanStatusRequest
     * @return DescribeBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanStatusResponse DescribeBanStatus(DescribeBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanStatus", DescribeBanStatusResponse.class);
    }

    /**
     *获取检测项维度的聚合扫描结果列表，用于策略详情页“检测项”Tab 按检测项展示通过/未通过资产数。
     * @param req DescribeBaselineAggregatedItemListRequest
     * @return DescribeBaselineAggregatedItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAggregatedItemListResponse DescribeBaselineAggregatedItemList(DescribeBaselineAggregatedItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineAggregatedItemList", DescribeBaselineAggregatedItemListResponse.class);
    }

    /**
     *获取基线策略维度的聚合扫描结果列表，用于概览页“基线扫描策略”模块按策略展示通过/未通过情况。
     * @param req DescribeBaselineAggregatedPolicyListRequest
     * @return DescribeBaselineAggregatedPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAggregatedPolicyListResponse DescribeBaselineAggregatedPolicyList(DescribeBaselineAggregatedPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineAggregatedPolicyList", DescribeBaselineAggregatedPolicyListResponse.class);
    }

    /**
     *查询当前处于“统计计算中”状态的策略 ID 列表，用于前端轮询判断扫描结果统计是否就绪。
     * @param req DescribeBaselineCalculatingStatisticsPolicyIDListRequest
     * @return DescribeBaselineCalculatingStatisticsPolicyIDListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineCalculatingStatisticsPolicyIDListResponse DescribeBaselineCalculatingStatisticsPolicyIDList(DescribeBaselineCalculatingStatisticsPolicyIDListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineCalculatingStatisticsPolicyIDList", DescribeBaselineCalculatingStatisticsPolicyIDListResponse.class);
    }

    /**
     *获取分类检测项列表
     * @param req DescribeBaselineCategoryItemListRequest
     * @return DescribeBaselineCategoryItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineCategoryItemListResponse DescribeBaselineCategoryItemList(DescribeBaselineCategoryItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineCategoryItemList", DescribeBaselineCategoryItemListResponse.class);
    }

    /**
     *获取基线风险修复历史记录列表，用于“修复记录”页展示已修复的检测项与对应资产。
     * @param req DescribeBaselineFixRecordListRequest
     * @return DescribeBaselineFixRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineFixRecordListResponse DescribeBaselineFixRecordList(DescribeBaselineFixRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineFixRecordList", DescribeBaselineFixRecordListResponse.class);
    }

    /**
     *获取检测项维度的风险记录列表。
     * @param req DescribeBaselineItemRiskListRequest
     * @return DescribeBaselineItemRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemRiskListResponse DescribeBaselineItemRiskList(DescribeBaselineItemRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemRiskList", DescribeBaselineItemRiskListResponse.class);
    }

    /**
     *获取系统内置基线分类的检测项列表（父分类 → 子分类 → 内置检测项 ID 列表），用于策略编辑页选择基线检测项。
     * @param req DescribeBaselineMainTaskItemListRequest
     * @return DescribeBaselineMainTaskItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineMainTaskItemListResponse DescribeBaselineMainTaskItemList(DescribeBaselineMainTaskItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineMainTaskItemList", DescribeBaselineMainTaskItemListResponse.class);
    }

    /**
     *获取扫描主任务列表，用于“任务记录”页展示一键扫描 / 周期扫描 / 分散扫描的历史记录及结果。
     * @param req DescribeBaselineMainTaskListRequest
     * @return DescribeBaselineMainTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineMainTaskListResponse DescribeBaselineMainTaskList(DescribeBaselineMainTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineMainTaskList", DescribeBaselineMainTaskListResponse.class);
    }

    /**
     *获取基线概览页的头部数据，含未通过检测项总数、近一年修复数、最近一次扫描时间、当前是否启用周期扫描等。
     * @param req DescribeBaselineOverviewRequest
     * @return DescribeBaselineOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineOverviewResponse DescribeBaselineOverview(DescribeBaselineOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineOverview", DescribeBaselineOverviewResponse.class);
    }

    /**
     *获取系统内置基线分类树（父分类 → 子分类 → 内置检测项 ID 列表），用于策略详情展示。
     * @param req DescribeBaselinePolicyCategoryListRequest
     * @return DescribeBaselinePolicyCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyCategoryListResponse DescribeBaselinePolicyCategoryList(DescribeBaselinePolicyCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyCategoryList", DescribeBaselinePolicyCategoryListResponse.class);
    }

    /**
     *获取策略配置的检测项列表
     * @param req DescribeBaselinePolicyItemListRequest
     * @return DescribeBaselinePolicyItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyItemListResponse DescribeBaselinePolicyItemList(DescribeBaselinePolicyItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyItemList", DescribeBaselinePolicyItemListResponse.class);
    }

    /**
     *获取基线策略列表，用于“周期计划管理”等列表页展示系统/自定义策略及其配置情况。
     * @param req DescribeBaselinePolicyListRequest
     * @return DescribeBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyListResponse DescribeBaselinePolicyList(DescribeBaselinePolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyList", DescribeBaselinePolicyListResponse.class);
    }

    /**
     *获取基线策略名字存在的用户列表
     * @param req DescribeBaselinePolicyNameExistAppidListRequest
     * @return DescribeBaselinePolicyNameExistAppidListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyNameExistAppidListResponse DescribeBaselinePolicyNameExistAppidList(DescribeBaselinePolicyNameExistAppidListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyNameExistAppidList", DescribeBaselinePolicyNameExistAppidListResponse.class);
    }

    /**
     *获取扫描子任务列表，用于任务详情页“资产维度”展示每台主机/每个集群的扫描状态与失败原因。
     * @param req DescribeBaselineSubTaskListRequest
     * @return DescribeBaselineSubTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineSubTaskListResponse DescribeBaselineSubTaskList(DescribeBaselineSubTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineSubTaskList", DescribeBaselineSubTaskListResponse.class);
    }

    /**
     *获取当前账号（管理员）的基线同步配置。仅集团管理员可调用，普通成员账号请使用 DescribeBaselineUserOtherConf。
     * @param req DescribeBaselineSyncConfRequest
     * @return DescribeBaselineSyncConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineSyncConfResponse DescribeBaselineSyncConf(DescribeBaselineSyncConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineSyncConf", DescribeBaselineSyncConfResponse.class);
    }

    /**
     *获取系统内置基线分类树（父分类 → 子分类 → 内置检测项 ID 列表），用于策略编辑页选择基线检测项。
     * @param req DescribeBaselineSystemCategoryListRequest
     * @return DescribeBaselineSystemCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineSystemCategoryListResponse DescribeBaselineSystemCategoryList(DescribeBaselineSystemCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineSystemCategoryList", DescribeBaselineSystemCategoryListResponse.class);
    }

    /**
     *获取当前账号的用户级基线配置。
     * @param req DescribeBaselineUserOtherConfRequest
     * @return DescribeBaselineUserOtherConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineUserOtherConfResponse DescribeBaselineUserOtherConf(DescribeBaselineUserOtherConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineUserOtherConf", DescribeBaselineUserOtherConfResponse.class);
    }

    /**
     *获取当前账号的“用户弱口令”自定义字典（服务端解密后返回明文）。
     * @param req DescribeBaselineUserWeakPasswordConfRequest
     * @return DescribeBaselineUserWeakPasswordConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineUserWeakPasswordConfResponse DescribeBaselineUserWeakPasswordConf(DescribeBaselineUserWeakPasswordConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineUserWeakPasswordConf", DescribeBaselineUserWeakPasswordConfResponse.class);
    }

    /**
     *获取爆破破解规则
     * @param req DescribeBruteAttackRulesRequest
     * @return DescribeBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttackRulesResponse DescribeBruteAttackRules(DescribeBruteAttackRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBruteAttackRules", DescribeBruteAttackRulesResponse.class);
    }

    /**
     *查看存储桶调用源ip列表
     * @param req DescribeBucketInvokeIpListRequest
     * @return DescribeBucketInvokeIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBucketInvokeIpListResponse DescribeBucketInvokeIpList(DescribeBucketInvokeIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBucketInvokeIpList", DescribeBucketInvokeIpListResponse.class);
    }

    /**
     *云资源配置检查报告风险统计
     * @param req DescribeCFGRiskReportStatisticsRequest
     * @return DescribeCFGRiskReportStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFGRiskReportStatisticsResponse DescribeCFGRiskReportStatistics(DescribeCFGRiskReportStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFGRiskReportStatistics", DescribeCFGRiskReportStatisticsResponse.class);
    }

    /**
     *获取扫描结果统计信息
     * @param req DescribeCFGRiskStatisticsRequest
     * @return DescribeCFGRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFGRiskStatisticsResponse DescribeCFGRiskStatistics(DescribeCFGRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFGRiskStatistics", DescribeCFGRiskStatisticsResponse.class);
    }

    /**
     *云防资产中心统计数据
     * @param req DescribeCFWAssetStatisticsRequest
     * @return DescribeCFWAssetStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFWAssetStatisticsResponse DescribeCFWAssetStatistics(DescribeCFWAssetStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFWAssetStatistics", DescribeCFWAssetStatisticsResponse.class);
    }

    /**
     *获取日志索引信息
     * @param req DescribeCLSLogIndexV3Request
     * @return DescribeCLSLogIndexV3Response
     * @throws TencentCloudSDKException
     */
    public DescribeCLSLogIndexV3Response DescribeCLSLogIndexV3(DescribeCLSLogIndexV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSLogIndexV3", DescribeCLSLogIndexV3Response.class);
    }

    /**
     *日志分析检索接口v3
     * @param req DescribeCLSLogListV3Request
     * @return DescribeCLSLogListV3Response
     * @throws TencentCloudSDKException
     */
    public DescribeCLSLogListV3Response DescribeCLSLogListV3(DescribeCLSLogListV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSLogListV3", DescribeCLSLogListV3Response.class);
    }

    /**
     *查询ModifyCSIPLicenseBinds返回的异步绑定任务进度。
     * @param req DescribeCSIPLicenseBindScheduleRequest
     * @return DescribeCSIPLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPLicenseBindScheduleResponse DescribeCSIPLicenseBindSchedule(DescribeCSIPLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPLicenseBindSchedule", DescribeCSIPLicenseBindScheduleResponse.class);
    }

    /**
     *CSIP 扫描任务主机详情接口
     * @param req DescribeCSIPMalwareScanTaskDetailRequest
     * @return DescribeCSIPMalwareScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPMalwareScanTaskDetailResponse DescribeCSIPMalwareScanTaskDetail(DescribeCSIPMalwareScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPMalwareScanTaskDetail", DescribeCSIPMalwareScanTaskDetailResponse.class);
    }

    /**
     *CSIP 手动扫描进度查询接口
     * @param req DescribeCSIPMalwareScanTaskProgressRequest
     * @return DescribeCSIPMalwareScanTaskProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPMalwareScanTaskProgressResponse DescribeCSIPMalwareScanTaskProgress(DescribeCSIPMalwareScanTaskProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPMalwareScanTaskProgress", DescribeCSIPMalwareScanTaskProgressResponse.class);
    }

    /**
     *获取风险中心风险概况示例
     * @param req DescribeCSIPRiskStatisticsRequest
     * @return DescribeCSIPRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPRiskStatisticsResponse DescribeCSIPRiskStatistics(DescribeCSIPRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPRiskStatistics", DescribeCSIPRiskStatisticsResponse.class);
    }

    /**
     *cvm详情
     * @param req DescribeCVMAssetInfoRequest
     * @return DescribeCVMAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetInfoResponse DescribeCVMAssetInfo(DescribeCVMAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssetInfo", DescribeCVMAssetInfoResponse.class);
    }

    /**
     *获取cvm列表
     * @param req DescribeCVMAssetsRequest
     * @return DescribeCVMAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetsResponse DescribeCVMAssets(DescribeCVMAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssets", DescribeCVMAssetsResponse.class);
    }

    /**
     *查询云边界分析路径节点(主机专用)
     * @param req DescribeCWPExposePathRequest
     * @return DescribeCWPExposePathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPExposePathResponse DescribeCWPExposePath(DescribeCWPExposePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPExposePath", DescribeCWPExposePathResponse.class);
    }

    /**
     *云边界分析资产列表(适用于主机资产)
     * @param req DescribeCWPExposuresRequest
     * @return DescribeCWPExposuresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPExposuresResponse DescribeCWPExposures(DescribeCWPExposuresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPExposures", DescribeCWPExposuresResponse.class);
    }

    /**
     *查询授权绑定任务的进度
     * @param req DescribeCWPLicenseBindScheduleRequest
     * @return DescribeCWPLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPLicenseBindScheduleResponse DescribeCWPLicenseBindSchedule(DescribeCWPLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPLicenseBindSchedule", DescribeCWPLicenseBindScheduleResponse.class);
    }

    /**
     *主机详情
     * @param req DescribeCWPMachineDetailRequest
     * @return DescribeCWPMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPMachineDetailResponse DescribeCWPMachineDetail(DescribeCWPMachineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPMachineDetail", DescribeCWPMachineDetailResponse.class);
    }

    /**
     *查询可筛选操作系统列表.
     * @param req DescribeCWPMachineOsListRequest
     * @return DescribeCWPMachineOsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPMachineOsListResponse DescribeCWPMachineOsList(DescribeCWPMachineOsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPMachineOsList", DescribeCWPMachineOsListResponse.class);
    }

    /**
     *主机列表
     * @param req DescribeCWPMachinesRequest
     * @return DescribeCWPMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPMachinesResponse DescribeCWPMachines(DescribeCWPMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPMachines", DescribeCWPMachinesResponse.class);
    }

    /**
     *查询资源订单列表
     * @param req DescribeCWPOrderListRequest
     * @return DescribeCWPOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPOrderListResponse DescribeCWPOrderList(DescribeCWPOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPOrderList", DescribeCWPOrderListResponse.class);
    }

    /**
     *查询腾讯云扫描IP信息
     * @param req DescribeCWPScanIpInfoRequest
     * @return DescribeCWPScanIpInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPScanIpInfoResponse DescribeCWPScanIpInfo(DescribeCWPScanIpInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPScanIpInfo", DescribeCWPScanIpInfoResponse.class);
    }

    /**
     *获取任务下发时长
     * @param req DescribeCWPTaskDurationRequest
     * @return DescribeCWPTaskDurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPTaskDurationResponse DescribeCWPTaskDuration(DescribeCWPTaskDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPTaskDuration", DescribeCWPTaskDurationResponse.class);
    }

    /**
     *获取调用记录列表
     * @param req DescribeCallRecordRequest
     * @return DescribeCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallRecordResponse DescribeCallRecord(DescribeCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallRecord", DescribeCallRecordResponse.class);
    }

    /**
     *检查视角下云资源配置风险列表
     * @param req DescribeCheckViewRisksRequest
     * @return DescribeCheckViewRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckViewRisksResponse DescribeCheckViewRisks(DescribeCheckViewRisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckViewRisks", DescribeCheckViewRisksResponse.class);
    }

    /**
     *查询腾讯云指定CLB实例对应的监听器列表
     * @param req DescribeClbListenerListRequest
     * @return DescribeClbListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClbListenerListResponse DescribeClbListenerList(DescribeClbListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClbListenerList", DescribeClbListenerListResponse.class);
    }

    /**
     *查询腾讯云指定CLB实例对应的七层转发规则列表
     * @param req DescribeClbListenerRulesRequest
     * @return DescribeClbListenerRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClbListenerRulesResponse DescribeClbListenerRules(DescribeClbListenerRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClbListenerRules", DescribeClbListenerRulesResponse.class);
    }

    /**
     *查询CLB后端服务列表
     * @param req DescribeClbTargetsRequest
     * @return DescribeClbTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClbTargetsResponse DescribeClbTargets(DescribeClbTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClbTargets", DescribeClbTargetsResponse.class);
    }

    /**
     *全部资产
     * @param req DescribeCloudAssetsRequest
     * @return DescribeCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudAssetsResponse DescribeCloudAssets(DescribeCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudAssets", DescribeCloudAssetsResponse.class);
    }

    /**
     *云函数列表
     * @param req DescribeCloudFunctionListRequest
     * @return DescribeCloudFunctionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudFunctionListResponse DescribeCloudFunctionList(DescribeCloudFunctionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudFunctionList", DescribeCloudFunctionListResponse.class);
    }

    /**
     *查询容器集群资产列表
     * @param req DescribeClusterAssetListRequest
     * @return DescribeClusterAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetListResponse DescribeClusterAssetList(DescribeClusterAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssetList", DescribeClusterAssetListResponse.class);
    }

    /**
     *查询集群资产同步任务状态
     * @param req DescribeClusterAssetSyncTaskStatusRequest
     * @return DescribeClusterAssetSyncTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetSyncTaskStatusResponse DescribeClusterAssetSyncTaskStatus(DescribeClusterAssetSyncTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssetSyncTaskStatus", DescribeClusterAssetSyncTaskStatusResponse.class);
    }

    /**
     *集群列表
     * @param req DescribeClusterAssetsRequest
     * @return DescribeClusterAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetsResponse DescribeClusterAssets(DescribeClusterAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssets", DescribeClusterAssetsResponse.class);
    }

    /**
     *查询容器关联应用列表。通过容器ID获取关联的应用服务信息，支持分页。
     * @param req DescribeClusterContainerAppListRequest
     * @return DescribeClusterContainerAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerAppListResponse DescribeClusterContainerAppList(DescribeClusterContainerAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerAppList", DescribeClusterContainerAppListResponse.class);
    }

    /**
     *查询容器关联组件列表。通过容器ID获取关联的组件信息，支持分页。
     * @param req DescribeClusterContainerComponentListRequest
     * @return DescribeClusterContainerComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerComponentListResponse DescribeClusterContainerComponentList(DescribeClusterContainerComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerComponentList", DescribeClusterContainerComponentListResponse.class);
    }

    /**
     *查询集群容器详情。通过容器ID获取容器基本信息、镜像信息、挂载信息、网络信息以及关联节点信息。
     * @param req DescribeClusterContainerDetailRequest
     * @return DescribeClusterContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerDetailResponse DescribeClusterContainerDetail(DescribeClusterContainerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerDetail", DescribeClusterContainerDetailResponse.class);
    }

    /**
     *查询集群容器列表
     * @param req DescribeClusterContainerListRequest
     * @return DescribeClusterContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerListResponse DescribeClusterContainerList(DescribeClusterContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerList", DescribeClusterContainerListResponse.class);
    }

    /**
     *查询容器关联端口列表。通过容器ID获取关联的端口信息，支持分页。
     * @param req DescribeClusterContainerPortListRequest
     * @return DescribeClusterContainerPortListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerPortListResponse DescribeClusterContainerPortList(DescribeClusterContainerPortListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerPortList", DescribeClusterContainerPortListResponse.class);
    }

    /**
     *查询容器关联进程列表。通过容器ID获取关联的进程信息，支持按启动时间排序和分页。Filter.By支持StartTime；Filter.Order支持ASC/DESC。
     * @param req DescribeClusterContainerProcessListRequest
     * @return DescribeClusterContainerProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerProcessListResponse DescribeClusterContainerProcessList(DescribeClusterContainerProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerProcessList", DescribeClusterContainerProcessListResponse.class);
    }

    /**
     *查询容器关联Web服务列表。通过容器ID获取关联的Web服务信息，支持分页。
     * @param req DescribeClusterContainerWebServiceListRequest
     * @return DescribeClusterContainerWebServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerWebServiceListResponse DescribeClusterContainerWebServiceList(DescribeClusterContainerWebServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerWebServiceList", DescribeClusterContainerWebServiceListResponse.class);
    }

    /**
     *查询集群详情
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *查询集群安装命令
     * @param req DescribeClusterInstallCommandRequest
     * @return DescribeClusterInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstallCommandResponse DescribeClusterInstallCommand(DescribeClusterInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstallCommand", DescribeClusterInstallCommandResponse.class);
    }

    /**
     *查询集群列表
     * @param req DescribeClusterListV2Request
     * @return DescribeClusterListV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeClusterListV2Response DescribeClusterListV2(DescribeClusterListV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterListV2", DescribeClusterListV2Response.class);
    }

    /**
     *查询集群命名空间列表
     * @param req DescribeClusterNamespaceListRequest
     * @return DescribeClusterNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNamespaceListResponse DescribeClusterNamespaceList(DescribeClusterNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNamespaceList", DescribeClusterNamespaceListResponse.class);
    }

    /**
     *查询集群节点列表
     * @param req DescribeClusterNodeListRequest
     * @return DescribeClusterNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodeListResponse DescribeClusterNodeList(DescribeClusterNodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodeList", DescribeClusterNodeListResponse.class);
    }

    /**
     *集群pod列表
     * @param req DescribeClusterPodAssetsRequest
     * @return DescribeClusterPodAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodAssetsResponse DescribeClusterPodAssets(DescribeClusterPodAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodAssets", DescribeClusterPodAssetsResponse.class);
    }

    /**
     *查询集群 Pod 详情。容器资产改版 A 类新接口，为 Pod 资产详情页主入口。入参仅 UniqueID；出参覆盖资产信息、所属集群、命名空间、节点、Workload、以及按四个风险等级分组的风险事件数和告警事件数。
     * @param req DescribeClusterPodDetailRequest
     * @return DescribeClusterPodDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodDetailResponse DescribeClusterPodDetail(DescribeClusterPodDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodDetail", DescribeClusterPodDetailResponse.class);
    }

    /**
     *查询集群pod列表
     * @param req DescribeClusterPodListRequest
     * @return DescribeClusterPodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodListResponse DescribeClusterPodList(DescribeClusterPodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodList", DescribeClusterPodListResponse.class);
    }

    /**
     *查询集群service列表
     * @param req DescribeClusterServiceListRequest
     * @return DescribeClusterServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterServiceListResponse DescribeClusterServiceList(DescribeClusterServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterServiceList", DescribeClusterServiceListResponse.class);
    }

    /**
     *查询集群概览数据
     * @param req DescribeClusterSummaryRequest
     * @return DescribeClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSummaryResponse DescribeClusterSummary(DescribeClusterSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSummary", DescribeClusterSummaryResponse.class);
    }

    /**
     *查询集群超级节点详情，返回基本信息（所属地域/可用区/资产最后更新时间/节点来源/子网/核数）与所属集群信息（集群名称/集群ID/集群状态/Kubernetes版本/Kubelet版本）。
     * @param req DescribeClusterSuperNodeInfoRequest
     * @return DescribeClusterSuperNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSuperNodeInfoResponse DescribeClusterSuperNodeInfo(DescribeClusterSuperNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSuperNodeInfo", DescribeClusterSuperNodeInfoResponse.class);
    }

    /**
     *云资源配置检测合规概览
     * @param req DescribeComplianceOverviewRequest
     * @return DescribeComplianceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceOverviewResponse DescribeComplianceOverview(DescribeComplianceOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceOverview", DescribeComplianceOverviewResponse.class);
    }

    /**
     *合规标准聚合视角下云资源配置风险列表
     * @param req DescribeComplianceRiskListRequest
     * @return DescribeComplianceRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceRiskListResponse DescribeComplianceRiskList(DescribeComplianceRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceRiskList", DescribeComplianceRiskListResponse.class);
    }

    /**
     *云资源配置检测标准章节条款树
     * @param req DescribeComplianceStandardTermTreeRequest
     * @return DescribeComplianceStandardTermTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceStandardTermTreeResponse DescribeComplianceStandardTermTree(DescribeComplianceStandardTermTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceStandardTermTree", DescribeComplianceStandardTermTreeResponse.class);
    }

    /**
     *云资源配置检测规范分类统计
     * @param req DescribeComplianceStatisticsRequest
     * @return DescribeComplianceStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceStatisticsResponse DescribeComplianceStatistics(DescribeComplianceStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceStatistics", DescribeComplianceStatisticsResponse.class);
    }

    /**
     *云资源配置风险规则列表示例
     * @param req DescribeConfigCheckRulesRequest
     * @return DescribeConfigCheckRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigCheckRulesResponse DescribeConfigCheckRules(DescribeConfigCheckRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigCheckRules", DescribeConfigCheckRulesResponse.class);
    }

    /**
     *查看cos桶访问权限信息
     * @param req DescribeCosAccessPermissionRequest
     * @return DescribeCosAccessPermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAccessPermissionResponse DescribeCosAccessPermission(DescribeCosAccessPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAccessPermission", DescribeCosAccessPermissionResponse.class);
    }

    /**
     *查看对象存储访问权限列表
     * @param req DescribeCosAccessPermissionsRequest
     * @return DescribeCosAccessPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAccessPermissionsResponse DescribeCosAccessPermissions(DescribeCosAccessPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAccessPermissions", DescribeCosAccessPermissionsResponse.class);
    }

    /**
     *查看COS接口列表
     * @param req DescribeCosActionListRequest
     * @return DescribeCosActionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosActionListResponse DescribeCosActionList(DescribeCosActionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosActionList", DescribeCosActionListResponse.class);
    }

    /**
     *查看ak资产列表信息
     * @param req DescribeCosAkAssetRequest
     * @return DescribeCosAkAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAkAssetResponse DescribeCosAkAsset(DescribeCosAkAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAkAsset", DescribeCosAkAssetResponse.class);
    }

    /**
     *查看存储桶调用源ip列表
     * @param req DescribeCosAkInvokeIpListRequest
     * @return DescribeCosAkInvokeIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAkInvokeIpListResponse DescribeCosAkInvokeIpList(DescribeCosAkInvokeIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAkInvokeIpList", DescribeCosAkInvokeIpListResponse.class);
    }

    /**
     *查看告警列表
     * @param req DescribeCosAlarmListRequest
     * @return DescribeCosAlarmListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAlarmListResponse DescribeCosAlarmList(DescribeCosAlarmListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAlarmList", DescribeCosAlarmListResponse.class);
    }

    /**
     *每日告警新增数据
     * @param req DescribeCosAlarmTrendDataRequest
     * @return DescribeCosAlarmTrendDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAlarmTrendDataResponse DescribeCosAlarmTrendData(DescribeCosAlarmTrendDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAlarmTrendData", DescribeCosAlarmTrendDataResponse.class);
    }

    /**
     *查看cos资产列表
     * @param req DescribeCosAssetRequest
     * @return DescribeCosAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAssetResponse DescribeCosAsset(DescribeCosAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAsset", DescribeCosAssetResponse.class);
    }

    /**
     *获取对应appid对应的当前正在扫描的taskid
     * @param req DescribeCosAssetSyncTaskRequest
     * @return DescribeCosAssetSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAssetSyncTaskResponse DescribeCosAssetSyncTask(DescribeCosAssetSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAssetSyncTask", DescribeCosAssetSyncTaskResponse.class);
    }

    /**
     *查看该appid下已购买的appid集合
     * @param req DescribeCosAuditAppIdListRequest
     * @return DescribeCosAuditAppIdListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAuditAppIdListResponse DescribeCosAuditAppIdList(DescribeCosAuditAppIdListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAuditAppIdList", DescribeCosAuditAppIdListResponse.class);
    }

    /**
     *查询cos审计字典信息列表
     * @param req DescribeCosAuditDictionaryListRequest
     * @return DescribeCosAuditDictionaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAuditDictionaryListResponse DescribeCosAuditDictionaryList(DescribeCosAuditDictionaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAuditDictionaryList", DescribeCosAuditDictionaryListResponse.class);
    }

    /**
     *获取审计支付信息
     * @param req DescribeCosAuditPayInfoRequest
     * @return DescribeCosAuditPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosAuditPayInfoResponse DescribeCosAuditPayInfo(DescribeCosAuditPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosAuditPayInfo", DescribeCosAuditPayInfoResponse.class);
    }

    /**
     *获取存储桶计费信息
     * @param req DescribeCosBucketBillingInfoRequest
     * @return DescribeCosBucketBillingInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosBucketBillingInfoResponse DescribeCosBucketBillingInfo(DescribeCosBucketBillingInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosBucketBillingInfo", DescribeCosBucketBillingInfoResponse.class);
    }

    /**
     *获取存储桶信息
     * @param req DescribeCosBucketListRequest
     * @return DescribeCosBucketListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosBucketListResponse DescribeCosBucketList(DescribeCosBucketListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosBucketList", DescribeCosBucketListResponse.class);
    }

    /**
     *查看风险资产视角
     * @param req DescribeCosBucketRiskRequest
     * @return DescribeCosBucketRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosBucketRiskResponse DescribeCosBucketRisk(DescribeCosBucketRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosBucketRisk", DescribeCosBucketRiskResponse.class);
    }

    /**
     *查询cos文件数据识别结果列表
     * @param req DescribeCosIdentifyFileListRequest
     * @return DescribeCosIdentifyFileListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosIdentifyFileListResponse DescribeCosIdentifyFileList(DescribeCosIdentifyFileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosIdentifyFileList", DescribeCosIdentifyFileListResponse.class);
    }

    /**
     *查看调用记录关联的文件信息
     * @param req DescribeCosInvokeUaRequest
     * @return DescribeCosInvokeUaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosInvokeUaResponse DescribeCosInvokeUa(DescribeCosInvokeUaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosInvokeUa", DescribeCosInvokeUaResponse.class);
    }

    /**
     *查看cos调用日志
     * @param req DescribeCosIpInvokeLogRequest
     * @return DescribeCosIpInvokeLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosIpInvokeLogResponse DescribeCosIpInvokeLog(DescribeCosIpInvokeLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosIpInvokeLog", DescribeCosIpInvokeLogResponse.class);
    }

    /**
     *查看调用记录关联的文件信息
     * @param req DescribeCosIpInvokeRecordFileRequest
     * @return DescribeCosIpInvokeRecordFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosIpInvokeRecordFileResponse DescribeCosIpInvokeRecordFile(DescribeCosIpInvokeRecordFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosIpInvokeRecordFile", DescribeCosIpInvokeRecordFileResponse.class);
    }

    /**
     *查询cos风险文件扫描任务
     * @param req DescribeCosObjectScanTaskRequest
     * @return DescribeCosObjectScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosObjectScanTaskResponse DescribeCosObjectScanTask(DescribeCosObjectScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosObjectScanTask", DescribeCosObjectScanTaskResponse.class);
    }

    /**
     *cos概览信息
     * @param req DescribeCosOverviewRequest
     * @return DescribeCosOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosOverviewResponse DescribeCosOverview(DescribeCosOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosOverview", DescribeCosOverviewResponse.class);
    }

    /**
     *获取策略列表信息
     * @param req DescribeCosPolicyRequest
     * @return DescribeCosPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosPolicyResponse DescribeCosPolicy(DescribeCosPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosPolicy", DescribeCosPolicyResponse.class);
    }

    /**
     *风险接口列表信息
     * @param req DescribeCosRiskActionListRequest
     * @return DescribeCosRiskActionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRiskActionListResponse DescribeCosRiskActionList(DescribeCosRiskActionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRiskActionList", DescribeCosRiskActionListResponse.class);
    }

    /**
     *查看风险证据以及描述
     * @param req DescribeCosRiskEvidenceRequest
     * @return DescribeCosRiskEvidenceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRiskEvidenceResponse DescribeCosRiskEvidence(DescribeCosRiskEvidenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRiskEvidence", DescribeCosRiskEvidenceResponse.class);
    }

    /**
     *查看存储桶扫描任务详情
     * @param req DescribeCosRiskScanTaskRequest
     * @return DescribeCosRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRiskScanTaskResponse DescribeCosRiskScanTask(DescribeCosRiskScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRiskScanTask", DescribeCosRiskScanTaskResponse.class);
    }

    /**
     *查看cos桶访问权限信息
     * @param req DescribeCosRoleAccessPermissionRequest
     * @return DescribeCosRoleAccessPermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRoleAccessPermissionResponse DescribeCosRoleAccessPermission(DescribeCosRoleAccessPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRoleAccessPermission", DescribeCosRoleAccessPermissionResponse.class);
    }

    /**
     *获取存储桶角色权限列表
     * @param req DescribeCosRoleAccessPermissionsRequest
     * @return DescribeCosRoleAccessPermissionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRoleAccessPermissionsResponse DescribeCosRoleAccessPermissions(DescribeCosRoleAccessPermissionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRoleAccessPermissions", DescribeCosRoleAccessPermissionsResponse.class);
    }

    /**
     *调用源ip列表
     * @param req DescribeCosSourceIpRequest
     * @return DescribeCosSourceIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosSourceIpResponse DescribeCosSourceIp(DescribeCosSourceIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosSourceIp", DescribeCosSourceIpResponse.class);
    }

    /**
     *获取CSPM自动配额共享配置
     * @param req DescribeCspmShardConfigRequest
     * @return DescribeCspmShardConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCspmShardConfigResponse DescribeCspmShardConfig(DescribeCspmShardConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCspmShardConfig", DescribeCspmShardConfigResponse.class);
    }

    /**
     *用户自定义 标签数量
     * @param req DescribeCustomAssetTagCountRequest
     * @return DescribeCustomAssetTagCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomAssetTagCountResponse DescribeCustomAssetTagCount(DescribeCustomAssetTagCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomAssetTagCount", DescribeCustomAssetTagCountResponse.class);
    }

    /**
     *自定义风险规则配置详情列表示例
     * @param req DescribeCustomRiskRuleDetailRequest
     * @return DescribeCustomRiskRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRiskRuleDetailResponse DescribeCustomRiskRuleDetail(DescribeCustomRiskRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRiskRuleDetail", DescribeCustomRiskRuleDetailResponse.class);
    }

    /**
     *自定义风险规则配置列表
     * @param req DescribeCustomRiskRulesRequest
     * @return DescribeCustomRiskRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRiskRulesResponse DescribeCustomRiskRules(DescribeCustomRiskRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRiskRules", DescribeCustomRiskRulesResponse.class);
    }

    /**
     *db资产详情
     * @param req DescribeDbAssetInfoRequest
     * @return DescribeDbAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetInfoResponse DescribeDbAssetInfo(DescribeDbAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssetInfo", DescribeDbAssetInfoResponse.class);
    }

    /**
     *数据库资产列表
     * @param req DescribeDbAssetsRequest
     * @return DescribeDbAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetsResponse DescribeDbAssets(DescribeDbAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssets", DescribeDbAssetsResponse.class);
    }

    /**
     *获取内置默认安全评分规则，用于重置自定义规则
     * @param req DescribeDefaultSecurityScoreRuleRequest
     * @return DescribeDefaultSecurityScoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultSecurityScoreRuleResponse DescribeDefaultSecurityScoreRule(DescribeDefaultSecurityScoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultSecurityScoreRule", DescribeDefaultSecurityScoreRuleResponse.class);
    }

    /**
     *域名列表
     * @param req DescribeDomainAssetsRequest
     * @return DescribeDomainAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAssetsResponse DescribeDomainAssets(DescribeDomainAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAssets", DescribeDomainAssetsResponse.class);
    }

    /**
     *查询Dspm访问记录
     * @param req DescribeDspmAccessRecordRequest
     * @return DescribeDspmAccessRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessRecordResponse DescribeDspmAccessRecord(DescribeDspmAccessRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessRecord", DescribeDspmAccessRecordResponse.class);
    }

    /**
     *查询Dspm访问拓扑账号列表
     * @param req DescribeDspmAccessTopologyAccountsRequest
     * @return DescribeDspmAccessTopologyAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessTopologyAccountsResponse DescribeDspmAccessTopologyAccounts(DescribeDspmAccessTopologyAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessTopologyAccounts", DescribeDspmAccessTopologyAccountsResponse.class);
    }

    /**
     *查询Dspm访问拓扑资产列表
     * @param req DescribeDspmAccessTopologyAssetsRequest
     * @return DescribeDspmAccessTopologyAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessTopologyAssetsResponse DescribeDspmAccessTopologyAssets(DescribeDspmAccessTopologyAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessTopologyAssets", DescribeDspmAccessTopologyAssetsResponse.class);
    }

    /**
     *查询Dspm访问拓扑ip列表
     * @param req DescribeDspmAccessTopologyIpsRequest
     * @return DescribeDspmAccessTopologyIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessTopologyIpsResponse DescribeDspmAccessTopologyIps(DescribeDspmAccessTopologyIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessTopologyIps", DescribeDspmAccessTopologyIpsResponse.class);
    }

    /**
     *查询Dspm申请历史
     * @param req DescribeDspmApplyHistoryRequest
     * @return DescribeDspmApplyHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApplyHistoryResponse DescribeDspmApplyHistory(DescribeDspmApplyHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApplyHistory", DescribeDspmApplyHistoryResponse.class);
    }

    /**
     *查询Dspm申请单列表
     * @param req DescribeDspmApplyOrderListRequest
     * @return DescribeDspmApplyOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApplyOrderListResponse DescribeDspmApplyOrderList(DescribeDspmApplyOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApplyOrderList", DescribeDspmApplyOrderListResponse.class);
    }

    /**
     *查询Dspm审批历史
     * @param req DescribeDspmApproveHistoryRequest
     * @return DescribeDspmApproveHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApproveHistoryResponse DescribeDspmApproveHistory(DescribeDspmApproveHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApproveHistory", DescribeDspmApproveHistoryResponse.class);
    }

    /**
     *查询Dspm审批单列表
     * @param req DescribeDspmApproveOrderListRequest
     * @return DescribeDspmApproveOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApproveOrderListResponse DescribeDspmApproveOrderList(DescribeDspmApproveOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApproveOrderList", DescribeDspmApproveOrderListResponse.class);
    }

    /**
     *查询Dspm资产访问拓扑
     * @param req DescribeDspmAssetAccessTopologyRequest
     * @return DescribeDspmAssetAccessTopologyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccessTopologyResponse DescribeDspmAssetAccessTopology(DescribeDspmAssetAccessTopologyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccessTopology", DescribeDspmAssetAccessTopologyResponse.class);
    }

    /**
     *查询Dspm资产账号身份信息
     * @param req DescribeDspmAssetAccountIdentifyRequest
     * @return DescribeDspmAssetAccountIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountIdentifyResponse DescribeDspmAssetAccountIdentify(DescribeDspmAssetAccountIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccountIdentify", DescribeDspmAssetAccountIdentifyResponse.class);
    }

    /**
     *查询Dspm资产账号预设特权信息
     * @param req DescribeDspmAssetAccountPresetPrivilegesRequest
     * @return DescribeDspmAssetAccountPresetPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountPresetPrivilegesResponse DescribeDspmAssetAccountPresetPrivileges(DescribeDspmAssetAccountPresetPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccountPresetPrivileges", DescribeDspmAssetAccountPresetPrivilegesResponse.class);
    }

    /**
     *查询Dspm资产账号回收后特权信息
     * @param req DescribeDspmAssetAccountRecycledPrivilegesRequest
     * @return DescribeDspmAssetAccountRecycledPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountRecycledPrivilegesResponse DescribeDspmAssetAccountRecycledPrivileges(DescribeDspmAssetAccountRecycledPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccountRecycledPrivileges", DescribeDspmAssetAccountRecycledPrivilegesResponse.class);
    }

    /**
     *查询Dspm资产账号列表
     * @param req DescribeDspmAssetAccountsRequest
     * @return DescribeDspmAssetAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountsResponse DescribeDspmAssetAccounts(DescribeDspmAssetAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccounts", DescribeDspmAssetAccountsResponse.class);
    }

    /**
     *查询资产数据库信息
     * @param req DescribeDspmAssetDatabaseListRequest
     * @return DescribeDspmAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetDatabaseListResponse DescribeDspmAssetDatabaseList(DescribeDspmAssetDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetDatabaseList", DescribeDspmAssetDatabaseListResponse.class);
    }

    /**
     *查询Dspm资产数据库列表
     * @param req DescribeDspmAssetDatabasesRequest
     * @return DescribeDspmAssetDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetDatabasesResponse DescribeDspmAssetDatabases(DescribeDspmAssetDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetDatabases", DescribeDspmAssetDatabasesResponse.class);
    }

    /**
     *查询dspm资产字段信息
     * @param req DescribeDspmAssetFieldListRequest
     * @return DescribeDspmAssetFieldListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetFieldListResponse DescribeDspmAssetFieldList(DescribeDspmAssetFieldListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetFieldList", DescribeDspmAssetFieldListResponse.class);
    }

    /**
     *查询dspm资产字段样本值
     * @param req DescribeDspmAssetFieldSamplesRequest
     * @return DescribeDspmAssetFieldSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetFieldSamplesResponse DescribeDspmAssetFieldSamples(DescribeDspmAssetFieldSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetFieldSamples", DescribeDspmAssetFieldSamplesResponse.class);
    }

    /**
     *查询dspm资产数据识别信息列表
     * @param req DescribeDspmAssetIdentifyInfoListRequest
     * @return DescribeDspmAssetIdentifyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetIdentifyInfoListResponse DescribeDspmAssetIdentifyInfoList(DescribeDspmAssetIdentifyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetIdentifyInfoList", DescribeDspmAssetIdentifyInfoListResponse.class);
    }

    /**
     *查询Dspm资产id列表
     * @param req DescribeDspmAssetIdsRequest
     * @return DescribeDspmAssetIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetIdsResponse DescribeDspmAssetIds(DescribeDspmAssetIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetIds", DescribeDspmAssetIdsResponse.class);
    }

    /**
     *查询Dspm资产登录凭据
     * @param req DescribeDspmAssetLoginCredentialRequest
     * @return DescribeDspmAssetLoginCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetLoginCredentialResponse DescribeDspmAssetLoginCredential(DescribeDspmAssetLoginCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetLoginCredential", DescribeDspmAssetLoginCredentialResponse.class);
    }

    /**
     *查询Dspm资产安全分析状态
     * @param req DescribeDspmAssetSecurityAnalyseStatusRequest
     * @return DescribeDspmAssetSecurityAnalyseStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetSecurityAnalyseStatusResponse DescribeDspmAssetSecurityAnalyseStatus(DescribeDspmAssetSecurityAnalyseStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetSecurityAnalyseStatus", DescribeDspmAssetSecurityAnalyseStatusResponse.class);
    }

    /**
     *查询Dspm资产支持的权限
     * @param req DescribeDspmAssetSupportedPrivilegesRequest
     * @return DescribeDspmAssetSupportedPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetSupportedPrivilegesResponse DescribeDspmAssetSupportedPrivileges(DescribeDspmAssetSupportedPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetSupportedPrivileges", DescribeDspmAssetSupportedPrivilegesResponse.class);
    }

    /**
     *查询资产表信息
     * @param req DescribeDspmAssetTableListRequest
     * @return DescribeDspmAssetTableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetTableListResponse DescribeDspmAssetTableList(DescribeDspmAssetTableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetTableList", DescribeDspmAssetTableListResponse.class);
    }

    /**
     *查询Dspm资产列表
     * @param req DescribeDspmAssetsRequest
     * @return DescribeDspmAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetsResponse DescribeDspmAssets(DescribeDspmAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssets", DescribeDspmAssetsResponse.class);
    }

    /**
     *查询备份日志列表
     * @param req DescribeDspmBackupLogListRequest
     * @return DescribeDspmBackupLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmBackupLogListResponse DescribeDspmBackupLogList(DescribeDspmBackupLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmBackupLogList", DescribeDspmBackupLogListResponse.class);
    }

    /**
     *查询日志备份配置
     * @param req DescribeDspmBackupSettingRequest
     * @return DescribeDspmBackupSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmBackupSettingResponse DescribeDspmBackupSetting(DescribeDspmBackupSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmBackupSetting", DescribeDspmBackupSettingResponse.class);
    }

    /**
     *查询dspm字典信息列表
     * @param req DescribeDspmDictionaryListRequest
     * @return DescribeDspmDictionaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmDictionaryListResponse DescribeDspmDictionaryList(DescribeDspmDictionaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmDictionaryList", DescribeDspmDictionaryListResponse.class);
    }

    /**
     *查询导出任务
     * @param req DescribeDspmExportTaskRequest
     * @return DescribeDspmExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmExportTaskResponse DescribeDspmExportTask(DescribeDspmExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmExportTask", DescribeDspmExportTaskResponse.class);
    }

    /**
     *查询dspm数据识别分类列表
     * @param req DescribeDspmIdentifyCategoryListRequest
     * @return DescribeDspmIdentifyCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyCategoryListResponse DescribeDspmIdentifyCategoryList(DescribeDspmIdentifyCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyCategoryList", DescribeDspmIdentifyCategoryListResponse.class);
    }

    /**
     *查询dspm数据识别模板分类关联数据项列表
     * @param req DescribeDspmIdentifyComplianceCategoryRuleListRequest
     * @return DescribeDspmIdentifyComplianceCategoryRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyComplianceCategoryRuleListResponse DescribeDspmIdentifyComplianceCategoryRuleList(DescribeDspmIdentifyComplianceCategoryRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyComplianceCategoryRuleList", DescribeDspmIdentifyComplianceCategoryRuleListResponse.class);
    }

    /**
     *查询dspm识别模板详情
     * @param req DescribeDspmIdentifyComplianceGroupDetailRequest
     * @return DescribeDspmIdentifyComplianceGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyComplianceGroupDetailResponse DescribeDspmIdentifyComplianceGroupDetail(DescribeDspmIdentifyComplianceGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyComplianceGroupDetail", DescribeDspmIdentifyComplianceGroupDetailResponse.class);
    }

    /**
     *查询dspm数据识别模板列表
     * @param req DescribeDspmIdentifyComplianceGroupListRequest
     * @return DescribeDspmIdentifyComplianceGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyComplianceGroupListResponse DescribeDspmIdentifyComplianceGroupList(DescribeDspmIdentifyComplianceGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyComplianceGroupList", DescribeDspmIdentifyComplianceGroupListResponse.class);
    }

    /**
     *查询dspm数据识别分布统计
     * @param req DescribeDspmIdentifyDistributionStatisticsRequest
     * @return DescribeDspmIdentifyDistributionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyDistributionStatisticsResponse DescribeDspmIdentifyDistributionStatistics(DescribeDspmIdentifyDistributionStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyDistributionStatistics", DescribeDspmIdentifyDistributionStatisticsResponse.class);
    }

    /**
     *查询Dspm身份id列表
     * @param req DescribeDspmIdentifyIdListRequest
     * @return DescribeDspmIdentifyIdListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyIdListResponse DescribeDspmIdentifyIdList(DescribeDspmIdentifyIdListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyIdList", DescribeDspmIdentifyIdListResponse.class);
    }

    /**
     *查询Dspm身份信息
     * @param req DescribeDspmIdentifyInfoRequest
     * @return DescribeDspmIdentifyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyInfoResponse DescribeDspmIdentifyInfo(DescribeDspmIdentifyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyInfo", DescribeDspmIdentifyInfoResponse.class);
    }

    /**
     *查询Dspm身份信息列表
     * @param req DescribeDspmIdentifyInfoListRequest
     * @return DescribeDspmIdentifyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyInfoListResponse DescribeDspmIdentifyInfoList(DescribeDspmIdentifyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyInfoList", DescribeDspmIdentifyInfoListResponse.class);
    }

    /**
     *查询dspm数据识别分级组列表
     * @param req DescribeDspmIdentifyLevelGroupListRequest
     * @return DescribeDspmIdentifyLevelGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyLevelGroupListResponse DescribeDspmIdentifyLevelGroupList(DescribeDspmIdentifyLevelGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyLevelGroupList", DescribeDspmIdentifyLevelGroupListResponse.class);
    }

    /**
     *查询dspm数据识别数据项详情
     * @param req DescribeDspmIdentifyRuleDetailRequest
     * @return DescribeDspmIdentifyRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyRuleDetailResponse DescribeDspmIdentifyRuleDetail(DescribeDspmIdentifyRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyRuleDetail", DescribeDspmIdentifyRuleDetailResponse.class);
    }

    /**
     *查询dspm数据识别数据项列表
     * @param req DescribeDspmIdentifyRuleListRequest
     * @return DescribeDspmIdentifyRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyRuleListResponse DescribeDspmIdentifyRuleList(DescribeDspmIdentifyRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyRuleList", DescribeDspmIdentifyRuleListResponse.class);
    }

    /**
     *查询dspm数据识别数据项验证结果
     * @param req DescribeDspmIdentifyRuleTestResultRequest
     * @return DescribeDspmIdentifyRuleTestResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyRuleTestResultResponse DescribeDspmIdentifyRuleTestResult(DescribeDspmIdentifyRuleTestResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyRuleTestResult", DescribeDspmIdentifyRuleTestResultResponse.class);
    }

    /**
     *查询日志列表信息
     * @param req DescribeDspmLogListRequest
     * @return DescribeDspmLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmLogListResponse DescribeDspmLogList(DescribeDspmLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmLogList", DescribeDspmLogListResponse.class);
    }

    /**
     *获取已购Dspm订单信息
     * @param req DescribeDspmPayInfoRequest
     * @return DescribeDspmPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmPayInfoResponse DescribeDspmPayInfo(DescribeDspmPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmPayInfo", DescribeDspmPayInfoResponse.class);
    }

    /**
     *查询Dspm访客申请记录
     * @param req DescribeDspmPersonApplyHistoryRequest
     * @return DescribeDspmPersonApplyHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmPersonApplyHistoryResponse DescribeDspmPersonApplyHistory(DescribeDspmPersonApplyHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmPersonApplyHistory", DescribeDspmPersonApplyHistoryResponse.class);
    }

    /**
     *查询Dspm个人身份信息列表
     * @param req DescribeDspmPersonalIdentifyListRequest
     * @return DescribeDspmPersonalIdentifyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmPersonalIdentifyListResponse DescribeDspmPersonalIdentifyList(DescribeDspmPersonalIdentifyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmPersonalIdentifyList", DescribeDspmPersonalIdentifyListResponse.class);
    }

    /**
     *查询Dspm风险记录
     * @param req DescribeDspmRiskRequest
     * @return DescribeDspmRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskResponse DescribeDspmRisk(DescribeDspmRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRisk", DescribeDspmRiskResponse.class);
    }

    /**
     *查询Dspm风险详情
     * @param req DescribeDspmRiskDetailRequest
     * @return DescribeDspmRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskDetailResponse DescribeDspmRiskDetail(DescribeDspmRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskDetail", DescribeDspmRiskDetailResponse.class);
    }

    /**
     *查询Dspm风险策略
     * @param req DescribeDspmRiskStrategyRequest
     * @return DescribeDspmRiskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskStrategyResponse DescribeDspmRiskStrategy(DescribeDspmRiskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskStrategy", DescribeDspmRiskStrategyResponse.class);
    }

    /**
     *查询Dspm风险分组策略
     * @param req DescribeDspmRiskStrategyGroupRequest
     * @return DescribeDspmRiskStrategyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskStrategyGroupResponse DescribeDspmRiskStrategyGroup(DescribeDspmRiskStrategyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskStrategyGroup", DescribeDspmRiskStrategyGroupResponse.class);
    }

    /**
     *查询Dspm风险趋势
     * @param req DescribeDspmRiskTendencyRequest
     * @return DescribeDspmRiskTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskTendencyResponse DescribeDspmRiskTendency(DescribeDspmRiskTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskTendency", DescribeDspmRiskTendencyResponse.class);
    }

    /**
     *查询Dspm统计信息
     * @param req DescribeDspmStatisticsRequest
     * @return DescribeDspmStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmStatisticsResponse DescribeDspmStatistics(DescribeDspmStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmStatistics", DescribeDspmStatisticsResponse.class);
    }

    /**
     *查询Dspm支持的资产类型信息
     * @param req DescribeDspmSupportedAssetTypeRequest
     * @return DescribeDspmSupportedAssetTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSupportedAssetTypeResponse DescribeDspmSupportedAssetType(DescribeDspmSupportedAssetTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSupportedAssetType", DescribeDspmSupportedAssetTypeResponse.class);
    }

    /**
     *查询Dspm同步资产状态
     * @param req DescribeDspmSyncAssetsStatusRequest
     * @return DescribeDspmSyncAssetsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSyncAssetsStatusResponse DescribeDspmSyncAssetsStatus(DescribeDspmSyncAssetsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSyncAssetsStatus", DescribeDspmSyncAssetsStatusResponse.class);
    }

    /**
     *查询Dspm同步用户状态
     * @param req DescribeDspmSyncUsersStatusRequest
     * @return DescribeDspmSyncUsersStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSyncUsersStatusResponse DescribeDspmSyncUsersStatus(DescribeDspmSyncUsersStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSyncUsersStatus", DescribeDspmSyncUsersStatusResponse.class);
    }

    /**
     *查询Dspm白名单策略
     * @param req DescribeDspmWhitelistStrategyRequest
     * @return DescribeDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmWhitelistStrategyResponse DescribeDspmWhitelistStrategy(DescribeDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmWhitelistStrategy", DescribeDspmWhitelistStrategyResponse.class);
    }

    /**
     *指定资产类型列表
     * @param req DescribeDynamicAssetsRequest
     * @return DescribeDynamicAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDynamicAssetsResponse DescribeDynamicAssets(DescribeDynamicAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDynamicAssets", DescribeDynamicAssetsResponse.class);
    }

    /**
     *获取EDR策略列表
     * @param req DescribeEDRRuleListRequest
     * @return DescribeEDRRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEDRRuleListResponse DescribeEDRRuleList(DescribeEDRRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEDRRuleList", DescribeEDRRuleListResponse.class);
    }

    /**
     *查询扫描任务列表。Filter.Filters支持Name：Keyword(模糊OperatorType=9)、ScanType(MANUAL/CYCLE)、TaskType(HOST/CONTAINER)、Status(WAIT/SCANNING/FINISHED/FAILED/CANCELED)、AppId(账号)。
     * @param req DescribeEDRScanRecordListRequest
     * @return DescribeEDRScanRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEDRScanRecordListResponse DescribeEDRScanRecordList(DescribeEDRScanRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEDRScanRecordList", DescribeEDRScanRecordListResponse.class);
    }

    /**
     *查询扫描任务详情。Filter.Filters支持Name：Status（资产扫描状态，OperatorType=7 IN匹配，取值WAIT/SCANNING/FINISHED/FAILED）。
     * @param req DescribeEDRScanTaskDetailRequest
     * @return DescribeEDRScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEDRScanTaskDetailResponse DescribeEDRScanTaskDetail(DescribeEDRScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEDRScanTaskDetail", DescribeEDRScanTaskDetailResponse.class);
    }

    /**
     *获取EDR告警数量统计，供资产模块调用。根据传入的MemberId和InstanceIDs，查询EDR告警表并返回告警记录条数信息。当InstanceIDs为空时返回汇总统计，非空时按InstanceIDs粒度分别返回统计。
     * @param req DescribeEdrAlertCountForAssetRequest
     * @return DescribeEdrAlertCountForAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertCountForAssetResponse DescribeEdrAlertCountForAsset(DescribeEdrAlertCountForAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertCountForAsset", DescribeEdrAlertCountForAssetResponse.class);
    }

    /**
     *容器场景告警数量统计
     * @param req DescribeEdrAlertCountForContainerRequest
     * @return DescribeEdrAlertCountForContainerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertCountForContainerResponse DescribeEdrAlertCountForContainer(DescribeEdrAlertCountForContainerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertCountForContainer", DescribeEdrAlertCountForContainerResponse.class);
    }

    /**
     *获取EDR告警详情，包含告警内容JSON、资产富化、情报富化等完整信息
     * @param req DescribeEdrAlertInfoRequest
     * @return DescribeEdrAlertInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertInfoResponse DescribeEdrAlertInfo(DescribeEdrAlertInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertInfo", DescribeEdrAlertInfoResponse.class);
    }

    /**
     *获取EDR告警列表
     * @param req DescribeEdrAlertListRequest
     * @return DescribeEdrAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertListResponse DescribeEdrAlertList(DescribeEdrAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertList", DescribeEdrAlertListResponse.class);
    }

    /**
     *EDR告警多攻击阶段查询
     * @param req DescribeEdrAlertMultiAttackStagesRequest
     * @return DescribeEdrAlertMultiAttackStagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertMultiAttackStagesResponse DescribeEdrAlertMultiAttackStages(DescribeEdrAlertMultiAttackStagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertMultiAttackStages", DescribeEdrAlertMultiAttackStagesResponse.class);
    }

    /**
     *获取EDR告警统计
     * @param req DescribeEdrAlertSummaryRequest
     * @return DescribeEdrAlertSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertSummaryResponse DescribeEdrAlertSummary(DescribeEdrAlertSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertSummary", DescribeEdrAlertSummaryResponse.class);
    }

    /**
     *EDR告警标签批量查询
     * @param req DescribeEdrAlertThreatTagsRequest
     * @return DescribeEdrAlertThreatTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertThreatTagsResponse DescribeEdrAlertThreatTags(DescribeEdrAlertThreatTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertThreatTags", DescribeEdrAlertThreatTagsResponse.class);
    }

    /**
     *查询EDR日志采集例外网段配置，添加至例外名单的网段，其TCP日志将不被采集。如果用户未配置过，则返回系统推荐的默认网段
     * @param req DescribeEdrExcludeNetworkSegmentsRequest
     * @return DescribeEdrExcludeNetworkSegmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrExcludeNetworkSegmentsResponse DescribeEdrExcludeNetworkSegments(DescribeEdrExcludeNetworkSegmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrExcludeNetworkSegments", DescribeEdrExcludeNetworkSegmentsResponse.class);
    }

    /**
     *获取EDR导出下载链接
     * @param req DescribeEdrExportJobDownloadURLRequest
     * @return DescribeEdrExportJobDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrExportJobDownloadURLResponse DescribeEdrExportJobDownloadURL(DescribeEdrExportJobDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrExportJobDownloadURL", DescribeEdrExportJobDownloadURLResponse.class);
    }

    /**
     *导出EDR任务列表
     * @param req DescribeEdrExportJobListRequest
     * @return DescribeEdrExportJobListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrExportJobListResponse DescribeEdrExportJobList(DescribeEdrExportJobListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrExportJobList", DescribeEdrExportJobListResponse.class);
    }

    /**
     *查询采集路径配置
     * @param req DescribeEdrLogCollectPathsRequest
     * @return DescribeEdrLogCollectPathsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrLogCollectPathsResponse DescribeEdrLogCollectPaths(DescribeEdrLogCollectPathsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrLogCollectPaths", DescribeEdrLogCollectPathsResponse.class);
    }

    /**
     *导出任务结果下载URL
     * @param req DescribeExportJobDownloadURLRequest
     * @return DescribeExportJobDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobDownloadURLResponse DescribeExportJobDownloadURL(DescribeExportJobDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobDownloadURL", DescribeExportJobDownloadURLResponse.class);
    }

    /**
     *导出任务列表
     * @param req DescribeExportJobManageListRequest
     * @return DescribeExportJobManageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobManageListResponse DescribeExportJobManageList(DescribeExportJobManageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobManageList", DescribeExportJobManageListResponse.class);
    }

    /**
     *云边界分析资产分类
     * @param req DescribeExposeAssetCategoryRequest
     * @return DescribeExposeAssetCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeAssetCategoryResponse DescribeExposeAssetCategory(DescribeExposeAssetCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeAssetCategory", DescribeExposeAssetCategoryResponse.class);
    }

    /**
     *查询云边界分析路径节点
     * @param req DescribeExposePathRequest
     * @return DescribeExposePathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposePathResponse DescribeExposePath(DescribeExposePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposePath", DescribeExposePathResponse.class);
    }

    /**
     *云边界风险待治理风险
     * @param req DescribeExposeRiskStatisticsRequest
     * @return DescribeExposeRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeRiskStatisticsResponse DescribeExposeRiskStatistics(DescribeExposeRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeRiskStatistics", DescribeExposeRiskStatisticsResponse.class);
    }

    /**
     *云边界待处理风险列表
     * @param req DescribeExposeRisksRequest
     * @return DescribeExposeRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeRisksResponse DescribeExposeRisks(DescribeExposeRisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeRisks", DescribeExposeRisksResponse.class);
    }

    /**
     *边界规则列表
     * @param req DescribeExposeRulesRequest
     * @return DescribeExposeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeRulesResponse DescribeExposeRules(DescribeExposeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeRules", DescribeExposeRulesResponse.class);
    }

    /**
     *云边界自动打标-规则属性
     * @param req DescribeExposureAutoTagAttributeRequest
     * @return DescribeExposureAutoTagAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposureAutoTagAttributeResponse DescribeExposureAutoTagAttribute(DescribeExposureAutoTagAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposureAutoTagAttribute", DescribeExposureAutoTagAttributeResponse.class);
    }

    /**
     *云边界自动打标-规则列表
     * @param req DescribeExposureAutoTagRulesRequest
     * @return DescribeExposureAutoTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposureAutoTagRulesResponse DescribeExposureAutoTagRules(DescribeExposureAutoTagRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposureAutoTagRules", DescribeExposureAutoTagRulesResponse.class);
    }

    /**
     *查询互联网暴露周期数量趋势统计信息
     * @param req DescribeExposureTrendRequest
     * @return DescribeExposureTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposureTrendResponse DescribeExposureTrend(DescribeExposureTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposureTrend", DescribeExposureTrendResponse.class);
    }

    /**
     *云边界分析资产列表
     * @param req DescribeExposuresRequest
     * @return DescribeExposuresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposuresResponse DescribeExposures(DescribeExposuresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposures", DescribeExposuresResponse.class);
    }

    /**
     *获取网关列表
     * @param req DescribeGatewayAssetsRequest
     * @return DescribeGatewayAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayAssetsResponse DescribeGatewayAssets(DescribeGatewayAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayAssets", DescribeGatewayAssetsResponse.class);
    }

    /**
     *查询云边界分析-暴露路径下主机节点的高危基线风险列表
     * @param req DescribeHighBaseLineRiskListRequest
     * @return DescribeHighBaseLineRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHighBaseLineRiskListResponse DescribeHighBaseLineRiskList(DescribeHighBaseLineRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHighBaseLineRiskList", DescribeHighBaseLineRiskListResponse.class);
    }

    /**
     *获取主机kb风险列表
     * @param req DescribeHostKBRiskListRequest
     * @return DescribeHostKBRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostKBRiskListResponse DescribeHostKBRiskList(DescribeHostKBRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostKBRiskList", DescribeHostKBRiskListResponse.class);
    }

    /**
     *获取主机漏洞VPR信息
     * @param req DescribeHostVulItemVPRInfoRequest
     * @return DescribeHostVulItemVPRInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVulItemVPRInfoResponse DescribeHostVulItemVPRInfo(DescribeHostVulItemVPRInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVulItemVPRInfo", DescribeHostVulItemVPRInfoResponse.class);
    }

    /**
     *获取主机漏洞概览
     * @param req DescribeHostVulOverviewRequest
     * @return DescribeHostVulOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVulOverviewResponse DescribeHostVulOverview(DescribeHostVulOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVulOverview", DescribeHostVulOverviewResponse.class);
    }

    /**
     *获取主机漏洞风险列表
     * @param req DescribeHostVulRiskListRequest
     * @return DescribeHostVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVulRiskListResponse DescribeHostVulRiskList(DescribeHostVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVulRiskList", DescribeHostVulRiskListResponse.class);
    }

    /**
     *获取IaC检测文件列表
     * @param req DescribeIaCFileListRequest
     * @return DescribeIaCFileListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCFileListResponse DescribeIaCFileList(DescribeIaCFileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCFileList", DescribeIaCFileListResponse.class);
    }

    /**
     *获取IaC检测文件概览
     * @param req DescribeIaCFileOverviewRequest
     * @return DescribeIaCFileOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCFileOverviewResponse DescribeIaCFileOverview(DescribeIaCFileOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCFileOverview", DescribeIaCFileOverviewResponse.class);
    }

    /**
     *获取IaC检测文件报告
     * @param req DescribeIaCFileReportRequest
     * @return DescribeIaCFileReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCFileReportResponse DescribeIaCFileReport(DescribeIaCFileReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCFileReport", DescribeIaCFileReportResponse.class);
    }

    /**
     *获取IaC检测接入Token列表
     * @param req DescribeIaCTokenListRequest
     * @return DescribeIaCTokenListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCTokenListResponse DescribeIaCTokenList(DescribeIaCTokenListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCTokenList", DescribeIaCTokenListResponse.class);
    }

    /**
     *对象存储异常检测调用记录信息
     * @param req DescribeIpInvokeRecordRequest
     * @return DescribeIpInvokeRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpInvokeRecordResponse DescribeIpInvokeRecord(DescribeIpInvokeRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpInvokeRecord", DescribeIpInvokeRecordResponse.class);
    }

    /**
     *ip访问列表详情信息
     * @param req DescribeIpInvokeRecordDetailRequest
     * @return DescribeIpInvokeRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpInvokeRecordDetailResponse DescribeIpInvokeRecordDetail(DescribeIpInvokeRecordDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpInvokeRecordDetail", DescribeIpInvokeRecordDetailResponse.class);
    }

    /**
     *根据用户输入的 KB 内部 ID 查询单个 Windows KB 补丁的详情信息，返回 KB 基本信息、发布时间、是否需要重启，以及该 KB 关联的漏洞列表。
     * @param req DescribeKBDetailRequest
     * @return DescribeKBDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBDetailResponse DescribeKBDetail(DescribeKBDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKBDetail", DescribeKBDetailResponse.class);
    }

    /**
     *查询指定KB补丁可以更新的主机列表。用于Windows系统补丁修复场景，在用户提交KB补丁更新任务前，查询哪些主机缺少该补丁且支持自动更新。
     * @param req DescribeKBUpdatableMachineListRequest
     * @return DescribeKBUpdatableMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBUpdatableMachineListResponse DescribeKBUpdatableMachineList(DescribeKBUpdatableMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKBUpdatableMachineList", DescribeKBUpdatableMachineListResponse.class);
    }

    /**
     *查询凭证详情，返回凭证元数据和打码后的凭据数据。access类型返回Access数组（Key原文、Value打码），sts类型返回STS对象（System原文、SecretID和SecretKey打码）
     * @param req DescribeKeySandboxCredentialRequest
     * @return DescribeKeySandboxCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeySandboxCredentialResponse DescribeKeySandboxCredential(DescribeKeySandboxCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeySandboxCredential", DescribeKeySandboxCredentialResponse.class);
    }

    /**
     *查询凭证列表
     * @param req DescribeKeySandboxCredentialListRequest
     * @return DescribeKeySandboxCredentialListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeySandboxCredentialListResponse DescribeKeySandboxCredentialList(DescribeKeySandboxCredentialListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeySandboxCredentialList", DescribeKeySandboxCredentialListResponse.class);
    }

    /**
     *获取最近一次立即检测任务信息
     * @param req DescribeLastScanTaskInfoRequest
     * @return DescribeLastScanTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLastScanTaskInfoResponse DescribeLastScanTaskInfo(DescribeLastScanTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLastScanTaskInfo", DescribeLastScanTaskInfoResponse.class);
    }

    /**
     *查询当前账号下所有有效授权的汇总状态，按计费项分组返回总数、已用、剩余及到期时间，同时返回自动加购开关状态和合并剩余解绑次数。输出顺序固定为：旗舰版 → 专业版 → RASP → 其他。
     * @param req DescribeLicenseStatusRequest
     * @return DescribeLicenseStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseStatusResponse DescribeLicenseStatus(DescribeLicenseStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseStatus", DescribeLicenseStatusResponse.class);
    }

    /**
     *查询轻量应用服务器防火墙规则
     * @param req DescribeLighthouseFirewallRulesRequest
     * @return DescribeLighthouseFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLighthouseFirewallRulesResponse DescribeLighthouseFirewallRules(DescribeLighthouseFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLighthouseFirewallRules", DescribeLighthouseFirewallRulesResponse.class);
    }

    /**
     *查询clb监听器列表
     * @param req DescribeListenerListRequest
     * @return DescribeListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerListResponse DescribeListenerList(DescribeListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerList", DescribeListenerListResponse.class);
    }

    /**
     *获取防卸载全局配置
     * @param req DescribeLoginTypeGlobalConfRequest
     * @return DescribeLoginTypeGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginTypeGlobalConfResponse DescribeLoginTypeGlobalConf(DescribeLoginTypeGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginTypeGlobalConf", DescribeLoginTypeGlobalConfResponse.class);
    }

    /**
     *获取扫码登录主机列表
     * @param req DescribeLoginTypeHostRequest
     * @return DescribeLoginTypeHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginTypeHostResponse DescribeLoginTypeHost(DescribeLoginTypeHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginTypeHost", DescribeLoginTypeHostResponse.class);
    }

    /**
     *获取异地登录白名单合并后列表
     * @param req DescribeLoginWhiteCombinedListRequest
     * @return DescribeLoginWhiteCombinedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteCombinedListResponse DescribeLoginWhiteCombinedList(DescribeLoginWhiteCombinedListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginWhiteCombinedList", DescribeLoginWhiteCombinedListResponse.class);
    }

    /**
     *查询合并后白名单机器列表
     * @param req DescribeLoginWhiteHostListRequest
     * @return DescribeLoginWhiteHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteHostListResponse DescribeLoginWhiteHostList(DescribeLoginWhiteHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginWhiteHostList", DescribeLoginWhiteHostListResponse.class);
    }

    /**
     *查询机器清理历史记录
     * @param req DescribeMachineClearHistoryRequest
     * @return DescribeMachineClearHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineClearHistoryResponse DescribeMachineClearHistory(DescribeMachineClearHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineClearHistory", DescribeMachineClearHistoryResponse.class);
    }

    /**
     *查询主机概览信息
     * @param req DescribeMachineGeneralRequest
     * @return DescribeMachineGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGeneralResponse DescribeMachineGeneral(DescribeMachineGeneralRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineGeneral", DescribeMachineGeneralResponse.class);
    }

    /**
     *获取主机登录方式
     * @param req DescribeMachineLoginTypeRequest
     * @return DescribeMachineLoginTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineLoginTypeResponse DescribeMachineLoginType(DescribeMachineLoginTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineLoginType", DescribeMachineLoginTypeResponse.class);
    }

    /**
     *查询文件查杀定时扫描配置
     * @param req DescribeMalwareTimingScanSettingRequest
     * @return DescribeMalwareTimingScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareTimingScanSettingResponse DescribeMalwareTimingScanSetting(DescribeMalwareTimingScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareTimingScanSetting", DescribeMalwareTimingScanSettingResponse.class);
    }

    /**
     *展示企业必修漏洞情报
     * @param req DescribeMandatoryVulSetRequest
     * @return DescribeMandatoryVulSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMandatoryVulSetResponse DescribeMandatoryVulSet(DescribeMandatoryVulSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMandatoryVulSet", DescribeMandatoryVulSetResponse.class);
    }

    /**
     *获取批量修改主机登录方式任务列表
     * @param req DescribeModifyMachinesLoginTypeTasksRequest
     * @return DescribeModifyMachinesLoginTypeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyMachinesLoginTypeTasksResponse DescribeModifyMachinesLoginTypeTasks(DescribeModifyMachinesLoginTypeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModifyMachinesLoginTypeTasks", DescribeModifyMachinesLoginTypeTasksResponse.class);
    }

    /**
     *获取多云（腾讯云、阿里云、AWS、华为云、Azure 等）接入的资产总数及各云厂商资产数量明细
     * @param req DescribeMultiCloudAssetCountRequest
     * @return DescribeMultiCloudAssetCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiCloudAssetCountResponse DescribeMultiCloudAssetCount(DescribeMultiCloudAssetCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiCloudAssetCount", DescribeMultiCloudAssetCountResponse.class);
    }

    /**
     *获取NFS扫描全局配置
     * @param req DescribeNFSScanConfRequest
     * @return DescribeNFSScanConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNFSScanConfResponse DescribeNFSScanConf(DescribeNFSScanConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNFSScanConf", DescribeNFSScanConfResponse.class);
    }

    /**
     *获取扫码登录主机列表
     * @param req DescribeNFSScanHostRequest
     * @return DescribeNFSScanHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNFSScanHostResponse DescribeNFSScanHost(DescribeNFSScanHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNFSScanHost", DescribeNFSScanHostResponse.class);
    }

    /**
     *获取网卡列表
     * @param req DescribeNICAssetsRequest
     * @return DescribeNICAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNICAssetsResponse DescribeNICAssets(DescribeNICAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNICAssets", DescribeNICAssetsResponse.class);
    }

    /**
     *查询腾讯云nat网关实例对应的NAT策略
     * @param req DescribeNatRulesRequest
     * @return DescribeNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatRulesResponse DescribeNatRules(DescribeNatRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatRules", DescribeNatRulesResponse.class);
    }

    /**
     *查询网络攻击检测开关及资产范围配置
     * @param req DescribeNetAttackSettingRequest
     * @return DescribeNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackSettingResponse DescribeNetAttackSetting(DescribeNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetAttackSetting", DescribeNetAttackSettingResponse.class);
    }

    /**
     *查询客户端离线时长
     * @param req DescribeNotifyAgentOfflineDurationRequest
     * @return DescribeNotifyAgentOfflineDurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifyAgentOfflineDurationResponse DescribeNotifyAgentOfflineDuration(DescribeNotifyAgentOfflineDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifyAgentOfflineDuration", DescribeNotifyAgentOfflineDurationResponse.class);
    }

    /**
     *获取通知资产范围配置
     * @param req DescribeNotifyAssetConfigRequest
     * @return DescribeNotifyAssetConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifyAssetConfigResponse DescribeNotifyAssetConfig(DescribeNotifyAssetConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifyAssetConfig", DescribeNotifyAssetConfigResponse.class);
    }

    /**
     *获取通知设置
     * @param req DescribeNotifySettingRequest
     * @return DescribeNotifySettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifySettingResponse DescribeNotifySetting(DescribeNotifySettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifySetting", DescribeNotifySettingResponse.class);
    }

    /**
     *获取告警中心通知高级配置
     * @param req DescribeNotifySettingAlertRequest
     * @return DescribeNotifySettingAlertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifySettingAlertResponse DescribeNotifySettingAlert(DescribeNotifySettingAlertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifySettingAlert", DescribeNotifySettingAlertResponse.class);
    }

    /**
     *查询集团账号详情
     * @param req DescribeOrganizationInfoRequest
     * @return DescribeOrganizationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationInfoResponse DescribeOrganizationInfo(DescribeOrganizationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationInfo", DescribeOrganizationInfoResponse.class);
    }

    /**
     *查询集团账号用户列表
     * @param req DescribeOrganizationUserInfoRequest
     * @return DescribeOrganizationUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationUserInfoResponse DescribeOrganizationUserInfo(DescribeOrganizationUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationUserInfo", DescribeOrganizationUserInfoResponse.class);
    }

    /**
     *资产列表
     * @param req DescribeOtherCloudAssetsRequest
     * @return DescribeOtherCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtherCloudAssetsResponse DescribeOtherCloudAssets(DescribeOtherCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtherCloudAssets", DescribeOtherCloudAssetsResponse.class);
    }

    /**
     *查询 Pod 关联容器列表
     * @param req DescribePodContainerListRequest
     * @return DescribePodContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodContainerListResponse DescribePodContainerList(DescribePodContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePodContainerList", DescribePodContainerListResponse.class);
    }

    /**
     *按日期查看策略命中详情
     * @param req DescribePolicyHitDataRequest
     * @return DescribePolicyHitDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyHitDataResponse DescribePolicyHitData(DescribePolicyHitDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyHitData", DescribePolicyHitDataResponse.class);
    }

    /**
     *端口探测列表
     * @param req DescribePortDetectListRequest
     * @return DescribePortDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortDetectListResponse DescribePortDetectList(DescribePortDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePortDetectList", DescribePortDetectListResponse.class);
    }

    /**
     *查询当前账号下端口扫描任务次数
     * @param req DescribePortScanTaskCountRequest
     * @return DescribePortScanTaskCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortScanTaskCountResponse DescribePortScanTaskCount(DescribePortScanTaskCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePortScanTaskCount", DescribePortScanTaskCountResponse.class);
    }

    /**
     *获取防卸载全局配置
     * @param req DescribePreventUninstallGlobalConfRequest
     * @return DescribePreventUninstallGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreventUninstallGlobalConfResponse DescribePreventUninstallGlobalConf(DescribePreventUninstallGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreventUninstallGlobalConf", DescribePreventUninstallGlobalConfResponse.class);
    }

    /**
     *获取防卸载主机列表
     * @param req DescribePreventUninstallHostRequest
     * @return DescribePreventUninstallHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreventUninstallHostResponse DescribePreventUninstallHost(DescribePreventUninstallHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreventUninstallHost", DescribePreventUninstallHostResponse.class);
    }

    /**
     *获取进程防护全局配置
     * @param req DescribeProcessDaemonGlobalConfRequest
     * @return DescribeProcessDaemonGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessDaemonGlobalConfResponse DescribeProcessDaemonGlobalConf(DescribeProcessDaemonGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessDaemonGlobalConf", DescribeProcessDaemonGlobalConfResponse.class);
    }

    /**
     *获取进程守护主机列表
     * @param req DescribeProcessDaemonHostRequest
     * @return DescribeProcessDaemonHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessDaemonHostResponse DescribeProcessDaemonHost(DescribeProcessDaemonHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessDaemonHost", DescribeProcessDaemonHostResponse.class);
    }

    /**
     *公网资产
     * @param req DescribePublicCloudAssetsRequest
     * @return DescribePublicCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicCloudAssetsResponse DescribePublicCloudAssets(DescribePublicCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicCloudAssets", DescribePublicCloudAssetsResponse.class);
    }

    /**
     *ip公网列表
     * @param req DescribePublicIpAssetsRequest
     * @return DescribePublicIpAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpAssetsResponse DescribePublicIpAssets(DescribePublicIpAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicIpAssets", DescribePublicIpAssetsResponse.class);
    }

    /**
     *查询应用防护授权列表
     * @param req DescribeRaspLicenseListRequest
     * @return DescribeRaspLicenseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRaspLicenseListResponse DescribeRaspLicenseList(DescribeRaspLicenseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRaspLicenseList", DescribeRaspLicenseListResponse.class);
    }

    /**
     *仓库镜像列表
     * @param req DescribeRepositoryImageAssetsRequest
     * @return DescribeRepositoryImageAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryImageAssetsResponse DescribeRepositoryImageAssets(DescribeRepositoryImageAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryImageAssets", DescribeRepositoryImageAssetsResponse.class);
    }

    /**
     *查询反弹Shell内网告警与资产范围配置
     * @param req DescribeReverseShellSystemPolicyConfigRequest
     * @return DescribeReverseShellSystemPolicyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellSystemPolicyConfigResponse DescribeReverseShellSystemPolicyConfig(DescribeReverseShellSystemPolicyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellSystemPolicyConfig", DescribeReverseShellSystemPolicyConfigResponse.class);
    }

    /**
     *查看风险关联的存储桶信息
     * @param req DescribeRiskBucketListRequest
     * @return DescribeRiskBucketListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskBucketListResponse DescribeRiskBucketList(DescribeRiskBucketListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskBucketList", DescribeRiskBucketListResponse.class);
    }

    /**
     *获取风险调用记录列表
     * @param req DescribeRiskCallRecordRequest
     * @return DescribeRiskCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCallRecordResponse DescribeRiskCallRecord(DescribeRiskCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCallRecord", DescribeRiskCallRecordResponse.class);
    }

    /**
     *获取资产视角的配置风险列表
     * @param req DescribeRiskCenterAssetViewCFGRiskListRequest
     * @return DescribeRiskCenterAssetViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewCFGRiskListResponse DescribeRiskCenterAssetViewCFGRiskList(DescribeRiskCenterAssetViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewCFGRiskList", DescribeRiskCenterAssetViewCFGRiskListResponse.class);
    }

    /**
     *获取资产视角的端口风险列表
     * @param req DescribeRiskCenterAssetViewPortRiskListRequest
     * @return DescribeRiskCenterAssetViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewPortRiskListResponse DescribeRiskCenterAssetViewPortRiskList(DescribeRiskCenterAssetViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewPortRiskList", DescribeRiskCenterAssetViewPortRiskListResponse.class);
    }

    /**
     *获取资产视角的漏洞风险列表
     * @param req DescribeRiskCenterAssetViewVULRiskListRequest
     * @return DescribeRiskCenterAssetViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewVULRiskListResponse DescribeRiskCenterAssetViewVULRiskList(DescribeRiskCenterAssetViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewVULRiskList", DescribeRiskCenterAssetViewVULRiskListResponse.class);
    }

    /**
     *获取资产视角的弱口令风险列表
     * @param req DescribeRiskCenterAssetViewWeakPasswordRiskListRequest
     * @return DescribeRiskCenterAssetViewWeakPasswordRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewWeakPasswordRiskListResponse DescribeRiskCenterAssetViewWeakPasswordRiskList(DescribeRiskCenterAssetViewWeakPasswordRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewWeakPasswordRiskList", DescribeRiskCenterAssetViewWeakPasswordRiskListResponse.class);
    }

    /**
     *获取配置视角的配置风险列表
     * @param req DescribeRiskCenterCFGViewCFGRiskListRequest
     * @return DescribeRiskCenterCFGViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterCFGViewCFGRiskListResponse DescribeRiskCenterCFGViewCFGRiskList(DescribeRiskCenterCFGViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterCFGViewCFGRiskList", DescribeRiskCenterCFGViewCFGRiskListResponse.class);
    }

    /**
     *获取端口视角的端口风险列表
     * @param req DescribeRiskCenterPortViewPortRiskListRequest
     * @return DescribeRiskCenterPortViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterPortViewPortRiskListResponse DescribeRiskCenterPortViewPortRiskList(DescribeRiskCenterPortViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterPortViewPortRiskList", DescribeRiskCenterPortViewPortRiskListResponse.class);
    }

    /**
     *获取风险趋势分析示例
     * @param req DescribeRiskCenterRiskTrendAnalysisRequest
     * @return DescribeRiskCenterRiskTrendAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterRiskTrendAnalysisResponse DescribeRiskCenterRiskTrendAnalysis(DescribeRiskCenterRiskTrendAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterRiskTrendAnalysis", DescribeRiskCenterRiskTrendAnalysisResponse.class);
    }

    /**
     *获取风险服务列表
     * @param req DescribeRiskCenterServerRiskListRequest
     * @return DescribeRiskCenterServerRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterServerRiskListResponse DescribeRiskCenterServerRiskList(DescribeRiskCenterServerRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterServerRiskList", DescribeRiskCenterServerRiskListResponse.class);
    }

    /**
     *获取漏洞视角的漏洞风险列表
     * @param req DescribeRiskCenterVULViewVULRiskListRequest
     * @return DescribeRiskCenterVULViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterVULViewVULRiskListResponse DescribeRiskCenterVULViewVULRiskList(DescribeRiskCenterVULViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterVULViewVULRiskList", DescribeRiskCenterVULViewVULRiskListResponse.class);
    }

    /**
     *获取内容风险列表
     * @param req DescribeRiskCenterWebsiteRiskListRequest
     * @return DescribeRiskCenterWebsiteRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterWebsiteRiskListResponse DescribeRiskCenterWebsiteRiskList(DescribeRiskCenterWebsiteRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterWebsiteRiskList", DescribeRiskCenterWebsiteRiskListResponse.class);
    }

    /**
     *风险详情列表示例
     * @param req DescribeRiskDetailListRequest
     * @return DescribeRiskDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDetailListResponse DescribeRiskDetailList(DescribeRiskDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDetailList", DescribeRiskDetailListResponse.class);
    }

    /**
     *获取风险项视角列表
     * @param req DescribeRiskItemListRequest
     * @return DescribeRiskItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskItemListResponse DescribeRiskItemList(DescribeRiskItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskItemList", DescribeRiskItemListResponse.class);
    }

    /**
     *查询风险规则详情示例
     * @param req DescribeRiskRuleDetailRequest
     * @return DescribeRiskRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskRuleDetailResponse DescribeRiskRuleDetail(DescribeRiskRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskRuleDetail", DescribeRiskRuleDetailResponse.class);
    }

    /**
     *高级配置风险规则列表示例
     * @param req DescribeRiskRulesRequest
     * @return DescribeRiskRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskRulesResponse DescribeRiskRules(DescribeRiskRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskRules", DescribeRiskRulesResponse.class);
    }

    /**
     *获取风险扫描周期计划
     * @param req DescribeRiskScanCronConfigRequest
     * @return DescribeRiskScanCronConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskScanCronConfigResponse DescribeRiskScanCronConfig(DescribeRiskScanCronConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskScanCronConfig", DescribeRiskScanCronConfigResponse.class);
    }

    /**
     *查看风险趋势图
     * @param req DescribeRiskTrendDataRequest
     * @return DescribeRiskTrendDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskTrendDataResponse DescribeRiskTrendData(DescribeRiskTrendDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskTrendData", DescribeRiskTrendDataResponse.class);
    }

    /**
     *查询指定 SCF 函数下的别名列表。
     * @param req DescribeSCFAliasListRequest
     * @return DescribeSCFAliasListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFAliasListResponse DescribeSCFAliasList(DescribeSCFAliasListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFAliasList", DescribeSCFAliasListResponse.class);
    }

    /**
     *查询指定命名空间下的 SCF 函数列表，仅返回 Event 触发器类型的函数。
     * @param req DescribeSCFFunctionListRequest
     * @return DescribeSCFFunctionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFFunctionListResponse DescribeSCFFunctionList(DescribeSCFFunctionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFFunctionList", DescribeSCFFunctionListResponse.class);
    }

    /**
     *查询指定 SCF 函数下的版本列表。
     * @param req DescribeSCFFunctionVersionListRequest
     * @return DescribeSCFFunctionVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFFunctionVersionListResponse DescribeSCFFunctionVersionList(DescribeSCFFunctionVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFFunctionVersionList", DescribeSCFFunctionVersionListResponse.class);
    }

    /**
     *查询当前用户在指定地域下的 SCF（云函数）命名空间列表。
     * @param req DescribeSCFNamespaceListRequest
     * @return DescribeSCFNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFNamespaceListResponse DescribeSCFNamespaceList(DescribeSCFNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFNamespaceList", DescribeSCFNamespaceListResponse.class);
    }

    /**
     *获取扫描报告列表
     * @param req DescribeScanReportListRequest
     * @return DescribeScanReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanReportListResponse DescribeScanReportList(DescribeScanReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanReportList", DescribeScanReportListResponse.class);
    }

    /**
     *查询云边界分析扫描结果统计信息
     * @param req DescribeScanStatisticRequest
     * @return DescribeScanStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStatisticResponse DescribeScanStatistic(DescribeScanStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanStatistic", DescribeScanStatisticResponse.class);
    }

    /**
     *获取扫描任务列表
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskList", DescribeScanTaskListResponse.class);
    }

    /**
     *查询扫描任务记录列表
     * @param req DescribeScanTaskRecordListRequest
     * @return DescribeScanTaskRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskRecordListResponse DescribeScanTaskRecordList(DescribeScanTaskRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskRecordList", DescribeScanTaskRecordListResponse.class);
    }

    /**
     *查询腾讯云SCF自定义域名端点列表
     * @param req DescribeScfCustomDomainEndpointsRequest
     * @return DescribeScfCustomDomainEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScfCustomDomainEndpointsResponse DescribeScfCustomDomainEndpoints(DescribeScfCustomDomainEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScfCustomDomainEndpoints", DescribeScfCustomDomainEndpointsResponse.class);
    }

    /**
     *立体防护中心查询漏洞信息
     * @param req DescribeSearchBugInfoRequest
     * @return DescribeSearchBugInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchBugInfoResponse DescribeSearchBugInfo(DescribeSearchBugInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchBugInfo", DescribeSearchBugInfoResponse.class);
    }

    /**
     *查询指定安全组ID对应安全组规则
     * @param req DescribeSecurityGroupPolicyRequest
     * @return DescribeSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPolicyResponse DescribeSecurityGroupPolicy(DescribeSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupPolicy", DescribeSecurityGroupPolicyResponse.class);
    }

    /**
     *获取安全风险趋势，返回按维度分组的每日风险数量
     * @param req DescribeSecurityRiskTrendRequest
     * @return DescribeSecurityRiskTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRiskTrendResponse DescribeSecurityRiskTrend(DescribeSecurityRiskTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityRiskTrend", DescribeSecurityRiskTrendResponse.class);
    }

    /**
     *获取安全评分概览，实时计算各维度和子项扣分情况
     * @param req DescribeSecurityScoreOverviewRequest
     * @return DescribeSecurityScoreOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityScoreOverviewResponse DescribeSecurityScoreOverview(DescribeSecurityScoreOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityScoreOverview", DescribeSecurityScoreOverviewResponse.class);
    }

    /**
     *获取当前账号的安全评分规则，无自定义则返回内置默认规则
     * @param req DescribeSecurityScoreRuleRequest
     * @return DescribeSecurityScoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityScoreRuleResponse DescribeSecurityScoreRule(DescribeSecurityScoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityScoreRule", DescribeSecurityScoreRuleResponse.class);
    }

    /**
     *查询 Skill 安全检测计费信息，包括订单状态、总配额、已消耗配额、到期时间、支付模式等。无订单时返回零值（仅含 TimeNow 和 BetaEndTime）。试用订单通过 ModifyTrialStatus(Module=9) 领取，正式订单通过计费系统创建。
     * @param req DescribeSkillScanPayInfoRequest
     * @return DescribeSkillScanPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillScanPayInfoResponse DescribeSkillScanPayInfo(DescribeSkillScanPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillScanPayInfo", DescribeSkillScanPayInfoResponse.class);
    }

    /**
     *查询 Skill 安全检测结果。调用 CreateSkillScan 成功后使用返回的 ContentHash + EngineVersion 轮询本接口获取结果。上传成功后建议5分钟后首次轮询，如未检测完成之后每隔1分钟轮询一次。响应通过 Status 字段区分四种状态：检测完成（SUCCESS）、检测中（SCANNING）、无记录（NOT_FOUND）、检测失败（FAILED）。注意：检测结果保留90天，超期后将返回 NOT_FOUND。
     * @param req DescribeSkillScanResultRequest
     * @return DescribeSkillScanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillScanResultResponse DescribeSkillScanResult(DescribeSkillScanResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillScanResult", DescribeSkillScanResultResponse.class);
    }

    /**
     *获取用户访问密钥资产列表（源IP视角）
     * @param req DescribeSourceIPAssetRequest
     * @return DescribeSourceIPAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIPAssetResponse DescribeSourceIPAsset(DescribeSourceIPAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceIPAsset", DescribeSourceIPAssetResponse.class);
    }

    /**
     *查询集团的子账号列表
     * @param req DescribeSubUserInfoRequest
     * @return DescribeSubUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubUserInfoResponse DescribeSubUserInfo(DescribeSubUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubUserInfo", DescribeSubUserInfoResponse.class);
    }

    /**
     *获取子网列表
     * @param req DescribeSubnetAssetsRequest
     * @return DescribeSubnetAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetAssetsResponse DescribeSubnetAssets(DescribeSubnetAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnetAssets", DescribeSubnetAssetsResponse.class);
    }

    /**
     *打标策略生效资产列表
     * @param req DescribeTagRuleAssetsRequest
     * @return DescribeTagRuleAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRuleAssetsResponse DescribeTagRuleAssets(DescribeTagRuleAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagRuleAssets", DescribeTagRuleAssetsResponse.class);
    }

    /**
     *获取任务扫描报告列表
     * @param req DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogListResponse DescribeTaskLogList(DescribeTaskLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogList", DescribeTaskLogListResponse.class);
    }

    /**
     *获取报告下载的临时链接
     * @param req DescribeTaskLogURLRequest
     * @return DescribeTaskLogURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogURLResponse DescribeTaskLogURL(DescribeTaskLogURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogURL", DescribeTaskLogURLResponse.class);
    }

    /**
     *获取扫描预消耗配额
     * @param req DescribeTaskPredictCostQuotaRequest
     * @return DescribeTaskPredictCostQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskPredictCostQuotaResponse DescribeTaskPredictCostQuota(DescribeTaskPredictCostQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskPredictCostQuota", DescribeTaskPredictCostQuotaResponse.class);
    }

    /**
     *查询TOP攻击信息
     * @param req DescribeTopAttackInfoRequest
     * @return DescribeTopAttackInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopAttackInfoResponse DescribeTopAttackInfo(DescribeTopAttackInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopAttackInfo", DescribeTopAttackInfoResponse.class);
    }

    /**
     *查询用户行为分析的行为概览
     * @param req DescribeUebaBehaviorSummaryRequest
     * @return DescribeUebaBehaviorSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaBehaviorSummaryResponse DescribeUebaBehaviorSummary(DescribeUebaBehaviorSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaBehaviorSummary", DescribeUebaBehaviorSummaryResponse.class);
    }

    /**
     *查询用户行为分析策略列表
     * @param req DescribeUebaRuleRequest
     * @return DescribeUebaRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaRuleResponse DescribeUebaRule(DescribeUebaRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaRule", DescribeUebaRuleResponse.class);
    }

    /**
     *获取用户行为分析模块的用户概览
     * @param req DescribeUebaUserSummaryRequest
     * @return DescribeUebaUserSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaUserSummaryResponse DescribeUebaUserSummary(DescribeUebaUserSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaUserSummary", DescribeUebaUserSummaryResponse.class);
    }

    /**
     *获取账号CSPM信息
     * @param req DescribeUserCSPMInfoListRequest
     * @return DescribeUserCSPMInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCSPMInfoListResponse DescribeUserCSPMInfoList(DescribeUserCSPMInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCSPMInfoList", DescribeUserCSPMInfoListResponse.class);
    }

    /**
     *获取账号调用记录列表
     * @param req DescribeUserCallRecordRequest
     * @return DescribeUserCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCallRecordResponse DescribeUserCallRecord(DescribeUserCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCallRecord", DescribeUserCallRecordResponse.class);
    }

    /**
     *获取账号dspm信息列表
     * @param req DescribeUserDspmInfoListRequest
     * @return DescribeUserDspmInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDspmInfoListResponse DescribeUserDspmInfoList(DescribeUserDspmInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDspmInfoList", DescribeUserDspmInfoListResponse.class);
    }

    /**
     *用户CSPM配额信息
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserInfo", DescribeUserInfoResponse.class);
    }

    /**
     *新安全中心风险中心-漏洞列表
     * @param req DescribeVULListRequest
     * @return DescribeVULListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULListResponse DescribeVULList(DescribeVULListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULList", DescribeVULListResponse.class);
    }

    /**
     *查询漏洞风险高级配置
     * @param req DescribeVULRiskAdvanceCFGListRequest
     * @return DescribeVULRiskAdvanceCFGListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskAdvanceCFGListResponse DescribeVULRiskAdvanceCFGList(DescribeVULRiskAdvanceCFGListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskAdvanceCFGList", DescribeVULRiskAdvanceCFGListResponse.class);
    }

    /**
     *获取漏洞展开详情
     * @param req DescribeVULRiskDetailRequest
     * @return DescribeVULRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskDetailResponse DescribeVULRiskDetail(DescribeVULRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskDetail", DescribeVULRiskDetailResponse.class);
    }

    /**
     *获取病毒库及POC的更新信息
     * @param req DescribeVdbAndPocInfoRequest
     * @return DescribeVdbAndPocInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVdbAndPocInfoResponse DescribeVdbAndPocInfo(DescribeVdbAndPocInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVdbAndPocInfo", DescribeVdbAndPocInfoResponse.class);
    }

    /**
     *获取vpc列表
     * @param req DescribeVpcAssetsRequest
     * @return DescribeVpcAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAssetsResponse DescribeVpcAssets(DescribeVpcAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcAssets", DescribeVpcAssetsResponse.class);
    }

    /**
     *获取漏洞组件关联主机
     * @param req DescribeVulComponentRelateHostRequest
     * @return DescribeVulComponentRelateHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulComponentRelateHostResponse DescribeVulComponentRelateHost(DescribeVulComponentRelateHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulComponentRelateHost", DescribeVulComponentRelateHostResponse.class);
    }

    /**
     *查询指定漏洞修复任务的详情信息，包含每台主机的修复状态、快照状态等明细数据，支持分页和筛选。
     * @param req DescribeVulFixTaskDetailRequest
     * @return DescribeVulFixTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixTaskDetailResponse DescribeVulFixTaskDetail(DescribeVulFixTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixTaskDetail", DescribeVulFixTaskDetailResponse.class);
    }

    /**
     *分页查询漏洞修复任务记录列表，支持按修复状态、时间范围等条件筛选，展示每个修复任务的概要信息。
     * @param req DescribeVulFixTaskListRequest
     * @return DescribeVulFixTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixTaskListResponse DescribeVulFixTaskList(DescribeVulFixTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixTaskList", DescribeVulFixTaskListResponse.class);
    }

    /**
     *查询指定漏洞可以被修复的主机列表。在用户提交修复任务前，需要先查询哪些主机支持自动修复，为用户选择修复目标提供数据支持。
     * @param req DescribeVulFixableMachineListRequest
     * @return DescribeVulFixableMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixableMachineListResponse DescribeVulFixableMachineList(DescribeVulFixableMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixableMachineList", DescribeVulFixableMachineListResponse.class);
    }

    /**
     *查询某个已修复漏洞在指定主机上的修复详情，包含漏洞基本信息、修复主机信息以及关联组件&路径的详细列表（组件名称、命中版本、关联路径、修复命令）。
     * @param req DescribeVulFixedHostDetailRequest
     * @return DescribeVulFixedHostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixedHostDetailResponse DescribeVulFixedHostDetail(DescribeVulFixedHostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixedHostDetail", DescribeVulFixedHostDetailResponse.class);
    }

    /**
     *查询已被修复的漏洞列表，展示修复成功的漏洞信息及修复情况统计，帮助用户了解修复成效。
     * @param req DescribeVulFixedListRequest
     * @return DescribeVulFixedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixedListResponse DescribeVulFixedList(DescribeVulFixedListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixedList", DescribeVulFixedListResponse.class);
    }

    /**
     *获取漏洞主机关联组件
     * @param req DescribeVulHostRelateComponentRequest
     * @return DescribeVulHostRelateComponentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostRelateComponentResponse DescribeVulHostRelateComponent(DescribeVulHostRelateComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulHostRelateComponent", DescribeVulHostRelateComponentResponse.class);
    }

    /**
     *获取漏洞忽略列表
     * @param req DescribeVulIgnoreRuleListRequest
     * @return DescribeVulIgnoreRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulIgnoreRuleListResponse DescribeVulIgnoreRuleList(DescribeVulIgnoreRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulIgnoreRuleList", DescribeVulIgnoreRuleListResponse.class);
    }

    /**
     *获取漏洞列表
     * @param req DescribeVulItemListRequest
     * @return DescribeVulItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulItemListResponse DescribeVulItemList(DescribeVulItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulItemList", DescribeVulItemListResponse.class);
    }

    /**
     *获取漏洞标签列表
     * @param req DescribeVulLabelListRequest
     * @return DescribeVulLabelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLabelListResponse DescribeVulLabelList(DescribeVulLabelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLabelList", DescribeVulLabelListResponse.class);
    }

    /**
     *查询云边界分析-暴露路径下主机节点的漏洞列表
     * @param req DescribeVulRiskListRequest
     * @return DescribeVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskListResponse DescribeVulRiskList(DescribeVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskList", DescribeVulRiskListResponse.class);
    }

    /**
     *获取漏洞关联组件
     * @param req DescribeVulRiskRelateComponentRequest
     * @return DescribeVulRiskRelateComponentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskRelateComponentResponse DescribeVulRiskRelateComponent(DescribeVulRiskRelateComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskRelateComponent", DescribeVulRiskRelateComponentResponse.class);
    }

    /**
     *获取漏洞或KB关联的主机
     * @param req DescribeVulRiskRelateHostRequest
     * @return DescribeVulRiskRelateHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskRelateHostResponse DescribeVulRiskRelateHost(DescribeVulRiskRelateHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskRelateHost", DescribeVulRiskRelateHostResponse.class);
    }

    /**
     *获取漏洞扫描（周期扫描）
     * @param req DescribeVulScanPeriodicRequest
     * @return DescribeVulScanPeriodicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanPeriodicResponse DescribeVulScanPeriodic(DescribeVulScanPeriodicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanPeriodic", DescribeVulScanPeriodicResponse.class);
    }

    /**
     *获取扫描漏洞任务详情
     * @param req DescribeVulScanTaskDetailRequest
     * @return DescribeVulScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanTaskDetailResponse DescribeVulScanTaskDetail(DescribeVulScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanTaskDetail", DescribeVulScanTaskDetailResponse.class);
    }

    /**
     *获取漏洞扫描任务记录
     * @param req DescribeVulScanTaskListRequest
     * @return DescribeVulScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanTaskListResponse DescribeVulScanTaskList(DescribeVulScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanTaskList", DescribeVulScanTaskListResponse.class);
    }

    /**
     *获取漏洞视角的漏洞风险列表
     * @param req DescribeVulViewVulRiskListRequest
     * @return DescribeVulViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulViewVulRiskListResponse DescribeVulViewVulRiskList(DescribeVulViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulViewVulRiskList", DescribeVulViewVulRiskListResponse.class);
    }

    /**
     *分页查询当前租户下的通知策略列表，对应「通知中心 - 机器人通知 - 通知策略配置」Tab 的表格。返回的字段为「行展示」所需的精简信息。完整配置在编辑场景下使用 DescribeWebhookPolicy。每租户最多 100 个通知策略
     * @param req DescribeWebhookPolicyListRequest
     * @return DescribeWebhookPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookPolicyListResponse DescribeWebhookPolicyList(DescribeWebhookPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebhookPolicyList", DescribeWebhookPolicyListResponse.class);
    }

    /**
     *分页查询当前租户下的接收机器人列表，对应「通知中心 - 机器人通知 - 接收机器人管理」Tab 的表格。每租户最多 50 个机器人
     * @param req DescribeWebhookReceiverListRequest
     * @return DescribeWebhookReceiverListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookReceiverListResponse DescribeWebhookReceiverList(DescribeWebhookReceiverListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebhookReceiverList", DescribeWebhookReceiverListResponse.class);
    }

    /**
     *停用AI 定时任务。

将指定的AI 定时任务状态设置为已停用，停用后任务将暂停自动执行。
     * @param req DisableAIScheduleRequest
     * @return DisableAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DisableAIScheduleResponse DisableAISchedule(DisableAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableAISchedule", DisableAIScheduleResponse.class);
    }

    /**
     *下载导出日志
     * @param req DownloadDspmExportLogRequest
     * @return DownloadDspmExportLogResponse
     * @throws TencentCloudSDKException
     */
    public DownloadDspmExportLogResponse DownloadDspmExportLog(DownloadDspmExportLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadDspmExportLog", DownloadDspmExportLogResponse.class);
    }

    /**
     *启用AI 定时任务。

将指定的AI 定时任务状态设置为已启用，启用后任务将按触发器配置自动执行。
     * @param req EnableAIScheduleRequest
     * @return EnableAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public EnableAIScheduleResponse EnableAISchedule(EnableAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableAISchedule", EnableAIScheduleResponse.class);
    }

    /**
     *导出CSIP扫描任务主机详情为Excel文件，异步生成后通过DescribeExportMachines查询下载地址
     * @param req ExportCSIPMalwareScanTaskDetailRequest
     * @return ExportCSIPMalwareScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportCSIPMalwareScanTaskDetailResponse ExportCSIPMalwareScanTaskDetail(ExportCSIPMalwareScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportCSIPMalwareScanTaskDetail", ExportCSIPMalwareScanTaskDetailResponse.class);
    }

    /**
     *客户端设置主机列表导出
     * @param req ExportClientSettingHostListRequest
     * @return ExportClientSettingHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportClientSettingHostListResponse ExportClientSettingHostList(ExportClientSettingHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportClientSettingHostList", ExportClientSettingHostListResponse.class);
    }

    /**
     *导出EDR策略列表
     * @param req ExportEDRRulesRequest
     * @return ExportEDRRulesResponse
     * @throws TencentCloudSDKException
     */
    public ExportEDRRulesResponse ExportEDRRules(ExportEDRRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportEDRRules", ExportEDRRulesResponse.class);
    }

    /**
     *用于异步导出数据量大的日志文件
     * @param req ExportTasksRequest
     * @return ExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public ExportTasksResponse ExportTasks(ExportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportTasks", ExportTasksResponse.class);
    }

    /**
     *安装集群容器安全Agent（平行容器方式安装 Agent）。

capi 层处理流程：
1. 按 ClusterCaMD5List 查询 DB 集群列表（仅用于解析每个集群归属的 appid，不做存在性/类型校验）
2. 按 appid 分组透传到接入侧 ClusterInstall RPC

说明（容器资产改版 2026 H1）：本接口为透传接口，capi 层不对 ClusterCaMD5 做存在性/类型/格式校验；DB 中未命中的 ClusterCaMD5 静默跳过、不报错。
     * @param req InstallClusterAgentRequest
     * @return InstallClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallClusterAgentResponse InstallClusterAgent(InstallClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallClusterAgent", InstallClusterAgentResponse.class);
    }

    /**
     *修改AI-Link智链引擎配置
     * @param req ModifyAILinkSettingRequest
     * @return ModifyAILinkSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAILinkSettingResponse ModifyAILinkSetting(ModifyAILinkSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAILinkSetting", ModifyAILinkSettingResponse.class);
    }

    /**
     *修改AI 定时任务。

支持部分更新，仅更新传入的可选字段。触发器列表通过 UpdateTriggers 标志控制是否全量替换。
     * @param req ModifyAIScheduleRequest
     * @return ModifyAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIScheduleResponse ModifyAISchedule(ModifyAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAISchedule", ModifyAIScheduleResponse.class);
    }

    /**
     *修改客户端日志采集配置（CSIP专属），支持设置日志采集类型和生效资产范围
     * @param req ModifyAgentConfigSettingRequest
     * @return ModifyAgentConfigSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentConfigSettingResponse ModifyAgentConfigSetting(ModifyAgentConfigSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentConfigSetting", ModifyAgentConfigSettingResponse.class);
    }

    /**
     *设置客户端运行模式以及配置
     * @param req ModifyAgentRunModeRequest
     * @return ModifyAgentRunModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentRunModeResponse ModifyAgentRunMode(ModifyAgentRunModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentRunMode", ModifyAgentRunModeResponse.class);
    }

    /**
     *修改客户端运行策略（策略组），支持设置自定义策略及关联机器列表
     * @param req ModifyAgentRunPolicyRequest
     * @return ModifyAgentRunPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentRunPolicyResponse ModifyAgentRunPolicy(ModifyAgentRunPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentRunPolicy", ModifyAgentRunPolicyResponse.class);
    }

    /**
     *修改或者更改处置状态
     * @param req ModifyAlarmRiskStatusRequest
     * @return ModifyAlarmRiskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmRiskStatusResponse ModifyAlarmRiskStatus(ModifyAlarmRiskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmRiskStatus", ModifyAlarmRiskStatusResponse.class);
    }

    /**
     *标记资产是否核心
     * @param req ModifyAssetCoreAttributeRequest
     * @return ModifyAssetCoreAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetCoreAttributeResponse ModifyAssetCoreAttribute(ModifyAssetCoreAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetCoreAttribute", ModifyAssetCoreAttributeResponse.class);
    }

    /**
     *更新资产搜索视图
     * @param req ModifyAssetFilterViewRequest
     * @return ModifyAssetFilterViewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetFilterViewResponse ModifyAssetFilterView(ModifyAssetFilterViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetFilterView", ModifyAssetFilterViewResponse.class);
    }

    /**
     *编辑资产标签
     * @param req ModifyAssetTagRequest
     * @return ModifyAssetTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetTagResponse ModifyAssetTag(ModifyAssetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetTag", ModifyAssetTagResponse.class);
    }

    /**
     *操作资产编辑标签
     * @param req ModifyAssetTagsRequest
     * @return ModifyAssetTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetTagsResponse ModifyAssetTags(ModifyAssetTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetTags", ModifyAssetTagsResponse.class);
    }

    /**
     *操作资产编辑标签
     * @param req ModifyAssetTagsByAssetInfoRequest
     * @return ModifyAssetTagsByAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetTagsByAssetInfoResponse ModifyAssetTagsByAssetInfo(ModifyAssetTagsByAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetTagsByAssetInfo", ModifyAssetTagsByAssetInfoResponse.class);
    }

    /**
     *修改爆破阻断模式
     * @param req ModifyBanModeRequest
     * @return ModifyBanModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanModeResponse ModifyBanMode(ModifyBanModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBanMode", ModifyBanModeResponse.class);
    }

    /**
     *新建或编辑一条基线策略。Policy.ID 为 0 视为新建，非 0 视为编辑；新建/编辑时 Name 必填，CheckAssetType 与 Type 需符合 CheckAssetType / PolicyType 枚举。
     * @param req ModifyBaselinePolicyRequest
     * @return ModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyResponse ModifyBaselinePolicy(ModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicy", ModifyBaselinePolicyResponse.class);
    }

    /**
     *批量启用或停用基线策略。停用后的策略将不再参与扫描与统计。
     * @param req ModifyBaselinePolicyEnableRequest
     * @return ModifyBaselinePolicyEnableResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyEnableResponse ModifyBaselinePolicyEnable(ModifyBaselinePolicyEnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicyEnable", ModifyBaselinePolicyEnableResponse.class);
    }

    /**
     *更新当前账号（管理员）的基线同步配置。AutoSync=true 时 TargetAppidList 不可为空，且元素不可为 0。
     * @param req ModifyBaselineSyncConfRequest
     * @return ModifyBaselineSyncConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineSyncConfResponse ModifyBaselineSyncConf(ModifyBaselineSyncConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineSyncConf", ModifyBaselineSyncConfResponse.class);
    }

    /**
     *更新当前账号的用户级基线配置（允许同步、离线清风险、Agent 扫描超时等）。
     * @param req ModifyBaselineUserOtherConfRequest
     * @return ModifyBaselineUserOtherConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineUserOtherConfResponse ModifyBaselineUserOtherConf(ModifyBaselineUserOtherConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineUserOtherConf", ModifyBaselineUserOtherConfResponse.class);
    }

    /**
     *更新当前账号的“用户弱口令”自定义字典。字典原文经服务端加密后存储；传空字符串视为清空。
     * @param req ModifyBaselineUserWeakPasswordConfRequest
     * @return ModifyBaselineUserWeakPasswordConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineUserWeakPasswordConfResponse ModifyBaselineUserWeakPasswordConf(ModifyBaselineUserWeakPasswordConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineUserWeakPasswordConf", ModifyBaselineUserWeakPasswordConfResponse.class);
    }

    /**
     *设置暴力破解阻断开关状态
     * @param req ModifyBruteAttackBanStatusRequest
     * @return ModifyBruteAttackBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBruteAttackBanStatusResponse ModifyBruteAttackBanStatus(ModifyBruteAttackBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBruteAttackBanStatus", ModifyBruteAttackBanStatusResponse.class);
    }

    /**
     *修改暴力破解规则
     * @param req ModifyBruteAttackRulesRequest
     * @return ModifyBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBruteAttackRulesResponse ModifyBruteAttackRules(ModifyBruteAttackRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBruteAttackRules", ModifyBruteAttackRulesResponse.class);
    }

    /**
     *绑定主机授权或RASP授权到指定订单。异步执行，返回TaskId供查询进度。通过LicenseType指定授权版本（旗舰版/专业版/RASP）。
     * @param req ModifyCSIPLicenseBindsRequest
     * @return ModifyCSIPLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPLicenseBindsResponse ModifyCSIPLicenseBinds(ModifyCSIPLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPLicenseBinds", ModifyCSIPLicenseBindsResponse.class);
    }

    /**
     *手动解绑主机授权。同步执行，直接返回结果。仅解绑主机授权（category=0，含专业版/旗舰版）。单订单模式下appid即可定位订单，无需传ResourceId。RASP解绑请用ModifyCSIPRaspLicenseUnBinds。
     * @param req ModifyCSIPLicenseUnBindsRequest
     * @return ModifyCSIPLicenseUnBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPLicenseUnBindsResponse ModifyCSIPLicenseUnBinds(ModifyCSIPLicenseUnBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPLicenseUnBinds", ModifyCSIPLicenseUnBindsResponse.class);
    }

    /**
     *绑定 RASP / 旗舰版授权到指定订单。异步执行，返回TaskId供查询进度。LicenseType=rasp 绑 RASP，LicenseType=enterprise_hp 绑旗舰版主机授权；AssetType 区分主机/容器节点/EKS。
     * @param req ModifyCSIPRaspLicenseBindsRequest
     * @return ModifyCSIPRaspLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPRaspLicenseBindsResponse ModifyCSIPRaspLicenseBinds(ModifyCSIPRaspLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPRaspLicenseBinds", ModifyCSIPRaspLicenseBindsResponse.class);
    }

    /**
     *手动解绑RASP授权。同步执行，直接返回结果。仅解绑RASP授权（category=1），无解绑次数限制。单订单模式下appid即可定位订单，无需传ResourceId。
     * @param req ModifyCSIPRaspLicenseUnBindsRequest
     * @return ModifyCSIPRaspLicenseUnBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPRaspLicenseUnBindsResponse ModifyCSIPRaspLicenseUnBinds(ModifyCSIPRaspLicenseUnBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPRaspLicenseUnBinds", ModifyCSIPRaspLicenseUnBindsResponse.class);
    }

    /**
     *修改存储桶监测状态
     * @param req ModifyCosAuditBucketMonitorStatusRequest
     * @return ModifyCosAuditBucketMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosAuditBucketMonitorStatusResponse ModifyCosAuditBucketMonitorStatus(ModifyCosAuditBucketMonitorStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosAuditBucketMonitorStatus", ModifyCosAuditBucketMonitorStatusResponse.class);
    }

    /**
     *修改cos审计监测账号
     * @param req ModifyCosAuditMonitorAccountRequest
     * @return ModifyCosAuditMonitorAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosAuditMonitorAccountResponse ModifyCosAuditMonitorAccount(ModifyCosAuditMonitorAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosAuditMonitorAccount", ModifyCosAuditMonitorAccountResponse.class);
    }

    /**
     *修改对象存储识别开关
     * @param req ModifyCosAuditObjectIdentifyStatusRequest
     * @return ModifyCosAuditObjectIdentifyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosAuditObjectIdentifyStatusResponse ModifyCosAuditObjectIdentifyStatus(ModifyCosAuditObjectIdentifyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosAuditObjectIdentifyStatus", ModifyCosAuditObjectIdentifyStatusResponse.class);
    }

    /**
     *设置对象存储扫描采样率
     * @param req ModifyCosAuditObjectSampleRateRequest
     * @return ModifyCosAuditObjectSampleRateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosAuditObjectSampleRateResponse ModifyCosAuditObjectSampleRate(ModifyCosAuditObjectSampleRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosAuditObjectSampleRate", ModifyCosAuditObjectSampleRateResponse.class);
    }

    /**
     *修改对象存储备注
     * @param req ModifyCosMarkInfoRequest
     * @return ModifyCosMarkInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosMarkInfoResponse ModifyCosMarkInfo(ModifyCosMarkInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosMarkInfo", ModifyCosMarkInfoResponse.class);
    }

    /**
     *更新CSPM自动配额管理者共享开关
     * @param req ModifyCspmShardConfigRequest
     * @return ModifyCspmShardConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCspmShardConfigResponse ModifyCspmShardConfig(ModifyCspmShardConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCspmShardConfig", ModifyCspmShardConfigResponse.class);
    }

    /**
     *修改Dspm访问管理信息
     * @param req ModifyDspmAccessRecordRequest
     * @return ModifyDspmAccessRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAccessRecordResponse ModifyDspmAccessRecord(ModifyDspmAccessRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAccessRecord", ModifyDspmAccessRecordResponse.class);
    }

    /**
     *修改dspm当前应用的数据识别模板
     * @param req ModifyDspmApplyingIdentifyComplianceGroupRequest
     * @return ModifyDspmApplyingIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmApplyingIdentifyComplianceGroupResponse ModifyDspmApplyingIdentifyComplianceGroup(ModifyDspmApplyingIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmApplyingIdentifyComplianceGroup", ModifyDspmApplyingIdentifyComplianceGroupResponse.class);
    }

    /**
     *修改Dspm审批单状态
     * @param req ModifyDspmApproveStatusRequest
     * @return ModifyDspmApproveStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmApproveStatusResponse ModifyDspmApproveStatus(ModifyDspmApproveStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmApproveStatus", ModifyDspmApproveStatusResponse.class);
    }

    /**
     *修改Dspm资产账号信息
     * @param req ModifyDspmAssetAccountRequest
     * @return ModifyDspmAssetAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetAccountResponse ModifyDspmAssetAccount(ModifyDspmAssetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetAccount", ModifyDspmAssetAccountResponse.class);
    }

    /**
     *修改Dspm资产账号权限
     * @param req ModifyDspmAssetAccountPrivilegesRequest
     * @return ModifyDspmAssetAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetAccountPrivilegesResponse ModifyDspmAssetAccountPrivileges(ModifyDspmAssetAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetAccountPrivileges", ModifyDspmAssetAccountPrivilegesResponse.class);
    }

    /**
     *修改Dspm资产数据扫描任务
     * @param req ModifyDspmAssetDataScanTaskRequest
     * @return ModifyDspmAssetDataScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetDataScanTaskResponse ModifyDspmAssetDataScanTask(ModifyDspmAssetDataScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetDataScanTask", ModifyDspmAssetDataScanTaskResponse.class);
    }

    /**
     *修改Dspm资产数据扫描任务状态
     * @param req ModifyDspmAssetDataScanTaskStatusRequest
     * @return ModifyDspmAssetDataScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetDataScanTaskStatusResponse ModifyDspmAssetDataScanTaskStatus(ModifyDspmAssetDataScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetDataScanTaskStatus", ModifyDspmAssetDataScanTaskStatusResponse.class);
    }

    /**
     *修改Dspm资产日志投递开关
     * @param req ModifyDspmAssetLogDeliverySwitchRequest
     * @return ModifyDspmAssetLogDeliverySwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetLogDeliverySwitchResponse ModifyDspmAssetLogDeliverySwitch(ModifyDspmAssetLogDeliverySwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetLogDeliverySwitch", ModifyDspmAssetLogDeliverySwitchResponse.class);
    }

    /**
     *修改Dspm资产日志投递开关
     * @param req ModifyDspmAssetSecurityAnalysisSwitchRequest
     * @return ModifyDspmAssetSecurityAnalysisSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetSecurityAnalysisSwitchResponse ModifyDspmAssetSecurityAnalysisSwitch(ModifyDspmAssetSecurityAnalysisSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetSecurityAnalysisSwitch", ModifyDspmAssetSecurityAnalysisSwitchResponse.class);
    }

    /**
     *修改日志备份设置
     * @param req ModifyDspmBackupSettingRequest
     * @return ModifyDspmBackupSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmBackupSettingResponse ModifyDspmBackupSetting(ModifyDspmBackupSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmBackupSetting", ModifyDspmBackupSettingResponse.class);
    }

    /**
     *修改dspm数据识别分类
     * @param req ModifyDspmIdentifyCategoryRequest
     * @return ModifyDspmIdentifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyCategoryResponse ModifyDspmIdentifyCategory(ModifyDspmIdentifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyCategory", ModifyDspmIdentifyCategoryResponse.class);
    }

    /**
     *修改dspm数据识别模板
     * @param req ModifyDspmIdentifyComplianceGroupRequest
     * @return ModifyDspmIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyComplianceGroupResponse ModifyDspmIdentifyComplianceGroup(ModifyDspmIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyComplianceGroup", ModifyDspmIdentifyComplianceGroupResponse.class);
    }

    /**
     *修改dspm数据识别模板状态
     * @param req ModifyDspmIdentifyComplianceGroupStatusRequest
     * @return ModifyDspmIdentifyComplianceGroupStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyComplianceGroupStatusResponse ModifyDspmIdentifyComplianceGroupStatus(ModifyDspmIdentifyComplianceGroupStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyComplianceGroupStatus", ModifyDspmIdentifyComplianceGroupStatusResponse.class);
    }

    /**
     *修改dspm数据识别模板数据项关联级别信息
     * @param req ModifyDspmIdentifyComplianceRuleLevelInfoRequest
     * @return ModifyDspmIdentifyComplianceRuleLevelInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyComplianceRuleLevelInfoResponse ModifyDspmIdentifyComplianceRuleLevelInfo(ModifyDspmIdentifyComplianceRuleLevelInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyComplianceRuleLevelInfo", ModifyDspmIdentifyComplianceRuleLevelInfoResponse.class);
    }

    /**
     *修改Dspm身份信息
     * @param req ModifyDspmIdentifyInfoRequest
     * @return ModifyDspmIdentifyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyInfoResponse ModifyDspmIdentifyInfo(ModifyDspmIdentifyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyInfo", ModifyDspmIdentifyInfoResponse.class);
    }

    /**
     *修改dspm数据识别分级组
     * @param req ModifyDspmIdentifyLevelGroupRequest
     * @return ModifyDspmIdentifyLevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyLevelGroupResponse ModifyDspmIdentifyLevelGroup(ModifyDspmIdentifyLevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyLevelGroup", ModifyDspmIdentifyLevelGroupResponse.class);
    }

    /**
     *修改dspm数据识别分级信息
     * @param req ModifyDspmIdentifyLevelItemRequest
     * @return ModifyDspmIdentifyLevelItemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyLevelItemResponse ModifyDspmIdentifyLevelItem(ModifyDspmIdentifyLevelItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyLevelItem", ModifyDspmIdentifyLevelItemResponse.class);
    }

    /**
     *修改dspm数据识别数据项
     * @param req ModifyDspmIdentifyRuleRequest
     * @return ModifyDspmIdentifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyRuleResponse ModifyDspmIdentifyRule(ModifyDspmIdentifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyRule", ModifyDspmIdentifyRuleResponse.class);
    }

    /**
     *修改dspm数据识别数据项状态
     * @param req ModifyDspmIdentifyRuleStatusRequest
     * @return ModifyDspmIdentifyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyRuleStatusResponse ModifyDspmIdentifyRuleStatus(ModifyDspmIdentifyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyRuleStatus", ModifyDspmIdentifyRuleStatusResponse.class);
    }

    /**
     *修改DspmIp信息
     * @param req ModifyDspmIpInfoRequest
     * @return ModifyDspmIpInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIpInfoResponse ModifyDspmIpInfo(ModifyDspmIpInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIpInfo", ModifyDspmIpInfoResponse.class);
    }

    /**
     *修改Dspm个人身份id
     * @param req ModifyDspmPersonalIdentifyRequest
     * @return ModifyDspmPersonalIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmPersonalIdentifyResponse ModifyDspmPersonalIdentify(ModifyDspmPersonalIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmPersonalIdentify", ModifyDspmPersonalIdentifyResponse.class);
    }

    /**
     *恢复备份日志
     * @param req ModifyDspmRestoreLogTaskRequest
     * @return ModifyDspmRestoreLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmRestoreLogTaskResponse ModifyDspmRestoreLogTask(ModifyDspmRestoreLogTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmRestoreLogTask", ModifyDspmRestoreLogTaskResponse.class);
    }

    /**
     *修改Dspm风险信息
     * @param req ModifyDspmRiskInfoRequest
     * @return ModifyDspmRiskInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmRiskInfoResponse ModifyDspmRiskInfo(ModifyDspmRiskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmRiskInfo", ModifyDspmRiskInfoResponse.class);
    }

    /**
     *修改Dspm风险策略
     * @param req ModifyDspmRiskStrategyRequest
     * @return ModifyDspmRiskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmRiskStrategyResponse ModifyDspmRiskStrategy(ModifyDspmRiskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmRiskStrategy", ModifyDspmRiskStrategyResponse.class);
    }

    /**
     *修改Dspm白名单策略
     * @param req ModifyDspmWhitelistStrategyRequest
     * @return ModifyDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmWhitelistStrategyResponse ModifyDspmWhitelistStrategy(ModifyDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmWhitelistStrategy", ModifyDspmWhitelistStrategyResponse.class);
    }

    /**
     *编辑或者创建EDR策略
     * @param req ModifyEDRRuleRequest
     * @return ModifyEDRRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEDRRuleResponse ModifyEDRRule(ModifyEDRRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEDRRule", ModifyEDRRuleResponse.class);
    }

    /**
     *修改EDR策略开关状态
     * @param req ModifyEDRRuleStatusRequest
     * @return ModifyEDRRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEDRRuleStatusResponse ModifyEDRRuleStatus(ModifyEDRRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEDRRuleStatus", ModifyEDRRuleStatusResponse.class);
    }

    /**
     *批量修改EDR策略动作
     * @param req ModifyEDRRulesActionRequest
     * @return ModifyEDRRulesActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEDRRulesActionResponse ModifyEDRRulesAction(ModifyEDRRulesActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEDRRulesAction", ModifyEDRRulesActionResponse.class);
    }

    /**
     *EDR告警隔离和恢复
     * @param req ModifyEdrAlertIsolationRequest
     * @return ModifyEdrAlertIsolationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrAlertIsolationResponse ModifyEdrAlertIsolation(ModifyEdrAlertIsolationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrAlertIsolation", ModifyEdrAlertIsolationResponse.class);
    }

    /**
     *永久忽略EDR多行为告警，将告警对应的主机+规则加入AI-Link永久忽略白名单，后续同类告警将自动丢弃
     * @param req ModifyEdrAlertPermanentIgnoreRequest
     * @return ModifyEdrAlertPermanentIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrAlertPermanentIgnoreResponse ModifyEdrAlertPermanentIgnore(ModifyEdrAlertPermanentIgnoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrAlertPermanentIgnore", ModifyEdrAlertPermanentIgnoreResponse.class);
    }

    /**
     *EDR告警状态处置
     * @param req ModifyEdrAlertStatusRequest
     * @return ModifyEdrAlertStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrAlertStatusResponse ModifyEdrAlertStatus(ModifyEdrAlertStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrAlertStatus", ModifyEdrAlertStatusResponse.class);
    }

    /**
     *修改日志采集例外网段配置，支持IP/IP段/CIDR格式，最多可添加100条
     * @param req ModifyEdrExcludeNetworkSegmentsRequest
     * @return ModifyEdrExcludeNetworkSegmentsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrExcludeNetworkSegmentsResponse ModifyEdrExcludeNetworkSegments(ModifyEdrExcludeNetworkSegmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrExcludeNetworkSegments", ModifyEdrExcludeNetworkSegmentsResponse.class);
    }

    /**
     *修改应用日志采集路径配置
     * @param req ModifyEdrLogCollectPathRequest
     * @return ModifyEdrLogCollectPathResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrLogCollectPathResponse ModifyEdrLogCollectPath(ModifyEdrLogCollectPathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrLogCollectPath", ModifyEdrLogCollectPathResponse.class);
    }

    /**
     *云边界自动打标-更新规则
     * @param req ModifyExposureAutoTagRuleRequest
     * @return ModifyExposureAutoTagRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExposureAutoTagRuleResponse ModifyExposureAutoTagRule(ModifyExposureAutoTagRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExposureAutoTagRule", ModifyExposureAutoTagRuleResponse.class);
    }

    /**
     *云边界自动打标-启停规则
     * @param req ModifyExposureAutoTagRuleStatusRequest
     * @return ModifyExposureAutoTagRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExposureAutoTagRuleStatusResponse ModifyExposureAutoTagRuleStatus(ModifyExposureAutoTagRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExposureAutoTagRuleStatus", ModifyExposureAutoTagRuleStatusResponse.class);
    }

    /**
     *更新云边界自定义标签
     * @param req ModifyExposureTagRequest
     * @return ModifyExposureTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExposureTagResponse ModifyExposureTag(ModifyExposureTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExposureTag", ModifyExposureTagResponse.class);
    }

    /**
     *修改IaC检测接入Token存储周期
     * @param req ModifyIaCTokenPeriodRequest
     * @return ModifyIaCTokenPeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIaCTokenPeriodResponse ModifyIaCTokenPeriod(ModifyIaCTokenPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIaCTokenPeriod", ModifyIaCTokenPeriodResponse.class);
    }

    /**
     *更新合并后登录审计白名单信息（服务器列表数目应小于1000）
     * @param req ModifyLoginWhiteRecordRequest
     * @return ModifyLoginWhiteRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteRecordResponse ModifyLoginWhiteRecord(ModifyLoginWhiteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoginWhiteRecord", ModifyLoginWhiteRecordResponse.class);
    }

    /**
     *修改机器清理配置
     * @param req ModifyMachineAutoClearConfigRequest
     * @return ModifyMachineAutoClearConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineAutoClearConfigResponse ModifyMachineAutoClearConfig(ModifyMachineAutoClearConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineAutoClearConfig", ModifyMachineAutoClearConfigResponse.class);
    }

    /**
     *修改主机资产备注信息
     * @param req ModifyMachineRemarkRequest
     * @return ModifyMachineRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineRemarkResponse ModifyMachineRemark(ModifyMachineRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineRemark", ModifyMachineRemarkResponse.class);
    }

    /**
     *批量修改主机登录方式
     * @param req ModifyMachinesLoginTypeRequest
     * @return ModifyMachinesLoginTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachinesLoginTypeResponse ModifyMachinesLoginType(ModifyMachinesLoginTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachinesLoginType", ModifyMachinesLoginTypeResponse.class);
    }

    /**
     *修改文件查杀定时扫描配置，包含扫描周期、检测模式、资产范围、引擎选择、隔离配置等
     * @param req ModifyMalwareTimingScanSettingsRequest
     * @return ModifyMalwareTimingScanSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareTimingScanSettingsResponse ModifyMalwareTimingScanSettings(ModifyMalwareTimingScanSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMalwareTimingScanSettings", ModifyMalwareTimingScanSettingsResponse.class);
    }

    /**
     *新增或更新NFS扫描全局配置
     * @param req ModifyNFSScanConfRequest
     * @return ModifyNFSScanConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNFSScanConfResponse ModifyNFSScanConf(ModifyNFSScanConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNFSScanConf", ModifyNFSScanConfResponse.class);
    }

    /**
     *关闭进程守护功能
     * @param req ModifyNFSScanHostRequest
     * @return ModifyNFSScanHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNFSScanHostResponse ModifyNFSScanHost(ModifyNFSScanHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNFSScanHost", ModifyNFSScanHostResponse.class);
    }

    /**
     *修改网络攻击检测开关及资产范围配置
     * @param req ModifyNetAttackSettingRequest
     * @return ModifyNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackSettingResponse ModifyNetAttackSetting(ModifyNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetAttackSetting", ModifyNetAttackSettingResponse.class);
    }

    /**
     *修改客户端离线时长
     * @param req ModifyNotifyAgentOfflineDurationRequest
     * @return ModifyNotifyAgentOfflineDurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifyAgentOfflineDurationResponse ModifyNotifyAgentOfflineDuration(ModifyNotifyAgentOfflineDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifyAgentOfflineDuration", ModifyNotifyAgentOfflineDurationResponse.class);
    }

    /**
     *修改通知资产范围配置
     * @param req ModifyNotifyAssetConfigRequest
     * @return ModifyNotifyAssetConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifyAssetConfigResponse ModifyNotifyAssetConfig(ModifyNotifyAssetConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifyAssetConfig", ModifyNotifyAssetConfigResponse.class);
    }

    /**
     *修改通知设置
     * @param req ModifyNotifySettingRequest
     * @return ModifyNotifySettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifySettingResponse ModifyNotifySetting(ModifyNotifySettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifySetting", ModifyNotifySettingResponse.class);
    }

    /**
     *修改告警中心通知高级配置
     * @param req ModifyNotifySettingAlertRequest
     * @return ModifyNotifySettingAlertResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifySettingAlertResponse ModifyNotifySettingAlert(ModifyNotifySettingAlertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifySettingAlert", ModifyNotifySettingAlertResponse.class);
    }

    /**
     *修改集团账号状态
     * @param req ModifyOrganizationAccountStatusRequest
     * @return ModifyOrganizationAccountStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrganizationAccountStatusResponse ModifyOrganizationAccountStatus(ModifyOrganizationAccountStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrganizationAccountStatus", ModifyOrganizationAccountStatusResponse.class);
    }

    /**
     *修改自动扩容配置（多模块可扩展，本期仅主机安全模块）。

「自动扩容」为面向用户的对外概念，等价于底层自动加购(auto_repurchase)：当账号有新增资产时，自动加购所需授权。

补充说明：
1. 本期仅实现主机安全模块 HostConfig；后续可扩展容器安全、AI-Agent 安全等命名模块字段，各模块配置字段可异构；
2. 部分更新语义：模块对象为空表示该模块不修改，模块内字段为空表示该字段不修改；
3. HostConfig.Switch 联动映射 auto_repurchase_switch；auto_bind_switch（自动绑定）恒开，不由本接口改动；
4. 自动续费(renew_flag) 不由本接口改动；额度/用量请调用 DescribeLicenseStatus；
5. 顶部「自动扩容」总开关状态由前端按各模块开关聚合，后端不存储、不返回全局开关。
     * @param req ModifyPayConfigRequest
     * @return ModifyPayConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPayConfigResponse ModifyPayConfig(ModifyPayConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPayConfig", ModifyPayConfigResponse.class);
    }

    /**
     *修改策略状态
     * @param req ModifyPolicyStatusRequest
     * @return ModifyPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyStatusResponse ModifyPolicyStatus(ModifyPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPolicyStatus", ModifyPolicyStatusResponse.class);
    }

    /**
     *重保防护包防护设置
     * @param req ModifyProtectionSettingRequest
     * @return ModifyProtectionSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionSettingResponse ModifyProtectionSetting(ModifyProtectionSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectionSetting", ModifyProtectionSettingResponse.class);
    }

    /**
     *重保防护授权包绑定
     * @param req ModifyRaspLicenseBindsRequest
     * @return ModifyRaspLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRaspLicenseBindsResponse ModifyRaspLicenseBinds(ModifyRaspLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRaspLicenseBinds", ModifyRaspLicenseBindsResponse.class);
    }

    /**
     *修改反弹Shell内网告警与资产范围配置
     * @param req ModifyReverseShellSystemPolicyConfigRequest
     * @return ModifyReverseShellSystemPolicyConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReverseShellSystemPolicyConfigResponse ModifyReverseShellSystemPolicyConfig(ModifyReverseShellSystemPolicyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReverseShellSystemPolicyConfig", ModifyReverseShellSystemPolicyConfigResponse.class);
    }

    /**
     *修改风险中心风险状态
     * @param req ModifyRiskCenterRiskStatusRequest
     * @return ModifyRiskCenterRiskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterRiskStatusResponse ModifyRiskCenterRiskStatus(ModifyRiskCenterRiskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterRiskStatus", ModifyRiskCenterRiskStatusResponse.class);
    }

    /**
     *修改风险中心扫描任务
     * @param req ModifyRiskCenterScanTaskRequest
     * @return ModifyRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterScanTaskResponse ModifyRiskCenterScanTask(ModifyRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterScanTask", ModifyRiskCenterScanTaskResponse.class);
    }

    /**
     *更新周期扫描计划
     * @param req ModifyRiskScanCronConfigRequest
     * @return ModifyRiskScanCronConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskScanCronConfigResponse ModifyRiskScanCronConfig(ModifyRiskScanCronConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskScanCronConfig", ModifyRiskScanCronConfigResponse.class);
    }

    /**
     *修改安全评分规则，必须传入完整规则集
     * @param req ModifySecurityScoreRuleRequest
     * @return ModifySecurityScoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityScoreRuleResponse ModifySecurityScoreRule(ModifySecurityScoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityScoreRule", ModifySecurityScoreRuleResponse.class);
    }

    /**
     *编辑CSPM共享账号
     * @param req ModifyShareUserCSPMRequest
     * @return ModifyShareUserCSPMResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShareUserCSPMResponse ModifyShareUserCSPM(ModifyShareUserCSPMRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyShareUserCSPM", ModifyShareUserCSPMResponse.class);
    }

    /**
     *更新自定义策略的开关
     * @param req ModifyUebaRuleSwitchRequest
     * @return ModifyUebaRuleSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUebaRuleSwitchResponse ModifyUebaRuleSwitch(ModifyUebaRuleSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUebaRuleSwitch", ModifyUebaRuleSwitchResponse.class);
    }

    /**
     *修改漏洞扫描（周期扫描）
     * @param req ModifyVulScanPeriodicRequest
     * @return ModifyVulScanPeriodicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulScanPeriodicResponse ModifyVulScanPeriodic(ModifyVulScanPeriodicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulScanPeriodic", ModifyVulScanPeriodicResponse.class);
    }

    /**
     *修改漏洞白名单配置
     * @param req ModifyVulWhitelistConfigRequest
     * @return ModifyVulWhitelistConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulWhitelistConfigResponse ModifyVulWhitelistConfig(ModifyVulWhitelistConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulWhitelistConfig", ModifyVulWhitelistConfigResponse.class);
    }

    /**
     *修改漏洞白名单开关
     * @param req ModifyVulWhitelistSwitchRequest
     * @return ModifyVulWhitelistSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulWhitelistSwitchResponse ModifyVulWhitelistSwitch(ModifyVulWhitelistSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulWhitelistSwitch", ModifyVulWhitelistSwitchResponse.class);
    }

    /**
     *新增或修改一条通知策略。ID > 0 表示修改；ID = 0 或不传表示新增。MemberAppIds 配置为空时，策略仅作用于当前主账号事件；非空时同时作用于自身账号 + 所列成员账号。
     * @param req ModifyWebhookPolicyRequest
     * @return ModifyWebhookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookPolicyResponse ModifyWebhookPolicy(ModifyWebhookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookPolicy", ModifyWebhookPolicyResponse.class);
    }

    /**
     *切换通知策略的启用状态。
     * @param req ModifyWebhookPolicyStatusRequest
     * @return ModifyWebhookPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookPolicyStatusResponse ModifyWebhookPolicyStatus(ModifyWebhookPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookPolicyStatus", ModifyWebhookPolicyStatusResponse.class);
    }

    /**
     *新增或修改一个接收机器人。ID > 0 表示修改已有记录；ID = 0 或不传表示新增。机器人类型由 Type 字段决定，Type=WEBHOOK 时 WebhookAddr 必填，Type=SCF 时 SCFRegion/Namespace/FunctionName/FunctionVersion/Alias/MaxWaitSeconds 全部必填。修改时不允许变更 Type
     * @param req ModifyWebhookReceiverRequest
     * @return ModifyWebhookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookReceiverResponse ModifyWebhookReceiver(ModifyWebhookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookReceiver", ModifyWebhookReceiverResponse.class);
    }

    /**
     *风险操作示例
     * @param req OperateRiskRequest
     * @return OperateRiskResponse
     * @throws TencentCloudSDKException
     */
    public OperateRiskResponse OperateRisk(OperateRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateRisk", OperateRiskResponse.class);
    }

    /**
     *自定义风险规则
     * @param req OperateRiskRulePolicyRequest
     * @return OperateRiskRulePolicyResponse
     * @throws TencentCloudSDKException
     */
    public OperateRiskRulePolicyResponse OperateRiskRulePolicy(OperateRiskRulePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateRiskRulePolicy", OperateRiskRulePolicyResponse.class);
    }

    /**
     *重置Dspm资产账号密码
     * @param req ResetDspmAssetAccountPasswordRequest
     * @return ResetDspmAssetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDspmAssetAccountPasswordResponse ResetDspmAssetAccountPassword(ResetDspmAssetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDspmAssetAccountPassword", ResetDspmAssetAccountPasswordResponse.class);
    }

    /**
     *RetryExportLog
     * @param req RetryDspmExportLogRequest
     * @return RetryDspmExportLogResponse
     * @throws TencentCloudSDKException
     */
    public RetryDspmExportLogResponse RetryDspmExportLog(RetryDspmExportLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDspmExportLog", RetryDspmExportLogResponse.class);
    }

    /**
     *恢复Dspm资产账号
     * @param req RevertDspmAssetAccountRequest
     * @return RevertDspmAssetAccountResponse
     * @throws TencentCloudSDKException
     */
    public RevertDspmAssetAccountResponse RevertDspmAssetAccount(RevertDspmAssetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevertDspmAssetAccount", RevertDspmAssetAccountResponse.class);
    }

    /**
     *对单个资产的部分检测项发起重新扫描（资产详情页“重新扫描”入口）。
     * @param req ScanBaselineAssetItemListRequest
     * @return ScanBaselineAssetItemListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineAssetItemListResponse ScanBaselineAssetItemList(ScanBaselineAssetItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselineAssetItemList", ScanBaselineAssetItemListResponse.class);
    }

    /**
     *对指定策略下的一批检测项发起重新扫描（策略详情页“检测项”维度的复扫入口）。
     * @param req ScanBaselineItemListRequest
     * @return ScanBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineItemListResponse ScanBaselineItemList(ScanBaselineItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselineItemList", ScanBaselineItemListResponse.class);
    }

    /**
     *对一批基线策略发起整体重新扫描（策略列表页“一键扫描”入口），按策略命中的资产范围全量重扫。
     * @param req ScanBaselinePolicyListRequest
     * @return ScanBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselinePolicyListResponse ScanBaselinePolicyList(ScanBaselinePolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselinePolicyList", ScanBaselinePolicyListResponse.class);
    }

    /**
     *对一批风险记录发起重新扫描，常用于“风险列表”页批量勾选风险后的复扫场景。
     * @param req ScanBaselineRiskListRequest
     * @return ScanBaselineRiskListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineRiskListResponse ScanBaselineRiskList(ScanBaselineRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselineRiskList", ScanBaselineRiskListResponse.class);
    }

    /**
     *CSIP 手动扫描任务删除接口
     * @param req ScanCSIPTaskAgainRequest
     * @return ScanCSIPTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanCSIPTaskAgainResponse ScanCSIPTaskAgain(ScanCSIPTaskAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanCSIPTaskAgain", ScanCSIPTaskAgainResponse.class);
    }

    /**
     *基于原任务配置新建扫描任务。AssetId为空时从TaskId获取全部资产信息；AssetId非空时仅含该单资产。
     * @param req ScanEDRTaskAgainRequest
     * @return ScanEDRTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanEDRTaskAgainResponse ScanEDRTaskAgain(ScanEDRTaskAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanEDRTaskAgain", ScanEDRTaskAgainResponse.class);
    }

    /**
     *发送Dspm资产访问验证码
     * @param req SendDspmAssetLoginSmsCodeRequest
     * @return SendDspmAssetLoginSmsCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendDspmAssetLoginSmsCodeResponse SendDspmAssetLoginSmsCode(SendDspmAssetLoginSmsCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendDspmAssetLoginSmsCode", SendDspmAssetLoginSmsCodeResponse.class);
    }

    /**
     *开启或者修改防卸载功能配置
     * @param req StartOrModifyPreventUninstallRequest
     * @return StartOrModifyPreventUninstallResponse
     * @throws TencentCloudSDKException
     */
    public StartOrModifyPreventUninstallResponse StartOrModifyPreventUninstall(StartOrModifyPreventUninstallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOrModifyPreventUninstall", StartOrModifyPreventUninstallResponse.class);
    }

    /**
     *开启或者修改进程守护功能配置
     * @param req StartOrModifyProcessDaemonRequest
     * @return StartOrModifyProcessDaemonResponse
     * @throws TencentCloudSDKException
     */
    public StartOrModifyProcessDaemonResponse StartOrModifyProcessDaemon(StartOrModifyProcessDaemonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOrModifyProcessDaemon", StartOrModifyProcessDaemonResponse.class);
    }

    /**
     *停止指定的基线扫描主任务，仅对处于 INIT / SUBTASK_CREATING / SCANNING 状态的任务生效。
     * @param req StopBaselineScanTaskRequest
     * @return StopBaselineScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineScanTaskResponse StopBaselineScanTask(StopBaselineScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBaselineScanTask", StopBaselineScanTaskResponse.class);
    }

    /**
     *CSIP 手动扫描停止接口
     * @param req StopCSIPManualMalwareScanRequest
     * @return StopCSIPManualMalwareScanResponse
     * @throws TencentCloudSDKException
     */
    public StopCSIPManualMalwareScanResponse StopCSIPManualMalwareScan(StopCSIPManualMalwareScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCSIPManualMalwareScan", StopCSIPManualMalwareScanResponse.class);
    }

    /**
     *停止或取消扫描任务。SCANNING状态调RPC停止，WAIT状态直接改库取消。只有任务创建者可操作。
     * @param req StopEDRScanTaskRequest
     * @return StopEDRScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopEDRScanTaskResponse StopEDRScanTask(StopEDRScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopEDRScanTask", StopEDRScanTaskResponse.class);
    }

    /**
     *关闭防卸载功能
     * @param req StopPreventUninstallRequest
     * @return StopPreventUninstallResponse
     * @throws TencentCloudSDKException
     */
    public StopPreventUninstallResponse StopPreventUninstall(StopPreventUninstallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPreventUninstall", StopPreventUninstallResponse.class);
    }

    /**
     *关闭进程守护功能
     * @param req StopProcessDaemonRequest
     * @return StopProcessDaemonResponse
     * @throws TencentCloudSDKException
     */
    public StopProcessDaemonResponse StopProcessDaemon(StopProcessDaemonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopProcessDaemon", StopProcessDaemonResponse.class);
    }

    /**
     *停止扫风险中心扫描任务
     * @param req StopRiskCenterTaskRequest
     * @return StopRiskCenterTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRiskCenterTaskResponse StopRiskCenterTask(StopRiskCenterTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRiskCenterTask", StopRiskCenterTaskResponse.class);
    }

    /**
     *停止漏洞扫描（任务扫描）
     * @param req StopVulScanTaskRequest
     * @return StopVulScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVulScanTaskResponse StopVulScanTask(StopVulScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopVulScanTask", StopVulScanTaskResponse.class);
    }

    /**
     *同步dspm支持的资产
     * @param req SyncDspmAssetsRequest
     * @return SyncDspmAssetsResponse
     * @throws TencentCloudSDKException
     */
    public SyncDspmAssetsResponse SyncDspmAssets(SyncDspmAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncDspmAssets", SyncDspmAssetsResponse.class);
    }

    /**
     *同步dspm用户列表
     * @param req SyncDspmUsersRequest
     * @return SyncDspmUsersResponse
     * @throws TencentCloudSDKException
     */
    public SyncDspmUsersResponse SyncDspmUsers(SyncDspmUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncDspmUsers", SyncDspmUsersResponse.class);
    }

    /**
     *向指定的接收机器人发送一条测试消息，验证可达性与配置正确性。对应表格行内的「测试」按钮。
     * @param req TestWebhookReceiverRequest
     * @return TestWebhookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public TestWebhookReceiverResponse TestWebhookReceiver(TestWebhookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TestWebhookReceiver", TestWebhookReceiverResponse.class);
    }

    /**
     *卸载集群容器安全Agent。
     * @param req UninstallClusterAgentRequest
     * @return UninstallClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallClusterAgentResponse UninstallClusterAgent(UninstallClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallClusterAgent", UninstallClusterAgentResponse.class);
    }

    /**
     *标记风险或者告警为 已处置/已忽略
     * @param req UpdateAccessKeyAlarmStatusRequest
     * @return UpdateAccessKeyAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyAlarmStatusResponse UpdateAccessKeyAlarmStatus(UpdateAccessKeyAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyAlarmStatus", UpdateAccessKeyAlarmStatusResponse.class);
    }

    /**
     *编辑访问密钥/源IP备注
     * @param req UpdateAccessKeyRemarkRequest
     * @return UpdateAccessKeyRemarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyRemarkResponse UpdateAccessKeyRemark(UpdateAccessKeyRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyRemark", UpdateAccessKeyRemarkResponse.class);
    }

    /**
     *批量告警状态处理接口
     * @param req UpdateAlertStatusListRequest
     * @return UpdateAlertStatusListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertStatusListResponse UpdateAlertStatusList(UpdateAlertStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertStatusList", UpdateAlertStatusListResponse.class);
    }

    /**
     *绑定、更新集群负责人
     * @param req UpdateClusterOwnerRequest
     * @return UpdateClusterOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterOwnerResponse UpdateClusterOwner(UpdateClusterOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateClusterOwner", UpdateClusterOwnerResponse.class);
    }

    /**
     *验证Dspm资产登录验证码
     * @param req VerifyDspmAssetLoginCodeRequest
     * @return VerifyDspmAssetLoginCodeResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDspmAssetLoginCodeResponse VerifyDspmAssetLoginCode(VerifyDspmAssetLoginCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyDspmAssetLoginCode", VerifyDspmAssetLoginCodeResponse.class);
    }

}
