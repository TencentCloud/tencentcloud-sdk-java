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
        JsonResponseModel<AddLoginWhiteListsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddLoginWhiteListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddLoginWhiteLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消漏洞忽略
     * @param req CancelIgnoreVulRequest
     * @return CancelIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public CancelIgnoreVulResponse CancelIgnoreVul(CancelIgnoreVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelIgnoreVulResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelIgnoreVulResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelIgnoreVul");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据检测项id或事件id批量忽略事件或取消忽略
     * @param req ChangeRuleEventsIgnoreStatusRequest
     * @return ChangeRuleEventsIgnoreStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeRuleEventsIgnoreStatusResponse ChangeRuleEventsIgnoreStatus(ChangeRuleEventsIgnoreStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeRuleEventsIgnoreStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeRuleEventsIgnoreStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeRuleEventsIgnoreStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据策略id修改策略可用状态
     * @param req ChangeStrategyEnableStatusRequest
     * @return ChangeStrategyEnableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeStrategyEnableStatusResponse ChangeStrategyEnableStatus(ChangeStrategyEnableStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeStrategyEnableStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeStrategyEnableStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeStrategyEnableStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验高危命令用户规则新增和编辑时的参数。
     * @param req CheckBashPolicyParamsRequest
     * @return CheckBashPolicyParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashPolicyParamsResponse CheckBashPolicyParams(CheckBashPolicyParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBashPolicyParamsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBashPolicyParamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBashPolicyParams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验高危命令用户规则新增和编辑时的参数。
     * @param req CheckBashRuleParamsRequest
     * @return CheckBashRuleParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashRuleParamsResponse CheckBashRuleParams(CheckBashRuleParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBashRuleParamsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBashRuleParamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBashRuleParams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检验核心文件监控前端新增和编辑时的规则参数。
     * @param req CheckFileTamperRuleRequest
     * @return CheckFileTamperRuleResponse
     * @throws TencentCloudSDKException
     */
    public CheckFileTamperRuleResponse CheckFileTamperRule(CheckFileTamperRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckFileTamperRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckFileTamperRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckFileTamperRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线是否第一次检测
     * @param req CheckFirstScanBaselineRequest
     * @return CheckFirstScanBaselineResponse
     * @throws TencentCloudSDKException
     */
    public CheckFirstScanBaselineResponse CheckFirstScanBaseline(CheckFirstScanBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckFirstScanBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckFirstScanBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckFirstScanBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查日志投递kafka连通性
     * @param req CheckLogKafkaConnectionStateRequest
     * @return CheckLogKafkaConnectionStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckLogKafkaConnectionStateResponse CheckLogKafkaConnectionState(CheckLogKafkaConnectionStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckLogKafkaConnectionStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckLogKafkaConnectionStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckLogKafkaConnectionState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *清理本地存储数据
     * @param req ClearLocalStorageRequest
     * @return ClearLocalStorageResponse
     * @throws TencentCloudSDKException
     */
    public ClearLocalStorageResponse ClearLocalStorage(ClearLocalStorageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClearLocalStorageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ClearLocalStorageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClearLocalStorage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加阻断白名单列表
     * @param req CreateBanWhiteListRequest
     * @return CreateBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBanWhiteListResponse CreateBanWhiteList(CreateBanWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBanWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBanWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBanWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据策略信息创建基线策略
     * @param req CreateBaselineStrategyRequest
     * @return CreateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineStrategyResponse CreateBaselineStrategy(CreateBaselineStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBaselineStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBaselineStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBaselineStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新购授权自动绑定任务
     * @param req CreateBuyBindTaskRequest
     * @return CreateBuyBindTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBuyBindTaskResponse CreateBuyBindTask(CreateBuyBindTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBuyBindTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBuyBindTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBuyBindTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云护航服务使用完成后，该接口可以确认收货
     * @param req CreateCloudProtectServiceOrderRecordRequest
     * @return CreateCloudProtectServiceOrderRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudProtectServiceOrderRecordResponse CreateCloudProtectServiceOrderRecord(CreateCloudProtectServiceOrderRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudProtectServiceOrderRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudProtectServiceOrderRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudProtectServiceOrderRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建应急漏洞扫描任务
     * @param req CreateEmergencyVulScanRequest
     * @return CreateEmergencyVulScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmergencyVulScanResponse CreateEmergencyVulScan(CreateEmergencyVulScanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmergencyVulScanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmergencyVulScanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmergencyVulScan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对旗舰版机器单次触发事件调查及告警回溯
     * @param req CreateIncidentBacktrackingRequest
     * @return CreateIncidentBacktrackingResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncidentBacktrackingResponse CreateIncidentBacktracking(CreateIncidentBacktrackingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIncidentBacktrackingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIncidentBacktrackingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIncidentBacktracking");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<CreateLicenseOrderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLicenseOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLicenseOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建日志下载任务
     * @param req CreateLogExportRequest
     * @return CreateLogExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogExportResponse CreateLogExport(CreateLogExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加恶意请求白名单
     * @param req CreateMaliciousRequestWhiteListRequest
     * @return CreateMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateMaliciousRequestWhiteListResponse CreateMaliciousRequestWhiteList(CreateMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMaliciousRequestWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMaliciousRequestWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMaliciousRequestWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建木马白名单
     * @param req CreateMalwareWhiteListRequest
     * @return CreateMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateMalwareWhiteListResponse CreateMalwareWhiteList(CreateMalwareWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMalwareWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMalwareWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMalwareWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建网络攻击白名单
     * @param req CreateNetAttackWhiteListRequest
     * @return CreateNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetAttackWhiteListResponse CreateNetAttackWhiteList(CreateNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetAttackWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetAttackWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetAttackWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加网站防护服务器
     * @param req CreateProtectServerRequest
     * @return CreateProtectServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtectServerResponse CreateProtectServer(CreateProtectServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProtectServerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProtectServerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProtectServer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或修改防勒索策略
     * @param req CreateRansomDefenseStrategyRequest
     * @return CreateRansomDefenseStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateRansomDefenseStrategyResponse CreateRansomDefenseStrategy(CreateRansomDefenseStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRansomDefenseStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRansomDefenseStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRansomDefenseStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口可以对入侵检测-文件查杀扫描检测
     * @param req CreateScanMalwareSettingRequest
     * @return CreateScanMalwareSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanMalwareSettingResponse CreateScanMalwareSetting(CreateScanMalwareSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScanMalwareSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScanMalwareSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScanMalwareSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加历史搜索记录
     * @param req CreateSearchLogRequest
     * @return CreateSearchLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchLogResponse CreateSearchLog(CreateSearchLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSearchLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSearchLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSearchLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加检索模板
     * @param req CreateSearchTemplateRequest
     * @return CreateSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchTemplateResponse CreateSearchTemplate(CreateSearchTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSearchTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSearchTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSearchTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交漏洞修护
     * @param req CreateVulFixRequest
     * @return CreateVulFixResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixResponse CreateVulFix(CreateVulFixRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulFixResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVulFixResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVulFix");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口可以创建白名单订单
     * @param req CreateWhiteListOrderRequest
     * @return CreateWhiteListOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteListOrderResponse CreateWhiteListOrder(CreateWhiteListOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWhiteListOrderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWhiteListOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWhiteListOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除全部java内存马事件
     * @param req DeleteAllJavaMemShellsRequest
     * @return DeleteAllJavaMemShellsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllJavaMemShellsResponse DeleteAllJavaMemShells(DeleteAllJavaMemShellsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAllJavaMemShellsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAllJavaMemShellsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAllJavaMemShells");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除网络攻击日志
     * @param req DeleteAttackLogsRequest
     * @return DeleteAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackLogsResponse DeleteAttackLogs(DeleteAttackLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAttackLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAttackLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAttackLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除阻断白名单列表
     * @param req DeleteBanWhiteListRequest
     * @return DeleteBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBanWhiteListResponse DeleteBanWhiteList(DeleteBanWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBanWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBanWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBanWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除基线策略配置
     * @param req DeleteBaselinePolicyRequest
     * @return DeleteBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselinePolicyResponse DeleteBaselinePolicy(DeleteBaselinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselinePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaselinePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaselinePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除基线规则
     * @param req DeleteBaselineRuleRequest
     * @return DeleteBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineRuleResponse DeleteBaselineRule(DeleteBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselineRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaselineRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaselineRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除基线忽略规则
     * @param req DeleteBaselineRuleIgnoreRequest
     * @return DeleteBaselineRuleIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineRuleIgnoreResponse DeleteBaselineRuleIgnore(DeleteBaselineRuleIgnoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselineRuleIgnoreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaselineRuleIgnoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaselineRuleIgnore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线策略id删除策略
     * @param req DeleteBaselineStrategyRequest
     * @return DeleteBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineStrategyResponse DeleteBaselineStrategy(DeleteBaselineStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselineStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaselineStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaselineStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除基线弱口令
     * @param req DeleteBaselineWeakPasswordRequest
     * @return DeleteBaselineWeakPasswordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineWeakPasswordResponse DeleteBaselineWeakPassword(DeleteBaselineWeakPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselineWeakPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBaselineWeakPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBaselineWeakPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据Ids删除高危命令事件
     * @param req DeleteBashEventsRequest
     * @return DeleteBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashEventsResponse DeleteBashEvents(DeleteBashEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBashEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBashEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBashEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除高危命令策略
     * @param req DeleteBashPoliciesRequest
     * @return DeleteBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashPoliciesResponse DeleteBashPolicies(DeleteBashPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBashPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBashPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBashPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除高危命令规则
     * @param req DeleteBashRulesRequest
     * @return DeleteBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashRulesResponse DeleteBashRules(DeleteBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBashRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBashRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBashRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteBruteAttacks) 用于删除暴力破解记录。
     * @param req DeleteBruteAttacksRequest
     * @return DeleteBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBruteAttacksResponse DeleteBruteAttacks(DeleteBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBruteAttacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBruteAttacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBruteAttacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对授权管理-订单列表内已过期的订单进行删除.(删除后的订单不在统计范畴内)
     * @param req DeleteLicenseRecordRequest
     * @return DeleteLicenseRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLicenseRecordResponse DeleteLicenseRecord(DeleteLicenseRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLicenseRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLicenseRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLicenseRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除授权全部记录
     * @param req DeleteLicenseRecordAllRequest
     * @return DeleteLicenseRecordAllResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLicenseRecordAllResponse DeleteLicenseRecordAll(DeleteLicenseRecordAllRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLicenseRecordAllResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLicenseRecordAllResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLicenseRecordAll");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除日志下载任务
     * @param req DeleteLogExportRequest
     * @return DeleteLogExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogExportResponse DeleteLogExport(DeleteLogExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除异地登录白名单规则。
     * @param req DeleteLoginWhiteListRequest
     * @return DeleteLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginWhiteListResponse DeleteLoginWhiteList(DeleteLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoginWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLoginWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteMachine）用于卸载主机安全客户端。
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMachineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMachine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除机器清理记录
     * @param req DeleteMachineClearHistoryRequest
     * @return DeleteMachineClearHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineClearHistoryResponse DeleteMachineClearHistory(DeleteMachineClearHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineClearHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMachineClearHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMachineClearHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除服务器关联的标签
     * @param req DeleteMachineTagRequest
     * @return DeleteMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineTagResponse DeleteMachineTag(DeleteMachineTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMachineTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMachineTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除恶意请求白名单
     * @param req DeleteMaliciousRequestWhiteListRequest
     * @return DeleteMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestWhiteListResponse DeleteMaliciousRequestWhiteList(DeleteMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMaliciousRequestWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMaliciousRequestWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMaliciousRequestWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteMaliciousRequests) 用于删除恶意请求记录。
     * @param req DeleteMaliciousRequestsRequest
     * @return DeleteMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestsResponse DeleteMaliciousRequests(DeleteMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMaliciousRequestsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMaliciousRequests");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *入侵管理-终止扫描任务
     * @param req DeleteMalwareScanTaskRequest
     * @return DeleteMalwareScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwareScanTaskResponse DeleteMalwareScanTask(DeleteMalwareScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMalwareScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMalwareScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMalwareScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除木马白名单
     * @param req DeleteMalwareWhiteListRequest
     * @return DeleteMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwareWhiteListResponse DeleteMalwareWhiteList(DeleteMalwareWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMalwareWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMalwareWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMalwareWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteMalwares) 用于删除木马记录。
     * @param req DeleteMalwaresRequest
     * @return DeleteMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwaresResponse DeleteMalwares(DeleteMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除网络攻击白名单
     * @param req DeleteNetAttackWhiteListRequest
     * @return DeleteNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetAttackWhiteListResponse DeleteNetAttackWhiteList(DeleteNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetAttackWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetAttackWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetAttackWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteNonlocalLoginPlaces) 用于删除异地登录记录。
     * @param req DeleteNonlocalLoginPlacesRequest
     * @return DeleteNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNonlocalLoginPlacesResponse DeleteNonlocalLoginPlaces(DeleteNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNonlocalLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNonlocalLoginPlaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据Ids删除本地提权
     * @param req DeletePrivilegeEventsRequest
     * @return DeletePrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivilegeEventsResponse DeletePrivilegeEvents(DeletePrivilegeEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrivilegeEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrivilegeEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrivilegeEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除本地提权规则
     * @param req DeletePrivilegeRulesRequest
     * @return DeletePrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivilegeRulesResponse DeletePrivilegeRules(DeletePrivilegeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrivilegeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrivilegeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrivilegeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除防护网站
     * @param req DeleteProtectDirRequest
     * @return DeleteProtectDirResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProtectDirResponse DeleteProtectDir(DeleteProtectDirRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProtectDirResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProtectDirResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProtectDir");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据Ids删除反弹Shell事件
     * @param req DeleteReverseShellEventsRequest
     * @return DeleteReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellEventsResponse DeleteReverseShellEvents(DeleteReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReverseShellEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReverseShellEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReverseShellEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除反弹Shell规则
     * @param req DeleteReverseShellRulesRequest
     * @return DeleteReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellRulesResponse DeleteReverseShellRules(DeleteReverseShellRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReverseShellRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReverseShellRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReverseShellRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除恶意请求事件
     * @param req DeleteRiskDnsEventRequest
     * @return DeleteRiskDnsEventResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskDnsEventResponse DeleteRiskDnsEvent(DeleteRiskDnsEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRiskDnsEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRiskDnsEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRiskDnsEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除恶意请求策略
     * @param req DeleteRiskDnsPolicyRequest
     * @return DeleteRiskDnsPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskDnsPolicyResponse DeleteRiskDnsPolicy(DeleteRiskDnsPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRiskDnsPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRiskDnsPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRiskDnsPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DeleteScanTask 该接口可以对指定类型的扫描任务进行停止扫描;
     * @param req DeleteScanTaskRequest
     * @return DeleteScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScanTaskResponse DeleteScanTask(DeleteScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除检索模板
     * @param req DeleteSearchTemplateRequest
     * @return DeleteSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSearchTemplateResponse DeleteSearchTemplate(DeleteSearchTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSearchTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSearchTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSearchTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除标签
     * @param req DeleteTagsRequest
     * @return DeleteTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagsResponse DeleteTags(DeleteTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除告警策略
     * @param req DeleteWebHookPolicyRequest
     * @return DeleteWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookPolicyResponse DeleteWebHookPolicy(DeleteWebHookPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebHookPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebHookPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWebHookPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除告警接收人
     * @param req DeleteWebHookReceiverRequest
     * @return DeleteWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookReceiverResponse DeleteWebHookReceiver(DeleteWebHookReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebHookReceiverResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebHookReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWebHookReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除企微机器人规则
     * @param req DeleteWebHookRuleRequest
     * @return DeleteWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookRuleResponse DeleteWebHookRule(DeleteWebHookRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebHookRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebHookRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWebHookRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网站防篡改-删除事件记录
     * @param req DeleteWebPageEventLogRequest
     * @return DeleteWebPageEventLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebPageEventLogResponse DeleteWebPageEventLog(DeleteWebPageEventLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebPageEventLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebPageEventLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWebPageEventLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户当前灰度配置
     * @param req DescribeABTestConfigRequest
     * @return DescribeABTestConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeABTestConfigResponse DescribeABTestConfig(DescribeABTestConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeABTestConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeABTestConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeABTestConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取配置的aeskey和aesiv
     * @param req DescribeAESKeyRequest
     * @return DescribeAESKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAESKeyResponse DescribeAESKey(DescribeAESKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAESKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAESKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAESKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAccountStatistics) 用于获取帐号统计列表数据。
     * @param req DescribeAccountStatisticsRequest
     * @return DescribeAccountStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountStatisticsResponse DescribeAccountStatistics(DescribeAccountStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取agent安装命令
     * @param req DescribeAgentInstallCommandRequest
     * @return DescribeAgentInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallCommandResponse DescribeAgentInstallCommand(DescribeAgentInstallCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentInstallCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentInstallCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentInstallCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *混合云安装agent token获取
     * @param req DescribeAgentInstallationTokenRequest
     * @return DescribeAgentInstallationTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallationTokenResponse DescribeAgentInstallationToken(DescribeAgentInstallationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentInstallationTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentInstallationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentInstallationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取告警点所在事件的所有节点信息
     * @param req DescribeAlarmIncidentNodesRequest
     * @return DescribeAlarmIncidentNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmIncidentNodesResponse DescribeAlarmIncidentNodes(DescribeAlarmIncidentNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmIncidentNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmIncidentNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmIncidentNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警点id列表
     * @param req DescribeAlarmVertexIdRequest
     * @return DescribeAlarmVertexIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmVertexIdResponse DescribeAlarmVertexId(DescribeAlarmVertexIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmVertexIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmVertexIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmVertexId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有软件应用数量
     * @param req DescribeAssetAppCountRequest
     * @return DescribeAssetAppCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppCountResponse DescribeAssetAppCount(DescribeAssetAppCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetAppCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetAppCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetAppCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用列表
     * @param req DescribeAssetAppListRequest
     * @return DescribeAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppListResponse DescribeAssetAppList(DescribeAssetAppListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetAppListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetAppListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetAppList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取软件关联进程列表
     * @param req DescribeAssetAppProcessListRequest
     * @return DescribeAssetAppProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppProcessListResponse DescribeAssetAppProcessList(DescribeAssetAppProcessListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetAppProcessListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetAppProcessListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetAppProcessList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取内核模块详情
     * @param req DescribeAssetCoreModuleInfoRequest
     * @return DescribeAssetCoreModuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetCoreModuleInfoResponse DescribeAssetCoreModuleInfo(DescribeAssetCoreModuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetCoreModuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetCoreModuleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetCoreModuleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产管理内核模块列表
     * @param req DescribeAssetCoreModuleListRequest
     * @return DescribeAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetCoreModuleListResponse DescribeAssetCoreModuleList(DescribeAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetCoreModuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetCoreModuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetCoreModuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有数据库数量
     * @param req DescribeAssetDatabaseCountRequest
     * @return DescribeAssetDatabaseCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseCountResponse DescribeAssetDatabaseCount(DescribeAssetDatabaseCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDatabaseCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDatabaseCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDatabaseCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理数据库详情
     * @param req DescribeAssetDatabaseInfoRequest
     * @return DescribeAssetDatabaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseInfoResponse DescribeAssetDatabaseInfo(DescribeAssetDatabaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDatabaseInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDatabaseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDatabaseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产管理数据库列表
     * @param req DescribeAssetDatabaseListRequest
     * @return DescribeAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseListResponse DescribeAssetDatabaseList(DescribeAssetDatabaseListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDatabaseListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDatabaseListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDatabaseList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机磁盘分区列表
     * @param req DescribeAssetDiskListRequest
     * @return DescribeAssetDiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDiskListResponse DescribeAssetDiskList(DescribeAssetDiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产管理环境变量列表
     * @param req DescribeAssetEnvListRequest
     * @return DescribeAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetEnvListResponse DescribeAssetEnvList(DescribeAssetEnvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetEnvListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetEnvListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetEnvList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机所有资源数量
     * @param req DescribeAssetHostTotalCountRequest
     * @return DescribeAssetHostTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostTotalCountResponse DescribeAssetHostTotalCount(DescribeAssetHostTotalCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetHostTotalCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetHostTotalCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetHostTotalCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产数量： 主机数、账号数、端口数、进程数、软件数、数据库数、Web应用数、Web框架数、Web服务数、Web站点数
     * @param req DescribeAssetInfoRequest
     * @return DescribeAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInfoResponse DescribeAssetInfo(DescribeAssetInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产管理启动服务列表
     * @param req DescribeAssetInitServiceListRequest
     * @return DescribeAssetInitServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInitServiceListResponse DescribeAssetInitServiceList(DescribeAssetInitServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetInitServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetInitServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetInitServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Jar包详情
     * @param req DescribeAssetJarInfoRequest
     * @return DescribeAssetJarInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetJarInfoResponse DescribeAssetJarInfo(DescribeAssetJarInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetJarInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetJarInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetJarInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Jar包列表
     * @param req DescribeAssetJarListRequest
     * @return DescribeAssetJarListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetJarListResponse DescribeAssetJarList(DescribeAssetJarListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetJarListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetJarListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetJarList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取系统负载、内存使用率、硬盘使用率情况
     * @param req DescribeAssetLoadInfoRequest
     * @return DescribeAssetLoadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetLoadInfoResponse DescribeAssetLoadInfo(DescribeAssetLoadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetLoadInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetLoadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetLoadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理主机资源详细信息
     * @param req DescribeAssetMachineDetailRequest
     * @return DescribeAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineDetailResponse DescribeAssetMachineDetail(DescribeAssetMachineDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetMachineDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetMachineDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetMachineDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产指纹页面的资源监控列表
     * @param req DescribeAssetMachineListRequest
     * @return DescribeAssetMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineListResponse DescribeAssetMachineList(DescribeAssetMachineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetMachineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetMachineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetMachineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机标签Top5
     * @param req DescribeAssetMachineTagTopRequest
     * @return DescribeAssetMachineTagTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineTagTopResponse DescribeAssetMachineTagTop(DescribeAssetMachineTagTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetMachineTagTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetMachineTagTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetMachineTagTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产管理计划任务列表
     * @param req DescribeAssetPlanTaskListRequest
     * @return DescribeAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPlanTaskListResponse DescribeAssetPlanTaskList(DescribeAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPlanTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetPlanTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetPlanTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有端口数量
     * @param req DescribeAssetPortCountRequest
     * @return DescribeAssetPortCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortCountResponse DescribeAssetPortCount(DescribeAssetPortCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPortCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetPortCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetPortCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理端口列表
     * @param req DescribeAssetPortInfoListRequest
     * @return DescribeAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortInfoListResponse DescribeAssetPortInfoList(DescribeAssetPortInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPortInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetPortInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetPortInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有进程数量
     * @param req DescribeAssetProcessCountRequest
     * @return DescribeAssetProcessCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessCountResponse DescribeAssetProcessCount(DescribeAssetProcessCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetProcessCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetProcessCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetProcessCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理进程列表
     * @param req DescribeAssetProcessInfoListRequest
     * @return DescribeAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessInfoListResponse DescribeAssetProcessInfoList(DescribeAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetProcessInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetProcessInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetProcessInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机最近趋势情况
     * @param req DescribeAssetRecentMachineInfoRequest
     * @return DescribeAssetRecentMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRecentMachineInfoResponse DescribeAssetRecentMachineInfo(DescribeAssetRecentMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetRecentMachineInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetRecentMachineInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetRecentMachineInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理系统安装包列表
     * @param req DescribeAssetSystemPackageListRequest
     * @return DescribeAssetSystemPackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSystemPackageListResponse DescribeAssetSystemPackageList(DescribeAssetSystemPackageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetSystemPackageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetSystemPackageListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetSystemPackageList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有资源数量：主机、账号、端口、进程、软件、数据库、Web应用、Web框架、Web服务、Web站点
     * @param req DescribeAssetTotalCountRequest
     * @return DescribeAssetTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTotalCountResponse DescribeAssetTotalCount(DescribeAssetTotalCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetTotalCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetTotalCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetTotalCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取各种类型资源Top5
     * @param req DescribeAssetTypeTopRequest
     * @return DescribeAssetTypeTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTypeTopResponse DescribeAssetTypeTop(DescribeAssetTypeTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetTypeTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetTypeTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetTypeTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产指纹类型列表
     * @param req DescribeAssetTypesRequest
     * @return DescribeAssetTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTypesResponse DescribeAssetTypes(DescribeAssetTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有账号数量
     * @param req DescribeAssetUserCountRequest
     * @return DescribeAssetUserCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserCountResponse DescribeAssetUserCount(DescribeAssetUserCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetUserCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetUserCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetUserCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机账号详情
     * @param req DescribeAssetUserInfoRequest
     * @return DescribeAssetUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserInfoResponse DescribeAssetUserInfo(DescribeAssetUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetUserInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetUserInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetUserInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机账号Key列表
     * @param req DescribeAssetUserKeyListRequest
     * @return DescribeAssetUserKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserKeyListResponse DescribeAssetUserKeyList(DescribeAssetUserKeyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetUserKeyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetUserKeyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetUserKeyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取账号列表
     * @param req DescribeAssetUserListRequest
     * @return DescribeAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserListResponse DescribeAssetUserList(DescribeAssetUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetUserListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetUserListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetUserList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有Web应用数量
     * @param req DescribeAssetWebAppCountRequest
     * @return DescribeAssetWebAppCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppCountResponse DescribeAssetWebAppCount(DescribeAssetWebAppCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebAppCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebAppCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebAppCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理Web应用列表
     * @param req DescribeAssetWebAppListRequest
     * @return DescribeAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppListResponse DescribeAssetWebAppList(DescribeAssetWebAppListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebAppListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebAppListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebAppList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理Web应用插件列表
     * @param req DescribeAssetWebAppPluginListRequest
     * @return DescribeAssetWebAppPluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppPluginListResponse DescribeAssetWebAppPluginList(DescribeAssetWebAppPluginListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebAppPluginListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebAppPluginListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebAppPluginList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有Web框架数量
     * @param req DescribeAssetWebFrameCountRequest
     * @return DescribeAssetWebFrameCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameCountResponse DescribeAssetWebFrameCount(DescribeAssetWebFrameCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebFrameCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebFrameCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebFrameCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产管理Web框架列表
     * @param req DescribeAssetWebFrameListRequest
     * @return DescribeAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameListResponse DescribeAssetWebFrameList(DescribeAssetWebFrameListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebFrameListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebFrameListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebFrameList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有Web站点数量
     * @param req DescribeAssetWebLocationCountRequest
     * @return DescribeAssetWebLocationCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationCountResponse DescribeAssetWebLocationCount(DescribeAssetWebLocationCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebLocationCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebLocationCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebLocationCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Web站点详情
     * @param req DescribeAssetWebLocationInfoRequest
     * @return DescribeAssetWebLocationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationInfoResponse DescribeAssetWebLocationInfo(DescribeAssetWebLocationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebLocationInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebLocationInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebLocationInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Web站点列表
     * @param req DescribeAssetWebLocationListRequest
     * @return DescribeAssetWebLocationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationListResponse DescribeAssetWebLocationList(DescribeAssetWebLocationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebLocationListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebLocationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebLocationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Web站点虚拟目录列表
     * @param req DescribeAssetWebLocationPathListRequest
     * @return DescribeAssetWebLocationPathListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationPathListResponse DescribeAssetWebLocationPathList(DescribeAssetWebLocationPathListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebLocationPathListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebLocationPathListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebLocationPathList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有Web服务数量
     * @param req DescribeAssetWebServiceCountRequest
     * @return DescribeAssetWebServiceCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceCountResponse DescribeAssetWebServiceCount(DescribeAssetWebServiceCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebServiceCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebServiceCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebServiceCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产管理Web服务列表
     * @param req DescribeAssetWebServiceInfoListRequest
     * @return DescribeAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceInfoListResponse DescribeAssetWebServiceInfoList(DescribeAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebServiceInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebServiceInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebServiceInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Web服务关联进程列表
     * @param req DescribeAssetWebServiceProcessListRequest
     * @return DescribeAssetWebServiceProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceProcessListResponse DescribeAssetWebServiceProcessList(DescribeAssetWebServiceProcessListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebServiceProcessListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebServiceProcessListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebServiceProcessList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网络攻击事件详情
     * @param req DescribeAttackEventInfoRequest
     * @return DescribeAttackEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackEventInfoResponse DescribeAttackEventInfo(DescribeAttackEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackEventInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackEventInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackEventInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按分页形式展示网络攻击检测事件列表
     * @param req DescribeAttackEventsRequest
     * @return DescribeAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackEventsResponse DescribeAttackEvents(DescribeAttackEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网络攻击日志详情
     * @param req DescribeAttackLogInfoRequest
     * @return DescribeAttackLogInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogInfoResponse DescribeAttackLogInfo(DescribeAttackLogInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackLogInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackLogInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackLogInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按分页形式展示网络攻击日志列表
     * @param req DescribeAttackLogsRequest
     * @return DescribeAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogsResponse DescribeAttackLogs(DescribeAttackLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询攻击溯源
     * @param req DescribeAttackSourceRequest
     * @return DescribeAttackSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackSourceResponse DescribeAttackSource(DescribeAttackSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackSourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackSourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackSource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询攻击溯源事件
     * @param req DescribeAttackSourceEventsRequest
     * @return DescribeAttackSourceEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackSourceEventsResponse DescribeAttackSourceEvents(DescribeAttackSourceEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackSourceEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackSourceEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackSourceEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网络攻击数据统计
     * @param req DescribeAttackStatisticsRequest
     * @return DescribeAttackStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackStatisticsResponse DescribeAttackStatistics(DescribeAttackStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网络攻击top5数据列表
     * @param req DescribeAttackTopRequest
     * @return DescribeAttackTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTopResponse DescribeAttackTop(DescribeAttackTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网络攻击趋势数据
     * @param req DescribeAttackTrendsRequest
     * @return DescribeAttackTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTrendsResponse DescribeAttackTrends(DescribeAttackTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackTrendsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackTrendsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackTrends");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取网络攻击威胁类型列表
     * @param req DescribeAttackVulTypeListRequest
     * @return DescribeAttackVulTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackVulTypeListResponse DescribeAttackVulTypeList(DescribeAttackVulTypeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackVulTypeListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackVulTypeListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackVulTypeList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专家服务-可用订单详情
     * @param req DescribeAvailableExpertServiceDetailRequest
     * @return DescribeAvailableExpertServiceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableExpertServiceDetailResponse DescribeAvailableExpertServiceDetail(DescribeAvailableExpertServiceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableExpertServiceDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableExpertServiceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableExpertServiceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取爆破阻断模式
     * @param req DescribeBanModeRequest
     * @return DescribeBanModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanModeResponse DescribeBanMode(DescribeBanModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBanModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBanModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBanMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取阻断地域
     * @param req DescribeBanRegionsRequest
     * @return DescribeBanRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanRegionsResponse DescribeBanRegions(DescribeBanRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBanRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBanRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBanRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取阻断按钮状态
     * @param req DescribeBanStatusRequest
     * @return DescribeBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanStatusResponse DescribeBanStatus(DescribeBanStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBanStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBanStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBanStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取阻断白名单列表
     * @param req DescribeBanWhiteListRequest
     * @return DescribeBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanWhiteListResponse DescribeBanWhiteList(DescribeBanWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBanWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBanWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBanWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线策略id查询基线策略数据概览统计
     * @param req DescribeBaselineAnalysisDataRequest
     * @return DescribeBaselineAnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAnalysisDataResponse DescribeBaselineAnalysisData(DescribeBaselineAnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineAnalysisDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineAnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineAnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线基础信息列表
     * @param req DescribeBaselineBasicInfoRequest
     * @return DescribeBaselineBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineBasicInfoResponse DescribeBaselineBasicInfo(DescribeBaselineBasicInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineBasicInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineBasicInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineBasicInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线默认策略列表信息
     * @param req DescribeBaselineDefaultStrategyListRequest
     * @return DescribeBaselineDefaultStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDefaultStrategyListResponse DescribeBaselineDefaultStrategyList(DescribeBaselineDefaultStrategyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineDefaultStrategyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineDefaultStrategyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineDefaultStrategyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线id查询基线详情接口
     * @param req DescribeBaselineDetailRequest
     * @return DescribeBaselineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetailResponse DescribeBaselineDetail(DescribeBaselineDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线检测详情记录
     * @param req DescribeBaselineDetectListRequest
     * @return DescribeBaselineDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetectListResponse DescribeBaselineDetectList(DescribeBaselineDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线检测概览
     * @param req DescribeBaselineDetectOverviewRequest
     * @return DescribeBaselineDetectOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetectOverviewResponse DescribeBaselineDetectOverview(DescribeBaselineDetectOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineDetectOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineDetectOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineDetectOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线下载列表
     * @param req DescribeBaselineDownloadListRequest
     * @return DescribeBaselineDownloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDownloadListResponse DescribeBaselineDownloadList(DescribeBaselineDownloadListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineDownloadListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineDownloadListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineDownloadList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线id查询基线影响主机列表
     * @param req DescribeBaselineEffectHostListRequest
     * @return DescribeBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineEffectHostListResponse DescribeBaselineEffectHostList(DescribeBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineEffectHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineEffectHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineEffectHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线修复列表
     * @param req DescribeBaselineFixListRequest
     * @return DescribeBaselineFixListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineFixListResponse DescribeBaselineFixList(DescribeBaselineFixListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineFixListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineFixListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineFixList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线检测主机列表
     * @param req DescribeBaselineHostDetectListRequest
     * @return DescribeBaselineHostDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostDetectListResponse DescribeBaselineHostDetectList(DescribeBaselineHostDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineHostDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineHostDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineHostDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取忽略规则主机列表
     * @param req DescribeBaselineHostIgnoreListRequest
     * @return DescribeBaselineHostIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostIgnoreListResponse DescribeBaselineHostIgnoreList(DescribeBaselineHostIgnoreListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineHostIgnoreListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineHostIgnoreListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineHostIgnoreList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线服务器风险TOP5
     * @param req DescribeBaselineHostRiskTopRequest
     * @return DescribeBaselineHostRiskTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostRiskTopResponse DescribeBaselineHostRiskTop(DescribeBaselineHostRiskTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineHostRiskTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineHostRiskTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineHostRiskTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口返回TopN的风险服务器
     * @param req DescribeBaselineHostTopRequest
     * @return DescribeBaselineHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostTopResponse DescribeBaselineHostTop(DescribeBaselineHostTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineHostTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineHostTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineHostTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线检测项的列表
     * @param req DescribeBaselineItemDetectListRequest
     * @return DescribeBaselineItemDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemDetectListResponse DescribeBaselineItemDetectList(DescribeBaselineItemDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineItemDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineItemDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineItemDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取忽略规则项列表
     * @param req DescribeBaselineItemIgnoreListRequest
     * @return DescribeBaselineItemIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemIgnoreListResponse DescribeBaselineItemIgnoreList(DescribeBaselineItemIgnoreListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineItemIgnoreListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineItemIgnoreListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineItemIgnoreList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线检测项信息
     * @param req DescribeBaselineItemInfoRequest
     * @return DescribeBaselineItemInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemInfoResponse DescribeBaselineItemInfo(DescribeBaselineItemInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineItemInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineItemInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineItemInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线项检测结果列表
     * @param req DescribeBaselineItemListRequest
     * @return DescribeBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemListResponse DescribeBaselineItemList(DescribeBaselineItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineItemListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineItemListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineItemList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线检测项TOP5
     * @param req DescribeBaselineItemRiskTopRequest
     * @return DescribeBaselineItemRiskTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemRiskTopResponse DescribeBaselineItemRiskTop(DescribeBaselineItemRiskTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineItemRiskTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineItemRiskTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineItemRiskTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询基线列表信息
     * @param req DescribeBaselineListRequest
     * @return DescribeBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineListResponse DescribeBaselineList(DescribeBaselineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线策略列表
     * @param req DescribeBaselinePolicyListRequest
     * @return DescribeBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyListResponse DescribeBaselinePolicyList(DescribeBaselinePolicyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselinePolicyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselinePolicyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselinePolicyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线id查询下属检测项信息
     * @param req DescribeBaselineRuleRequest
     * @return DescribeBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleResponse DescribeBaselineRule(DescribeBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线分类列表
     * @param req DescribeBaselineRuleCategoryListRequest
     * @return DescribeBaselineRuleCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleCategoryListResponse DescribeBaselineRuleCategoryList(DescribeBaselineRuleCategoryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineRuleCategoryListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineRuleCategoryListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineRuleCategoryList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线规则检测列表
     * @param req DescribeBaselineRuleDetectListRequest
     * @return DescribeBaselineRuleDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleDetectListResponse DescribeBaselineRuleDetectList(DescribeBaselineRuleDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineRuleDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineRuleDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineRuleDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线忽略规则列表
     * @param req DescribeBaselineRuleIgnoreListRequest
     * @return DescribeBaselineRuleIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleIgnoreListResponse DescribeBaselineRuleIgnoreList(DescribeBaselineRuleIgnoreListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineRuleIgnoreListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineRuleIgnoreListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineRuleIgnoreList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线规则列表
     * @param req DescribeBaselineRuleListRequest
     * @return DescribeBaselineRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleListResponse DescribeBaselineRuleList(DescribeBaselineRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineRuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据任务id查询基线检测进度
     * @param req DescribeBaselineScanScheduleRequest
     * @return DescribeBaselineScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineScanScheduleResponse DescribeBaselineScanSchedule(DescribeBaselineScanScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineScanScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineScanScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineScanSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线策略id查询策略详情
     * @param req DescribeBaselineStrategyDetailRequest
     * @return DescribeBaselineStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineStrategyDetailResponse DescribeBaselineStrategyDetail(DescribeBaselineStrategyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineStrategyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineStrategyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineStrategyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询一个用户下的基线策略信息
     * @param req DescribeBaselineStrategyListRequest
     * @return DescribeBaselineStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineStrategyListResponse DescribeBaselineStrategyList(DescribeBaselineStrategyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineStrategyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineStrategyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineStrategyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据策略id查询基线检测项TOP
     * @param req DescribeBaselineTopRequest
     * @return DescribeBaselineTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineTopResponse DescribeBaselineTop(DescribeBaselineTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基线弱口令列表
     * @param req DescribeBaselineWeakPasswordListRequest
     * @return DescribeBaselineWeakPasswordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineWeakPasswordListResponse DescribeBaselineWeakPasswordList(DescribeBaselineWeakPasswordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineWeakPasswordListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaselineWeakPasswordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBaselineWeakPasswordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高危命令列表
     * @param req DescribeBashEventsRequest
     * @return DescribeBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsResponse DescribeBashEvents(DescribeBashEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBashEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBashEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询高危命令事件详情
     * @param req DescribeBashEventsInfoRequest
     * @return DescribeBashEventsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsInfoResponse DescribeBashEventsInfo(DescribeBashEventsInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashEventsInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBashEventsInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBashEventsInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询高危命令事件详情(新)
     * @param req DescribeBashEventsInfoNewRequest
     * @return DescribeBashEventsInfoNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsInfoNewResponse DescribeBashEventsInfoNew(DescribeBashEventsInfoNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashEventsInfoNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBashEventsInfoNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBashEventsInfoNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高危命令列表(新)
     * @param req DescribeBashEventsNewRequest
     * @return DescribeBashEventsNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsNewResponse DescribeBashEventsNew(DescribeBashEventsNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashEventsNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBashEventsNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBashEventsNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高危命令策略列表
     * @param req DescribeBashPoliciesRequest
     * @return DescribeBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashPoliciesResponse DescribeBashPolicies(DescribeBashPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBashPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBashPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高危命令规则列表
     * @param req DescribeBashRulesRequest
     * @return DescribeBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashRulesResponse DescribeBashRules(DescribeBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBashRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBashRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取密码破解列表
     * @param req DescribeBruteAttackListRequest
     * @return DescribeBruteAttackListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttackListResponse DescribeBruteAttackList(DescribeBruteAttackListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBruteAttackListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBruteAttackListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBruteAttackList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取爆破破解规则
     * @param req DescribeBruteAttackRulesRequest
     * @return DescribeBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttackRulesResponse DescribeBruteAttackRules(DescribeBruteAttackRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBruteAttackRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBruteAttackRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBruteAttackRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞修护-查询可修护主机信息
     * @param req DescribeCanFixVulMachineRequest
     * @return DescribeCanFixVulMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCanFixVulMachineResponse DescribeCanFixVulMachine(DescribeCanFixVulMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCanFixVulMachineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCanFixVulMachineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCanFixVulMachine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取木马不可隔离的主机
     * @param req DescribeCanNotSeparateMachineRequest
     * @return DescribeCanNotSeparateMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCanNotSeparateMachineResponse DescribeCanNotSeparateMachine(DescribeCanNotSeparateMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCanNotSeparateMachineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCanNotSeparateMachineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCanNotSeparateMachine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取客户端异常事件
     * @param req DescribeClientExceptionRequest
     * @return DescribeClientExceptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientExceptionResponse DescribeClientException(DescribeClientExceptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientExceptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientExceptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClientException");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云护航服务订单列表
     * @param req DescribeCloudProtectServiceOrderListRequest
     * @return DescribeCloudProtectServiceOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudProtectServiceOrderListResponse DescribeCloudProtectServiceOrderList(DescribeCloudProtectServiceOrderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudProtectServiceOrderListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudProtectServiceOrderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudProtectServiceOrderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeComponentStatistics) 用于获取组件统计列表数据。
     * @param req DescribeComponentStatisticsRequest
     * @return DescribeComponentStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentStatisticsResponse DescribeComponentStatistics(DescribeComponentStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComponentStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComponentStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞防御事件详情
     * @param req DescribeDefenceEventDetailRequest
     * @return DescribeDefenceEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefenceEventDetailResponse DescribeDefenceEventDetail(DescribeDefenceEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefenceEventDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefenceEventDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefenceEventDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取专线agent安装命令，包含token
     * @param req DescribeDirectConnectInstallCommandRequest
     * @return DescribeDirectConnectInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectInstallCommandResponse DescribeDirectConnectInstallCommand(DescribeDirectConnectInstallCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectInstallCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectInstallCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnectInstallCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取ES字段聚合结果
     * @param req DescribeESAggregationsRequest
     * @return DescribeESAggregationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAggregationsResponse DescribeESAggregations(DescribeESAggregationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeESAggregationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeESAggregationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeESAggregations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专家服务-应急响应列表
     * @param req DescribeEmergencyResponseListRequest
     * @return DescribeEmergencyResponseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyResponseListResponse DescribeEmergencyResponseList(DescribeEmergencyResponseListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEmergencyResponseListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEmergencyResponseListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEmergencyResponseList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应急漏洞列表
     * @param req DescribeEmergencyVulListRequest
     * @return DescribeEmergencyVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyVulListResponse DescribeEmergencyVulList(DescribeEmergencyVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEmergencyVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEmergencyVulListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEmergencyVulList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据事件表名和id查询告警事件详情
     * @param req DescribeEventByTableRequest
     * @return DescribeEventByTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventByTableResponse DescribeEventByTable(DescribeEventByTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventByTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventByTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventByTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专家服务-安全管家列表
     * @param req DescribeExpertServiceListRequest
     * @return DescribeExpertServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceListResponse DescribeExpertServiceList(DescribeExpertServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExpertServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExpertServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExpertServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专家服务-专家服务订单列表
     * @param req DescribeExpertServiceOrderListRequest
     * @return DescribeExpertServiceOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceOrderListResponse DescribeExpertServiceOrderList(DescribeExpertServiceOrderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExpertServiceOrderListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExpertServiceOrderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExpertServiceOrderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeExportMachines) 用于导出区域主机列表。
     * @param req DescribeExportMachinesRequest
     * @return DescribeExportMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportMachinesResponse DescribeExportMachines(DescribeExportMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExportMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExportMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *日志快速分析统计
     * @param req DescribeFastAnalysisRequest
     * @return DescribeFastAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastAnalysisResponse DescribeFastAnalysis(DescribeFastAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFastAnalysisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFastAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFastAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看产生事件时规则详情接口
     * @param req DescribeFileTamperEventRuleInfoRequest
     * @return DescribeFileTamperEventRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperEventRuleInfoResponse DescribeFileTamperEventRuleInfo(DescribeFileTamperEventRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileTamperEventRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileTamperEventRuleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileTamperEventRuleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核心文件监控事件列表
     * @param req DescribeFileTamperEventsRequest
     * @return DescribeFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperEventsResponse DescribeFileTamperEvents(DescribeFileTamperEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileTamperEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileTamperEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileTamperEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机关联文件监控规则数量
     * @param req DescribeFileTamperRuleCountRequest
     * @return DescribeFileTamperRuleCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRuleCountResponse DescribeFileTamperRuleCount(DescribeFileTamperRuleCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileTamperRuleCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileTamperRuleCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileTamperRuleCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某个监控规则的详情
     * @param req DescribeFileTamperRuleInfoRequest
     * @return DescribeFileTamperRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRuleInfoResponse DescribeFileTamperRuleInfo(DescribeFileTamperRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileTamperRuleInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileTamperRuleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileTamperRuleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核心文件监控规则列表
     * @param req DescribeFileTamperRulesRequest
     * @return DescribeFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRulesResponse DescribeFileTamperRules(DescribeFileTamperRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileTamperRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileTamperRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileTamperRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机相关统计
     * @param req DescribeGeneralStatRequest
     * @return DescribeGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralStatResponse DescribeGeneralStat(DescribeGeneralStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGeneralStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGeneralStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGeneralStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeHistoryAccounts) 用于获取帐号变更历史列表数据。
     * @param req DescribeHistoryAccountsRequest
     * @return DescribeHistoryAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryAccountsResponse DescribeHistoryAccounts(DescribeHistoryAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHistoryAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHistoryAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询日志检索服务信息
     * @param req DescribeHistoryServiceRequest
     * @return DescribeHistoryServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryServiceResponse DescribeHistoryService(DescribeHistoryServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHistoryServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHistoryService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *主机信息与标签信息查询
     * @param req DescribeHostInfoRequest
     * @return DescribeHostInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostInfoResponse DescribeHostInfo(DescribeHostInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取登录审计列表
     * @param req DescribeHostLoginListRequest
     * @return DescribeHostLoginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLoginListResponse DescribeHostLoginList(DescribeHostLoginListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostLoginListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostLoginListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostLoginList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取全网热点漏洞
     * @param req DescribeHotVulTopRequest
     * @return DescribeHotVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHotVulTopResponse DescribeHotVulTop(DescribeHotVulTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHotVulTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHotVulTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHotVulTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已经忽略的检测项信息
     * @param req DescribeIgnoreBaselineRuleRequest
     * @return DescribeIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreBaselineRuleResponse DescribeIgnoreBaselineRule(DescribeIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIgnoreBaselineRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIgnoreBaselineRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIgnoreBaselineRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取一键忽略受影响的检测项和主机信息
     * @param req DescribeIgnoreHostAndItemConfigRequest
     * @return DescribeIgnoreHostAndItemConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreHostAndItemConfigResponse DescribeIgnoreHostAndItemConfig(DescribeIgnoreHostAndItemConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIgnoreHostAndItemConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIgnoreHostAndItemConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIgnoreHostAndItemConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据检测项id与筛选条件查询忽略检测项影响主机列表信息
     * @param req DescribeIgnoreRuleEffectHostListRequest
     * @return DescribeIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreRuleEffectHostListResponse DescribeIgnoreRuleEffectHostList(DescribeIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIgnoreRuleEffectHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIgnoreRuleEffectHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIgnoreRuleEffectHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询批量导入机器信息
     * @param req DescribeImportMachineInfoRequest
     * @return DescribeImportMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportMachineInfoResponse DescribeImportMachineInfo(DescribeImportMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImportMachineInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImportMachineInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImportMachineInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取索引列表
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIndexListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIndexList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询java内存马事件详细信息
     * @param req DescribeJavaMemShellInfoRequest
     * @return DescribeJavaMemShellInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellInfoResponse DescribeJavaMemShellInfo(DescribeJavaMemShellInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJavaMemShellInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJavaMemShellInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJavaMemShellInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询java内存马事件列表
     * @param req DescribeJavaMemShellListRequest
     * @return DescribeJavaMemShellListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellListResponse DescribeJavaMemShellList(DescribeJavaMemShellListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJavaMemShellListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJavaMemShellListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJavaMemShellList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询给定主机java内存马插件信息
     * @param req DescribeJavaMemShellPluginInfoRequest
     * @return DescribeJavaMemShellPluginInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellPluginInfoResponse DescribeJavaMemShellPluginInfo(DescribeJavaMemShellPluginInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJavaMemShellPluginInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJavaMemShellPluginInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJavaMemShellPluginInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询java内存马插件列表
     * @param req DescribeJavaMemShellPluginListRequest
     * @return DescribeJavaMemShellPluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellPluginListResponse DescribeJavaMemShellPluginList(DescribeJavaMemShellPluginListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJavaMemShellPluginListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJavaMemShellPluginListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJavaMemShellPluginList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询授权信息
     * @param req DescribeLicenseRequest
     * @return DescribeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseResponse DescribeLicense(DescribeLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLicenseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLicenseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLicense");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口可以获取设置中心-授权管理,某个授权下已绑定的授权机器列表
     * @param req DescribeLicenseBindListRequest
     * @return DescribeLicenseBindListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseBindListResponse DescribeLicenseBindList(DescribeLicenseBindListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLicenseBindListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLicenseBindListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLicenseBindList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询授权绑定任务的进度
     * @param req DescribeLicenseBindScheduleRequest
     * @return DescribeLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseBindScheduleResponse DescribeLicenseBindSchedule(DescribeLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLicenseBindScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLicenseBindScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLicenseBindSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *授权管理-授权概览信息
     * @param req DescribeLicenseGeneralRequest
     * @return DescribeLicenseGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseGeneralResponse DescribeLicenseGeneral(DescribeLicenseGeneralRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLicenseGeneralResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLicenseGeneralResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLicenseGeneral");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户所有授权订单信息
     * @param req DescribeLicenseListRequest
     * @return DescribeLicenseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseListResponse DescribeLicenseList(DescribeLicenseListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLicenseListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLicenseListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLicenseList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询授权白名单的可用配置
     * @param req DescribeLicenseWhiteConfigRequest
     * @return DescribeLicenseWhiteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseWhiteConfigResponse DescribeLicenseWhiteConfig(DescribeLicenseWhiteConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLicenseWhiteConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLicenseWhiteConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLicenseWhiteConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询日志投递kafka可选项列表
     * @param req DescribeLogDeliveryKafkaOptionsRequest
     * @return DescribeLogDeliveryKafkaOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDeliveryKafkaOptionsResponse DescribeLogDeliveryKafkaOptions(DescribeLogDeliveryKafkaOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogDeliveryKafkaOptionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogDeliveryKafkaOptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogDeliveryKafkaOptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取日志下载任务列表
     * @param req DescribeLogExportsRequest
     * @return DescribeLogExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogExportsResponse DescribeLogExports(DescribeLogExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogExportsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogExportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogExports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取日志直方图信息
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogHistogramResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogHistogramResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogHistogram");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询索引
     * @param req DescribeLogIndexRequest
     * @return DescribeLogIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogIndexResponse DescribeLogIndex(DescribeLogIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取kafka投递信息
     * @param req DescribeLogKafkaDeliverInfoRequest
     * @return DescribeLogKafkaDeliverInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogKafkaDeliverInfoResponse DescribeLogKafkaDeliverInfo(DescribeLogKafkaDeliverInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogKafkaDeliverInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogKafkaDeliverInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogKafkaDeliverInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取日志存储配置
     * @param req DescribeLogStorageConfigRequest
     * @return DescribeLogStorageConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageConfigResponse DescribeLogStorageConfig(DescribeLogStorageConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogStorageConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogStorageConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogStorageConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取日志存储量记录
     * @param req DescribeLogStorageRecordRequest
     * @return DescribeLogStorageRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageRecordResponse DescribeLogStorageRecord(DescribeLogStorageRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogStorageRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogStorageRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogStorageRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取日志检索容量使用统计
     * @param req DescribeLogStorageStatisticRequest
     * @return DescribeLogStorageStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageStatisticResponse DescribeLogStorageStatistic(DescribeLogStorageStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogStorageStatisticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogStorageStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogStorageStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *日志分析功能-获取日志类型，使用该接口返回的结果暂时可过滤的日志类型
     * @param req DescribeLogTypeRequest
     * @return DescribeLogTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTypeResponse DescribeLogType(DescribeLogTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取异地登录白名单合并后列表
     * @param req DescribeLoginWhiteCombinedListRequest
     * @return DescribeLoginWhiteCombinedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteCombinedListResponse DescribeLoginWhiteCombinedList(DescribeLoginWhiteCombinedListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginWhiteCombinedListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoginWhiteCombinedListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLoginWhiteCombinedList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询合并后白名单机器列表
     * @param req DescribeLoginWhiteHostListRequest
     * @return DescribeLoginWhiteHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteHostListResponse DescribeLoginWhiteHostList(DescribeLoginWhiteHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginWhiteHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoginWhiteHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLoginWhiteHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取异地登录白名单列表
     * @param req DescribeLoginWhiteListRequest
     * @return DescribeLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteListResponse DescribeLoginWhiteList(DescribeLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoginWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLoginWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询机器清理历史记录
     * @param req DescribeMachineClearHistoryRequest
     * @return DescribeMachineClearHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineClearHistoryResponse DescribeMachineClearHistory(DescribeMachineClearHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineClearHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineClearHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineClearHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机高级防御事件数统计
     * @param req DescribeMachineDefenseCntRequest
     * @return DescribeMachineDefenseCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineDefenseCntResponse DescribeMachineDefenseCnt(DescribeMachineDefenseCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineDefenseCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineDefenseCntResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineDefenseCnt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机相关核心文件监控规则列 表   
     * @param req DescribeMachineFileTamperRulesRequest
     * @return DescribeMachineFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineFileTamperRulesResponse DescribeMachineFileTamperRules(DescribeMachineFileTamperRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineFileTamperRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineFileTamperRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineFileTamperRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机概览信息
     * @param req DescribeMachineGeneralRequest
     * @return DescribeMachineGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGeneralResponse DescribeMachineGeneral(DescribeMachineGeneralRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineGeneralResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineGeneralResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineGeneral");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMachineInfo）用于获取机器详细信息。
     * @param req DescribeMachineInfoRequest
     * @return DescribeMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineInfoResponse DescribeMachineInfo(DescribeMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeMachineLicenseDetail)查询机器授权信息
     * @param req DescribeMachineLicenseDetailRequest
     * @return DescribeMachineLicenseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineLicenseDetailResponse DescribeMachineLicenseDetail(DescribeMachineLicenseDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineLicenseDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineLicenseDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineLicenseDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于网页防篡改获取区域主机列表。
     * @param req DescribeMachineListRequest
     * @return DescribeMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineListResponse DescribeMachineList(DescribeMachineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询可筛选操作系统列表.
     * @param req DescribeMachineOsListRequest
     * @return DescribeMachineOsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineOsListResponse DescribeMachineOsList(DescribeMachineOsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineOsListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineOsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineOsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机地域列表
     * @param req DescribeMachineRegionListRequest
     * @return DescribeMachineRegionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionListResponse DescribeMachineRegionList(DescribeMachineRegionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineRegionListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineRegionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineRegionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取机器地域列表
     * @param req DescribeMachineRegionsRequest
     * @return DescribeMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionsResponse DescribeMachineRegions(DescribeMachineRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机入侵检测事件统计
     * @param req DescribeMachineRiskCntRequest
     * @return DescribeMachineRiskCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRiskCntResponse DescribeMachineRiskCnt(DescribeMachineRiskCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineRiskCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineRiskCntResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineRiskCnt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞修护-查询主机创建的快照
     * @param req DescribeMachineSnapshotRequest
     * @return DescribeMachineSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineSnapshotResponse DescribeMachineSnapshot(DescribeMachineSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineSnapshotResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeMachines) 用于获取区域主机列表。
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeMachinesSimple) 用于获取主机列表。
     * @param req DescribeMachinesSimpleRequest
     * @return DescribeMachinesSimpleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesSimpleResponse DescribeMachinesSimple(DescribeMachinesSimpleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesSimpleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachinesSimpleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachinesSimple");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *入侵检测获取木马列表
     * @param req DescribeMalWareListRequest
     * @return DescribeMalWareListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalWareListResponse DescribeMalWareList(DescribeMalWareListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalWareListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalWareListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalWareList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询恶意请求白名单列表
     * @param req DescribeMaliciousRequestWhiteListRequest
     * @return DescribeMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaliciousRequestWhiteListResponse DescribeMaliciousRequestWhiteList(DescribeMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaliciousRequestWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMaliciousRequestWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMaliciousRequestWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取木马文件下载地址
     * @param req DescribeMalwareFileRequest
     * @return DescribeMalwareFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareFileResponse DescribeMalwareFile(DescribeMalwareFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看恶意文件详情
     * @param req DescribeMalwareInfoRequest
     * @return DescribeMalwareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareInfoResponse DescribeMalwareInfo(DescribeMalwareInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取文件查杀概览信息
     * @param req DescribeMalwareRiskOverviewRequest
     * @return DescribeMalwareRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskOverviewResponse DescribeMalwareRiskOverview(DescribeMalwareRiskOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareRiskOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareRiskOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareRiskOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *打开入侵检测-恶意文件检测,弹出风险预警内容
     * @param req DescribeMalwareRiskWarningRequest
     * @return DescribeMalwareRiskWarningResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskWarningResponse DescribeMalwareRiskWarning(DescribeMalwareRiskWarningRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareRiskWarningResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareRiskWarningResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareRiskWarning");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询定时扫描配置
     * @param req DescribeMalwareTimingScanSettingRequest
     * @return DescribeMalwareTimingScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareTimingScanSettingResponse DescribeMalwareTimingScanSetting(DescribeMalwareTimingScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareTimingScanSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareTimingScanSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareTimingScanSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取木马白名单列表
     * @param req DescribeMalwareWhiteListRequest
     * @return DescribeMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareWhiteListResponse DescribeMalwareWhiteList(DescribeMalwareWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取木马白名单受影响列表
     * @param req DescribeMalwareWhiteListAffectListRequest
     * @return DescribeMalwareWhiteListAffectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareWhiteListAffectListResponse DescribeMalwareWhiteListAffectList(DescribeMalwareWhiteListAffectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareWhiteListAffectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwareWhiteListAffectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwareWhiteListAffectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专家服务-安全管家月巡检报告下载
     * @param req DescribeMonthInspectionReportRequest
     * @return DescribeMonthInspectionReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonthInspectionReportResponse DescribeMonthInspectionReport(DescribeMonthInspectionReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonthInspectionReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonthInspectionReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonthInspectionReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网络攻击设置
     * @param req DescribeNetAttackSettingRequest
     * @return DescribeNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackSettingResponse DescribeNetAttackSetting(DescribeNetAttackSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetAttackSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetAttackSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetAttackSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取网络攻击白名单列表
     * @param req DescribeNetAttackWhiteListRequest
     * @return DescribeNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackWhiteListResponse DescribeNetAttackWhiteList(DescribeNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetAttackWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetAttackWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetAttackWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeOpenPortStatistics) 用于获取端口统计列表。
     * @param req DescribeOpenPortStatisticsRequest
     * @return DescribeOpenPortStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortStatisticsResponse DescribeOpenPortStatistics(DescribeOpenPortStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpenPortStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpenPortStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取概览统计数据。
     * @param req DescribeOverviewStatisticsRequest
     * @return DescribeOverviewStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewStatisticsResponse DescribeOverviewStatistics(DescribeOverviewStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOverviewStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOverviewStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本地提权信息详情
     * @param req DescribePrivilegeEventInfoRequest
     * @return DescribePrivilegeEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeEventInfoResponse DescribePrivilegeEventInfo(DescribePrivilegeEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivilegeEventInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivilegeEventInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivilegeEventInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取本地提权事件列表
     * @param req DescribePrivilegeEventsRequest
     * @return DescribePrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeEventsResponse DescribePrivilegeEvents(DescribePrivilegeEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivilegeEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivilegeEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivilegeEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取本地提权规则列表
     * @param req DescribePrivilegeRulesRequest
     * @return DescribePrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeRulesResponse DescribePrivilegeRules(DescribePrivilegeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivilegeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrivilegeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrivilegeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取专业版概览信息。
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProVersionInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProVersionInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProVersionInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取单台主机或所有主机是否开通专业版状态。
     * @param req DescribeProVersionStatusRequest
     * @return DescribeProVersionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionStatusResponse DescribeProVersionStatus(DescribeProVersionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProVersionStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProVersionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProVersionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeProcessStatistics) 用于获取进程统计列表数据。
     * @param req DescribeProcessStatisticsRequest
     * @return DescribeProcessStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessStatisticsResponse DescribeProcessStatistics(DescribeProcessStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcessStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProcessStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProcessStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *产品试用状态查询接口
     * @param req DescribeProductStatusRequest
     * @return DescribeProductStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductStatusResponse DescribeProductStatus(DescribeProductStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网页防篡改防护目录列表
     * @param req DescribeProtectDirListRequest
     * @return DescribeProtectDirListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectDirListResponse DescribeProtectDirList(DescribeProtectDirListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProtectDirListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProtectDirListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProtectDirList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询防护目录关联服务器列表信息
     * @param req DescribeProtectDirRelatedServerRequest
     * @return DescribeProtectDirRelatedServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectDirRelatedServerResponse DescribeProtectDirRelatedServer(DescribeProtectDirRelatedServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProtectDirRelatedServerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProtectDirRelatedServerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProtectDirRelatedServer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *专家服务-旗舰重保列表
     * @param req DescribeProtectNetListRequest
     * @return DescribeProtectNetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectNetListResponse DescribeProtectNetList(DescribeProtectNetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProtectNetListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProtectNetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProtectNetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取公网接入代理安装命令
     * @param req DescribePublicProxyInstallCommandRequest
     * @return DescribePublicProxyInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicProxyInstallCommandResponse DescribePublicProxyInstallCommand(DescribePublicProxyInstallCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicProxyInstallCommandResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicProxyInstallCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicProxyInstallCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机快照备份列表
     * @param req DescribeRansomDefenseBackupListRequest
     * @return DescribeRansomDefenseBackupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseBackupListResponse DescribeRansomDefenseBackupList(DescribeRansomDefenseBackupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseBackupListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseBackupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseBackupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询防勒索事件列表
     * @param req DescribeRansomDefenseEventsListRequest
     * @return DescribeRansomDefenseEventsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseEventsListResponse DescribeRansomDefenseEventsList(DescribeRansomDefenseEventsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseEventsListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseEventsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseEventsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询备份详情列表
     * @param req DescribeRansomDefenseMachineListRequest
     * @return DescribeRansomDefenseMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseMachineListResponse DescribeRansomDefenseMachineList(DescribeRansomDefenseMachineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseMachineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseMachineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseMachineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主机绑定策略列表
     * @param req DescribeRansomDefenseMachineStrategyInfoRequest
     * @return DescribeRansomDefenseMachineStrategyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseMachineStrategyInfoResponse DescribeRansomDefenseMachineStrategyInfo(DescribeRansomDefenseMachineStrategyInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseMachineStrategyInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseMachineStrategyInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseMachineStrategyInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询回滚任务列表
     * @param req DescribeRansomDefenseRollBackTaskListRequest
     * @return DescribeRansomDefenseRollBackTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseRollBackTaskListResponse DescribeRansomDefenseRollBackTaskList(DescribeRansomDefenseRollBackTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseRollBackTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseRollBackTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseRollBackTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户防勒索趋势
     * @param req DescribeRansomDefenseStateRequest
     * @return DescribeRansomDefenseStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStateResponse DescribeRansomDefenseState(DescribeRansomDefenseStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取策略详情
     * @param req DescribeRansomDefenseStrategyDetailRequest
     * @return DescribeRansomDefenseStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyDetailResponse DescribeRansomDefenseStrategyDetail(DescribeRansomDefenseStrategyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseStrategyDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseStrategyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseStrategyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询防勒索策略列表
     * @param req DescribeRansomDefenseStrategyListRequest
     * @return DescribeRansomDefenseStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyListResponse DescribeRansomDefenseStrategyList(DescribeRansomDefenseStrategyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseStrategyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseStrategyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseStrategyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询防勒索策略绑定机器列表
     * @param req DescribeRansomDefenseStrategyMachinesRequest
     * @return DescribeRansomDefenseStrategyMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyMachinesResponse DescribeRansomDefenseStrategyMachines(DescribeRansomDefenseStrategyMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseStrategyMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseStrategyMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseStrategyMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取全网勒索态势
     * @param req DescribeRansomDefenseTrendRequest
     * @return DescribeRansomDefenseTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseTrendResponse DescribeRansomDefenseTrend(DescribeRansomDefenseTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRansomDefenseTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRansomDefenseTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRansomDefenseTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询推荐购买防护核数
     * @param req DescribeRecommendedProtectCpuRequest
     * @return DescribeRecommendedProtectCpuResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecommendedProtectCpuResponse DescribeRecommendedProtectCpu(DescribeRecommendedProtectCpuRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecommendedProtectCpuResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecommendedProtectCpuResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecommendedProtectCpu");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *反弹shell信息详情
     * @param req DescribeReverseShellEventInfoRequest
     * @return DescribeReverseShellEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventInfoResponse DescribeReverseShellEventInfo(DescribeReverseShellEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellEventInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellEventInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellEventInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取反弹Shell列表
     * @param req DescribeReverseShellEventsRequest
     * @return DescribeReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsResponse DescribeReverseShellEvents(DescribeReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取反弹Shell规则列表
     * @param req DescribeReverseShellRulesRequest
     * @return DescribeReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellRulesResponse DescribeReverseShellRules(DescribeReverseShellRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询入侵检测事件更新状态任务是否完成
     * @param req DescribeRiskBatchStatusRequest
     * @return DescribeRiskBatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskBatchStatusResponse DescribeRiskBatchStatus(DescribeRiskBatchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskBatchStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskBatchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskBatchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询恶意请求事件详情
     * @param req DescribeRiskDnsEventInfoRequest
     * @return DescribeRiskDnsEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventInfoResponse DescribeRiskDnsEventInfo(DescribeRiskDnsEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskDnsEventInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskDnsEventInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskDnsEventInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取恶意请求事件列表
     * @param req DescribeRiskDnsEventListRequest
     * @return DescribeRiskDnsEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventListResponse DescribeRiskDnsEventList(DescribeRiskDnsEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskDnsEventListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskDnsEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskDnsEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询恶意请求详情
     * @param req DescribeRiskDnsInfoRequest
     * @return DescribeRiskDnsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsInfoResponse DescribeRiskDnsInfo(DescribeRiskDnsInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskDnsInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskDnsInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskDnsInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *入侵检测，获取恶意请求列表
     * @param req DescribeRiskDnsListRequest
     * @return DescribeRiskDnsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsListResponse DescribeRiskDnsList(DescribeRiskDnsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskDnsListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskDnsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskDnsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取恶意请求策略列表
     * @param req DescribeRiskDnsPolicyListRequest
     * @return DescribeRiskDnsPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsPolicyListResponse DescribeRiskDnsPolicyList(DescribeRiskDnsPolicyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskDnsPolicyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskDnsPolicyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskDnsPolicyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取异常进程列表
     * @param req DescribeRiskProcessEventsRequest
     * @return DescribeRiskProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskProcessEventsResponse DescribeRiskProcessEvents(DescribeRiskProcessEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskProcessEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskProcessEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskProcessEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全通知信息
     * @param req DescribeSafeInfoRequest
     * @return DescribeSafeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeInfoResponse DescribeSafeInfo(DescribeSafeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafeInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询木马扫描进度
     * @param req DescribeScanMalwareScheduleRequest
     * @return DescribeScanMalwareScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanMalwareScheduleResponse DescribeScanMalwareSchedule(DescribeScanMalwareScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanMalwareScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanMalwareScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanMalwareSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据taskid查询检测进度
     * @param req DescribeScanScheduleRequest
     * @return DescribeScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanScheduleResponse DescribeScanSchedule(DescribeScanScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeScanState 该接口能查询对应模块正在进行的扫描任务状态
     * @param req DescribeScanStateRequest
     * @return DescribeScanStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStateResponse DescribeScanState(DescribeScanStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeScanTaskDetails 查询扫描任务详情 , 可以查询扫描进度信息/异常;
     * @param req DescribeScanTaskDetailsRequest
     * @return DescribeScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskDetailsResponse DescribeScanTaskDetails(DescribeScanTaskDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanTaskDetailsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanTaskDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanTaskDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeScanTaskStatus 查询机器扫描状态列表用于过滤筛选
     * @param req DescribeScanTaskStatusRequest
     * @return DescribeScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskStatusResponse DescribeScanTaskStatus(DescribeScanTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询定期检测的配置
     * @param req DescribeScanVulSettingRequest
     * @return DescribeScanVulSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanVulSettingResponse DescribeScanVulSetting(DescribeScanVulSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanVulSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanVulSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanVulSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化获取全网攻击热点
     * @param req DescribeScreenAttackHotspotRequest
     * @return DescribeScreenAttackHotspotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenAttackHotspotResponse DescribeScreenAttackHotspot(DescribeScreenAttackHotspotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenAttackHotspotResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenAttackHotspotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenAttackHotspot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化安全播报
     * @param req DescribeScreenBroadcastsRequest
     * @return DescribeScreenBroadcastsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenBroadcastsResponse DescribeScreenBroadcasts(DescribeScreenBroadcastsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenBroadcastsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenBroadcastsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenBroadcasts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化防趋势接口
     * @param req DescribeScreenDefenseTrendsRequest
     * @return DescribeScreenDefenseTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenDefenseTrendsResponse DescribeScreenDefenseTrends(DescribeScreenDefenseTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenDefenseTrendsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenDefenseTrendsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenDefenseTrends");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化紧急通知
     * @param req DescribeScreenEmergentMsgRequest
     * @return DescribeScreenEmergentMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenEmergentMsgResponse DescribeScreenEmergentMsg(DescribeScreenEmergentMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenEmergentMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenEmergentMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenEmergentMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化获取安全概览相关事件统计数据接口
     * @param req DescribeScreenEventsCntRequest
     * @return DescribeScreenEventsCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenEventsCntResponse DescribeScreenEventsCnt(DescribeScreenEventsCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenEventsCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenEventsCntResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenEventsCnt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化获取主机相关统计
     * @param req DescribeScreenGeneralStatRequest
     * @return DescribeScreenGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenGeneralStatResponse DescribeScreenGeneralStat(DescribeScreenGeneralStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenGeneralStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenGeneralStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenGeneralStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化主机入侵详情
     * @param req DescribeScreenHostInvasionRequest
     * @return DescribeScreenHostInvasionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenHostInvasionResponse DescribeScreenHostInvasion(DescribeScreenHostInvasionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenHostInvasionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenHostInvasionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenHostInvasion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化主机区域选项列表
     * @param req DescribeScreenMachineRegionsRequest
     * @return DescribeScreenMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenMachineRegionsResponse DescribeScreenMachineRegions(DescribeScreenMachineRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenMachineRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenMachineRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenMachineRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化主机区域列表
     * @param req DescribeScreenMachinesRequest
     * @return DescribeScreenMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenMachinesResponse DescribeScreenMachines(DescribeScreenMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化主机安全防护引擎介绍
     * @param req DescribeScreenProtectionCntRequest
     * @return DescribeScreenProtectionCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenProtectionCntResponse DescribeScreenProtectionCnt(DescribeScreenProtectionCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenProtectionCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenProtectionCntResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenProtectionCnt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏获取安全防护状态
     * @param req DescribeScreenProtectionStatRequest
     * @return DescribeScreenProtectionStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenProtectionStatResponse DescribeScreenProtectionStat(DescribeScreenProtectionStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenProtectionStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenProtectionStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenProtectionStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *大屏可视化风险资产top5（今日），统计今日风险资产
     * @param req DescribeScreenRiskAssetsTopRequest
     * @return DescribeScreenRiskAssetsTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenRiskAssetsTopResponse DescribeScreenRiskAssetsTop(DescribeScreenRiskAssetsTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScreenRiskAssetsTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScreenRiskAssetsTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScreenRiskAssetsTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取历史搜索记录
     * @param req DescribeSearchLogsRequest
     * @return DescribeSearchLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchLogsResponse DescribeSearchLogs(DescribeSearchLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSearchLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSearchLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取快速检索列表
     * @param req DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchTemplatesResponse DescribeSearchTemplates(DescribeSearchTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSearchTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSearchTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全播报文章信息
     * @param req DescribeSecurityBroadcastInfoRequest
     * @return DescribeSecurityBroadcastInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityBroadcastInfoResponse DescribeSecurityBroadcastInfo(DescribeSecurityBroadcastInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityBroadcastInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityBroadcastInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityBroadcastInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全播报列表页
     * @param req DescribeSecurityBroadcastsRequest
     * @return DescribeSecurityBroadcastsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityBroadcastsResponse DescribeSecurityBroadcasts(DescribeSecurityBroadcastsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityBroadcastsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityBroadcastsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityBroadcasts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeSecurityDynamics) 用于获取安全事件动态消息数据。
     * @param req DescribeSecurityDynamicsRequest
     * @return DescribeSecurityDynamicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityDynamicsResponse DescribeSecurityDynamics(DescribeSecurityDynamicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityDynamicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityDynamicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityDynamics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全事件统计
     * @param req DescribeSecurityEventStatRequest
     * @return DescribeSecurityEventStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityEventStatResponse DescribeSecurityEventStat(DescribeSecurityEventStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityEventStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityEventStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityEventStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全概览相关事件统计数据接口
     * @param req DescribeSecurityEventsCntRequest
     * @return DescribeSecurityEventsCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityEventsCntResponse DescribeSecurityEventsCnt(DescribeSecurityEventsCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityEventsCntResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityEventsCntResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityEventsCnt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全防护状态汇总
     * @param req DescribeSecurityProtectionStatRequest
     * @return DescribeSecurityProtectionStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityProtectionStatResponse DescribeSecurityProtectionStat(DescribeSecurityProtectionStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityProtectionStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityProtectionStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityProtectionStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeSecurityTrends) 用于获取安全事件统计数据。
     * @param req DescribeSecurityTrendsRequest
     * @return DescribeSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTrendsResponse DescribeSecurityTrends(DescribeSecurityTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityTrendsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityTrendsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityTrends");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务区关联目录详情
     * @param req DescribeServerRelatedDirInfoRequest
     * @return DescribeServerRelatedDirInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerRelatedDirInfoResponse DescribeServerRelatedDirInfo(DescribeServerRelatedDirInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServerRelatedDirInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerRelatedDirInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServerRelatedDirInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取待处理风险文件数+影响服务器数+是否试用检测+最近检测时间
     * @param req DescribeServersAndRiskAndFirstInfoRequest
     * @return DescribeServersAndRiskAndFirstInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServersAndRiskAndFirstInfoResponse DescribeServersAndRiskAndFirstInfo(DescribeServersAndRiskAndFirstInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServersAndRiskAndFirstInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServersAndRiskAndFirstInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServersAndRiskAndFirstInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据策略名查询策略是否存在
     * @param req DescribeStrategyExistRequest
     * @return DescribeStrategyExistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyExistResponse DescribeStrategyExist(DescribeStrategyExistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStrategyExistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStrategyExistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStrategyExist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定标签关联的服务器信息
     * @param req DescribeTagMachinesRequest
     * @return DescribeTagMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagMachinesResponse DescribeTagMachines(DescribeTagMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTagMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有主机标签
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机安全授权试用报告(仅限控制台申领的)
     * @param req DescribeTrialReportRequest
     * @return DescribeTrialReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrialReportResponse DescribeTrialReport(DescribeTrialReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrialReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrialReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrialReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞管理模块指定类型的待处理漏洞数、主机数和非专业版主机数量
     * @param req DescribeUndoVulCountsRequest
     * @return DescribeUndoVulCountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUndoVulCountsResponse DescribeUndoVulCounts(DescribeUndoVulCountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUndoVulCountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUndoVulCountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUndoVulCounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询用户自定义配置
     * @param req DescribeUsersConfigRequest
     * @return DescribeUsersConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersConfigResponse DescribeUsersConfig(DescribeUsersConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsersConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsersConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsersConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeUsualLoginPlaces）用于查询常用登录地。
     * @param req DescribeUsualLoginPlacesRequest
     * @return DescribeUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsualLoginPlacesResponse DescribeUsualLoginPlaces(DescribeUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsualLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsualLoginPlaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取病毒库及POC的更新信息
     * @param req DescribeVdbAndPocInfoRequest
     * @return DescribeVdbAndPocInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVdbAndPocInfoResponse DescribeVdbAndPocInfo(DescribeVdbAndPocInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVdbAndPocInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVdbAndPocInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVdbAndPocInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取版本对比信息
     * @param req DescribeVersionCompareChartRequest
     * @return DescribeVersionCompareChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionCompareChartResponse DescribeVersionCompareChart(DescribeVersionCompareChartRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVersionCompareChartResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVersionCompareChartResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVersionCompareChart");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于统计专业版和基础版机器数。
     * @param req DescribeVersionStatisticsRequest
     * @return DescribeVersionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionStatisticsResponse DescribeVersionStatistics(DescribeVersionStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVersionStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVersionStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVersionStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定点属性信息
     * @param req DescribeVertexDetailRequest
     * @return DescribeVertexDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVertexDetailResponse DescribeVertexDetail(DescribeVertexDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVertexDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVertexDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVertexDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞管理模块，获取近日指定类型的漏洞数量和主机数量
     * @param req DescribeVulCountByDatesRequest
     * @return DescribeVulCountByDatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCountByDatesResponse DescribeVulCountByDates(DescribeVulCountByDatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulCountByDatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulCountByDatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulCountByDates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CveId查询漏洞详情
     * @param req DescribeVulCveIdInfoRequest
     * @return DescribeVulCveIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCveIdInfoResponse DescribeVulCveIdInfo(DescribeVulCveIdInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulCveIdInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulCveIdInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulCveIdInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞防御事件列表
     * @param req DescribeVulDefenceEventRequest
     * @return DescribeVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventResponse DescribeVulDefenceEvent(DescribeVulDefenceEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefenceEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefenceEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询漏洞防御列表
     * @param req DescribeVulDefenceListRequest
     * @return DescribeVulDefenceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceListResponse DescribeVulDefenceList(DescribeVulDefenceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefenceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefenceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞防御概览信息，包括事件趋势及插件开启情况
     * @param req DescribeVulDefenceOverviewRequest
     * @return DescribeVulDefenceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceOverviewResponse DescribeVulDefenceOverview(DescribeVulDefenceOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefenceOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefenceOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单台主机漏洞防御插件信息
     * @param req DescribeVulDefencePluginDetailRequest
     * @return DescribeVulDefencePluginDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginDetailResponse DescribeVulDefencePluginDetail(DescribeVulDefencePluginDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefencePluginDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefencePluginDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefencePluginDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前异常插件数
     * @param req DescribeVulDefencePluginExceptionCountRequest
     * @return DescribeVulDefencePluginExceptionCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginExceptionCountResponse DescribeVulDefencePluginExceptionCount(DescribeVulDefencePluginExceptionCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefencePluginExceptionCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefencePluginExceptionCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefencePluginExceptionCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取各主机漏洞防御插件状态
     * @param req DescribeVulDefencePluginStatusRequest
     * @return DescribeVulDefencePluginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginStatusResponse DescribeVulDefencePluginStatus(DescribeVulDefencePluginStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefencePluginStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefencePluginStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefencePluginStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前漏洞防御插件设置
     * @param req DescribeVulDefenceSettingRequest
     * @return DescribeVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceSettingResponse DescribeVulDefenceSetting(DescribeVulDefenceSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDefenceSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDefenceSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDefenceSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞影响主机列表
     * @param req DescribeVulEffectHostListRequest
     * @return DescribeVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectHostListResponse DescribeVulEffectHostList(DescribeVulEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulEffectHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulEffectHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulEffectHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞影响组件列表
     * @param req DescribeVulEffectModulesRequest
     * @return DescribeVulEffectModulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectModulesResponse DescribeVulEffectModules(DescribeVulEffectModulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulEffectModulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulEffectModulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulEffectModules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞紧急通知
     * @param req DescribeVulEmergentMsgRequest
     * @return DescribeVulEmergentMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEmergentMsgResponse DescribeVulEmergentMsg(DescribeVulEmergentMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulEmergentMsgResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulEmergentMsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulEmergentMsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞修护-查找主机漏洞修护进度
     * @param req DescribeVulFixStatusRequest
     * @return DescribeVulFixStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixStatusResponse DescribeVulFixStatus(DescribeVulFixStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulFixStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulFixStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulFixStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取待处理漏洞数+影响主机数
     * @param req DescribeVulHostCountScanTimeRequest
     * @return DescribeVulHostCountScanTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostCountScanTimeResponse DescribeVulHostCountScanTime(DescribeVulHostCountScanTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulHostCountScanTimeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulHostCountScanTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulHostCountScanTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取服务器风险top列表
     * @param req DescribeVulHostTopRequest
     * @return DescribeVulHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostTopResponse DescribeVulHostTop(DescribeVulHostTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulHostTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulHostTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulHostTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞详情，带CVSS版本
     * @param req DescribeVulInfoCvssRequest
     * @return DescribeVulInfoCvssResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoCvssResponse DescribeVulInfoCvss(DescribeVulInfoCvssRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulInfoCvssResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulInfoCvssResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulInfoCvss");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户漏洞所有标签列表
     * @param req DescribeVulLabelsRequest
     * @return DescribeVulLabelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLabelsResponse DescribeVulLabels(DescribeVulLabelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulLabelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulLabelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulLabels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞数量等级分布统计
     * @param req DescribeVulLevelCountRequest
     * @return DescribeVulLevelCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelCountResponse DescribeVulLevelCount(DescribeVulLevelCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulLevelCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulLevelCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulLevelCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞列表数据
     * @param req DescribeVulListRequest
     * @return DescribeVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulListResponse DescribeVulList(DescribeVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞概览数据
     * @param req DescribeVulOverviewRequest
     * @return DescribeVulOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulOverviewResponse DescribeVulOverview(DescribeVulOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞库列表
     * @param req DescribeVulStoreListRequest
     * @return DescribeVulStoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulStoreListResponse DescribeVulStoreList(DescribeVulStoreListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulStoreListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulStoreListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulStoreList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞top统计
     * @param req DescribeVulTopRequest
     * @return DescribeVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTopResponse DescribeVulTop(DescribeVulTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulTopResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞态势信息
     * @param req DescribeVulTrendRequest
     * @return DescribeVulTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTrendResponse DescribeVulTrend(DescribeVulTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警机器范围配置
     * @param req DescribeWarningHostConfigRequest
     * @return DescribeWarningHostConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningHostConfigResponse DescribeWarningHostConfig(DescribeWarningHostConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningHostConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWarningHostConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWarningHostConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前用户告警列表
     * @param req DescribeWarningListRequest
     * @return DescribeWarningListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningListResponse DescribeWarningList(DescribeWarningListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWarningListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWarningList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警策略
     * @param req DescribeWebHookPolicyRequest
     * @return DescribeWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookPolicyResponse DescribeWebHookPolicy(DescribeWebHookPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebHookPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebHookPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebHookPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询告警接收人列表
     * @param req DescribeWebHookReceiverRequest
     * @return DescribeWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookReceiverResponse DescribeWebHookReceiver(DescribeWebHookReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebHookReceiverResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebHookReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebHookReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定告警接收人的关联策略使用信息
     * @param req DescribeWebHookReceiverUsageRequest
     * @return DescribeWebHookReceiverUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookReceiverUsageResponse DescribeWebHookReceiverUsage(DescribeWebHookReceiverUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebHookReceiverUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebHookReceiverUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebHookReceiverUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企微机器人规则详情
     * @param req DescribeWebHookRuleRequest
     * @return DescribeWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookRuleResponse DescribeWebHookRule(DescribeWebHookRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebHookRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebHookRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebHookRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企微机器人规则列表
     * @param req DescribeWebHookRulesRequest
     * @return DescribeWebHookRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookRulesResponse DescribeWebHookRules(DescribeWebHookRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebHookRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebHookRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebHookRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询篡改事件列表
     * @param req DescribeWebPageEventListRequest
     * @return DescribeWebPageEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageEventListResponse DescribeWebPageEventList(DescribeWebPageEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebPageEventListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebPageEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebPageEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网站防篡改概览信息
     * @param req DescribeWebPageGeneralizeRequest
     * @return DescribeWebPageGeneralizeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageGeneralizeResponse DescribeWebPageGeneralize(DescribeWebPageGeneralizeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebPageGeneralizeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebPageGeneralizeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebPageGeneralize");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网站防篡改-查询动态防护信息
     * @param req DescribeWebPageProtectStatRequest
     * @return DescribeWebPageProtectStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageProtectStatResponse DescribeWebPageProtectStat(DescribeWebPageProtectStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebPageProtectStatResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebPageProtectStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebPageProtectStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网站防篡改-查询网页防篡改服务器购买信息及服务器信息
     * @param req DescribeWebPageServiceInfoRequest
     * @return DescribeWebPageServiceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageServiceInfoResponse DescribeWebPageServiceInfo(DescribeWebPageServiceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebPageServiceInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebPageServiceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebPageServiceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DestroyOrder  该接口可以对资源销毁.
     * @param req DestroyOrderRequest
     * @return DestroyOrderResponse
     * @throws TencentCloudSDKException
     */
    public DestroyOrderResponse DestroyOrder(DestroyOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyOrderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改高危命令规则
     * @param req EditBashRulesRequest
     * @return EditBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditBashRulesResponse EditBashRules(EditBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditBashRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EditBashRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditBashRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改本地提权规则（支持多服务器选择）
     * @param req EditPrivilegeRulesRequest
     * @return EditPrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditPrivilegeRulesResponse EditPrivilegeRules(EditPrivilegeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditPrivilegeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EditPrivilegeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditPrivilegeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑反弹Shell规则（支持多服务器选择）

     * @param req EditReverseShellRulesRequest
     * @return EditReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditReverseShellRulesResponse EditReverseShellRules(EditReverseShellRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditReverseShellRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EditReverseShellRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditReverseShellRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或编辑标签
     * @param req EditTagsRequest
     * @return EditTagsResponse
     * @throws TencentCloudSDKException
     */
    public EditTagsResponse EditTags(EditTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EditTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理应用列表
     * @param req ExportAssetAppListRequest
     * @return ExportAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetAppListResponse ExportAssetAppList(ExportAssetAppListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetAppListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetAppListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetAppList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理内核模块列表
     * @param req ExportAssetCoreModuleListRequest
     * @return ExportAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetCoreModuleListResponse ExportAssetCoreModuleList(ExportAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetCoreModuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetCoreModuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetCoreModuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理数据库列表
     * @param req ExportAssetDatabaseListRequest
     * @return ExportAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetDatabaseListResponse ExportAssetDatabaseList(ExportAssetDatabaseListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetDatabaseListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetDatabaseListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetDatabaseList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理环境变量列表
     * @param req ExportAssetEnvListRequest
     * @return ExportAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetEnvListResponse ExportAssetEnvList(ExportAssetEnvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetEnvListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetEnvListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetEnvList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理启动服务列表
     * @param req ExportAssetInitServiceListRequest
     * @return ExportAssetInitServiceListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetInitServiceListResponse ExportAssetInitServiceList(ExportAssetInitServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetInitServiceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetInitServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetInitServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出Jar包列表
     * @param req ExportAssetJarListRequest
     * @return ExportAssetJarListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetJarListResponse ExportAssetJarList(ExportAssetJarListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetJarListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetJarListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetJarList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理主机资源详细信息
     * @param req ExportAssetMachineDetailRequest
     * @return ExportAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetMachineDetailResponse ExportAssetMachineDetail(ExportAssetMachineDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetMachineDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetMachineDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetMachineDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资源监控列表
     * @param req ExportAssetMachineListRequest
     * @return ExportAssetMachineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetMachineListResponse ExportAssetMachineList(ExportAssetMachineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetMachineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetMachineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetMachineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理计划任务列表
     * @param req ExportAssetPlanTaskListRequest
     * @return ExportAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetPlanTaskListResponse ExportAssetPlanTaskList(ExportAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetPlanTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetPlanTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetPlanTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理端口列表
     * @param req ExportAssetPortInfoListRequest
     * @return ExportAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetPortInfoListResponse ExportAssetPortInfoList(ExportAssetPortInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetPortInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetPortInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetPortInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理进程列表
     * @param req ExportAssetProcessInfoListRequest
     * @return ExportAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetProcessInfoListResponse ExportAssetProcessInfoList(ExportAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetProcessInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetProcessInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetProcessInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出主机最近趋势情况（最长最近90天）
     * @param req ExportAssetRecentMachineInfoRequest
     * @return ExportAssetRecentMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetRecentMachineInfoResponse ExportAssetRecentMachineInfo(ExportAssetRecentMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetRecentMachineInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetRecentMachineInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetRecentMachineInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理系统安装包列表
     * @param req ExportAssetSystemPackageListRequest
     * @return ExportAssetSystemPackageListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetSystemPackageListResponse ExportAssetSystemPackageList(ExportAssetSystemPackageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetSystemPackageListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetSystemPackageListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetSystemPackageList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出账号列表
     * @param req ExportAssetUserListRequest
     * @return ExportAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetUserListResponse ExportAssetUserList(ExportAssetUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetUserListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetUserListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetUserList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理Web应用列表
     * @param req ExportAssetWebAppListRequest
     * @return ExportAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebAppListResponse ExportAssetWebAppList(ExportAssetWebAppListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetWebAppListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetWebAppListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetWebAppList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理Web框架列表
     * @param req ExportAssetWebFrameListRequest
     * @return ExportAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebFrameListResponse ExportAssetWebFrameList(ExportAssetWebFrameListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetWebFrameListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetWebFrameListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetWebFrameList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出Web站点列表
     * @param req ExportAssetWebLocationListRequest
     * @return ExportAssetWebLocationListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebLocationListResponse ExportAssetWebLocationList(ExportAssetWebLocationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetWebLocationListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetWebLocationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetWebLocationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出资产管理Web服务列表
     * @param req ExportAssetWebServiceInfoListRequest
     * @return ExportAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebServiceInfoListResponse ExportAssetWebServiceInfoList(ExportAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetWebServiceInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetWebServiceInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetWebServiceInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出网络攻击事件
     * @param req ExportAttackEventsRequest
     * @return ExportAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttackEventsResponse ExportAttackEvents(ExportAttackEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAttackEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAttackEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAttackEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出网络攻击日志
     * @param req ExportAttackLogsRequest
     * @return ExportAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttackLogsResponse ExportAttackLogs(ExportAttackLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAttackLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAttackLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAttackLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出基线影响主机列表
     * @param req ExportBaselineEffectHostListRequest
     * @return ExportBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineEffectHostListResponse ExportBaselineEffectHostList(ExportBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineEffectHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineEffectHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineEffectHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出修复列表
     * @param req ExportBaselineFixListRequest
     * @return ExportBaselineFixListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineFixListResponse ExportBaselineFixList(ExportBaselineFixListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineFixListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineFixListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineFixList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出基线主机检测
     * @param req ExportBaselineHostDetectListRequest
     * @return ExportBaselineHostDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineHostDetectListResponse ExportBaselineHostDetectList(ExportBaselineHostDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineHostDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineHostDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineHostDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出基线检测项
     * @param req ExportBaselineItemDetectListRequest
     * @return ExportBaselineItemDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineItemDetectListResponse ExportBaselineItemDetectList(ExportBaselineItemDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineItemDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineItemDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineItemDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出检测项结果列表
     * @param req ExportBaselineItemListRequest
     * @return ExportBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineItemListResponse ExportBaselineItemList(ExportBaselineItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineItemListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineItemListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineItemList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出基线列表
     * @param req ExportBaselineListRequest
     * @return ExportBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineListResponse ExportBaselineList(ExportBaselineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出基线检测规则
     * @param req ExportBaselineRuleDetectListRequest
     * @return ExportBaselineRuleDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineRuleDetectListResponse ExportBaselineRuleDetectList(ExportBaselineRuleDetectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineRuleDetectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineRuleDetectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineRuleDetectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出弱口令配置列表
     * @param req ExportBaselineWeakPasswordListRequest
     * @return ExportBaselineWeakPasswordListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineWeakPasswordListResponse ExportBaselineWeakPasswordList(ExportBaselineWeakPasswordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineWeakPasswordListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBaselineWeakPasswordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBaselineWeakPasswordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出高危命令事件
     * @param req ExportBashEventsRequest
     * @return ExportBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsResponse ExportBashEvents(ExportBashEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBashEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBashEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBashEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出高危命令事件(新)
     * @param req ExportBashEventsNewRequest
     * @return ExportBashEventsNewResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsNewResponse ExportBashEventsNew(ExportBashEventsNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBashEventsNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBashEventsNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBashEventsNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出高危命令策略
     * @param req ExportBashPoliciesRequest
     * @return ExportBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashPoliciesResponse ExportBashPolicies(ExportBashPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBashPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBashPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBashPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ExportBruteAttacks) 用于导出密码破解记录成CSV文件。
     * @param req ExportBruteAttacksRequest
     * @return ExportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public ExportBruteAttacksResponse ExportBruteAttacks(ExportBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBruteAttacksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportBruteAttacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportBruteAttacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出核心文件事件
     * @param req ExportFileTamperEventsRequest
     * @return ExportFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportFileTamperEventsResponse ExportFileTamperEvents(ExportFileTamperEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportFileTamperEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportFileTamperEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportFileTamperEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出核心文件监控规则
     * @param req ExportFileTamperRulesRequest
     * @return ExportFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public ExportFileTamperRulesResponse ExportFileTamperRules(ExportFileTamperRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportFileTamperRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportFileTamperRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportFileTamperRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出已忽略基线检测项信息
     * @param req ExportIgnoreBaselineRuleRequest
     * @return ExportIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreBaselineRuleResponse ExportIgnoreBaselineRule(ExportIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportIgnoreBaselineRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportIgnoreBaselineRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportIgnoreBaselineRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据检测项id导出忽略检测项影响主机列表
     * @param req ExportIgnoreRuleEffectHostListRequest
     * @return ExportIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreRuleEffectHostListResponse ExportIgnoreRuleEffectHostList(ExportIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportIgnoreRuleEffectHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportIgnoreRuleEffectHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportIgnoreRuleEffectHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出java内存马插件信息
     * @param req ExportJavaMemShellPluginsRequest
     * @return ExportJavaMemShellPluginsResponse
     * @throws TencentCloudSDKException
     */
    public ExportJavaMemShellPluginsResponse ExportJavaMemShellPlugins(ExportJavaMemShellPluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportJavaMemShellPluginsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportJavaMemShellPluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportJavaMemShellPlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出java内存马事件列表
     * @param req ExportJavaMemShellsRequest
     * @return ExportJavaMemShellsResponse
     * @throws TencentCloudSDKException
     */
    public ExportJavaMemShellsResponse ExportJavaMemShells(ExportJavaMemShellsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportJavaMemShellsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportJavaMemShellsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportJavaMemShells");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出授权列表对应的绑定信息
     * @param req ExportLicenseDetailRequest
     * @return ExportLicenseDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportLicenseDetailResponse ExportLicenseDetail(ExportLicenseDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportLicenseDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportLicenseDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportLicenseDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ExportMaliciousRequests) 用于导出下载恶意请求文件。
     * @param req ExportMaliciousRequestsRequest
     * @return ExportMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public ExportMaliciousRequestsResponse ExportMaliciousRequests(ExportMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportMaliciousRequestsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportMaliciousRequests");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ExportMalwares) 用于导出木马记录CSV文件。
     * @param req ExportMalwaresRequest
     * @return ExportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public ExportMalwaresResponse ExportMalwares(ExportMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ExportNonlocalLoginPlaces) 用于导出异地登录事件记录CSV文件。
     * @param req ExportNonlocalLoginPlacesRequest
     * @return ExportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public ExportNonlocalLoginPlacesResponse ExportNonlocalLoginPlaces(ExportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportNonlocalLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportNonlocalLoginPlaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出本地提权事件
     * @param req ExportPrivilegeEventsRequest
     * @return ExportPrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportPrivilegeEventsResponse ExportPrivilegeEvents(ExportPrivilegeEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportPrivilegeEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportPrivilegeEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportPrivilegeEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出网页防篡改防护目录列表
     * @param req ExportProtectDirListRequest
     * @return ExportProtectDirListResponse
     * @throws TencentCloudSDKException
     */
    public ExportProtectDirListResponse ExportProtectDirList(ExportProtectDirListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportProtectDirListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportProtectDirListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportProtectDirList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出主机快照备份列表
     * @param req ExportRansomDefenseBackupListRequest
     * @return ExportRansomDefenseBackupListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseBackupListResponse ExportRansomDefenseBackupList(ExportRansomDefenseBackupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRansomDefenseBackupListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRansomDefenseBackupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRansomDefenseBackupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出防勒索事件列表
     * @param req ExportRansomDefenseEventsListRequest
     * @return ExportRansomDefenseEventsListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseEventsListResponse ExportRansomDefenseEventsList(ExportRansomDefenseEventsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRansomDefenseEventsListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRansomDefenseEventsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRansomDefenseEventsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出备份详情列表
     * @param req ExportRansomDefenseMachineListRequest
     * @return ExportRansomDefenseMachineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseMachineListResponse ExportRansomDefenseMachineList(ExportRansomDefenseMachineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRansomDefenseMachineListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRansomDefenseMachineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRansomDefenseMachineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出防勒索策略列表
     * @param req ExportRansomDefenseStrategyListRequest
     * @return ExportRansomDefenseStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseStrategyListResponse ExportRansomDefenseStrategyList(ExportRansomDefenseStrategyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRansomDefenseStrategyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRansomDefenseStrategyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRansomDefenseStrategyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出勒索防御策略绑定机器列表
     * @param req ExportRansomDefenseStrategyMachinesRequest
     * @return ExportRansomDefenseStrategyMachinesResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseStrategyMachinesResponse ExportRansomDefenseStrategyMachines(ExportRansomDefenseStrategyMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRansomDefenseStrategyMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRansomDefenseStrategyMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRansomDefenseStrategyMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出反弹Shell事件
     * @param req ExportReverseShellEventsRequest
     * @return ExportReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportReverseShellEventsResponse ExportReverseShellEvents(ExportReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportReverseShellEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportReverseShellEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportReverseShellEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出恶意请求事件列表
     * @param req ExportRiskDnsEventListRequest
     * @return ExportRiskDnsEventListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskDnsEventListResponse ExportRiskDnsEventList(ExportRiskDnsEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRiskDnsEventListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRiskDnsEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRiskDnsEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出恶意请求策略列表
     * @param req ExportRiskDnsPolicyListRequest
     * @return ExportRiskDnsPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskDnsPolicyListResponse ExportRiskDnsPolicyList(ExportRiskDnsPolicyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRiskDnsPolicyListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRiskDnsPolicyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRiskDnsPolicyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出异常进程事件
     * @param req ExportRiskProcessEventsRequest
     * @return ExportRiskProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskProcessEventsResponse ExportRiskProcessEvents(ExportRiskProcessEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportRiskProcessEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportRiskProcessEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportRiskProcessEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据任务id导出指定扫描任务详情
     * @param req ExportScanTaskDetailsRequest
     * @return ExportScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ExportScanTaskDetailsResponse ExportScanTaskDetails(ExportScanTaskDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportScanTaskDetailsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportScanTaskDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportScanTaskDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出风险趋势
     * @param req ExportSecurityTrendsRequest
     * @return ExportSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public ExportSecurityTrendsResponse ExportSecurityTrends(ExportSecurityTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportSecurityTrendsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportSecurityTrendsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportSecurityTrends");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于异步导出数据量大的日志文件
     * @param req ExportTasksRequest
     * @return ExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public ExportTasksResponse ExportTasks(ExportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出漏洞防御事件
     * @param req ExportVulDefenceEventRequest
     * @return ExportVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefenceEventResponse ExportVulDefenceEvent(ExportVulDefenceEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulDefenceEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulDefenceEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulDefenceEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出漏洞防御列表
     * @param req ExportVulDefenceListRequest
     * @return ExportVulDefenceListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefenceListResponse ExportVulDefenceList(ExportVulDefenceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulDefenceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulDefenceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulDefenceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出漏洞防御插件事件
     * @param req ExportVulDefencePluginEventRequest
     * @return ExportVulDefencePluginEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefencePluginEventResponse ExportVulDefencePluginEvent(ExportVulDefencePluginEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulDefencePluginEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulDefencePluginEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulDefencePluginEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出本次漏洞检测Excel
     * @param req ExportVulDetectionExcelRequest
     * @return ExportVulDetectionExcelResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionExcelResponse ExportVulDetectionExcel(ExportVulDetectionExcelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulDetectionExcelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulDetectionExcelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulDetectionExcel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出漏洞检测报告。
     * @param req ExportVulDetectionReportRequest
     * @return ExportVulDetectionReportResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionReportResponse ExportVulDetectionReport(ExportVulDetectionReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulDetectionReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulDetectionReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulDetectionReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出漏洞影响主机列表
     * @param req ExportVulEffectHostListRequest
     * @return ExportVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulEffectHostListResponse ExportVulEffectHostList(ExportVulEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulEffectHostListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulEffectHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulEffectHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出漏洞信息，包括影响主机列表，组件信息
     * @param req ExportVulInfoRequest
     * @return ExportVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulInfoResponse ExportVulInfo(ExportVulInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞管理-导出漏洞列表
     * @param req ExportVulListRequest
     * @return ExportVulListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulListResponse ExportVulList(ExportVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVulListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVulList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出篡改事件列表
     * @param req ExportWebPageEventListRequest
     * @return ExportWebPageEventListResponse
     * @throws TencentCloudSDKException
     */
    public ExportWebPageEventListResponse ExportWebPageEventList(ExportWebPageEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportWebPageEventListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportWebPageEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportWebPageEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修复基线检测
     * @param req FixBaselineDetectRequest
     * @return FixBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public FixBaselineDetectResponse FixBaselineDetect(FixBaselineDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FixBaselineDetectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FixBaselineDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FixBaselineDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取本地存储数据
     * @param req GetLocalStorageItemRequest
     * @return GetLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public GetLocalStorageItemResponse GetLocalStorageItem(GetLocalStorageItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLocalStorageItemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetLocalStorageItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLocalStorageItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (IgnoreImpactedHosts) 用于忽略漏洞。
     * @param req IgnoreImpactedHostsRequest
     * @return IgnoreImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreImpactedHostsResponse IgnoreImpactedHosts(IgnoreImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IgnoreImpactedHostsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IgnoreImpactedHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IgnoreImpactedHosts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取本地存储键值列表
     * @param req KeysLocalStorageRequest
     * @return KeysLocalStorageResponse
     * @throws TencentCloudSDKException
     */
    public KeysLocalStorageResponse KeysLocalStorage(KeysLocalStorageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KeysLocalStorageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<KeysLocalStorageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KeysLocalStorage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 用于设置新增主机自动开通专业防护配置。
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoOpenProVersionConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoOpenProVersionConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoOpenProVersionConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改爆破阻断模式
     * @param req ModifyBanModeRequest
     * @return ModifyBanModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanModeResponse ModifyBanMode(ModifyBanModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBanModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBanModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBanMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置阻断开关状态
     * @param req ModifyBanStatusRequest
     * @return ModifyBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanStatusResponse ModifyBanStatus(ModifyBanStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBanStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBanStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBanStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改阻断白名单列表
     * @param req ModifyBanWhiteListRequest
     * @return ModifyBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanWhiteListResponse ModifyBanWhiteList(ModifyBanWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBanWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBanWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBanWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改基线策略设置
     * @param req ModifyBaselinePolicyRequest
     * @return ModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyResponse ModifyBaselinePolicy(ModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselinePolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselinePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselinePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改基线策略状态
     * @param req ModifyBaselinePolicyStateRequest
     * @return ModifyBaselinePolicyStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyStateResponse ModifyBaselinePolicyState(ModifyBaselinePolicyStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselinePolicyStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselinePolicyStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselinePolicyState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改基线检测规则
     * @param req ModifyBaselineRuleRequest
     * @return ModifyBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineRuleResponse ModifyBaselineRule(ModifyBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselineRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselineRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselineRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改基线忽略规则
     * @param req ModifyBaselineRuleIgnoreRequest
     * @return ModifyBaselineRuleIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineRuleIgnoreResponse ModifyBaselineRuleIgnore(ModifyBaselineRuleIgnoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselineRuleIgnoreResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselineRuleIgnoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselineRuleIgnore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改或新增弱口令
     * @param req ModifyBaselineWeakPasswordRequest
     * @return ModifyBaselineWeakPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineWeakPasswordResponse ModifyBaselineWeakPassword(ModifyBaselineWeakPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBaselineWeakPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBaselineWeakPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBaselineWeakPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改高危命令策略
     * @param req ModifyBashPolicyRequest
     * @return ModifyBashPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBashPolicyResponse ModifyBashPolicy(ModifyBashPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBashPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBashPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBashPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换高危命令策略状态
     * @param req ModifyBashPolicyStatusRequest
     * @return ModifyBashPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBashPolicyStatusResponse ModifyBashPolicyStatus(ModifyBashPolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBashPolicyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBashPolicyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBashPolicyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改暴力破解规则
     * @param req ModifyBruteAttackRulesRequest
     * @return ModifyBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBruteAttackRulesResponse ModifyBruteAttackRules(ModifyBruteAttackRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBruteAttackRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBruteAttackRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBruteAttackRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改网络攻击事件状态
     * @param req ModifyEventAttackStatusRequest
     * @return ModifyEventAttackStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEventAttackStatusResponse ModifyEventAttackStatus(ModifyEventAttackStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEventAttackStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEventAttackStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEventAttackStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核心文件事件更新
     * @param req ModifyFileTamperEventsRequest
     * @return ModifyFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperEventsResponse ModifyFileTamperEvents(ModifyFileTamperEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFileTamperEventsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFileTamperEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFileTamperEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑、新增核心文件监控规则
     * @param req ModifyFileTamperRuleRequest
     * @return ModifyFileTamperRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperRuleResponse ModifyFileTamperRule(ModifyFileTamperRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFileTamperRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFileTamperRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFileTamperRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *核心文件规则状态更新，支持批量删除 关闭
     * @param req ModifyFileTamperRuleStatusRequest
     * @return ModifyFileTamperRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperRuleStatusResponse ModifyFileTamperRuleStatus(ModifyFileTamperRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFileTamperRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFileTamperRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFileTamperRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开关java内存马插件
     * @param req ModifyJavaMemShellPluginSwitchRequest
     * @return ModifyJavaMemShellPluginSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJavaMemShellPluginSwitchResponse ModifyJavaMemShellPluginSwitch(ModifyJavaMemShellPluginSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyJavaMemShellPluginSwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyJavaMemShellPluginSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyJavaMemShellPluginSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改java内存马事件状态
     * @param req ModifyJavaMemShellsStatusRequest
     * @return ModifyJavaMemShellsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJavaMemShellsStatusResponse ModifyJavaMemShellsStatus(ModifyJavaMemShellsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyJavaMemShellsStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyJavaMemShellsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyJavaMemShellsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置中心-授权管理 对某个授权批量绑定机器
     * @param req ModifyLicenseBindsRequest
     * @return ModifyLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseBindsResponse ModifyLicenseBinds(ModifyLicenseBindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLicenseBindsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLicenseBindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLicenseBinds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑《主机安全-按量计费》授权订单
     * @param req ModifyLicenseOrderRequest
     * @return ModifyLicenseOrderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseOrderResponse ModifyLicenseOrder(ModifyLicenseOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLicenseOrderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLicenseOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLicenseOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置中心-授权管理 对某个授权批量解绑机器
     * @param req ModifyLicenseUnBindsRequest
     * @return ModifyLicenseUnBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseUnBindsResponse ModifyLicenseUnBinds(ModifyLicenseUnBindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLicenseUnBindsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLicenseUnBindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLicenseUnBinds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改日志投递kafka接入配置
     * @param req ModifyLogKafkaAccessRequest
     * @return ModifyLogKafkaAccessResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaAccessResponse ModifyLogKafkaAccess(ModifyLogKafkaAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogKafkaAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogKafkaAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogKafkaAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改指定日志类别投递配置、开关
     * @param req ModifyLogKafkaDeliverTypeRequest
     * @return ModifyLogKafkaDeliverTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaDeliverTypeResponse ModifyLogKafkaDeliverType(ModifyLogKafkaDeliverTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogKafkaDeliverTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogKafkaDeliverTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogKafkaDeliverType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改日志投递状态信息
     * @param req ModifyLogKafkaStateRequest
     * @return ModifyLogKafkaStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaStateResponse ModifyLogKafkaState(ModifyLogKafkaStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogKafkaStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogKafkaStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogKafkaState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改日志存储配置
     * @param req ModifyLogStorageConfigRequest
     * @return ModifyLogStorageConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogStorageConfigResponse ModifyLogStorageConfig(ModifyLogStorageConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogStorageConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogStorageConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogStorageConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新登录审计白名单信息
     * @param req ModifyLoginWhiteInfoRequest
     * @return ModifyLoginWhiteInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteInfoResponse ModifyLoginWhiteInfo(ModifyLoginWhiteInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoginWhiteInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoginWhiteInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoginWhiteInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新合并后登录审计白名单信息（服务器列表数目应小于1000）
     * @param req ModifyLoginWhiteRecordRequest
     * @return ModifyLoginWhiteRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteRecordResponse ModifyLoginWhiteRecord(ModifyLoginWhiteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoginWhiteRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoginWhiteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoginWhiteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改机器清理配置
     * @param req ModifyMachineAutoClearConfigRequest
     * @return ModifyMachineAutoClearConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineAutoClearConfigResponse ModifyMachineAutoClearConfig(ModifyMachineAutoClearConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMachineAutoClearConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMachineAutoClearConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMachineAutoClearConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改主机备注信息
     * @param req ModifyMachineRemarkRequest
     * @return ModifyMachineRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineRemarkResponse ModifyMachineRemark(ModifyMachineRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMachineRemarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMachineRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMachineRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新恶意请求白名单
     * @param req ModifyMaliciousRequestWhiteListRequest
     * @return ModifyMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaliciousRequestWhiteListResponse ModifyMaliciousRequestWhiteList(ModifyMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMaliciousRequestWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMaliciousRequestWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMaliciousRequestWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *定时扫描设置
     * @param req ModifyMalwareTimingScanSettingsRequest
     * @return ModifyMalwareTimingScanSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareTimingScanSettingsResponse ModifyMalwareTimingScanSettings(ModifyMalwareTimingScanSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMalwareTimingScanSettingsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMalwareTimingScanSettingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMalwareTimingScanSettings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑木马白名单
     * @param req ModifyMalwareWhiteListRequest
     * @return ModifyMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareWhiteListResponse ModifyMalwareWhiteList(ModifyMalwareWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMalwareWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMalwareWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMalwareWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改网络攻击设置
     * @param req ModifyNetAttackSettingRequest
     * @return ModifyNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackSettingResponse ModifyNetAttackSetting(ModifyNetAttackSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetAttackSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetAttackSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetAttackSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑网络攻击白名单
     * @param req ModifyNetAttackWhiteListRequest
     * @return ModifyNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackWhiteListResponse ModifyNetAttackWhiteList(ModifyNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetAttackWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetAttackWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetAttackWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对订单属性编辑
     * @param req ModifyOrderAttributeRequest
     * @return ModifyOrderAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrderAttributeResponse ModifyOrderAttribute(ModifyOrderAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyOrderAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyOrderAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyOrderAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改防勒索事件状态
     * @param req ModifyRansomDefenseEventsStatusRequest
     * @return ModifyRansomDefenseEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRansomDefenseEventsStatusResponse ModifyRansomDefenseEventsStatus(ModifyRansomDefenseEventsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRansomDefenseEventsStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRansomDefenseEventsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRansomDefenseEventsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改防勒索策略状态
     * @param req ModifyRansomDefenseStrategyStatusRequest
     * @return ModifyRansomDefenseStrategyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRansomDefenseStrategyStatusResponse ModifyRansomDefenseStrategyStatus(ModifyRansomDefenseStrategyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRansomDefenseStrategyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRansomDefenseStrategyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRansomDefenseStrategyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改恶意请求策略
     * @param req ModifyRiskDnsPolicyRequest
     * @return ModifyRiskDnsPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsPolicyResponse ModifyRiskDnsPolicy(ModifyRiskDnsPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRiskDnsPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRiskDnsPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRiskDnsPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改恶意请求策略状态
     * @param req ModifyRiskDnsPolicyStatusRequest
     * @return ModifyRiskDnsPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsPolicyStatusResponse ModifyRiskDnsPolicyStatus(ModifyRiskDnsPolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRiskDnsPolicyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRiskDnsPolicyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRiskDnsPolicyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *入侵检测所有事件的状态，包括：文件查杀，异常登录，密码破解，高危命令，反弹shell，本地提取
     * @param req ModifyRiskEventsStatusRequest
     * @return ModifyRiskEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskEventsStatusResponse ModifyRiskEventsStatus(ModifyRiskEventsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRiskEventsStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRiskEventsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRiskEventsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建/修改用户自定义配置
     * @param req ModifyUsersConfigRequest
     * @return ModifyUsersConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsersConfigResponse ModifyUsersConfig(ModifyUsersConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUsersConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUsersConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUsersConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改漏洞防御事件状态（修复漏洞通过其他接口实现）
     * @param req ModifyVulDefenceEventStatusRequest
     * @return ModifyVulDefenceEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceEventStatusResponse ModifyVulDefenceEventStatus(ModifyVulDefenceEventStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVulDefenceEventStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVulDefenceEventStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVulDefenceEventStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<ModifyVulDefenceSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVulDefenceSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVulDefenceSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改告警机器范围配置
     * @param req ModifyWarningHostConfigRequest
     * @return ModifyWarningHostConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningHostConfigResponse ModifyWarningHostConfig(ModifyWarningHostConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWarningHostConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWarningHostConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWarningHostConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改告警设置
     * @param req ModifyWarningSettingRequest
     * @return ModifyWarningSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningSettingResponse ModifyWarningSetting(ModifyWarningSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWarningSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWarningSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWarningSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改告警策略
     * @param req ModifyWebHookPolicyRequest
     * @return ModifyWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookPolicyResponse ModifyWebHookPolicy(ModifyWebHookPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebHookPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebHookPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebHookPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改告警策略开关
     * @param req ModifyWebHookPolicyStatusRequest
     * @return ModifyWebHookPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookPolicyStatusResponse ModifyWebHookPolicyStatus(ModifyWebHookPolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebHookPolicyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebHookPolicyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebHookPolicyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或更新告警接收人
     * @param req ModifyWebHookReceiverRequest
     * @return ModifyWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookReceiverResponse ModifyWebHookReceiver(ModifyWebHookReceiverRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebHookReceiverResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebHookReceiverResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebHookReceiver");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改企微机器人规则
     * @param req ModifyWebHookRuleRequest
     * @return ModifyWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookRuleResponse ModifyWebHookRule(ModifyWebHookRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebHookRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebHookRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebHookRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改企微机器人规则状态
     * @param req ModifyWebHookRuleStatusRequest
     * @return ModifyWebHookRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookRuleStatusResponse ModifyWebHookRuleStatus(ModifyWebHookRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebHookRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebHookRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebHookRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建/修改网站防护目录
     * @param req ModifyWebPageProtectDirRequest
     * @return ModifyWebPageProtectDirResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectDirResponse ModifyWebPageProtectDir(ModifyWebPageProtectDirRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebPageProtectDirResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebPageProtectDirResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebPageProtectDir");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改网站防护设置
     * @param req ModifyWebPageProtectSettingRequest
     * @return ModifyWebPageProtectSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectSettingResponse ModifyWebPageProtectSetting(ModifyWebPageProtectSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebPageProtectSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebPageProtectSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebPageProtectSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *网站防篡改防护设置开关
     * @param req ModifyWebPageProtectSwitchRequest
     * @return ModifyWebPageProtectSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectSwitchResponse ModifyWebPageProtectSwitch(ModifyWebPageProtectSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebPageProtectSwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebPageProtectSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebPageProtectSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *防勒索快照回滚
     * @param req RansomDefenseRollbackRequest
     * @return RansomDefenseRollbackResponse
     * @throws TencentCloudSDKException
     */
    public RansomDefenseRollbackResponse RansomDefenseRollback(RansomDefenseRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RansomDefenseRollbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RansomDefenseRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RansomDefenseRollback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RecoverMalwares）用于批量恢复已经被隔离的木马文件。
     * @param req RecoverMalwaresRequest
     * @return RecoverMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMalwaresResponse RecoverMalwares(RecoverMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除本地存储数据
     * @param req RemoveLocalStorageItemRequest
     * @return RemoveLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public RemoveLocalStorageItemResponse RemoveLocalStorageItem(RemoveLocalStorageItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveLocalStorageItemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveLocalStorageItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveLocalStorageItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除主机所有记录，目前只支持非腾讯云主机，且需要主机在离线状态
     * @param req RemoveMachineRequest
     * @return RemoveMachineResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMachineResponse RemoveMachine(RemoveMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveMachineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveMachineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveMachine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *快照创建失败时可以重试创建快照并且自动进行漏洞修复
     * @param req RetryCreateSnapshotRequest
     * @return RetryCreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RetryCreateSnapshotResponse RetryCreateSnapshot(RetryCreateSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryCreateSnapshotResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RetryCreateSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetryCreateSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修复失败时单独对某一个主机修复漏洞
     * @param req RetryVulFixRequest
     * @return RetryVulFixResponse
     * @throws TencentCloudSDKException
     */
    public RetryVulFixResponse RetryVulFix(RetryVulFixRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryVulFixResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RetryVulFixResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetryVulFix");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资产指纹启动扫描
     * @param req ScanAssetRequest
     * @return ScanAssetResponse
     * @throws TencentCloudSDKException
     */
    public ScanAssetResponse ScanAsset(ScanAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanAssetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScanAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *基线检测与基线重新检测接口
     * @param req ScanBaselineRequest
     * @return ScanBaselineResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineResponse ScanBaseline(ScanBaselineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanBaselineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScanBaselineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanBaseline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ScanTaskAgain  重新开始扫描任务，可以指定机器
     * @param req ScanTaskAgainRequest
     * @return ScanTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanTaskAgainResponse ScanTaskAgain(ScanTaskAgainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanTaskAgainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScanTaskAgainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanTaskAgain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 一键检测
     * @param req ScanVulRequest
     * @return ScanVulResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulResponse ScanVul(ScanVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanVulResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScanVulResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanVul");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞管理-重新检测接口
     * @param req ScanVulAgainRequest
     * @return ScanVulAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulAgainResponse ScanVulAgain(ScanVulAgainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanVulAgainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScanVulAgainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanVulAgain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *定期扫描漏洞设置
     * @param req ScanVulSettingRequest
     * @return ScanVulSettingResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulSettingResponse ScanVulSetting(ScanVulSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanVulSettingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScanVulSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanVulSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询日志
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SearchLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SeparateMalwares）用于隔离木马。
     * @param req SeparateMalwaresRequest
     * @return SeparateMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public SeparateMalwaresResponse SeparateMalwares(SeparateMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SeparateMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SeparateMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SeparateMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置高危命令事件状态
     * @param req SetBashEventsStatusRequest
     * @return SetBashEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetBashEventsStatusResponse SetBashEventsStatus(SetBashEventsStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetBashEventsStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetBashEventsStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetBashEventsStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置本地存储过期时间
     * @param req SetLocalStorageExpireRequest
     * @return SetLocalStorageExpireResponse
     * @throws TencentCloudSDKException
     */
    public SetLocalStorageExpireResponse SetLocalStorageExpire(SetLocalStorageExpireRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetLocalStorageExpireResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetLocalStorageExpireResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetLocalStorageExpire");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置本地存储数据
     * @param req SetLocalStorageItemRequest
     * @return SetLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public SetLocalStorageItemResponse SetLocalStorageItem(SetLocalStorageItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetLocalStorageItemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetLocalStorageItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetLocalStorageItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测基线
     * @param req StartBaselineDetectRequest
     * @return StartBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public StartBaselineDetectResponse StartBaselineDetect(StartBaselineDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartBaselineDetectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartBaselineDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartBaselineDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止资产扫描任务
     * @param req StopAssetScanRequest
     * @return StopAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public StopAssetScanResponse StopAssetScan(StopAssetScanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopAssetScanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopAssetScanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopAssetScan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止基线检测
     * @param req StopBaselineDetectRequest
     * @return StopBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineDetectResponse StopBaselineDetect(StopBaselineDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopBaselineDetectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopBaselineDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopBaselineDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *不再提醒爆破阻断提示弹窗
     * @param req StopNoticeBanTipsRequest
     * @return StopNoticeBanTipsResponse
     * @throws TencentCloudSDKException
     */
    public StopNoticeBanTipsResponse StopNoticeBanTips(StopNoticeBanTipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopNoticeBanTipsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopNoticeBanTipsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopNoticeBanTips");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换高危命令规则状态
     * @param req SwitchBashRulesRequest
     * @return SwitchBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public SwitchBashRulesResponse SwitchBashRules(SwitchBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchBashRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchBashRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchBashRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步资产扫描信息
     * @param req SyncAssetScanRequest
     * @return SyncAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public SyncAssetScanResponse SyncAssetScan(SyncAssetScanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncAssetScanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SyncAssetScanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncAssetScan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步基线检测进度概要
     * @param req SyncBaselineDetectSummaryRequest
     * @return SyncBaselineDetectSummaryResponse
     * @throws TencentCloudSDKException
     */
    public SyncBaselineDetectSummaryResponse SyncBaselineDetectSummary(SyncBaselineDetectSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncBaselineDetectSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SyncBaselineDetectSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncBaselineDetectSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步机器信息
     * @param req SyncMachinesRequest
     * @return SyncMachinesResponse
     * @throws TencentCloudSDKException
     */
    public SyncMachinesResponse SyncMachines(SyncMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SyncMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *测试企微机器人规则
     * @param req TestWebHookRuleRequest
     * @return TestWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public TestWebHookRuleResponse TestWebHookRule(TestWebHookRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TestWebHookRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TestWebHookRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TestWebHookRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(TrustMalwares)将被识别木马文件设为信任。
     * @param req TrustMalwaresRequest
     * @return TrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public TrustMalwaresResponse TrustMalwares(TrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrustMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TrustMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TrustMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UntrustMalwares）用于取消信任木马文件。
     * @param req UntrustMalwaresRequest
     * @return UntrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMalwaresResponse UntrustMalwares(UntrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntrustMalwaresResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UntrustMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UntrustMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据基线策略id更新策略信息
     * @param req UpdateBaselineStrategyRequest
     * @return UpdateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBaselineStrategyResponse UpdateBaselineStrategy(UpdateBaselineStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateBaselineStrategyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateBaselineStrategyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateBaselineStrategy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关联机器标签列表
     * @param req UpdateMachineTagsRequest
     * @return UpdateMachineTagsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateMachineTagsResponse UpdateMachineTags(UpdateMachineTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateMachineTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateMachineTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateMachineTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
