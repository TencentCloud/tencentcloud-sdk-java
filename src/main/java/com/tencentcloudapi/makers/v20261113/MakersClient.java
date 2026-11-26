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
package com.tencentcloudapi.makers.v20261113;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.makers.v20261113.models.*;

public class MakersClient extends AbstractClient{
    private static String endpoint = "makers.tencentcloudapi.com";
    private static String service = "makers";
    private static String version = "2026-11-13";

    public MakersClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MakersClient(Credential credential, String region, ClientProfile profile) {
        super(MakersClient.endpoint, MakersClient.version, credential, region, profile);
    }

    /**
     *封禁或解封当前账号指定站点下的项目及域名。Status 支持 Ban或Normal。
     * @param req BlockProjectRequest
     * @return BlockProjectResponse
     * @throws TencentCloudSDKException
     */
    public BlockProjectResponse BlockProject(BlockProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BlockProject", BlockProjectResponse.class);
    }

    /**
     *创建部署。上传制品时 ViaMeta 和 Provider 传 Upload，TempBucketPath 传已上传对象的路径。
     * @param req CreateDeploymentRequest
     * @return CreateDeploymentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeploymentResponse CreateDeployment(CreateDeploymentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeployment", CreateDeploymentResponse.class);
    }

    /**
     *创建项目。上传制品时 Provider 传 Upload，Channel 传 Custom。
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *把一个自定义域名绑到项目的指定环境。
     * @param req CreateZoneCustomDomainRequest
     * @return CreateZoneCustomDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneCustomDomainResponse CreateZoneCustomDomain(CreateZoneCustomDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateZoneCustomDomain", CreateZoneCustomDomainResponse.class);
    }

    /**
     *删除项目。进行中的构建会阻止删除。
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *按域名解绑项目的自定义域名。
     * @param req DeleteProjectCustomDomainsRequest
     * @return DeleteProjectCustomDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectCustomDomainsResponse DeleteProjectCustomDomains(DeleteProjectCustomDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectCustomDomains", DeleteProjectCustomDomainsResponse.class);
    }

    /**
     *按 EnvVars 删除环境变量。按 Id 或 Key 匹配。Value 必填但不参与匹配，可传任意值。
     * @param req DeleteProjectEnvsRequest
     * @return DeleteProjectEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectEnvsResponse DeleteProjectEnvs(DeleteProjectEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProjectEnvs", DeleteProjectEnvsResponse.class);
    }

    /**
     *获取上传制品用的 COS 桶、地域、目标路径和临时密钥。
     * @param req DescribeCosTempTokenRequest
     * @return DescribeCosTempTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosTempTokenResponse DescribeCosTempToken(DescribeCosTempTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosTempToken", DescribeCosTempTokenResponse.class);
    }

    /**
     *返回构建日志的访问地址。
     * @param req DescribeDeploymentLogRequest
     * @return DescribeDeploymentLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeploymentLogResponse DescribeDeploymentLog(DescribeDeploymentLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeploymentLog", DescribeDeploymentLogResponse.class);
    }

    /**
     *查询项目的部署记录。
     * @param req DescribeDeploymentsRequest
     * @return DescribeDeploymentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeploymentsResponse DescribeDeployments(DescribeDeploymentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployments", DescribeDeploymentsResponse.class);
    }

    /**
     *查询项目下的环境，含内置 Production、Preview 和自定义环境。
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *查询项目环境变量。不传 Env 时返回全部作用域。
     * @param req DescribeProjectEnvsRequest
     * @return DescribeProjectEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectEnvsResponse DescribeProjectEnvs(DescribeProjectEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectEnvs", DescribeProjectEnvsResponse.class);
    }

    /**
     *分页查询站点下的项目。Offset 是页码偏移，后端按 Offset * Limit 跳过。
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *查询项目在站点下的自定义域名和预设域名。
     * @param req DescribeZoneCustomDomainsRequest
     * @return DescribeZoneCustomDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneCustomDomainsResponse DescribeZoneCustomDomains(DescribeZoneCustomDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneCustomDomains", DescribeZoneCustomDomainsResponse.class);
    }

    /**
     *修改项目名称和构建配置。未传的字段保持原值。
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *按传入的 EnvVars 写入环境变量。
     * @param req ModifyProjectEnvsRequest
     * @return ModifyProjectEnvsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectEnvsResponse ModifyProjectEnvs(ModifyProjectEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProjectEnvs", ModifyProjectEnvsResponse.class);
    }

    /**
     *把已绑定的自定义域名切到另一个环境。
     * @param req ModifyZoneCustomDomainEnvRequest
     * @return ModifyZoneCustomDomainEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneCustomDomainEnvResponse ModifyZoneCustomDomainEnv(ModifyZoneCustomDomainEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneCustomDomainEnv", ModifyZoneCustomDomainEnvResponse.class);
    }

}
