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
package com.tencentcloudapi.tcr.v20190924;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcr.v20190924.models.*;

public class TcrClient extends AbstractClient{
    private static String endpoint = "tcr.tencentcloudapi.com";
    private static String service = "tcr";
    private static String version = "2019-09-24";
    
    public TcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcrClient(Credential credential, String region, ClientProfile profile) {
        super(TcrClient.endpoint, TcrClient.version, credential, region, profile);
    }

    /**
     *用于在个人版镜像仓库中批量删除Tag
     * @param req BatchDeleteImagePersonalRequest
     * @return BatchDeleteImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteImagePersonalResponse BatchDeleteImagePersonal(BatchDeleteImagePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteImagePersonal", BatchDeleteImagePersonalResponse.class);
    }

    /**
     *用于个人版镜像仓库中批量删除镜像仓库
     * @param req BatchDeleteRepositoryPersonalRequest
     * @return BatchDeleteRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRepositoryPersonalResponse BatchDeleteRepositoryPersonal(BatchDeleteRepositoryPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteRepositoryPersonal", BatchDeleteRepositoryPersonalResponse.class);
    }

    /**
     *用于校验企业版实例信息
     * @param req CheckInstanceRequest
     * @return CheckInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstanceResponse CheckInstance(CheckInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckInstance", CheckInstanceResponse.class);
    }

    /**
     *检查待创建的实例名称是否符合规范
     * @param req CheckInstanceNameRequest
     * @return CheckInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstanceNameResponse CheckInstanceName(CheckInstanceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckInstanceName", CheckInstanceNameResponse.class);
    }

    /**
     *用于创建应用更新触发器
     * @param req CreateApplicationTriggerPersonalRequest
     * @return CreateApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationTriggerPersonalResponse CreateApplicationTriggerPersonal(CreateApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationTriggerPersonal", CreateApplicationTriggerPersonalResponse.class);
    }

    /**
     *创建镜像加速服务
     * @param req CreateImageAccelerationServiceRequest
     * @return CreateImageAccelerationServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageAccelerationServiceResponse CreateImageAccelerationService(CreateImageAccelerationServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageAccelerationService", CreateImageAccelerationServiceResponse.class);
    }

    /**
     *创建镜像不可变规则
     * @param req CreateImmutableTagRulesRequest
     * @return CreateImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateImmutableTagRulesResponse CreateImmutableTagRules(CreateImmutableTagRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImmutableTagRules", CreateImmutableTagRulesResponse.class);
    }

    /**
     *创建实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *创建自定义域名
     * @param req CreateInstanceCustomizedDomainRequest
     * @return CreateInstanceCustomizedDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceCustomizedDomainResponse CreateInstanceCustomizedDomain(CreateInstanceCustomizedDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceCustomizedDomain", CreateInstanceCustomizedDomainResponse.class);
    }

    /**
     *创建实例的临时或长期访问凭证
     * @param req CreateInstanceTokenRequest
     * @return CreateInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceTokenResponse CreateInstanceToken(CreateInstanceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceToken", CreateInstanceTokenResponse.class);
    }

    /**
     *创建tcr内网私有域名解析
     * @param req CreateInternalEndpointDnsRequest
     * @return CreateInternalEndpointDnsResponse
     * @throws TencentCloudSDKException
     */
    public CreateInternalEndpointDnsResponse CreateInternalEndpointDns(CreateInternalEndpointDnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInternalEndpointDns", CreateInternalEndpointDnsResponse.class);
    }

