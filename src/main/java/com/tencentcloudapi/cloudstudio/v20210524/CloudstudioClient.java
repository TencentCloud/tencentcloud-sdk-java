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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomizeTemplates", CreateCustomizeTemplatesResponse.class);
    }

    /**
     *云服务器方式创建工作空间
     * @param req CreateWorkspaceByAgentRequest
     * @return CreateWorkspaceByAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceByAgentResponse CreateWorkspaceByAgent(CreateWorkspaceByAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceByAgent", CreateWorkspaceByAgentResponse.class);
    }

    /**
     *快速开始, 基于模板创建工作空间
     * @param req CreateWorkspaceByTemplateRequest
     * @return CreateWorkspaceByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceByTemplateResponse CreateWorkspaceByTemplate(CreateWorkspaceByTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceByTemplate", CreateWorkspaceByTemplateResponse.class);
    }

    /**
     *根据模板创建工作空间
     * @param req CreateWorkspaceByVersionControlRequest
     * @return CreateWorkspaceByVersionControlResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceByVersionControlResponse CreateWorkspaceByVersionControl(CreateWorkspaceByVersionControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceByVersionControl", CreateWorkspaceByVersionControlResponse.class);
    }

    /**
     *为工作空间创建临时访问凭证，重复调用会创建新的 Token，旧的 Token 将会自动失效
     * @param req CreateWorkspaceTemporaryTokenRequest
     * @return CreateWorkspaceTemporaryTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceTemporaryTokenResponse CreateWorkspaceTemporaryToken(CreateWorkspaceTemporaryTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceTemporaryToken", CreateWorkspaceTemporaryTokenResponse.class);
    }

    /**
     *删除自定义模板
     * @param req DeleteCustomizeTemplatesByIdRequest
     * @return DeleteCustomizeTemplatesByIdResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomizeTemplatesByIdResponse DeleteCustomizeTemplatesById(DeleteCustomizeTemplatesByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomizeTemplatesById", DeleteCustomizeTemplatesByIdResponse.class);
    }

    /**
     *获取所有模板列表
     * @param req DescribeCustomizeTemplatesRequest
     * @return DescribeCustomizeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizeTemplatesResponse DescribeCustomizeTemplates(DescribeCustomizeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizeTemplates", DescribeCustomizeTemplatesResponse.class);
    }

    /**
     *获取特定模板信息
     * @param req DescribeCustomizeTemplatesByIdRequest
     * @return DescribeCustomizeTemplatesByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizeTemplatesByIdResponse DescribeCustomizeTemplatesById(DescribeCustomizeTemplatesByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizeTemplatesById", DescribeCustomizeTemplatesByIdResponse.class);
    }

    /**
     *获取创建模板的预置参数
     * @param req DescribeCustomizeTemplatesPresetsRequest
     * @return DescribeCustomizeTemplatesPresetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizeTemplatesPresetsResponse DescribeCustomizeTemplatesPresets(DescribeCustomizeTemplatesPresetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizeTemplatesPresets", DescribeCustomizeTemplatesPresetsResponse.class);
    }

    /**
     *环境列表接口返回信息
     * @param req DescribeWorkspaceEnvListRequest
     * @return DescribeWorkspaceEnvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceEnvListResponse DescribeWorkspaceEnvList(DescribeWorkspaceEnvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceEnvList", DescribeWorkspaceEnvListResponse.class);
    }

    /**
     *获取工作空间是否已经启动就绪
     * @param req DescribeWorkspaceIsReadyRequest
     * @return DescribeWorkspaceIsReadyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceIsReadyResponse DescribeWorkspaceIsReady(DescribeWorkspaceIsReadyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceIsReady", DescribeWorkspaceIsReadyResponse.class);
    }

    /**
     *检查工作空间是否存在
     * @param req DescribeWorkspaceNameExistRequest
     * @return DescribeWorkspaceNameExistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceNameExistResponse DescribeWorkspaceNameExist(DescribeWorkspaceNameExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceNameExist", DescribeWorkspaceNameExistResponse.class);
    }

    /**
     *获取工作空间元信息
     * @param req DescribeWorkspaceStatusRequest
     * @return DescribeWorkspaceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceStatusResponse DescribeWorkspaceStatus(DescribeWorkspaceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceStatus", DescribeWorkspaceStatusResponse.class);
    }

    /**
     *获取用户工作空间列表
     * @param req DescribeWorkspaceStatusListRequest
     * @return DescribeWorkspaceStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceStatusListResponse DescribeWorkspaceStatusList(DescribeWorkspaceStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceStatusList", DescribeWorkspaceStatusListResponse.class);
    }

    /**
     *修改模板默认代码仓库
     * @param req ModifyCustomizeTemplateVersionControlRequest
     * @return ModifyCustomizeTemplateVersionControlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizeTemplateVersionControlResponse ModifyCustomizeTemplateVersionControl(ModifyCustomizeTemplateVersionControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomizeTemplateVersionControl", ModifyCustomizeTemplateVersionControlResponse.class);
    }

    /**
     *全量修改自定义模板，不忽略空
     * @param req ModifyCustomizeTemplatesFullByIdRequest
     * @return ModifyCustomizeTemplatesFullByIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizeTemplatesFullByIdResponse ModifyCustomizeTemplatesFullById(ModifyCustomizeTemplatesFullByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomizeTemplatesFullById", ModifyCustomizeTemplatesFullByIdResponse.class);
    }

    /**
     *全量修改自定义模板，忽略空
     * @param req ModifyCustomizeTemplatesPartByIdRequest
     * @return ModifyCustomizeTemplatesPartByIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizeTemplatesPartByIdResponse ModifyCustomizeTemplatesPartById(ModifyCustomizeTemplatesPartByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomizeTemplatesPartById", ModifyCustomizeTemplatesPartByIdResponse.class);
    }

    /**
     *修改工作空间的名称和描述
     * @param req ModifyWorkspaceAttributesRequest
     * @return ModifyWorkspaceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspaceAttributesResponse ModifyWorkspaceAttributes(ModifyWorkspaceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkspaceAttributes", ModifyWorkspaceAttributesResponse.class);
    }

    /**
     *恢复工作空间

     * @param req RecoverWorkspaceRequest
     * @return RecoverWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public RecoverWorkspaceResponse RecoverWorkspace(RecoverWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverWorkspace", RecoverWorkspaceResponse.class);
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
