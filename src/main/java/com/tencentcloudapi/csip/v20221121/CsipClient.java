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
