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
package com.tencentcloudapi.thpc.v20220401;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.thpc.v20220401.models.*;

public class ThpcClient extends AbstractClient{
    private static String endpoint = "thpc.tencentcloudapi.com";
    private static String service = "thpc";
    private static String version = "2022-04-01";
    
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
        JsonResponseModel<AddClusterStorageOptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddClusterStorageOptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddClusterStorageOption");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(AddNodes)用于添加一个或者多个计算节点或者登录节点到指定集群。
     * @param req AddNodesRequest
     * @return AddNodesResponse
     * @throws TencentCloudSDKException
     */
    public AddNodesResponse AddNodes(AddNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<AddQueueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(BindAutoScalingGroup)用于为集群队列绑定弹性伸缩组
     * @param req BindAutoScalingGroupRequest
     * @return BindAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoScalingGroupResponse BindAutoScalingGroup(BindAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateCluster) 用于创建并启动集群。

* 本接口为异步接口， 当创建集群请求下发成功后会返回一个集群`ID`和一个`RequestId`，此时创建集群操作并未立即完成。在此期间集群的状态将会处于“PENDING”或者“INITING”，集群创建结果可以通过调用 [DescribeClusters](https://cloud.tencent.com/document/product/1527/72100)  接口查询，如果集群状态(ClusterStatus)变为“RUNNING(运行中)”，则代表集群创建成功，“ INIT_FAILED”代表集群创建失败。
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCluster）用于删除一个指定的集群。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteClusterStorageOption) 用于删除集群存储选项信息。
     * @param req DeleteClusterStorageOptionRequest
     * @return DeleteClusterStorageOptionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterStorageOptionResponse DeleteClusterStorageOption(DeleteClusterStorageOptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterStorageOptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterStorageOptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterStorageOption");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteNodes)用于删除指定集群中一个或者多个计算节点或者登录节点。
     * @param req DeleteNodesRequest
     * @return DeleteNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodesResponse DeleteNodes(DeleteNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DeleteQueueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteQueueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteQueue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAutoScalingConfiguration)用于查询集群弹性伸缩配置信息。本接口仅适用于弹性伸缩类型为THPC_AS的集群。
     * @param req DescribeAutoScalingConfigurationRequest
     * @return DescribeAutoScalingConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingConfigurationResponse DescribeAutoScalingConfiguration(DescribeAutoScalingConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingConfigurationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoScalingConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeClusterActivities）用于查询集群活动历史记录列表。
     * @param req DescribeClusterActivitiesRequest
     * @return DescribeClusterActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterActivitiesResponse DescribeClusterActivities(DescribeClusterActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterActivitiesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterActivitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterActivities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeClusterStorageOption) 用于查询集群存储选项信息。
     * @param req DescribeClusterStorageOptionRequest
     * @return DescribeClusterStorageOptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterStorageOptionResponse DescribeClusterStorageOption(DescribeClusterStorageOptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterStorageOptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterStorageOptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterStorageOption");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeClusters）用于查询集群列表。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeNodes) 用于查询指定集群节点概览信息列表。
     * @param req DescribeNodesRequest
     * @return DescribeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodesResponse DescribeNodes(DescribeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeQueues)用于查询指定集群队列概览信息列表。
     * @param req DescribeQueuesRequest
     * @return DescribeQueuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueuesResponse DescribeQueues(DescribeQueuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQueuesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQueuesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQueues");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(SetAutoScalingConfiguration)用于为集群设置集群弹性伸缩配置信息。
     * @param req SetAutoScalingConfigurationRequest
     * @return SetAutoScalingConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoScalingConfigurationResponse SetAutoScalingConfiguration(SetAutoScalingConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAutoScalingConfigurationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetAutoScalingConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAutoScalingConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
