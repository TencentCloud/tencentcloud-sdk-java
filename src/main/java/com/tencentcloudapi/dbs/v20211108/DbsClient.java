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
package com.tencentcloudapi.dbs.v20211108;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbs.v20211108.models.*;

public class DbsClient extends AbstractClient{
    private static String endpoint = "dbs.tencentcloudapi.com";
    private static String service = "dbs";
    private static String version = "2021-11-08";

    public DbsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbsClient(Credential credential, String region, ClientProfile profile) {
        super(DbsClient.endpoint, DbsClient.version, credential, region, profile);
    }

    /**
     *本接口（ConfigureBackupPlan）用于配置备份计划。包括配置备份源实例信息、备份对象以及备份策略等。
     * @param req ConfigureBackupPlanRequest
     * @return ConfigureBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureBackupPlanResponse ConfigureBackupPlan(ConfigureBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureBackupPlan", ConfigureBackupPlanResponse.class);
    }

    /**
     *该接口用于创建备份计划。
     * @param req CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupPlanResponse CreateBackupPlan(CreateBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupPlan", CreateBackupPlanResponse.class);
    }

    /**
     *该接口用于创建连通性检测任务，请在创建备份计划前，通过该接口来检测你的源端实例是否连通性正常。
     * @param req CreateConnectTestJobRequest
     * @return CreateConnectTestJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateConnectTestJobResponse CreateConnectTestJob(CreateConnectTestJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConnectTestJob", CreateConnectTestJobResponse.class);
    }

    /**
     *删除备份计划。

仅已下线的备份计划支持删除，删除后不可恢复。已隔离（isolated）的备份计划请先调用 DestroyBackupPlanByUser 完成下线，再进行删除。调用接口后，若通过 DescribeBackupPlans 接口查询不到对应的备份计划，则表示删除成功。
     * @param req DeleteBackupPlanRequest
     * @return DeleteBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupPlanResponse DeleteBackupPlan(DeleteBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupPlan", DeleteBackupPlanResponse.class);
    }

    /**
     *本接口（DescribeBackupCheckJob）用于查询备份计划预校验任务的结果。仅对于预校验通过的任务，才能启动备份计划。
     * @param req DescribeBackupCheckJobRequest
     * @return DescribeBackupCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupCheckJobResponse DescribeBackupCheckJob(DescribeBackupCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupCheckJob", DescribeBackupCheckJobResponse.class);
    }

    /**
     *查询备份计划详情。
返回备份计划的基本信息、源库信息、备份对象、备份策略、备份进度和付费信息。
     * @param req DescribeBackupPlanDetailRequest
     * @return DescribeBackupPlanDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupPlanDetailResponse DescribeBackupPlanDetail(DescribeBackupPlanDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupPlanDetail", DescribeBackupPlanDetailResponse.class);
    }

    /**
     *本接口（DescribeBackupPlans）用于查询备份计划列表。
     * @param req DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupPlansResponse DescribeBackupPlans(DescribeBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupPlans", DescribeBackupPlansResponse.class);
    }

    /**
     *该接口用于查询连通性检测任务的结果
     * @param req DescribeConnectTestResultRequest
     * @return DescribeConnectTestResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectTestResultResponse DescribeConnectTestResult(DescribeConnectTestResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConnectTestResult", DescribeConnectTestResultResponse.class);
    }

    /**
     *查询全量备份集详情。

返回全量备份集的基本信息、源库信息、备份对象、备份进度和加密信息。
     * @param req DescribeFullBackupSetDetailRequest
     * @return DescribeFullBackupSetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFullBackupSetDetailResponse DescribeFullBackupSetDetail(DescribeFullBackupSetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFullBackupSetDetail", DescribeFullBackupSetDetailResponse.class);
    }

    /**
     *查询增量备份集文件列表。

文件按最后修改时间倒序返回，支持分页。
     * @param req DescribeIncrementBackupSetFilesRequest
     * @return DescribeIncrementBackupSetFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementBackupSetFilesResponse DescribeIncrementBackupSetFiles(DescribeIncrementBackupSetFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIncrementBackupSetFiles", DescribeIncrementBackupSetFilesResponse.class);
    }

    /**
     *本接口（DescribeIncrementBackupSets）用于查询增量备份集列表。
     * @param req DescribeIncrementBackupSetsRequest
     * @return DescribeIncrementBackupSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIncrementBackupSetsResponse DescribeIncrementBackupSets(DescribeIncrementBackupSetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIncrementBackupSets", DescribeIncrementBackupSetsResponse.class);
    }

    /**
     *立即下线已隔离的备份计划。

下线后备份计划不可恢复。调用接口后，若通过 DescribeBackupPlanDetail 接口查询到备份计划状态为 offlined，则表示下线成功。
     * @param req DestroyBackupPlanByUserRequest
     * @return DestroyBackupPlanByUserResponse
     * @throws TencentCloudSDKException
     */
    public DestroyBackupPlanByUserResponse DestroyBackupPlanByUser(DestroyBackupPlanByUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyBackupPlanByUser", DestroyBackupPlanByUserResponse.class);
    }

    /**
     *本接口（ModifyBackupPlanSourceInfo）用于修改备份计划的源实例信息、备份对象信息等。注意，调用该接口后，原有备份计划任务将立即停止，您可以在修改完源信息后重新启动备份任务。
     * @param req ModifyBackupPlanSourceInfoRequest
     * @return ModifyBackupPlanSourceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupPlanSourceInfoResponse ModifyBackupPlanSourceInfo(ModifyBackupPlanSourceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupPlanSourceInfo", ModifyBackupPlanSourceInfoResponse.class);
    }

    /**
     *恢复已暂停的备份计划。

仅已暂停的备份计划支持恢复。调用接口后，若通过 DescribeBackupPlanDetail 接口查询到备份计划状态为 running，则表示恢复成功。
     * @param req ResumeBackupPlanRequest
     * @return ResumeBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public ResumeBackupPlanResponse ResumeBackupPlan(ResumeBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeBackupPlan", ResumeBackupPlanResponse.class);
    }

    /**
     *本接口（StartBackupCheckJob）用于创建备份计划预校验任务。
     * @param req StartBackupCheckJobRequest
     * @return StartBackupCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public StartBackupCheckJobResponse StartBackupCheckJob(StartBackupCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBackupCheckJob", StartBackupCheckJobResponse.class);
    }

    /**
     *本接口（StartBackupPlan）用于启动备份计划。调用此接口前，请务必先使用 StartBackupCheckJob 创建备份计划预校验任务，并通过 DescribeBackupCheckJob 接口查询到任务状态为校验通过时，才能启动备份计划。
     * @param req StartBackupPlanRequest
     * @return StartBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public StartBackupPlanResponse StartBackupPlan(StartBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBackupPlan", StartBackupPlanResponse.class);
    }

    /**
     *暂停备份计划。

仅运行中的备份计划支持暂停。调用接口后，若通过 DescribeBackupPlanDetail 接口查询到备份计划状态为 paused，则表示暂停成功。
     * @param req StopBackupPlanRequest
     * @return StopBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public StopBackupPlanResponse StopBackupPlan(StopBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBackupPlan", StopBackupPlanResponse.class);
    }

}
