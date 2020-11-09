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
package com.tencentcloudapi.tbp.v20190311;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tbp.v20190311.models.*;

public class TbpClient extends AbstractClient{
    private static String endpoint = "tbp.tencentcloudapi.com";
    private static String service = "tbp";
    private static String version = "2019-03-11";

    public TbpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TbpClient(Credential credential, String region, ClientProfile profile) {
        super(TbpClient.endpoint, TbpClient.version, credential, region, profile);
    }

    /**
     *创建机器人
     * @param req CreateBotRequest
     * @return CreateBotResponse
     * @throws TencentCloudSDKException
     */
    public CreateBotResponse CreateBot(CreateBotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对当前机器人的会话状态进行复位
     * @param req ResetRequest
     * @return ResetResponse
     * @throws TencentCloudSDKException
     */
    public ResetResponse Reset(ResetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Reset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接收调用侧的文本输入，返回应答文本。已废弃，推荐使用最新版TextProcess接口。
     * @param req TextProcessRequest
     * @return TextProcessResponse
     * @throws TencentCloudSDKException
     */
    public TextProcessResponse TextProcess(TextProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextProcessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextProcessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextProcess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会话重置接口。已废弃，推荐使用最新版TextReset接口。
     * @param req TextResetRequest
     * @return TextResetResponse
     * @throws TencentCloudSDKException
     */
    public TextResetResponse TextReset(TextResetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextResetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextResetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextReset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
