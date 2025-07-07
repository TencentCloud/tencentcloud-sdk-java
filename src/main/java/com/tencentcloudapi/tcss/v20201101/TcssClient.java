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
package com.tencentcloudapi.tcss.v20201101;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcss.v20201101.models.*;

public class TcssClient extends AbstractClient{
    private static String endpoint = "tcss.tencentcloudapi.com";
    private static String service = "tcss";
    private static String version = "2020-11-01";

    public TcssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcssClient(Credential credential, String region, ClientProfile profile) {
        super(TcssClient.endpoint, TcssClient.version, credential, region, profile);
    }

    /**
     *容器网络创建网络策略添加并发布任务
     * @param req AddAndPublishNetworkFirewallPolicyDetailRequest
     * @return AddAndPublishNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAndPublishNetworkFirewallPolicyDetailResponse AddAndPublishNetworkFirewallPolicyDetail(AddAndPublishNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAndPublishNetworkFirewallPolicyDetail", AddAndPublishNetworkFirewallPolicyDetailResponse.class);
    }

    /**
     *容器网络创建Yaml网络策略并发布任务
     * @param req AddAndPublishNetworkFirewallPolicyYamlDetailRequest
     * @return AddAndPublishNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAndPublishNetworkFirewallPolicyYamlDetailResponse AddAndPublishNetworkFirewallPolicyYamlDetail(AddAndPublishNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAndPublishNetworkFirewallPolicyYamlDetail", AddAndPublishNetworkFirewallPolicyYamlDetailResponse.class);
    }

    /**
     *新增单个镜像仓库详细信息
     * @param req AddAssetImageRegistryRegistryDetailRequest
     * @return AddAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAssetImageRegistryRegistryDetailResponse AddAssetImageRegistryRegistryDetail(AddAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAssetImageRegistryRegistryDetail", AddAssetImageRegistryRegistryDetailResponse.class);
    }

    /**
     *新增安全合规忽略(资产+检测项列表)列表，不显示指定的检查项包含的资产内容
参考的AddCompliancePolicyItemToWhitelist，除输入字段外，其它应该是一致的，如果有不同可能是定义的不对
     * @param req AddComplianceAssetPolicySetToWhitelistRequest
     * @return AddComplianceAssetPolicySetToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddComplianceAssetPolicySetToWhitelistResponse AddComplianceAssetPolicySetToWhitelist(AddComplianceAssetPolicySetToWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddComplianceAssetPolicySetToWhitelist", AddComplianceAssetPolicySetToWhitelistResponse.class);
    }

    /**
     *新增安全合规忽略(检测项+资产)列表，不显示指定的检查项包含的资产内容
参考的AddCompliancePolicyItemToWhitelist，除输入字段外，其它应该是一致的，如果有不同可能是定义的不对
     * @param req AddCompliancePolicyAssetSetToWhitelistRequest
     * @return AddCompliancePolicyAssetSetToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePolicyAssetSetToWhitelistResponse AddCompliancePolicyAssetSetToWhitelist(AddCompliancePolicyAssetSetToWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCompliancePolicyAssetSetToWhitelist", AddCompliancePolicyAssetSetToWhitelistResponse.class);
    }

    /**
     *将指定的检测项添加到白名单中，不显示未通过结果。
     * @param req AddCompliancePolicyItemToWhitelistRequest
     * @return AddCompliancePolicyItemToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePolicyItemToWhitelistResponse AddCompliancePolicyItemToWhitelist(AddCompliancePolicyItemToWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCompliancePolicyItemToWhitelist", AddCompliancePolicyItemToWhitelistResponse.class);
    }

    /**
     *添加编辑运行时异常进程策略
     * @param req AddEditAbnormalProcessRuleRequest
     * @return AddEditAbnormalProcessRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditAbnormalProcessRuleResponse AddEditAbnormalProcessRule(AddEditAbnormalProcessRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEditAbnormalProcessRule", AddEditAbnormalProcessRuleResponse.class);
    }

    /**
     *添加编辑运行时访问控制策略
     * @param req AddEditAccessControlRuleRequest
     * @return AddEditAccessControlRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditAccessControlRuleResponse AddEditAccessControlRule(AddEditAccessControlRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEditAccessControlRule", AddEditAccessControlRuleResponse.class);
    }

    /**
     *新增或编辑本地镜像自动授权规则
     * @param req AddEditImageAutoAuthorizedRuleRequest
     * @return AddEditImageAutoAuthorizedRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditImageAutoAuthorizedRuleResponse AddEditImageAutoAuthorizedRule(AddEditImageAutoAuthorizedRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEditImageAutoAuthorizedRule", AddEditImageAutoAuthorizedRuleResponse.class);
    }

    /**
     *添加编辑运行时反弹shell白名单
     * @param req AddEditReverseShellWhiteListRequest
     * @return AddEditReverseShellWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEditReverseShellWhiteListResponse AddEditReverseShellWhiteList(AddEditReverseShellWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEditReverseShellWhiteList", AddEditReverseShellWhiteListResponse.class);
    }

    /**
     *添加编辑运行时高危系统调用白名单
     * @param req AddEditRiskSyscallWhiteListRequest
     * @return AddEditRiskSyscallWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEditRiskSyscallWhiteListResponse AddEditRiskSyscallWhiteList(AddEditRiskSyscallWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEditRiskSyscallWhiteList", AddEditRiskSyscallWhiteListResponse.class);
    }

    /**
     *添加编辑告警策略
     * @param req AddEditWarningRulesRequest
     * @return AddEditWarningRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddEditWarningRulesResponse AddEditWarningRules(AddEditWarningRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEditWarningRules", AddEditWarningRulesResponse.class);
    }

    /**
     *新增逃逸白名单
     * @param req AddEscapeWhiteListRequest
     * @return AddEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEscapeWhiteListResponse AddEscapeWhiteList(AddEscapeWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEscapeWhiteList", AddEscapeWhiteListResponse.class);
    }

    /**
     *新增漏洞扫描忽略漏洞
     * @param req AddIgnoreVulRequest
     * @return AddIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public AddIgnoreVulResponse AddIgnoreVul(AddIgnoreVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddIgnoreVul", AddIgnoreVulResponse.class);
    }

    /**
     *容器网络创建网络策略添加任务
     * @param req AddNetworkFirewallPolicyDetailRequest
     * @return AddNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddNetworkFirewallPolicyDetailResponse AddNetworkFirewallPolicyDetail(AddNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNetworkFirewallPolicyDetail", AddNetworkFirewallPolicyDetailResponse.class);
    }

    /**
     *容器网络创建Yaml网络策略添加任务
     * @param req AddNetworkFirewallPolicyYamlDetailRequest
     * @return AddNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddNetworkFirewallPolicyYamlDetailResponse AddNetworkFirewallPolicyYamlDetail(AddNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNetworkFirewallPolicyYamlDetail", AddNetworkFirewallPolicyYamlDetailResponse.class);
    }

    /**
     *容器网络创建检查Yaml网络策略任务
     * @param req CheckNetworkFirewallPolicyYamlRequest
     * @return CheckNetworkFirewallPolicyYamlResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetworkFirewallPolicyYamlResponse CheckNetworkFirewallPolicyYaml(CheckNetworkFirewallPolicyYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckNetworkFirewallPolicyYaml", CheckNetworkFirewallPolicyYamlResponse.class);
    }

    /**
     *检查单个镜像仓库名是否重复
     * @param req CheckRepeatAssetImageRegistryRequest
     * @return CheckRepeatAssetImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public CheckRepeatAssetImageRegistryResponse CheckRepeatAssetImageRegistry(CheckRepeatAssetImageRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRepeatAssetImageRegistry", CheckRepeatAssetImageRegistryResponse.class);
    }

    /**
     *容器网络创建网络策略确认任务
     * @param req ConfirmNetworkFirewallPolicyRequest
     * @return ConfirmNetworkFirewallPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmNetworkFirewallPolicyResponse ConfirmNetworkFirewallPolicy(ConfirmNetworkFirewallPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmNetworkFirewallPolicy", ConfirmNetworkFirewallPolicyResponse.class);
    }

    /**
     *创建异常进程规则导出任务
     * @param req CreateAbnormalProcessRulesExportJobRequest
     * @return CreateAbnormalProcessRulesExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAbnormalProcessRulesExportJobResponse CreateAbnormalProcessRulesExportJob(CreateAbnormalProcessRulesExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAbnormalProcessRulesExportJob", CreateAbnormalProcessRulesExportJobResponse.class);
    }

    /**
     *创建文件篡改规则导出任务
     * @param req CreateAccessControlsRuleExportJobRequest
     * @return CreateAccessControlsRuleExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessControlsRuleExportJobResponse CreateAccessControlsRuleExportJob(CreateAccessControlsRuleExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessControlsRuleExportJob", CreateAccessControlsRuleExportJobResponse.class);
    }

    /**
     *镜像仓库创建镜像扫描任务
     * @param req CreateAssetImageRegistryScanTaskRequest
     * @return CreateAssetImageRegistryScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageRegistryScanTaskResponse CreateAssetImageRegistryScanTask(CreateAssetImageRegistryScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetImageRegistryScanTask", CreateAssetImageRegistryScanTaskResponse.class);
    }

    /**
     *镜像仓库创建镜像一键扫描任务
     * @param req CreateAssetImageRegistryScanTaskOneKeyRequest
     * @return CreateAssetImageRegistryScanTaskOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageRegistryScanTaskOneKeyResponse CreateAssetImageRegistryScanTaskOneKey(CreateAssetImageRegistryScanTaskOneKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetImageRegistryScanTaskOneKey", CreateAssetImageRegistryScanTaskOneKeyResponse.class);
    }

    /**
     *添加容器安全镜像扫描设置
     * @param req CreateAssetImageScanSettingRequest
     * @return CreateAssetImageScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageScanSettingResponse CreateAssetImageScanSetting(CreateAssetImageScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetImageScanSetting", CreateAssetImageScanSettingResponse.class);
    }

    /**
     *容器安全创建镜像扫描任务
     * @param req CreateAssetImageScanTaskRequest
     * @return CreateAssetImageScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageScanTaskResponse CreateAssetImageScanTask(CreateAssetImageScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetImageScanTask", CreateAssetImageScanTaskResponse.class);
    }

    /**
     *创建本地镜像木马列表导出任务
     * @param req CreateAssetImageVirusExportJobRequest
     * @return CreateAssetImageVirusExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageVirusExportJobResponse CreateAssetImageVirusExportJob(CreateAssetImageVirusExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetImageVirusExportJob", CreateAssetImageVirusExportJobResponse.class);
    }

    /**
     *安装检查组件，创建防护容器
     * @param req CreateCheckComponentRequest
     * @return CreateCheckComponentResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckComponentResponse CreateCheckComponent(CreateCheckComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCheckComponent", CreateCheckComponentResponse.class);
    }

    /**
     *创建集群检查任务，用户检查用户的集群相关风险项
     * @param req CreateClusterCheckTaskRequest
     * @return CreateClusterCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterCheckTaskResponse CreateClusterCheckTask(CreateClusterCheckTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterCheckTask", CreateClusterCheckTaskResponse.class);
    }

    /**
     *创建合规检查任务，在资产级别触发重新检测时使用。
     * @param req CreateComplianceTaskRequest
     * @return CreateComplianceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplianceTaskResponse CreateComplianceTask(CreateComplianceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComplianceTask", CreateComplianceTaskResponse.class);
    }

    /**
     *查询本地镜像组件列表导出
     * @param req CreateComponentExportJobRequest
     * @return CreateComponentExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateComponentExportJobResponse CreateComponentExportJob(CreateComponentExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComponentExportJob", CreateComponentExportJobResponse.class);
    }

    /**
     *创建支持防御的漏洞导出任务
     * @param req CreateDefenceVulExportJobRequest
     * @return CreateDefenceVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefenceVulExportJobResponse CreateDefenceVulExportJob(CreateDefenceVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDefenceVulExportJob", CreateDefenceVulExportJobResponse.class);
    }

    /**
     *创建应急漏洞导出任务
     * @param req CreateEmergencyVulExportJobRequest
     * @return CreateEmergencyVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmergencyVulExportJobResponse CreateEmergencyVulExportJob(CreateEmergencyVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmergencyVulExportJob", CreateEmergencyVulExportJobResponse.class);
    }

    /**
     *创建逃逸事件导出异步任务
     * @param req CreateEscapeEventsExportJobRequest
     * @return CreateEscapeEventsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEscapeEventsExportJobResponse CreateEscapeEventsExportJob(CreateEscapeEventsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEscapeEventsExportJob", CreateEscapeEventsExportJobResponse.class);
    }

    /**
     *创建逃逸白名单导出任务
     * @param req CreateEscapeWhiteListExportJobRequest
     * @return CreateEscapeWhiteListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEscapeWhiteListExportJobResponse CreateEscapeWhiteListExportJob(CreateEscapeWhiteListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEscapeWhiteListExportJob", CreateEscapeWhiteListExportJobResponse.class);
    }

    /**
     *创建一个导出安全合规信息的任务
     * @param req CreateExportComplianceStatusListJobRequest
     * @return CreateExportComplianceStatusListJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportComplianceStatusListJobResponse CreateExportComplianceStatusListJob(CreateExportComplianceStatusListJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExportComplianceStatusListJob", CreateExportComplianceStatusListJobResponse.class);
    }

    /**
     *创建主机列表导出任务
     * @param req CreateHostExportJobRequest
     * @return CreateHostExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostExportJobResponse CreateHostExportJob(CreateHostExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHostExportJob", CreateHostExportJobResponse.class);
    }

    /**
     *创建镜像导出任务
     * @param req CreateImageExportJobRequest
     * @return CreateImageExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageExportJobResponse CreateImageExportJob(CreateImageExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageExportJob", CreateImageExportJobResponse.class);
    }

    /**
     *创建k8s api异常事件导出任务
     * @param req CreateK8sApiAbnormalEventExportJobRequest
     * @return CreateK8sApiAbnormalEventExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateK8sApiAbnormalEventExportJobResponse CreateK8sApiAbnormalEventExportJob(CreateK8sApiAbnormalEventExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateK8sApiAbnormalEventExportJob", CreateK8sApiAbnormalEventExportJobResponse.class);
    }

    /**
     *创建k8sApi异常规则导出任务
     * @param req CreateK8sApiAbnormalRuleExportJobRequest
     * @return CreateK8sApiAbnormalRuleExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateK8sApiAbnormalRuleExportJobResponse CreateK8sApiAbnormalRuleExportJob(CreateK8sApiAbnormalRuleExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateK8sApiAbnormalRuleExportJob", CreateK8sApiAbnormalRuleExportJobResponse.class);
    }

    /**
     *创建k8sapi异常事件规则
     * @param req CreateK8sApiAbnormalRuleInfoRequest
     * @return CreateK8sApiAbnormalRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateK8sApiAbnormalRuleInfoResponse CreateK8sApiAbnormalRuleInfo(CreateK8sApiAbnormalRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateK8sApiAbnormalRuleInfo", CreateK8sApiAbnormalRuleInfoResponse.class);
    }

    /**
     *容器网络集群下发刷新任务
     * @param req CreateNetworkFirewallClusterRefreshRequest
     * @return CreateNetworkFirewallClusterRefreshResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallClusterRefreshResponse CreateNetworkFirewallClusterRefresh(CreateNetworkFirewallClusterRefreshRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkFirewallClusterRefresh", CreateNetworkFirewallClusterRefreshResponse.class);
    }

    /**
     *容器网络集群网络策略创建自动发现任务
     * @param req CreateNetworkFirewallPolicyDiscoverRequest
     * @return CreateNetworkFirewallPolicyDiscoverResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallPolicyDiscoverResponse CreateNetworkFirewallPolicyDiscover(CreateNetworkFirewallPolicyDiscoverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkFirewallPolicyDiscover", CreateNetworkFirewallPolicyDiscoverResponse.class);
    }

    /**
     *容器网络创建网络策略发布任务
     * @param req CreateNetworkFirewallPublishRequest
     * @return CreateNetworkFirewallPublishResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallPublishResponse CreateNetworkFirewallPublish(CreateNetworkFirewallPublishRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkFirewallPublish", CreateNetworkFirewallPublishResponse.class);
    }

    /**
     *容器网络创建网络策略撤销任务
     * @param req CreateNetworkFirewallUndoPublishRequest
     * @return CreateNetworkFirewallUndoPublishResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkFirewallUndoPublishResponse CreateNetworkFirewallUndoPublish(CreateNetworkFirewallUndoPublishRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkFirewallUndoPublish", CreateNetworkFirewallUndoPublishResponse.class);
    }

    /**
     *CreateOrModifyPostPayCores  创建或者编辑弹性计费上限
     * @param req CreateOrModifyPostPayCoresRequest
     * @return CreateOrModifyPostPayCoresResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrModifyPostPayCoresResponse CreateOrModifyPostPayCores(CreateOrModifyPostPayCoresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrModifyPostPayCores", CreateOrModifyPostPayCoresResponse.class);
    }

    /**
     *创建异常进程事件导出异步任务
     * @param req CreateProcessEventsExportJobRequest
     * @return CreateProcessEventsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateProcessEventsExportJobResponse CreateProcessEventsExportJob(CreateProcessEventsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProcessEventsExportJob", CreateProcessEventsExportJobResponse.class);
    }

    /**
     *下发刷新任务，会刷新资产信息
     * @param req CreateRefreshTaskRequest
     * @return CreateRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRefreshTaskResponse CreateRefreshTask(CreateRefreshTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRefreshTask", CreateRefreshTaskResponse.class);
    }

    /**
     *创建恶意请求事件导出任务
     * @param req CreateRiskDnsEventExportJobRequest
     * @return CreateRiskDnsEventExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskDnsEventExportJobResponse CreateRiskDnsEventExportJob(CreateRiskDnsEventExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskDnsEventExportJob", CreateRiskDnsEventExportJobResponse.class);
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
     *创建系统漏洞导出任务
     * @param req CreateSystemVulExportJobRequest
     * @return CreateSystemVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSystemVulExportJobResponse CreateSystemVulExportJob(CreateSystemVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSystemVulExportJob", CreateSystemVulExportJobResponse.class);
    }

    /**
     *运行时文件查杀重新检测
     * @param req CreateVirusScanAgainRequest
     * @return CreateVirusScanAgainResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirusScanAgainResponse CreateVirusScanAgain(CreateVirusScanAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVirusScanAgain", CreateVirusScanAgainResponse.class);
    }

    /**
     *运行时文件查杀一键扫描
     * @param req CreateVirusScanTaskRequest
     * @return CreateVirusScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirusScanTaskResponse CreateVirusScanTask(CreateVirusScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVirusScanTask", CreateVirusScanTaskResponse.class);
    }

    /**
     *创建受漏洞影响的容器导出任务
     * @param req CreateVulContainerExportJobRequest
     * @return CreateVulContainerExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulContainerExportJobResponse CreateVulContainerExportJob(CreateVulContainerExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulContainerExportJob", CreateVulContainerExportJobResponse.class);
    }

    /**
     *创建漏洞防御导出任务
     * @param req CreateVulDefenceEventExportJobRequest
     * @return CreateVulDefenceEventExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulDefenceEventExportJobResponse CreateVulDefenceEventExportJob(CreateVulDefenceEventExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulDefenceEventExportJob", CreateVulDefenceEventExportJobResponse.class);
    }

    /**
     *创建漏洞防御主机导出任务
     * @param req CreateVulDefenceHostExportJobRequest
     * @return CreateVulDefenceHostExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulDefenceHostExportJobResponse CreateVulDefenceHostExportJob(CreateVulDefenceHostExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulDefenceHostExportJob", CreateVulDefenceHostExportJobResponse.class);
    }

    /**
     *查询本地镜像漏洞列表导出
     * @param req CreateVulExportJobRequest
     * @return CreateVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulExportJobResponse CreateVulExportJob(CreateVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulExportJob", CreateVulExportJobResponse.class);
    }

    /**
     *创建受漏洞影响的镜像导出任务
     * @param req CreateVulImageExportJobRequest
     * @return CreateVulImageExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulImageExportJobResponse CreateVulImageExportJob(CreateVulImageExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulImageExportJob", CreateVulImageExportJobResponse.class);
    }

    /**
     *创建漏洞扫描任务
     * @param req CreateVulScanTaskRequest
     * @return CreateVulScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulScanTaskResponse CreateVulScanTask(CreateVulScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulScanTask", CreateVulScanTaskResponse.class);
    }

    /**
     *创建web漏洞导出任务
     * @param req CreateWebVulExportJobRequest
     * @return CreateWebVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebVulExportJobResponse CreateWebVulExportJob(CreateWebVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebVulExportJob", CreateWebVulExportJobResponse.class);
    }

    /**
     *删除运行异常进程策略
     * @param req DeleteAbnormalProcessRulesRequest
     * @return DeleteAbnormalProcessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAbnormalProcessRulesResponse DeleteAbnormalProcessRules(DeleteAbnormalProcessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAbnormalProcessRules", DeleteAbnormalProcessRulesResponse.class);
    }

    /**
     *删除运行访问控制策略
     * @param req DeleteAccessControlRulesRequest
     * @return DeleteAccessControlRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessControlRulesResponse DeleteAccessControlRules(DeleteAccessControlRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessControlRules", DeleteAccessControlRulesResponse.class);
    }

    /**
     *移除安全合规忽略(资产+检测项)列表，不显示指定的检查项包含的资产内容
参考的AddCompliancePolicyAssetSetToWhitelist，除输入字段外，其它应该是一致的，如果有不同可能是定义的不对
     * @param req DeleteComplianceAssetPolicySetFromWhitelistRequest
     * @return DeleteComplianceAssetPolicySetFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteComplianceAssetPolicySetFromWhitelistResponse DeleteComplianceAssetPolicySetFromWhitelist(DeleteComplianceAssetPolicySetFromWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteComplianceAssetPolicySetFromWhitelist", DeleteComplianceAssetPolicySetFromWhitelistResponse.class);
    }

    /**
     *新增安全合规忽略(检测项+资产)列表，不显示指定的检查项包含的资产内容
     * @param req DeleteCompliancePolicyAssetSetFromWhitelistRequest
     * @return DeleteCompliancePolicyAssetSetFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePolicyAssetSetFromWhitelistResponse DeleteCompliancePolicyAssetSetFromWhitelist(DeleteCompliancePolicyAssetSetFromWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCompliancePolicyAssetSetFromWhitelist", DeleteCompliancePolicyAssetSetFromWhitelistResponse.class);
    }

    /**
     *产品重构优化，这几个接口已经没有调用了

从白名单中删除将指定的检测项。
     * @param req DeleteCompliancePolicyItemFromWhitelistRequest
     * @return DeleteCompliancePolicyItemFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePolicyItemFromWhitelistResponse DeleteCompliancePolicyItemFromWhitelist(DeleteCompliancePolicyItemFromWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCompliancePolicyItemFromWhitelist", DeleteCompliancePolicyItemFromWhitelistResponse.class);
    }

    /**
     *删除逃逸白名单
     * @param req DeleteEscapeWhiteListRequest
     * @return DeleteEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEscapeWhiteListResponse DeleteEscapeWhiteList(DeleteEscapeWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEscapeWhiteList", DeleteEscapeWhiteListResponse.class);
    }

    /**
     *取消漏洞扫描忽略漏洞
     * @param req DeleteIgnoreVulRequest
     * @return DeleteIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIgnoreVulResponse DeleteIgnoreVul(DeleteIgnoreVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIgnoreVul", DeleteIgnoreVulResponse.class);
    }

    /**
     *删除k8sapi异常事件规则
     * @param req DeleteK8sApiAbnormalRuleRequest
     * @return DeleteK8sApiAbnormalRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteK8sApiAbnormalRuleResponse DeleteK8sApiAbnormalRule(DeleteK8sApiAbnormalRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteK8sApiAbnormalRule", DeleteK8sApiAbnormalRuleResponse.class);
    }

    /**
     *卸载Agent客户端
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachine", DeleteMachineResponse.class);
    }

    /**
     *容器网络创建网络策略删除任务
     * @param req DeleteNetworkFirewallPolicyDetailRequest
     * @return DeleteNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkFirewallPolicyDetailResponse DeleteNetworkFirewallPolicyDetail(DeleteNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkFirewallPolicyDetail", DeleteNetworkFirewallPolicyDetailResponse.class);
    }

    /**
     *删除漏洞防御白名单
     * @param req DeleteRaspRulesRequest
     * @return DeleteRaspRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRaspRulesResponse DeleteRaspRules(DeleteRaspRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRaspRules", DeleteRaspRulesResponse.class);
    }

    /**
     *删除运行时反弹shell事件
     * @param req DeleteReverseShellEventsRequest
     * @return DeleteReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellEventsResponse DeleteReverseShellEvents(DeleteReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReverseShellEvents", DeleteReverseShellEventsResponse.class);
    }

    /**
     *删除运行时反弹shell白名单
     * @param req DeleteReverseShellWhiteListsRequest
     * @return DeleteReverseShellWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellWhiteListsResponse DeleteReverseShellWhiteLists(DeleteReverseShellWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReverseShellWhiteLists", DeleteReverseShellWhiteListsResponse.class);
    }

    /**
     *删除运行时高危系统调用事件
     * @param req DeleteRiskSyscallEventsRequest
     * @return DeleteRiskSyscallEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskSyscallEventsResponse DeleteRiskSyscallEvents(DeleteRiskSyscallEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskSyscallEvents", DeleteRiskSyscallEventsResponse.class);
    }

    /**
     *删除运行时高危系统调用白名单
     * @param req DeleteRiskSyscallWhiteListsRequest
     * @return DeleteRiskSyscallWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskSyscallWhiteListsResponse DeleteRiskSyscallWhiteLists(DeleteRiskSyscallWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskSyscallWhiteLists", DeleteRiskSyscallWhiteListsResponse.class);
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
     *查询运行时异常进程事件详细信息
     * @param req DescribeAbnormalProcessDetailRequest
     * @return DescribeAbnormalProcessDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessDetailResponse DescribeAbnormalProcessDetail(DescribeAbnormalProcessDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalProcessDetail", DescribeAbnormalProcessDetailResponse.class);
    }

    /**
     *查询待处理异常进程事件趋势
     * @param req DescribeAbnormalProcessEventTendencyRequest
     * @return DescribeAbnormalProcessEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventTendencyResponse DescribeAbnormalProcessEventTendency(DescribeAbnormalProcessEventTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalProcessEventTendency", DescribeAbnormalProcessEventTendencyResponse.class);
    }

    /**
     *查询运行时异常进程事件列表信息
     * @param req DescribeAbnormalProcessEventsRequest
     * @return DescribeAbnormalProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventsResponse DescribeAbnormalProcessEvents(DescribeAbnormalProcessEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalProcessEvents", DescribeAbnormalProcessEventsResponse.class);
    }

    /**
     *统计异常进程各威胁等级待处理事件数
     * @param req DescribeAbnormalProcessLevelSummaryRequest
     * @return DescribeAbnormalProcessLevelSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessLevelSummaryResponse DescribeAbnormalProcessLevelSummary(DescribeAbnormalProcessLevelSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalProcessLevelSummary", DescribeAbnormalProcessLevelSummaryResponse.class);
    }

    /**
     *查询运行时异常策略详细信息
     * @param req DescribeAbnormalProcessRuleDetailRequest
     * @return DescribeAbnormalProcessRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRuleDetailResponse DescribeAbnormalProcessRuleDetail(DescribeAbnormalProcessRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalProcessRuleDetail", DescribeAbnormalProcessRuleDetailResponse.class);
    }

    /**
     *查询运行时异常进程策略列表信息
     * @param req DescribeAbnormalProcessRulesRequest
     * @return DescribeAbnormalProcessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRulesResponse DescribeAbnormalProcessRules(DescribeAbnormalProcessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalProcessRules", DescribeAbnormalProcessRulesResponse.class);
    }

    /**
     *查询运行时访问控制事件的详细信息
     * @param req DescribeAccessControlDetailRequest
     * @return DescribeAccessControlDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlDetailResponse DescribeAccessControlDetail(DescribeAccessControlDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessControlDetail", DescribeAccessControlDetailResponse.class);
    }

    /**
     *查询运行时访问控制事件列表
     * @param req DescribeAccessControlEventsRequest
     * @return DescribeAccessControlEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlEventsResponse DescribeAccessControlEvents(DescribeAccessControlEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessControlEvents", DescribeAccessControlEventsResponse.class);
    }

    /**
     *查询运行时访问控制事件列表导出
     * @param req DescribeAccessControlEventsExportRequest
     * @return DescribeAccessControlEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlEventsExportResponse DescribeAccessControlEventsExport(DescribeAccessControlEventsExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessControlEventsExport", DescribeAccessControlEventsExportResponse.class);
    }

    /**
     *查询运行时访问控制策略详细信息
     * @param req DescribeAccessControlRuleDetailRequest
     * @return DescribeAccessControlRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRuleDetailResponse DescribeAccessControlRuleDetail(DescribeAccessControlRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessControlRuleDetail", DescribeAccessControlRuleDetailResponse.class);
    }

    /**
     *查询运行访问控制策略列表信息
     * @param req DescribeAccessControlRulesRequest
     * @return DescribeAccessControlRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRulesResponse DescribeAccessControlRules(DescribeAccessControlRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessControlRules", DescribeAccessControlRulesResponse.class);
    }

    /**
     *获取受影响的集群数量，返回数量
     * @param req DescribeAffectedClusterCountRequest
     * @return DescribeAffectedClusterCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedClusterCountResponse DescribeAffectedClusterCount(DescribeAffectedClusterCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAffectedClusterCount", DescribeAffectedClusterCountResponse.class);
    }

    /**
     *查询节点类型的影响范围，返回节点列表
     * @param req DescribeAffectedNodeListRequest
     * @return DescribeAffectedNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedNodeListResponse DescribeAffectedNodeList(DescribeAffectedNodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAffectedNodeList", DescribeAffectedNodeListResponse.class);
    }

    /**
     *查询workload类型的影响范围，返回workload列表
     * @param req DescribeAffectedWorkloadListRequest
     * @return DescribeAffectedWorkloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedWorkloadListResponse DescribeAffectedWorkloadList(DescribeAffectedWorkloadListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAffectedWorkloadList", DescribeAffectedWorkloadListResponse.class);
    }

    /**
     *查询平行容器安装命令
     * @param req DescribeAgentDaemonSetCmdRequest
     * @return DescribeAgentDaemonSetCmdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDaemonSetCmdResponse DescribeAgentDaemonSetCmd(DescribeAgentDaemonSetCmdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentDaemonSetCmd", DescribeAgentDaemonSetCmdResponse.class);
    }

    /**
     *查询agent安装命令
     * @param req DescribeAgentInstallCommandRequest
     * @return DescribeAgentInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallCommandResponse DescribeAgentInstallCommand(DescribeAgentInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstallCommand", DescribeAgentInstallCommandResponse.class);
    }

    /**
     *容器安全查询app服务列表
     * @param req DescribeAssetAppServiceListRequest
     * @return DescribeAssetAppServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppServiceListResponse DescribeAssetAppServiceList(DescribeAssetAppServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppServiceList", DescribeAssetAppServiceListResponse.class);
    }

    /**
     *查询集群列表
     * @param req DescribeAssetClusterListRequest
     * @return DescribeAssetClusterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetClusterListResponse DescribeAssetClusterList(DescribeAssetClusterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetClusterList", DescribeAssetClusterListResponse.class);
    }

    /**
     *容器安全搜索查询容器组件列表
     * @param req DescribeAssetComponentListRequest
     * @return DescribeAssetComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetComponentListResponse DescribeAssetComponentList(DescribeAssetComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetComponentList", DescribeAssetComponentListResponse.class);
    }

    /**
     *查询容器详细信息
     * @param req DescribeAssetContainerDetailRequest
     * @return DescribeAssetContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetContainerDetailResponse DescribeAssetContainerDetail(DescribeAssetContainerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetContainerDetail", DescribeAssetContainerDetailResponse.class);
    }

    /**
     *搜索查询容器列表
     * @param req DescribeAssetContainerListRequest
     * @return DescribeAssetContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetContainerListResponse DescribeAssetContainerList(DescribeAssetContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetContainerList", DescribeAssetContainerListResponse.class);
    }

    /**
     *容器安全查询db服务列表
     * @param req DescribeAssetDBServiceListRequest
     * @return DescribeAssetDBServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDBServiceListResponse DescribeAssetDBServiceList(DescribeAssetDBServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDBServiceList", DescribeAssetDBServiceListResponse.class);
    }

    /**
     *查询主机详细信息
     * @param req DescribeAssetHostDetailRequest
     * @return DescribeAssetHostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostDetailResponse DescribeAssetHostDetail(DescribeAssetHostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetHostDetail", DescribeAssetHostDetailResponse.class);
    }

    /**
     *容器安全搜索查询主机列表
     * @param req DescribeAssetHostListRequest
     * @return DescribeAssetHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostListResponse DescribeAssetHostList(DescribeAssetHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetHostList", DescribeAssetHostListResponse.class);
    }

    /**
     *镜像绑定规则列表信息，包含运行时访问控制和异常进程公用
     * @param req DescribeAssetImageBindRuleInfoRequest
     * @return DescribeAssetImageBindRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageBindRuleInfoResponse DescribeAssetImageBindRuleInfo(DescribeAssetImageBindRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageBindRuleInfo", DescribeAssetImageBindRuleInfoResponse.class);
    }

    /**
     *查询镜像详细信息
     * @param req DescribeAssetImageDetailRequest
     * @return DescribeAssetImageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageDetailResponse DescribeAssetImageDetail(DescribeAssetImageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageDetail", DescribeAssetImageDetailResponse.class);
    }

    /**
     *容器安全查询镜像关联主机
     * @param req DescribeAssetImageHostListRequest
     * @return DescribeAssetImageHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageHostListResponse DescribeAssetImageHostList(DescribeAssetImageHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageHostList", DescribeAssetImageHostListResponse.class);
    }

    /**
     *容器安全搜索查询镜像列表
     * @param req DescribeAssetImageListRequest
     * @return DescribeAssetImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageListResponse DescribeAssetImageList(DescribeAssetImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageList", DescribeAssetImageListResponse.class);
    }

    /**
     *查看镜像仓库资产更新进度状态
     * @param req DescribeAssetImageRegistryAssetStatusRequest
     * @return DescribeAssetImageRegistryAssetStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryAssetStatusResponse DescribeAssetImageRegistryAssetStatus(DescribeAssetImageRegistryAssetStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryAssetStatus", DescribeAssetImageRegistryAssetStatusResponse.class);
    }

    /**
     *镜像仓库镜像仓库列表详情
     * @param req DescribeAssetImageRegistryDetailRequest
     * @return DescribeAssetImageRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryDetailResponse DescribeAssetImageRegistryDetail(DescribeAssetImageRegistryDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryDetail", DescribeAssetImageRegistryDetailResponse.class);
    }

    /**
     *镜像仓库镜像仓库列表
     * @param req DescribeAssetImageRegistryListRequest
     * @return DescribeAssetImageRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryListResponse DescribeAssetImageRegistryList(DescribeAssetImageRegistryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryList", DescribeAssetImageRegistryListResponse.class);
    }

    /**
     *镜像仓库镜像列表导出
     * @param req DescribeAssetImageRegistryListExportRequest
     * @return DescribeAssetImageRegistryListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryListExportResponse DescribeAssetImageRegistryListExport(DescribeAssetImageRegistryListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryListExport", DescribeAssetImageRegistryListExportResponse.class);
    }

    /**
     *查看单个镜像仓库详细信息
     * @param req DescribeAssetImageRegistryRegistryDetailRequest
     * @return DescribeAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRegistryDetailResponse DescribeAssetImageRegistryRegistryDetail(DescribeAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryRegistryDetail", DescribeAssetImageRegistryRegistryDetailResponse.class);
    }

    /**
     *镜像仓库仓库列表
     * @param req DescribeAssetImageRegistryRegistryListRequest
     * @return DescribeAssetImageRegistryRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRegistryListResponse DescribeAssetImageRegistryRegistryList(DescribeAssetImageRegistryRegistryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryRegistryList", DescribeAssetImageRegistryRegistryListResponse.class);
    }

    /**
     *镜像仓库查询镜像高危行为列表
     * @param req DescribeAssetImageRegistryRiskInfoListRequest
     * @return DescribeAssetImageRegistryRiskInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRiskInfoListResponse DescribeAssetImageRegistryRiskInfoList(DescribeAssetImageRegistryRiskInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryRiskInfoList", DescribeAssetImageRegistryRiskInfoListResponse.class);
    }

    /**
     *镜像仓库敏感信息列表导出
     * @param req DescribeAssetImageRegistryRiskListExportRequest
     * @return DescribeAssetImageRegistryRiskListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRiskListExportResponse DescribeAssetImageRegistryRiskListExport(DescribeAssetImageRegistryRiskListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryRiskListExport", DescribeAssetImageRegistryRiskListExportResponse.class);
    }

    /**
     *镜像仓库查询一键镜像扫描状态
     * @param req DescribeAssetImageRegistryScanStatusOneKeyRequest
     * @return DescribeAssetImageRegistryScanStatusOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryScanStatusOneKeyResponse DescribeAssetImageRegistryScanStatusOneKey(DescribeAssetImageRegistryScanStatusOneKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryScanStatusOneKey", DescribeAssetImageRegistryScanStatusOneKeyResponse.class);
    }

    /**
     *镜像仓库查询镜像统计信息
     * @param req DescribeAssetImageRegistrySummaryRequest
     * @return DescribeAssetImageRegistrySummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistrySummaryResponse DescribeAssetImageRegistrySummary(DescribeAssetImageRegistrySummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistrySummary", DescribeAssetImageRegistrySummaryResponse.class);
    }

    /**
     *镜像仓库查询木马病毒列表
     * @param req DescribeAssetImageRegistryVirusListRequest
     * @return DescribeAssetImageRegistryVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVirusListResponse DescribeAssetImageRegistryVirusList(DescribeAssetImageRegistryVirusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryVirusList", DescribeAssetImageRegistryVirusListResponse.class);
    }

    /**
     *镜像仓库木马信息列表导出
     * @param req DescribeAssetImageRegistryVirusListExportRequest
     * @return DescribeAssetImageRegistryVirusListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVirusListExportResponse DescribeAssetImageRegistryVirusListExport(DescribeAssetImageRegistryVirusListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryVirusListExport", DescribeAssetImageRegistryVirusListExportResponse.class);
    }

    /**
     *镜像仓库查询镜像漏洞列表
     * @param req DescribeAssetImageRegistryVulListRequest
     * @return DescribeAssetImageRegistryVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVulListResponse DescribeAssetImageRegistryVulList(DescribeAssetImageRegistryVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryVulList", DescribeAssetImageRegistryVulListResponse.class);
    }

    /**
     *镜像仓库漏洞列表导出
     * @param req DescribeAssetImageRegistryVulListExportRequest
     * @return DescribeAssetImageRegistryVulListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVulListExportResponse DescribeAssetImageRegistryVulListExport(DescribeAssetImageRegistryVulListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRegistryVulListExport", DescribeAssetImageRegistryVulListExportResponse.class);
    }

    /**
     *容器安全查询镜像风险列表
     * @param req DescribeAssetImageRiskListRequest
     * @return DescribeAssetImageRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRiskListResponse DescribeAssetImageRiskList(DescribeAssetImageRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRiskList", DescribeAssetImageRiskListResponse.class);
    }

    /**
     *容器安全搜索查询镜像风险列表导出
     * @param req DescribeAssetImageRiskListExportRequest
     * @return DescribeAssetImageRiskListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRiskListExportResponse DescribeAssetImageRiskListExport(DescribeAssetImageRiskListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageRiskListExport", DescribeAssetImageRiskListExportResponse.class);
    }

    /**
     *获取镜像扫描设置信息
     * @param req DescribeAssetImageScanSettingRequest
     * @return DescribeAssetImageScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanSettingResponse DescribeAssetImageScanSetting(DescribeAssetImageScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageScanSetting", DescribeAssetImageScanSettingResponse.class);
    }

    /**
     *容器安全查询镜像扫描状态
     * @param req DescribeAssetImageScanStatusRequest
     * @return DescribeAssetImageScanStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanStatusResponse DescribeAssetImageScanStatus(DescribeAssetImageScanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageScanStatus", DescribeAssetImageScanStatusResponse.class);
    }

    /**
     *查询正在一键扫描的镜像扫描taskid
     * @param req DescribeAssetImageScanTaskRequest
     * @return DescribeAssetImageScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanTaskResponse DescribeAssetImageScanTask(DescribeAssetImageScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageScanTask", DescribeAssetImageScanTaskResponse.class);
    }

    /**
     *容器安全搜索查询镜像简略信息列表
     * @param req DescribeAssetImageSimpleListRequest
     * @return DescribeAssetImageSimpleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageSimpleListResponse DescribeAssetImageSimpleList(DescribeAssetImageSimpleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageSimpleList", DescribeAssetImageSimpleListResponse.class);
    }

    /**
     *容器安全查询镜像病毒列表
     * @param req DescribeAssetImageVirusListRequest
     * @return DescribeAssetImageVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVirusListResponse DescribeAssetImageVirusList(DescribeAssetImageVirusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageVirusList", DescribeAssetImageVirusListResponse.class);
    }

    /**
     *容器安全搜索查询镜像木马列表导出
     * @param req DescribeAssetImageVirusListExportRequest
     * @return DescribeAssetImageVirusListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVirusListExportResponse DescribeAssetImageVirusListExport(DescribeAssetImageVirusListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageVirusListExport", DescribeAssetImageVirusListExportResponse.class);
    }

    /**
     *容器安全查询镜像漏洞列表
     * @param req DescribeAssetImageVulListRequest
     * @return DescribeAssetImageVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVulListResponse DescribeAssetImageVulList(DescribeAssetImageVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageVulList", DescribeAssetImageVulListResponse.class);
    }

    /**
     *容器安全搜索查询镜像漏洞列表导出
     * @param req DescribeAssetImageVulListExportRequest
     * @return DescribeAssetImageVulListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVulListExportResponse DescribeAssetImageVulListExport(DescribeAssetImageVulListExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetImageVulListExport", DescribeAssetImageVulListExportResponse.class);
    }

    /**
     *容器安全搜索查询端口占用列表
     * @param req DescribeAssetPortListRequest
     * @return DescribeAssetPortListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortListResponse DescribeAssetPortList(DescribeAssetPortListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPortList", DescribeAssetPortListResponse.class);
    }

    /**
     *容器安全搜索查询进程列表
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessList", DescribeAssetProcessListResponse.class);
    }

    /**
     *查询账户容器、镜像等统计信息
     * @param req DescribeAssetSummaryRequest
     * @return DescribeAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSummaryResponse DescribeAssetSummary(DescribeAssetSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSummary", DescribeAssetSummaryResponse.class);
    }

    /**
     *查询超级节点列表
     * @param req DescribeAssetSuperNodeListRequest
     * @return DescribeAssetSuperNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSuperNodeListResponse DescribeAssetSuperNodeList(DescribeAssetSuperNodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSuperNodeList", DescribeAssetSuperNodeListResponse.class);
    }

    /**
     *查询资产同步最近时间
     * @param req DescribeAssetSyncLastTimeRequest
     * @return DescribeAssetSyncLastTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncLastTimeResponse DescribeAssetSyncLastTime(DescribeAssetSyncLastTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSyncLastTime", DescribeAssetSyncLastTimeResponse.class);
    }

    /**
     *容器安全查询web服务列表
     * @param req DescribeAssetWebServiceListRequest
     * @return DescribeAssetWebServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceListResponse DescribeAssetWebServiceList(DescribeAssetWebServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceList", DescribeAssetWebServiceListResponse.class);
    }

    /**
     *查询自动授权规则授权范围主机信息
     * @param req DescribeAutoAuthorizedRuleHostRequest
     * @return DescribeAutoAuthorizedRuleHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoAuthorizedRuleHostResponse DescribeAutoAuthorizedRuleHost(DescribeAutoAuthorizedRuleHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoAuthorizedRuleHost", DescribeAutoAuthorizedRuleHostResponse.class);
    }

    /**
     *查询所有检查项接口，返回总数和检查项列表
     * @param req DescribeCheckItemListRequest
     * @return DescribeCheckItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckItemListResponse DescribeCheckItemList(DescribeCheckItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckItemList", DescribeCheckItemListResponse.class);
    }

    /**
     *查询单个集群的详细信息
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *查询集群节点信息
     * @param req DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodesResponse DescribeClusterNodes(DescribeClusterNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodes", DescribeClusterNodesResponse.class);
    }

    /**
     *查询用户集群资产总览
     * @param req DescribeClusterSummaryRequest
     * @return DescribeClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSummaryResponse DescribeClusterSummary(DescribeClusterSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSummary", DescribeClusterSummaryResponse.class);
    }

    /**
     *查询某个资产的详情
     * @param req DescribeComplianceAssetDetailInfoRequest
     * @return DescribeComplianceAssetDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetDetailInfoResponse DescribeComplianceAssetDetailInfo(DescribeComplianceAssetDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceAssetDetailInfo", DescribeComplianceAssetDetailInfoResponse.class);
    }

    /**
     *查询某类资产的列表
     * @param req DescribeComplianceAssetListRequest
     * @return DescribeComplianceAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetListResponse DescribeComplianceAssetList(DescribeComplianceAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceAssetList", DescribeComplianceAssetListResponse.class);
    }

    /**
     *查询某资产下的检测项列表
     * @param req DescribeComplianceAssetPolicyItemListRequest
     * @return DescribeComplianceAssetPolicyItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetPolicyItemListResponse DescribeComplianceAssetPolicyItemList(DescribeComplianceAssetPolicyItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceAssetPolicyItemList", DescribeComplianceAssetPolicyItemListResponse.class);
    }

    /**
     *查询合规检测的定时任务列表
     * @param req DescribeCompliancePeriodTaskListRequest
     * @return DescribeCompliancePeriodTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePeriodTaskListResponse DescribeCompliancePeriodTaskList(DescribeCompliancePeriodTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompliancePeriodTaskList", DescribeCompliancePeriodTaskListResponse.class);
    }

    /**
     *按照 检测项 → 资产 的两级层次展开的第二层级：资产层级。
     * @param req DescribeCompliancePolicyItemAffectedAssetListRequest
     * @return DescribeCompliancePolicyItemAffectedAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePolicyItemAffectedAssetListResponse DescribeCompliancePolicyItemAffectedAssetList(DescribeCompliancePolicyItemAffectedAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompliancePolicyItemAffectedAssetList", DescribeCompliancePolicyItemAffectedAssetListResponse.class);
    }

    /**
     *按照 检测项 → 资产 的两级层次展开的第一层级：检测项层级。
     * @param req DescribeCompliancePolicyItemAffectedSummaryRequest
     * @return DescribeCompliancePolicyItemAffectedSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePolicyItemAffectedSummaryResponse DescribeCompliancePolicyItemAffectedSummary(DescribeCompliancePolicyItemAffectedSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompliancePolicyItemAffectedSummary", DescribeCompliancePolicyItemAffectedSummaryResponse.class);
    }

    /**
     *按照 资产 → 检测项 二层结构展示的信息。这里查询第一层 资产的通过率汇总信息。
     * @param req DescribeComplianceScanFailedAssetListRequest
     * @return DescribeComplianceScanFailedAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceScanFailedAssetListResponse DescribeComplianceScanFailedAssetList(DescribeComplianceScanFailedAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceScanFailedAssetList", DescribeComplianceScanFailedAssetListResponse.class);
    }

    /**
     *查询上次任务的资产通过率汇总信息
     * @param req DescribeComplianceTaskAssetSummaryRequest
     * @return DescribeComplianceTaskAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceTaskAssetSummaryResponse DescribeComplianceTaskAssetSummary(DescribeComplianceTaskAssetSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceTaskAssetSummary", DescribeComplianceTaskAssetSummaryResponse.class);
    }

    /**
     *查询最近一次任务发现的检测项的汇总信息列表，按照 检测项 → 资产 的两级层次展开。
     * @param req DescribeComplianceTaskPolicyItemSummaryListRequest
     * @return DescribeComplianceTaskPolicyItemSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceTaskPolicyItemSummaryListResponse DescribeComplianceTaskPolicyItemSummaryList(DescribeComplianceTaskPolicyItemSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceTaskPolicyItemSummaryList", DescribeComplianceTaskPolicyItemSummaryListResponse.class);
    }

    /**
     *查询白名单列表
     * @param req DescribeComplianceWhitelistItemListRequest
     * @return DescribeComplianceWhitelistItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceWhitelistItemListResponse DescribeComplianceWhitelistItemList(DescribeComplianceWhitelistItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceWhitelistItemList", DescribeComplianceWhitelistItemListResponse.class);
    }

    /**
     *查询容器资产概览信息
     * @param req DescribeContainerAssetSummaryRequest
     * @return DescribeContainerAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerAssetSummaryResponse DescribeContainerAssetSummary(DescribeContainerAssetSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerAssetSummary", DescribeContainerAssetSummaryResponse.class);
    }

    /**
     *查询容器安全未处理事件信息
     * @param req DescribeContainerSecEventSummaryRequest
     * @return DescribeContainerSecEventSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerSecEventSummaryResponse DescribeContainerSecEventSummary(DescribeContainerSecEventSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerSecEventSummary", DescribeContainerSecEventSummaryResponse.class);
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
     *获取ES查询文档列表
     * @param req DescribeESHitsRequest
     * @return DescribeESHitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESHitsResponse DescribeESHits(DescribeESHitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeESHits", DescribeESHitsResponse.class);
    }

    /**
     *查询应急漏洞列表
     * @param req DescribeEmergencyVulListRequest
     * @return DescribeEmergencyVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyVulListResponse DescribeEmergencyVulList(DescribeEmergencyVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmergencyVulList", DescribeEmergencyVulListResponse.class);
    }

    /**
     *DescribeEscapeEventDetail  查询容器逃逸事件详情
     * @param req DescribeEscapeEventDetailRequest
     * @return DescribeEscapeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventDetailResponse DescribeEscapeEventDetail(DescribeEscapeEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeEventDetail", DescribeEscapeEventDetailResponse.class);
    }

    /**
     *DescribeEscapeEventInfo 查询容器逃逸事件列表
     * @param req DescribeEscapeEventInfoRequest
     * @return DescribeEscapeEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventInfoResponse DescribeEscapeEventInfo(DescribeEscapeEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeEventInfo", DescribeEscapeEventInfoResponse.class);
    }

    /**
     *查询待处理逃逸事件趋势
     * @param req DescribeEscapeEventTendencyRequest
     * @return DescribeEscapeEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventTendencyResponse DescribeEscapeEventTendency(DescribeEscapeEventTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeEventTendency", DescribeEscapeEventTendencyResponse.class);
    }

    /**
     *统计容器逃逸各事件类型和待处理事件数
     * @param req DescribeEscapeEventTypeSummaryRequest
     * @return DescribeEscapeEventTypeSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventTypeSummaryResponse DescribeEscapeEventTypeSummary(DescribeEscapeEventTypeSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeEventTypeSummary", DescribeEscapeEventTypeSummaryResponse.class);
    }

    /**
     *DescribeEscapeRuleInfo 查询容器逃逸扫描规则信息
     * @param req DescribeEscapeRuleInfoRequest
     * @return DescribeEscapeRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeRuleInfoResponse DescribeEscapeRuleInfo(DescribeEscapeRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeRuleInfo", DescribeEscapeRuleInfoResponse.class);
    }

    /**
     *DescribeEscapeSafeState 查询容器逃逸安全状态
     * @param req DescribeEscapeSafeStateRequest
     * @return DescribeEscapeSafeStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeSafeStateResponse DescribeEscapeSafeState(DescribeEscapeSafeStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeSafeState", DescribeEscapeSafeStateResponse.class);
    }

    /**
     *查询逃逸白名单
     * @param req DescribeEscapeWhiteListRequest
     * @return DescribeEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeWhiteListResponse DescribeEscapeWhiteList(DescribeEscapeWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEscapeWhiteList", DescribeEscapeWhiteListResponse.class);
    }

    /**
     *DescribeRiskContainerImageList查询风险容器镜像列表
     * @param req DescribeEventEscapeImageListRequest
     * @return DescribeEventEscapeImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventEscapeImageListResponse DescribeEventEscapeImageList(DescribeEventEscapeImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventEscapeImageList", DescribeEventEscapeImageListResponse.class);
    }

    /**
     *查询导出任务下载URL
     * @param req DescribeExportJobDownloadURLRequest
     * @return DescribeExportJobDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobDownloadURLResponse DescribeExportJobDownloadURL(DescribeExportJobDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobDownloadURL", DescribeExportJobDownloadURLResponse.class);
    }

    /**
     *查询导出任务管理列表
     * @param req DescribeExportJobManageListRequest
     * @return DescribeExportJobManageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobManageListResponse DescribeExportJobManageList(DescribeExportJobManageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobManageList", DescribeExportJobManageListResponse.class);
    }

    /**
     *查询导出接口进度
     * @param req DescribeExportJobResultRequest
     * @return DescribeExportJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobResultResponse DescribeExportJobResult(DescribeExportJobResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobResult", DescribeExportJobResultResponse.class);
    }

    /**
     *DescribeImageAuthorizedInfo  查询镜像授权信息
     * @param req DescribeImageAuthorizedInfoRequest
     * @return DescribeImageAuthorizedInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAuthorizedInfoResponse DescribeImageAuthorizedInfo(DescribeImageAuthorizedInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAuthorizedInfo", DescribeImageAuthorizedInfoResponse.class);
    }

    /**
     *查询镜像自动授权结果列表
     * @param req DescribeImageAutoAuthorizedLogListRequest
     * @return DescribeImageAutoAuthorizedLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAutoAuthorizedLogListResponse DescribeImageAutoAuthorizedLogList(DescribeImageAutoAuthorizedLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAutoAuthorizedLogList", DescribeImageAutoAuthorizedLogListResponse.class);
    }

    /**
     *查询本地镜像自动授权规则
     * @param req DescribeImageAutoAuthorizedRuleRequest
     * @return DescribeImageAutoAuthorizedRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAutoAuthorizedRuleResponse DescribeImageAutoAuthorizedRule(DescribeImageAutoAuthorizedRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAutoAuthorizedRule", DescribeImageAutoAuthorizedRuleResponse.class);
    }

    /**
     *查询镜像自动授权任务列表
     * @param req DescribeImageAutoAuthorizedTaskListRequest
     * @return DescribeImageAutoAuthorizedTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAutoAuthorizedTaskListResponse DescribeImageAutoAuthorizedTaskList(DescribeImageAutoAuthorizedTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAutoAuthorizedTaskList", DescribeImageAutoAuthorizedTaskListResponse.class);
    }

    /**
     *查询本地镜像组件列表
     * @param req DescribeImageComponentListRequest
     * @return DescribeImageComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageComponentListResponse DescribeImageComponentList(DescribeImageComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageComponentList", DescribeImageComponentListResponse.class);
    }

    /**
     *查询用户镜像仓库下的命令空间列表
     * @param req DescribeImageRegistryNamespaceListRequest
     * @return DescribeImageRegistryNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryNamespaceListResponse DescribeImageRegistryNamespaceList(DescribeImageRegistryNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryNamespaceList", DescribeImageRegistryNamespaceListResponse.class);
    }

    /**
     *镜像仓库查看定时任务
     * @param req DescribeImageRegistryTimingScanTaskRequest
     * @return DescribeImageRegistryTimingScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryTimingScanTaskResponse DescribeImageRegistryTimingScanTask(DescribeImageRegistryTimingScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryTimingScanTask", DescribeImageRegistryTimingScanTaskResponse.class);
    }

    /**
     *查询本地镜像风险概览
     * @param req DescribeImageRiskSummaryRequest
     * @return DescribeImageRiskSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRiskSummaryResponse DescribeImageRiskSummary(DescribeImageRiskSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRiskSummary", DescribeImageRiskSummaryResponse.class);
    }

    /**
     *查询容器安全本地镜像风险趋势
     * @param req DescribeImageRiskTendencyRequest
     * @return DescribeImageRiskTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRiskTendencyResponse DescribeImageRiskTendency(DescribeImageRiskTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRiskTendency", DescribeImageRiskTendencyResponse.class);
    }

    /**
     *DescribeImageSimpleList 查询全部镜像列表
     * @param req DescribeImageSimpleListRequest
     * @return DescribeImageSimpleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSimpleListResponse DescribeImageSimpleList(DescribeImageSimpleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSimpleList", DescribeImageSimpleListResponse.class);
    }

    /**
     *获取索引列表
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexList", DescribeIndexListResponse.class);
    }

    /**
     *查询检查报告
     * @param req DescribeInspectionReportRequest
     * @return DescribeInspectionReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInspectionReportResponse DescribeInspectionReport(DescribeInspectionReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInspectionReport", DescribeInspectionReportResponse.class);
    }

    /**
     *查询k8s api 异常事件详情
     * @param req DescribeK8sApiAbnormalEventInfoRequest
     * @return DescribeK8sApiAbnormalEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalEventInfoResponse DescribeK8sApiAbnormalEventInfo(DescribeK8sApiAbnormalEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalEventInfo", DescribeK8sApiAbnormalEventInfoResponse.class);
    }

    /**
     *查询k8s api异常事件列表
     * @param req DescribeK8sApiAbnormalEventListRequest
     * @return DescribeK8sApiAbnormalEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalEventListResponse DescribeK8sApiAbnormalEventList(DescribeK8sApiAbnormalEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalEventList", DescribeK8sApiAbnormalEventListResponse.class);
    }

    /**
     *查询k8sapi异常请求规则详情
     * @param req DescribeK8sApiAbnormalRuleInfoRequest
     * @return DescribeK8sApiAbnormalRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalRuleInfoResponse DescribeK8sApiAbnormalRuleInfo(DescribeK8sApiAbnormalRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalRuleInfo", DescribeK8sApiAbnormalRuleInfoResponse.class);
    }

    /**
     *查询k8sapi异常请求规则列表
     * @param req DescribeK8sApiAbnormalRuleListRequest
     * @return DescribeK8sApiAbnormalRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalRuleListResponse DescribeK8sApiAbnormalRuleList(DescribeK8sApiAbnormalRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalRuleList", DescribeK8sApiAbnormalRuleListResponse.class);
    }

    /**
     *查询k8sapi 异常规则中范围列表
     * @param req DescribeK8sApiAbnormalRuleScopeListRequest
     * @return DescribeK8sApiAbnormalRuleScopeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalRuleScopeListResponse DescribeK8sApiAbnormalRuleScopeList(DescribeK8sApiAbnormalRuleScopeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalRuleScopeList", DescribeK8sApiAbnormalRuleScopeListResponse.class);
    }

    /**
     *查询k8sapi异常事件统计
     * @param req DescribeK8sApiAbnormalSummaryRequest
     * @return DescribeK8sApiAbnormalSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalSummaryResponse DescribeK8sApiAbnormalSummary(DescribeK8sApiAbnormalSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalSummary", DescribeK8sApiAbnormalSummaryResponse.class);
    }

    /**
     *查询k8sapi异常事件趋势
     * @param req DescribeK8sApiAbnormalTendencyRequest
     * @return DescribeK8sApiAbnormalTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeK8sApiAbnormalTendencyResponse DescribeK8sApiAbnormalTendency(DescribeK8sApiAbnormalTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeK8sApiAbnormalTendency", DescribeK8sApiAbnormalTendencyResponse.class);
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
     *查询集群策略审计列表
     * @param req DescribeNetworkFirewallAuditRecordRequest
     * @return DescribeNetworkFirewallAuditRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallAuditRecordResponse DescribeNetworkFirewallAuditRecord(DescribeNetworkFirewallAuditRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallAuditRecord", DescribeNetworkFirewallAuditRecordResponse.class);
    }

    /**
     *查询集群策略列表
     * @param req DescribeNetworkFirewallClusterListRequest
     * @return DescribeNetworkFirewallClusterListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallClusterListResponse DescribeNetworkFirewallClusterList(DescribeNetworkFirewallClusterListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallClusterList", DescribeNetworkFirewallClusterListResponse.class);
    }

    /**
     *容器网络查询资产任务进度
     * @param req DescribeNetworkFirewallClusterRefreshStatusRequest
     * @return DescribeNetworkFirewallClusterRefreshStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallClusterRefreshStatusResponse DescribeNetworkFirewallClusterRefreshStatus(DescribeNetworkFirewallClusterRefreshStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallClusterRefreshStatus", DescribeNetworkFirewallClusterRefreshStatusResponse.class);
    }

    /**
     *查询集群网络空间标签列表
     * @param req DescribeNetworkFirewallNamespaceLabelListRequest
     * @return DescribeNetworkFirewallNamespaceLabelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallNamespaceLabelListResponse DescribeNetworkFirewallNamespaceLabelList(DescribeNetworkFirewallNamespaceLabelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallNamespaceLabelList", DescribeNetworkFirewallNamespaceLabelListResponse.class);
    }

    /**
     *查询集群网络空间列表
     * @param req DescribeNetworkFirewallNamespaceListRequest
     * @return DescribeNetworkFirewallNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallNamespaceListResponse DescribeNetworkFirewallNamespaceList(DescribeNetworkFirewallNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallNamespaceList", DescribeNetworkFirewallNamespaceListResponse.class);
    }

    /**
     *查询集群网络pod标签
     * @param req DescribeNetworkFirewallPodLabelsListRequest
     * @return DescribeNetworkFirewallPodLabelsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPodLabelsListResponse DescribeNetworkFirewallPodLabelsList(DescribeNetworkFirewallPodLabelsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallPodLabelsList", DescribeNetworkFirewallPodLabelsListResponse.class);
    }

    /**
     *容器网络集群查看策略详情
     * @param req DescribeNetworkFirewallPolicyDetailRequest
     * @return DescribeNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyDetailResponse DescribeNetworkFirewallPolicyDetail(DescribeNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallPolicyDetail", DescribeNetworkFirewallPolicyDetailResponse.class);
    }

    /**
     *容器网络查询网络策略自动发现任务进度
     * @param req DescribeNetworkFirewallPolicyDiscoverRequest
     * @return DescribeNetworkFirewallPolicyDiscoverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyDiscoverResponse DescribeNetworkFirewallPolicyDiscover(DescribeNetworkFirewallPolicyDiscoverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallPolicyDiscover", DescribeNetworkFirewallPolicyDiscoverResponse.class);
    }

    /**
     *查询集群网络策略列表
     * @param req DescribeNetworkFirewallPolicyListRequest
     * @return DescribeNetworkFirewallPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyListResponse DescribeNetworkFirewallPolicyList(DescribeNetworkFirewallPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallPolicyList", DescribeNetworkFirewallPolicyListResponse.class);
    }

    /**
     *容器网络查询网络策略策略执行状态
     * @param req DescribeNetworkFirewallPolicyStatusRequest
     * @return DescribeNetworkFirewallPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyStatusResponse DescribeNetworkFirewallPolicyStatus(DescribeNetworkFirewallPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallPolicyStatus", DescribeNetworkFirewallPolicyStatusResponse.class);
    }

    /**
     *容器网络集群查看Yaml网络策略详情
     * @param req DescribeNetworkFirewallPolicyYamlDetailRequest
     * @return DescribeNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkFirewallPolicyYamlDetailResponse DescribeNetworkFirewallPolicyYamlDetail(DescribeNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkFirewallPolicyYamlDetail", DescribeNetworkFirewallPolicyYamlDetailResponse.class);
    }

    /**
     *查询最新披露漏洞列表
     * @param req DescribeNewestVulRequest
     * @return DescribeNewestVulResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewestVulResponse DescribeNewestVul(DescribeNewestVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNewestVul", DescribeNewestVulResponse.class);
    }

    /**
     *DescribePostPayDetail  查询后付费详情
     * @param req DescribePostPayDetailRequest
     * @return DescribePostPayDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostPayDetailResponse DescribePostPayDetail(DescribePostPayDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostPayDetail", DescribePostPayDetailResponse.class);
    }

    /**
     *DescribeProVersionInfo  查询专业版需购买信息
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProVersionInfo", DescribeProVersionInfoResponse.class);
    }

    /**
     *查询促销活动
     * @param req DescribePromotionActivityRequest
     * @return DescribePromotionActivityResponse
     * @throws TencentCloudSDKException
     */
    public DescribePromotionActivityResponse DescribePromotionActivity(DescribePromotionActivityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePromotionActivity", DescribePromotionActivityResponse.class);
    }

