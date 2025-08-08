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
package com.tencentcloudapi.dsgc.v20190723;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dsgc.v20190723.models.*;

public class DsgcClient extends AbstractClient{
    private static String endpoint = "dsgc.tencentcloudapi.com";
    private static String service = "dsgc";
    private static String version = "2019-07-23";

    public DsgcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DsgcClient(Credential credential, String region, ClientProfile profile) {
        super(DsgcClient.endpoint, DsgcClient.version, credential, region, profile);
    }

    /**
     *授权用户云资源
     * @param req AuthorizeDSPAMetaResourcesRequest
     * @return AuthorizeDSPAMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeDSPAMetaResourcesResponse AuthorizeDSPAMetaResources(AuthorizeDSPAMetaResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthorizeDSPAMetaResources", AuthorizeDSPAMetaResourcesResponse.class);
    }

    /**
     *绑定或解绑COS桶
     * @param req BindDSPAResourceCosBucketsRequest
     * @return BindDSPAResourceCosBucketsResponse
     * @throws TencentCloudSDKException
     */
    public BindDSPAResourceCosBucketsResponse BindDSPAResourceCosBuckets(BindDSPAResourceCosBucketsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDSPAResourceCosBuckets", BindDSPAResourceCosBucketsResponse.class);
    }

    /**
     *绑定或解绑数据库实例DB
     * @param req BindDSPAResourceDatabasesRequest
     * @return BindDSPAResourceDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public BindDSPAResourceDatabasesResponse BindDSPAResourceDatabases(BindDSPAResourceDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDSPAResourceDatabases", BindDSPAResourceDatabasesResponse.class);
    }

    /**
     *复制合规组模板
     * @param req CopyDSPATemplateRequest
     * @return CopyDSPATemplateResponse
     * @throws TencentCloudSDKException
     */
    public CopyDSPATemplateResponse CopyDSPATemplate(CopyDSPATemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyDSPATemplate", CopyDSPATemplateResponse.class);
    }

    /**
     *创建资产梳理报表导出重试任务
     * @param req CreateAssetSortingReportRetryTaskRequest
     * @return CreateAssetSortingReportRetryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSortingReportRetryTaskResponse CreateAssetSortingReportRetryTask(CreateAssetSortingReportRetryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetSortingReportRetryTask", CreateAssetSortingReportRetryTaskResponse.class);
    }

    /**
     *创建资产梳理报告任务
     * @param req CreateAssetSortingReportTaskRequest
     * @return CreateAssetSortingReportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSortingReportTaskResponse CreateAssetSortingReportTask(CreateAssetSortingReportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetSortingReportTask", CreateAssetSortingReportTaskResponse.class);
    }

    /**
     *风险项页面---创建风险等级
     * @param req CreateDSPAAssessmentRiskLevelRequest
     * @return CreateDSPAAssessmentRiskLevelResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAAssessmentRiskLevelResponse CreateDSPAAssessmentRiskLevel(CreateDSPAAssessmentRiskLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPAAssessmentRiskLevel", CreateDSPAAssessmentRiskLevelResponse.class);
    }

    /**
     *风险评估模板---创建风险评估模板
     * @param req CreateDSPAAssessmentRiskTemplateRequest
     * @return CreateDSPAAssessmentRiskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAAssessmentRiskTemplateResponse CreateDSPAAssessmentRiskTemplate(CreateDSPAAssessmentRiskTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPAAssessmentRiskTemplate", CreateDSPAAssessmentRiskTemplateResponse.class);
    }

    /**
     *新建DSPA风险评估任务
     * @param req CreateDSPAAssessmentTaskRequest
     * @return CreateDSPAAssessmentTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAAssessmentTaskResponse CreateDSPAAssessmentTask(CreateDSPAAssessmentTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPAAssessmentTask", CreateDSPAAssessmentTaskResponse.class);
    }

    /**
     *新增COS分类分级扫描任务，单个用户最多允许创建100个任务。
     * @param req CreateDSPACOSDiscoveryTaskRequest
     * @return CreateDSPACOSDiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACOSDiscoveryTaskResponse CreateDSPACOSDiscoveryTask(CreateDSPACOSDiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPACOSDiscoveryTask", CreateDSPACOSDiscoveryTaskResponse.class);
    }

    /**
     *新增分类，单个用户最多允许创建100个数据分类。
     * @param req CreateDSPACategoryRequest
     * @return CreateDSPACategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACategoryResponse CreateDSPACategory(CreateDSPACategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPACategory", CreateDSPACategoryResponse.class);
    }

    /**
     *创建分类关联关系
     * @param req CreateDSPACategoryRelationRequest
     * @return CreateDSPACategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACategoryRelationResponse CreateDSPACategoryRelation(CreateDSPACategoryRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPACategoryRelation", CreateDSPACategoryRelationResponse.class);
    }

    /**
     *新增分类分级模板，单个用户最多允许创建100个合规组。
     * @param req CreateDSPAComplianceGroupRequest
     * @return CreateDSPAComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAComplianceGroupResponse CreateDSPAComplianceGroup(CreateDSPAComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPAComplianceGroup", CreateDSPAComplianceGroupResponse.class);
    }

    /**
     *创建合规组分类规则关联关系
     * @param req CreateDSPAComplianceRulesRequest
     * @return CreateDSPAComplianceRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAComplianceRulesResponse CreateDSPAComplianceRules(CreateDSPAComplianceRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPAComplianceRules", CreateDSPAComplianceRulesResponse.class);
    }

    /**
     *添加COS元数据
     * @param req CreateDSPACosMetaResourcesRequest
     * @return CreateDSPACosMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACosMetaResourcesResponse CreateDSPACosMetaResources(CreateDSPACosMetaResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPACosMetaResources", CreateDSPACosMetaResourcesResponse.class);
    }

    /**
     *添加用户云上数据库类型资源
     * @param req CreateDSPADbMetaResourcesRequest
     * @return CreateDSPADbMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPADbMetaResourcesResponse CreateDSPADbMetaResources(CreateDSPADbMetaResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPADbMetaResources", CreateDSPADbMetaResourcesResponse.class);
    }

    /**
     *新增分类分级规则，单个用户最多允许创建200个规则。
     * @param req CreateDSPADiscoveryRuleRequest
     * @return CreateDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPADiscoveryRuleResponse CreateDSPADiscoveryRule(CreateDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPADiscoveryRule", CreateDSPADiscoveryRuleResponse.class);
    }

    /**
     *新增分类分级任务，单个用户最多允许创建100个任务。
     * @param req CreateDSPADiscoveryTaskRequest
     * @return CreateDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPADiscoveryTaskResponse CreateDSPADiscoveryTask(CreateDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPADiscoveryTask", CreateDSPADiscoveryTaskResponse.class);
    }

    /**
     *新增分级，单个Casb实例最多允许创建100个数据分级
     * @param req CreateDSPALevelGroupRequest
     * @return CreateDSPALevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPALevelGroupResponse CreateDSPALevelGroup(CreateDSPALevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPALevelGroup", CreateDSPALevelGroupResponse.class);
    }

    /**
     *添加用户云上资源列表
     * @param req CreateDSPAMetaResourcesRequest
     * @return CreateDSPAMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAMetaResourcesResponse CreateDSPAMetaResources(CreateDSPAMetaResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPAMetaResources", CreateDSPAMetaResourcesResponse.class);
    }

    /**
     *新建用户自建云资源
     * @param req CreateDSPASelfBuildMetaResourceRequest
     * @return CreateDSPASelfBuildMetaResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPASelfBuildMetaResourceResponse CreateDSPASelfBuildMetaResource(CreateDSPASelfBuildMetaResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDSPASelfBuildMetaResource", CreateDSPASelfBuildMetaResourceResponse.class);
    }

    /**
     *创建规则别名
     * @param req CreateIdentifyRuleAnotherNameRequest
     * @return CreateIdentifyRuleAnotherNameResponse
     * @throws TencentCloudSDKException
     */
    public CreateIdentifyRuleAnotherNameResponse CreateIdentifyRuleAnotherName(CreateIdentifyRuleAnotherNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIdentifyRuleAnotherName", CreateIdentifyRuleAnotherNameResponse.class);
    }

