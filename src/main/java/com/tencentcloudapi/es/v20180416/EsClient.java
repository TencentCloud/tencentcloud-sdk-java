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
package com.tencentcloudapi.es.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.es.v20180416.models.*;

public class EsClient extends AbstractClient{
    private static String endpoint = "es.tencentcloudapi.com";
    private static String service = "es";
    private static String version = "2018-04-16";

    public EsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EsClient(Credential credential, String region, ClientProfile profile) {
        super(EsClient.endpoint, EsClient.version, credential, region, profile);
    }

    /**
     *检查cos迁移索引元数据
     * @param req CheckMigrateIndexMetaDataRequest
     * @return CheckMigrateIndexMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public CheckMigrateIndexMetaDataResponse CheckMigrateIndexMetaData(CheckMigrateIndexMetaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckMigrateIndexMetaData", CheckMigrateIndexMetaDataResponse.class);
    }

    /**
     *新建自动备份快照策略
     * @param req CreateAutoBackUpStrategyRequest
     * @return CreateAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoBackUpStrategyResponse CreateAutoBackUpStrategy(CreateAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoBackUpStrategy", CreateAutoBackUpStrategyResponse.class);
    }

    /**
     *集群快照手动创建
     * @param req CreateClusterSnapshotRequest
     * @return CreateClusterSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterSnapshotResponse CreateClusterSnapshot(CreateClusterSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterSnapshot", CreateClusterSnapshotResponse.class);
    }

    /**
     *用于创建Beats采集器
     * @param req CreateCollectorRequest
     * @return CreateCollectorResponse
     * @throws TencentCloudSDKException
     */
    public CreateCollectorResponse CreateCollector(CreateCollectorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCollector", CreateCollectorResponse.class);
    }

    /**
     *cos迁移流程
     * @param req CreateCosMigrateToServerlessInstanceRequest
     * @return CreateCosMigrateToServerlessInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosMigrateToServerlessInstanceResponse CreateCosMigrateToServerlessInstance(CreateCosMigrateToServerlessInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosMigrateToServerlessInstance", CreateCosMigrateToServerlessInstanceResponse.class);
    }

    /**
     *创建索引
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIndex", CreateIndexResponse.class);
    }

    /**
     *创建指定规格的ES集群实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *用于创建Logstash实例
     * @param req CreateLogstashInstanceRequest
     * @return CreateLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogstashInstanceResponse CreateLogstashInstance(CreateLogstashInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogstashInstance", CreateLogstashInstanceResponse.class);
    }

    /**
     *创建Serverless索引
     * @param req CreateServerlessInstanceRequest
     * @return CreateServerlessInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerlessInstanceResponse CreateServerlessInstance(CreateServerlessInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServerlessInstance", CreateServerlessInstanceResponse.class);
    }

    /**
     *创建Serverless索引空间
     * @param req CreateServerlessSpaceV2Request
     * @return CreateServerlessSpaceV2Response
     * @throws TencentCloudSDKException
     */
    public CreateServerlessSpaceV2Response CreateServerlessSpaceV2(CreateServerlessSpaceV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServerlessSpaceV2", CreateServerlessSpaceV2Response.class);
    }

