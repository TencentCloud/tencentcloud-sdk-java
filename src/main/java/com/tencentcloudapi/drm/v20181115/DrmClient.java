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
package com.tencentcloudapi.drm.v20181115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.drm.v20181115.models.*;

public class DrmClient extends AbstractClient{
    private static String endpoint = "drm.tencentcloudapi.com";
    private static String version = "2018-11-15";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public DrmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public DrmClient(Credential credential, String region, ClientProfile profile) {
        super(DrmClient.endpoint, DrmClient.version, credential, region, profile);
    }

    /**
     *本接口用来生成DRM方案对应的播放许可证，开发者需提供DRM方案类型、内容类型参数，后台将生成许可证后返回许可证数据
开发者需要转发终端设备发出的许可证请求信息。
     * @param req CreateLicenseRequest
     * @return CreateLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateLicenseResponse CreateLicense(CreateLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLicenseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLicenseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLicense"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开发者需要指定使用的DRM类型、和需要加密的Track类型，后台返回加密使用的密钥
如果加密使用的ContentID没有关联的密钥信息，后台会自动生成新的密钥返回

     * @param req DescribeKeysRequest
     * @return DescribeKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeysResponse DescribeKeys(DescribeKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开发者调用该接口，启动一次内容文件的DRM加密工作流
     * @param req StartEncryptionRequest
     * @return StartEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public StartEncryptionResponse StartEncryption(StartEncryptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartEncryptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartEncryptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartEncryption"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
