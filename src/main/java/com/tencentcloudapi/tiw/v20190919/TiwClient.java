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
package com.tencentcloudapi.tiw.v20190919;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiw.v20190919.models.*;

public class TiwClient extends AbstractClient{
    private static String endpoint = "tiw.tencentcloudapi.com";
    private static String version = "2019-09-19";

    public TiwClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TiwClient(Credential credential, String region, ClientProfile profile) {
        super(TiwClient.endpoint, TiwClient.version, credential, region, profile);
    }

    /**
     *创建一个文档转码任务
     * @param req CreateTranscodeRequest
     * @return CreateTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeResponse CreateTranscode(CreateTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTranscode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实时录制任务状态与结果
     * @param req DescribeOnlineRecordRequest
     * @return DescribeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordResponse DescribeOnlineRecord(DescribeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOnlineRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOnlineRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实时录制回调地址
     * @param req DescribeOnlineRecordCallbackRequest
     * @return DescribeOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOnlineRecordCallbackResponse DescribeOnlineRecordCallback(DescribeOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOnlineRecordCallbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOnlineRecordCallbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOnlineRecordCallback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文档转码任务的执行进度与转码结果
     * @param req DescribeTranscodeRequest
     * @return DescribeTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeResponse DescribeTranscode(DescribeTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTranscode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文档转码回调地址
     * @param req DescribeTranscodeCallbackRequest
     * @return DescribeTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeCallbackResponse DescribeTranscodeCallback(DescribeTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeCallbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeCallbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTranscodeCallback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停实时录制
     * @param req PauseOnlineRecordRequest
     * @return PauseOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public PauseOnlineRecordResponse PauseOnlineRecord(PauseOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PauseOnlineRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PauseOnlineRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PauseOnlineRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复实时录制
     * @param req ResumeOnlineRecordRequest
     * @return ResumeOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public ResumeOnlineRecordResponse ResumeOnlineRecord(ResumeOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeOnlineRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeOnlineRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeOnlineRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置实时录制回调地址
     * @param req SetOnlineRecordCallbackRequest
     * @return SetOnlineRecordCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetOnlineRecordCallbackResponse SetOnlineRecordCallback(SetOnlineRecordCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOnlineRecordCallbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetOnlineRecordCallbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetOnlineRecordCallback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置文档转码回调地址
     * @param req SetTranscodeCallbackRequest
     * @return SetTranscodeCallbackResponse
     * @throws TencentCloudSDKException
     */
    public SetTranscodeCallbackResponse SetTranscodeCallback(SetTranscodeCallbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTranscodeCallbackResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetTranscodeCallbackResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetTranscodeCallback"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起一个实时录制任务
     * @param req StartOnlineRecordRequest
     * @return StartOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartOnlineRecordResponse StartOnlineRecord(StartOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartOnlineRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartOnlineRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartOnlineRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止实时录制
     * @param req StopOnlineRecordRequest
     * @return StopOnlineRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopOnlineRecordResponse StopOnlineRecord(StopOnlineRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopOnlineRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopOnlineRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopOnlineRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
