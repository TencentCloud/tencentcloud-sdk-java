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
     *添加防篡改url
     * @param req AddAntiFakeUrlRequest
     * @return AddAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public AddAntiFakeUrlResponse AddAntiFakeUrl(AddAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAntiFakeUrl", AddAntiFakeUrlResponse.class);
    }

    /**
     *添加信息防泄漏规则
     * @param req AddAntiInfoLeakRulesRequest
     * @return AddAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddAntiInfoLeakRulesResponse AddAntiInfoLeakRules(AddAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAntiInfoLeakRules", AddAntiInfoLeakRulesResponse.class);
    }

    /**
     *添加地域封禁中的地域信息
     * @param req AddAreaBanAreasRequest
     * @return AddAreaBanAreasResponse
     * @throws TencentCloudSDKException
     */
    public AddAreaBanAreasResponse AddAreaBanAreas(AddAreaBanAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAreaBanAreas", AddAreaBanAreasResponse.class);
    }

    /**
     *供用户控制台调用，增加Tiga规则引擎白名单。
     * @param req AddAttackWhiteRuleRequest
     * @return AddAttackWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddAttackWhiteRuleResponse AddAttackWhiteRule(AddAttackWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAttackWhiteRule", AddAttackWhiteRuleResponse.class);
    }

    /**
     *添加一键bypass能力支持,直接添加APPID
     * @param req AddBypassAllRuleRequest
     * @return AddBypassAllRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddBypassAllRuleResponse AddBypassAllRule(AddBypassAllRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddBypassAllRule", AddBypassAllRuleResponse.class);
    }

    /**
     *增加访问控制（自定义策略）
     * @param req AddCustomRuleRequest
     * @return AddCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomRuleResponse AddCustomRule(AddCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCustomRule", AddCustomRuleResponse.class);
    }

    /**
     *增加精准白名单规则
     * @param req AddCustomWhiteRuleRequest
     * @return AddCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomWhiteRuleResponse AddCustomWhiteRule(AddCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCustomWhiteRule", AddCustomWhiteRuleResponse.class);
    }

    /**
     *增加域名规则白名单
     * @param req AddDomainWhiteRuleRequest
     * @return AddDomainWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddDomainWhiteRuleResponse AddDomainWhiteRule(AddDomainWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDomainWhiteRule", AddDomainWhiteRuleResponse.class);
    }

    /**
     *添加SaaS型WAF防护域名
     * @param req AddSpartaProtectionRequest
     * @return AddSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public AddSpartaProtectionResponse AddSpartaProtection(AddSpartaProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddSpartaProtection", AddSpartaProtectionResponse.class);
    }

    /**
     *批量操作tiga子规则
     * @param req BatchOperateUserSignatureRulesRequest
     * @return BatchOperateUserSignatureRulesResponse
     * @throws TencentCloudSDKException
     */
    public BatchOperateUserSignatureRulesResponse BatchOperateUserSignatureRules(BatchOperateUserSignatureRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchOperateUserSignatureRules", BatchOperateUserSignatureRulesResponse.class);
    }

    /**
     *本接口用于创建访问日志导出
     * @param req CreateAccessExportRequest
     * @return CreateAccessExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessExportResponse CreateAccessExport(CreateAccessExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessExport", CreateAccessExportResponse.class);
    }

    /**
     *添加（编辑）地域封禁中的地域信息
     * @param req CreateAreaBanRuleRequest
     * @return CreateAreaBanRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAreaBanRuleResponse CreateAreaBanRule(CreateAreaBanRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAreaBanRule", CreateAreaBanRuleResponse.class);
    }

    /**
     *批量IP黑白名单新增接口
     * @param req CreateBatchIpAccessControlRequest
     * @return CreateBatchIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchIpAccessControlResponse CreateBatchIpAccessControl(CreateBatchIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBatchIpAccessControl", CreateBatchIpAccessControlResponse.class);
    }

    /**
     *计费资源购买、续费下单接口
     * @param req CreateDealsRequest
     * @return CreateDealsResponse
     * @throws TencentCloudSDKException
     */
    public CreateDealsResponse CreateDeals(CreateDealsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeals", CreateDealsResponse.class);
    }

    /**
     *本接口仅创建下载任务，任务返回的下载地址，请用户调用DescribeExports查看任务列表。其中有下载地址CosPath参数。参考文档https://cloud.tencent.com/document/product/614/56449
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExport", CreateExportResponse.class);
    }

    /**
     *clb-waf中添加防护域名
     * @param req CreateHostRequest
     * @return CreateHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostResponse CreateHost(CreateHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHost", CreateHostResponse.class);
    }

    /**
     *Waf IP黑白名单新增接口
     * @param req CreateIpAccessControlRequest
     * @return CreateIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public CreateIpAccessControlResponse CreateIpAccessControl(CreateIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIpAccessControl", CreateIpAccessControlResponse.class);
    }

    /**
     *添加规则引擎白名单
     * @param req CreateOwaspWhiteRuleRequest
     * @return CreateOwaspWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateOwaspWhiteRuleResponse CreateOwaspWhiteRule(CreateOwaspWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOwaspWhiteRule", CreateOwaspWhiteRuleResponse.class);
    }

    /**
     *创建CKafka投递流任务
     * @param req CreatePostCKafkaFlowRequest
     * @return CreatePostCKafkaFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostCKafkaFlowResponse CreatePostCKafkaFlow(CreatePostCKafkaFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePostCKafkaFlow", CreatePostCKafkaFlowResponse.class);
    }

    /**
     *创建CLS投递流任务
     * @param req CreatePostCLSFlowRequest
     * @return CreatePostCLSFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostCLSFlowResponse CreatePostCLSFlow(CreatePostCLSFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePostCLSFlow", CreatePostCLSFlowResponse.class);
    }

    /**
     *创建限流规则
     * @param req CreateRateLimitV2Request
     * @return CreateRateLimitV2Response
     * @throws TencentCloudSDKException
     */
    public CreateRateLimitV2Response CreateRateLimitV2(CreateRateLimitV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRateLimitV2", CreateRateLimitV2Response.class);
    }

    /**
     *本接口用于删除访问日志导出
     * @param req DeleteAccessExportRequest
     * @return DeleteAccessExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessExportResponse DeleteAccessExport(DeleteAccessExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessExport", DeleteAccessExportResponse.class);
    }

    /**
     *删除防篡改url
     * @param req DeleteAntiFakeUrlRequest
     * @return DeleteAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAntiFakeUrlResponse DeleteAntiFakeUrl(DeleteAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAntiFakeUrl", DeleteAntiFakeUrlResponse.class);
    }

    /**
     *信息防泄漏删除规则
     * @param req DeleteAntiInfoLeakRuleRequest
     * @return DeleteAntiInfoLeakRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAntiInfoLeakRuleResponse DeleteAntiInfoLeakRule(DeleteAntiInfoLeakRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAntiInfoLeakRule", DeleteAntiInfoLeakRuleResponse.class);
    }

    /**
     *删除攻击日志下载任务记录
     * @param req DeleteAttackDownloadRecordRequest
     * @return DeleteAttackDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackDownloadRecordResponse DeleteAttackDownloadRecord(DeleteAttackDownloadRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAttackDownloadRecord", DeleteAttackDownloadRecordResponse.class);
    }

    /**
     *供用户控制台调用，删除Tiga规则引擎白名单。
     * @param req DeleteAttackWhiteRuleRequest
     * @return DeleteAttackWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackWhiteRuleResponse DeleteAttackWhiteRule(DeleteAttackWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAttackWhiteRule", DeleteAttackWhiteRuleResponse.class);
    }

    /**
     *批量黑白名单删除接口
     * @param req DeleteBatchIpAccessControlRequest
     * @return DeleteBatchIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBatchIpAccessControlResponse DeleteBatchIpAccessControl(DeleteBatchIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBatchIpAccessControl", DeleteBatchIpAccessControlResponse.class);
    }

    /**
     *场景化后删除Bot的UCB自定义规则
     * @param req DeleteBotSceneUCBRuleRequest
     * @return DeleteBotSceneUCBRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBotSceneUCBRuleResponse DeleteBotSceneUCBRule(DeleteBotSceneUCBRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBotSceneUCBRule", DeleteBotSceneUCBRuleResponse.class);
    }

    /**
     *Waf  CC V2 Delete接口
     * @param req DeleteCCRuleRequest
     * @return DeleteCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCRuleResponse DeleteCCRule(DeleteCCRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCRule", DeleteCCRuleResponse.class);
    }

    /**
     *删除自定义规则
     * @param req DeleteCustomRuleRequest
     * @return DeleteCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomRuleResponse DeleteCustomRule(DeleteCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomRule", DeleteCustomRuleResponse.class);
    }

    /**
     *删除精准白名单规则
     * @param req DeleteCustomWhiteRuleRequest
     * @return DeleteCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomWhiteRuleResponse DeleteCustomWhiteRule(DeleteCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomWhiteRule", DeleteCustomWhiteRuleResponse.class);
    }

    /**
     *删除域名规则白名单
     * @param req DeleteDomainWhiteRulesRequest
     * @return DeleteDomainWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainWhiteRulesResponse DeleteDomainWhiteRules(DeleteDomainWhiteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainWhiteRules", DeleteDomainWhiteRulesResponse.class);
    }

    /**
     *本接口用于删除日志下载任务
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExport", DeleteExportResponse.class);
    }

    /**
     *删除负载均衡型域名，支持批量操作。
     * @param req DeleteHostRequest
     * @return DeleteHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHostResponse DeleteHost(DeleteHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHost", DeleteHostResponse.class);
    }

    /**
     *Waf IP黑白名单Delete接口（建议使用DeleteIpAccessControlV2来替换当前接口）
     * @param req DeleteIpAccessControlRequest
     * @return DeleteIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIpAccessControlResponse DeleteIpAccessControl(DeleteIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIpAccessControl", DeleteIpAccessControlResponse.class);
    }

    /**
     *Waf IP黑白名单最新版本删除接口
     * @param req DeleteIpAccessControlV2Request
     * @return DeleteIpAccessControlV2Response
     * @throws TencentCloudSDKException
     */
    public DeleteIpAccessControlV2Response DeleteIpAccessControlV2(DeleteIpAccessControlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIpAccessControlV2", DeleteIpAccessControlV2Response.class);
    }

    /**
     *解除门神规则的状态锁
     * @param req DeleteOwaspRuleStatusRequest
     * @return DeleteOwaspRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOwaspRuleStatusResponse DeleteOwaspRuleStatus(DeleteOwaspRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOwaspRuleStatus", DeleteOwaspRuleStatusResponse.class);
    }

    /**
     *删除用户规则引擎白名单
     * @param req DeleteOwaspWhiteRuleRequest
     * @return DeleteOwaspWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOwaspWhiteRuleResponse DeleteOwaspWhiteRule(DeleteOwaspWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOwaspWhiteRule", DeleteOwaspWhiteRuleResponse.class);
    }

    /**
     *删除自研版限流规则
     * @param req DeleteRateLimitsV2Request
     * @return DeleteRateLimitsV2Response
     * @throws TencentCloudSDKException
     */
    public DeleteRateLimitsV2Response DeleteRateLimitsV2(DeleteRateLimitsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRateLimitsV2", DeleteRateLimitsV2Response.class);
    }

    /**
     *删除CC攻击的session设置
     * @param req DeleteSessionRequest
     * @return DeleteSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionResponse DeleteSession(DeleteSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSession", DeleteSessionResponse.class);
    }

    /**
     *SaaS型WAF删除防护域名
     * @param req DeleteSpartaProtectionRequest
     * @return DeleteSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSpartaProtectionResponse DeleteSpartaProtection(DeleteSpartaProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSpartaProtection", DeleteSpartaProtectionResponse.class);
    }

    /**
     *本接口用于获取访问日志导出列表
     * @param req DescribeAccessExportsRequest
     * @return DescribeAccessExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessExportsResponse DescribeAccessExports(DescribeAccessExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessExports", DescribeAccessExportsResponse.class);
    }

    /**
     *本接口用于访问日志的快速分析
     * @param req DescribeAccessFastAnalysisRequest
     * @return DescribeAccessFastAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessFastAnalysisResponse DescribeAccessFastAnalysis(DescribeAccessFastAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessFastAnalysis", DescribeAccessFastAnalysisResponse.class);
    }

    /**
     *本接口用于访问日志柱状趋势图
     * @param req DescribeAccessHistogramRequest
     * @return DescribeAccessHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessHistogramResponse DescribeAccessHistogram(DescribeAccessHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessHistogram", DescribeAccessHistogramResponse.class);
    }

    /**
     *本接口用于获取访问日志索引配置信息
     * @param req DescribeAccessIndexRequest
     * @return DescribeAccessIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessIndexResponse DescribeAccessIndex(DescribeAccessIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessIndex", DescribeAccessIndexResponse.class);
    }

    /**
     *获取防篡改url
     * @param req DescribeAntiFakeRulesRequest
     * @return DescribeAntiFakeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiFakeRulesResponse DescribeAntiFakeRules(DescribeAntiFakeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAntiFakeRules", DescribeAntiFakeRulesResponse.class);
    }

    /**
     *取得信息防泄漏规则列表
     * @param req DescribeAntiInfoLeakageRulesRequest
     * @return DescribeAntiInfoLeakageRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiInfoLeakageRulesResponse DescribeAntiInfoLeakageRules(DescribeAntiInfoLeakageRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAntiInfoLeakageRules", DescribeAntiInfoLeakageRulesResponse.class);
    }

    /**
     *获取Api安全模块的访问日志聚合topN
     * @param req DescribeApiAggregateTopNRequest
     * @return DescribeApiAggregateTopNResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiAggregateTopNResponse DescribeApiAggregateTopN(DescribeApiAggregateTopNRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiAggregateTopN", DescribeApiAggregateTopNResponse.class);
    }

    /**
     *获取Api请求详情信息
     * @param req DescribeApiDetailRequest
     * @return DescribeApiDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiDetailResponse DescribeApiDetail(DescribeApiDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiDetail", DescribeApiDetailResponse.class);
    }

    /**
     *api资产列表
     * @param req DescribeApiListVersionTwoRequest
     * @return DescribeApiListVersionTwoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiListVersionTwoResponse DescribeApiListVersionTwo(DescribeApiListVersionTwoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiListVersionTwo", DescribeApiListVersionTwoResponse.class);
    }

    /**
     *获取地域封禁配置包括地域封禁开关，设置封禁的地区信息
     * @param req DescribeAreaBanAreasRequest
     * @return DescribeAreaBanAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaBanAreasResponse DescribeAreaBanAreas(DescribeAreaBanAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAreaBanAreas", DescribeAreaBanAreasResponse.class);
    }

    /**
     *获取地域封禁规则配置
     * @param req DescribeAreaBanRuleRequest
     * @return DescribeAreaBanRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaBanRuleResponse DescribeAreaBanRule(DescribeAreaBanRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAreaBanRule", DescribeAreaBanRuleResponse.class);
    }

    /**
     *获取WAF地域封禁支持的地域列表
     * @param req DescribeAreaBanSupportAreasRequest
     * @return DescribeAreaBanSupportAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAreaBanSupportAreasResponse DescribeAreaBanSupportAreas(DescribeAreaBanSupportAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAreaBanSupportAreas", DescribeAreaBanSupportAreasResponse.class);
    }

    /**
     *攻击总览
     * @param req DescribeAttackOverviewRequest
     * @return DescribeAttackOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackOverviewResponse DescribeAttackOverview(DescribeAttackOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackOverview", DescribeAttackOverviewResponse.class);
    }

    /**
     *查询指定域名TOP N攻击类型
     * @param req DescribeAttackTypeRequest
     * @return DescribeAttackTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTypeResponse DescribeAttackType(DescribeAttackTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackType", DescribeAttackTypeResponse.class);
    }

    /**
     *获取用户规则白名单列表
     * @param req DescribeAttackWhiteRuleRequest
     * @return DescribeAttackWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackWhiteRuleResponse DescribeAttackWhiteRule(DescribeAttackWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackWhiteRule", DescribeAttackWhiteRuleResponse.class);
    }

    /**
     *描述WAF自动封禁IP详情,对齐自动封堵状态
     * @param req DescribeAutoDenyIPRequest
     * @return DescribeAutoDenyIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoDenyIPResponse DescribeAutoDenyIP(DescribeAutoDenyIPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoDenyIP", DescribeAutoDenyIPResponse.class);
    }

    /**
     *Waf 批量防护IP黑白名单查询
     * @param req DescribeBatchIpAccessControlRequest
     * @return DescribeBatchIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchIpAccessControlResponse DescribeBatchIpAccessControl(DescribeBatchIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchIpAccessControl", DescribeBatchIpAccessControlResponse.class);
    }

    /**
     *获取BotId规则列表1
     * @param req DescribeBotIdRuleRequest
     * @return DescribeBotIdRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotIdRuleResponse DescribeBotIdRule(DescribeBotIdRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotIdRule", DescribeBotIdRuleResponse.class);
    }

    /**
     *获取BOT场景列表与概览
     * @param req DescribeBotSceneListRequest
     * @return DescribeBotSceneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotSceneListResponse DescribeBotSceneList(DescribeBotSceneListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotSceneList", DescribeBotSceneListResponse.class);
    }

    /**
     *获取Bot场景全局概览
     * @param req DescribeBotSceneOverviewRequest
     * @return DescribeBotSceneOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotSceneOverviewResponse DescribeBotSceneOverview(DescribeBotSceneOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotSceneOverview", DescribeBotSceneOverviewResponse.class);
    }

    /**
     *场景化后Bot获取UCB自定义规则策略
     * @param req DescribeBotSceneUCBRuleRequest
     * @return DescribeBotSceneUCBRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotSceneUCBRuleResponse DescribeBotSceneUCBRule(DescribeBotSceneUCBRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBotSceneUCBRule", DescribeBotSceneUCBRuleResponse.class);
    }

    /**
     *获取SAAS型接入的紧急CC防护状态
     * @param req DescribeCCAutoStatusRequest
     * @return DescribeCCAutoStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCAutoStatusResponse DescribeCCAutoStatus(DescribeCCAutoStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCAutoStatus", DescribeCCAutoStatusResponse.class);
    }

    /**
     *Waf  CC V2 Query接口
     * @param req DescribeCCRuleRequest
     * @return DescribeCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCRuleResponse DescribeCCRule(DescribeCCRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCRule", DescribeCCRuleResponse.class);
    }

    /**
     *根据多条件查询CC规则
     * @param req DescribeCCRuleListRequest
     * @return DescribeCCRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCRuleListResponse DescribeCCRuleList(DescribeCCRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCRuleList", DescribeCCRuleListResponse.class);
    }

    /**
     *获取证书的检查结果
     * @param req DescribeCertificateVerifyResultRequest
     * @return DescribeCertificateVerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateVerifyResultResponse DescribeCertificateVerifyResult(DescribeCertificateVerifyResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateVerifyResult", DescribeCertificateVerifyResultResponse.class);
    }

    /**
     *Saas型WAF接入查询加密套件信息
     * @param req DescribeCiphersDetailRequest
     * @return DescribeCiphersDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCiphersDetailResponse DescribeCiphersDetail(DescribeCiphersDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCiphersDetail", DescribeCiphersDetailResponse.class);
    }

    /**
     *获取防护配置中的访问控制策略列表
     * @param req DescribeCustomRuleListRequest
     * @return DescribeCustomRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRuleListResponse DescribeCustomRuleList(DescribeCustomRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRuleList", DescribeCustomRuleListResponse.class);
    }

    /**
     *获取防护配置中的精准白名单策略列表
     * @param req DescribeCustomWhiteRuleRequest
     * @return DescribeCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomWhiteRuleResponse DescribeCustomWhiteRule(DescribeCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomWhiteRule", DescribeCustomWhiteRuleResponse.class);
    }

    /**
     *获取域名概况
     * @param req DescribeDomainCountInfoRequest
     * @return DescribeDomainCountInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainCountInfoResponse DescribeDomainCountInfo(DescribeDomainCountInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainCountInfo", DescribeDomainCountInfoResponse.class);
    }

    /**
     *获取一个clbwaf域名详情
     * @param req DescribeDomainDetailsClbRequest
     * @return DescribeDomainDetailsClbResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainDetailsClbResponse DescribeDomainDetailsClb(DescribeDomainDetailsClbRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainDetailsClb", DescribeDomainDetailsClbResponse.class);
    }

    /**
     *查询单个saaswaf域名详情
     * @param req DescribeDomainDetailsSaasRequest
     * @return DescribeDomainDetailsSaasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainDetailsSaasResponse DescribeDomainDetailsSaas(DescribeDomainDetailsSaasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainDetailsSaas", DescribeDomainDetailsSaasResponse.class);
    }

    /**
     *拉取域名的防护规则列表
     * @param req DescribeDomainRulesRequest
     * @return DescribeDomainRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainRulesResponse DescribeDomainRules(DescribeDomainRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainRules", DescribeDomainRulesResponse.class);
    }

    /**
     *获取添加域名操作的结果
     * @param req DescribeDomainVerifyResultRequest
     * @return DescribeDomainVerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainVerifyResultResponse DescribeDomainVerifyResult(DescribeDomainVerifyResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainVerifyResult", DescribeDomainVerifyResultResponse.class);
    }

    /**
     *获取域名的规则白名单
     * @param req DescribeDomainWhiteRulesRequest
     * @return DescribeDomainWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainWhiteRulesResponse DescribeDomainWhiteRules(DescribeDomainWhiteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainWhiteRules", DescribeDomainWhiteRulesResponse.class);
    }

    /**
     *查询用户所有域名的详细信息
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *本接口用于获取日志下载任务列表
     * @param req DescribeExportsRequest
     * @return DescribeExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportsResponse DescribeExports(DescribeExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExports", DescribeExportsResponse.class);
    }

    /**
     *获取发现域名列表接口
     * @param req DescribeFindDomainListRequest
     * @return DescribeFindDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFindDomainListResponse DescribeFindDomainList(DescribeFindDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFindDomainList", DescribeFindDomainListResponse.class);
    }

    /**
     *获取waf流量访问趋势
     * @param req DescribeFlowTrendRequest
     * @return DescribeFlowTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowTrendResponse DescribeFlowTrend(DescribeFlowTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowTrend", DescribeFlowTrendResponse.class);
    }

    /**
     *查询多种条件的聚类分析
     * @param req DescribeHistogramRequest
     * @return DescribeHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistogramResponse DescribeHistogram(DescribeHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHistogram", DescribeHistogramResponse.class);
    }

    /**
     *clb-waf获取防护域名详情
     * @param req DescribeHostRequest
     * @return DescribeHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostResponse DescribeHost(DescribeHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHost", DescribeHostResponse.class);
    }

    /**
     *添加域名的首先验证是否购买了套餐，是否没有达到购买套餐的限制，域名是否已经添加
     * @param req DescribeHostLimitRequest
     * @return DescribeHostLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLimitResponse DescribeHostLimit(DescribeHostLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostLimit", DescribeHostLimitResponse.class);
    }

    /**
     *clb-waf中获取防护域名列表
     * @param req DescribeHostsRequest
     * @return DescribeHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsResponse DescribeHosts(DescribeHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHosts", DescribeHostsResponse.class);
    }

    /**
     *查询用户所有实例的详细信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *Waf ip黑白名单查询
     * @param req DescribeIpAccessControlRequest
     * @return DescribeIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpAccessControlResponse DescribeIpAccessControl(DescribeIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpAccessControl", DescribeIpAccessControlResponse.class);
    }

    /**
     *Waf  IP封堵状态查询
     * @param req DescribeIpHitItemsRequest
     * @return DescribeIpHitItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpHitItemsResponse DescribeIpHitItems(DescribeIpHitItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpHitItems", DescribeIpHitItemsResponse.class);
    }

    /**
     *本接口用于构建日志数量直方图
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogHistogram", DescribeLogHistogramResponse.class);
    }

    /**
     *查询各个waf基础安全模块的开关状态，看每个模块是否开启
     * @param req DescribeModuleStatusRequest
     * @return DescribeModuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleStatusResponse DescribeModuleStatus(DescribeModuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModuleStatus", DescribeModuleStatusResponse.class);
    }

    /**
     *查看防护对象列表
     * @param req DescribeObjectsRequest
     * @return DescribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeObjectsResponse DescribeObjects(DescribeObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeObjects", DescribeObjectsResponse.class);
    }

    /**
     *查询规则引擎的规则类型列表
     * @param req DescribeOwaspRuleTypesRequest
     * @return DescribeOwaspRuleTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOwaspRuleTypesResponse DescribeOwaspRuleTypes(DescribeOwaspRuleTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOwaspRuleTypes", DescribeOwaspRuleTypesResponse.class);
    }

    /**
     *查询规则引擎的规则列表
     * @param req DescribeOwaspRulesRequest
     * @return DescribeOwaspRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOwaspRulesResponse DescribeOwaspRules(DescribeOwaspRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOwaspRules", DescribeOwaspRulesResponse.class);
    }

    /**
     *获取规则引擎白名单列表
     * @param req DescribeOwaspWhiteRulesRequest
     * @return DescribeOwaspWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOwaspWhiteRulesResponse DescribeOwaspWhiteRules(DescribeOwaspWhiteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOwaspWhiteRules", DescribeOwaspWhiteRulesResponse.class);
    }

    /**
     *查询业务和攻击概要趋势
     * @param req DescribePeakPointsRequest
     * @return DescribePeakPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakPointsResponse DescribePeakPoints(DescribePeakPointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakPoints", DescribePeakPointsResponse.class);
    }

    /**
     *获取业务和攻击概览峰值
     * @param req DescribePeakValueRequest
     * @return DescribePeakValueResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakValueResponse DescribePeakValue(DescribePeakValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakValue", DescribePeakValueResponse.class);
    }

    /**
     *获取防护状态以及生效的实例id
     * @param req DescribePolicyStatusRequest
     * @return DescribePolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyStatusResponse DescribePolicyStatus(DescribePolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyStatus", DescribePolicyStatusResponse.class);
    }

    /**
     *获取Saas型WAF防护端口列表
     * @param req DescribePortsRequest
     * @return DescribePortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortsResponse DescribePorts(DescribePortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePorts", DescribePortsResponse.class);
    }

    /**
     *获取CKafka投递流任务列表
     * @param req DescribePostCKafkaFlowsRequest
     * @return DescribePostCKafkaFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostCKafkaFlowsResponse DescribePostCKafkaFlows(DescribePostCKafkaFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostCKafkaFlows", DescribePostCKafkaFlowsResponse.class);
    }

    /**
     *获取CLS投递流任务列表
     * @param req DescribePostCLSFlowsRequest
     * @return DescribePostCLSFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostCLSFlowsResponse DescribePostCLSFlows(DescribePostCLSFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostCLSFlows", DescribePostCLSFlowsResponse.class);
    }

    /**
     *查询Tiga引擎大类规则及其防护模式
     * @param req DescribeProtectionModesRequest
     * @return DescribeProtectionModesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectionModesResponse DescribeProtectionModes(DescribeProtectionModesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectionModes", DescribeProtectionModesResponse.class);
    }

    /**
     *查询限流规则列表接口
     * @param req DescribeRateLimitsV2Request
     * @return DescribeRateLimitsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRateLimitsV2Response DescribeRateLimitsV2(DescribeRateLimitsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRateLimitsV2", DescribeRateLimitsV2Response.class);
    }

    /**
     *获取各个模块具体的规格限制
     * @param req DescribeRuleLimitRequest
     * @return DescribeRuleLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleLimitResponse DescribeRuleLimit(DescribeRuleLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleLimit", DescribeRuleLimitResponse.class);
    }

    /**
     *查询扫描ip
     * @param req DescribeScanIpRequest
     * @return DescribeScanIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanIpResponse DescribeScanIp(DescribeScanIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanIp", DescribeScanIpResponse.class);
    }

    /**
     *Waf 会话定义查询接口
     * @param req DescribeSessionRequest
     * @return DescribeSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionResponse DescribeSession(DescribeSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSession", DescribeSessionResponse.class);
    }

    /**
     *waf斯巴达-获取防护域名信息
     * @param req DescribeSpartaProtectionInfoRequest
     * @return DescribeSpartaProtectionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpartaProtectionInfoResponse DescribeSpartaProtectionInfo(DescribeSpartaProtectionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpartaProtectionInfo", DescribeSpartaProtectionInfoResponse.class);
    }

    /**
     *查询SaaS型WAF支持的TLS版本
     * @param req DescribeTlsVersionRequest
     * @return DescribeTlsVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTlsVersionResponse DescribeTlsVersion(DescribeTlsVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTlsVersion", DescribeTlsVersionResponse.class);
    }

    /**
     *查询Top5的攻击域名
     * @param req DescribeTopAttackDomainRequest
     * @return DescribeTopAttackDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopAttackDomainResponse DescribeTopAttackDomain(DescribeTopAttackDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopAttackDomain", DescribeTopAttackDomainResponse.class);
    }

    /**
     *本接口用于获取日志主题列表，支持分页
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
    }

    /**
     *在CDC场景下，负载均衡型WAF的添加、编辑域名配置的时候，需要展示CDC负载均衡型WAF（cdc-clb-waf)支持的地域列表，通过DescribeUserCdcClbWafRegions既可以获得当前对客户已经开放的地域列表
     * @param req DescribeUserCdcClbWafRegionsRequest
     * @return DescribeUserCdcClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCdcClbWafRegionsResponse DescribeUserCdcClbWafRegions(DescribeUserCdcClbWafRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCdcClbWafRegions", DescribeUserCdcClbWafRegionsResponse.class);
    }

    /**
     *在负载均衡型WAF的添加、编辑域名配置的时候，需要展示负载均衡型WAF（clb-waf)支持的地域列表，通过DescribeUserClbWafRegions既可以获得当前对客户已经开放的地域列表
     * @param req DescribeUserClbWafRegionsRequest
     * @return DescribeUserClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClbWafRegionsResponse DescribeUserClbWafRegions(DescribeUserClbWafRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserClbWafRegions", DescribeUserClbWafRegionsResponse.class);
    }

    /**
     *查询saas和clb的域名信息
     * @param req DescribeUserDomainInfoRequest
     * @return DescribeUserDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDomainInfoResponse DescribeUserDomainInfo(DescribeUserDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDomainInfo", DescribeUserDomainInfoResponse.class);
    }

    /**
     *获取用户防护规则等级
     * @param req DescribeUserLevelRequest
     * @return DescribeUserLevelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserLevelResponse DescribeUserLevel(DescribeUserLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserLevel", DescribeUserLevelResponse.class);
    }

    /**
     *查询Tiga引擎规则类型及状态
     * @param req DescribeUserSignatureClassRequest
     * @return DescribeUserSignatureClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSignatureClassResponse DescribeUserSignatureClass(DescribeUserSignatureClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserSignatureClass", DescribeUserSignatureClassResponse.class);
    }

    /**
     *获取用户特征规则列表
     * @param req DescribeUserSignatureRuleRequest
     * @return DescribeUserSignatureRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSignatureRuleResponse DescribeUserSignatureRule(DescribeUserSignatureRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserSignatureRule", DescribeUserSignatureRuleResponse.class);
    }

    /**
     *获取用户特征规则列表
     * @param req DescribeUserSignatureRuleV2Request
     * @return DescribeUserSignatureRuleV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeUserSignatureRuleV2Response DescribeUserSignatureRuleV2(DescribeUserSignatureRuleV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserSignatureRuleV2", DescribeUserSignatureRuleV2Response.class);
    }

    /**
     *根据过滤条件查询VIP信息
     * @param req DescribeVipInfoRequest
     * @return DescribeVipInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVipInfoResponse DescribeVipInfo(DescribeVipInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVipInfo", DescribeVipInfoResponse.class);
    }

    /**
     *返回ip惩罚规则详细信息
     * @param req DescribeWafAutoDenyRulesRequest
     * @return DescribeWafAutoDenyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafAutoDenyRulesResponse DescribeWafAutoDenyRules(DescribeWafAutoDenyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafAutoDenyRules", DescribeWafAutoDenyRulesResponse.class);
    }

    /**
     *废弃接口

描述WAF自动封禁模块详情
     * @param req DescribeWafAutoDenyStatusRequest
     * @return DescribeWafAutoDenyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafAutoDenyStatusResponse DescribeWafAutoDenyStatus(DescribeWafAutoDenyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafAutoDenyStatus", DescribeWafAutoDenyStatusResponse.class);
    }

    /**
     *描述WAF威胁情报封禁模块配置详情
     * @param req DescribeWafThreatenIntelligenceRequest
     * @return DescribeWafThreatenIntelligenceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafThreatenIntelligenceResponse DescribeWafThreatenIntelligence(DescribeWafThreatenIntelligenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafThreatenIntelligence", DescribeWafThreatenIntelligenceResponse.class);
    }

    /**
     *获取域名的webshell状态
     * @param req DescribeWebshellStatusRequest
     * @return DescribeWebshellStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebshellStatusResponse DescribeWebshellStatus(DescribeWebshellStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebshellStatus", DescribeWebshellStatusResponse.class);
    }

    /**
     *销毁CKafka投递流任务
     * @param req DestroyPostCKafkaFlowRequest
     * @return DestroyPostCKafkaFlowResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPostCKafkaFlowResponse DestroyPostCKafkaFlow(DestroyPostCKafkaFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPostCKafkaFlow", DestroyPostCKafkaFlowResponse.class);
    }

    /**
     *销毁CLS投递流任务
     * @param req DestroyPostCLSFlowRequest
     * @return DestroyPostCLSFlowResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPostCLSFlowResponse DestroyPostCLSFlow(DestroyPostCLSFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPostCLSFlow", DestroyPostCLSFlowResponse.class);
    }

    /**
     *批量更改自研版限流规则开关
     * @param req EnableRateLimitsV2Request
     * @return EnableRateLimitsV2Response
     * @throws TencentCloudSDKException
     */
    public EnableRateLimitsV2Response EnableRateLimitsV2(EnableRateLimitsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableRateLimitsV2", EnableRateLimitsV2Response.class);
    }

    /**
     *刷新防篡改url
     * @param req FreshAntiFakeUrlRequest
     * @return FreshAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public FreshAntiFakeUrlResponse FreshAntiFakeUrl(FreshAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreshAntiFakeUrl", FreshAntiFakeUrlResponse.class);
    }

    /**
     *计费资源购买、续费下单接口
     * @param req GenerateDealsAndPayNewRequest
     * @return GenerateDealsAndPayNewResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDealsAndPayNewResponse GenerateDealsAndPayNew(GenerateDealsAndPayNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateDealsAndPayNew", GenerateDealsAndPayNewResponse.class);
    }

    /**
     *查询下载攻击日志任务记录列表
     * @param req GetAttackDownloadRecordsRequest
     * @return GetAttackDownloadRecordsResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackDownloadRecordsResponse GetAttackDownloadRecords(GetAttackDownloadRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttackDownloadRecords", GetAttackDownloadRecordsResponse.class);
    }

    /**
     *生成攻击日志的产生时间柱状图
     * @param req GetAttackHistogramRequest
     * @return GetAttackHistogramResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackHistogramResponse GetAttackHistogram(GetAttackHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttackHistogram", GetAttackHistogramResponse.class);
    }

    /**
     *按照条件查询展示攻击总次数
     * @param req GetAttackTotalCountRequest
     * @return GetAttackTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackTotalCountResponse GetAttackTotalCount(GetAttackTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttackTotalCount", GetAttackTotalCountResponse.class);
    }

    /**
     *获取套餐实例的弹性qps上限
     * @param req GetInstanceQpsLimitRequest
     * @return GetInstanceQpsLimitResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceQpsLimitResponse GetInstanceQpsLimit(GetInstanceQpsLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetInstanceQpsLimit", GetInstanceQpsLimitResponse.class);
    }

    /**
     *获取集团账号角色
     * @param req GetOrganizationRoleRequest
     * @return GetOrganizationRoleResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationRoleResponse GetOrganizationRole(GetOrganizationRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOrganizationRole", GetOrganizationRoleResponse.class);
    }

    /**
     *导入IP黑白名单
     * @param req ImportIpAccessControlRequest
     * @return ImportIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public ImportIpAccessControlResponse ImportIpAccessControl(ImportIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportIpAccessControl", ImportIpAccessControlResponse.class);
    }

    /**
     *编辑防篡改url
     * @param req ModifyAntiFakeUrlRequest
     * @return ModifyAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiFakeUrlResponse ModifyAntiFakeUrl(ModifyAntiFakeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiFakeUrl", ModifyAntiFakeUrlResponse.class);
    }

    /**
     *切换防篡改开关
     * @param req ModifyAntiFakeUrlStatusRequest
     * @return ModifyAntiFakeUrlStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiFakeUrlStatusResponse ModifyAntiFakeUrlStatus(ModifyAntiFakeUrlStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiFakeUrlStatus", ModifyAntiFakeUrlStatusResponse.class);
    }

    /**
     *信息防泄漏切换规则开关
     * @param req ModifyAntiInfoLeakRuleStatusRequest
     * @return ModifyAntiInfoLeakRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiInfoLeakRuleStatusResponse ModifyAntiInfoLeakRuleStatus(ModifyAntiInfoLeakRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiInfoLeakRuleStatus", ModifyAntiInfoLeakRuleStatusResponse.class);
    }

    /**
     *编辑信息防泄漏规则
     * @param req ModifyAntiInfoLeakRulesRequest
     * @return ModifyAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiInfoLeakRulesResponse ModifyAntiInfoLeakRules(ModifyAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAntiInfoLeakRules", ModifyAntiInfoLeakRulesResponse.class);
    }

    /**
     *api分析页面开关
     * @param req ModifyApiAnalyzeStatusRequest
     * @return ModifyApiAnalyzeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiAnalyzeStatusResponse ModifyApiAnalyzeStatus(ModifyApiAnalyzeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiAnalyzeStatus", ModifyApiAnalyzeStatusResponse.class);
    }

    /**
     *api安全状态变更接口
     * @param req ModifyApiSecEventChangeRequest
     * @return ModifyApiSecEventChangeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiSecEventChangeResponse ModifyApiSecEventChange(ModifyApiSecEventChangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiSecEventChange", ModifyApiSecEventChangeResponse.class);
    }

    /**
     *修改api安全敏感检测规则
     * @param req ModifyApiSecSensitiveRuleRequest
     * @return ModifyApiSecSensitiveRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiSecSensitiveRuleResponse ModifyApiSecSensitiveRule(ModifyApiSecSensitiveRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiSecSensitiveRule", ModifyApiSecSensitiveRuleResponse.class);
    }

    /**
     *修改地域封禁中的地域信息
     * @param req ModifyAreaBanAreasRequest
     * @return ModifyAreaBanAreasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAreaBanAreasResponse ModifyAreaBanAreas(ModifyAreaBanAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAreaBanAreas", ModifyAreaBanAreasResponse.class);
    }

    /**
     *添加（编辑）地域封禁中的地域信息
     * @param req ModifyAreaBanRuleRequest
     * @return ModifyAreaBanRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAreaBanRuleResponse ModifyAreaBanRule(ModifyAreaBanRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAreaBanRule", ModifyAreaBanRuleResponse.class);
    }

    /**
     *修改防护域名的地域封禁状态
     * @param req ModifyAreaBanStatusRequest
     * @return ModifyAreaBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAreaBanStatusResponse ModifyAreaBanStatus(ModifyAreaBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAreaBanStatus", ModifyAreaBanStatusResponse.class);
    }

    /**
     *供用户控制台调用，修改Tiga规则引擎白名单。
     * @param req ModifyAttackWhiteRuleRequest
     * @return ModifyAttackWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAttackWhiteRuleResponse ModifyAttackWhiteRule(ModifyAttackWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAttackWhiteRule", ModifyAttackWhiteRuleResponse.class);
    }

    /**
     *批量IP黑白名单新增接口
     * @param req ModifyBatchIpAccessControlRequest
     * @return ModifyBatchIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBatchIpAccessControlResponse ModifyBatchIpAccessControl(ModifyBatchIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBatchIpAccessControl", ModifyBatchIpAccessControlResponse.class);
    }

    /**
     *修改Bot-ID规则配置1
     * @param req ModifyBotIdRuleRequest
     * @return ModifyBotIdRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBotIdRuleResponse ModifyBotIdRule(ModifyBotIdRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBotIdRule", ModifyBotIdRuleResponse.class);
    }

    /**
     *bot子场景开关
     * @param req ModifyBotSceneStatusRequest
     * @return ModifyBotSceneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBotSceneStatusResponse ModifyBotSceneStatus(ModifyBotSceneStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBotSceneStatus", ModifyBotSceneStatusResponse.class);
    }

    /**
     *【接口复用】场景化后更新Bot的UCB自定义规则，两个调用位置：1.BOT全局白名单 2.BOT场景配置
     * @param req ModifyBotSceneUCBRuleRequest
     * @return ModifyBotSceneUCBRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBotSceneUCBRuleResponse ModifyBotSceneUCBRule(ModifyBotSceneUCBRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBotSceneUCBRule", ModifyBotSceneUCBRuleResponse.class);
    }

    /**
     *Bot_V2 bot总开关更新
     * @param req ModifyBotStatusRequest
     * @return ModifyBotStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBotStatusResponse ModifyBotStatus(ModifyBotStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBotStatus", ModifyBotStatusResponse.class);
    }

    /**
     *编辑自定义规则
     * @param req ModifyCustomRuleRequest
     * @return ModifyCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleResponse ModifyCustomRule(ModifyCustomRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomRule", ModifyCustomRuleResponse.class);
    }

    /**
     *开启或禁用访问控制（自定义策略）
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomRuleStatus", ModifyCustomRuleStatusResponse.class);
    }

    /**
     *编辑精准白名单
     * @param req ModifyCustomWhiteRuleRequest
     * @return ModifyCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomWhiteRuleResponse ModifyCustomWhiteRule(ModifyCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomWhiteRule", ModifyCustomWhiteRuleResponse.class);
    }

    /**
     *开启或禁用精准白名单
     * @param req ModifyCustomWhiteRuleStatusRequest
     * @return ModifyCustomWhiteRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomWhiteRuleStatusResponse ModifyCustomWhiteRuleStatus(ModifyCustomWhiteRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomWhiteRuleStatus", ModifyCustomWhiteRuleStatusResponse.class);
    }

    /**
     *切换ipv6开关
     * @param req ModifyDomainIpv6StatusRequest
     * @return ModifyDomainIpv6StatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainIpv6StatusResponse ModifyDomainIpv6Status(ModifyDomainIpv6StatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainIpv6Status", ModifyDomainIpv6StatusResponse.class);
    }

    /**
     *修改域名投递状态
     * @param req ModifyDomainPostActionRequest
     * @return ModifyDomainPostActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainPostActionResponse ModifyDomainPostAction(ModifyDomainPostActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainPostAction", ModifyDomainPostActionResponse.class);
    }

    /**
     *修改域名规则白名单
     * @param req ModifyDomainWhiteRuleRequest
     * @return ModifyDomainWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainWhiteRuleResponse ModifyDomainWhiteRule(ModifyDomainWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainWhiteRule", ModifyDomainWhiteRuleResponse.class);
    }

    /**
     *修改域名列表的访问日志开关
     * @param req ModifyDomainsCLSStatusRequest
     * @return ModifyDomainsCLSStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainsCLSStatusResponse ModifyDomainsCLSStatus(ModifyDomainsCLSStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainsCLSStatus", ModifyDomainsCLSStatusResponse.class);
    }

    /**
     *提供给clb等使用的waf实例下单接口，目前只支持clb旗舰版实例的下单，该接口会进行入参校验，然后调用是否为收购用户，然后调用计费接口下单。目前只支持预付费下单
     * @param req ModifyGenerateDealsRequest
     * @return ModifyGenerateDealsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGenerateDealsResponse ModifyGenerateDeals(ModifyGenerateDealsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGenerateDeals", ModifyGenerateDealsResponse.class);
    }

    /**
     *编辑负载均衡型WAF防护域名配置
     * @param req ModifyHostRequest
     * @return ModifyHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostResponse ModifyHost(ModifyHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHost", ModifyHostResponse.class);
    }

    /**
     *设置负载均衡型WAF防护域名的流量模式，切换镜像模式和清洗模式
     * @param req ModifyHostFlowModeRequest
     * @return ModifyHostFlowModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostFlowModeResponse ModifyHostFlowMode(ModifyHostFlowModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostFlowMode", ModifyHostFlowModeResponse.class);
    }

    /**
     *clb-waf设置防护域名防护状态
     * @param req ModifyHostModeRequest
     * @return ModifyHostModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostModeResponse ModifyHostMode(ModifyHostModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostMode", ModifyHostModeResponse.class);
    }

    /**
     *clb-waf 设置防护域名WAF开关
支持批量操作。
     * @param req ModifyHostStatusRequest
     * @return ModifyHostStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostStatusResponse ModifyHostStatus(ModifyHostStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostStatus", ModifyHostStatusResponse.class);
    }

    /**
     *修改实例攻击日志投递开关，企业版及以上版本可以开通，否则返回错误
     * @param req ModifyInstanceAttackLogPostRequest
     * @return ModifyInstanceAttackLogPostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttackLogPostResponse ModifyInstanceAttackLogPost(ModifyInstanceAttackLogPostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAttackLogPost", ModifyInstanceAttackLogPostResponse.class);
    }

    /**
     *修改实例的QPS弹性计费开关
     * @param req ModifyInstanceElasticModeRequest
     * @return ModifyInstanceElasticModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceElasticModeResponse ModifyInstanceElasticMode(ModifyInstanceElasticModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceElasticMode", ModifyInstanceElasticModeResponse.class);
    }

    /**
     *修改实例的名称
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *设置套餐实例的弹性qps上限
     * @param req ModifyInstanceQpsLimitRequest
     * @return ModifyInstanceQpsLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceQpsLimitResponse ModifyInstanceQpsLimit(ModifyInstanceQpsLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceQpsLimit", ModifyInstanceQpsLimitResponse.class);
    }

    /**
     *修改实例的自动续费开关
     * @param req ModifyInstanceRenewFlagRequest
     * @return ModifyInstanceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceRenewFlagResponse ModifyInstanceRenewFlag(ModifyInstanceRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceRenewFlag", ModifyInstanceRenewFlagResponse.class);
    }

    /**
     *Waf IP黑白名单编辑接口
     * @param req ModifyIpAccessControlRequest
     * @return ModifyIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpAccessControlResponse ModifyIpAccessControl(ModifyIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpAccessControl", ModifyIpAccessControlResponse.class);
    }

    /**
     *设置某个domain下基础安全模块的开关
     * @param req ModifyModuleStatusRequest
     * @return ModifyModuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleStatusResponse ModifyModuleStatus(ModifyModuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleStatus", ModifyModuleStatusResponse.class);
    }

    /**
     *修改防护对象
     * @param req ModifyObjectRequest
     * @return ModifyObjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyObjectResponse ModifyObject(ModifyObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyObject", ModifyObjectResponse.class);
    }

    /**
     *批量修改防护对象
     * @param req ModifyObjectsRequest
     * @return ModifyObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyObjectsResponse ModifyObjects(ModifyObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyObjects", ModifyObjectsResponse.class);
    }

    /**
     *更新规则的开关
     * @param req ModifyOwaspRuleStatusRequest
     * @return ModifyOwaspRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwaspRuleStatusResponse ModifyOwaspRuleStatus(ModifyOwaspRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwaspRuleStatus", ModifyOwaspRuleStatusResponse.class);
    }

    /**
     *更新规则类型的防护模式
     * @param req ModifyOwaspRuleTypeActionRequest
     * @return ModifyOwaspRuleTypeActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwaspRuleTypeActionResponse ModifyOwaspRuleTypeAction(ModifyOwaspRuleTypeActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwaspRuleTypeAction", ModifyOwaspRuleTypeActionResponse.class);
    }

    /**
     *更新规则类型的防护等级
     * @param req ModifyOwaspRuleTypeLevelRequest
     * @return ModifyOwaspRuleTypeLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwaspRuleTypeLevelResponse ModifyOwaspRuleTypeLevel(ModifyOwaspRuleTypeLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwaspRuleTypeLevel", ModifyOwaspRuleTypeLevelResponse.class);
    }

    /**
     *更新规则类型的开关
     * @param req ModifyOwaspRuleTypeStatusRequest
     * @return ModifyOwaspRuleTypeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwaspRuleTypeStatusResponse ModifyOwaspRuleTypeStatus(ModifyOwaspRuleTypeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwaspRuleTypeStatus", ModifyOwaspRuleTypeStatusResponse.class);
    }

    /**
     *编辑规则引擎白名单
     * @param req ModifyOwaspWhiteRuleRequest
     * @return ModifyOwaspWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwaspWhiteRuleResponse ModifyOwaspWhiteRule(ModifyOwaspWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwaspWhiteRule", ModifyOwaspWhiteRuleResponse.class);
    }

    /**
     *更改防护等级
     * @param req ModifyProtectionLevelRequest
     * @return ModifyProtectionLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionLevelResponse ModifyProtectionLevel(ModifyProtectionLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectionLevel", ModifyProtectionLevelResponse.class);
    }

    /**
     *开启、关闭WAF开关
     * @param req ModifyProtectionStatusRequest
     * @return ModifyProtectionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionStatusResponse ModifyProtectionStatus(ModifyProtectionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectionStatus", ModifyProtectionStatusResponse.class);
    }

    /**
     *编辑SaaS型WAF域名配置
     * @param req ModifySpartaProtectionRequest
     * @return ModifySpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpartaProtectionResponse ModifySpartaProtection(ModifySpartaProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpartaProtection", ModifySpartaProtectionResponse.class);
    }

    /**
     *设置waf防护状态
     * @param req ModifySpartaProtectionModeRequest
     * @return ModifySpartaProtectionModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpartaProtectionModeResponse ModifySpartaProtectionMode(ModifySpartaProtectionModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpartaProtectionMode", ModifySpartaProtectionModeResponse.class);
    }

    /**
     *修改用户防护规则等级
     * @param req ModifyUserLevelRequest
     * @return ModifyUserLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserLevelResponse ModifyUserLevel(ModifyUserLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserLevel", ModifyUserLevelResponse.class);
    }

    /**
     *切换Tiga引擎规则类型的生效开关
     * @param req ModifyUserSignatureClassRequest
     * @return ModifyUserSignatureClassResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserSignatureClassResponse ModifyUserSignatureClass(ModifyUserSignatureClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserSignatureClass", ModifyUserSignatureClassResponse.class);
    }

    /**
     *修改用户防护规则，开启关闭具体的某条规则
     * @param req ModifyUserSignatureRuleRequest
     * @return ModifyUserSignatureRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserSignatureRuleResponse ModifyUserSignatureRule(ModifyUserSignatureRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserSignatureRule", ModifyUserSignatureRuleResponse.class);
    }

    /**
     *修改用户防护规则，开启关闭具体的某条规则
     * @param req ModifyUserSignatureRuleV2Request
     * @return ModifyUserSignatureRuleV2Response
     * @throws TencentCloudSDKException
     */
    public ModifyUserSignatureRuleV2Response ModifyUserSignatureRuleV2(ModifyUserSignatureRuleV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserSignatureRuleV2", ModifyUserSignatureRuleV2Response.class);
    }

    /**
     *修改ip惩罚规则
     * @param req ModifyWafAutoDenyRulesRequest
     * @return ModifyWafAutoDenyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafAutoDenyRulesResponse ModifyWafAutoDenyRules(ModifyWafAutoDenyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWafAutoDenyRules", ModifyWafAutoDenyRulesResponse.class);
    }

    /**
     *配置WAF威胁情报封禁模块详情
     * @param req ModifyWafThreatenIntelligenceRequest
     * @return ModifyWafThreatenIntelligenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafThreatenIntelligenceResponse ModifyWafThreatenIntelligence(ModifyWafThreatenIntelligenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWafThreatenIntelligence", ModifyWafThreatenIntelligenceResponse.class);
    }

    /**
     *设置域名的webshell状态。
     * @param req ModifyWebshellStatusRequest
     * @return ModifyWebshellStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebshellStatusResponse ModifyWebshellStatus(ModifyWebshellStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebshellStatus", ModifyWebshellStatusResponse.class);
    }

    /**
     *创建搜索下载攻击日志任务，使用CLS新版本的搜索下载getlog接口
     * @param req PostAttackDownloadTaskRequest
     * @return PostAttackDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public PostAttackDownloadTaskResponse PostAttackDownloadTask(PostAttackDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostAttackDownloadTask", PostAttackDownloadTaskResponse.class);
    }

    /**
     *查询该用户是否被加入了全局的bypass列表
     * @param req QueryBypassAllStatusRequest
     * @return QueryBypassAllStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryBypassAllStatusResponse QueryBypassAllStatus(QueryBypassAllStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryBypassAllStatus", QueryBypassAllStatusResponse.class);
    }

    /**
     *刷新接入检查的结果，后台会生成接入检查任务
     * @param req RefreshAccessCheckResultRequest
     * @return RefreshAccessCheckResultResponse
     * @throws TencentCloudSDKException
     */
    public RefreshAccessCheckResultResponse RefreshAccessCheckResult(RefreshAccessCheckResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshAccessCheckResult", RefreshAccessCheckResultResponse.class);
    }

    /**
     *删除一键bypass规则
     * @param req RemoveBypassAllRuleRequest
     * @return RemoveBypassAllRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBypassAllRuleResponse RemoveBypassAllRule(RemoveBypassAllRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveBypassAllRule", RemoveBypassAllRuleResponse.class);
    }

    /**
     *本接口用于搜索WAF访问日志
     * @param req SearchAccessLogRequest
     * @return SearchAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAccessLogResponse SearchAccessLog(SearchAccessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchAccessLog", SearchAccessLogResponse.class);
    }

    /**
     *新版本CLS接口存在参数变化，query改成了query_string支持lucence语法接口搜索查询。
     * @param req SearchAttackLogRequest
     * @return SearchAttackLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAttackLogResponse SearchAttackLog(SearchAttackLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchAttackLog", SearchAttackLogResponse.class);
    }

    /**
     *本接口用于检索分析日志，使用该接口时请注意如下事项：
1. 该接口除受默认接口请求频率限制外，针对单个日志主题，查询并发数不能超过15。
2. 检索语法建议使用CQL语法规则，请使用SyntaxRule参数，将值设置为1。
3. API返回数据包最大49MB，建议启用 gzip 压缩（HTTP Request Header Accept-Encoding:gzip）。
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
    }

    /**
     *切换域名的规则开关
     * @param req SwitchDomainRulesRequest
     * @return SwitchDomainRulesResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDomainRulesResponse SwitchDomainRules(SwitchDomainRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDomainRules", SwitchDomainRulesResponse.class);
    }

    /**
     *切换弹性的开关
     * @param req SwitchElasticModeRequest
     * @return SwitchElasticModeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchElasticModeResponse SwitchElasticMode(SwitchElasticModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchElasticMode", SwitchElasticModeResponse.class);
    }

    /**
     *更新Tiga引擎下大类规则的防护模式
     * @param req UpdateProtectionModesRequest
     * @return UpdateProtectionModesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProtectionModesResponse UpdateProtectionModes(UpdateProtectionModesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProtectionModes", UpdateProtectionModesResponse.class);
    }

    /**
     *更新自研版限流规则
     * @param req UpdateRateLimitV2Request
     * @return UpdateRateLimitV2Response
     * @throws TencentCloudSDKException
     */
    public UpdateRateLimitV2Response UpdateRateLimitV2(UpdateRateLimitV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRateLimitV2", UpdateRateLimitV2Response.class);
    }

    /**
     *编辑SAAS型接入的紧急CC防护状态
     * @param req UpsertCCAutoStatusRequest
     * @return UpsertCCAutoStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpsertCCAutoStatusResponse UpsertCCAutoStatus(UpsertCCAutoStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpsertCCAutoStatus", UpsertCCAutoStatusResponse.class);
    }

    /**
     *Waf  CC V2 Upsert接口
     * @param req UpsertCCRuleRequest
     * @return UpsertCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpsertCCRuleResponse UpsertCCRule(UpsertCCRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpsertCCRule", UpsertCCRuleResponse.class);
    }

    /**
     *Waf IP黑白名单Upsert接口（建议使用CreateIpAccessControl、ModifyIpAccessControl来替换当前接口）
     * @param req UpsertIpAccessControlRequest
     * @return UpsertIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public UpsertIpAccessControlResponse UpsertIpAccessControl(UpsertIpAccessControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpsertIpAccessControl", UpsertIpAccessControlResponse.class);
    }

    /**
     *Waf  会话定义 Upsert接口
     * @param req UpsertSessionRequest
     * @return UpsertSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpsertSessionResponse UpsertSession(UpsertSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpsertSession", UpsertSessionResponse.class);
    }

}
