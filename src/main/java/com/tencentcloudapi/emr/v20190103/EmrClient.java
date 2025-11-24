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
package com.tencentcloudapi.emr.v20190103;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.emr.v20190103.models.*;

public class EmrClient extends AbstractClient{
    private static String endpoint = "emr.tencentcloudapi.com";
    private static String service = "emr";
    private static String version = "2019-01-03";

    public EmrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EmrClient(Credential credential, String region, ClientProfile profile) {
        super(EmrClient.endpoint, EmrClient.version, credential, region, profile);
    }

    /**
     *添加扩缩容规则，按负载和时间
     * @param req AddMetricScaleStrategyRequest
     * @return AddMetricScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public AddMetricScaleStrategyResponse AddMetricScaleStrategy(AddMetricScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddMetricScaleStrategy", AddMetricScaleStrategyResponse.class);
    }

    /**
     *增加当前集群的节点规格配置
     * @param req AddNodeResourceConfigRequest
     * @return AddNodeResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeResourceConfigResponse AddNodeResourceConfig(AddNodeResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodeResourceConfig", AddNodeResourceConfigResponse.class);
    }

    /**
     *该接口支持安装了OpenLdap组件的集群。
新增用户列表（用户管理）。
     * @param req AddUsersForUserManagerRequest
     * @return AddUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersForUserManagerResponse AddUsersForUserManager(AddUsersForUserManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUsersForUserManager", AddUsersForUserManagerResponse.class);
    }

    /**
     *云盘挂载
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDisks", AttachDisksResponse.class);
    }

    /**
     *包月集群转按量集群（不含cdb）
     * @param req ConvertPreToPostClusterRequest
     * @return ConvertPreToPostClusterResponse
     * @throws TencentCloudSDKException
     */
    public ConvertPreToPostClusterResponse ConvertPreToPostCluster(ConvertPreToPostClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConvertPreToPostCluster", ConvertPreToPostClusterResponse.class);
    }

    /**
     *创建EMR容器集群实例
     * @param req CreateCloudInstanceRequest
     * @return CreateCloudInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudInstanceResponse CreateCloudInstance(CreateCloudInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudInstance", CreateCloudInstanceResponse.class);
    }

    /**
     *创建EMR集群实例
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *用户管理-批量创建用户组
     * @param req CreateGroupsSTDRequest
     * @return CreateGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupsSTDResponse CreateGroupsSTD(CreateGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupsSTD", CreateGroupsSTDResponse.class);
    }

    /**
     *创建EMR集群实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *本接口（CreateSLInstance）用于创建Serverless HBase实例
- 接口调用成功，会创建Serverless HBase实例，创建实例请求成功会返回创建实例的InstaceId和请求的 RequestID。
- 接口为异步接口，接口返回时操作并未立即完成，实例操作结果可以通过调用DescribeInstancesList查看当前实例的StatusDesc状态。
     * @param req CreateSLInstanceRequest
     * @return CreateSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSLInstanceResponse CreateSLInstance(CreateSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSLInstance", CreateSLInstanceResponse.class);
    }

    /**
     *删除自动扩缩容规则，后台销毁根据该规则扩缩容出来的节点
     * @param req DeleteAutoScaleStrategyRequest
     * @return DeleteAutoScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScaleStrategyResponse DeleteAutoScaleStrategy(DeleteAutoScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoScaleStrategy", DeleteAutoScaleStrategyResponse.class);
    }

    /**
     *批量删除用户组
     * @param req DeleteGroupsSTDRequest
     * @return DeleteGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupsSTDResponse DeleteGroupsSTD(DeleteGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroupsSTD", DeleteGroupsSTDResponse.class);
    }

    /**
     *删除当前集群的节点规格配置
     * @param req DeleteNodeResourceConfigRequest
     * @return DeleteNodeResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodeResourceConfigResponse DeleteNodeResourceConfig(DeleteNodeResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodeResourceConfig", DeleteNodeResourceConfigResponse.class);
    }

    /**
     *删除用户列表（用户管理）
     * @param req DeleteUserManagerUserListRequest
     * @return DeleteUserManagerUserListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserManagerUserListResponse DeleteUserManagerUserList(DeleteUserManagerUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserManagerUserList", DeleteUserManagerUserListResponse.class);
    }

    /**
     *yarn资源调度-部署生效
     * @param req DeployYarnConfRequest
     * @return DeployYarnConfResponse
     * @throws TencentCloudSDKException
     */
    public DeployYarnConfResponse DeployYarnConf(DeployYarnConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployYarnConf", DeployYarnConfResponse.class);
    }

