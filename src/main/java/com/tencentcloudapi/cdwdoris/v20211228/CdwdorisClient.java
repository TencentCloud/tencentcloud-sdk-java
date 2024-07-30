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
package com.tencentcloudapi.cdwdoris.v20211228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwdoris.v20211228.models.*;

public class CdwdorisClient extends AbstractClient{
    private static String endpoint = "cdwdoris.tencentcloudapi.com";
    private static String service = "cdwdoris";
    private static String version = "2021-12-28";
    
    public CdwdorisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwdorisClient(Credential credential, String region, ClientProfile profile) {
        super(CdwdorisClient.endpoint, CdwdorisClient.version, credential, region, profile);
    }

    /**
     *通过API创建集群
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceNew", CreateInstanceNewResponse.class);
    }

    /**
     *创建资源组
     * @param req CreateWorkloadGroupRequest
     * @return CreateWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkloadGroupResponse CreateWorkloadGroup(CreateWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkloadGroup", CreateWorkloadGroupResponse.class);
    }

    /**
     *删除资源组
     * @param req DeleteWorkloadGroupRequest
     * @return DeleteWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkloadGroupResponse DeleteWorkloadGroup(DeleteWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkloadGroup", DeleteWorkloadGroupResponse.class);
    }

    /**
     *获取集群的最新的几个配置文件（config.xml、metrika.xml、user.xml）的内容，显示给用户
     * @param req DescribeClusterConfigsRequest
     * @return DescribeClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsResponse DescribeClusterConfigs(DescribeClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigs", DescribeClusterConfigsResponse.class);
    }

    /**
     *下载数据库审计日志
     * @param req DescribeDatabaseAuditDownloadRequest
     * @return DescribeDatabaseAuditDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditDownloadResponse DescribeDatabaseAuditDownload(DescribeDatabaseAuditDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditDownload", DescribeDatabaseAuditDownloadResponse.class);
    }

    /**
     *获取数据库审计记录
     * @param req DescribeDatabaseAuditRecordsRequest
     * @return DescribeDatabaseAuditRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditRecordsResponse DescribeDatabaseAuditRecords(DescribeDatabaseAuditRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditRecords", DescribeDatabaseAuditRecordsResponse.class);
    }

    /**
     *获取联合身份临时访问凭证
     * @param req DescribeFederationTokenRequest
     * @return DescribeFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFederationTokenResponse DescribeFederationToken(DescribeFederationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFederationToken", DescribeFederationTokenResponse.class);
    }

    /**
     *生成计费相关接口的GoodsDetail结构
     * @param req DescribeGoodsDetailRequest
     * @return DescribeGoodsDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGoodsDetailResponse DescribeGoodsDetail(DescribeGoodsDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGoodsDetail", DescribeGoodsDetailResponse.class);
    }

    /**
     *根据集群ID查询某个集群的具体信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *获取集群节点信息列表
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *获取BE/FE节点角色
     * @param req DescribeInstanceNodesInfoRequest
     * @return DescribeInstanceNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesInfoResponse DescribeInstanceNodesInfo(DescribeInstanceNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesInfo", DescribeInstanceNodesInfoResponse.class);
    }

    /**
     *集群详情页中显示集群状态、流程进度等
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *获取集群已使用子网信息
     * @param req DescribeInstanceUsedSubnetsRequest
     * @return DescribeInstanceUsedSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceUsedSubnetsResponse DescribeInstanceUsedSubnets(DescribeInstanceUsedSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceUsedSubnets", DescribeInstanceUsedSubnetsResponse.class);
    }

    /**
     *获取集群列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *购买页获取地域及可用区列表、内核版本、网络规则等
     * @param req DescribeRegionZoneRequest
     * @return DescribeRegionZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionZoneResponse DescribeRegionZone(DescribeRegionZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegionZone", DescribeRegionZoneResponse.class);
    }

    /**
     *检查内核版本是否支持新的备份恢复语法
     * @param req DescribeReplicaVersionRequest
     * @return DescribeReplicaVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicaVersionResponse DescribeReplicaVersion(DescribeReplicaVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicaVersion", DescribeReplicaVersionResponse.class);
    }

    /**
     *查询恢复任务进度详情
     * @param req DescribeRestoreTaskDetailRequest
     * @return DescribeRestoreTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTaskDetailResponse DescribeRestoreTaskDetail(DescribeRestoreTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTaskDetail", DescribeRestoreTaskDetailResponse.class);
    }

    /**
     *获取慢查询列表
     * @param req DescribeSlowQueryRecordsRequest
     * @return DescribeSlowQueryRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsResponse DescribeSlowQueryRecords(DescribeSlowQueryRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecords", DescribeSlowQueryRecordsResponse.class);
    }

    /**
     *下载慢查询文件
     * @param req DescribeSlowQueryRecordsDownloadRequest
     * @return DescribeSlowQueryRecordsDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsDownloadResponse DescribeSlowQueryRecordsDownload(DescribeSlowQueryRecordsDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecordsDownload", DescribeSlowQueryRecordsDownloadResponse.class);
    }

    /**
     *针对驱动sql命令查询ck集群接口
     * @param req DescribeSqlApisRequest
     * @return DescribeSqlApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSqlApisResponse DescribeSqlApis(DescribeSqlApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSqlApis", DescribeSqlApisResponse.class);
    }

    /**
     *获取当前集群各用户绑定的资源信息
     * @param req DescribeUserBindWorkloadGroupRequest
     * @return DescribeUserBindWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserBindWorkloadGroupResponse DescribeUserBindWorkloadGroup(DescribeUserBindWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserBindWorkloadGroup", DescribeUserBindWorkloadGroupResponse.class);
    }

    /**
     *获取资源组信息
     * @param req DescribeWorkloadGroupRequest
     * @return DescribeWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkloadGroupResponse DescribeWorkloadGroup(DescribeWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkloadGroup", DescribeWorkloadGroupResponse.class);
    }

    /**
     *销毁集群
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstance", DestroyInstanceResponse.class);
    }

    /**
     *给已存在集群，配置日志服务
     * @param req FitClsLogRequest
     * @return FitClsLogResponse
     * @throws TencentCloudSDKException
     */
    public FitClsLogResponse FitClsLog(FitClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FitClsLog", FitClsLogResponse.class);
    }

