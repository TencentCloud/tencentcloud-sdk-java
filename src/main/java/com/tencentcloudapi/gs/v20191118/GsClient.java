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
    private static String service = "gs";
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例总数和运行数
     * @param req DescribeInstancesCountRequest
     * @return DescribeInstancesCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesCountResponse DescribeInstancesCount(DescribeInstancesCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesCountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *保存游戏存档
     * @param req SaveGameArchiveRequest
     * @return SaveGameArchiveResponse
     * @throws TencentCloudSDKException
     */
    public SaveGameArchiveResponse SaveGameArchive(SaveGameArchiveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SaveGameArchiveResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SaveGameArchiveResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SaveGameArchive");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开始云端推流
     * @param req StartPublishStreamRequest
     * @return StartPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamResponse StartPublishStream(StartPublishStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartPublishStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartPublishStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartPublishStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopGameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopGame");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止云端推流
     * @param req StopPublishStreamRequest
     * @return StopPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishStreamResponse StopPublishStream(StopPublishStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopPublishStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopPublishStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopPublishStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换游戏存档
     * @param req SwitchGameArchiveRequest
     * @return SwitchGameArchiveResponse
     * @throws TencentCloudSDKException
     */
    public SwitchGameArchiveResponse SwitchGameArchive(SwitchGameArchiveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchGameArchiveResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchGameArchiveResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchGameArchive");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TrylockWorkerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TrylockWorker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