    /**
     *获取自动扩缩容全局配置
     * @param req DescribeAutoScaleGroupGlobalConfRequest
     * @return DescribeAutoScaleGroupGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleGroupGlobalConfResponse DescribeAutoScaleGroupGlobalConf(DescribeAutoScaleGroupGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleGroupGlobalConf", DescribeAutoScaleGroupGlobalConfResponse.class);
    }

    /**
     *获取集群的自动扩缩容的详细记录
     * @param req DescribeAutoScaleRecordsRequest
     * @return DescribeAutoScaleRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleRecordsResponse DescribeAutoScaleRecords(DescribeAutoScaleRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleRecords", DescribeAutoScaleRecordsResponse.class);
    }

    /**
     *获取自动扩缩容规则
     * @param req DescribeAutoScaleStrategiesRequest
     * @return DescribeAutoScaleStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleStrategiesResponse DescribeAutoScaleStrategies(DescribeAutoScaleStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleStrategies", DescribeAutoScaleStrategiesResponse.class);
    }

    /**
     *查询EMR任务运行详情状态
     * @param req DescribeClusterFlowStatusDetailRequest
     * @return DescribeClusterFlowStatusDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterFlowStatusDetailResponse DescribeClusterFlowStatusDetail(DescribeClusterFlowStatusDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterFlowStatusDetail", DescribeClusterFlowStatusDetailResponse.class);
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
     *获取账户的CVM配额
     * @param req DescribeCvmQuotaRequest
     * @return DescribeCvmQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCvmQuotaResponse DescribeCvmQuota(DescribeCvmQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCvmQuota", DescribeCvmQuotaResponse.class);
    }

    /**
     *查询DAG信息
     * @param req DescribeDAGInfoRequest
     * @return DescribeDAGInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDAGInfoResponse DescribeDAGInfo(DescribeDAGInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDAGInfo", DescribeDAGInfoResponse.class);
    }

    /**
     *yarn application 统计接口查询
     * @param req DescribeEmrApplicationStaticsRequest
     * @return DescribeEmrApplicationStaticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrApplicationStaticsResponse DescribeEmrApplicationStatics(DescribeEmrApplicationStaticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrApplicationStatics", DescribeEmrApplicationStaticsResponse.class);
    }

    /**
     *查询监控概览页指标数据
     * @param req DescribeEmrOverviewMetricsRequest
     * @return DescribeEmrOverviewMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrOverviewMetricsResponse DescribeEmrOverviewMetrics(DescribeEmrOverviewMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrOverviewMetrics", DescribeEmrOverviewMetricsResponse.class);
    }

    /**
     *查询YARN资源调度的全局配置
     * @param req DescribeGlobalConfigRequest
     * @return DescribeGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalConfigResponse DescribeGlobalConfig(DescribeGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalConfig", DescribeGlobalConfigResponse.class);
    }

    /**
     *查询用户组
     * @param req DescribeGroupsSTDRequest
     * @return DescribeGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsSTDResponse DescribeGroupsSTD(DescribeGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupsSTD", DescribeGroupsSTDResponse.class);
    }

    /**
     *获取Hbase表级监控数据概览接口
     * @param req DescribeHBaseTableOverviewRequest
     * @return DescribeHBaseTableOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHBaseTableOverviewResponse DescribeHBaseTableOverview(DescribeHBaseTableOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHBaseTableOverview", DescribeHBaseTableOverviewResponse.class);
    }

    /**
     *查询HDFS存储文件信息
     * @param req DescribeHDFSStorageInfoRequest
     * @return DescribeHDFSStorageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHDFSStorageInfoResponse DescribeHDFSStorageInfo(DescribeHDFSStorageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHDFSStorageInfo", DescribeHDFSStorageInfoResponse.class);
    }

    /**
     *获取hive查询信息
     * @param req DescribeHiveQueriesRequest
     * @return DescribeHiveQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHiveQueriesResponse DescribeHiveQueries(DescribeHiveQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHiveQueries", DescribeHiveQueriesResponse.class);
    }

    /**
     *DescribeImpalaQueries
     * @param req DescribeImpalaQueriesRequest
     * @return DescribeImpalaQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImpalaQueriesResponse DescribeImpalaQueries(DescribeImpalaQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImpalaQueries", DescribeImpalaQueriesResponse.class);
    }

    /**
     *获取洞察结果信息
     * @param req DescribeInsightListRequest
     * @return DescribeInsightListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsightListResponse DescribeInsightList(DescribeInsightListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInsightList", DescribeInsightListResponse.class);
    }

    /**
     *获取巡检任务结果列表
     * @param req DescribeInspectionTaskResultRequest
     * @return DescribeInspectionTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInspectionTaskResultResponse DescribeInspectionTaskResult(DescribeInspectionTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInspectionTaskResult", DescribeInspectionTaskResultResponse.class);
    }

    /**
     *获取实例操作日志
     * @param req DescribeInstanceOplogRequest
     * @return DescribeInstanceOplogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOplogResponse DescribeInstanceOplog(DescribeInstanceOplogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOplog", DescribeInstanceOplogResponse.class);
    }

    /**
     *查询待续费节点信息
     * @param req DescribeInstanceRenewNodesRequest
     * @return DescribeInstanceRenewNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceRenewNodesResponse DescribeInstanceRenewNodes(DescribeInstanceRenewNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceRenewNodes", DescribeInstanceRenewNodesResponse.class);
    }

    /**
     *查询集群实例信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *查询集群列表
     * @param req DescribeInstancesListRequest
     * @return DescribeInstancesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesListResponse DescribeInstancesList(DescribeInstancesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesList", DescribeInstancesListResponse.class);
    }

    /**
     *查询流程任务
     * @param req DescribeJobFlowRequest
     * @return DescribeJobFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobFlowResponse DescribeJobFlow(DescribeJobFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobFlow", DescribeJobFlowResponse.class);
    }

    /**
     *查询Kyuubi查询信息
     * @param req DescribeKyuubiQueryInfoRequest
     * @return DescribeKyuubiQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKyuubiQueryInfoResponse DescribeKyuubiQueryInfo(DescribeKyuubiQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKyuubiQueryInfo", DescribeKyuubiQueryInfoResponse.class);
    }

    /**
     *查询节点数据盘信息
     * @param req DescribeNodeDataDisksRequest
     * @return DescribeNodeDataDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeDataDisksResponse DescribeNodeDataDisks(DescribeNodeDataDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeDataDisks", DescribeNodeDataDisksResponse.class);
    }

    /**
     *快速获取当前集群的节点规格配置
     * @param req DescribeNodeResourceConfigFastRequest
     * @return DescribeNodeResourceConfigFastResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeResourceConfigFastResponse DescribeNodeResourceConfigFast(DescribeNodeResourceConfigFastRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeResourceConfigFast", DescribeNodeResourceConfigFastResponse.class);
    }

    /**
     *查询节点规格
     * @param req DescribeNodeSpecRequest
     * @return DescribeNodeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeSpecResponse DescribeNodeSpec(DescribeNodeSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeSpec", DescribeNodeSpecResponse.class);
    }

    /**
     *查询YARN资源调度数据信息。已废弃，请使用`DescribeYarnQueue`去查询队列信息。
     * @param req DescribeResourceScheduleRequest
     * @return DescribeResourceScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleResponse DescribeResourceSchedule(DescribeResourceScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceSchedule", DescribeResourceScheduleResponse.class);
    }

    /**
     *YARN资源调度-变更详情
     * @param req DescribeResourceScheduleDiffDetailRequest
     * @return DescribeResourceScheduleDiffDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleDiffDetailResponse DescribeResourceScheduleDiffDetail(DescribeResourceScheduleDiffDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceScheduleDiffDetail", DescribeResourceScheduleDiffDetailResponse.class);
    }

    /**
     *本接口（DescribeSLInstance）用于查询 Serverless HBase实例基本信息
     * @param req DescribeSLInstanceRequest
     * @return DescribeSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSLInstanceResponse DescribeSLInstance(DescribeSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSLInstance", DescribeSLInstanceResponse.class);
    }

    /**
     *本接口（DescribeSLInstanceList）用于查询Serverless HBase实例列表详细信息
     * @param req DescribeSLInstanceListRequest
     * @return DescribeSLInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSLInstanceListResponse DescribeSLInstanceList(DescribeSLInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSLInstanceList", DescribeSLInstanceListResponse.class);
    }

    /**
     *描述服务配置组信息
     * @param req DescribeServiceConfGroupInfosRequest
     * @return DescribeServiceConfGroupInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceConfGroupInfosResponse DescribeServiceConfGroupInfos(DescribeServiceConfGroupInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceConfGroupInfos", DescribeServiceConfGroupInfosResponse.class);
    }

    /**
     *查询服务进程信息
     * @param req DescribeServiceNodeInfosRequest
     * @return DescribeServiceNodeInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceNodeInfosResponse DescribeServiceNodeInfos(DescribeServiceNodeInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceNodeInfos", DescribeServiceNodeInfosResponse.class);
    }

    /**
     *获取spark应用列表
     * @param req DescribeSparkApplicationsRequest
     * @return DescribeSparkApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkApplicationsResponse DescribeSparkApplications(DescribeSparkApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkApplications", DescribeSparkApplicationsResponse.class);
    }

    /**
     *查询Spark查询信息列表
     * @param req DescribeSparkQueriesRequest
     * @return DescribeSparkQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkQueriesResponse DescribeSparkQueries(DescribeSparkQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkQueries", DescribeSparkQueriesResponse.class);
    }

    /**
     *查询StarRocks查询信息
     * @param req DescribeStarRocksQueryInfoRequest
     * @return DescribeStarRocksQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStarRocksQueryInfoResponse DescribeStarRocksQueryInfo(DescribeStarRocksQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStarRocksQueryInfo", DescribeStarRocksQueryInfoResponse.class);
    }

    /**
     *查询Trino(PrestoSQL)查询信息
     * @param req DescribeTrinoQueryInfoRequest
     * @return DescribeTrinoQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrinoQueryInfoResponse DescribeTrinoQueryInfo(DescribeTrinoQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrinoQueryInfo", DescribeTrinoQueryInfoResponse.class);
    }

    /**
     *该接口支持安装了OpenLdap组件的集群。
批量导出用户。对于kerberos集群，如果需要kertab文件下载地址，可以将NeedKeytabInfo设置为true；注意SupportDownLoadKeyTab为true，但是DownLoadKeyTabUrl为空字符串，表示keytab文件在后台没有准备好（正在生成）。
     * @param req DescribeUsersForUserManagerRequest
     * @return DescribeUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersForUserManagerResponse DescribeUsersForUserManager(DescribeUsersForUserManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsersForUserManager", DescribeUsersForUserManagerResponse.class);
    }

    /**
     *DescribeYarnApplications
     * @param req DescribeYarnApplicationsRequest
     * @return DescribeYarnApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnApplicationsResponse DescribeYarnApplications(DescribeYarnApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYarnApplications", DescribeYarnApplicationsResponse.class);
    }

    /**
     *获取资源调度中的队列信息
     * @param req DescribeYarnQueueRequest
     * @return DescribeYarnQueueResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnQueueResponse DescribeYarnQueue(DescribeYarnQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYarnQueue", DescribeYarnQueueResponse.class);
    }

    /**
     *查看yarn资源调度的调度历史。废弃，请使用流程中心查看历史记录。
     * @param req DescribeYarnScheduleHistoryRequest
     * @return DescribeYarnScheduleHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnScheduleHistoryResponse DescribeYarnScheduleHistory(DescribeYarnScheduleHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYarnScheduleHistory", DescribeYarnScheduleHistoryResponse.class);
    }

    /**
     *集群续费询价。
     * @param req InquirePriceRenewEmrRequest
     * @return InquirePriceRenewEmrResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewEmrResponse InquirePriceRenewEmr(InquirePriceRenewEmrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewEmr", InquirePriceRenewEmrResponse.class);
    }

    /**
     *创建实例询价
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateInstance", InquiryPriceCreateInstanceResponse.class);
    }

    /**
     *续费询价。
     * @param req InquiryPriceRenewInstanceRequest
     * @return InquiryPriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstanceResponse InquiryPriceRenewInstance(InquiryPriceRenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewInstance", InquiryPriceRenewInstanceResponse.class);
    }

    /**
     *扩容询价. 当扩容时候，请通过该接口查询价格。
     * @param req InquiryPriceScaleOutInstanceRequest
     * @return InquiryPriceScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceScaleOutInstanceResponse InquiryPriceScaleOutInstance(InquiryPriceScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceScaleOutInstance", InquiryPriceScaleOutInstanceResponse.class);
    }

    /**
     *变配询价
     * @param req InquiryPriceUpdateInstanceRequest
     * @return InquiryPriceUpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpdateInstanceResponse InquiryPriceUpdateInstance(InquiryPriceUpdateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpdateInstance", InquiryPriceUpdateInstanceResponse.class);
    }

    /**
     *前提：预付费集群
资源级别开启或关闭自动续费
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *修改自动扩缩容规则
     * @param req ModifyAutoScaleStrategyRequest
     * @return ModifyAutoScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScaleStrategyResponse ModifyAutoScaleStrategy(ModifyAutoScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScaleStrategy", ModifyAutoScaleStrategyResponse.class);
    }

    /**
     *修改YARN资源调度的全局配置
     * @param req ModifyGlobalConfigRequest
     * @return ModifyGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalConfigResponse ModifyGlobalConfig(ModifyGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalConfig", ModifyGlobalConfigResponse.class);
    }

    /**
     *设置巡检任务配置
     * @param req ModifyInspectionSettingsRequest
     * @return ModifyInspectionSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInspectionSettingsResponse ModifyInspectionSettings(ModifyInspectionSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInspectionSettings", ModifyInspectionSettingsResponse.class);
    }

    /**
     *修改集群名称
     * @param req ModifyInstanceBasicRequest
     * @return ModifyInstanceBasicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceBasicResponse ModifyInstanceBasic(ModifyInstanceBasicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceBasic", ModifyInstanceBasicResponse.class);
    }

    /**
     *调整Pod数量
     * @param req ModifyPodNumRequest
     * @return ModifyPodNumResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPodNumResponse ModifyPodNum(ModifyPodNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPodNum", ModifyPodNumResponse.class);
    }

    /**
     *变配实例
     * @param req ModifyResourceRequest
     * @return ModifyResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceResponse ModifyResource(ModifyResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResource", ModifyResourceResponse.class);
    }

    /**
     *已废弃，请使用DeployYarnConf\\n，近一年未被调用

刷新YARN的动态资源池。已废弃，请使用`DeployYarnConf`
     * @param req ModifyResourcePoolsRequest
     * @return ModifyResourcePoolsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePoolsResponse ModifyResourcePools(ModifyResourcePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcePools", ModifyResourcePoolsResponse.class);
    }

    /**
     *已废弃，请使用ModifyYarnQueueV2来修改队列配置，近一年无相关日志

修改YARN资源调度的资源配置。已废弃，请使用`ModifyYarnQueueV2`来修改队列配置
     * @param req ModifyResourceScheduleConfigRequest
     * @return ModifyResourceScheduleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceScheduleConfigResponse ModifyResourceScheduleConfig(ModifyResourceScheduleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceScheduleConfig", ModifyResourceScheduleConfigResponse.class);
    }

    /**
     *修改了yarn的资源调度器，点击部署生效。
     * @param req ModifyResourceSchedulerRequest
     * @return ModifyResourceSchedulerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceSchedulerResponse ModifyResourceScheduler(ModifyResourceSchedulerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceScheduler", ModifyResourceSchedulerResponse.class);
    }

    /**
     *强制修改标签
     * @param req ModifyResourcesTagsRequest
     * @return ModifyResourcesTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagsResponse ModifyResourcesTags(ModifyResourcesTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcesTags", ModifyResourcesTagsResponse.class);
    }

    /**
     *本接口（ModifySLInstance）用于Serverless HBase变配实例。
- 接口调用成功，会创建Serverless HBase实例，创建实例请求成功会返回请求的 RequestID。
- 接口为异步接口，接口返回时操作并未立即完成，实例操作结果可以通过调用DescribeInstancesList查看当前实例的StatusDesc状态。
     * @param req ModifySLInstanceRequest
     * @return ModifySLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySLInstanceResponse ModifySLInstance(ModifySLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySLInstance", ModifySLInstanceResponse.class);
    }

    /**
     *serverless hbase修改实例名称
     * @param req ModifySLInstanceBasicRequest
     * @return ModifySLInstanceBasicResponse
     * @throws TencentCloudSDKException
     */
    public ModifySLInstanceBasicResponse ModifySLInstanceBasic(ModifySLInstanceBasicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySLInstanceBasic", ModifySLInstanceBasicResponse.class);
    }

