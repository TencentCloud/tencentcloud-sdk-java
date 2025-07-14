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
package com.tencentcloudapi.tse.v20201207;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tse.v20201207.models.*;

public class TseClient extends AbstractClient{
    private static String endpoint = "tse.tencentcloudapi.com";
    private static String service = "tse";
    private static String version = "2020-12-07";

    public TseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TseClient(Credential credential, String region, ClientProfile profile) {
        super(TseClient.endpoint, TseClient.version, credential, region, profile);
    }

    /**
     *弹性伸缩策略批量绑定网关分组
     * @param req BindAutoScalerResourceStrategyToGroupsRequest
     * @return BindAutoScalerResourceStrategyToGroupsResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoScalerResourceStrategyToGroupsResponse BindAutoScalerResourceStrategyToGroups(BindAutoScalerResourceStrategyToGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindAutoScalerResourceStrategyToGroups", BindAutoScalerResourceStrategyToGroupsResponse.class);
    }

    /**
     *关闭 WAF 防护
     * @param req CloseWafProtectionRequest
     * @return CloseWafProtectionResponse
     * @throws TencentCloudSDKException
     */
    public CloseWafProtectionResponse CloseWafProtection(CloseWafProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseWafProtection", CloseWafProtectionResponse.class);
    }

    /**
     *创建弹性伸缩策略
     * @param req CreateAutoScalerResourceStrategyRequest
     * @return CreateAutoScalerResourceStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalerResourceStrategyResponse CreateAutoScalerResourceStrategy(CreateAutoScalerResourceStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoScalerResourceStrategy", CreateAutoScalerResourceStrategyResponse.class);
    }

    /**
     *创建云原生API网关实例
     * @param req CreateCloudNativeAPIGatewayRequest
     * @return CreateCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayResponse CreateCloudNativeAPIGateway(CreateCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGateway", CreateCloudNativeAPIGatewayResponse.class);
    }

    /**
     *创建云原生网关的灰度规则
     * @param req CreateCloudNativeAPIGatewayCanaryRuleRequest
     * @return CreateCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCanaryRuleResponse CreateCloudNativeAPIGatewayCanaryRule(CreateCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayCanaryRule", CreateCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *创建云原生网关证书
     * @param req CreateCloudNativeAPIGatewayCertificateRequest
     * @return CreateCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCertificateResponse CreateCloudNativeAPIGatewayCertificate(CreateCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayCertificate", CreateCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *创建公网网络配置
     * @param req CreateCloudNativeAPIGatewayPublicNetworkRequest
     * @return CreateCloudNativeAPIGatewayPublicNetworkResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayPublicNetworkResponse CreateCloudNativeAPIGatewayPublicNetwork(CreateCloudNativeAPIGatewayPublicNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayPublicNetwork", CreateCloudNativeAPIGatewayPublicNetworkResponse.class);
    }

    /**
     *创建云原生网关路由
     * @param req CreateCloudNativeAPIGatewayRouteRequest
     * @return CreateCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteResponse CreateCloudNativeAPIGatewayRoute(CreateCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayRoute", CreateCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *创建云原生网关限流插件(路由)
     * @param req CreateCloudNativeAPIGatewayRouteRateLimitRequest
     * @return CreateCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteRateLimitResponse CreateCloudNativeAPIGatewayRouteRateLimit(CreateCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayRouteRateLimit", CreateCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *创建云原生网关服务
     * @param req CreateCloudNativeAPIGatewayServiceRequest
     * @return CreateCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceResponse CreateCloudNativeAPIGatewayService(CreateCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayService", CreateCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *创建云原生网关限流插件(服务)
     * @param req CreateCloudNativeAPIGatewayServiceRateLimitRequest
     * @return CreateCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceRateLimitResponse CreateCloudNativeAPIGatewayServiceRateLimit(CreateCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayServiceRateLimit", CreateCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *创建配置文件
     * @param req CreateConfigFileRequest
     * @return CreateConfigFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigFileResponse CreateConfigFile(CreateConfigFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigFile", CreateConfigFileResponse.class);
    }

    /**
     *创建服务治理中心配置文件组
     * @param req CreateConfigFileGroupRequest
     * @return CreateConfigFileGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigFileGroupResponse CreateConfigFileGroup(CreateConfigFileGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigFileGroup", CreateConfigFileGroupResponse.class);
    }

    /**
     *创建引擎实例
     * @param req CreateEngineRequest
     * @return CreateEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateEngineResponse CreateEngine(CreateEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEngine", CreateEngineResponse.class);
    }

    /**
     *创建治理中心服务别名
     * @param req CreateGovernanceAliasRequest
     * @return CreateGovernanceAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateGovernanceAliasResponse CreateGovernanceAlias(CreateGovernanceAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGovernanceAlias", CreateGovernanceAliasResponse.class);
    }

    /**
     *创建服务实例
     * @param req CreateGovernanceInstancesRequest
     * @return CreateGovernanceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateGovernanceInstancesResponse CreateGovernanceInstances(CreateGovernanceInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGovernanceInstances", CreateGovernanceInstancesResponse.class);
    }

    /**
     *创建治理中心命名空间
     * @param req CreateGovernanceNamespacesRequest
     * @return CreateGovernanceNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateGovernanceNamespacesResponse CreateGovernanceNamespaces(CreateGovernanceNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGovernanceNamespaces", CreateGovernanceNamespacesResponse.class);
    }

    /**
     *创建治理中心服务
     * @param req CreateGovernanceServicesRequest
     * @return CreateGovernanceServicesResponse
     * @throws TencentCloudSDKException
     */
    public CreateGovernanceServicesResponse CreateGovernanceServices(CreateGovernanceServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGovernanceServices", CreateGovernanceServicesResponse.class);
    }

