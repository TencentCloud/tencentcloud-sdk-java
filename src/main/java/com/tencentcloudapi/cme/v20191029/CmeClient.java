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
package com.tencentcloudapi.cme.v20191029;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cme.v20191029.models.*;

public class CmeClient extends AbstractClient{
    private static String endpoint = "cme.tencentcloudapi.com";
    private static String version = "2019-10-29";

    public CmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmeClient(Credential credential, String region, ClientProfile profile) {
        super(CmeClient.endpoint, CmeClient.version, credential, region, profile);
    }

    /**
     *创建云剪的编辑项目，支持创建视频剪辑及直播剪辑两大类项目。

     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户登录态，使用户登出云剪平台。
     * @param req DeleteLoginStatusRequest
     * @return DeleteLoginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginStatusResponse DeleteLoginStatus(DeleteLoginStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoginStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoginStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoginStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云剪编辑项目。
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定用户的登录态。
     * @param req DescribeLoginStatusRequest
     * @return DescribeLoginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginStatusResponse DescribeLoginStatus(DescribeLoginStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoginStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoginStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持根据多种条件过滤出项目列表。
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取任务详情信息，包含下面几个部分：
<li>任务基础信息：包括任务状态、错误信息、创建时间等；</li>
<li>导出项目输出信息：包括输出的素材 Id 等。</li>
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持各种条件筛选，返回对应的任务基础信息列表。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出视频编辑项目，支持指定输出的模板。
     * @param req ExportVideoEditProjectRequest
     * @return ExportVideoEditProjectResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoEditProjectResponse ExportVideoEditProject(ExportVideoEditProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVideoEditProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVideoEditProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExportVideoEditProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将云点播中的媒资添加到素材库中，提供给后续的视频编辑。
     * @param req ImportMediaToProjectRequest
     * @return ImportMediaToProjectResponse
     * @throws TencentCloudSDKException
     */
    public ImportMediaToProjectResponse ImportMediaToProject(ImportMediaToProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportMediaToProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportMediaToProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportMediaToProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云剪编辑项目的信息。
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
