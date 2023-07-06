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
package com.tencentcloudapi.cloudstudio.v20210524;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudstudio.v20210524.models.*;

public class CloudstudioClient extends AbstractClient{
    private static String endpoint = "cloudstudio.tencentcloudapi.com";
    private static String service = "cloudstudio";
    private static String version = "2021-05-24";
    
    public CloudstudioClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudstudioClient(Credential credential, String region, ClientProfile profile) {
        super(CloudstudioClient.endpoint, CloudstudioClient.version, credential, region, profile);
    }

    /**
     *添加自定义模板
     * @param req CreateCustomizeTemplatesRequest
     * @return CreateCustomizeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomizeTemplatesResponse CreateCustomizeTemplates(CreateCustomizeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomizeTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomizeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomizeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云服务器方式创建工作空间
     * @param req CreateWorkspaceByAgentRequest
     * @return CreateWorkspaceByAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceByAgentResponse CreateWorkspaceByAgent(CreateWorkspaceByAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkspaceByAgentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkspaceByAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkspaceByAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *快速开始, 基于模板创建工作空间
     * @param req CreateWorkspaceByTemplateRequest
     * @return CreateWorkspaceByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceByTemplateResponse CreateWorkspaceByTemplate(CreateWorkspaceByTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkspaceByTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkspaceByTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkspaceByTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据模板创建工作空间
     * @param req CreateWorkspaceByVersionControlRequest
     * @return CreateWorkspaceByVersionControlResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceByVersionControlResponse CreateWorkspaceByVersionControl(CreateWorkspaceByVersionControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkspaceByVersionControlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkspaceByVersionControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkspaceByVersionControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为工作空间创建临时访问凭证，重复调用会创建新的 Token，旧的 Token 将会自动失效
     * @param req CreateWorkspaceTemporaryTokenRequest
     * @return CreateWorkspaceTemporaryTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceTemporaryTokenResponse CreateWorkspaceTemporaryToken(CreateWorkspaceTemporaryTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkspaceTemporaryTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkspaceTemporaryTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkspaceTemporaryToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义模板
     * @param req DeleteCustomizeTemplatesByIdRequest
     * @return DeleteCustomizeTemplatesByIdResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomizeTemplatesByIdResponse DeleteCustomizeTemplatesById(DeleteCustomizeTemplatesByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomizeTemplatesByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomizeTemplatesByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomizeTemplatesById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取所有模板列表
     * @param req DescribeCustomizeTemplatesRequest
     * @return DescribeCustomizeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizeTemplatesResponse DescribeCustomizeTemplates(DescribeCustomizeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomizeTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomizeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomizeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取特定模板信息
     * @param req DescribeCustomizeTemplatesByIdRequest
     * @return DescribeCustomizeTemplatesByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizeTemplatesByIdResponse DescribeCustomizeTemplatesById(DescribeCustomizeTemplatesByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomizeTemplatesByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomizeTemplatesByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomizeTemplatesById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取创建模板的预置参数
     * @param req DescribeCustomizeTemplatesPresetsRequest
     * @return DescribeCustomizeTemplatesPresetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizeTemplatesPresetsResponse DescribeCustomizeTemplatesPresets(DescribeCustomizeTemplatesPresetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomizeTemplatesPresetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomizeTemplatesPresetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomizeTemplatesPresets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *环境列表接口返回信息
     * @param req DescribeWorkspaceEnvListRequest
     * @return DescribeWorkspaceEnvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceEnvListResponse DescribeWorkspaceEnvList(DescribeWorkspaceEnvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceEnvListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceEnvListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceEnvList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取工作空间是否已经启动就绪
     * @param req DescribeWorkspaceIsReadyRequest
     * @return DescribeWorkspaceIsReadyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceIsReadyResponse DescribeWorkspaceIsReady(DescribeWorkspaceIsReadyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceIsReadyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceIsReadyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceIsReady");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查工作空间是否存在
     * @param req DescribeWorkspaceNameExistRequest
     * @return DescribeWorkspaceNameExistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceNameExistResponse DescribeWorkspaceNameExist(DescribeWorkspaceNameExistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceNameExistResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceNameExistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceNameExist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取工作空间元信息
     * @param req DescribeWorkspaceStatusRequest
     * @return DescribeWorkspaceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceStatusResponse DescribeWorkspaceStatus(DescribeWorkspaceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户工作空间列表
     * @param req DescribeWorkspaceStatusListRequest
     * @return DescribeWorkspaceStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceStatusListResponse DescribeWorkspaceStatusList(DescribeWorkspaceStatusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkspaceStatusListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkspaceStatusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkspaceStatusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改模板默认代码仓库
     * @param req ModifyCustomizeTemplateVersionControlRequest
     * @return ModifyCustomizeTemplateVersionControlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizeTemplateVersionControlResponse ModifyCustomizeTemplateVersionControl(ModifyCustomizeTemplateVersionControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizeTemplateVersionControlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizeTemplateVersionControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomizeTemplateVersionControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *全量修改自定义模板，不忽略空
     * @param req ModifyCustomizeTemplatesFullByIdRequest
     * @return ModifyCustomizeTemplatesFullByIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizeTemplatesFullByIdResponse ModifyCustomizeTemplatesFullById(ModifyCustomizeTemplatesFullByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizeTemplatesFullByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizeTemplatesFullByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomizeTemplatesFullById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *全量修改自定义模板，忽略空
     * @param req ModifyCustomizeTemplatesPartByIdRequest
     * @return ModifyCustomizeTemplatesPartByIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizeTemplatesPartByIdResponse ModifyCustomizeTemplatesPartById(ModifyCustomizeTemplatesPartByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizeTemplatesPartByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizeTemplatesPartByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomizeTemplatesPartById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改工作空间的名称和描述
     * @param req ModifyWorkspaceAttributesRequest
     * @return ModifyWorkspaceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspaceAttributesResponse ModifyWorkspaceAttributes(ModifyWorkspaceAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkspaceAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkspaceAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWorkspaceAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复工作空间

     * @param req RecoverWorkspaceRequest
     * @return RecoverWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public RecoverWorkspaceResponse RecoverWorkspace(RecoverWorkspaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverWorkspaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverWorkspaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverWorkspace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除工作空间
     * @param req RemoveWorkspaceRequest
     * @return RemoveWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public RemoveWorkspaceResponse RemoveWorkspace(RemoveWorkspaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveWorkspaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveWorkspaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveWorkspace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行空间
     * @param req RunWorkspaceRequest
     * @return RunWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public RunWorkspaceResponse RunWorkspace(RunWorkspaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunWorkspaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunWorkspaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunWorkspace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止运行空间
     * @param req StopWorkspaceRequest
     * @return StopWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public StopWorkspaceResponse StopWorkspace(StopWorkspaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopWorkspaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopWorkspaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopWorkspace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