    /**
     *用户管理-修改用户组
     * @param req ModifyUserGroupRequest
     * @return ModifyUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserGroupResponse ModifyUserGroup(ModifyUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserGroup", ModifyUserGroupResponse.class);
    }

    /**
     *修改用户密码（用户管理）
     * @param req ModifyUserManagerPwdRequest
     * @return ModifyUserManagerPwdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserManagerPwdResponse ModifyUserManagerPwd(ModifyUserManagerPwdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserManagerPwd", ModifyUserManagerPwdResponse.class);
    }

    /**
     *变更用户组用户信息
     * @param req ModifyUsersOfGroupSTDRequest
     * @return ModifyUsersOfGroupSTDResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsersOfGroupSTDResponse ModifyUsersOfGroupSTD(ModifyUsersOfGroupSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUsersOfGroupSTD", ModifyUsersOfGroupSTDResponse.class);
    }

    /**
     *该接口已废弃，请使用DeployYarnConf完成部署生效

部署生效。已废弃，请使用`DeployYarnConf`接口进行部署生效
     * @param req ModifyYarnDeployRequest
     * @return ModifyYarnDeployResponse
     * @throws TencentCloudSDKException
     */
    public ModifyYarnDeployResponse ModifyYarnDeploy(ModifyYarnDeployRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyYarnDeploy", ModifyYarnDeployResponse.class);
    }

