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
package com.tencentcloudapi.cwp.v20180228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cwp.v20180228.models.*;

public class CwpClient extends AbstractClient{
    private static String endpoint = "cwp.tencentcloudapi.com";
    private static String service = "cwp";
    private static String version = "2018-02-28";
    
    public CwpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CwpClient(Credential credential, String region, ClientProfile profile) {
        super(CwpClient.endpoint, CwpClient.version, credential, region, profile);
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
     *取消漏洞忽略
     * @param req CancelIgnoreVulRequest
     * @return CancelIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public CancelIgnoreVulResponse CancelIgnoreVul(CancelIgnoreVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelIgnoreVul", CancelIgnoreVulResponse.class);
    }

    /**
     *根据检测项id或事件id批量忽略事件或取消忽略
     * @param req ChangeRuleEventsIgnoreStatusRequest
     * @return ChangeRuleEventsIgnoreStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeRuleEventsIgnoreStatusResponse ChangeRuleEventsIgnoreStatus(ChangeRuleEventsIgnoreStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeRuleEventsIgnoreStatus", ChangeRuleEventsIgnoreStatusResponse.class);
    }

    /**
     *根据策略id修改策略可用状态
     * @param req ChangeStrategyEnableStatusRequest
     * @return ChangeStrategyEnableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeStrategyEnableStatusResponse ChangeStrategyEnableStatus(ChangeStrategyEnableStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeStrategyEnableStatus", ChangeStrategyEnableStatusResponse.class);
    }

    /**
     *校验高危命令用户规则新增和编辑时的参数。
     * @param req CheckBashPolicyParamsRequest
     * @return CheckBashPolicyParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashPolicyParamsResponse CheckBashPolicyParams(CheckBashPolicyParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckBashPolicyParams", CheckBashPolicyParamsResponse.class);
    }

    /**
     *校验高危命令用户规则新增和编辑时的参数。
     * @param req CheckBashRuleParamsRequest
     * @return CheckBashRuleParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashRuleParamsResponse CheckBashRuleParams(CheckBashRuleParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckBashRuleParams", CheckBashRuleParamsResponse.class);
    }

    /**
     *检验核心文件监控前端新增和编辑时的规则参数。
     * @param req CheckFileTamperRuleRequest
     * @return CheckFileTamperRuleResponse
     * @throws TencentCloudSDKException
     */
    public CheckFileTamperRuleResponse CheckFileTamperRule(CheckFileTamperRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFileTamperRule", CheckFileTamperRuleResponse.class);
    }

    /**
     *查询基线是否第一次检测
     * @param req CheckFirstScanBaselineRequest
     * @return CheckFirstScanBaselineResponse
     * @throws TencentCloudSDKException
     */
    public CheckFirstScanBaselineResponse CheckFirstScanBaseline(CheckFirstScanBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFirstScanBaseline", CheckFirstScanBaselineResponse.class);
    }

    /**
     *检查日志投递kafka连通性
     * @param req CheckLogKafkaConnectionStateRequest
     * @return CheckLogKafkaConnectionStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckLogKafkaConnectionStateResponse CheckLogKafkaConnectionState(CheckLogKafkaConnectionStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckLogKafkaConnectionState", CheckLogKafkaConnectionStateResponse.class);
    }

    /**
     *清理本地存储数据
     * @param req ClearLocalStorageRequest
     * @return ClearLocalStorageResponse
     * @throws TencentCloudSDKException
     */
    public ClearLocalStorageResponse ClearLocalStorage(ClearLocalStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearLocalStorage", ClearLocalStorageResponse.class);
    }

    /**
     *添加阻断白名单列表
     * @param req CreateBanWhiteListRequest
     * @return CreateBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBanWhiteListResponse CreateBanWhiteList(CreateBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBanWhiteList", CreateBanWhiteListResponse.class);
    }

    /**
     *根据策略信息创建基线策略
     * @param req CreateBaselineStrategyRequest
     * @return CreateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineStrategyResponse CreateBaselineStrategy(CreateBaselineStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineStrategy", CreateBaselineStrategyResponse.class);
    }

    /**
     *新购授权自动绑定任务
     * @param req CreateBuyBindTaskRequest
     * @return CreateBuyBindTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBuyBindTaskResponse CreateBuyBindTask(CreateBuyBindTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBuyBindTask", CreateBuyBindTaskResponse.class);
    }

    /**
     *创建应急漏洞扫描任务
     * @param req CreateEmergencyVulScanRequest
     * @return CreateEmergencyVulScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmergencyVulScanResponse CreateEmergencyVulScan(CreateEmergencyVulScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmergencyVulScan", CreateEmergencyVulScanResponse.class);
    }

    /**
     *对旗舰版机器单次触发事件调查及告警回溯
     * @param req CreateIncidentBacktrackingRequest
     * @return CreateIncidentBacktrackingResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncidentBacktrackingResponse CreateIncidentBacktracking(CreateIncidentBacktrackingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIncidentBacktracking", CreateIncidentBacktrackingResponse.class);
    }

    /**
     *CreateLicenseOrder 该接口可以创建专业版/旗舰版订单
支持预付费后付费创建
后付费订单直接创建成功
预付费订单仅下单不支付,需要调用计费支付接口进行支付
     * @param req CreateLicenseOrderRequest
     * @return CreateLicenseOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateLicenseOrderResponse CreateLicenseOrder(CreateLicenseOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLicenseOrder", CreateLicenseOrderResponse.class);
    }

    /**
     *创建日志下载任务
     * @param req CreateLogExportRequest
     * @return CreateLogExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogExportResponse CreateLogExport(CreateLogExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogExport", CreateLogExportResponse.class);
    }

    /**
     *添加恶意请求白名单
     * @param req CreateMaliciousRequestWhiteListRequest
     * @return CreateMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateMaliciousRequestWhiteListResponse CreateMaliciousRequestWhiteList(CreateMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMaliciousRequestWhiteList", CreateMaliciousRequestWhiteListResponse.class);
    }

    /**
     *创建木马白名单
     * @param req CreateMalwareWhiteListRequest
     * @return CreateMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateMalwareWhiteListResponse CreateMalwareWhiteList(CreateMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMalwareWhiteList", CreateMalwareWhiteListResponse.class);
    }

    /**
     *创建网络攻击白名单
     * @param req CreateNetAttackWhiteListRequest
     * @return CreateNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetAttackWhiteListResponse CreateNetAttackWhiteList(CreateNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetAttackWhiteList", CreateNetAttackWhiteListResponse.class);
    }

    /**
     *添加网站防护服务器
     * @param req CreateProtectServerRequest
     * @return CreateProtectServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtectServerResponse CreateProtectServer(CreateProtectServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProtectServer", CreateProtectServerResponse.class);
    }

    /**
     *创建或修改防勒索策略
     * @param req CreateRansomDefenseStrategyRequest
     * @return CreateRansomDefenseStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateRansomDefenseStrategyResponse CreateRansomDefenseStrategy(CreateRansomDefenseStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRansomDefenseStrategy", CreateRansomDefenseStrategyResponse.class);
    }

    /**
     *该接口可以对入侵检测-文件查杀扫描检测
     * @param req CreateScanMalwareSettingRequest
     * @return CreateScanMalwareSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanMalwareSettingResponse CreateScanMalwareSetting(CreateScanMalwareSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScanMalwareSetting", CreateScanMalwareSettingResponse.class);
    }

    /**
     *添加历史搜索记录
     * @param req CreateSearchLogRequest
     * @return CreateSearchLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchLogResponse CreateSearchLog(CreateSearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSearchLog", CreateSearchLogResponse.class);
    }

    /**
     *添加检索模板
     * @param req CreateSearchTemplateRequest
     * @return CreateSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchTemplateResponse CreateSearchTemplate(CreateSearchTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSearchTemplate", CreateSearchTemplateResponse.class);
    }

    /**
     *提交漏洞修护
     * @param req CreateVulFixRequest
     * @return CreateVulFixResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixResponse CreateVulFix(CreateVulFixRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFix", CreateVulFixResponse.class);
    }

    /**
     *该接口可以创建白名单订单
     * @param req CreateWhiteListOrderRequest
     * @return CreateWhiteListOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteListOrderResponse CreateWhiteListOrder(CreateWhiteListOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWhiteListOrder", CreateWhiteListOrderResponse.class);
    }

    /**
     *删除全部java内存马事件
     * @param req DeleteAllJavaMemShellsRequest
     * @return DeleteAllJavaMemShellsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllJavaMemShellsResponse DeleteAllJavaMemShells(DeleteAllJavaMemShellsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllJavaMemShells", DeleteAllJavaMemShellsResponse.class);
    }

    /**
     *删除阻断白名单列表
     * @param req DeleteBanWhiteListRequest
     * @return DeleteBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBanWhiteListResponse DeleteBanWhiteList(DeleteBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBanWhiteList", DeleteBanWhiteListResponse.class);
    }

    /**
     *删除基线策略配置
     * @param req DeleteBaselinePolicyRequest
     * @return DeleteBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselinePolicyResponse DeleteBaselinePolicy(DeleteBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselinePolicy", DeleteBaselinePolicyResponse.class);
    }

    /**
     *删除基线规则
     * @param req DeleteBaselineRuleRequest
     * @return DeleteBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineRuleResponse DeleteBaselineRule(DeleteBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineRule", DeleteBaselineRuleResponse.class);
    }

    /**
     *删除基线忽略规则
     * @param req DeleteBaselineRuleIgnoreRequest
     * @return DeleteBaselineRuleIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineRuleIgnoreResponse DeleteBaselineRuleIgnore(DeleteBaselineRuleIgnoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineRuleIgnore", DeleteBaselineRuleIgnoreResponse.class);
    }

    /**
     *根据基线策略id删除策略
     * @param req DeleteBaselineStrategyRequest
     * @return DeleteBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineStrategyResponse DeleteBaselineStrategy(DeleteBaselineStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineStrategy", DeleteBaselineStrategyResponse.class);
    }

    /**
     *删除基线弱口令
     * @param req DeleteBaselineWeakPasswordRequest
     * @return DeleteBaselineWeakPasswordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineWeakPasswordResponse DeleteBaselineWeakPassword(DeleteBaselineWeakPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineWeakPassword", DeleteBaselineWeakPasswordResponse.class);
    }

    /**
     *根据Ids删除高危命令事件
     * @param req DeleteBashEventsRequest
     * @return DeleteBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashEventsResponse DeleteBashEvents(DeleteBashEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBashEvents", DeleteBashEventsResponse.class);
    }

    /**
     *删除高危命令策略
     * @param req DeleteBashPoliciesRequest
     * @return DeleteBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashPoliciesResponse DeleteBashPolicies(DeleteBashPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBashPolicies", DeleteBashPoliciesResponse.class);
    }

    /**
     *删除高危命令规则
     * @param req DeleteBashRulesRequest
     * @return DeleteBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashRulesResponse DeleteBashRules(DeleteBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBashRules", DeleteBashRulesResponse.class);
    }

    /**
     *本接口 (DeleteBruteAttacks) 用于删除暴力破解记录。
     * @param req DeleteBruteAttacksRequest
     * @return DeleteBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBruteAttacksResponse DeleteBruteAttacks(DeleteBruteAttacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBruteAttacks", DeleteBruteAttacksResponse.class);
    }

    /**
     *对授权管理-订单列表内已过期的订单进行删除.(删除后的订单不在统计范畴内)
     * @param req DeleteLicenseRecordRequest
     * @return DeleteLicenseRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLicenseRecordResponse DeleteLicenseRecord(DeleteLicenseRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLicenseRecord", DeleteLicenseRecordResponse.class);
    }

    /**
     *删除授权全部记录
     * @param req DeleteLicenseRecordAllRequest
     * @return DeleteLicenseRecordAllResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLicenseRecordAllResponse DeleteLicenseRecordAll(DeleteLicenseRecordAllRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLicenseRecordAll", DeleteLicenseRecordAllResponse.class);
    }

    /**
     *删除日志下载任务
     * @param req DeleteLogExportRequest
     * @return DeleteLogExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogExportResponse DeleteLogExport(DeleteLogExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogExport", DeleteLogExportResponse.class);
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
     *本接口（DeleteMachine）用于卸载主机安全客户端。
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachine", DeleteMachineResponse.class);
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
     *删除服务器关联的标签
     * @param req DeleteMachineTagRequest
     * @return DeleteMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineTagResponse DeleteMachineTag(DeleteMachineTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineTag", DeleteMachineTagResponse.class);
    }

    /**
     *删除恶意请求白名单
     * @param req DeleteMaliciousRequestWhiteListRequest
     * @return DeleteMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestWhiteListResponse DeleteMaliciousRequestWhiteList(DeleteMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMaliciousRequestWhiteList", DeleteMaliciousRequestWhiteListResponse.class);
    }

    /**
     *本接口 (DeleteMaliciousRequests) 用于删除恶意请求记录。
     * @param req DeleteMaliciousRequestsRequest
     * @return DeleteMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestsResponse DeleteMaliciousRequests(DeleteMaliciousRequestsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMaliciousRequests", DeleteMaliciousRequestsResponse.class);
    }

    /**
     *入侵管理-终止扫描任务
     * @param req DeleteMalwareScanTaskRequest
     * @return DeleteMalwareScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwareScanTaskResponse DeleteMalwareScanTask(DeleteMalwareScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMalwareScanTask", DeleteMalwareScanTaskResponse.class);
    }

    /**
     *删除木马白名单
     * @param req DeleteMalwareWhiteListRequest
     * @return DeleteMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwareWhiteListResponse DeleteMalwareWhiteList(DeleteMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMalwareWhiteList", DeleteMalwareWhiteListResponse.class);
    }

    /**
     *本接口 (DeleteMalwares) 用于删除木马记录。
     * @param req DeleteMalwaresRequest
     * @return DeleteMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwaresResponse DeleteMalwares(DeleteMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMalwares", DeleteMalwaresResponse.class);
    }

    /**
     *删除网络攻击白名单
     * @param req DeleteNetAttackWhiteListRequest
     * @return DeleteNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetAttackWhiteListResponse DeleteNetAttackWhiteList(DeleteNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetAttackWhiteList", DeleteNetAttackWhiteListResponse.class);
    }

    /**
     *本接口 (DeleteNonlocalLoginPlaces) 用于删除异地登录记录。
     * @param req DeleteNonlocalLoginPlacesRequest
     * @return DeleteNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNonlocalLoginPlacesResponse DeleteNonlocalLoginPlaces(DeleteNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNonlocalLoginPlaces", DeleteNonlocalLoginPlacesResponse.class);
    }

    /**
     *根据Ids删除本地提权
     * @param req DeletePrivilegeEventsRequest
     * @return DeletePrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivilegeEventsResponse DeletePrivilegeEvents(DeletePrivilegeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivilegeEvents", DeletePrivilegeEventsResponse.class);
    }

    /**
     *删除本地提权规则
     * @param req DeletePrivilegeRulesRequest
     * @return DeletePrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivilegeRulesResponse DeletePrivilegeRules(DeletePrivilegeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivilegeRules", DeletePrivilegeRulesResponse.class);
    }

    /**
     *删除防护网站
     * @param req DeleteProtectDirRequest
     * @return DeleteProtectDirResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProtectDirResponse DeleteProtectDir(DeleteProtectDirRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProtectDir", DeleteProtectDirResponse.class);
    }

    /**
     *根据Ids删除反弹Shell事件
     * @param req DeleteReverseShellEventsRequest
     * @return DeleteReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellEventsResponse DeleteReverseShellEvents(DeleteReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReverseShellEvents", DeleteReverseShellEventsResponse.class);
    }

    /**
     *删除反弹Shell规则
     * @param req DeleteReverseShellRulesRequest
     * @return DeleteReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellRulesResponse DeleteReverseShellRules(DeleteReverseShellRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReverseShellRules", DeleteReverseShellRulesResponse.class);
    }

    /**
     *删除恶意请求事件
     * @param req DeleteRiskDnsEventRequest
     * @return DeleteRiskDnsEventResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskDnsEventResponse DeleteRiskDnsEvent(DeleteRiskDnsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskDnsEvent", DeleteRiskDnsEventResponse.class);
    }

    /**
     *删除恶意请求策略
     * @param req DeleteRiskDnsPolicyRequest
     * @return DeleteRiskDnsPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskDnsPolicyResponse DeleteRiskDnsPolicy(DeleteRiskDnsPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskDnsPolicy", DeleteRiskDnsPolicyResponse.class);
    }

    /**
     *DeleteScanTask 该接口可以对指定类型的扫描任务进行停止扫描;
     * @param req DeleteScanTaskRequest
     * @return DeleteScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScanTaskResponse DeleteScanTask(DeleteScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScanTask", DeleteScanTaskResponse.class);
    }

    /**
     *删除检索模板
     * @param req DeleteSearchTemplateRequest
     * @return DeleteSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSearchTemplateResponse DeleteSearchTemplate(DeleteSearchTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSearchTemplate", DeleteSearchTemplateResponse.class);
    }

    /**
     *删除标签
     * @param req DeleteTagsRequest
     * @return DeleteTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagsResponse DeleteTags(DeleteTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTags", DeleteTagsResponse.class);
    }

    /**
     *删除告警策略
     * @param req DeleteWebHookPolicyRequest
     * @return DeleteWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookPolicyResponse DeleteWebHookPolicy(DeleteWebHookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebHookPolicy", DeleteWebHookPolicyResponse.class);
    }

    /**
     *删除告警接收人
     * @param req DeleteWebHookReceiverRequest
     * @return DeleteWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookReceiverResponse DeleteWebHookReceiver(DeleteWebHookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebHookReceiver", DeleteWebHookReceiverResponse.class);
    }

    /**
     *删除企微机器人规则
     * @param req DeleteWebHookRuleRequest
     * @return DeleteWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookRuleResponse DeleteWebHookRule(DeleteWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebHookRule", DeleteWebHookRuleResponse.class);
    }

    /**
     *网站防篡改-删除事件记录
     * @param req DeleteWebPageEventLogRequest
     * @return DeleteWebPageEventLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebPageEventLogResponse DeleteWebPageEventLog(DeleteWebPageEventLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebPageEventLog", DeleteWebPageEventLogResponse.class);
    }

    /**
     *获取用户当前灰度配置
     * @param req DescribeABTestConfigRequest
     * @return DescribeABTestConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeABTestConfigResponse DescribeABTestConfig(DescribeABTestConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeABTestConfig", DescribeABTestConfigResponse.class);
    }

    /**
     *获取配置的aeskey和aesiv
     * @param req DescribeAESKeyRequest
     * @return DescribeAESKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAESKeyResponse DescribeAESKey(DescribeAESKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAESKey", DescribeAESKeyResponse.class);
    }

    /**
     *本接口 (DescribeAccountStatistics) 用于获取帐号统计列表数据。
     * @param req DescribeAccountStatisticsRequest
     * @return DescribeAccountStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountStatisticsResponse DescribeAccountStatistics(DescribeAccountStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountStatistics", DescribeAccountStatisticsResponse.class);
    }

    /**
     *获取agent安装命令
     * @param req DescribeAgentInstallCommandRequest
     * @return DescribeAgentInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallCommandResponse DescribeAgentInstallCommand(DescribeAgentInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstallCommand", DescribeAgentInstallCommandResponse.class);
    }

    /**
     *混合云安装agent token获取
     * @param req DescribeAgentInstallationTokenRequest
     * @return DescribeAgentInstallationTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallationTokenResponse DescribeAgentInstallationToken(DescribeAgentInstallationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstallationToken", DescribeAgentInstallationTokenResponse.class);
    }

    /**
     *获取告警点所在事件的所有节点信息
     * @param req DescribeAlarmIncidentNodesRequest
     * @return DescribeAlarmIncidentNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmIncidentNodesResponse DescribeAlarmIncidentNodes(DescribeAlarmIncidentNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmIncidentNodes", DescribeAlarmIncidentNodesResponse.class);
    }

    /**
     *查询告警点id列表
     * @param req DescribeAlarmVertexIdRequest
     * @return DescribeAlarmVertexIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmVertexIdResponse DescribeAlarmVertexId(DescribeAlarmVertexIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmVertexId", DescribeAlarmVertexIdResponse.class);
    }

    /**
     *获取所有软件应用数量
     * @param req DescribeAssetAppCountRequest
     * @return DescribeAssetAppCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppCountResponse DescribeAssetAppCount(DescribeAssetAppCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppCount", DescribeAssetAppCountResponse.class);
    }

    /**
     *查询应用列表
     * @param req DescribeAssetAppListRequest
     * @return DescribeAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppListResponse DescribeAssetAppList(DescribeAssetAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppList", DescribeAssetAppListResponse.class);
    }

    /**
     *获取软件关联进程列表
     * @param req DescribeAssetAppProcessListRequest
     * @return DescribeAssetAppProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppProcessListResponse DescribeAssetAppProcessList(DescribeAssetAppProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppProcessList", DescribeAssetAppProcessListResponse.class);
    }

    /**
     *获取内核模块详情
     * @param req DescribeAssetCoreModuleInfoRequest
     * @return DescribeAssetCoreModuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetCoreModuleInfoResponse DescribeAssetCoreModuleInfo(DescribeAssetCoreModuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetCoreModuleInfo", DescribeAssetCoreModuleInfoResponse.class);
    }

    /**
     *查询资产管理内核模块列表
     * @param req DescribeAssetCoreModuleListRequest
     * @return DescribeAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetCoreModuleListResponse DescribeAssetCoreModuleList(DescribeAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetCoreModuleList", DescribeAssetCoreModuleListResponse.class);
    }

    /**
     *获取所有数据库数量
     * @param req DescribeAssetDatabaseCountRequest
     * @return DescribeAssetDatabaseCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseCountResponse DescribeAssetDatabaseCount(DescribeAssetDatabaseCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDatabaseCount", DescribeAssetDatabaseCountResponse.class);
    }

    /**
     *获取资产管理数据库详情
     * @param req DescribeAssetDatabaseInfoRequest
     * @return DescribeAssetDatabaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseInfoResponse DescribeAssetDatabaseInfo(DescribeAssetDatabaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDatabaseInfo", DescribeAssetDatabaseInfoResponse.class);
    }

    /**
     *查询资产管理数据库列表
     * @param req DescribeAssetDatabaseListRequest
     * @return DescribeAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseListResponse DescribeAssetDatabaseList(DescribeAssetDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDatabaseList", DescribeAssetDatabaseListResponse.class);
    }

    /**
     *获取主机磁盘分区列表
     * @param req DescribeAssetDiskListRequest
     * @return DescribeAssetDiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDiskListResponse DescribeAssetDiskList(DescribeAssetDiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDiskList", DescribeAssetDiskListResponse.class);
    }

    /**
     *查询资产管理环境变量列表
     * @param req DescribeAssetEnvListRequest
     * @return DescribeAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetEnvListResponse DescribeAssetEnvList(DescribeAssetEnvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetEnvList", DescribeAssetEnvListResponse.class);
    }

    /**
     *获取主机所有资源数量
     * @param req DescribeAssetHostTotalCountRequest
     * @return DescribeAssetHostTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostTotalCountResponse DescribeAssetHostTotalCount(DescribeAssetHostTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetHostTotalCount", DescribeAssetHostTotalCountResponse.class);
    }

    /**
     *获取资产数量： 主机数、账号数、端口数、进程数、软件数、数据库数、Web应用数、Web框架数、Web服务数、Web站点数
     * @param req DescribeAssetInfoRequest
     * @return DescribeAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInfoResponse DescribeAssetInfo(DescribeAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetInfo", DescribeAssetInfoResponse.class);
    }

    /**
     *查询资产管理启动服务列表
     * @param req DescribeAssetInitServiceListRequest
     * @return DescribeAssetInitServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInitServiceListResponse DescribeAssetInitServiceList(DescribeAssetInitServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetInitServiceList", DescribeAssetInitServiceListResponse.class);
    }

    /**
     *获取Jar包详情
     * @param req DescribeAssetJarInfoRequest
     * @return DescribeAssetJarInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetJarInfoResponse DescribeAssetJarInfo(DescribeAssetJarInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetJarInfo", DescribeAssetJarInfoResponse.class);
    }

    /**
     *查询Jar包列表
     * @param req DescribeAssetJarListRequest
     * @return DescribeAssetJarListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetJarListResponse DescribeAssetJarList(DescribeAssetJarListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetJarList", DescribeAssetJarListResponse.class);
    }

    /**
     *获取系统负载、内存使用率、硬盘使用率情况
     * @param req DescribeAssetLoadInfoRequest
     * @return DescribeAssetLoadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetLoadInfoResponse DescribeAssetLoadInfo(DescribeAssetLoadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetLoadInfo", DescribeAssetLoadInfoResponse.class);
    }

    /**
     *获取资产管理主机资源详细信息
     * @param req DescribeAssetMachineDetailRequest
     * @return DescribeAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineDetailResponse DescribeAssetMachineDetail(DescribeAssetMachineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetMachineDetail", DescribeAssetMachineDetailResponse.class);
    }

    /**
     *获取资产指纹页面的资源监控列表
     * @param req DescribeAssetMachineListRequest
     * @return DescribeAssetMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineListResponse DescribeAssetMachineList(DescribeAssetMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetMachineList", DescribeAssetMachineListResponse.class);
    }

    /**
     *获取主机标签Top5
     * @param req DescribeAssetMachineTagTopRequest
     * @return DescribeAssetMachineTagTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineTagTopResponse DescribeAssetMachineTagTop(DescribeAssetMachineTagTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetMachineTagTop", DescribeAssetMachineTagTopResponse.class);
    }

    /**
     *查询资产管理计划任务列表
     * @param req DescribeAssetPlanTaskListRequest
     * @return DescribeAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPlanTaskListResponse DescribeAssetPlanTaskList(DescribeAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPlanTaskList", DescribeAssetPlanTaskListResponse.class);
    }

    /**
     *获取所有端口数量
     * @param req DescribeAssetPortCountRequest
     * @return DescribeAssetPortCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortCountResponse DescribeAssetPortCount(DescribeAssetPortCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPortCount", DescribeAssetPortCountResponse.class);
    }

    /**
     *获取资产管理端口列表
     * @param req DescribeAssetPortInfoListRequest
     * @return DescribeAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortInfoListResponse DescribeAssetPortInfoList(DescribeAssetPortInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPortInfoList", DescribeAssetPortInfoListResponse.class);
    }

    /**
     *获取所有进程数量
     * @param req DescribeAssetProcessCountRequest
     * @return DescribeAssetProcessCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessCountResponse DescribeAssetProcessCount(DescribeAssetProcessCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessCount", DescribeAssetProcessCountResponse.class);
    }

    /**
     *获取资产管理进程列表
     * @param req DescribeAssetProcessInfoListRequest
     * @return DescribeAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessInfoListResponse DescribeAssetProcessInfoList(DescribeAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessInfoList", DescribeAssetProcessInfoListResponse.class);
    }

    /**
     *获取主机最近趋势情况
     * @param req DescribeAssetRecentMachineInfoRequest
     * @return DescribeAssetRecentMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRecentMachineInfoResponse DescribeAssetRecentMachineInfo(DescribeAssetRecentMachineInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRecentMachineInfo", DescribeAssetRecentMachineInfoResponse.class);
    }

    /**
     *获取资产管理系统安装包列表
     * @param req DescribeAssetSystemPackageListRequest
     * @return DescribeAssetSystemPackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSystemPackageListResponse DescribeAssetSystemPackageList(DescribeAssetSystemPackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSystemPackageList", DescribeAssetSystemPackageListResponse.class);
    }

    /**
     *获取所有资源数量：主机、账号、端口、进程、软件、数据库、Web应用、Web框架、Web服务、Web站点
     * @param req DescribeAssetTotalCountRequest
     * @return DescribeAssetTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTotalCountResponse DescribeAssetTotalCount(DescribeAssetTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTotalCount", DescribeAssetTotalCountResponse.class);
    }

    /**
     *获取各种类型资源Top5
     * @param req DescribeAssetTypeTopRequest
     * @return DescribeAssetTypeTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTypeTopResponse DescribeAssetTypeTop(DescribeAssetTypeTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTypeTop", DescribeAssetTypeTopResponse.class);
    }

    /**
     *获取资产指纹类型列表
     * @param req DescribeAssetTypesRequest
     * @return DescribeAssetTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTypesResponse DescribeAssetTypes(DescribeAssetTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTypes", DescribeAssetTypesResponse.class);
    }

    /**
     *获取所有账号数量
     * @param req DescribeAssetUserCountRequest
     * @return DescribeAssetUserCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserCountResponse DescribeAssetUserCount(DescribeAssetUserCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserCount", DescribeAssetUserCountResponse.class);
    }

    /**
     *获取主机账号详情
     * @param req DescribeAssetUserInfoRequest
     * @return DescribeAssetUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserInfoResponse DescribeAssetUserInfo(DescribeAssetUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserInfo", DescribeAssetUserInfoResponse.class);
    }

    /**
     *获取主机账号Key列表
     * @param req DescribeAssetUserKeyListRequest
     * @return DescribeAssetUserKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserKeyListResponse DescribeAssetUserKeyList(DescribeAssetUserKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserKeyList", DescribeAssetUserKeyListResponse.class);
    }

    /**
     *获取账号列表
     * @param req DescribeAssetUserListRequest
     * @return DescribeAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserListResponse DescribeAssetUserList(DescribeAssetUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserList", DescribeAssetUserListResponse.class);
    }

    /**
     *获取所有Web应用数量
     * @param req DescribeAssetWebAppCountRequest
     * @return DescribeAssetWebAppCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppCountResponse DescribeAssetWebAppCount(DescribeAssetWebAppCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebAppCount", DescribeAssetWebAppCountResponse.class);
    }

    /**
     *获取资产管理Web应用列表
     * @param req DescribeAssetWebAppListRequest
     * @return DescribeAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppListResponse DescribeAssetWebAppList(DescribeAssetWebAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebAppList", DescribeAssetWebAppListResponse.class);
    }

    /**
     *获取资产管理Web应用插件列表
     * @param req DescribeAssetWebAppPluginListRequest
     * @return DescribeAssetWebAppPluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppPluginListResponse DescribeAssetWebAppPluginList(DescribeAssetWebAppPluginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebAppPluginList", DescribeAssetWebAppPluginListResponse.class);
    }

    /**
     *获取所有Web框架数量
     * @param req DescribeAssetWebFrameCountRequest
     * @return DescribeAssetWebFrameCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameCountResponse DescribeAssetWebFrameCount(DescribeAssetWebFrameCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebFrameCount", DescribeAssetWebFrameCountResponse.class);
    }

    /**
     *获取资产管理Web框架列表
     * @param req DescribeAssetWebFrameListRequest
     * @return DescribeAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameListResponse DescribeAssetWebFrameList(DescribeAssetWebFrameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebFrameList", DescribeAssetWebFrameListResponse.class);
    }

    /**
     *获取所有Web站点数量
     * @param req DescribeAssetWebLocationCountRequest
     * @return DescribeAssetWebLocationCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationCountResponse DescribeAssetWebLocationCount(DescribeAssetWebLocationCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationCount", DescribeAssetWebLocationCountResponse.class);
    }

    /**
     *获取Web站点详情
     * @param req DescribeAssetWebLocationInfoRequest
     * @return DescribeAssetWebLocationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationInfoResponse DescribeAssetWebLocationInfo(DescribeAssetWebLocationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationInfo", DescribeAssetWebLocationInfoResponse.class);
    }

    /**
     *获取Web站点列表
     * @param req DescribeAssetWebLocationListRequest
     * @return DescribeAssetWebLocationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationListResponse DescribeAssetWebLocationList(DescribeAssetWebLocationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationList", DescribeAssetWebLocationListResponse.class);
    }

    /**
     *获取Web站点虚拟目录列表
     * @param req DescribeAssetWebLocationPathListRequest
     * @return DescribeAssetWebLocationPathListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationPathListResponse DescribeAssetWebLocationPathList(DescribeAssetWebLocationPathListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationPathList", DescribeAssetWebLocationPathListResponse.class);
    }

    /**
     *获取所有Web服务数量
     * @param req DescribeAssetWebServiceCountRequest
     * @return DescribeAssetWebServiceCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceCountResponse DescribeAssetWebServiceCount(DescribeAssetWebServiceCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceCount", DescribeAssetWebServiceCountResponse.class);
    }

    /**
     *查询资产管理Web服务列表
     * @param req DescribeAssetWebServiceInfoListRequest
     * @return DescribeAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceInfoListResponse DescribeAssetWebServiceInfoList(DescribeAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceInfoList", DescribeAssetWebServiceInfoListResponse.class);
    }

    /**
     *获取Web服务关联进程列表
     * @param req DescribeAssetWebServiceProcessListRequest
     * @return DescribeAssetWebServiceProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceProcessListResponse DescribeAssetWebServiceProcessList(DescribeAssetWebServiceProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceProcessList", DescribeAssetWebServiceProcessListResponse.class);
    }

    /**
     *网络攻击事件详情
     * @param req DescribeAttackEventInfoRequest
     * @return DescribeAttackEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackEventInfoResponse DescribeAttackEventInfo(DescribeAttackEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackEventInfo", DescribeAttackEventInfoResponse.class);
    }

    /**
     *按分页形式展示网络攻击检测事件列表
     * @param req DescribeAttackEventsRequest
     * @return DescribeAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackEventsResponse DescribeAttackEvents(DescribeAttackEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackEvents", DescribeAttackEventsResponse.class);
    }

    /**
     *DescribeAttackEvents 代替

按分页形式展示网络攻击日志列表
     * @param req DescribeAttackLogsRequest
     * @return DescribeAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogsResponse DescribeAttackLogs(DescribeAttackLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackLogs", DescribeAttackLogsResponse.class);
    }

    /**
     *已废弃

查询攻击溯源
     * @param req DescribeAttackSourceRequest
     * @return DescribeAttackSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackSourceResponse DescribeAttackSource(DescribeAttackSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackSource", DescribeAttackSourceResponse.class);
    }

    /**
     *已废弃

查询攻击溯源事件
     * @param req DescribeAttackSourceEventsRequest
     * @return DescribeAttackSourceEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackSourceEventsResponse DescribeAttackSourceEvents(DescribeAttackSourceEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackSourceEvents", DescribeAttackSourceEventsResponse.class);
    }

    /**
     *网络攻击数据统计
     * @param req DescribeAttackStatisticsRequest
     * @return DescribeAttackStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackStatisticsResponse DescribeAttackStatistics(DescribeAttackStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackStatistics", DescribeAttackStatisticsResponse.class);
    }

    /**
     *网络攻击top5数据列表
     * @param req DescribeAttackTopRequest
     * @return DescribeAttackTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTopResponse DescribeAttackTop(DescribeAttackTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackTop", DescribeAttackTopResponse.class);
    }

    /**
     *网络攻击趋势数据
     * @param req DescribeAttackTrendsRequest
     * @return DescribeAttackTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTrendsResponse DescribeAttackTrends(DescribeAttackTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackTrends", DescribeAttackTrendsResponse.class);
    }

    /**
     *获取网络攻击威胁类型列表
     * @param req DescribeAttackVulTypeListRequest
     * @return DescribeAttackVulTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackVulTypeListResponse DescribeAttackVulTypeList(DescribeAttackVulTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackVulTypeList", DescribeAttackVulTypeListResponse.class);
    }

    /**
     *专家服务-可用订单详情
     * @param req DescribeAvailableExpertServiceDetailRequest
     * @return DescribeAvailableExpertServiceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableExpertServiceDetailResponse DescribeAvailableExpertServiceDetail(DescribeAvailableExpertServiceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableExpertServiceDetail", DescribeAvailableExpertServiceDetailResponse.class);
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
     *获取阻断地域
     * @param req DescribeBanRegionsRequest
     * @return DescribeBanRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanRegionsResponse DescribeBanRegions(DescribeBanRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanRegions", DescribeBanRegionsResponse.class);
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
     *获取阻断白名单列表
     * @param req DescribeBanWhiteListRequest
     * @return DescribeBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanWhiteListResponse DescribeBanWhiteList(DescribeBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanWhiteList", DescribeBanWhiteListResponse.class);
    }

    /**
     *根据基线策略id查询基线策略数据概览统计
     * @param req DescribeBaselineAnalysisDataRequest
     * @return DescribeBaselineAnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAnalysisDataResponse DescribeBaselineAnalysisData(DescribeBaselineAnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineAnalysisData", DescribeBaselineAnalysisDataResponse.class);
    }

    /**
     *查询基线基础信息列表
     * @param req DescribeBaselineBasicInfoRequest
     * @return DescribeBaselineBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineBasicInfoResponse DescribeBaselineBasicInfo(DescribeBaselineBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineBasicInfo", DescribeBaselineBasicInfoResponse.class);
    }

    /**
     *查询基线默认策略列表信息
     * @param req DescribeBaselineDefaultStrategyListRequest
     * @return DescribeBaselineDefaultStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDefaultStrategyListResponse DescribeBaselineDefaultStrategyList(DescribeBaselineDefaultStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDefaultStrategyList", DescribeBaselineDefaultStrategyListResponse.class);
    }

    /**
     *根据基线id查询基线详情接口
     * @param req DescribeBaselineDetailRequest
     * @return DescribeBaselineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetailResponse DescribeBaselineDetail(DescribeBaselineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDetail", DescribeBaselineDetailResponse.class);
    }

    /**
     *获取基线检测详情记录
     * @param req DescribeBaselineDetectListRequest
     * @return DescribeBaselineDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetectListResponse DescribeBaselineDetectList(DescribeBaselineDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDetectList", DescribeBaselineDetectListResponse.class);
    }

    /**
     *获取基线检测概览
     * @param req DescribeBaselineDetectOverviewRequest
     * @return DescribeBaselineDetectOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetectOverviewResponse DescribeBaselineDetectOverview(DescribeBaselineDetectOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDetectOverview", DescribeBaselineDetectOverviewResponse.class);
    }

    /**
     *获取基线下载列表
     * @param req DescribeBaselineDownloadListRequest
     * @return DescribeBaselineDownloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDownloadListResponse DescribeBaselineDownloadList(DescribeBaselineDownloadListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDownloadList", DescribeBaselineDownloadListResponse.class);
    }

    /**
     *根据基线id查询基线影响主机列表
     * @param req DescribeBaselineEffectHostListRequest
     * @return DescribeBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineEffectHostListResponse DescribeBaselineEffectHostList(DescribeBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineEffectHostList", DescribeBaselineEffectHostListResponse.class);
    }

    /**
     *获取基线修复列表
     * @param req DescribeBaselineFixListRequest
     * @return DescribeBaselineFixListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineFixListResponse DescribeBaselineFixList(DescribeBaselineFixListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineFixList", DescribeBaselineFixListResponse.class);
    }

    /**
     *获取基线检测主机列表
     * @param req DescribeBaselineHostDetectListRequest
     * @return DescribeBaselineHostDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostDetectListResponse DescribeBaselineHostDetectList(DescribeBaselineHostDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineHostDetectList", DescribeBaselineHostDetectListResponse.class);
    }

    /**
     *获取忽略规则主机列表
     * @param req DescribeBaselineHostIgnoreListRequest
     * @return DescribeBaselineHostIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostIgnoreListResponse DescribeBaselineHostIgnoreList(DescribeBaselineHostIgnoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineHostIgnoreList", DescribeBaselineHostIgnoreListResponse.class);
    }

    /**
     *获取基线服务器风险TOP5
     * @param req DescribeBaselineHostRiskTopRequest
     * @return DescribeBaselineHostRiskTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostRiskTopResponse DescribeBaselineHostRiskTop(DescribeBaselineHostRiskTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineHostRiskTop", DescribeBaselineHostRiskTopResponse.class);
    }

    /**
     *接口返回TopN的风险服务器
     * @param req DescribeBaselineHostTopRequest
     * @return DescribeBaselineHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostTopResponse DescribeBaselineHostTop(DescribeBaselineHostTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineHostTop", DescribeBaselineHostTopResponse.class);
    }

    /**
     *获取基线检测项的列表
     * @param req DescribeBaselineItemDetectListRequest
     * @return DescribeBaselineItemDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemDetectListResponse DescribeBaselineItemDetectList(DescribeBaselineItemDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemDetectList", DescribeBaselineItemDetectListResponse.class);
    }

    /**
     *获取忽略规则项列表
     * @param req DescribeBaselineItemIgnoreListRequest
     * @return DescribeBaselineItemIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemIgnoreListResponse DescribeBaselineItemIgnoreList(DescribeBaselineItemIgnoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemIgnoreList", DescribeBaselineItemIgnoreListResponse.class);
    }

    /**
     *获取基线检测项信息
     * @param req DescribeBaselineItemInfoRequest
     * @return DescribeBaselineItemInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemInfoResponse DescribeBaselineItemInfo(DescribeBaselineItemInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemInfo", DescribeBaselineItemInfoResponse.class);
    }

    /**
     *获取基线项检测结果列表
     * @param req DescribeBaselineItemListRequest
     * @return DescribeBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemListResponse DescribeBaselineItemList(DescribeBaselineItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemList", DescribeBaselineItemListResponse.class);
    }

    /**
     *获取基线检测项TOP5
     * @param req DescribeBaselineItemRiskTopRequest
     * @return DescribeBaselineItemRiskTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemRiskTopResponse DescribeBaselineItemRiskTop(DescribeBaselineItemRiskTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemRiskTop", DescribeBaselineItemRiskTopResponse.class);
    }

    /**
     *查询基线列表信息
     * @param req DescribeBaselineListRequest
     * @return DescribeBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineListResponse DescribeBaselineList(DescribeBaselineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineList", DescribeBaselineListResponse.class);
    }

    /**
     *获取基线策略列表
     * @param req DescribeBaselinePolicyListRequest
     * @return DescribeBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyListResponse DescribeBaselinePolicyList(DescribeBaselinePolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyList", DescribeBaselinePolicyListResponse.class);
    }

    /**
     *根据基线id查询下属检测项信息
     * @param req DescribeBaselineRuleRequest
     * @return DescribeBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleResponse DescribeBaselineRule(DescribeBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineRule", DescribeBaselineRuleResponse.class);
    }

    /**
     *获取基线分类列表
     * @param req DescribeBaselineRuleCategoryListRequest
     * @return DescribeBaselineRuleCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleCategoryListResponse DescribeBaselineRuleCategoryList(DescribeBaselineRuleCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineRuleCategoryList", DescribeBaselineRuleCategoryListResponse.class);
    }

    /**
     *获取基线规则检测列表
     * @param req DescribeBaselineRuleDetectListRequest
     * @return DescribeBaselineRuleDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleDetectListResponse DescribeBaselineRuleDetectList(DescribeBaselineRuleDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineRuleDetectList", DescribeBaselineRuleDetectListResponse.class);
    }

    /**
     *获取基线忽略规则列表
     * @param req DescribeBaselineRuleIgnoreListRequest
     * @return DescribeBaselineRuleIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleIgnoreListResponse DescribeBaselineRuleIgnoreList(DescribeBaselineRuleIgnoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineRuleIgnoreList", DescribeBaselineRuleIgnoreListResponse.class);
    }

    /**
     *获取基线规则列表
     * @param req DescribeBaselineRuleListRequest
     * @return DescribeBaselineRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleListResponse DescribeBaselineRuleList(DescribeBaselineRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineRuleList", DescribeBaselineRuleListResponse.class);
    }

    /**
     *根据任务id查询基线检测进度
     * @param req DescribeBaselineScanScheduleRequest
     * @return DescribeBaselineScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineScanScheduleResponse DescribeBaselineScanSchedule(DescribeBaselineScanScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineScanSchedule", DescribeBaselineScanScheduleResponse.class);
    }

    /**
     *根据基线策略id查询策略详情
     * @param req DescribeBaselineStrategyDetailRequest
     * @return DescribeBaselineStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineStrategyDetailResponse DescribeBaselineStrategyDetail(DescribeBaselineStrategyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineStrategyDetail", DescribeBaselineStrategyDetailResponse.class);
    }

    /**
     *查询一个用户下的基线策略信息
     * @param req DescribeBaselineStrategyListRequest
     * @return DescribeBaselineStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineStrategyListResponse DescribeBaselineStrategyList(DescribeBaselineStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineStrategyList", DescribeBaselineStrategyListResponse.class);
    }

    /**
     *根据策略id查询基线检测项TOP
     * @param req DescribeBaselineTopRequest
     * @return DescribeBaselineTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineTopResponse DescribeBaselineTop(DescribeBaselineTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineTop", DescribeBaselineTopResponse.class);
    }

    /**
     *获取基线弱口令列表
     * @param req DescribeBaselineWeakPasswordListRequest
     * @return DescribeBaselineWeakPasswordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineWeakPasswordListResponse DescribeBaselineWeakPasswordList(DescribeBaselineWeakPasswordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineWeakPasswordList", DescribeBaselineWeakPasswordListResponse.class);
    }

    /**
     *获取高危命令列表
     * @param req DescribeBashEventsRequest
     * @return DescribeBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsResponse DescribeBashEvents(DescribeBashEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEvents", DescribeBashEventsResponse.class);
    }

    /**
     *查询高危命令事件详情
     * @param req DescribeBashEventsInfoRequest
     * @return DescribeBashEventsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsInfoResponse DescribeBashEventsInfo(DescribeBashEventsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEventsInfo", DescribeBashEventsInfoResponse.class);
    }

    /**
     *查询高危命令事件详情(新)
     * @param req DescribeBashEventsInfoNewRequest
     * @return DescribeBashEventsInfoNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsInfoNewResponse DescribeBashEventsInfoNew(DescribeBashEventsInfoNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEventsInfoNew", DescribeBashEventsInfoNewResponse.class);
    }

    /**
     *获取高危命令列表(新)
     * @param req DescribeBashEventsNewRequest
     * @return DescribeBashEventsNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsNewResponse DescribeBashEventsNew(DescribeBashEventsNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEventsNew", DescribeBashEventsNewResponse.class);
    }

    /**
     *获取高危命令策略列表
     * @param req DescribeBashPoliciesRequest
     * @return DescribeBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashPoliciesResponse DescribeBashPolicies(DescribeBashPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashPolicies", DescribeBashPoliciesResponse.class);
    }

    /**
     *获取高危命令规则列表
     * @param req DescribeBashRulesRequest
     * @return DescribeBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashRulesResponse DescribeBashRules(DescribeBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashRules", DescribeBashRulesResponse.class);
    }

    /**
     *获取密码破解列表
     * @param req DescribeBruteAttackListRequest
     * @return DescribeBruteAttackListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttackListResponse DescribeBruteAttackList(DescribeBruteAttackListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBruteAttackList", DescribeBruteAttackListResponse.class);
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
     *漏洞修护-查询可修护主机信息
     * @param req DescribeCanFixVulMachineRequest
     * @return DescribeCanFixVulMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCanFixVulMachineResponse DescribeCanFixVulMachine(DescribeCanFixVulMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCanFixVulMachine", DescribeCanFixVulMachineResponse.class);
    }

    /**
     *获取木马不可隔离的主机
     * @param req DescribeCanNotSeparateMachineRequest
     * @return DescribeCanNotSeparateMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCanNotSeparateMachineResponse DescribeCanNotSeparateMachine(DescribeCanNotSeparateMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCanNotSeparateMachine", DescribeCanNotSeparateMachineResponse.class);
    }

    /**
     *获取客户端异常事件
     * @param req DescribeClientExceptionRequest
     * @return DescribeClientExceptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientExceptionResponse DescribeClientException(DescribeClientExceptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientException", DescribeClientExceptionResponse.class);
    }

    /**
     *接口已无效

本接口 (DescribeComponentStatistics) 用于获取组件统计列表数据。
     * @param req DescribeComponentStatisticsRequest
     * @return DescribeComponentStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentStatisticsResponse DescribeComponentStatistics(DescribeComponentStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComponentStatistics", DescribeComponentStatisticsResponse.class);
    }

    /**
     *获取漏洞防御事件详情
     * @param req DescribeDefenceEventDetailRequest
     * @return DescribeDefenceEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefenceEventDetailResponse DescribeDefenceEventDetail(DescribeDefenceEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefenceEventDetail", DescribeDefenceEventDetailResponse.class);
    }

    /**
     *获取专线agent安装命令，包含token
     * @param req DescribeDirectConnectInstallCommandRequest
     * @return DescribeDirectConnectInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectInstallCommandResponse DescribeDirectConnectInstallCommand(DescribeDirectConnectInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnectInstallCommand", DescribeDirectConnectInstallCommandResponse.class);
    }

    /**
     *获取ES字段聚合结果
     * @param req DescribeESAggregationsRequest
     * @return DescribeESAggregationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAggregationsResponse DescribeESAggregations(DescribeESAggregationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeESAggregations", DescribeESAggregationsResponse.class);
    }

    /**
     *专家服务-应急响应列表
     * @param req DescribeEmergencyResponseListRequest
     * @return DescribeEmergencyResponseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyResponseListResponse DescribeEmergencyResponseList(DescribeEmergencyResponseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmergencyResponseList", DescribeEmergencyResponseListResponse.class);
    }

    /**
     *获取应急漏洞列表
     * @param req DescribeEmergencyVulListRequest
     * @return DescribeEmergencyVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyVulListResponse DescribeEmergencyVulList(DescribeEmergencyVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmergencyVulList", DescribeEmergencyVulListResponse.class);
    }

    /**
     *根据事件表名和id查询告警事件详情
     * @param req DescribeEventByTableRequest
     * @return DescribeEventByTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventByTableResponse DescribeEventByTable(DescribeEventByTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventByTable", DescribeEventByTableResponse.class);
    }

    /**
     *专家服务-安全管家列表
     * @param req DescribeExpertServiceListRequest
     * @return DescribeExpertServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceListResponse DescribeExpertServiceList(DescribeExpertServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExpertServiceList", DescribeExpertServiceListResponse.class);
    }

    /**
     *专家服务-专家服务订单列表
     * @param req DescribeExpertServiceOrderListRequest
     * @return DescribeExpertServiceOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceOrderListResponse DescribeExpertServiceOrderList(DescribeExpertServiceOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExpertServiceOrderList", DescribeExpertServiceOrderListResponse.class);
    }

    /**
     *本接口 (DescribeExportMachines) 用于导出区域主机列表。
     * @param req DescribeExportMachinesRequest
     * @return DescribeExportMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportMachinesResponse DescribeExportMachines(DescribeExportMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportMachines", DescribeExportMachinesResponse.class);
    }

    /**
     *日志快速分析统计
     * @param req DescribeFastAnalysisRequest
     * @return DescribeFastAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastAnalysisResponse DescribeFastAnalysis(DescribeFastAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFastAnalysis", DescribeFastAnalysisResponse.class);
    }

    /**
     *查看产生事件时规则详情接口
     * @param req DescribeFileTamperEventRuleInfoRequest
     * @return DescribeFileTamperEventRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperEventRuleInfoResponse DescribeFileTamperEventRuleInfo(DescribeFileTamperEventRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperEventRuleInfo", DescribeFileTamperEventRuleInfoResponse.class);
    }

    /**
     *核心文件监控事件列表
     * @param req DescribeFileTamperEventsRequest
     * @return DescribeFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperEventsResponse DescribeFileTamperEvents(DescribeFileTamperEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperEvents", DescribeFileTamperEventsResponse.class);
    }

    /**
     *查询主机关联文件监控规则数量
     * @param req DescribeFileTamperRuleCountRequest
     * @return DescribeFileTamperRuleCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRuleCountResponse DescribeFileTamperRuleCount(DescribeFileTamperRuleCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperRuleCount", DescribeFileTamperRuleCountResponse.class);
    }

    /**
     *查询某个监控规则的详情
     * @param req DescribeFileTamperRuleInfoRequest
     * @return DescribeFileTamperRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRuleInfoResponse DescribeFileTamperRuleInfo(DescribeFileTamperRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperRuleInfo", DescribeFileTamperRuleInfoResponse.class);
    }

    /**
     *核心文件监控规则列表
     * @param req DescribeFileTamperRulesRequest
     * @return DescribeFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRulesResponse DescribeFileTamperRules(DescribeFileTamperRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperRules", DescribeFileTamperRulesResponse.class);
    }

    /**
     *获取主机相关统计
     * @param req DescribeGeneralStatRequest
     * @return DescribeGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralStatResponse DescribeGeneralStat(DescribeGeneralStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralStat", DescribeGeneralStatResponse.class);
    }

    /**
     *本接口 (DescribeHistoryAccounts) 用于获取帐号变更历史列表数据。
     * @param req DescribeHistoryAccountsRequest
     * @return DescribeHistoryAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryAccountsResponse DescribeHistoryAccounts(DescribeHistoryAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHistoryAccounts", DescribeHistoryAccountsResponse.class);
    }

    /**
     *查询日志检索服务信息
     * @param req DescribeHistoryServiceRequest
     * @return DescribeHistoryServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryServiceResponse DescribeHistoryService(DescribeHistoryServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHistoryService", DescribeHistoryServiceResponse.class);
    }

    /**
     *主机信息与标签信息查询
     * @param req DescribeHostInfoRequest
     * @return DescribeHostInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostInfoResponse DescribeHostInfo(DescribeHostInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostInfo", DescribeHostInfoResponse.class);
    }

    /**
     *获取登录审计列表
     * @param req DescribeHostLoginListRequest
     * @return DescribeHostLoginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLoginListResponse DescribeHostLoginList(DescribeHostLoginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostLoginList", DescribeHostLoginListResponse.class);
    }

    /**
     *获取全网热点漏洞
     * @param req DescribeHotVulTopRequest
     * @return DescribeHotVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHotVulTopResponse DescribeHotVulTop(DescribeHotVulTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHotVulTop", DescribeHotVulTopResponse.class);
    }

    /**
     *查询已经忽略的检测项信息
     * @param req DescribeIgnoreBaselineRuleRequest
     * @return DescribeIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreBaselineRuleResponse DescribeIgnoreBaselineRule(DescribeIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgnoreBaselineRule", DescribeIgnoreBaselineRuleResponse.class);
    }

    /**
     *获取一键忽略受影响的检测项和主机信息
     * @param req DescribeIgnoreHostAndItemConfigRequest
     * @return DescribeIgnoreHostAndItemConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreHostAndItemConfigResponse DescribeIgnoreHostAndItemConfig(DescribeIgnoreHostAndItemConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgnoreHostAndItemConfig", DescribeIgnoreHostAndItemConfigResponse.class);
    }

    /**
     *根据检测项id与筛选条件查询忽略检测项影响主机列表信息
     * @param req DescribeIgnoreRuleEffectHostListRequest
     * @return DescribeIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreRuleEffectHostListResponse DescribeIgnoreRuleEffectHostList(DescribeIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgnoreRuleEffectHostList", DescribeIgnoreRuleEffectHostListResponse.class);
    }

    /**
     *查询批量导入机器信息
     * @param req DescribeImportMachineInfoRequest
     * @return DescribeImportMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportMachineInfoResponse DescribeImportMachineInfo(DescribeImportMachineInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImportMachineInfo", DescribeImportMachineInfoResponse.class);
    }

    /**
     *接口已废弃

获取索引列表
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexList", DescribeIndexListResponse.class);
    }

    /**
     *查询java内存马事件详细信息
     * @param req DescribeJavaMemShellInfoRequest
     * @return DescribeJavaMemShellInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellInfoResponse DescribeJavaMemShellInfo(DescribeJavaMemShellInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellInfo", DescribeJavaMemShellInfoResponse.class);
    }

    /**
     *查询java内存马事件列表
     * @param req DescribeJavaMemShellListRequest
     * @return DescribeJavaMemShellListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellListResponse DescribeJavaMemShellList(DescribeJavaMemShellListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellList", DescribeJavaMemShellListResponse.class);
    }

    /**
     *查询给定主机java内存马插件信息
     * @param req DescribeJavaMemShellPluginInfoRequest
     * @return DescribeJavaMemShellPluginInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellPluginInfoResponse DescribeJavaMemShellPluginInfo(DescribeJavaMemShellPluginInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellPluginInfo", DescribeJavaMemShellPluginInfoResponse.class);
    }

    /**
     *查询java内存马插件列表
     * @param req DescribeJavaMemShellPluginListRequest
     * @return DescribeJavaMemShellPluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellPluginListResponse DescribeJavaMemShellPluginList(DescribeJavaMemShellPluginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellPluginList", DescribeJavaMemShellPluginListResponse.class);
    }

    /**
     *查询授权信息
     * @param req DescribeLicenseRequest
     * @return DescribeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseResponse DescribeLicense(DescribeLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicense", DescribeLicenseResponse.class);
    }

    /**
     *该接口可以获取设置中心-授权管理,某个授权下已绑定的授权机器列表
     * @param req DescribeLicenseBindListRequest
     * @return DescribeLicenseBindListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseBindListResponse DescribeLicenseBindList(DescribeLicenseBindListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseBindList", DescribeLicenseBindListResponse.class);
    }

    /**
     *查询授权绑定任务的进度
     * @param req DescribeLicenseBindScheduleRequest
     * @return DescribeLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseBindScheduleResponse DescribeLicenseBindSchedule(DescribeLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseBindSchedule", DescribeLicenseBindScheduleResponse.class);
    }

    /**
     *授权管理-授权概览信息
     * @param req DescribeLicenseGeneralRequest
     * @return DescribeLicenseGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseGeneralResponse DescribeLicenseGeneral(DescribeLicenseGeneralRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseGeneral", DescribeLicenseGeneralResponse.class);
    }

    /**
     *获取用户所有授权订单信息
     * @param req DescribeLicenseListRequest
     * @return DescribeLicenseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseListResponse DescribeLicenseList(DescribeLicenseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseList", DescribeLicenseListResponse.class);
    }

    /**
     *查询授权白名单的可用配置
     * @param req DescribeLicenseWhiteConfigRequest
     * @return DescribeLicenseWhiteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseWhiteConfigResponse DescribeLicenseWhiteConfig(DescribeLicenseWhiteConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseWhiteConfig", DescribeLicenseWhiteConfigResponse.class);
    }

    /**
     *查询日志投递kafka可选项列表
     * @param req DescribeLogDeliveryKafkaOptionsRequest
     * @return DescribeLogDeliveryKafkaOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDeliveryKafkaOptionsResponse DescribeLogDeliveryKafkaOptions(DescribeLogDeliveryKafkaOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogDeliveryKafkaOptions", DescribeLogDeliveryKafkaOptionsResponse.class);
    }

    /**
     *获取日志下载任务列表
     * @param req DescribeLogExportsRequest
     * @return DescribeLogExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogExportsResponse DescribeLogExports(DescribeLogExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogExports", DescribeLogExportsResponse.class);
    }

    /**
     *获取日志直方图信息
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogHistogram", DescribeLogHistogramResponse.class);
    }

    /**
     *查询索引
     * @param req DescribeLogIndexRequest
     * @return DescribeLogIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogIndexResponse DescribeLogIndex(DescribeLogIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogIndex", DescribeLogIndexResponse.class);
    }

    /**
     *获取kafka投递信息
     * @param req DescribeLogKafkaDeliverInfoRequest
     * @return DescribeLogKafkaDeliverInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogKafkaDeliverInfoResponse DescribeLogKafkaDeliverInfo(DescribeLogKafkaDeliverInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogKafkaDeliverInfo", DescribeLogKafkaDeliverInfoResponse.class);
    }

    /**
     *获取日志存储配置
     * @param req DescribeLogStorageConfigRequest
     * @return DescribeLogStorageConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageConfigResponse DescribeLogStorageConfig(DescribeLogStorageConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogStorageConfig", DescribeLogStorageConfigResponse.class);
    }

    /**
     *获取日志存储量记录
     * @param req DescribeLogStorageRecordRequest
     * @return DescribeLogStorageRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageRecordResponse DescribeLogStorageRecord(DescribeLogStorageRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogStorageRecord", DescribeLogStorageRecordResponse.class);
    }

    /**
     *获取日志检索容量使用统计
     * @param req DescribeLogStorageStatisticRequest
     * @return DescribeLogStorageStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageStatisticResponse DescribeLogStorageStatistic(DescribeLogStorageStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogStorageStatistic", DescribeLogStorageStatisticResponse.class);
    }

    /**
     *日志分析功能-获取日志类型，使用该接口返回的结果暂时可过滤的日志类型
     * @param req DescribeLogTypeRequest
     * @return DescribeLogTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTypeResponse DescribeLogType(DescribeLogTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogType", DescribeLogTypeResponse.class);
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
     *获取异地登录白名单列表
     * @param req DescribeLoginWhiteListRequest
     * @return DescribeLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteListResponse DescribeLoginWhiteList(DescribeLoginWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginWhiteList", DescribeLoginWhiteListResponse.class);
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
     *查询主机高级防御事件数统计
     * @param req DescribeMachineDefenseCntRequest
     * @return DescribeMachineDefenseCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineDefenseCntResponse DescribeMachineDefenseCnt(DescribeMachineDefenseCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineDefenseCnt", DescribeMachineDefenseCntResponse.class);
    }

    /**
     *查询主机相关核心文件监控规则列表
     * @param req DescribeMachineFileTamperRulesRequest
     * @return DescribeMachineFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineFileTamperRulesResponse DescribeMachineFileTamperRules(DescribeMachineFileTamperRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineFileTamperRules", DescribeMachineFileTamperRulesResponse.class);
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
     *本接口（DescribeMachineInfo）用于获取机器详细信息。
     * @param req DescribeMachineInfoRequest
     * @return DescribeMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineInfoResponse DescribeMachineInfo(DescribeMachineInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineInfo", DescribeMachineInfoResponse.class);
    }

    /**
     *本接口 (DescribeMachineLicenseDetail)查询机器授权信息
     * @param req DescribeMachineLicenseDetailRequest
     * @return DescribeMachineLicenseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineLicenseDetailResponse DescribeMachineLicenseDetail(DescribeMachineLicenseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineLicenseDetail", DescribeMachineLicenseDetailResponse.class);
    }

    /**
     *用于网页防篡改获取区域主机列表。
     * @param req DescribeMachineListRequest
     * @return DescribeMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineListResponse DescribeMachineList(DescribeMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineList", DescribeMachineListResponse.class);
    }

    /**
     *查询可筛选操作系统列表.
     * @param req DescribeMachineOsListRequest
     * @return DescribeMachineOsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineOsListResponse DescribeMachineOsList(DescribeMachineOsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineOsList", DescribeMachineOsListResponse.class);
    }

    /**
     *查询主机地域列表
     * @param req DescribeMachineRegionListRequest
     * @return DescribeMachineRegionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionListResponse DescribeMachineRegionList(DescribeMachineRegionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineRegionList", DescribeMachineRegionListResponse.class);
    }

    /**
     *获取机器地域列表
     * @param req DescribeMachineRegionsRequest
     * @return DescribeMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionsResponse DescribeMachineRegions(DescribeMachineRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineRegions", DescribeMachineRegionsResponse.class);
    }

    /**
     *查询主机入侵检测事件统计
     * @param req DescribeMachineRiskCntRequest
     * @return DescribeMachineRiskCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRiskCntResponse DescribeMachineRiskCnt(DescribeMachineRiskCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineRiskCnt", DescribeMachineRiskCntResponse.class);
    }

    /**
     *漏洞修护-查询主机创建的快照
     * @param req DescribeMachineSnapshotRequest
     * @return DescribeMachineSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineSnapshotResponse DescribeMachineSnapshot(DescribeMachineSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineSnapshot", DescribeMachineSnapshotResponse.class);
    }

    /**
     *本接口 (DescribeMachines) 用于获取区域主机列表。
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachines", DescribeMachinesResponse.class);
    }

    /**
     *本接口 (DescribeMachinesSimple) 用于获取主机列表。
     * @param req DescribeMachinesSimpleRequest
     * @return DescribeMachinesSimpleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesSimpleResponse DescribeMachinesSimple(DescribeMachinesSimpleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachinesSimple", DescribeMachinesSimpleResponse.class);
    }

    /**
     *入侵检测获取木马列表
     * @param req DescribeMalWareListRequest
     * @return DescribeMalWareListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalWareListResponse DescribeMalWareList(DescribeMalWareListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalWareList", DescribeMalWareListResponse.class);
    }

    /**
     *查询恶意请求白名单列表
     * @param req DescribeMaliciousRequestWhiteListRequest
     * @return DescribeMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaliciousRequestWhiteListResponse DescribeMaliciousRequestWhiteList(DescribeMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaliciousRequestWhiteList", DescribeMaliciousRequestWhiteListResponse.class);
    }

    /**
     *获取木马文件下载地址
     * @param req DescribeMalwareFileRequest
     * @return DescribeMalwareFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareFileResponse DescribeMalwareFile(DescribeMalwareFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareFile", DescribeMalwareFileResponse.class);
    }

    /**
     *查看恶意文件详情
     * @param req DescribeMalwareInfoRequest
     * @return DescribeMalwareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareInfoResponse DescribeMalwareInfo(DescribeMalwareInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareInfo", DescribeMalwareInfoResponse.class);
    }

    /**
     *获取文件查杀概览信息
     * @param req DescribeMalwareRiskOverviewRequest
     * @return DescribeMalwareRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskOverviewResponse DescribeMalwareRiskOverview(DescribeMalwareRiskOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareRiskOverview", DescribeMalwareRiskOverviewResponse.class);
    }

    /**
     *打开入侵检测-恶意文件检测,弹出风险预警内容
     * @param req DescribeMalwareRiskWarningRequest
     * @return DescribeMalwareRiskWarningResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskWarningResponse DescribeMalwareRiskWarning(DescribeMalwareRiskWarningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareRiskWarning", DescribeMalwareRiskWarningResponse.class);
    }

    /**
     *查询定时扫描配置
     * @param req DescribeMalwareTimingScanSettingRequest
     * @return DescribeMalwareTimingScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareTimingScanSettingResponse DescribeMalwareTimingScanSetting(DescribeMalwareTimingScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareTimingScanSetting", DescribeMalwareTimingScanSettingResponse.class);
    }

    /**
     *获取木马白名单列表
     * @param req DescribeMalwareWhiteListRequest
     * @return DescribeMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareWhiteListResponse DescribeMalwareWhiteList(DescribeMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareWhiteList", DescribeMalwareWhiteListResponse.class);
    }

    /**
     *获取木马白名单受影响列表
     * @param req DescribeMalwareWhiteListAffectListRequest
     * @return DescribeMalwareWhiteListAffectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareWhiteListAffectListResponse DescribeMalwareWhiteListAffectList(DescribeMalwareWhiteListAffectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareWhiteListAffectList", DescribeMalwareWhiteListAffectListResponse.class);
    }

    /**
     *专家服务-安全管家月巡检报告下载
     * @param req DescribeMonthInspectionReportRequest
     * @return DescribeMonthInspectionReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonthInspectionReportResponse DescribeMonthInspectionReport(DescribeMonthInspectionReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonthInspectionReport", DescribeMonthInspectionReportResponse.class);
    }

    /**
     *查询网络攻击设置
     * @param req DescribeNetAttackSettingRequest
     * @return DescribeNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackSettingResponse DescribeNetAttackSetting(DescribeNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetAttackSetting", DescribeNetAttackSettingResponse.class);
    }

    /**
     *获取网络攻击白名单列表
     * @param req DescribeNetAttackWhiteListRequest
     * @return DescribeNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackWhiteListResponse DescribeNetAttackWhiteList(DescribeNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetAttackWhiteList", DescribeNetAttackWhiteListResponse.class);
    }

    /**
     *本接口 (DescribeOpenPortStatistics) 用于获取端口统计列表。
     * @param req DescribeOpenPortStatisticsRequest
     * @return DescribeOpenPortStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortStatisticsResponse DescribeOpenPortStatistics(DescribeOpenPortStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpenPortStatistics", DescribeOpenPortStatisticsResponse.class);
    }

    /**
     *获取概览统计数据。
     * @param req DescribeOverviewStatisticsRequest
     * @return DescribeOverviewStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewStatisticsResponse DescribeOverviewStatistics(DescribeOverviewStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewStatistics", DescribeOverviewStatisticsResponse.class);
    }

    /**
     *本地提权信息详情
     * @param req DescribePrivilegeEventInfoRequest
     * @return DescribePrivilegeEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeEventInfoResponse DescribePrivilegeEventInfo(DescribePrivilegeEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivilegeEventInfo", DescribePrivilegeEventInfoResponse.class);
    }

    /**
     *获取本地提权事件列表
     * @param req DescribePrivilegeEventsRequest
     * @return DescribePrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeEventsResponse DescribePrivilegeEvents(DescribePrivilegeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivilegeEvents", DescribePrivilegeEventsResponse.class);
    }

    /**
     *获取本地提权规则列表
     * @param req DescribePrivilegeRulesRequest
     * @return DescribePrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeRulesResponse DescribePrivilegeRules(DescribePrivilegeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivilegeRules", DescribePrivilegeRulesResponse.class);
    }

    /**
     *用于获取专业版概览信息。
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProVersionInfo", DescribeProVersionInfoResponse.class);
    }

    /**
     *用于获取单台主机或所有主机是否开通专业版状态。
     * @param req DescribeProVersionStatusRequest
     * @return DescribeProVersionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionStatusResponse DescribeProVersionStatus(DescribeProVersionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProVersionStatus", DescribeProVersionStatusResponse.class);
    }

    /**
     *本接口 (DescribeProcessStatistics) 用于获取进程统计列表数据。
     * @param req DescribeProcessStatisticsRequest
     * @return DescribeProcessStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessStatisticsResponse DescribeProcessStatistics(DescribeProcessStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessStatistics", DescribeProcessStatisticsResponse.class);
    }

    /**
     *产品试用状态查询接口
     * @param req DescribeProductStatusRequest
     * @return DescribeProductStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductStatusResponse DescribeProductStatus(DescribeProductStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductStatus", DescribeProductStatusResponse.class);
    }

    /**
     *网页防篡改防护目录列表
     * @param req DescribeProtectDirListRequest
     * @return DescribeProtectDirListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectDirListResponse DescribeProtectDirList(DescribeProtectDirListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectDirList", DescribeProtectDirListResponse.class);
    }

    /**
     *查询防护目录关联服务器列表信息
     * @param req DescribeProtectDirRelatedServerRequest
     * @return DescribeProtectDirRelatedServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectDirRelatedServerResponse DescribeProtectDirRelatedServer(DescribeProtectDirRelatedServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectDirRelatedServer", DescribeProtectDirRelatedServerResponse.class);
    }

    /**
     *专家服务-旗舰重保列表
     * @param req DescribeProtectNetListRequest
     * @return DescribeProtectNetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectNetListResponse DescribeProtectNetList(DescribeProtectNetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectNetList", DescribeProtectNetListResponse.class);
    }

    /**
     *获取公网接入代理安装命令
     * @param req DescribePublicProxyInstallCommandRequest
     * @return DescribePublicProxyInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicProxyInstallCommandResponse DescribePublicProxyInstallCommand(DescribePublicProxyInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicProxyInstallCommand", DescribePublicProxyInstallCommandResponse.class);
    }

    /**
     *查询主机快照备份列表
     * @param req DescribeRansomDefenseBackupListRequest
     * @return DescribeRansomDefenseBackupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseBackupListResponse DescribeRansomDefenseBackupList(DescribeRansomDefenseBackupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseBackupList", DescribeRansomDefenseBackupListResponse.class);
    }

    /**
     *查询防勒索事件列表
     * @param req DescribeRansomDefenseEventsListRequest
     * @return DescribeRansomDefenseEventsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseEventsListResponse DescribeRansomDefenseEventsList(DescribeRansomDefenseEventsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseEventsList", DescribeRansomDefenseEventsListResponse.class);
    }

    /**
     *查询备份详情列表
     * @param req DescribeRansomDefenseMachineListRequest
     * @return DescribeRansomDefenseMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseMachineListResponse DescribeRansomDefenseMachineList(DescribeRansomDefenseMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseMachineList", DescribeRansomDefenseMachineListResponse.class);
    }

    /**
     *获取主机绑定策略列表
     * @param req DescribeRansomDefenseMachineStrategyInfoRequest
     * @return DescribeRansomDefenseMachineStrategyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseMachineStrategyInfoResponse DescribeRansomDefenseMachineStrategyInfo(DescribeRansomDefenseMachineStrategyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseMachineStrategyInfo", DescribeRansomDefenseMachineStrategyInfoResponse.class);
    }

    /**
     *查询回滚任务列表
     * @param req DescribeRansomDefenseRollBackTaskListRequest
     * @return DescribeRansomDefenseRollBackTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseRollBackTaskListResponse DescribeRansomDefenseRollBackTaskList(DescribeRansomDefenseRollBackTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseRollBackTaskList", DescribeRansomDefenseRollBackTaskListResponse.class);
    }

    /**
     *获取用户防勒索趋势
     * @param req DescribeRansomDefenseStateRequest
     * @return DescribeRansomDefenseStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStateResponse DescribeRansomDefenseState(DescribeRansomDefenseStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseState", DescribeRansomDefenseStateResponse.class);
    }

    /**
     *获取策略详情
     * @param req DescribeRansomDefenseStrategyDetailRequest
     * @return DescribeRansomDefenseStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyDetailResponse DescribeRansomDefenseStrategyDetail(DescribeRansomDefenseStrategyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseStrategyDetail", DescribeRansomDefenseStrategyDetailResponse.class);
    }

    /**
     *查询防勒索策略列表
     * @param req DescribeRansomDefenseStrategyListRequest
     * @return DescribeRansomDefenseStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyListResponse DescribeRansomDefenseStrategyList(DescribeRansomDefenseStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseStrategyList", DescribeRansomDefenseStrategyListResponse.class);
    }

    /**
     *查询防勒索策略绑定机器列表
     * @param req DescribeRansomDefenseStrategyMachinesRequest
     * @return DescribeRansomDefenseStrategyMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyMachinesResponse DescribeRansomDefenseStrategyMachines(DescribeRansomDefenseStrategyMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseStrategyMachines", DescribeRansomDefenseStrategyMachinesResponse.class);
    }

    /**
     *获取全网勒索态势
     * @param req DescribeRansomDefenseTrendRequest
     * @return DescribeRansomDefenseTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseTrendResponse DescribeRansomDefenseTrend(DescribeRansomDefenseTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseTrend", DescribeRansomDefenseTrendResponse.class);
    }

    /**
     *查询推荐购买防护核数
     * @param req DescribeRecommendedProtectCpuRequest
     * @return DescribeRecommendedProtectCpuResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecommendedProtectCpuResponse DescribeRecommendedProtectCpu(DescribeRecommendedProtectCpuRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecommendedProtectCpu", DescribeRecommendedProtectCpuResponse.class);
    }

    /**
     *反弹shell信息详情
     * @param req DescribeReverseShellEventInfoRequest
     * @return DescribeReverseShellEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventInfoResponse DescribeReverseShellEventInfo(DescribeReverseShellEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellEventInfo", DescribeReverseShellEventInfoResponse.class);
    }

    /**
     *获取反弹Shell列表
     * @param req DescribeReverseShellEventsRequest
     * @return DescribeReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsResponse DescribeReverseShellEvents(DescribeReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellEvents", DescribeReverseShellEventsResponse.class);
    }

    /**
     *获取反弹Shell规则列表
     * @param req DescribeReverseShellRulesRequest
     * @return DescribeReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellRulesResponse DescribeReverseShellRules(DescribeReverseShellRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellRules", DescribeReverseShellRulesResponse.class);
    }

    /**
     *查询入侵检测事件更新状态任务是否完成
     * @param req DescribeRiskBatchStatusRequest
     * @return DescribeRiskBatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskBatchStatusResponse DescribeRiskBatchStatus(DescribeRiskBatchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskBatchStatus", DescribeRiskBatchStatusResponse.class);
    }

    /**
     *查询恶意请求事件详情
     * @param req DescribeRiskDnsEventInfoRequest
     * @return DescribeRiskDnsEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventInfoResponse DescribeRiskDnsEventInfo(DescribeRiskDnsEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsEventInfo", DescribeRiskDnsEventInfoResponse.class);
    }

    /**
     *获取恶意请求事件列表
     * @param req DescribeRiskDnsEventListRequest
     * @return DescribeRiskDnsEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventListResponse DescribeRiskDnsEventList(DescribeRiskDnsEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsEventList", DescribeRiskDnsEventListResponse.class);
    }

    /**
     *查询恶意请求详情
     * @param req DescribeRiskDnsInfoRequest
     * @return DescribeRiskDnsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsInfoResponse DescribeRiskDnsInfo(DescribeRiskDnsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsInfo", DescribeRiskDnsInfoResponse.class);
    }

    /**
     *入侵检测，获取恶意请求列表
     * @param req DescribeRiskDnsListRequest
     * @return DescribeRiskDnsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsListResponse DescribeRiskDnsList(DescribeRiskDnsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsList", DescribeRiskDnsListResponse.class);
    }

    /**
     *获取恶意请求策略列表
     * @param req DescribeRiskDnsPolicyListRequest
     * @return DescribeRiskDnsPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsPolicyListResponse DescribeRiskDnsPolicyList(DescribeRiskDnsPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsPolicyList", DescribeRiskDnsPolicyListResponse.class);
    }

    /**
     *获取异常进程列表
     * @param req DescribeRiskProcessEventsRequest
     * @return DescribeRiskProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskProcessEventsResponse DescribeRiskProcessEvents(DescribeRiskProcessEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskProcessEvents", DescribeRiskProcessEventsResponse.class);
    }

    /**
     *查询安全通知信息
     * @param req DescribeSafeInfoRequest
     * @return DescribeSafeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeInfoResponse DescribeSafeInfo(DescribeSafeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafeInfo", DescribeSafeInfoResponse.class);
    }

    /**
     *查询木马扫描进度
     * @param req DescribeScanMalwareScheduleRequest
     * @return DescribeScanMalwareScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanMalwareScheduleResponse DescribeScanMalwareSchedule(DescribeScanMalwareScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanMalwareSchedule", DescribeScanMalwareScheduleResponse.class);
    }

    /**
     *根据taskid查询检测进度
     * @param req DescribeScanScheduleRequest
     * @return DescribeScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanScheduleResponse DescribeScanSchedule(DescribeScanScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanSchedule", DescribeScanScheduleResponse.class);
    }

    /**
     *DescribeScanState 该接口能查询对应模块正在进行的扫描任务状态
     * @param req DescribeScanStateRequest
     * @return DescribeScanStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStateResponse DescribeScanState(DescribeScanStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanState", DescribeScanStateResponse.class);
    }

    /**
     *DescribeScanTaskDetails 查询扫描任务详情 , 可以查询扫描进度信息/异常;
     * @param req DescribeScanTaskDetailsRequest
     * @return DescribeScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskDetailsResponse DescribeScanTaskDetails(DescribeScanTaskDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskDetails", DescribeScanTaskDetailsResponse.class);
    }

    /**
     *DescribeScanTaskStatus 查询机器扫描状态列表用于过滤筛选
     * @param req DescribeScanTaskStatusRequest
     * @return DescribeScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskStatusResponse DescribeScanTaskStatus(DescribeScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskStatus", DescribeScanTaskStatusResponse.class);
    }

    /**
     *查询定期检测的配置
     * @param req DescribeScanVulSettingRequest
     * @return DescribeScanVulSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanVulSettingResponse DescribeScanVulSetting(DescribeScanVulSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanVulSetting", DescribeScanVulSettingResponse.class);
    }

    /**
     *大屏可视化获取全网攻击热点
     * @param req DescribeScreenAttackHotspotRequest
     * @return DescribeScreenAttackHotspotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenAttackHotspotResponse DescribeScreenAttackHotspot(DescribeScreenAttackHotspotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenAttackHotspot", DescribeScreenAttackHotspotResponse.class);
    }

    /**
     *大屏可视化安全播报
     * @param req DescribeScreenBroadcastsRequest
     * @return DescribeScreenBroadcastsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenBroadcastsResponse DescribeScreenBroadcasts(DescribeScreenBroadcastsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenBroadcasts", DescribeScreenBroadcastsResponse.class);
    }

    /**
     *大屏可视化防趋势接口
     * @param req DescribeScreenDefenseTrendsRequest
     * @return DescribeScreenDefenseTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenDefenseTrendsResponse DescribeScreenDefenseTrends(DescribeScreenDefenseTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenDefenseTrends", DescribeScreenDefenseTrendsResponse.class);
    }

    /**
     *大屏可视化紧急通知
     * @param req DescribeScreenEmergentMsgRequest
     * @return DescribeScreenEmergentMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenEmergentMsgResponse DescribeScreenEmergentMsg(DescribeScreenEmergentMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenEmergentMsg", DescribeScreenEmergentMsgResponse.class);
    }

    /**
     *大屏可视化获取安全概览相关事件统计数据接口
     * @param req DescribeScreenEventsCntRequest
     * @return DescribeScreenEventsCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenEventsCntResponse DescribeScreenEventsCnt(DescribeScreenEventsCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenEventsCnt", DescribeScreenEventsCntResponse.class);
    }

    /**
     *大屏可视化获取主机相关统计
     * @param req DescribeScreenGeneralStatRequest
     * @return DescribeScreenGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenGeneralStatResponse DescribeScreenGeneralStat(DescribeScreenGeneralStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenGeneralStat", DescribeScreenGeneralStatResponse.class);
    }

    /**
     *大屏可视化主机入侵详情
     * @param req DescribeScreenHostInvasionRequest
     * @return DescribeScreenHostInvasionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenHostInvasionResponse DescribeScreenHostInvasion(DescribeScreenHostInvasionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenHostInvasion", DescribeScreenHostInvasionResponse.class);
    }

    /**
     *大屏可视化主机区域选项列表
     * @param req DescribeScreenMachineRegionsRequest
     * @return DescribeScreenMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenMachineRegionsResponse DescribeScreenMachineRegions(DescribeScreenMachineRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenMachineRegions", DescribeScreenMachineRegionsResponse.class);
    }

    /**
     *大屏可视化主机区域列表
     * @param req DescribeScreenMachinesRequest
     * @return DescribeScreenMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenMachinesResponse DescribeScreenMachines(DescribeScreenMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenMachines", DescribeScreenMachinesResponse.class);
    }

    /**
     *大屏可视化主机安全防护引擎介绍
     * @param req DescribeScreenProtectionCntRequest
     * @return DescribeScreenProtectionCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenProtectionCntResponse DescribeScreenProtectionCnt(DescribeScreenProtectionCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenProtectionCnt", DescribeScreenProtectionCntResponse.class);
    }

    /**
     *大屏获取安全防护状态
     * @param req DescribeScreenProtectionStatRequest
     * @return DescribeScreenProtectionStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenProtectionStatResponse DescribeScreenProtectionStat(DescribeScreenProtectionStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenProtectionStat", DescribeScreenProtectionStatResponse.class);
    }

    /**
     *大屏可视化风险资产top5（今日），统计今日风险资产
     * @param req DescribeScreenRiskAssetsTopRequest
     * @return DescribeScreenRiskAssetsTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenRiskAssetsTopResponse DescribeScreenRiskAssetsTop(DescribeScreenRiskAssetsTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenRiskAssetsTop", DescribeScreenRiskAssetsTopResponse.class);
    }

    /**
     *获取历史搜索记录
     * @param req DescribeSearchLogsRequest
     * @return DescribeSearchLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchLogsResponse DescribeSearchLogs(DescribeSearchLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchLogs", DescribeSearchLogsResponse.class);
    }

    /**
     *获取快速检索列表
     * @param req DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchTemplatesResponse DescribeSearchTemplates(DescribeSearchTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchTemplates", DescribeSearchTemplatesResponse.class);
    }

    /**
     *查询安全播报文章信息
     * @param req DescribeSecurityBroadcastInfoRequest
     * @return DescribeSecurityBroadcastInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityBroadcastInfoResponse DescribeSecurityBroadcastInfo(DescribeSecurityBroadcastInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityBroadcastInfo", DescribeSecurityBroadcastInfoResponse.class);
    }

    /**
     *安全播报列表页
     * @param req DescribeSecurityBroadcastsRequest
     * @return DescribeSecurityBroadcastsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityBroadcastsResponse DescribeSecurityBroadcasts(DescribeSecurityBroadcastsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityBroadcasts", DescribeSecurityBroadcastsResponse.class);
    }

    /**
     *本接口 (DescribeSecurityDynamics) 用于获取安全事件动态消息数据。
     * @param req DescribeSecurityDynamicsRequest
     * @return DescribeSecurityDynamicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityDynamicsResponse DescribeSecurityDynamics(DescribeSecurityDynamicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityDynamics", DescribeSecurityDynamicsResponse.class);
    }

    /**
     *获取安全事件统计
     * @param req DescribeSecurityEventStatRequest
     * @return DescribeSecurityEventStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityEventStatResponse DescribeSecurityEventStat(DescribeSecurityEventStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityEventStat", DescribeSecurityEventStatResponse.class);
    }

    /**
     *获取安全概览相关事件统计数据接口
     * @param req DescribeSecurityEventsCntRequest
     * @return DescribeSecurityEventsCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityEventsCntResponse DescribeSecurityEventsCnt(DescribeSecurityEventsCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityEventsCnt", DescribeSecurityEventsCntResponse.class);
    }

    /**
     *接口已无效

获取安全防护状态汇总
     * @param req DescribeSecurityProtectionStatRequest
     * @return DescribeSecurityProtectionStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityProtectionStatResponse DescribeSecurityProtectionStat(DescribeSecurityProtectionStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityProtectionStat", DescribeSecurityProtectionStatResponse.class);
    }

    /**
     *本接口 (DescribeSecurityTrends) 用于获取安全事件统计数据。
     * @param req DescribeSecurityTrendsRequest
     * @return DescribeSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTrendsResponse DescribeSecurityTrends(DescribeSecurityTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityTrends", DescribeSecurityTrendsResponse.class);
    }

    /**
     *查询服务区关联目录详情
     * @param req DescribeServerRelatedDirInfoRequest
     * @return DescribeServerRelatedDirInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerRelatedDirInfoResponse DescribeServerRelatedDirInfo(DescribeServerRelatedDirInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerRelatedDirInfo", DescribeServerRelatedDirInfoResponse.class);
    }

    /**
     *获取待处理风险文件数+影响服务器数+是否试用检测+最近检测时间
     * @param req DescribeServersAndRiskAndFirstInfoRequest
     * @return DescribeServersAndRiskAndFirstInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServersAndRiskAndFirstInfoResponse DescribeServersAndRiskAndFirstInfo(DescribeServersAndRiskAndFirstInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServersAndRiskAndFirstInfo", DescribeServersAndRiskAndFirstInfoResponse.class);
    }

    /**
     *根据策略名查询策略是否存在
     * @param req DescribeStrategyExistRequest
     * @return DescribeStrategyExistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyExistResponse DescribeStrategyExist(DescribeStrategyExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategyExist", DescribeStrategyExistResponse.class);
    }

    /**
     *获取指定标签关联的服务器信息
     * @param req DescribeTagMachinesRequest
     * @return DescribeTagMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagMachinesResponse DescribeTagMachines(DescribeTagMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagMachines", DescribeTagMachinesResponse.class);
    }

    /**
     *获取所有主机标签
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTags", DescribeTagsResponse.class);
    }

    /**
     *查询主机安全授权试用报告(仅限控制台申领的)
     * @param req DescribeTrialReportRequest
     * @return DescribeTrialReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrialReportResponse DescribeTrialReport(DescribeTrialReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrialReport", DescribeTrialReportResponse.class);
    }

    /**
     *获取漏洞管理模块指定类型的待处理漏洞数、主机数和非专业版主机数量
     * @param req DescribeUndoVulCountsRequest
     * @return DescribeUndoVulCountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUndoVulCountsResponse DescribeUndoVulCounts(DescribeUndoVulCountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUndoVulCounts", DescribeUndoVulCountsResponse.class);
    }

    /**
     *用于查询用户自定义配置
     * @param req DescribeUsersConfigRequest
     * @return DescribeUsersConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersConfigResponse DescribeUsersConfig(DescribeUsersConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsersConfig", DescribeUsersConfigResponse.class);
    }

    /**
     *此接口（DescribeUsualLoginPlaces）用于查询常用登录地。
     * @param req DescribeUsualLoginPlacesRequest
     * @return DescribeUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsualLoginPlacesResponse DescribeUsualLoginPlaces(DescribeUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsualLoginPlaces", DescribeUsualLoginPlacesResponse.class);
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
     *获取版本对比信息
     * @param req DescribeVersionCompareChartRequest
     * @return DescribeVersionCompareChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionCompareChartResponse DescribeVersionCompareChart(DescribeVersionCompareChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersionCompareChart", DescribeVersionCompareChartResponse.class);
    }

    /**
     *用于统计专业版和基础版机器数。
     * @param req DescribeVersionStatisticsRequest
     * @return DescribeVersionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionStatisticsResponse DescribeVersionStatistics(DescribeVersionStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersionStatistics", DescribeVersionStatisticsResponse.class);
    }

    /**
     *获取指定点属性信息
     * @param req DescribeVertexDetailRequest
     * @return DescribeVertexDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVertexDetailResponse DescribeVertexDetail(DescribeVertexDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVertexDetail", DescribeVertexDetailResponse.class);
    }

    /**
     *漏洞管理模块，获取近日指定类型的漏洞数量和主机数量
     * @param req DescribeVulCountByDatesRequest
     * @return DescribeVulCountByDatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCountByDatesResponse DescribeVulCountByDates(DescribeVulCountByDatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulCountByDates", DescribeVulCountByDatesResponse.class);
    }

    /**
     *CveId查询漏洞详情
     * @param req DescribeVulCveIdInfoRequest
     * @return DescribeVulCveIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCveIdInfoResponse DescribeVulCveIdInfo(DescribeVulCveIdInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulCveIdInfo", DescribeVulCveIdInfoResponse.class);
    }

    /**
     *获取漏洞防御事件列表
     * @param req DescribeVulDefenceEventRequest
     * @return DescribeVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventResponse DescribeVulDefenceEvent(DescribeVulDefenceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceEvent", DescribeVulDefenceEventResponse.class);
    }

    /**
     *查询漏洞防御列表
     * @param req DescribeVulDefenceListRequest
     * @return DescribeVulDefenceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceListResponse DescribeVulDefenceList(DescribeVulDefenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceList", DescribeVulDefenceListResponse.class);
    }

    /**
     *获取漏洞防御概览信息，包括事件趋势及插件开启情况
     * @param req DescribeVulDefenceOverviewRequest
     * @return DescribeVulDefenceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceOverviewResponse DescribeVulDefenceOverview(DescribeVulDefenceOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceOverview", DescribeVulDefenceOverviewResponse.class);
    }

    /**
     *获取单台主机漏洞防御插件信息
     * @param req DescribeVulDefencePluginDetailRequest
     * @return DescribeVulDefencePluginDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginDetailResponse DescribeVulDefencePluginDetail(DescribeVulDefencePluginDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePluginDetail", DescribeVulDefencePluginDetailResponse.class);
    }

    /**
     *获取当前异常插件数
     * @param req DescribeVulDefencePluginExceptionCountRequest
     * @return DescribeVulDefencePluginExceptionCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginExceptionCountResponse DescribeVulDefencePluginExceptionCount(DescribeVulDefencePluginExceptionCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePluginExceptionCount", DescribeVulDefencePluginExceptionCountResponse.class);
    }

    /**
     *获取各主机漏洞防御插件状态
     * @param req DescribeVulDefencePluginStatusRequest
     * @return DescribeVulDefencePluginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginStatusResponse DescribeVulDefencePluginStatus(DescribeVulDefencePluginStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePluginStatus", DescribeVulDefencePluginStatusResponse.class);
    }

    /**
     *获取当前漏洞防御插件设置
     * @param req DescribeVulDefenceSettingRequest
     * @return DescribeVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceSettingResponse DescribeVulDefenceSetting(DescribeVulDefenceSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceSetting", DescribeVulDefenceSettingResponse.class);
    }

    /**
     *漏洞影响主机列表
     * @param req DescribeVulEffectHostListRequest
     * @return DescribeVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectHostListResponse DescribeVulEffectHostList(DescribeVulEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulEffectHostList", DescribeVulEffectHostListResponse.class);
    }

    /**
     *漏洞影响组件列表
     * @param req DescribeVulEffectModulesRequest
     * @return DescribeVulEffectModulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectModulesResponse DescribeVulEffectModules(DescribeVulEffectModulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulEffectModules", DescribeVulEffectModulesResponse.class);
    }

    /**
     *获取漏洞紧急通知
     * @param req DescribeVulEmergentMsgRequest
     * @return DescribeVulEmergentMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEmergentMsgResponse DescribeVulEmergentMsg(DescribeVulEmergentMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulEmergentMsg", DescribeVulEmergentMsgResponse.class);
    }

    /**
     *漏洞修护-查找主机漏洞修护进度
     * @param req DescribeVulFixStatusRequest
     * @return DescribeVulFixStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixStatusResponse DescribeVulFixStatus(DescribeVulFixStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixStatus", DescribeVulFixStatusResponse.class);
    }

    /**
     *获取待处理漏洞数+影响主机数
     * @param req DescribeVulHostCountScanTimeRequest
     * @return DescribeVulHostCountScanTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostCountScanTimeResponse DescribeVulHostCountScanTime(DescribeVulHostCountScanTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulHostCountScanTime", DescribeVulHostCountScanTimeResponse.class);
    }

    /**
     *获取服务器风险top列表
     * @param req DescribeVulHostTopRequest
     * @return DescribeVulHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostTopResponse DescribeVulHostTop(DescribeVulHostTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulHostTop", DescribeVulHostTopResponse.class);
    }

    /**
     *漏洞详情，带CVSS版本
     * @param req DescribeVulInfoCvssRequest
     * @return DescribeVulInfoCvssResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoCvssResponse DescribeVulInfoCvss(DescribeVulInfoCvssRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulInfoCvss", DescribeVulInfoCvssResponse.class);
    }

    /**
     *获取用户漏洞所有标签列表
     * @param req DescribeVulLabelsRequest
     * @return DescribeVulLabelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLabelsResponse DescribeVulLabels(DescribeVulLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLabels", DescribeVulLabelsResponse.class);
    }

    /**
     *漏洞数量等级分布统计
     * @param req DescribeVulLevelCountRequest
     * @return DescribeVulLevelCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelCountResponse DescribeVulLevelCount(DescribeVulLevelCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLevelCount", DescribeVulLevelCountResponse.class);
    }

    /**
     *获取漏洞列表数据
     * @param req DescribeVulListRequest
     * @return DescribeVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulListResponse DescribeVulList(DescribeVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulList", DescribeVulListResponse.class);
    }

    /**
     *获取漏洞概览数据
     * @param req DescribeVulOverviewRequest
     * @return DescribeVulOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulOverviewResponse DescribeVulOverview(DescribeVulOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulOverview", DescribeVulOverviewResponse.class);
    }

    /**
     *获取漏洞库列表
     * @param req DescribeVulStoreListRequest
     * @return DescribeVulStoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulStoreListResponse DescribeVulStoreList(DescribeVulStoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulStoreList", DescribeVulStoreListResponse.class);
    }

    /**
     *漏洞top统计
     * @param req DescribeVulTopRequest
     * @return DescribeVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTopResponse DescribeVulTop(DescribeVulTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulTop", DescribeVulTopResponse.class);
    }

    /**
     *获取漏洞态势信息
     * @param req DescribeVulTrendRequest
     * @return DescribeVulTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTrendResponse DescribeVulTrend(DescribeVulTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulTrend", DescribeVulTrendResponse.class);
    }

    /**
     *查询告警机器范围配置
     * @param req DescribeWarningHostConfigRequest
     * @return DescribeWarningHostConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningHostConfigResponse DescribeWarningHostConfig(DescribeWarningHostConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWarningHostConfig", DescribeWarningHostConfigResponse.class);
    }

    /**
     *获取当前用户告警列表
     * @param req DescribeWarningListRequest
     * @return DescribeWarningListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningListResponse DescribeWarningList(DescribeWarningListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWarningList", DescribeWarningListResponse.class);
    }

    /**
     *查询告警策略
     * @param req DescribeWebHookPolicyRequest
     * @return DescribeWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookPolicyResponse DescribeWebHookPolicy(DescribeWebHookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookPolicy", DescribeWebHookPolicyResponse.class);
    }

    /**
     *查询告警接收人列表
     * @param req DescribeWebHookReceiverRequest
     * @return DescribeWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookReceiverResponse DescribeWebHookReceiver(DescribeWebHookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookReceiver", DescribeWebHookReceiverResponse.class);
    }

    /**
     *查询指定告警接收人的关联策略使用信息
     * @param req DescribeWebHookReceiverUsageRequest
     * @return DescribeWebHookReceiverUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookReceiverUsageResponse DescribeWebHookReceiverUsage(DescribeWebHookReceiverUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookReceiverUsage", DescribeWebHookReceiverUsageResponse.class);
    }

    /**
     *获取企微机器人规则详情
     * @param req DescribeWebHookRuleRequest
     * @return DescribeWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookRuleResponse DescribeWebHookRule(DescribeWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookRule", DescribeWebHookRuleResponse.class);
    }

    /**
     *获取企微机器人规则列表
     * @param req DescribeWebHookRulesRequest
     * @return DescribeWebHookRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookRulesResponse DescribeWebHookRules(DescribeWebHookRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookRules", DescribeWebHookRulesResponse.class);
    }

    /**
     *查询篡改事件列表
     * @param req DescribeWebPageEventListRequest
     * @return DescribeWebPageEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageEventListResponse DescribeWebPageEventList(DescribeWebPageEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebPageEventList", DescribeWebPageEventListResponse.class);
    }

    /**
     *查询网站防篡改概览信息
     * @param req DescribeWebPageGeneralizeRequest
     * @return DescribeWebPageGeneralizeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageGeneralizeResponse DescribeWebPageGeneralize(DescribeWebPageGeneralizeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebPageGeneralize", DescribeWebPageGeneralizeResponse.class);
    }

    /**
     *网站防篡改-查询动态防护信息
     * @param req DescribeWebPageProtectStatRequest
     * @return DescribeWebPageProtectStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageProtectStatResponse DescribeWebPageProtectStat(DescribeWebPageProtectStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebPageProtectStat", DescribeWebPageProtectStatResponse.class);
    }

    /**
     *网站防篡改-查询网页防篡改服务器购买信息及服务器信息
     * @param req DescribeWebPageServiceInfoRequest
     * @return DescribeWebPageServiceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageServiceInfoResponse DescribeWebPageServiceInfo(DescribeWebPageServiceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebPageServiceInfo", DescribeWebPageServiceInfoResponse.class);
    }

    /**
     *DestroyOrder  该接口可以对资源销毁.
     * @param req DestroyOrderRequest
     * @return DestroyOrderResponse
     * @throws TencentCloudSDKException
     */
    public DestroyOrderResponse DestroyOrder(DestroyOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyOrder", DestroyOrderResponse.class);
    }

    /**
     *新增或修改高危命令规则
     * @param req EditBashRulesRequest
     * @return EditBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditBashRulesResponse EditBashRules(EditBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditBashRules", EditBashRulesResponse.class);
    }

    /**
     *新增或修改本地提权规则（支持多服务器选择）
     * @param req EditPrivilegeRulesRequest
     * @return EditPrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditPrivilegeRulesResponse EditPrivilegeRules(EditPrivilegeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditPrivilegeRules", EditPrivilegeRulesResponse.class);
    }

    /**
     *编辑反弹Shell规则（支持多服务器选择）
     * @param req EditReverseShellRulesRequest
     * @return EditReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditReverseShellRulesResponse EditReverseShellRules(EditReverseShellRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditReverseShellRules", EditReverseShellRulesResponse.class);
    }

    /**
     *新增或编辑标签
     * @param req EditTagsRequest
     * @return EditTagsResponse
     * @throws TencentCloudSDKException
     */
    public EditTagsResponse EditTags(EditTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditTags", EditTagsResponse.class);
    }

    /**
     *导出资产管理应用列表
     * @param req ExportAssetAppListRequest
     * @return ExportAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetAppListResponse ExportAssetAppList(ExportAssetAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetAppList", ExportAssetAppListResponse.class);
    }

    /**
     *导出资产管理内核模块列表
     * @param req ExportAssetCoreModuleListRequest
     * @return ExportAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetCoreModuleListResponse ExportAssetCoreModuleList(ExportAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetCoreModuleList", ExportAssetCoreModuleListResponse.class);
    }

    /**
     *导出资产管理数据库列表
     * @param req ExportAssetDatabaseListRequest
     * @return ExportAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetDatabaseListResponse ExportAssetDatabaseList(ExportAssetDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetDatabaseList", ExportAssetDatabaseListResponse.class);
    }

    /**
     *导出资产管理环境变量列表
     * @param req ExportAssetEnvListRequest
     * @return ExportAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetEnvListResponse ExportAssetEnvList(ExportAssetEnvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetEnvList", ExportAssetEnvListResponse.class);
    }

    /**
     *导出资产管理启动服务列表
     * @param req ExportAssetInitServiceListRequest
     * @return ExportAssetInitServiceListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetInitServiceListResponse ExportAssetInitServiceList(ExportAssetInitServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetInitServiceList", ExportAssetInitServiceListResponse.class);
    }

    /**
     *导出Jar包列表
     * @param req ExportAssetJarListRequest
     * @return ExportAssetJarListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetJarListResponse ExportAssetJarList(ExportAssetJarListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetJarList", ExportAssetJarListResponse.class);
    }

    /**
     *导出资产管理主机资源详细信息
     * @param req ExportAssetMachineDetailRequest
     * @return ExportAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetMachineDetailResponse ExportAssetMachineDetail(ExportAssetMachineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetMachineDetail", ExportAssetMachineDetailResponse.class);
    }

    /**
     *导出资源监控列表
     * @param req ExportAssetMachineListRequest
     * @return ExportAssetMachineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetMachineListResponse ExportAssetMachineList(ExportAssetMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetMachineList", ExportAssetMachineListResponse.class);
    }

    /**
     *导出资产管理计划任务列表
     * @param req ExportAssetPlanTaskListRequest
     * @return ExportAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetPlanTaskListResponse ExportAssetPlanTaskList(ExportAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetPlanTaskList", ExportAssetPlanTaskListResponse.class);
    }

    /**
     *导出资产管理端口列表
     * @param req ExportAssetPortInfoListRequest
     * @return ExportAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetPortInfoListResponse ExportAssetPortInfoList(ExportAssetPortInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetPortInfoList", ExportAssetPortInfoListResponse.class);
    }

    /**
     *导出资产管理进程列表
     * @param req ExportAssetProcessInfoListRequest
     * @return ExportAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetProcessInfoListResponse ExportAssetProcessInfoList(ExportAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetProcessInfoList", ExportAssetProcessInfoListResponse.class);
    }

    /**
     *导出主机最近趋势情况（最长最近90天）
     * @param req ExportAssetRecentMachineInfoRequest
     * @return ExportAssetRecentMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetRecentMachineInfoResponse ExportAssetRecentMachineInfo(ExportAssetRecentMachineInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetRecentMachineInfo", ExportAssetRecentMachineInfoResponse.class);
    }

    /**
     *导出资产管理系统安装包列表
     * @param req ExportAssetSystemPackageListRequest
     * @return ExportAssetSystemPackageListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetSystemPackageListResponse ExportAssetSystemPackageList(ExportAssetSystemPackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetSystemPackageList", ExportAssetSystemPackageListResponse.class);
    }

    /**
     *导出账号列表
     * @param req ExportAssetUserListRequest
     * @return ExportAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetUserListResponse ExportAssetUserList(ExportAssetUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetUserList", ExportAssetUserListResponse.class);
    }

    /**
     *导出资产管理Web应用列表
     * @param req ExportAssetWebAppListRequest
     * @return ExportAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebAppListResponse ExportAssetWebAppList(ExportAssetWebAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebAppList", ExportAssetWebAppListResponse.class);
    }

    /**
     *导出资产管理Web框架列表
     * @param req ExportAssetWebFrameListRequest
     * @return ExportAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebFrameListResponse ExportAssetWebFrameList(ExportAssetWebFrameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebFrameList", ExportAssetWebFrameListResponse.class);
    }

    /**
     *导出Web站点列表
     * @param req ExportAssetWebLocationListRequest
     * @return ExportAssetWebLocationListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebLocationListResponse ExportAssetWebLocationList(ExportAssetWebLocationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebLocationList", ExportAssetWebLocationListResponse.class);
    }

    /**
     *导出资产管理Web服务列表
     * @param req ExportAssetWebServiceInfoListRequest
     * @return ExportAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebServiceInfoListResponse ExportAssetWebServiceInfoList(ExportAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebServiceInfoList", ExportAssetWebServiceInfoListResponse.class);
    }

    /**
     *导出网络攻击事件
     * @param req ExportAttackEventsRequest
     * @return ExportAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttackEventsResponse ExportAttackEvents(ExportAttackEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAttackEvents", ExportAttackEventsResponse.class);
    }

    /**
     *导出基线影响主机列表
     * @param req ExportBaselineEffectHostListRequest
     * @return ExportBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineEffectHostListResponse ExportBaselineEffectHostList(ExportBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineEffectHostList", ExportBaselineEffectHostListResponse.class);
    }

    /**
     *导出修复列表
     * @param req ExportBaselineFixListRequest
     * @return ExportBaselineFixListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineFixListResponse ExportBaselineFixList(ExportBaselineFixListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineFixList", ExportBaselineFixListResponse.class);
    }

    /**
     *导出基线主机检测
     * @param req ExportBaselineHostDetectListRequest
     * @return ExportBaselineHostDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineHostDetectListResponse ExportBaselineHostDetectList(ExportBaselineHostDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineHostDetectList", ExportBaselineHostDetectListResponse.class);
    }

    /**
     *导出基线检测项
     * @param req ExportBaselineItemDetectListRequest
     * @return ExportBaselineItemDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineItemDetectListResponse ExportBaselineItemDetectList(ExportBaselineItemDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineItemDetectList", ExportBaselineItemDetectListResponse.class);
    }

    /**
     *导出检测项结果列表
     * @param req ExportBaselineItemListRequest
     * @return ExportBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineItemListResponse ExportBaselineItemList(ExportBaselineItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineItemList", ExportBaselineItemListResponse.class);
    }

    /**
     *导出基线列表
     * @param req ExportBaselineListRequest
     * @return ExportBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineListResponse ExportBaselineList(ExportBaselineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineList", ExportBaselineListResponse.class);
    }

    /**
     *导出基线检测规则
     * @param req ExportBaselineRuleDetectListRequest
     * @return ExportBaselineRuleDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineRuleDetectListResponse ExportBaselineRuleDetectList(ExportBaselineRuleDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineRuleDetectList", ExportBaselineRuleDetectListResponse.class);
    }

    /**
     *导出弱口令配置列表
     * @param req ExportBaselineWeakPasswordListRequest
     * @return ExportBaselineWeakPasswordListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineWeakPasswordListResponse ExportBaselineWeakPasswordList(ExportBaselineWeakPasswordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineWeakPasswordList", ExportBaselineWeakPasswordListResponse.class);
    }

    /**
     *导出高危命令事件
     * @param req ExportBashEventsRequest
     * @return ExportBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsResponse ExportBashEvents(ExportBashEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBashEvents", ExportBashEventsResponse.class);
    }

    /**
     *导出高危命令事件(新)
     * @param req ExportBashEventsNewRequest
     * @return ExportBashEventsNewResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsNewResponse ExportBashEventsNew(ExportBashEventsNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBashEventsNew", ExportBashEventsNewResponse.class);
    }

    /**
     *导出高危命令策略
     * @param req ExportBashPoliciesRequest
     * @return ExportBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashPoliciesResponse ExportBashPolicies(ExportBashPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBashPolicies", ExportBashPoliciesResponse.class);
    }

    /**
     *本接口 (ExportBruteAttacks) 用于导出密码破解记录成CSV文件。
     * @param req ExportBruteAttacksRequest
     * @return ExportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public ExportBruteAttacksResponse ExportBruteAttacks(ExportBruteAttacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBruteAttacks", ExportBruteAttacksResponse.class);
    }

    /**
     *导出核心文件事件
     * @param req ExportFileTamperEventsRequest
     * @return ExportFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportFileTamperEventsResponse ExportFileTamperEvents(ExportFileTamperEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportFileTamperEvents", ExportFileTamperEventsResponse.class);
    }

    /**
     *导出核心文件监控规则
     * @param req ExportFileTamperRulesRequest
     * @return ExportFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public ExportFileTamperRulesResponse ExportFileTamperRules(ExportFileTamperRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportFileTamperRules", ExportFileTamperRulesResponse.class);
    }

    /**
     *导出已忽略基线检测项信息
     * @param req ExportIgnoreBaselineRuleRequest
     * @return ExportIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreBaselineRuleResponse ExportIgnoreBaselineRule(ExportIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportIgnoreBaselineRule", ExportIgnoreBaselineRuleResponse.class);
    }

    /**
     *根据检测项id导出忽略检测项影响主机列表
     * @param req ExportIgnoreRuleEffectHostListRequest
     * @return ExportIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreRuleEffectHostListResponse ExportIgnoreRuleEffectHostList(ExportIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportIgnoreRuleEffectHostList", ExportIgnoreRuleEffectHostListResponse.class);
    }

    /**
     *导出java内存马插件信息
     * @param req ExportJavaMemShellPluginsRequest
     * @return ExportJavaMemShellPluginsResponse
     * @throws TencentCloudSDKException
     */
    public ExportJavaMemShellPluginsResponse ExportJavaMemShellPlugins(ExportJavaMemShellPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportJavaMemShellPlugins", ExportJavaMemShellPluginsResponse.class);
    }

    /**
     *导出java内存马事件列表
     * @param req ExportJavaMemShellsRequest
     * @return ExportJavaMemShellsResponse
     * @throws TencentCloudSDKException
     */
    public ExportJavaMemShellsResponse ExportJavaMemShells(ExportJavaMemShellsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportJavaMemShells", ExportJavaMemShellsResponse.class);
    }

    /**
     *导出授权列表对应的绑定信息
     * @param req ExportLicenseDetailRequest
     * @return ExportLicenseDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportLicenseDetailResponse ExportLicenseDetail(ExportLicenseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportLicenseDetail", ExportLicenseDetailResponse.class);
    }

    /**
     *本接口 (ExportMaliciousRequests) 用于导出下载恶意请求文件。
     * @param req ExportMaliciousRequestsRequest
     * @return ExportMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public ExportMaliciousRequestsResponse ExportMaliciousRequests(ExportMaliciousRequestsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportMaliciousRequests", ExportMaliciousRequestsResponse.class);
    }

    /**
     *本接口 (ExportMalwares) 用于导出木马记录CSV文件。
     * @param req ExportMalwaresRequest
     * @return ExportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public ExportMalwaresResponse ExportMalwares(ExportMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportMalwares", ExportMalwaresResponse.class);
    }

    /**
     *本接口 (ExportNonlocalLoginPlaces) 用于导出异地登录事件记录CSV文件。
     * @param req ExportNonlocalLoginPlacesRequest
     * @return ExportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public ExportNonlocalLoginPlacesResponse ExportNonlocalLoginPlaces(ExportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportNonlocalLoginPlaces", ExportNonlocalLoginPlacesResponse.class);
    }

    /**
     *导出本地提权事件
     * @param req ExportPrivilegeEventsRequest
     * @return ExportPrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportPrivilegeEventsResponse ExportPrivilegeEvents(ExportPrivilegeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportPrivilegeEvents", ExportPrivilegeEventsResponse.class);
    }

    /**
     *导出网页防篡改防护目录列表
     * @param req ExportProtectDirListRequest
     * @return ExportProtectDirListResponse
     * @throws TencentCloudSDKException
     */
    public ExportProtectDirListResponse ExportProtectDirList(ExportProtectDirListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportProtectDirList", ExportProtectDirListResponse.class);
    }

    /**
     *导出主机快照备份列表
     * @param req ExportRansomDefenseBackupListRequest
     * @return ExportRansomDefenseBackupListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseBackupListResponse ExportRansomDefenseBackupList(ExportRansomDefenseBackupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseBackupList", ExportRansomDefenseBackupListResponse.class);
    }

    /**
     *导出防勒索事件列表
     * @param req ExportRansomDefenseEventsListRequest
     * @return ExportRansomDefenseEventsListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseEventsListResponse ExportRansomDefenseEventsList(ExportRansomDefenseEventsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseEventsList", ExportRansomDefenseEventsListResponse.class);
    }

    /**
     *导出备份详情列表
     * @param req ExportRansomDefenseMachineListRequest
     * @return ExportRansomDefenseMachineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseMachineListResponse ExportRansomDefenseMachineList(ExportRansomDefenseMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseMachineList", ExportRansomDefenseMachineListResponse.class);
    }

    /**
     *导出防勒索策略列表
     * @param req ExportRansomDefenseStrategyListRequest
     * @return ExportRansomDefenseStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseStrategyListResponse ExportRansomDefenseStrategyList(ExportRansomDefenseStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseStrategyList", ExportRansomDefenseStrategyListResponse.class);
    }

    /**
     *导出勒索防御策略绑定机器列表
     * @param req ExportRansomDefenseStrategyMachinesRequest
     * @return ExportRansomDefenseStrategyMachinesResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseStrategyMachinesResponse ExportRansomDefenseStrategyMachines(ExportRansomDefenseStrategyMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseStrategyMachines", ExportRansomDefenseStrategyMachinesResponse.class);
    }

    /**
     *导出反弹Shell事件
     * @param req ExportReverseShellEventsRequest
     * @return ExportReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportReverseShellEventsResponse ExportReverseShellEvents(ExportReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportReverseShellEvents", ExportReverseShellEventsResponse.class);
    }

    /**
     *导出恶意请求事件列表
     * @param req ExportRiskDnsEventListRequest
     * @return ExportRiskDnsEventListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskDnsEventListResponse ExportRiskDnsEventList(ExportRiskDnsEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRiskDnsEventList", ExportRiskDnsEventListResponse.class);
    }

    /**
     *导出恶意请求策略列表
     * @param req ExportRiskDnsPolicyListRequest
     * @return ExportRiskDnsPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskDnsPolicyListResponse ExportRiskDnsPolicyList(ExportRiskDnsPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRiskDnsPolicyList", ExportRiskDnsPolicyListResponse.class);
    }

    /**
     *导出异常进程事件
     * @param req ExportRiskProcessEventsRequest
     * @return ExportRiskProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskProcessEventsResponse ExportRiskProcessEvents(ExportRiskProcessEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRiskProcessEvents", ExportRiskProcessEventsResponse.class);
    }

    /**
     *根据任务id导出指定扫描任务详情
     * @param req ExportScanTaskDetailsRequest
     * @return ExportScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ExportScanTaskDetailsResponse ExportScanTaskDetails(ExportScanTaskDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportScanTaskDetails", ExportScanTaskDetailsResponse.class);
    }

    /**
     *导出风险趋势
     * @param req ExportSecurityTrendsRequest
     * @return ExportSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public ExportSecurityTrendsResponse ExportSecurityTrends(ExportSecurityTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportSecurityTrends", ExportSecurityTrendsResponse.class);
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
     *导出漏洞防御事件
     * @param req ExportVulDefenceEventRequest
     * @return ExportVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefenceEventResponse ExportVulDefenceEvent(ExportVulDefenceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDefenceEvent", ExportVulDefenceEventResponse.class);
    }

    /**
     *导出漏洞防御列表
     * @param req ExportVulDefenceListRequest
     * @return ExportVulDefenceListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefenceListResponse ExportVulDefenceList(ExportVulDefenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDefenceList", ExportVulDefenceListResponse.class);
    }

    /**
     *导出漏洞防御插件事件
     * @param req ExportVulDefencePluginEventRequest
     * @return ExportVulDefencePluginEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefencePluginEventResponse ExportVulDefencePluginEvent(ExportVulDefencePluginEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDefencePluginEvent", ExportVulDefencePluginEventResponse.class);
    }

    /**
     *导出本次漏洞检测Excel
     * @param req ExportVulDetectionExcelRequest
     * @return ExportVulDetectionExcelResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionExcelResponse ExportVulDetectionExcel(ExportVulDetectionExcelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDetectionExcel", ExportVulDetectionExcelResponse.class);
    }

    /**
     *导出漏洞检测报告。
     * @param req ExportVulDetectionReportRequest
     * @return ExportVulDetectionReportResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionReportResponse ExportVulDetectionReport(ExportVulDetectionReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDetectionReport", ExportVulDetectionReportResponse.class);
    }

    /**
     *导出漏洞影响主机列表
     * @param req ExportVulEffectHostListRequest
     * @return ExportVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulEffectHostListResponse ExportVulEffectHostList(ExportVulEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulEffectHostList", ExportVulEffectHostListResponse.class);
    }

    /**
     *导出漏洞信息，包括影响主机列表，组件信息
     * @param req ExportVulInfoRequest
     * @return ExportVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulInfoResponse ExportVulInfo(ExportVulInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulInfo", ExportVulInfoResponse.class);
    }

    /**
     *漏洞管理-导出漏洞列表
     * @param req ExportVulListRequest
     * @return ExportVulListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulListResponse ExportVulList(ExportVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulList", ExportVulListResponse.class);
    }

    /**
     *导出篡改事件列表
     * @param req ExportWebPageEventListRequest
     * @return ExportWebPageEventListResponse
     * @throws TencentCloudSDKException
     */
    public ExportWebPageEventListResponse ExportWebPageEventList(ExportWebPageEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportWebPageEventList", ExportWebPageEventListResponse.class);
    }

    /**
     *修复基线检测
     * @param req FixBaselineDetectRequest
     * @return FixBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public FixBaselineDetectResponse FixBaselineDetect(FixBaselineDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FixBaselineDetect", FixBaselineDetectResponse.class);
    }

    /**
     *获取本地存储数据
     * @param req GetLocalStorageItemRequest
     * @return GetLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public GetLocalStorageItemResponse GetLocalStorageItem(GetLocalStorageItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLocalStorageItem", GetLocalStorageItemResponse.class);
    }

    /**
     *本接口 (IgnoreImpactedHosts) 用于忽略漏洞。
     * @param req IgnoreImpactedHostsRequest
     * @return IgnoreImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreImpactedHostsResponse IgnoreImpactedHosts(IgnoreImpactedHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IgnoreImpactedHosts", IgnoreImpactedHostsResponse.class);
    }

    /**
     *获取本地存储键值列表
     * @param req KeysLocalStorageRequest
     * @return KeysLocalStorageResponse
     * @throws TencentCloudSDKException
     */
    public KeysLocalStorageResponse KeysLocalStorage(KeysLocalStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KeysLocalStorage", KeysLocalStorageResponse.class);
    }

    /**
     *用于设置新增主机自动开通专业防护配置。
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoOpenProVersionConfig", ModifyAutoOpenProVersionConfigResponse.class);
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
     *设置阻断开关状态
     * @param req ModifyBanStatusRequest
     * @return ModifyBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanStatusResponse ModifyBanStatus(ModifyBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBanStatus", ModifyBanStatusResponse.class);
    }

    /**
     *修改阻断白名单列表
     * @param req ModifyBanWhiteListRequest
     * @return ModifyBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanWhiteListResponse ModifyBanWhiteList(ModifyBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBanWhiteList", ModifyBanWhiteListResponse.class);
    }

    /**
     *更改基线策略设置
     * @param req ModifyBaselinePolicyRequest
     * @return ModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyResponse ModifyBaselinePolicy(ModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicy", ModifyBaselinePolicyResponse.class);
    }

    /**
     *更改基线策略状态
     * @param req ModifyBaselinePolicyStateRequest
     * @return ModifyBaselinePolicyStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyStateResponse ModifyBaselinePolicyState(ModifyBaselinePolicyStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicyState", ModifyBaselinePolicyStateResponse.class);
    }

    /**
     *更改基线检测规则
     * @param req ModifyBaselineRuleRequest
     * @return ModifyBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineRuleResponse ModifyBaselineRule(ModifyBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineRule", ModifyBaselineRuleResponse.class);
    }

    /**
     *更改基线忽略规则
     * @param req ModifyBaselineRuleIgnoreRequest
     * @return ModifyBaselineRuleIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineRuleIgnoreResponse ModifyBaselineRuleIgnore(ModifyBaselineRuleIgnoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineRuleIgnore", ModifyBaselineRuleIgnoreResponse.class);
    }

    /**
     *更改或新增弱口令
     * @param req ModifyBaselineWeakPasswordRequest
     * @return ModifyBaselineWeakPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineWeakPasswordResponse ModifyBaselineWeakPassword(ModifyBaselineWeakPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineWeakPassword", ModifyBaselineWeakPasswordResponse.class);
    }

    /**
     *新增或修改高危命令策略
     * @param req ModifyBashPolicyRequest
     * @return ModifyBashPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBashPolicyResponse ModifyBashPolicy(ModifyBashPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBashPolicy", ModifyBashPolicyResponse.class);
    }

    /**
     *切换高危命令策略状态
     * @param req ModifyBashPolicyStatusRequest
     * @return ModifyBashPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBashPolicyStatusResponse ModifyBashPolicyStatus(ModifyBashPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBashPolicyStatus", ModifyBashPolicyStatusResponse.class);
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
     *修改网络攻击事件状态
     * @param req ModifyEventAttackStatusRequest
     * @return ModifyEventAttackStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEventAttackStatusResponse ModifyEventAttackStatus(ModifyEventAttackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEventAttackStatus", ModifyEventAttackStatusResponse.class);
    }

    /**
     *核心文件事件更新
     * @param req ModifyFileTamperEventsRequest
     * @return ModifyFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperEventsResponse ModifyFileTamperEvents(ModifyFileTamperEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileTamperEvents", ModifyFileTamperEventsResponse.class);
    }

    /**
     *编辑、新增核心文件监控规则
     * @param req ModifyFileTamperRuleRequest
     * @return ModifyFileTamperRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperRuleResponse ModifyFileTamperRule(ModifyFileTamperRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileTamperRule", ModifyFileTamperRuleResponse.class);
    }

    /**
     *核心文件规则状态更新，支持批量删除 关闭
     * @param req ModifyFileTamperRuleStatusRequest
     * @return ModifyFileTamperRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperRuleStatusResponse ModifyFileTamperRuleStatus(ModifyFileTamperRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileTamperRuleStatus", ModifyFileTamperRuleStatusResponse.class);
    }

    /**
     *开关java内存马插件
     * @param req ModifyJavaMemShellPluginSwitchRequest
     * @return ModifyJavaMemShellPluginSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJavaMemShellPluginSwitchResponse ModifyJavaMemShellPluginSwitch(ModifyJavaMemShellPluginSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJavaMemShellPluginSwitch", ModifyJavaMemShellPluginSwitchResponse.class);
    }

    /**
     *修改java内存马事件状态
     * @param req ModifyJavaMemShellsStatusRequest
     * @return ModifyJavaMemShellsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJavaMemShellsStatusResponse ModifyJavaMemShellsStatus(ModifyJavaMemShellsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJavaMemShellsStatus", ModifyJavaMemShellsStatusResponse.class);
    }

    /**
     *设置中心-授权管理 对某个授权批量绑定机器
     * @param req ModifyLicenseBindsRequest
     * @return ModifyLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseBindsResponse ModifyLicenseBinds(ModifyLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLicenseBinds", ModifyLicenseBindsResponse.class);
    }

    /**
     *编辑《主机安全-按量计费》授权订单
     * @param req ModifyLicenseOrderRequest
     * @return ModifyLicenseOrderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseOrderResponse ModifyLicenseOrder(ModifyLicenseOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLicenseOrder", ModifyLicenseOrderResponse.class);
    }

    /**
     *设置中心-授权管理 对某个授权批量解绑机器
     * @param req ModifyLicenseUnBindsRequest
     * @return ModifyLicenseUnBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseUnBindsResponse ModifyLicenseUnBinds(ModifyLicenseUnBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLicenseUnBinds", ModifyLicenseUnBindsResponse.class);
    }

    /**
     *新增或修改日志投递kafka接入配置
     * @param req ModifyLogKafkaAccessRequest
     * @return ModifyLogKafkaAccessResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaAccessResponse ModifyLogKafkaAccess(ModifyLogKafkaAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogKafkaAccess", ModifyLogKafkaAccessResponse.class);
    }

    /**
     *修改指定日志类别投递配置、开关
     * @param req ModifyLogKafkaDeliverTypeRequest
     * @return ModifyLogKafkaDeliverTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaDeliverTypeResponse ModifyLogKafkaDeliverType(ModifyLogKafkaDeliverTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogKafkaDeliverType", ModifyLogKafkaDeliverTypeResponse.class);
    }

    /**
     *修改日志投递状态信息
     * @param req ModifyLogKafkaStateRequest
     * @return ModifyLogKafkaStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaStateResponse ModifyLogKafkaState(ModifyLogKafkaStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogKafkaState", ModifyLogKafkaStateResponse.class);
    }

    /**
     *修改日志存储配置
     * @param req ModifyLogStorageConfigRequest
     * @return ModifyLogStorageConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogStorageConfigResponse ModifyLogStorageConfig(ModifyLogStorageConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogStorageConfig", ModifyLogStorageConfigResponse.class);
    }

    /**
     *更新登录审计白名单信息
     * @param req ModifyLoginWhiteInfoRequest
     * @return ModifyLoginWhiteInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteInfoResponse ModifyLoginWhiteInfo(ModifyLoginWhiteInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoginWhiteInfo", ModifyLoginWhiteInfoResponse.class);
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
     *修改主机备注信息
     * @param req ModifyMachineRemarkRequest
     * @return ModifyMachineRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineRemarkResponse ModifyMachineRemark(ModifyMachineRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineRemark", ModifyMachineRemarkResponse.class);
    }

    /**
     *更新恶意请求白名单
     * @param req ModifyMaliciousRequestWhiteListRequest
     * @return ModifyMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaliciousRequestWhiteListResponse ModifyMaliciousRequestWhiteList(ModifyMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaliciousRequestWhiteList", ModifyMaliciousRequestWhiteListResponse.class);
    }

    /**
     *定时扫描设置
     * @param req ModifyMalwareTimingScanSettingsRequest
     * @return ModifyMalwareTimingScanSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareTimingScanSettingsResponse ModifyMalwareTimingScanSettings(ModifyMalwareTimingScanSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMalwareTimingScanSettings", ModifyMalwareTimingScanSettingsResponse.class);
    }

    /**
     *编辑木马白名单
     * @param req ModifyMalwareWhiteListRequest
     * @return ModifyMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareWhiteListResponse ModifyMalwareWhiteList(ModifyMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMalwareWhiteList", ModifyMalwareWhiteListResponse.class);
    }

    /**
     *修改网络攻击设置
     * @param req ModifyNetAttackSettingRequest
     * @return ModifyNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackSettingResponse ModifyNetAttackSetting(ModifyNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetAttackSetting", ModifyNetAttackSettingResponse.class);
    }

    /**
     *编辑网络攻击白名单
     * @param req ModifyNetAttackWhiteListRequest
     * @return ModifyNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackWhiteListResponse ModifyNetAttackWhiteList(ModifyNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetAttackWhiteList", ModifyNetAttackWhiteListResponse.class);
    }

    /**
     *对订单属性编辑
     * @param req ModifyOrderAttributeRequest
     * @return ModifyOrderAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrderAttributeResponse ModifyOrderAttribute(ModifyOrderAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrderAttribute", ModifyOrderAttributeResponse.class);
    }

    /**
     *修改防勒索事件状态
     * @param req ModifyRansomDefenseEventsStatusRequest
     * @return ModifyRansomDefenseEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRansomDefenseEventsStatusResponse ModifyRansomDefenseEventsStatus(ModifyRansomDefenseEventsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRansomDefenseEventsStatus", ModifyRansomDefenseEventsStatusResponse.class);
    }

    /**
     *批量修改防勒索策略状态
     * @param req ModifyRansomDefenseStrategyStatusRequest
     * @return ModifyRansomDefenseStrategyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRansomDefenseStrategyStatusResponse ModifyRansomDefenseStrategyStatus(ModifyRansomDefenseStrategyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRansomDefenseStrategyStatus", ModifyRansomDefenseStrategyStatusResponse.class);
    }

    /**
     *编辑反弹Shell规则（支持多服务器选择）
     * @param req ModifyReverseShellRulesAggregationRequest
     * @return ModifyReverseShellRulesAggregationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReverseShellRulesAggregationResponse ModifyReverseShellRulesAggregation(ModifyReverseShellRulesAggregationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReverseShellRulesAggregation", ModifyReverseShellRulesAggregationResponse.class);
    }

    /**
     *更改恶意请求策略
     * @param req ModifyRiskDnsPolicyRequest
     * @return ModifyRiskDnsPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsPolicyResponse ModifyRiskDnsPolicy(ModifyRiskDnsPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskDnsPolicy", ModifyRiskDnsPolicyResponse.class);
    }

    /**
     *更改恶意请求策略状态
     * @param req ModifyRiskDnsPolicyStatusRequest
     * @return ModifyRiskDnsPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsPolicyStatusResponse ModifyRiskDnsPolicyStatus(ModifyRiskDnsPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskDnsPolicyStatus", ModifyRiskDnsPolicyStatusResponse.class);
    }

    /**
     *入侵检测所有事件的状态，包括：文件查杀，异常登录，密码破解，高危命令，反弹shell，本地提取
     * @param req ModifyRiskEventsStatusRequest
     * @return ModifyRiskEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskEventsStatusResponse ModifyRiskEventsStatus(ModifyRiskEventsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskEventsStatus", ModifyRiskEventsStatusResponse.class);
    }

    /**
     *用于创建/修改用户自定义配置
     * @param req ModifyUsersConfigRequest
     * @return ModifyUsersConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsersConfigResponse ModifyUsersConfig(ModifyUsersConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUsersConfig", ModifyUsersConfigResponse.class);
    }

    /**
     *修改漏洞防御事件状态（修复漏洞通过其他接口实现）
     * @param req ModifyVulDefenceEventStatusRequest
     * @return ModifyVulDefenceEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceEventStatusResponse ModifyVulDefenceEventStatus(ModifyVulDefenceEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulDefenceEventStatus", ModifyVulDefenceEventStatusResponse.class);
    }

    /**
     *修改漏洞防御插件设置
1）新增主机自动加入，scope为1，quuids为空
2）全量旗舰版不自动加入，scope为0，quuids为当前quuid列表，
3）给定quuid列表，scope为0，quuids为用户选择quuid
     * @param req ModifyVulDefenceSettingRequest
     * @return ModifyVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceSettingResponse ModifyVulDefenceSetting(ModifyVulDefenceSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulDefenceSetting", ModifyVulDefenceSettingResponse.class);
    }

    /**
     *修改告警机器范围配置
     * @param req ModifyWarningHostConfigRequest
     * @return ModifyWarningHostConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningHostConfigResponse ModifyWarningHostConfig(ModifyWarningHostConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWarningHostConfig", ModifyWarningHostConfigResponse.class);
    }

    /**
     *修改告警设置
     * @param req ModifyWarningSettingRequest
     * @return ModifyWarningSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningSettingResponse ModifyWarningSetting(ModifyWarningSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWarningSetting", ModifyWarningSettingResponse.class);
    }

    /**
     *新增或修改告警策略
     * @param req ModifyWebHookPolicyRequest
     * @return ModifyWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookPolicyResponse ModifyWebHookPolicy(ModifyWebHookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookPolicy", ModifyWebHookPolicyResponse.class);
    }

    /**
     *修改告警策略开关
     * @param req ModifyWebHookPolicyStatusRequest
     * @return ModifyWebHookPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookPolicyStatusResponse ModifyWebHookPolicyStatus(ModifyWebHookPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookPolicyStatus", ModifyWebHookPolicyStatusResponse.class);
    }

    /**
     *新增或更新告警接收人
     * @param req ModifyWebHookReceiverRequest
     * @return ModifyWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookReceiverResponse ModifyWebHookReceiver(ModifyWebHookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookReceiver", ModifyWebHookReceiverResponse.class);
    }

    /**
     *新增或修改企微机器人规则
     * @param req ModifyWebHookRuleRequest
     * @return ModifyWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookRuleResponse ModifyWebHookRule(ModifyWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookRule", ModifyWebHookRuleResponse.class);
    }

    /**
     *修改企微机器人规则状态
     * @param req ModifyWebHookRuleStatusRequest
     * @return ModifyWebHookRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookRuleStatusResponse ModifyWebHookRuleStatus(ModifyWebHookRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookRuleStatus", ModifyWebHookRuleStatusResponse.class);
    }

    /**
     *创建/修改网站防护目录
     * @param req ModifyWebPageProtectDirRequest
     * @return ModifyWebPageProtectDirResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectDirResponse ModifyWebPageProtectDir(ModifyWebPageProtectDirRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebPageProtectDir", ModifyWebPageProtectDirResponse.class);
    }

    /**
     *修改网站防护设置
     * @param req ModifyWebPageProtectSettingRequest
     * @return ModifyWebPageProtectSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectSettingResponse ModifyWebPageProtectSetting(ModifyWebPageProtectSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebPageProtectSetting", ModifyWebPageProtectSettingResponse.class);
    }

    /**
     *网站防篡改防护设置开关
     * @param req ModifyWebPageProtectSwitchRequest
     * @return ModifyWebPageProtectSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectSwitchResponse ModifyWebPageProtectSwitch(ModifyWebPageProtectSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebPageProtectSwitch", ModifyWebPageProtectSwitchResponse.class);
    }

    /**
     *防勒索快照回滚
     * @param req RansomDefenseRollbackRequest
     * @return RansomDefenseRollbackResponse
     * @throws TencentCloudSDKException
     */
    public RansomDefenseRollbackResponse RansomDefenseRollback(RansomDefenseRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RansomDefenseRollback", RansomDefenseRollbackResponse.class);
    }

    /**
     *本接口（RecoverMalwares）用于批量恢复已经被隔离的木马文件。
     * @param req RecoverMalwaresRequest
     * @return RecoverMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMalwaresResponse RecoverMalwares(RecoverMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverMalwares", RecoverMalwaresResponse.class);
    }

    /**
     *删除本地存储数据
     * @param req RemoveLocalStorageItemRequest
     * @return RemoveLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public RemoveLocalStorageItemResponse RemoveLocalStorageItem(RemoveLocalStorageItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveLocalStorageItem", RemoveLocalStorageItemResponse.class);
    }

    /**
     *删除主机所有记录，目前只支持非腾讯云主机，且需要主机在离线状态
     * @param req RemoveMachineRequest
     * @return RemoveMachineResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMachineResponse RemoveMachine(RemoveMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMachine", RemoveMachineResponse.class);
    }

    /**
     *快照创建失败时可以重试创建快照并且自动进行漏洞修复
     * @param req RetryCreateSnapshotRequest
     * @return RetryCreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RetryCreateSnapshotResponse RetryCreateSnapshot(RetryCreateSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryCreateSnapshot", RetryCreateSnapshotResponse.class);
    }

    /**
     *修复失败时单独对某一个主机修复漏洞
     * @param req RetryVulFixRequest
     * @return RetryVulFixResponse
     * @throws TencentCloudSDKException
     */
    public RetryVulFixResponse RetryVulFix(RetryVulFixRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryVulFix", RetryVulFixResponse.class);
    }

    /**
     *资产指纹启动扫描
     * @param req ScanAssetRequest
     * @return ScanAssetResponse
     * @throws TencentCloudSDKException
     */
    public ScanAssetResponse ScanAsset(ScanAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanAsset", ScanAssetResponse.class);
    }

    /**
     *基线检测与基线重新检测接口
     * @param req ScanBaselineRequest
     * @return ScanBaselineResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineResponse ScanBaseline(ScanBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaseline", ScanBaselineResponse.class);
    }

    /**
     *ScanTaskAgain  重新开始扫描任务，可以指定机器
     * @param req ScanTaskAgainRequest
     * @return ScanTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanTaskAgainResponse ScanTaskAgain(ScanTaskAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanTaskAgain", ScanTaskAgainResponse.class);
    }

    /**
     *漏洞一键检测
     * @param req ScanVulRequest
     * @return ScanVulResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulResponse ScanVul(ScanVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanVul", ScanVulResponse.class);
    }

    /**
     *漏洞管理-重新检测接口
     * @param req ScanVulAgainRequest
     * @return ScanVulAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulAgainResponse ScanVulAgain(ScanVulAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanVulAgain", ScanVulAgainResponse.class);
    }

    /**
     *定期扫描漏洞设置
     * @param req ScanVulSettingRequest
     * @return ScanVulSettingResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulSettingResponse ScanVulSetting(ScanVulSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanVulSetting", ScanVulSettingResponse.class);
    }

    /**
     *查询日志
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
    }

    /**
     *本接口（SeparateMalwares）用于隔离木马。
     * @param req SeparateMalwaresRequest
     * @return SeparateMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public SeparateMalwaresResponse SeparateMalwares(SeparateMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SeparateMalwares", SeparateMalwaresResponse.class);
    }

    /**
     *设置高危命令事件状态
     * @param req SetBashEventsStatusRequest
     * @return SetBashEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetBashEventsStatusResponse SetBashEventsStatus(SetBashEventsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetBashEventsStatus", SetBashEventsStatusResponse.class);
    }

    /**
     *设置本地存储过期时间
     * @param req SetLocalStorageExpireRequest
     * @return SetLocalStorageExpireResponse
     * @throws TencentCloudSDKException
     */
    public SetLocalStorageExpireResponse SetLocalStorageExpire(SetLocalStorageExpireRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLocalStorageExpire", SetLocalStorageExpireResponse.class);
    }

    /**
     *设置本地存储数据
     * @param req SetLocalStorageItemRequest
     * @return SetLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public SetLocalStorageItemResponse SetLocalStorageItem(SetLocalStorageItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLocalStorageItem", SetLocalStorageItemResponse.class);
    }

    /**
     *检测基线
     * @param req StartBaselineDetectRequest
     * @return StartBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public StartBaselineDetectResponse StartBaselineDetect(StartBaselineDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBaselineDetect", StartBaselineDetectResponse.class);
    }

    /**
     *停止资产扫描任务
     * @param req StopAssetScanRequest
     * @return StopAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public StopAssetScanResponse StopAssetScan(StopAssetScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAssetScan", StopAssetScanResponse.class);
    }

    /**
     *停止基线检测
     * @param req StopBaselineDetectRequest
     * @return StopBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineDetectResponse StopBaselineDetect(StopBaselineDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBaselineDetect", StopBaselineDetectResponse.class);
    }

    /**
     *不再提醒爆破阻断提示弹窗
     * @param req StopNoticeBanTipsRequest
     * @return StopNoticeBanTipsResponse
     * @throws TencentCloudSDKException
     */
    public StopNoticeBanTipsResponse StopNoticeBanTips(StopNoticeBanTipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopNoticeBanTips", StopNoticeBanTipsResponse.class);
    }

    /**
     *切换高危命令规则状态
     * @param req SwitchBashRulesRequest
     * @return SwitchBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public SwitchBashRulesResponse SwitchBashRules(SwitchBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchBashRules", SwitchBashRulesResponse.class);
    }

    /**
     *同步资产扫描信息
     * @param req SyncAssetScanRequest
     * @return SyncAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public SyncAssetScanResponse SyncAssetScan(SyncAssetScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncAssetScan", SyncAssetScanResponse.class);
    }

    /**
     *同步基线检测进度概要
     * @param req SyncBaselineDetectSummaryRequest
     * @return SyncBaselineDetectSummaryResponse
     * @throws TencentCloudSDKException
     */
    public SyncBaselineDetectSummaryResponse SyncBaselineDetectSummary(SyncBaselineDetectSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncBaselineDetectSummary", SyncBaselineDetectSummaryResponse.class);
    }

    /**
     *同步机器信息
     * @param req SyncMachinesRequest
     * @return SyncMachinesResponse
     * @throws TencentCloudSDKException
     */
    public SyncMachinesResponse SyncMachines(SyncMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncMachines", SyncMachinesResponse.class);
    }

    /**
     *测试企微机器人规则
     * @param req TestWebHookRuleRequest
     * @return TestWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public TestWebHookRuleResponse TestWebHookRule(TestWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TestWebHookRule", TestWebHookRuleResponse.class);
    }

    /**
     *本接口(TrustMalwares)将被识别木马文件设为信任。
     * @param req TrustMalwaresRequest
     * @return TrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public TrustMalwaresResponse TrustMalwares(TrustMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TrustMalwares", TrustMalwaresResponse.class);
    }

    /**
     *本接口（UntrustMalwares）用于取消信任木马文件。
     * @param req UntrustMalwaresRequest
     * @return UntrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMalwaresResponse UntrustMalwares(UntrustMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UntrustMalwares", UntrustMalwaresResponse.class);
    }

    /**
     *根据基线策略id更新策略信息
     * @param req UpdateBaselineStrategyRequest
     * @return UpdateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBaselineStrategyResponse UpdateBaselineStrategy(UpdateBaselineStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBaselineStrategy", UpdateBaselineStrategyResponse.class);
    }

    /**
     *关联机器标签列表
     * @param req UpdateMachineTagsRequest
     * @return UpdateMachineTagsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateMachineTagsResponse UpdateMachineTags(UpdateMachineTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateMachineTags", UpdateMachineTagsResponse.class);
    }

}
