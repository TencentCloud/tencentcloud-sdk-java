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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddClusterInstances", AddClusterInstancesResponse.class);
    }

    /**
     *添加云主机节点至TSF集群
     * @param req AddInstancesRequest
     * @return AddInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddInstancesResponse AddInstances(AddInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddInstances", AddInstancesResponse.class);
    }

    /**
     *关联日志配置项到应用
     * @param req AssociateBusinessLogConfigRequest
     * @return AssociateBusinessLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public AssociateBusinessLogConfigResponse AssociateBusinessLogConfig(AssociateBusinessLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateBusinessLogConfig", AssociateBusinessLogConfigResponse.class);
    }

    /**
     *关联投递配置到部署组
     * @param req AssociateConfigWithGroupRequest
     * @return AssociateConfigWithGroupResponse
     * @throws TencentCloudSDKException
     */
    public AssociateConfigWithGroupResponse AssociateConfigWithGroup(AssociateConfigWithGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateConfigWithGroup", AssociateConfigWithGroupResponse.class);
    }

    /**
     *网关与API分组批量绑定
     * @param req BindApiGroupRequest
     * @return BindApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindApiGroupResponse BindApiGroup(BindApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindApiGroup", BindApiGroupResponse.class);
    }

    /**
     *插件与网关分组/API批量绑定
     * @param req BindPluginRequest
     * @return BindPluginResponse
     * @throws TencentCloudSDKException
     */
    public BindPluginResponse BindPlugin(BindPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindPlugin", BindPluginResponse.class);
    }

    /**
     *启用或禁用API
     * @param req ChangeApiUsableStatusRequest
     * @return ChangeApiUsableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeApiUsableStatusResponse ChangeApiUsableStatus(ChangeApiUsableStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeApiUsableStatus", ChangeApiUsableStatusResponse.class);
    }

    /**
     *对执行失败的任务批次执行续跑
     * @param req ContinueRunFailedTaskBatchRequest
     * @return ContinueRunFailedTaskBatchResponse
     * @throws TencentCloudSDKException
     */
    public ContinueRunFailedTaskBatchResponse ContinueRunFailedTaskBatch(ContinueRunFailedTaskBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ContinueRunFailedTaskBatch", ContinueRunFailedTaskBatchResponse.class);
    }

    /**
     *一键导入API分组
     * @param req CreateAllGatewayApiAsyncRequest
     * @return CreateAllGatewayApiAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllGatewayApiAsyncResponse CreateAllGatewayApiAsync(CreateAllGatewayApiAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllGatewayApiAsync", CreateAllGatewayApiAsyncResponse.class);
    }

    /**
     *创建API分组
     * @param req CreateApiGroupRequest
     * @return CreateApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiGroupResponse CreateApiGroup(CreateApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiGroup", CreateApiGroupResponse.class);
    }

    /**
     *创建API限流规则
     * @param req CreateApiRateLimitRuleRequest
     * @return CreateApiRateLimitRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiRateLimitRuleResponse CreateApiRateLimitRule(CreateApiRateLimitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiRateLimitRule", CreateApiRateLimitRuleResponse.class);
    }

    /**
     *创建API限流规则,并返回规则信息
     * @param req CreateApiRateLimitRuleWithDetailRespRequest
     * @return CreateApiRateLimitRuleWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiRateLimitRuleWithDetailRespResponse CreateApiRateLimitRuleWithDetailResp(CreateApiRateLimitRuleWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiRateLimitRuleWithDetailResp", CreateApiRateLimitRuleWithDetailRespResponse.class);
    }

    /**
     *创建应用
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
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
     *创建配置项
     * @param req CreateConfigRequest
     * @return CreateConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigResponse CreateConfig(CreateConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfig", CreateConfigResponse.class);
    }

    /**
     *创建参数模板
     * @param req CreateConfigTemplateRequest
     * @return CreateConfigTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigTemplateResponse CreateConfigTemplate(CreateConfigTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigTemplate", CreateConfigTemplateResponse.class);
    }

    /**
     *创建参数模板，并返回模板详细信息
     * @param req CreateConfigTemplateWithDetailRespRequest
     * @return CreateConfigTemplateWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigTemplateWithDetailRespResponse CreateConfigTemplateWithDetailResp(CreateConfigTemplateWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigTemplateWithDetailResp", CreateConfigTemplateWithDetailRespResponse.class);
    }

    /**
     *创建配置项，返回详细信息
     * @param req CreateConfigWithDetailRespRequest
     * @return CreateConfigWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigWithDetailRespResponse CreateConfigWithDetailResp(CreateConfigWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigWithDetailResp", CreateConfigWithDetailRespResponse.class);
    }

    /**
     *（已废弃，请使用 CreateGroup 和 DeployContainerGroup 创建和部署容器部署组）创建容器部署组
     * @param req CreateContainGroupRequest
     * @return CreateContainGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateContainGroupResponse CreateContainGroup(CreateContainGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContainGroup", CreateContainGroupResponse.class);
    }

    /**
     *创建文件配置项
     * @param req CreateFileConfigRequest
     * @return CreateFileConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileConfigResponse CreateFileConfig(CreateFileConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileConfig", CreateFileConfigResponse.class);
    }

    /**
     *创建文件配置项，返回详细信息
     * @param req CreateFileConfigWithDetailRespRequest
     * @return CreateFileConfigWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileConfigWithDetailRespResponse CreateFileConfigWithDetailResp(CreateFileConfigWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileConfigWithDetailResp", CreateFileConfigWithDetailRespResponse.class);
    }

    /**
     *批量导入API至api分组(也支持新建API到分组)
     * @param req CreateGatewayApiRequest
     * @return CreateGatewayApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateGatewayApiResponse CreateGatewayApi(CreateGatewayApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGatewayApi", CreateGatewayApiResponse.class);
    }

    /**
     *创建虚拟机部署组
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroup", CreateGroupResponse.class);
    }

    /**
     *创建泳道
     * @param req CreateLaneRequest
     * @return CreateLaneResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaneResponse CreateLane(CreateLaneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLane", CreateLaneResponse.class);
    }

    /**
     *创建泳道规则
     * @param req CreateLaneRuleRequest
     * @return CreateLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaneRuleResponse CreateLaneRule(CreateLaneRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLaneRule", CreateLaneRuleResponse.class);
    }

    /**
     *新增微服务
     * @param req CreateMicroserviceRequest
     * @return CreateMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMicroserviceResponse CreateMicroservice(CreateMicroserviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMicroservice", CreateMicroserviceResponse.class);
    }

    /**
     *新增微服务返回id
     * @param req CreateMicroserviceWithDetailRespRequest
     * @return CreateMicroserviceWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreateMicroserviceWithDetailRespResponse CreateMicroserviceWithDetailResp(CreateMicroserviceWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMicroserviceWithDetailResp", CreateMicroserviceWithDetailRespResponse.class);
    }

    /**
     *创建命名空间
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
    }

    /**
     *创建路径重写
     * @param req CreatePathRewritesRequest
     * @return CreatePathRewritesResponse
     * @throws TencentCloudSDKException
     */
    public CreatePathRewritesResponse CreatePathRewrites(CreatePathRewritesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePathRewrites", CreatePathRewritesResponse.class);
    }

    /**
     *创建路径重写，并返回路径重写规则信息
     * @param req CreatePathRewritesWithDetailRespRequest
     * @return CreatePathRewritesWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreatePathRewritesWithDetailRespResponse CreatePathRewritesWithDetailResp(CreatePathRewritesWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePathRewritesWithDetailResp", CreatePathRewritesWithDetailRespResponse.class);
    }

    /**
     *创建数据集
     * @param req CreateProgramRequest
     * @return CreateProgramResponse
     * @throws TencentCloudSDKException
     */
    public CreateProgramResponse CreateProgram(CreateProgramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProgram", CreateProgramResponse.class);
    }

    /**
     *创建公共配置项
     * @param req CreatePublicConfigRequest
     * @return CreatePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicConfigResponse CreatePublicConfig(CreatePublicConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublicConfig", CreatePublicConfigResponse.class);
    }

    /**
     *创建公共配置项，并返回配置项详细信息
     * @param req CreatePublicConfigWithDetailRespRequest
     * @return CreatePublicConfigWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicConfigWithDetailRespResponse CreatePublicConfigWithDetailResp(CreatePublicConfigWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublicConfigWithDetailResp", CreatePublicConfigWithDetailRespResponse.class);
    }

    /**
     *创建仓库
     * @param req CreateRepositoryRequest
     * @return CreateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryResponse CreateRepository(CreateRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRepository", CreateRepositoryResponse.class);
    }

    /**
     *创建任务
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *创建工作流
     * @param req CreateTaskFlowRequest
     * @return CreateTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFlowResponse CreateTaskFlow(CreateTaskFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFlow", CreateTaskFlowResponse.class);
    }

    /**
     *批量创建单元化命名空间
     * @param req CreateUnitNamespacesRequest
     * @return CreateUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnitNamespacesResponse CreateUnitNamespaces(CreateUnitNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUnitNamespaces", CreateUnitNamespacesResponse.class);
    }

    /**
     *创建单元化规则
     * @param req CreateUnitRuleRequest
     * @return CreateUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnitRuleResponse CreateUnitRule(CreateUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUnitRule", CreateUnitRuleResponse.class);
    }

    /**
     *创建单元化规则, 并返回详细信息
     * @param req CreateUnitRuleWithDetailRespRequest
     * @return CreateUnitRuleWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnitRuleWithDetailRespResponse CreateUnitRuleWithDetailResp(CreateUnitRuleWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUnitRuleWithDetailResp", CreateUnitRuleWithDetailRespResponse.class);
    }

    /**
     *删除Api分组
     * @param req DeleteApiGroupRequest
     * @return DeleteApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiGroupResponse DeleteApiGroup(DeleteApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApiGroup", DeleteApiGroupResponse.class);
    }

    /**
     *删除API限流规则
     * @param req DeleteApiRateLimitRuleRequest
     * @return DeleteApiRateLimitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiRateLimitRuleResponse DeleteApiRateLimitRule(DeleteApiRateLimitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApiRateLimitRule", DeleteApiRateLimitRuleResponse.class);
    }

    /**
     *删除应用
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *删除集群
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *删除配置项
     * @param req DeleteConfigRequest
     * @return DeleteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigResponse DeleteConfig(DeleteConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfig", DeleteConfigResponse.class);
    }

    /**
     *删除模板
     * @param req DeleteConfigTemplateRequest
     * @return DeleteConfigTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigTemplateResponse DeleteConfigTemplate(DeleteConfigTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigTemplate", DeleteConfigTemplateResponse.class);
    }

    /**
     *删除容器部署组
     * @param req DeleteContainerGroupRequest
     * @return DeleteContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContainerGroupResponse DeleteContainerGroup(DeleteContainerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContainerGroup", DeleteContainerGroupResponse.class);
    }

    /**
     *删除文件配置项
     * @param req DeleteFileConfigRequest
     * @return DeleteFileConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileConfigResponse DeleteFileConfig(DeleteFileConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileConfig", DeleteFileConfigResponse.class);
    }

    /**
     *批量删除API
     * @param req DeleteGatewayApiRequest
     * @return DeleteGatewayApiResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatewayApiResponse DeleteGatewayApi(DeleteGatewayApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGatewayApi", DeleteGatewayApiResponse.class);
    }

    /**
     *删除容器部署组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *批量删除镜像版本
     * @param req DeleteImageTagsRequest
     * @return DeleteImageTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageTagsResponse DeleteImageTags(DeleteImageTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageTags", DeleteImageTagsResponse.class);
    }

    /**
     *删除泳道
     * @param req DeleteLaneRequest
     * @return DeleteLaneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaneResponse DeleteLane(DeleteLaneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLane", DeleteLaneResponse.class);
    }

    /**
     *删除泳道规则
     * @param req DeleteLaneRuleRequest
     * @return DeleteLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaneRuleResponse DeleteLaneRule(DeleteLaneRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLaneRule", DeleteLaneRuleResponse.class);
    }

    /**
     *删除微服务
     * @param req DeleteMicroserviceRequest
     * @return DeleteMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMicroserviceResponse DeleteMicroservice(DeleteMicroserviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMicroservice", DeleteMicroserviceResponse.class);
    }

    /**
     *删除命名空间
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNamespace", DeleteNamespaceResponse.class);
    }

    /**
     *删除路径重写
     * @param req DeletePathRewritesRequest
     * @return DeletePathRewritesResponse
     * @throws TencentCloudSDKException
     */
    public DeletePathRewritesResponse DeletePathRewrites(DeletePathRewritesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePathRewrites", DeletePathRewritesResponse.class);
    }

    /**
     *从软件仓库批量删除程序包。
一次最多支持删除1000个包，数量超过1000，返回UpperDeleteLimit错误。
     * @param req DeletePkgsRequest
     * @return DeletePkgsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePkgsResponse DeletePkgs(DeletePkgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePkgs", DeletePkgsResponse.class);
    }

    /**
     *删除公共配置项
     * @param req DeletePublicConfigRequest
     * @return DeletePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePublicConfigResponse DeletePublicConfig(DeletePublicConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePublicConfig", DeletePublicConfigResponse.class);
    }

    /**
     *删除仓库
     * @param req DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryResponse DeleteRepository(DeleteRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRepository", DeleteRepositoryResponse.class);
    }

    /**
     *删除Serverless部署组
     * @param req DeleteServerlessGroupRequest
     * @return DeleteServerlessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServerlessGroupResponse DeleteServerlessGroup(DeleteServerlessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServerlessGroup", DeleteServerlessGroupResponse.class);
    }

    /**
     *删除任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *删除单元化命名空间
     * @param req DeleteUnitNamespacesRequest
     * @return DeleteUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUnitNamespacesResponse DeleteUnitNamespaces(DeleteUnitNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUnitNamespaces", DeleteUnitNamespacesResponse.class);
    }

    /**
     *删除单元化规则
     * @param req DeleteUnitRuleRequest
     * @return DeleteUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUnitRuleResponse DeleteUnitRule(DeleteUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUnitRule", DeleteUnitRuleResponse.class);
    }

    /**
     *部署容器应用-更新
     * @param req DeployContainerGroupRequest
     * @return DeployContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeployContainerGroupResponse DeployContainerGroup(DeployContainerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployContainerGroup", DeployContainerGroupResponse.class);
    }

    /**
     *部署虚拟机部署组应用
     * @param req DeployGroupRequest
     * @return DeployGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeployGroupResponse DeployGroup(DeployGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployGroup", DeployGroupResponse.class);
    }

    /**
     *查询API详情
     * @param req DescribeApiDetailRequest
     * @return DescribeApiDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiDetailResponse DescribeApiDetail(DescribeApiDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiDetail", DescribeApiDetailResponse.class);
    }

    /**
     *查询API分组
     * @param req DescribeApiGroupRequest
     * @return DescribeApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiGroupResponse DescribeApiGroup(DescribeApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiGroup", DescribeApiGroupResponse.class);
    }

    /**
     *查询API 分组信息列表
     * @param req DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiGroupsResponse DescribeApiGroups(DescribeApiGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiGroups", DescribeApiGroupsResponse.class);
    }

    /**
     *查询API限流规则
     * @param req DescribeApiRateLimitRulesRequest
     * @return DescribeApiRateLimitRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiRateLimitRulesResponse DescribeApiRateLimitRules(DescribeApiRateLimitRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiRateLimitRules", DescribeApiRateLimitRulesResponse.class);
    }

    /**
     *查询网关API监控明细数据
     * @param req DescribeApiUseDetailRequest
     * @return DescribeApiUseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiUseDetailResponse DescribeApiUseDetail(DescribeApiUseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiUseDetail", DescribeApiUseDetailResponse.class);
    }

    /**
     *查询API 版本
     * @param req DescribeApiVersionsRequest
     * @return DescribeApiVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiVersionsResponse DescribeApiVersions(DescribeApiVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiVersions", DescribeApiVersionsResponse.class);
    }

    /**
     *获取应用详情
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplication", DescribeApplicationResponse.class);
    }

    /**
     *获取应用列表其它字段，如实例数量信息等
     * @param req DescribeApplicationAttributeRequest
     * @return DescribeApplicationAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationAttributeResponse DescribeApplicationAttribute(DescribeApplicationAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationAttribute", DescribeApplicationAttributeResponse.class);
    }

    /**
     *获取应用列表
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *TSF基本资源信息概览接口
     * @param req DescribeBasicResourceUsageRequest
     * @return DescribeBasicResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicResourceUsageResponse DescribeBasicResourceUsage(DescribeBasicResourceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBasicResourceUsage", DescribeBasicResourceUsageResponse.class);
    }

    /**
     *查询业务日志配置项信息
     * @param req DescribeBusinessLogConfigRequest
     * @return DescribeBusinessLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBusinessLogConfigResponse DescribeBusinessLogConfig(DescribeBusinessLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBusinessLogConfig", DescribeBusinessLogConfigResponse.class);
    }

    /**
     *查询日志配置项列表
     * @param req DescribeBusinessLogConfigsRequest
     * @return DescribeBusinessLogConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBusinessLogConfigsResponse DescribeBusinessLogConfigs(DescribeBusinessLogConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBusinessLogConfigs", DescribeBusinessLogConfigsResponse.class);
    }

    /**
     *查询集群实例
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *获取集群列表
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *查询配置
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfig", DescribeConfigResponse.class);
    }

    /**
     *查询配置发布历史
     * @param req DescribeConfigReleaseLogsRequest
     * @return DescribeConfigReleaseLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigReleaseLogsResponse DescribeConfigReleaseLogs(DescribeConfigReleaseLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigReleaseLogs", DescribeConfigReleaseLogsResponse.class);
    }

    /**
     *查询配置发布信息
     * @param req DescribeConfigReleasesRequest
     * @return DescribeConfigReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigReleasesResponse DescribeConfigReleases(DescribeConfigReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigReleases", DescribeConfigReleasesResponse.class);
    }

    /**
     *查询配置汇总列表
     * @param req DescribeConfigSummaryRequest
     * @return DescribeConfigSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigSummaryResponse DescribeConfigSummary(DescribeConfigSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigSummary", DescribeConfigSummaryResponse.class);
    }

    /**
     *导入配置
     * @param req DescribeConfigTemplateRequest
     * @return DescribeConfigTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigTemplateResponse DescribeConfigTemplate(DescribeConfigTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigTemplate", DescribeConfigTemplateResponse.class);
    }

    /**
     *查询配置项列表
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigs", DescribeConfigsResponse.class);
    }

    /**
     *获取容器事件列表
参数限制

- 当类型是 instance 时，GroupId是必填项
     * @param req DescribeContainerEventsRequest
     * @return DescribeContainerEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerEventsResponse DescribeContainerEvents(DescribeContainerEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerEvents", DescribeContainerEventsResponse.class);
    }

    /**
     *获取部署组其他字段-用于前端并发调用
     * @param req DescribeContainerGroupAttributeRequest
     * @return DescribeContainerGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupAttributeResponse DescribeContainerGroupAttribute(DescribeContainerGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerGroupAttribute", DescribeContainerGroupAttributeResponse.class);
    }

    /**
     *获取部署组详情
     * @param req DescribeContainerGroupDeployInfoRequest
     * @return DescribeContainerGroupDeployInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupDeployInfoResponse DescribeContainerGroupDeployInfo(DescribeContainerGroupDeployInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerGroupDeployInfo", DescribeContainerGroupDeployInfoResponse.class);
    }

    /**
     *容器部署组详情（已废弃，请使用  DescribeContainerGroupDeployInfo）
     * @param req DescribeContainerGroupDetailRequest
     * @return DescribeContainerGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupDetailResponse DescribeContainerGroupDetail(DescribeContainerGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerGroupDetail", DescribeContainerGroupDetailResponse.class);
    }

    /**
     *容器部署组列表
     * @param req DescribeContainerGroupsRequest
     * @return DescribeContainerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerGroupsResponse DescribeContainerGroups(DescribeContainerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerGroups", DescribeContainerGroupsResponse.class);
    }

    /**
     *查询一键导入API分组任务的状态
     * @param req DescribeCreateGatewayApiStatusRequest
     * @return DescribeCreateGatewayApiStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCreateGatewayApiStatusResponse DescribeCreateGatewayApiStatus(DescribeCreateGatewayApiStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCreateGatewayApiStatus", DescribeCreateGatewayApiStatusResponse.class);
    }

    /**
     *获取单个投递项配置信息
     * @param req DescribeDeliveryConfigRequest
     * @return DescribeDeliveryConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliveryConfigResponse DescribeDeliveryConfig(DescribeDeliveryConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeliveryConfig", DescribeDeliveryConfigResponse.class);
    }

    /**
     *用部署组id获取绑定信息
     * @param req DescribeDeliveryConfigByGroupIdRequest
     * @return DescribeDeliveryConfigByGroupIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliveryConfigByGroupIdResponse DescribeDeliveryConfigByGroupId(DescribeDeliveryConfigByGroupIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeliveryConfigByGroupId", DescribeDeliveryConfigByGroupIdResponse.class);
    }

    /**
     *获取多个投递项配置
     * @param req DescribeDeliveryConfigsRequest
     * @return DescribeDeliveryConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeliveryConfigsResponse DescribeDeliveryConfigs(DescribeDeliveryConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeliveryConfigs", DescribeDeliveryConfigsResponse.class);
    }

    /**
     *TSF上传的程序包存放在腾讯云对象存储（COS）中，通过该API可以获取从COS下载程序包需要的信息，包括包所在的桶、存储路径、鉴权信息等，之后使用COS API（或SDK）进行下载。
COS相关文档请查阅：https://cloud.tencent.com/document/product/436
     * @param req DescribeDownloadInfoRequest
     * @return DescribeDownloadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDownloadInfoResponse DescribeDownloadInfo(DescribeDownloadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDownloadInfo", DescribeDownloadInfoResponse.class);
    }

    /**
     *查询生效的单元化规则
     * @param req DescribeEnabledUnitRuleRequest
     * @return DescribeEnabledUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnabledUnitRuleResponse DescribeEnabledUnitRule(DescribeEnabledUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnabledUnitRule", DescribeEnabledUnitRuleResponse.class);
    }

    /**
     *查询文件配置项发布信息
     * @param req DescribeFileConfigReleasesRequest
     * @return DescribeFileConfigReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileConfigReleasesResponse DescribeFileConfigReleases(DescribeFileConfigReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileConfigReleases", DescribeFileConfigReleasesResponse.class);
    }

    /**
     *查询文件配置项列表
     * @param req DescribeFileConfigsRequest
     * @return DescribeFileConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileConfigsResponse DescribeFileConfigs(DescribeFileConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileConfigs", DescribeFileConfigsResponse.class);
    }

    /**
     *查询工作流最新一个批次的状态信息
     * @param req DescribeFlowLastBatchStateRequest
     * @return DescribeFlowLastBatchStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLastBatchStateResponse DescribeFlowLastBatchState(DescribeFlowLastBatchStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowLastBatchState", DescribeFlowLastBatchStateResponse.class);
    }

    /**
     *查询网关所有分组下Api列表
     * @param req DescribeGatewayAllGroupApisRequest
     * @return DescribeGatewayAllGroupApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayAllGroupApisResponse DescribeGatewayAllGroupApis(DescribeGatewayAllGroupApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayAllGroupApis", DescribeGatewayAllGroupApisResponse.class);
    }

    /**
     *查询API分组下的Api列表信息
     * @param req DescribeGatewayApisRequest
     * @return DescribeGatewayApisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayApisResponse DescribeGatewayApis(DescribeGatewayApisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayApis", DescribeGatewayApisResponse.class);
    }

    /**
     *查询网关监控概览
     * @param req DescribeGatewayMonitorOverviewRequest
     * @return DescribeGatewayMonitorOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayMonitorOverviewResponse DescribeGatewayMonitorOverview(DescribeGatewayMonitorOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayMonitorOverview", DescribeGatewayMonitorOverviewResponse.class);
    }

    /**
     *查询虚拟机部署组详情
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroup", DescribeGroupResponse.class);
    }

    /**
     *获取部署组其他属性
     * @param req DescribeGroupAttributeRequest
     * @return DescribeGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupAttributeResponse DescribeGroupAttribute(DescribeGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupAttribute", DescribeGroupAttributeResponse.class);
    }

    /**
     *查询某个API分组已绑定的网关部署组信息列表
     * @param req DescribeGroupBindedGatewaysRequest
     * @return DescribeGroupBindedGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupBindedGatewaysResponse DescribeGroupBindedGateways(DescribeGroupBindedGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupBindedGateways", DescribeGroupBindedGatewaysResponse.class);
    }

    /**
     *查询分组管理日志配置列表
     * @param req DescribeGroupBusinessLogConfigsRequest
     * @return DescribeGroupBusinessLogConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupBusinessLogConfigsResponse DescribeGroupBusinessLogConfigs(DescribeGroupBusinessLogConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupBusinessLogConfigs", DescribeGroupBusinessLogConfigsResponse.class);
    }

    /**
     *查询某个网关绑定的API 分组信息列表
     * @param req DescribeGroupGatewaysRequest
     * @return DescribeGroupGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupGatewaysResponse DescribeGroupGateways(DescribeGroupGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupGateways", DescribeGroupGatewaysResponse.class);
    }

    /**
     *查询虚拟机部署组云主机列表
     * @param req DescribeGroupInstancesRequest
     * @return DescribeGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupInstancesResponse DescribeGroupInstances(DescribeGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupInstances", DescribeGroupInstancesResponse.class);
    }

    /**
     *查询部署组相关的发布信息
     * @param req DescribeGroupReleaseRequest
     * @return DescribeGroupReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupReleaseResponse DescribeGroupRelease(DescribeGroupReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupRelease", DescribeGroupReleaseResponse.class);
    }

    /**
     *查询网关分组监控明细数据
     * @param req DescribeGroupUseDetailRequest
     * @return DescribeGroupUseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupUseDetailResponse DescribeGroupUseDetail(DescribeGroupUseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupUseDetail", DescribeGroupUseDetailResponse.class);
    }

    /**
     *获取虚拟机部署组列表
     * @param req DescribeGroupsRequest
     * @return DescribeGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsResponse DescribeGroups(DescribeGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroups", DescribeGroupsResponse.class);
    }

    /**
     *查询某个插件下绑定或未绑定的API分组
     * @param req DescribeGroupsWithPluginRequest
     * @return DescribeGroupsWithPluginResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsWithPluginResponse DescribeGroupsWithPlugin(DescribeGroupsWithPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupsWithPlugin", DescribeGroupsWithPluginResponse.class);
    }

    /**
     *查询镜像仓库列表
     * @param req DescribeImageRepositoryRequest
     * @return DescribeImageRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRepositoryResponse DescribeImageRepository(DescribeImageRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRepository", DescribeImageRepositoryResponse.class);
    }

    /**
     *镜像版本列表
     * @param req DescribeImageTagsRequest
     * @return DescribeImageTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageTagsResponse DescribeImageTags(DescribeImageTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageTags", DescribeImageTagsResponse.class);
    }

    /**
     *废弃
     * @param req DescribeInovcationIndicatorsRequest
     * @return DescribeInovcationIndicatorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInovcationIndicatorsResponse DescribeInovcationIndicators(DescribeInovcationIndicatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInovcationIndicators", DescribeInovcationIndicatorsResponse.class);
    }

    /**
     *无
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *查询调用指标数据变化曲线
     * @param req DescribeInvocationMetricDataCurveRequest
     * @return DescribeInvocationMetricDataCurveResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricDataCurveResponse DescribeInvocationMetricDataCurve(DescribeInvocationMetricDataCurveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocationMetricDataCurve", DescribeInvocationMetricDataCurveResponse.class);
    }

    /**
     *查询维度
     * @param req DescribeInvocationMetricDataDimensionRequest
     * @return DescribeInvocationMetricDataDimensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricDataDimensionResponse DescribeInvocationMetricDataDimension(DescribeInvocationMetricDataDimensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocationMetricDataDimension", DescribeInvocationMetricDataDimensionResponse.class);
    }

    /**
     *查询单值指标维度
     * @param req DescribeInvocationMetricDataPointRequest
     * @return DescribeInvocationMetricDataPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricDataPointResponse DescribeInvocationMetricDataPoint(DescribeInvocationMetricDataPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocationMetricDataPoint", DescribeInvocationMetricDataPointResponse.class);
    }

    /**
     *查询调用指标数据散点图
     * @param req DescribeInvocationMetricScatterPlotRequest
     * @return DescribeInvocationMetricScatterPlotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationMetricScatterPlotResponse DescribeInvocationMetricScatterPlot(DescribeInvocationMetricScatterPlotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocationMetricScatterPlot", DescribeInvocationMetricScatterPlotResponse.class);
    }

    /**
     *查询java实例jvm监控数据,返回数据可选
     * @param req DescribeJvmMonitorRequest
     * @return DescribeJvmMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJvmMonitorResponse DescribeJvmMonitor(DescribeJvmMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJvmMonitor", DescribeJvmMonitorResponse.class);
    }

    /**
     *查询泳道规则列表
     * @param req DescribeLaneRulesRequest
     * @return DescribeLaneRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaneRulesResponse DescribeLaneRules(DescribeLaneRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLaneRules", DescribeLaneRulesResponse.class);
    }

    /**
     *查询泳道列表
     * @param req DescribeLanesRequest
     * @return DescribeLanesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLanesResponse DescribeLanes(DescribeLanesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLanes", DescribeLanesResponse.class);
    }

    /**
     *查询微服务详情
     * @param req DescribeMicroserviceRequest
     * @return DescribeMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMicroserviceResponse DescribeMicroservice(DescribeMicroserviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMicroservice", DescribeMicroserviceResponse.class);
    }

    /**
     *获取微服务列表
     * @param req DescribeMicroservicesRequest
     * @return DescribeMicroservicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMicroservicesResponse DescribeMicroservices(DescribeMicroservicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMicroservices", DescribeMicroservicesResponse.class);
    }

    /**
     *查询服务API列表
     * @param req DescribeMsApiListRequest
     * @return DescribeMsApiListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMsApiListResponse DescribeMsApiList(DescribeMsApiListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMsApiList", DescribeMsApiListResponse.class);
    }

    /**
     *服务调用监控统计概览
     * @param req DescribeOverviewInvocationRequest
     * @return DescribeOverviewInvocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewInvocationResponse DescribeOverviewInvocation(DescribeOverviewInvocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewInvocation", DescribeOverviewInvocationResponse.class);
    }

    /**
     *查询路径重写
     * @param req DescribePathRewriteRequest
     * @return DescribePathRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DescribePathRewriteResponse DescribePathRewrite(DescribePathRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePathRewrite", DescribePathRewriteResponse.class);
    }

    /**
     *查询路径重写列表
     * @param req DescribePathRewritesRequest
     * @return DescribePathRewritesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePathRewritesResponse DescribePathRewrites(DescribePathRewritesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePathRewrites", DescribePathRewritesResponse.class);
    }

    /**
     *无
     * @param req DescribePkgsRequest
     * @return DescribePkgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePkgsResponse DescribePkgs(DescribePkgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePkgs", DescribePkgsResponse.class);
    }

    /**
     *分页查询网关分组/API绑定（或未绑定）的插件列表
     * @param req DescribePluginInstancesRequest
     * @return DescribePluginInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePluginInstancesResponse DescribePluginInstances(DescribePluginInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePluginInstances", DescribePluginInstancesResponse.class);
    }

    /**
     *获取部署组实例列表
     * @param req DescribePodInstancesRequest
     * @return DescribePodInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodInstancesResponse DescribePodInstances(DescribePodInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePodInstances", DescribePodInstancesResponse.class);
    }

    /**
     *查询数据集列表
     * @param req DescribeProgramsRequest
     * @return DescribeProgramsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProgramsResponse DescribePrograms(DescribeProgramsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrograms", DescribeProgramsResponse.class);
    }

    /**
     *查询公共配置（单条）
     * @param req DescribePublicConfigRequest
     * @return DescribePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigResponse DescribePublicConfig(DescribePublicConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicConfig", DescribePublicConfigResponse.class);
    }

    /**
     *查询公共配置发布历史
     * @param req DescribePublicConfigReleaseLogsRequest
     * @return DescribePublicConfigReleaseLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigReleaseLogsResponse DescribePublicConfigReleaseLogs(DescribePublicConfigReleaseLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicConfigReleaseLogs", DescribePublicConfigReleaseLogsResponse.class);
    }

    /**
     *查询公共配置发布信息
     * @param req DescribePublicConfigReleasesRequest
     * @return DescribePublicConfigReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigReleasesResponse DescribePublicConfigReleases(DescribePublicConfigReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicConfigReleases", DescribePublicConfigReleasesResponse.class);
    }

    /**
     *查询公共配置汇总列表
     * @param req DescribePublicConfigSummaryRequest
     * @return DescribePublicConfigSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigSummaryResponse DescribePublicConfigSummary(DescribePublicConfigSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicConfigSummary", DescribePublicConfigSummaryResponse.class);
    }

    /**
     *查询公共配置项列表
     * @param req DescribePublicConfigsRequest
     * @return DescribePublicConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicConfigsResponse DescribePublicConfigs(DescribePublicConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicConfigs", DescribePublicConfigsResponse.class);
    }

    /**
     *查询group发布的配置
     * @param req DescribeReleasedConfigRequest
     * @return DescribeReleasedConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleasedConfigResponse DescribeReleasedConfig(DescribeReleasedConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleasedConfig", DescribeReleasedConfigResponse.class);
    }

    /**
     *查询仓库列表
     * @param req DescribeRepositoriesRequest
     * @return DescribeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositories", DescribeRepositoriesResponse.class);
    }

    /**
     *查询仓库信息
     * @param req DescribeRepositoryRequest
     * @return DescribeRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryResponse DescribeRepository(DescribeRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepository", DescribeRepositoryResponse.class);
    }

    /**
     *资源任务的执行状态描述接口
     * @param req DescribeResourceTaskStatusRequest
     * @return DescribeResourceTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTaskStatusResponse DescribeResourceTaskStatus(DescribeResourceTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTaskStatus", DescribeResourceTaskStatusResponse.class);
    }

    /**
     *查询简单应用列表
     * @param req DescribeSimpleApplicationsRequest
     * @return DescribeSimpleApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleApplicationsResponse DescribeSimpleApplications(DescribeSimpleApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleApplications", DescribeSimpleApplicationsResponse.class);
    }

    /**
     *查询简单集群列表
     * @param req DescribeSimpleClustersRequest
     * @return DescribeSimpleClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleClustersResponse DescribeSimpleClusters(DescribeSimpleClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleClusters", DescribeSimpleClustersResponse.class);
    }

    /**
     *查询简单部署组列表
     * @param req DescribeSimpleGroupsRequest
     * @return DescribeSimpleGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleGroupsResponse DescribeSimpleGroups(DescribeSimpleGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleGroups", DescribeSimpleGroupsResponse.class);
    }

    /**
     *查询简单命名空间列表
     * @param req DescribeSimpleNamespacesRequest
     * @return DescribeSimpleNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleNamespacesResponse DescribeSimpleNamespaces(DescribeSimpleNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleNamespaces", DescribeSimpleNamespacesResponse.class);
    }

    /**
     *服务统计页面：接口和服务维度
     * @param req DescribeStatisticsRequest
     * @return DescribeStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticsResponse DescribeStatistics(DescribeStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStatistics", DescribeStatisticsResponse.class);
    }

    /**
     *查询任务详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetail", DescribeTaskDetailResponse.class);
    }

    /**
     *查询任务最近一次执行状态
     * @param req DescribeTaskLastStatusRequest
     * @return DescribeTaskLastStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLastStatusResponse DescribeTaskLastStatus(DescribeTaskLastStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLastStatus", DescribeTaskLastStatusResponse.class);
    }

    /**
     *翻页查询任务列表
     * @param req DescribeTaskRecordsRequest
     * @return DescribeTaskRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskRecordsResponse DescribeTaskRecords(DescribeTaskRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskRecords", DescribeTaskRecordsResponse.class);
    }

    /**
     *查询网关API监控明细数据（仅单元化网关），非单元化网关使用DescribeApiUseDetail
     * @param req DescribeUnitApiUseDetailRequest
     * @return DescribeUnitApiUseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitApiUseDetailResponse DescribeUnitApiUseDetail(DescribeUnitApiUseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnitApiUseDetail", DescribeUnitApiUseDetailResponse.class);
    }

    /**
     *查询单元化命名空间列表
     * @param req DescribeUnitNamespacesRequest
     * @return DescribeUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitNamespacesResponse DescribeUnitNamespaces(DescribeUnitNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnitNamespaces", DescribeUnitNamespacesResponse.class);
    }

    /**
     *查询单元化规则详情
     * @param req DescribeUnitRuleRequest
     * @return DescribeUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitRuleResponse DescribeUnitRule(DescribeUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnitRule", DescribeUnitRuleResponse.class);
    }

    /**
     *查询单元化规则列表
     * @param req DescribeUnitRulesRequest
     * @return DescribeUnitRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnitRulesResponse DescribeUnitRules(DescribeUnitRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnitRules", DescribeUnitRulesResponse.class);
    }

    /**
     *查询单元化规则列表V2
     * @param req DescribeUnitRulesV2Request
     * @return DescribeUnitRulesV2Response
     * @throws TencentCloudSDKException
     */
    public DescribeUnitRulesV2Response DescribeUnitRulesV2(DescribeUnitRulesV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnitRulesV2", DescribeUnitRulesV2Response.class);
    }

    /**
     *TSF会将软件包上传到腾讯云对象存储（COS）。调用此接口获取上传信息，如目标地域，桶，包Id，存储路径，鉴权信息等，之后请使用COS API（或SDK）进行上传。
COS相关文档请查阅：https://cloud.tencent.com/document/product/436
     * @param req DescribeUploadInfoRequest
     * @return DescribeUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUploadInfoResponse DescribeUploadInfo(DescribeUploadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUploadInfo", DescribeUploadInfoResponse.class);
    }

    /**
     *查询可用于被导入的命名空间列表
     * @param req DescribeUsableUnitNamespacesRequest
     * @return DescribeUsableUnitNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsableUnitNamespacesResponse DescribeUsableUnitNamespaces(DescribeUsableUnitNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsableUnitNamespaces", DescribeUsableUnitNamespacesResponse.class);
    }

    /**
     *禁用泳道规则
     * @param req DisableLaneRuleRequest
     * @return DisableLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableLaneRuleResponse DisableLaneRule(DisableLaneRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableLaneRule", DisableLaneRuleResponse.class);
    }

    /**
     *停用任务
     * @param req DisableTaskRequest
     * @return DisableTaskResponse
     * @throws TencentCloudSDKException
     */
    public DisableTaskResponse DisableTask(DisableTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableTask", DisableTaskResponse.class);
    }

    /**
     *停用工作流
     * @param req DisableTaskFlowRequest
     * @return DisableTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public DisableTaskFlowResponse DisableTaskFlow(DisableTaskFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableTaskFlow", DisableTaskFlowResponse.class);
    }

    /**
     *禁用单元化路由
     * @param req DisableUnitRouteRequest
     * @return DisableUnitRouteResponse
     * @throws TencentCloudSDKException
     */
    public DisableUnitRouteResponse DisableUnitRoute(DisableUnitRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableUnitRoute", DisableUnitRouteResponse.class);
    }

    /**
     *禁用单元化规则
     * @param req DisableUnitRuleRequest
     * @return DisableUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableUnitRuleResponse DisableUnitRule(DisableUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableUnitRule", DisableUnitRuleResponse.class);
    }

    /**
     *取消关联业务日志配置项和应用
     * @param req DisassociateBusinessLogConfigRequest
     * @return DisassociateBusinessLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateBusinessLogConfigResponse DisassociateBusinessLogConfig(DisassociateBusinessLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateBusinessLogConfig", DisassociateBusinessLogConfigResponse.class);
    }

    /**
     *取消关联投递信息和部署组
     * @param req DisassociateKafkaConfigRequest
     * @return DisassociateKafkaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateKafkaConfigResponse DisassociateKafkaConfig(DisassociateKafkaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateKafkaConfig", DisassociateKafkaConfigResponse.class);
    }

    /**
     *下线Api分组
     * @param req DraftApiGroupRequest
     * @return DraftApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public DraftApiGroupResponse DraftApiGroup(DraftApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DraftApiGroup", DraftApiGroupResponse.class);
    }

    /**
     *启用泳道规则
     * @param req EnableLaneRuleRequest
     * @return EnableLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableLaneRuleResponse EnableLaneRule(EnableLaneRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableLaneRule", EnableLaneRuleResponse.class);
    }

    /**
     *启用任务
     * @param req EnableTaskRequest
     * @return EnableTaskResponse
     * @throws TencentCloudSDKException
     */
    public EnableTaskResponse EnableTask(EnableTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTask", EnableTaskResponse.class);
    }

    /**
     *启用工作流
     * @param req EnableTaskFlowRequest
     * @return EnableTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public EnableTaskFlowResponse EnableTaskFlow(EnableTaskFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTaskFlow", EnableTaskFlowResponse.class);
    }

    /**
     *启用单元化路由
     * @param req EnableUnitRouteRequest
     * @return EnableUnitRouteResponse
     * @throws TencentCloudSDKException
     */
    public EnableUnitRouteResponse EnableUnitRoute(EnableUnitRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableUnitRoute", EnableUnitRouteResponse.class);
    }

    /**
     *启用单元化规则
     * @param req EnableUnitRuleRequest
     * @return EnableUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableUnitRuleResponse EnableUnitRule(EnableUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableUnitRule", EnableUnitRuleResponse.class);
    }

    /**
     *手动执行一次任务
     * @param req ExecuteTaskRequest
     * @return ExecuteTaskResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskResponse ExecuteTask(ExecuteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteTask", ExecuteTaskResponse.class);
    }

    /**
     *执行一次工作流
     * @param req ExecuteTaskFlowRequest
     * @return ExecuteTaskFlowResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskFlowResponse ExecuteTaskFlow(ExecuteTaskFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteTaskFlow", ExecuteTaskFlowResponse.class);
    }

    /**
     *虚拟机部署组添加实例
     * @param req ExpandGroupRequest
     * @return ExpandGroupResponse
     * @throws TencentCloudSDKException
     */
    public ExpandGroupResponse ExpandGroup(ExpandGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExpandGroup", ExpandGroupResponse.class);
    }

    /**
     *修改应用
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
    }

    /**
     *修改集群信息
     * @param req ModifyClusterRequest
     * @return ModifyClusterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterResponse ModifyCluster(ModifyClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCluster", ModifyClusterResponse.class);
    }

    /**
     *修改容器部署组
     * @param req ModifyContainerGroupRequest
     * @return ModifyContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContainerGroupResponse ModifyContainerGroup(ModifyContainerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContainerGroup", ModifyContainerGroupResponse.class);
    }

    /**
     *修改容器部署组实例数
     * @param req ModifyContainerReplicasRequest
     * @return ModifyContainerReplicasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContainerReplicasResponse ModifyContainerReplicas(ModifyContainerReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContainerReplicas", ModifyContainerReplicasResponse.class);
    }

    /**
     *更新部署组信息
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroup", ModifyGroupResponse.class);
    }

    /**
     *更新泳道信息
     * @param req ModifyLaneRequest
     * @return ModifyLaneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaneResponse ModifyLane(ModifyLaneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLane", ModifyLaneResponse.class);
    }

    /**
     *更新泳道规则
     * @param req ModifyLaneRuleRequest
     * @return ModifyLaneRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaneRuleResponse ModifyLaneRule(ModifyLaneRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLaneRule", ModifyLaneRuleResponse.class);
    }

    /**
     *修改微服务详情
     * @param req ModifyMicroserviceRequest
     * @return ModifyMicroserviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMicroserviceResponse ModifyMicroservice(ModifyMicroserviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMicroservice", ModifyMicroserviceResponse.class);
    }

    /**
     *修改命名空间
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNamespace", ModifyNamespaceResponse.class);
    }

    /**
     *修改路径重写
     * @param req ModifyPathRewriteRequest
     * @return ModifyPathRewriteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPathRewriteResponse ModifyPathRewrite(ModifyPathRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPathRewrite", ModifyPathRewriteResponse.class);
    }

    /**
     *更新数据集
     * @param req ModifyProgramRequest
     * @return ModifyProgramResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProgramResponse ModifyProgram(ModifyProgramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProgram", ModifyProgramResponse.class);
    }

    /**
     *修改任务
     * @param req ModifyTaskRequest
     * @return ModifyTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskResponse ModifyTask(ModifyTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTask", ModifyTaskResponse.class);
    }

    /**
     *调用该接口和COS的上传接口后，需要调用此接口更新TSF中保存的程序包状态。
调用此接口完成后，才标志上传包流程结束。
     * @param req ModifyUploadInfoRequest
     * @return ModifyUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUploadInfoResponse ModifyUploadInfo(ModifyUploadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUploadInfo", ModifyUploadInfoResponse.class);
    }

    /**
     *绑定解绑tcr仓库
     * @param req OperateApplicationTcrBindingRequest
     * @return OperateApplicationTcrBindingResponse
     * @throws TencentCloudSDKException
     */
    public OperateApplicationTcrBindingResponse OperateApplicationTcrBinding(OperateApplicationTcrBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateApplicationTcrBinding", OperateApplicationTcrBindingResponse.class);
    }

    /**
     *重关联业务日志配置
     * @param req ReassociateBusinessLogConfigRequest
     * @return ReassociateBusinessLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReassociateBusinessLogConfigResponse ReassociateBusinessLogConfig(ReassociateBusinessLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReassociateBusinessLogConfig", ReassociateBusinessLogConfigResponse.class);
    }

    /**
     *重新执行任务
     * @param req RedoTaskRequest
     * @return RedoTaskResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskResponse RedoTask(RedoTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RedoTask", RedoTaskResponse.class);
    }

    /**
     *重新执行任务批次
     * @param req RedoTaskBatchRequest
     * @return RedoTaskBatchResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskBatchResponse RedoTaskBatch(RedoTaskBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RedoTaskBatch", RedoTaskBatchResponse.class);
    }

    /**
     *重新执行在某个节点上执行任务。
     * @param req RedoTaskExecuteRequest
     * @return RedoTaskExecuteResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskExecuteResponse RedoTaskExecute(RedoTaskExecuteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RedoTaskExecute", RedoTaskExecuteResponse.class);
    }

    /**
     *重新执行工作流批次
     * @param req RedoTaskFlowBatchRequest
     * @return RedoTaskFlowBatchResponse
     * @throws TencentCloudSDKException
     */
    public RedoTaskFlowBatchResponse RedoTaskFlowBatch(RedoTaskFlowBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RedoTaskFlowBatch", RedoTaskFlowBatchResponse.class);
    }

    /**
     *发布Api分组
     * @param req ReleaseApiGroupRequest
     * @return ReleaseApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseApiGroupResponse ReleaseApiGroup(ReleaseApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseApiGroup", ReleaseApiGroupResponse.class);
    }

    /**
     *发布配置
     * @param req ReleaseConfigRequest
     * @return ReleaseConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseConfigResponse ReleaseConfig(ReleaseConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseConfig", ReleaseConfigResponse.class);
    }

    /**
     *发布配置,并且返回配置 ID
     * @param req ReleaseConfigWithDetailRespRequest
     * @return ReleaseConfigWithDetailRespResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseConfigWithDetailRespResponse ReleaseConfigWithDetailResp(ReleaseConfigWithDetailRespRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseConfigWithDetailResp", ReleaseConfigWithDetailRespResponse.class);
    }

    /**
     *发布文件配置
     * @param req ReleaseFileConfigRequest
     * @return ReleaseFileConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseFileConfigResponse ReleaseFileConfig(ReleaseFileConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseFileConfig", ReleaseFileConfigResponse.class);
    }

    /**
     *发布公共配置
     * @param req ReleasePublicConfigRequest
     * @return ReleasePublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public ReleasePublicConfigResponse ReleasePublicConfig(ReleasePublicConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleasePublicConfig", ReleasePublicConfigResponse.class);
    }

    /**
     *从 TSF 集群中批量移除云主机节点
     * @param req RemoveInstancesRequest
     * @return RemoveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveInstancesResponse RemoveInstances(RemoveInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveInstances", RemoveInstancesResponse.class);
    }

    /**
     *撤回已发布的配置
     * @param req RevocationConfigRequest
     * @return RevocationConfigResponse
     * @throws TencentCloudSDKException
     */
    public RevocationConfigResponse RevocationConfig(RevocationConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevocationConfig", RevocationConfigResponse.class);
    }

    /**
     *撤回已发布的公共配置
     * @param req RevocationPublicConfigRequest
     * @return RevocationPublicConfigResponse
     * @throws TencentCloudSDKException
     */
    public RevocationPublicConfigResponse RevocationPublicConfig(RevocationPublicConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevocationPublicConfig", RevocationPublicConfigResponse.class);
    }

    /**
     *撤回已发布的文件配置
     * @param req RevokeFileConfigRequest
     * @return RevokeFileConfigResponse
     * @throws TencentCloudSDKException
     */
    public RevokeFileConfigResponse RevokeFileConfig(RevokeFileConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeFileConfig", RevokeFileConfigResponse.class);
    }

    /**
     *回滚配置
     * @param req RollbackConfigRequest
     * @return RollbackConfigResponse
     * @throws TencentCloudSDKException
     */
    public RollbackConfigResponse RollbackConfig(RollbackConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackConfig", RollbackConfigResponse.class);
    }

    /**
     *业务日志搜索
     * @param req SearchBusinessLogRequest
     * @return SearchBusinessLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchBusinessLogResponse SearchBusinessLog(SearchBusinessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchBusinessLog", SearchBusinessLogResponse.class);
    }

    /**
     *标准输出日志搜索
     * @param req SearchStdoutLogRequest
     * @return SearchStdoutLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchStdoutLogResponse SearchStdoutLog(SearchStdoutLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchStdoutLog", SearchStdoutLogResponse.class);
    }

    /**
     *下线部署组所有机器实例
     * @param req ShrinkGroupRequest
     * @return ShrinkGroupResponse
     * @throws TencentCloudSDKException
     */
    public ShrinkGroupResponse ShrinkGroup(ShrinkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ShrinkGroup", ShrinkGroupResponse.class);
    }

    /**
     *虚拟机部署组下线实例
     * @param req ShrinkInstancesRequest
     * @return ShrinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ShrinkInstancesResponse ShrinkInstances(ShrinkInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ShrinkInstances", ShrinkInstancesResponse.class);
    }

    /**
     *启动容器部署组
     * @param req StartContainerGroupRequest
     * @return StartContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public StartContainerGroupResponse StartContainerGroup(StartContainerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartContainerGroup", StartContainerGroupResponse.class);
    }

    /**
     *启动分组
     * @param req StartGroupRequest
     * @return StartGroupResponse
     * @throws TencentCloudSDKException
     */
    public StartGroupResponse StartGroup(StartGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartGroup", StartGroupResponse.class);
    }

    /**
     *停止容器部署组
     * @param req StopContainerGroupRequest
     * @return StopContainerGroupResponse
     * @throws TencentCloudSDKException
     */
    public StopContainerGroupResponse StopContainerGroup(StopContainerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopContainerGroup", StopContainerGroupResponse.class);
    }

    /**
     *停止虚拟机部署组
     * @param req StopGroupRequest
     * @return StopGroupResponse
     * @throws TencentCloudSDKException
     */
    public StopGroupResponse StopGroup(StopGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopGroup", StopGroupResponse.class);
    }

    /**
     *停止执行中的任务批次， 非运行中的任务不可调用。
     * @param req StopTaskBatchRequest
     * @return StopTaskBatchResponse
     * @throws TencentCloudSDKException
     */
    public StopTaskBatchResponse StopTaskBatch(StopTaskBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTaskBatch", StopTaskBatchResponse.class);
    }

    /**
     *停止正在某个节点上执行的任务
     * @param req StopTaskExecuteRequest
     * @return StopTaskExecuteResponse
     * @throws TencentCloudSDKException
     */
    public StopTaskExecuteResponse StopTaskExecute(StopTaskExecuteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTaskExecute", StopTaskExecuteResponse.class);
    }

    /**
     *停止一个工作流批次
     * @param req TerminateTaskFlowBatchRequest
     * @return TerminateTaskFlowBatchResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTaskFlowBatchResponse TerminateTaskFlowBatch(TerminateTaskFlowBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateTaskFlowBatch", TerminateTaskFlowBatchResponse.class);
    }

    /**
     *API分组批量与网关解绑
     * @param req UnbindApiGroupRequest
     * @return UnbindApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public UnbindApiGroupResponse UnbindApiGroup(UnbindApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindApiGroup", UnbindApiGroupResponse.class);
    }

    /**
     *更新Api分组
     * @param req UpdateApiGroupRequest
     * @return UpdateApiGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiGroupResponse UpdateApiGroup(UpdateApiGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApiGroup", UpdateApiGroupResponse.class);
    }

    /**
     *更新API限流规则
     * @param req UpdateApiRateLimitRuleRequest
     * @return UpdateApiRateLimitRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiRateLimitRuleResponse UpdateApiRateLimitRule(UpdateApiRateLimitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApiRateLimitRule", UpdateApiRateLimitRuleResponse.class);
    }

    /**
     *批量更新API限流规则
     * @param req UpdateApiRateLimitRulesRequest
     * @return UpdateApiRateLimitRulesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiRateLimitRulesResponse UpdateApiRateLimitRules(UpdateApiRateLimitRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApiRateLimitRules", UpdateApiRateLimitRulesResponse.class);
    }

    /**
     *批量更新API超时
     * @param req UpdateApiTimeoutsRequest
     * @return UpdateApiTimeoutsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApiTimeoutsResponse UpdateApiTimeouts(UpdateApiTimeoutsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApiTimeouts", UpdateApiTimeoutsResponse.class);
    }

    /**
     *更新参数模板
     * @param req UpdateConfigTemplateRequest
     * @return UpdateConfigTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigTemplateResponse UpdateConfigTemplate(UpdateConfigTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigTemplate", UpdateConfigTemplateResponse.class);
    }

    /**
     *更新API
     * @param req UpdateGatewayApiRequest
     * @return UpdateGatewayApiResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGatewayApiResponse UpdateGatewayApi(UpdateGatewayApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGatewayApi", UpdateGatewayApiResponse.class);
    }

    /**
     *更新健康检查配置
     * @param req UpdateHealthCheckSettingsRequest
     * @return UpdateHealthCheckSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateHealthCheckSettingsResponse UpdateHealthCheckSettings(UpdateHealthCheckSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateHealthCheckSettings", UpdateHealthCheckSettingsResponse.class);
    }

    /**
     *更新仓库信息
     * @param req UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRepositoryResponse UpdateRepository(UpdateRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRepository", UpdateRepositoryResponse.class);
    }

    /**
     *更新单元化规则
     * @param req UpdateUnitRuleRequest
     * @return UpdateUnitRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUnitRuleResponse UpdateUnitRule(UpdateUnitRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUnitRule", UpdateUnitRuleResponse.class);
    }

}