    /**
     *风险等级的定义页面-创建风险等级的时候生成的一个默认的矩阵
     * @param req DecribeSuggestRiskLevelMatrixRequest
     * @return DecribeSuggestRiskLevelMatrixResponse
     * @throws TencentCloudSDKException
     */
    public DecribeSuggestRiskLevelMatrixResponse DecribeSuggestRiskLevelMatrix(DecribeSuggestRiskLevelMatrixRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DecribeSuggestRiskLevelMatrix", DecribeSuggestRiskLevelMatrixResponse.class);
    }

    /**
     *本接口（DeleteCOSMetaData）用于删除COS元数据信息。
     * @param req DeleteCosMetaResourceRequest
     * @return DeleteCosMetaResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCosMetaResourceResponse DeleteCosMetaResource(DeleteCosMetaResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCosMetaResource", DeleteCosMetaResourceResponse.class);
    }

    /**
     *删除DSPA风险评估任务
     * @param req DeleteDSPAAssessmentTaskRequest
     * @return DeleteDSPAAssessmentTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPAAssessmentTaskResponse DeleteDSPAAssessmentTask(DeleteDSPAAssessmentTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDSPAAssessmentTask", DeleteDSPAAssessmentTaskResponse.class);
    }

    /**
     *删除COS分类分级任务，该接口只有在任务状态为以下几个状态值时才支持正确删除：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败
     * @param req DeleteDSPACOSDiscoveryTaskRequest
     * @return DeleteDSPACOSDiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPACOSDiscoveryTaskResponse DeleteDSPACOSDiscoveryTask(DeleteDSPACOSDiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDSPACOSDiscoveryTask", DeleteDSPACOSDiscoveryTaskResponse.class);
    }

    /**
     *删除COS分类分级任务结果
     * @param req DeleteDSPACOSDiscoveryTaskResultRequest
     * @return DeleteDSPACOSDiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPACOSDiscoveryTaskResultResponse DeleteDSPACOSDiscoveryTaskResult(DeleteDSPACOSDiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDSPACOSDiscoveryTaskResult", DeleteDSPACOSDiscoveryTaskResultResponse.class);
    }

    /**
     *删除分类分级识别任务，该接口只有在任务状态为以下几个状态值时才支持正确删除：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败
     * @param req DeleteDSPADiscoveryTaskRequest
     * @return DeleteDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPADiscoveryTaskResponse DeleteDSPADiscoveryTask(DeleteDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDSPADiscoveryTask", DeleteDSPADiscoveryTaskResponse.class);
    }

    /**
     *删除分类分级识别任务结果
     * @param req DeleteDSPADiscoveryTaskResultRequest
     * @return DeleteDSPADiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPADiscoveryTaskResultResponse DeleteDSPADiscoveryTaskResult(DeleteDSPADiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDSPADiscoveryTaskResult", DeleteDSPADiscoveryTaskResultResponse.class);
    }

    /**
     *删除用户云资源
     * @param req DeleteDSPAMetaResourceRequest
     * @return DeleteDSPAMetaResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPAMetaResourceResponse DeleteDSPAMetaResource(DeleteDSPAMetaResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDSPAMetaResource", DeleteDSPAMetaResourceResponse.class);
    }

    /**
     *查询敏感数据导出结果URL
     * @param req DescribeAssetDetailDataExportResultRequest
     * @return DescribeAssetDetailDataExportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailDataExportResultResponse DescribeAssetDetailDataExportResult(DescribeAssetDetailDataExportResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDetailDataExportResult", DescribeAssetDetailDataExportResultResponse.class);
    }

    /**
     *数据资产报告页面-查询数据资产概览接口（包括数据库资产详情和存储资产详情）
     * @param req DescribeAssetOverviewRequest
     * @return DescribeAssetOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetOverviewResponse DescribeAssetOverview(DescribeAssetOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetOverview", DescribeAssetOverviewResponse.class);
    }

    /**
     *查询DB绑定的列表
     * @param req DescribeBindDBListRequest
     * @return DescribeBindDBListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindDBListResponse DescribeBindDBList(DescribeBindDBListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindDBList", DescribeBindDBListResponse.class);
    }

    /**
     *数据资产报告-查询cos的资产分布详情接口
     * @param req DescribeCOSAssetSensitiveDistributionRequest
     * @return DescribeCOSAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCOSAssetSensitiveDistributionResponse DescribeCOSAssetSensitiveDistribution(DescribeCOSAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCOSAssetSensitiveDistribution", DescribeCOSAssetSensitiveDistributionResponse.class);
    }

    /**
     *查询高风险资产的top10
     * @param req DescribeDSPAAssessmentHighRiskTop10OverviewRequest
     * @return DescribeDSPAAssessmentHighRiskTop10OverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentHighRiskTop10OverviewResponse DescribeDSPAAssessmentHighRiskTop10Overview(DescribeDSPAAssessmentHighRiskTop10OverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentHighRiskTop10Overview", DescribeDSPAAssessmentHighRiskTop10OverviewResponse.class);
    }

    /**
     *查询最新风险项详情数据
     * @param req DescribeDSPAAssessmentLatestRiskDetailInfoRequest
     * @return DescribeDSPAAssessmentLatestRiskDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentLatestRiskDetailInfoResponse DescribeDSPAAssessmentLatestRiskDetailInfo(DescribeDSPAAssessmentLatestRiskDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentLatestRiskDetailInfo", DescribeDSPAAssessmentLatestRiskDetailInfoResponse.class);
    }

    /**
     *查询最新的风险详情列表数据
     * @param req DescribeDSPAAssessmentLatestRiskListRequest
     * @return DescribeDSPAAssessmentLatestRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentLatestRiskListResponse DescribeDSPAAssessmentLatestRiskList(DescribeDSPAAssessmentLatestRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentLatestRiskList", DescribeDSPAAssessmentLatestRiskListResponse.class);
    }

    /**
     *风险概览-查询新发现风险统计数
     * @param req DescribeDSPAAssessmentNewDiscoveredRiskOverviewRequest
     * @return DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse DescribeDSPAAssessmentNewDiscoveredRiskOverview(DescribeDSPAAssessmentNewDiscoveredRiskOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentNewDiscoveredRiskOverview", DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse.class);
    }

    /**
     *风险概览-查询待处理风险统计数
     * @param req DescribeDSPAAssessmentPendingRiskOverviewRequest
     * @return DescribeDSPAAssessmentPendingRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentPendingRiskOverviewResponse DescribeDSPAAssessmentPendingRiskOverview(DescribeDSPAAssessmentPendingRiskOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentPendingRiskOverview", DescribeDSPAAssessmentPendingRiskOverviewResponse.class);
    }

    /**
     *风险概览-查询处理中风险统计数
     * @param req DescribeDSPAAssessmentProcessingRiskOverviewRequest
     * @return DescribeDSPAAssessmentProcessingRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentProcessingRiskOverviewResponse DescribeDSPAAssessmentProcessingRiskOverview(DescribeDSPAAssessmentProcessingRiskOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentProcessingRiskOverview", DescribeDSPAAssessmentProcessingRiskOverviewResponse.class);
    }

    /**
     *风险概览页风险数量和受影响资产数概览统计
     * @param req DescribeDSPAAssessmentRiskAmountOverviewRequest
     * @return DescribeDSPAAssessmentRiskAmountOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskAmountOverviewResponse DescribeDSPAAssessmentRiskAmountOverview(DescribeDSPAAssessmentRiskAmountOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskAmountOverview", DescribeDSPAAssessmentRiskAmountOverviewResponse.class);
    }

    /**
     *受影响资产TOP5统计
     * @param req DescribeDSPAAssessmentRiskDatasourceTop5Request
     * @return DescribeDSPAAssessmentRiskDatasourceTop5Response
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDatasourceTop5Response DescribeDSPAAssessmentRiskDatasourceTop5(DescribeDSPAAssessmentRiskDatasourceTop5Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskDatasourceTop5", DescribeDSPAAssessmentRiskDatasourceTop5Response.class);
    }

    /**
     *遗留待处理&昨日完成风险处置概览统计
     * @param req DescribeDSPAAssessmentRiskDealedOverviewRequest
     * @return DescribeDSPAAssessmentRiskDealedOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDealedOverviewResponse DescribeDSPAAssessmentRiskDealedOverview(DescribeDSPAAssessmentRiskDealedOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskDealedOverview", DescribeDSPAAssessmentRiskDealedOverviewResponse.class);
    }

    /**
     *风险项处理趋势统计
     * @param req DescribeDSPAAssessmentRiskDealedTrendRequest
     * @return DescribeDSPAAssessmentRiskDealedTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDealedTrendResponse DescribeDSPAAssessmentRiskDealedTrend(DescribeDSPAAssessmentRiskDealedTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskDealedTrend", DescribeDSPAAssessmentRiskDealedTrendResponse.class);
    }

    /**
     *查询风险分布数据，包含风险类型分布，风险详情分布，风险资产的分布
     * @param req DescribeDSPAAssessmentRiskDistributionOverviewRequest
     * @return DescribeDSPAAssessmentRiskDistributionOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDistributionOverviewResponse DescribeDSPAAssessmentRiskDistributionOverview(DescribeDSPAAssessmentRiskDistributionOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskDistributionOverview", DescribeDSPAAssessmentRiskDistributionOverviewResponse.class);
    }

    /**
     *风险分类TOP5统计
     * @param req DescribeDSPAAssessmentRiskItemTop5Request
     * @return DescribeDSPAAssessmentRiskItemTop5Response
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskItemTop5Response DescribeDSPAAssessmentRiskItemTop5(DescribeDSPAAssessmentRiskItemTop5Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskItemTop5", DescribeDSPAAssessmentRiskItemTop5Response.class);
    }

    /**
     *风险项页面----查询风险等级的详情数据
     * @param req DescribeDSPAAssessmentRiskLevelDetailRequest
     * @return DescribeDSPAAssessmentRiskLevelDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskLevelDetailResponse DescribeDSPAAssessmentRiskLevelDetail(DescribeDSPAAssessmentRiskLevelDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskLevelDetail", DescribeDSPAAssessmentRiskLevelDetailResponse.class);
    }

    /**
     *风险项页面----查询风险等级的列表
     * @param req DescribeDSPAAssessmentRiskLevelListRequest
     * @return DescribeDSPAAssessmentRiskLevelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskLevelListResponse DescribeDSPAAssessmentRiskLevelList(DescribeDSPAAssessmentRiskLevelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskLevelList", DescribeDSPAAssessmentRiskLevelListResponse.class);
    }

    /**
     *风险级别趋势统计
     * @param req DescribeDSPAAssessmentRiskLevelTrendRequest
     * @return DescribeDSPAAssessmentRiskLevelTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskLevelTrendResponse DescribeDSPAAssessmentRiskLevelTrend(DescribeDSPAAssessmentRiskLevelTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskLevelTrend", DescribeDSPAAssessmentRiskLevelTrendResponse.class);
    }

    /**
     *风险数量概览统计
     * @param req DescribeDSPAAssessmentRiskOverviewRequest
     * @return DescribeDSPAAssessmentRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskOverviewResponse DescribeDSPAAssessmentRiskOverview(DescribeDSPAAssessmentRiskOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskOverview", DescribeDSPAAssessmentRiskOverviewResponse.class);
    }

    /**
     *查询风险的处理历史
     * @param req DescribeDSPAAssessmentRiskProcessHistoryRequest
     * @return DescribeDSPAAssessmentRiskProcessHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskProcessHistoryResponse DescribeDSPAAssessmentRiskProcessHistory(DescribeDSPAAssessmentRiskProcessHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskProcessHistory", DescribeDSPAAssessmentRiskProcessHistoryResponse.class);
    }

    /**
     *风险评估概览页，查询风险面的分布
     * @param req DescribeDSPAAssessmentRiskSideDistributedRequest
     * @return DescribeDSPAAssessmentRiskSideDistributedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskSideDistributedResponse DescribeDSPAAssessmentRiskSideDistributed(DescribeDSPAAssessmentRiskSideDistributedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskSideDistributed", DescribeDSPAAssessmentRiskSideDistributedResponse.class);
    }

    /**
     *风险评估概览页，查询风险面的分布
     * @param req DescribeDSPAAssessmentRiskSideListRequest
     * @return DescribeDSPAAssessmentRiskSideListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskSideListResponse DescribeDSPAAssessmentRiskSideList(DescribeDSPAAssessmentRiskSideListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskSideList", DescribeDSPAAssessmentRiskSideListResponse.class);
    }

    /**
     *风险项页面--查看评估模板详情
     * @param req DescribeDSPAAssessmentRiskTemplateDetailRequest
     * @return DescribeDSPAAssessmentRiskTemplateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskTemplateDetailResponse DescribeDSPAAssessmentRiskTemplateDetail(DescribeDSPAAssessmentRiskTemplateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskTemplateDetail", DescribeDSPAAssessmentRiskTemplateDetailResponse.class);
    }

    /**
     *风险模板页面--查询风险模板中的脆弱项配置
     * @param req DescribeDSPAAssessmentRiskTemplateVulnerableListRequest
     * @return DescribeDSPAAssessmentRiskTemplateVulnerableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskTemplateVulnerableListResponse DescribeDSPAAssessmentRiskTemplateVulnerableList(DescribeDSPAAssessmentRiskTemplateVulnerableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRiskTemplateVulnerableList", DescribeDSPAAssessmentRiskTemplateVulnerableListResponse.class);
    }

    /**
     *获取DSPA评估风险项列表
     * @param req DescribeDSPAAssessmentRisksRequest
     * @return DescribeDSPAAssessmentRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRisksResponse DescribeDSPAAssessmentRisks(DescribeDSPAAssessmentRisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentRisks", DescribeDSPAAssessmentRisksResponse.class);
    }

    /**
     *获取DSPA评估任务列表
     * @param req DescribeDSPAAssessmentTasksRequest
     * @return DescribeDSPAAssessmentTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentTasksResponse DescribeDSPAAssessmentTasks(DescribeDSPAAssessmentTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentTasks", DescribeDSPAAssessmentTasksResponse.class);
    }

    /**
     *获取DSPA评估模板关联的评估控制项列表
     * @param req DescribeDSPAAssessmentTemplateControlItemsRequest
     * @return DescribeDSPAAssessmentTemplateControlItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentTemplateControlItemsResponse DescribeDSPAAssessmentTemplateControlItems(DescribeDSPAAssessmentTemplateControlItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentTemplateControlItems", DescribeDSPAAssessmentTemplateControlItemsResponse.class);
    }

    /**
     *获取DSPA评估模板列表
     * @param req DescribeDSPAAssessmentTemplatesRequest
     * @return DescribeDSPAAssessmentTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentTemplatesResponse DescribeDSPAAssessmentTemplates(DescribeDSPAAssessmentTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAAssessmentTemplates", DescribeDSPAAssessmentTemplatesResponse.class);
    }

    /**
     *获取COS敏感数据资产桶列表
     * @param req DescribeDSPACOSDataAssetBucketsRequest
     * @return DescribeDSPACOSDataAssetBucketsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDataAssetBucketsResponse DescribeDSPACOSDataAssetBuckets(DescribeDSPACOSDataAssetBucketsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDataAssetBuckets", DescribeDSPACOSDataAssetBucketsResponse.class);
    }

    /**
     *获取COS单个模板下的敏感数据资产
     * @param req DescribeDSPACOSDataAssetByComplianceIdRequest
     * @return DescribeDSPACOSDataAssetByComplianceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDataAssetByComplianceIdResponse DescribeDSPACOSDataAssetByComplianceId(DescribeDSPACOSDataAssetByComplianceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDataAssetByComplianceId", DescribeDSPACOSDataAssetByComplianceIdResponse.class);
    }

    /**
     *获取COS分类分级数据资产详情
     * @param req DescribeDSPACOSDataAssetDetailRequest
     * @return DescribeDSPACOSDataAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDataAssetDetailResponse DescribeDSPACOSDataAssetDetail(DescribeDSPACOSDataAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDataAssetDetail", DescribeDSPACOSDataAssetDetailResponse.class);
    }

    /**
     *获取COS分类分级任务详情
     * @param req DescribeDSPACOSDiscoveryTaskDetailRequest
     * @return DescribeDSPACOSDiscoveryTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTaskDetailResponse DescribeDSPACOSDiscoveryTaskDetail(DescribeDSPACOSDiscoveryTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDiscoveryTaskDetail", DescribeDSPACOSDiscoveryTaskDetailResponse.class);
    }

    /**
     *获取COS分类分级任务结果详情文件列表
     * @param req DescribeDSPACOSDiscoveryTaskFilesRequest
     * @return DescribeDSPACOSDiscoveryTaskFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTaskFilesResponse DescribeDSPACOSDiscoveryTaskFiles(DescribeDSPACOSDiscoveryTaskFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDiscoveryTaskFiles", DescribeDSPACOSDiscoveryTaskFilesResponse.class);
    }

    /**
     *获取COS分类分级任务结果，该接口只有在任务状态为以下状态时才支持结果正常查询：
3 扫描成功，
4 扫描失败
     * @param req DescribeDSPACOSDiscoveryTaskResultRequest
     * @return DescribeDSPACOSDiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTaskResultResponse DescribeDSPACOSDiscoveryTaskResult(DescribeDSPACOSDiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDiscoveryTaskResult", DescribeDSPACOSDiscoveryTaskResultResponse.class);
    }

    /**
     *获取COS分类分级任务列表
     * @param req DescribeDSPACOSDiscoveryTasksRequest
     * @return DescribeDSPACOSDiscoveryTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTasksResponse DescribeDSPACOSDiscoveryTasks(DescribeDSPACOSDiscoveryTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSDiscoveryTasks", DescribeDSPACOSDiscoveryTasksResponse.class);
    }

    /**
     *获取COS分类分级任务结果详情，该接口只有在任务状态为时才支持结果正确查询：
3 扫描成功
     * @param req DescribeDSPACOSTaskResultDetailRequest
     * @return DescribeDSPACOSTaskResultDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSTaskResultDetailResponse DescribeDSPACOSTaskResultDetail(DescribeDSPACOSTaskResultDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACOSTaskResultDetail", DescribeDSPACOSTaskResultDetailResponse.class);
    }

    /**
     *获取敏感数据分类列表
     * @param req DescribeDSPACategoriesRequest
     * @return DescribeDSPACategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoriesResponse DescribeDSPACategories(DescribeDSPACategoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACategories", DescribeDSPACategoriesResponse.class);
    }

    /**
     *获取分类规则统计信息
     * @param req DescribeDSPACategoryRuleStatisticRequest
     * @return DescribeDSPACategoryRuleStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryRuleStatisticResponse DescribeDSPACategoryRuleStatistic(DescribeDSPACategoryRuleStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACategoryRuleStatistic", DescribeDSPACategoryRuleStatisticResponse.class);
    }

    /**
     *获取合规组分类规则信息
     * @param req DescribeDSPACategoryRulesRequest
     * @return DescribeDSPACategoryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryRulesResponse DescribeDSPACategoryRules(DescribeDSPACategoryRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACategoryRules", DescribeDSPACategoryRulesResponse.class);
    }

    /**
     *获取分类树信息
     * @param req DescribeDSPACategoryTreeRequest
     * @return DescribeDSPACategoryTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryTreeResponse DescribeDSPACategoryTree(DescribeDSPACategoryTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACategoryTree", DescribeDSPACategoryTreeResponse.class);
    }

    /**
     *获取分类规则树信息
     * @param req DescribeDSPACategoryTreeWithRulesRequest
     * @return DescribeDSPACategoryTreeWithRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryTreeWithRulesResponse DescribeDSPACategoryTreeWithRules(DescribeDSPACategoryTreeWithRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPACategoryTreeWithRules", DescribeDSPACategoryTreeWithRulesResponse.class);
    }

    /**
     *获取模板详情信息
     * @param req DescribeDSPAComplianceGroupDetailRequest
     * @return DescribeDSPAComplianceGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAComplianceGroupDetailResponse DescribeDSPAComplianceGroupDetail(DescribeDSPAComplianceGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAComplianceGroupDetail", DescribeDSPAComplianceGroupDetailResponse.class);
    }

    /**
     *获取分类分级模板列表
     * @param req DescribeDSPAComplianceGroupsRequest
     * @return DescribeDSPAComplianceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAComplianceGroupsResponse DescribeDSPAComplianceGroups(DescribeDSPAComplianceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAComplianceGroups", DescribeDSPAComplianceGroupsResponse.class);
    }

    /**
     *获取模板更新提示信息
     * @param req DescribeDSPAComplianceUpdateNotificationRequest
     * @return DescribeDSPAComplianceUpdateNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAComplianceUpdateNotificationResponse DescribeDSPAComplianceUpdateNotification(DescribeDSPAComplianceUpdateNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAComplianceUpdateNotification", DescribeDSPAComplianceUpdateNotificationResponse.class);
    }

    /**
     *获取数据源的数据库信息
     * @param req DescribeDSPADataSourceDbInfoRequest
     * @return DescribeDSPADataSourceDbInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADataSourceDbInfoResponse DescribeDSPADataSourceDbInfo(DescribeDSPADataSourceDbInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADataSourceDbInfo", DescribeDSPADataSourceDbInfoResponse.class);
    }

    /**
     *获取分类分级规则列表
     * @param req DescribeDSPADiscoveryRulesRequest
     * @return DescribeDSPADiscoveryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryRulesResponse DescribeDSPADiscoveryRules(DescribeDSPADiscoveryRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryRules", DescribeDSPADiscoveryRulesResponse.class);
    }

    /**
     *用于查询该用户是否已开通分类分级服务
     * @param req DescribeDSPADiscoveryServiceStatusRequest
     * @return DescribeDSPADiscoveryServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryServiceStatusResponse DescribeDSPADiscoveryServiceStatus(DescribeDSPADiscoveryServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryServiceStatus", DescribeDSPADiscoveryServiceStatusResponse.class);
    }

    /**
     *获取分类分级任务详情
     * @param req DescribeDSPADiscoveryTaskDetailRequest
     * @return DescribeDSPADiscoveryTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskDetailResponse DescribeDSPADiscoveryTaskDetail(DescribeDSPADiscoveryTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryTaskDetail", DescribeDSPADiscoveryTaskDetailResponse.class);
    }

    /**
     *获取分类分级任务结果，该接口只有在任务状态为以下状态时才支持结果正常查询：3 扫描成功，4 扫描失败
     * @param req DescribeDSPADiscoveryTaskResultRequest
     * @return DescribeDSPADiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskResultResponse DescribeDSPADiscoveryTaskResult(DescribeDSPADiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryTaskResult", DescribeDSPADiscoveryTaskResultResponse.class);
    }

    /**
     *获取分类分级任务结果详情，该接口只有在任务状态为时才支持结果正确查询：
3 扫描成功
     * @param req DescribeDSPADiscoveryTaskResultDetailRequest
     * @return DescribeDSPADiscoveryTaskResultDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskResultDetailResponse DescribeDSPADiscoveryTaskResultDetail(DescribeDSPADiscoveryTaskResultDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryTaskResultDetail", DescribeDSPADiscoveryTaskResultDetailResponse.class);
    }

    /**
     *获取分级分级扫描的表集合
     * @param req DescribeDSPADiscoveryTaskTablesRequest
     * @return DescribeDSPADiscoveryTaskTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskTablesResponse DescribeDSPADiscoveryTaskTables(DescribeDSPADiscoveryTaskTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryTaskTables", DescribeDSPADiscoveryTaskTablesResponse.class);
    }

    /**
     *获取分类分级任务列表
     * @param req DescribeDSPADiscoveryTasksRequest
     * @return DescribeDSPADiscoveryTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTasksResponse DescribeDSPADiscoveryTasks(DescribeDSPADiscoveryTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPADiscoveryTasks", DescribeDSPADiscoveryTasksResponse.class);
    }

    /**
     *根据合规组id，去查询ES的概览页统计数据
     * @param req DescribeDSPAESDataAssetByComplianceIdRequest
     * @return DescribeDSPAESDataAssetByComplianceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDataAssetByComplianceIdResponse DescribeDSPAESDataAssetByComplianceId(DescribeDSPAESDataAssetByComplianceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAESDataAssetByComplianceId", DescribeDSPAESDataAssetByComplianceIdResponse.class);
    }

    /**
     *根据合规组id，去查询ES的概览页下的统计列表数据
     * @param req DescribeDSPAESDataAssetDetailRequest
     * @return DescribeDSPAESDataAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDataAssetDetailResponse DescribeDSPAESDataAssetDetail(DescribeDSPAESDataAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAESDataAssetDetail", DescribeDSPAESDataAssetDetailResponse.class);
    }

    /**
     *获取ES扫描结果数据样本
     * @param req DescribeDSPAESDataSampleRequest
     * @return DescribeDSPAESDataSampleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDataSampleResponse DescribeDSPAESDataSample(DescribeDSPAESDataSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAESDataSample", DescribeDSPAESDataSampleResponse.class);
    }

    /**
     *获取ES的分类分级任务结果详情，该接口只有在任务状态为时才支持结果正确查询：
3 扫描成功
     * @param req DescribeDSPAESDiscoveryTaskResultDetailRequest
     * @return DescribeDSPAESDiscoveryTaskResultDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDiscoveryTaskResultDetailResponse DescribeDSPAESDiscoveryTaskResultDetail(DescribeDSPAESDiscoveryTaskResultDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPAESDiscoveryTaskResultDetail", DescribeDSPAESDiscoveryTaskResultDetailResponse.class);
    }

    /**
     *获取分级详情
     * @param req DescribeDSPALevelDetailRequest
     * @return DescribeDSPALevelDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPALevelDetailResponse DescribeDSPALevelDetail(DescribeDSPALevelDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPALevelDetail", DescribeDSPALevelDetailResponse.class);
    }

    /**
     *获取分级列表，限制100个 不分页返回
     * @param req DescribeDSPALevelGroupsRequest
     * @return DescribeDSPALevelGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPALevelGroupsResponse DescribeDSPALevelGroups(DescribeDSPALevelGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPALevelGroups", DescribeDSPALevelGroupsResponse.class);
    }

    /**
     *获取单个合规组下的RDB关系数据库分类分级数据资产
     * @param req DescribeDSPARDBDataAssetByComplianceIdRequest
     * @return DescribeDSPARDBDataAssetByComplianceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPARDBDataAssetByComplianceIdResponse DescribeDSPARDBDataAssetByComplianceId(DescribeDSPARDBDataAssetByComplianceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPARDBDataAssetByComplianceId", DescribeDSPARDBDataAssetByComplianceIdResponse.class);
    }

    /**
     *获取RDB关系数据库分类分级资产详情
     * @param req DescribeDSPARDBDataAssetDetailRequest
     * @return DescribeDSPARDBDataAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPARDBDataAssetDetailResponse DescribeDSPARDBDataAssetDetail(DescribeDSPARDBDataAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPARDBDataAssetDetail", DescribeDSPARDBDataAssetDetailResponse.class);
    }

    /**
     *拉取DSPA支持的Meta元数据类型，返回包括：元数据类型，支持的元数据地域信息
     * @param req DescribeDSPASupportedMetasRequest
     * @return DescribeDSPASupportedMetasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPASupportedMetasResponse DescribeDSPASupportedMetas(DescribeDSPASupportedMetasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPASupportedMetas", DescribeDSPASupportedMetasResponse.class);
    }

    /**
     *获取扫描结果数据样本
     * @param req DescribeDSPATaskResultDataSampleRequest
     * @return DescribeDSPATaskResultDataSampleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPATaskResultDataSampleResponse DescribeDSPATaskResultDataSample(DescribeDSPATaskResultDataSampleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDSPATaskResultDataSample", DescribeDSPATaskResultDataSampleResponse.class);
    }

    /**
     *数据资产报告-查询es的敏感资产报告，包含（数据库资产，设敏级别数据库top10，资产详情）
     * @param req DescribeESAssetSensitiveDistributionRequest
     * @return DescribeESAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAssetSensitiveDistributionResponse DescribeESAssetSensitiveDistribution(DescribeESAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeESAssetSensitiveDistribution", DescribeESAssetSensitiveDistributionResponse.class);
    }

    /**
     *获取导出任务结果
     * @param req DescribeExportTaskResultRequest
     * @return DescribeExportTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportTaskResultResponse DescribeExportTaskResult(DescribeExportTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportTaskResult", DescribeExportTaskResultResponse.class);
    }

    /**
     *数据资产报告-查询mongo 的敏感资产报告，包含（数据库资产，设敏级别数据库top10，资产详情）
     * @param req DescribeMongoAssetSensitiveDistributionRequest
     * @return DescribeMongoAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMongoAssetSensitiveDistributionResponse DescribeMongoAssetSensitiveDistribution(DescribeMongoAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMongoAssetSensitiveDistribution", DescribeMongoAssetSensitiveDistributionResponse.class);
    }

    /**
     *数据资产报告-查询rbd 的敏感资产报告，包含（数据库资产，设敏级别数据库top10，资产详情）
     * @param req DescribeRDBAssetSensitiveDistributionRequest
     * @return DescribeRDBAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRDBAssetSensitiveDistributionResponse DescribeRDBAssetSensitiveDistribution(DescribeRDBAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRDBAssetSensitiveDistribution", DescribeRDBAssetSensitiveDistributionResponse.class);
    }

    /**
     *获取报表下载链接
     * @param req DescribeReportTaskDownloadUrlRequest
     * @return DescribeReportTaskDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTaskDownloadUrlResponse DescribeReportTaskDownloadUrl(DescribeReportTaskDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportTaskDownloadUrl", DescribeReportTaskDownloadUrlResponse.class);
    }

    /**
     *获取资产报表任务列表
     * @param req DescribeReportTasksRequest
     * @return DescribeReportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTasksResponse DescribeReportTasks(DescribeReportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportTasks", DescribeReportTasksResponse.class);
    }

    /**
     *数据资产报告-查询cos的敏感数据分布（分级分布 分类分布 敏感规则分布详情列表）
     * @param req DescribeSensitiveCOSDataDistributionRequest
     * @return DescribeSensitiveCOSDataDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveCOSDataDistributionResponse DescribeSensitiveCOSDataDistribution(DescribeSensitiveCOSDataDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveCOSDataDistribution", DescribeSensitiveCOSDataDistributionResponse.class);
    }

    /**
     *数据资产报告-查询rdb的敏感数据分布-敏感规则字段分布-敏感分布详情
     * @param req DescribeSensitiveRDBDataDistributionRequest
     * @return DescribeSensitiveRDBDataDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveRDBDataDistributionResponse DescribeSensitiveRDBDataDistribution(DescribeSensitiveRDBDataDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveRDBDataDistribution", DescribeSensitiveRDBDataDistributionResponse.class);
    }

    /**
     *取消用户云资源授权
     * @param req DisableDSPAMetaResourceAuthRequest
     * @return DisableDSPAMetaResourceAuthResponse
     * @throws TencentCloudSDKException
     */
    public DisableDSPAMetaResourceAuthResponse DisableDSPAMetaResourceAuth(DisableDSPAMetaResourceAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableDSPAMetaResourceAuth", DisableDSPAMetaResourceAuthResponse.class);
    }

