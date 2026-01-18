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
package com.tencentcloudapi.cdwch.v20200915;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwch.v20200915.models.*;

public class CdwchClient extends AbstractClient{
    private static String endpoint = "cdwch.tencentcloudapi.com";
    private static String service = "cdwch";
    private static String version = "2020-09-15";

    public CdwchClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwchClient(Credential credential, String region, ClientProfile profile) {
        super(CdwchClient.endpoint, CdwchClient.version, credential, region, profile);
    }

    /**
     *新增和修改用户接口
     * @param req ActionAlterCkUserRequest
     * @return ActionAlterCkUserResponse
     * @throws TencentCloudSDKException
     */
    public ActionAlterCkUserResponse ActionAlterCkUser(ActionAlterCkUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActionAlterCkUser", ActionAlterCkUserResponse.class);
    }

    /**
     *创建或者修改备份策略
     * @param req CreateBackUpScheduleRequest
     * @return CreateBackUpScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackUpScheduleResponse CreateBackUpSchedule(CreateBackUpScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackUpSchedule", CreateBackUpScheduleResponse.class);
    }

    /**
     *创建集群
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceNew", CreateInstanceNewResponse.class);
    }

    /**
     *删除备份数据
     * @param req DeleteBackUpDataRequest
     * @return DeleteBackUpDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackUpDataResponse DeleteBackUpData(DeleteBackUpDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackUpData", DeleteBackUpDataResponse.class);
    }

    /**
     *查询备份任务列表
     * @param req DescribeBackUpJobRequest
     * @return DescribeBackUpJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpJobResponse DescribeBackUpJob(DescribeBackUpJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpJob", DescribeBackUpJobResponse.class);
    }

    /**
     *查询备份任务详情
     * @param req DescribeBackUpJobDetailRequest
     * @return DescribeBackUpJobDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpJobDetailResponse DescribeBackUpJobDetail(DescribeBackUpJobDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpJobDetail", DescribeBackUpJobDetailResponse.class);
    }

    /**
     *查询备份策略信息
     * @param req DescribeBackUpScheduleRequest
     * @return DescribeBackUpScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpScheduleResponse DescribeBackUpSchedule(DescribeBackUpScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpSchedule", DescribeBackUpScheduleResponse.class);
    }

    /**
     *获取可备份表信息
     * @param req DescribeBackUpTablesRequest
     * @return DescribeBackUpTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackUpTablesResponse DescribeBackUpTables(DescribeBackUpTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackUpTables", DescribeBackUpTablesResponse.class);
    }

    /**
     *获取云原生实例列表
     * @param req DescribeCNInstancesRequest
     * @return DescribeCNInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCNInstancesResponse DescribeCNInstances(DescribeCNInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCNInstances", DescribeCNInstancesResponse.class);
    }

    /**
     *查询集群用户、集群表，数据库等相关信息
     * @param req DescribeCkSqlApisRequest
     * @return DescribeCkSqlApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCkSqlApisResponse DescribeCkSqlApis(DescribeCkSqlApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCkSqlApis", DescribeCkSqlApisResponse.class);
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
     *获取产生的事件
     * @param req DescribeEventTasksRequest
     * @return DescribeEventTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventTasksResponse DescribeEventTasks(DescribeEventTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventTasks", DescribeEventTasksResponse.class);
    }

    /**
     *根据实例ID查询某个实例的具体信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *集群vcluster列表
     * @param req DescribeInstanceClustersRequest
     * @return DescribeInstanceClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceClustersResponse DescribeInstanceClusters(DescribeInstanceClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceClusters", DescribeInstanceClustersResponse.class);
    }

    /**
     *在集群详情页面获取所有参数列表
     * @param req DescribeInstanceKeyValConfigsRequest
     * @return DescribeInstanceKeyValConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceKeyValConfigsResponse DescribeInstanceKeyValConfigs(DescribeInstanceKeyValConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceKeyValConfigs", DescribeInstanceKeyValConfigsResponse.class);
    }

    /**
     *获取实例节点信息列表
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *获取实例shard信息列表
     * @param req DescribeInstanceShardsRequest
     * @return DescribeInstanceShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceShardsResponse DescribeInstanceShards(DescribeInstanceShardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceShards", DescribeInstanceShardsResponse.class);
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
     *获取实例列表，供外部sdk使用
     * @param req DescribeInstancesNewRequest
     * @return DescribeInstancesNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesNewResponse DescribeInstancesNew(DescribeInstancesNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesNew", DescribeInstancesNewResponse.class);
    }

    /**
     *购买页拉取集群的数据节点和zookeeper节点的规格列表
     * @param req DescribeSpecRequest
     * @return DescribeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecResponse DescribeSpec(DescribeSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpec", DescribeSpecResponse.class);
    }

    /**
     *销毁集群 open api
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstance", DestroyInstanceResponse.class);
    }

    /**
     *在集群配置页面修改集群配置文件接口，xml模式
     * @param req ModifyClusterConfigsRequest
     * @return ModifyClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterConfigsResponse ModifyClusterConfigs(ModifyClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterConfigs", ModifyClusterConfigsResponse.class);
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
     *针对集群账号的权限做管控（新版）
     * @param req ModifyUserNewPrivilegeRequest
     * @return ModifyUserNewPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserNewPrivilegeResponse ModifyUserNewPrivilege(ModifyUserNewPrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserNewPrivilege", ModifyUserNewPrivilegeResponse.class);
    }

    /**
     *开启或者关闭策略
     * @param req OpenBackUpRequest
     * @return OpenBackUpResponse
     * @throws TencentCloudSDKException
     */
    public OpenBackUpResponse OpenBackUp(OpenBackUpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenBackUp", OpenBackUpResponse.class);
    }

    /**
     *备份恢复
     * @param req RecoverBackUpJobRequest
     * @return RecoverBackUpJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverBackUpJobResponse RecoverBackUpJob(RecoverBackUpJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverBackUpJob", RecoverBackUpJobResponse.class);
    }

    /**
     *扩容磁盘，包含扩容数据节点，zk节点
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisk", ResizeDiskResponse.class);
    }

    /**
     *open-api接口提供弹性伸缩云原生集群能力
     * @param req ScaleCNOutUpInstanceRequest
     * @return ScaleCNOutUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleCNOutUpInstanceResponse ScaleCNOutUpInstance(ScaleCNOutUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleCNOutUpInstance", ScaleCNOutUpInstanceResponse.class);
    }

    /**
     *调整clickhouse节点数量
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *垂直扩缩容节点规格，修改节点cvm的规格cpu，内存。 规格变化阶段，服务不可用。
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

}
