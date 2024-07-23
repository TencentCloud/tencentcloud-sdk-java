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
package com.tencentcloudapi.thpc.v20230321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.thpc.v20230321.models.*;

public class ThpcClient extends AbstractClient{
    private static String endpoint = "thpc.tencentcloudapi.com";
    private static String service = "thpc";
    private static String version = "2023-03-21";
    
    public ThpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ThpcClient(Credential credential, String region, ClientProfile profile) {
        super(ThpcClient.endpoint, ThpcClient.version, credential, region, profile);
    }

    /**
     *本接口（AddClusterStorageOption）用于添加集群存储选项信息。
     * @param req AddClusterStorageOptionRequest
     * @return AddClusterStorageOptionResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterStorageOptionResponse AddClusterStorageOption(AddClusterStorageOptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddClusterStorageOption", AddClusterStorageOptionResponse.class);
    }

    /**
     *本接口(AddNodes)用于添加一个或者多个计算节点或者登录节点到指定集群。
     * @param req AddNodesRequest
     * @return AddNodesResponse
     * @throws TencentCloudSDKException
     */
    public AddNodesResponse AddNodes(AddNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodes", AddNodesResponse.class);
    }

    /**
     *本接口(AddQueue)用于添加队列到指定集群。
* 本接口为目前只支持SchedulerType为SLURM的集群。
* 单个集群中队列数量上限为10个。
     * @param req AddQueueRequest
     * @return AddQueueResponse
     * @throws TencentCloudSDKException
     */
    public AddQueueResponse AddQueue(AddQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddQueue", AddQueueResponse.class);
    }

    /**
     *本接口 (AttachNodes) 用于绑定一个或者多个计算节点指定资源到指定集群中。
     * @param req AttachNodesRequest
     * @return AttachNodesResponse
     * @throws TencentCloudSDKException
     */
    public AttachNodesResponse AttachNodes(AttachNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachNodes", AttachNodesResponse.class);
    }

    /**
     *本接口 (CreateCluster) 用于创建并启动集群。

* 本接口为异步接口， 当创建集群请求下发成功后会返回一个集群`ID`和一个`RequestId`，此时创建集群操作并未立即完成。在此期间集群的状态将会处于“PENDING”或者“INITING”，集群创建结果可以通过调用 [DescribeClusters](https://cloud.tencent.com/document/product/1527/72100)  接口查询，如果集群状态(ClusterStatus)变为“RUNNING(运行中)”，则代表集群创建成功，“ INIT_FAILED”代表集群创建失败。
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *本接口（DeleteCluster）用于删除一个指定的集群。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *本接口 (DeleteClusterStorageOption) 用于删除集群存储选项信息。
     * @param req DeleteClusterStorageOptionRequest
     * @return DeleteClusterStorageOptionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterStorageOptionResponse DeleteClusterStorageOption(DeleteClusterStorageOptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterStorageOption", DeleteClusterStorageOptionResponse.class);
    }

    /**
     *本接口(DeleteNodes)用于删除指定集群中一个或者多个计算节点或者登录节点。
     * @param req DeleteNodesRequest
     * @return DeleteNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodesResponse DeleteNodes(DeleteNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodes", DeleteNodesResponse.class);
    }

    /**
     *本接口(DeleteQueue)用于从指定集群删除队列。
* 本接口为目前只支持SchedulerType为SLURM的集群。

* 删除队列时，需要保证队列内不存在节点。
     * @param req DeleteQueueRequest
     * @return DeleteQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQueueResponse DeleteQueue(DeleteQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteQueue", DeleteQueueResponse.class);
    }

    /**
     *本接口(DescribeAutoScalingConfiguration)用于查询集群弹性伸缩配置信息。本接口仅适用于弹性伸缩类型为THPC_AS的集群。
     * @param req DescribeAutoScalingConfigurationRequest
     * @return DescribeAutoScalingConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingConfigurationResponse DescribeAutoScalingConfiguration(DescribeAutoScalingConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalingConfiguration", DescribeAutoScalingConfigurationResponse.class);
    }

    /**
     *本接口（DescribeClusterActivities）用于查询集群活动历史记录列表。
     * @param req DescribeClusterActivitiesRequest
     * @return DescribeClusterActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterActivitiesResponse DescribeClusterActivities(DescribeClusterActivitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterActivities", DescribeClusterActivitiesResponse.class);
    }

    /**
     *本接口 (DescribeClusterStorageOption) 用于查询集群存储选项信息。
     * @param req DescribeClusterStorageOptionRequest
     * @return DescribeClusterStorageOptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterStorageOptionResponse DescribeClusterStorageOption(DescribeClusterStorageOptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterStorageOption", DescribeClusterStorageOptionResponse.class);
    }

    /**
     *本接口（DescribeClusters）用于查询集群列表。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *本接口 (DescribeInitNodeScripts) 用于查询节点初始化脚本列表。
     * @param req DescribeInitNodeScriptsRequest
     * @return DescribeInitNodeScriptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInitNodeScriptsResponse DescribeInitNodeScripts(DescribeInitNodeScriptsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInitNodeScripts", DescribeInitNodeScriptsResponse.class);
    }

    /**
     *本接口 (DescribeNodes) 用于查询指定集群节点概览信息列表。
     * @param req DescribeNodesRequest
     * @return DescribeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodesResponse DescribeNodes(DescribeNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodes", DescribeNodesResponse.class);
    }

    /**
     *本接口(DescribeQueues)用于查询指定集群队列概览信息列表。
     * @param req DescribeQueuesRequest
     * @return DescribeQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueuesResponse DescribeQueues(DescribeQueuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQueues", DescribeQueuesResponse.class);
    }

    /**
     *本接口 (DetachNodes) 用于将一个或者多个计算节点从集群中移除，但是不销毁指定计算资源。
     * @param req DetachNodesRequest
     * @return DetachNodesResponse
     * @throws TencentCloudSDKException
     */
    public DetachNodesResponse DetachNodes(DetachNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachNodes", DetachNodesResponse.class);
    }

    /**
     *本接口 (ModifyInitNodeScripts) 用于修改节点初始化脚本。
     * @param req ModifyInitNodeScriptsRequest
     * @return ModifyInitNodeScriptsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInitNodeScriptsResponse ModifyInitNodeScripts(ModifyInitNodeScriptsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInitNodeScripts", ModifyInitNodeScriptsResponse.class);
    }

    /**
     *本接口(SetAutoScalingConfiguration)用于为集群设置集群弹性伸缩配置信息。
     * @param req SetAutoScalingConfigurationRequest
     * @return SetAutoScalingConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoScalingConfigurationResponse SetAutoScalingConfiguration(SetAutoScalingConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAutoScalingConfiguration", SetAutoScalingConfigurationResponse.class);
    }

}