    /**
     *打开或者关闭分类分级规则
注：此API同时对该规则下的RDB跟COS规则操作。
     * @param req EnableDSPADiscoveryRuleRequest
     * @return EnableDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableDSPADiscoveryRuleResponse EnableDSPADiscoveryRule(EnableDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableDSPADiscoveryRule", EnableDSPADiscoveryRuleResponse.class);
    }

    /**
     *启用版本体验
     * @param req EnableTrialVersionRequest
     * @return EnableTrialVersionResponse
     * @throws TencentCloudSDKException
     */
    public EnableTrialVersionResponse EnableTrialVersion(EnableTrialVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTrialVersion", EnableTrialVersionResponse.class);
    }

    /**
     *创建敏感数据导出任务
     * @param req ExportAssetDetailDataRequest
     * @return ExportAssetDetailDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetDetailDataResponse ExportAssetDetailData(ExportAssetDetailDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetDetailData", ExportAssetDetailDataResponse.class);
    }

    /**
     *获取授权资源的连接状态
     * @param req GetResourceConnectionStatusRequest
     * @return GetResourceConnectionStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceConnectionStatusResponse GetResourceConnectionStatus(GetResourceConnectionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetResourceConnectionStatus", GetResourceConnectionStatusResponse.class);
    }

    /**
     *获取体验版本信息
     * @param req GetTrialVersionRequest
     * @return GetTrialVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetTrialVersionResponse GetTrialVersion(GetTrialVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTrialVersion", GetTrialVersionResponse.class);
    }

    /**
     *获取用户购买配额信息
     * @param req GetUserQuotaInfoRequest
     * @return GetUserQuotaInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetUserQuotaInfoResponse GetUserQuotaInfo(GetUserQuotaInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUserQuotaInfo", GetUserQuotaInfoResponse.class);
    }

    /**
     *拉取DSPA集群列表
     * @param req ListDSPAClustersRequest
     * @return ListDSPAClustersResponse
     * @throws TencentCloudSDKException
     */
    public ListDSPAClustersResponse ListDSPAClusters(ListDSPAClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDSPAClusters", ListDSPAClustersResponse.class);
    }

