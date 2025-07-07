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
package com.tencentcloudapi.cloudstudio.v20230508;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudstudio.v20230508.models.*;

public class CloudstudioClient extends AbstractClient{
    private static String endpoint = "cloudstudio.tencentcloudapi.com";
    private static String service = "cloudstudio";
    private static String version = "2023-05-08";

    public CloudstudioClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudstudioClient(Credential credential, String region, ClientProfile profile) {
        super(CloudstudioClient.endpoint, CloudstudioClient.version, credential, region, profile);
    }

    /**
     *创建工作空间
     * @param req CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceResponse CreateWorkspace(CreateWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspace", CreateWorkspaceResponse.class);
    }

    /**
     *创建工作空间临时访问凭证，重复调用会创建新的 Token，旧的 Token 将会自动失效
     * @param req CreateWorkspaceTokenRequest
     * @return CreateWorkspaceTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceTokenResponse CreateWorkspaceToken(CreateWorkspaceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceToken", CreateWorkspaceTokenResponse.class);
    }

    /**
     *获取用户配置
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfig", DescribeConfigResponse.class);
    }

    /**
     *获取基础镜像列表
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *获取用户工作空间列表
     * @param req DescribeWorkspacesRequest
     * @return DescribeWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspacesResponse DescribeWorkspaces(DescribeWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaces", DescribeWorkspacesResponse.class);
    }

    /**
     *修改工作空间
     * @param req ModifyWorkspaceRequest
     * @return ModifyWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspaceResponse ModifyWorkspace(ModifyWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkspace", ModifyWorkspaceResponse.class);
    }

    /**
     *删除工作空间
     * @param req RemoveWorkspaceRequest
     * @return RemoveWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWorkspaceResponse RemoveWorkspace(RemoveWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveWorkspace", RemoveWorkspaceResponse.class);
    }

    /**
     *运行空间
     * @param req RunWorkspaceRequest
     * @return RunWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public RunWorkspaceResponse RunWorkspace(RunWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunWorkspace", RunWorkspaceResponse.class);
    }

    /**
     *停止运行空间
     * @param req StopWorkspaceRequest
     * @return StopWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public StopWorkspaceResponse StopWorkspace(StopWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopWorkspace", StopWorkspaceResponse.class);
    }

}
