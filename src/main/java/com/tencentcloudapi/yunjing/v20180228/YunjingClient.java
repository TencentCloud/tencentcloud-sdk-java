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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLoginWhiteList", AddLoginWhiteListResponse.class);
    }

    /**
     *增加机器关联标签
     * @param req AddMachineTagRequest
     * @return AddMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public AddMachineTagResponse AddMachineTag(AddMachineTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddMachineTag", AddMachineTagResponse.class);
    }

    /**
     *本接口 (CloseProVersion) 用于关闭专业版。
     * @param req CloseProVersionRequest
     * @return CloseProVersionResponse
     * @throws TencentCloudSDKException
     */
    public CloseProVersionResponse CloseProVersion(CloseProVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProVersion", CloseProVersionResponse.class);
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
     *本接口 (CreateOpenPortTask) 用于创建实时获取端口任务。
     * @param req CreateOpenPortTaskRequest
     * @return CreateOpenPortTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateOpenPortTaskResponse CreateOpenPortTask(CreateOpenPortTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOpenPortTask", CreateOpenPortTaskResponse.class);
    }

    /**
     *本接口 (CreateProcessTask) 用于创建实时拉取进程任务。
     * @param req CreateProcessTaskRequest
     * @return CreateProcessTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessTaskResponse CreateProcessTask(CreateProcessTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProcessTask", CreateProcessTaskResponse.class);
    }

    /**
     *此接口（CreateUsualLoginPlaces）用于添加常用登录地。
     * @param req CreateUsualLoginPlacesRequest
     * @return CreateUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsualLoginPlacesResponse CreateUsualLoginPlaces(CreateUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUsualLoginPlaces", CreateUsualLoginPlacesResponse.class);
    }

    /**
     *删除网络攻击日志
     * @param req DeleteAttackLogsRequest
     * @return DeleteAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackLogsResponse DeleteAttackLogs(DeleteAttackLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAttackLogs", DeleteAttackLogsResponse.class);
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
     *删除白名单规则
     * @param req DeleteLoginWhiteListRequest
     * @return DeleteLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginWhiteListResponse DeleteLoginWhiteList(DeleteLoginWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoginWhiteList", DeleteLoginWhiteListResponse.class);
    }

    /**
     *本接口（DeleteMachine）用于卸载云镜客户端。
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachine", DeleteMachineResponse.class);
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
     *本接口（DeleteUsualLoginPlaces）用于删除常用登录地。
     * @param req DeleteUsualLoginPlacesRequest
     * @return DeleteUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsualLoginPlacesResponse DeleteUsualLoginPlaces(DeleteUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsualLoginPlaces", DeleteUsualLoginPlacesResponse.class);
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
     *本接口 (DescribeAccounts) 用于获取帐号列表数据。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *本接口 (DescribeAgentVuls) 用于获取单台主机的漏洞列表。
     * @param req DescribeAgentVulsRequest
     * @return DescribeAgentVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentVulsResponse DescribeAgentVuls(DescribeAgentVulsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentVuls", DescribeAgentVulsResponse.class);
    }

    /**
     *本接口 (DescribeAlarmAttribute) 用于获取告警设置。
     * @param req DescribeAlarmAttributeRequest
     * @return DescribeAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmAttributeResponse DescribeAlarmAttribute(DescribeAlarmAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmAttribute", DescribeAlarmAttributeResponse.class);
    }

    /**
     *网络攻击日志详情
     * @param req DescribeAttackLogInfoRequest
     * @return DescribeAttackLogInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogInfoResponse DescribeAttackLogInfo(DescribeAttackLogInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackLogInfo", DescribeAttackLogInfoResponse.class);
    }

    /**
     *按分页形式展示网络攻击日志列表
     * @param req DescribeAttackLogsRequest
     * @return DescribeAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogsResponse DescribeAttackLogs(DescribeAttackLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackLogs", DescribeAttackLogsResponse.class);
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
     *本接口{DescribeBruteAttacks}用于获取暴力破解事件列表。
     * @param req DescribeBruteAttacksRequest
     * @return DescribeBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttacksResponse DescribeBruteAttacks(DescribeBruteAttacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBruteAttacks", DescribeBruteAttacksResponse.class);
    }

    /**
     *本接口 (DescribeComponentInfo) 用于获取组件信息数据。
     * @param req DescribeComponentInfoRequest
     * @return DescribeComponentInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentInfoResponse DescribeComponentInfo(DescribeComponentInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComponentInfo", DescribeComponentInfoResponse.class);
    }

    /**
     *本接口 (DescribeComponentStatistics) 用于获取组件统计列表数据。
     * @param req DescribeComponentStatisticsRequest
     * @return DescribeComponentStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentStatisticsResponse DescribeComponentStatistics(DescribeComponentStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComponentStatistics", DescribeComponentStatisticsResponse.class);
    }

    /**
     *本接口 (DescribeComponents) 用于获取组件列表数据。
     * @param req DescribeComponentsRequest
     * @return DescribeComponentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentsResponse DescribeComponents(DescribeComponentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComponents", DescribeComponentsResponse.class);
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
     *本接口 (DescribeImpactedHosts) 用于获取漏洞受影响机器列表。
     * @param req DescribeImpactedHostsRequest
     * @return DescribeImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImpactedHostsResponse DescribeImpactedHosts(DescribeImpactedHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImpactedHosts", DescribeImpactedHostsResponse.class);
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
     *本接口 (DescribeMaliciousRequests) 用于获取恶意请求数据。
     * @param req DescribeMaliciousRequestsRequest
     * @return DescribeMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaliciousRequestsResponse DescribeMaliciousRequests(DescribeMaliciousRequestsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaliciousRequests", DescribeMaliciousRequestsResponse.class);
    }

    /**
     *本接口（DescribeMalwares）用于获取木马事件列表。
     * @param req DescribeMalwaresRequest
     * @return DescribeMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwaresResponse DescribeMalwares(DescribeMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwares", DescribeMalwaresResponse.class);
    }

    /**
     *本接口(DescribeNonlocalLoginPlaces)用于获取异地登录事件。
     * @param req DescribeNonlocalLoginPlacesRequest
     * @return DescribeNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNonlocalLoginPlacesResponse DescribeNonlocalLoginPlaces(DescribeNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNonlocalLoginPlaces", DescribeNonlocalLoginPlacesResponse.class);
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
     *本接口 (DescribeOpenPortTaskStatus) 用于获取实时拉取端口任务状态。
     * @param req DescribeOpenPortTaskStatusRequest
     * @return DescribeOpenPortTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortTaskStatusResponse DescribeOpenPortTaskStatus(DescribeOpenPortTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpenPortTaskStatus", DescribeOpenPortTaskStatusResponse.class);
    }

    /**
     *本接口 (DescribeOpenPorts) 用于获取端口列表数据。

     * @param req DescribeOpenPortsRequest
     * @return DescribeOpenPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortsResponse DescribeOpenPorts(DescribeOpenPortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpenPorts", DescribeOpenPortsResponse.class);
    }

    /**
     *本接口用于（DescribeOverviewStatistics）获取概览统计数据。
     * @param req DescribeOverviewStatisticsRequest
     * @return DescribeOverviewStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewStatisticsResponse DescribeOverviewStatistics(DescribeOverviewStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewStatistics", DescribeOverviewStatisticsResponse.class);
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
     *本接口 (DescribeProVersionInfo) 用于获取专业版信息。
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProVersionInfo", DescribeProVersionInfoResponse.class);
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
     *本接口 (DescribeProcessTaskStatus) 用于获取实时拉取进程任务状态。
     * @param req DescribeProcessTaskStatusRequest
     * @return DescribeProcessTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessTaskStatusResponse DescribeProcessTaskStatus(DescribeProcessTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessTaskStatus", DescribeProcessTaskStatusResponse.class);
    }

    /**
     *本接口 (DescribeProcesses) 用于获取进程列表数据。
     * @param req DescribeProcessesRequest
     * @return DescribeProcessesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessesResponse DescribeProcesses(DescribeProcessesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcesses", DescribeProcessesResponse.class);
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
     *本接口 (DescribeSecurityDynamics) 用于获取安全事件消息数据。
     * @param req DescribeSecurityDynamicsRequest
     * @return DescribeSecurityDynamicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityDynamicsResponse DescribeSecurityDynamics(DescribeSecurityDynamicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityDynamics", DescribeSecurityDynamicsResponse.class);
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
     *本接口 (DescribeVulInfo) 用于获取漏洞详情。
     * @param req DescribeVulInfoRequest
     * @return DescribeVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoResponse DescribeVulInfo(DescribeVulInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulInfo", DescribeVulInfoResponse.class);
    }

    /**
     *本接口 (DescribeVulScanResult) 用于获取漏洞检测结果。

     * @param req DescribeVulScanResultRequest
     * @return DescribeVulScanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanResultResponse DescribeVulScanResult(DescribeVulScanResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanResult", DescribeVulScanResultResponse.class);
    }

    /**
     *本接口 (DescribeVuls) 用于获取漏洞列表数据。
     * @param req DescribeVulsRequest
     * @return DescribeVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsResponse DescribeVuls(DescribeVulsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVuls", DescribeVulsResponse.class);
    }

    /**
     *本接口 (DescribeWeeklyReportBruteAttacks) 用于获取专业周报密码破解数据。
     * @param req DescribeWeeklyReportBruteAttacksRequest
     * @return DescribeWeeklyReportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportBruteAttacksResponse DescribeWeeklyReportBruteAttacks(DescribeWeeklyReportBruteAttacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeeklyReportBruteAttacks", DescribeWeeklyReportBruteAttacksResponse.class);
    }

    /**
     *本接口 (DescribeWeeklyReportInfo) 用于获取专业周报详情数据。
     * @param req DescribeWeeklyReportInfoRequest
     * @return DescribeWeeklyReportInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportInfoResponse DescribeWeeklyReportInfo(DescribeWeeklyReportInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeeklyReportInfo", DescribeWeeklyReportInfoResponse.class);
    }

    /**
     *本接口 (DescribeWeeklyReportMalwares) 用于获取专业周报木马数据。
     * @param req DescribeWeeklyReportMalwaresRequest
     * @return DescribeWeeklyReportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportMalwaresResponse DescribeWeeklyReportMalwares(DescribeWeeklyReportMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeeklyReportMalwares", DescribeWeeklyReportMalwaresResponse.class);
    }

    /**
     *本接口 (DescribeWeeklyReportNonlocalLoginPlaces) 用于获取专业周报异地登录数据。
     * @param req DescribeWeeklyReportNonlocalLoginPlacesRequest
     * @return DescribeWeeklyReportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportNonlocalLoginPlacesResponse DescribeWeeklyReportNonlocalLoginPlaces(DescribeWeeklyReportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeeklyReportNonlocalLoginPlaces", DescribeWeeklyReportNonlocalLoginPlacesResponse.class);
    }

    /**
     *本接口 (DescribeWeeklyReportVuls) 用于专业版周报漏洞数据。

     * @param req DescribeWeeklyReportVulsRequest
     * @return DescribeWeeklyReportVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportVulsResponse DescribeWeeklyReportVuls(DescribeWeeklyReportVulsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeeklyReportVuls", DescribeWeeklyReportVulsResponse.class);
    }

    /**
     *本接口 (DescribeWeeklyReports) 用于获取周报列表数据。
     * @param req DescribeWeeklyReportsRequest
     * @return DescribeWeeklyReportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeeklyReportsResponse DescribeWeeklyReports(DescribeWeeklyReportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeeklyReports", DescribeWeeklyReportsResponse.class);
    }

    /**
     *新增或修改高危命令规则
     * @param req EditBashRuleRequest
     * @return EditBashRuleResponse
     * @throws TencentCloudSDKException
     */
    public EditBashRuleResponse EditBashRule(EditBashRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditBashRule", EditBashRuleResponse.class);
    }

    /**
     *新增或修改本地提权规则
     * @param req EditPrivilegeRuleRequest
     * @return EditPrivilegeRuleResponse
     * @throws TencentCloudSDKException
     */
    public EditPrivilegeRuleResponse EditPrivilegeRule(EditPrivilegeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditPrivilegeRule", EditPrivilegeRuleResponse.class);
    }

    /**
     *编辑反弹Shell规则
     * @param req EditReverseShellRuleRequest
     * @return EditReverseShellRuleResponse
     * @throws TencentCloudSDKException
     */
    public EditReverseShellRuleResponse EditReverseShellRule(EditReverseShellRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditReverseShellRule", EditReverseShellRuleResponse.class);
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
     *导出网络攻击日志
     * @param req ExportAttackLogsRequest
     * @return ExportAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttackLogsResponse ExportAttackLogs(ExportAttackLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAttackLogs", ExportAttackLogsResponse.class);
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
     *本接口 (InquiryPriceOpenProVersionPrepaid) 用于开通专业版询价(预付费)。
     * @param req InquiryPriceOpenProVersionPrepaidRequest
     * @return InquiryPriceOpenProVersionPrepaidResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceOpenProVersionPrepaidResponse InquiryPriceOpenProVersionPrepaid(InquiryPriceOpenProVersionPrepaidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceOpenProVersionPrepaid", InquiryPriceOpenProVersionPrepaidResponse.class);
    }

    /**
     *本接口{MisAlarmNonlocalLoginPlaces}将设置当前地点为常用登录地。
     * @param req MisAlarmNonlocalLoginPlacesRequest
     * @return MisAlarmNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public MisAlarmNonlocalLoginPlacesResponse MisAlarmNonlocalLoginPlaces(MisAlarmNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MisAlarmNonlocalLoginPlaces", MisAlarmNonlocalLoginPlacesResponse.class);
    }

    /**
     *本接口（ModifyAlarmAttribute）用于修改告警设置。
     * @param req ModifyAlarmAttributeRequest
     * @return ModifyAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmAttributeResponse ModifyAlarmAttribute(ModifyAlarmAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmAttribute", ModifyAlarmAttributeResponse.class);
    }

    /**
     *本接口 (ModifyAutoOpenProVersionConfig) 用于设置新增主机自动开通专业版配置。
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoOpenProVersionConfig", ModifyAutoOpenProVersionConfigResponse.class);
    }

    /**
     *编辑白名单规则
     * @param req ModifyLoginWhiteListRequest
     * @return ModifyLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteListResponse ModifyLoginWhiteList(ModifyLoginWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoginWhiteList", ModifyLoginWhiteListResponse.class);
    }

    /**
     *本接口 (ModifyProVersionRenewFlag) 用于修改专业版包年包月续费标识。
     * @param req ModifyProVersionRenewFlagRequest
     * @return ModifyProVersionRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProVersionRenewFlagResponse ModifyProVersionRenewFlag(ModifyProVersionRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProVersionRenewFlag", ModifyProVersionRenewFlagResponse.class);
    }

    /**
     *本接口 (OpenProVersion) 用于开通专业版。
     * @param req OpenProVersionRequest
     * @return OpenProVersionResponse
     * @throws TencentCloudSDKException
     */
    public OpenProVersionResponse OpenProVersion(OpenProVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenProVersion", OpenProVersionResponse.class);
    }

    /**
     *本接口 (OpenProVersionPrepaid) 用于开通专业版(包年包月)。
     * @param req OpenProVersionPrepaidRequest
     * @return OpenProVersionPrepaidResponse
     * @throws TencentCloudSDKException
     */
    public OpenProVersionPrepaidResponse OpenProVersionPrepaid(OpenProVersionPrepaidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenProVersionPrepaid", OpenProVersionPrepaidResponse.class);
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
     *本接口 (RenewProVersion) 用于续费专业版(包年包月)。
     * @param req RenewProVersionRequest
     * @return RenewProVersionResponse
     * @throws TencentCloudSDKException
     */
    public RenewProVersionResponse RenewProVersion(RenewProVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewProVersion", RenewProVersionResponse.class);
    }

    /**
     *本接口 (RescanImpactedHost) 用于漏洞重新检测。
     * @param req RescanImpactedHostRequest
     * @return RescanImpactedHostResponse
     * @throws TencentCloudSDKException
     */
    public RescanImpactedHostResponse RescanImpactedHost(RescanImpactedHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RescanImpactedHost", RescanImpactedHostResponse.class);
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
     *本接口 (TrustMaliciousRequest) 用于恶意请求添加信任。
     * @param req TrustMaliciousRequestRequest
     * @return TrustMaliciousRequestResponse
     * @throws TencentCloudSDKException
     */
    public TrustMaliciousRequestResponse TrustMaliciousRequest(TrustMaliciousRequestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TrustMaliciousRequest", TrustMaliciousRequestResponse.class);
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
     *本接口 (UntrustMaliciousRequest) 用于取消信任恶意请求。
     * @param req UntrustMaliciousRequestRequest
     * @return UntrustMaliciousRequestResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMaliciousRequestResponse UntrustMaliciousRequest(UntrustMaliciousRequestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UntrustMaliciousRequest", UntrustMaliciousRequestResponse.class);
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

}