    /**
     *本接口用于获取COS元数据信息，返回COS元数据信息列表。
     * @param req ListDSPACosMetaResourcesRequest
     * @return ListDSPACosMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDSPACosMetaResourcesResponse ListDSPACosMetaResources(ListDSPACosMetaResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDSPACosMetaResources", ListDSPACosMetaResourcesResponse.class);
    }

    /**
     *拉取用户云资源
     * @param req ListDSPAMetaResourcesRequest
     * @return ListDSPAMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDSPAMetaResourcesResponse ListDSPAMetaResources(ListDSPAMetaResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDSPAMetaResources", ListDSPAMetaResourcesResponse.class);
    }

    /**
     *修改DSPA评估风险项，支持修改Status
     * @param req ModifyDSPAAssessmentRiskRequest
     * @return ModifyDSPAAssessmentRiskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskResponse ModifyDSPAAssessmentRisk(ModifyDSPAAssessmentRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAAssessmentRisk", ModifyDSPAAssessmentRiskResponse.class);
    }

    /**
     *修改最新评估风险项状态
     * @param req ModifyDSPAAssessmentRiskLatestRequest
     * @return ModifyDSPAAssessmentRiskLatestResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskLatestResponse ModifyDSPAAssessmentRiskLatest(ModifyDSPAAssessmentRiskLatestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAAssessmentRiskLatest", ModifyDSPAAssessmentRiskLatestResponse.class);
    }

    /**
     *风险项页面----修改风险等级的详情数据
     * @param req ModifyDSPAAssessmentRiskLevelRequest
     * @return ModifyDSPAAssessmentRiskLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskLevelResponse ModifyDSPAAssessmentRiskLevel(ModifyDSPAAssessmentRiskLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAAssessmentRiskLevel", ModifyDSPAAssessmentRiskLevelResponse.class);
    }

    /**
     *风险模板---修改风险模板
     * @param req ModifyDSPAAssessmentRiskTemplateRequest
     * @return ModifyDSPAAssessmentRiskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskTemplateResponse ModifyDSPAAssessmentRiskTemplate(ModifyDSPAAssessmentRiskTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAAssessmentRiskTemplate", ModifyDSPAAssessmentRiskTemplateResponse.class);
    }

    /**
     *修改COS分类分级任务，该接口只有在任务状态为以下状态时才支持正确修改：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败
     * @param req ModifyDSPACOSDiscoveryTaskRequest
     * @return ModifyDSPACOSDiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACOSDiscoveryTaskResponse ModifyDSPACOSDiscoveryTask(ModifyDSPACOSDiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPACOSDiscoveryTask", ModifyDSPACOSDiscoveryTaskResponse.class);
    }

    /**
     *调整COS任务扫描结果
     * @param req ModifyDSPACOSTaskResultRequest
     * @return ModifyDSPACOSTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACOSTaskResultResponse ModifyDSPACOSTaskResult(ModifyDSPACOSTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPACOSTaskResult", ModifyDSPACOSTaskResultResponse.class);
    }

    /**
     *修改分类，内置分类不支持修改。
     * @param req ModifyDSPACategoryRequest
     * @return ModifyDSPACategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACategoryResponse ModifyDSPACategory(ModifyDSPACategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPACategory", ModifyDSPACategoryResponse.class);
    }

    /**
     *修改分类分级关系
     * @param req ModifyDSPACategoryRelationRequest
     * @return ModifyDSPACategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACategoryRelationResponse ModifyDSPACategoryRelation(ModifyDSPACategoryRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPACategoryRelation", ModifyDSPACategoryRelationResponse.class);
    }

    /**
     *修改DSPA集群信息
     * @param req ModifyDSPAClusterInfoRequest
     * @return ModifyDSPAClusterInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAClusterInfoResponse ModifyDSPAClusterInfo(ModifyDSPAClusterInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAClusterInfo", ModifyDSPAClusterInfoResponse.class);
    }

    /**
     *修改分类分级模板，内置模板不支持修改。
     * @param req ModifyDSPAComplianceGroupRequest
     * @return ModifyDSPAComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAComplianceGroupResponse ModifyDSPAComplianceGroup(ModifyDSPAComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAComplianceGroup", ModifyDSPAComplianceGroupResponse.class);
    }

    /**
     *修改分类分级规则，单个用户最多允许创建200个规则。
注：此API同时适用RDB跟COS类型数据。
     * @param req ModifyDSPADiscoveryRuleRequest
     * @return ModifyDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPADiscoveryRuleResponse ModifyDSPADiscoveryRule(ModifyDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPADiscoveryRule", ModifyDSPADiscoveryRuleResponse.class);
    }

    /**
     *修改分类分级任务，该接口只有在任务状态为以下状态时才支持正确修改：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败
     * @param req ModifyDSPADiscoveryTaskRequest
     * @return ModifyDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPADiscoveryTaskResponse ModifyDSPADiscoveryTask(ModifyDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPADiscoveryTask", ModifyDSPADiscoveryTaskResponse.class);
    }

    /**
     *调整ES任务扫描结果
     * @param req ModifyDSPAESTaskResultRequest
     * @return ModifyDSPAESTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAESTaskResultResponse ModifyDSPAESTaskResult(ModifyDSPAESTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPAESTaskResult", ModifyDSPAESTaskResultResponse.class);
    }

    /**
     *调整任务扫描结果
     * @param req ModifyDSPATaskResultRequest
     * @return ModifyDSPATaskResultResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPATaskResultResponse ModifyDSPATaskResult(ModifyDSPATaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDSPATaskResult", ModifyDSPATaskResultResponse.class);
    }

    /**
     *查询DSPA实例的db列表
     * @param req QueryDSPAMetaResourceDbListRequest
     * @return QueryDSPAMetaResourceDbListResponse
     * @throws TencentCloudSDKException
     */
    public QueryDSPAMetaResourceDbListResponse QueryDSPAMetaResourceDbList(QueryDSPAMetaResourceDbListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryDSPAMetaResourceDbList", QueryDSPAMetaResourceDbListResponse.class);
    }

