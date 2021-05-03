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
package com.tencentcloudapi.tem.v20201221;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tem.v20201221.models.*;

public class TemClient extends AbstractClient{
    private static String endpoint = "tem.tencentcloudapi.com";
    private static String service = "tem";
    private static String version = "2020-12-21";

    public TemClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TemClient(Credential credential, String region, ClientProfile profile) {
        super(TemClient.endpoint, TemClient.version, credential, region, profile);
    }

    /**
     *生成Cos临时秘钥
     * @param req CreateCosTokenRequest
     * @return CreateCosTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosTokenResponse CreateCosToken(CreateCosTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCosTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCosToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建命名空间
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取租户命名空间列表
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或者更新 Ingress 规则
     * @param req ModifyIngressRequest
     * @return ModifyIngressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIngressResponse ModifyIngress(ModifyIngressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIngressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIngressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIngress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑命名空间
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
