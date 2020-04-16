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
        try {
                Type type = new TypeToken<JsonResponseModel<AddClusterInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddClusterInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<AddInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateApplication"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCluster"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateContainGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateContainGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMicroserviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMicroservice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePublicConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePublicConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServerlessGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServerlessGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteApplication"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteContainerGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteContainerGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImageTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMicroserviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMicroservice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePkgsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePkgs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePublicConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePublicConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServerlessGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServerlessGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeployContainerGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeployContainerGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeployGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeployGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeployServerlessGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeployServerlessGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApplication"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApplicationAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApplications"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClusterInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigReleaseLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConfigReleaseLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigReleasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConfigReleases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigSummaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConfigSummary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerGroupDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeContainerGroupDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContainerGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeContainerGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDownloadInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDownloadInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMicroserviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMicroservice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMicroservicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMicroservices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePkgsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePkgs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePodInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePodInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePublicConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigReleaseLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePublicConfigReleaseLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigReleasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePublicConfigReleases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigSummaryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePublicConfigSummary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePublicConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReleasedConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeReleasedConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerlessGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServerlessGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServerlessGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServerlessGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleApplicationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSimpleApplications"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleClustersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSimpleClusters"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSimpleGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleNamespacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSimpleNamespaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUploadInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUploadInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ExpandGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExpandGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContainerGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyContainerGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyContainerReplicasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyContainerReplicas"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMicroserviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMicroservice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUploadInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUploadInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ReleasePublicConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleasePublicConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RevocationConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RevocationConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RevocationPublicConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RevocationPublicConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<RollbackConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RollbackConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ShrinkGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ShrinkGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ShrinkInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ShrinkInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StartContainerGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartContainerGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StartGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StopContainerGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopContainerGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<StopGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
