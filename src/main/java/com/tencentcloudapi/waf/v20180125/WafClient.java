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
package com.tencentcloudapi.waf.v20180125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.waf.v20180125.models.*;

public class WafClient extends AbstractClient{
    private static String endpoint = "waf.tencentcloudapi.com";
    private static String service = "waf";
    private static String version = "2018-01-25";

    public WafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WafClient(Credential credential, String region, ClientProfile profile) {
        super(WafClient.endpoint, WafClient.version, credential, region, profile);
    }

    /**
     *增加自定义策略
     * @param req AddCustomRuleRequest
     * @return AddCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomRuleResponse AddCustomRule(AddCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCustomRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加域名规则白名单
     * @param req AddDomainWhiteRuleRequest
     * @return AddDomainWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddDomainWhiteRuleResponse AddDomainWhiteRule(AddDomainWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDomainWhiteRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddDomainWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDomainWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加Spart防护域名
     * @param req AddSpartaProtectionRequest
     * @return AddSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public AddSpartaProtectionResponse AddSpartaProtection(AddSpartaProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSpartaProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddSpartaProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSpartaProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建访问日志导出
     * @param req CreateAccessExportRequest
     * @return CreateAccessExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessExportResponse CreateAccessExport(CreateAccessExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccessExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccessExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccessExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建攻击日志下载任务
     * @param req CreateAttackDownloadTaskRequest
     * @return CreateAttackDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAttackDownloadTaskResponse CreateAttackDownloadTask(CreateAttackDownloadTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAttackDownloadTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAttackDownloadTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAttackDownloadTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除访问日志导出
     * @param req DeleteAccessExportRequest
     * @return DeleteAccessExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessExportResponse DeleteAccessExport(DeleteAccessExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccessExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccessExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除攻击日志下载任务记录
     * @param req DeleteAttackDownloadRecordRequest
     * @return DeleteAttackDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackDownloadRecordResponse DeleteAttackDownloadRecord(DeleteAttackDownloadRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAttackDownloadRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAttackDownloadRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAttackDownloadRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名规则白名单


     * @param req DeleteDomainWhiteRulesRequest
     * @return DeleteDomainWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainWhiteRulesResponse DeleteDomainWhiteRules(DeleteDomainWhiteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainWhiteRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainWhiteRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainWhiteRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除访问日志下载记录
     * @param req DeleteDownloadRecordRequest
     * @return DeleteDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDownloadRecordResponse DeleteDownloadRecord(DeleteDownloadRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDownloadRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDownloadRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDownloadRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf IP黑白名单Delete接口
     * @param req DeleteIpAccessControlRequest
     * @return DeleteIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIpAccessControlResponse DeleteIpAccessControl(DeleteIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIpAccessControlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除CC攻击的session设置
     * @param req DeleteSessionRequest
     * @return DeleteSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionResponse DeleteSession(DeleteSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取访问日志导出列表
     * @param req DescribeAccessExportsRequest
     * @return DescribeAccessExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessExportsResponse DescribeAccessExports(DescribeAccessExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessExportsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessExportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessExports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于访问日志的快速分析
     * @param req DescribeAccessFastAnalysisRequest
     * @return DescribeAccessFastAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessFastAnalysisResponse DescribeAccessFastAnalysis(DescribeAccessFastAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessFastAnalysisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessFastAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessFastAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取访问日志索引配置信息
     * @param req DescribeAccessIndexRequest
     * @return DescribeAccessIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessIndexResponse DescribeAccessIndex(DescribeAccessIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述WAF自动封禁IP详情,对齐自动封堵状态
     * @param req DescribeAutoDenyIPRequest
     * @return DescribeAutoDenyIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoDenyIPResponse DescribeAutoDenyIP(DescribeAutoDenyIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoDenyIPResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoDenyIPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoDenyIP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防护配置中的自定义策略列表
     * @param req DescribeCustomRulesRequest
     * @return DescribeCustomRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRulesResponse DescribeCustomRules(DescribeCustomRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名的规则白名单


     * @param req DescribeDomainWhiteRulesRequest
     * @return DescribeDomainWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainWhiteRulesResponse DescribeDomainWhiteRules(DescribeDomainWhiteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainWhiteRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainWhiteRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainWhiteRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户所有域名的详细信息
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取waf流量访问趋势
     * @param req DescribeFlowTrendRequest
     * @return DescribeFlowTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowTrendResponse DescribeFlowTrend(DescribeFlowTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowTrendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf ip黑白名单查询
     * @param req DescribeIpAccessControlRequest
     * @return DescribeIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpAccessControlResponse DescribeIpAccessControl(DescribeIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpAccessControlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf  IP封堵状态查询
     * @param req DescribeIpHitItemsRequest
     * @return DescribeIpHitItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpHitItemsResponse DescribeIpHitItems(DescribeIpHitItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpHitItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpHitItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIpHitItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在负载均衡型WAF的添加、编辑域名配置的时候，需要展示负载均衡型WAF（clb-waf)支持的地域列表，通过DescribeUserClbWafRegions既可以获得当前对客户已经开放的地域列表
     * @param req DescribeUserClbWafRegionsRequest
     * @return DescribeUserClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClbWafRegionsResponse DescribeUserClbWafRegions(DescribeUserClbWafRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserClbWafRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserClbWafRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserClbWafRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回ip惩罚规则详细信息
     * @param req DescribeWafAutoDenyRulesRequest
     * @return DescribeWafAutoDenyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafAutoDenyRulesResponse DescribeWafAutoDenyRules(DescribeWafAutoDenyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafAutoDenyRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafAutoDenyRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafAutoDenyRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述WAF自动封禁模块详情
     * @param req DescribeWafAutoDenyStatusRequest
     * @return DescribeWafAutoDenyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafAutoDenyStatusResponse DescribeWafAutoDenyStatus(DescribeWafAutoDenyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafAutoDenyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafAutoDenyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafAutoDenyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述WAF威胁情报封禁模块配置详情
     * @param req DescribeWafThreatenIntelligenceRequest
     * @return DescribeWafThreatenIntelligenceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafThreatenIntelligenceResponse DescribeWafThreatenIntelligence(DescribeWafThreatenIntelligenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafThreatenIntelligenceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafThreatenIntelligenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafThreatenIntelligence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于修改访问日志保存期限
     * @param req ModifyAccessPeriodRequest
     * @return ModifyAccessPeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessPeriodResponse ModifyAccessPeriod(ModifyAccessPeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessPeriodResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccessPeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccessPeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或禁用自定义策略
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改某一条规则
     * @param req ModifyDomainWhiteRuleRequest
     * @return ModifyDomainWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainWhiteRuleResponse ModifyDomainWhiteRule(ModifyDomainWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainWhiteRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改ip惩罚规则
     * @param req ModifyWafAutoDenyRulesRequest
     * @return ModifyWafAutoDenyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafAutoDenyRulesResponse ModifyWafAutoDenyRules(ModifyWafAutoDenyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWafAutoDenyRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWafAutoDenyRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWafAutoDenyRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置WAF自动封禁模块状态
     * @param req ModifyWafAutoDenyStatusRequest
     * @return ModifyWafAutoDenyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafAutoDenyStatusResponse ModifyWafAutoDenyStatus(ModifyWafAutoDenyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWafAutoDenyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWafAutoDenyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWafAutoDenyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置WAF威胁情报封禁模块详情
     * @param req ModifyWafThreatenIntelligenceRequest
     * @return ModifyWafThreatenIntelligenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafThreatenIntelligenceResponse ModifyWafThreatenIntelligence(ModifyWafThreatenIntelligenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWafThreatenIntelligenceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWafThreatenIntelligenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWafThreatenIntelligence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于搜索WAF访问日志
     * @param req SearchAccessLogRequest
     * @return SearchAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAccessLogResponse SearchAccessLog(SearchAccessLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchAccessLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchAccessLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchAccessLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf IP黑白名单Upsert接口
     * @param req UpsertIpAccessControlRequest
     * @return UpsertIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public UpsertIpAccessControlResponse UpsertIpAccessControl(UpsertIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpsertIpAccessControlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpsertIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpsertIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
