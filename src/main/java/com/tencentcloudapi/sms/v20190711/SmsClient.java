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
package com.tencentcloudapi.sms.v20190711;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sms.v20190711.models.*;

public class SmsClient extends AbstractClient{
    private static String endpoint = "sms.tencentcloudapi.com";
    private static String version = "2019-07-11";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public SmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public SmsClient(Credential credential, String region, ClientProfile profile) {
        super(SmsClient.endpoint, SmsClient.version, credential, region, profile);
    }

    /**
     *拉取短信回复状态
     * @param req PullSmsReplyStatusRequest
     * @return PullSmsReplyStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusResponse PullSmsReplyStatus(PullSmsReplyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsReplyStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsReplyStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsReplyStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取单个号码短信回复状态
     * @param req PullSmsReplyStatusByPhoneNumberRequest
     * @return PullSmsReplyStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsReplyStatusByPhoneNumberResponse PullSmsReplyStatusByPhoneNumber(PullSmsReplyStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsReplyStatusByPhoneNumberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsReplyStatusByPhoneNumberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsReplyStatusByPhoneNumber"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取短信下发状态
     * @param req PullSmsSendStatusRequest
     * @return PullSmsSendStatusResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusResponse PullSmsSendStatus(PullSmsSendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsSendStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsSendStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsSendStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取单个号码短信下发状态
     * @param req PullSmsSendStatusByPhoneNumberRequest
     * @return PullSmsSendStatusByPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public PullSmsSendStatusByPhoneNumberResponse PullSmsSendStatusByPhoneNumber(PullSmsSendStatusByPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PullSmsSendStatusByPhoneNumberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PullSmsSendStatusByPhoneNumberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PullSmsSendStatusByPhoneNumber"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *短信发送接口，用户给用户发短信验证码、通知类短信或营销短信。


     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(SendSmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendSmsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendSmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendSms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
