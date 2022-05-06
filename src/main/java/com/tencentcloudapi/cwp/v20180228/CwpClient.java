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
     *取消漏洞忽略
     * @param req CancelIgnoreVulRequest
     * @return CancelIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public CancelIgnoreVulResponse CancelIgnoreVul(CancelIgnoreVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelIgnoreVulResponse> rsp = null;
        String rspStr = "";
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
     *校验高危命令用户规则新增和编辑时的参数。
     * @param req CheckBashRuleParamsRequest
     * @return CheckBashRuleParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashRuleParamsResponse CheckBashRuleParams(CheckBashRuleParamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBashRuleParamsResponse> rsp = null;
        String rspStr = "";
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
     *根据策略信息创建基线策略
     * @param req CreateBaselineStrategyRequest
     * @return CreateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineStrategyResponse CreateBaselineStrategy(CreateBaselineStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBaselineStrategyResponse> rsp = null;
        String rspStr = "";
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
     *创建应急漏洞扫描任务
     * @param req CreateEmergencyVulScanRequest
     * @return CreateEmergencyVulScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmergencyVulScanResponse CreateEmergencyVulScan(CreateEmergencyVulScanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmergencyVulScanResponse> rsp = null;
        String rspStr = "";
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
     *添加网站防护服务器
     * @param req CreateProtectServerRequest
     * @return CreateProtectServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtectServerResponse CreateProtectServer(CreateProtectServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProtectServerResponse> rsp = null;
        String rspStr = "";
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
     *该接口可以对入侵检测-文件查杀扫描检测
     * @param req CreateScanMalwareSettingRequest
     * @return CreateScanMalwareSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanMalwareSettingResponse CreateScanMalwareSetting(CreateScanMalwareSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScanMalwareSettingResponse> rsp = null;
        String rspStr = "";
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
     *删除网络攻击日志
     * @param req DeleteAttackLogsRequest
     * @return DeleteAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackLogsResponse DeleteAttackLogs(DeleteAttackLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAttackLogsResponse> rsp = null;
        String rspStr = "";
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
     *根据基线策略id删除策略
     * @param req DeleteBaselineStrategyRequest
     * @return DeleteBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineStrategyResponse DeleteBaselineStrategy(DeleteBaselineStrategyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBaselineStrategyResponse> rsp = null;
        String rspStr = "";
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
     *根据Ids删除高危命令事件
     * @param req DeleteBashEventsRequest
     * @return DeleteBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashEventsResponse DeleteBashEvents(DeleteBashEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBashEventsResponse> rsp = null;
        String rspStr = "";
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
     *删除高危命令规则
     * @param req DeleteBashRulesRequest
     * @return DeleteBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashRulesResponse DeleteBashRules(DeleteBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBashRulesResponse> rsp = null;
        String rspStr = "";
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
     *本接口用于删除异地登录白名单规则。
     * @param req DeleteLoginWhiteListRequest
     * @return DeleteLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginWhiteListResponse DeleteLoginWhiteList(DeleteLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoginWhiteListResponse> rsp = null;
        String rspStr = "";
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
     *本接口（DeleteMachine）用于卸载云镜客户端。
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineResponse> rsp = null;
        String rspStr = "";
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
     *删除服务器关联的标签
     * @param req DeleteMachineTagRequest
     * @return DeleteMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineTagResponse DeleteMachineTag(DeleteMachineTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineTagResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DeleteMaliciousRequests) 用于删除恶意请求记录。
     * @param req DeleteMaliciousRequestsRequest
     * @return DeleteMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestsResponse DeleteMaliciousRequests(DeleteMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DeleteMalwares) 用于删除木马记录。
     * @param req DeleteMalwaresRequest
     * @return DeleteMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwaresResponse DeleteMalwares(DeleteMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMalwaresResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DeleteNonlocalLoginPlaces) 用于删除异地登录记录。
     * @param req DeleteNonlocalLoginPlacesRequest
     * @return DeleteNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNonlocalLoginPlacesResponse DeleteNonlocalLoginPlaces(DeleteNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
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
     *删除检索模板
     * @param req DeleteSearchTemplateRequest
     * @return DeleteSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSearchTemplateResponse DeleteSearchTemplate(DeleteSearchTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSearchTemplateResponse> rsp = null;
        String rspStr = "";
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
     *网站防篡改-删除事件记录
     * @param req DeleteWebPageEventLogRequest
     * @return DeleteWebPageEventLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebPageEventLogResponse DeleteWebPageEventLog(DeleteWebPageEventLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebPageEventLogResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DescribeAccountStatistics) 用于获取帐号统计列表数据。
     * @param req DescribeAccountStatisticsRequest
     * @return DescribeAccountStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountStatisticsResponse DescribeAccountStatistics(DescribeAccountStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountStatisticsResponse> rsp = null;
        String rspStr = "";
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
     *查询应用列表
     * @param req DescribeAssetAppListRequest
     * @return DescribeAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppListResponse DescribeAssetAppList(DescribeAssetAppListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetAppListResponse> rsp = null;
        String rspStr = "";
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
     *获取资产管理数据库详情
     * @param req DescribeAssetDatabaseInfoRequest
     * @return DescribeAssetDatabaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseInfoResponse DescribeAssetDatabaseInfo(DescribeAssetDatabaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDatabaseInfoResponse> rsp = null;
        String rspStr = "";
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
     *查询资产管理环境变量列表
     * @param req DescribeAssetEnvListRequest
     * @return DescribeAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetEnvListResponse DescribeAssetEnvList(DescribeAssetEnvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetEnvListResponse> rsp = null;
        String rspStr = "";
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
     *获取资产数量： 主机数、账号数、端口数、进程数、软件数、数据库数、Web应用数、Web框架数、Web服务数、Web站点数
     * @param req DescribeAssetInfoRequest
     * @return DescribeAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInfoResponse DescribeAssetInfo(DescribeAssetInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetInfoResponse> rsp = null;
        String rspStr = "";
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
     *获取资产管理主机资源详细信息
     * @param req DescribeAssetMachineDetailRequest
     * @return DescribeAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineDetailResponse DescribeAssetMachineDetail(DescribeAssetMachineDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetMachineDetailResponse> rsp = null;
        String rspStr = "";
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
     *查询资产管理计划任务列表
     * @param req DescribeAssetPlanTaskListRequest
     * @return DescribeAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPlanTaskListResponse DescribeAssetPlanTaskList(DescribeAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPlanTaskListResponse> rsp = null;
        String rspStr = "";
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
     *获取资产管理端口列表
     * @param req DescribeAssetPortInfoListRequest
     * @return DescribeAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortInfoListResponse DescribeAssetPortInfoList(DescribeAssetPortInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPortInfoListResponse> rsp = null;
        String rspStr = "";
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
     *获取资产管理进程列表
     * @param req DescribeAssetProcessInfoListRequest
     * @return DescribeAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessInfoListResponse DescribeAssetProcessInfoList(DescribeAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetProcessInfoListResponse> rsp = null;
        String rspStr = "";
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
     *获取主机账号详情
     * @param req DescribeAssetUserInfoRequest
     * @return DescribeAssetUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserInfoResponse DescribeAssetUserInfo(DescribeAssetUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetUserInfoResponse> rsp = null;
        String rspStr = "";
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
     *获取账号列表
     * @param req DescribeAssetUserListRequest
     * @return DescribeAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserListResponse DescribeAssetUserList(DescribeAssetUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetUserListResponse> rsp = null;
        String rspStr = "";
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
     *获取资产管理Web应用列表
     * @param req DescribeAssetWebAppListRequest
     * @return DescribeAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppListResponse DescribeAssetWebAppList(DescribeAssetWebAppListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebAppListResponse> rsp = null;
        String rspStr = "";
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
     *获取资产管理Web框架列表
     * @param req DescribeAssetWebFrameListRequest
     * @return DescribeAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameListResponse DescribeAssetWebFrameList(DescribeAssetWebFrameListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebFrameListResponse> rsp = null;
        String rspStr = "";
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
     *获取Web站点详情
     * @param req DescribeAssetWebLocationInfoRequest
     * @return DescribeAssetWebLocationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationInfoResponse DescribeAssetWebLocationInfo(DescribeAssetWebLocationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebLocationInfoResponse> rsp = null;
        String rspStr = "";
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
     *查询资产管理Web服务列表
     * @param req DescribeAssetWebServiceInfoListRequest
     * @return DescribeAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceInfoListResponse DescribeAssetWebServiceInfoList(DescribeAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebServiceInfoListResponse> rsp = null;
        String rspStr = "";
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
     *网络攻击日志详情
     * @param req DescribeAttackLogInfoRequest
     * @return DescribeAttackLogInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogInfoResponse DescribeAttackLogInfo(DescribeAttackLogInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackLogInfoResponse> rsp = null;
        String rspStr = "";
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
     *获取网络攻击威胁类型列表
     * @param req DescribeAttackVulTypeListRequest
     * @return DescribeAttackVulTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackVulTypeListResponse DescribeAttackVulTypeList(DescribeAttackVulTypeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackVulTypeListResponse> rsp = null;
        String rspStr = "";
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
     *根据基线id查询基线详情接口
     * @param req DescribeBaselineDetailRequest
     * @return DescribeBaselineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetailResponse DescribeBaselineDetail(DescribeBaselineDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineDetailResponse> rsp = null;
        String rspStr = "";
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
     *根据基线id查询基线影响主机列表
     * @param req DescribeBaselineEffectHostListRequest
     * @return DescribeBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineEffectHostListResponse DescribeBaselineEffectHostList(DescribeBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineEffectHostListResponse> rsp = null;
        String rspStr = "";
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
     *接口返回TopN的风险服务器
     * @param req DescribeBaselineHostTopRequest
     * @return DescribeBaselineHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostTopResponse DescribeBaselineHostTop(DescribeBaselineHostTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineHostTopResponse> rsp = null;
        String rspStr = "";
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
     *查询基线列表信息
     * @param req DescribeBaselineListRequest
     * @return DescribeBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineListResponse DescribeBaselineList(DescribeBaselineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineListResponse> rsp = null;
        String rspStr = "";
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
     *根据基线id查询下属检测项信息
     * @param req DescribeBaselineRuleRequest
     * @return DescribeBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleResponse DescribeBaselineRule(DescribeBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineRuleResponse> rsp = null;
        String rspStr = "";
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
     *根据任务id查询基线检测进度
     * @param req DescribeBaselineScanScheduleRequest
     * @return DescribeBaselineScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineScanScheduleResponse DescribeBaselineScanSchedule(DescribeBaselineScanScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaselineScanScheduleResponse> rsp = null;
        String rspStr = "";
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
     *获取高危命令列表
     * @param req DescribeBashEventsRequest
     * @return DescribeBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsResponse DescribeBashEvents(DescribeBashEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashEventsResponse> rsp = null;
        String rspStr = "";
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
     *获取高危命令规则列表
     * @param req DescribeBashRulesRequest
     * @return DescribeBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashRulesResponse DescribeBashRules(DescribeBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBashRulesResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DescribeComponentStatistics) 用于获取组件统计列表数据。
     * @param req DescribeComponentStatisticsRequest
     * @return DescribeComponentStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentStatisticsResponse DescribeComponentStatistics(DescribeComponentStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentStatisticsResponse> rsp = null;
        String rspStr = "";
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
     *获取ES字段聚合结果
     * @param req DescribeESAggregationsRequest
     * @return DescribeESAggregationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAggregationsResponse DescribeESAggregations(DescribeESAggregationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeESAggregationsResponse> rsp = null;
        String rspStr = "";
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
     *获取ES查询文档列表
     * @param req DescribeESHitsRequest
     * @return DescribeESHitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESHitsResponse DescribeESHits(DescribeESHitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeESHitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeESHitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeESHits");
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
     *专家服务-安全管家列表
     * @param req DescribeExpertServiceListRequest
     * @return DescribeExpertServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceListResponse DescribeExpertServiceList(DescribeExpertServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExpertServiceListResponse> rsp = null;
        String rspStr = "";
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
     *获取主机相关统计
     * @param req DescribeGeneralStatRequest
     * @return DescribeGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralStatResponse DescribeGeneralStat(DescribeGeneralStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGeneralStatResponse> rsp = null;
        String rspStr = "";
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
     *获取登录审计列表
     * @param req DescribeHostLoginListRequest
     * @return DescribeHostLoginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLoginListResponse DescribeHostLoginList(DescribeHostLoginListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostLoginListResponse> rsp = null;
        String rspStr = "";
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
     *查询已经忽略的检测项信息
     * @param req DescribeIgnoreBaselineRuleRequest
     * @return DescribeIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreBaselineRuleResponse DescribeIgnoreBaselineRule(DescribeIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIgnoreBaselineRuleResponse> rsp = null;
        String rspStr = "";
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
     *根据检测项id与筛选条件查询忽略检测项影响主机列表信息
     * @param req DescribeIgnoreRuleEffectHostListRequest
     * @return DescribeIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreRuleEffectHostListResponse DescribeIgnoreRuleEffectHostList(DescribeIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIgnoreRuleEffectHostListResponse> rsp = null;
        String rspStr = "";
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
     *获取日志检索容量使用统计
     * @param req DescribeLogStorageStatisticRequest
     * @return DescribeLogStorageStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageStatisticResponse DescribeLogStorageStatistic(DescribeLogStorageStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogStorageStatisticResponse> rsp = null;
        String rspStr = "";
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
     *获取异地登录白名单合并后列表
     * @param req DescribeLoginWhiteCombinedListRequest
     * @return DescribeLoginWhiteCombinedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteCombinedListResponse DescribeLoginWhiteCombinedList(DescribeLoginWhiteCombinedListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginWhiteCombinedListResponse> rsp = null;
        String rspStr = "";
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
     *获取异地登录白名单列表
     * @param req DescribeLoginWhiteListRequest
     * @return DescribeLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteListResponse DescribeLoginWhiteList(DescribeLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginWhiteListResponse> rsp = null;
        String rspStr = "";
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
     *本接口（DescribeMachineInfo）用于获取机器详细信息。
     * @param req DescribeMachineInfoRequest
     * @return DescribeMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineInfoResponse DescribeMachineInfo(DescribeMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineInfoResponse> rsp = null;
        String rspStr = "";
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
     *用于网页防篡改获取区域主机列表。
     * @param req DescribeMachineListRequest
     * @return DescribeMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineListResponse DescribeMachineList(DescribeMachineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineListResponse> rsp = null;
        String rspStr = "";
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
     *获取机器地域列表
     * @param req DescribeMachineRegionsRequest
     * @return DescribeMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionsResponse DescribeMachineRegions(DescribeMachineRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineRegionsResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DescribeMachines) 用于获取区域主机列表。
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        String rspStr = "";
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
     *入侵检测获取木马列表
     * @param req DescribeMalWareListRequest
     * @return DescribeMalWareListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalWareListResponse DescribeMalWareList(DescribeMalWareListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalWareListResponse> rsp = null;
        String rspStr = "";
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
     *打开入侵检测-恶意文件检测,弹出风险预警内容
     * @param req DescribeMalwareRiskWarningRequest
     * @return DescribeMalwareRiskWarningResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskWarningResponse DescribeMalwareRiskWarning(DescribeMalwareRiskWarningRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwareRiskWarningResponse> rsp = null;
        String rspStr = "";
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
     *专家服务-安全管家月巡检报告下载
     * @param req DescribeMonthInspectionReportRequest
     * @return DescribeMonthInspectionReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonthInspectionReportResponse DescribeMonthInspectionReport(DescribeMonthInspectionReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonthInspectionReportResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DescribeOpenPortStatistics) 用于获取端口统计列表。
     * @param req DescribeOpenPortStatisticsRequest
     * @return DescribeOpenPortStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortStatisticsResponse DescribeOpenPortStatistics(DescribeOpenPortStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortStatisticsResponse> rsp = null;
        String rspStr = "";
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
     *获取本地提权事件列表
     * @param req DescribePrivilegeEventsRequest
     * @return DescribePrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeEventsResponse DescribePrivilegeEvents(DescribePrivilegeEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrivilegeEventsResponse> rsp = null;
        String rspStr = "";
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
     *网页防篡改防护目录列表
     * @param req DescribeProtectDirListRequest
     * @return DescribeProtectDirListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectDirListResponse DescribeProtectDirList(DescribeProtectDirListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProtectDirListResponse> rsp = null;
        String rspStr = "";
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
     *获取反弹Shell列表
     * @param req DescribeReverseShellEventsRequest
     * @return DescribeReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsResponse DescribeReverseShellEvents(DescribeReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellEventsResponse> rsp = null;
        String rspStr = "";
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
     *入侵检测，获取恶意请求列表
     * @param req DescribeRiskDnsListRequest
     * @return DescribeRiskDnsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsListResponse DescribeRiskDnsList(DescribeRiskDnsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskDnsListResponse> rsp = null;
        String rspStr = "";
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
     *更新或者插入用户告警设置(该接口废弃,请调用 ModifyWarningSetting )
     * @param req DescribeSaveOrUpdateWarningsRequest
     * @return DescribeSaveOrUpdateWarningsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSaveOrUpdateWarningsResponse DescribeSaveOrUpdateWarnings(DescribeSaveOrUpdateWarningsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSaveOrUpdateWarningsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSaveOrUpdateWarningsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSaveOrUpdateWarnings");
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
     *导出ES查询文档列表
     * @param req DescribeSearchExportListRequest
     * @return DescribeSearchExportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchExportListResponse DescribeSearchExportList(DescribeSearchExportListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchExportListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSearchExportListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSearchExportList");
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
     *本接口 (DescribeSecurityDynamics) 用于获取安全事件动态消息数据。
     * @param req DescribeSecurityDynamicsRequest
     * @return DescribeSecurityDynamicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityDynamicsResponse DescribeSecurityDynamics(DescribeSecurityDynamicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityDynamicsResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (DescribeSecurityTrends) 用于获取安全事件统计数据。
     * @param req DescribeSecurityTrendsRequest
     * @return DescribeSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTrendsResponse DescribeSecurityTrends(DescribeSecurityTrendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityTrendsResponse> rsp = null;
        String rspStr = "";
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
     *获取漏洞管理模块指定类型的待处理漏洞数、主机数和非专业版主机数量
     * @param req DescribeUndoVulCountsRequest
     * @return DescribeUndoVulCountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUndoVulCountsResponse DescribeUndoVulCounts(DescribeUndoVulCountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUndoVulCountsResponse> rsp = null;
        String rspStr = "";
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
     *此接口（DescribeUsualLoginPlaces）用于查询常用登录地。
     * @param req DescribeUsualLoginPlacesRequest
     * @return DescribeUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsualLoginPlacesResponse DescribeUsualLoginPlaces(DescribeUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
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
     *用于统计专业版和基础版机器数。
     * @param req DescribeVersionStatisticsRequest
     * @return DescribeVersionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionStatisticsResponse DescribeVersionStatistics(DescribeVersionStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVersionStatisticsResponse> rsp = null;
        String rspStr = "";
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
     *漏洞管理模块，获取近日指定类型的漏洞数量和主机数量
     * @param req DescribeVulCountByDatesRequest
     * @return DescribeVulCountByDatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCountByDatesResponse DescribeVulCountByDates(DescribeVulCountByDatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulCountByDatesResponse> rsp = null;
        String rspStr = "";
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
     *漏洞影响主机列表
     * @param req DescribeVulEffectHostListRequest
     * @return DescribeVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectHostListResponse DescribeVulEffectHostList(DescribeVulEffectHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulEffectHostListResponse> rsp = null;
        String rspStr = "";
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
     *获取待处理漏洞数+影响主机数
     * @param req DescribeVulHostCountScanTimeRequest
     * @return DescribeVulHostCountScanTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostCountScanTimeResponse DescribeVulHostCountScanTime(DescribeVulHostCountScanTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulHostCountScanTimeResponse> rsp = null;
        String rspStr = "";
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
     *漏洞数量等级分布统计
     * @param req DescribeVulLevelCountRequest
     * @return DescribeVulLevelCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelCountResponse DescribeVulLevelCount(DescribeVulLevelCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulLevelCountResponse> rsp = null;
        String rspStr = "";
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
     *漏洞top统计
     * @param req DescribeVulTopRequest
     * @return DescribeVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTopResponse DescribeVulTop(DescribeVulTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulTopResponse> rsp = null;
        String rspStr = "";
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
     *获取当前用户告警列表
     * @param req DescribeWarningListRequest
     * @return DescribeWarningListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningListResponse DescribeWarningList(DescribeWarningListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningListResponse> rsp = null;
        String rspStr = "";
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
     *查询篡改事件列表
     * @param req DescribeWebPageEventListRequest
     * @return DescribeWebPageEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebPageEventListResponse DescribeWebPageEventList(DescribeWebPageEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebPageEventListResponse> rsp = null;
        String rspStr = "";
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
     *新增或修改高危命令规则
     * @param req EditBashRulesRequest
     * @return EditBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditBashRulesResponse EditBashRules(EditBashRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditBashRulesResponse> rsp = null;
        String rspStr = "";
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
     *新增或编辑标签
     * @param req EditTagsRequest
     * @return EditTagsResponse
     * @throws TencentCloudSDKException
     */
    public EditTagsResponse EditTags(EditTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditTagsResponse> rsp = null;
        String rspStr = "";
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
     *导出资产管理内核模块列表
     * @param req ExportAssetCoreModuleListRequest
     * @return ExportAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetCoreModuleListResponse ExportAssetCoreModuleList(ExportAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetCoreModuleListResponse> rsp = null;
        String rspStr = "";
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
     *导出资产管理Web服务列表
     * @param req ExportAssetWebServiceInfoListRequest
     * @return ExportAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebServiceInfoListResponse ExportAssetWebServiceInfoList(ExportAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetWebServiceInfoListResponse> rsp = null;
        String rspStr = "";
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
     *导出网络攻击日志
     * @param req ExportAttackLogsRequest
     * @return ExportAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttackLogsResponse ExportAttackLogs(ExportAttackLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAttackLogsResponse> rsp = null;
        String rspStr = "";
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
     *导出基线列表
     * @param req ExportBaselineListRequest
     * @return ExportBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineListResponse ExportBaselineList(ExportBaselineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBaselineListResponse> rsp = null;
        String rspStr = "";
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
     *导出高危命令事件
     * @param req ExportBashEventsRequest
     * @return ExportBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsResponse ExportBashEvents(ExportBashEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBashEventsResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (ExportBruteAttacks) 用于导出密码破解记录成CSV文件。
     * @param req ExportBruteAttacksRequest
     * @return ExportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public ExportBruteAttacksResponse ExportBruteAttacks(ExportBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportBruteAttacksResponse> rsp = null;
        String rspStr = "";
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
     *导出已忽略基线检测项信息
     * @param req ExportIgnoreBaselineRuleRequest
     * @return ExportIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreBaselineRuleResponse ExportIgnoreBaselineRule(ExportIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportIgnoreBaselineRuleResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (ExportMaliciousRequests) 用于导出下载恶意请求文件。
     * @param req ExportMaliciousRequestsRequest
     * @return ExportMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public ExportMaliciousRequestsResponse ExportMaliciousRequests(ExportMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
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
     *导出反弹Shell事件
     * @param req ExportReverseShellEventsRequest
     * @return ExportReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportReverseShellEventsResponse ExportReverseShellEvents(ExportReverseShellEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportReverseShellEventsResponse> rsp = null;
        String rspStr = "";
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
     *根据任务id导出指定扫描任务详情 
     * @param req ExportScanTaskDetailsRequest
     * @return ExportScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ExportScanTaskDetailsResponse ExportScanTaskDetails(ExportScanTaskDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportScanTaskDetailsResponse> rsp = null;
        String rspStr = "";
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
     *导出本次漏洞检测Excel
     * @param req ExportVulDetectionExcelRequest
     * @return ExportVulDetectionExcelResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionExcelResponse ExportVulDetectionExcel(ExportVulDetectionExcelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulDetectionExcelResponse> rsp = null;
        String rspStr = "";
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
     *漏洞管理-导出漏洞列表
     * @param req ExportVulListRequest
     * @return ExportVulListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulListResponse ExportVulList(ExportVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVulListResponse> rsp = null;
        String rspStr = "";
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
     *本接口 (IgnoreImpactedHosts) 用于忽略漏洞。
     * @param req IgnoreImpactedHostsRequest
     * @return IgnoreImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreImpactedHostsResponse IgnoreImpactedHosts(IgnoreImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IgnoreImpactedHostsResponse> rsp = null;
        String rspStr = "";
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
     * 用于设置新增主机自动开通专业防护配置。
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoOpenProVersionConfigResponse> rsp = null;
        String rspStr = "";
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
     *修改暴力破解规则
     * @param req ModifyBruteAttackRulesRequest
     * @return ModifyBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBruteAttackRulesResponse ModifyBruteAttackRules(ModifyBruteAttackRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBruteAttackRulesResponse> rsp = null;
        String rspStr = "";
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
     *定时扫描设置
     * @param req ModifyMalwareTimingScanSettingsRequest
     * @return ModifyMalwareTimingScanSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareTimingScanSettingsResponse ModifyMalwareTimingScanSettings(ModifyMalwareTimingScanSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMalwareTimingScanSettingsResponse> rsp = null;
        String rspStr = "";
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
     *修改告警设置
     * @param req ModifyWarningSettingRequest
     * @return ModifyWarningSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningSettingResponse ModifyWarningSetting(ModifyWarningSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWarningSettingResponse> rsp = null;
        String rspStr = "";
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
     *创建/修改网站防护目录
     * @param req ModifyWebPageProtectDirRequest
     * @return ModifyWebPageProtectDirResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectDirResponse ModifyWebPageProtectDir(ModifyWebPageProtectDirRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebPageProtectDirResponse> rsp = null;
        String rspStr = "";
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
     *本接口（RecoverMalwares）用于批量恢复已经被隔离的木马文件。
     * @param req RecoverMalwaresRequest
     * @return RecoverMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMalwaresResponse RecoverMalwares(RecoverMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverMalwaresResponse> rsp = null;
        String rspStr = "";
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
     *资产指纹启动扫描
     * @param req ScanAssetRequest
     * @return ScanAssetResponse
     * @throws TencentCloudSDKException
     */
    public ScanAssetResponse ScanAsset(ScanAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanAssetResponse> rsp = null;
        String rspStr = "";
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
     * 一键检测
     * @param req ScanVulRequest
     * @return ScanVulResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulResponse ScanVul(ScanVulRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanVulResponse> rsp = null;
        String rspStr = "";
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
     *本接口（SeparateMalwares）用于隔离木马。
     * @param req SeparateMalwaresRequest
     * @return SeparateMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public SeparateMalwaresResponse SeparateMalwares(SeparateMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SeparateMalwaresResponse> rsp = null;
        String rspStr = "";
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
     *不再提醒爆破阻断提示弹窗
     * @param req StopNoticeBanTipsRequest
     * @return StopNoticeBanTipsResponse
     * @throws TencentCloudSDKException
     */
    public StopNoticeBanTipsResponse StopNoticeBanTips(StopNoticeBanTipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopNoticeBanTipsResponse> rsp = null;
        String rspStr = "";
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
     *本接口(TrustMalwares)将被识别木马文件设为信任。
     * @param req TrustMalwaresRequest
     * @return TrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public TrustMalwaresResponse TrustMalwares(TrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrustMalwaresResponse> rsp = null;
        String rspStr = "";
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
