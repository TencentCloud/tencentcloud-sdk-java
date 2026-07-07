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
package com.tencentcloudapi.alb.v20251030;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.alb.v20251030.models.*;

public class AlbClient extends AbstractClient{
    private static String endpoint = "alb.tencentcloudapi.com";
    private static String service = "alb";
    private static String version = "2025-10-30";

    public AlbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AlbClient(Credential credential, String region, ClientProfile profile) {
        super(AlbClient.endpoint, AlbClient.version, credential, region, profile);
    }

    /**
     *向目标组内添加后端服务
     * @param req AddTargetsToTargetGroupRequest
     * @return AddTargetsToTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddTargetsToTargetGroupResponse AddTargetsToTargetGroup(AddTargetsToTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTargetsToTargetGroup", AddTargetsToTargetGroupResponse.class);
    }

    /**
     *将共享带宽包绑定到应用型负载均衡实例。
     * @param req AssociateBandwidthPackageWithLoadBalancerRequest
     * @return AssociateBandwidthPackageWithLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public AssociateBandwidthPackageWithLoadBalancerResponse AssociateBandwidthPackageWithLoadBalancer(AssociateBandwidthPackageWithLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateBandwidthPackageWithLoadBalancer", AssociateBandwidthPackageWithLoadBalancerResponse.class);
    }

    /**
     *AssociateListenerAdditionalCertificates属于异步接口，即系统返回一个请求 ID，但该扩展证书尚未添加成功，系统后台的添加任务仍在进行。您可以调用DescribeListenerCertificates接口查询扩展证书的添加状态：
当HTTPS和QUIC监听器处于Associating状态时，表示扩展证书正在添加中。
当HTTPS和QUIC监听器处于Associated状态时，表示扩展证书添加成功。
     * @param req AssociateListenerAdditionalCertificatesRequest
     * @return AssociateListenerAdditionalCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public AssociateListenerAdditionalCertificatesResponse AssociateListenerAdditionalCertificates(AssociateListenerAdditionalCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateListenerAdditionalCertificates", AssociateListenerAdditionalCertificatesResponse.class);
    }

    /**
     *创建健康检查模板
     * @param req CreateHealthCheckTemplateRequest
     * @return CreateHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateHealthCheckTemplateResponse CreateHealthCheckTemplate(CreateHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHealthCheckTemplate", CreateHealthCheckTemplateResponse.class);
    }

    /**
     *创建监听器
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     ***CreateLoadBalancer**接口属于异步接口，即系统返回一个实例ID，但该应用型负载均衡实例尚未创建成功，系统后台的创建任务仍在进行。您可以调用[DescribeLoadBalancerDetail](214362)查询应用型负载均衡实例的创建状态：
- 当应用型负载均衡实例处于**Provisioning**状态时，表示应用型负载均衡实例正在创建中。
- 当应用型负载均衡实例处于**Active**状态时，表示应用型负载均衡实例创建成功。
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *CreateRules创建转发规则，本接口为异步接口，返回成功后需以返回的RequestID为入参，调用DescribeAsyncJobs接口查询本次任务是否成功。
一条规则最多支持10个转发条件（Conditions），5个转发动作（Actions）。
     * @param req CreateRulesRequest
     * @return CreateRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRulesResponse CreateRules(CreateRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRules", CreateRulesResponse.class);
    }

    /**
     *创建自定义安全策略，用于配置 HTTPS 监听器的 TLS 协议版本和加密套件。通过安全策略，您可以灵活控制客户端与负载均衡之间 HTTPS 通信的安全级别。
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityPolicy", CreateSecurityPolicyResponse.class);
    }

    /**
     *目标组相关接口
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTargetGroup", CreateTargetGroupResponse.class);
    }

    /**
     *删除健康检查模板
     * @param req DeleteHealthCheckTemplatesRequest
     * @return DeleteHealthCheckTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHealthCheckTemplatesResponse DeleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHealthCheckTemplates", DeleteHealthCheckTemplatesResponse.class);
    }

    /**
     *删除监听器
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     ***DeleteLoadBalancers**接口属于异步接口，即系统返回一个请求ID，但该应用型负载均衡实例尚未删除成功，系统后台的删除任务仍在进行。您可以调用[DescribeLoadBalancerDetails](214362)查询应用型负载均衡实例的删除状态：
- 当应用型负载均衡实例处于**Deleting**状态时，表示应用型负载均衡实例正在删除中。
- 当查询不到指定的应用型负载均衡实例时，表示应用型负载均衡实例删除成功。
     * @param req DeleteLoadBalancersRequest
     * @return DeleteLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancersResponse DeleteLoadBalancers(DeleteLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancers", DeleteLoadBalancersResponse.class);
    }

    /**
     *DeleteRules删除转发规则，本接口为异步接口，返回成功后需以返回的RequestID为入参，调用DescribeAsyncJobs接口查询本次任务是否成功。
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRules", DeleteRulesResponse.class);
    }

    /**
     *删除一个或多个自定义安全策略。删除安全策略前，请确保该策略未被任何 HTTPS 监听器引用，否则删除操作将失败。
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityPolicy", DeleteSecurityPolicyResponse.class);
    }

    /**
     *删除目标组。
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTargetGroups", DeleteTargetGroupsResponse.class);
    }

    /**
     *异步任务查询接口
     * @param req DescribeAsyncJobsRequest
     * @return DescribeAsyncJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncJobsResponse DescribeAsyncJobs(DescribeAsyncJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncJobs", DescribeAsyncJobsResponse.class);
    }

    /**
     *查询健康检查模板列表
     * @param req DescribeHealthCheckTemplatesRequest
     * @return DescribeHealthCheckTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckTemplatesResponse DescribeHealthCheckTemplates(DescribeHealthCheckTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckTemplates", DescribeHealthCheckTemplatesResponse.class);
    }

    /**
     *根据实例id和监听器id，查询指定监听器绑定的证书列表
若输入CertificateType为SVR，返回扩展服务器证书与默认服务器证书的信息
若输入CertificateType为CA，返回默认CA证书的信息
     * @param req DescribeListenerCertificatesRequest
     * @return DescribeListenerCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerCertificatesResponse DescribeListenerCertificates(DescribeListenerCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerCertificates", DescribeListenerCertificatesResponse.class);
    }

    /**
     *查询单个监听器详情
     * @param req DescribeListenerDetailRequest
     * @return DescribeListenerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerDetailResponse DescribeListenerDetail(DescribeListenerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerDetail", DescribeListenerDetailResponse.class);
    }

    /**
     *查询监听器健康状态。
     * @param req DescribeListenerHealthStatusRequest
     * @return DescribeListenerHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerHealthStatusResponse DescribeListenerHealthStatus(DescribeListenerHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerHealthStatus", DescribeListenerHealthStatusResponse.class);
    }

    /**
     *查询监听器列表
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *查询指定负载均衡实例的详细信息。
     * @param req DescribeLoadBalancerDetailRequest
     * @return DescribeLoadBalancerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerDetailResponse DescribeLoadBalancerDetail(DescribeLoadBalancerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerDetail", DescribeLoadBalancerDetailResponse.class);
    }

    /**
     *查询实例配置。
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *查询当前账号的 ALB 配额配置。支持按配额类型查询，也支持传入资源ID查询资源级配额；可通过 DisplayFields 按需返回已使用量和剩余可用量。
     * @param req DescribeQuotaRequest
     * @return DescribeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaResponse DescribeQuota(DescribeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuota", DescribeQuotaResponse.class);
    }

    /**
     *查询转发规则
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *查询自定义安全策略列表，支持按安全策略 ID、名称或标签进行筛选，并支持分页查询。
     * @param req DescribeSecurityPoliciesRequest
     * @return DescribeSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPoliciesResponse DescribeSecurityPolicies(DescribeSecurityPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicies", DescribeSecurityPoliciesResponse.class);
    }

    /**
     *查询当前地域支持的安全策略配置能力，包括可选的 TLS 协议版本及各版本对应的加密套件列表。在创建或修改自定义安全策略前，建议先调用此接口获取可用的配置选项。
     * @param req DescribeSecurityPolicyCapabilitiesRequest
     * @return DescribeSecurityPolicyCapabilitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyCapabilitiesResponse DescribeSecurityPolicyCapabilities(DescribeSecurityPolicyCapabilitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyCapabilities", DescribeSecurityPolicyCapabilitiesResponse.class);
    }

    /**
     *查询安全策略的关联关系，即安全策略被哪些 HTTPS 监听器引用。在删除或修改安全策略前，建议先调用此接口确认影响范围。
     * @param req DescribeSecurityPolicyRelationsRequest
     * @return DescribeSecurityPolicyRelationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyRelationsResponse DescribeSecurityPolicyRelations(DescribeSecurityPolicyRelationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyRelations", DescribeSecurityPolicyRelationsResponse.class);
    }

    /**
     *查询系统安全策略。
     * @param req DescribeSystemSecurityPoliciesRequest
     * @return DescribeSystemSecurityPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemSecurityPoliciesResponse DescribeSystemSecurityPolicies(DescribeSystemSecurityPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemSecurityPolicies", DescribeSystemSecurityPoliciesResponse.class);
    }

    /**
     *查询目标组内后端服务
     * @param req DescribeTargetGroupTargetsRequest
     * @return DescribeTargetGroupTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupTargetsResponse DescribeTargetGroupTargets(DescribeTargetGroupTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupTargets", DescribeTargetGroupTargetsResponse.class);
    }

    /**
     *查询目标组列表
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroups", DescribeTargetGroupsResponse.class);
    }

    /**
     *根据子机查询绑定的目标组
     * @param req DescribeTargetGroupsByTargetRequest
     * @return DescribeTargetGroupsByTargetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsByTargetResponse DescribeTargetGroupsByTarget(DescribeTargetGroupsByTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupsByTarget", DescribeTargetGroupsByTargetResponse.class);
    }

    /**
     *查询可用区
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *将共享带宽包从应用型负载均衡实例解绑。
     * @param req DisassociateBandwidthPackageFromLoadBalancerRequest
     * @return DisassociateBandwidthPackageFromLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateBandwidthPackageFromLoadBalancerResponse DisassociateBandwidthPackageFromLoadBalancer(DisassociateBandwidthPackageFromLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateBandwidthPackageFromLoadBalancer", DisassociateBandwidthPackageFromLoadBalancerResponse.class);
    }

    /**
     *DisassociateListenerAdditionalCertificates属于异步接口，即系统返回一个请求 ID，但该扩展证书尚未解绑成功，系统后台的解绑任务仍在进行。您可以调用DescribeListenerCertificates接口查询证书的解绑状态：若证书处于Disassociating状态，则证书正在解绑中。
     * @param req DisassociateListenerAdditionalCertificatesRequest
     * @return DisassociateListenerAdditionalCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateListenerAdditionalCertificatesResponse DisassociateListenerAdditionalCertificates(DisassociateListenerAdditionalCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateListenerAdditionalCertificates", DisassociateListenerAdditionalCertificatesResponse.class);
    }

    /**
     *InquirePriceCreateLoadBalancer接口查询创建负载均衡的价格。
     * @param req InquirePriceCreateLoadBalancerRequest
     * @return InquirePriceCreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateLoadBalancerResponse InquirePriceCreateLoadBalancer(InquirePriceCreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateLoadBalancer", InquirePriceCreateLoadBalancerResponse.class);
    }

    /**
     *修改健康检查模板
     * @param req ModifyHealthCheckTemplateRequest
     * @return ModifyHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHealthCheckTemplateResponse ModifyHealthCheckTemplate(ModifyHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHealthCheckTemplate", ModifyHealthCheckTemplateResponse.class);
    }

    /**
     *修改监听器属性
     * @param req ModifyListenerAttributesRequest
     * @return ModifyListenerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerAttributesResponse ModifyListenerAttributes(ModifyListenerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListenerAttributes", ModifyListenerAttributesResponse.class);
    }

    /**
     ***前提条件：**
您已经创建应用型负载均衡实例，具体操作，请参见 CreateLoadBalancer 。
当您需要通过此接口将应用型负载均衡实例的网络类型由私网变为公网时，您需要先创建一个弹性公网 IP。
**使用说明：**
ModifyLoadBalancerAddressType 接口属于异步接口，即系统返回一个请求 ID，但该应用型负载均衡实例的网络类型尚未变更成功，系统后台的变更任务仍在进行。您可以调用 DescribeLoadBalancerDetail 查询应用型负载均衡实例的网络类型的变更状态：
当应用型负载均衡实例处于 Configuring 状态时，表示应用型负载均衡实例的网络类型正在变更中。
当应用型负载均衡实例处于 Active 状态时，表示应用型负载均衡实例的网络类型变更成功。
     * @param req ModifyLoadBalancerAddressTypeRequest
     * @return ModifyLoadBalancerAddressTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAddressTypeResponse ModifyLoadBalancerAddressType(ModifyLoadBalancerAddressTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAddressType", ModifyLoadBalancerAddressTypeResponse.class);
    }

    /**
     ***ModifyLoadBalancerAttributes**接口属于异步接口，即系统返回一个请求ID，但该应用型负载均衡实例属性尚未修改成功，系统后台的修改任务仍在进行。您可以调用[DescribeLoadBalancerAttribute](214362)查询应用型负载均衡实例属性的修改状态：
- 当应用型负载均衡实例属性处于**Configuring**状态时，表示应用型负载均衡实例属性正在修改中。
- 当应用型负载均衡实例属性处于**Active**状态时，表示应用型负载均衡实例属性修改成功。
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *设置负载均衡实例修改保护。
     * @param req ModifyLoadBalancerModificationProtectionRequest
     * @return ModifyLoadBalancerModificationProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerModificationProtectionResponse ModifyLoadBalancerModificationProtection(ModifyLoadBalancerModificationProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerModificationProtection", ModifyLoadBalancerModificationProtectionResponse.class);
    }

    /**
     *ModifyRulesAttributes修改转发规则属性，本接口为异步接口，返回成功后需以返回的RequestID为入参，调用DescribeAsyncJobs接口查询本次任务是否成功。
一条规则最多支持10个转发条件（Conditions），5个转发动作（Actions）。
     * @param req ModifyRulesAttributesRequest
     * @return ModifyRulesAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRulesAttributesResponse ModifyRulesAttributes(ModifyRulesAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRulesAttributes", ModifyRulesAttributesResponse.class);
    }

    /**
     *修改自定义安全策略的属性，包括策略名称、TLS 协议版本和加密套件。修改后的配置将立即应用到所有关联该策略的 HTTPS 监听器。
     * @param req ModifySecurityPolicyAttributesRequest
     * @return ModifySecurityPolicyAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyAttributesResponse ModifySecurityPolicyAttributes(ModifySecurityPolicyAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityPolicyAttributes", ModifySecurityPolicyAttributesResponse.class);
    }

    /**
     *修改目标组。
     * @param req ModifyTargetGroupAttributesRequest
     * @return ModifyTargetGroupAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributesResponse ModifyTargetGroupAttributes(ModifyTargetGroupAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupAttributes", ModifyTargetGroupAttributesResponse.class);
    }

    /**
     *修改目标组内后端服务信息
     * @param req ModifyTargetsInTargetGroupRequest
     * @return ModifyTargetsInTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetsInTargetGroupResponse ModifyTargetsInTargetGroup(ModifyTargetsInTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetsInTargetGroup", ModifyTargetsInTargetGroupResponse.class);
    }

    /**
     *通知负载均衡解绑后端服务
     * @param req NotifyUnbindTargetRequest
     * @return NotifyUnbindTargetResponse
     * @throws TencentCloudSDKException
     */
    public NotifyUnbindTargetResponse NotifyUnbindTarget(NotifyUnbindTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "NotifyUnbindTarget", NotifyUnbindTargetResponse.class);
    }

    /**
     *从目标组内移除后端服务
     * @param req RemoveTargetsFromTargetGroupRequest
     * @return RemoveTargetsFromTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveTargetsFromTargetGroupResponse RemoveTargetsFromTargetGroup(RemoveTargetsFromTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveTargetsFromTargetGroup", RemoveTargetsFromTargetGroupResponse.class);
    }

    /**
     *SetLoadBalancerSecurityGroups 接口支持对一个公网负载均衡实例执行设置（绑定、解绑）安全组操作。查询一个负载均衡实例目前已绑定的安全组，可使用 [DescribeLoadBalancerDetail](xxx) 接口。本接口是set语义，
绑定操作时，入参需要传入负载均衡实例要绑定的所有安全组（已绑定的+新增绑定的）。
解绑操作时，入参需要传入负载均衡实例执行解绑后所绑定的所有安全组；如果要解绑所有安全组，可不传此参数，或传入空数组。
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

}