    /**
     *修改集群名称
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *KV模式修改配置接口
     * @param req ModifyInstanceKeyValConfigsRequest
     * @return ModifyInstanceKeyValConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceKeyValConfigsResponse ModifyInstanceKeyValConfigs(ModifyInstanceKeyValConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceKeyValConfigs", ModifyInstanceKeyValConfigsResponse.class);
    }

    /**
     *更改安全组
     * @param req ModifySecurityGroupsRequest
     * @return ModifySecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupsResponse ModifySecurityGroups(ModifySecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroups", ModifySecurityGroupsResponse.class);
    }

    /**
     *修改用户绑定的资源组
     * @param req ModifyUserBindWorkloadGroupRequest
     * @return ModifyUserBindWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserBindWorkloadGroupResponse ModifyUserBindWorkloadGroup(ModifyUserBindWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserBindWorkloadGroup", ModifyUserBindWorkloadGroupResponse.class);
    }

    /**
     *修改用户权限,支持catalog，全部db，部分db表三种权限设置类别
     * @param req ModifyUserPrivilegesV3Request
     * @return ModifyUserPrivilegesV3Response
     * @throws TencentCloudSDKException
     */
    public ModifyUserPrivilegesV3Response ModifyUserPrivilegesV3(ModifyUserPrivilegesV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPrivilegesV3", ModifyUserPrivilegesV3Response.class);
    }

    /**
     *修改资源组信息
     * @param req ModifyWorkloadGroupRequest
     * @return ModifyWorkloadGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkloadGroupResponse ModifyWorkloadGroup(ModifyWorkloadGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkloadGroup", ModifyWorkloadGroupResponse.class);
    }

    /**
     *开启或关闭资源组
     * @param req ModifyWorkloadGroupStatusRequest
     * @return ModifyWorkloadGroupStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkloadGroupStatusResponse ModifyWorkloadGroupStatus(ModifyWorkloadGroupStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkloadGroupStatus", ModifyWorkloadGroupStatusResponse.class);
    }

    /**
     *集群缩容
     * @param req ReduceInstanceRequest
     * @return ReduceInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ReduceInstanceResponse ReduceInstance(ReduceInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReduceInstance", ReduceInstanceResponse.class);
    }

    /**
     *扩容云盘
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisk", ResizeDiskResponse.class);
    }

    /**
     *集群滚动重启
     * @param req RestartClusterForNodeRequest
     * @return RestartClusterForNodeResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForNodeResponse RestartClusterForNode(RestartClusterForNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForNode", RestartClusterForNodeResponse.class);
    }

    /**
     *水平扩容节点
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *计算资源垂直变配
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

}