    /**
     *删除自动备份快照策略
     * @param req DeleteAutoBackUpStrategyRequest
     * @return DeleteAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoBackUpStrategyResponse DeleteAutoBackUpStrategy(DeleteAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoBackUpStrategy", DeleteAutoBackUpStrategyResponse.class);
    }

    /**
     *删除快照仓库里备份的快照
     * @param req DeleteClusterSnapshotRequest
     * @return DeleteClusterSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterSnapshotResponse DeleteClusterSnapshot(DeleteClusterSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterSnapshot", DeleteClusterSnapshotResponse.class);
    }

    /**
     *删除索引
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIndex", DeleteIndexResponse.class);
    }

    /**
     *销毁集群实例
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *用于删除Logstash实例
     * @param req DeleteLogstashInstanceRequest
     * @return DeleteLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogstashInstanceResponse DeleteLogstashInstance(DeleteLogstashInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogstashInstance", DeleteLogstashInstanceResponse.class);
    }

    /**
     *用于批量删除Logstash管道
     * @param req DeleteLogstashPipelinesRequest
     * @return DeleteLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogstashPipelinesResponse DeleteLogstashPipelines(DeleteLogstashPipelinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogstashPipelines", DeleteLogstashPipelinesResponse.class);
    }

    /**
     *删除Serverless索引
     * @param req DeleteServerlessInstanceRequest
     * @return DeleteServerlessInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessInstanceResponse DeleteServerlessInstance(DeleteServerlessInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServerlessInstance", DeleteServerlessInstanceResponse.class);
    }

    /**
     *删除Serverless空间子用户
     * @param req DeleteServerlessSpaceUserRequest
     * @return DeleteServerlessSpaceUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessSpaceUserResponse DeleteServerlessSpaceUser(DeleteServerlessSpaceUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServerlessSpaceUser", DeleteServerlessSpaceUserResponse.class);
    }

    /**
     *获取自动备份快照策略信息
     * @param req DescribeAutoBackUpStrategyRequest
     * @return DescribeAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackUpStrategyResponse DescribeAutoBackUpStrategy(DescribeAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoBackUpStrategy", DescribeAutoBackUpStrategyResponse.class);
    }

    /**
     *获取快照备份列表
     * @param req DescribeClusterSnapshotRequest
     * @return DescribeClusterSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSnapshotResponse DescribeClusterSnapshot(DescribeClusterSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSnapshot", DescribeClusterSnapshotResponse.class);
    }

    /**
     *查询智能运维诊断结果报告
     * @param req DescribeDiagnoseRequest
     * @return DescribeDiagnoseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagnoseResponse DescribeDiagnose(DescribeDiagnoseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiagnose", DescribeDiagnoseResponse.class);
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
     *获取索引元数据
     * @param req DescribeIndexMetaRequest
     * @return DescribeIndexMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexMetaResponse DescribeIndexMeta(DescribeIndexMetaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexMeta", DescribeIndexMetaResponse.class);
    }

    /**
     *查询用户该地域下符合条件的ES集群的日志
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLogs", DescribeInstanceLogsResponse.class);
    }

    /**
     *查询实例指定条件下的操作记录
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOperations", DescribeInstanceOperationsResponse.class);
    }

    /**
     *查询实例插件列表
     * @param req DescribeInstancePluginListRequest
     * @return DescribeInstancePluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancePluginListResponse DescribeInstancePluginList(DescribeInstancePluginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancePluginList", DescribeInstancePluginListResponse.class);
    }

    /**
     *查询用户该地域下符合条件的所有实例
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *查询用户该地域下符合条件的Logstash实例的日志
     * @param req DescribeLogstashInstanceLogsRequest
     * @return DescribeLogstashInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashInstanceLogsResponse DescribeLogstashInstanceLogs(DescribeLogstashInstanceLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogstashInstanceLogs", DescribeLogstashInstanceLogsResponse.class);
    }

    /**
     *查询实例指定条件下的操作记录
     * @param req DescribeLogstashInstanceOperationsRequest
     * @return DescribeLogstashInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashInstanceOperationsResponse DescribeLogstashInstanceOperations(DescribeLogstashInstanceOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogstashInstanceOperations", DescribeLogstashInstanceOperationsResponse.class);
    }

    /**
     *查询用户该地域下符合条件的所有Logstash实例
     * @param req DescribeLogstashInstancesRequest
     * @return DescribeLogstashInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashInstancesResponse DescribeLogstashInstances(DescribeLogstashInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogstashInstances", DescribeLogstashInstancesResponse.class);
    }

    /**
     *用于获取Logstash实例管道列表
     * @param req DescribeLogstashPipelinesRequest
     * @return DescribeLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashPipelinesResponse DescribeLogstashPipelines(DescribeLogstashPipelinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogstashPipelines", DescribeLogstashPipelinesResponse.class);
    }

    /**
     *Serverless获取索引列表
     * @param req DescribeServerlessInstancesRequest
     * @return DescribeServerlessInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessInstancesResponse DescribeServerlessInstances(DescribeServerlessInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerlessInstances", DescribeServerlessInstancesResponse.class);
    }

    /**
     *获取serverless实例对应指标，获取space维度时不需要传入indexid，获取index时不需要传入spaceid
获取一段时间时间范围内的指标数据
     * @param req DescribeServerlessMetricsRequest
     * @return DescribeServerlessMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessMetricsResponse DescribeServerlessMetrics(DescribeServerlessMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerlessMetrics", DescribeServerlessMetricsResponse.class);
    }

    /**
     *查看Serverless空间子用户
     * @param req DescribeServerlessSpaceUserRequest
     * @return DescribeServerlessSpaceUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessSpaceUserResponse DescribeServerlessSpaceUser(DescribeServerlessSpaceUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerlessSpaceUser", DescribeServerlessSpaceUserResponse.class);
    }

    /**
     *获取Serverless索引空间列表
     * @param req DescribeServerlessSpacesRequest
     * @return DescribeServerlessSpacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessSpacesResponse DescribeServerlessSpaces(DescribeServerlessSpacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerlessSpaces", DescribeServerlessSpacesResponse.class);
    }

    /**
     *space维度的kibana获取登录token
     * @param req DescribeSpaceKibanaToolsRequest
     * @return DescribeSpaceKibanaToolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceKibanaToolsResponse DescribeSpaceKibanaTools(DescribeSpaceKibanaToolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceKibanaTools", DescribeSpaceKibanaToolsResponse.class);
    }

    /**
     *查询快照信息接口
     * @param req DescribeUserCosSnapshotListRequest
     * @return DescribeUserCosSnapshotListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCosSnapshotListResponse DescribeUserCosSnapshotList(DescribeUserCosSnapshotListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCosSnapshotList", DescribeUserCosSnapshotListResponse.class);
    }

    /**
     *查询集群各视图数据，包括集群维度、节点维度、Kibana维度
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeViews", DescribeViewsResponse.class);
    }

    /**
     *智能运维诊断集群
     * @param req DiagnoseInstanceRequest
     * @return DiagnoseInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DiagnoseInstanceResponse DiagnoseInstance(DiagnoseInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DiagnoseInstance", DiagnoseInstanceResponse.class);
    }

    /**
     *查询IP溯源日志原始数据
     * @param req ExportIpTraceLogRequest
     * @return ExportIpTraceLogResponse
     * @throws TencentCloudSDKException
     */
    public ExportIpTraceLogResponse ExportIpTraceLog(ExportIpTraceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportIpTraceLog", ExportIpTraceLogResponse.class);
    }