    /**
     *获取公钥
     * @param req DescribePublicKeyRequest
     * @return DescribePublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicKeyResponse DescribePublicKey(DescribePublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicKey", DescribePublicKeyResponse.class);
    }

    /**
     *DescribePurchaseStateInfo 查询容器安全服务已购买信息
     * @param req DescribePurchaseStateInfoRequest
     * @return DescribePurchaseStateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurchaseStateInfoResponse DescribePurchaseStateInfo(DescribePurchaseStateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurchaseStateInfo", DescribePurchaseStateInfoResponse.class);
    }

    /**
     *获取漏洞防御白名单漏洞列表
     * @param req DescribeRaspRuleVulsRequest
     * @return DescribeRaspRuleVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRaspRuleVulsResponse DescribeRaspRuleVuls(DescribeRaspRuleVulsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRaspRuleVuls", DescribeRaspRuleVulsResponse.class);
    }

    /**
     *查询支持防御的漏洞列表
     * @param req DescribeRaspRulesRequest
     * @return DescribeRaspRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRaspRulesResponse DescribeRaspRules(DescribeRaspRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRaspRules", DescribeRaspRulesResponse.class);
    }

    /**
     *查询刷新任务
     * @param req DescribeRefreshTaskRequest
     * @return DescribeRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRefreshTaskResponse DescribeRefreshTask(DescribeRefreshTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRefreshTask", DescribeRefreshTaskResponse.class);
    }

    /**
     *查询运行时反弹shell事件详细信息
     * @param req DescribeReverseShellDetailRequest
     * @return DescribeReverseShellDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellDetailResponse DescribeReverseShellDetail(DescribeReverseShellDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellDetail", DescribeReverseShellDetailResponse.class);
    }

    /**
     *查询运行时反弹shell事件列表信息
     * @param req DescribeReverseShellEventsRequest
     * @return DescribeReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsResponse DescribeReverseShellEvents(DescribeReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellEvents", DescribeReverseShellEventsResponse.class);
    }

    /**
     *查询运行时反弹shell事件列表信息导出
     * @param req DescribeReverseShellEventsExportRequest
     * @return DescribeReverseShellEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsExportResponse DescribeReverseShellEventsExport(DescribeReverseShellEventsExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellEventsExport", DescribeReverseShellEventsExportResponse.class);
    }

    /**
     *查询运行时反弹shell白名单详细信息
     * @param req DescribeReverseShellWhiteListDetailRequest
     * @return DescribeReverseShellWhiteListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellWhiteListDetailResponse DescribeReverseShellWhiteListDetail(DescribeReverseShellWhiteListDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellWhiteListDetail", DescribeReverseShellWhiteListDetailResponse.class);
    }

    /**
     *查询运行时运行时反弹shell白名单列表信息
     * @param req DescribeReverseShellWhiteListsRequest
     * @return DescribeReverseShellWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellWhiteListsResponse DescribeReverseShellWhiteLists(DescribeReverseShellWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellWhiteLists", DescribeReverseShellWhiteListsResponse.class);
    }

    /**
     *查询恶意请求事件详情
     * @param req DescribeRiskDnsEventDetailRequest
     * @return DescribeRiskDnsEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventDetailResponse DescribeRiskDnsEventDetail(DescribeRiskDnsEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsEventDetail", DescribeRiskDnsEventDetailResponse.class);
    }

    /**
     *查询恶意请求事件列表
     * @param req DescribeRiskDnsListRequest
     * @return DescribeRiskDnsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsListResponse DescribeRiskDnsList(DescribeRiskDnsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsList", DescribeRiskDnsListResponse.class);
    }

    /**
     *查询最近一次任务发现的风险项的信息列表，支持根据特殊字段进行过滤
     * @param req DescribeRiskListRequest
     * @return DescribeRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskListResponse DescribeRiskList(DescribeRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskList", DescribeRiskListResponse.class);
    }

    /**
     *查询高危系统调用事件详细信息
     * @param req DescribeRiskSyscallDetailRequest
     * @return DescribeRiskSyscallDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallDetailResponse DescribeRiskSyscallDetail(DescribeRiskSyscallDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskSyscallDetail", DescribeRiskSyscallDetailResponse.class);
    }

    /**
     *查询运行时运行时高危系统调用列表信息
     * @param req DescribeRiskSyscallEventsRequest
     * @return DescribeRiskSyscallEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallEventsResponse DescribeRiskSyscallEvents(DescribeRiskSyscallEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskSyscallEvents", DescribeRiskSyscallEventsResponse.class);
    }

    /**
     *运行时高危系统调用列表导出
     * @param req DescribeRiskSyscallEventsExportRequest
     * @return DescribeRiskSyscallEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallEventsExportResponse DescribeRiskSyscallEventsExport(DescribeRiskSyscallEventsExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskSyscallEventsExport", DescribeRiskSyscallEventsExportResponse.class);
    }

    /**
     *查询运行时高危系统调用系统名称列表
     * @param req DescribeRiskSyscallNamesRequest
     * @return DescribeRiskSyscallNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallNamesResponse DescribeRiskSyscallNames(DescribeRiskSyscallNamesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskSyscallNames", DescribeRiskSyscallNamesResponse.class);
    }

    /**
     *查询运行时高危系统调用白名单详细信息
     * @param req DescribeRiskSyscallWhiteListDetailRequest
     * @return DescribeRiskSyscallWhiteListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallWhiteListDetailResponse DescribeRiskSyscallWhiteListDetail(DescribeRiskSyscallWhiteListDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskSyscallWhiteListDetail", DescribeRiskSyscallWhiteListDetailResponse.class);
    }

    /**
     *查询运行时高危系统调用白名单列表信息
     * @param req DescribeRiskSyscallWhiteListsRequest
     * @return DescribeRiskSyscallWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallWhiteListsResponse DescribeRiskSyscallWhiteLists(DescribeRiskSyscallWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskSyscallWhiteLists", DescribeRiskSyscallWhiteListsResponse.class);
    }

    /**
     *查询扫描忽略的漏洞列表
     * @param req DescribeScanIgnoreVulListRequest
     * @return DescribeScanIgnoreVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanIgnoreVulListResponse DescribeScanIgnoreVulList(DescribeScanIgnoreVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanIgnoreVulList", DescribeScanIgnoreVulListResponse.class);
    }

    /**
     *导出ES查询文档列表
     * @param req DescribeSearchExportListRequest
     * @return DescribeSearchExportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchExportListResponse DescribeSearchExportList(DescribeSearchExportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchExportList", DescribeSearchExportListResponse.class);
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
     *查询容器运行时安全事件趋势
     * @param req DescribeSecEventsTendencyRequest
     * @return DescribeSecEventsTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecEventsTendencyResponse DescribeSecEventsTendency(DescribeSecEventsTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecEventsTendency", DescribeSecEventsTendencyResponse.class);
    }

    /**
     *查询安全日志告警信息
     * @param req DescribeSecLogAlertMsgRequest
     * @return DescribeSecLogAlertMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogAlertMsgResponse DescribeSecLogAlertMsg(DescribeSecLogAlertMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogAlertMsg", DescribeSecLogAlertMsgResponse.class);
    }

    /**
     *查询安全日志清理设置详情
     * @param req DescribeSecLogCleanSettingInfoRequest
     * @return DescribeSecLogCleanSettingInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogCleanSettingInfoResponse DescribeSecLogCleanSettingInfo(DescribeSecLogCleanSettingInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogCleanSettingInfo", DescribeSecLogCleanSettingInfoResponse.class);
    }

    /**
     *查询安全日志投递cls可选项
     * @param req DescribeSecLogDeliveryClsOptionsRequest
     * @return DescribeSecLogDeliveryClsOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryClsOptionsResponse DescribeSecLogDeliveryClsOptions(DescribeSecLogDeliveryClsOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogDeliveryClsOptions", DescribeSecLogDeliveryClsOptionsResponse.class);
    }

    /**
     *查询安全日志投递Cls配置
     * @param req DescribeSecLogDeliveryClsSettingRequest
     * @return DescribeSecLogDeliveryClsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryClsSettingResponse DescribeSecLogDeliveryClsSetting(DescribeSecLogDeliveryClsSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogDeliveryClsSetting", DescribeSecLogDeliveryClsSettingResponse.class);
    }

    /**
     *查询安全日志投递kafka可选项
     * @param req DescribeSecLogDeliveryKafkaOptionsRequest
     * @return DescribeSecLogDeliveryKafkaOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryKafkaOptionsResponse DescribeSecLogDeliveryKafkaOptions(DescribeSecLogDeliveryKafkaOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogDeliveryKafkaOptions", DescribeSecLogDeliveryKafkaOptionsResponse.class);
    }

    /**
     *查询安全日志投递kafka配置
     * @param req DescribeSecLogDeliveryKafkaSettingRequest
     * @return DescribeSecLogDeliveryKafkaSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogDeliveryKafkaSettingResponse DescribeSecLogDeliveryKafkaSetting(DescribeSecLogDeliveryKafkaSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogDeliveryKafkaSetting", DescribeSecLogDeliveryKafkaSettingResponse.class);
    }

    /**
     *查询安全日志接入对象列表
     * @param req DescribeSecLogJoinObjectListRequest
     * @return DescribeSecLogJoinObjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogJoinObjectListResponse DescribeSecLogJoinObjectList(DescribeSecLogJoinObjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogJoinObjectList", DescribeSecLogJoinObjectListResponse.class);
    }

    /**
     *查询安全日志接入列表
     * @param req DescribeSecLogJoinTypeListRequest
     * @return DescribeSecLogJoinTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogJoinTypeListResponse DescribeSecLogJoinTypeList(DescribeSecLogJoinTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogJoinTypeList", DescribeSecLogJoinTypeListResponse.class);
    }

    /**
     *查询安全日志KafkaUIN
     * @param req DescribeSecLogKafkaUINRequest
     * @return DescribeSecLogKafkaUINResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogKafkaUINResponse DescribeSecLogKafkaUIN(DescribeSecLogKafkaUINRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogKafkaUIN", DescribeSecLogKafkaUINResponse.class);
    }

    /**
     *查询安全日志商品信息
     * @param req DescribeSecLogVasInfoRequest
     * @return DescribeSecLogVasInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecLogVasInfoResponse DescribeSecLogVasInfo(DescribeSecLogVasInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecLogVasInfo", DescribeSecLogVasInfoResponse.class);
    }

    /**
     *查询超级节点pod列表
     * @param req DescribeSuperNodePodListRequest
     * @return DescribeSuperNodePodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuperNodePodListResponse DescribeSuperNodePodList(DescribeSuperNodePodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSuperNodePodList", DescribeSuperNodePodListResponse.class);
    }

    /**
     *查询支持防御的漏洞列表
     * @param req DescribeSupportDefenceVulRequest
     * @return DescribeSupportDefenceVulResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportDefenceVulResponse DescribeSupportDefenceVul(DescribeSupportDefenceVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportDefenceVul", DescribeSupportDefenceVulResponse.class);
    }

    /**
     *查询系统漏洞列表
     * @param req DescribeSystemVulListRequest
     * @return DescribeSystemVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemVulListResponse DescribeSystemVulList(DescribeSystemVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemVulList", DescribeSystemVulListResponse.class);
    }

    /**
     *查询检查结果总览，返回受影响的节点数量，返回7天的数据，总共7个
     * @param req DescribeTaskResultSummaryRequest
     * @return DescribeTaskResultSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultSummaryResponse DescribeTaskResultSummary(DescribeTaskResultSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResultSummary", DescribeTaskResultSummaryResponse.class);
    }

    /**
     *查询容器安全概览信息
     * @param req DescribeTcssSummaryRequest
     * @return DescribeTcssSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTcssSummaryResponse DescribeTcssSummary(DescribeTcssSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTcssSummary", DescribeTcssSummaryResponse.class);
    }

    /**
     *查询当天未授权核数趋势
     * @param req DescribeUnauthorizedCoresTendencyRequest
     * @return DescribeUnauthorizedCoresTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnauthorizedCoresTendencyResponse DescribeUnauthorizedCoresTendency(DescribeUnauthorizedCoresTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnauthorizedCoresTendency", DescribeUnauthorizedCoresTendencyResponse.class);
    }

    /**
     *查询未完成的刷新资产任务信息
     * @param req DescribeUnfinishRefreshTaskRequest
     * @return DescribeUnfinishRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnfinishRefreshTaskResponse DescribeUnfinishRefreshTask(DescribeUnfinishRefreshTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnfinishRefreshTask", DescribeUnfinishRefreshTaskResponse.class);
    }

    /**
     *安全概览和集群安全页进入调用该接口，查询用户集群相关信息。
     * @param req DescribeUserClusterRequest
     * @return DescribeUserClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClusterResponse DescribeUserCluster(DescribeUserClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCluster", DescribeUserClusterResponse.class);
    }

    /**
     *获取用户的pod列表
     * @param req DescribeUserPodListRequest
     * @return DescribeUserPodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserPodListResponse DescribeUserPodList(DescribeUserPodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserPodList", DescribeUserPodListResponse.class);
    }

    /**
     *DescribeValueAddedSrvInfo查询增值服务需购买信息
     * @param req DescribeValueAddedSrvInfoRequest
     * @return DescribeValueAddedSrvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeValueAddedSrvInfoResponse DescribeValueAddedSrvInfo(DescribeValueAddedSrvInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeValueAddedSrvInfo", DescribeValueAddedSrvInfoResponse.class);
    }

    /**
     *查询木马自动隔离样本详情
     * @param req DescribeVirusAutoIsolateSampleDetailRequest
     * @return DescribeVirusAutoIsolateSampleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSampleDetailResponse DescribeVirusAutoIsolateSampleDetail(DescribeVirusAutoIsolateSampleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusAutoIsolateSampleDetail", DescribeVirusAutoIsolateSampleDetailResponse.class);
    }

    /**
     *查询木马自动隔离样本下载链接
     * @param req DescribeVirusAutoIsolateSampleDownloadURLRequest
     * @return DescribeVirusAutoIsolateSampleDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSampleDownloadURLResponse DescribeVirusAutoIsolateSampleDownloadURL(DescribeVirusAutoIsolateSampleDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusAutoIsolateSampleDownloadURL", DescribeVirusAutoIsolateSampleDownloadURLResponse.class);
    }

    /**
     *查询木马自动隔离样本列表
     * @param req DescribeVirusAutoIsolateSampleListRequest
     * @return DescribeVirusAutoIsolateSampleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSampleListResponse DescribeVirusAutoIsolateSampleList(DescribeVirusAutoIsolateSampleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusAutoIsolateSampleList", DescribeVirusAutoIsolateSampleListResponse.class);
    }

    /**
     *查询木马自动隔离设置
     * @param req DescribeVirusAutoIsolateSettingRequest
     * @return DescribeVirusAutoIsolateSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusAutoIsolateSettingResponse DescribeVirusAutoIsolateSetting(DescribeVirusAutoIsolateSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusAutoIsolateSetting", DescribeVirusAutoIsolateSettingResponse.class);
    }

    /**
     *运行时查询木马文件信息
     * @param req DescribeVirusDetailRequest
     * @return DescribeVirusDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusDetailResponse DescribeVirusDetail(DescribeVirusDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusDetail", DescribeVirusDetailResponse.class);
    }

    /**
     *查询木马事件趋势
     * @param req DescribeVirusEventTendencyRequest
     * @return DescribeVirusEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusEventTendencyResponse DescribeVirusEventTendency(DescribeVirusEventTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusEventTendency", DescribeVirusEventTendencyResponse.class);
    }

    /**
     *查询运行时文件查杀事件列表
     * @param req DescribeVirusListRequest
     * @return DescribeVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusListResponse DescribeVirusList(DescribeVirusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusList", DescribeVirusListResponse.class);
    }

    /**
     *查询木马一键检测预估超时时间
     * @param req DescribeVirusManualScanEstimateTimeoutRequest
     * @return DescribeVirusManualScanEstimateTimeoutResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusManualScanEstimateTimeoutResponse DescribeVirusManualScanEstimateTimeout(DescribeVirusManualScanEstimateTimeoutRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusManualScanEstimateTimeout", DescribeVirusManualScanEstimateTimeoutResponse.class);
    }

    /**
     *运行时查询文件查杀实时监控设置
     * @param req DescribeVirusMonitorSettingRequest
     * @return DescribeVirusMonitorSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusMonitorSettingResponse DescribeVirusMonitorSetting(DescribeVirusMonitorSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusMonitorSetting", DescribeVirusMonitorSettingResponse.class);
    }

    /**
     *查询木马样本下载url
     * @param req DescribeVirusSampleDownloadUrlRequest
     * @return DescribeVirusSampleDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusSampleDownloadUrlResponse DescribeVirusSampleDownloadUrl(DescribeVirusSampleDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusSampleDownloadUrl", DescribeVirusSampleDownloadUrlResponse.class);
    }

    /**
     *运行时查询文件查杀设置
     * @param req DescribeVirusScanSettingRequest
     * @return DescribeVirusScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanSettingResponse DescribeVirusScanSetting(DescribeVirusScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusScanSetting", DescribeVirusScanSettingResponse.class);
    }

    /**
     *运行时查询文件查杀任务状态
     * @param req DescribeVirusScanTaskStatusRequest
     * @return DescribeVirusScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanTaskStatusResponse DescribeVirusScanTaskStatus(DescribeVirusScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusScanTaskStatus", DescribeVirusScanTaskStatusResponse.class);
    }

    /**
     *运行时文件扫描超时设置查询
     * @param req DescribeVirusScanTimeoutSettingRequest
     * @return DescribeVirusScanTimeoutSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanTimeoutSettingResponse DescribeVirusScanTimeoutSetting(DescribeVirusScanTimeoutSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusScanTimeoutSetting", DescribeVirusScanTimeoutSettingResponse.class);
    }

    /**
     *运行时查询木马概览信息
     * @param req DescribeVirusSummaryRequest
     * @return DescribeVirusSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusSummaryResponse DescribeVirusSummary(DescribeVirusSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusSummary", DescribeVirusSummaryResponse.class);
    }

    /**
     *运行时查询文件查杀任务列表
     * @param req DescribeVirusTaskListRequest
     * @return DescribeVirusTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusTaskListResponse DescribeVirusTaskList(DescribeVirusTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVirusTaskList", DescribeVirusTaskListResponse.class);
    }

    /**
     *查询受漏洞的容器列表
     * @param req DescribeVulContainerListRequest
     * @return DescribeVulContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulContainerListResponse DescribeVulContainerList(DescribeVulContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulContainerList", DescribeVulContainerListResponse.class);
    }

    /**
     *查询漏洞防御事件列表
     * @param req DescribeVulDefenceEventRequest
     * @return DescribeVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventResponse DescribeVulDefenceEvent(DescribeVulDefenceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceEvent", DescribeVulDefenceEventResponse.class);
    }

    /**
     *查询漏洞防御事件详情
     * @param req DescribeVulDefenceEventDetailRequest
     * @return DescribeVulDefenceEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventDetailResponse DescribeVulDefenceEventDetail(DescribeVulDefenceEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceEventDetail", DescribeVulDefenceEventDetailResponse.class);
    }

    /**
     *查询漏洞防御攻击事件趋势
     * @param req DescribeVulDefenceEventTendencyRequest
     * @return DescribeVulDefenceEventTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventTendencyResponse DescribeVulDefenceEventTendency(DescribeVulDefenceEventTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceEventTendency", DescribeVulDefenceEventTendencyResponse.class);
    }

    /**
     *查询漏洞防御的主机列表
     * @param req DescribeVulDefenceHostRequest
     * @return DescribeVulDefenceHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceHostResponse DescribeVulDefenceHost(DescribeVulDefenceHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceHost", DescribeVulDefenceHostResponse.class);
    }

    /**
     *查询漏洞防御插件列表
     * @param req DescribeVulDefencePluginRequest
     * @return DescribeVulDefencePluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginResponse DescribeVulDefencePlugin(DescribeVulDefencePluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePlugin", DescribeVulDefencePluginResponse.class);
    }

    /**
     *查询漏洞防御设置信息
     * @param req DescribeVulDefenceSettingRequest
     * @return DescribeVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceSettingResponse DescribeVulDefenceSetting(DescribeVulDefenceSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceSetting", DescribeVulDefenceSettingResponse.class);
    }

    /**
     *查询漏洞详情
     * @param req DescribeVulDetailRequest
     * @return DescribeVulDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDetailResponse DescribeVulDetail(DescribeVulDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDetail", DescribeVulDetailResponse.class);
    }

    /**
     *查询漏洞扫描忽略的本地镜像列表
     * @param req DescribeVulIgnoreLocalImageListRequest
     * @return DescribeVulIgnoreLocalImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulIgnoreLocalImageListResponse DescribeVulIgnoreLocalImageList(DescribeVulIgnoreLocalImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulIgnoreLocalImageList", DescribeVulIgnoreLocalImageListResponse.class);
    }

    /**
     *查询漏洞扫描忽略的仓库镜像列表
     * @param req DescribeVulIgnoreRegistryImageListRequest
     * @return DescribeVulIgnoreRegistryImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulIgnoreRegistryImageListResponse DescribeVulIgnoreRegistryImageList(DescribeVulIgnoreRegistryImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulIgnoreRegistryImageList", DescribeVulIgnoreRegistryImageListResponse.class);
    }

    /**
     *查询漏洞影响的镜像列表
     * @param req DescribeVulImageListRequest
     * @return DescribeVulImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulImageListResponse DescribeVulImageList(DescribeVulImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulImageList", DescribeVulImageListResponse.class);
    }

    /**
     *查询漏洞镜像统计
     * @param req DescribeVulImageSummaryRequest
     * @return DescribeVulImageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulImageSummaryResponse DescribeVulImageSummary(DescribeVulImageSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulImageSummary", DescribeVulImageSummaryResponse.class);
    }

    /**
     *查询应急漏洞各威胁等级统计镜像数
     * @param req DescribeVulLevelImageSummaryRequest
     * @return DescribeVulLevelImageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelImageSummaryResponse DescribeVulLevelImageSummary(DescribeVulLevelImageSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLevelImageSummary", DescribeVulLevelImageSummaryResponse.class);
    }

    /**
     *查询漏洞各威胁等级统计数
     * @param req DescribeVulLevelSummaryRequest
     * @return DescribeVulLevelSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelSummaryResponse DescribeVulLevelSummary(DescribeVulLevelSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLevelSummary", DescribeVulLevelSummaryResponse.class);
    }

    /**
     *查询漏洞影响的仓库镜像列表
     * @param req DescribeVulRegistryImageListRequest
     * @return DescribeVulRegistryImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRegistryImageListResponse DescribeVulRegistryImageList(DescribeVulRegistryImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRegistryImageList", DescribeVulRegistryImageListResponse.class);
    }

    /**
     *统计漏洞扫描页已授权和未扫描镜像数
     * @param req DescribeVulScanAuthorizedImageSummaryRequest
     * @return DescribeVulScanAuthorizedImageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanAuthorizedImageSummaryResponse DescribeVulScanAuthorizedImageSummary(DescribeVulScanAuthorizedImageSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanAuthorizedImageSummary", DescribeVulScanAuthorizedImageSummaryResponse.class);
    }

    /**
     *查询漏洞扫描任务信息
     * @param req DescribeVulScanInfoRequest
     * @return DescribeVulScanInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanInfoResponse DescribeVulScanInfo(DescribeVulScanInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanInfo", DescribeVulScanInfoResponse.class);
    }

    /**
     *查询漏洞扫描任务的本地镜像列表
     * @param req DescribeVulScanLocalImageListRequest
     * @return DescribeVulScanLocalImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanLocalImageListResponse DescribeVulScanLocalImageList(DescribeVulScanLocalImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanLocalImageList", DescribeVulScanLocalImageListResponse.class);
    }

    /**
     *查询漏洞风险统计概览
     * @param req DescribeVulSummaryRequest
     * @return DescribeVulSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulSummaryResponse DescribeVulSummary(DescribeVulSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulSummary", DescribeVulSummaryResponse.class);
    }

    /**
     *查询本地镜像、仓库镜像中严重&高危的漏洞趋势
     * @param req DescribeVulTendencyRequest
     * @return DescribeVulTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTendencyResponse DescribeVulTendency(DescribeVulTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulTendency", DescribeVulTendencyResponse.class);
    }

    /**
     *查询漏洞Top排名列表
     * @param req DescribeVulTopRankingRequest
     * @return DescribeVulTopRankingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTopRankingResponse DescribeVulTopRanking(DescribeVulTopRankingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulTopRanking", DescribeVulTopRankingResponse.class);
    }

    /**
     *获取告警策略列表
     * @param req DescribeWarningRulesRequest
     * @return DescribeWarningRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningRulesResponse DescribeWarningRules(DescribeWarningRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWarningRules", DescribeWarningRulesResponse.class);
    }

    /**
     *查询web应用漏洞列表
     * @param req DescribeWebVulListRequest
     * @return DescribeWebVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebVulListResponse DescribeWebVulList(DescribeWebVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebVulList", DescribeWebVulListResponse.class);
    }

    /**
     *运行时文件查杀事件列表导出
     * @param req ExportVirusListRequest
     * @return ExportVirusListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVirusListResponse ExportVirusList(ExportVirusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVirusList", ExportVirusListResponse.class);
    }

    /**
     *为客户初始化合规基线的使用环境，创建必要的数据和选项。
     * @param req InitializeUserComplianceEnvironmentRequest
     * @return InitializeUserComplianceEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public InitializeUserComplianceEnvironmentResponse InitializeUserComplianceEnvironment(InitializeUserComplianceEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InitializeUserComplianceEnvironment", InitializeUserComplianceEnvironmentResponse.class);
    }

    /**
     *修改运行时异常进程策略的开启关闭状态
     * @param req ModifyAbnormalProcessRuleStatusRequest
     * @return ModifyAbnormalProcessRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAbnormalProcessRuleStatusResponse ModifyAbnormalProcessRuleStatus(ModifyAbnormalProcessRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAbnormalProcessRuleStatus", ModifyAbnormalProcessRuleStatusResponse.class);
    }

    /**
     *修改异常进程事件的状态信息
     * @param req ModifyAbnormalProcessStatusRequest
     * @return ModifyAbnormalProcessStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAbnormalProcessStatusResponse ModifyAbnormalProcessStatus(ModifyAbnormalProcessStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAbnormalProcessStatus", ModifyAbnormalProcessStatusResponse.class);
    }

    /**
     *修改运行时访问控制策略的状态，启用或者禁用
     * @param req ModifyAccessControlRuleStatusRequest
     * @return ModifyAccessControlRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessControlRuleStatusResponse ModifyAccessControlRuleStatus(ModifyAccessControlRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessControlRuleStatus", ModifyAccessControlRuleStatusResponse.class);
    }

    /**
     *修改运行时访问控制事件状态信息
     * @param req ModifyAccessControlStatusRequest
     * @return ModifyAccessControlStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessControlStatusResponse ModifyAccessControlStatus(ModifyAccessControlStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessControlStatus", ModifyAccessControlStatusResponse.class);
    }

    /**
     *容器安全主机资产刷新
     * @param req ModifyAssetRequest
     * @return ModifyAssetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetResponse ModifyAsset(ModifyAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAsset", ModifyAssetResponse.class);
    }

    /**
     *镜像仓库停止镜像扫描任务
     * @param req ModifyAssetImageRegistryScanStopRequest
     * @return ModifyAssetImageRegistryScanStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageRegistryScanStopResponse ModifyAssetImageRegistryScanStop(ModifyAssetImageRegistryScanStopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetImageRegistryScanStop", ModifyAssetImageRegistryScanStopResponse.class);
    }

    /**
     *镜像仓库停止镜像一键扫描任务
     * @param req ModifyAssetImageRegistryScanStopOneKeyRequest
     * @return ModifyAssetImageRegistryScanStopOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageRegistryScanStopOneKeyResponse ModifyAssetImageRegistryScanStopOneKey(ModifyAssetImageRegistryScanStopOneKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetImageRegistryScanStopOneKey", ModifyAssetImageRegistryScanStopOneKeyResponse.class);
    }

    /**
     *容器安全停止镜像扫描
     * @param req ModifyAssetImageScanStopRequest
     * @return ModifyAssetImageScanStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageScanStopResponse ModifyAssetImageScanStop(ModifyAssetImageScanStopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetImageScanStop", ModifyAssetImageScanStopResponse.class);
    }

    /**
     *修改定时任务的设置，包括检测周期、开启/禁用合规基准。
     * @param req ModifyCompliancePeriodTaskRequest
     * @return ModifyCompliancePeriodTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompliancePeriodTaskResponse ModifyCompliancePeriodTask(ModifyCompliancePeriodTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCompliancePeriodTask", ModifyCompliancePeriodTaskResponse.class);
    }

    /**
     *隔离容器网络状态
     * @param req ModifyContainerNetStatusRequest
     * @return ModifyContainerNetStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContainerNetStatusResponse ModifyContainerNetStatus(ModifyContainerNetStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContainerNetStatus", ModifyContainerNetStatusResponse.class);
    }

    /**
     *ModifyEscapeEventStatus  修改容器逃逸扫描事件状态
     * @param req ModifyEscapeEventStatusRequest
     * @return ModifyEscapeEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeEventStatusResponse ModifyEscapeEventStatus(ModifyEscapeEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEscapeEventStatus", ModifyEscapeEventStatusResponse.class);
    }

    /**
     *ModifyEscapeRule  修改容器逃逸扫描规则信息
     * @param req ModifyEscapeRuleRequest
     * @return ModifyEscapeRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeRuleResponse ModifyEscapeRule(ModifyEscapeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEscapeRule", ModifyEscapeRuleResponse.class);
    }

    /**
     *修改逃逸白名单
     * @param req ModifyEscapeWhiteListRequest
     * @return ModifyEscapeWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeWhiteListResponse ModifyEscapeWhiteList(ModifyEscapeWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEscapeWhiteList", ModifyEscapeWhiteListResponse.class);
    }

    /**
     *批量授权镜像扫描V2.0
     * @param req ModifyImageAuthorizedRequest
     * @return ModifyImageAuthorizedResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAuthorizedResponse ModifyImageAuthorized(ModifyImageAuthorizedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageAuthorized", ModifyImageAuthorizedResponse.class);
    }

    /**
     *修改k8sapi异常事件状态
     * @param req ModifyK8sApiAbnormalEventStatusRequest
     * @return ModifyK8sApiAbnormalEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyK8sApiAbnormalEventStatusResponse ModifyK8sApiAbnormalEventStatus(ModifyK8sApiAbnormalEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyK8sApiAbnormalEventStatus", ModifyK8sApiAbnormalEventStatusResponse.class);
    }

    /**
     *修改k8sapi异常规则信息
     * @param req ModifyK8sApiAbnormalRuleInfoRequest
     * @return ModifyK8sApiAbnormalRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyK8sApiAbnormalRuleInfoResponse ModifyK8sApiAbnormalRuleInfo(ModifyK8sApiAbnormalRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyK8sApiAbnormalRuleInfo", ModifyK8sApiAbnormalRuleInfoResponse.class);
    }

    /**
     *修改k8sapi异常事件规则状态
     * @param req ModifyK8sApiAbnormalRuleStatusRequest
     * @return ModifyK8sApiAbnormalRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyK8sApiAbnormalRuleStatusResponse ModifyK8sApiAbnormalRuleStatus(ModifyK8sApiAbnormalRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyK8sApiAbnormalRuleStatus", ModifyK8sApiAbnormalRuleStatusResponse.class);
    }

    /**
     *编辑或者创建java内存马白名单
     * @param req ModifyRaspRulesRequest
     * @return ModifyRaspRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRaspRulesResponse ModifyRaspRules(ModifyRaspRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRaspRules", ModifyRaspRulesResponse.class);
    }

    /**
     *修改反弹shell事件的状态信息
     * @param req ModifyReverseShellStatusRequest
     * @return ModifyReverseShellStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReverseShellStatusResponse ModifyReverseShellStatus(ModifyReverseShellStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReverseShellStatus", ModifyReverseShellStatusResponse.class);
    }

    /**
     *编辑恶意请求事件状态
     * @param req ModifyRiskDnsEventStatusRequest
     * @return ModifyRiskDnsEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsEventStatusResponse ModifyRiskDnsEventStatus(ModifyRiskDnsEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskDnsEventStatus", ModifyRiskDnsEventStatusResponse.class);
    }

    /**
     *修改高危系统调用事件的状态信息
     * @param req ModifyRiskSyscallStatusRequest
     * @return ModifyRiskSyscallStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskSyscallStatusResponse ModifyRiskSyscallStatus(ModifyRiskSyscallStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskSyscallStatus", ModifyRiskSyscallStatusResponse.class);
    }

    /**
     *修改安全日志清理设置信息
     * @param req ModifySecLogCleanSettingInfoRequest
     * @return ModifySecLogCleanSettingInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogCleanSettingInfoResponse ModifySecLogCleanSettingInfo(ModifySecLogCleanSettingInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecLogCleanSettingInfo", ModifySecLogCleanSettingInfoResponse.class);
    }

    /**
     *更新安全日志-日志投递cls配置
     * @param req ModifySecLogDeliveryClsSettingRequest
     * @return ModifySecLogDeliveryClsSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogDeliveryClsSettingResponse ModifySecLogDeliveryClsSetting(ModifySecLogDeliveryClsSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecLogDeliveryClsSetting", ModifySecLogDeliveryClsSettingResponse.class);
    }

    /**
     *更新安全日志投递kafka设置
     * @param req ModifySecLogDeliveryKafkaSettingRequest
     * @return ModifySecLogDeliveryKafkaSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogDeliveryKafkaSettingResponse ModifySecLogDeliveryKafkaSetting(ModifySecLogDeliveryKafkaSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecLogDeliveryKafkaSetting", ModifySecLogDeliveryKafkaSettingResponse.class);
    }

    /**
     *修改安全日志接入对象
     * @param req ModifySecLogJoinObjectsRequest
     * @return ModifySecLogJoinObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogJoinObjectsResponse ModifySecLogJoinObjects(ModifySecLogJoinObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecLogJoinObjects", ModifySecLogJoinObjectsResponse.class);
    }

    /**
     *修改安全日志接入状态
     * @param req ModifySecLogJoinStateRequest
     * @return ModifySecLogJoinStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogJoinStateResponse ModifySecLogJoinState(ModifySecLogJoinStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecLogJoinState", ModifySecLogJoinStateResponse.class);
    }

    /**
     *修改安全日志kafkaUIN
     * @param req ModifySecLogKafkaUINRequest
     * @return ModifySecLogKafkaUINResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecLogKafkaUINResponse ModifySecLogKafkaUIN(ModifySecLogKafkaUINRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecLogKafkaUIN", ModifySecLogKafkaUINResponse.class);
    }

    /**
     *修改木马自动隔离样本开关
     * @param req ModifyVirusAutoIsolateExampleSwitchRequest
     * @return ModifyVirusAutoIsolateExampleSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusAutoIsolateExampleSwitchResponse ModifyVirusAutoIsolateExampleSwitch(ModifyVirusAutoIsolateExampleSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVirusAutoIsolateExampleSwitch", ModifyVirusAutoIsolateExampleSwitchResponse.class);
    }

    /**
     *修改木马自动隔离设置
     * @param req ModifyVirusAutoIsolateSettingRequest
     * @return ModifyVirusAutoIsolateSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusAutoIsolateSettingResponse ModifyVirusAutoIsolateSetting(ModifyVirusAutoIsolateSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVirusAutoIsolateSetting", ModifyVirusAutoIsolateSettingResponse.class);
    }

    /**
     *运行时更新木马文件事件状态
     * @param req ModifyVirusFileStatusRequest
     * @return ModifyVirusFileStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusFileStatusResponse ModifyVirusFileStatus(ModifyVirusFileStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVirusFileStatus", ModifyVirusFileStatusResponse.class);
    }

    /**
     *运行时更新文件查杀实时监控设置
     * @param req ModifyVirusMonitorSettingRequest
     * @return ModifyVirusMonitorSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusMonitorSettingResponse ModifyVirusMonitorSetting(ModifyVirusMonitorSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVirusMonitorSetting", ModifyVirusMonitorSettingResponse.class);
    }

    /**
     *运行时更新文件查杀设置
     * @param req ModifyVirusScanSettingRequest
     * @return ModifyVirusScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusScanSettingResponse ModifyVirusScanSetting(ModifyVirusScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVirusScanSetting", ModifyVirusScanSettingResponse.class);
    }

    /**
     *运行时文件扫描超时设置
     * @param req ModifyVirusScanTimeoutSettingRequest
     * @return ModifyVirusScanTimeoutSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusScanTimeoutSettingResponse ModifyVirusScanTimeoutSetting(ModifyVirusScanTimeoutSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVirusScanTimeoutSetting", ModifyVirusScanTimeoutSettingResponse.class);
    }

    /**
     *修改漏洞防御事件状态
     * @param req ModifyVulDefenceEventStatusRequest
     * @return ModifyVulDefenceEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceEventStatusResponse ModifyVulDefenceEventStatus(ModifyVulDefenceEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulDefenceEventStatus", ModifyVulDefenceEventStatusResponse.class);
    }

    /**
     *编辑漏洞防御设置
     * @param req ModifyVulDefenceSettingRequest
     * @return ModifyVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceSettingResponse ModifyVulDefenceSetting(ModifyVulDefenceSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulDefenceSetting", ModifyVulDefenceSettingResponse.class);
    }

    /**
     *开通容器安全服务试用
     * @param req OpenTcssTrialRequest
     * @return OpenTcssTrialResponse
     * @throws TencentCloudSDKException
     */
    public OpenTcssTrialResponse OpenTcssTrial(OpenTcssTrialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenTcssTrial", OpenTcssTrialResponse.class);
    }

