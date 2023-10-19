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
package com.tencentcloudapi.tdcpg.v20211118;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdcpg.v20211118.models.*;

public class TdcpgClient extends AbstractClient{
    private static String endpoint = "tdcpg.tencentcloudapi.com";
    private static String service = "tdcpg";
    private static String version = "2021-11-18";
    
    public TdcpgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdcpgClient(Credential credential, String region, ClientProfile profile) {
        super(TdcpgClient.endpoint, TdcpgClient.version, credential, region, profile);
    }

    /**
     *使用指定时间点的备份克隆一个新的集群
     * @param req CloneClusterToPointInTimeRequest
     * @return CloneClusterToPointInTimeResponse
     * @throws TencentCloudSDKException
     */
    public CloneClusterToPointInTimeResponse CloneClusterToPointInTime(CloneClusterToPointInTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneClusterToPointInTime", CloneClusterToPointInTimeResponse.class);
    }

    /**
     *创建集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *在集群中新建实例
     * @param req CreateClusterInstancesRequest
     * @return CreateClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterInstancesResponse CreateClusterInstances(CreateClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterInstances", CreateClusterInstancesResponse.class);
    }

    /**
     *删除集群，集群中的实例和数据都将被删除，且无法恢复。只有当集群状态处于isolated(已隔离)时才生效。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *删除实例。只有当实例状态处于isolated(已隔离)时才生效。
     * @param req DeleteClusterInstancesRequest
     * @return DeleteClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterInstancesResponse DeleteClusterInstances(DeleteClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterInstances", DeleteClusterInstancesResponse.class);
    }

    /**
     *查询数据库账号信息
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *查询集群的备份集
     * @param req DescribeClusterBackupsRequest
     * @return DescribeClusterBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterBackupsResponse DescribeClusterBackups(DescribeClusterBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterBackups", DescribeClusterBackupsResponse.class);
    }

    /**
     *查询集群接入点信息
     * @param req DescribeClusterEndpointsRequest
     * @return DescribeClusterEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointsResponse DescribeClusterEndpoints(DescribeClusterEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpoints", DescribeClusterEndpointsResponse.class);
    }

    /**
     *查询实例
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *查询集群可回档时间范围
     * @param req DescribeClusterRecoveryTimeRangeRequest
     * @return DescribeClusterRecoveryTimeRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRecoveryTimeRangeResponse DescribeClusterRecoveryTimeRange(DescribeClusterRecoveryTimeRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRecoveryTimeRange", DescribeClusterRecoveryTimeRangeResponse.class);
    }

    /**
     *查询集群
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *根据订单号获取资源信息
     * @param req DescribeResourcesByDealNameRequest
     * @return DescribeResourcesByDealNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByDealNameResponse DescribeResourcesByDealName(DescribeResourcesByDealNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByDealName", DescribeResourcesByDealNameResponse.class);
    }

    /**
     *隔离集群，集群的接入点网络将会断掉无法连接使用数据库。只有当集群状态处于running(运行中)时才生效。
     * @param req IsolateClusterRequest
     * @return IsolateClusterResponse
     * @throws TencentCloudSDKException
     */
    public IsolateClusterResponse IsolateCluster(IsolateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateCluster", IsolateClusterResponse.class);
    }

    /**
     *隔离实例。此接口只针对状态为running的实例生效，使用场景包括：
 - 批量隔离集群内所有的实例
 - 在读写实例为running(运行中)时，单个/批量隔离只读实例
 - 集群内所有只读实例为isolated(已隔离)时，单独隔离读写实例
     * @param req IsolateClusterInstancesRequest
     * @return IsolateClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateClusterInstancesResponse IsolateClusterInstances(IsolateClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateClusterInstances", IsolateClusterInstancesResponse.class);
    }

    /**
     *修改数据库账号描述
     * @param req ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountDescriptionResponse ModifyAccountDescription(ModifyAccountDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccountDescription", ModifyAccountDescriptionResponse.class);
    }

    /**
     *开启或者关闭接入点外网
     * @param req ModifyClusterEndpointWanStatusRequest
     * @return ModifyClusterEndpointWanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterEndpointWanStatusResponse ModifyClusterEndpointWanStatus(ModifyClusterEndpointWanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterEndpointWanStatus", ModifyClusterEndpointWanStatusResponse.class);
    }

    /**
     *修改实例规格，此接口只针对状态为running(运行中)的实例生效
     * @param req ModifyClusterInstancesSpecRequest
     * @return ModifyClusterInstancesSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterInstancesSpecResponse ModifyClusterInstancesSpec(ModifyClusterInstancesSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterInstancesSpec", ModifyClusterInstancesSpecResponse.class);
    }

    /**
     *修改集群名字
     * @param req ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNameResponse ModifyClusterName(ModifyClusterNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterName", ModifyClusterNameResponse.class);
    }

    /**
     *修改集群自动续费，只对预付费集群生效。
     * @param req ModifyClustersAutoRenewFlagRequest
     * @return ModifyClustersAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClustersAutoRenewFlagResponse ModifyClustersAutoRenewFlag(ModifyClustersAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClustersAutoRenewFlag", ModifyClustersAutoRenewFlagResponse.class);
    }

    /**
     *恢复集群，恢复集群的接入点网络，恢复后继续连接使用数据库。只有当集群状态处于isolated(已隔离)时才生效。
     * @param req RecoverClusterRequest
     * @return RecoverClusterResponse
     * @throws TencentCloudSDKException
     */
    public RecoverClusterResponse RecoverCluster(RecoverClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverCluster", RecoverClusterResponse.class);
    }

    /**
     *恢复实例。此接口的使用场景包括：
 - 读写实例状态为running(运行中)时，批量恢复状态为isolated(已隔离)的只读实例
 - 读写实例状态为isolated(已隔离)时，恢复读写实例
 - 读写实例状态为isolated(已隔离)时，批量恢复读写实例以及状态为isolated(已隔离)的只读实例
     * @param req RecoverClusterInstancesRequest
     * @return RecoverClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RecoverClusterInstancesResponse RecoverClusterInstances(RecoverClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverClusterInstances", RecoverClusterInstancesResponse.class);
    }

    /**
     *续费集群
     * @param req RenewClusterRequest
     * @return RenewClusterResponse
     * @throws TencentCloudSDKException
     */
    public RenewClusterResponse RenewCluster(RenewClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewCluster", RenewClusterResponse.class);
    }

    /**
     *重置数据库账号密码
     * @param req ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetAccountPasswordResponse ResetAccountPassword(ResetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAccountPassword", ResetAccountPasswordResponse.class);
    }

    /**
     *重启实例，此接口只针对状态为running(运行中)的实例生效。
     * @param req RestartClusterInstancesRequest
     * @return RestartClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterInstancesResponse RestartClusterInstances(RestartClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterInstances", RestartClusterInstancesResponse.class);
    }

    /**
     *转换集群付费模式，目前只支持从 后付费 转换成 与预付费。
     * @param req TransformClusterPayModeRequest
     * @return TransformClusterPayModeResponse
     * @throws TencentCloudSDKException
     */
    public TransformClusterPayModeResponse TransformClusterPayMode(TransformClusterPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransformClusterPayMode", TransformClusterPayModeResponse.class);
    }

}
