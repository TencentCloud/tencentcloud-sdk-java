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
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteMigrateJob", CompleteMigrateJobResponse.class);
    }

    /**
     *本接口(ConfigureSubscribeJob)用于配置数据订阅实例。
     * @param req ConfigureSubscribeJobRequest
     * @return ConfigureSubscribeJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureSubscribeJobResponse ConfigureSubscribeJob(ConfigureSubscribeJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureSubscribeJob", ConfigureSubscribeJobResponse.class);
    }

    /**
     *配置一个同步任务
     * @param req ConfigureSyncJobRequest
     * @return ConfigureSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureSyncJobResponse ConfigureSyncJob(ConfigureSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureSyncJob", ConfigureSyncJobResponse.class);
    }

    /**
     *恢复一个暂停中的迁移任务。
     * @param req ContinueMigrateJobRequest
     * @return ContinueMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueMigrateJobResponse ContinueMigrateJob(ContinueMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ContinueMigrateJob", ContinueMigrateJobResponse.class);
    }

    /**
     *恢复处于已暂停状态的数据同步任务。
     * @param req ContinueSyncJobRequest
     * @return ContinueSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ContinueSyncJobResponse ContinueSyncJob(ContinueSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ContinueSyncJob", ContinueSyncJobResponse.class);
    }

    /**
     *校验同步任务，检查必要参数和周边配置。
     * @param req CreateCheckSyncJobRequest
     * @return CreateCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckSyncJobResponse CreateCheckSyncJob(CreateCheckSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCheckSyncJob", CreateCheckSyncJobResponse.class);
    }

    /**
     *本接口用于创建数据对比任务，创建成功后会返回数据对比任务 ID，形如：dts-8yv4w2i1-cmp-37skmii9，创建成功后可通过StartCompare启动一致性校验任务
     * @param req CreateCompareTaskRequest
     * @return CreateCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCompareTaskResponse CreateCompareTask(CreateCompareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCompareTask", CreateCompareTaskResponse.class);
    }

    /**
     *为订阅实例创建消费者组
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrateCheckJob", CreateMigrateCheckJobResponse.class);
    }

    /**
     *购买迁移任务。购买成功后会返回随机生成的迁移任务id列表，也可以通过查询迁移任务任务列表接口`DescribeMigrationJobs`看到购买成功的实例Id。注意，一旦购买成功后源及目标数据库类型，源及目标实例地域不可修改。
     * @param req CreateMigrationServiceRequest
     * @return CreateMigrationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationServiceResponse CreateMigrationService(CreateMigrationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrationService", CreateMigrationServiceResponse.class);
    }

    /**
     *在修改同步任务的配置后、通过该接口校验当前任务是否支持修改对象操作
     * @param req CreateModifyCheckSyncJobRequest
     * @return CreateModifyCheckSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateModifyCheckSyncJobResponse CreateModifyCheckSyncJob(CreateModifyCheckSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModifyCheckSyncJob", CreateModifyCheckSyncJobResponse.class);
    }

    /**
     *本接口(CreateSubscribe)用于创建一个数据订阅任务。
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscribe", CreateSubscribeResponse.class);
    }

    /**
     *本接口(CreateSubscribeCheckJob)用于创建一个订阅校验任务。任务必须已经成功调用ConfigureSubscribeJob接口配置了所有的必要信息才能启动校验。
     * @param req CreateSubscribeCheckJobRequest
     * @return CreateSubscribeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeCheckJobResponse CreateSubscribeCheckJob(CreateSubscribeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubscribeCheckJob", CreateSubscribeCheckJobResponse.class);
    }

    /**
     *创建一个同步任务
     * @param req CreateSyncJobRequest
     * @return CreateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncJobResponse CreateSyncJob(CreateSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSyncJob", CreateSyncJobResponse.class);
    }

    /**
     *删除一致性校验任务。当一致性校验任务状态为success、failed、canceled 时可以执行此操作。
     * @param req DeleteCompareTaskRequest
     * @return DeleteCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompareTaskResponse DeleteCompareTask(DeleteCompareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCompareTask", DeleteCompareTaskResponse.class);
    }

    /**
     *本接口(DeleteConsumerGroup)用于删除一个订阅任务的消费组。
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *查询同步校验任务结果，检查必要参数和周边配置
     * @param req DescribeCheckSyncJobResultRequest
     * @return DescribeCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckSyncJobResultResponse DescribeCheckSyncJobResult(DescribeCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckSyncJobResult", DescribeCheckSyncJobResultResponse.class);
    }

    /**
     *查询一致性校验任务详情
     * @param req DescribeCompareReportRequest
     * @return DescribeCompareReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareReportResponse DescribeCompareReport(DescribeCompareReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompareReport", DescribeCompareReportResponse.class);
    }

    /**
     *查询一致性校验任务列表，调用该接口后可通过接口`DescribeCompareTasks` 查询一致性校验任务列表来获得启动后的状态。
     * @param req DescribeCompareTasksRequest
     * @return DescribeCompareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompareTasksResponse DescribeCompareTasks(DescribeCompareTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompareTasks", DescribeCompareTasksResponse.class);
    }

    /**
     *本接口(DescribeConsumerGroups)用于获取订阅实例配置的消费者组详情。
     * @param req DescribeConsumerGroupsRequest
     * @return DescribeConsumerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupsResponse DescribeConsumerGroups(DescribeConsumerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroups", DescribeConsumerGroupsResponse.class);
    }

    /**
     *本接口用于查询支持迁移的云数据库实例
     * @param req DescribeMigrateDBInstancesRequest
     * @return DescribeMigrateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateDBInstancesResponse DescribeMigrateDBInstances(DescribeMigrateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrateDBInstances", DescribeMigrateDBInstancesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationCheckJob", DescribeMigrationCheckJobResponse.class);
    }

    /**
     *查询某个迁移任务详情
     * @param req DescribeMigrationDetailRequest
     * @return DescribeMigrationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationDetailResponse DescribeMigrationDetail(DescribeMigrationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationDetail", DescribeMigrationDetailResponse.class);
    }

    /**
     *查询数据迁移任务列表
     * @param req DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationJobsResponse DescribeMigrationJobs(DescribeMigrationJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationJobs", DescribeMigrationJobsResponse.class);
    }

    /**
     *在创建修改对象的校验任务后、通过该接口查看校验任务的结果
     * @param req DescribeModifyCheckSyncJobResultRequest
     * @return DescribeModifyCheckSyncJobResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyCheckSyncJobResultResponse DescribeModifyCheckSyncJobResult(DescribeModifyCheckSyncJobResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModifyCheckSyncJobResult", DescribeModifyCheckSyncJobResultResponse.class);
    }

    /**
     *本接口(DescribeOffsetByTime)查询KafkaTopic中指定时间前最近的offset。
接口输出的offset是离这个时间最近的offset。
如果输入时间比当前时间晚的多，相当于输出的就是最新的offset；
如果输入时间比当前时间早的多，相当于输出的就是最老的offset；
如果输入空，默认0时间，也就是查询最老的offset。
     * @param req DescribeOffsetByTimeRequest
     * @return DescribeOffsetByTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOffsetByTimeResponse DescribeOffsetByTime(DescribeOffsetByTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOffsetByTime", DescribeOffsetByTimeResponse.class);
    }

    /**
     *本接口(DescribeSubscribeCheckJob)用于查询订阅校验任务结果。
     * @param req DescribeSubscribeCheckJobRequest
     * @return DescribeSubscribeCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeCheckJobResponse DescribeSubscribeCheckJob(DescribeSubscribeCheckJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeCheckJob", DescribeSubscribeCheckJobResponse.class);
    }

    /**
     *本接口(DescribeSubscribeDetail)获取数据订阅实例的配置信息。
     * @param req DescribeSubscribeDetailRequest
     * @return DescribeSubscribeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeDetailResponse DescribeSubscribeDetail(DescribeSubscribeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeDetail", DescribeSubscribeDetailResponse.class);
    }

    /**
     *本接口(DescribeSubscribes)获取数据订阅实例信息列表，默认分页，每次返回20条
     * @param req DescribeSubscribeJobsRequest
     * @return DescribeSubscribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeJobsResponse DescribeSubscribeJobs(DescribeSubscribeJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeJobs", DescribeSubscribeJobsResponse.class);
    }

    /**
     *本接口(DescribeSubscribeReturnable)用于查询订阅任务是否可以销毁和退货。
     * @param req DescribeSubscribeReturnableRequest
     * @return DescribeSubscribeReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeReturnableResponse DescribeSubscribeReturnable(DescribeSubscribeReturnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubscribeReturnable", DescribeSubscribeReturnableResponse.class);
    }

    /**
     *查询同步任务信息
     * @param req DescribeSyncJobsRequest
     * @return DescribeSyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncJobsResponse DescribeSyncJobs(DescribeSyncJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSyncJobs", DescribeSyncJobsResponse.class);
    }

    /**
     *本接口（DestroyIsolatedSubscribe）用于下线已隔离的数据订阅实例
     * @param req DestroyIsolatedSubscribeRequest
     * @return DestroyIsolatedSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DestroyIsolatedSubscribeResponse DestroyIsolatedSubscribe(DestroyIsolatedSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyIsolatedSubscribe", DestroyIsolatedSubscribeResponse.class);
    }

    /**
     *下线数据迁移任务。计费任务必须先调用隔离(IsolateMigrateJob)接口，且只有是**已隔离**状态下，才能调用此接口销毁任务。对于不计费任务，调用隔离(IsolateMigrateJob)接口删除任务操作。
     * @param req DestroyMigrateJobRequest
     * @return DestroyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroyMigrateJobResponse DestroyMigrateJob(DestroyMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyMigrateJob", DestroyMigrateJobResponse.class);
    }

    /**
     *下线同步任务，任务在已隔离状态下可以通过此操作进行任务下线，即彻底删除任务。下线操作后可通过查询同步任务信息接口DescribeSyncJobs获取任务列表查看状态，此操作成功后无法看到此任务表示下线成功。
     * @param req DestroySyncJobRequest
     * @return DestroySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public DestroySyncJobResponse DestroySyncJob(DestroySyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroySyncJob", DestroySyncJobResponse.class);
    }

    /**
     * 隔离退还数据迁移服务。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。对于计费任务，在任务隔离后可进行解除隔离(RecoverMigrationJob)操作或直接进行下线销毁(DestroyMigrateJob)操作。对于不计费任务，调用此接口会直接销毁任务，无法进行恢复操作。
     * @param req IsolateMigrateJobRequest
     * @return IsolateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateMigrateJobResponse IsolateMigrateJob(IsolateMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateMigrateJob", IsolateMigrateJobResponse.class);
    }

    /**
     *本接口（IsolateSubscribe）用于隔离订阅任务。调用后，订阅任务将不能使用。按量计费的任务会停止计费，包年包月的任务会自动退费
     * @param req IsolateSubscribeRequest
     * @return IsolateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSubscribeResponse IsolateSubscribe(IsolateSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateSubscribe", IsolateSubscribeResponse.class);
    }

    /**
     *隔离同步任务，隔离后可通过查询同步任务信息接口DescribeSyncJobs获取隔离后状态。在任务隔离后可进行解除隔离(RecoverSyncJob)操作或直接进行下线操作。对于不计费任务，调用此接口后会直接删除任务，无法进行恢复操作。
     * @param req IsolateSyncJobRequest
     * @return IsolateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSyncJobResponse IsolateSyncJob(IsolateSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateSyncJob", IsolateSyncJobResponse.class);
    }

    /**
     *修改一致性校验任务，在任务创建后启动之前，可修改一致性校验参数
     * @param req ModifyCompareTaskRequest
     * @return ModifyCompareTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskResponse ModifyCompareTask(ModifyCompareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCompareTask", ModifyCompareTaskResponse.class);
    }

    /**
     *修改一致性校验任务名称
     * @param req ModifyCompareTaskNameRequest
     * @return ModifyCompareTaskNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCompareTaskNameResponse ModifyCompareTaskName(ModifyCompareTaskNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCompareTaskName", ModifyCompareTaskNameResponse.class);
    }

    /**
     *本接口(ModifyConsumerGroupDescription)用于修改指定订阅消费组备注。
     * @param req ModifyConsumerGroupDescriptionRequest
     * @return ModifyConsumerGroupDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupDescriptionResponse ModifyConsumerGroupDescription(ModifyConsumerGroupDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroupDescription", ModifyConsumerGroupDescriptionResponse.class);
    }

    /**
     *本接口(ModifyConsumerGroupPassword)用于修改指定订阅消费组密码。
     * @param req ModifyConsumerGroupPasswordRequest
     * @return ModifyConsumerGroupPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupPasswordResponse ModifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroupPassword", ModifyConsumerGroupPasswordResponse.class);
    }

    /**
     *调整实例规格，此接口只支持按量计费任务的调整。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req ModifyMigrateJobSpecRequest
     * @return ModifyMigrateJobSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobSpecResponse ModifyMigrateJobSpec(ModifyMigrateJobSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateJobSpec", ModifyMigrateJobSpecResponse.class);
    }

    /**
     *修改迁移任务名
     * @param req ModifyMigrateNameRequest
     * @return ModifyMigrateNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateNameResponse ModifyMigrateName(ModifyMigrateNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateName", ModifyMigrateNameResponse.class);
    }

    /**
     *用户在发现迁移任务对用户的数据库的负载影响较大时、可通过该接口限制任务的传输速率
     * @param req ModifyMigrateRateLimitRequest
     * @return ModifyMigrateRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateRateLimitResponse ModifyMigrateRateLimit(ModifyMigrateRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateRateLimit", ModifyMigrateRateLimitResponse.class);
    }

    /**
     *修改任务运行时属性，此接口不同于配置类接口，不会进行状态机判断。
     * @param req ModifyMigrateRuntimeAttributeRequest
     * @return ModifyMigrateRuntimeAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateRuntimeAttributeResponse ModifyMigrateRuntimeAttribute(ModifyMigrateRuntimeAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrateRuntimeAttribute", ModifyMigrateRuntimeAttributeResponse.class);
    }

    /**
     *配置迁移服务，配置成功后可通过`CreateMigrationCheckJob` 创建迁移校验任务接口发起校验任务，只有校验通过才能启动迁移任务。
     * @param req ModifyMigrationJobRequest
     * @return ModifyMigrationJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationJobResponse ModifyMigrationJob(ModifyMigrationJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMigrationJob", ModifyMigrationJobResponse.class);
    }

    /**
     *修改订阅实例自动续费标识。只有包年包月的任务修改才有意义，按量计费任务修改后无影响。
     * @param req ModifySubscribeAutoRenewFlagRequest
     * @return ModifySubscribeAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeAutoRenewFlagResponse ModifySubscribeAutoRenewFlag(ModifySubscribeAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeAutoRenewFlag", ModifySubscribeAutoRenewFlagResponse.class);
    }

    /**
     *本接口(ModifySubscribeName)用于修改数据订阅实例的名称
     * @param req ModifySubscribeNameRequest
     * @return ModifySubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeNameResponse ModifySubscribeName(ModifySubscribeNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeName", ModifySubscribeNameResponse.class);
    }

    /**
     *本接口(ModifySubscribeObjects)用于修改数据订阅对象和kafka分区规则，如果是mongo订阅，还可以修改输出聚合规则。
     * @param req ModifySubscribeObjectsRequest
     * @return ModifySubscribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeObjectsResponse ModifySubscribeObjects(ModifySubscribeObjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubscribeObjects", ModifySubscribeObjectsResponse.class);
    }

    /**
     *该接口支持在同步任务启动后修改任务的配置
修改同步配置的完整流程：修改同步任务配置->创建修改同步任务配置的校验任务->查询修改配置的校验任务的结果->启动修改配置任务
     * @param req ModifySyncJobConfigRequest
     * @return ModifySyncJobConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncJobConfigResponse ModifySyncJobConfig(ModifySyncJobConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySyncJobConfig", ModifySyncJobConfigResponse.class);
    }

    /**
     *用户在发现同步任务对用户的数据库的负载影响较大时、可通过该接口限制任务的传输速率
     * @param req ModifySyncRateLimitRequest
     * @return ModifySyncRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncRateLimitResponse ModifySyncRateLimit(ModifySyncRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySyncRateLimit", ModifySyncRateLimitResponse.class);
    }

    /**
     *暂停一个迁移任务。
     * @param req PauseMigrateJobRequest
     * @return PauseMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseMigrateJobResponse PauseMigrateJob(PauseMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseMigrateJob", PauseMigrateJobResponse.class);
    }

    /**
     *暂停处于同步中的数据同步任务。
     * @param req PauseSyncJobRequest
     * @return PauseSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public PauseSyncJobResponse PauseSyncJob(PauseSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseSyncJob", PauseSyncJobResponse.class);
    }

    /**
     *解除隔离数据迁移任务，用户手动发起隔离后的手动解隔离，只有任务状态为已隔离(手动操作)状态下才能触发此操作。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req RecoverMigrateJobRequest
     * @return RecoverMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMigrateJobResponse RecoverMigrateJob(RecoverMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverMigrateJob", RecoverMigrateJobResponse.class);
    }

    /**
     *解除隔离同步任务，任务在已隔离状态下可调用该接口解除隔离状态任务，同时可通过查询同步任务信息接口DescribeSyncJobs，获取操作后状态。
     * @param req RecoverSyncJobRequest
     * @return RecoverSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public RecoverSyncJobResponse RecoverSyncJob(RecoverSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverSyncJob", RecoverSyncJobResponse.class);
    }

    /**
     *本接口(ResetConsumerGroupOffset)用于重置订阅消费组的offset。调用DescribeConsumerGroups接口查询消费组状态，只有消费组状态为 Dead 或 Empty 才可以执行重置该操作。否则重置不会生效，接口也不会报错。
     * @param req ResetConsumerGroupOffsetRequest
     * @return ResetConsumerGroupOffsetResponse
     * @throws TencentCloudSDKException
     */
    public ResetConsumerGroupOffsetResponse ResetConsumerGroupOffset(ResetConsumerGroupOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetConsumerGroupOffset", ResetConsumerGroupOffsetResponse.class);
    }

    /**
     *本接口(ResetSubscribe)用于重置订阅实例，重置后，可以重新配置订阅任务。
可以调用 DescribeSubscribeDetail 查询订阅信息判断是否置成功。当SubsStatus变为notStarted时，表示重置成功。
     * @param req ResetSubscribeRequest
     * @return ResetSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResetSubscribeResponse ResetSubscribe(ResetSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetSubscribe", ResetSubscribeResponse.class);
    }

    /**
     *重置已经结束的同步任务，重置后可以重新配置启动任务。
     * @param req ResetSyncJobRequest
     * @return ResetSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResetSyncJobResponse ResetSyncJob(ResetSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetSyncJob", ResetSyncJobResponse.class);
    }

    /**
     *调整同步任务规格，此接口只支持按量计费任务的调整，调用此接口后不会立即生效，后台调整时间大概为3~5分钟。调用此接口后可通过查询同步任务信息接口DescribeSyncJobs，获取变配后的状态。
     * @param req ResizeSyncJobRequest
     * @return ResizeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResizeSyncJobResponse ResizeSyncJob(ResizeSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeSyncJob", ResizeSyncJobResponse.class);
    }

    /**
     *重试数据迁移任务，针对异常情况可进行重试，对于redis在失败时也可重试。注意：此操作跳过校验阶段，直接重新发起任务，相当于从StartMigrationJob开始执行。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req ResumeMigrateJobRequest
     * @return ResumeMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeMigrateJobResponse ResumeMigrateJob(ResumeMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeMigrateJob", ResumeMigrateJobResponse.class);
    }

    /**
     *本接口(ResumeSubscribe) 用于恢复报错的订阅任务。当订阅任务的状态为error时，可通过本接口尝试对任务进行恢复。
     * @param req ResumeSubscribeRequest
     * @return ResumeSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSubscribeResponse ResumeSubscribe(ResumeSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeSubscribe", ResumeSubscribeResponse.class);
    }

    /**
     *重试同步任务，部分可恢复报错情况下，可通过该接口重试同步任务，可通过查询同步任务信息接口DescribeSyncJobs，获取操作后状态。
     * @param req ResumeSyncJobRequest
     * @return ResumeSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSyncJobResponse ResumeSyncJob(ResumeSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeSyncJob", ResumeSyncJobResponse.class);
    }

    /**
     *本接口用于校验检查项不通过后，可进行跳过此校验项操作，后端将不再校验该项。任何校验步骤都是不应该跳过的，通过校验是能正确执行的前置条件。支持跳过的产品及链路的校验项可 [参考文档](https://cloud.tencent.com/document/product/571/61639)。
     * @param req SkipCheckItemRequest
     * @return SkipCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipCheckItemResponse SkipCheckItem(SkipCheckItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SkipCheckItem", SkipCheckItemResponse.class);
    }

    /**
     *本接口用于校验检查项不通过后，可进行跳过此校验项操作，后端将不再校验该项。任何校验步骤都是不应该跳过的，通过校验是能正确执行的前置条件。支持跳过的产品及链路的校验项可 [参考文档](https://cloud.tencent.com/document/product/571/61639)。
     * @param req SkipSyncCheckItemRequest
     * @return SkipSyncCheckItemResponse
     * @throws TencentCloudSDKException
     */
    public SkipSyncCheckItemResponse SkipSyncCheckItem(SkipSyncCheckItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SkipSyncCheckItem", SkipSyncCheckItemResponse.class);
    }

    /**
     *启动一致性校验任务，启动之前需要先通过接口`CreateCompareTask` 创建一致性校验任务，启动后可通过接口`DescribeCompareTasks` 查询一致性校验任务列表来获得启动后的状态
     * @param req StartCompareRequest
     * @return StartCompareResponse
     * @throws TencentCloudSDKException
     */
    public StartCompareResponse StartCompare(StartCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCompare", StartCompareResponse.class);
    }

    /**
     *本接口（StartMigrationJob）用于启动迁移任务。调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMigrateJob", StartMigrateJobResponse.class);
    }

    /**
     *在查询修改对象的校验任务的结果中的status为success后、通过该接口开始修改配置流程
     * @param req StartModifySyncJobRequest
     * @return StartModifySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartModifySyncJobResponse StartModifySyncJob(StartModifySyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartModifySyncJob", StartModifySyncJobResponse.class);
    }

    /**
     *本接口(StartSubscribe)用于启动一个kafka版本的数据订阅实例。只有当订阅任务的状态为checkPass时，才能调用本接口。
     * @param req StartSubscribeRequest
     * @return StartSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public StartSubscribeResponse StartSubscribe(StartSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartSubscribe", StartSubscribeResponse.class);
    }

    /**
     *启动同步任务
     * @param req StartSyncJobRequest
     * @return StartSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartSyncJobResponse StartSyncJob(StartSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartSyncJob", StartSyncJobResponse.class);
    }

    /**
     *终止一致性校验任务
     * @param req StopCompareRequest
     * @return StopCompareResponse
     * @throws TencentCloudSDKException
     */
    public StopCompareResponse StopCompare(StopCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCompare", StopCompareResponse.class);
    }

    /**
     *本接口（StopMigrateJob）用于终止数据迁移任务。
调用此接口后可通过查询迁移服务列表接口`DescribeMigrationJobs`来查询当前任务状态。
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMigrateJob", StopMigrateJobResponse.class);
    }

    /**
     *结束同步任务，操作后可通过查询同步任务信息接口DescribeSyncJobs，获取操作后的状态。
     * @param req StopSyncJobRequest
     * @return StopSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StopSyncJobResponse StopSyncJob(StopSyncJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSyncJob", StopSyncJobResponse.class);
    }

}
