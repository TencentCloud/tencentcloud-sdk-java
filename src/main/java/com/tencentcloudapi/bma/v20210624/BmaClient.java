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
package com.tencentcloudapi.bma.v20210624;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bma.v20210624.models.*;

public class BmaClient extends AbstractClient{
    private static String endpoint = "bma.tencentcloudapi.com";
    private static String service = "bma";
    private static String version = "2021-06-24";

    public BmaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmaClient(Credential credential, String region, ClientProfile profile) {
        super(BmaClient.endpoint, BmaClient.version, credential, region, profile);
    }

    /**
     *版权保护-新建拦截接口
     * @param req CreateCRBlockRequest
     * @return CreateCRBlockResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRBlockResponse CreateCRBlock(CreateCRBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *品牌经营管家-版权保护模块企业认证接口
     * @param req CreateCRCompanyVerifyRequest
     * @return CreateCRCompanyVerifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRCompanyVerifyResponse CreateCRCompanyVerify(CreateCRCompanyVerifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRCompanyVerifyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRCompanyVerifyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRCompanyVerify");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-新建发函接口
     * @param req CreateCRRightRequest
     * @return CreateCRRightResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRRightResponse CreateCRRight(CreateCRRightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRRightResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRRightResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRRight");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询作品基本信息
     * @param req DescribeCRWorkInfoRequest
     * @return DescribeCRWorkInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRWorkInfoResponse DescribeCRWorkInfo(DescribeCRWorkInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCRWorkInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCRWorkInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCRWorkInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
