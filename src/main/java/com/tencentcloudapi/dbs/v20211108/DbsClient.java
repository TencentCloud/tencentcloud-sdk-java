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

}
