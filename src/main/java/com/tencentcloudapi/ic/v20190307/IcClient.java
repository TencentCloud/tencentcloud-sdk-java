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
package com.tencentcloudapi.ic.v20190307;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ic.v20190307.models.*;

public class IcClient extends AbstractClient{
    private static String endpoint = "ic.tencentcloudapi.com";
    private static String version = "2019-03-07";

    public IcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IcClient(Credential credential, String region, ClientProfile profile) {
        super(IcClient.endpoint, IcClient.version, credential, region, profile);
    }

    /**
     *根据应用id查询物联卡应用详情
     * @param req DescribeAppRequest
     * @return DescribeAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppResponse DescribeApp(DescribeAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAppResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeApp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询卡片详细信息
     * @param req DescribeCardRequest
     * @return DescribeCardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCardResponse DescribeCard(DescribeCardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCardResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCardResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCard"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询卡片列表信息
     * @param req DescribeCardsRequest
     * @return DescribeCardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCardsResponse DescribeCards(DescribeCardsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCardsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCardsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCards"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *群发短信
     * @param req SendMultiSmsRequest
     * @return SendMultiSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendMultiSmsResponse SendMultiSms(SendMultiSmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendMultiSmsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendMultiSmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendMultiSms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送短信息接口
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
