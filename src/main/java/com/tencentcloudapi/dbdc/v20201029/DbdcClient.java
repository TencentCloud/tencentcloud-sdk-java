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
package com.tencentcloudapi.dbdc.v20201029;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbdc.v20201029.models.*;

public class DbdcClient extends AbstractClient{
    private static String endpoint = "dbdc.tencentcloudapi.com";
    private static String service = "dbdc";
    private static String version = "2020-10-29";

    public DbdcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbdcClient(Credential credential, String region, ClientProfile profile) {
        super(DbdcClient.endpoint, DbdcClient.version, credential, region, profile);
    }

    /**
     *该接口（AddNodesToDBCustomCluster）用于为 DB Custom 集群上架节点。
     * @param req AddNodesToDBCustomClusterRequest
     * @return AddNodesToDBCustomClusterResponse
     * @throws TencentCloudSDKException
     */
    public AddNodesToDBCustomClusterResponse AddNodesToDBCustomCluster(AddNodesToDBCustomClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodesToDBCustomCluster", AddNodesToDBCustomClusterResponse.class);
    }

    /**
     *检查服务相关角色是否已创建
     * @param req CheckRoleAuthorizedRequest
     * @return CheckRoleAuthorizedResponse
     * @throws TencentCloudSDKException
     */
    public CheckRoleAuthorizedResponse CheckRoleAuthorized(CheckRoleAuthorizedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRoleAuthorized", CheckRoleAuthorizedResponse.class);
    }

    /**
     *该接口（CreateDBCustomCluster）用于创建 DB Custom 集群。
     * @param req CreateDBCustomClusterRequest
     * @return CreateDBCustomClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBCustomClusterResponse CreateDBCustomCluster(CreateDBCustomClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBCustomCluster", CreateDBCustomClusterResponse.class);
    }

    /**
     *该接口（CreateDBCustomNodes）用于创建 DB Custom 节点(需支付)。
     * @param req CreateDBCustomNodesRequest
     * @return CreateDBCustomNodesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBCustomNodesResponse CreateDBCustomNodes(CreateDBCustomNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBCustomNodes", CreateDBCustomNodesResponse.class);
    }

    /**
     *该接口(DescribeDBCustomClusterDetail) 用于查询 DB Custom 集群的详情信息。
     * @param req DescribeDBCustomClusterDetailRequest
     * @return DescribeDBCustomClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomClusterDetailResponse DescribeDBCustomClusterDetail(DescribeDBCustomClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomClusterDetail", DescribeDBCustomClusterDetailResponse.class);
    }

    /**
     *该接口（DescribeDBCustomClusterKubeconfig）用于查询 DB Custom 集群 Kubeconfig。
     * @param req DescribeDBCustomClusterKubeconfigRequest
     * @return DescribeDBCustomClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomClusterKubeconfigResponse DescribeDBCustomClusterKubeconfig(DescribeDBCustomClusterKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomClusterKubeconfig", DescribeDBCustomClusterKubeconfigResponse.class);
    }

    /**
     *该接口（DescribeDBCustomClusterNodes）用于查询 DB Custom 集群中的节点列表。
     * @param req DescribeDBCustomClusterNodesRequest
     * @return DescribeDBCustomClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomClusterNodesResponse DescribeDBCustomClusterNodes(DescribeDBCustomClusterNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomClusterNodes", DescribeDBCustomClusterNodesResponse.class);
    }

    /**
     *该接口（DescribeDBCustomClusters）为DB Custom 集群列表查询接口。
     * @param req DescribeDBCustomClustersRequest
     * @return DescribeDBCustomClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomClustersResponse DescribeDBCustomClusters(DescribeDBCustomClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomClusters", DescribeDBCustomClustersResponse.class);
    }

    /**
     *该接口（DescribeDBCustomImages）用于查询 DB Custom 可用的操作系统镜像列表。
     * @param req DescribeDBCustomImagesRequest
     * @return DescribeDBCustomImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomImagesResponse DescribeDBCustomImages(DescribeDBCustomImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomImages", DescribeDBCustomImagesResponse.class);
    }

    /**
     *该接口（DescribeDBCustomNodes）用于查询 DB Custom 节点列表。
     * @param req DescribeDBCustomNodesRequest
     * @return DescribeDBCustomNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomNodesResponse DescribeDBCustomNodes(DescribeDBCustomNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomNodes", DescribeDBCustomNodesResponse.class);
    }

    /**
     *该接口（DescribeDBCustomTaskStatus）用于查询 DB Custom 任务的状态。
     * @param req DescribeDBCustomTaskStatusRequest
     * @return DescribeDBCustomTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBCustomTaskStatusResponse DescribeDBCustomTaskStatus(DescribeDBCustomTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBCustomTaskStatus", DescribeDBCustomTaskStatusResponse.class);
    }

    /**
     *本接口用于查询独享集群内的DB实例列表
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口用于查询主机列表
     * @param req DescribeHostListRequest
     * @return DescribeHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostListResponse DescribeHostList(DescribeHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostList", DescribeHostListResponse.class);
    }

    /**
     *本接口用于查询独享集群详情
     * @param req DescribeInstanceDetailRequest
     * @return DescribeInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDetailResponse DescribeInstanceDetail(DescribeInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDetail", DescribeInstanceDetailResponse.class);
    }

    /**
     *本接口用于查询独享集群实例列表
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *根据不同地域不同用户，获取集群列表信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *该接口（DestroyDBCustomCluster）用于销毁 DB Custom 集群。
     * @param req DestroyDBCustomClusterRequest
     * @return DestroyDBCustomClusterResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBCustomClusterResponse DestroyDBCustomCluster(DestroyDBCustomClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyDBCustomCluster", DestroyDBCustomClusterResponse.class);
    }

    /**
     *该接口（DestroyDBCustomNode）用于销毁 DB Custom 节点。
     * @param req DestroyDBCustomNodeRequest
     * @return DestroyDBCustomNodeResponse
     * @throws TencentCloudSDKException
     */
    public DestroyDBCustomNodeResponse DestroyDBCustomNode(DestroyDBCustomNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyDBCustomNode", DestroyDBCustomNodeResponse.class);
    }

