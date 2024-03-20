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
package com.tencentcloudapi.teo.v20220901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220901.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-09-01";
    
    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *操作安全策略模板，支持将域名绑定或换绑到指定的策略模板，或者从指定的策略模板解绑。
     * @param req BindSecurityTemplateToEntityRequest
     * @return BindSecurityTemplateToEntityResponse
     * @throws TencentCloudSDKException
     */
    public BindSecurityTemplateToEntityResponse BindSecurityTemplateToEntity(BindSecurityTemplateToEntityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSecurityTemplateToEntity", BindSecurityTemplateToEntityResponse.class);
    }

    /**
     *用于加速域名绑定或解绑共享 CNAME，该功能白名单内测中。
     * @param req BindSharedCNAMERequest
     * @return BindSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public BindSharedCNAMEResponse BindSharedCNAME(BindSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSharedCNAME", BindSharedCNAMEResponse.class);
    }

    /**
     *将未绑定套餐的站点绑定到已有套餐
     * @param req BindZoneToPlanRequest
     * @return BindZoneToPlanResponse
     * @throws TencentCloudSDKException
     */
    public BindZoneToPlanResponse BindZoneToPlan(BindZoneToPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindZoneToPlan", BindZoneToPlanResponse.class);
    }

    /**
     *校验域名 CNAME 状态
     * @param req CheckCnameStatusRequest
     * @return CheckCnameStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckCnameStatusResponse CheckCnameStatus(CheckCnameStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCnameStatus", CheckCnameStatusResponse.class);
    }

    /**
     *在创建完站点之后，您可以通过本接口创建加速域名。 

CNAME 模式接入时，若您未完成站点归属权校验，本接口将为您返回域名归属权验证信息，您可以单独对域名进行归属权验证，详情参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789)。
     * @param req CreateAccelerationDomainRequest
     * @return CreateAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerationDomainResponse CreateAccelerationDomain(CreateAccelerationDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccelerationDomain", CreateAccelerationDomainResponse.class);
    }

    /**
     *创建别称域名。
     * @param req CreateAliasDomainRequest
     * @return CreateAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasDomainResponse CreateAliasDomain(CreateAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAliasDomain", CreateAliasDomainResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版 [创建四层代理实例](https://cloud.tencent.com/document/product/1552/103417) 。
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxy", CreateApplicationProxyResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [创建四层代理转发规则
](https://cloud.tencent.com/document/product/1552/103416) 。
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationProxyRule", CreateApplicationProxyRuleResponse.class);
    }

    /**
     *针对指定实时日志投递任务（task-id），在对应的腾讯云 CLS 日志主题中创建投递日志字段对应的键值索引。如果您在腾讯云 CLS 已经创建索引，本接口将采用合并的方式追加索引。
     * @param req CreateCLSIndexRequest
     * @return CreateCLSIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSIndexResponse CreateCLSIndex(CreateCLSIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSIndex", CreateCLSIndexResponse.class);
    }

    /**
     *在版本管理模式下，用于创建指定配置组的新版本。版本管理功能内测中，当前仅白名单开放。
     * @param req CreateConfigGroupVersionRequest
     * @return CreateConfigGroupVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigGroupVersionResponse CreateConfigGroupVersion(CreateConfigGroupVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigGroupVersion", CreateConfigGroupVersionResponse.class);
    }

    /**
     *用于创建四层代理实例。
     * @param req CreateL4ProxyRequest
     * @return CreateL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ProxyResponse CreateL4Proxy(CreateL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4Proxy", CreateL4ProxyResponse.class);
    }

    /**
     *用于创建四层代理实例规则，支持单条或者批量创建。
     * @param req CreateL4ProxyRulesRequest
     * @return CreateL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ProxyRulesResponse CreateL4ProxyRules(CreateL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4ProxyRules", CreateL4ProxyRulesResponse.class);
    }

    /**
     *创建源站组，以源站组的方式管理业务源站。此处配置的源站组可于**添加加速域名**和**四层代理**等功能中引用。
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOriginGroup", CreateOriginGroupResponse.class);
    }

    /**
     *为未购买套餐的站点购买套餐
     * @param req CreatePlanForZoneRequest
     * @return CreatePlanForZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanForZoneResponse CreatePlanForZone(CreatePlanForZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlanForZone", CreatePlanForZoneResponse.class);
    }

    /**
     *创建预热任务
     * @param req CreatePrefetchTaskRequest
     * @return CreatePrefetchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrefetchTaskResponse CreatePrefetchTask(CreatePrefetchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrefetchTask", CreatePrefetchTaskResponse.class);
    }

    /**
     *当源站资源更新，但节点缓存 TTL 未过期时，用户仍会访问到旧的资源，此时可以通过该接口实现节点资源更新。触发更新的方法有以下两种：<li>直接删除：不做任何校验，直接删除节点缓存，用户请求时触发回源拉取；</li><li>标记过期：将节点资源置为过期，用户请求时触发回源校验，即发送带有 If-None-Match 和 If-Modified-Since 头部的 HTTP 条件请求。若源站响应 200，则节点会回源拉取新的资源并更新缓存；若源站响应 304，则节点不会更新缓存；</li>

清除缓存任务详情请查看[清除缓存](https://cloud.tencent.com/document/product/1552/70759)。
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePurgeTask", CreatePurgeTaskResponse.class);
    }

    /**
     *通过本接口创建实时日志投递任务。本接口有如下限制：
同一个实体（七层域名或者四层代理实例）在同种数据投递类型（LogType）和数据投递区域（Area）的组合下，只能被添加到一个实时日志投递任务中。建议先通过 [DescribeRealtimeLogDeliveryTasks](https://cloud.tencent.com/document/product/1552/104110)  接口根据实体查询实时日志投递任务列表，检查实体是否已经被添加到另一实时日志投递任务中。
     * @param req CreateRealtimeLogDeliveryTaskRequest
     * @return CreateRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRealtimeLogDeliveryTaskResponse CreateRealtimeLogDeliveryTask(CreateRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRealtimeLogDeliveryTask", CreateRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *规则引擎创建规则。
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *创建安全 IP 组
     * @param req CreateSecurityIPGroupRequest
     * @return CreateSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityIPGroupResponse CreateSecurityIPGroup(CreateSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityIPGroup", CreateSecurityIPGroupResponse.class);
    }

    /**
     *用于创建共享 CNAME，该功能白名单内测中。
     * @param req CreateSharedCNAMERequest
     * @return CreateSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public CreateSharedCNAMEResponse CreateSharedCNAME(CreateSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSharedCNAME", CreateSharedCNAMEResponse.class);
    }

    /**
     *EdgeOne 为您提供 CNAME、NS 和无域名接入三种接入方式，您需要先通过此接口完成站点创建。CNAME 和 NS 接入站点的场景可参考 [从零开始快速接入 EdgeOne](https://cloud.tencent.com/document/product/1552/87601); 无域名接入的场景可参考 [快速启用四层代理服务](https://cloud.tencent.com/document/product/1552/96051)。

> 建议您在账号下已存在套餐时调用本接口创建站点，请在入参时传入 PlanId ，直接将站点绑定至该套餐；不传入 PlanId 时，创建出来的站点会处于未激活状态，无法正常服务，您需要通过 [BindZoneToPlan](https://cloud.tencent.com/document/product/1552/83042) 完成套餐绑定之后，站点才可正常提供服务 。若您当前没有可绑定的套餐时，请前往控制台购买套餐完成站点创建。
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateZone", CreateZoneResponse.class);
    }

    /**
     *批量删除加速域名
     * @param req DeleteAccelerationDomainsRequest
     * @return DeleteAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerationDomainsResponse DeleteAccelerationDomains(DeleteAccelerationDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccelerationDomains", DeleteAccelerationDomainsResponse.class);
    }

    /**
     *删除别称域名。
     * @param req DeleteAliasDomainRequest
     * @return DeleteAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasDomainResponse DeleteAliasDomain(DeleteAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAliasDomain", DeleteAliasDomainResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [删除四层代理实例
](https://cloud.tencent.com/document/product/1552/103415) 。
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxy", DeleteApplicationProxyResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [删除四层代理转发规则](https://cloud.tencent.com/document/product/1552/103414) 。
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationProxyRule", DeleteApplicationProxyRuleResponse.class);
    }

    /**
     *用于删除四层代理实例。
     * @param req DeleteL4ProxyRequest
     * @return DeleteL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4ProxyResponse DeleteL4Proxy(DeleteL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL4Proxy", DeleteL4ProxyResponse.class);
    }

    /**
     *用于删除四层代理转发规则，支持单条或者批量操作。
     * @param req DeleteL4ProxyRulesRequest
     * @return DeleteL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4ProxyRulesResponse DeleteL4ProxyRules(DeleteL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL4ProxyRules", DeleteL4ProxyRulesResponse.class);
    }

    /**
     *删除源站组，若源站组仍然被服务（例如：四层代理，域名服务，负载均衡，规则引起）引用，将不允许删除。
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOriginGroup", DeleteOriginGroupResponse.class);
    }

    /**
     *通过本接口删除实时日志投递任务。
     * @param req DeleteRealtimeLogDeliveryTaskRequest
     * @return DeleteRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRealtimeLogDeliveryTaskResponse DeleteRealtimeLogDeliveryTask(DeleteRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRealtimeLogDeliveryTask", DeleteRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *批量删除规则引擎规则。
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRules", DeleteRulesResponse.class);
    }

    /**
     *删除指定 IP 组，如果有规则引用了 IP 组情况，则不允许删除。
     * @param req DeleteSecurityIPGroupRequest
     * @return DeleteSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityIPGroupResponse DeleteSecurityIPGroup(DeleteSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityIPGroup", DeleteSecurityIPGroupResponse.class);
    }

    /**
     *用于删除共享 CNAME，该功能白名单内测中。
     * @param req DeleteSharedCNAMERequest
     * @return DeleteSharedCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSharedCNAMEResponse DeleteSharedCNAME(DeleteSharedCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSharedCNAME", DeleteSharedCNAMEResponse.class);
    }

    /**
     *删除站点。
     * @param req DeleteZoneRequest
     * @return DeleteZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteZoneResponse DeleteZone(DeleteZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteZone", DeleteZoneResponse.class);
    }

    /**
     *在版本管理模式下，用于版本发布，可通过 EnvId 将版本发布至测试环境或生产环境。版本管理功能内测中，当前仅白名单开放。
     * @param req DeployConfigGroupVersionRequest
     * @return DeployConfigGroupVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeployConfigGroupVersionResponse DeployConfigGroupVersion(DeployConfigGroupVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployConfigGroupVersion", DeployConfigGroupVersionResponse.class);
    }

    /**
     *您可以通过本接口查看站点下的域名信息，包括加速域名、源站以及域名状态等信息。您可以查看站点下全部域名的信息，也可以指定过滤条件查询对应的域名信息。
     * @param req DescribeAccelerationDomainsRequest
     * @return DescribeAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerationDomainsResponse DescribeAccelerationDomains(DescribeAccelerationDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerationDomains", DescribeAccelerationDomainsResponse.class);
    }

    /**
     *查询别称域名信息列表。
     * @param req DescribeAliasDomainsRequest
     * @return DescribeAliasDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasDomainsResponse DescribeAliasDomains(DescribeAliasDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAliasDomains", DescribeAliasDomainsResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，新版接口中将四层代理实例列表的查询和四层转发规则的查询拆分成两个接口，详情请参考 [查询四层代理实例列表](https://cloud.tencent.com/document/product/1552/103413) 和 [查询四层代理转发规则列表](https://cloud.tencent.com/document/product/1552/103412)。
     * @param req DescribeApplicationProxiesRequest
     * @return DescribeApplicationProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxiesResponse DescribeApplicationProxies(DescribeApplicationProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationProxies", DescribeApplicationProxiesResponse.class);
    }

    /**
     *查询当前账户可用套餐信息列表
     * @param req DescribeAvailablePlansRequest
     * @return DescribeAvailablePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailablePlansResponse DescribeAvailablePlans(DescribeAvailablePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailablePlans", DescribeAvailablePlansResponse.class);
    }

    /**
     *通过本接口查询计费数据。
     * @param req DescribeBillingDataRequest
     * @return DescribeBillingDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingDataResponse DescribeBillingData(DescribeBillingDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingData", DescribeBillingDataResponse.class);
    }

    /**
     *在版本管理模式下，用于获取版本的详细信息，包括版本 ID、描述、状态、创建时间、所属配置组信息以及版本配置文件的内容。版本管理功能内测中，当前仅白名单开放。
     * @param req DescribeConfigGroupVersionDetailRequest
     * @return DescribeConfigGroupVersionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigGroupVersionDetailResponse DescribeConfigGroupVersionDetail(DescribeConfigGroupVersionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigGroupVersionDetail", DescribeConfigGroupVersionDetailResponse.class);
    }

    /**
     *在版本管理模式下，用于查询指定配置组的版本列表。版本管理功能内测中，当前仅白名单开放。
     * @param req DescribeConfigGroupVersionsRequest
     * @return DescribeConfigGroupVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigGroupVersionsResponse DescribeConfigGroupVersions(DescribeConfigGroupVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigGroupVersions", DescribeConfigGroupVersionsResponse.class);
    }

    /**
     *查询内容管理接口配额
     * @param req DescribeContentQuotaRequest
     * @return DescribeContentQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentQuotaResponse DescribeContentQuota(DescribeContentQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentQuota", DescribeContentQuotaResponse.class);
    }

    /**
     *本接口（DescribeDDoSAttackData）用于查询DDoS攻击时序数据。
     * @param req DescribeDDoSAttackDataRequest
     * @return DescribeDDoSAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackDataResponse DescribeDDoSAttackData(DescribeDDoSAttackDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackData", DescribeDDoSAttackDataResponse.class);
    }

    /**
     *本接口（DescribeDDoSAttackEvent）用于查询DDoS攻击事件列表。
     * @param req DescribeDDoSAttackEventRequest
     * @return DescribeDDoSAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventResponse DescribeDDoSAttackEvent(DescribeDDoSAttackEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackEvent", DescribeDDoSAttackEventResponse.class);
    }

    /**
     *本接口（DescribeDDoSAttackTopData）用于查询DDoS攻击Top数据。
     * @param req DescribeDDoSAttackTopDataRequest
     * @return DescribeDDoSAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackTopDataResponse DescribeDDoSAttackTopData(DescribeDDoSAttackTopDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSAttackTopData", DescribeDDoSAttackTopDataResponse.class);
    }

    /**
     *查询默认证书列表
     * @param req DescribeDefaultCertificatesRequest
     * @return DescribeDefaultCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultCertificatesResponse DescribeDefaultCertificates(DescribeDefaultCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultCertificates", DescribeDefaultCertificatesResponse.class);
    }

    /**
     *在版本管理模式下，用于查询生产/测试环境的版本发布历史。版本管理功能内测中，当前仅白名单开放。
     * @param req DescribeDeployHistoryRequest
     * @return DescribeDeployHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployHistoryResponse DescribeDeployHistory(DescribeDeployHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeployHistory", DescribeDeployHistoryResponse.class);
    }

    /**
     *在版本管理模式下，用于查询环境信息，可获取环境 ID、类型、当前生效版本等。版本管理功能内测中，当前仅白名单开放。
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *用于查询域名配置信息
     * @param req DescribeHostsSettingRequest
     * @return DescribeHostsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsSettingResponse DescribeHostsSetting(DescribeHostsSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostsSetting", DescribeHostsSettingResponse.class);
    }

    /**
     *该接口可用于查询 IP 是否为 EdgeOne IP。
     * @param req DescribeIPRegionRequest
     * @return DescribeIPRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPRegionResponse DescribeIPRegion(DescribeIPRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPRegion", DescribeIPRegionResponse.class);
    }

    /**
     *查询站点的验证信息。
     * @param req DescribeIdentificationsRequest
     * @return DescribeIdentificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationsResponse DescribeIdentifications(DescribeIdentificationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdentifications", DescribeIdentificationsResponse.class);
    }

    /**
     *用于查询四层代理实例列表。
     * @param req DescribeL4ProxyRequest
     * @return DescribeL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ProxyResponse DescribeL4Proxy(DescribeL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4Proxy", DescribeL4ProxyResponse.class);
    }

    /**
     *查询四层代理实例下的转发规则列表。
     * @param req DescribeL4ProxyRulesRequest
     * @return DescribeL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ProxyRulesResponse DescribeL4ProxyRules(DescribeL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4ProxyRules", DescribeL4ProxyRulesResponse.class);
    }

    /**
     *获取源站组列表
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroup", DescribeOriginGroupResponse.class);
    }

    /**
     *查询源站防护信息
     * @param req DescribeOriginProtectionRequest
     * @return DescribeOriginProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginProtectionResponse DescribeOriginProtection(DescribeOriginProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginProtection", DescribeOriginProtectionResponse.class);
    }

    /**
     *本接口（DescribeOverviewL7Data）用于查询七层监控类时序流量数据。此接口待废弃，请使用 <a href="https://cloud.tencent.com/document/product/1552/80648">DescribeTimingL7AnalysisData</a> 接口。
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewL7Data", DescribeOverviewL7DataResponse.class);
    }

    /**
     *DescribePrefetchTasks 用于查询预热任务提交历史记录及执行进度，通过 CreatePrefetchTasks 接口提交的任务可通过此接口进行查询。
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrefetchTasks", DescribePrefetchTasksResponse.class);
    }

    /**
     *DescribePurgeTasks 用于查询提交的 URL 刷新、目录刷新记录及执行进度，通过 CreatePurgeTasks 接口提交的任务均可通过此接口进行查询。
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
    }

    /**
     *通过本接口查询实时日志投递任务列表。
     * @param req DescribeRealtimeLogDeliveryTasksRequest
     * @return DescribeRealtimeLogDeliveryTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeLogDeliveryTasksResponse DescribeRealtimeLogDeliveryTasks(DescribeRealtimeLogDeliveryTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealtimeLogDeliveryTasks", DescribeRealtimeLogDeliveryTasksResponse.class);
    }

    /**
     *查询规则引擎规则。
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *返回规则引擎可应用匹配请求的设置列表及其详细建议配置信息
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesSetting", DescribeRulesSettingResponse.class);
    }

    /**
     *查询 IP 组的配置信息，包括 IP 组名称、 IP 组内容、 IP 组归属站点。
     * @param req DescribeSecurityIPGroupInfoRequest
     * @return DescribeSecurityIPGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupInfoResponse DescribeSecurityIPGroupInfo(DescribeSecurityIPGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroupInfo", DescribeSecurityIPGroupInfoResponse.class);
    }

    /**
     *查询指定策略模板的绑定关系列表。
     * @param req DescribeSecurityTemplateBindingsRequest
     * @return DescribeSecurityTemplateBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTemplateBindingsResponse DescribeSecurityTemplateBindings(DescribeSecurityTemplateBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityTemplateBindings", DescribeSecurityTemplateBindingsResponse.class);
    }

    /**
     *本接口（DescribeTimingL4Data）用于查询四层时序流量数据列表。
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL4Data", DescribeTimingL4DataResponse.class);
    }

    /**
     *本接口（DescribeTimingL7AnalysisData）查询七层数据分析类时序数据。
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7AnalysisData", DescribeTimingL7AnalysisDataResponse.class);
    }

    /**
     *本接口（DescribeTimingL7CacheData）用于查询七层缓存分析时序类流量数据。
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7CacheData", DescribeTimingL7CacheDataResponse.class);
    }

    /**
     *本接口（DescribeTopL7AnalysisData）用于查询七层流量前topN的数据。
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7AnalysisData", DescribeTopL7AnalysisDataResponse.class);
    }

    /**
     *本接口（DescribeTopL7CacheData）用于查询七层缓存分析topN流量数据。
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7CacheData", DescribeTopL7CacheDataResponse.class);
    }

    /**
     *用于查询站点的所有配置信息。
     * @param req DescribeZoneSettingRequest
     * @return DescribeZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneSettingResponse DescribeZoneSetting(DescribeZoneSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneSetting", DescribeZoneSettingResponse.class);
    }

    /**
     *该接口用于查询您有权限的站点信息。可根据不同查询条件筛选站点。
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *本接口（DownloadL4Logs）用于下载四层离线日志。
     * @param req DownloadL4LogsRequest
     * @return DownloadL4LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL4LogsResponse DownloadL4Logs(DownloadL4LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL4Logs", DownloadL4LogsResponse.class);
    }

    /**
     *本接口（DownloadL7Logs）下载七层离线日志。
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadL7Logs", DownloadL7LogsResponse.class);
    }

    /**
     *用于验证站点所有权。
     * @param req IdentifyZoneRequest
     * @return IdentifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public IdentifyZoneResponse IdentifyZone(IdentifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IdentifyZone", IdentifyZoneResponse.class);
    }

    /**
     *修改加速域名信息
     * @param req ModifyAccelerationDomainRequest
     * @return ModifyAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainResponse ModifyAccelerationDomain(ModifyAccelerationDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerationDomain", ModifyAccelerationDomainResponse.class);
    }

    /**
     *批量修改加速域名状态
     * @param req ModifyAccelerationDomainStatusesRequest
     * @return ModifyAccelerationDomainStatusesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainStatusesResponse ModifyAccelerationDomainStatuses(ModifyAccelerationDomainStatusesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerationDomainStatuses", ModifyAccelerationDomainStatusesResponse.class);
    }

    /**
     *修改别称域名。
     * @param req ModifyAliasDomainRequest
     * @return ModifyAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainResponse ModifyAliasDomain(ModifyAliasDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAliasDomain", ModifyAliasDomainResponse.class);
    }

    /**
     *修改别称域名状态。
     * @param req ModifyAliasDomainStatusRequest
     * @return ModifyAliasDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainStatusResponse ModifyAliasDomainStatus(ModifyAliasDomainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAliasDomainStatus", ModifyAliasDomainStatusResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [修改四层代理实例
](https://cloud.tencent.com/document/product/1552/103411) 。
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxy", ModifyApplicationProxyResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [修改四层代理转发规则
](https://cloud.tencent.com/document/product/1552/103410) 。
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRule", ModifyApplicationProxyRuleResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [修改四层代理转发规则状态
](https://cloud.tencent.com/document/product/1552/103409) 。
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyRuleStatus", ModifyApplicationProxyRuleStatusResponse.class);
    }

    /**
     *本接口为旧版，如需调用请尽快迁移至新版，详情请参考 [修改四层代理实例状态](https://cloud.tencent.com/document/product/1552/103408) 。
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationProxyStatus", ModifyApplicationProxyStatusResponse.class);
    }

    /**
     *完成域名创建之后，您可以为域名配置自有证书，也可以使用 EdgeOne 为您提供的 [免费证书](https://cloud.tencent.com/document/product/1552/90437)。
如果您需要配置自有证书，请先将证书上传至 [SSL证书控制台](https://console.cloud.tencent.com/certoverview)，然后在本接口中传入对应的证书 ID。详情参考 [部署自有证书至 EdgeOne 域名
](https://cloud.tencent.com/document/product/1552/88874)。
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostsCertificate", ModifyHostsCertificateResponse.class);
    }

    /**
     *用于修改四层代理实例的配置。
     * @param req ModifyL4ProxyRequest
     * @return ModifyL4ProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyResponse ModifyL4Proxy(ModifyL4ProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4Proxy", ModifyL4ProxyResponse.class);
    }

    /**
     *用于修改四层代理转发规则，支持单条或者批量修改。
     * @param req ModifyL4ProxyRulesRequest
     * @return ModifyL4ProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyRulesResponse ModifyL4ProxyRules(ModifyL4ProxyRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyRules", ModifyL4ProxyRulesResponse.class);
    }

    /**
     *用于启用/停用四层代理转发规则状态，支持单条或者批量操作。
     * @param req ModifyL4ProxyRulesStatusRequest
     * @return ModifyL4ProxyRulesStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyRulesStatusResponse ModifyL4ProxyRulesStatus(ModifyL4ProxyRulesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyRulesStatus", ModifyL4ProxyRulesStatusResponse.class);
    }

    /**
     *用于启用/停用四层代理实例。
     * @param req ModifyL4ProxyStatusRequest
     * @return ModifyL4ProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ProxyStatusResponse ModifyL4ProxyStatus(ModifyL4ProxyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4ProxyStatus", ModifyL4ProxyStatusResponse.class);
    }

    /**
     *修改源站组配置，新提交的源站记录将会覆盖原有源站组中的源站记录。
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOriginGroup", ModifyOriginGroupResponse.class);
    }

    /**
     *通过本接口修改实时日志投递任务配置。本接口有如下限制：<li>不支持修改实时日志投递任务目的地类型（TaskType）；</li><li>不支持修改数据投递类型（LogType）</li><li>不支持修改数据投递区域（Area）</li><li>当原实时日志投递任务的目的地为腾讯云 CLS 时，不支持修改目的地详细配置，如日志集、日志主题。</li>
     * @param req ModifyRealtimeLogDeliveryTaskRequest
     * @return ModifyRealtimeLogDeliveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealtimeLogDeliveryTaskResponse ModifyRealtimeLogDeliveryTask(ModifyRealtimeLogDeliveryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRealtimeLogDeliveryTask", ModifyRealtimeLogDeliveryTaskResponse.class);
    }

    /**
     *修改规则引擎规则。
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *修改安全 IP 组。
     * @param req ModifySecurityIPGroupRequest
     * @return ModifySecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityIPGroupResponse ModifySecurityIPGroup(ModifySecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityIPGroup", ModifySecurityIPGroupResponse.class);
    }

    /**
     *修改Web&Bot安全配置。
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityPolicy", ModifySecurityPolicyResponse.class);
    }

    /**
     *修改站点信息。
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZone", ModifyZoneResponse.class);
    }

    /**
     *用于修改站点配置
     * @param req ModifyZoneSettingRequest
     * @return ModifyZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneSettingResponse ModifyZoneSetting(ModifyZoneSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneSetting", ModifyZoneSettingResponse.class);
    }

    /**
     *用于开启，关闭站点。
     * @param req ModifyZoneStatusRequest
     * @return ModifyZoneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneStatusResponse ModifyZoneStatus(ModifyZoneStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyZoneStatus", ModifyZoneStatusResponse.class);
    }

    /**
     *在 CNAME 接入模式下，您需要对站点或者域名的归属权进行验证，可以通过本接口触发验证。若站点通过归属权验证后，后续添加域名无需再验证。详情参考 [站点/域名归属权验证](https://cloud.tencent.com/document/product/1552/70789)。

在 NS 接入模式下，您也可以通过本接口来查询 NS 服务器是否切换成功，详情参考 [修改 DNS 服务器](https://cloud.tencent.com/document/product/1552/90452)。
     * @param req VerifyOwnershipRequest
     * @return VerifyOwnershipResponse
     * @throws TencentCloudSDKException
     */
    public VerifyOwnershipResponse VerifyOwnership(VerifyOwnershipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyOwnership", VerifyOwnershipResponse.class);
    }

}
