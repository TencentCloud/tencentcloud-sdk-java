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
package com.tencentcloudapi.dts.v20211206;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dts.v20211206.models.*;

public class DtsClient extends AbstractClient{
    private static String endpoint = "dts.tencentcloudapi.com";
    private static String service = "dts";
    private static String version = "2021-12-06";
    
    public DtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DtsClient(Credential credential, String region, ClientProfile profile) {
        super(DtsClient.endpoint, DtsClient.version, credential, region, profile);
    }

    /**
     *本接口（CompleteMigrateJob）用于完成数据迁移任务。
选择采用增量迁移方式的任务, 需要在迁移进度进入准备完成阶段后, 调用本接口, 停止迁移增量数据。
通过DescribeMigrationJobs接口查询到任务的状态为准备完成（Status="readyComplete"）时，此时可以调用本接口完成迁移任务。

     * @param req CompleteMigrateJobRequest
     * @return CompleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrateJobResponse CompleteMigrateJob(CompleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompleteMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置一个同步任务
     * @param req ConfigureSyncJobRequest
     * @return ConfigureSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureSyncJobResponse ConfigureSyncJob(ConfigureSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ConfigureSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ConfigureSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ConfigureSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复一个暂停中的迁移任务。
     * @param req ContinueMigrateJobRequest
     * @return ContinueMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueMigrateJobResponse ContinueMigrateJob(ContinueMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ContinueMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ContinueMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ContinueMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复处于已暂停状态的数据同步任务。
     * @param req ContinueSyncJobRequest
     * @return ContinueSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueSyncJobResponse ContinueSyncJob(ContinueSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ContinueSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ContinueSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ContinueSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验同步任务，检查必要参数和周边配置。
     * @param req CreateCheckSyncJobRequest
     * @return CreateCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckSyncJobResponse CreateCheckSyncJob(CreateCheckSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCheckSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCheckSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCheckSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建数据对比任务，创建成功后会返回数据对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，创建成功后可通过StartCompare启动一致性校验任务
     * @param req CreateCompareTaskRequest
     * @return CreateCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCompareTaskResponse CreateCompareTask(CreateCompareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCompareTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCompareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCompareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验迁移任务，
在开始迁移前, 必须调用本接口创建校验迁移任务, 且校验成功后才能开始迁移. 校验的结果可以通过DescribeMigrationCheckJob查看，
校验成功后,迁移任务若有修改, 则必须重新校验并通过后, 才能开始迁移

     * @param req CreateMigrateCheckJobRequest
     * @return CreateMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateCheckJobResponse CreateMigrateCheckJob(CreateMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateCheckJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMigrateCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *购买迁移任务。购买成功后会返回随机生成的迁移任务id列表，也可以通过查询迁移任务任务列表接口`DescribeMigrationJobs`看到购买成功的实例Id。注意，一旦购买成功后源及目标数据库类型，源及目标实例地域不可修改。
     * @param req CreateMigrationServiceRequest
     * @return CreateMigrationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationServiceResponse CreateMigrationService(CreateMigrationServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrationServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrationServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMigrationService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在修改同步任务的配置后、通过该接口校验当前任务是否支持修改对象操作
     * @param req CreateModifyCheckSyncJobRequest
     * @return CreateModifyCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateModifyCheckSyncJobResponse CreateModifyCheckSyncJob(CreateModifyCheckSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateModifyCheckSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateModifyCheckSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateModifyCheckSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个同步任务
     * @param req CreateSyncJobRequest
     * @return CreateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncJobResponse CreateSyncJob(CreateSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一致性校验任务。当一致性校验任务状态为success、failed、canceled 时可以执行此操作。
     * @param req DeleteCompareTaskRequest
     * @return DeleteCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompareTaskResponse DeleteCompareTask(DeleteCompareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCompareTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCompareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCompareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询同步校验任务结果，检查必要参数和周边配置
     * @param req DescribeCheckSyncJobResultRequest
     * @return DescribeCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSyncJobResultResponse DescribeCheckSyncJobResult(DescribeCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckSyncJobResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCheckSyncJobResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCheckSyncJobResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询一致性校验任务详情
     * @param req DescribeCompareReportRequest
     * @return DescribeCompareReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareReportResponse DescribeCompareReport(DescribeCompareReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompareReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompareReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompareReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询一致性校验任务列表，调用该接口后可通过接口`DescribeCompareTasks` 查询一致性校验任务列表来获得启动后的状态。
     * @param req DescribeCompareTasksRequest
     * @return DescribeCompareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareTasksResponse DescribeCompareTasks(DescribeCompareTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompareTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompareTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompareTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询支持迁移的云数据库实例
     * @param req DescribeMigrateDBInstancesRequest
     * @return DescribeMigrateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateDBInstancesResponse DescribeMigrateDBInstances(DescribeMigrateDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateDBInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrateDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建校验后,获取校验的结果. 能查询到当前校验的状态和进度. 
若通过校验, 则可调用'StartMigrateJob' 开始迁移.
若未通过校验, 则能查询到校验失败的原因. 请按照报错, 通过'ModifyMigrationJob'修改迁移配置或是调整源/目标实例的相关参数.
     * @param req DescribeMigrationCheckJobRequest
     * @return DescribeMigrationCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationCheckJobResponse DescribeMigrationCheckJob(DescribeMigrationCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationCheckJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationCheckJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationCheckJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某个迁移任务详情
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据迁移任务列表
     * @param req DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationJobsResponse DescribeMigrationJobs(DescribeMigrationJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMigrationJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在创建修改对象的校验任务后、通过该接口查看校验任务的结果
     * @param req DescribeModifyCheckSyncJobResultRequest
     * @return DescribeModifyCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyCheckSyncJobResultResponse DescribeModifyCheckSyncJobResult(DescribeModifyCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModifyCheckSyncJobResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModifyCheckSyncJobResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModifyCheckSyncJobResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询同步任务信息
     * @param req DescribeSyncJobsRequest
     * @return DescribeSyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncJobsResponse DescribeSyncJobs(DescribeSyncJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSyncJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSyncJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSyncJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下线数据迁移任务。计费任务必须先调用隔离(IsolateMigrateJob)接口，且只有是**已隔离**状态下，才能调用此接口销毁任务。对于不计费任务，调用隔离(IsolateMigrateJob)接口删除任务操作。
     * @param req DestroyMigrateJobRequest
     * @return DestroyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroyMigrateJobResponse DestroyMigrateJob(DestroyMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下线同步任务，任务在已隔离状态下可以通过此操作进行任务下线，即彻底删除任务。下线操作后可通过查询同步任务信息接口DescribeSyncJobs获取任务列表查看状态，此操作成功后无法看到此任务表示下线成功。
     * @param req DestroySyncJobRequest
     * @return DestroySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroySyncJobResponse DestroySyncJob(DestroySyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroySyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroySyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroySyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 隔离退还数据迁移服务。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。对于计费任务，在任务隔离后可进行解除隔离(RecoverMigrationJob)操作或直接进行下线销毁(DestroyMigrateJob)操作。对于不计费任务，调用此接口会直接销毁任务，无法进行恢复操作。
     * @param req IsolateMigrateJobRequest
     * @return IsolateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateMigrateJobResponse IsolateMigrateJob(IsolateMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *隔离同步任务，隔离后可通过查询同步任务信息接口DescribeSyncJobs获取隔离后状态。在任务隔离后可进行解除隔离(RecoverSyncJob)操作或直接进行下线操作。对于不计费任务，调用此接口后会直接删除任务，无法进行恢复操作。
     * @param req IsolateSyncJobRequest
     * @return IsolateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSyncJobResponse IsolateSyncJob(IsolateSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改一致性校验任务，在任务创建后启动之前，可修改一致性校验参数
     * @param req ModifyCompareTaskRequest
     * @return ModifyCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskResponse ModifyCompareTask(ModifyCompareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCompareTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCompareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCompareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改一致性校验任务名称
     * @param req ModifyCompareTaskNameRequest
     * @return ModifyCompareTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskNameResponse ModifyCompareTaskName(ModifyCompareTaskNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCompareTaskNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCompareTaskNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCompareTaskName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整实例规格，此接口只支持按量计费任务的调整。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req ModifyMigrateJobSpecRequest
     * @return ModifyMigrateJobSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobSpecResponse ModifyMigrateJobSpec(ModifyMigrateJobSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateJobSpecResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateJobSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrateJobSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改迁移任务名
     * @param req ModifyMigrateNameRequest
     * @return ModifyMigrateNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateNameResponse ModifyMigrateName(ModifyMigrateNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrateName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置迁移服务，配置成功后可通过`CreateMigrationCheckJob` 创建迁移校验任务接口发起校验任务，只有校验通过才能启动迁移任务。
     * @param req ModifyMigrationJobRequest
     * @return ModifyMigrationJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationJobResponse ModifyMigrationJob(ModifyMigrationJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMigrationJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口支持在同步任务启动后修改任务的配置
修改同步配置的完整流程：修改同步任务配置->创建修改同步任务配置的校验任务->查询修改配置的校验任务的结果->启动修改配置任务
     * @param req ModifySyncJobConfigRequest
     * @return ModifySyncJobConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncJobConfigResponse ModifySyncJobConfig(ModifySyncJobConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySyncJobConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySyncJobConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySyncJobConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停一个迁移任务。
     * @param req PauseMigrateJobRequest
     * @return PauseMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseMigrateJobResponse PauseMigrateJob(PauseMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PauseMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停处于同步中的数据同步任务。
     * @param req PauseSyncJobRequest
     * @return PauseSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseSyncJobResponse PauseSyncJob(PauseSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PauseSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PauseSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除隔离数据迁移任务，用户手动发起隔离后的手动解隔离，只有任务状态为已隔离(手动操作)状态下才能触发此操作。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req RecoverMigrateJobRequest
     * @return RecoverMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMigrateJobResponse RecoverMigrateJob(RecoverMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除隔离同步任务，任务在已隔离状态下可调用该接口解除隔离状态任务，同时可通过查询同步任务信息接口DescribeSyncJobs，获取操作后状态。
     * @param req RecoverSyncJobRequest
     * @return RecoverSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverSyncJobResponse RecoverSyncJob(RecoverSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整同步任务规格，此接口只支持按量计费任务的调整，调用此接口后不会立即生效，后台调整时间大概为3~5分钟。调用此接口后可通过查询同步任务信息接口DescribeSyncJobs，获取变配后的状态。
     * @param req ResizeSyncJobRequest
     * @return ResizeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResizeSyncJobResponse ResizeSyncJob(ResizeSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResizeSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重试数据迁移任务，针对异常情况可进行重试，对于redis在失败时也可重试。注意：此操作跳过校验阶段，直接重新发起任务，相当于从StartMigrationJob开始执行。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req ResumeMigrateJobRequest
     * @return ResumeMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeMigrateJobResponse ResumeMigrateJob(ResumeMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重试同步任务，部分可恢复报错情况下，可通过该接口重试同步任务，可通过查询同步任务信息接口DescribeSyncJobs，获取操作后状态。
     * @param req ResumeSyncJobRequest
     * @return ResumeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSyncJobResponse ResumeSyncJob(ResumeSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验检查项不通过后，可进行跳过此校验项操作，后端将不再校验该项。任何校验步骤都是不应该跳过的，通过校验是能正确执行的前置条件。支持跳过的产品及链路的校验项可 [参考文档](https://cloud.tencent.com/document/product/571/61639)。
     * @param req SkipCheckItemRequest
     * @return SkipCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipCheckItemResponse SkipCheckItem(SkipCheckItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SkipCheckItemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SkipCheckItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SkipCheckItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验检查项不通过后，可进行跳过此校验项操作，后端将不再校验该项。任何校验步骤都是不应该跳过的，通过校验是能正确执行的前置条件。支持跳过的产品及链路的校验项可 [参考文档](https://cloud.tencent.com/document/product/571/61639)。
     * @param req SkipSyncCheckItemRequest
     * @return SkipSyncCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipSyncCheckItemResponse SkipSyncCheckItem(SkipSyncCheckItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SkipSyncCheckItemResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SkipSyncCheckItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SkipSyncCheckItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动一致性校验任务，启动之前需要先通过接口`CreateCompareTask` 创建一致性校验任务，启动后可通过接口`DescribeCompareTasks` 查询一致性校验任务列表来获得启动后的状态
     * @param req StartCompareRequest
     * @return StartCompareResponse
     * @throws TencentCloudSDKException
     */
    public StartCompareResponse StartCompare(StartCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartCompareResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartMigrationJob）用于启动迁移任务。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在查询修改对象的校验任务的结果中的status为success后、通过该接口开始修改配置流程
     * @param req StartModifySyncJobRequest
     * @return StartModifySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartModifySyncJobResponse StartModifySyncJob(StartModifySyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartModifySyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartModifySyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartModifySyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动同步任务
     * @param req StartSyncJobRequest
     * @return StartSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartSyncJobResponse StartSyncJob(StartSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *终止一致性校验任务
     * @param req StopCompareRequest
     * @return StopCompareResponse
     * @throws TencentCloudSDKException
     */
    public StopCompareResponse StopCompare(StopCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopCompareResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopMigrateJob）用于终止数据迁移任务。
调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMigrateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopMigrateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopMigrateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *结束同步任务，操作后可通过查询同步任务信息接口DescribeSyncJobs，获取操作后的状态。
     * @param req StopSyncJobRequest
     * @return StopSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StopSyncJobResponse StopSyncJob(StopSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopSyncJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopSyncJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopSyncJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
