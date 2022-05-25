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
     *新增单个镜像仓库详细信息
     * @param req AddAssetImageRegistryRegistryDetailRequest
     * @return AddAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public AddAssetImageRegistryRegistryDetailResponse AddAssetImageRegistryRegistryDetail(AddAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddAssetImageRegistryRegistryDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAssetImageRegistryRegistryDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将指定的检测项添加到白名单中，不显示未通过结果。
     * @param req AddCompliancePolicyItemToWhitelistRequest
     * @return AddCompliancePolicyItemToWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePolicyItemToWhitelistResponse AddCompliancePolicyItemToWhitelist(AddCompliancePolicyItemToWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCompliancePolicyItemToWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCompliancePolicyItemToWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCompliancePolicyItemToWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加编辑运行时异常进程策略
     * @param req AddEditAbnormalProcessRuleRequest
     * @return AddEditAbnormalProcessRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditAbnormalProcessRuleResponse AddEditAbnormalProcessRule(AddEditAbnormalProcessRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditAbnormalProcessRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEditAbnormalProcessRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEditAbnormalProcessRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加编辑运行时访问控制策略
     * @param req AddEditAccessControlRuleRequest
     * @return AddEditAccessControlRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddEditAccessControlRuleResponse AddEditAccessControlRule(AddEditAccessControlRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditAccessControlRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEditAccessControlRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEditAccessControlRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加编辑运行时反弹shell白名单
     * @param req AddEditReverseShellWhiteListRequest
     * @return AddEditReverseShellWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEditReverseShellWhiteListResponse AddEditReverseShellWhiteList(AddEditReverseShellWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditReverseShellWhiteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEditReverseShellWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEditReverseShellWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加编辑运行时高危系统调用白名单
     * @param req AddEditRiskSyscallWhiteListRequest
     * @return AddEditRiskSyscallWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public AddEditRiskSyscallWhiteListResponse AddEditRiskSyscallWhiteList(AddEditRiskSyscallWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditRiskSyscallWhiteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEditRiskSyscallWhiteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEditRiskSyscallWhiteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加编辑告警策略
     * @param req AddEditWarningRulesRequest
     * @return AddEditWarningRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddEditWarningRulesResponse AddEditWarningRules(AddEditWarningRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEditWarningRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEditWarningRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEditWarningRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查单个镜像仓库名是否重复
     * @param req CheckRepeatAssetImageRegistryRequest
     * @return CheckRepeatAssetImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public CheckRepeatAssetImageRegistryResponse CheckRepeatAssetImageRegistry(CheckRepeatAssetImageRegistryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckRepeatAssetImageRegistryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckRepeatAssetImageRegistryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckRepeatAssetImageRegistry");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库创建镜像扫描任务
     * @param req CreateAssetImageRegistryScanTaskRequest
     * @return CreateAssetImageRegistryScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageRegistryScanTaskResponse CreateAssetImageRegistryScanTask(CreateAssetImageRegistryScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageRegistryScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetImageRegistryScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetImageRegistryScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库创建镜像一键扫描任务
     * @param req CreateAssetImageRegistryScanTaskOneKeyRequest
     * @return CreateAssetImageRegistryScanTaskOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageRegistryScanTaskOneKeyResponse CreateAssetImageRegistryScanTaskOneKey(CreateAssetImageRegistryScanTaskOneKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageRegistryScanTaskOneKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetImageRegistryScanTaskOneKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetImageRegistryScanTaskOneKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加容器安全镜像扫描设置
     * @param req CreateAssetImageScanSettingRequest
     * @return CreateAssetImageScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageScanSettingResponse CreateAssetImageScanSetting(CreateAssetImageScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageScanSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetImageScanSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetImageScanSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全创建镜像扫描任务
     * @param req CreateAssetImageScanTaskRequest
     * @return CreateAssetImageScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetImageScanTaskResponse CreateAssetImageScanTask(CreateAssetImageScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetImageScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetImageScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetImageScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安装检查组件，创建防护容器
     * @param req CreateCheckComponentRequest
     * @return CreateCheckComponentResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckComponentResponse CreateCheckComponent(CreateCheckComponentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCheckComponentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCheckComponentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCheckComponent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群检查任务，用户检查用户的集群相关风险项
     * @param req CreateClusterCheckTaskRequest
     * @return CreateClusterCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterCheckTaskResponse CreateClusterCheckTask(CreateClusterCheckTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterCheckTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterCheckTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterCheckTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建合规检查任务，在资产级别触发重新检测时使用。
     * @param req CreateComplianceTaskRequest
     * @return CreateComplianceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplianceTaskResponse CreateComplianceTask(CreateComplianceTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateComplianceTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateComplianceTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateComplianceTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个导出安全合规信息的任务
     * @param req CreateExportComplianceStatusListJobRequest
     * @return CreateExportComplianceStatusListJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportComplianceStatusListJobResponse CreateExportComplianceStatusListJob(CreateExportComplianceStatusListJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExportComplianceStatusListJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExportComplianceStatusListJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExportComplianceStatusListJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CreateOrModifyPostPayCores  创建或者编辑弹性计费上限
     * @param req CreateOrModifyPostPayCoresRequest
     * @return CreateOrModifyPostPayCoresResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrModifyPostPayCoresResponse CreateOrModifyPostPayCores(CreateOrModifyPostPayCoresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrModifyPostPayCoresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrModifyPostPayCoresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrModifyPostPayCores");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下发刷新任务，会刷新资产信息
     * @param req CreateRefreshTaskRequest
     * @return CreateRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRefreshTaskResponse CreateRefreshTask(CreateRefreshTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRefreshTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRefreshTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRefreshTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时文件查杀重新检测
     * @param req CreateVirusScanAgainRequest
     * @return CreateVirusScanAgainResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirusScanAgainResponse CreateVirusScanAgain(CreateVirusScanAgainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVirusScanAgainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVirusScanAgainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVirusScanAgain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时文件查杀一键扫描
     * @param req CreateVirusScanTaskRequest
     * @return CreateVirusScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirusScanTaskResponse CreateVirusScanTask(CreateVirusScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVirusScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVirusScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVirusScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除运行异常进程策略
     * @param req DeleteAbnormalProcessRulesRequest
     * @return DeleteAbnormalProcessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAbnormalProcessRulesResponse DeleteAbnormalProcessRules(DeleteAbnormalProcessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAbnormalProcessRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAbnormalProcessRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAbnormalProcessRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除运行访问控制策略
     * @param req DeleteAccessControlRulesRequest
     * @return DeleteAccessControlRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessControlRulesResponse DeleteAccessControlRules(DeleteAccessControlRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessControlRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccessControlRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccessControlRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从白名单中删除将指定的检测项。
     * @param req DeleteCompliancePolicyItemFromWhitelistRequest
     * @return DeleteCompliancePolicyItemFromWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePolicyItemFromWhitelistResponse DeleteCompliancePolicyItemFromWhitelist(DeleteCompliancePolicyItemFromWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCompliancePolicyItemFromWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCompliancePolicyItemFromWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCompliancePolicyItemFromWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除运行时反弹shell白名单
     * @param req DeleteReverseShellWhiteListsRequest
     * @return DeleteReverseShellWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellWhiteListsResponse DeleteReverseShellWhiteLists(DeleteReverseShellWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReverseShellWhiteListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReverseShellWhiteListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReverseShellWhiteLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除运行时高危系统调用白名单
     * @param req DeleteRiskSyscallWhiteListsRequest
     * @return DeleteRiskSyscallWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskSyscallWhiteListsResponse DeleteRiskSyscallWhiteLists(DeleteRiskSyscallWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRiskSyscallWhiteListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRiskSyscallWhiteListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRiskSyscallWhiteLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时异常进程事件详细信息
     * @param req DescribeAbnormalProcessDetailRequest
     * @return DescribeAbnormalProcessDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessDetailResponse DescribeAbnormalProcessDetail(DescribeAbnormalProcessDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalProcessDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalProcessDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时异常进程事件列表信息
     * @param req DescribeAbnormalProcessEventsRequest
     * @return DescribeAbnormalProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventsResponse DescribeAbnormalProcessEvents(DescribeAbnormalProcessEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalProcessEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalProcessEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时异常进程事件列表信息导出
     * @param req DescribeAbnormalProcessEventsExportRequest
     * @return DescribeAbnormalProcessEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessEventsExportResponse DescribeAbnormalProcessEventsExport(DescribeAbnormalProcessEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessEventsExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalProcessEventsExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalProcessEventsExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时异常策略详细信息
     * @param req DescribeAbnormalProcessRuleDetailRequest
     * @return DescribeAbnormalProcessRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRuleDetailResponse DescribeAbnormalProcessRuleDetail(DescribeAbnormalProcessRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalProcessRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalProcessRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时异常进程策略列表信息
     * @param req DescribeAbnormalProcessRulesRequest
     * @return DescribeAbnormalProcessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRulesResponse DescribeAbnormalProcessRules(DescribeAbnormalProcessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalProcessRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalProcessRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时异常进程策略列表信息导出
     * @param req DescribeAbnormalProcessRulesExportRequest
     * @return DescribeAbnormalProcessRulesExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalProcessRulesExportResponse DescribeAbnormalProcessRulesExport(DescribeAbnormalProcessRulesExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalProcessRulesExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalProcessRulesExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalProcessRulesExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时访问控制事件的详细信息
     * @param req DescribeAccessControlDetailRequest
     * @return DescribeAccessControlDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlDetailResponse DescribeAccessControlDetail(DescribeAccessControlDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessControlDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessControlDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时访问控制事件列表
     * @param req DescribeAccessControlEventsRequest
     * @return DescribeAccessControlEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlEventsResponse DescribeAccessControlEvents(DescribeAccessControlEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessControlEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessControlEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时访问控制事件列表导出
     * @param req DescribeAccessControlEventsExportRequest
     * @return DescribeAccessControlEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlEventsExportResponse DescribeAccessControlEventsExport(DescribeAccessControlEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlEventsExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessControlEventsExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessControlEventsExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时访问控制策略详细信息
     * @param req DescribeAccessControlRuleDetailRequest
     * @return DescribeAccessControlRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRuleDetailResponse DescribeAccessControlRuleDetail(DescribeAccessControlRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessControlRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessControlRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行访问控制策略列表信息
     * @param req DescribeAccessControlRulesRequest
     * @return DescribeAccessControlRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRulesResponse DescribeAccessControlRules(DescribeAccessControlRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessControlRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessControlRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时访问控制策略列表导出
     * @param req DescribeAccessControlRulesExportRequest
     * @return DescribeAccessControlRulesExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessControlRulesExportResponse DescribeAccessControlRulesExport(DescribeAccessControlRulesExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessControlRulesExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessControlRulesExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessControlRulesExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取受影响的集群数量，返回数量
     * @param req DescribeAffectedClusterCountRequest
     * @return DescribeAffectedClusterCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedClusterCountResponse DescribeAffectedClusterCount(DescribeAffectedClusterCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAffectedClusterCountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAffectedClusterCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAffectedClusterCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询节点类型的影响范围，返回节点列表
     * @param req DescribeAffectedNodeListRequest
     * @return DescribeAffectedNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedNodeListResponse DescribeAffectedNodeList(DescribeAffectedNodeListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAffectedNodeListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAffectedNodeListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAffectedNodeList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询workload类型的影响范围，返回workload列表
     * @param req DescribeAffectedWorkloadListRequest
     * @return DescribeAffectedWorkloadListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAffectedWorkloadListResponse DescribeAffectedWorkloadList(DescribeAffectedWorkloadListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAffectedWorkloadListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAffectedWorkloadListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAffectedWorkloadList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询app服务列表
     * @param req DescribeAssetAppServiceListRequest
     * @return DescribeAssetAppServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppServiceListResponse DescribeAssetAppServiceList(DescribeAssetAppServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetAppServiceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetAppServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetAppServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询容器组件列表
     * @param req DescribeAssetComponentListRequest
     * @return DescribeAssetComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetComponentListResponse DescribeAssetComponentList(DescribeAssetComponentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetComponentListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetComponentListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetComponentList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器详细信息
     * @param req DescribeAssetContainerDetailRequest
     * @return DescribeAssetContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetContainerDetailResponse DescribeAssetContainerDetail(DescribeAssetContainerDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetContainerDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetContainerDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetContainerDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *搜索查询容器列表
     * @param req DescribeAssetContainerListRequest
     * @return DescribeAssetContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetContainerListResponse DescribeAssetContainerList(DescribeAssetContainerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetContainerListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetContainerListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetContainerList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询db服务列表
     * @param req DescribeAssetDBServiceListRequest
     * @return DescribeAssetDBServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDBServiceListResponse DescribeAssetDBServiceList(DescribeAssetDBServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDBServiceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDBServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDBServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主机详细信息
     * @param req DescribeAssetHostDetailRequest
     * @return DescribeAssetHostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostDetailResponse DescribeAssetHostDetail(DescribeAssetHostDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetHostDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetHostDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetHostDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询主机列表
     * @param req DescribeAssetHostListRequest
     * @return DescribeAssetHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostListResponse DescribeAssetHostList(DescribeAssetHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetHostListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像绑定规则列表信息，包含运行时访问控制和异常进程公用
     * @param req DescribeAssetImageBindRuleInfoRequest
     * @return DescribeAssetImageBindRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageBindRuleInfoResponse DescribeAssetImageBindRuleInfo(DescribeAssetImageBindRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageBindRuleInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageBindRuleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageBindRuleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询镜像详细信息
     * @param req DescribeAssetImageDetailRequest
     * @return DescribeAssetImageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageDetailResponse DescribeAssetImageDetail(DescribeAssetImageDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询镜像关联主机
     * @param req DescribeAssetImageHostListRequest
     * @return DescribeAssetImageHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageHostListResponse DescribeAssetImageHostList(DescribeAssetImageHostListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageHostListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageHostListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageHostList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询镜像列表
     * @param req DescribeAssetImageListRequest
     * @return DescribeAssetImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageListResponse DescribeAssetImageList(DescribeAssetImageListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询镜像列表导出
     * @param req DescribeAssetImageListExportRequest
     * @return DescribeAssetImageListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageListExportResponse DescribeAssetImageListExport(DescribeAssetImageListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看镜像仓库资产更新进度状态
     * @param req DescribeAssetImageRegistryAssetStatusRequest
     * @return DescribeAssetImageRegistryAssetStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryAssetStatusResponse DescribeAssetImageRegistryAssetStatus(DescribeAssetImageRegistryAssetStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryAssetStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryAssetStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryAssetStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库镜像仓库列表详情
     * @param req DescribeAssetImageRegistryDetailRequest
     * @return DescribeAssetImageRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryDetailResponse DescribeAssetImageRegistryDetail(DescribeAssetImageRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库镜像仓库列表
     * @param req DescribeAssetImageRegistryListRequest
     * @return DescribeAssetImageRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryListResponse DescribeAssetImageRegistryList(DescribeAssetImageRegistryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库镜像列表导出
     * @param req DescribeAssetImageRegistryListExportRequest
     * @return DescribeAssetImageRegistryListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryListExportResponse DescribeAssetImageRegistryListExport(DescribeAssetImageRegistryListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看单个镜像仓库详细信息
     * @param req DescribeAssetImageRegistryRegistryDetailRequest
     * @return DescribeAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRegistryDetailResponse DescribeAssetImageRegistryRegistryDetail(DescribeAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryRegistryDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryRegistryDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库仓库列表
     * @param req DescribeAssetImageRegistryRegistryListRequest
     * @return DescribeAssetImageRegistryRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRegistryListResponse DescribeAssetImageRegistryRegistryList(DescribeAssetImageRegistryRegistryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRegistryListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryRegistryListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryRegistryList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库查询镜像高危行为列表
     * @param req DescribeAssetImageRegistryRiskInfoListRequest
     * @return DescribeAssetImageRegistryRiskInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRiskInfoListResponse DescribeAssetImageRegistryRiskInfoList(DescribeAssetImageRegistryRiskInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRiskInfoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryRiskInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryRiskInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库敏感信息列表导出
     * @param req DescribeAssetImageRegistryRiskListExportRequest
     * @return DescribeAssetImageRegistryRiskListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryRiskListExportResponse DescribeAssetImageRegistryRiskListExport(DescribeAssetImageRegistryRiskListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryRiskListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryRiskListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryRiskListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库查询一键镜像扫描状态
     * @param req DescribeAssetImageRegistryScanStatusOneKeyRequest
     * @return DescribeAssetImageRegistryScanStatusOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryScanStatusOneKeyResponse DescribeAssetImageRegistryScanStatusOneKey(DescribeAssetImageRegistryScanStatusOneKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryScanStatusOneKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryScanStatusOneKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryScanStatusOneKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库查询镜像统计信息
     * @param req DescribeAssetImageRegistrySummaryRequest
     * @return DescribeAssetImageRegistrySummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistrySummaryResponse DescribeAssetImageRegistrySummary(DescribeAssetImageRegistrySummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistrySummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistrySummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistrySummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库查询木马病毒列表
     * @param req DescribeAssetImageRegistryVirusListRequest
     * @return DescribeAssetImageRegistryVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVirusListResponse DescribeAssetImageRegistryVirusList(DescribeAssetImageRegistryVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVirusListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryVirusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryVirusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库木马信息列表导出
     * @param req DescribeAssetImageRegistryVirusListExportRequest
     * @return DescribeAssetImageRegistryVirusListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVirusListExportResponse DescribeAssetImageRegistryVirusListExport(DescribeAssetImageRegistryVirusListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVirusListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryVirusListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryVirusListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库查询镜像漏洞列表
     * @param req DescribeAssetImageRegistryVulListRequest
     * @return DescribeAssetImageRegistryVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVulListResponse DescribeAssetImageRegistryVulList(DescribeAssetImageRegistryVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVulListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryVulListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryVulList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库漏洞列表导出
     * @param req DescribeAssetImageRegistryVulListExportRequest
     * @return DescribeAssetImageRegistryVulListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRegistryVulListExportResponse DescribeAssetImageRegistryVulListExport(DescribeAssetImageRegistryVulListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRegistryVulListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRegistryVulListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRegistryVulListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询镜像风险列表
     * @param req DescribeAssetImageRiskListRequest
     * @return DescribeAssetImageRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRiskListResponse DescribeAssetImageRiskList(DescribeAssetImageRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRiskListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询镜像风险列表导出
     * @param req DescribeAssetImageRiskListExportRequest
     * @return DescribeAssetImageRiskListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageRiskListExportResponse DescribeAssetImageRiskListExport(DescribeAssetImageRiskListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageRiskListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageRiskListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageRiskListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取镜像扫描设置信息
     * @param req DescribeAssetImageScanSettingRequest
     * @return DescribeAssetImageScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanSettingResponse DescribeAssetImageScanSetting(DescribeAssetImageScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageScanSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageScanSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageScanSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询镜像扫描状态
     * @param req DescribeAssetImageScanStatusRequest
     * @return DescribeAssetImageScanStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanStatusResponse DescribeAssetImageScanStatus(DescribeAssetImageScanStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageScanStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageScanStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageScanStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询正在一键扫描的镜像扫描taskid
     * @param req DescribeAssetImageScanTaskRequest
     * @return DescribeAssetImageScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageScanTaskResponse DescribeAssetImageScanTask(DescribeAssetImageScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询镜像简略信息列表
     * @param req DescribeAssetImageSimpleListRequest
     * @return DescribeAssetImageSimpleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageSimpleListResponse DescribeAssetImageSimpleList(DescribeAssetImageSimpleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageSimpleListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageSimpleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageSimpleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询镜像病毒列表
     * @param req DescribeAssetImageVirusListRequest
     * @return DescribeAssetImageVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVirusListResponse DescribeAssetImageVirusList(DescribeAssetImageVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVirusListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageVirusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageVirusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询镜像木马列表导出
     * @param req DescribeAssetImageVirusListExportRequest
     * @return DescribeAssetImageVirusListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVirusListExportResponse DescribeAssetImageVirusListExport(DescribeAssetImageVirusListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVirusListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageVirusListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageVirusListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询镜像漏洞列表
     * @param req DescribeAssetImageVulListRequest
     * @return DescribeAssetImageVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVulListResponse DescribeAssetImageVulList(DescribeAssetImageVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVulListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageVulListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageVulList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询镜像漏洞列表导出
     * @param req DescribeAssetImageVulListExportRequest
     * @return DescribeAssetImageVulListExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetImageVulListExportResponse DescribeAssetImageVulListExport(DescribeAssetImageVulListExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetImageVulListExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetImageVulListExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetImageVulListExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询端口占用列表
     * @param req DescribeAssetPortListRequest
     * @return DescribeAssetPortListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortListResponse DescribeAssetPortList(DescribeAssetPortListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetPortListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetPortListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetPortList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全搜索查询进程列表
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetProcessListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetProcessListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetProcessList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账户容器、镜像等统计信息
     * @param req DescribeAssetSummaryRequest
     * @return DescribeAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSummaryResponse DescribeAssetSummary(DescribeAssetSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全查询web服务列表
     * @param req DescribeAssetWebServiceListRequest
     * @return DescribeAssetWebServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceListResponse DescribeAssetWebServiceList(DescribeAssetWebServiceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetWebServiceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetWebServiceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetWebServiceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询所有检查项接口，返回总数和检查项列表
     * @param req DescribeCheckItemListRequest
     * @return DescribeCheckItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckItemListResponse DescribeCheckItemList(DescribeCheckItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckItemListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCheckItemListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCheckItemList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个集群的详细信息
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户集群资产总览
     * @param req DescribeClusterSummaryRequest
     * @return DescribeClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSummaryResponse DescribeClusterSummary(DescribeClusterSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某个资产的详情
     * @param req DescribeComplianceAssetDetailInfoRequest
     * @return DescribeComplianceAssetDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetDetailInfoResponse DescribeComplianceAssetDetailInfo(DescribeComplianceAssetDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetDetailInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceAssetDetailInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceAssetDetailInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某类资产的列表
     * @param req DescribeComplianceAssetListRequest
     * @return DescribeComplianceAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetListResponse DescribeComplianceAssetList(DescribeComplianceAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceAssetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceAssetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某资产下的检测项列表
     * @param req DescribeComplianceAssetPolicyItemListRequest
     * @return DescribeComplianceAssetPolicyItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetPolicyItemListResponse DescribeComplianceAssetPolicyItemList(DescribeComplianceAssetPolicyItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetPolicyItemListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceAssetPolicyItemListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceAssetPolicyItemList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询合规检测的定时任务列表
     * @param req DescribeCompliancePeriodTaskListRequest
     * @return DescribeCompliancePeriodTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePeriodTaskListResponse DescribeCompliancePeriodTaskList(DescribeCompliancePeriodTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompliancePeriodTaskListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompliancePeriodTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompliancePeriodTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照 检测项 → 资产 的两级层次展开的第二层级：资产层级。
     * @param req DescribeCompliancePolicyItemAffectedAssetListRequest
     * @return DescribeCompliancePolicyItemAffectedAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePolicyItemAffectedAssetListResponse DescribeCompliancePolicyItemAffectedAssetList(DescribeCompliancePolicyItemAffectedAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompliancePolicyItemAffectedAssetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompliancePolicyItemAffectedAssetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompliancePolicyItemAffectedAssetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照 检测项 → 资产 的两级层次展开的第一层级：检测项层级。
     * @param req DescribeCompliancePolicyItemAffectedSummaryRequest
     * @return DescribeCompliancePolicyItemAffectedSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePolicyItemAffectedSummaryResponse DescribeCompliancePolicyItemAffectedSummary(DescribeCompliancePolicyItemAffectedSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompliancePolicyItemAffectedSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompliancePolicyItemAffectedSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompliancePolicyItemAffectedSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照 资产 → 检测项 二层结构展示的信息。这里查询第一层 资产的通过率汇总信息。
     * @param req DescribeComplianceScanFailedAssetListRequest
     * @return DescribeComplianceScanFailedAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceScanFailedAssetListResponse DescribeComplianceScanFailedAssetList(DescribeComplianceScanFailedAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceScanFailedAssetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceScanFailedAssetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceScanFailedAssetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询上次任务的资产通过率汇总信息
     * @param req DescribeComplianceTaskAssetSummaryRequest
     * @return DescribeComplianceTaskAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceTaskAssetSummaryResponse DescribeComplianceTaskAssetSummary(DescribeComplianceTaskAssetSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceTaskAssetSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceTaskAssetSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceTaskAssetSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最近一次任务发现的检测项的汇总信息列表，按照 检测项 → 资产 的两级层次展开。
     * @param req DescribeComplianceTaskPolicyItemSummaryListRequest
     * @return DescribeComplianceTaskPolicyItemSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceTaskPolicyItemSummaryListResponse DescribeComplianceTaskPolicyItemSummaryList(DescribeComplianceTaskPolicyItemSummaryListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceTaskPolicyItemSummaryListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceTaskPolicyItemSummaryListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceTaskPolicyItemSummaryList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询白名单列表
     * @param req DescribeComplianceWhitelistItemListRequest
     * @return DescribeComplianceWhitelistItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceWhitelistItemListResponse DescribeComplianceWhitelistItemList(DescribeComplianceWhitelistItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceWhitelistItemListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceWhitelistItemListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceWhitelistItemList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器资产概览信息
     * @param req DescribeContainerAssetSummaryRequest
     * @return DescribeContainerAssetSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerAssetSummaryResponse DescribeContainerAssetSummary(DescribeContainerAssetSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerAssetSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerAssetSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContainerAssetSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器安全未处理事件信息
     * @param req DescribeContainerSecEventSummaryRequest
     * @return DescribeContainerSecEventSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerSecEventSummaryResponse DescribeContainerSecEventSummary(DescribeContainerSecEventSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerSecEventSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerSecEventSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContainerSecEventSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEscapeEventDetail  查询容器逃逸事件详情
     * @param req DescribeEscapeEventDetailRequest
     * @return DescribeEscapeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventDetailResponse DescribeEscapeEventDetail(DescribeEscapeEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEscapeEventDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEscapeEventDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEscapeEventInfo 查询容器逃逸事件列表
     * @param req DescribeEscapeEventInfoRequest
     * @return DescribeEscapeEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventInfoResponse DescribeEscapeEventInfo(DescribeEscapeEventInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEscapeEventInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEscapeEventInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEscapeEventsExport  查询容器逃逸事件列表导出
     * @param req DescribeEscapeEventsExportRequest
     * @return DescribeEscapeEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeEventsExportResponse DescribeEscapeEventsExport(DescribeEscapeEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeEventsExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEscapeEventsExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEscapeEventsExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEscapeRuleInfo 查询容器逃逸扫描规则信息
     * @param req DescribeEscapeRuleInfoRequest
     * @return DescribeEscapeRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeRuleInfoResponse DescribeEscapeRuleInfo(DescribeEscapeRuleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeRuleInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEscapeRuleInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEscapeRuleInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeEscapeSafeState 查询容器逃逸安全状态
     * @param req DescribeEscapeSafeStateRequest
     * @return DescribeEscapeSafeStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEscapeSafeStateResponse DescribeEscapeSafeState(DescribeEscapeSafeStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEscapeSafeStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEscapeSafeStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEscapeSafeState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询导出任务的结果
     * @param req DescribeExportJobResultRequest
     * @return DescribeExportJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobResultResponse DescribeExportJobResult(DescribeExportJobResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportJobResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExportJobResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExportJobResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeImageAuthorizedInfo  查询镜像授权信息
     * @param req DescribeImageAuthorizedInfoRequest
     * @return DescribeImageAuthorizedInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAuthorizedInfoResponse DescribeImageAuthorizedInfo(DescribeImageAuthorizedInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageAuthorizedInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageAuthorizedInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageAuthorizedInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库查看定时任务
     * @param req DescribeImageRegistryTimingScanTaskRequest
     * @return DescribeImageRegistryTimingScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryTimingScanTaskResponse DescribeImageRegistryTimingScanTask(DescribeImageRegistryTimingScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRegistryTimingScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageRegistryTimingScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageRegistryTimingScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询本地镜像风险概览
     * @param req DescribeImageRiskSummaryRequest
     * @return DescribeImageRiskSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRiskSummaryResponse DescribeImageRiskSummary(DescribeImageRiskSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRiskSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageRiskSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageRiskSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器安全本地镜像风险趋势
     * @param req DescribeImageRiskTendencyRequest
     * @return DescribeImageRiskTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRiskTendencyResponse DescribeImageRiskTendency(DescribeImageRiskTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRiskTendencyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageRiskTendencyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageRiskTendency");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeImageSimpleList 查询全部镜像列表
     * @param req DescribeImageSimpleListRequest
     * @return DescribeImageSimpleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSimpleListResponse DescribeImageSimpleList(DescribeImageSimpleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSimpleListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSimpleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageSimpleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribePostPayDetail  查询后付费详情
     * @param req DescribePostPayDetailRequest
     * @return DescribePostPayDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostPayDetailResponse DescribePostPayDetail(DescribePostPayDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePostPayDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePostPayDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePostPayDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeProVersionInfo  查询专业版需购买信息
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
     *DescribePurchaseStateInfo 查询容器安全服务已购买信息
     * @param req DescribePurchaseStateInfoRequest
     * @return DescribePurchaseStateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurchaseStateInfoResponse DescribePurchaseStateInfo(DescribePurchaseStateInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurchaseStateInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurchaseStateInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurchaseStateInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询刷新任务
     * @param req DescribeRefreshTaskRequest
     * @return DescribeRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRefreshTaskResponse DescribeRefreshTask(DescribeRefreshTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRefreshTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRefreshTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRefreshTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时反弹shell事件详细信息
     * @param req DescribeReverseShellDetailRequest
     * @return DescribeReverseShellDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellDetailResponse DescribeReverseShellDetail(DescribeReverseShellDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时反弹shell事件列表信息
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
     *查询运行时反弹shell事件列表信息导出
     * @param req DescribeReverseShellEventsExportRequest
     * @return DescribeReverseShellEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsExportResponse DescribeReverseShellEventsExport(DescribeReverseShellEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellEventsExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellEventsExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellEventsExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时反弹shell白名单详细信息
     * @param req DescribeReverseShellWhiteListDetailRequest
     * @return DescribeReverseShellWhiteListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellWhiteListDetailResponse DescribeReverseShellWhiteListDetail(DescribeReverseShellWhiteListDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellWhiteListDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellWhiteListDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellWhiteListDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时运行时反弹shell白名单列表信息
     * @param req DescribeReverseShellWhiteListsRequest
     * @return DescribeReverseShellWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellWhiteListsResponse DescribeReverseShellWhiteLists(DescribeReverseShellWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReverseShellWhiteListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReverseShellWhiteListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReverseShellWhiteLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最近一次任务发现的风险项的信息列表，支持根据特殊字段进行过滤
     * @param req DescribeRiskListRequest
     * @return DescribeRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskListResponse DescribeRiskList(DescribeRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询高危系统调用事件详细信息
     * @param req DescribeRiskSyscallDetailRequest
     * @return DescribeRiskSyscallDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallDetailResponse DescribeRiskSyscallDetail(DescribeRiskSyscallDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskSyscallDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskSyscallDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时运行时高危系统调用列表信息
     * @param req DescribeRiskSyscallEventsRequest
     * @return DescribeRiskSyscallEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallEventsResponse DescribeRiskSyscallEvents(DescribeRiskSyscallEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskSyscallEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskSyscallEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时高危系统调用列表导出
     * @param req DescribeRiskSyscallEventsExportRequest
     * @return DescribeRiskSyscallEventsExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallEventsExportResponse DescribeRiskSyscallEventsExport(DescribeRiskSyscallEventsExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallEventsExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskSyscallEventsExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskSyscallEventsExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时高危系统调用系统名称列表
     * @param req DescribeRiskSyscallNamesRequest
     * @return DescribeRiskSyscallNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallNamesResponse DescribeRiskSyscallNames(DescribeRiskSyscallNamesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallNamesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskSyscallNamesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskSyscallNames");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时高危系统调用白名单详细信息
     * @param req DescribeRiskSyscallWhiteListDetailRequest
     * @return DescribeRiskSyscallWhiteListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallWhiteListDetailResponse DescribeRiskSyscallWhiteListDetail(DescribeRiskSyscallWhiteListDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallWhiteListDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskSyscallWhiteListDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskSyscallWhiteListDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时高危系统调用白名单列表信息
     * @param req DescribeRiskSyscallWhiteListsRequest
     * @return DescribeRiskSyscallWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskSyscallWhiteListsResponse DescribeRiskSyscallWhiteLists(DescribeRiskSyscallWhiteListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskSyscallWhiteListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskSyscallWhiteListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskSyscallWhiteLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器运行时安全事件趋势
     * @param req DescribeSecEventsTendencyRequest
     * @return DescribeSecEventsTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecEventsTendencyResponse DescribeSecEventsTendency(DescribeSecEventsTendencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecEventsTendencyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecEventsTendencyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecEventsTendency");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询检查结果总览，返回受影响的节点数量，返回7天的数据，总共7个
     * @param req DescribeTaskResultSummaryRequest
     * @return DescribeTaskResultSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultSummaryResponse DescribeTaskResultSummary(DescribeTaskResultSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskResultSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询未完成的刷新资产任务信息
     * @param req DescribeUnfinishRefreshTaskRequest
     * @return DescribeUnfinishRefreshTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnfinishRefreshTaskResponse DescribeUnfinishRefreshTask(DescribeUnfinishRefreshTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnfinishRefreshTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnfinishRefreshTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnfinishRefreshTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *安全概览和集群安全页进入调用该接口，查询用户集群相关信息。
     * @param req DescribeUserClusterRequest
     * @return DescribeUserClusterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClusterResponse DescribeUserCluster(DescribeUserClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeValueAddedSrvInfo查询增值服务需购买信息
     * @param req DescribeValueAddedSrvInfoRequest
     * @return DescribeValueAddedSrvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeValueAddedSrvInfoResponse DescribeValueAddedSrvInfo(DescribeValueAddedSrvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeValueAddedSrvInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeValueAddedSrvInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeValueAddedSrvInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时查询木马文件信息
     * @param req DescribeVirusDetailRequest
     * @return DescribeVirusDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusDetailResponse DescribeVirusDetail(DescribeVirusDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询运行时文件查杀事件列表
     * @param req DescribeVirusListRequest
     * @return DescribeVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusListResponse DescribeVirusList(DescribeVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时查询文件查杀实时监控设置
     * @param req DescribeVirusMonitorSettingRequest
     * @return DescribeVirusMonitorSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusMonitorSettingResponse DescribeVirusMonitorSetting(DescribeVirusMonitorSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusMonitorSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusMonitorSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusMonitorSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时查询文件查杀设置
     * @param req DescribeVirusScanSettingRequest
     * @return DescribeVirusScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanSettingResponse DescribeVirusScanSetting(DescribeVirusScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusScanSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusScanSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusScanSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时查询文件查杀任务状态
     * @param req DescribeVirusScanTaskStatusRequest
     * @return DescribeVirusScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanTaskStatusResponse DescribeVirusScanTaskStatus(DescribeVirusScanTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusScanTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusScanTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusScanTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时文件扫描超时设置查询
     * @param req DescribeVirusScanTimeoutSettingRequest
     * @return DescribeVirusScanTimeoutSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusScanTimeoutSettingResponse DescribeVirusScanTimeoutSetting(DescribeVirusScanTimeoutSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusScanTimeoutSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusScanTimeoutSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusScanTimeoutSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时查询木马概览信息
     * @param req DescribeVirusSummaryRequest
     * @return DescribeVirusSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusSummaryResponse DescribeVirusSummary(DescribeVirusSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时查询文件查杀任务列表
     * @param req DescribeVirusTaskListRequest
     * @return DescribeVirusTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVirusTaskListResponse DescribeVirusTaskList(DescribeVirusTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVirusTaskListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVirusTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVirusTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取告警策略列表
     * @param req DescribeWarningRulesRequest
     * @return DescribeWarningRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningRulesResponse DescribeWarningRules(DescribeWarningRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWarningRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWarningRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时文件查杀事件列表导出
     * @param req ExportVirusListRequest
     * @return ExportVirusListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVirusListResponse ExportVirusList(ExportVirusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVirusListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVirusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportVirusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为客户初始化合规基线的使用环境，创建必要的数据和选项。
     * @param req InitializeUserComplianceEnvironmentRequest
     * @return InitializeUserComplianceEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public InitializeUserComplianceEnvironmentResponse InitializeUserComplianceEnvironment(InitializeUserComplianceEnvironmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitializeUserComplianceEnvironmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitializeUserComplianceEnvironmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitializeUserComplianceEnvironment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改运行时异常进程策略的开启关闭状态
     * @param req ModifyAbnormalProcessRuleStatusRequest
     * @return ModifyAbnormalProcessRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAbnormalProcessRuleStatusResponse ModifyAbnormalProcessRuleStatus(ModifyAbnormalProcessRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAbnormalProcessRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAbnormalProcessRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAbnormalProcessRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改异常进程事件的状态信息
     * @param req ModifyAbnormalProcessStatusRequest
     * @return ModifyAbnormalProcessStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAbnormalProcessStatusResponse ModifyAbnormalProcessStatus(ModifyAbnormalProcessStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAbnormalProcessStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAbnormalProcessStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAbnormalProcessStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改运行时访问控制策略的状态，启用或者禁用
     * @param req ModifyAccessControlRuleStatusRequest
     * @return ModifyAccessControlRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessControlRuleStatusResponse ModifyAccessControlRuleStatus(ModifyAccessControlRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessControlRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccessControlRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccessControlRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改运行时访问控制事件状态信息
     * @param req ModifyAccessControlStatusRequest
     * @return ModifyAccessControlStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessControlStatusResponse ModifyAccessControlStatus(ModifyAccessControlStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessControlStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccessControlStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccessControlStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全主机资产刷新
     * @param req ModifyAssetRequest
     * @return ModifyAssetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetResponse ModifyAsset(ModifyAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库停止镜像扫描任务
     * @param req ModifyAssetImageRegistryScanStopRequest
     * @return ModifyAssetImageRegistryScanStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageRegistryScanStopResponse ModifyAssetImageRegistryScanStop(ModifyAssetImageRegistryScanStopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetImageRegistryScanStopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssetImageRegistryScanStopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssetImageRegistryScanStop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库停止镜像一键扫描任务
     * @param req ModifyAssetImageRegistryScanStopOneKeyRequest
     * @return ModifyAssetImageRegistryScanStopOneKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageRegistryScanStopOneKeyResponse ModifyAssetImageRegistryScanStopOneKey(ModifyAssetImageRegistryScanStopOneKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetImageRegistryScanStopOneKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssetImageRegistryScanStopOneKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssetImageRegistryScanStopOneKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器安全停止镜像扫描
     * @param req ModifyAssetImageScanStopRequest
     * @return ModifyAssetImageScanStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetImageScanStopResponse ModifyAssetImageScanStop(ModifyAssetImageScanStopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetImageScanStopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssetImageScanStopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssetImageScanStop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改定时任务的设置，包括检测周期、开启/禁用合规基准。
     * @param req ModifyCompliancePeriodTaskRequest
     * @return ModifyCompliancePeriodTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompliancePeriodTaskResponse ModifyCompliancePeriodTask(ModifyCompliancePeriodTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCompliancePeriodTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCompliancePeriodTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCompliancePeriodTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ModifyEscapeEventStatus  修改容器逃逸扫描事件状态
     * @param req ModifyEscapeEventStatusRequest
     * @return ModifyEscapeEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeEventStatusResponse ModifyEscapeEventStatus(ModifyEscapeEventStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEscapeEventStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEscapeEventStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEscapeEventStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ModifyEscapeRule  修改容器逃逸扫描规则信息
     * @param req ModifyEscapeRuleRequest
     * @return ModifyEscapeRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEscapeRuleResponse ModifyEscapeRule(ModifyEscapeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEscapeRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEscapeRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEscapeRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改反弹shell事件的状态信息
     * @param req ModifyReverseShellStatusRequest
     * @return ModifyReverseShellStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReverseShellStatusResponse ModifyReverseShellStatus(ModifyReverseShellStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyReverseShellStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyReverseShellStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyReverseShellStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改高危系统调用事件的状态信息
     * @param req ModifyRiskSyscallStatusRequest
     * @return ModifyRiskSyscallStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskSyscallStatusResponse ModifyRiskSyscallStatus(ModifyRiskSyscallStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRiskSyscallStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRiskSyscallStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRiskSyscallStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时更新木马文件事件状态
     * @param req ModifyVirusFileStatusRequest
     * @return ModifyVirusFileStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusFileStatusResponse ModifyVirusFileStatus(ModifyVirusFileStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusFileStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVirusFileStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVirusFileStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时更新文件查杀实时监控设置
     * @param req ModifyVirusMonitorSettingRequest
     * @return ModifyVirusMonitorSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusMonitorSettingResponse ModifyVirusMonitorSetting(ModifyVirusMonitorSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusMonitorSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVirusMonitorSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVirusMonitorSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时更新文件查杀设置
     * @param req ModifyVirusScanSettingRequest
     * @return ModifyVirusScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusScanSettingResponse ModifyVirusScanSetting(ModifyVirusScanSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusScanSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVirusScanSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVirusScanSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时文件扫描超时设置
     * @param req ModifyVirusScanTimeoutSettingRequest
     * @return ModifyVirusScanTimeoutSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVirusScanTimeoutSettingResponse ModifyVirusScanTimeoutSetting(ModifyVirusScanTimeoutSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVirusScanTimeoutSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVirusScanTimeoutSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVirusScanTimeoutSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除单个镜像仓库详细信息
     * @param req RemoveAssetImageRegistryRegistryDetailRequest
     * @return RemoveAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAssetImageRegistryRegistryDetailResponse RemoveAssetImageRegistryRegistryDetail(RemoveAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveAssetImageRegistryRegistryDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveAssetImageRegistryRegistryDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *RenewImageAuthorizeState   授权镜像扫描
     * @param req RenewImageAuthorizeStateRequest
     * @return RenewImageAuthorizeStateResponse
     * @throws TencentCloudSDKException
     */
    public RenewImageAuthorizeStateResponse RenewImageAuthorizeState(RenewImageAuthorizeStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewImageAuthorizeStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewImageAuthorizeStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewImageAuthorizeState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新检测选定的资产
     * @param req ScanComplianceAssetsRequest
     * @return ScanComplianceAssetsResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceAssetsResponse ScanComplianceAssets(ScanComplianceAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanComplianceAssetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScanComplianceAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanComplianceAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用指定的检测项重新检测选定的资产，返回创建的合规检查任务的ID。
     * @param req ScanComplianceAssetsByPolicyItemRequest
     * @return ScanComplianceAssetsByPolicyItemResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceAssetsByPolicyItemResponse ScanComplianceAssetsByPolicyItem(ScanComplianceAssetsByPolicyItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanComplianceAssetsByPolicyItemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScanComplianceAssetsByPolicyItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanComplianceAssetsByPolicyItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新检测选的检测项下的所有资产，返回创建的合规检查任务的ID。
     * @param req ScanCompliancePolicyItemsRequest
     * @return ScanCompliancePolicyItemsResponse
     * @throws TencentCloudSDKException
     */
    public ScanCompliancePolicyItemsResponse ScanCompliancePolicyItems(ScanCompliancePolicyItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanCompliancePolicyItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScanCompliancePolicyItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanCompliancePolicyItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新检测选定的检测失败的资产下的所有失败的检测项，返回创建的合规检查任务的ID。
     * @param req ScanComplianceScanFailedAssetsRequest
     * @return ScanComplianceScanFailedAssetsResponse
     * @throws TencentCloudSDKException
     */
    public ScanComplianceScanFailedAssetsResponse ScanComplianceScanFailedAssets(ScanComplianceScanFailedAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanComplianceScanFailedAssetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScanComplianceScanFailedAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanComplianceScanFailedAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置检测模式和自动检查
     * @param req SetCheckModeRequest
     * @return SetCheckModeResponse
     * @throws TencentCloudSDKException
     */
    public SetCheckModeResponse SetCheckMode(SetCheckModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCheckModeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetCheckModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetCheckMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行时停止木马查杀任务
     * @param req StopVirusScanTaskRequest
     * @return StopVirusScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVirusScanTaskResponse StopVirusScanTask(StopVirusScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopVirusScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopVirusScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopVirusScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库资产刷新
     * @param req SyncAssetImageRegistryAssetRequest
     * @return SyncAssetImageRegistryAssetResponse
     * @throws TencentCloudSDKException
     */
    public SyncAssetImageRegistryAssetResponse SyncAssetImageRegistryAsset(SyncAssetImageRegistryAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncAssetImageRegistryAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncAssetImageRegistryAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncAssetImageRegistryAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新单个镜像仓库详细信息
     * @param req UpdateAssetImageRegistryRegistryDetailRequest
     * @return UpdateAssetImageRegistryRegistryDetailResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAssetImageRegistryRegistryDetailResponse UpdateAssetImageRegistryRegistryDetail(UpdateAssetImageRegistryRegistryDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAssetImageRegistryRegistryDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAssetImageRegistryRegistryDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAssetImageRegistryRegistryDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库更新定时任务
     * @param req UpdateImageRegistryTimingScanTaskRequest
     * @return UpdateImageRegistryTimingScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageRegistryTimingScanTaskResponse UpdateImageRegistryTimingScanTask(UpdateImageRegistryTimingScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateImageRegistryTimingScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateImageRegistryTimingScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateImageRegistryTimingScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
