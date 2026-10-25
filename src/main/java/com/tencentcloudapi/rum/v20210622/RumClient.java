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
     *创建字段配置规则
     * @param req CreateFieldTransformRuleRequest
     * @return CreateFieldTransformRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateFieldTransformRuleResponse CreateFieldTransformRule(CreateFieldTransformRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFieldTransformRule", CreateFieldTransformRuleResponse.class);
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
     *在指定业务系统下创建应用。
     * @param req CreateTDEMApplicationRequest
     * @return CreateTDEMApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDEMApplicationResponse CreateTDEMApplication(CreateTDEMApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDEMApplication", CreateTDEMApplicationResponse.class);
    }

    /**
     *创建业务系统。InstanceId 由后端生成，格式 rum-<12 位随机字母数字>。重名返回 InvalidParameterValue。
     * @param req CreateTDEMBusinessSystemRequest
     * @return CreateTDEMBusinessSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDEMBusinessSystemResponse CreateTDEMBusinessSystem(CreateTDEMBusinessSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDEMBusinessSystem", CreateTDEMBusinessSystemResponse.class);
    }

    /**
     *创建一条移动拨测任务。同一应用处于 active 的任务最多 50 条。四项启动范围都为空时不限制启动；填写多项时必须同时满足，同一项多个值命中任意一个即可。
     * @param req CreateTDEMDialTaskRequest
     * @return CreateTDEMDialTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDEMDialTaskResponse CreateTDEMDialTask(CreateTDEMDialTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDEMDialTask", CreateTDEMDialTaskResponse.class);
    }

    /**
     *为应用创建字段值替换规则，单应用上限 50 条。替代已废弃的 CreateFieldTransformRule；AppId 为 string。
     * @param req CreateTDEMFieldTransformRuleRequest
     * @return CreateTDEMFieldTransformRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDEMFieldTransformRuleResponse CreateTDEMFieldTransformRule(CreateTDEMFieldTransformRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDEMFieldTransformRule", CreateTDEMFieldTransformRuleResponse.class);
    }

    /**
     *创建漏斗
     * @param req CreateTDEMFunnelRequest
     * @return CreateTDEMFunnelResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDEMFunnelResponse CreateTDEMFunnel(CreateTDEMFunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDEMFunnel", CreateTDEMFunnelResponse.class);
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
     *删除字段配置规则
     * @param req DeleteFieldTransformRuleRequest
     * @return DeleteFieldTransformRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFieldTransformRuleResponse DeleteFieldTransformRule(DeleteFieldTransformRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFieldTransformRule", DeleteFieldTransformRuleResponse.class);
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
     *删除回放包元数据，并尽力删除COS上回放包与源码zip。不存在返回ResourceNotFound。
     * @param req DeleteMiniProgramReplayPackRequest
     * @return DeleteMiniProgramReplayPackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMiniProgramReplayPackResponse DeleteMiniProgramReplayPack(DeleteMiniProgramReplayPackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMiniProgramReplayPack", DeleteMiniProgramReplayPackResponse.class);
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
     *删除指定的符号制品。
     * @param req DeleteSymbolArtifactRequest
     * @return DeleteSymbolArtifactResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSymbolArtifactResponse DeleteSymbolArtifact(DeleteSymbolArtifactRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSymbolArtifact", DeleteSymbolArtifactResponse.class);
    }

    /**
     *逻辑删除应用，ProjectKey 即刻失效。
     * @param req DeleteTDEMApplicationRequest
     * @return DeleteTDEMApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTDEMApplicationResponse DeleteTDEMApplication(DeleteTDEMApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTDEMApplication", DeleteTDEMApplicationResponse.class);
    }

    /**
     *删除业务系统。名下存在未删除应用时返回 ResourceInUse。
     * @param req DeleteTDEMBusinessSystemRequest
     * @return DeleteTDEMBusinessSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTDEMBusinessSystemResponse DeleteTDEMBusinessSystem(DeleteTDEMBusinessSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTDEMBusinessSystem", DeleteTDEMBusinessSystemResponse.class);
    }

    /**
     *将拨测任务标记为已删除。已删除的任务再次删除视为成功。不物理删除任务行，也不删除历史拨测结果。
     * @param req DeleteTDEMDialTaskRequest
     * @return DeleteTDEMDialTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTDEMDialTaskResponse DeleteTDEMDialTask(DeleteTDEMDialTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTDEMDialTask", DeleteTDEMDialTaskResponse.class);
    }

    /**
     *按规则 Id 删除字段值替换规则。替代已废弃的 DeleteFieldTransformRule；AppId 为 string。
     * @param req DeleteTDEMFieldTransformRuleRequest
     * @return DeleteTDEMFieldTransformRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTDEMFieldTransformRuleResponse DeleteTDEMFieldTransformRule(DeleteTDEMFieldTransformRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTDEMFieldTransformRule", DeleteTDEMFieldTransformRuleResponse.class);
    }

    /**
     *删除漏斗
     * @param req DeleteTDEMFunnelRequest
     * @return DeleteTDEMFunnelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTDEMFunnelResponse DeleteTDEMFunnel(DeleteTDEMFunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTDEMFunnel", DeleteTDEMFunnelResponse.class);
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
     *获取应用退出个例上报详情
     * @param req DescribeApplicationExitReportDetailRequest
     * @return DescribeApplicationExitReportDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationExitReportDetailResponse DescribeApplicationExitReportDetail(DescribeApplicationExitReportDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationExitReportDetail", DescribeApplicationExitReportDetailResponse.class);
    }

    /**
     *获取应用退出个例上报列表
     * @param req DescribeApplicationExitReportListRequest
     * @return DescribeApplicationExitReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationExitReportListResponse DescribeApplicationExitReportList(DescribeApplicationExitReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationExitReportList", DescribeApplicationExitReportListResponse.class);
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
     *获取DescribeDataBridgeUrl信息
     * @param req DescribeDataBridgeUrlV2Request
     * @return DescribeDataBridgeUrlV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataBridgeUrlV2Response DescribeDataBridgeUrlV2(DescribeDataBridgeUrlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataBridgeUrlV2", DescribeDataBridgeUrlV2Response.class);
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
     *获取DescribeDataCustomUrl信息
     * @param req DescribeDataCustomUrlV2Request
     * @return DescribeDataCustomUrlV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataCustomUrlV2Response DescribeDataCustomUrlV2(DescribeDataCustomUrlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataCustomUrlV2", DescribeDataCustomUrlV2Response.class);
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
     *获取DescribeDataEventUrl信息
     * @param req DescribeDataEventUrlV2Request
     * @return DescribeDataEventUrlV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataEventUrlV2Response DescribeDataEventUrlV2(DescribeDataEventUrlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEventUrlV2", DescribeDataEventUrlV2Response.class);
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
     *获取DescribeDataFetchUrl信息
     * @param req DescribeDataFetchUrlV2Request
     * @return DescribeDataFetchUrlV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlV2Response DescribeDataFetchUrlV2(DescribeDataFetchUrlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchUrlV2", DescribeDataFetchUrlV2Response.class);
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
     *获取LogUrlStatistics信息
     * @param req DescribeDataLogUrlStatisticsV2Request
     * @return DescribeDataLogUrlStatisticsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlStatisticsV2Response DescribeDataLogUrlStatisticsV2(DescribeDataLogUrlStatisticsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataLogUrlStatisticsV2", DescribeDataLogUrlStatisticsV2Response.class);
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
     *获取PerformancePage信息
     * @param req DescribeDataPerformancePageV2Request
     * @return DescribeDataPerformancePageV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataPerformancePageV2Response DescribeDataPerformancePageV2(DescribeDataPerformancePageV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPerformancePageV2", DescribeDataPerformancePageV2Response.class);
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
     *获取DescribeDataPvUrlStatistics信息
     * @param req DescribeDataPvUrlStatisticsV2Request
     * @return DescribeDataPvUrlStatisticsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlStatisticsV2Response DescribeDataPvUrlStatisticsV2(DescribeDataPvUrlStatisticsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPvUrlStatisticsV2", DescribeDataPvUrlStatisticsV2Response.class);
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
     *获取项目上报量
     * @param req DescribeDataReportCountV2Request
     * @return DescribeDataReportCountV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataReportCountV2Response DescribeDataReportCountV2(DescribeDataReportCountV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataReportCountV2", DescribeDataReportCountV2Response.class);
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
     *获取DescribeDataSetUrlStatistics信息
     * @param req DescribeDataSetUrlStatisticsV2Request
     * @return DescribeDataSetUrlStatisticsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataSetUrlStatisticsV2Response DescribeDataSetUrlStatisticsV2(DescribeDataSetUrlStatisticsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSetUrlStatisticsV2", DescribeDataSetUrlStatisticsV2Response.class);
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
     *获取DescribeDataStaticProject信息
     * @param req DescribeDataStaticProjectV2Request
     * @return DescribeDataStaticProjectV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticProjectV2Response DescribeDataStaticProjectV2(DescribeDataStaticProjectV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticProjectV2", DescribeDataStaticProjectV2Response.class);
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
     *获取DescribeDataStaticResource信息
     * @param req DescribeDataStaticResourceV2Request
     * @return DescribeDataStaticResourceV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticResourceV2Response DescribeDataStaticResourceV2(DescribeDataStaticResourceV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticResourceV2", DescribeDataStaticResourceV2Response.class);
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
     *获取DescribeDataStaticUrl信息
     * @param req DescribeDataStaticUrlV2Request
     * @return DescribeDataStaticUrlV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticUrlV2Response DescribeDataStaticUrlV2(DescribeDataStaticUrlV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticUrlV2", DescribeDataStaticUrlV2Response.class);
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
     *获取DescribeDataWebVitalsPage信息，用户核心活动信息
页面加载性能之Web Vitals。性能关键点
     * @param req DescribeDataWebVitalsPageV2Request
     * @return DescribeDataWebVitalsPageV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeDataWebVitalsPageV2Response DescribeDataWebVitalsPageV2(DescribeDataWebVitalsPageV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataWebVitalsPageV2", DescribeDataWebVitalsPageV2Response.class);
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
     *获取异常问题详情数据
     * @param req DescribeExceptionDetailRequest
     * @return DescribeExceptionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExceptionDetailResponse DescribeExceptionDetail(DescribeExceptionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExceptionDetail", DescribeExceptionDetailResponse.class);
    }

    /**
     *获取异常个例列表
     * @param req DescribeExceptionReportListRequest
     * @return DescribeExceptionReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExceptionReportListResponse DescribeExceptionReportList(DescribeExceptionReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExceptionReportList", DescribeExceptionReportListResponse.class);
    }

    /**
     *获取FOOM内存分配问题详情数据
     * @param req DescribeFOOMMallocProblemDetailRequest
     * @return DescribeFOOMMallocProblemDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFOOMMallocProblemDetailResponse DescribeFOOMMallocProblemDetail(DescribeFOOMMallocProblemDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFOOMMallocProblemDetail", DescribeFOOMMallocProblemDetailResponse.class);
    }

    /**
     *获取FOOM内存分配问题列表数据
     * @param req DescribeFOOMMallocProblemListRequest
     * @return DescribeFOOMMallocProblemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFOOMMallocProblemListResponse DescribeFOOMMallocProblemList(DescribeFOOMMallocProblemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFOOMMallocProblemList", DescribeFOOMMallocProblemListResponse.class);
    }

    /**
     *获取FOOM内存分配问题上报列表
     * @param req DescribeFOOMMallocReportListRequest
     * @return DescribeFOOMMallocReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFOOMMallocReportListResponse DescribeFOOMMallocReportList(DescribeFOOMMallocReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFOOMMallocReportList", DescribeFOOMMallocReportListResponse.class);
    }

    /**
     *获取FOOM问题详情数据
     * @param req DescribeFOOMProblemDetailRequest
     * @return DescribeFOOMProblemDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFOOMProblemDetailResponse DescribeFOOMProblemDetail(DescribeFOOMProblemDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFOOMProblemDetail", DescribeFOOMProblemDetailResponse.class);
    }

    /**
     *获取FOOM问题列表数据
     * @param req DescribeFOOMProblemListRequest
     * @return DescribeFOOMProblemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFOOMProblemListResponse DescribeFOOMProblemList(DescribeFOOMProblemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFOOMProblemList", DescribeFOOMProblemListResponse.class);
    }

    /**
     *获取FOOM问题上报列表
     * @param req DescribeFOOMReportListRequest
     * @return DescribeFOOMReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFOOMReportListResponse DescribeFOOMReportList(DescribeFOOMReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFOOMReportList", DescribeFOOMReportListResponse.class);
    }

    /**
     *获取字段配置规则
     * @param req DescribeFieldTransformRulesRequest
     * @return DescribeFieldTransformRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFieldTransformRulesResponse DescribeFieldTransformRules(DescribeFieldTransformRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFieldTransformRules", DescribeFieldTransformRulesResponse.class);
    }

    /**
     *获取TDEM字段值列表
     * @param req DescribeFieldValuesRequest
     * @return DescribeFieldValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFieldValuesResponse DescribeFieldValues(DescribeFieldValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFieldValues", DescribeFieldValuesResponse.class);
    }

    /**
     *获取COS存储的临时密钥，具体到ProjectId
     * @param req DescribeFileCertificateRequest
     * @return DescribeFileCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileCertificateResponse DescribeFileCertificate(DescribeFileCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileCertificate", DescribeFileCertificateResponse.class);
    }

    /**
     *按用户维度聚合某问题的受影响用户清单，服务端分页。AppId 与 IssueId 必填；AppVersion / StartTime / EndTime / Keyword 用于收窄范围，同时作用于清单与 Total，因此 Total 为当前条件下去重后的用户数， 条件全空时等于问题详情的影响用户数。OrderKey / OrderBy 只改变行序、不改变结果集合；排序一律由服务端执行， 并保留 uid 作为次级键以保证翻页不重不漏。接口只读。
     * @param req DescribeIssueAffectedUsersRequest
     * @return DescribeIssueAffectedUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueAffectedUsersResponse DescribeIssueAffectedUsers(DescribeIssueAffectedUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueAffectedUsers", DescribeIssueAffectedUsersResponse.class);
    }

    /**
     *获取指定 Issue 当前事件或最新事件之前的 Breadcrumbs 面包屑序列
     * @param req DescribeIssueBreadcrumbsRequest
     * @return DescribeIssueBreadcrumbsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueBreadcrumbsResponse DescribeIssueBreadcrumbs(DescribeIssueBreadcrumbsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueBreadcrumbs", DescribeIssueBreadcrumbsResponse.class);
    }

    /**
     *获取日志下载链接
     * @param req DescribeIssueCrashLogDownloadURLRequest
     * @return DescribeIssueCrashLogDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueCrashLogDownloadURLResponse DescribeIssueCrashLogDownloadURL(DescribeIssueCrashLogDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueCrashLogDownloadURL", DescribeIssueCrashLogDownloadURLResponse.class);
    }

    /**
     *获取指定 Issue 的摘要信息以及默认选中的最新事件详情
     * @param req DescribeIssueDetailRequest
     * @return DescribeIssueDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueDetailResponse DescribeIssueDetail(DescribeIssueDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueDetail", DescribeIssueDetailResponse.class);
    }

    /**
     *获取指定 Issue 下单个事件的完整详情，包括栈信息、上下文和符号化状态等字段
     * @param req DescribeIssueEventDetailRequest
     * @return DescribeIssueEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueEventDetailResponse DescribeIssueEventDetail(DescribeIssueEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueEventDetail", DescribeIssueEventDetailResponse.class);
    }

    /**
     *根据条件获取指定 Issue 的错误事件列表，支持按时间范围、关键字和扩展过滤器查询，返回分页事件数据
     * @param req DescribeIssueEventsRequest
     * @return DescribeIssueEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueEventsResponse DescribeIssueEvents(DescribeIssueEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueEvents", DescribeIssueEventsResponse.class);
    }

    /**
     *获取指定 Issue 在给定时间范围内的趋势分桶统计数据
     * @param req DescribeIssueTrendRequest
     * @return DescribeIssueTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssueTrendResponse DescribeIssueTrend(DescribeIssueTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssueTrend", DescribeIssueTrendResponse.class);
    }

    /**
     *根据筛选条件分页查询 Issue 列表，支持环境、Issue 类型、状态、关键字、扩展过滤器和排序条件
     * @param req DescribeIssuesRequest
     * @return DescribeIssuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssuesResponse DescribeIssues(DescribeIssuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssues", DescribeIssuesResponse.class);
    }

    /**
     *获取问题分布数据
     * @param req DescribeIssuesDistributionRequest
     * @return DescribeIssuesDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssuesDistributionResponse DescribeIssuesDistribution(DescribeIssuesDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssuesDistribution", DescribeIssuesDistributionResponse.class);
    }

    /**
     *获取问题列表数据
     * @param req DescribeIssuesListRequest
     * @return DescribeIssuesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssuesListResponse DescribeIssuesList(DescribeIssuesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssuesList", DescribeIssuesListResponse.class);
    }

    /**
     *获取问题趋势数据
     * @param req DescribeIssuesStatisticsTrendRequest
     * @return DescribeIssuesStatisticsTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIssuesStatisticsTrendResponse DescribeIssuesStatisticsTrend(DescribeIssuesStatisticsTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIssuesStatisticsTrend", DescribeIssuesStatisticsTrendResponse.class);
    }

    /**
     *获取卡顿ANR问题用户详情
     * @param req DescribeLagANRProblemAccountDetailRequest
     * @return DescribeLagANRProblemAccountDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLagANRProblemAccountDetailResponse DescribeLagANRProblemAccountDetail(DescribeLagANRProblemAccountDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLagANRProblemAccountDetail", DescribeLagANRProblemAccountDetailResponse.class);
    }

    /**
     *获取卡顿ANR问题用户列表
     * @param req DescribeLagANRProblemFeatureAccountsRequest
     * @return DescribeLagANRProblemFeatureAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLagANRProblemFeatureAccountsResponse DescribeLagANRProblemFeatureAccounts(DescribeLagANRProblemFeatureAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLagANRProblemFeatureAccounts", DescribeLagANRProblemFeatureAccountsResponse.class);
    }

    /**
     *获取卡顿ANR问题列表数据
     * @param req DescribeLagANRProblemListRequest
     * @return DescribeLagANRProblemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLagANRProblemListResponse DescribeLagANRProblemList(DescribeLagANRProblemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLagANRProblemList", DescribeLagANRProblemListResponse.class);
    }

    /**
     *按AppId+BundleHash取已编译回放包正文。成功含Pack（tmpl/css/js/manifest/hash），不返回WXML/WXSS源码。不存在返回ResourceNotFound。
     * @param req DescribeMiniProgramReplayPackRequest
     * @return DescribeMiniProgramReplayPackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMiniProgramReplayPackResponse DescribeMiniProgramReplayPack(DescribeMiniProgramReplayPackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMiniProgramReplayPack", DescribeMiniProgramReplayPackResponse.class);
    }

    /**
     *按AppId列出回放包元数据，不含Pack正文。可按Status过滤。Limit默认20、最大100。
     * @param req DescribeMiniProgramReplayPacksRequest
     * @return DescribeMiniProgramReplayPacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMiniProgramReplayPacksResponse DescribeMiniProgramReplayPacks(DescribeMiniProgramReplayPacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMiniProgramReplayPacks", DescribeMiniProgramReplayPacksResponse.class);
    }

    /**
     *获取TDEM性能指标数据
     * @param req DescribePerformanceMetricsRequest
     * @return DescribePerformanceMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePerformanceMetricsResponse DescribePerformanceMetrics(DescribePerformanceMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePerformanceMetrics", DescribePerformanceMetricsResponse.class);
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
     *从对象存储读取录屏帧数据
     * @param req DescribeReplayDataRequest
     * @return DescribeReplayDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplayDataResponse DescribeReplayData(DescribeReplayDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplayData", DescribeReplayDataResponse.class);
    }

    /**
     *获取回放日志
     * @param req DescribeReplayDetailsRequest
     * @return DescribeReplayDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplayDetailsResponse DescribeReplayDetails(DescribeReplayDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplayDetails", DescribeReplayDetailsResponse.class);
    }

    /**
     *获取回放元数据
     * @param req DescribeReplayMetaRequest
     * @return DescribeReplayMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplayMetaResponse DescribeReplayMeta(DescribeReplayMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplayMeta", DescribeReplayMetaResponse.class);
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
     *根据label 聚合分析日志
     * @param req DescribeRumGroupLogV2Request
     * @return DescribeRumGroupLogV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRumGroupLogV2Response DescribeRumGroupLogV2(DescribeRumGroupLogV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumGroupLogV2", DescribeRumGroupLogV2Response.class);
    }

    /**
     *查询日志明细
     * @param req DescribeRumLogDetailsV2Request
     * @return DescribeRumLogDetailsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogDetailsV2Response DescribeRumLogDetailsV2(DescribeRumLogDetailsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogDetailsV2", DescribeRumLogDetailsV2Response.class);
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
     *创建日志导出
     * @param req DescribeRumLogExportV2Request
     * @return DescribeRumLogExportV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogExportV2Response DescribeRumLogExportV2(DescribeRumLogExportV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogExportV2", DescribeRumLogExportV2Response.class);
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
     *获取日志导出列表
     * @param req DescribeRumLogExportsV2Request
     * @return DescribeRumLogExportsV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogExportsV2Response DescribeRumLogExportsV2(DescribeRumLogExportsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogExportsV2", DescribeRumLogExportsV2Response.class);
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
     *查询原始日志总量
     * @param req DescribeRumLogTotalV2Request
     * @return DescribeRumLogTotalV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogTotalV2Response DescribeRumLogTotalV2(DescribeRumLogTotalV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogTotalV2", DescribeRumLogTotalV2Response.class);
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
     *查询日志时间分布
     * @param req DescribeRumStatsLogListV2Request
     * @return DescribeRumStatsLogListV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeRumStatsLogListV2Response DescribeRumStatsLogListV2(DescribeRumStatsLogListV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumStatsLogListV2", DescribeRumStatsLogListV2Response.class);
    }

    /**
     *获取应用的采样率
     * @param req DescribeSampleRateRequest
     * @return DescribeSampleRateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleRateResponse DescribeSampleRate(DescribeSampleRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSampleRate", DescribeSampleRateResponse.class);
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
     *获取首页分数列表
     * @param req DescribeScoresV2Request
     * @return DescribeScoresV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeScoresV2Response DescribeScoresV2(DescribeScoresV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScoresV2", DescribeScoresV2Response.class);
    }

    /**
     *查询会话列表
     * @param req DescribeSessionListRequest
     * @return DescribeSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionListResponse DescribeSessionList(DescribeSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionList", DescribeSessionListResponse.class);
    }

    /**
     *获取挣扎事件分布数据
     * @param req DescribeStruggleDistributionRequest
     * @return DescribeStruggleDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStruggleDistributionResponse DescribeStruggleDistribution(DescribeStruggleDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStruggleDistribution", DescribeStruggleDistributionResponse.class);
    }

    /**
     *获取符号制品上传临时凭证。
     * @param req DescribeSymbolArtifactUploadCredentialRequest
     * @return DescribeSymbolArtifactUploadCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSymbolArtifactUploadCredentialResponse DescribeSymbolArtifactUploadCredential(DescribeSymbolArtifactUploadCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSymbolArtifactUploadCredential", DescribeSymbolArtifactUploadCredentialResponse.class);
    }

    /**
     *分页查询指定类型的符号制品。
     * @param req DescribeSymbolArtifactsRequest
     * @return DescribeSymbolArtifactsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSymbolArtifactsResponse DescribeSymbolArtifacts(DescribeSymbolArtifactsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSymbolArtifacts", DescribeSymbolArtifactsResponse.class);
    }

    /**
     *查询应用列表，默认仅当前用户名下有权限的应用；可按业务系统 InstanceId 筛选。
     * @param req DescribeTDEMApplicationsRequest
     * @return DescribeTDEMApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMApplicationsResponse DescribeTDEMApplications(DescribeTDEMApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMApplications", DescribeTDEMApplicationsResponse.class);
    }

    /**
     *查询当前用户名下业务系统列表（超管返回全部）。分页 Offset/Limit，默认 Limit=20 上限 100。
     * @param req DescribeTDEMBusinessSystemsRequest
     * @return DescribeTDEMBusinessSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMBusinessSystemsResponse DescribeTDEMBusinessSystems(DescribeTDEMBusinessSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMBusinessSystems", DescribeTDEMBusinessSystemsResponse.class);
    }

    /**
     *按一个维度拆分拨测指标。Dimension 取值说明：platform、app_version、device、net_type、operator、region、country、target_ip。target_region 不是合法值。region 对应客户端省份，country 对应国家。
     * @param req DescribeTDEMDialDimensionsRequest
     * @return DescribeTDEMDialDimensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMDialDimensionsResponse DescribeTDEMDialDimensions(DescribeTDEMDialDimensionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMDialDimensions", DescribeTDEMDialDimensionsResponse.class);
    }

    /**
     *返回一个拨测批次的探测结果和路由追踪。Probes 的 Region、Operator 是目标 IP 归属。逐跳归属同时写在 Probes.MTR.Hops 和顶层 MTR.Hops。
     * @param req DescribeTDEMDialExecutionDetailRequest
     * @return DescribeTDEMDialExecutionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMDialExecutionDetailResponse DescribeTDEMDialExecutionDetail(DescribeTDEMDialExecutionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMDialExecutionDetail", DescribeTDEMDialExecutionDetailResponse.class);
    }

    /**
     *按批次返回拨测执行记录，一批次一行。TargetIps 是目标地址，TargetIpGeo 是这些地址的地区和运营商。行上的 Region 和 Operator 仍是客户端地区和运营商。
     * @param req DescribeTDEMDialExecutionListRequest
     * @return DescribeTDEMDialExecutionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMDialExecutionListResponse DescribeTDEMDialExecutionList(DescribeTDEMDialExecutionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMDialExecutionList", DescribeTDEMDialExecutionListResponse.class);
    }

    /**
     *按时间窗汇总拨测批次。一次多 IP 探测计为 1 个批次。
     * @param req DescribeTDEMDialOverviewRequest
     * @return DescribeTDEMDialOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMDialOverviewResponse DescribeTDEMDialOverview(DescribeTDEMDialOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMDialOverview", DescribeTDEMDialOverviewResponse.class);
    }

    /**
     *查询应用下未删除的拨测任务，包含启动范围。
     * @param req DescribeTDEMDialTasksRequest
     * @return DescribeTDEMDialTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMDialTasksResponse DescribeTDEMDialTasks(DescribeTDEMDialTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMDialTasks", DescribeTDEMDialTasksResponse.class);
    }

    /**
     *按小时或天返回拨测趋势。Granularity 不传时按小时。
     * @param req DescribeTDEMDialTrendRequest
     * @return DescribeTDEMDialTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMDialTrendResponse DescribeTDEMDialTrend(DescribeTDEMDialTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMDialTrend", DescribeTDEMDialTrendResponse.class);
    }

    /**
     *按 AppId+EventId 查询事件详情，含主表字段与可选符号化结果。Date 推荐传以命中分区；或用 StartDate+EndDate（<=2 天）。越权与不存在统一 ResourceNotFound。
     * @param req DescribeTDEMEventDetailRequest
     * @return DescribeTDEMEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMEventDetailResponse DescribeTDEMEventDetail(DescribeTDEMEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMEventDetail", DescribeTDEMEventDetailResponse.class);
    }

    /**
     *错误指纹或 API/资源 URL（含按访问页、状态、标签）排行。读 tdem_events，不走主分析立方 GroupBy。Kind：error/api/resource/api_page/resource_page/api_status/api_status_top/resource_status/tag。 Kind=exception_dimension返回当前普通维度或标签值的同批完整分类计数；展开不另行取数。
     * @param req DescribeTDEMEventRankRequest
     * @return DescribeTDEMEventRankResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMEventRankResponse DescribeTDEMEventRank(DescribeTDEMEventRankRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMEventRank", DescribeTDEMEventRankResponse.class);
    }

    /**
     *数据探索事件明细分页。会话分类不得调用本接口（Category 禁止 session）。时间单位 Unix 毫秒。
     * @param req DescribeTDEMEventSearchRequest
     * @return DescribeTDEMEventSearchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMEventSearchResponse DescribeTDEMEventSearch(DescribeTDEMEventSearchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMEventSearch", DescribeTDEMEventSearchResponse.class);
    }

    /**
     *同一筛选下的分类计数、访问用户、业务用户、窗口合计与分桶趋势。Category 可含 session。空窗返回 0 与空 Series。
     * @param req DescribeTDEMEventSearchSummaryRequest
     * @return DescribeTDEMEventSearchSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMEventSearchSummaryResponse DescribeTDEMEventSearchSummary(DescribeTDEMEventSearchSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMEventSearchSummary", DescribeTDEMEventSearchSummaryResponse.class);
    }

    /**
     *查询应用下字段值替换规则列表。替代已废弃的 DescribeFieldTransformRules；AppId 为 string。
     * @param req DescribeTDEMFieldTransformRulesRequest
     * @return DescribeTDEMFieldTransformRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFieldTransformRulesResponse DescribeTDEMFieldTransformRules(DescribeTDEMFieldTransformRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFieldTransformRules", DescribeTDEMFieldTransformRulesResponse.class);
    }

    /**
     *获取漏斗详情
     * @param req DescribeTDEMFunnelDetailRequest
     * @return DescribeTDEMFunnelDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFunnelDetailResponse DescribeTDEMFunnelDetail(DescribeTDEMFunnelDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFunnelDetail", DescribeTDEMFunnelDetailResponse.class);
    }

    /**
     *获取漏斗分析报告维度数据
     * @param req DescribeTDEMFunnelDimensionsRequest
     * @return DescribeTDEMFunnelDimensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFunnelDimensionsResponse DescribeTDEMFunnelDimensions(DescribeTDEMFunnelDimensionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFunnelDimensions", DescribeTDEMFunnelDimensionsResponse.class);
    }

    /**
     *获取漏斗列表
     * @param req DescribeTDEMFunnelListRequest
     * @return DescribeTDEMFunnelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFunnelListResponse DescribeTDEMFunnelList(DescribeTDEMFunnelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFunnelList", DescribeTDEMFunnelListResponse.class);
    }

    /**
     *获取漏斗报告
     * @param req DescribeTDEMFunnelReportRequest
     * @return DescribeTDEMFunnelReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFunnelReportResponse DescribeTDEMFunnelReport(DescribeTDEMFunnelReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFunnelReport", DescribeTDEMFunnelReportResponse.class);
    }

    /**
     *获取漏斗步骤会话
     * @param req DescribeTDEMFunnelStepSessionListRequest
     * @return DescribeTDEMFunnelStepSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFunnelStepSessionListResponse DescribeTDEMFunnelStepSessionList(DescribeTDEMFunnelStepSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFunnelStepSessionList", DescribeTDEMFunnelStepSessionListResponse.class);
    }

    /**
     *获取漏斗趋势
     * @param req DescribeTDEMFunnelTrendRequest
     * @return DescribeTDEMFunnelTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMFunnelTrendResponse DescribeTDEMFunnelTrend(DescribeTDEMFunnelTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMFunnelTrend", DescribeTDEMFunnelTrendResponse.class);
    }

    /**
     *按单维度 GroupBy 查询分析指标分布。读 tdem_metric_agg。
     * @param req DescribeTDEMMetricDistributionRequest
     * @return DescribeTDEMMetricDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMMetricDistributionResponse DescribeTDEMMetricDistribution(DescribeTDEMMetricDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMMetricDistribution", DescribeTDEMMetricDistributionResponse.class);
    }

    /**
     *查询指定应用与时间窗内的分析指标区间合计。单查返回 Metrics；传 Queries 时返回 Results。读 tdem_metric_agg。
     * @param req DescribeTDEMMetricSummaryRequest
     * @return DescribeTDEMMetricSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMMetricSummaryResponse DescribeTDEMMetricSummary(DescribeTDEMMetricSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMMetricSummary", DescribeTDEMMetricSummaryResponse.class);
    }

    /**
     *查询分析指标时序。可传 CompareStartTime/CompareEndTime 做对比窗（仅批量）。读 tdem_metric_agg。
     * @param req DescribeTDEMMetricTrendRequest
     * @return DescribeTDEMMetricTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMMetricTrendResponse DescribeTDEMMetricTrend(DescribeTDEMMetricTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMMetricTrend", DescribeTDEMMetricTrendResponse.class);
    }

    /**
     *客户端总览列表批量评分。按应用列表一次返回各计分项单项分与加权总分。AppIds 1-200；不归属当前用户的应用不出现在响应中。
     * @param req DescribeTDEMOverviewScoresRequest
     * @return DescribeTDEMOverviewScoresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMOverviewScoresResponse DescribeTDEMOverviewScores(DescribeTDEMOverviewScoresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMOverviewScores", DescribeTDEMOverviewScoresResponse.class);
    }

    /**
     *会话时间线 / 页面子事件 / 错误前轨迹。Mode：timeline / page / breadcrumb。Limit 默认 200，上限 200。
     * @param req DescribeTDEMRelatedEventsRequest
     * @return DescribeTDEMRelatedEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMRelatedEventsResponse DescribeTDEMRelatedEvents(DescribeTDEMRelatedEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMRelatedEvents", DescribeTDEMRelatedEventsResponse.class);
    }

    /**
     *按一个维度返回大模型对话次数和当前指标值，按指标值降序，最多 200 行。region 由 country 与 province 拼接。
     * @param req DescribeTDEMSSEDimensionsRequest
     * @return DescribeTDEMSSEDimensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSSEDimensionsResponse DescribeTDEMSSEDimensions(DescribeTDEMSSEDimensionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSSEDimensions", DescribeTDEMSSEDimensionsResponse.class);
    }

    /**
     *返回吞吐率、首次消息时延或流畅度的分档分布。档位左闭右开，最后一档有限区间右端闭合，超出右端的样本进入溢出档。错误率与卡死率返回 InvalidParameter。
     * @param req DescribeTDEMSSEDistributionRequest
     * @return DescribeTDEMSSEDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSSEDistributionResponse DescribeTDEMSSEDistribution(DescribeTDEMSSEDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSSEDistribution", DescribeTDEMSSEDistributionResponse.class);
    }

    /**
     *返回吞吐率、首次消息时延或流畅度在整个时间窗及各时间桶上的平均值和 P50、P75、P95、P99。错误率与卡死率返回 InvalidParameter。
     * @param req DescribeTDEMSSEPercentileRequest
     * @return DescribeTDEMSSEPercentileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSSEPercentileResponse DescribeTDEMSSEPercentile(DescribeTDEMSSEPercentileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSSEPercentile", DescribeTDEMSSEPercentileResponse.class);
    }

    /**
     *查询指定应用与时间窗内的大模型对话汇总，包含对话次数、token 总数、吞吐率、首次消息时延、错误率、卡死率和流畅度。只读 tdem.tdem_events 中 event_type 为 sse_call 的事件。
     * @param req DescribeTDEMSSESummaryRequest
     * @return DescribeTDEMSSESummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSSESummaryResponse DescribeTDEMSSESummary(DescribeTDEMSSESummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSSESummary", DescribeTDEMSSESummaryResponse.class);
    }

    /**
     *按时间桶返回大模型对话趋势。overall 填充 Points，其他维度按整个窗口的指标值从高到低取 TopN 并填充 Series。
     * @param req DescribeTDEMSSETrendRequest
     * @return DescribeTDEMSSETrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSSETrendResponse DescribeTDEMSSETrend(DescribeTDEMSSETrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSSETrend", DescribeTDEMSSETrendResponse.class);
    }

    /**
     *读取当前生效的 Web 规则化采样文档。ProjectId 必填且 > 0。无行则返回内置缺省（Event.Enabled=true、Types 空、Replay 关闭且体验率 0），不自动插库。SnapshotId 无快照为 0。query handler 做 PascalCase ↔ 存储 snake_case 映射。非 Web 应用不得走本接口，继续 DescribeSampleRate。
     * @param req DescribeTDEMSampleConfigRequest
     * @return DescribeTDEMSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSampleConfigResponse DescribeTDEMSampleConfig(DescribeTDEMSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSampleConfig", DescribeTDEMSampleConfigResponse.class);
    }

    /**
     *查询单个应用的采集采样率与会话回放采样率。替代已废弃的 DescribeSampleRate；AppId 为 string。
     * @param req DescribeTDEMSampleRateRequest
     * @return DescribeTDEMSampleRateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSampleRateResponse DescribeTDEMSampleRate(DescribeTDEMSampleRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSampleRate", DescribeTDEMSampleRateResponse.class);
    }

    /**
     *获取回放时间线数据
     * @param req DescribeTDEMSessionReplayTimelineRequest
     * @return DescribeTDEMSessionReplayTimelineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMSessionReplayTimelineResponse DescribeTDEMSessionReplayTimeline(DescribeTDEMSessionReplayTimelineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMSessionReplayTimeline", DescribeTDEMSessionReplayTimelineResponse.class);
    }

    /**
     *按业务系统/应用查询用量明细（含行趋势、端类型、删除/停用标记）。Keyword 匹配业务系统名、应用名或应用 ID。
     * @param req DescribeTDEMUsageDetailRequest
     * @return DescribeTDEMUsageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMUsageDetailResponse DescribeTDEMUsageDetail(DescribeTDEMUsageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMUsageDetail", DescribeTDEMUsageDetailResponse.class);
    }

    /**
     *查询当前使用者名下（超管为全部）上报总量与趋势。时间 StartTime/EndTime 为 YYYY-MM-DD HH:00:00 小时对齐。不要求请求体带 AppId。
     * @param req DescribeTDEMUsageSummaryRequest
     * @return DescribeTDEMUsageSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTDEMUsageSummaryResponse DescribeTDEMUsageSummary(DescribeTDEMUsageSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTDEMUsageSummary", DescribeTDEMUsageSummaryResponse.class);
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
     *查询令牌
     * @param req DescribeTokenRequest
     * @return DescribeTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenResponse DescribeToken(DescribeTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeToken", DescribeTokenResponse.class);
    }

    /**
     *查询top问题列表
     * @param req DescribeTopIssuesRequest
     * @return DescribeTopIssuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopIssuesResponse DescribeTopIssues(DescribeTopIssuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopIssues", DescribeTopIssuesResponse.class);
    }

    /**
     *获取用户旅程数据
     * @param req DescribeUserJourneySanKeyRequest
     * @return DescribeUserJourneySanKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserJourneySanKeyResponse DescribeUserJourneySanKey(DescribeUserJourneySanKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserJourneySanKey", DescribeUserJourneySanKeyResponse.class);
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
     *修改字段配置规则
     * @param req ModifyFieldTransformRuleRequest
     * @return ModifyFieldTransformRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFieldTransformRuleResponse ModifyFieldTransformRule(ModifyFieldTransformRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFieldTransformRule", ModifyFieldTransformRuleResponse.class);
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
     *更新 Issue 状态，支持 resolve、ignore、reopen 等状态流转动作
     * @param req ModifyIssueStatusRequest
     * @return ModifyIssueStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIssueStatusResponse ModifyIssueStatus(ModifyIssueStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIssueStatus", ModifyIssueStatusResponse.class);
    }

    /**
     *更新回放包元数据，仅支持改Release，不重编译。换源码请再调UploadMiniProgramSource。
     * @param req ModifyMiniProgramReplayPackRequest
     * @return ModifyMiniProgramReplayPackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMiniProgramReplayPackResponse ModifyMiniProgramReplayPack(ModifyMiniProgramReplayPackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMiniProgramReplayPack", ModifyMiniProgramReplayPackResponse.class);
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
     *配置tdem采样率
     * @param req ModifySampleRateRequest
     * @return ModifySampleRateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleRateResponse ModifySampleRate(ModifySampleRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySampleRate", ModifySampleRateResponse.class);
    }

    /**
     *修改应用，仅传需修改字段。AppId 必填。
     * @param req ModifyTDEMApplicationRequest
     * @return ModifyTDEMApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMApplicationResponse ModifyTDEMApplication(ModifyTDEMApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMApplication", ModifyTDEMApplicationResponse.class);
    }

    /**
     *修改业务系统名称或描述。越权 UnauthorizedOperation；不存在或已删除 ResourceNotFound。
     * @param req ModifyTDEMBusinessSystemRequest
     * @return ModifyTDEMBusinessSystemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMBusinessSystemResponse ModifyTDEMBusinessSystem(ModifyTDEMBusinessSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMBusinessSystem", ModifyTDEMBusinessSystemResponse.class);
    }

    /**
     *修改拨测任务。未出现在请求中的字段保持原值。启动范围传空字符串表示清空该项。Type 和 ExecutionTime 创建后不可修改。暂停和恢复通过 Status 完成，不提供单独的状态接口。
     * @param req ModifyTDEMDialTaskRequest
     * @return ModifyTDEMDialTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMDialTaskResponse ModifyTDEMDialTask(ModifyTDEMDialTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMDialTask", ModifyTDEMDialTaskResponse.class);
    }

    /**
     *按规则 Id 修改字段值替换规则。替代已废弃的 ModifyFieldTransformRule；AppId 为 string。
     * @param req ModifyTDEMFieldTransformRuleRequest
     * @return ModifyTDEMFieldTransformRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMFieldTransformRuleResponse ModifyTDEMFieldTransformRule(ModifyTDEMFieldTransformRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMFieldTransformRule", ModifyTDEMFieldTransformRuleResponse.class);
    }

    /**
     *修改漏斗
     * @param req ModifyTDEMFunnelRequest
     * @return ModifyTDEMFunnelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMFunnelResponse ModifyTDEMFunnel(ModifyTDEMFunnelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMFunnel", ModifyTDEMFunnelResponse.class);
    }

    /**
     *整页保存 Web 规则化采样文档：校验 → INSERT 快照 → UPSERT 当前行 → 刷新 Redis 下发缓存。不写 tdem_sample_rate。采样率 0–100、最多两位小数；规则 Conditions 不可为空；Types 含非闭集 key 返回 InvalidParameter。校验失败不写库。无 Restore/Import/Export/Diff。
     * @param req ModifyTDEMSampleConfigRequest
     * @return ModifyTDEMSampleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMSampleConfigResponse ModifyTDEMSampleConfig(ModifyTDEMSampleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMSampleConfig", ModifyTDEMSampleConfigResponse.class);
    }

    /**
     *设置或更新应用采集采样率；ReplaySampleRate 可选。替代已废弃的 ModifySampleRate；AppId 为 string。
     * @param req ModifyTDEMSampleRateRequest
     * @return ModifyTDEMSampleRateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTDEMSampleRateResponse ModifyTDEMSampleRate(ModifyTDEMSampleRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTDEMSampleRate", ModifyTDEMSampleRateResponse.class);
    }

    /**
     *根据步骤配置直接生成漏斗预览报告（不保存漏斗，不需要FunnelId）
     * @param req PreviewTDEMFunnelReportRequest
     * @return PreviewTDEMFunnelReportResponse
     * @throws TencentCloudSDKException
     */
    public PreviewTDEMFunnelReportResponse PreviewTDEMFunnelReport(PreviewTDEMFunnelReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PreviewTDEMFunnelReport", PreviewTDEMFunnelReportResponse.class);
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
     *恢复已停止的应用，Status 变为 2。
     * @param req ResumeTDEMApplicationRequest
     * @return ResumeTDEMApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ResumeTDEMApplicationResponse ResumeTDEMApplication(ResumeTDEMApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeTDEMApplication", ResumeTDEMApplicationResponse.class);
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

    /**
     *停止应用采集，Status 变为 6。
     * @param req StopTDEMApplicationRequest
     * @return StopTDEMApplicationResponse
     * @throws TencentCloudSDKException
     */
    public StopTDEMApplicationResponse StopTDEMApplication(StopTDEMApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTDEMApplication", StopTDEMApplicationResponse.class);
    }

    /**
     *上传微信小程序源码zip并同步编译回放包。控制台传FileBase64；zip需含app.json，跳过node_modules。同AppId+BundleHash且已ready则幂等。
     * @param req UploadMiniProgramSourceRequest
     * @return UploadMiniProgramSourceResponse
     * @throws TencentCloudSDKException
     */
    public UploadMiniProgramSourceResponse UploadMiniProgramSource(UploadMiniProgramSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadMiniProgramSource", UploadMiniProgramSourceResponse.class);
    }

    /**
     *登记已上传的符号制品。请先获取上传凭证并将文件上传到 COS。
     * @param req UploadSymbolArtifactRequest
     * @return UploadSymbolArtifactResponse
     * @throws TencentCloudSDKException
     */
    public UploadSymbolArtifactResponse UploadSymbolArtifact(UploadSymbolArtifactRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadSymbolArtifact", UploadSymbolArtifactResponse.class);
    }

}