    /**
     *获取资源绑定DB状态
     * @param req QueryResourceDbBindStatusRequest
     * @return QueryResourceDbBindStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryResourceDbBindStatusResponse QueryResourceDbBindStatus(QueryResourceDbBindStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryResourceDbBindStatus", QueryResourceDbBindStatusResponse.class);
    }

    /**
     *重新启动DSPA风险评估任务
     * @param req RestartDSPAAssessmentTaskRequest
     * @return RestartDSPAAssessmentTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestartDSPAAssessmentTaskResponse RestartDSPAAssessmentTask(RestartDSPAAssessmentTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDSPAAssessmentTask", RestartDSPAAssessmentTaskResponse.class);
    }

    /**
     *立即启动分类分级任务，该接口只有在任务状态为以下状态时才支持正确执行立即扫描：
0 待扫描，
2 扫描终止，
3 扫描成功，
4 扫描失败
     * @param req StartDSPADiscoveryTaskRequest
     * @return StartDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartDSPADiscoveryTaskResponse StartDSPADiscoveryTask(StartDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartDSPADiscoveryTask", StartDSPADiscoveryTaskResponse.class);
    }

    /**
     *停止分类分级任务，该接口只有在任务状态为以下状态时才支持正确执行停止扫描：
1 扫描中
     * @param req StopDSPADiscoveryTaskRequest
     * @return StopDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopDSPADiscoveryTaskResponse StopDSPADiscoveryTask(StopDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopDSPADiscoveryTask", StopDSPADiscoveryTaskResponse.class);
    }

    /**
     *更新自建资源基础信息，包括：端口、账户名、密码。
请注意：
如果资源自身的VPC、VIP信息发生变化，后台会自动更新。
如果监听的端口发生变化，请显式输入端口。
如果账户名密码任意一个发生变化，请务必同时显式输入账户名密码。
     * @param req UpdateDSPASelfBuildResourceRequest
     * @return UpdateDSPASelfBuildResourceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDSPASelfBuildResourceResponse UpdateDSPASelfBuildResource(UpdateDSPASelfBuildResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDSPASelfBuildResource", UpdateDSPASelfBuildResourceResponse.class);
    }

    /**
     *验证COS分类分级规则
     * @param req VerifyDSPACOSRuleRequest
     * @return VerifyDSPACOSRuleResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDSPACOSRuleResponse VerifyDSPACOSRule(VerifyDSPACOSRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyDSPACOSRule", VerifyDSPACOSRuleResponse.class);
    }

    /**
     *验证分类分级规则
     * @param req VerifyDSPADiscoveryRuleRequest
     * @return VerifyDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDSPADiscoveryRuleResponse VerifyDSPADiscoveryRule(VerifyDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyDSPADiscoveryRule", VerifyDSPADiscoveryRuleResponse.class);
    }

}
