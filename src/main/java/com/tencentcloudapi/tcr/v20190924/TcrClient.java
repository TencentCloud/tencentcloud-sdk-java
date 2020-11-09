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
    private static String service = "tcr";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteImagePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteImagePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteRepositoryPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteRepositoryPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationTriggerPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationTriggerPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageLifecyclePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImageLifecyclePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *创建个人版镜像仓库命名空间，此命名空间全局唯一
     * @param req CreateNamespacePersonalRequest
     * @return CreateNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespacePersonalResponse CreateNamespacePersonal(CreateNamespacePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespacePersonalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespacePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNamespacePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *用于在个人版仓库中创建镜像仓库
     * @param req CreateRepositoryPersonalRequest
     * @return CreateRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryPersonalResponse CreateRepositoryPersonal(CreateRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRepositoryPersonalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRepositoryPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRepositoryPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationTriggerPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationTriggerPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定镜像
     * @param req DeleteImageRequest
     * @return DeleteImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageResponse DeleteImage(DeleteImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageLifecycleGlobalPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageLifecycleGlobalPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageLifecyclePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageLifecyclePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImagePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImagePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstanceToken");
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
     *删除共享版命名空间
     * @param req DeleteNamespacePersonalRequest
     * @return DeleteNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespacePersonalResponse DeleteNamespacePersonal(DeleteNamespacePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespacePersonalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespacePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNamespacePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *用于个人版镜像仓库中删除
     * @param req DeleteRepositoryPersonalRequest
     * @return DeleteRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryPersonalResponse DeleteRepositoryPersonal(DeleteRepositoryPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRepositoryPersonalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRepositoryPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRepositoryPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationTriggerLogPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationTriggerLogPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationTriggerPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationTriggerPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFavorRepositoryPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFavorRepositoryPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageFilterPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageFilterPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageLifecycleGlobalPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageLifecycleGlobalPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageLifecyclePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageLifecyclePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageManifestsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageManifests");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImagePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *查询个人版命名空间信息
     * @param req DescribeNamespacePersonalRequest
     * @return DescribeNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacePersonalResponse DescribeNamespacePersonal(DescribeNamespacePersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacePersonalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespacePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询创建从实例任务状态
     * @param req DescribeReplicationInstanceCreateTasksRequest
     * @return DescribeReplicationInstanceCreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstanceCreateTasksResponse DescribeReplicationInstanceCreateTasks(DescribeReplicationInstanceCreateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplicationInstanceCreateTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplicationInstanceCreateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplicationInstanceCreateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询从实例列表
     * @param req DescribeReplicationInstancesRequest
     * @return DescribeReplicationInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstancesResponse DescribeReplicationInstances(DescribeReplicationInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplicationInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplicationInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplicationInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
     *用于在个人版镜像仓库中，获取满足输入搜索条件的用户镜像仓库
     * @param req DescribeRepositoryFilterPersonalRequest
     * @return DescribeRepositoryFilterPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryFilterPersonalResponse DescribeRepositoryFilterPersonal(DescribeRepositoryFilterPersonalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepositoryFilterPersonalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryFilterPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepositoryFilterPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryOwnerPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepositoryOwnerPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepositoryPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepositoryPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserQuotaPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserQuotaPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebhookTriggerLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebhookTriggerLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DuplicateImagePersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DuplicateImagePersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ManageImageLifecycleGlobalPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ManageImageLifecycleGlobalPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationTriggerPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationTriggerPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRepository");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryAccessPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRepositoryAccessPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRepositoryInfoPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRepositoryInfoPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserPasswordPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserPasswordPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebhookTriggerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebhookTrigger");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ValidateNamespaceExistPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ValidateNamespaceExistPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ValidateRepositoryExistPersonalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ValidateRepositoryExistPersonal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