    /**
     *创建云原生网关引擎分组
     * @param req CreateNativeGatewayServerGroupRequest
     * @return CreateNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateNativeGatewayServerGroupResponse CreateNativeGatewayServerGroup(CreateNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNativeGatewayServerGroup", CreateNativeGatewayServerGroupResponse.class);
    }

    /**
     *创建网关服务来源
     * @param req CreateNativeGatewayServiceSourceRequest
     * @return CreateNativeGatewayServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNativeGatewayServiceSourceResponse CreateNativeGatewayServiceSource(CreateNativeGatewayServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNativeGatewayServiceSource", CreateNativeGatewayServiceSourceResponse.class);
    }

    /**
     *创建或更新配置文件并发布配置
     * @param req CreateOrUpdateConfigFileAndReleaseRequest
     * @return CreateOrUpdateConfigFileAndReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrUpdateConfigFileAndReleaseResponse CreateOrUpdateConfigFileAndRelease(CreateOrUpdateConfigFileAndReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrUpdateConfigFileAndRelease", CreateOrUpdateConfigFileAndReleaseResponse.class);
    }

    /**
     *新建 WAF 防护域名
     * @param req CreateWafDomainsRequest
     * @return CreateWafDomainsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWafDomainsResponse CreateWafDomains(CreateWafDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWafDomains", CreateWafDomainsResponse.class);
    }

    /**
     *删除弹性伸缩策略
     * @param req DeleteAutoScalerResourceStrategyRequest
     * @return DeleteAutoScalerResourceStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalerResourceStrategyResponse DeleteAutoScalerResourceStrategy(DeleteAutoScalerResourceStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoScalerResourceStrategy", DeleteAutoScalerResourceStrategyResponse.class);
    }

    /**
     *删除云原生API网关实例
     * @param req DeleteCloudNativeAPIGatewayRequest
     * @return DeleteCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayResponse DeleteCloudNativeAPIGateway(DeleteCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGateway", DeleteCloudNativeAPIGatewayResponse.class);
    }

    /**
     *删除云原生网关的灰度规则
     * @param req DeleteCloudNativeAPIGatewayCanaryRuleRequest
     * @return DeleteCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCanaryRuleResponse DeleteCloudNativeAPIGatewayCanaryRule(DeleteCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCanaryRule", DeleteCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *删除云原生网关证书
     * @param req DeleteCloudNativeAPIGatewayCertificateRequest
     * @return DeleteCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCertificateResponse DeleteCloudNativeAPIGatewayCertificate(DeleteCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCertificate", DeleteCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *删除公网网络配置
     * @param req DeleteCloudNativeAPIGatewayPublicNetworkRequest
     * @return DeleteCloudNativeAPIGatewayPublicNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayPublicNetworkResponse DeleteCloudNativeAPIGatewayPublicNetwork(DeleteCloudNativeAPIGatewayPublicNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayPublicNetwork", DeleteCloudNativeAPIGatewayPublicNetworkResponse.class);
    }

    /**
     *删除云原生网关路由
     * @param req DeleteCloudNativeAPIGatewayRouteRequest
     * @return DeleteCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteResponse DeleteCloudNativeAPIGatewayRoute(DeleteCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayRoute", DeleteCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *删除云原生网关的限流插件(路由)
     * @param req DeleteCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteRateLimitResponse DeleteCloudNativeAPIGatewayRouteRateLimit(DeleteCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayRouteRateLimit", DeleteCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *删除云原生网关服务
     * @param req DeleteCloudNativeAPIGatewayServiceRequest
     * @return DeleteCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceResponse DeleteCloudNativeAPIGatewayService(DeleteCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayService", DeleteCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *删除云原生网关的限流插件(服务)
     * @param req DeleteCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceRateLimitResponse DeleteCloudNativeAPIGatewayServiceRateLimit(DeleteCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayServiceRateLimit", DeleteCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *删除配置文件分组
     * @param req DeleteConfigFileGroupRequest
     * @return DeleteConfigFileGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFileGroupResponse DeleteConfigFileGroup(DeleteConfigFileGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigFileGroup", DeleteConfigFileGroupResponse.class);
    }

    /**
     *删除配置发布
     * @param req DeleteConfigFileReleasesRequest
     * @return DeleteConfigFileReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFileReleasesResponse DeleteConfigFileReleases(DeleteConfigFileReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigFileReleases", DeleteConfigFileReleasesResponse.class);
    }

    /**
     *删除配置文件
     * @param req DeleteConfigFilesRequest
     * @return DeleteConfigFilesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFilesResponse DeleteConfigFiles(DeleteConfigFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigFiles", DeleteConfigFilesResponse.class);
    }

    /**
     *删除引擎实例
     * @param req DeleteEngineRequest
     * @return DeleteEngineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEngineResponse DeleteEngine(DeleteEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEngine", DeleteEngineResponse.class);
    }

    /**
     *删除治理中心服务别名
     * @param req DeleteGovernanceAliasesRequest
     * @return DeleteGovernanceAliasesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGovernanceAliasesResponse DeleteGovernanceAliases(DeleteGovernanceAliasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGovernanceAliases", DeleteGovernanceAliasesResponse.class);
    }

    /**
     *删除服务实例
     * @param req DeleteGovernanceInstancesRequest
     * @return DeleteGovernanceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGovernanceInstancesResponse DeleteGovernanceInstances(DeleteGovernanceInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGovernanceInstances", DeleteGovernanceInstancesResponse.class);
    }

    /**
     *删除治理中心服务实例
     * @param req DeleteGovernanceInstancesByHostRequest
     * @return DeleteGovernanceInstancesByHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGovernanceInstancesByHostResponse DeleteGovernanceInstancesByHost(DeleteGovernanceInstancesByHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGovernanceInstancesByHost", DeleteGovernanceInstancesByHostResponse.class);
    }

    /**
     *删除治理中心命名空间
     * @param req DeleteGovernanceNamespacesRequest
     * @return DeleteGovernanceNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGovernanceNamespacesResponse DeleteGovernanceNamespaces(DeleteGovernanceNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGovernanceNamespaces", DeleteGovernanceNamespacesResponse.class);
    }

    /**
     *删除治理中心服务
     * @param req DeleteGovernanceServicesRequest
     * @return DeleteGovernanceServicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGovernanceServicesResponse DeleteGovernanceServices(DeleteGovernanceServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGovernanceServices", DeleteGovernanceServicesResponse.class);
    }

    /**
     *删除网关实例分组
     * @param req DeleteNativeGatewayServerGroupRequest
     * @return DeleteNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNativeGatewayServerGroupResponse DeleteNativeGatewayServerGroup(DeleteNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNativeGatewayServerGroup", DeleteNativeGatewayServerGroupResponse.class);
    }

    /**
     *删除网关服务来源实例
     * @param req DeleteNativeGatewayServiceSourceRequest
     * @return DeleteNativeGatewayServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNativeGatewayServiceSourceResponse DeleteNativeGatewayServiceSource(DeleteNativeGatewayServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNativeGatewayServiceSource", DeleteNativeGatewayServiceSourceResponse.class);
    }

    /**
     *删除 WAF 防护域名
     * @param req DeleteWafDomainsRequest
     * @return DeleteWafDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWafDomainsResponse DeleteWafDomains(DeleteWafDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWafDomains", DeleteWafDomainsResponse.class);
    }

    /**
     *获取全量配置文件模板列表
     * @param req DescribeAllConfigFileTemplatesRequest
     * @return DescribeAllConfigFileTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllConfigFileTemplatesResponse DescribeAllConfigFileTemplates(DescribeAllConfigFileTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllConfigFileTemplates", DescribeAllConfigFileTemplatesResponse.class);
    }

    /**
     *查看弹性伸缩策略列表
     * @param req DescribeAutoScalerResourceStrategiesRequest
     * @return DescribeAutoScalerResourceStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalerResourceStrategiesResponse DescribeAutoScalerResourceStrategies(DescribeAutoScalerResourceStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalerResourceStrategies", DescribeAutoScalerResourceStrategiesResponse.class);
    }

    /**
     *查看弹性伸缩策略绑定的网关分组
     * @param req DescribeAutoScalerResourceStrategyBindingGroupsRequest
     * @return DescribeAutoScalerResourceStrategyBindingGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalerResourceStrategyBindingGroupsResponse DescribeAutoScalerResourceStrategyBindingGroups(DescribeAutoScalerResourceStrategyBindingGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScalerResourceStrategyBindingGroups", DescribeAutoScalerResourceStrategyBindingGroupsResponse.class);
    }

    /**
     *获取云原生API网关实例信息
     * @param req DescribeCloudNativeAPIGatewayRequest
     * @return DescribeCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayResponse DescribeCloudNativeAPIGateway(DescribeCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGateway", DescribeCloudNativeAPIGatewayResponse.class);
    }

    /**
     *查询云原生网关灰度规则列表
     * @param req DescribeCloudNativeAPIGatewayCanaryRulesRequest
     * @return DescribeCloudNativeAPIGatewayCanaryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCanaryRulesResponse DescribeCloudNativeAPIGatewayCanaryRules(DescribeCloudNativeAPIGatewayCanaryRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCanaryRules", DescribeCloudNativeAPIGatewayCanaryRulesResponse.class);
    }

    /**
     *查询云原生网关单个证书详情
     * @param req DescribeCloudNativeAPIGatewayCertificateDetailsRequest
     * @return DescribeCloudNativeAPIGatewayCertificateDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCertificateDetailsResponse DescribeCloudNativeAPIGatewayCertificateDetails(DescribeCloudNativeAPIGatewayCertificateDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCertificateDetails", DescribeCloudNativeAPIGatewayCertificateDetailsResponse.class);
    }

    /**
     *查询云原生网关证书列表
     * @param req DescribeCloudNativeAPIGatewayCertificatesRequest
     * @return DescribeCloudNativeAPIGatewayCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCertificatesResponse DescribeCloudNativeAPIGatewayCertificates(DescribeCloudNativeAPIGatewayCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCertificates", DescribeCloudNativeAPIGatewayCertificatesResponse.class);
    }

    /**
     *获取云原生API网关实例网络配置信息
     * @param req DescribeCloudNativeAPIGatewayConfigRequest
     * @return DescribeCloudNativeAPIGatewayConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayConfigResponse DescribeCloudNativeAPIGatewayConfig(DescribeCloudNativeAPIGatewayConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayConfig", DescribeCloudNativeAPIGatewayConfigResponse.class);
    }

    /**
     *根据公网IP查询云原生网关实例信息
     * @param req DescribeCloudNativeAPIGatewayInfoByIpRequest
     * @return DescribeCloudNativeAPIGatewayInfoByIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayInfoByIpResponse DescribeCloudNativeAPIGatewayInfoByIp(DescribeCloudNativeAPIGatewayInfoByIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayInfoByIp", DescribeCloudNativeAPIGatewayInfoByIpResponse.class);
    }

    /**
     *获取云原生网关节点列表
     * @param req DescribeCloudNativeAPIGatewayNodesRequest
     * @return DescribeCloudNativeAPIGatewayNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayNodesResponse DescribeCloudNativeAPIGatewayNodes(DescribeCloudNativeAPIGatewayNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayNodes", DescribeCloudNativeAPIGatewayNodesResponse.class);
    }

    /**
     *获取云原生API网关实例端口信息
     * @param req DescribeCloudNativeAPIGatewayPortsRequest
     * @return DescribeCloudNativeAPIGatewayPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayPortsResponse DescribeCloudNativeAPIGatewayPorts(DescribeCloudNativeAPIGatewayPortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayPorts", DescribeCloudNativeAPIGatewayPortsResponse.class);
    }

    /**
     *查询云原生网关的限流插件(路由)
     * @param req DescribeCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRouteRateLimitResponse DescribeCloudNativeAPIGatewayRouteRateLimit(DescribeCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayRouteRateLimit", DescribeCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *查询云原生网关路由列表
     * @param req DescribeCloudNativeAPIGatewayRoutesRequest
     * @return DescribeCloudNativeAPIGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRoutesResponse DescribeCloudNativeAPIGatewayRoutes(DescribeCloudNativeAPIGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayRoutes", DescribeCloudNativeAPIGatewayRoutesResponse.class);
    }

    /**
     *查询云原生网关的限流插件(服务)
     * @param req DescribeCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServiceRateLimitResponse DescribeCloudNativeAPIGatewayServiceRateLimit(DescribeCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServiceRateLimit", DescribeCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *查询云原生网关服务列表
     * @param req DescribeCloudNativeAPIGatewayServicesRequest
     * @return DescribeCloudNativeAPIGatewayServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServicesResponse DescribeCloudNativeAPIGatewayServices(DescribeCloudNativeAPIGatewayServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServices", DescribeCloudNativeAPIGatewayServicesResponse.class);
    }

    /**
     *轻量查询云原生网关服务列表
     * @param req DescribeCloudNativeAPIGatewayServicesLightRequest
     * @return DescribeCloudNativeAPIGatewayServicesLightResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServicesLightResponse DescribeCloudNativeAPIGatewayServicesLight(DescribeCloudNativeAPIGatewayServicesLightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServicesLight", DescribeCloudNativeAPIGatewayServicesLightResponse.class);
    }

    /**
     *获取云原生网关服务详情下的Upstream列表
     * @param req DescribeCloudNativeAPIGatewayUpstreamRequest
     * @return DescribeCloudNativeAPIGatewayUpstreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayUpstreamResponse DescribeCloudNativeAPIGatewayUpstream(DescribeCloudNativeAPIGatewayUpstreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayUpstream", DescribeCloudNativeAPIGatewayUpstreamResponse.class);
    }

    /**
     *获取云原生API网关实例列表
     * @param req DescribeCloudNativeAPIGatewaysRequest
     * @return DescribeCloudNativeAPIGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaysResponse DescribeCloudNativeAPIGateways(DescribeCloudNativeAPIGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGateways", DescribeCloudNativeAPIGatewaysResponse.class);
    }

    /**
     *根据命名空间、组、名字查找配置文件
     * @param req DescribeConfigFileRequest
     * @return DescribeConfigFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFileResponse DescribeConfigFile(DescribeConfigFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFile", DescribeConfigFileResponse.class);
    }

    /**
     *根据条件分页查询配置文件组
     * @param req DescribeConfigFileGroupsRequest
     * @return DescribeConfigFileGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFileGroupsResponse DescribeConfigFileGroups(DescribeConfigFileGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFileGroups", DescribeConfigFileGroupsResponse.class);
    }

    /**
     *获取配置文件发布
     * @param req DescribeConfigFileReleaseRequest
     * @return DescribeConfigFileReleaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFileReleaseResponse DescribeConfigFileRelease(DescribeConfigFileReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFileRelease", DescribeConfigFileReleaseResponse.class);
    }

    /**
     *获取配置文件发布历史列表
     * @param req DescribeConfigFileReleaseHistoriesRequest
     * @return DescribeConfigFileReleaseHistoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFileReleaseHistoriesResponse DescribeConfigFileReleaseHistories(DescribeConfigFileReleaseHistoriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFileReleaseHistories", DescribeConfigFileReleaseHistoriesResponse.class);
    }

    /**
     *查询某个配置所有版本信息
     * @param req DescribeConfigFileReleaseVersionsRequest
     * @return DescribeConfigFileReleaseVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFileReleaseVersionsResponse DescribeConfigFileReleaseVersions(DescribeConfigFileReleaseVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFileReleaseVersions", DescribeConfigFileReleaseVersionsResponse.class);
    }

    /**
     *查询配置版本列表
     * @param req DescribeConfigFileReleasesRequest
     * @return DescribeConfigFileReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFileReleasesResponse DescribeConfigFileReleases(DescribeConfigFileReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFileReleases", DescribeConfigFileReleasesResponse.class);
    }

    /**
     *根据命名空间、组名、名称、标签查询配置文件列表
     * @param req DescribeConfigFilesRequest
     * @return DescribeConfigFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFilesResponse DescribeConfigFiles(DescribeConfigFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFiles", DescribeConfigFilesResponse.class);
    }

    /**
     *根据group查询配置文件列表
     * @param req DescribeConfigFilesByGroupRequest
     * @return DescribeConfigFilesByGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigFilesByGroupResponse DescribeConfigFilesByGroup(DescribeConfigFilesByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigFilesByGroup", DescribeConfigFilesByGroupResponse.class);
    }

    /**
     *查询治理中心服务别名列表
     * @param req DescribeGovernanceAliasesRequest
     * @return DescribeGovernanceAliasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceAliasesResponse DescribeGovernanceAliases(DescribeGovernanceAliasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceAliases", DescribeGovernanceAliasesResponse.class);
    }

    /**
     *查询服务实例
     * @param req DescribeGovernanceInstancesRequest
     * @return DescribeGovernanceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceInstancesResponse DescribeGovernanceInstances(DescribeGovernanceInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceInstances", DescribeGovernanceInstancesResponse.class);
    }

    /**
     *查询服务治理中心命名空间列表
     * @param req DescribeGovernanceNamespacesRequest
     * @return DescribeGovernanceNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceNamespacesResponse DescribeGovernanceNamespaces(DescribeGovernanceNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceNamespaces", DescribeGovernanceNamespacesResponse.class);
    }

    /**
     *查询服务下契约版本列表
     * @param req DescribeGovernanceServiceContractVersionsRequest
     * @return DescribeGovernanceServiceContractVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceServiceContractVersionsResponse DescribeGovernanceServiceContractVersions(DescribeGovernanceServiceContractVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceServiceContractVersions", DescribeGovernanceServiceContractVersionsResponse.class);
    }

    /**
     *查询服务契约定义列表
     * @param req DescribeGovernanceServiceContractsRequest
     * @return DescribeGovernanceServiceContractsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceServiceContractsResponse DescribeGovernanceServiceContracts(DescribeGovernanceServiceContractsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceServiceContracts", DescribeGovernanceServiceContractsResponse.class);
    }

    /**
     *查询治理中心服务列表
     * @param req DescribeGovernanceServicesRequest
     * @return DescribeGovernanceServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGovernanceServicesResponse DescribeGovernanceServices(DescribeGovernanceServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGovernanceServices", DescribeGovernanceServicesResponse.class);
    }

    /**
     *查看实例的标签信息
     * @param req DescribeInstanceTagInfosRequest
     * @return DescribeInstanceTagInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTagInfosResponse DescribeInstanceTagInfos(DescribeInstanceTagInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTagInfos", DescribeInstanceTagInfosResponse.class);
    }

    /**
     *查询Nacos类型引擎实例副本信息
     * @param req DescribeNacosReplicasRequest
     * @return DescribeNacosReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosReplicasResponse DescribeNacosReplicas(DescribeNacosReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNacosReplicas", DescribeNacosReplicasResponse.class);
    }

    /**
     *查询nacos服务接口列表
     * @param req DescribeNacosServerInterfacesRequest
     * @return DescribeNacosServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosServerInterfacesResponse DescribeNacosServerInterfaces(DescribeNacosServerInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNacosServerInterfaces", DescribeNacosServerInterfacesResponse.class);
    }

    /**
     *查询云原生网关分组信息
     * @param req DescribeNativeGatewayServerGroupsRequest
     * @return DescribeNativeGatewayServerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNativeGatewayServerGroupsResponse DescribeNativeGatewayServerGroups(DescribeNativeGatewayServerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNativeGatewayServerGroups", DescribeNativeGatewayServerGroupsResponse.class);
    }

    /**
     *查询网关服务来源实例列表
     * @param req DescribeNativeGatewayServiceSourcesRequest
     * @return DescribeNativeGatewayServiceSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNativeGatewayServiceSourcesResponse DescribeNativeGatewayServiceSources(DescribeNativeGatewayServiceSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNativeGatewayServiceSources", DescribeNativeGatewayServiceSourcesResponse.class);
    }

    /**
     *获取云原生网关服务详情
     * @param req DescribeOneCloudNativeAPIGatewayServiceRequest
     * @return DescribeOneCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOneCloudNativeAPIGatewayServiceResponse DescribeOneCloudNativeAPIGatewayService(DescribeOneCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOneCloudNativeAPIGatewayService", DescribeOneCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *查询公网地址信息
     * @param req DescribePublicAddressConfigRequest
     * @return DescribePublicAddressConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicAddressConfigResponse DescribePublicAddressConfig(DescribePublicAddressConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicAddressConfig", DescribePublicAddressConfigResponse.class);
    }

    /**
     *查询云原生API网关实例公网详情
     * @param req DescribePublicNetworkRequest
     * @return DescribePublicNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicNetworkResponse DescribePublicNetwork(DescribePublicNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicNetwork", DescribePublicNetworkResponse.class);
    }

    /**
     *查询引擎实例访问地址
     * @param req DescribeSREInstanceAccessAddressRequest
     * @return DescribeSREInstanceAccessAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstanceAccessAddressResponse DescribeSREInstanceAccessAddress(DescribeSREInstanceAccessAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSREInstanceAccessAddress", DescribeSREInstanceAccessAddressResponse.class);
    }

    /**
     *用于查询引擎实例列表
     * @param req DescribeSREInstancesRequest
     * @return DescribeSREInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstancesResponse DescribeSREInstances(DescribeSREInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSREInstances", DescribeSREInstancesResponse.class);
    }

    /**
     *获取云原生网关服务健康检查配置
     * @param req DescribeUpstreamHealthCheckConfigRequest
     * @return DescribeUpstreamHealthCheckConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUpstreamHealthCheckConfigResponse DescribeUpstreamHealthCheckConfig(DescribeUpstreamHealthCheckConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUpstreamHealthCheckConfig", DescribeUpstreamHealthCheckConfigResponse.class);
    }

    /**
     *获取 WAF 防护域名
     * @param req DescribeWafDomainsRequest
     * @return DescribeWafDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafDomainsResponse DescribeWafDomains(DescribeWafDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafDomains", DescribeWafDomainsResponse.class);
    }

    /**
     *获取 WAF 防护状态
     * @param req DescribeWafProtectionRequest
     * @return DescribeWafProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafProtectionResponse DescribeWafProtection(DescribeWafProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWafProtection", DescribeWafProtectionResponse.class);
    }

    /**
     *查询Zookeeper类型注册引擎实例副本信息
     * @param req DescribeZookeeperReplicasRequest
     * @return DescribeZookeeperReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperReplicasResponse DescribeZookeeperReplicas(DescribeZookeeperReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZookeeperReplicas", DescribeZookeeperReplicasResponse.class);
    }

    /**
     *查询zookeeper服务接口列表
     * @param req DescribeZookeeperServerInterfacesRequest
     * @return DescribeZookeeperServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperServerInterfacesResponse DescribeZookeeperServerInterfaces(DescribeZookeeperServerInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZookeeperServerInterfaces", DescribeZookeeperServerInterfacesResponse.class);
    }

    /**
     *更新弹性伸缩策略
     * @param req ModifyAutoScalerResourceStrategyRequest
     * @return ModifyAutoScalerResourceStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalerResourceStrategyResponse ModifyAutoScalerResourceStrategy(ModifyAutoScalerResourceStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScalerResourceStrategy", ModifyAutoScalerResourceStrategyResponse.class);
    }

    /**
     *修改云原生API网关实例基础信息
     * @param req ModifyCloudNativeAPIGatewayRequest
     * @return ModifyCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayResponse ModifyCloudNativeAPIGateway(ModifyCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGateway", ModifyCloudNativeAPIGatewayResponse.class);
    }

    /**
     *修改云原生网关的灰度规则
     * @param req ModifyCloudNativeAPIGatewayCanaryRuleRequest
     * @return ModifyCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCanaryRuleResponse ModifyCloudNativeAPIGatewayCanaryRule(ModifyCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayCanaryRule", ModifyCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *更新云原生网关证书
     * @param req ModifyCloudNativeAPIGatewayCertificateRequest
     * @return ModifyCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCertificateResponse ModifyCloudNativeAPIGatewayCertificate(ModifyCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayCertificate", ModifyCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *修改云原生网关路由
     * @param req ModifyCloudNativeAPIGatewayRouteRequest
     * @return ModifyCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteResponse ModifyCloudNativeAPIGatewayRoute(ModifyCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayRoute", ModifyCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *修改云原生网关限流插件(路由)
     * @param req ModifyCloudNativeAPIGatewayRouteRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteRateLimitResponse ModifyCloudNativeAPIGatewayRouteRateLimit(ModifyCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayRouteRateLimit", ModifyCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *修改云原生网关服务
     * @param req ModifyCloudNativeAPIGatewayServiceRequest
     * @return ModifyCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceResponse ModifyCloudNativeAPIGatewayService(ModifyCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayService", ModifyCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *修改云原生网关限流插件(服务)
     * @param req ModifyCloudNativeAPIGatewayServiceRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceRateLimitResponse ModifyCloudNativeAPIGatewayServiceRateLimit(ModifyCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayServiceRateLimit", ModifyCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *批量修改配置文件组
     * @param req ModifyConfigFileGroupRequest
     * @return ModifyConfigFileGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigFileGroupResponse ModifyConfigFileGroup(ModifyConfigFileGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfigFileGroup", ModifyConfigFileGroupResponse.class);
    }

    /**
     *修改配置文件
     * @param req ModifyConfigFilesRequest
     * @return ModifyConfigFilesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigFilesResponse ModifyConfigFiles(ModifyConfigFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfigFiles", ModifyConfigFilesResponse.class);
    }

    /**
     *修改网关实例Konga网络配置
     * @param req ModifyConsoleNetworkRequest
     * @return ModifyConsoleNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsoleNetworkResponse ModifyConsoleNetwork(ModifyConsoleNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsoleNetwork", ModifyConsoleNetworkResponse.class);
    }

    /**
     *修改治理中心服务别名
     * @param req ModifyGovernanceAliasRequest
     * @return ModifyGovernanceAliasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernanceAliasResponse ModifyGovernanceAlias(ModifyGovernanceAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernanceAlias", ModifyGovernanceAliasResponse.class);
    }

    /**
     *修改治理中心服务实例
     * @param req ModifyGovernanceInstancesRequest
     * @return ModifyGovernanceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernanceInstancesResponse ModifyGovernanceInstances(ModifyGovernanceInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernanceInstances", ModifyGovernanceInstancesResponse.class);
    }

    /**
     *修改治理中心命名空间
     * @param req ModifyGovernanceNamespacesRequest
     * @return ModifyGovernanceNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernanceNamespacesResponse ModifyGovernanceNamespaces(ModifyGovernanceNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernanceNamespaces", ModifyGovernanceNamespacesResponse.class);
    }

    /**
     *修改治理中心服务
     * @param req ModifyGovernanceServicesRequest
     * @return ModifyGovernanceServicesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGovernanceServicesResponse ModifyGovernanceServices(ModifyGovernanceServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGovernanceServices", ModifyGovernanceServicesResponse.class);
    }

    /**
     *修改云原生API网关实例分组基础信息
     * @param req ModifyNativeGatewayServerGroupRequest
     * @return ModifyNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNativeGatewayServerGroupResponse ModifyNativeGatewayServerGroup(ModifyNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNativeGatewayServerGroup", ModifyNativeGatewayServerGroupResponse.class);
    }

    /**
     *修改网关服务来源
     * @param req ModifyNativeGatewayServiceSourceRequest
     * @return ModifyNativeGatewayServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNativeGatewayServiceSourceResponse ModifyNativeGatewayServiceSource(ModifyNativeGatewayServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNativeGatewayServiceSource", ModifyNativeGatewayServiceSourceResponse.class);
    }

    /**
     *修改云原生API网关实例Kong访问策略，支持白名单或者黑名单。
     * @param req ModifyNetworkAccessStrategyRequest
     * @return ModifyNetworkAccessStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAccessStrategyResponse ModifyNetworkAccessStrategy(ModifyNetworkAccessStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkAccessStrategy", ModifyNetworkAccessStrategyResponse.class);
    }

    /**
     *修改云原生API网关实例网络基本信息，例如带宽以及描述，只支持修改客户端公网/内网的信息。
     * @param req ModifyNetworkBasicInfoRequest
     * @return ModifyNetworkBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkBasicInfoResponse ModifyNetworkBasicInfo(ModifyNetworkBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkBasicInfo", ModifyNetworkBasicInfoResponse.class);
    }

    /**
     *修改云原生网关上游实例节点健康状态
     * @param req ModifyUpstreamNodeStatusRequest
     * @return ModifyUpstreamNodeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUpstreamNodeStatusResponse ModifyUpstreamNodeStatus(ModifyUpstreamNodeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUpstreamNodeStatus", ModifyUpstreamNodeStatusResponse.class);
    }

    /**
     *开启 WAF 防护
     * @param req OpenWafProtectionRequest
     * @return OpenWafProtectionResponse
     * @throws TencentCloudSDKException
     */
    public OpenWafProtectionResponse OpenWafProtection(OpenWafProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenWafProtection", OpenWafProtectionResponse.class);
    }

