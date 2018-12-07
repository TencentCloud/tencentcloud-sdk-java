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
package com.tencentcloudapi.faceid.v20180301;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.faceid.v20180301.models.*;

public class FaceidClient extends AbstractClient{
    private static String endpoint = "faceid.tencentcloudapi.com";
    private static String version = "2018-03-01";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public FaceidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public FaceidClient(Credential credential, String region, ClientProfile profile) {
        super(FaceidClient.endpoint, FaceidClient.version, credential, region, profile);
    }

    /**
     *实名核身鉴权。用于获取一次核身流程的BizToken。如果是微信平台，会同时返回一个URL，用作微信平台的跳转。
     * @param req DetectAuthRequest
     * @return DetectAuthResponse
     * @throws TencentCloudSDKException
     */
    public DetectAuthResponse  DetectAuth(DetectAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectAuthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectAuthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectAuth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实名核身结果信息
     * @param req GetDetectInfoRequest
     * @return GetDetectInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetDetectInfoResponse  GetDetectInfo(GetDetectInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDetectInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDetectInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDetectInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
