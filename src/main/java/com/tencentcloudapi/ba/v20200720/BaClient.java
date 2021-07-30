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
package com.tencentcloudapi.ba.v20200720;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ba.v20200720.models.*;

public class BaClient extends AbstractClient{
    private static String endpoint = "ba.tencentcloudapi.com";
    private static String service = "ba";
    private static String version = "2020-07-20";

    public BaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BaClient(Credential credential, String region, ClientProfile profile) {
        super(BaClient.endpoint, BaClient.version, credential, region, profile);
    }

    /**
     *创建渠道备案小程序二维码
     * @param req CreateWeappQRUrlRequest
     * @return CreateWeappQRUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateWeappQRUrlResponse CreateWeappQRUrl(CreateWeappQRUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWeappQRUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWeappQRUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWeappQRUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实名认证信息
     * @param req DescribeGetAuthInfoRequest
     * @return DescribeGetAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGetAuthInfoResponse DescribeGetAuthInfo(DescribeGetAuthInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGetAuthInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGetAuthInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGetAuthInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将备案ICP订单下的一个网站信息 同步给订单下其他网站，需要被同步的网站被检查通过(isCheck:true)；
只有指定的网站信息字段能被同步
     * @param req SyncIcpOrderWebInfoRequest
     * @return SyncIcpOrderWebInfoResponse
     * @throws TencentCloudSDKException
     */
    public SyncIcpOrderWebInfoResponse SyncIcpOrderWebInfo(SyncIcpOrderWebInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncIcpOrderWebInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncIcpOrderWebInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncIcpOrderWebInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
