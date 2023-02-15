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
package com.tencentcloudapi.bma.v20221115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bma.v20221115.models.*;

public class BmaClient extends AbstractClient{
    private static String endpoint = "bma.tencentcloudapi.com";
    private static String service = "bma";
    private static String version = "2022-11-15";

    public BmaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmaClient(Credential credential, String region, ClientProfile profile) {
        super(BmaClient.endpoint, BmaClient.version, credential, region, profile);
    }

    /**
     *仿冒应用举报
     * @param req CreateBPFakeAPPRequest
     * @return CreateBPFakeAPPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeAPPResponse CreateBPFakeAPP(CreateBPFakeAPPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPFakeAPPResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPFakeAPPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPFakeAPP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量仿冒应用举报
     * @param req CreateBPFakeAPPListRequest
     * @return CreateBPFakeAPPListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeAPPListResponse CreateBPFakeAPPList(CreateBPFakeAPPListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPFakeAPPListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPFakeAPPListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPFakeAPPList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *仿冒网址举报
     * @param req CreateBPFakeURLRequest
     * @return CreateBPFakeURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeURLResponse CreateBPFakeURL(CreateBPFakeURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPFakeURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPFakeURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPFakeURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量仿冒网址举报
     * @param req CreateBPFakeURLsRequest
     * @return CreateBPFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeURLsResponse CreateBPFakeURLs(CreateBPFakeURLsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPFakeURLsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPFakeURLsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPFakeURLs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
