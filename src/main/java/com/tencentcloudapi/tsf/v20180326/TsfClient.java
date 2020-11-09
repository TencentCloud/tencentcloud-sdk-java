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
package com.tencentcloudapi.tsf.v20180326;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tsf.v20180326.models.*;

public class TsfClient extends AbstractClient{
    private static String endpoint = "tsf.tencentcloudapi.com";
    private static String service = "tsf";
    private static String version = "2018-03-26";

    public TsfClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TsfClient(Credential credential, String region, ClientProfile profile) {
        super(TsfClient.endpoint, TsfClient.version, credential, region, profile);
    }

    /**
     *添加云主机节点至TSF集群
     * @param req AddClusterInstancesRequest
     * @return AddClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterInstancesResponse AddClusterInstances(AddClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加云主机节点至TSF集群
     * @param req AddInstancesRequest
     * @return AddInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddInstancesResponse AddInstances(AddInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对执行失败的任务批次执行续跑
     * @param req ContinueRunFailedTaskBatchRequest
     * @return ContinueRunFailedTaskBatchResponse
     * @throws TencentCloudSDKException
     */
    public ContinueRunFailedTaskBatchResponse ContinueRunFailedTaskBatch(ContinueRunFailedTaskBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ContinueRunFailedTaskBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ContinueRunFailedTaskBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ContinueRunFailedTaskBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建应用
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
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
     *创建配置项
     * @param req CreateConfigRequest
     * @return CreateConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigResponse CreateConfig(CreateConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建容器部署组
     * @param req CreateContainGroupRequest
     * @return CreateContainGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateContainGroupResponse CreateContainGroup(CreateContainGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateContainGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateContainGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateContainGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建虚拟机部署组
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建泳道
     * @param req CreateLaneRequest
     * @return CreateLaneResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaneResponse CreateLane(CreateLaneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLaneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLaneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLane");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建泳道规则
     * @param req CreateLaneRuleRequest
     * @return CreateLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaneRuleResponse CreateLaneRule(CreateLaneRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLaneRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLaneRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLaneRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增微服务
     * @param req CreateMicroserviceRequest
     * @return CreateMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMicroserviceResponse CreateMicroservice(CreateMicroserviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMicroserviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMicroserviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMicroservice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建命名空间
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建公共配置项
     * @param req CreatePublicConfigRequest
     * @return CreatePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicConfigResponse CreatePublicConfig(CreatePublicConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePublicConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePublicConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePublicConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建仓库
     * @param req CreateRepositoryRequest
     * @return CreateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryResponse CreateRepository(CreateRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Serverless部署组
     * @param req CreateServerlessGroupRequest
     * @return CreateServerlessGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerlessGroupResponse CreateServerlessGroup(CreateServerlessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServerlessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServerlessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServerlessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建任务
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除配置项
     * @param req DeleteConfigRequest
     * @return DeleteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigResponse DeleteConfig(DeleteConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除容器部署组
     * @param req DeleteContainerGroupRequest
     * @return DeleteContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContainerGroupResponse DeleteContainerGroup(DeleteContainerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteContainerGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteContainerGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteContainerGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除容器部署组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除镜像版本
     * @param req DeleteImageTagsRequest
     * @return DeleteImageTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageTagsResponse DeleteImageTags(DeleteImageTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除泳道
     * @param req DeleteLaneRequest
     * @return DeleteLaneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaneResponse DeleteLane(DeleteLaneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLaneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLaneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLane");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除微服务
     * @param req DeleteMicroserviceRequest
     * @return DeleteMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMicroserviceResponse DeleteMicroservice(DeleteMicroserviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMicroserviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMicroserviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMicroservice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除命名空间
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从软件仓库批量删除程序包。
一次最多支持删除1000个包，数量超过1000，返回UpperDeleteLimit错误。
     * @param req DeletePkgsRequest
     * @return DeletePkgsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePkgsResponse DeletePkgs(DeletePkgsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePkgsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePkgsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePkgs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除公共配置项
     * @param req DeletePublicConfigRequest
     * @return DeletePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePublicConfigResponse DeletePublicConfig(DeletePublicConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePublicConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePublicConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePublicConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除仓库
     * @param req DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryResponse DeleteRepository(DeleteRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Serverless部署组
     * @param req DeleteServerlessGroupRequest
     * @return DeleteServerlessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessGroupResponse DeleteServerlessGroup(DeleteServerlessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServerlessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServerlessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServerlessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *部署容器应用
     * @param req DeployContainerGroupRequest
     * @return DeployContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeployContainerGroupResponse DeployContainerGroup(DeployContainerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployContainerGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeployContainerGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployContainerGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *部署虚拟机部署组应用
     * @param req DeployGroupRequest
     * @return DeployGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeployGroupResponse DeployGroup(DeployGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeployGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *部署Serverless应用
     * @param req DeployServerlessGroupRequest
     * @return DeployServerlessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeployServerlessGroupResponse DeployServerlessGroup(DeployServerlessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployServerlessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeployServerlessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployServerlessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询API详情
     * @param req DescribeApiDetailRequest
     * @return DescribeApiDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiDetailResponse DescribeApiDetail(DescribeApiDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询API 版本
     * @param req DescribeApiVersionsRequest
     * @return DescribeApiVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiVersionsResponse DescribeApiVersions(DescribeApiVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用详情
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用列表其它字段，如实例数量信息等
     * @param req DescribeApplicationAttributeRequest
     * @return DescribeApplicationAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationAttributeResponse DescribeApplicationAttribute(DescribeApplicationAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用列表
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *TSF基本资源信息概览接口
     * @param req DescribeBasicResourceUsageRequest
     * @return DescribeBasicResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicResourceUsageResponse DescribeBasicResourceUsage(DescribeBasicResourceUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicResourceUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicResourceUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBasicResourceUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群实例
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置发布历史
     * @param req DescribeConfigReleaseLogsRequest
     * @return DescribeConfigReleaseLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigReleaseLogsResponse DescribeConfigReleaseLogs(DescribeConfigReleaseLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigReleaseLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigReleaseLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigReleaseLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置发布信息
     * @param req DescribeConfigReleasesRequest
     * @return DescribeConfigReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigReleasesResponse DescribeConfigReleases(DescribeConfigReleasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigReleasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigReleasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigReleases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置汇总列表
     * @param req DescribeConfigSummaryRequest
     * @return DescribeConfigSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigSummaryResponse DescribeConfigSummary(DescribeConfigSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询配置项列表
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 容器部署组详情
     * @param req DescribeContainerGroupDetailRequest
     * @return DescribeContainerGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupDetailResponse DescribeContainerGroupDetail(DescribeContainerGroupDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerGroupDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerGroupDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContainerGroupDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *容器部署组列表
     * @param req DescribeContainerGroupsRequest
     * @return DescribeContainerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupsResponse DescribeContainerGroups(DescribeContainerGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContainerGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *TSF上传的程序包存放在腾讯云对象存储（COS）中，通过该API可以获取从COS下载程序包需要的信息，包括包所在的桶、存储路径、鉴权信息等，之后使用COS API（或SDK）进行下载。
COS相关文档请查阅：https://cloud.tencent.com/document/product/436
     * @param req DescribeDownloadInfoRequest
     * @return DescribeDownloadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDownloadInfoResponse DescribeDownloadInfo(DescribeDownloadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDownloadInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDownloadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDownloadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询工作流最新一个批次的状态信息
     * @param req DescribeFlowLastBatchStateRequest
     * @return DescribeFlowLastBatchStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLastBatchStateResponse DescribeFlowLastBatchState(DescribeFlowLastBatchStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLastBatchStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowLastBatchStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowLastBatchState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询虚拟机部署组详情
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询虚拟机部署组云主机列表
     * @param req DescribeGroupInstancesRequest
     * @return DescribeGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupInstancesResponse DescribeGroupInstances(DescribeGroupInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取虚拟机部署组列表
     * @param req DescribeGroupsRequest
     * @return DescribeGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsResponse DescribeGroups(DescribeGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像仓库列表 
     * @param req DescribeImageRepositoryRequest
     * @return DescribeImageRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRepositoryResponse DescribeImageRepository(DescribeImageRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *镜像版本列表
     * @param req DescribeImageTagsRequest
     * @return DescribeImageTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageTagsResponse DescribeImageTags(DescribeImageTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询泳道规则列表
     * @param req DescribeLaneRulesRequest
     * @return DescribeLaneRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaneRulesResponse DescribeLaneRules(DescribeLaneRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLaneRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLaneRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLaneRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询泳道列表
     * @param req DescribeLanesRequest
     * @return DescribeLanesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLanesResponse DescribeLanes(DescribeLanesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLanesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLanesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLanes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询微服务详情
     * @param req DescribeMicroserviceRequest
     * @return DescribeMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMicroserviceResponse DescribeMicroservice(DescribeMicroserviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMicroserviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMicroserviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMicroservice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取微服务列表
     * @param req DescribeMicroservicesRequest
     * @return DescribeMicroservicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMicroservicesResponse DescribeMicroservices(DescribeMicroservicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMicroservicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMicroservicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMicroservices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务API列表
     * @param req DescribeMsApiListRequest
     * @return DescribeMsApiListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsApiListResponse DescribeMsApiList(DescribeMsApiListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMsApiListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMsApiListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMsApiList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *无
     * @param req DescribePkgsRequest
     * @return DescribePkgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePkgsResponse DescribePkgs(DescribePkgsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePkgsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePkgsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePkgs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取部署组实例列表
     * @param req DescribePodInstancesRequest
     * @return DescribePodInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodInstancesResponse DescribePodInstances(DescribePodInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePodInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePodInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePodInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询公共配置（单条）
     * @param req DescribePublicConfigRequest
     * @return DescribePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigResponse DescribePublicConfig(DescribePublicConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询公共配置发布历史
     * @param req DescribePublicConfigReleaseLogsRequest
     * @return DescribePublicConfigReleaseLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigReleaseLogsResponse DescribePublicConfigReleaseLogs(DescribePublicConfigReleaseLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicConfigReleaseLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigReleaseLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicConfigReleaseLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询公共配置发布信息
     * @param req DescribePublicConfigReleasesRequest
     * @return DescribePublicConfigReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigReleasesResponse DescribePublicConfigReleases(DescribePublicConfigReleasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicConfigReleasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigReleasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicConfigReleases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询公共配置汇总列表
     * @param req DescribePublicConfigSummaryRequest
     * @return DescribePublicConfigSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigSummaryResponse DescribePublicConfigSummary(DescribePublicConfigSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicConfigSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicConfigSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询公共配置项列表
     * @param req DescribePublicConfigsRequest
     * @return DescribePublicConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigsResponse DescribePublicConfigs(DescribePublicConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询group发布的配置
     * @param req DescribeReleasedConfigRequest
     * @return DescribeReleasedConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleasedConfigResponse DescribeReleasedConfig(DescribeReleasedConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReleasedConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReleasedConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReleasedConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询仓库列表
     * @param req DescribeRepositoriesRequest
     * @return DescribeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepositories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询仓库信息
     * @param req DescribeRepositoryRequest
     * @return DescribeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryResponse DescribeRepository(DescribeRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Serverless部署组明细
     * @param req DescribeServerlessGroupRequest
     * @return DescribeServerlessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessGroupResponse DescribeServerlessGroup(DescribeServerlessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServerlessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerlessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServerlessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Serverless部署组列表
     * @param req DescribeServerlessGroupsRequest
     * @return DescribeServerlessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerlessGroupsResponse DescribeServerlessGroups(DescribeServerlessGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServerlessGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerlessGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServerlessGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询简单应用列表
     * @param req DescribeSimpleApplicationsRequest
     * @return DescribeSimpleApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleApplicationsResponse DescribeSimpleApplications(DescribeSimpleApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSimpleApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSimpleApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询简单集群列表
     * @param req DescribeSimpleClustersRequest
     * @return DescribeSimpleClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleClustersResponse DescribeSimpleClusters(DescribeSimpleClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSimpleClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSimpleClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询简单部署组列表
     * @param req DescribeSimpleGroupsRequest
     * @return DescribeSimpleGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleGroupsResponse DescribeSimpleGroups(DescribeSimpleGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSimpleGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSimpleGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询简单命名空间列表 
     * @param req DescribeSimpleNamespacesRequest
     * @return DescribeSimpleNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleNamespacesResponse DescribeSimpleNamespaces(DescribeSimpleNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSimpleNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSimpleNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务最近一次执行状态
     * @param req DescribeTaskLastStatusRequest
     * @return DescribeTaskLastStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLastStatusResponse DescribeTaskLastStatus(DescribeTaskLastStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskLastStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskLastStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskLastStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *TSF会将软件包上传到腾讯云对象存储（COS）。调用此接口获取上传信息，如目标地域，桶，包Id，存储路径，鉴权信息等，之后请使用COS API（或SDK）进行上传。
COS相关文档请查阅：https://cloud.tencent.com/document/product/436
     * @param req DescribeUploadInfoRequest
     * @return DescribeUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadInfoResponse DescribeUploadInfo(DescribeUploadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUploadInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUploadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUploadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停用任务
     * @param req DisableTaskRequest
     * @return DisableTaskResponse
     * @throws TencentCloudSDKException
     */
    public DisableTaskResponse DisableTask(DisableTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停用工作流
     * @param req DisableTaskFlowRequest
     * @return DisableTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public DisableTaskFlowResponse DisableTaskFlow(DisableTaskFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableTaskFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableTaskFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableTaskFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用任务
     * @param req EnableTaskRequest
     * @return EnableTaskResponse
     * @throws TencentCloudSDKException
     */
    public EnableTaskResponse EnableTask(EnableTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用工作流
     * @param req EnableTaskFlowRequest
     * @return EnableTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public EnableTaskFlowResponse EnableTaskFlow(EnableTaskFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableTaskFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableTaskFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableTaskFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *执行一次任务。
     * @param req ExecuteTaskRequest
     * @return ExecuteTaskResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskResponse ExecuteTask(ExecuteTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *执行一次工作流
     * @param req ExecuteTaskFlowRequest
     * @return ExecuteTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskFlowResponse ExecuteTaskFlow(ExecuteTaskFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteTaskFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteTaskFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteTaskFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *虚拟机部署组添加实例
     * @param req ExpandGroupRequest
     * @return ExpandGroupResponse
     * @throws TencentCloudSDKException
     */
    public ExpandGroupResponse ExpandGroup(ExpandGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExpandGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExpandGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExpandGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改容器部署组
     * @param req ModifyContainerGroupRequest
     * @return ModifyContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContainerGroupResponse ModifyContainerGroup(ModifyContainerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyContainerGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContainerGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyContainerGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改容器部署组实例数
     * @param req ModifyContainerReplicasRequest
     * @return ModifyContainerReplicasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContainerReplicasResponse ModifyContainerReplicas(ModifyContainerReplicasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyContainerReplicasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContainerReplicasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyContainerReplicas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新泳道信息
     * @param req ModifyLaneRequest
     * @return ModifyLaneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaneResponse ModifyLane(ModifyLaneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLaneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLaneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLane");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新泳道规则
     * @param req ModifyLaneRuleRequest
     * @return ModifyLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaneRuleResponse ModifyLaneRule(ModifyLaneRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLaneRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLaneRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLaneRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改微服务详情
     * @param req ModifyMicroserviceRequest
     * @return ModifyMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMicroserviceResponse ModifyMicroservice(ModifyMicroserviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMicroserviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMicroserviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMicroservice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调用该接口和COS的上传接口后，需要调用此接口更新TSF中保存的程序包状态。
调用此接口完成后，才标志上传包流程结束。
     * @param req ModifyUploadInfoRequest
     * @return ModifyUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUploadInfoResponse ModifyUploadInfo(ModifyUploadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUploadInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUploadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUploadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新执行任务
     * @param req RedoTaskRequest
     * @return RedoTaskResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskResponse RedoTask(RedoTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RedoTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RedoTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RedoTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新执行任务批次
     * @param req RedoTaskBatchRequest
     * @return RedoTaskBatchResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskBatchResponse RedoTaskBatch(RedoTaskBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RedoTaskBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RedoTaskBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RedoTaskBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新执行工作流批次
     * @param req RedoTaskFlowBatchRequest
     * @return RedoTaskFlowBatchResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskFlowBatchResponse RedoTaskFlowBatch(RedoTaskFlowBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RedoTaskFlowBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RedoTaskFlowBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RedoTaskFlowBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发布配置
     * @param req ReleaseConfigRequest
     * @return ReleaseConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseConfigResponse ReleaseConfig(ReleaseConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发布公共配置
     * @param req ReleasePublicConfigRequest
     * @return ReleasePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReleasePublicConfigResponse ReleasePublicConfig(ReleasePublicConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleasePublicConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleasePublicConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleasePublicConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从 TSF 集群中批量移除云主机节点
     * @param req RemoveInstancesRequest
     * @return RemoveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveInstancesResponse RemoveInstances(RemoveInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤回已发布的配置
     * @param req RevocationConfigRequest
     * @return RevocationConfigResponse
     * @throws TencentCloudSDKException
     */
    public RevocationConfigResponse RevocationConfig(RevocationConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevocationConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevocationConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevocationConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤回已发布的公共配置
     * @param req RevocationPublicConfigRequest
     * @return RevocationPublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public RevocationPublicConfigResponse RevocationPublicConfig(RevocationPublicConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevocationPublicConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevocationPublicConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevocationPublicConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *回滚配置
     * @param req RollbackConfigRequest
     * @return RollbackConfigResponse
     * @throws TencentCloudSDKException
     */
    public RollbackConfigResponse RollbackConfig(RollbackConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollbackConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollbackConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下线部署组所有机器实例
     * @param req ShrinkGroupRequest
     * @return ShrinkGroupResponse
     * @throws TencentCloudSDKException
     */
    public ShrinkGroupResponse ShrinkGroup(ShrinkGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ShrinkGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ShrinkGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ShrinkGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *虚拟机部署组下线实例
     * @param req ShrinkInstancesRequest
     * @return ShrinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ShrinkInstancesResponse ShrinkInstances(ShrinkInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ShrinkInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ShrinkInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ShrinkInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动容器部署组
     * @param req StartContainerGroupRequest
     * @return StartContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public StartContainerGroupResponse StartContainerGroup(StartContainerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartContainerGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartContainerGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartContainerGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动分组
     * @param req StartGroupRequest
     * @return StartGroupResponse
     * @throws TencentCloudSDKException
     */
    public StartGroupResponse StartGroup(StartGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止容器部署组
     * @param req StopContainerGroupRequest
     * @return StopContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public StopContainerGroupResponse StopContainerGroup(StopContainerGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopContainerGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopContainerGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopContainerGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止虚拟机部署组
     * @param req StopGroupRequest
     * @return StopGroupResponse
     * @throws TencentCloudSDKException
     */
    public StopGroupResponse StopGroup(StopGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止执行中的任务批次， 非运行中的任务不可调用。
     * @param req StopTaskBatchRequest
     * @return StopTaskBatchResponse
     * @throws TencentCloudSDKException
     */
    public StopTaskBatchResponse StopTaskBatch(StopTaskBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopTaskBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopTaskBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopTaskBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止正在某个节点上执行的任务
     * @param req StopTaskExecuteRequest
     * @return StopTaskExecuteResponse
     * @throws TencentCloudSDKException
     */
    public StopTaskExecuteResponse StopTaskExecute(StopTaskExecuteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopTaskExecuteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopTaskExecuteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopTaskExecute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止一个工作流批次
     * @param req TerminateTaskFlowBatchRequest
     * @return TerminateTaskFlowBatchResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTaskFlowBatchResponse TerminateTaskFlowBatch(TerminateTaskFlowBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateTaskFlowBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateTaskFlowBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateTaskFlowBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新仓库信息
     * @param req UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRepositoryResponse UpdateRepository(UpdateRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRepositoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