    /**
     *发布配置文件
     * @param req PublishConfigFilesRequest
     * @return PublishConfigFilesResponse
     * @throws TencentCloudSDKException
     */
    public PublishConfigFilesResponse PublishConfigFiles(PublishConfigFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishConfigFiles", PublishConfigFilesResponse.class);
    }

    /**
     *重启微服务引擎实例
     * @param req RestartSREInstanceRequest
     * @return RestartSREInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartSREInstanceResponse RestartSREInstance(RestartSREInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartSREInstance", RestartSREInstanceResponse.class);
    }

    /**
     *回滚配置发布
     * @param req RollbackConfigFileReleasesRequest
     * @return RollbackConfigFileReleasesResponse
     * @throws TencentCloudSDKException
     */
    public RollbackConfigFileReleasesResponse RollbackConfigFileReleases(RollbackConfigFileReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackConfigFileReleases", RollbackConfigFileReleasesResponse.class);
    }

    /**
     *弹性伸缩策略批量解绑网关分组
     * @param req UnbindAutoScalerResourceStrategyFromGroupsRequest
     * @return UnbindAutoScalerResourceStrategyFromGroupsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoScalerResourceStrategyFromGroupsResponse UnbindAutoScalerResourceStrategyFromGroups(UnbindAutoScalerResourceStrategyFromGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindAutoScalerResourceStrategyFromGroups", UnbindAutoScalerResourceStrategyFromGroupsResponse.class);
    }

    /**
     *修改云原生网关证书信息
     * @param req UpdateCloudNativeAPIGatewayCertificateInfoRequest
     * @return UpdateCloudNativeAPIGatewayCertificateInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewayCertificateInfoResponse UpdateCloudNativeAPIGatewayCertificateInfo(UpdateCloudNativeAPIGatewayCertificateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewayCertificateInfo", UpdateCloudNativeAPIGatewayCertificateInfoResponse.class);
    }

    /**
     *修改云原生API网关实例的节点规格信息，例如节点扩缩容或者升降配
     * @param req UpdateCloudNativeAPIGatewaySpecRequest
     * @return UpdateCloudNativeAPIGatewaySpecResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewaySpecResponse UpdateCloudNativeAPIGatewaySpec(UpdateCloudNativeAPIGatewaySpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewaySpec", UpdateCloudNativeAPIGatewaySpecResponse.class);
    }

    /**
     *修改引擎公网访问配置
     * @param req UpdateEngineInternetAccessRequest
     * @return UpdateEngineInternetAccessResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEngineInternetAccessResponse UpdateEngineInternetAccess(UpdateEngineInternetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEngineInternetAccess", UpdateEngineInternetAccessResponse.class);
    }

    /**
     *更新云原生网关健康检查配置
     * @param req UpdateUpstreamHealthCheckConfigRequest
     * @return UpdateUpstreamHealthCheckConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUpstreamHealthCheckConfigResponse UpdateUpstreamHealthCheckConfig(UpdateUpstreamHealthCheckConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUpstreamHealthCheckConfig", UpdateUpstreamHealthCheckConfigResponse.class);
    }

    /**
     *更新网关上游实例列表，仅支持IPList服务类型
     * @param req UpdateUpstreamTargetsRequest
     * @return UpdateUpstreamTargetsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUpstreamTargetsResponse UpdateUpstreamTargets(UpdateUpstreamTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUpstreamTargets", UpdateUpstreamTargetsResponse.class);
    }

}
