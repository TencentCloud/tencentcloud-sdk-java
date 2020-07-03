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
package com.tencentcloudapi.tcr.v20190924;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcr.v20190924.models.*;

public class TcrClient extends AbstractClient{
    private static String endpoint = "tcr.tencentcloudapi.com";
    private static String version = "2019-09-24";

    public TcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcrClient(Credential credential, String region, ClientProfile profile) {
        super(TcrClient.endpoint, TcrClient.version, credential, region, profile);
    }

    /**
     *用于在个人版镜像仓库中批量删除Tag
     * @param req BatchDeleteImagePersonalRequest
     * @return BatchDeleteImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteImagePersonalResponse BatchDeleteImagePersonal(BatchDeleteImagePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteImagePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteImagePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BatchDeleteImagePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于个人版镜像仓库中批量删除镜像仓库
     * @param req BatchDeleteRepositoryPersonalRequest
     * @return BatchDeleteRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRepositoryPersonalResponse BatchDeleteRepositoryPersonal(BatchDeleteRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteRepositoryPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteRepositoryPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BatchDeleteRepositoryPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建应用更新触发器
     * @param req CreateApplicationTriggerPersonalRequest
     * @return CreateApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationTriggerPersonalResponse CreateApplicationTriggerPersonal(CreateApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationTriggerPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationTriggerPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateApplicationTriggerPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版中创建清理策略
     * @param req CreateImageLifecyclePersonalRequest
     * @return CreateImageLifecyclePersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageLifecyclePersonalResponse CreateImageLifecyclePersonal(CreateImageLifecyclePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageLifecyclePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageLifecyclePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateImageLifecyclePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建实例的临时或长期访问凭证
     * @param req CreateInstanceTokenRequest
     * @return CreateInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceTokenResponse CreateInstanceToken(CreateInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceTokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceTokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstanceToken"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在企业版中创建命名空间
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
     *创建个人版镜像仓库命名空间，此命名空间全局唯一
     * @param req CreateNamespacePersonalRequest
     * @return CreateNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespacePersonalResponse CreateNamespacePersonal(CreateNamespacePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespacePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespacePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNamespacePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于企业版创建镜像仓库
     * @param req CreateRepositoryRequest
     * @return CreateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryResponse CreateRepository(CreateRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRepositoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版仓库中创建镜像仓库
     * @param req CreateRepositoryPersonalRequest
     * @return CreateRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryPersonalResponse CreateRepositoryPersonal(CreateRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRepositoryPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRepositoryPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRepositoryPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建个人用户
     * @param req CreateUserPersonalRequest
     * @return CreateUserPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserPersonalResponse CreateUserPersonal(CreateUserPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUserPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建触发器
     * @param req CreateWebhookTriggerRequest
     * @return CreateWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebhookTriggerResponse CreateWebhookTrigger(CreateWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWebhookTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWebhookTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWebhookTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除应用更新触发器
     * @param req DeleteApplicationTriggerPersonalRequest
     * @return DeleteApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationTriggerPersonalResponse DeleteApplicationTriggerPersonal(DeleteApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationTriggerPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationTriggerPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteApplicationTriggerPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除个人版全局镜像版本自动清理策略
     * @param req DeleteImageLifecycleGlobalPersonalRequest
     * @return DeleteImageLifecycleGlobalPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageLifecycleGlobalPersonalResponse DeleteImageLifecycleGlobalPersonal(DeleteImageLifecycleGlobalPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageLifecycleGlobalPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageLifecycleGlobalPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImageLifecycleGlobalPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版镜像仓库中删除仓库Tag自动清理策略
     * @param req DeleteImageLifecyclePersonalRequest
     * @return DeleteImageLifecyclePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageLifecyclePersonalResponse DeleteImageLifecyclePersonal(DeleteImageLifecyclePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageLifecyclePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageLifecyclePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImageLifecyclePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版中删除tag
     * @param req DeleteImagePersonalRequest
     * @return DeleteImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagePersonalResponse DeleteImagePersonal(DeleteImagePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImagePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImagePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImagePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除长期访问凭证
     * @param req DeleteInstanceTokenRequest
     * @return DeleteInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceTokenResponse DeleteInstanceToken(DeleteInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceTokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceTokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteInstanceToken"), type);
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
     *删除共享版命名空间
     * @param req DeleteNamespacePersonalRequest
     * @return DeleteNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespacePersonalResponse DeleteNamespacePersonal(DeleteNamespacePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespacePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespacePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNamespacePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除镜像仓库
     * @param req DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryResponse DeleteRepository(DeleteRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRepositoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于个人版镜像仓库中删除
     * @param req DeleteRepositoryPersonalRequest
     * @return DeleteRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryPersonalResponse DeleteRepositoryPersonal(DeleteRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRepositoryPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRepositoryPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRepositoryPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除触发器
     * @param req DeleteWebhookTriggerRequest
     * @return DeleteWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookTriggerResponse DeleteWebhookTrigger(DeleteWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWebhookTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebhookTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWebhookTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询应用更新触发器触发日志
     * @param req DescribeApplicationTriggerLogPersonalRequest
     * @return DescribeApplicationTriggerLogPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationTriggerLogPersonalResponse DescribeApplicationTriggerLogPersonal(DescribeApplicationTriggerLogPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationTriggerLogPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationTriggerLogPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApplicationTriggerLogPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询应用更新触发器
     * @param req DescribeApplicationTriggerPersonalRequest
     * @return DescribeApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationTriggerPersonalResponse DescribeApplicationTriggerPersonal(DescribeApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationTriggerPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationTriggerPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApplicationTriggerPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询个人收藏仓库
     * @param req DescribeFavorRepositoryPersonalRequest
     * @return DescribeFavorRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFavorRepositoryPersonalResponse DescribeFavorRepositoryPersonal(DescribeFavorRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFavorRepositoryPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFavorRepositoryPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeFavorRepositoryPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版中查询与指定tag镜像内容相同的tag列表
     * @param req DescribeImageFilterPersonalRequest
     * @return DescribeImageFilterPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageFilterPersonalResponse DescribeImageFilterPersonal(DescribeImageFilterPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageFilterPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageFilterPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageFilterPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取个人版全局镜像版本自动清理策略
     * @param req DescribeImageLifecycleGlobalPersonalRequest
     * @return DescribeImageLifecycleGlobalPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageLifecycleGlobalPersonalResponse DescribeImageLifecycleGlobalPersonal(DescribeImageLifecycleGlobalPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageLifecycleGlobalPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageLifecycleGlobalPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageLifecycleGlobalPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取个人版仓库中自动清理策略
     * @param req DescribeImageLifecyclePersonalRequest
     * @return DescribeImageLifecyclePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageLifecyclePersonalResponse DescribeImageLifecyclePersonal(DescribeImageLifecyclePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageLifecyclePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageLifecyclePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageLifecyclePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器镜像Manifest信息
     * @param req DescribeImageManifestsRequest
     * @return DescribeImageManifestsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageManifestsResponse DescribeImageManifests(DescribeImageManifestsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageManifestsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageManifestsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageManifests"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取个人版镜像仓库tag列表
     * @param req DescribeImagePersonalRequest
     * @return DescribeImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagePersonalResponse DescribeImagePersonal(DescribeImagePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImagePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询镜像版本列表或指定容器镜像信息
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImages"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例当前状态以及过程信息
     * @param req DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStatusResponse DescribeInstanceStatus(DescribeInstanceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询长期访问凭证信息
     * @param req DescribeInstanceTokenRequest
     * @return DescribeInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTokenResponse DescribeInstanceToken(DescribeInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceToken"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询个人版命名空间信息
     * @param req DescribeNamespacePersonalRequest
     * @return DescribeNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacePersonalResponse DescribeNamespacePersonal(DescribeNamespacePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNamespacePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询命名空间列表或指定命名空间信息
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNamespaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询镜像仓库列表或指定镜像仓库信息
     * @param req DescribeRepositoriesRequest
     * @return DescribeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoriesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoriesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRepositories"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版镜像仓库中，获取满足输入搜索条件的用户镜像仓库
     * @param req DescribeRepositoryFilterPersonalRequest
     * @return DescribeRepositoryFilterPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryFilterPersonalResponse DescribeRepositoryFilterPersonal(DescribeRepositoryFilterPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoryFilterPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryFilterPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRepositoryFilterPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版中获取用户全部的镜像仓库列表
     * @param req DescribeRepositoryOwnerPersonalRequest
     * @return DescribeRepositoryOwnerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryOwnerPersonalResponse DescribeRepositoryOwnerPersonal(DescribeRepositoryOwnerPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoryOwnerPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryOwnerPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRepositoryOwnerPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询个人版仓库信息
     * @param req DescribeRepositoryPersonalRequest
     * @return DescribeRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryPersonalResponse DescribeRepositoryPersonal(DescribeRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoryPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRepositoryPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询个人用户配额
     * @param req DescribeUserQuotaPersonalRequest
     * @return DescribeUserQuotaPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotaPersonalResponse DescribeUserQuotaPersonal(DescribeUserQuotaPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserQuotaPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserQuotaPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserQuotaPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询触发器
     * @param req DescribeWebhookTriggerRequest
     * @return DescribeWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookTriggerResponse DescribeWebhookTrigger(DescribeWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebhookTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebhookTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWebhookTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取触发器日志
     * @param req DescribeWebhookTriggerLogRequest
     * @return DescribeWebhookTriggerLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookTriggerLogResponse DescribeWebhookTriggerLog(DescribeWebhookTriggerLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebhookTriggerLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebhookTriggerLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWebhookTriggerLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版镜像仓库中复制镜像版本
     * @param req DuplicateImagePersonalRequest
     * @return DuplicateImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DuplicateImagePersonalResponse DuplicateImagePersonal(DuplicateImagePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DuplicateImagePersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DuplicateImagePersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DuplicateImagePersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于设置个人版全局镜像版本自动清理策略
     * @param req ManageImageLifecycleGlobalPersonalRequest
     * @return ManageImageLifecycleGlobalPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ManageImageLifecycleGlobalPersonalResponse ManageImageLifecycleGlobalPersonal(ManageImageLifecycleGlobalPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ManageImageLifecycleGlobalPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ManageImageLifecycleGlobalPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ManageImageLifecycleGlobalPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改应用更新触发器
     * @param req ModifyApplicationTriggerPersonalRequest
     * @return ModifyApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationTriggerPersonalResponse ModifyApplicationTriggerPersonal(ModifyApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationTriggerPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationTriggerPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyApplicationTriggerPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新实例内指定长期访问凭证的启用状态
     * @param req ModifyInstanceTokenRequest
     * @return ModifyInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTokenResponse ModifyInstanceToken(ModifyInstanceTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceTokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceTokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstanceToken"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新命名空间信息，当前仅支持修改命名空间访问级别
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新镜像仓库信息，可修改仓库描述信息
     * @param req ModifyRepositoryRequest
     * @return ModifyRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryResponse ModifyRepository(ModifyRepositoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRepositoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRepository"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于更新个人版镜像仓库的访问属性
     * @param req ModifyRepositoryAccessPersonalRequest
     * @return ModifyRepositoryAccessPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryAccessPersonalResponse ModifyRepositoryAccessPersonal(ModifyRepositoryAccessPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRepositoryAccessPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryAccessPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRepositoryAccessPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在个人版镜像仓库中更新容器镜像描述
     * @param req ModifyRepositoryInfoPersonalRequest
     * @return ModifyRepositoryInfoPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryInfoPersonalResponse ModifyRepositoryInfoPersonal(ModifyRepositoryInfoPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRepositoryInfoPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryInfoPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRepositoryInfoPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改个人用户登录密码
     * @param req ModifyUserPasswordPersonalRequest
     * @return ModifyUserPasswordPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserPasswordPersonalResponse ModifyUserPasswordPersonal(ModifyUserPasswordPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserPasswordPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserPasswordPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUserPasswordPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新触发器
     * @param req ModifyWebhookTriggerRequest
     * @return ModifyWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookTriggerResponse ModifyWebhookTrigger(ModifyWebhookTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebhookTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebhookTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWebhookTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询个人版用户命名空间是否存在
     * @param req ValidateNamespaceExistPersonalRequest
     * @return ValidateNamespaceExistPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ValidateNamespaceExistPersonalResponse ValidateNamespaceExistPersonal(ValidateNamespaceExistPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ValidateNamespaceExistPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ValidateNamespaceExistPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ValidateNamespaceExistPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于判断个人版仓库是否存在
     * @param req ValidateRepositoryExistPersonalRequest
     * @return ValidateRepositoryExistPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ValidateRepositoryExistPersonalResponse ValidateRepositoryExistPersonal(ValidateRepositoryExistPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ValidateRepositoryExistPersonalResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ValidateRepositoryExistPersonalResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ValidateRepositoryExistPersonal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
