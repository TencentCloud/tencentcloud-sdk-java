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
package com.tencentcloudapi.bi.v20220105;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bi.v20220105.models.*;

public class BiClient extends AbstractClient{
    private static String endpoint = "bi.tencentcloudapi.com";
    private static String service = "bi";
    private static String version = "2022-01-05";
    
    public BiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BiClient(Credential credential, String region, ClientProfile profile) {
        super(BiClient.endpoint, BiClient.version, credential, region, profile);
    }

    /**
     *申请延长Token可用时间接口-强鉴权
     * @param req ApplyEmbedIntervalRequest
     * @return ApplyEmbedIntervalResponse
     * @throws TencentCloudSDKException
     */
    public ApplyEmbedIntervalResponse ApplyEmbedInterval(ApplyEmbedIntervalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyEmbedIntervalResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyEmbedIntervalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyEmbedInterval");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建数据源
     * @param req CreateDatasourceRequest
     * @return CreateDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasourceResponse CreateDatasource(CreateDatasourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatasourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatasourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDatasource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云数据库
     * @param req CreateDatasourceCloudRequest
     * @return CreateDatasourceCloudResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasourceCloudResponse CreateDatasourceCloud(CreateDatasourceCloudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatasourceCloudResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatasourceCloudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDatasourceCloud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建嵌出报表-强鉴权
     * @param req CreateEmbedTokenRequest
     * @return CreateEmbedTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmbedTokenResponse CreateEmbedToken(CreateEmbedTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmbedTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmbedTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmbedToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户角色
     * @param req CreateUserRoleRequest
     * @return CreateUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserRoleResponse CreateUserRole(CreateUserRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目内-创建用户角色
     * @param req CreateUserRoleProjectRequest
     * @return CreateUserRoleProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserRoleProjectResponse CreateUserRoleProject(CreateUserRoleProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserRoleProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserRoleProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserRoleProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除数据源
     * @param req DeleteDatasourceRequest
     * @return DeleteDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatasourceResponse DeleteDatasource(DeleteDatasourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDatasourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDatasourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDatasource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户角色，会删除用户
     * @param req DeleteUserRoleRequest
     * @return DeleteUserRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserRoleResponse DeleteUserRole(DeleteUserRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserRoleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目内-删除用户角色
     * @param req DeleteUserRoleProjectRequest
     * @return DeleteUserRoleProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserRoleProjectResponse DeleteUserRoleProject(DeleteUserRoleProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserRoleProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserRoleProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserRoleProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据源列表
     * @param req DescribeDatasourceListRequest
     * @return DescribeDatasourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceListResponse DescribeDatasourceList(DescribeDatasourceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatasourceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatasourceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatasourceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目详情接口
     * @param req DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectInfoResponse DescribeProjectInfo(DescribeProjectInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目信息
     * @param req DescribeProjectListRequest
     * @return DescribeProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectListResponse DescribeProjectList(DescribeProjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目内-用户接口
     * @param req DescribeUserProjectListRequest
     * @return DescribeUserProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserProjectListResponse DescribeUserProjectList(DescribeUserProjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserProjectListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserProjectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserProjectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户角色列表
     * @param req DescribeUserRoleListRequest
     * @return DescribeUserRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRoleListResponse DescribeUserRoleList(DescribeUserRoleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserRoleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserRoleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserRoleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新数据源
     * @param req ModifyDatasourceRequest
     * @return ModifyDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatasourceResponse ModifyDatasource(ModifyDatasourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatasourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatasourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatasource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新云数据库
     * @param req ModifyDatasourceCloudRequest
     * @return ModifyDatasourceCloudResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatasourceCloudResponse ModifyDatasourceCloud(ModifyDatasourceCloudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatasourceCloudResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatasourceCloudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatasourceCloud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改项目信息
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *项目-修改用户角色信息
     * @param req ModifyUserRoleProjectRequest
     * @return ModifyUserRoleProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserRoleProjectResponse ModifyUserRoleProject(ModifyUserRoleProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserRoleProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserRoleProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserRoleProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
