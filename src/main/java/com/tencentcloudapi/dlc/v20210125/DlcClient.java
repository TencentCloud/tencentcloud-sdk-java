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
     *DMS元数据新增分区
     * @param req AddDMSPartitionsRequest
     * @return AddDMSPartitionsResponse
     * @throws TencentCloudSDKException
     */
    public AddDMSPartitionsResponse AddDMSPartitions(AddDMSPartitionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDMSPartitionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddDMSPartitionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDMSPartitions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        req.setSkipSign(false);
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
     *DMS元数据更新库
     * @param req AlterDMSDatabaseRequest
     * @return AlterDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSDatabaseResponse AlterDMSDatabase(AlterDMSDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AlterDMSDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AlterDMSDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AlterDMSDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据更新分区
     * @param req AlterDMSPartitionRequest
     * @return AlterDMSPartitionResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSPartitionResponse AlterDMSPartition(AlterDMSPartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AlterDMSPartitionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AlterDMSPartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AlterDMSPartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据更新表
     * @param req AlterDMSTableRequest
     * @return AlterDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSTableResponse AlterDMSTable(AlterDMSTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AlterDMSTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AlterDMSTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AlterDMSTable");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *本接口（CancelNotebookSessionStatement）用于取消session中执行的任务
     * @param req CancelNotebookSessionStatementRequest
     * @return CancelNotebookSessionStatementResponse
     * @throws TencentCloudSDKException
     */
    public CancelNotebookSessionStatementResponse CancelNotebookSessionStatement(CancelNotebookSessionStatementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelNotebookSessionStatementResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelNotebookSessionStatementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelNotebookSessionStatement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CancelNotebookSessionStatementBatch）用于批量取消Session 中执行的任务
     * @param req CancelNotebookSessionStatementBatchRequest
     * @return CancelNotebookSessionStatementBatchResponse
     * @throws TencentCloudSDKException
     */
    public CancelNotebookSessionStatementBatchResponse CancelNotebookSessionStatementBatch(CancelNotebookSessionStatementBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelNotebookSessionStatementBatchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelNotebookSessionStatementBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelNotebookSessionStatementBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CancelSparkSessionBatchSQL）用于取消Spark SQL批任务。
     * @param req CancelSparkSessionBatchSQLRequest
     * @return CancelSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CancelSparkSessionBatchSQLResponse CancelSparkSessionBatchSQL(CancelSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelSparkSessionBatchSQLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelSparkSessionBatchSQLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelSparkSessionBatchSQL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CancelTask），用于取消任务
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *元数据锁检查
     * @param req CheckLockMetaDataRequest
     * @return CheckLockMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public CheckLockMetaDataResponse CheckLockMetaData(CheckLockMetaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckLockMetaDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckLockMetaDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckLockMetaData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据创建库
     * @param req CreateDMSDatabaseRequest
     * @return CreateDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDMSDatabaseResponse CreateDMSDatabase(CreateDMSDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDMSDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDMSDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDMSDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据创建表
     * @param req CreateDMSTableRequest
     * @return CreateDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateDMSTableResponse CreateDMSTable(CreateDMSTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDMSTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDMSTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDMSTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户创建数据引擎
     * @param req CreateDataEngineRequest
     * @return CreateDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataEngineResponse CreateDataEngine(CreateDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDataEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataEngine");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *创建托管存储内表（该接口已废弃）
     * @param req CreateInternalTableRequest
     * @return CreateInternalTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateInternalTableResponse CreateInternalTable(CreateInternalTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInternalTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInternalTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInternalTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateNotebookSession）用于创建交互式session（notebook）
     * @param req CreateNotebookSessionRequest
     * @return CreateNotebookSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookSessionResponse CreateNotebookSession(CreateNotebookSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNotebookSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNotebookSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateNotebookSessionStatement）用于在session中执行代码片段
     * @param req CreateNotebookSessionStatementRequest
     * @return CreateNotebookSessionStatementResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookSessionStatementResponse CreateNotebookSessionStatement(CreateNotebookSessionStatementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNotebookSessionStatementResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookSessionStatementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNotebookSessionStatement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateNotebookSessionStatementSupportBatchSQL）用于创建交互式session并执行SQL任务
     * @param req CreateNotebookSessionStatementSupportBatchSQLRequest
     * @return CreateNotebookSessionStatementSupportBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookSessionStatementSupportBatchSQLResponse CreateNotebookSessionStatementSupportBatchSQL(CreateNotebookSessionStatementSupportBatchSQLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNotebookSessionStatementSupportBatchSQLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotebookSessionStatementSupportBatchSQLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNotebookSessionStatementSupportBatchSQL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建查询结果下载任务
     * @param req CreateResultDownloadRequest
     * @return CreateResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public CreateResultDownloadResponse CreateResultDownload(CreateResultDownloadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResultDownloadResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResultDownloadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResultDownload");
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
        req.setSkipSign(false);
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
     *创建spark作业
     * @param req CreateSparkAppRequest
     * @return CreateSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppResponse CreateSparkApp(CreateSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *启动Spark作业
     * @param req CreateSparkAppTaskRequest
     * @return CreateSparkAppTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppTaskResponse CreateSparkAppTask(CreateSparkAppTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkAppTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（CreateSparkSessionBatchSQL）用于向Spark作业引擎提交Spark SQL批任务。
     * @param req CreateSparkSessionBatchSQLRequest
     * @return CreateSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkSessionBatchSQLResponse CreateSparkSessionBatchSQL(CreateSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSparkSessionBatchSQLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSparkSessionBatchSQLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSparkSessionBatchSQL");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *本接口（CreateTask）用于创建并执行SQL任务。（推荐使用CreateTasks接口）
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（CreateTasks），用于批量创建并执行SQL任务
     * @param req CreateTasksRequest
     * @return CreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksResponse CreateTasks(CreateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *本接口（DeleteNotebookSession）用于删除交互式session（notebook）
     * @param req DeleteNotebookSessionRequest
     * @return DeleteNotebookSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookSessionResponse DeleteNotebookSession(DeleteNotebookSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNotebookSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotebookSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNotebookSession");
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
        req.setSkipSign(false);
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
     *删除spark作业
     * @param req DeleteSparkAppRequest
     * @return DeleteSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSparkAppResponse DeleteSparkApp(DeleteSparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSparkAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *DMS元数据获取库
     * @param req DescribeDMSDatabaseRequest
     * @return DescribeDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSDatabaseResponse DescribeDMSDatabase(DescribeDMSDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDMSDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDMSDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDMSDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据获取分区
     * @param req DescribeDMSPartitionsRequest
     * @return DescribeDMSPartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSPartitionsResponse DescribeDMSPartitions(DescribeDMSPartitionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDMSPartitionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDMSPartitionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDMSPartitions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据获取表
     * @param req DescribeDMSTableRequest
     * @return DescribeDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSTableResponse DescribeDMSTable(DescribeDMSTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDMSTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDMSTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDMSTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据获取表列表
     * @param req DescribeDMSTablesRequest
     * @return DescribeDMSTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSTablesResponse DescribeDMSTables(DescribeDMSTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDMSTablesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDMSTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDMSTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDataEngines）用于查询DataEngines信息列表
     * @param req DescribeDataEnginesRequest
     * @return DescribeDataEnginesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginesResponse DescribeDataEngines(DescribeDataEnginesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataEnginesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataEnginesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataEngines");
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
        req.setSkipSign(false);
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
     *本接口根据引擎ID查询数据引擎资源使用情况
     * @param req DescribeEngineUsageInfoRequest
     * @return DescribeEngineUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEngineUsageInfoResponse DescribeEngineUsageInfo(DescribeEngineUsageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEngineUsageInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEngineUsageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEngineUsageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeForbiddenTablePro）用于查询被禁用的表属性列表（新）
     * @param req DescribeForbiddenTableProRequest
     * @return DescribeForbiddenTableProResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForbiddenTableProResponse DescribeForbiddenTablePro(DescribeForbiddenTableProRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeForbiddenTableProResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeForbiddenTableProResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeForbiddenTablePro");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询托管存储指定目录的Summary
     * @param req DescribeLakeFsDirSummaryRequest
     * @return DescribeLakeFsDirSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsDirSummaryResponse DescribeLakeFsDirSummary(DescribeLakeFsDirSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLakeFsDirSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLakeFsDirSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLakeFsDirSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户的托管存储信息
     * @param req DescribeLakeFsInfoRequest
     * @return DescribeLakeFsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsInfoResponse DescribeLakeFsInfo(DescribeLakeFsInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLakeFsInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLakeFsInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLakeFsInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNotebookSession）用于查询交互式 session详情信息
     * @param req DescribeNotebookSessionRequest
     * @return DescribeNotebookSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionResponse DescribeNotebookSession(DescribeNotebookSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNotebookSessionLog）用于查询交互式 session日志
     * @param req DescribeNotebookSessionLogRequest
     * @return DescribeNotebookSessionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionLogResponse DescribeNotebookSessionLog(DescribeNotebookSessionLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSessionLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSessionLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSessionLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNotebookSessionStatement）用于查询session 中执行任务的详情
     * @param req DescribeNotebookSessionStatementRequest
     * @return DescribeNotebookSessionStatementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionStatementResponse DescribeNotebookSessionStatement(DescribeNotebookSessionStatementRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSessionStatementResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSessionStatementResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSessionStatement");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNotebookSessionStatementSqlResult）用于获取statement运行结果。
     * @param req DescribeNotebookSessionStatementSqlResultRequest
     * @return DescribeNotebookSessionStatementSqlResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionStatementSqlResultResponse DescribeNotebookSessionStatementSqlResult(DescribeNotebookSessionStatementSqlResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSessionStatementSqlResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSessionStatementSqlResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSessionStatementSqlResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNotebookSessionStatements）用于查询Session中执行的任务列表
     * @param req DescribeNotebookSessionStatementsRequest
     * @return DescribeNotebookSessionStatementsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionStatementsResponse DescribeNotebookSessionStatements(DescribeNotebookSessionStatementsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSessionStatementsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSessionStatementsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSessionStatements");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNotebookSessions）用于查询交互式 session列表
     * @param req DescribeNotebookSessionsRequest
     * @return DescribeNotebookSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionsResponse DescribeNotebookSessions(DescribeNotebookSessionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotebookSessionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotebookSessionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNotebookSessions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询结果下载任务
     * @param req DescribeResultDownloadRequest
     * @return DescribeResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResultDownloadResponse DescribeResultDownload(DescribeResultDownloadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResultDownloadResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResultDownloadResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResultDownload");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeScripts）用于查询SQL脚本列表
     * @param req DescribeScriptsRequest
     * @return DescribeScriptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScriptsResponse DescribeScripts(DescribeScriptsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScriptsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询spark作业信息
     * @param req DescribeSparkAppJobRequest
     * @return DescribeSparkAppJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobResponse DescribeSparkAppJob(DescribeSparkAppJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询spark作业列表
     * @param req DescribeSparkAppJobsRequest
     * @return DescribeSparkAppJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobsResponse DescribeSparkAppJobs(DescribeSparkAppJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询Spark作业的运行任务列表
     * @param req DescribeSparkAppTasksRequest
     * @return DescribeSparkAppTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppTasksResponse DescribeSparkAppTasks(DescribeSparkAppTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkAppTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（DescribeSparkSessionBatchSqlLog）用于获取SparkSQL批任务日志
     * @param req DescribeSparkSessionBatchSqlLogRequest
     * @return DescribeSparkSessionBatchSqlLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkSessionBatchSqlLogResponse DescribeSparkSessionBatchSqlLog(DescribeSparkSessionBatchSqlLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSparkSessionBatchSqlLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSparkSessionBatchSqlLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSparkSessionBatchSqlLog");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *列举用户角色信息
     * @param req DescribeUserRolesRequest
     * @return DescribeUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRolesResponse DescribeUserRoles(DescribeUserRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserRoles");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *DMS元数据删除库
     * @param req DropDMSDatabaseRequest
     * @return DropDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSDatabaseResponse DropDMSDatabase(DropDMSDatabaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropDMSDatabaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DropDMSDatabaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DropDMSDatabase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据删除分区
     * @param req DropDMSPartitionsRequest
     * @return DropDMSPartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSPartitionsResponse DropDMSPartitions(DropDMSPartitionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropDMSPartitionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DropDMSPartitionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DropDMSPartitions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DMS元数据删除表
     * @param req DropDMSTableRequest
     * @return DropDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSTableResponse DropDMSTable(DropDMSTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropDMSTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DropDMSTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DropDMSTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成创建托管表语句
     * @param req GenerateCreateMangedTableSqlRequest
     * @return GenerateCreateMangedTableSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateCreateMangedTableSqlResponse GenerateCreateMangedTableSql(GenerateCreateMangedTableSqlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateCreateMangedTableSqlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateCreateMangedTableSqlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateCreateMangedTableSql");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListTaskJobLogDetail）用于获取spark 作业任务日志详情
     * @param req ListTaskJobLogDetailRequest
     * @return ListTaskJobLogDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskJobLogDetailResponse ListTaskJobLogDetail(ListTaskJobLogDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTaskJobLogDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListTaskJobLogDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTaskJobLogDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *元数据锁
     * @param req LockMetaDataRequest
     * @return LockMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public LockMetaDataResponse LockMetaData(LockMetaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LockMetaDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LockMetaDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LockMetaData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改数据治理事件阈值
     * @param req ModifyGovernEventRuleRequest
     * @return ModifyGovernEventRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernEventRuleResponse ModifyGovernEventRule(ModifyGovernEventRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGovernEventRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGovernEventRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGovernEventRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新spark作业
     * @param req ModifySparkAppRequest
     * @return ModifySparkAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppResponse ModifySparkApp(ModifySparkAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySparkAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *本接口（ModifySparkAppBatch）用于批量修改Spark作业参数配置
     * @param req ModifySparkAppBatchRequest
     * @return ModifySparkAppBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppBatchResponse ModifySparkAppBatch(ModifySparkAppBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySparkAppBatchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySparkAppBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySparkAppBatch");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *上报元数据心跳
     * @param req ReportHeartbeatMetaDataRequest
     * @return ReportHeartbeatMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public ReportHeartbeatMetaDataResponse ReportHeartbeatMetaData(ReportHeartbeatMetaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportHeartbeatMetaDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ReportHeartbeatMetaDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportHeartbeatMetaData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于控制挂起或启动数据引擎
     * @param req SuspendResumeDataEngineRequest
     * @return SuspendResumeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SuspendResumeDataEngineResponse SuspendResumeDataEngine(SuspendResumeDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SuspendResumeDataEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SuspendResumeDataEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SuspendResumeDataEngine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换主备集群
     * @param req SwitchDataEngineRequest
     * @return SwitchDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDataEngineResponse SwitchDataEngine(SwitchDataEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDataEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDataEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDataEngine");
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
        req.setSkipSign(false);
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

    /**
     *元数据解锁
     * @param req UnlockMetaDataRequest
     * @return UnlockMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public UnlockMetaDataResponse UnlockMetaData(UnlockMetaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnlockMetaDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnlockMetaDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnlockMetaData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于更新行过滤规则。注意只能更新过滤规则，不能更新规格对象catalog，database和table。
     * @param req UpdateRowFilterRequest
     * @return UpdateRowFilterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRowFilterResponse UpdateRowFilter(UpdateRowFilterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRowFilterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRowFilterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRowFilter");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
