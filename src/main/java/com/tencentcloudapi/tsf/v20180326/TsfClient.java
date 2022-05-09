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
     *网关与API分组批量绑定
     * @param req BindApiGroupRequest
     * @return BindApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindApiGroupResponse BindApiGroup(BindApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindApiGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *插件与网关分组/API批量绑定
     * @param req BindPluginRequest
     * @return BindPluginResponse
     * @throws TencentCloudSDKException
     */
    public BindPluginResponse BindPlugin(BindPluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindPluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindPluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindPlugin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用或禁用API
     * @param req ChangeApiUsableStatusRequest
     * @return ChangeApiUsableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeApiUsableStatusResponse ChangeApiUsableStatus(ChangeApiUsableStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeApiUsableStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeApiUsableStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeApiUsableStatus");
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
     *一键导入API分组
     * @param req CreateAllGatewayApiAsyncRequest
     * @return CreateAllGatewayApiAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllGatewayApiAsyncResponse CreateAllGatewayApiAsync(CreateAllGatewayApiAsyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAllGatewayApiAsyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAllGatewayApiAsyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAllGatewayApiAsync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建API分组
     * @param req CreateApiGroupRequest
     * @return CreateApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiGroupResponse CreateApiGroup(CreateApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApiGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建API限流规则
     * @param req CreateApiRateLimitRuleRequest
     * @return CreateApiRateLimitRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiRateLimitRuleResponse CreateApiRateLimitRule(CreateApiRateLimitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiRateLimitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiRateLimitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApiRateLimitRule");
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
     *创建文件配置项
     * @param req CreateFileConfigRequest
     * @return CreateFileConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileConfigResponse CreateFileConfig(CreateFileConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFileConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFileConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFileConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量导入API至api分组(也支持新建API到分组)
     * @param req CreateGatewayApiRequest
     * @return CreateGatewayApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateGatewayApiResponse CreateGatewayApi(CreateGatewayApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGatewayApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGatewayApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGatewayApi");
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
     *创建路径重写
     * @param req CreatePathRewritesRequest
     * @return CreatePathRewritesResponse
     * @throws TencentCloudSDKException
     */
    public CreatePathRewritesResponse CreatePathRewrites(CreatePathRewritesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePathRewritesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePathRewritesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePathRewrites");
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
     *创建工作流
     * @param req CreateTaskFlowRequest
     * @return CreateTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFlowResponse CreateTaskFlow(CreateTaskFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建单元化规则
     * @param req CreateUnitRuleRequest
     * @return CreateUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnitRuleResponse CreateUnitRule(CreateUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Api分组
     * @param req DeleteApiGroupRequest
     * @return DeleteApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiGroupResponse DeleteApiGroup(DeleteApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApiGroup");
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
     *删除泳道规则
     * @param req DeleteLaneRuleRequest
     * @return DeleteLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaneRuleResponse DeleteLaneRule(DeleteLaneRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLaneRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLaneRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLaneRule");
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
     *删除路径重写
     * @param req DeletePathRewritesRequest
     * @return DeletePathRewritesResponse
     * @throws TencentCloudSDKException
     */
    public DeletePathRewritesResponse DeletePathRewrites(DeletePathRewritesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePathRewritesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePathRewritesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePathRewrites");
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
     *删除单元化命名空间
     * @param req DeleteUnitNamespacesRequest
     * @return DeleteUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUnitNamespacesResponse DeleteUnitNamespaces(DeleteUnitNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUnitNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUnitNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUnitNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除单元化规则
     * @param req DeleteUnitRuleRequest
     * @return DeleteUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUnitRuleResponse DeleteUnitRule(DeleteUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *部署容器应用-更新
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
     *查询API分组
     * @param req DescribeApiGroupRequest
     * @return DescribeApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiGroupResponse DescribeApiGroup(DescribeApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询API 分组信息列表
     * @param req DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiGroupsResponse DescribeApiGroups(DescribeApiGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询API限流规则
     * @param req DescribeApiRateLimitRulesRequest
     * @return DescribeApiRateLimitRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiRateLimitRulesResponse DescribeApiRateLimitRules(DescribeApiRateLimitRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiRateLimitRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiRateLimitRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiRateLimitRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网关API监控明细数据
     * @param req DescribeApiUseDetailRequest
     * @return DescribeApiUseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiUseDetailResponse DescribeApiUseDetail(DescribeApiUseDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApiUseDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApiUseDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApiUseDetail");
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
     *获取容器事件列表
     * @param req DescribeContainerEventsRequest
     * @return DescribeContainerEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerEventsResponse DescribeContainerEvents(DescribeContainerEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContainerEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 获取部署组详情
     * @param req DescribeContainerGroupDeployInfoRequest
     * @return DescribeContainerGroupDeployInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupDeployInfoResponse DescribeContainerGroupDeployInfo(DescribeContainerGroupDeployInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContainerGroupDeployInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerGroupDeployInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContainerGroupDeployInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 容器部署组详情（已废弃，请使用  DescribeContainerGroupDeployInfo）
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
     *查询一键导入API分组任务的状态
     * @param req DescribeCreateGatewayApiStatusRequest
     * @return DescribeCreateGatewayApiStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCreateGatewayApiStatusResponse DescribeCreateGatewayApiStatus(DescribeCreateGatewayApiStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCreateGatewayApiStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCreateGatewayApiStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCreateGatewayApiStatus");
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
     *查询生效的单元化规则
     * @param req DescribeEnabledUnitRuleRequest
     * @return DescribeEnabledUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnabledUnitRuleResponse DescribeEnabledUnitRule(DescribeEnabledUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnabledUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnabledUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnabledUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件配置项列表
     * @param req DescribeFileConfigsRequest
     * @return DescribeFileConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileConfigsResponse DescribeFileConfigs(DescribeFileConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileConfigs");
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
     *查询网关所有分组下Api列表
     * @param req DescribeGatewayAllGroupApisRequest
     * @return DescribeGatewayAllGroupApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayAllGroupApisResponse DescribeGatewayAllGroupApis(DescribeGatewayAllGroupApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayAllGroupApisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayAllGroupApisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayAllGroupApis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询API分组下的Api列表信息
     * @param req DescribeGatewayApisRequest
     * @return DescribeGatewayApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayApisResponse DescribeGatewayApis(DescribeGatewayApisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayApisResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayApisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayApis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网关监控概览
     * @param req DescribeGatewayMonitorOverviewRequest
     * @return DescribeGatewayMonitorOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayMonitorOverviewResponse DescribeGatewayMonitorOverview(DescribeGatewayMonitorOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayMonitorOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayMonitorOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayMonitorOverview");
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
     *获取部署组其他属性
     * @param req DescribeGroupAttributeRequest
     * @return DescribeGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupAttributeResponse DescribeGroupAttribute(DescribeGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某个API分组已绑定的网关部署组信息列表
     * @param req DescribeGroupBindedGatewaysRequest
     * @return DescribeGroupBindedGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupBindedGatewaysResponse DescribeGroupBindedGateways(DescribeGroupBindedGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupBindedGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupBindedGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupBindedGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某个网关绑定的API 分组信息列表
     * @param req DescribeGroupGatewaysRequest
     * @return DescribeGroupGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupGatewaysResponse DescribeGroupGateways(DescribeGroupGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupGateways");
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
     *查询部署组相关的发布信息
     * @param req DescribeGroupReleaseRequest
     * @return DescribeGroupReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupReleaseResponse DescribeGroupRelease(DescribeGroupReleaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupReleaseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupReleaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupRelease");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网关分组监控明细数据
     * @param req DescribeGroupUseDetailRequest
     * @return DescribeGroupUseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupUseDetailResponse DescribeGroupUseDetail(DescribeGroupUseDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupUseDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupUseDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupUseDetail");
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
     *查询某个插件下绑定或未绑定的API分组
     * @param req DescribeGroupsWithPluginRequest
     * @return DescribeGroupsWithPluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsWithPluginResponse DescribeGroupsWithPlugin(DescribeGroupsWithPluginRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupsWithPluginResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupsWithPluginResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupsWithPlugin");
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
     *查询调用监控指标
     * @param req DescribeInovcationIndicatorsRequest
     * @return DescribeInovcationIndicatorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInovcationIndicatorsResponse DescribeInovcationIndicators(DescribeInovcationIndicatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInovcationIndicatorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInovcationIndicatorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInovcationIndicators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *无
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询调用指标数据变化曲线
     * @param req DescribeInvocationMetricDataCurveRequest
     * @return DescribeInvocationMetricDataCurveResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricDataCurveResponse DescribeInvocationMetricDataCurve(DescribeInvocationMetricDataCurveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationMetricDataCurveResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationMetricDataCurveResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationMetricDataCurve");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询维度
     * @param req DescribeInvocationMetricDataDimensionRequest
     * @return DescribeInvocationMetricDataDimensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricDataDimensionResponse DescribeInvocationMetricDataDimension(DescribeInvocationMetricDataDimensionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationMetricDataDimensionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationMetricDataDimensionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationMetricDataDimension");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单值指标维度
     * @param req DescribeInvocationMetricDataPointRequest
     * @return DescribeInvocationMetricDataPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricDataPointResponse DescribeInvocationMetricDataPoint(DescribeInvocationMetricDataPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationMetricDataPointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationMetricDataPointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationMetricDataPoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询调用指标数据散点图
     * @param req DescribeInvocationMetricScatterPlotRequest
     * @return DescribeInvocationMetricScatterPlotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricScatterPlotResponse DescribeInvocationMetricScatterPlot(DescribeInvocationMetricScatterPlotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationMetricScatterPlotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationMetricScatterPlotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationMetricScatterPlot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询java实例jvm监控数据,返回数据可选
     * @param req DescribeJvmMonitorRequest
     * @return DescribeJvmMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJvmMonitorResponse DescribeJvmMonitor(DescribeJvmMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJvmMonitorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJvmMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJvmMonitor");
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
     *服务调用监控统计概览
     * @param req DescribeOverviewInvocationRequest
     * @return DescribeOverviewInvocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewInvocationResponse DescribeOverviewInvocation(DescribeOverviewInvocationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewInvocationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOverviewInvocationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOverviewInvocation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询路径重写
     * @param req DescribePathRewriteRequest
     * @return DescribePathRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DescribePathRewriteResponse DescribePathRewrite(DescribePathRewriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePathRewriteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePathRewriteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePathRewrite");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询路径重写列表
     * @param req DescribePathRewritesRequest
     * @return DescribePathRewritesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePathRewritesResponse DescribePathRewrites(DescribePathRewritesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePathRewritesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePathRewritesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePathRewrites");
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
     *分页查询网关分组/API绑定（或未绑定）的插件列表
     * @param req DescribePluginInstancesRequest
     * @return DescribePluginInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginInstancesResponse DescribePluginInstances(DescribePluginInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePluginInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePluginInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePluginInstances");
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
     *查询数据集列表
     * @param req DescribeProgramsRequest
     * @return DescribeProgramsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProgramsResponse DescribePrograms(DescribeProgramsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProgramsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProgramsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrograms");
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
     *服务统计页面：接口和服务维度
     * @param req DescribeStatisticsRequest
     * @return DescribeStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticsResponse DescribeStatistics(DescribeStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskDetail");
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
     *翻页查询任务列表
     * @param req DescribeTaskRecordsRequest
     * @return DescribeTaskRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskRecordsResponse DescribeTaskRecords(DescribeTaskRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网关API监控明细数据（仅单元化网关），非单元化网关使用DescribeApiUseDetail
     * @param req DescribeUnitApiUseDetailRequest
     * @return DescribeUnitApiUseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitApiUseDetailResponse DescribeUnitApiUseDetail(DescribeUnitApiUseDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnitApiUseDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnitApiUseDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnitApiUseDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单元化命名空间列表
     * @param req DescribeUnitNamespacesRequest
     * @return DescribeUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitNamespacesResponse DescribeUnitNamespaces(DescribeUnitNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnitNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnitNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnitNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单元化规则详情
     * @param req DescribeUnitRuleRequest
     * @return DescribeUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitRuleResponse DescribeUnitRule(DescribeUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单元化规则列表
     * @param req DescribeUnitRulesRequest
     * @return DescribeUnitRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitRulesResponse DescribeUnitRules(DescribeUnitRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnitRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnitRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnitRules");
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
     *查询可用于被导入的命名空间列表
     * @param req DescribeUsableUnitNamespacesRequest
     * @return DescribeUsableUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsableUnitNamespacesResponse DescribeUsableUnitNamespaces(DescribeUsableUnitNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsableUnitNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsableUnitNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsableUnitNamespaces");
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
     *禁用单元化路由
     * @param req DisableUnitRouteRequest
     * @return DisableUnitRouteResponse
     * @throws TencentCloudSDKException
     */
    public DisableUnitRouteResponse DisableUnitRoute(DisableUnitRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableUnitRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableUnitRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableUnitRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用单元化规则
     * @param req DisableUnitRuleRequest
     * @return DisableUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableUnitRuleResponse DisableUnitRule(DisableUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下线Api分组
     * @param req DraftApiGroupRequest
     * @return DraftApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public DraftApiGroupResponse DraftApiGroup(DraftApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DraftApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DraftApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DraftApiGroup");
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
     *启用单元化路由
     * @param req EnableUnitRouteRequest
     * @return EnableUnitRouteResponse
     * @throws TencentCloudSDKException
     */
    public EnableUnitRouteResponse EnableUnitRoute(EnableUnitRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableUnitRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableUnitRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableUnitRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用单元化规则
     * @param req EnableUnitRuleRequest
     * @return EnableUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableUnitRuleResponse EnableUnitRule(EnableUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *手动执行一次任务。
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
     *修改路径重写
     * @param req ModifyPathRewriteRequest
     * @return ModifyPathRewriteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPathRewriteResponse ModifyPathRewrite(ModifyPathRewriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPathRewriteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPathRewriteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPathRewrite");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改任务
     * @param req ModifyTaskRequest
     * @return ModifyTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskResponse ModifyTask(ModifyTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTask");
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
     *绑定解绑tcr仓库
     * @param req OperateApplicationTcrBindingRequest
     * @return OperateApplicationTcrBindingResponse
     * @throws TencentCloudSDKException
     */
    public OperateApplicationTcrBindingResponse OperateApplicationTcrBinding(OperateApplicationTcrBindingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OperateApplicationTcrBindingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OperateApplicationTcrBindingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OperateApplicationTcrBinding");
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
     *重新执行在某个节点上执行任务。
     * @param req RedoTaskExecuteRequest
     * @return RedoTaskExecuteResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskExecuteResponse RedoTaskExecute(RedoTaskExecuteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RedoTaskExecuteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RedoTaskExecuteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RedoTaskExecute");
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
     *发布Api分组
     * @param req ReleaseApiGroupRequest
     * @return ReleaseApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseApiGroupResponse ReleaseApiGroup(ReleaseApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseApiGroup");
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
     *发布文件配置
     * @param req ReleaseFileConfigRequest
     * @return ReleaseFileConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseFileConfigResponse ReleaseFileConfig(ReleaseFileConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseFileConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseFileConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseFileConfig");
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
     *业务日志搜索
     * @param req SearchBusinessLogRequest
     * @return SearchBusinessLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchBusinessLogResponse SearchBusinessLog(SearchBusinessLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchBusinessLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchBusinessLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchBusinessLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *标准输出日志搜索
     * @param req SearchStdoutLogRequest
     * @return SearchStdoutLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchStdoutLogResponse SearchStdoutLog(SearchStdoutLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchStdoutLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchStdoutLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchStdoutLog");
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
     *API分组批量与网关解绑
     * @param req UnbindApiGroupRequest
     * @return UnbindApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public UnbindApiGroupResponse UnbindApiGroup(UnbindApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindApiGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新Api分组
     * @param req UpdateApiGroupRequest
     * @return UpdateApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiGroupResponse UpdateApiGroup(UpdateApiGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApiGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新API限流规则
     * @param req UpdateApiRateLimitRuleRequest
     * @return UpdateApiRateLimitRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiRateLimitRuleResponse UpdateApiRateLimitRule(UpdateApiRateLimitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiRateLimitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiRateLimitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApiRateLimitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量更新API限流规则
     * @param req UpdateApiRateLimitRulesRequest
     * @return UpdateApiRateLimitRulesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiRateLimitRulesResponse UpdateApiRateLimitRules(UpdateApiRateLimitRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiRateLimitRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiRateLimitRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApiRateLimitRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量更新API超时
     * @param req UpdateApiTimeoutsRequest
     * @return UpdateApiTimeoutsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiTimeoutsResponse UpdateApiTimeouts(UpdateApiTimeoutsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateApiTimeoutsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateApiTimeoutsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateApiTimeouts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新API
     * @param req UpdateGatewayApiRequest
     * @return UpdateGatewayApiResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGatewayApiResponse UpdateGatewayApi(UpdateGatewayApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGatewayApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGatewayApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGatewayApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新健康检查配置
     * @param req UpdateHealthCheckSettingsRequest
     * @return UpdateHealthCheckSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateHealthCheckSettingsResponse UpdateHealthCheckSettings(UpdateHealthCheckSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateHealthCheckSettingsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateHealthCheckSettingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateHealthCheckSettings");
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

    /**
     *更新单元化规则
     * @param req UpdateUnitRuleRequest
     * @return UpdateUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUnitRuleResponse UpdateUnitRule(UpdateUnitRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUnitRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUnitRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUnitRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
