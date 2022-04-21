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
package com.tencentcloudapi.car.v20220110;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.car.v20220110.models.*;

public class CarClient extends AbstractClient{
    private static String endpoint = "car.tencentcloudapi.com";
    private static String service = "car";
    private static String version = "2022-01-10";

    public CarClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CarClient(Credential credential, String region, ClientProfile profile) {
        super(CarClient.endpoint, CarClient.version, credential, region, profile);
    }

    /**
     *申请并发
     * @param req ApplyConcurrentRequest
     * @return ApplyConcurrentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConcurrentResponse ApplyConcurrent(ApplyConcurrentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyConcurrentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyConcurrentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyConcurrent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
     *销毁会话
     * @param req DestroySessionRequest
     * @return DestroySessionResponse
     * @throws TencentCloudSDKException
     */
    public DestroySessionResponse DestroySession(DestroySessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroySessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroySessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroySession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
