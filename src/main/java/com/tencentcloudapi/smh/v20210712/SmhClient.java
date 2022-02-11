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
package com.tencentcloudapi.smh.v20210712;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.smh.v20210712.models.*;

public class SmhClient extends AbstractClient{
    private static String endpoint = "smh.tencentcloudapi.com";
    private static String service = "smh";
    private static String version = "2021-07-12";

    public SmhClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SmhClient(Credential credential, String region, ClientProfile profile) {
        super(SmhClient.endpoint, SmhClient.version, credential, region, profile);
    }

    /**
     *创建 PaaS 服务媒体库
     * @param req CreateLibraryRequest
     * @return CreateLibraryResponse
     * @throws TencentCloudSDKException
     */
    public CreateLibraryResponse CreateLibrary(CreateLibraryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLibraryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLibraryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLibrary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除 PaaS 服务媒体库
     * @param req DeleteLibraryRequest
     * @return DeleteLibraryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLibraryResponse DeleteLibrary(DeleteLibraryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLibraryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLibraryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLibrary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 PaaS 服务媒体库列表
     * @param req DescribeLibrariesRequest
     * @return DescribeLibrariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibrariesResponse DescribeLibraries(DescribeLibrariesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLibrariesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLibrariesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLibraries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 PaaS 服务媒体库密钥
     * @param req DescribeLibrarySecretRequest
     * @return DescribeLibrarySecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibrarySecretResponse DescribeLibrarySecret(DescribeLibrarySecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLibrarySecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLibrarySecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLibrarySecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询官方云盘实例
     * @param req DescribeOfficialInstancesRequest
     * @return DescribeOfficialInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfficialInstancesResponse DescribeOfficialInstances(DescribeOfficialInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfficialInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfficialInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfficialInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询官方云盘实例概览数据
     * @param req DescribeOfficialOverviewRequest
     * @return DescribeOfficialOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfficialOverviewResponse DescribeOfficialOverview(DescribeOfficialOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfficialOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfficialOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfficialOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流量资源包
     * @param req DescribeTrafficPackagesRequest
     * @return DescribeTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficPackagesResponse DescribeTrafficPackages(DescribeTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficPackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficPackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrafficPackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 PaaS 服务媒体库配置项
     * @param req ModifyLibraryRequest
     * @return ModifyLibraryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLibraryResponse ModifyLibrary(ModifyLibraryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLibraryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLibraryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLibrary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送用于换绑官方云盘实例的超级管理员账号的短信验证码
     * @param req SendSmsCodeRequest
     * @return SendSmsCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsCodeResponse SendSmsCode(SendSmsCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendSmsCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendSmsCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendSmsCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证短信验证码以换绑官方云盘实例的超级管理员账号
     * @param req VerifySmsCodeRequest
     * @return VerifySmsCodeResponse
     * @throws TencentCloudSDKException
     */
    public VerifySmsCodeResponse VerifySmsCode(VerifySmsCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifySmsCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifySmsCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifySmsCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