    /**
     *用于在TCR实例中，创建多个白名单策略
     * @param req CreateMultipleSecurityPolicyRequest
     * @return CreateMultipleSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultipleSecurityPolicyResponse CreateMultipleSecurityPolicy(CreateMultipleSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMultipleSecurityPolicy", CreateMultipleSecurityPolicyResponse.class);
    }

    /**
     *用于在企业版中创建命名空间
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
    }

    /**
     *创建个人版镜像仓库命名空间，此命名空间全局唯一
     * @param req CreateNamespacePersonalRequest
     * @return CreateNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespacePersonalResponse CreateNamespacePersonal(CreateNamespacePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespacePersonal", CreateNamespacePersonalResponse.class);
    }

    /**
     *创建从实例
     * @param req CreateReplicationInstanceRequest
     * @return CreateReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateReplicationInstanceResponse CreateReplicationInstance(CreateReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReplicationInstance", CreateReplicationInstanceResponse.class);
    }

    /**
     *用于企业版创建镜像仓库
     * @param req CreateRepositoryRequest
     * @return CreateRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryResponse CreateRepository(CreateRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRepository", CreateRepositoryResponse.class);
    }

    /**
     *用于在个人版仓库中创建镜像仓库
     * @param req CreateRepositoryPersonalRequest
     * @return CreateRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateRepositoryPersonalResponse CreateRepositoryPersonal(CreateRepositoryPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRepositoryPersonal", CreateRepositoryPersonalResponse.class);
    }

    /**
     *创建实例公网访问白名单策略
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityPolicy", CreateSecurityPolicyResponse.class);
    }

    /**
     *创建服务级账户
     * @param req CreateServiceAccountRequest
     * @return CreateServiceAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceAccountResponse CreateServiceAccount(CreateServiceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceAccount", CreateServiceAccountResponse.class);
    }

    /**
     *为一个镜像版本创建签名
     * @param req CreateSignatureRequest
     * @return CreateSignatureResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignatureResponse CreateSignature(CreateSignatureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSignature", CreateSignatureResponse.class);
    }

    /**
     *创建镜像签名策略
     * @param req CreateSignaturePolicyRequest
     * @return CreateSignaturePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignaturePolicyResponse CreateSignaturePolicy(CreateSignaturePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSignaturePolicy", CreateSignaturePolicyResponse.class);
    }

    /**
     *手动执行版本保留
     * @param req CreateTagRetentionExecutionRequest
     * @return CreateTagRetentionExecutionResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagRetentionExecutionResponse CreateTagRetentionExecution(CreateTagRetentionExecutionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTagRetentionExecution", CreateTagRetentionExecutionResponse.class);
    }

    /**
     *创建版本保留规则
     * @param req CreateTagRetentionRuleRequest
     * @return CreateTagRetentionRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagRetentionRuleResponse CreateTagRetentionRule(CreateTagRetentionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTagRetentionRule", CreateTagRetentionRuleResponse.class);
    }

    /**
     *创建个人用户
     * @param req CreateUserPersonalRequest
     * @return CreateUserPersonalResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserPersonalResponse CreateUserPersonal(CreateUserPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserPersonal", CreateUserPersonalResponse.class);
    }

    /**
     *创建触发器
     * @param req CreateWebhookTriggerRequest
     * @return CreateWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebhookTriggerResponse CreateWebhookTrigger(CreateWebhookTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebhookTrigger", CreateWebhookTriggerResponse.class);
    }

    /**
     *用于删除应用更新触发器
     * @param req DeleteApplicationTriggerPersonalRequest
     * @return DeleteApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationTriggerPersonalResponse DeleteApplicationTriggerPersonal(DeleteApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationTriggerPersonal", DeleteApplicationTriggerPersonalResponse.class);
    }

    /**
     *删除指定镜像
     * @param req DeleteImageRequest
     * @return DeleteImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageResponse DeleteImage(DeleteImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImage", DeleteImageResponse.class);
    }

    /**
     *删除镜像加速服务
     * @param req DeleteImageAccelerateServiceRequest
     * @return DeleteImageAccelerateServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageAccelerateServiceResponse DeleteImageAccelerateService(DeleteImageAccelerateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageAccelerateService", DeleteImageAccelerateServiceResponse.class);
    }

    /**
     *用于删除个人版全局镜像版本自动清理策略
     * @param req DeleteImageLifecycleGlobalPersonalRequest
     * @return DeleteImageLifecycleGlobalPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageLifecycleGlobalPersonalResponse DeleteImageLifecycleGlobalPersonal(DeleteImageLifecycleGlobalPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageLifecycleGlobalPersonal", DeleteImageLifecycleGlobalPersonalResponse.class);
    }

    /**
     *用于在个人版中删除tag
     * @param req DeleteImagePersonalRequest
     * @return DeleteImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagePersonalResponse DeleteImagePersonal(DeleteImagePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImagePersonal", DeleteImagePersonalResponse.class);
    }

    /**
     * 删除镜像不可变规则
     * @param req DeleteImmutableTagRulesRequest
     * @return DeleteImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImmutableTagRulesResponse DeleteImmutableTagRules(DeleteImmutableTagRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImmutableTagRules", DeleteImmutableTagRulesResponse.class);
    }

    /**
     *删除镜像仓库企业版实例
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *删除自定义域名
     * @param req DeleteInstanceCustomizedDomainRequest
     * @return DeleteInstanceCustomizedDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceCustomizedDomainResponse DeleteInstanceCustomizedDomain(DeleteInstanceCustomizedDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstanceCustomizedDomain", DeleteInstanceCustomizedDomainResponse.class);
    }

    /**
     *删除长期访问凭证
     * @param req DeleteInstanceTokenRequest
     * @return DeleteInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceTokenResponse DeleteInstanceToken(DeleteInstanceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstanceToken", DeleteInstanceTokenResponse.class);
    }

    /**
     *删除tcr内网私有域名解析
     * @param req DeleteInternalEndpointDnsRequest
     * @return DeleteInternalEndpointDnsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInternalEndpointDnsResponse DeleteInternalEndpointDns(DeleteInternalEndpointDnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInternalEndpointDns", DeleteInternalEndpointDnsResponse.class);
    }

    /**
     *用于删除实例多个公网访问白名单策略
     * @param req DeleteMultipleSecurityPolicyRequest
     * @return DeleteMultipleSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMultipleSecurityPolicyResponse DeleteMultipleSecurityPolicy(DeleteMultipleSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMultipleSecurityPolicy", DeleteMultipleSecurityPolicyResponse.class);
    }

    /**
     *删除命名空间
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNamespace", DeleteNamespaceResponse.class);
    }

    /**
     *删除共享版命名空间
     * @param req DeleteNamespacePersonalRequest
     * @return DeleteNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespacePersonalResponse DeleteNamespacePersonal(DeleteNamespacePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNamespacePersonal", DeleteNamespacePersonalResponse.class);
    }

    /**
     *删除从实例
     * @param req DeleteReplicationInstanceRequest
     * @return DeleteReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReplicationInstanceResponse DeleteReplicationInstance(DeleteReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReplicationInstance", DeleteReplicationInstanceResponse.class);
    }

    /**
     *删除镜像仓库
     * @param req DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryResponse DeleteRepository(DeleteRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRepository", DeleteRepositoryResponse.class);
    }

    /**
     *用于个人版镜像仓库中删除
     * @param req DeleteRepositoryPersonalRequest
     * @return DeleteRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryPersonalResponse DeleteRepositoryPersonal(DeleteRepositoryPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRepositoryPersonal", DeleteRepositoryPersonalResponse.class);
    }

    /**
     *用于企业版批量删除Repository Tag
     * @param req DeleteRepositoryTagsRequest
     * @return DeleteRepositoryTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRepositoryTagsResponse DeleteRepositoryTags(DeleteRepositoryTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRepositoryTags", DeleteRepositoryTagsResponse.class);
    }

    /**
     *删除实例公网访问白名单策略

注意：当PolicyIndex和CidrBlock同时存在时，CidrBlock优先级更高
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityPolicy", DeleteSecurityPolicyResponse.class);
    }

    /**
     *删除服务级账号
     * @param req DeleteServiceAccountRequest
     * @return DeleteServiceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceAccountResponse DeleteServiceAccount(DeleteServiceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceAccount", DeleteServiceAccountResponse.class);
    }

    /**
     *删除命名空间加签策略
     * @param req DeleteSignaturePolicyRequest
     * @return DeleteSignaturePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSignaturePolicyResponse DeleteSignaturePolicy(DeleteSignaturePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSignaturePolicy", DeleteSignaturePolicyResponse.class);
    }

    /**
     *删除版本保留规则
     * @param req DeleteTagRetentionRuleRequest
     * @return DeleteTagRetentionRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagRetentionRuleResponse DeleteTagRetentionRule(DeleteTagRetentionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTagRetentionRule", DeleteTagRetentionRuleResponse.class);
    }

    /**
     *删除触发器
     * @param req DeleteWebhookTriggerRequest
     * @return DeleteWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookTriggerResponse DeleteWebhookTrigger(DeleteWebhookTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebhookTrigger", DeleteWebhookTriggerResponse.class);
    }

    /**
     *用于查询应用更新触发器触发日志
     * @param req DescribeApplicationTriggerLogPersonalRequest
     * @return DescribeApplicationTriggerLogPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationTriggerLogPersonalResponse DescribeApplicationTriggerLogPersonal(DescribeApplicationTriggerLogPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationTriggerLogPersonal", DescribeApplicationTriggerLogPersonalResponse.class);
    }

    /**
     *用于查询应用更新触发器
     * @param req DescribeApplicationTriggerPersonalRequest
     * @return DescribeApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationTriggerPersonalResponse DescribeApplicationTriggerPersonal(DescribeApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationTriggerPersonal", DescribeApplicationTriggerPersonalResponse.class);
    }

    /**
     *用于在企业版中返回Chart的下载信息
     * @param req DescribeChartDownloadInfoRequest
     * @return DescribeChartDownloadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChartDownloadInfoResponse DescribeChartDownloadInfo(DescribeChartDownloadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChartDownloadInfo", DescribeChartDownloadInfoResponse.class);
    }

    /**
     *查询实例公网访问入口状态
     * @param req DescribeExternalEndpointStatusRequest
     * @return DescribeExternalEndpointStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalEndpointStatusResponse DescribeExternalEndpointStatus(DescribeExternalEndpointStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalEndpointStatus", DescribeExternalEndpointStatusResponse.class);
    }

    /**
     *查询个人收藏仓库
     * @param req DescribeFavorRepositoryPersonalRequest
     * @return DescribeFavorRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFavorRepositoryPersonalResponse DescribeFavorRepositoryPersonal(DescribeFavorRepositoryPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFavorRepositoryPersonal", DescribeFavorRepositoryPersonalResponse.class);
    }

    /**
     *GC 最近10条历史
     * @param req DescribeGCJobsRequest
     * @return DescribeGCJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGCJobsResponse DescribeGCJobs(DescribeGCJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGCJobs", DescribeGCJobsResponse.class);
    }

    /**
     *查询镜像加速服务状态
     * @param req DescribeImageAccelerateServiceRequest
     * @return DescribeImageAccelerateServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAccelerateServiceResponse DescribeImageAccelerateService(DescribeImageAccelerateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAccelerateService", DescribeImageAccelerateServiceResponse.class);
    }

    /**
     *用于在个人版中查询与指定tag镜像内容相同的tag列表
     * @param req DescribeImageFilterPersonalRequest
     * @return DescribeImageFilterPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageFilterPersonalResponse DescribeImageFilterPersonal(DescribeImageFilterPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageFilterPersonal", DescribeImageFilterPersonalResponse.class);
    }

    /**
     *用于获取个人版全局镜像版本自动清理策略
     * @param req DescribeImageLifecycleGlobalPersonalRequest
     * @return DescribeImageLifecycleGlobalPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageLifecycleGlobalPersonalResponse DescribeImageLifecycleGlobalPersonal(DescribeImageLifecycleGlobalPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageLifecycleGlobalPersonal", DescribeImageLifecycleGlobalPersonalResponse.class);
    }

    /**
     *用于获取个人版仓库中自动清理策略
     * @param req DescribeImageLifecyclePersonalRequest
     * @return DescribeImageLifecyclePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageLifecyclePersonalResponse DescribeImageLifecyclePersonal(DescribeImageLifecyclePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageLifecyclePersonal", DescribeImageLifecyclePersonalResponse.class);
    }

    /**
     *查询容器镜像Manifest信息
     * @param req DescribeImageManifestsRequest
     * @return DescribeImageManifestsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageManifestsResponse DescribeImageManifests(DescribeImageManifestsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageManifests", DescribeImageManifestsResponse.class);
    }

    /**
     *用于获取个人版镜像仓库tag列表
     * @param req DescribeImagePersonalRequest
     * @return DescribeImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagePersonalResponse DescribeImagePersonal(DescribeImagePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImagePersonal", DescribeImagePersonalResponse.class);
    }

    /**
     *查询镜像版本列表或指定容器镜像信息
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *列出镜像不可变规则
     * @param req DescribeImmutableTagRulesRequest
     * @return DescribeImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImmutableTagRulesResponse DescribeImmutableTagRules(DescribeImmutableTagRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImmutableTagRules", DescribeImmutableTagRulesResponse.class);
    }

    /**
     *查询所有有实例命名空间列表
     * @param req DescribeInstanceAllNamespacesRequest
     * @return DescribeInstanceAllNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAllNamespacesResponse DescribeInstanceAllNamespaces(DescribeInstanceAllNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAllNamespaces", DescribeInstanceAllNamespacesResponse.class);
    }

    /**
     *查询实例自定义域名列表
     * @param req DescribeInstanceCustomizedDomainRequest
     * @return DescribeInstanceCustomizedDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceCustomizedDomainResponse DescribeInstanceCustomizedDomain(DescribeInstanceCustomizedDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceCustomizedDomain", DescribeInstanceCustomizedDomainResponse.class);
    }

    /**
     *查询实例当前状态以及过程信息
     * @param req DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStatusResponse DescribeInstanceStatus(DescribeInstanceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceStatus", DescribeInstanceStatusResponse.class);
    }

    /**
     *查询长期访问凭证信息
     * @param req DescribeInstanceTokenRequest
     * @return DescribeInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTokenResponse DescribeInstanceToken(DescribeInstanceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceToken", DescribeInstanceTokenResponse.class);
    }

    /**
     *查询实例信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *批量查询vpc是否已经添加私有域名解析
     * @param req DescribeInternalEndpointDnsStatusRequest
     * @return DescribeInternalEndpointDnsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternalEndpointDnsStatusResponse DescribeInternalEndpointDnsStatus(DescribeInternalEndpointDnsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInternalEndpointDnsStatus", DescribeInternalEndpointDnsStatusResponse.class);
    }

    /**
     *查询实例内网访问VPC链接
     * @param req DescribeInternalEndpointsRequest
     * @return DescribeInternalEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternalEndpointsResponse DescribeInternalEndpoints(DescribeInternalEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInternalEndpoints", DescribeInternalEndpointsResponse.class);
    }

    /**
     *查询个人版命名空间信息
     * @param req DescribeNamespacePersonalRequest
     * @return DescribeNamespacePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacePersonalResponse DescribeNamespacePersonal(DescribeNamespacePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespacePersonal", DescribeNamespacePersonalResponse.class);
    }

    /**
     *查询命名空间列表或指定命名空间信息
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespaces", DescribeNamespacesResponse.class);
    }

    /**
     *用于在TCR中获取可用区域
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *查询创建从实例任务状态
     * @param req DescribeReplicationInstanceCreateTasksRequest
     * @return DescribeReplicationInstanceCreateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstanceCreateTasksResponse DescribeReplicationInstanceCreateTasks(DescribeReplicationInstanceCreateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicationInstanceCreateTasks", DescribeReplicationInstanceCreateTasksResponse.class);
    }

    /**
     *查询从实例同步状态
     * @param req DescribeReplicationInstanceSyncStatusRequest
     * @return DescribeReplicationInstanceSyncStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstanceSyncStatusResponse DescribeReplicationInstanceSyncStatus(DescribeReplicationInstanceSyncStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicationInstanceSyncStatus", DescribeReplicationInstanceSyncStatusResponse.class);
    }

    /**
     *查询从实例列表
     * @param req DescribeReplicationInstancesRequest
     * @return DescribeReplicationInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationInstancesResponse DescribeReplicationInstances(DescribeReplicationInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicationInstances", DescribeReplicationInstancesResponse.class);
    }

    /**
     *查询镜像仓库列表或指定镜像仓库信息
     * @param req DescribeRepositoriesRequest
     * @return DescribeRepositoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositories", DescribeRepositoriesResponse.class);
    }

    /**
     *用于在个人版镜像仓库中，获取满足输入搜索条件的用户镜像仓库
     * @param req DescribeRepositoryFilterPersonalRequest
     * @return DescribeRepositoryFilterPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryFilterPersonalResponse DescribeRepositoryFilterPersonal(DescribeRepositoryFilterPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryFilterPersonal", DescribeRepositoryFilterPersonalResponse.class);
    }

    /**
     *用于在个人版中获取用户全部的镜像仓库列表
     * @param req DescribeRepositoryOwnerPersonalRequest
     * @return DescribeRepositoryOwnerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryOwnerPersonalResponse DescribeRepositoryOwnerPersonal(DescribeRepositoryOwnerPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryOwnerPersonal", DescribeRepositoryOwnerPersonalResponse.class);
    }

    /**
     *查询个人版仓库信息
     * @param req DescribeRepositoryPersonalRequest
     * @return DescribeRepositoryPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryPersonalResponse DescribeRepositoryPersonal(DescribeRepositoryPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryPersonal", DescribeRepositoryPersonalResponse.class);
    }

    /**
     *查询实例公网访问白名单策略
     * @param req DescribeSecurityPoliciesRequest
     * @return DescribeSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPoliciesResponse DescribeSecurityPolicies(DescribeSecurityPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicies", DescribeSecurityPoliciesResponse.class);
    }

    /**
     *查询服务级账号
     * @param req DescribeServiceAccountsRequest
     * @return DescribeServiceAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceAccountsResponse DescribeServiceAccounts(DescribeServiceAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceAccounts", DescribeServiceAccountsResponse.class);
    }

    /**
     *查询版本保留执行记录
     * @param req DescribeTagRetentionExecutionRequest
     * @return DescribeTagRetentionExecutionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRetentionExecutionResponse DescribeTagRetentionExecution(DescribeTagRetentionExecutionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagRetentionExecution", DescribeTagRetentionExecutionResponse.class);
    }

    /**
     *查询版本保留执行任务
     * @param req DescribeTagRetentionExecutionTaskRequest
     * @return DescribeTagRetentionExecutionTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRetentionExecutionTaskResponse DescribeTagRetentionExecutionTask(DescribeTagRetentionExecutionTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagRetentionExecutionTask", DescribeTagRetentionExecutionTaskResponse.class);
    }

    /**
     *查询镜像版本保留规则
     * @param req DescribeTagRetentionRulesRequest
     * @return DescribeTagRetentionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRetentionRulesResponse DescribeTagRetentionRules(DescribeTagRetentionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagRetentionRules", DescribeTagRetentionRulesResponse.class);
    }

    /**
     *查询个人用户配额
     * @param req DescribeUserQuotaPersonalRequest
     * @return DescribeUserQuotaPersonalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserQuotaPersonalResponse DescribeUserQuotaPersonal(DescribeUserQuotaPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserQuotaPersonal", DescribeUserQuotaPersonalResponse.class);
    }

    /**
     *查询触发器
     * @param req DescribeWebhookTriggerRequest
     * @return DescribeWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookTriggerResponse DescribeWebhookTrigger(DescribeWebhookTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebhookTrigger", DescribeWebhookTriggerResponse.class);
    }

    /**
     *获取触发器日志
     * @param req DescribeWebhookTriggerLogRequest
     * @return DescribeWebhookTriggerLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookTriggerLogResponse DescribeWebhookTriggerLog(DescribeWebhookTriggerLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebhookTriggerLog", DescribeWebhookTriggerLogResponse.class);
    }

    /**
     *用于在TCR中下载helm chart
     * @param req DownloadHelmChartRequest
     * @return DownloadHelmChartResponse
     * @throws TencentCloudSDKException
     */
    public DownloadHelmChartResponse DownloadHelmChart(DownloadHelmChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadHelmChart", DownloadHelmChartResponse.class);
    }

