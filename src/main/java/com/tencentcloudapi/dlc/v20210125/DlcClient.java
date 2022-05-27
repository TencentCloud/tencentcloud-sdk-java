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
package com.tencentcloudapi.dlc.v20210125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dlc.v20210125.models.*;

public class DlcClient extends AbstractClient{
    private static String endpoint = "dlc.tencentcloudapi.com";
    private static String service = "dlc";
    private static String version = "2021-01-25";

    public DlcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DlcClient(Credential credential, String region, ClientProfile profile) {
        super(DlcClient.endpoint, DlcClient.version, credential, region, profile);
    }

    /**
     *添加用户到工作组
     * @param req AddUsersToWorkGroupRequest
     * @return AddUsersToWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersToWorkGroupResponse AddUsersToWorkGroup(AddUsersToWorkGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUsersToWorkGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUsersToWorkGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUsersToWorkGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定鉴权策略到用户
     * @param req AttachUserPolicyRequest
     * @return AttachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachUserPolicyResponse AttachUserPolicy(AttachUserPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachUserPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachUserPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachUserPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定鉴权策略到工作组
     * @param req AttachWorkGroupPolicyRequest
     * @return AttachWorkGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachWorkGroupPolicyResponse AttachWorkGroupPolicy(AttachWorkGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachWorkGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachWorkGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachWorkGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定工作组到用户
     * @param req BindWorkGroupsToUserRequest
     * @return BindWorkGroupsToUserResponse
     * @throws TencentCloudSDKException
     */
    public BindWorkGroupsToUserResponse BindWorkGroupsToUser(BindWorkGroupsToUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindWorkGroupsToUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindWorkGroupsToUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindWorkGroupsToUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CancelTask），用于取消任务执行
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDatabase）用于生成建库SQL语句。
     * @param req CreateDatabaseRequest
     * @return CreateDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseResponse CreateDatabase(CreateDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatabaseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateExportTask）用于创建导出任务
     * @param req CreateExportTaskRequest
     * @return CreateExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportTaskResponse CreateExportTask(CreateExportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExportTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateImportTask）用于创建导入任务
     * @param req CreateImportTaskRequest
     * @return CreateImportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateImportTaskResponse CreateImportTask(CreateImportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImportTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateScript）用于创建sql脚本。
     * @param req CreateScriptRequest
     * @return CreateScriptResponse
     * @throws TencentCloudSDKException
     */
    public CreateScriptResponse CreateScript(CreateScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建spark应用
     * @param req CreateSparkAppRequest
     * @return CreateSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppResponse CreateSparkApp(CreateSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSparkAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSparkApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建spark任务
     * @param req CreateSparkAppTaskRequest
     * @return CreateSparkAppTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppTaskResponse CreateSparkAppTask(CreateSparkAppTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSparkAppTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSparkAppTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateStoreLocation）新增或覆盖计算结果存储位置。
     * @param req CreateStoreLocationRequest
     * @return CreateStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public CreateStoreLocationResponse CreateStoreLocation(CreateStoreLocationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStoreLocationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStoreLocationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStoreLocation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateTable）用于生成建表SQL。
     * @param req CreateTableRequest
     * @return CreateTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableResponse CreateTable(CreateTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateTask）用于创建sql查询任务。（推荐使用CreateTasks接口）
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
     *本接口（CreateTasks），用于批量创建任务
     * @param req CreateTasksRequest
     * @return CreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksResponse CreateTasks(CreateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按顺序创建任务（已经废弃，后期不再维护，请使用接口CreateTasks）
     * @param req CreateTasksInOrderRequest
     * @return CreateTasksInOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksInOrderResponse CreateTasksInOrder(CreateTasksInOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTasksInOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTasksInOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTasksInOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建工作组
     * @param req CreateWorkGroupRequest
     * @return CreateWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkGroupResponse CreateWorkGroup(CreateWorkGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DeleteScript）用于删除sql脚本。
     * @param req DeleteScriptRequest
     * @return DeleteScriptResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScriptResponse DeleteScript(DeleteScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除spark应用
     * @param req DeleteSparkAppRequest
     * @return DeleteSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSparkAppResponse DeleteSparkApp(DeleteSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSparkAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSparkAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSparkApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从工作组中删除用户
     * @param req DeleteUsersFromWorkGroupRequest
     * @return DeleteUsersFromWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersFromWorkGroupResponse DeleteUsersFromWorkGroup(DeleteUsersFromWorkGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsersFromWorkGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsersFromWorkGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUsersFromWorkGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除工作组
     * @param req DeleteWorkGroupRequest
     * @return DeleteWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkGroupResponse DeleteWorkGroup(DeleteWorkGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWorkGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDatabases）用于查询数据库列表。
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeScripts）用于获取所有SQL查询。
     * @param req DescribeScriptsRequest
     * @return DescribeScriptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScriptsResponse DescribeScripts(DescribeScriptsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScriptsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScriptsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScripts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询具体的spark应用
     * @param req DescribeSparkAppJobRequest
     * @return DescribeSparkAppJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobResponse DescribeSparkAppJob(DescribeSparkAppJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkAppJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkAppJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取spark应用列表
     * @param req DescribeSparkAppJobsRequest
     * @return DescribeSparkAppJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobsResponse DescribeSparkAppJobs(DescribeSparkAppJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkAppJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkAppJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询spark应用的运行任务实例列表
     * @param req DescribeSparkAppTasksRequest
     * @return DescribeSparkAppTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppTasksResponse DescribeSparkAppTasks(DescribeSparkAppTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkAppTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkAppTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询计算结果存储位置。
     * @param req DescribeStoreLocationRequest
     * @return DescribeStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStoreLocationResponse DescribeStoreLocation(DescribeStoreLocationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStoreLocationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStoreLocationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStoreLocation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTable），用于查询单个表的详细信息。
     * @param req DescribeTableRequest
     * @return DescribeTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableResponse DescribeTable(DescribeTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTables）用于查询数据表列表。
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务结果
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribleTasks）用于查询任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户列表信息
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeViews）用于查询数据视图列表。
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeViewsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeViewsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeViews");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取工作组列表
     * @param req DescribeWorkGroupsRequest
     * @return DescribeWorkGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkGroupsResponse DescribeWorkGroups(DescribeWorkGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑用户鉴权策略
     * @param req DetachUserPolicyRequest
     * @return DetachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachUserPolicyResponse DetachUserPolicy(DetachUserPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachUserPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachUserPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachUserPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑工作组鉴权策略
     * @param req DetachWorkGroupPolicyRequest
     * @return DetachWorkGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachWorkGroupPolicyResponse DetachWorkGroupPolicy(DetachWorkGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachWorkGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachWorkGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachWorkGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新spark应用
     * @param req ModifySparkAppRequest
     * @return ModifySparkAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppResponse ModifySparkApp(ModifySparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySparkAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySparkAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySparkApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户信息
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改工作组信息
     * @param req ModifyWorkGroupRequest
     * @return ModifyWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkGroupResponse ModifyWorkGroup(ModifyWorkGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWorkGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑用户上的用户组
     * @param req UnbindWorkGroupsFromUserRequest
     * @return UnbindWorkGroupsFromUserResponse
     * @throws TencentCloudSDKException
     */
    public UnbindWorkGroupsFromUserResponse UnbindWorkGroupsFromUser(UnbindWorkGroupsFromUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindWorkGroupsFromUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindWorkGroupsFromUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindWorkGroupsFromUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
