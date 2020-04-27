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
package com.tencentcloudapi.gs.v20191118;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gs.v20191118.models.*;

public class GsClient extends AbstractClient{
    private static String endpoint = "gs.tencentcloudapi.com";
    private static String version = "2019-11-18";

    public GsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GsClient(Credential credential, String region, ClientProfile profile) {
        super(GsClient.endpoint, GsClient.version, credential, region, profile);
    }

    /**
     *创建会话
     * @param req CreateSessionRequest
     * @return CreateSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSessionResponse CreateSession(CreateSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSessionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSessionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSession"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询空闲机器数量
     * @param req DescribeWorkersRequest
     * @return DescribeWorkersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkersResponse DescribeWorkers(DescribeWorkersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWorkers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取机器信息
     * @param req DescribeWorkersInfoRequest
     * @return DescribeWorkersInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkersInfoResponse DescribeWorkersInfo(DescribeWorkersInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkersInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkersInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWorkersInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *进入排队锁定机器
     * @param req EnterQueueRequest
     * @return EnterQueueResponse
     * @throws TencentCloudSDKException
     */
    public EnterQueueResponse EnterQueue(EnterQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnterQueueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnterQueueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnterQueue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改机器信息
     * @param req ModifyWorkersRequest
     * @return ModifyWorkersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkersResponse ModifyWorkers(ModifyWorkersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWorkers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *退出排队
     * @param req QuitQueueRequest
     * @return QuitQueueResponse
     * @throws TencentCloudSDKException
     */
    public QuitQueueResponse QuitQueue(QuitQueueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuitQueueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QuitQueueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QuitQueue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *强制退出游戏
     * @param req StopGameRequest
     * @return StopGameResponse
     * @throws TencentCloudSDKException
     */
    public StopGameResponse StopGame(StopGameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopGameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopGameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopGame"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *尝试锁定机器
     * @param req TrylockWorkerRequest
     * @return TrylockWorkerResponse
     * @throws TencentCloudSDKException
     */
    public TrylockWorkerResponse TrylockWorker(TrylockWorkerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrylockWorkerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TrylockWorkerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TrylockWorker"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