    /**
     *用于在企业版镜像仓库中复制镜像版本
     * @param req DuplicateImageRequest
     * @return DuplicateImageResponse
     * @throws TencentCloudSDKException
     */
    public DuplicateImageResponse DuplicateImage(DuplicateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DuplicateImage", DuplicateImageResponse.class);
    }

    /**
     *用于在个人版镜像仓库中复制镜像版本
     * @param req DuplicateImagePersonalRequest
     * @return DuplicateImagePersonalResponse
     * @throws TencentCloudSDKException
     */
    public DuplicateImagePersonalResponse DuplicateImagePersonal(DuplicateImagePersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DuplicateImagePersonal", DuplicateImagePersonalResponse.class);
    }

    /**
     *管理实例公网访问
     * @param req ManageExternalEndpointRequest
     * @return ManageExternalEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ManageExternalEndpointResponse ManageExternalEndpoint(ManageExternalEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageExternalEndpoint", ManageExternalEndpointResponse.class);
    }

    /**
     *用于设置个人版全局镜像版本自动清理策略
     * @param req ManageImageLifecycleGlobalPersonalRequest
     * @return ManageImageLifecycleGlobalPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ManageImageLifecycleGlobalPersonalResponse ManageImageLifecycleGlobalPersonal(ManageImageLifecycleGlobalPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageImageLifecycleGlobalPersonal", ManageImageLifecycleGlobalPersonalResponse.class);
    }

    /**
     *管理实例内网访问VPC链接
     * @param req ManageInternalEndpointRequest
     * @return ManageInternalEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ManageInternalEndpointResponse ManageInternalEndpoint(ManageInternalEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageInternalEndpoint", ManageInternalEndpointResponse.class);
    }

    /**
     *管理实例同步
     * @param req ManageReplicationRequest
     * @return ManageReplicationResponse
     * @throws TencentCloudSDKException
     */
    public ManageReplicationResponse ManageReplication(ManageReplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageReplication", ManageReplicationResponse.class);
    }

