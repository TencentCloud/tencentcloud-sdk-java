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
package com.tencentcloudapi.yunjing.v20180228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.yunjing.v20180228.models.*;

public class YunjingClient extends AbstractClient{
    private static String endpoint = "yunjing.tencentcloudapi.com";
    private static String service = "yunjing";
    private static String version = "2018-02-28";

    public YunjingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public YunjingClient(Credential credential, String region, ClientProfile profile) {
        super(YunjingClient.endpoint, YunjingClient.version, credential, region, profile);
    }

    /**
     *本接口（AddLoginWhiteList）用于添加白名单规则
     * @param req AddLoginWhiteListRequest
     * @return AddLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddLoginWhiteListResponse AddLoginWhiteList(AddLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddLoginWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddLoginWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加机器关联标签
     * @param req AddMachineTagRequest
     * @return AddMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public AddMachineTagResponse AddMachineTag(AddMachineTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddMachineTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddMachineTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddMachineTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CloseProVersion) 用于关闭专业版。
     * @param req CloseProVersionRequest
     * @return CloseProVersionResponse
     * @throws TencentCloudSDKException
     */
    public CloseProVersionResponse CloseProVersion(CloseProVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseProVersion");
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
     *本接口 (CreateOpenPortTask) 用于创建实时获取端口任务。
     * @param req CreateOpenPortTaskRequest
     * @return CreateOpenPortTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenPortTaskResponse CreateOpenPortTask(CreateOpenPortTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOpenPortTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOpenPortTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOpenPortTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateProcessTask) 用于创建实时拉取进程任务。
     * @param req CreateProcessTaskRequest
     * @return CreateProcessTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessTaskResponse CreateProcessTask(CreateProcessTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProcessTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProcessTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProcessTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateUsualLoginPlaces）用于添加常用登录地。
     * @param req CreateUsualLoginPlacesRequest
     * @return CreateUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsualLoginPlacesResponse CreateUsualLoginPlaces(CreateUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUsualLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUsualLoginPlaces");
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
     *删除白名单规则
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
     *本接口（DeleteUsualLoginPlaces）用于删除常用登录地。
     * @param req DeleteUsualLoginPlacesRequest
     * @return DeleteUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsualLoginPlacesResponse DeleteUsualLoginPlaces(DeleteUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsualLoginPlacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsualLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUsualLoginPlaces");
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
     *本接口 (DescribeAccounts) 用于获取帐号列表数据。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAgentVuls) 用于获取单台主机的漏洞列表。
     * @param req DescribeAgentVulsRequest
     * @return DescribeAgentVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentVulsResponse DescribeAgentVuls(DescribeAgentVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentVulsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentVulsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentVuls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAlarmAttribute) 用于获取告警设置。
     * @param req DescribeAlarmAttributeRequest
     * @return DescribeAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmAttributeResponse DescribeAlarmAttribute(DescribeAlarmAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmAttribute");
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
     *本接口{DescribeBruteAttacks}用于获取暴力破解事件列表。
     * @param req DescribeBruteAttacksRequest
     * @return DescribeBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttacksResponse DescribeBruteAttacks(DescribeBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBruteAttacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBruteAttacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBruteAttacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeComponentInfo) 用于获取组件信息数据。
     * @param req DescribeComponentInfoRequest
     * @return DescribeComponentInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentInfoResponse DescribeComponentInfo(DescribeComponentInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComponentInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComponentInfo");
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
     *本接口 (DescribeComponents) 用于获取组件列表数据。
     * @param req DescribeComponentsRequest
     * @return DescribeComponentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentsResponse DescribeComponents(DescribeComponentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComponentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComponents");
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
     *本接口 (DescribeImpactedHosts) 用于获取漏洞受影响机器列表。
     * @param req DescribeImpactedHostsRequest
     * @return DescribeImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImpactedHostsResponse DescribeImpactedHosts(DescribeImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImpactedHostsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImpactedHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImpactedHosts");
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
     *本接口 (DescribeMaliciousRequests) 用于获取恶意请求数据。
     * @param req DescribeMaliciousRequestsRequest
     * @return DescribeMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaliciousRequestsResponse DescribeMaliciousRequests(DescribeMaliciousRequestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaliciousRequestsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMaliciousRequestsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMaliciousRequests");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMalwares）用于获取木马事件列表。
     * @param req DescribeMalwaresRequest
     * @return DescribeMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwaresResponse DescribeMalwares(DescribeMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwaresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeNonlocalLoginPlaces)用于获取异地登录事件。
     * @param req DescribeNonlocalLoginPlacesRequest
     * @return DescribeNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNonlocalLoginPlacesResponse DescribeNonlocalLoginPlaces(DescribeNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNonlocalLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNonlocalLoginPlaces");
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
     *本接口 (DescribeOpenPortTaskStatus) 用于获取实时拉取端口任务状态。
     * @param req DescribeOpenPortTaskStatusRequest
     * @return DescribeOpenPortTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortTaskStatusResponse DescribeOpenPortTaskStatus(DescribeOpenPortTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpenPortTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpenPortTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeOpenPorts) 用于获取端口列表数据。

     * @param req DescribeOpenPortsRequest
     * @return DescribeOpenPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortsResponse DescribeOpenPorts(DescribeOpenPortsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOpenPortsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOpenPortsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOpenPorts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于（DescribeOverviewStatistics）获取概览统计数据。
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
     *本接口 (DescribeProVersionInfo) 用于获取专业版信息。
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
     *本接口 (DescribeProcessTaskStatus) 用于获取实时拉取进程任务状态。
     * @param req DescribeProcessTaskStatusRequest
     * @return DescribeProcessTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessTaskStatusResponse DescribeProcessTaskStatus(DescribeProcessTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcessTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProcessTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProcessTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeProcesses) 用于获取进程列表数据。
     * @param req DescribeProcessesRequest
     * @return DescribeProcessesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessesResponse DescribeProcesses(DescribeProcessesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProcessesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProcessesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProcesses");
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
     *本接口 (DescribeSecurityDynamics) 用于获取安全事件消息数据。
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
     *本接口 (DescribeVulInfo) 用于获取漏洞详情。
     * @param req DescribeVulInfoRequest
     * @return DescribeVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoResponse DescribeVulInfo(DescribeVulInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVulScanResult) 用于获取漏洞检测结果。

     * @param req DescribeVulScanResultRequest
     * @return DescribeVulScanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanResultResponse DescribeVulScanResult(DescribeVulScanResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulScanResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulScanResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulScanResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVuls) 用于获取漏洞列表数据。
     * @param req DescribeVulsRequest
     * @return DescribeVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsResponse DescribeVuls(DescribeVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVuls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeWeeklyReportBruteAttacks) 用于获取专业周报密码破解数据。
     * @param req DescribeWeeklyReportBruteAttacksRequest
     * @return DescribeWeeklyReportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportBruteAttacksResponse DescribeWeeklyReportBruteAttacks(DescribeWeeklyReportBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportBruteAttacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWeeklyReportBruteAttacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWeeklyReportBruteAttacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeWeeklyReportInfo) 用于获取专业周报详情数据。
     * @param req DescribeWeeklyReportInfoRequest
     * @return DescribeWeeklyReportInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportInfoResponse DescribeWeeklyReportInfo(DescribeWeeklyReportInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWeeklyReportInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWeeklyReportInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeWeeklyReportMalwares) 用于获取专业周报木马数据。
     * @param req DescribeWeeklyReportMalwaresRequest
     * @return DescribeWeeklyReportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportMalwaresResponse DescribeWeeklyReportMalwares(DescribeWeeklyReportMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportMalwaresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWeeklyReportMalwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWeeklyReportMalwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeWeeklyReportNonlocalLoginPlaces) 用于获取专业周报异地登录数据。
     * @param req DescribeWeeklyReportNonlocalLoginPlacesRequest
     * @return DescribeWeeklyReportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportNonlocalLoginPlacesResponse DescribeWeeklyReportNonlocalLoginPlaces(DescribeWeeklyReportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWeeklyReportNonlocalLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWeeklyReportNonlocalLoginPlaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeWeeklyReportVuls) 用于专业版周报漏洞数据。

     * @param req DescribeWeeklyReportVulsRequest
     * @return DescribeWeeklyReportVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportVulsResponse DescribeWeeklyReportVuls(DescribeWeeklyReportVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportVulsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWeeklyReportVulsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWeeklyReportVuls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeWeeklyReports) 用于获取周报列表数据。
     * @param req DescribeWeeklyReportsRequest
     * @return DescribeWeeklyReportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportsResponse DescribeWeeklyReports(DescribeWeeklyReportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWeeklyReportsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWeeklyReportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWeeklyReports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改高危命令规则
     * @param req EditBashRuleRequest
     * @return EditBashRuleResponse
     * @throws TencentCloudSDKException
     */
    public EditBashRuleResponse EditBashRule(EditBashRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditBashRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EditBashRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditBashRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增或修改本地提权规则
     * @param req EditPrivilegeRuleRequest
     * @return EditPrivilegeRuleResponse
     * @throws TencentCloudSDKException
     */
    public EditPrivilegeRuleResponse EditPrivilegeRule(EditPrivilegeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditPrivilegeRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EditPrivilegeRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditPrivilegeRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑反弹Shell规则
     * @param req EditReverseShellRuleRequest
     * @return EditReverseShellRuleResponse
     * @throws TencentCloudSDKException
     */
    public EditReverseShellRuleResponse EditReverseShellRule(EditReverseShellRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EditReverseShellRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EditReverseShellRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EditReverseShellRule");
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
     *本接口 (InquiryPriceOpenProVersionPrepaid) 用于开通专业版询价(预付费)。
     * @param req InquiryPriceOpenProVersionPrepaidRequest
     * @return InquiryPriceOpenProVersionPrepaidResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceOpenProVersionPrepaidResponse InquiryPriceOpenProVersionPrepaid(InquiryPriceOpenProVersionPrepaidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceOpenProVersionPrepaidResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceOpenProVersionPrepaidResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceOpenProVersionPrepaid");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口{MisAlarmNonlocalLoginPlaces}将设置当前地点为常用登录地。
     * @param req MisAlarmNonlocalLoginPlacesRequest
     * @return MisAlarmNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public MisAlarmNonlocalLoginPlacesResponse MisAlarmNonlocalLoginPlaces(MisAlarmNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MisAlarmNonlocalLoginPlacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MisAlarmNonlocalLoginPlacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MisAlarmNonlocalLoginPlaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAlarmAttribute）用于修改告警设置。
     * @param req ModifyAlarmAttributeRequest
     * @return ModifyAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmAttributeResponse ModifyAlarmAttribute(ModifyAlarmAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyAutoOpenProVersionConfig) 用于设置新增主机自动开通专业版配置。
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
     *编辑白名单规则
     * @param req ModifyLoginWhiteListRequest
     * @return ModifyLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteListResponse ModifyLoginWhiteList(ModifyLoginWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoginWhiteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoginWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoginWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyProVersionRenewFlag) 用于修改专业版包年包月续费标识。
     * @param req ModifyProVersionRenewFlagRequest
     * @return ModifyProVersionRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProVersionRenewFlagResponse ModifyProVersionRenewFlag(ModifyProVersionRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProVersionRenewFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProVersionRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProVersionRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (OpenProVersion) 用于开通专业版。
     * @param req OpenProVersionRequest
     * @return OpenProVersionResponse
     * @throws TencentCloudSDKException
     */
    public OpenProVersionResponse OpenProVersion(OpenProVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenProVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (OpenProVersionPrepaid) 用于开通专业版(包年包月)。
     * @param req OpenProVersionPrepaidRequest
     * @return OpenProVersionPrepaidResponse
     * @throws TencentCloudSDKException
     */
    public OpenProVersionPrepaidResponse OpenProVersionPrepaid(OpenProVersionPrepaidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProVersionPrepaidResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProVersionPrepaidResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenProVersionPrepaid");
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
     *本接口 (RenewProVersion) 用于续费专业版(包年包月)。
     * @param req RenewProVersionRequest
     * @return RenewProVersionResponse
     * @throws TencentCloudSDKException
     */
    public RenewProVersionResponse RenewProVersion(RenewProVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewProVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewProVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewProVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (RescanImpactedHost) 用于漏洞重新检测。
     * @param req RescanImpactedHostRequest
     * @return RescanImpactedHostResponse
     * @throws TencentCloudSDKException
     */
    public RescanImpactedHostResponse RescanImpactedHost(RescanImpactedHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RescanImpactedHostResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RescanImpactedHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RescanImpactedHost");
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
     *本接口 (TrustMaliciousRequest) 用于恶意请求添加信任。
     * @param req TrustMaliciousRequestRequest
     * @return TrustMaliciousRequestResponse
     * @throws TencentCloudSDKException
     */
    public TrustMaliciousRequestResponse TrustMaliciousRequest(TrustMaliciousRequestRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrustMaliciousRequestResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TrustMaliciousRequestResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TrustMaliciousRequest");
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
     *本接口 (UntrustMaliciousRequest) 用于取消信任恶意请求。
     * @param req UntrustMaliciousRequestRequest
     * @return UntrustMaliciousRequestResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMaliciousRequestResponse UntrustMaliciousRequest(UntrustMaliciousRequestRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntrustMaliciousRequestResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UntrustMaliciousRequestResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UntrustMaliciousRequest");
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

}