    /**
     *删除单个镜像仓库详细信息
     * @param req RemoveAssetImageRegistryRegistryDetailRequest
     * @return RemoveAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAssetImageRegistryRegistryDetailResponse RemoveAssetImageRegistryRegistryDetail(RemoveAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveAssetImageRegistryRegistryDetail", RemoveAssetImageRegistryRegistryDetailResponse.class);
    }

    /**
     *RenewImageAuthorizeState   授权镜像扫描
     * @param req RenewImageAuthorizeStateRequest
     * @return RenewImageAuthorizeStateResponse
     * @throws TencentCloudSDKException
     */
    public RenewImageAuthorizeStateResponse RenewImageAuthorizeState(RenewImageAuthorizeStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewImageAuthorizeState", RenewImageAuthorizeStateResponse.class);
    }

    /**
     *重置安全日志主题设置
     * @param req ResetSecLogTopicConfigRequest
     * @return ResetSecLogTopicConfigResponse
     * @throws TencentCloudSDKException
     */
    public ResetSecLogTopicConfigResponse ResetSecLogTopicConfig(ResetSecLogTopicConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetSecLogTopicConfig", ResetSecLogTopicConfigResponse.class);
    }

    /**
     *重新检测选定的资产
     * @param req ScanComplianceAssetsRequest
     * @return ScanComplianceAssetsResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceAssetsResponse ScanComplianceAssets(ScanComplianceAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanComplianceAssets", ScanComplianceAssetsResponse.class);
    }

    /**
     *用指定的检测项重新检测选定的资产，返回创建的合规检查任务的ID。
     * @param req ScanComplianceAssetsByPolicyItemRequest
     * @return ScanComplianceAssetsByPolicyItemResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceAssetsByPolicyItemResponse ScanComplianceAssetsByPolicyItem(ScanComplianceAssetsByPolicyItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanComplianceAssetsByPolicyItem", ScanComplianceAssetsByPolicyItemResponse.class);
    }

    /**
     *重新检测选的检测项下的所有资产，返回创建的合规检查任务的ID。
     * @param req ScanCompliancePolicyItemsRequest
     * @return ScanCompliancePolicyItemsResponse
     * @throws TencentCloudSDKException
     */
    public ScanCompliancePolicyItemsResponse ScanCompliancePolicyItems(ScanCompliancePolicyItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanCompliancePolicyItems", ScanCompliancePolicyItemsResponse.class);
    }