    /**
     *用于修改应用更新触发器
     * @param req ModifyApplicationTriggerPersonalRequest
     * @return ModifyApplicationTriggerPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationTriggerPersonalResponse ModifyApplicationTriggerPersonal(ModifyApplicationTriggerPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationTriggerPersonal", ModifyApplicationTriggerPersonalResponse.class);
    }

    /**
     *更新镜像不可变规则
     * @param req ModifyImmutableTagRulesRequest
     * @return ModifyImmutableTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImmutableTagRulesResponse ModifyImmutableTagRules(ModifyImmutableTagRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImmutableTagRules", ModifyImmutableTagRulesResponse.class);
    }

    /**
     *更新实例信息
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *更新实例内指定长期访问凭证的启用状态
     * @param req ModifyInstanceTokenRequest
     * @return ModifyInstanceTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceTokenResponse ModifyInstanceToken(ModifyInstanceTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceToken", ModifyInstanceTokenResponse.class);
    }

    /**
     *更新命名空间信息
     * @param req ModifyNamespaceRequest
     * @return ModifyNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNamespaceResponse ModifyNamespace(ModifyNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNamespace", ModifyNamespaceResponse.class);
    }

    /**
     *更新镜像仓库信息，可修改仓库描述信息
     * @param req ModifyRepositoryRequest
     * @return ModifyRepositoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryResponse ModifyRepository(ModifyRepositoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRepository", ModifyRepositoryResponse.class);
    }

    /**
     *用于更新个人版镜像仓库的访问属性
     * @param req ModifyRepositoryAccessPersonalRequest
     * @return ModifyRepositoryAccessPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryAccessPersonalResponse ModifyRepositoryAccessPersonal(ModifyRepositoryAccessPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRepositoryAccessPersonal", ModifyRepositoryAccessPersonalResponse.class);
    }

    /**
     *用于在个人版镜像仓库中更新容器镜像描述
     * @param req ModifyRepositoryInfoPersonalRequest
     * @return ModifyRepositoryInfoPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRepositoryInfoPersonalResponse ModifyRepositoryInfoPersonal(ModifyRepositoryInfoPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRepositoryInfoPersonal", ModifyRepositoryInfoPersonalResponse.class);
    }

    /**
     *更新实例公网访问白名单
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityPolicy", ModifySecurityPolicyResponse.class);
    }

    /**
     *更新服务级账号
     * @param req ModifyServiceAccountRequest
     * @return ModifyServiceAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceAccountResponse ModifyServiceAccount(ModifyServiceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceAccount", ModifyServiceAccountResponse.class);
    }

    /**
     *更新服务级账号密码
     * @param req ModifyServiceAccountPasswordRequest
     * @return ModifyServiceAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceAccountPasswordResponse ModifyServiceAccountPassword(ModifyServiceAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceAccountPassword", ModifyServiceAccountPasswordResponse.class);
    }

    /**
     *更新版本保留规则
     * @param req ModifyTagRetentionRuleRequest
     * @return ModifyTagRetentionRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTagRetentionRuleResponse ModifyTagRetentionRule(ModifyTagRetentionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTagRetentionRule", ModifyTagRetentionRuleResponse.class);
    }

    /**
     *修改个人用户登录密码
     * @param req ModifyUserPasswordPersonalRequest
     * @return ModifyUserPasswordPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserPasswordPersonalResponse ModifyUserPasswordPersonal(ModifyUserPasswordPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserPasswordPersonal", ModifyUserPasswordPersonalResponse.class);
    }

    /**
     *更新触发器
     * @param req ModifyWebhookTriggerRequest
     * @return ModifyWebhookTriggerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookTriggerResponse ModifyWebhookTrigger(ModifyWebhookTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookTrigger", ModifyWebhookTriggerResponse.class);
    }

    /**
     *预付费实例续费，同时支持按量计费转包年包月
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
    }

    /**
     *查询个人版用户命名空间是否存在
     * @param req ValidateNamespaceExistPersonalRequest
     * @return ValidateNamespaceExistPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ValidateNamespaceExistPersonalResponse ValidateNamespaceExistPersonal(ValidateNamespaceExistPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ValidateNamespaceExistPersonal", ValidateNamespaceExistPersonalResponse.class);
    }

    /**
     *用于判断个人版仓库是否存在
     * @param req ValidateRepositoryExistPersonalRequest
     * @return ValidateRepositoryExistPersonalResponse
     * @throws TencentCloudSDKException
     */
    public ValidateRepositoryExistPersonalResponse ValidateRepositoryExistPersonal(ValidateRepositoryExistPersonalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ValidateRepositoryExistPersonal", ValidateRepositoryExistPersonalResponse.class);
    }

}
