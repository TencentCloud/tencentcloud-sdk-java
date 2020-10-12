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
package com.tencentcloudapi.domain.v20180808;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.domain.v20180808.models.*;

public class DomainClient extends AbstractClient{
    private static String endpoint = "domain.tencentcloudapi.com";
    private static String version = "2018-08-08";

    public DomainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DomainClient(Credential credential, String region, ClientProfile profile) {
        super(DomainClient.endpoint, DomainClient.version, credential, region, profile);
    }

    /**
     *本接口 ( CheckBatchStatus ) 用于检查批量任务状态 。

默认接口请求频率限制：20次/秒。
     * @param req CheckBatchStatusRequest
     * @return CheckBatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckBatchStatusResponse CheckBatchStatus(CheckBatchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBatchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBatchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBatchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查域名是否可以注册。
     * @param req CheckDomainRequest
     * @return CheckDomainResponse
     * @throws TencentCloudSDKException
     */
    public CheckDomainResponse CheckDomain(CheckDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( CreateDomainBatch ) 用于批量注册域名 。

默认接口请求频率限制：20次/秒。
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (  DescribeDomainBaseInfo) 获取域名基础信息。

默认接口请求频率限制：20次/秒。

     * @param req DescribeDomainBaseInfoRequest
     * @return DescribeDomainBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainBaseInfoResponse DescribeDomainBaseInfo(DescribeDomainBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainBaseInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainBaseInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainBaseInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (  DescribeDomainNameList ) 获取域名列表。

默认接口请求频率限制：20次/秒。

     * @param req DescribeDomainNameListRequest
     * @return DescribeDomainNameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainNameListResponse DescribeDomainNameList(DescribeDomainNameListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainNameListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainNameListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainNameList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照域名后缀获取对应的价格列表
     * @param req DescribeDomainPriceListRequest
     * @return DescribeDomainPriceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPriceListResponse DescribeDomainPriceList(DescribeDomainPriceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainPriceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainPriceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainPriceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeTemplateList) 用于获取模板列表。

默认接口请求频率限制：20次/秒。

     * @param req DescribeTemplateListRequest
     * @return DescribeTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateListResponse DescribeTemplateList(DescribeTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