    /**
     *重新检测选定的检测失败的资产下的所有失败的检测项，返回创建的合规检查任务的ID。
     * @param req ScanComplianceScanFailedAssetsRequest
     * @return ScanComplianceScanFailedAssetsResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceScanFailedAssetsResponse ScanComplianceScanFailedAssets(ScanComplianceScanFailedAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanComplianceScanFailedAssets", ScanComplianceScanFailedAssetsResponse.class);
    }

    /**
     *设置检测模式和自动检查
     * @param req SetCheckModeRequest
     * @return SetCheckModeResponse
     * @throws TencentCloudSDKException
     */
    public SetCheckModeResponse SetCheckMode(SetCheckModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCheckMode", SetCheckModeResponse.class);
    }

    /**
     *运行时停止木马查杀任务
     * @param req StopVirusScanTaskRequest
     * @return StopVirusScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVirusScanTaskResponse StopVirusScanTask(StopVirusScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopVirusScanTask", StopVirusScanTaskResponse.class);
    }

    /**
     *停止漏洞扫描任务
     * @param req StopVulScanTaskRequest
     * @return StopVulScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVulScanTaskResponse StopVulScanTask(StopVulScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopVulScanTask", StopVulScanTaskResponse.class);
    }

    /**
     *编辑本地镜像自动授权开关
     * @param req SwitchImageAutoAuthorizedRuleRequest
     * @return SwitchImageAutoAuthorizedRuleResponse
     * @throws TencentCloudSDKException
     */
    public SwitchImageAutoAuthorizedRuleResponse SwitchImageAutoAuthorizedRule(SwitchImageAutoAuthorizedRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchImageAutoAuthorizedRule", SwitchImageAutoAuthorizedRuleResponse.class);
    }