    /**
     *查看智能运维配置
     * @param req GetDiagnoseSettingsRequest
     * @return GetDiagnoseSettingsResponse
     * @throws TencentCloudSDKException
     */
    public GetDiagnoseSettingsResponse GetDiagnoseSettings(GetDiagnoseSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDiagnoseSettings", GetDiagnoseSettingsResponse.class);
    }

    /**
     *查询IP溯源状态
     * @param req GetIpTraceStatusRequest
     * @return GetIpTraceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetIpTraceStatusResponse GetIpTraceStatus(GetIpTraceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetIpTraceStatus", GetIpTraceStatusResponse.class);
    }

    /**
     *获取接收客户端请求的节点类型
     * @param req GetRequestTargetNodeTypesRequest
     * @return GetRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public GetRequestTargetNodeTypesResponse GetRequestTargetNodeTypes(GetRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRequestTargetNodeTypes", GetRequestTargetNodeTypesResponse.class);
    }

    /**
     *集群续费询价接口，续费前通过调用该接口，可获取集群续费的价格。
     * @param req InquirePriceRenewInstanceRequest
     * @return InquirePriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewInstanceResponse InquirePriceRenewInstance(InquirePriceRenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewInstance", InquirePriceRenewInstanceResponse.class);
    }

    /**
     *ES集群安装模型接口
     * @param req InstallInstanceModelRequest
     * @return InstallInstanceModelResponse
     * @throws TencentCloudSDKException
     */
    public InstallInstanceModelResponse InstallInstanceModel(InstallInstanceModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallInstanceModel", InstallInstanceModelResponse.class);
    }