    /**
     *该接口 (IsolateDBCustomNode) 用于隔离 DB Custom 节点。
     * @param req IsolateDBCustomNodeRequest
     * @return IsolateDBCustomNodeResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBCustomNodeResponse IsolateDBCustomNode(IsolateDBCustomNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBCustomNode", IsolateDBCustomNodeResponse.class);
    }

    /**
     *该接口（ModifyDBCustomClusterTags）用于修改 DB Custom 集群的标签配置。
     * @param req ModifyDBCustomClusterTagsRequest
     * @return ModifyDBCustomClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBCustomClusterTagsResponse ModifyDBCustomClusterTags(ModifyDBCustomClusterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBCustomClusterTags", ModifyDBCustomClusterTagsResponse.class);
    }

    /**
     *该接口（ModifyDBCustomNodeTags）用于修改 DB Custom 节点的标签配置。
     * @param req ModifyDBCustomNodeTagsRequest
     * @return ModifyDBCustomNodeTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBCustomNodeTagsResponse ModifyDBCustomNodeTags(ModifyDBCustomNodeTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBCustomNodeTags", ModifyDBCustomNodeTagsResponse.class);
    }

    /**
     *本接口用于修改集群名称
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceName", ModifyInstanceNameResponse.class);
    }

    /**
     *该接口（RemoveNodesFromDBCustomCluster）用于从 DB Custom 集群移除节点。
     * @param req RemoveNodesFromDBCustomClusterRequest
     * @return RemoveNodesFromDBCustomClusterResponse
     * @throws TencentCloudSDKException
     */
    public RemoveNodesFromDBCustomClusterResponse RemoveNodesFromDBCustomCluster(RemoveNodesFromDBCustomClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveNodesFromDBCustomCluster", RemoveNodesFromDBCustomClusterResponse.class);
    }

    /**
     *该接口（RenewDBCustomNode）用于给 DB Custom 节点续费。
     * @param req RenewDBCustomNodeRequest
     * @return RenewDBCustomNodeResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBCustomNodeResponse RenewDBCustomNode(RenewDBCustomNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBCustomNode", RenewDBCustomNodeResponse.class);
    }

}
