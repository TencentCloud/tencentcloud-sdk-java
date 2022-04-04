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
package com.tencentcloudapi.bsca.v20210811;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bsca.v20210811.models.*;

public class BscaClient extends AbstractClient{
    private static String endpoint = "bsca.tencentcloudapi.com";
    private static String service = "bsca";
    private static String version = "2021-08-11";

    public BscaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BscaClient(Credential credential, String region, ClientProfile profile) {
        super(BscaClient.endpoint, BscaClient.version, credential, region, profile);
    }

    /**
     *本接口(DescribeKBComponent)用于在知识库中查询开源组件信息。本接口根据用户输入的PURL在知识库中寻找对应的开源组件，其中Name为必填字段。
     * @param req DescribeKBComponentRequest
     * @return DescribeKBComponentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBComponentResponse DescribeKBComponent(DescribeKBComponentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKBComponentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKBComponentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKBComponent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeKBComponentVulnerability)用于在知识库中查询开源组件的漏洞信息。
     * @param req DescribeKBComponentVulnerabilityRequest
     * @return DescribeKBComponentVulnerabilityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBComponentVulnerabilityResponse DescribeKBComponentVulnerability(DescribeKBComponentVulnerabilityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKBComponentVulnerabilityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKBComponentVulnerabilityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKBComponentVulnerability");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeKBLicense)用于在知识库中查询许可证信息。
     * @param req DescribeKBLicenseRequest
     * @return DescribeKBLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBLicenseResponse DescribeKBLicense(DescribeKBLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKBLicenseResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKBLicenseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKBLicense");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeKBVulnerability)用于在知识库中查询漏洞详细信息，支持根据CVE ID查询或者根据Vul ID查询。
     * @param req DescribeKBVulnerabilityRequest
     * @return DescribeKBVulnerabilityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBVulnerabilityResponse DescribeKBVulnerability(DescribeKBVulnerabilityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKBVulnerabilityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKBVulnerabilityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKBVulnerability");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
