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
     *本接口 (BindClusterVpc) 用于为IDC集群绑定VPC和子网。

* 绑定VPC后，集群可在该VPC内开启专线/VPN代理。
* VpcId和SubnetId为必填参数，且子网必须属于指定的VPC。
* 若集群已开通代理，需先关闭代理（DisableClusterDedicatedProxy）再变更VPC绑定。
     * @param req BindClusterVpcRequest
     * @return BindClusterVpcResponse
     * @throws TencentCloudSDKException
     */
    public BindClusterVpcResponse BindClusterVpc(BindClusterVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindClusterVpc", BindClusterVpcResponse.class);
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
     *为指定集群队列创建定时伸缩任务，按计划时间自动调整队列的节点数量。
     * @param req CreateScheduledActionRequest
     * @return CreateScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledActionResponse CreateScheduledAction(CreateScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScheduledAction", CreateScheduledActionResponse.class);
    }

    /**
     *本接口 (CreateWorkspaces) 用于创建工作空间。
     * @param req CreateWorkspacesRequest
     * @return CreateWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspacesResponse CreateWorkspaces(CreateWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaces", CreateWorkspacesResponse.class);
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
     *本接口 (DeleteJob) 用于删除一个作业任务。
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteJob", DeleteJobResponse.class);
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
     *删除指定的定时伸缩任务。
     * @param req DeleteScheduledActionRequest
     * @return DeleteScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledActionResponse DeleteScheduledAction(DeleteScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScheduledAction", DeleteScheduledActionResponse.class);
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
     *本接口 (DescribeClusterDedicatedProxy) 用于查询IDC集群专线/VPN代理的状态。

* 返回终端节点（EndPoint）的当前状态，包括是否就绪、VIP地址等信息。
* 若代理未开通，EndPointReady返回false，EndPointStatus为UNKNOWN。
     * @param req DescribeClusterDedicatedProxyRequest
     * @return DescribeClusterDedicatedProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDedicatedProxyResponse DescribeClusterDedicatedProxy(DescribeClusterDedicatedProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDedicatedProxy", DescribeClusterDedicatedProxyResponse.class);
    }

    /**
     *本接口 (ModifyInitNodeScripts) 用于修改节点初始化脚本。
     * @param req DescribeClusterMonitorStatusRequest
     * @return DescribeClusterMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterMonitorStatusResponse DescribeClusterMonitorStatus(DescribeClusterMonitorStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterMonitorStatus", DescribeClusterMonitorStatusResponse.class);
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
     *查询指定集群可用的机型族列表，用于弹性伸缩配置时选择机型族。
     * @param req DescribeInstanceFamiliesRequest
     * @return DescribeInstanceFamiliesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceFamiliesResponse DescribeInstanceFamilies(DescribeInstanceFamiliesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceFamilies", DescribeInstanceFamiliesResponse.class);
    }

    /**
     *本接口用于查询作业的提交信息。
     * @param req DescribeJobSubmitInfoRequest
     * @return DescribeJobSubmitInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmitInfoResponse DescribeJobSubmitInfo(DescribeJobSubmitInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobSubmitInfo", DescribeJobSubmitInfoResponse.class);
    }

    /**
     *本接口 (DescribeJobs) 用于查询作业任务列表信息。
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobs", DescribeJobsResponse.class);
    }

    /**
     *本接口 (DescribeJobs) 用于查询作业任务列表信息。
     * @param req DescribeJobsOverviewRequest
     * @return DescribeJobsOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsOverviewResponse DescribeJobsOverview(DescribeJobsOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobsOverview", DescribeJobsOverviewResponse.class);
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
     *查询指定集群的队列弹性伸缩配置信息。
     * @param req DescribeQueueAutoScalingRequest
     * @return DescribeQueueAutoScalingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueueAutoScalingResponse DescribeQueueAutoScaling(DescribeQueueAutoScalingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQueueAutoScaling", DescribeQueueAutoScalingResponse.class);
    }

    /**
     *查询指定集群的队列弹性伸缩概览信息，包括期望容量、当前容量、当前动态节点数、有效定时任务数等。
     * @param req DescribeQueueAutoScalingOverviewRequest
     * @return DescribeQueueAutoScalingOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQueueAutoScalingOverviewResponse DescribeQueueAutoScalingOverview(DescribeQueueAutoScalingOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQueueAutoScalingOverview", DescribeQueueAutoScalingOverviewResponse.class);
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
     *查询指定集群队列的定时伸缩任务列表。
     * @param req DescribeScheduledActionsRequest
     * @return DescribeScheduledActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledActionsResponse DescribeScheduledActions(DescribeScheduledActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduledActions", DescribeScheduledActionsResponse.class);
    }

    /**
     *本接口（DescribeWorkspaces）用于查询工作空间列表。
     * @param req DescribeWorkspacesRequest
     * @return DescribeWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspacesResponse DescribeWorkspaces(DescribeWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaces", DescribeWorkspacesResponse.class);
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
     *本接口 (DisableClusterDedicatedProxy) 用于关闭IDC集群的专线/VPN代理。

* 关闭后，系统将删除VPC终端节点（EndPoint），断开IDC集群与云上VPC的网络连接。
* 若代理未开通，调用将返回ProxyNotEnabled错误。
* 操作不可逆，关闭后需重新调用EnableClusterDedicatedProxy开启。
     * @param req DisableClusterDedicatedProxyRequest
     * @return DisableClusterDedicatedProxyResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterDedicatedProxyResponse DisableClusterDedicatedProxy(DisableClusterDedicatedProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableClusterDedicatedProxy", DisableClusterDedicatedProxyResponse.class);
    }

    /**
     *本接口 (ModifyInitNodeScripts) 用于修改节点初始化脚本。
     * @param req DisableClusterMonitorRequest
     * @return DisableClusterMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterMonitorResponse DisableClusterMonitor(DisableClusterMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableClusterMonitor", DisableClusterMonitorResponse.class);
    }

    /**
     *本接口 (EnableClusterDedicatedProxy) 用于开启IDC集群的专线/VPN代理。

* 开启后，系统将自动创建VPC终端节点（EndPoint），实现IDC集群与云上VPC的网络互通。
* 若代理已开通，重复调用将幂等返回已有EndPoint信息。
* SubnetId与VpcId需同时指定或同时不指定。若不指定，则使用集群已绑定的VPC和子网。
     * @param req EnableClusterDedicatedProxyRequest
     * @return EnableClusterDedicatedProxyResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterDedicatedProxyResponse EnableClusterDedicatedProxy(EnableClusterDedicatedProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableClusterDedicatedProxy", EnableClusterDedicatedProxyResponse.class);
    }

    /**
     *本接口 (ModifyInitNodeScripts) 用于修改节点初始化脚本。
     * @param req EnableClusterMonitorRequest
     * @return EnableClusterMonitorResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterMonitorResponse EnableClusterMonitor(EnableClusterMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableClusterMonitor", EnableClusterMonitorResponse.class);
    }

    /**
     *本接口(GenerateRegisterCode)用于为队列创建一个注册码，注册码用于IDC机器的注册纳管。
     * @param req GenerateRegisterCodeRequest
     * @return GenerateRegisterCodeResponse
     * @throws TencentCloudSDKException
     */
    public GenerateRegisterCodeResponse GenerateRegisterCode(GenerateRegisterCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateRegisterCode", GenerateRegisterCodeResponse.class);
    }

    /**
     *本接口 (GenerateRegisterCommand) 用于生成IDC集群的节点注册命令。

* 返回的注册命令可直接在IDC机器上以root身份执行，将该机器纳管进指定的IDC集群。
* 当<code>Proxy=true</code>时，系统会先确保集群专线代理就绪（自动开启终端节点并轮询至ACTIVE），再签发注册码并渲染带代理VIP的注册命令；若在超时窗口内代理仍未就绪，将返回<code>FailedOperation.ProxyNotReady</code>。
* 当<code>Proxy=false</code>时，IDC机器需可直连集群，直接签发注册码并渲染注册命令。
* VpcId与SubnetId需同时指定或同时不指定；仅当<code>Proxy=true</code>且集群未绑定VPC时二者必填。当<code>Proxy=false</code>时二者不生效，若仍传入将返回<code>InvalidParameterValue.ParametersNotSupported</code>。
* 若集群此前已开启专线代理并绑定了VPC/子网，本次传入的VpcId/SubnetId与已绑定值不一致时，将返回<code>UnsupportedOperation.VpcAlreadyBound</code>（不支持改绑）。
* 仅支持IDC类型集群，对非IDC集群调用将返回<code>InvalidParameterValue.ParametersNotSupported</code>。
     * @param req GenerateRegisterCommandRequest
     * @return GenerateRegisterCommandResponse
     * @throws TencentCloudSDKException
     */
    public GenerateRegisterCommandResponse GenerateRegisterCommand(GenerateRegisterCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateRegisterCommand", GenerateRegisterCommandResponse.class);
    }

    /**
     *本接口(InquirePriceCreateWorkspaces)用于创建实例询价。
     * @param req InquirePriceCreateWorkspacesRequest
     * @return InquirePriceCreateWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateWorkspacesResponse InquirePriceCreateWorkspaces(InquirePriceCreateWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateWorkspaces", InquirePriceCreateWorkspacesResponse.class);
    }

    /**
     *查询按量计费工作空间转换为包年包月的价格。不会创建订单或变更资源。
     * @param req InquirePriceModifyWorkspacesChargeTypeRequest
     * @return InquirePriceModifyWorkspacesChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyWorkspacesChargeTypeResponse InquirePriceModifyWorkspacesChargeType(InquirePriceModifyWorkspacesChargeTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceModifyWorkspacesChargeType", InquirePriceModifyWorkspacesChargeTypeResponse.class);
    }

    /**
     *修改集群删除保护状态
     * @param req ModifyClusterDeletionProtectionRequest
     * @return ModifyClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterDeletionProtectionResponse ModifyClusterDeletionProtection(ModifyClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterDeletionProtection", ModifyClusterDeletionProtectionResponse.class);
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
     *本接口用于修改节点属性
     * @param req ModifyNodeAttributeRequest
     * @return ModifyNodeAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodeAttributeResponse ModifyNodeAttribute(ModifyNodeAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodeAttribute", ModifyNodeAttributeResponse.class);
    }

    /**
     *修改指定的定时伸缩任务配置。
     * @param req ModifyScheduledActionRequest
     * @return ModifyScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledActionResponse ModifyScheduledAction(ModifyScheduledActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScheduledAction", ModifyScheduledActionResponse.class);
    }

    /**
     *本接口 (ModifyWorkspacesAttribute) 用于修改工作空间的属性（目前只支持修改工作空间的名称）。
     * @param req ModifyWorkspacesAttributeRequest
     * @return ModifyWorkspacesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspacesAttributeResponse ModifyWorkspacesAttribute(ModifyWorkspacesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkspacesAttribute", ModifyWorkspacesAttributeResponse.class);
    }

    /**
     *正式提交按量计费工作空间转包年包月订单。仅支持 ONLINE 且计费模式为 POSTPAID_BY_HOUR 的工作空间。
     * @param req ModifyWorkspacesChargeTypeRequest
     * @return ModifyWorkspacesChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspacesChargeTypeResponse ModifyWorkspacesChargeType(ModifyWorkspacesChargeTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkspacesChargeType", ModifyWorkspacesChargeTypeResponse.class);
    }

    /**
     *本接口 (ModifyWorkspacesAttribute) 用于修改工作空间的属性（目前只支持修改工作空间的名称）。
     * @param req ModifyWorkspacesRenewFlagRequest
     * @return ModifyWorkspacesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspacesRenewFlagResponse ModifyWorkspacesRenewFlag(ModifyWorkspacesRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkspacesRenewFlag", ModifyWorkspacesRenewFlagResponse.class);
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

    /**
     *为指定集群的队列配置弹性伸缩策略，包括伸缩容量、扩容方式等。
     * @param req SetQueueAutoScalingRequest
     * @return SetQueueAutoScalingResponse
     * @throws TencentCloudSDKException
     */
    public SetQueueAutoScalingResponse SetQueueAutoScaling(SetQueueAutoScalingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetQueueAutoScaling", SetQueueAutoScalingResponse.class);
    }

    /**
     *本接口 (SubmitJob) 用于提交一个作业任务。
     * @param req SubmitJobRequest
     * @return SubmitJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitJobResponse SubmitJob(SubmitJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitJob", SubmitJobResponse.class);
    }

    /**
     *本接口 (TerminateJob) 用于终止一个作业任务。
     * @param req TerminateJobRequest
     * @return TerminateJobResponse
     * @throws TencentCloudSDKException
     */
    public TerminateJobResponse TerminateJob(TerminateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateJob", TerminateJobResponse.class);
    }

    /**
     *本接口 (TerminateWorkspaces) 用于主动退还工作空间。
     * @param req TerminateWorkspacesRequest
     * @return TerminateWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateWorkspacesResponse TerminateWorkspaces(TerminateWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateWorkspaces", TerminateWorkspacesResponse.class);
    }

}
