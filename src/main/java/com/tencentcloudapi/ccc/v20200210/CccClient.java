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
package com.tencentcloudapi.ccc.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ccc.v20200210.models.*;

public class CccClient extends AbstractClient{
    private static String endpoint = "ccc.tencentcloudapi.com";
    private static String version = "2020-02-10";

    public CccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CccClient(Credential credential, String region, ClientProfile profile) {
        super(CccClient.endpoint, CccClient.version, credential, region, profile);
    }

    /**
     *创建 SDK 登录 Token。
     * @param req CreateSDKLoginTokenRequest
     * @return CreateSDKLoginTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateSDKLoginTokenResponse CreateSDKLoginToken(CreateSDKLoginTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSDKLoginTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSDKLoginTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSDKLoginToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建客服账号。
     * @param req CreateStaffRequest
     * @return CreateStaffResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaffResponse CreateStaff(CreateStaffRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStaffResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStaffResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStaff");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *包括具体聊天内容
     * @param req DescribeChatMessagesRequest
     * @return DescribeChatMessagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatMessagesResponse DescribeChatMessages(DescribeChatMessagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChatMessagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChatMessagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChatMessages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *包括全媒体和文本两种类型
     * @param req DescribeIMCdrsRequest
     * @return DescribeIMCdrsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMCdrsResponse DescribeIMCdrs(DescribeIMCdrsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIMCdrsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIMCdrsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIMCdrs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取电话服务记录与录音
     * @param req DescribeTelCdrRequest
     * @return DescribeTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCdrResponse DescribeTelCdr(DescribeTelCdrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTelCdrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTelCdrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTelCdr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
