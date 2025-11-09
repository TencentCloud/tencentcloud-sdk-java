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
package com.tencentcloudapi.ags.v20250920;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ags.v20250920.models.*;

public class AgsClient extends AbstractClient{
    private static String endpoint = "ags.tencentcloudapi.com";
    private static String service = "ags";
    private static String version = "2025-09-20";

    public AgsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AgsClient(Credential credential, String region, ClientProfile profile) {
        super(AgsClient.endpoint, AgsClient.version, credential, region, profile);
    }

    /**
     *获取访问沙箱工具时所需要使用的访问Token，创建沙箱实例后需调用此接口获取沙箱实例访问Token。
此Token可用于调用代码沙箱实例执行代码，或浏览器沙箱实例进行浏览器操作等。
     * @param req AcquireSandboxInstanceTokenRequest
     * @return AcquireSandboxInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public AcquireSandboxInstanceTokenResponse AcquireSandboxInstanceToken(AcquireSandboxInstanceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcquireSandboxInstanceToken", AcquireSandboxInstanceTokenResponse.class);
    }

    /**
     *创建新的API密钥，用于调用Agent Sandbox接口。相较于腾讯云Secret ID Secret Key支持调用所有接口使用，仅有部分接口支持使用API密钥调用。
     * @param req CreateAPIKeyRequest
     * @return CreateAPIKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAPIKeyResponse CreateAPIKey(CreateAPIKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAPIKey", CreateAPIKeyResponse.class);
    }

    /**
     *创建沙箱工具
     * @param req CreateSandboxToolRequest
     * @return CreateSandboxToolResponse
     * @throws TencentCloudSDKException
     */
    public CreateSandboxToolResponse CreateSandboxTool(CreateSandboxToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSandboxTool", CreateSandboxToolResponse.class);
    }

    /**
     *删除API密钥。注意区别于腾讯云Secret ID Secret Key，本接口删除的是Agent Sandbox专用API key。
     * @param req DeleteAPIKeyRequest
     * @return DeleteAPIKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAPIKeyResponse DeleteAPIKey(DeleteAPIKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAPIKey", DeleteAPIKeyResponse.class);
    }

    /**
     *删除沙箱工具
     * @param req DeleteSandboxToolRequest
     * @return DeleteSandboxToolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSandboxToolResponse DeleteSandboxTool(DeleteSandboxToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSandboxTool", DeleteSandboxToolResponse.class);
    }

    /**
     *获取API密钥列表，包含API密钥简略信息，包含名称、创建时间等。
     * @param req DescribeAPIKeyListRequest
     * @return DescribeAPIKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIKeyListResponse DescribeAPIKeyList(DescribeAPIKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPIKeyList", DescribeAPIKeyListResponse.class);
    }

    /**
     *查询沙箱实例列表
     * @param req DescribeSandboxInstanceListRequest
     * @return DescribeSandboxInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxInstanceListResponse DescribeSandboxInstanceList(DescribeSandboxInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxInstanceList", DescribeSandboxInstanceListResponse.class);
    }

    /**
     *查询沙箱工具列表
     * @param req DescribeSandboxToolListRequest
     * @return DescribeSandboxToolListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxToolListResponse DescribeSandboxToolList(DescribeSandboxToolListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxToolList", DescribeSandboxToolListResponse.class);
    }

    /**
     *启动沙箱实例
     * @param req StartSandboxInstanceRequest
     * @return StartSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartSandboxInstanceResponse StartSandboxInstance(StartSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartSandboxInstance", StartSandboxInstanceResponse.class);
    }

    /**
     *停止沙箱实例
     * @param req StopSandboxInstanceRequest
     * @return StopSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopSandboxInstanceResponse StopSandboxInstance(StopSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSandboxInstance", StopSandboxInstanceResponse.class);
    }

    /**
     *更新沙箱实例
     * @param req UpdateSandboxInstanceRequest
     * @return UpdateSandboxInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSandboxInstanceResponse UpdateSandboxInstance(UpdateSandboxInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSandboxInstance", UpdateSandboxInstanceResponse.class);
    }

    /**
     *更新沙箱工具
     * @param req UpdateSandboxToolRequest
     * @return UpdateSandboxToolResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSandboxToolResponse UpdateSandboxTool(UpdateSandboxToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSandboxTool", UpdateSandboxToolResponse.class);
    }

}