    /**
     *修改自动备份快照策略公共信息
     * @param req ModifyAutoBackUpCommonInfoRequest
     * @return ModifyAutoBackUpCommonInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackUpCommonInfoResponse ModifyAutoBackUpCommonInfo(ModifyAutoBackUpCommonInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackUpCommonInfo", ModifyAutoBackUpCommonInfoResponse.class);
    }

    /**
     *修改自动备份快照策略
     * @param req ModifyAutoBackUpStrategyRequest
     * @return ModifyAutoBackUpStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackUpStrategyResponse ModifyAutoBackUpStrategy(ModifyAutoBackUpStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackUpStrategy", ModifyAutoBackUpStrategyResponse.class);
    }

    /**
     *修改绑定VIP的安全组，传安全组id列表
     * @param req ModifyEsVipSecurityGroupRequest
     * @return ModifyEsVipSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEsVipSecurityGroupResponse ModifyEsVipSecurityGroup(ModifyEsVipSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEsVipSecurityGroup", ModifyEsVipSecurityGroupResponse.class);
    }

    /**
     *查询IP溯源日志
     * @param req QueryIpTraceLogRequest
     * @return QueryIpTraceLogResponse
     * @throws TencentCloudSDKException
     */
    public QueryIpTraceLogResponse QueryIpTraceLog(QueryIpTraceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryIpTraceLog", QueryIpTraceLogResponse.class);
    }

    /**
     *重启ES集群实例(用于系统版本更新等操作)
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartInstance", RestartInstanceResponse.class);
    }

    /**
     *重启Kibana
     * @param req RestartKibanaRequest
     * @return RestartKibanaResponse
     * @throws TencentCloudSDKException
     */
    public RestartKibanaResponse RestartKibana(RestartKibanaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartKibana", RestartKibanaResponse.class);
    }

    /**
     *用于重启Logstash实例
     * @param req RestartLogstashInstanceRequest
     * @return RestartLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartLogstashInstanceResponse RestartLogstashInstance(RestartLogstashInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartLogstashInstance", RestartLogstashInstanceResponse.class);
    }

    /**
     *用于重启集群节点
     * @param req RestartNodesRequest
     * @return RestartNodesResponse
     * @throws TencentCloudSDKException
     */
    public RestartNodesResponse RestartNodes(RestartNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartNodes", RestartNodesResponse.class);
    }

    /**
     *快照备份恢复，从仓库中恢复快照到集群中
     * @param req RestoreClusterSnapshotRequest
     * @return RestoreClusterSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RestoreClusterSnapshotResponse RestoreClusterSnapshot(RestoreClusterSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreClusterSnapshot", RestoreClusterSnapshotResponse.class);
    }

    /**
     *用于下发并且部署管道
     * @param req SaveAndDeployLogstashPipelineRequest
     * @return SaveAndDeployLogstashPipelineResponse
     * @throws TencentCloudSDKException
     */
    public SaveAndDeployLogstashPipelineResponse SaveAndDeployLogstashPipeline(SaveAndDeployLogstashPipelineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveAndDeployLogstashPipeline", SaveAndDeployLogstashPipelineResponse.class);
    }

