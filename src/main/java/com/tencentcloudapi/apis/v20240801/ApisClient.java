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
package com.tencentcloudapi.apis.v20240801;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apis.v20240801.models.*;

public class ApisClient extends AbstractClient{
    private static String endpoint = "apis.tencentcloudapi.com";
    private static String service = "apis";
    private static String version = "2024-08-01";

    public ApisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApisClient(Credential credential, String region, ClientProfile profile) {
        super(ApisClient.endpoint, ApisClient.version, credential, region, profile);
    }

    /**
     *创建app
     * @param req CreateAgentAppRequest
     * @return CreateAgentAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentAppResponse CreateAgentApp(CreateAgentAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentApp", CreateAgentAppResponse.class);
    }

    /**
     *创建app的mcp server关联
     * @param req CreateAgentAppMcpServersRequest
     * @return CreateAgentAppMcpServersResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentAppMcpServersResponse CreateAgentAppMcpServers(CreateAgentAppMcpServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentAppMcpServers", CreateAgentAppMcpServersResponse.class);
    }

    /**
     *创建app的model service关联
     * @param req CreateAgentAppModelServicesRequest
     * @return CreateAgentAppModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentAppModelServicesResponse CreateAgentAppModelServices(CreateAgentAppModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentAppModelServices", CreateAgentAppModelServicesResponse.class);
    }

    /**
     *创建Credential
     * @param req CreateAgentCredentialRequest
     * @return CreateAgentCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgentCredentialResponse CreateAgentCredential(CreateAgentCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAgentCredential", CreateAgentCredentialResponse.class);
    }

    /**
     *创建mcp server
     * @param req CreateMcpServerRequest
     * @return CreateMcpServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateMcpServerResponse CreateMcpServer(CreateMcpServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMcpServer", CreateMcpServerResponse.class);
    }

    /**
     *创建模型
     * @param req CreateModelRequest
     * @return CreateModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelResponse CreateModel(CreateModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModel", CreateModelResponse.class);
    }

    /**
     *创建模型服务
     * @param req CreateModelServiceRequest
     * @return CreateModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelServiceResponse CreateModelService(CreateModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModelService", CreateModelServiceResponse.class);
    }

    /**
     *删除app
     * @param req DeleteAgentAppRequest
     * @return DeleteAgentAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentAppResponse DeleteAgentApp(DeleteAgentAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgentApp", DeleteAgentAppResponse.class);
    }

    /**
     *删除app的mcp server
     * @param req DeleteAgentAppMcpServersRequest
     * @return DeleteAgentAppMcpServersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentAppMcpServersResponse DeleteAgentAppMcpServers(DeleteAgentAppMcpServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgentAppMcpServers", DeleteAgentAppMcpServersResponse.class);
    }

    /**
     *删除app的model service关联
     * @param req DeleteAgentAppModelServicesRequest
     * @return DeleteAgentAppModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentAppModelServicesResponse DeleteAgentAppModelServices(DeleteAgentAppModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgentAppModelServices", DeleteAgentAppModelServicesResponse.class);
    }

    /**
     *删除Credential
     * @param req DeleteAgentCredentialRequest
     * @return DeleteAgentCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAgentCredentialResponse DeleteAgentCredential(DeleteAgentCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAgentCredential", DeleteAgentCredentialResponse.class);
    }

    /**
     *删除mcp server
     * @param req DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMcpServerResponse DeleteMcpServer(DeleteMcpServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMcpServer", DeleteMcpServerResponse.class);
    }

    /**
     *删除模型
     * @param req DeleteModelRequest
     * @return DeleteModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelResponse DeleteModel(DeleteModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModel", DeleteModelResponse.class);
    }

    /**
     *删除模型服务
     * @param req DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceResponse DeleteModelService(DeleteModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelService", DeleteModelServiceResponse.class);
    }

    /**
     *查询app详情
     * @param req DescribeAgentAppRequest
     * @return DescribeAgentAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAppResponse DescribeAgentApp(DescribeAgentAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentApp", DescribeAgentAppResponse.class);
    }

    /**
     *查询app mcpServer关联列表
     * @param req DescribeAgentAppMcpServersRequest
     * @return DescribeAgentAppMcpServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAppMcpServersResponse DescribeAgentAppMcpServers(DescribeAgentAppMcpServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentAppMcpServers", DescribeAgentAppMcpServersResponse.class);
    }

    /**
     *查询app modelService关联列表
     * @param req DescribeAgentAppModelServicesRequest
     * @return DescribeAgentAppModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAppModelServicesResponse DescribeAgentAppModelServices(DescribeAgentAppModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentAppModelServices", DescribeAgentAppModelServicesResponse.class);
    }

    /**
     *查询app列表
     * @param req DescribeAgentAppsRequest
     * @return DescribeAgentAppsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAppsResponse DescribeAgentApps(DescribeAgentAppsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentApps", DescribeAgentAppsResponse.class);
    }

    /**
     *查询Credential详情
     * @param req DescribeAgentCredentialRequest
     * @return DescribeAgentCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentCredentialResponse DescribeAgentCredential(DescribeAgentCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentCredential", DescribeAgentCredentialResponse.class);
    }

    /**
     *查询Credential列表
     * @param req DescribeAgentCredentialsRequest
     * @return DescribeAgentCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentCredentialsResponse DescribeAgentCredentials(DescribeAgentCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentCredentials", DescribeAgentCredentialsResponse.class);
    }

    /**
     *查询mcp server详情
     * @param req DescribeMcpServerRequest
     * @return DescribeMcpServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMcpServerResponse DescribeMcpServer(DescribeMcpServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMcpServer", DescribeMcpServerResponse.class);
    }

    /**
     *查询mcp server列表
     * @param req DescribeMcpServersRequest
     * @return DescribeMcpServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMcpServersResponse DescribeMcpServers(DescribeMcpServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMcpServers", DescribeMcpServersResponse.class);
    }

    /**
     *查询模型详情
     * @param req DescribeModelRequest
     * @return DescribeModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelResponse DescribeModel(DescribeModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModel", DescribeModelResponse.class);
    }

    /**
     *查询模型服务详情
     * @param req DescribeModelServiceRequest
     * @return DescribeModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceResponse DescribeModelService(DescribeModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelService", DescribeModelServiceResponse.class);
    }

    /**
     *查询模型服务列表
     * @param req DescribeModelServicesRequest
     * @return DescribeModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServicesResponse DescribeModelServices(DescribeModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServices", DescribeModelServicesResponse.class);
    }

    /**
     *查询模型列表
     * @param req DescribeModelsRequest
     * @return DescribeModelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelsResponse DescribeModels(DescribeModelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModels", DescribeModelsResponse.class);
    }

    /**
     *修改app
     * @param req ModifyAgentAppRequest
     * @return ModifyAgentAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentAppResponse ModifyAgentApp(ModifyAgentAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentApp", ModifyAgentAppResponse.class);
    }

    /**
     *编辑app的model service关联
     * @param req ModifyAgentAppModelServicesRequest
     * @return ModifyAgentAppModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentAppModelServicesResponse ModifyAgentAppModelServices(ModifyAgentAppModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentAppModelServices", ModifyAgentAppModelServicesResponse.class);
    }

    /**
     *修改Credential
     * @param req ModifyAgentCredentialRequest
     * @return ModifyAgentCredentialResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentCredentialResponse ModifyAgentCredential(ModifyAgentCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentCredential", ModifyAgentCredentialResponse.class);
    }

    /**
     *修改mcp server
     * @param req ModifyMcpServerRequest
     * @return ModifyMcpServerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMcpServerResponse ModifyMcpServer(ModifyMcpServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMcpServer", ModifyMcpServerResponse.class);
    }

    /**
     *修改模型
     * @param req ModifyModelRequest
     * @return ModifyModelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelResponse ModifyModel(ModifyModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModel", ModifyModelResponse.class);
    }

    /**
     *修改模型服务
     * @param req ModifyModelServiceRequest
     * @return ModifyModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServiceResponse ModifyModelService(ModifyModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelService", ModifyModelServiceResponse.class);
    }

}
