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
package com.tencentcloudapi.rum.v20210622;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rum.v20210622.models.*;

public class RumClient extends AbstractClient{
    private static String endpoint = "rum.tencentcloudapi.com";
    private static String service = "rum";
    private static String version = "2021-06-22";
    
    public RumClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RumClient(Credential credential, String region, ClientProfile profile) {
        super(RumClient.endpoint, RumClient.version, credential, region, profile);
    }

    /**
     *创建 RUM 应用（归属于某个团队）
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *创建对应项目的文件记录
     * @param req CreateReleaseFileRequest
     * @return CreateReleaseFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseFileResponse CreateReleaseFile(CreateReleaseFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReleaseFile", CreateReleaseFileResponse.class);
    }

    /**
     *个人用户添加星标项目
     * @param req CreateStarProjectRequest
     * @return CreateStarProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateStarProjectResponse CreateStarProject(CreateStarProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStarProject", CreateStarProjectResponse.class);
    }

    /**
     *创建 RUM 业务系统
     * @param req CreateTawInstanceRequest
     * @return CreateTawInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateTawInstanceResponse CreateTawInstance(CreateTawInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTawInstance", CreateTawInstanceResponse.class);
    }

    /**
     *创建白名单
     * @param req CreateWhitelistRequest
     * @return CreateWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhitelistResponse CreateWhitelist(CreateWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWhitelist", CreateWhitelistResponse.class);
    }

    /**
     *删除实例，谨慎操作，不可恢复
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *删除给定的 rum 的项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *将对应 sourcemap 文件删除
     * @param req DeleteReleaseFileRequest
     * @return DeleteReleaseFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReleaseFileResponse DeleteReleaseFile(DeleteReleaseFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReleaseFile", DeleteReleaseFileResponse.class);
    }

    /**
     *删除用户名下的星标项目
     * @param req DeleteStarProjectRequest
     * @return DeleteStarProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStarProjectResponse DeleteStarProject(DeleteStarProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStarProject", DeleteStarProjectResponse.class);
    }

    /**
     *删除白名单
     * @param req DeleteWhitelistRequest
     * @return DeleteWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhitelistResponse DeleteWhitelist(DeleteWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWhitelist", DeleteWhitelistResponse.class);
    }

    /**
     *用于查询 app 监控多维分析数据
     * @param req DescribeAppDimensionMetricsRequest
     * @return DescribeAppDimensionMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppDimensionMetricsResponse DescribeAppDimensionMetrics(DescribeAppDimensionMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppDimensionMetrics", DescribeAppDimensionMetricsResponse.class);
    }

    /**
     *获取 app 监控指标数据
     * @param req DescribeAppMetricsDataRequest
     * @return DescribeAppMetricsDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppMetricsDataResponse DescribeAppMetricsData(DescribeAppMetricsDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppMetricsData", DescribeAppMetricsDataResponse.class);
    }

    /**
     *查询 app 监控个例样本详情列表
     * @param req DescribeAppSingleCaseDetailListRequest
     * @return DescribeAppSingleCaseDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppSingleCaseDetailListResponse DescribeAppSingleCaseDetailList(DescribeAppSingleCaseDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppSingleCaseDetailList", DescribeAppSingleCaseDetailListResponse.class);
    }

    /**
     *查询 app 监控个例聚合列表
     * @param req DescribeAppSingleCaseListRequest
     * @return DescribeAppSingleCaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppSingleCaseListResponse DescribeAppSingleCaseList(DescribeAppSingleCaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppSingleCaseList", DescribeAppSingleCaseListResponse.class);
    }

    /**
     *转发monitor查询
     * @param req DescribeDataRequest
     * @return DescribeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataResponse DescribeData(DescribeDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeData", DescribeDataResponse.class);
    }

    /**
     *获取DescribeDataCustomUrl信息
     * @param req DescribeDataCustomUrlRequest
     * @return DescribeDataCustomUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataCustomUrlResponse DescribeDataCustomUrl(DescribeDataCustomUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataCustomUrl", DescribeDataCustomUrlResponse.class);
    }

    /**
     *获取DescribeDataEventUrl信息
     * @param req DescribeDataEventUrlRequest
     * @return DescribeDataEventUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEventUrlResponse DescribeDataEventUrl(DescribeDataEventUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEventUrl", DescribeDataEventUrlResponse.class);
    }

    /**
     *获取DescribeDataFetchProject信息。已下线，请使用DescribeDataFetchUrl
     * @param req DescribeDataFetchProjectRequest
     * @return DescribeDataFetchProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchProjectResponse DescribeDataFetchProject(DescribeDataFetchProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchProject", DescribeDataFetchProjectResponse.class);
    }

    /**
     *获取DescribeDataFetchUrl信息
     * @param req DescribeDataFetchUrlRequest
     * @return DescribeDataFetchUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlResponse DescribeDataFetchUrl(DescribeDataFetchUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchUrl", DescribeDataFetchUrlResponse.class);
    }

    /**
     *获取DescribeDataFetchUrlInfo信息
     * @param req DescribeDataFetchUrlInfoRequest
     * @return DescribeDataFetchUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlInfoResponse DescribeDataFetchUrlInfo(DescribeDataFetchUrlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchUrlInfo", DescribeDataFetchUrlInfoResponse.class);
    }

    /**
     *获取loginfo信息
     * @param req DescribeDataLogUrlInfoRequest
     * @return DescribeDataLogUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlInfoResponse DescribeDataLogUrlInfo(DescribeDataLogUrlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataLogUrlInfo", DescribeDataLogUrlInfoResponse.class);
    }

    /**
     *获取LogUrlStatistics信息
     * @param req DescribeDataLogUrlStatisticsRequest
     * @return DescribeDataLogUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlStatisticsResponse DescribeDataLogUrlStatistics(DescribeDataLogUrlStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataLogUrlStatistics", DescribeDataLogUrlStatisticsResponse.class);
    }

    /**
     *获取PerformancePage信息
     * @param req DescribeDataPerformancePageRequest
     * @return DescribeDataPerformancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPerformancePageResponse DescribeDataPerformancePage(DescribeDataPerformancePageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPerformancePage", DescribeDataPerformancePageResponse.class);
    }

    /**
     *获取PvUrlInfo信息
     * @param req DescribeDataPvUrlInfoRequest
     * @return DescribeDataPvUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlInfoResponse DescribeDataPvUrlInfo(DescribeDataPvUrlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPvUrlInfo", DescribeDataPvUrlInfoResponse.class);
    }

    /**
     *获取DescribeDataPvUrlStatistics信息
     * @param req DescribeDataPvUrlStatisticsRequest
     * @return DescribeDataPvUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlStatisticsResponse DescribeDataPvUrlStatistics(DescribeDataPvUrlStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPvUrlStatistics", DescribeDataPvUrlStatisticsResponse.class);
    }

    /**
     *获取项目上报量
     * @param req DescribeDataReportCountRequest
     * @return DescribeDataReportCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataReportCountResponse DescribeDataReportCount(DescribeDataReportCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataReportCount", DescribeDataReportCountResponse.class);
    }

    /**
     *获取DescribeDataSetUrlStatistics信息
     * @param req DescribeDataSetUrlStatisticsRequest
     * @return DescribeDataSetUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSetUrlStatisticsResponse DescribeDataSetUrlStatistics(DescribeDataSetUrlStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSetUrlStatistics", DescribeDataSetUrlStatisticsResponse.class);
    }

    /**
     *获取DescribeDataStaticProject信息
     * @param req DescribeDataStaticProjectRequest
     * @return DescribeDataStaticProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticProjectResponse DescribeDataStaticProject(DescribeDataStaticProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticProject", DescribeDataStaticProjectResponse.class);
    }

    /**
     *获取DescribeDataStaticResource信息
     * @param req DescribeDataStaticResourceRequest
     * @return DescribeDataStaticResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticResourceResponse DescribeDataStaticResource(DescribeDataStaticResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticResource", DescribeDataStaticResourceResponse.class);
    }

    /**
     *获取DescribeDataStaticUrl信息
     * @param req DescribeDataStaticUrlRequest
     * @return DescribeDataStaticUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticUrlResponse DescribeDataStaticUrl(DescribeDataStaticUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticUrl", DescribeDataStaticUrlResponse.class);
    }

    /**
     *获取DescribeDataWebVitalsPage信息，用户核心活动信息
页面加载性能之Web Vitals。性能关键点
     * @param req DescribeDataWebVitalsPageRequest
     * @return DescribeDataWebVitalsPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataWebVitalsPageResponse DescribeDataWebVitalsPage(DescribeDataWebVitalsPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataWebVitalsPage", DescribeDataWebVitalsPageResponse.class);
    }

    /**
     *获取首页错误信息
     * @param req DescribeErrorRequest
     * @return DescribeErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorResponse DescribeError(DescribeErrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeError", DescribeErrorResponse.class);
    }

    /**
     *获取应用上报抽样信息
     * @param req DescribeProjectLimitsRequest
     * @return DescribeProjectLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectLimitsResponse DescribeProjectLimits(DescribeProjectLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectLimits", DescribeProjectLimitsResponse.class);
    }

    /**
     *获取项目列表（实例创建的团队下的项目列表）
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *获取项目下的PV列表
     * @param req DescribePvListRequest
     * @return DescribePvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePvListResponse DescribePvList(DescribePvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePvList", DescribePvListResponse.class);
    }

    /**
     *获取上传文件存储的临时密钥
     * @param req DescribeReleaseFileSignRequest
     * @return DescribeReleaseFileSignResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseFileSignResponse DescribeReleaseFileSign(DescribeReleaseFileSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseFileSign", DescribeReleaseFileSignResponse.class);
    }

    /**
     *获取应用对应sourcemap文件列表
     * @param req DescribeReleaseFilesRequest
     * @return DescribeReleaseFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseFilesResponse DescribeReleaseFiles(DescribeReleaseFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseFiles", DescribeReleaseFilesResponse.class);
    }

    /**
     *获取项目下的日志聚合信息
     * @param req DescribeRumGroupLogRequest
     * @return DescribeRumGroupLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumGroupLogResponse DescribeRumGroupLog(DescribeRumGroupLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumGroupLog", DescribeRumGroupLogResponse.class);
    }

    /**
     *获取项目下的日志列表（实例创建的项目下的日志列表）
     * @param req DescribeRumLogExportRequest
     * @return DescribeRumLogExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogExportResponse DescribeRumLogExport(DescribeRumLogExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogExport", DescribeRumLogExportResponse.class);
    }

    /**
     *获取项目下的日志导出列表
     * @param req DescribeRumLogExportsRequest
     * @return DescribeRumLogExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogExportsResponse DescribeRumLogExports(DescribeRumLogExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogExports", DescribeRumLogExportsResponse.class);
    }

    /**
     *获取项目下的日志列表（实例创建的项目下的日志列表）
     * @param req DescribeRumLogListRequest
     * @return DescribeRumLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogListResponse DescribeRumLogList(DescribeRumLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogList", DescribeRumLogListResponse.class);
    }

    /**
     *获取项目下的日志列表，分钟级
     * @param req DescribeRumStatsLogListRequest
     * @return DescribeRumStatsLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumStatsLogListResponse DescribeRumStatsLogList(DescribeRumStatsLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumStatsLogList", DescribeRumStatsLogListResponse.class);
    }

    /**
     *获取首页分数列表
     * @param req DescribeScoresRequest
     * @return DescribeScoresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScoresResponse DescribeScores(DescribeScoresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScores", DescribeScoresResponse.class);
    }

    /**
     *查询片区信息
     * @param req DescribeTawAreasRequest
     * @return DescribeTawAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTawAreasResponse DescribeTawAreas(DescribeTawAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTawAreas", DescribeTawAreasResponse.class);
    }

    /**
     *查询实例信息
     * @param req DescribeTawInstancesRequest
     * @return DescribeTawInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTawInstancesResponse DescribeTawInstances(DescribeTawInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTawInstances", DescribeTawInstancesResponse.class);
    }

    /**
     *获取项目下的UV列表
     * @param req DescribeUvListRequest
     * @return DescribeUvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUvListResponse DescribeUvList(DescribeUvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUvList", DescribeUvListResponse.class);
    }

    /**
     *获取白名单列表
     * @param req DescribeWhitelistsRequest
     * @return DescribeWhitelistsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhitelistsResponse DescribeWhitelists(DescribeWhitelistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhitelists", DescribeWhitelistsResponse.class);
    }

    /**
     *修改 RUM 业务系统
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *修改 RUM 应用信息
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *新增修改限流
     * @param req ModifyProjectLimitRequest
     * @return ModifyProjectLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectLimitResponse ModifyProjectLimit(ModifyProjectLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProjectLimit", ModifyProjectLimitResponse.class);
    }

    /**
     *恢复 RUM 业务系统，恢复后，用户可以正常使用和上报数据
     * @param req ResumeInstanceRequest
     * @return ResumeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeInstanceResponse ResumeInstance(ResumeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeInstance", ResumeInstanceResponse.class);
    }

    /**
     *恢复应用使用与上报数据
     * @param req ResumeProjectRequest
     * @return ResumeProjectResponse
     * @throws TencentCloudSDKException
     */
    public ResumeProjectResponse ResumeProject(ResumeProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeProject", ResumeProjectResponse.class);
    }

    /**
     *停止实例
     * @param req StopInstanceRequest
     * @return StopInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopInstanceResponse StopInstance(StopInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstance", StopInstanceResponse.class);
    }

    /**
     *停止项目使用与上报数据
     * @param req StopProjectRequest
     * @return StopProjectResponse
     * @throws TencentCloudSDKException
     */
    public StopProjectResponse StopProject(StopProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopProject", StopProjectResponse.class);
    }

}
