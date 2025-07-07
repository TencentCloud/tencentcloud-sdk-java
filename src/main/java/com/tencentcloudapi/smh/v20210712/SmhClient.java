/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLibrary", CreateLibraryResponse.class);
    }

    /**
     *新建用户。
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *设置用户生命周期。如果指定的用户已经设置了生命周期，重复调用此接口将覆盖已有的设置。也可用于清除指定用户的生命周期。
     * @param req CreateUserLifecycleRequest
     * @return CreateUserLifecycleResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserLifecycleResponse CreateUserLifecycle(CreateUserLifecycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserLifecycle", CreateUserLifecycleResponse.class);
    }

    /**
     *删除 PaaS 服务媒体库
     * @param req DeleteLibraryRequest
     * @return DeleteLibraryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLibraryResponse DeleteLibrary(DeleteLibraryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLibrary", DeleteLibraryResponse.class);
    }

    /**
     *一次删除多个用户。
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *查询 PaaS 服务媒体库列表
     * @param req DescribeLibrariesRequest
     * @return DescribeLibrariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibrariesResponse DescribeLibraries(DescribeLibrariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLibraries", DescribeLibrariesResponse.class);
    }

    /**
     *查询 PaaS 服务媒体库密钥
     * @param req DescribeLibrarySecretRequest
     * @return DescribeLibrarySecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibrarySecretResponse DescribeLibrarySecret(DescribeLibrarySecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLibrarySecret", DescribeLibrarySecretResponse.class);
    }

    /**
     *查询官方云盘实例
     * @param req DescribeOfficialInstancesRequest
     * @return DescribeOfficialInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfficialInstancesResponse DescribeOfficialInstances(DescribeOfficialInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfficialInstances", DescribeOfficialInstancesResponse.class);
    }

    /**
     *查询官方云盘实例概览数据
     * @param req DescribeOfficialOverviewRequest
     * @return DescribeOfficialOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfficialOverviewResponse DescribeOfficialOverview(DescribeOfficialOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfficialOverview", DescribeOfficialOverviewResponse.class);
    }

    /**
     *查询流量资源包
     * @param req DescribeTrafficPackagesRequest
     * @return DescribeTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficPackagesResponse DescribeTrafficPackages(DescribeTrafficPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrafficPackages", DescribeTrafficPackagesResponse.class);
    }

    /**
     *查询用户生命周期。
     * @param req DescribeUserLifecycleRequest
     * @return DescribeUserLifecycleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserLifecycleResponse DescribeUserLifecycle(DescribeUserLifecycleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserLifecycle", DescribeUserLifecycleResponse.class);
    }

    /**
     *修改 PaaS 服务媒体库配置项
     * @param req ModifyLibraryRequest
     * @return ModifyLibraryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLibraryResponse ModifyLibrary(ModifyLibraryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLibrary", ModifyLibraryResponse.class);
    }

    /**
     *更新用户信息。
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *发送用于换绑官方云盘实例的超级管理员账号的短信验证码
     * @param req SendSmsCodeRequest
     * @return SendSmsCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsCodeResponse SendSmsCode(SendSmsCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendSmsCode", SendSmsCodeResponse.class);
    }

    /**
     *验证短信验证码以换绑官方云盘实例的超级管理员账号
     * @param req VerifySmsCodeRequest
     * @return VerifySmsCodeResponse
     * @throws TencentCloudSDKException
     */
    public VerifySmsCodeResponse VerifySmsCode(VerifySmsCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifySmsCode", VerifySmsCodeResponse.class);
    }

}
