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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDMSPartitions", AddDMSPartitionsResponse.class);
    }

    /**
     *添加用户到工作组
     * @param req AddUsersToWorkGroupRequest
     * @return AddUsersToWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersToWorkGroupResponse AddUsersToWorkGroup(AddUsersToWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUsersToWorkGroup", AddUsersToWorkGroupResponse.class);
    }

    /**
     *DMS元数据更新库
     * @param req AlterDMSDatabaseRequest
     * @return AlterDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSDatabaseResponse AlterDMSDatabase(AlterDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AlterDMSDatabase", AlterDMSDatabaseResponse.class);
    }

    /**
     *DMS元数据更新分区
     * @param req AlterDMSPartitionRequest
     * @return AlterDMSPartitionResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSPartitionResponse AlterDMSPartition(AlterDMSPartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AlterDMSPartition", AlterDMSPartitionResponse.class);
    }

    /**
     *DMS元数据更新表
     * @param req AlterDMSTableRequest
     * @return AlterDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public AlterDMSTableResponse AlterDMSTable(AlterDMSTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AlterDMSTable", AlterDMSTableResponse.class);
    }

    /**
     *绑定鉴权策略到用户
     * @param req AttachUserPolicyRequest
     * @return AttachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachUserPolicyResponse AttachUserPolicy(AttachUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachUserPolicy", AttachUserPolicyResponse.class);
    }

    /**
     *绑定鉴权策略到工作组
     * @param req AttachWorkGroupPolicyRequest
     * @return AttachWorkGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachWorkGroupPolicyResponse AttachWorkGroupPolicy(AttachWorkGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachWorkGroupPolicy", AttachWorkGroupPolicyResponse.class);
    }

    /**
     *绑定工作组到用户
     * @param req BindWorkGroupsToUserRequest
     * @return BindWorkGroupsToUserResponse
     * @throws TencentCloudSDKException
     */
    public BindWorkGroupsToUserResponse BindWorkGroupsToUser(BindWorkGroupsToUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindWorkGroupsToUser", BindWorkGroupsToUserResponse.class);
    }

    /**
     *本接口（CancelNotebookSessionStatement）用于取消session中执行的任务
     * @param req CancelNotebookSessionStatementRequest
     * @return CancelNotebookSessionStatementResponse
     * @throws TencentCloudSDKException
     */
    public CancelNotebookSessionStatementResponse CancelNotebookSessionStatement(CancelNotebookSessionStatementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelNotebookSessionStatement", CancelNotebookSessionStatementResponse.class);
    }

    /**
     *本接口（CancelNotebookSessionStatementBatch）用于批量取消Session 中执行的任务
     * @param req CancelNotebookSessionStatementBatchRequest
     * @return CancelNotebookSessionStatementBatchResponse
     * @throws TencentCloudSDKException
     */
    public CancelNotebookSessionStatementBatchResponse CancelNotebookSessionStatementBatch(CancelNotebookSessionStatementBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelNotebookSessionStatementBatch", CancelNotebookSessionStatementBatchResponse.class);
    }

    /**
     *本接口（CancelSparkSessionBatchSQL）用于取消Spark SQL批任务。
     * @param req CancelSparkSessionBatchSQLRequest
     * @return CancelSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CancelSparkSessionBatchSQLResponse CancelSparkSessionBatchSQL(CancelSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelSparkSessionBatchSQL", CancelSparkSessionBatchSQLResponse.class);
    }

    /**
     *本接口（CancelTask），用于取消任务
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelTask", CancelTaskResponse.class);
    }

    /**
     *本接口（CheckDataEngineConfigPairsValidity）用于检查引擎用户自定义参数的有效性
     * @param req CheckDataEngineConfigPairsValidityRequest
     * @return CheckDataEngineConfigPairsValidityResponse
     * @throws TencentCloudSDKException
     */
    public CheckDataEngineConfigPairsValidityResponse CheckDataEngineConfigPairsValidity(CheckDataEngineConfigPairsValidityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDataEngineConfigPairsValidity", CheckDataEngineConfigPairsValidityResponse.class);
    }

    /**
     *本接口（CheckDataEngineImageCanBeRollback）用于查看集群是否能回滚。
     * @param req CheckDataEngineImageCanBeRollbackRequest
     * @return CheckDataEngineImageCanBeRollbackResponse
     * @throws TencentCloudSDKException
     */
    public CheckDataEngineImageCanBeRollbackResponse CheckDataEngineImageCanBeRollback(CheckDataEngineImageCanBeRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDataEngineImageCanBeRollback", CheckDataEngineImageCanBeRollbackResponse.class);
    }

    /**
     *本接口（CheckDataEngineImageCanBeUpgrade）用于查看集群镜像是否能够升级。
     * @param req CheckDataEngineImageCanBeUpgradeRequest
     * @return CheckDataEngineImageCanBeUpgradeResponse
     * @throws TencentCloudSDKException
     */
    public CheckDataEngineImageCanBeUpgradeResponse CheckDataEngineImageCanBeUpgrade(CheckDataEngineImageCanBeUpgradeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDataEngineImageCanBeUpgrade", CheckDataEngineImageCanBeUpgradeResponse.class);
    }

    /**
     *元数据锁检查
     * @param req CheckLockMetaDataRequest
     * @return CheckLockMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public CheckLockMetaDataResponse CheckLockMetaData(CheckLockMetaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckLockMetaData", CheckLockMetaDataResponse.class);
    }

    /**
     *DMS元数据创建库
     * @param req CreateDMSDatabaseRequest
     * @return CreateDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDMSDatabaseResponse CreateDMSDatabase(CreateDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDMSDatabase", CreateDMSDatabaseResponse.class);
    }

    /**
     *DMS元数据创建表
     * @param req CreateDMSTableRequest
     * @return CreateDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateDMSTableResponse CreateDMSTable(CreateDMSTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDMSTable", CreateDMSTableResponse.class);
    }

    /**
     *为用户创建数据引擎
     * @param req CreateDataEngineRequest
     * @return CreateDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataEngineResponse CreateDataEngine(CreateDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataEngine", CreateDataEngineResponse.class);
    }

    /**
     *本接口（CreateDatabase）用于生成建库SQL语句。
     * @param req CreateDatabaseRequest
     * @return CreateDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseResponse CreateDatabase(CreateDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatabase", CreateDatabaseResponse.class);
    }

    /**
     *该接口（CreateExportTask）用于创建导出任务
     * @param req CreateExportTaskRequest
     * @return CreateExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportTaskResponse CreateExportTask(CreateExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExportTask", CreateExportTaskResponse.class);
    }

    /**
     *该接口（CreateImportTask）用于创建导入任务
     * @param req CreateImportTaskRequest
     * @return CreateImportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateImportTaskResponse CreateImportTask(CreateImportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImportTask", CreateImportTaskResponse.class);
    }

    /**
     *创建托管存储内表（该接口已废弃）
     * @param req CreateInternalTableRequest
     * @return CreateInternalTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateInternalTableResponse CreateInternalTable(CreateInternalTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInternalTable", CreateInternalTableResponse.class);
    }

    /**
     *本接口（CreateNotebookSession）用于创建交互式session（notebook）
     * @param req CreateNotebookSessionRequest
     * @return CreateNotebookSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookSessionResponse CreateNotebookSession(CreateNotebookSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookSession", CreateNotebookSessionResponse.class);
    }

    /**
     *本接口（CreateNotebookSessionStatement）用于在session中执行代码片段
     * @param req CreateNotebookSessionStatementRequest
     * @return CreateNotebookSessionStatementResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookSessionStatementResponse CreateNotebookSessionStatement(CreateNotebookSessionStatementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookSessionStatement", CreateNotebookSessionStatementResponse.class);
    }

    /**
     *本接口（CreateNotebookSessionStatementSupportBatchSQL）用于创建交互式session并执行SQL任务
     * @param req CreateNotebookSessionStatementSupportBatchSQLRequest
     * @return CreateNotebookSessionStatementSupportBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookSessionStatementSupportBatchSQLResponse CreateNotebookSessionStatementSupportBatchSQL(CreateNotebookSessionStatementSupportBatchSQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookSessionStatementSupportBatchSQL", CreateNotebookSessionStatementSupportBatchSQLResponse.class);
    }

    /**
     *创建查询结果下载任务
     * @param req CreateResultDownloadRequest
     * @return CreateResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public CreateResultDownloadResponse CreateResultDownload(CreateResultDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateResultDownload", CreateResultDownloadResponse.class);
    }

    /**
     *该接口（CreateScript）用于创建sql脚本。
     * @param req CreateScriptRequest
     * @return CreateScriptResponse
     * @throws TencentCloudSDKException
     */
    public CreateScriptResponse CreateScript(CreateScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScript", CreateScriptResponse.class);
    }

    /**
     *创建spark作业
     * @param req CreateSparkAppRequest
     * @return CreateSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppResponse CreateSparkApp(CreateSparkAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkApp", CreateSparkAppResponse.class);
    }

    /**
     *启动Spark作业
     * @param req CreateSparkAppTaskRequest
     * @return CreateSparkAppTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkAppTaskResponse CreateSparkAppTask(CreateSparkAppTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkAppTask", CreateSparkAppTaskResponse.class);
    }

    /**
     *本接口（CreateSparkSessionBatchSQL）用于向Spark作业引擎提交Spark SQL批任务。
     * @param req CreateSparkSessionBatchSQLRequest
     * @return CreateSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkSessionBatchSQLResponse CreateSparkSessionBatchSQL(CreateSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkSessionBatchSQL", CreateSparkSessionBatchSQLResponse.class);
    }

    /**
     *该接口（CreateStoreLocation）新增或覆盖计算结果存储位置。
     * @param req CreateStoreLocationRequest
     * @return CreateStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public CreateStoreLocationResponse CreateStoreLocation(CreateStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStoreLocation", CreateStoreLocationResponse.class);
    }

    /**
     *本接口（CreateTable）用于生成建表SQL。
     * @param req CreateTableRequest
     * @return CreateTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableResponse CreateTable(CreateTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTable", CreateTableResponse.class);
    }

    /**
     *本接口（CreateTask）用于创建并执行SQL任务。（推荐使用CreateTasks接口）
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTask", CreateTaskResponse.class);
    }

    /**
     *本接口（CreateTasks），用于批量创建并执行SQL任务
     * @param req CreateTasksRequest
     * @return CreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksResponse CreateTasks(CreateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTasks", CreateTasksResponse.class);
    }

    /**
     *按顺序创建任务（已经废弃，后期不再维护，请使用接口CreateTasks）
     * @param req CreateTasksInOrderRequest
     * @return CreateTasksInOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksInOrderResponse CreateTasksInOrder(CreateTasksInOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTasksInOrder", CreateTasksInOrderResponse.class);
    }

    /**
     *创建用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *创建工作组
     * @param req CreateWorkGroupRequest
     * @return CreateWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkGroupResponse CreateWorkGroup(CreateWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkGroup", CreateWorkGroupResponse.class);
    }

    /**
     *删除数据引擎
     * @param req DeleteDataEngineRequest
     * @return DeleteDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataEngineResponse DeleteDataEngine(DeleteDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataEngine", DeleteDataEngineResponse.class);
    }

    /**
     *本接口（DeleteNotebookSession）用于删除交互式session（notebook）
     * @param req DeleteNotebookSessionRequest
     * @return DeleteNotebookSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookSessionResponse DeleteNotebookSession(DeleteNotebookSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotebookSession", DeleteNotebookSessionResponse.class);
    }

    /**
     *该接口（DeleteScript）用于删除sql脚本。
     * @param req DeleteScriptRequest
     * @return DeleteScriptResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScriptResponse DeleteScript(DeleteScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScript", DeleteScriptResponse.class);
    }

    /**
     *删除spark作业
     * @param req DeleteSparkAppRequest
     * @return DeleteSparkAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSparkAppResponse DeleteSparkApp(DeleteSparkAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSparkApp", DeleteSparkAppResponse.class);
    }

    /**
     *删除用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *从工作组中删除用户
     * @param req DeleteUsersFromWorkGroupRequest
     * @return DeleteUsersFromWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersFromWorkGroupResponse DeleteUsersFromWorkGroup(DeleteUsersFromWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsersFromWorkGroup", DeleteUsersFromWorkGroupResponse.class);
    }

    /**
     *删除工作组
     * @param req DeleteWorkGroupRequest
     * @return DeleteWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkGroupResponse DeleteWorkGroup(DeleteWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkGroup", DeleteWorkGroupResponse.class);
    }

    /**
     *查询sql查询界面高级设置
     * @param req DescribeAdvancedStoreLocationRequest
     * @return DescribeAdvancedStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdvancedStoreLocationResponse DescribeAdvancedStoreLocation(DescribeAdvancedStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdvancedStoreLocation", DescribeAdvancedStoreLocationResponse.class);
    }

    /**
     *DMS元数据获取库
     * @param req DescribeDMSDatabaseRequest
     * @return DescribeDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSDatabaseResponse DescribeDMSDatabase(DescribeDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDMSDatabase", DescribeDMSDatabaseResponse.class);
    }

    /**
     *DMS元数据获取分区
     * @param req DescribeDMSPartitionsRequest
     * @return DescribeDMSPartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSPartitionsResponse DescribeDMSPartitions(DescribeDMSPartitionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDMSPartitions", DescribeDMSPartitionsResponse.class);
    }

    /**
     *DMS元数据获取表
     * @param req DescribeDMSTableRequest
     * @return DescribeDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSTableResponse DescribeDMSTable(DescribeDMSTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDMSTable", DescribeDMSTableResponse.class);
    }

    /**
     *DMS元数据获取表列表
     * @param req DescribeDMSTablesRequest
     * @return DescribeDMSTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDMSTablesResponse DescribeDMSTables(DescribeDMSTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDMSTables", DescribeDMSTablesResponse.class);
    }

    /**
     *本接口根据名称用于获取数据引擎详细信息
     * @param req DescribeDataEngineRequest
     * @return DescribeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEngineResponse DescribeDataEngine(DescribeDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngine", DescribeDataEngineResponse.class);
    }

    /**
     *本接口（DescribeDataEngineImageVersions）用于获取独享集群大版本镜像列表。
     * @param req DescribeDataEngineImageVersionsRequest
     * @return DescribeDataEngineImageVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEngineImageVersionsResponse DescribeDataEngineImageVersions(DescribeDataEngineImageVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngineImageVersions", DescribeDataEngineImageVersionsResponse.class);
    }

    /**
     *本接口（DescribeDataEnginePythonSparkImages）用于获取PYSPARK镜像列表
     * @param req DescribeDataEnginePythonSparkImagesRequest
     * @return DescribeDataEnginePythonSparkImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginePythonSparkImagesResponse DescribeDataEnginePythonSparkImages(DescribeDataEnginePythonSparkImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEnginePythonSparkImages", DescribeDataEnginePythonSparkImagesResponse.class);
    }

    /**
     *本接口（DescribeDataEngines）用于查询DataEngines信息列表
     * @param req DescribeDataEnginesRequest
     * @return DescribeDataEnginesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginesResponse DescribeDataEngines(DescribeDataEnginesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngines", DescribeDataEnginesResponse.class);
    }

    /**
     *本接口（DescribeDatabases）用于查询数据库列表。
     * @param req DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabasesResponse DescribeDatabases(DescribeDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabases", DescribeDatabasesResponse.class);
    }

    /**
     *本接口（DescribeDatasourceConnection）用于查询数据源信息
     * @param req DescribeDatasourceConnectionRequest
     * @return DescribeDatasourceConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceConnectionResponse DescribeDatasourceConnection(DescribeDatasourceConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasourceConnection", DescribeDatasourceConnectionResponse.class);
    }

    /**
     *本接口根据引擎ID查询数据引擎资源使用情况
     * @param req DescribeEngineUsageInfoRequest
     * @return DescribeEngineUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEngineUsageInfoResponse DescribeEngineUsageInfo(DescribeEngineUsageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEngineUsageInfo", DescribeEngineUsageInfoResponse.class);
    }

    /**
     *本接口（DescribeForbiddenTablePro）用于查询被禁用的表属性列表（新）
     * @param req DescribeForbiddenTableProRequest
     * @return DescribeForbiddenTableProResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForbiddenTableProResponse DescribeForbiddenTablePro(DescribeForbiddenTableProRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForbiddenTablePro", DescribeForbiddenTableProResponse.class);
    }

    /**
     *查询托管存储指定目录的Summary
     * @param req DescribeLakeFsDirSummaryRequest
     * @return DescribeLakeFsDirSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsDirSummaryResponse DescribeLakeFsDirSummary(DescribeLakeFsDirSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLakeFsDirSummary", DescribeLakeFsDirSummaryResponse.class);
    }

    /**
     *查询用户的托管存储信息
     * @param req DescribeLakeFsInfoRequest
     * @return DescribeLakeFsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsInfoResponse DescribeLakeFsInfo(DescribeLakeFsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLakeFsInfo", DescribeLakeFsInfoResponse.class);
    }

    /**
     *获取LakeFs上task执行结果访问信息
     * @param req DescribeLakeFsTaskResultRequest
     * @return DescribeLakeFsTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLakeFsTaskResultResponse DescribeLakeFsTaskResult(DescribeLakeFsTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLakeFsTaskResult", DescribeLakeFsTaskResultResponse.class);
    }

    /**
     *本接口（DescribeNotebookSession）用于查询交互式 session详情信息
     * @param req DescribeNotebookSessionRequest
     * @return DescribeNotebookSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionResponse DescribeNotebookSession(DescribeNotebookSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSession", DescribeNotebookSessionResponse.class);
    }

    /**
     *本接口（DescribeNotebookSessionLog）用于查询交互式 session日志
     * @param req DescribeNotebookSessionLogRequest
     * @return DescribeNotebookSessionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionLogResponse DescribeNotebookSessionLog(DescribeNotebookSessionLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSessionLog", DescribeNotebookSessionLogResponse.class);
    }

    /**
     *本接口（DescribeNotebookSessionStatement）用于查询session 中执行任务的详情
     * @param req DescribeNotebookSessionStatementRequest
     * @return DescribeNotebookSessionStatementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionStatementResponse DescribeNotebookSessionStatement(DescribeNotebookSessionStatementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSessionStatement", DescribeNotebookSessionStatementResponse.class);
    }

    /**
     *本接口（DescribeNotebookSessionStatementSqlResult）用于获取statement运行结果。
     * @param req DescribeNotebookSessionStatementSqlResultRequest
     * @return DescribeNotebookSessionStatementSqlResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionStatementSqlResultResponse DescribeNotebookSessionStatementSqlResult(DescribeNotebookSessionStatementSqlResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSessionStatementSqlResult", DescribeNotebookSessionStatementSqlResultResponse.class);
    }

    /**
     *本接口（DescribeNotebookSessionStatements）用于查询Session中执行的任务列表
     * @param req DescribeNotebookSessionStatementsRequest
     * @return DescribeNotebookSessionStatementsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionStatementsResponse DescribeNotebookSessionStatements(DescribeNotebookSessionStatementsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSessionStatements", DescribeNotebookSessionStatementsResponse.class);
    }

    /**
     *本接口（DescribeNotebookSessions）用于查询交互式 session列表
     * @param req DescribeNotebookSessionsRequest
     * @return DescribeNotebookSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookSessionsResponse DescribeNotebookSessions(DescribeNotebookSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookSessions", DescribeNotebookSessionsResponse.class);
    }

    /**
     *查询结果下载任务
     * @param req DescribeResultDownloadRequest
     * @return DescribeResultDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResultDownloadResponse DescribeResultDownload(DescribeResultDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResultDownload", DescribeResultDownloadResponse.class);
    }

    /**
     *该接口（DescribeScripts）用于查询SQL脚本列表
     * @param req DescribeScriptsRequest
     * @return DescribeScriptsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScriptsResponse DescribeScripts(DescribeScriptsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScripts", DescribeScriptsResponse.class);
    }

    /**
     *查询spark作业信息
     * @param req DescribeSparkAppJobRequest
     * @return DescribeSparkAppJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobResponse DescribeSparkAppJob(DescribeSparkAppJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkAppJob", DescribeSparkAppJobResponse.class);
    }

    /**
     *查询spark作业列表
     * @param req DescribeSparkAppJobsRequest
     * @return DescribeSparkAppJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppJobsResponse DescribeSparkAppJobs(DescribeSparkAppJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkAppJobs", DescribeSparkAppJobsResponse.class);
    }

    /**
     *查询Spark作业的运行任务列表
     * @param req DescribeSparkAppTasksRequest
     * @return DescribeSparkAppTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkAppTasksResponse DescribeSparkAppTasks(DescribeSparkAppTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkAppTasks", DescribeSparkAppTasksResponse.class);
    }

    /**
     *本接口（DescribeSparkSessionBatchSQL）用于查询Spark SQL批任务运行状态
     * @param req DescribeSparkSessionBatchSQLRequest
     * @return DescribeSparkSessionBatchSQLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkSessionBatchSQLResponse DescribeSparkSessionBatchSQL(DescribeSparkSessionBatchSQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkSessionBatchSQL", DescribeSparkSessionBatchSQLResponse.class);
    }

    /**
     *本接口（DescribeSparkSessionBatchSqlLog）用于查询Spark SQL批任务日志
     * @param req DescribeSparkSessionBatchSqlLogRequest
     * @return DescribeSparkSessionBatchSqlLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkSessionBatchSqlLogResponse DescribeSparkSessionBatchSqlLog(DescribeSparkSessionBatchSqlLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkSessionBatchSqlLog", DescribeSparkSessionBatchSqlLogResponse.class);
    }

    /**
     *查询计算结果存储位置。
     * @param req DescribeStoreLocationRequest
     * @return DescribeStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStoreLocationResponse DescribeStoreLocation(DescribeStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStoreLocation", DescribeStoreLocationResponse.class);
    }

    /**
     *本接口（DescribeTable），用于查询单个表的详细信息。
     * @param req DescribeTableRequest
     * @return DescribeTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableResponse DescribeTable(DescribeTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTable", DescribeTableResponse.class);
    }

    /**
     *本接口（DescribeTables）用于查询数据表列表。
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *查询任务结果
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
    }

    /**
     *该接口（DescribleTasks）用于查询任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *查询用户自定义引擎参数
     * @param req DescribeUserDataEngineConfigRequest
     * @return DescribeUserDataEngineConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDataEngineConfigResponse DescribeUserDataEngineConfig(DescribeUserDataEngineConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDataEngineConfig", DescribeUserDataEngineConfigResponse.class);
    }

    /**
     *获取用户详细信息
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserInfo", DescribeUserInfoResponse.class);
    }

    /**
     *列举用户角色信息
     * @param req DescribeUserRolesRequest
     * @return DescribeUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRolesResponse DescribeUserRoles(DescribeUserRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserRoles", DescribeUserRolesResponse.class);
    }

    /**
     *获取用户类型
     * @param req DescribeUserTypeRequest
     * @return DescribeUserTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserTypeResponse DescribeUserType(DescribeUserTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserType", DescribeUserTypeResponse.class);
    }

    /**
     *获取用户列表信息
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsers", DescribeUsersResponse.class);
    }

    /**
     *本接口（DescribeViews）用于查询数据视图列表。
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeViews", DescribeViewsResponse.class);
    }

    /**
     *获取工作组详细信息
     * @param req DescribeWorkGroupInfoRequest
     * @return DescribeWorkGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkGroupInfoResponse DescribeWorkGroupInfo(DescribeWorkGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkGroupInfo", DescribeWorkGroupInfoResponse.class);
    }

    /**
     *获取工作组列表
     * @param req DescribeWorkGroupsRequest
     * @return DescribeWorkGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkGroupsResponse DescribeWorkGroups(DescribeWorkGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkGroups", DescribeWorkGroupsResponse.class);
    }

    /**
     *解绑用户鉴权策略
     * @param req DetachUserPolicyRequest
     * @return DetachUserPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachUserPolicyResponse DetachUserPolicy(DetachUserPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachUserPolicy", DetachUserPolicyResponse.class);
    }

    /**
     *解绑工作组鉴权策略
     * @param req DetachWorkGroupPolicyRequest
     * @return DetachWorkGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DetachWorkGroupPolicyResponse DetachWorkGroupPolicy(DetachWorkGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachWorkGroupPolicy", DetachWorkGroupPolicyResponse.class);
    }

    /**
     *DMS元数据删除库
     * @param req DropDMSDatabaseRequest
     * @return DropDMSDatabaseResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSDatabaseResponse DropDMSDatabase(DropDMSDatabaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDMSDatabase", DropDMSDatabaseResponse.class);
    }

    /**
     *DMS元数据删除分区
     * @param req DropDMSPartitionsRequest
     * @return DropDMSPartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSPartitionsResponse DropDMSPartitions(DropDMSPartitionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDMSPartitions", DropDMSPartitionsResponse.class);
    }

    /**
     *DMS元数据删除表
     * @param req DropDMSTableRequest
     * @return DropDMSTableResponse
     * @throws TencentCloudSDKException
     */
    public DropDMSTableResponse DropDMSTable(DropDMSTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DropDMSTable", DropDMSTableResponse.class);
    }

    /**
     *生成创建托管表语句
     * @param req GenerateCreateMangedTableSqlRequest
     * @return GenerateCreateMangedTableSqlResponse
     * @throws TencentCloudSDKException
     */
    public GenerateCreateMangedTableSqlResponse GenerateCreateMangedTableSql(GenerateCreateMangedTableSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateCreateMangedTableSql", GenerateCreateMangedTableSqlResponse.class);
    }

    /**
     *GetOptimizerPolicy
     * @param req GetOptimizerPolicyRequest
     * @return GetOptimizerPolicyResponse
     * @throws TencentCloudSDKException
     */
    public GetOptimizerPolicyResponse GetOptimizerPolicy(GetOptimizerPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOptimizerPolicy", GetOptimizerPolicyResponse.class);
    }

    /**
     *本接口（ListTaskJobLogDetail）用于获取spark 作业任务日志详情
     * @param req ListTaskJobLogDetailRequest
     * @return ListTaskJobLogDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskJobLogDetailResponse ListTaskJobLogDetail(ListTaskJobLogDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskJobLogDetail", ListTaskJobLogDetailResponse.class);
    }

    /**
     *元数据锁
     * @param req LockMetaDataRequest
     * @return LockMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public LockMetaDataResponse LockMetaData(LockMetaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LockMetaData", LockMetaDataResponse.class);
    }

    /**
     *修改sql查询界面高级设置。
     * @param req ModifyAdvancedStoreLocationRequest
     * @return ModifyAdvancedStoreLocationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAdvancedStoreLocationResponse ModifyAdvancedStoreLocation(ModifyAdvancedStoreLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAdvancedStoreLocation", ModifyAdvancedStoreLocationResponse.class);
    }

    /**
     *修改引擎描述信息
     * @param req ModifyDataEngineDescriptionRequest
     * @return ModifyDataEngineDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataEngineDescriptionResponse ModifyDataEngineDescription(ModifyDataEngineDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataEngineDescription", ModifyDataEngineDescriptionResponse.class);
    }

    /**
     *修改数据治理事件阈值
     * @param req ModifyGovernEventRuleRequest
     * @return ModifyGovernEventRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernEventRuleResponse ModifyGovernEventRule(ModifyGovernEventRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernEventRule", ModifyGovernEventRuleResponse.class);
    }

    /**
     *更新spark作业
     * @param req ModifySparkAppRequest
     * @return ModifySparkAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppResponse ModifySparkApp(ModifySparkAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySparkApp", ModifySparkAppResponse.class);
    }

    /**
     *本接口（ModifySparkAppBatch）用于批量修改Spark作业参数配置
     * @param req ModifySparkAppBatchRequest
     * @return ModifySparkAppBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifySparkAppBatchResponse ModifySparkAppBatch(ModifySparkAppBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySparkAppBatch", ModifySparkAppBatchResponse.class);
    }

    /**
     *修改用户信息
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *修改用户类型。只有管理员用户能够调用该接口进行操作
     * @param req ModifyUserTypeRequest
     * @return ModifyUserTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserTypeResponse ModifyUserType(ModifyUserTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserType", ModifyUserTypeResponse.class);
    }

    /**
     *修改工作组信息
     * @param req ModifyWorkGroupRequest
     * @return ModifyWorkGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkGroupResponse ModifyWorkGroup(ModifyWorkGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkGroup", ModifyWorkGroupResponse.class);
    }

    /**
     *获取任务结果查询
     * @param req QueryResultRequest
     * @return QueryResultResponse
     * @throws TencentCloudSDKException
     */
    public QueryResultResponse QueryResult(QueryResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryResult", QueryResultResponse.class);
    }

    /**
     *续费数据引擎
     * @param req RenewDataEngineRequest
     * @return RenewDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public RenewDataEngineResponse RenewDataEngine(RenewDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDataEngine", RenewDataEngineResponse.class);
    }

    /**
     *上报元数据心跳
     * @param req ReportHeartbeatMetaDataRequest
     * @return ReportHeartbeatMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public ReportHeartbeatMetaDataResponse ReportHeartbeatMetaData(ReportHeartbeatMetaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportHeartbeatMetaData", ReportHeartbeatMetaDataResponse.class);
    }

    /**
     *重启引擎
     * @param req RestartDataEngineRequest
     * @return RestartDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public RestartDataEngineResponse RestartDataEngine(RestartDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartDataEngine", RestartDataEngineResponse.class);
    }

    /**
     *回滚引擎镜像版本
     * @param req RollbackDataEngineImageRequest
     * @return RollbackDataEngineImageResponse
     * @throws TencentCloudSDKException
     */
    public RollbackDataEngineImageResponse RollbackDataEngineImage(RollbackDataEngineImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackDataEngineImage", RollbackDataEngineImageResponse.class);
    }

    /**
     *本接口用于控制挂起或启动数据引擎
     * @param req SuspendResumeDataEngineRequest
     * @return SuspendResumeDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SuspendResumeDataEngineResponse SuspendResumeDataEngine(SuspendResumeDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SuspendResumeDataEngine", SuspendResumeDataEngineResponse.class);
    }

    /**
     *切换主备集群
     * @param req SwitchDataEngineRequest
     * @return SwitchDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDataEngineResponse SwitchDataEngine(SwitchDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDataEngine", SwitchDataEngineResponse.class);
    }

    /**
     *切换引擎镜像版本
     * @param req SwitchDataEngineImageRequest
     * @return SwitchDataEngineImageResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDataEngineImageResponse SwitchDataEngineImage(SwitchDataEngineImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchDataEngineImage", SwitchDataEngineImageResponse.class);
    }

    /**
     *解绑用户上的用户组
     * @param req UnbindWorkGroupsFromUserRequest
     * @return UnbindWorkGroupsFromUserResponse
     * @throws TencentCloudSDKException
     */
    public UnbindWorkGroupsFromUserResponse UnbindWorkGroupsFromUser(UnbindWorkGroupsFromUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindWorkGroupsFromUser", UnbindWorkGroupsFromUserResponse.class);
    }

    /**
     *元数据解锁
     * @param req UnlockMetaDataRequest
     * @return UnlockMetaDataResponse
     * @throws TencentCloudSDKException
     */
    public UnlockMetaDataResponse UnlockMetaData(UnlockMetaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnlockMetaData", UnlockMetaDataResponse.class);
    }

    /**
     *本接口用于更新数据引擎配置
     * @param req UpdateDataEngineRequest
     * @return UpdateDataEngineResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataEngineResponse UpdateDataEngine(UpdateDataEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataEngine", UpdateDataEngineResponse.class);
    }

    /**
     *用户某种操作，触发引擎配置修改
     * @param req UpdateDataEngineConfigRequest
     * @return UpdateDataEngineConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataEngineConfigResponse UpdateDataEngineConfig(UpdateDataEngineConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataEngineConfig", UpdateDataEngineConfigResponse.class);
    }

    /**
     *此接口用于更新行过滤规则。注意只能更新过滤规则，不能更新规格对象catalog，database和table。
     * @param req UpdateRowFilterRequest
     * @return UpdateRowFilterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRowFilterResponse UpdateRowFilter(UpdateRowFilterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRowFilter", UpdateRowFilterResponse.class);
    }

    /**
     *修改用户引擎自定义配置
     * @param req UpdateUserDataEngineConfigRequest
     * @return UpdateUserDataEngineConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserDataEngineConfigResponse UpdateUserDataEngineConfig(UpdateUserDataEngineConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserDataEngineConfig", UpdateUserDataEngineConfigResponse.class);
    }

    /**
     *升级引擎镜像
     * @param req UpgradeDataEngineImageRequest
     * @return UpgradeDataEngineImageResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDataEngineImageResponse UpgradeDataEngineImage(UpgradeDataEngineImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDataEngineImage", UpgradeDataEngineImageResponse.class);
    }

}