    /**
     *镜像仓库资产刷新
     * @param req SyncAssetImageRegistryAssetRequest
     * @return SyncAssetImageRegistryAssetResponse
     * @throws TencentCloudSDKException
     */
    public SyncAssetImageRegistryAssetResponse SyncAssetImageRegistryAsset(SyncAssetImageRegistryAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncAssetImageRegistryAsset", SyncAssetImageRegistryAssetResponse.class);
    }

    /**
     *容器网络创建网络策略更新并发布任务
     * @param req UpdateAndPublishNetworkFirewallPolicyDetailRequest
     * @return UpdateAndPublishNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAndPublishNetworkFirewallPolicyDetailResponse UpdateAndPublishNetworkFirewallPolicyDetail(UpdateAndPublishNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAndPublishNetworkFirewallPolicyDetail", UpdateAndPublishNetworkFirewallPolicyDetailResponse.class);
    }

    /**
     *容器网络更新Yaml网络策略并发布任务
     * @param req UpdateAndPublishNetworkFirewallPolicyYamlDetailRequest
     * @return UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse UpdateAndPublishNetworkFirewallPolicyYamlDetail(UpdateAndPublishNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAndPublishNetworkFirewallPolicyYamlDetail", UpdateAndPublishNetworkFirewallPolicyYamlDetailResponse.class);
    }

    /**
     *更新单个镜像仓库详细信息
     * @param req UpdateAssetImageRegistryRegistryDetailRequest
     * @return UpdateAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssetImageRegistryRegistryDetailResponse UpdateAssetImageRegistryRegistryDetail(UpdateAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAssetImageRegistryRegistryDetail", UpdateAssetImageRegistryRegistryDetailResponse.class);
    }

    /**
     *镜像仓库更新定时任务
     * @param req UpdateImageRegistryTimingScanTaskRequest
     * @return UpdateImageRegistryTimingScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageRegistryTimingScanTaskResponse UpdateImageRegistryTimingScanTask(UpdateImageRegistryTimingScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateImageRegistryTimingScanTask", UpdateImageRegistryTimingScanTaskResponse.class);
    }

    /**
     *容器网络创建网络策略更新任务
     * @param req UpdateNetworkFirewallPolicyDetailRequest
     * @return UpdateNetworkFirewallPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNetworkFirewallPolicyDetailResponse UpdateNetworkFirewallPolicyDetail(UpdateNetworkFirewallPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNetworkFirewallPolicyDetail", UpdateNetworkFirewallPolicyDetailResponse.class);
    }

    /**
     *容器网络更新Yaml网络策略任务
     * @param req UpdateNetworkFirewallPolicyYamlDetailRequest
     * @return UpdateNetworkFirewallPolicyYamlDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNetworkFirewallPolicyYamlDetailResponse UpdateNetworkFirewallPolicyYamlDetail(UpdateNetworkFirewallPolicyYamlDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNetworkFirewallPolicyYamlDetail", UpdateNetworkFirewallPolicyYamlDetailResponse.class);
    }

}