    /**
     *修改资源调度中队列信息
     * @param req ModifyYarnQueueV2Request
     * @return ModifyYarnQueueV2Response
     * @throws TencentCloudSDKException
     */
    public ModifyYarnQueueV2Response ModifyYarnQueueV2(ModifyYarnQueueV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyYarnQueueV2", ModifyYarnQueueV2Response.class);
    }

    /**
     *修改YARN资源调度的资源配置
     * @param req ResetYarnConfigRequest
     * @return ResetYarnConfigResponse
     * @throws TencentCloudSDKException
     */
    public ResetYarnConfigResponse ResetYarnConfig(ResetYarnConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetYarnConfig", ResetYarnConfigResponse.class);
    }

    /**
     *云数据盘扩容
     * @param req ResizeDataDisksRequest
     * @return ResizeDataDisksResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDataDisksResponse ResizeDataDisks(ResizeDataDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDataDisks", ResizeDataDisksResponse.class);
    }

    /**
     *创建流程作业
     * @param req RunJobFlowRequest
     * @return RunJobFlowResponse
     * @throws TencentCloudSDKException
     */
    public RunJobFlowResponse RunJobFlow(RunJobFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunJobFlow", RunJobFlowResponse.class);
    }

    /**
     *扩容集群节点
     * @param req ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutClusterResponse ScaleOutCluster(ScaleOutClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutCluster", ScaleOutClusterResponse.class);
    }

    /**
     *扩容节点
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *设置当前集群的某个节点规格配置为默认或取消默认
     * @param req SetNodeResourceConfigDefaultRequest
     * @return SetNodeResourceConfigDefaultResponse
     * @throws TencentCloudSDKException
     */
    public SetNodeResourceConfigDefaultResponse SetNodeResourceConfigDefault(SetNodeResourceConfigDefaultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNodeResourceConfigDefault", SetNodeResourceConfigDefaultResponse.class);
    }