    /**
     *用于启动Logstash管道
     * @param req StartLogstashPipelinesRequest
     * @return StartLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public StartLogstashPipelinesResponse StartLogstashPipelines(StartLogstashPipelinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartLogstashPipelines", StartLogstashPipelinesResponse.class);
    }

    /**
     *用于批量停止Logstash管道
     * @param req StopLogstashPipelinesRequest
     * @return StopLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public StopLogstashPipelinesResponse StopLogstashPipelines(StopLogstashPipelinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLogstashPipelines", StopLogstashPipelinesResponse.class);
    }

    /**
     *更新智能运维配置
     * @param req UpdateDiagnoseSettingsRequest
     * @return UpdateDiagnoseSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDiagnoseSettingsResponse UpdateDiagnoseSettings(UpdateDiagnoseSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDiagnoseSettings", UpdateDiagnoseSettingsResponse.class);
    }

    /**
     *更新ES集群词典
     * @param req UpdateDictionariesRequest
     * @return UpdateDictionariesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDictionariesResponse UpdateDictionaries(UpdateDictionariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDictionaries", UpdateDictionariesResponse.class);
    }

    /**
     *更新索引
     * @param req UpdateIndexRequest
     * @return UpdateIndexResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIndexResponse UpdateIndex(UpdateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateIndex", UpdateIndexResponse.class);
    }

    /**
     *对集群进行节点规格变更，修改实例名称，修改配置，重置密码， 添加Kibana黑白名单等操作。参数中InstanceId为必传参数，ForceRestart为选填参数，剩余参数传递组合及含义如下：
- InstanceName：修改实例名称(仅用于标识实例)
- NodeInfoList: 修改节点配置（节点横向扩缩容，纵向扩缩容，增加主节点，增加冷节点等）
- EsConfig：修改集群配置
- Password：修改默认用户elastic的密码
- EsAcl：修改访问控制列表
- CosBackUp: 设置集群COS自动备份信息
以上参数组合只能传递一种，多传或少传均会导致请求失败
     * @param req UpdateInstanceRequest
     * @return UpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateInstanceResponse UpdateInstance(UpdateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateInstance", UpdateInstanceResponse.class);
    }

    /**
     *更新ES集群IP溯源状态
     * @param req UpdateIpTraceStatusRequest
     * @return UpdateIpTraceStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIpTraceStatusResponse UpdateIpTraceStatus(UpdateIpTraceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateIpTraceStatus", UpdateIpTraceStatusResponse.class);
    }

    /**
     *更新实例Jdk配置
     * @param req UpdateJdkRequest
     * @return UpdateJdkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJdkResponse UpdateJdk(UpdateJdkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateJdk", UpdateJdkResponse.class);
    }

    /**
     *对集群进行节点规格变更，修改实例名称，修改配置，等操作。参数中InstanceId为必传参数，参数传递组合及含义如下：
- InstanceName：修改实例名称(仅用于标识实例)
- NodeNum: 修改实例节点数量（节点横向扩缩容，纵向扩缩容等）
- YMLConfig: 修改实例YML配置
- BindedES：修改绑定的ES集群配置
以上参数组合只能传递一种，多传或少传均会导致请求失败
     * @param req UpdateLogstashInstanceRequest
     * @return UpdateLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLogstashInstanceResponse UpdateLogstashInstance(UpdateLogstashInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateLogstashInstance", UpdateLogstashInstanceResponse.class);
    }

    /**
     *用于更新管道描述信息
     * @param req UpdateLogstashPipelineDescRequest
     * @return UpdateLogstashPipelineDescResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLogstashPipelineDescResponse UpdateLogstashPipelineDesc(UpdateLogstashPipelineDescRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateLogstashPipelineDesc", UpdateLogstashPipelineDescResponse.class);
    }

    /**
     *变更插件列表
     * @param req UpdatePluginsRequest
     * @return UpdatePluginsResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePluginsResponse UpdatePlugins(UpdatePluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePlugins", UpdatePluginsResponse.class);
    }

    /**
     *更新接收客户端请求的节点类型
     * @param req UpdateRequestTargetNodeTypesRequest
     * @return UpdateRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRequestTargetNodeTypesResponse UpdateRequestTargetNodeTypes(UpdateRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRequestTargetNodeTypes", UpdateRequestTargetNodeTypesResponse.class);
    }

    /**
     *更新Serverless索引
     * @param req UpdateServerlessInstanceRequest
     * @return UpdateServerlessInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServerlessInstanceResponse UpdateServerlessInstance(UpdateServerlessInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateServerlessInstance", UpdateServerlessInstanceResponse.class);
    }

    /**
     *更新Serverless索引空间
     * @param req UpdateServerlessSpaceRequest
     * @return UpdateServerlessSpaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServerlessSpaceResponse UpdateServerlessSpace(UpdateServerlessSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateServerlessSpace", UpdateServerlessSpaceResponse.class);
    }

    /**
     *升级ES集群版本
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *升级ES商业特性
     * @param req UpgradeLicenseRequest
     * @return UpgradeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLicenseResponse UpgradeLicense(UpgradeLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeLicense", UpgradeLicenseResponse.class);
    }

}
