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
package com.tencentcloudapi.smpn.v20190822;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.smpn.v20190822.models.*;

public class SmpnClient extends AbstractClient{
    private static String endpoint = "smpn.tencentcloudapi.com";
    private static String service = "smpn";
    private static String version = "2019-08-22";

    public SmpnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SmpnClient(Credential credential, String region, ClientProfile profile) {
        super(SmpnClient.endpoint, SmpnClient.version, credential, region, profile);
    }

    /**
     *企业号码认证
     * @param req CreateSmpnEpaRequest
     * @return CreateSmpnEpaResponse
     * @throws TencentCloudSDKException
     */
    public CreateSmpnEpaResponse CreateSmpnEpa(CreateSmpnEpaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSmpnEpaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSmpnEpaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSmpnEpa");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询号码的标记和标记次数
     * @param req DescribeSmpnChpRequest
     * @return DescribeSmpnChpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmpnChpResponse DescribeSmpnChp(DescribeSmpnChpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmpnChpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmpnChpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmpnChp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *虚假号码识别
     * @param req DescribeSmpnFnrRequest
     * @return DescribeSmpnFnrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmpnFnrResponse DescribeSmpnFnr(DescribeSmpnFnrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmpnFnrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmpnFnrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmpnFnr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *号码营销监控
     * @param req DescribeSmpnMhmRequest
     * @return DescribeSmpnMhmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmpnMhmResponse DescribeSmpnMhm(DescribeSmpnMhmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmpnMhmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmpnMhmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmpnMhm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询号码恶意标记等级
     * @param req DescribeSmpnMrlRequest
     * @return DescribeSmpnMrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmpnMrlResponse DescribeSmpnMrl(DescribeSmpnMrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmpnMrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmpnMrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmpnMrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