    /**
     *用于启停服务 重启服务等功能
     * @param req StartStopServiceOrMonitorRequest
     * @return StartStopServiceOrMonitorResponse
     * @throws TencentCloudSDKException
     */
    public StartStopServiceOrMonitorResponse StartStopServiceOrMonitor(StartStopServiceOrMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStopServiceOrMonitor", StartStopServiceOrMonitorResponse.class);
    }

    /**
     *EMR同步TKE中POD状态
     * @param req SyncPodStateRequest
     * @return SyncPodStateResponse
     * @throws TencentCloudSDKException
     */
    public SyncPodStateResponse SyncPodState(SyncPodStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncPodState", SyncPodStateResponse.class);
    }

    /**
     *销毁集群节点
     * @param req TerminateClusterNodesRequest
     * @return TerminateClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateClusterNodesResponse TerminateClusterNodes(TerminateClusterNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateClusterNodes", TerminateClusterNodesResponse.class);
    }

    /**
     *销毁EMR实例。此接口仅支持弹性MapReduce正式计费版本。
     * @param req TerminateInstanceRequest
     * @return TerminateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstanceResponse TerminateInstance(TerminateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstance", TerminateInstanceResponse.class);
    }

    /**
     *本接口（TerminateSLInstance）用于销毁Serverless HBase实例
     * @param req TerminateSLInstanceRequest
     * @return TerminateSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateSLInstanceResponse TerminateSLInstance(TerminateSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateSLInstance", TerminateSLInstanceResponse.class);
    }

    /**
     *缩容Task节点
     * @param req TerminateTasksRequest
     * @return TerminateTasksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTasksResponse TerminateTasks(TerminateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateTasks", TerminateTasksResponse.class);
    }

}
