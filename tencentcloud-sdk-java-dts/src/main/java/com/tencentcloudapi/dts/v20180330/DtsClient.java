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
package com.tencentcloudapi.dts.v20180330;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dts.v20180330.models.*;

public class DtsClient extends AbstractClient{
    private static String endpoint = "dts.tencentcloudapi.com";
    private static String version = "2018-03-30";

    public DtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DtsClient(Credential credential, String region, ClientProfile profile) {
        super(DtsClient.endpoint, DtsClient.version, credential, region, profile);
    }

    /**
     *本接口用于配置数据订阅，只有在未配置状态的订阅实例才能调用此接口。
     * @param req ActivateSubscribeRequest
     * @return ActivateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ActivateSubscribeResponse ActivateSubscribe(ActivateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActivateSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ActivateSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ActivateSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CompleteMigrateJob）用于完成数据迁移任务。
选择采用增量迁移方式的任务, 需要在迁移进度进入准备完成阶段后, 调用本接口, 停止迁移增量数据。
通过DescribeMigrateJobs接口查询到任务的状态为准备完成（status=8）时，此时可以调用本接口完成迁移任务。

     * @param req CompleteMigrateJobRequest
     * @return CompleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CompleteMigrateJobResponse CompleteMigrateJob(CompleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CompleteMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建校验迁移任务
在开始迁移前, 必须调用本接口创建校验, 且校验成功后才能开始迁移. 校验的结果可以通过DescribeMigrateCheckJob查看.
校验成功后,迁移任务若有修改, 则必须重新创建校验并通过后, 才能开始迁移.
     * @param req CreateMigrateCheckJobRequest
     * @return CreateMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateCheckJobResponse CreateMigrateCheckJob(CreateMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateCheckJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateCheckJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMigrateCheckJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateMigrateJob）用于创建数据迁移任务。

如果是金融区链路, 请使用域名: dts.ap-shenzhen-fsi.tencentcloudapi.com
     * @param req CreateMigrateJobRequest
     * @return CreateMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrateJobResponse CreateMigrateJob(CreateMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateSubscribe)用于创建一个数据订阅实例。
     * @param req CreateSubscribeRequest
     * @return CreateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubscribeResponse CreateSubscribe(CreateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在调用 StartSyncJob 接口启动灾备同步前, 必须调用本接口创建校验, 且校验成功后才能开始同步数据. 校验的结果可以通过 DescribeSyncCheckJob 查看.
校验成功后才能启动同步.
     * @param req CreateSyncCheckJobRequest
     * @return CreateSyncCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncCheckJobResponse CreateSyncCheckJob(CreateSyncCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSyncCheckJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSyncCheckJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSyncCheckJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateSyncJob)用于创建灾备同步任务。
创建同步任务后，可以通过 CreateSyncCheckJob 接口发起校验任务。校验成功后才可以通过 StartSyncJob 接口启动同步任务。
     * @param req CreateSyncJobRequest
     * @return CreateSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateSyncJobResponse CreateSyncJob(CreateSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSyncJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSyncJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSyncJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteMigrationJob）用于删除数据迁移任务。当通过DescribeMigrateJobs接口查询到任务的状态为：检验中（status=3）、运行中（status=7）、准备完成（status=8）、撤销中（status=11）或者完成中（status=12）时，不允许删除任务。
     * @param req DeleteMigrateJobRequest
     * @return DeleteMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrateJobResponse DeleteMigrateJob(DeleteMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除灾备同步任务 （运行中的同步任务不能删除）。
     * @param req DeleteSyncJobRequest
     * @return DeleteSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSyncJobResponse DeleteSyncJob(DeleteSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSyncJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSyncJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSyncJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAsyncRequestInfo）用于查询任务执行结果
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncRequestInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncRequestInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAsyncRequestInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建校验后,获取校验的结果. 能查询到当前校验的状态和进度. 
若通过校验, 则可调用'StartMigrateJob' 开始迁移.
若未通过校验, 则能查询到校验失败的原因. 请按照报错, 通过'ModifyMigrateJob'修改迁移配置或是调整源/目标实例的相关参数.
     * @param req DescribeMigrateCheckJobRequest
     * @return DescribeMigrateCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateCheckJobResponse DescribeMigrateCheckJob(DescribeMigrateCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateCheckJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateCheckJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMigrateCheckJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据迁移任务.
如果是金融区链路, 请使用域名: https://dts.ap-shenzhen-fsi.tencentcloudapi.com
     * @param req DescribeMigrateJobsRequest
     * @return DescribeMigrateJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrateJobsResponse DescribeMigrateJobs(DescribeMigrateJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrateJobsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrateJobsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMigrateJobs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRegionConf）用于查询可售卖订阅实例的地域
     * @param req DescribeRegionConfRequest
     * @return DescribeRegionConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionConfResponse DescribeRegionConf(DescribeRegionConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionConfResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionConfResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRegionConf"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSubscribeConf）用于查询订阅实例配置
     * @param req DescribeSubscribeConfRequest
     * @return DescribeSubscribeConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribeConfResponse DescribeSubscribeConf(DescribeSubscribeConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscribeConfResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscribeConfResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubscribeConf"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSubscribes)获取数据订阅实例信息列表，默认分页，每次返回20条
     * @param req DescribeSubscribesRequest
     * @return DescribeSubscribesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscribesResponse DescribeSubscribes(DescribeSubscribesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscribesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscribesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubscribes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于在通过 CreateSyncCheckJob 接口创建灾备同步校验任务后，获取校验的结果。能查询到当前校验的状态和进度。
若通过校验, 则可调用 StartSyncJob 启动同步任务。
若未通过校验, 则会返回校验失败的原因。 可通过 ModifySyncJob 修改配置，然后再次发起校验。
校验任务需要大概约30秒，当返回的 Status 不为 finished 时表示尚未校验完成，需要轮询该接口。
如果 Status=finished 且 CheckFlag=1 时表示校验成功。
如果 Status=finished 且 CheckFlag !=1 时表示校验失败。
     * @param req DescribeSyncCheckJobRequest
     * @return DescribeSyncCheckJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncCheckJobResponse DescribeSyncCheckJob(DescribeSyncCheckJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSyncCheckJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSyncCheckJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSyncCheckJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询在迁移平台发起的灾备同步任务
     * @param req DescribeSyncJobsRequest
     * @return DescribeSyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncJobsResponse DescribeSyncJobs(DescribeSyncJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSyncJobsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSyncJobsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSyncJobs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（IsolateSubscribe）用于隔离小时计费的订阅实例。调用后，订阅实例将不能使用，同时停止计费。
     * @param req IsolateSubscribeRequest
     * @return IsolateSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public IsolateSubscribeResponse IsolateSubscribe(IsolateSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IsolateSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyMigrateJob）用于修改数据迁移任务。
当迁移任务处于下述状态时，允许调用本接口修改迁移任务：迁移创建中（status=1）、 校验成功(status=4)、校验失败(status=5)、迁移失败(status=10)。但源实例、目标实例类型和目标实例地域不允许修改。

如果是金融区链路, 请使用域名: dts.ap-shenzhen-fsi.tencentcloudapi.com
     * @param req ModifyMigrateJobRequest
     * @return ModifyMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrateJobResponse ModifyMigrateJob(ModifyMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifySubscribeConsumeTime)用于修改数据订阅通道的消费时间点
     * @param req ModifySubscribeConsumeTimeRequest
     * @return ModifySubscribeConsumeTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeConsumeTimeResponse ModifySubscribeConsumeTime(ModifySubscribeConsumeTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeConsumeTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeConsumeTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubscribeConsumeTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifySubscribeName)用于修改数据订阅实例的名称
     * @param req ModifySubscribeNameRequest
     * @return ModifySubscribeNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeNameResponse ModifySubscribeName(ModifySubscribeNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubscribeName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifySubscribeObjects)用于修改数据订阅通道的订阅规则
     * @param req ModifySubscribeObjectsRequest
     * @return ModifySubscribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeObjectsResponse ModifySubscribeObjects(ModifySubscribeObjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeObjectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeObjectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubscribeObjects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifySubscribeVipVport)用于修改数据订阅实例的IP和端口号
     * @param req ModifySubscribeVipVportRequest
     * @return ModifySubscribeVipVportResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscribeVipVportResponse ModifySubscribeVipVport(ModifySubscribeVipVportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscribeVipVportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscribeVipVportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubscribeVipVport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改灾备同步任务. 
当同步任务处于下述状态时, 允许调用本接口: 同步任务创建中, 创建完成, 校验成功, 校验失败. 
源实例和目标实例信息不允许修改，可以修改任务名、需要同步的库表。
     * @param req ModifySyncJobRequest
     * @return ModifySyncJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifySyncJobResponse ModifySyncJob(ModifySyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySyncJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySyncJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySyncJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（OfflineIsolatedSubscribe）用于下线已隔离的数据订阅实例
     * @param req OfflineIsolatedSubscribeRequest
     * @return OfflineIsolatedSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedSubscribeResponse OfflineIsolatedSubscribe(OfflineIsolatedSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OfflineIsolatedSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ResetSubscribe)用于重置数据订阅实例，已经激活的数据订阅实例，重置后可以使用ActivateSubscribe接口绑定其他的数据库实例
     * @param req ResetSubscribeRequest
     * @return ResetSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ResetSubscribeResponse ResetSubscribe(ResetSubscribeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetSubscribeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetSubscribeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetSubscribe"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartMigrationJob）用于启动迁移任务。非定时迁移任务会在调用后立即开始迁移，定时任务则会开始倒计时。
调用此接口前，请务必先使用CreateMigrateCheckJob校验数据迁移任务，并通过DescribeMigrateJobs接口查询到任务状态为校验通过（status=4）时，才能启动数据迁移任务。
     * @param req StartMigrateJobRequest
     * @return StartMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StartMigrateJobResponse StartMigrateJob(StartMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建的灾备同步任务在通过 CreateSyncCheckJob 和 DescribeSyncCheckJob 确定校验成功后，可以调用该接口启动同步
     * @param req StartSyncJobRequest
     * @return StartSyncJobResponse
     * @throws TencentCloudSDKException
     */
    public StartSyncJobResponse StartSyncJob(StartSyncJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartSyncJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartSyncJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartSyncJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopMigrateJob）用于撤销数据迁移任务。
在迁移过程中允许调用该接口撤销迁移, 撤销迁移的任务会失败。通过DescribeMigrateJobs接口查询到任务状态为运行中（status=7）或准备完成（status=8）时，才能撤销数据迁移任务。
     * @param req StopMigrateJobRequest
     * @return StopMigrateJobResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrateJobResponse StopMigrateJob(StopMigrateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMigrateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopMigrateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopMigrateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将灾备升级为主实例，停止从原来所属主实例的同步，断开主备关系。
     * @param req SwitchDrToMasterRequest
     * @return SwitchDrToMasterResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDrToMasterResponse SwitchDrToMaster(SwitchDrToMasterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDrToMasterResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDrToMasterResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SwitchDrToMaster"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
