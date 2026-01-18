/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
     *添加数据优化资源
     * @param req AddOptimizerEnginesRequest
     * @return AddOptimizerEnginesResponse
     * @throws TencentCloudSDKException
     */
    public AddOptimizerEnginesResponse AddOptimizerEngines(AddOptimizerEnginesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOptimizerEngines", AddOptimizerEnginesResponse.class);
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
     *分配原生表表属性
     * @param req AssignMangedTablePropertiesRequest
     * @return AssignMangedTablePropertiesResponse
     * @throws TencentCloudSDKException
     */
    public AssignMangedTablePropertiesResponse AssignMangedTableProperties(AssignMangedTablePropertiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignMangedTableProperties", AssignMangedTablePropertiesResponse.class);
    }

    /**
     *绑定数据源和队列
     * @param req AssociateDatasourceHouseRequest
     * @return AssociateDatasourceHouseResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDatasourceHouseResponse AssociateDatasourceHouse(AssociateDatasourceHouseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateDatasourceHouse", AssociateDatasourceHouseResponse.class);
    }

    /**
     *绑定数据脱敏策略
     * @param req AttachDataMaskPolicyRequest
     * @return AttachDataMaskPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AttachDataMaskPolicyResponse AttachDataMaskPolicy(AttachDataMaskPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDataMaskPolicy", AttachDataMaskPolicyResponse.class);
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
     *批量取消任务
     * @param req CancelTasksRequest
     * @return CancelTasksResponse
     * @throws TencentCloudSDKException
     */
    public CancelTasksResponse CancelTasks(CancelTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelTasks", CancelTasksResponse.class);
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
     *此接口（CreateCHDFSBindingProduct）用于创建元数据加速桶和产品绑定关系
     * @param req CreateCHDFSBindingProductRequest
     * @return CreateCHDFSBindingProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateCHDFSBindingProductResponse CreateCHDFSBindingProduct(CreateCHDFSBindingProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCHDFSBindingProduct", CreateCHDFSBindingProductResponse.class);
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
     *创建数据脱敏策略
     * @param req CreateDataMaskStrategyRequest
     * @return CreateDataMaskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataMaskStrategyResponse CreateDataMaskStrategy(CreateDataMaskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataMaskStrategy", CreateDataMaskStrategyResponse.class);
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
     *创建数据源
     * @param req CreateDatasourceConnectionRequest
     * @return CreateDatasourceConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasourceConnectionResponse CreateDatasourceConnection(CreateDatasourceConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatasourceConnection", CreateDatasourceConnectionResponse.class);
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
     *本接口（CreateSparkSubmitTask）用于提交SparkSbumit批流任务。
     * @param req CreateSparkSubmitTaskRequest
     * @return CreateSparkSubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSparkSubmitTaskResponse CreateSparkSubmitTask(CreateSparkSubmitTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSparkSubmitTask", CreateSparkSubmitTaskResponse.class);
    }

    /**
     *创建标准引擎资源组
     * @param req CreateStandardEngineResourceGroupRequest
     * @return CreateStandardEngineResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateStandardEngineResourceGroupResponse CreateStandardEngineResourceGroup(CreateStandardEngineResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStandardEngineResourceGroup", CreateStandardEngineResourceGroupResponse.class);
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
     *废弃接口，申请下线

按顺序创建任务（已经废弃，后期不再维护，请使用接口CreateTasks）
     * @param req CreateTasksInOrderRequest
     * @return CreateTasksInOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateTasksInOrderResponse CreateTasksInOrder(CreateTasksInOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTasksInOrder", CreateTasksInOrderResponse.class);
    }

    /**
     *创建TIceberg表
     * @param req CreateTcIcebergTableRequest
     * @return CreateTcIcebergTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateTcIcebergTableResponse CreateTcIcebergTable(CreateTcIcebergTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTcIcebergTable", CreateTcIcebergTableResponse.class);
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
     *创建用户vpc连接到指定引擎网络
     * @param req CreateUserVpcConnectionRequest
     * @return CreateUserVpcConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserVpcConnectionResponse CreateUserVpcConnection(CreateUserVpcConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserVpcConnection", CreateUserVpcConnectionResponse.class);
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
     *此接口（DeleteCHDFSBindingProduct）用于删除元数据加速桶和产品绑定关系
     * @param req DeleteCHDFSBindingProductRequest
     * @return DeleteCHDFSBindingProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCHDFSBindingProductResponse DeleteCHDFSBindingProduct(DeleteCHDFSBindingProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCHDFSBindingProduct", DeleteCHDFSBindingProductResponse.class);
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
     *删除数据脱敏策略
     * @param req DeleteDataMaskStrategyRequest
     * @return DeleteDataMaskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataMaskStrategyResponse DeleteDataMaskStrategy(DeleteDataMaskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataMaskStrategy", DeleteDataMaskStrategyResponse.class);
    }

    /**
     *根据spark session名称销毁eg spark session
     * @param req DeleteNativeSparkSessionRequest
     * @return DeleteNativeSparkSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNativeSparkSessionResponse DeleteNativeSparkSession(DeleteNativeSparkSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNativeSparkSession", DeleteNativeSparkSessionResponse.class);
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
     *删除标准引擎资源组
     * @param req DeleteStandardEngineResourceGroupRequest
     * @return DeleteStandardEngineResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStandardEngineResourceGroupResponse DeleteStandardEngineResourceGroup(DeleteStandardEngineResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStandardEngineResourceGroup", DeleteStandardEngineResourceGroupResponse.class);
    }

    /**
     *删除表
     * @param req DeleteTableRequest
     * @return DeleteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableResponse DeleteTable(DeleteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTable", DeleteTableResponse.class);
    }

    /**
     *本接口（RegisterThirdPartyAccessUser）用于移除第三方平台访问
     * @param req DeleteThirdPartyAccessUserRequest
     * @return DeleteThirdPartyAccessUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteThirdPartyAccessUserResponse DeleteThirdPartyAccessUser(DeleteThirdPartyAccessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteThirdPartyAccessUser", DeleteThirdPartyAccessUserResponse.class);
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
     *删除用户vpc到引擎网络的连接
     * @param req DeleteUserVpcConnectionRequest
     * @return DeleteUserVpcConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserVpcConnectionResponse DeleteUserVpcConnection(DeleteUserVpcConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserVpcConnection", DeleteUserVpcConnectionResponse.class);
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
     *查询任务监控指标信息
     * @param req DescribeClusterMonitorInfosRequest
     * @return DescribeClusterMonitorInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterMonitorInfosResponse DescribeClusterMonitorInfos(DescribeClusterMonitorInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterMonitorInfos", DescribeClusterMonitorInfosResponse.class);
    }

    /**
     *查询DLC Catalog授权列表
     * @param req DescribeDLCCatalogAccessRequest
     * @return DescribeDLCCatalogAccessResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDLCCatalogAccessResponse DescribeDLCCatalogAccess(DescribeDLCCatalogAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDLCCatalogAccess", DescribeDLCCatalogAccessResponse.class);
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
     *查询数据引擎事件
     * @param req DescribeDataEngineEventsRequest
     * @return DescribeDataEngineEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEngineEventsResponse DescribeDataEngineEvents(DescribeDataEngineEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngineEvents", DescribeDataEngineEventsResponse.class);
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
     *本接口（DescribeDataEngineSessionParameters）用于获取指定小版本下的Session配置。
     * @param req DescribeDataEngineSessionParametersRequest
     * @return DescribeDataEngineSessionParametersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEngineSessionParametersResponse DescribeDataEngineSessionParameters(DescribeDataEngineSessionParametersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngineSessionParameters", DescribeDataEngineSessionParametersResponse.class);
    }

    /**
     *本接口（DescribeDataEngines）用于查询DataEngines信息列表.
     * @param req DescribeDataEnginesRequest
     * @return DescribeDataEnginesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginesResponse DescribeDataEngines(DescribeDataEnginesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEngines", DescribeDataEnginesResponse.class);
    }

    /**
     *查询引擎规格详情
     * @param req DescribeDataEnginesScaleDetailRequest
     * @return DescribeDataEnginesScaleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEnginesScaleDetailResponse DescribeDataEnginesScaleDetail(DescribeDataEnginesScaleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEnginesScaleDetail", DescribeDataEnginesScaleDetailResponse.class);
    }

    /**
     *查询数据脱敏列表接口
     * @param req DescribeDataMaskStrategiesRequest
     * @return DescribeDataMaskStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataMaskStrategiesResponse DescribeDataMaskStrategies(DescribeDataMaskStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataMaskStrategies", DescribeDataMaskStrategiesResponse.class);
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
     *查询引擎网络信息
     * @param req DescribeEngineNetworksRequest
     * @return DescribeEngineNetworksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEngineNetworksResponse DescribeEngineNetworks(DescribeEngineNetworksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEngineNetworks", DescribeEngineNetworksResponse.class);
    }

    /**
     *查询引擎可用的节点规格
     * @param req DescribeEngineNodeSpecRequest
     * @return DescribeEngineNodeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEngineNodeSpecResponse DescribeEngineNodeSpec(DescribeEngineNodeSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEngineNodeSpec", DescribeEngineNodeSpecResponse.class);
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
     *根据资源组获取spark session列表
     * @param req DescribeNativeSparkSessionsRequest
     * @return DescribeNativeSparkSessionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNativeSparkSessionsResponse DescribeNativeSparkSessions(DescribeNativeSparkSessionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNativeSparkSessions", DescribeNativeSparkSessionsResponse.class);
    }

    /**
     *查询网络配置列表
     * @param req DescribeNetworkConnectionsRequest
     * @return DescribeNetworkConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkConnectionsResponse DescribeNetworkConnections(DescribeNetworkConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkConnections", DescribeNetworkConnectionsResponse.class);
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
     *此接口（DescribeOtherCHDFSBindingList）用于查询其他产品元数据加速桶绑定列表
     * @param req DescribeOtherCHDFSBindingListRequest
     * @return DescribeOtherCHDFSBindingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtherCHDFSBindingListResponse DescribeOtherCHDFSBindingList(DescribeOtherCHDFSBindingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtherCHDFSBindingList", DescribeOtherCHDFSBindingListResponse.class);
    }

    /**
     *本接口根据资源组ID查询资源组CU使用情况
     * @param req DescribeResourceGroupUsageInfoRequest
     * @return DescribeResourceGroupUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupUsageInfoResponse DescribeResourceGroupUsageInfo(DescribeResourceGroupUsageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceGroupUsageInfo", DescribeResourceGroupUsageInfoResponse.class);
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
     *获取指定大版本下所有小版本的所有内置镜像
     * @param req DescribeSessionImageVersionRequest
     * @return DescribeSessionImageVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionImageVersionResponse DescribeSessionImageVersion(DescribeSessionImageVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionImageVersion", DescribeSessionImageVersionResponse.class);
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
     *本接口（DescribeSparkSessionBatchSQLCost）用于查询Spark SQL批任务消耗
     * @param req DescribeSparkSessionBatchSQLCostRequest
     * @return DescribeSparkSessionBatchSQLCostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkSessionBatchSQLCostResponse DescribeSparkSessionBatchSQLCost(DescribeSparkSessionBatchSQLCostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkSessionBatchSQLCost", DescribeSparkSessionBatchSQLCostResponse.class);
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
     *查询标准引擎资源组信息
     * @param req DescribeStandardEngineResourceGroupConfigInfoRequest
     * @return DescribeStandardEngineResourceGroupConfigInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandardEngineResourceGroupConfigInfoResponse DescribeStandardEngineResourceGroupConfigInfo(DescribeStandardEngineResourceGroupConfigInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStandardEngineResourceGroupConfigInfo", DescribeStandardEngineResourceGroupConfigInfoResponse.class);
    }

    /**
     *查询标准引擎资源组信息
     * @param req DescribeStandardEngineResourceGroupsRequest
     * @return DescribeStandardEngineResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandardEngineResourceGroupsResponse DescribeStandardEngineResourceGroups(DescribeStandardEngineResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStandardEngineResourceGroups", DescribeStandardEngineResourceGroupsResponse.class);
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
     *本接口（DescribeSubUserAccessPolicy）用于开通了第三方平台访问的用户，查询其子用户的访问策略
     * @param req DescribeSubUserAccessPolicyRequest
     * @return DescribeSubUserAccessPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubUserAccessPolicyResponse DescribeSubUserAccessPolicy(DescribeSubUserAccessPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubUserAccessPolicy", DescribeSubUserAccessPolicyResponse.class);
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
     *本接口（DescribeTablePartitions）用于查询数据表分区信息
     * @param req DescribeTablePartitionsRequest
     * @return DescribeTablePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablePartitionsResponse DescribeTablePartitions(DescribeTablePartitionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablePartitions", DescribeTablePartitionsResponse.class);
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
     *本接口（DescribeTables）用于查询数据表名称列表
     * @param req DescribeTablesNameRequest
     * @return DescribeTablesNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesNameResponse DescribeTablesName(DescribeTablesNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablesName", DescribeTablesNameResponse.class);
    }

    /**
     *该接口（DescribleTasks）用于查询任务列表
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskList", DescribeTaskListResponse.class);
    }

    /**
     *本接口（DescribeTaskLog）用于获取spark 作业任务日志详情
     * @param req DescribeTaskLogRequest
     * @return DescribeTaskLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogResponse DescribeTaskLog(DescribeTaskLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLog", DescribeTaskLogResponse.class);
    }

    /**
     *查询任务监控指标信息
     * @param req DescribeTaskMonitorInfosRequest
     * @return DescribeTaskMonitorInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskMonitorInfosResponse DescribeTaskMonitorInfos(DescribeTaskMonitorInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskMonitorInfos", DescribeTaskMonitorInfosResponse.class);
    }

    /**
     *返回任务洞察资源用量
     * @param req DescribeTaskResourceUsageRequest
     * @return DescribeTaskResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResourceUsageResponse DescribeTaskResourceUsage(DescribeTaskResourceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResourceUsage", DescribeTaskResourceUsageResponse.class);
    }

    /**
     *查询任务结果，仅支持30天以内的任务查询结果，且返回数据大小超过近50M会进行截断。
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
     *该接口用于洞察分析列表
     * @param req DescribeTasksAnalysisRequest
     * @return DescribeTasksAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksAnalysisResponse DescribeTasksAnalysis(DescribeTasksAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasksAnalysis", DescribeTasksAnalysisResponse.class);
    }

    /**
     *该接口（DescribeTasksCostInfo）用于查询任务消耗
     * @param req DescribeTasksCostInfoRequest
     * @return DescribeTasksCostInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksCostInfoResponse DescribeTasksCostInfo(DescribeTasksCostInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasksCostInfo", DescribeTasksCostInfoResponse.class);
    }

    /**
     *查看任务概览页
     * @param req DescribeTasksOverviewRequest
     * @return DescribeTasksOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksOverviewResponse DescribeTasksOverview(DescribeTasksOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasksOverview", DescribeTasksOverviewResponse.class);
    }

    /**
     *本接口（RegisterThirdPartyAccessUser）查询开通第三方平台访问的用户信息
     * @param req DescribeThirdPartyAccessUserRequest
     * @return DescribeThirdPartyAccessUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdPartyAccessUserResponse DescribeThirdPartyAccessUser(DescribeThirdPartyAccessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeThirdPartyAccessUser", DescribeThirdPartyAccessUserResponse.class);
    }

    /**
     *获取UDF权限信息
     * @param req DescribeUDFPolicyRequest
     * @return DescribeUDFPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUDFPolicyResponse DescribeUDFPolicy(DescribeUDFPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUDFPolicy", DescribeUDFPolicyResponse.class);
    }

    /**
     *查询可更新配置的引擎列表
     * @param req DescribeUpdatableDataEnginesRequest
     * @return DescribeUpdatableDataEnginesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpdatableDataEnginesResponse DescribeUpdatableDataEngines(DescribeUpdatableDataEnginesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpdatableDataEngines", DescribeUpdatableDataEnginesResponse.class);
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
     *该接口（DescribeUserRegisterTime）用于查询当前用户注册时间，并判断是否是老用户。
     * @param req DescribeUserRegisterTimeRequest
     * @return DescribeUserRegisterTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserRegisterTimeResponse DescribeUserRegisterTime(DescribeUserRegisterTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserRegisterTime", DescribeUserRegisterTimeResponse.class);
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
     *查询用户vpc到引擎网络的连接
     * @param req DescribeUserVpcConnectionRequest
     * @return DescribeUserVpcConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserVpcConnectionResponse DescribeUserVpcConnection(DescribeUserVpcConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserVpcConnection", DescribeUserVpcConnectionResponse.class);
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
     *授权访问DLC Catalog
     * @param req GrantDLCCatalogAccessRequest
     * @return GrantDLCCatalogAccessResponse
     * @throws TencentCloudSDKException
     */
    public GrantDLCCatalogAccessResponse GrantDLCCatalogAccess(GrantDLCCatalogAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantDLCCatalogAccess", GrantDLCCatalogAccessResponse.class);
    }

    /**
     *启动标准引擎资源组
     * @param req LaunchStandardEngineResourceGroupsRequest
     * @return LaunchStandardEngineResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public LaunchStandardEngineResourceGroupsResponse LaunchStandardEngineResourceGroups(LaunchStandardEngineResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LaunchStandardEngineResourceGroups", LaunchStandardEngineResourceGroupsResponse.class);
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
     *本接口（ListTaskJobLogName）用于获取spark-jar日志名称列表
     * @param req ListTaskJobLogNameRequest
     * @return ListTaskJobLogNameResponse
     * @throws TencentCloudSDKException
     */
    public ListTaskJobLogNameResponse ListTaskJobLogName(ListTaskJobLogNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTaskJobLogName", ListTaskJobLogNameResponse.class);
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
     *暂停标准引擎session
     * @param req PauseStandardEngineResourceGroupsRequest
     * @return PauseStandardEngineResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public PauseStandardEngineResourceGroupsResponse PauseStandardEngineResourceGroups(PauseStandardEngineResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseStandardEngineResourceGroups", PauseStandardEngineResourceGroupsResponse.class);
    }

    /**
     *本接口（QueryInternalTableWarehouse）用于获取原生表warehouse路径
     * @param req QueryInternalTableWarehouseRequest
     * @return QueryInternalTableWarehouseResponse
     * @throws TencentCloudSDKException
     */
    public QueryInternalTableWarehouseResponse QueryInternalTableWarehouse(QueryInternalTableWarehouseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryInternalTableWarehouse", QueryInternalTableWarehouseResponse.class);
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
     *该接口（QueryTaskCostDetail）用于查询任务消耗明细
     * @param req QueryTaskCostDetailRequest
     * @return QueryTaskCostDetailResponse
     * @throws TencentCloudSDKException
     */
    public QueryTaskCostDetailResponse QueryTaskCostDetail(QueryTaskCostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryTaskCostDetail", QueryTaskCostDetailResponse.class);
    }

    /**
     *本接口（RegisterThirdPartyAccessUser）用于开通第三方平台访问
     * @param req RegisterThirdPartyAccessUserRequest
     * @return RegisterThirdPartyAccessUserResponse
     * @throws TencentCloudSDKException
     */
    public RegisterThirdPartyAccessUserResponse RegisterThirdPartyAccessUser(RegisterThirdPartyAccessUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterThirdPartyAccessUser", RegisterThirdPartyAccessUserResponse.class);
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
     *撤销DLC Catalog访问权限
     * @param req RevokeDLCCatalogAccessRequest
     * @return RevokeDLCCatalogAccessResponse
     * @throws TencentCloudSDKException
     */
    public RevokeDLCCatalogAccessResponse RevokeDLCCatalogAccess(RevokeDLCCatalogAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeDLCCatalogAccess", RevokeDLCCatalogAccessResponse.class);
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
     *设置优化策略的接口
     * @param req SetOptimizerPolicyRequest
     * @return SetOptimizerPolicyResponse
     * @throws TencentCloudSDKException
     */
    public SetOptimizerPolicyResponse SetOptimizerPolicy(SetOptimizerPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetOptimizerPolicy", SetOptimizerPolicyResponse.class);
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
     *解绑数据源与队列
     * @param req UnboundDatasourceHouseRequest
     * @return UnboundDatasourceHouseResponse
     * @throws TencentCloudSDKException
     */
    public UnboundDatasourceHouseResponse UnboundDatasourceHouse(UnboundDatasourceHouseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnboundDatasourceHouse", UnboundDatasourceHouseResponse.class);
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
     *更新数据脱敏策略
     * @param req UpdateDataMaskStrategyRequest
     * @return UpdateDataMaskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataMaskStrategyResponse UpdateDataMaskStrategy(UpdateDataMaskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataMaskStrategy", UpdateDataMaskStrategyResponse.class);
    }

    /**
     *更新标准引擎资源组网络配置信息
     * @param req UpdateEngineResourceGroupNetworkConfigInfoRequest
     * @return UpdateEngineResourceGroupNetworkConfigInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEngineResourceGroupNetworkConfigInfoResponse UpdateEngineResourceGroupNetworkConfigInfo(UpdateEngineResourceGroupNetworkConfigInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEngineResourceGroupNetworkConfigInfo", UpdateEngineResourceGroupNetworkConfigInfoResponse.class);
    }

    /**
     *更新网络配置
     * @param req UpdateNetworkConnectionRequest
     * @return UpdateNetworkConnectionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNetworkConnectionResponse UpdateNetworkConnection(UpdateNetworkConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNetworkConnection", UpdateNetworkConnectionResponse.class);
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
     *更新标准引擎资源组基础信息
     * @param req UpdateStandardEngineResourceGroupBaseInfoRequest
     * @return UpdateStandardEngineResourceGroupBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateStandardEngineResourceGroupBaseInfoResponse UpdateStandardEngineResourceGroupBaseInfo(UpdateStandardEngineResourceGroupBaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateStandardEngineResourceGroupBaseInfo", UpdateStandardEngineResourceGroupBaseInfoResponse.class);
    }

    /**
     *更新标准引擎资源组基础信息
     * @param req UpdateStandardEngineResourceGroupConfigInfoRequest
     * @return UpdateStandardEngineResourceGroupConfigInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateStandardEngineResourceGroupConfigInfoResponse UpdateStandardEngineResourceGroupConfigInfo(UpdateStandardEngineResourceGroupConfigInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateStandardEngineResourceGroupConfigInfo", UpdateStandardEngineResourceGroupConfigInfoResponse.class);
    }

    /**
     *更新标准引擎资源组基础信息
     * @param req UpdateStandardEngineResourceGroupResourceInfoRequest
     * @return UpdateStandardEngineResourceGroupResourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateStandardEngineResourceGroupResourceInfoResponse UpdateStandardEngineResourceGroupResourceInfo(UpdateStandardEngineResourceGroupResourceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateStandardEngineResourceGroupResourceInfo", UpdateStandardEngineResourceGroupResourceInfoResponse.class);
    }

    /**
     *UDP权限修改
     * @param req UpdateUDFPolicyRequest
     * @return UpdateUDFPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUDFPolicyResponse UpdateUDFPolicy(UpdateUDFPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUDFPolicy", UpdateUDFPolicyResponse.class);
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
