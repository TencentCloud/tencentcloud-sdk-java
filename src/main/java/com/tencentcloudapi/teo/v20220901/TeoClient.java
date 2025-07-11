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
     *本接口用于回源 IP 网段发生变更时，确认已将最新回源 IP 网段更新至源站防火墙。确认已更新至最新的回源 IP 网段后，相关变更通知将会停止推送。
     * @param req ConfirmOriginACLUpdateRequest
     * @return ConfirmOriginACLUpdateResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmOriginACLUpdateResponse ConfirmOriginACLUpdate(ConfirmOriginACLUpdateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmOriginACLUpdate", ConfirmOriginACLUpdateResponse.class);
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
该功能仅企业版套餐支持，并且该功能当前仍在内测中，如需使用，请[联系我们](https://cloud.tencent.com/online-service?from=connect-us)。
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
     *创建内容标识符，可以设置描述、标签等信息，同时需要绑定企业版套餐用于统计计费数据；一个内容标识符只能绑定一个计费套餐，一个计费套餐可以绑定多个内容标识符。该功能仅限白名单开放。
     * @param req CreateContentIdentifierRequest
     * @return CreateContentIdentifierResponse
     * @throws TencentCloudSDKException
     */
    public CreateContentIdentifierResponse CreateContentIdentifier(CreateContentIdentifierRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContentIdentifier", CreateContentIdentifierResponse.class);
    }

    /**
     *创建自定义错误页面。
     * @param req CreateCustomizeErrorPageRequest
     * @return CreateCustomizeErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomizeErrorPageResponse CreateCustomizeErrorPage(CreateCustomizeErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomizeErrorPage", CreateCustomizeErrorPageResponse.class);
    }

    /**
     *在创建完站点后，并且站点为 NS 模式接入时，您可以通过本接口创建 DNS 记录。
     * @param req CreateDnsRecordRequest
     * @return CreateDnsRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateDnsRecordResponse CreateDnsRecord(CreateDnsRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDnsRecord", CreateDnsRecordResponse.class);
    }

    /**
     *创建并部署边缘函数至 EdgeOne 的边缘节点。
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunction", CreateFunctionResponse.class);
    }

    /**
     *创建边缘函数的触发规则。
     * @param req CreateFunctionRuleRequest
     * @return CreateFunctionRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionRuleResponse CreateFunctionRule(CreateFunctionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunctionRule", CreateFunctionRuleResponse.class);
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
     *本接口用于在[规则引擎](https://cloud.tencent.com/document/product/1552/70901)中创建规则，支持批量创建。
     * @param req CreateL7AccRulesRequest
     * @return CreateL7AccRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7AccRulesResponse CreateL7AccRules(CreateL7AccRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL7AccRules", CreateL7AccRulesResponse.class);
    }

    /**
     *创建负载均衡实例。详情请参考 [快速创建负载均衡实例](https://cloud.tencent.com/document/product/1552/104223)。负载均衡功能内测中，如您需要使用请 [联系我们](https://cloud.tencent.com/online-service)。
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
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
     *若您需要使用 Edgeone 产品，您需要通过此接口创建计费套餐。
> 创建套餐后，您需要通过 [CreateZone](https://cloud.tencent.com/document/product/1552/80719) 完成创建站点，绑定套餐的流程，Edgeone 才能正常提供服务。
     * @param req CreatePlanRequest
     * @return CreatePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanResponse CreatePlan(CreatePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePlan", CreatePlanResponse.class);
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
     *本接口为旧版本创建规则引擎接口，EdgeOne 于 2025 年 1 月 21 日已对规则引擎相关接口全面升级，新版本创建七层加速规则接口详情请参考 [CreateL7AccRules](https://cloud.tencent.com/document/product/1552/115822)。
<p style="color: red;">注意：自 2025 年 1 月 21 日起，旧版接口停止更新迭代，后续新增功能将仅在新版接口中提供，旧版接口支持的原有能力将不受影响。为避免在使用旧版接口时出现数据字段冲突，建议您尽早迁移到新版规则引擎接口。</p>
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
     *创建安全策略配置模板
     * @param req CreateWebSecurityTemplateRequest
     * @return CreateWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebSecurityTemplateResponse CreateWebSecurityTemplate(CreateWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWebSecurityTemplate", CreateWebSecurityTemplateResponse.class);
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
该功能仅企业版套餐支持，并且该功能当前仍在内测中，如需使用，请[联系我们](https://cloud.tencent.com/online-service?from=connect-us)。
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
     *删除指定的内容标识符。该功能仅白名单开放。
     * @param req DeleteContentIdentifierRequest
     * @return DeleteContentIdentifierResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContentIdentifierResponse DeleteContentIdentifier(DeleteContentIdentifierRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContentIdentifier", DeleteContentIdentifierResponse.class);
    }

    /**
     *删除自定义错误页面。
     * @param req DeleteCustomErrorPageRequest
     * @return DeleteCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomErrorPageResponse DeleteCustomErrorPage(DeleteCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomErrorPage", DeleteCustomErrorPageResponse.class);
    }

    /**
     *您可以用本接口批量删除 DNS 记录。
     * @param req DeleteDnsRecordsRequest
     * @return DeleteDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDnsRecordsResponse DeleteDnsRecords(DeleteDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDnsRecords", DeleteDnsRecordsResponse.class);
    }

    /**
     *删除边缘函数，删除后函数无法恢复，关联的触发规则会一并删除。
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunction", DeleteFunctionResponse.class);
    }

    /**
     *删除边缘函数触发规则。
     * @param req DeleteFunctionRulesRequest
     * @return DeleteFunctionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionRulesResponse DeleteFunctionRules(DeleteFunctionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunctionRules", DeleteFunctionRulesResponse.class);
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
     *本接口用于删除[规则引擎](https://cloud.tencent.com/document/product/1552/70901)的规则，支持批量删除。
     * @param req DeleteL7AccRulesRequest
     * @return DeleteL7AccRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7AccRulesResponse DeleteL7AccRules(DeleteL7AccRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL7AccRules", DeleteL7AccRulesResponse.class);
    }

    /**
     *删除负载均衡实例，若负载均衡示例被其他服务（例如：四层代理等）引用的时候，示例无法被删除，需要先解除引用关系。负载均衡功能内测中，如您需要使用请 [联系我们](https://cloud.tencent.com/online-service)。
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
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
     *本接口为旧版本删除规则引擎接口，EdgeOne 于 2025 年 1 月 21 日已对规则引擎相关接口全面升级，新版本删除七层加速规则接口详情请参考 [DeleteL7AccRules](https://cloud.tencent.com/document/product/1552/115821)。
<p style="color: red;">注意：自 2025 年 1 月 21 日起，旧版接口停止更新迭代，后续新增功能将仅在新版接口中提供，旧版接口支持的原有能力将不受影响。为避免在使用旧版接口时出现数据字段冲突，建议您尽早迁移到新版规则引擎接口。</p>
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
     *删除安全策略配置模板
     * @param req DeleteWebSecurityTemplateRequest
     * @return DeleteWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebSecurityTemplateResponse DeleteWebSecurityTemplate(DeleteWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebSecurityTemplate", DeleteWebSecurityTemplateResponse.class);
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
该功能仅企业版套餐支持，并且该功能当前仍在内测中，如需使用，请[联系我们](https://cloud.tencent.com/online-service?from=connect-us)。
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
     *批量查询内容标识符，可以根据 ID、描述、状态或者标签过滤。按照状态查询被删除的内容标识符仅保留三个月。该功能仅白名单开放。
     * @param req DescribeContentIdentifiersRequest
     * @return DescribeContentIdentifiersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentIdentifiersResponse DescribeContentIdentifiers(DescribeContentIdentifiersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContentIdentifiers", DescribeContentIdentifiersResponse.class);
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
     *查询自定义错误页列表。
     * @param req DescribeCustomErrorPagesRequest
     * @return DescribeCustomErrorPagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomErrorPagesResponse DescribeCustomErrorPages(DescribeCustomErrorPagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomErrorPages", DescribeCustomErrorPagesResponse.class);
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
     *您可以用过本接口查看站点下的 DNS 记录信息，包括 DNS 记录名、记录类型以及记录内容等信息，支持指定过滤条件查询对应的 DNS 记录信息。
     * @param req DescribeDnsRecordsRequest
     * @return DescribeDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsRecordsResponse DescribeDnsRecords(DescribeDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDnsRecords", DescribeDnsRecordsResponse.class);
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
     *查询边缘函数触发规则列表，支持按照规则 ID、函数 ID、规则描述等条件进行过滤。
     * @param req DescribeFunctionRulesRequest
     * @return DescribeFunctionRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionRulesResponse DescribeFunctionRules(DescribeFunctionRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionRules", DescribeFunctionRulesResponse.class);
    }

    /**
     *查询边缘函数运行环境，包括环境变量。
     * @param req DescribeFunctionRuntimeEnvironmentRequest
     * @return DescribeFunctionRuntimeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionRuntimeEnvironmentResponse DescribeFunctionRuntimeEnvironment(DescribeFunctionRuntimeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctionRuntimeEnvironment", DescribeFunctionRuntimeEnvironmentResponse.class);
    }

    /**
     *查询边缘函数列表，支持函数 ID、函数名称、描述等条件的过滤。
     * @param req DescribeFunctionsRequest
     * @return DescribeFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionsResponse DescribeFunctions(DescribeFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFunctions", DescribeFunctionsResponse.class);
    }

    /**
     *本接口为旧版，EdgeOne 已对规则引擎相关接口全面升级，可通过 [DescribeL7AccSetting](https://cloud.tencent.com/document/product/1552/115819) 和 [DescribeL7AccRules](https://cloud.tencent.com/document/product/1552/115820) 来获取域名的详细配置。
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
     *本接口用于查询[规则引擎](https://cloud.tencent.com/document/product/1552/70901)的规则列表。
     * @param req DescribeL7AccRulesRequest
     * @return DescribeL7AccRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7AccRulesResponse DescribeL7AccRules(DescribeL7AccRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7AccRules", DescribeL7AccRulesResponse.class);
    }

    /**
     *本接口用于查询[站点加速](https://cloud.tencent.com/document/product/1552/96193)全局配置。
     * @param req DescribeL7AccSettingRequest
     * @return DescribeL7AccSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7AccSettingResponse DescribeL7AccSetting(DescribeL7AccSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7AccSetting", DescribeL7AccSettingResponse.class);
    }

    /**
     *查询负载均衡实例列表。负载均衡功能内测中，如您需要使用请 [联系我们](https://cloud.tencent.com/online-service)。
     * @param req DescribeLoadBalancerListRequest
     * @return DescribeLoadBalancerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerListResponse DescribeLoadBalancerList(DescribeLoadBalancerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerList", DescribeLoadBalancerListResponse.class);
    }

    /**
     *本接口用于查询站点下的七层加速域名/四层代理实例与回源 IP 网段的绑定关系，以及回源 IP 网段详情。如果您想通过自动化脚本定期获取回源 IP 网段的最新版本，可以较低频率（建议每三天一次）轮询本接口，若 NextOriginACL 字段有返回值，则将最新的回源 IP 网段同步到源站防火墙配置中。
     * @param req DescribeOriginACLRequest
     * @return DescribeOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginACLResponse DescribeOriginACL(DescribeOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginACL", DescribeOriginACLResponse.class);
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
     *查询负载均衡实例下源站组健康状态。负载均衡功能内测中，如您需要使用请 [联系我们](https://cloud.tencent.com/online-service)。
     * @param req DescribeOriginGroupHealthStatusRequest
     * @return DescribeOriginGroupHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupHealthStatusResponse DescribeOriginGroupHealthStatus(DescribeOriginGroupHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginGroupHealthStatus", DescribeOriginGroupHealthStatusResponse.class);
    }

    /**
     *本接口为旧版本查询源站防护接口，EdgeOne 于 2025 年 6 月 27 日已对源站防护相关接口全面升级，新版本查询源站防护接口详情请参考 [DescribeOriginACL](https://cloud.tencent.com/document/product/1552/120408)。

<p style="color: red;">注意：自 2025 年 6 月 27 日起，旧版接口停止更新迭代，后续新增功能将仅在新版接口中提供。为避免在使用旧版接口时出现数据字段冲突，建议您尽早迁移到新版源站防护接口。</p>
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
     *查询套餐信息列表，支持分页。
     * @param req DescribePlansRequest
     * @return DescribePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlansResponse DescribePlans(DescribePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlans", DescribePlansResponse.class);
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
     *本接口为旧版本查询规则引擎规则接口，EdgeOne 于 2025 年 1 月 21 日已对规则引擎相关接口全面升级，新版本查询七层加速规则接口详情请参考  [DescribeL7AccRules](https://cloud.tencent.com/document/product/1552/115820)。
<p style="color: red;">注意：自 2025 年 1 月 21 日起，旧版接口停止更新迭代，后续新增功能将仅在新版接口中提供，旧版接口支持的原有能力将不受影响。为避免在使用旧版接口时出现数据字段冲突，建议您尽早迁移到新版规则引擎接口。</p>
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *本接口为旧版，EdgeOne 已对规则引擎相关接口全面升级，详情请参考 [RuleEngineAction](https://cloud.tencent.com/document/product/1552/80721#RuleEngineAction)。
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesSetting", DescribeRulesSettingResponse.class);
    }

    /**
     *查询安全 IP 组的配置信息，包括安全 IP 组的 ID、名称和内容。本接口的查询结果中，每个 IP 组最多只返回 2000 个 IP / 网段。如果存在超过 2000 个 IP / 网段的超大 IP 组，请调用 DescribeSecurityIPGroupContent 进行分页查询。
     * @param req DescribeSecurityIPGroupRequest
     * @return DescribeSecurityIPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupResponse DescribeSecurityIPGroup(DescribeSecurityIPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroup", DescribeSecurityIPGroupResponse.class);
    }

    /**
     *接口已废弃，将于 2024 年 6 月 30 日停止服务。请使用 [查询安全 IP 组
](https://cloud.tencent.com/document/product/1552/105866) 接口。

查询 IP 组的配置信息，包括 IP 组名称、 IP 组内容、 IP 组归属站点。
     * @param req DescribeSecurityIPGroupInfoRequest
     * @return DescribeSecurityIPGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityIPGroupInfoResponse DescribeSecurityIPGroupInfo(DescribeSecurityIPGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityIPGroupInfo", DescribeSecurityIPGroupInfoResponse.class);
    }

    /**
     *查询安全防护配置详情。
     * @param req DescribeSecurityPolicyRequest
     * @return DescribeSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyResponse DescribeSecurityPolicy(DescribeSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicy", DescribeSecurityPolicyResponse.class);
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
     *本接口查询七层域名业务的时序数据。请注意本接口查询数据有 10 分钟左右延迟，建议拉取当前时间 10 分钟以前的数据。
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7AnalysisData", DescribeTimingL7AnalysisDataResponse.class);
    }

    /**
     *本接口用于查询七层缓存分析时序类流量数据。此接口待废弃，请使用 <a href="https://cloud.tencent.com/document/product/1552/80648">DescribeTimingL7AnalysisData</a> 接口。
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTimingL7CacheData", DescribeTimingL7CacheDataResponse.class);
    }

    /**
     *本接口用于查询七层域名业务按照指定维度的 topN 数据。请注意本接口查询数据有 10 分钟左右延迟，建议拉取当前时间 10 分钟以前的数据。
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7AnalysisData", DescribeTopL7AnalysisDataResponse.class);
    }

    /**
     *本接口用于查询七层缓存分析 topN 数据。此接口待废弃，请使用 <a href="https://cloud.tencent.com/document/product/1552/80646"> DescribeTopL7AnalysisData</a> 接口。
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopL7CacheData", DescribeTopL7CacheDataResponse.class);
    }

    /**
     *查询安全策略配置模板详情
     * @param req DescribeWebSecurityTemplateRequest
     * @return DescribeWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebSecurityTemplateResponse DescribeWebSecurityTemplate(DescribeWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebSecurityTemplate", DescribeWebSecurityTemplateResponse.class);
    }

    /**
     *查询安全策略配置模板列表
     * @param req DescribeWebSecurityTemplatesRequest
     * @return DescribeWebSecurityTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebSecurityTemplatesResponse DescribeWebSecurityTemplates(DescribeWebSecurityTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebSecurityTemplates", DescribeWebSecurityTemplatesResponse.class);
    }

    /**
     *查询站点配置项导入结果接口，本接口用于站点配置导入接口（ImportZoneConfig）的结果查询。该功能仅支持标准版或企业版套餐的站点使用。
     * @param req DescribeZoneConfigImportResultRequest
     * @return DescribeZoneConfigImportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneConfigImportResultResponse DescribeZoneConfigImportResult(DescribeZoneConfigImportResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneConfigImportResult", DescribeZoneConfigImportResultResponse.class);
    }

    /**
     *本接口为旧版，EdgeOne 已对规则引擎相关接口全面升级，详情请参考 [DescribeL7AccSetting](https://cloud.tencent.com/document/product/1552/115819)。
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
     *当您需要停止 Edgeone 套餐的计费，可以通过该接口销毁计费套餐。
> 销毁计费套餐需要满足以下条件：
    1.套餐已过期（企业版套餐除外）；
    2.套餐下所有站点均已关闭或删除。

> 站点状态可以通过 [查询站点列表](https://cloud.tencent.com/document/product/1552/80713) 接口进行查询
停用站点可以通过 [切换站点状态](https://cloud.tencent.com/document/product/1552/80707) 接口将站点切换至关闭状态
删除站点可以通过 [删除站点](https://cloud.tencent.com/document/product/1552/80717) 接口将站点删除
     * @param req DestroyPlanRequest
     * @return DestroyPlanResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPlanResponse DestroyPlan(DestroyPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPlan", DestroyPlanResponse.class);
    }

    /**
     *本接口用于关闭站点的源站防护功能。停用后，相关资源不再仅使用「源站防护」提供的回源 IP 网段请求您的源站，同时停止发送回源 IP 网段更新通知。
     * @param req DisableOriginACLRequest
     * @return DisableOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public DisableOriginACLResponse DisableOriginACL(DisableOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableOriginACL", DisableOriginACLResponse.class);
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
     *本接口用于站点首次开启源站防护，启用后 EdgeOne 将会使用特定的回源 IP 网段为七层加速域名/四层代理实例回源。单次支持提交的七层加速域名的数量最大为 200，四层代理实例的数量最大为 100，支持七层加速域名/四层代理实例混合提交，总实例个数最大为 200。如需要启用超过 200 个资源，可先通过指定资源的方式以最大数量启用，剩余资源通过 ModifyOriginACL 接口启用。后续新增七层加速域名/四层代理实例均请通过 ModifyOriginACL 接口配置。

注意：
- 调用本接口视为同意 [源站防护启用特别约定](https://cloud.tencent.com/document/product/1552/120141)；
- 回源 IP 网段会不定期变更，EdgeOne 将在回源 IP 网段变更前 14 天、前 7 天、前 3 天和前 1 天分别通过站内信、短信、邮件等一种或多种方式发起通知，为了能正常收到回源 IP 网段的变更通知，请务必确保您在 [腾讯云消息中心控制台](https://console.cloud.tencent.com/message)内，已勾选边缘安全加速平台 EO 的产品服务相关消息通知，并配置正确的消息接收人。配置方式请参考 [消息订阅管理](https://cloud.tencent.com/document/product/567/43476)。
     * @param req EnableOriginACLRequest
     * @return EnableOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public EnableOriginACLResponse EnableOriginACL(EnableOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableOriginACL", EnableOriginACLResponse.class);
    }

    /**
     *导出站点配置接口，本接口支持用户根据需要的配置项进行配置导出，导出的配置用于导入站点配置接口（ImportZoneConfig）进行配置导入。该功能仅支持标准版和企业版套餐站点使用。
     * @param req ExportZoneConfigRequest
     * @return ExportZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public ExportZoneConfigResponse ExportZoneConfig(ExportZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportZoneConfig", ExportZoneConfigResponse.class);
    }

    /**
     *操作边缘函数运行环境，支持环境变量的相关设置。
设置环境变量后，可在函数代码中使用，具体参考 [边缘函数引入环境变量](https://cloud.tencent.com/document/product/1552/109151#0151fd9a-8b0e-407b-ae37-54553a60ded6)。
     * @param req HandleFunctionRuntimeEnvironmentRequest
     * @return HandleFunctionRuntimeEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public HandleFunctionRuntimeEnvironmentResponse HandleFunctionRuntimeEnvironment(HandleFunctionRuntimeEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleFunctionRuntimeEnvironment", HandleFunctionRuntimeEnvironmentResponse.class);
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
     *导入站点配置接口，本接口支持站点配置文件的快速导入，发起导入后接口会返回对应的任务 ID（TaskId），用户需通过查询站点配置导入结果接口（DescribeZoneConfigImportResult）获取本次导入任务执行的结果。该功能仅支持标准版和企业版套餐站点使用。
     * @param req ImportZoneConfigRequest
     * @return ImportZoneConfigResponse
     * @throws TencentCloudSDKException
     */
    public ImportZoneConfigResponse ImportZoneConfig(ImportZoneConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportZoneConfig", ImportZoneConfigResponse.class);
    }

    /**
     *当您的套餐绑定的站点数，或配置的 Web 防护 - 自定义规则 - 精准匹配策略的规则数，或 Web 防护 - 速率限制 - 精准速率限制模块的规则数达到套餐允许的配额上限，可以通过该接口增购对应配额。
> 该接口该仅支持企业版套餐。
     * @param req IncreasePlanQuotaRequest
     * @return IncreasePlanQuotaResponse
     * @throws TencentCloudSDKException
     */
    public IncreasePlanQuotaResponse IncreasePlanQuota(IncreasePlanQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IncreasePlanQuota", IncreasePlanQuotaResponse.class);
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
该功能仅企业版套餐支持，并且该功能当前仍在内测中，如需使用，请[联系我们](https://cloud.tencent.com/online-service?from=connect-us)。
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
该功能仅企业版套餐支持，并且该功能当前仍在内测中，如需使用，请[联系我们](https://cloud.tencent.com/online-service?from=connect-us)。
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
     *修改内容标识符，仅支持修改描述。该功能仅白名单开放。
     * @param req ModifyContentIdentifierRequest
     * @return ModifyContentIdentifierResponse
     * @throws TencentCloudSDKException
     */
    public ModifyContentIdentifierResponse ModifyContentIdentifier(ModifyContentIdentifierRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyContentIdentifier", ModifyContentIdentifierResponse.class);
    }

    /**
     *修改自定义错误页面。
     * @param req ModifyCustomErrorPageRequest
     * @return ModifyCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomErrorPageResponse ModifyCustomErrorPage(ModifyCustomErrorPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomErrorPage", ModifyCustomErrorPageResponse.class);
    }

    /**
     *您可以通过本接口批量修改 DNS 记录。
     * @param req ModifyDnsRecordsRequest
     * @return ModifyDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnsRecordsResponse ModifyDnsRecords(ModifyDnsRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDnsRecords", ModifyDnsRecordsResponse.class);
    }

    /**
     *您可以通过本接口批量修改 DNS 记录的状态，批量对记录进行开启和停用。
     * @param req ModifyDnsRecordsStatusRequest
     * @return ModifyDnsRecordsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnsRecordsStatusResponse ModifyDnsRecordsStatus(ModifyDnsRecordsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDnsRecordsStatus", ModifyDnsRecordsStatusResponse.class);
    }

    /**
     *修改边缘函数，支持修改函数的内容及描述信息，修改且重新部署后，函数立刻生效。
     * @param req ModifyFunctionRequest
     * @return ModifyFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionResponse ModifyFunction(ModifyFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunction", ModifyFunctionResponse.class);
    }

    /**
     *修改边缘函数触发规则，支持修改规则条件、执行函数以及描述信息。
     * @param req ModifyFunctionRuleRequest
     * @return ModifyFunctionRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionRuleResponse ModifyFunctionRule(ModifyFunctionRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionRule", ModifyFunctionRuleResponse.class);
    }

    /**
     *修改边缘函数触发规则的优先级。
     * @param req ModifyFunctionRulePriorityRequest
     * @return ModifyFunctionRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionRulePriorityResponse ModifyFunctionRulePriority(ModifyFunctionRulePriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionRulePriority", ModifyFunctionRulePriorityResponse.class);
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
     *本接口用于修改[规则引擎](https://cloud.tencent.com/document/product/1552/70901)中的规则，单次仅支持修改单条规则。
     * @param req ModifyL7AccRuleRequest
     * @return ModifyL7AccRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7AccRuleResponse ModifyL7AccRule(ModifyL7AccRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7AccRule", ModifyL7AccRuleResponse.class);
    }

    /**
     *本接口用于修改[规则引擎](https://cloud.tencent.com/document/product/1552/70901)中规则列表的优先级，本接口需要传入站点 ID 下完整的规则 ID 列表，规则 ID 列表可以通过[查询七层加速规则](https://cloud.tencent.com/document/product/1552/115820)接口获取，最终优先级顺序将调整成规则 ID 列表的顺序，从前往后执行。
     * @param req ModifyL7AccRulePriorityRequest
     * @return ModifyL7AccRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7AccRulePriorityResponse ModifyL7AccRulePriority(ModifyL7AccRulePriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7AccRulePriority", ModifyL7AccRulePriorityResponse.class);
    }

    /**
     *本接口用于修改[站点加速](https://cloud.tencent.com/document/product/1552/96193)全局配置。
     * @param req ModifyL7AccSettingRequest
     * @return ModifyL7AccSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7AccSettingResponse ModifyL7AccSetting(ModifyL7AccSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7AccSetting", ModifyL7AccSettingResponse.class);
    }

    /**
     *修改负载均衡实例配置。负载均衡功能内测中，如您需要使用请 [联系我们](https://cloud.tencent.com/online-service)。
     * @param req ModifyLoadBalancerRequest
     * @return ModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerResponse ModifyLoadBalancer(ModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancer", ModifyLoadBalancerResponse.class);
    }

    /**
     *本接口用于对七层加速域名/四层代理实例启用/关闭特定回源 IP 网段回源。单次支持提交的七层加速域名的数量最大为 200，四层代理实例的数量最大为 100，支持七层加速域名/四层代理实例混合提交，总实例个数最大为 200。如需变更超过 200 个实例，请通过本接口分批提交。
     * @param req ModifyOriginACLRequest
     * @return ModifyOriginACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginACLResponse ModifyOriginACL(ModifyOriginACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOriginACL", ModifyOriginACLResponse.class);
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
     *修改套餐配置。目前仅支持修改预付费套餐的自动续费开关。
     * @param req ModifyPlanRequest
     * @return ModifyPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPlanResponse ModifyPlan(ModifyPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPlan", ModifyPlanResponse.class);
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
     *本接口为旧版本修改规则引擎接口，EdgeOne 于 2025 年 1 月 21 日已对规则引擎相关接口全面升级，新版本修改七层加速规则接口详情请参考 [ModifyL7AccRule](https://cloud.tencent.com/document/product/1552/115818)。
<p style="color: red;">注意：自 2025 年 1 月 21 日起，旧版接口停止更新迭代，后续新增功能将仅在新版接口中提供，旧版接口支持的原有能力将不受影响。为避免在使用旧版接口时出现数据字段冲突，建议您尽早迁移到新版规则引擎接口。</p>
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
     *修改安全策略配置模板
     * @param req ModifyWebSecurityTemplateRequest
     * @return ModifyWebSecurityTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebSecurityTemplateResponse ModifyWebSecurityTemplate(ModifyWebSecurityTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebSecurityTemplate", ModifyWebSecurityTemplateResponse.class);
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
     *本接口为旧版，EdgeOne 已对规则引擎相关接口全面升级，详情请参考 [ModifyL7AccSetting](https://cloud.tencent.com/document/product/1552/115817)。
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
     *当您的套餐需要延长有效期，可以通过该接口进行续费。套餐续费仅支持个人版，基础版，标准版套餐。
> 费用详情可参考 [套餐费用](https://cloud.tencent.com/document/product/1552/94158)
     * @param req RenewPlanRequest
     * @return RenewPlanResponse
     * @throws TencentCloudSDKException
     */
    public RenewPlanResponse RenewPlan(RenewPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewPlan", RenewPlanResponse.class);
    }

    /**
     *当您需要使用高等级套餐才拥有的功能，可以通过本接口升级套餐，仅支持个人版，基础版套餐进行升级。
> 不同类型 Edgeone 计费套餐区别参考 [Edgeone计费套餐选型对比](https://cloud.tencent.com/document/product/1552/94165)
计费套餐升级规则以及资费详情参考 [Edgeone计费套餐升配说明](https://cloud.tencent.com/document/product/1552/95291)
如果需要将套餐升级至企业版，请 [联系我们](https://cloud.tencent.com/online-service)
     * @param req UpgradePlanRequest
     * @return UpgradePlanResponse
     * @throws TencentCloudSDKException
     */
    public UpgradePlanResponse UpgradePlan(UpgradePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradePlan", UpgradePlanResponse.class);
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
