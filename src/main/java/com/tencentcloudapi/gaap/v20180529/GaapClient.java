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
package com.tencentcloudapi.gaap.v20180529;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gaap.v20180529.models.*;

public class GaapClient extends AbstractClient{
    private static String endpoint = "gaap.tencentcloudapi.com";
    private static String service = "gaap";
    private static String version = "2018-05-29";
    
    public GaapClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GaapClient(Credential credential, String region, ClientProfile profile) {
        super(GaapClient.endpoint, GaapClient.version, credential, region, profile);
    }

    /**
     *添加源站(服务器)信息，支持IP或域名
     * @param req AddRealServersRequest
     * @return AddRealServersResponse
     * @throws TencentCloudSDKException
     */
    public AddRealServersResponse AddRealServers(AddRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRealServers", AddRealServersResponse.class);
    }

    /**
     *本接口（BanAndRecoverProxy）用于联通封禁解封GAAP跨境通道实例，支持按照客户UIN维度下发请求。被封禁的实例带宽上限将会被限制到0Mbps，无法正常处理客户端和源站之间的请求。
     * @param req BanAndRecoverProxyRequest
     * @return BanAndRecoverProxyResponse
     * @throws TencentCloudSDKException
     */
    public BanAndRecoverProxyResponse BanAndRecoverProxy(BanAndRecoverProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BanAndRecoverProxy", BanAndRecoverProxyResponse.class);
    }

    /**
     *本接口（BindListenerRealServers）用于TCP/UDP监听器绑定解绑源站。
注意：本接口会解绑之前绑定的源站，绑定本次调用所选择的源站。例如：原来绑定的源站为A，B，C，本次调用的选择绑定的源站为C，D，E，那么调用后所绑定的源站为C，D，E。
     * @param req BindListenerRealServersRequest
     * @return BindListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindListenerRealServersResponse BindListenerRealServers(BindListenerRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindListenerRealServers", BindListenerRealServersResponse.class);
    }

    /**
     *该接口用于7层监听器的转发规则绑定源站。注意：本接口会解绑之前绑定的源站，绑定本次调用所选择的源站。
     * @param req BindRuleRealServersRequest
     * @return BindRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindRuleRealServersResponse BindRuleRealServers(BindRuleRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindRuleRealServers", BindRuleRealServersResponse.class);
    }

    /**
     *本接口(CheckProxyCreate)用于查询能否创建指定配置的加速通道。
     * @param req CheckProxyCreateRequest
     * @return CheckProxyCreateResponse
     * @throws TencentCloudSDKException
     */
    public CheckProxyCreateResponse CheckProxyCreate(CheckProxyCreateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckProxyCreate", CheckProxyCreateResponse.class);
    }

    /**
     *本接口（CloseProxies）用于关闭通道。通道关闭后，不再产生流量，但每天仍然收取通道基础配置费用。
     * @param req CloseProxiesRequest
     * @return CloseProxiesResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxiesResponse CloseProxies(CloseProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProxies", CloseProxiesResponse.class);
    }

    /**
     *本接口（CloseProxyGroup）用于关闭通道组。通道组关闭后，不再产生流量，但每天仍然收取通道基础配置费用。
     * @param req CloseProxyGroupRequest
     * @return CloseProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyGroupResponse CloseProxyGroup(CloseProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseProxyGroup", CloseProxyGroupResponse.class);
    }

    /**
     *关闭安全策略
     * @param req CloseSecurityPolicyRequest
     * @return CloseSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CloseSecurityPolicyResponse CloseSecurityPolicy(CloseSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseSecurityPolicy", CloseSecurityPolicyResponse.class);
    }

    /**
     *本接口（CreateCertificate）用于创建Gaap相关证书和配置文件，包括基础认证配置文件，客户端CA证书，服务器SSL证书，Gaap SSL证书以及源站CA证书。
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCertificate", CreateCertificateResponse.class);
    }

    /**
     *本接口（CreateCustomHeader）用于创建HTTP/HTTPS监听器的自定义header，客户端请求通过访问该监听器时，会将监听器中配置的header信息发送到源站。
     * @param req CreateCustomHeaderRequest
     * @return CreateCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomHeaderResponse CreateCustomHeader(CreateCustomHeaderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomHeader", CreateCustomHeaderResponse.class);
    }

    /**
     *本接口（CreateDomain）用于创建HTTP/HTTPS监听器的访问域名，客户端请求通过访问该域名来请求后端业务。
该接口仅支持version3.0的通道。
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *定制域名指定错误码的错误响应
     * @param req CreateDomainErrorPageInfoRequest
     * @return CreateDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainErrorPageInfoResponse CreateDomainErrorPageInfo(CreateDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainErrorPageInfo", CreateDomainErrorPageInfoResponse.class);
    }

    /**
     *本接口（CreateFirstLinkSession）用于创建接入段加速会话，创建有可能成功，也可能失败，需要通过返回码来进行判断。
     * @param req CreateFirstLinkSessionRequest
     * @return CreateFirstLinkSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirstLinkSessionResponse CreateFirstLinkSession(CreateFirstLinkSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFirstLinkSession", CreateFirstLinkSessionResponse.class);
    }

    /**
     *用来创建统一域名
     * @param req CreateGlobalDomainRequest
     * @return CreateGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalDomainResponse CreateGlobalDomain(CreateGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalDomain", CreateGlobalDomainResponse.class);
    }

    /**
     *创建域名解析记录
     * @param req CreateGlobalDomainDnsRequest
     * @return CreateGlobalDomainDnsResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalDomainDnsResponse CreateGlobalDomainDns(CreateGlobalDomainDnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalDomainDns", CreateGlobalDomainDnsResponse.class);
    }

    /**
     *该接口（CreateHTTPListener）用于在通道实例下创建HTTP协议类型的监听器。
     * @param req CreateHTTPListenerRequest
     * @return CreateHTTPListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPListenerResponse CreateHTTPListener(CreateHTTPListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHTTPListener", CreateHTTPListenerResponse.class);
    }

    /**
     *该接口（CreateHTTPSListener）用于在通道实例下创建HTTPS协议类型的监听器。
     * @param req CreateHTTPSListenerRequest
     * @return CreateHTTPSListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPSListenerResponse CreateHTTPSListener(CreateHTTPSListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHTTPSListener", CreateHTTPSListenerResponse.class);
    }

    /**
     *本接口（CreateProxy）用于创建/复制一个指定配置的加速通道。当复制通道时，需要设置新通道的基本配置参数，并设置ClonedProxyId来指定被复制的通道。
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxy", CreateProxyResponse.class);
    }

    /**
     *本接口（CreateProxyGroup）用于创建通道组。
     * @param req CreateProxyGroupRequest
     * @return CreateProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupResponse CreateProxyGroup(CreateProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxyGroup", CreateProxyGroupResponse.class);
    }

    /**
     *本接口（CreateProxyGroupDomain）用于创建通道组域名，并开启域名解析。
     * @param req CreateProxyGroupDomainRequest
     * @return CreateProxyGroupDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupDomainResponse CreateProxyGroupDomain(CreateProxyGroupDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProxyGroupDomain", CreateProxyGroupDomainResponse.class);
    }

    /**
     *该接口（CreateRule）用于创建HTTP/HTTPS监听器转发规则。
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *创建安全策略
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityPolicy", CreateSecurityPolicyResponse.class);
    }

    /**
     *添加安全策略规则
     * @param req CreateSecurityRulesRequest
     * @return CreateSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityRulesResponse CreateSecurityRules(CreateSecurityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityRules", CreateSecurityRulesResponse.class);
    }

    /**
     *该接口（CreateTCPListeners）用于批量创建单通道或者通道组的TCP协议类型的监听器。
     * @param req CreateTCPListenersRequest
     * @return CreateTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateTCPListenersResponse CreateTCPListeners(CreateTCPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTCPListeners", CreateTCPListenersResponse.class);
    }

    /**
     *该接口（CreateUDPListeners）用于批量创建单通道或者通道组的UDP协议类型的监听器。
     * @param req CreateUDPListenersRequest
     * @return CreateUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateUDPListenersResponse CreateUDPListeners(CreateUDPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUDPListeners", CreateUDPListenersResponse.class);
    }

    /**
     *本接口（DeleteCertificate）用于删除证书。
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCertificate", DeleteCertificateResponse.class);
    }

    /**
     *本接口（DeleteDomain）仅适用于7层监听器，用于删除该监听器下对应域名及域名下的所有规则，所有已绑定源站的规则将自动解绑。
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *删除域名的定制错误
     * @param req DeleteDomainErrorPageInfoRequest
     * @return DeleteDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainErrorPageInfoResponse DeleteDomainErrorPageInfo(DeleteDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainErrorPageInfo", DeleteDomainErrorPageInfoResponse.class);
    }

    /**
     *本接口（DeleteFirstLinkSession）用于删除接入段加速会话，删除加速会话后会停止加速。
     * @param req DeleteFirstLinkSessionRequest
     * @return DeleteFirstLinkSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirstLinkSessionResponse DeleteFirstLinkSession(DeleteFirstLinkSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFirstLinkSession", DeleteFirstLinkSessionResponse.class);
    }

    /**
     *删除统一域名
     * @param req DeleteGlobalDomainRequest
     * @return DeleteGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalDomainResponse DeleteGlobalDomain(DeleteGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalDomain", DeleteGlobalDomainResponse.class);
    }

    /**
     *删除域名的某条解析记录
     * @param req DeleteGlobalDomainDnsRequest
     * @return DeleteGlobalDomainDnsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalDomainDnsResponse DeleteGlobalDomainDns(DeleteGlobalDomainDnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalDomainDns", DeleteGlobalDomainDnsResponse.class);
    }

    /**
     *该接口（DeleteListeners）用于批量删除通道或通道组的监听器，包括4/7层监听器。
     * @param req DeleteListenersRequest
     * @return DeleteListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenersResponse DeleteListeners(DeleteListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListeners", DeleteListenersResponse.class);
    }

    /**
     *本接口（DeleteProxyGroup）用于删除通道组。
     * @param req DeleteProxyGroupRequest
     * @return DeleteProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProxyGroupResponse DeleteProxyGroup(DeleteProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProxyGroup", DeleteProxyGroupResponse.class);
    }

    /**
     *该接口（DeleteRule）用于删除HTTP/HTTPS监听器的转发规则。
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *删除安全策略
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityPolicy", DeleteSecurityPolicyResponse.class);
    }

    /**
     *删除安全策略规则
     * @param req DeleteSecurityRulesRequest
     * @return DeleteSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityRulesResponse DeleteSecurityRules(DeleteSecurityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityRules", DeleteSecurityRulesResponse.class);
    }

    /**
     *本接口（DescribeAccessRegions）用于查询加速区域，即客户端接入区域。
     * @param req DescribeAccessRegionsRequest
     * @return DescribeAccessRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsResponse DescribeAccessRegions(DescribeAccessRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRegions", DescribeAccessRegionsResponse.class);
    }

    /**
     *本接口（DescribeAccessRegionsByDestRegion）根据源站区域查询可用的加速区域列表。
     * @param req DescribeAccessRegionsByDestRegionRequest
     * @return DescribeAccessRegionsByDestRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsByDestRegionResponse DescribeAccessRegionsByDestRegion(DescribeAccessRegionsByDestRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRegionsByDestRegion", DescribeAccessRegionsByDestRegionResponse.class);
    }

    /**
     *为了防止在下单、询价、后付费开通等过程中确保来源合法以及订单参数没有被篡改过，各个业务方使用下单、询价等场景需调用计费签名接口获取签名，获取签名的请求需带上签名以验证身份，本接口可以获取计费签名。
     * @param req DescribeAuthSignatureRequest
     * @return DescribeAuthSignatureResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthSignatureResponse DescribeAuthSignature(DescribeAuthSignatureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthSignature", DescribeAuthSignatureResponse.class);
    }

    /**
     *本接口（DescribeBlackHeader）用于查询禁用的自定义header 名称
     * @param req DescribeBlackHeaderRequest
     * @return DescribeBlackHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackHeaderResponse DescribeBlackHeader(DescribeBlackHeaderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlackHeader", DescribeBlackHeaderResponse.class);
    }

    /**
     *本接口（DescribeCertificateDetail）用于查询证书详情，包括证书ID，证书名字，证书类型，证书内容以及密钥等信息。
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificateDetail", DescribeCertificateDetailResponse.class);
    }

    /**
     *本接口（DescribeCertificates）用来查询可以使用的证书列表。
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertificates", DescribeCertificatesResponse.class);
    }

    /**
     *本接口（DescribeCountryAreaMapping）用于获取国家地区编码映射表。
     * @param req DescribeCountryAreaMappingRequest
     * @return DescribeCountryAreaMappingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCountryAreaMappingResponse DescribeCountryAreaMapping(DescribeCountryAreaMappingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCountryAreaMapping", DescribeCountryAreaMappingResponse.class);
    }

    /**
     *本接口（DescribeCrossBorderProxies）用于查询跨境通道实例列表。
     * @param req DescribeCrossBorderProxiesRequest
     * @return DescribeCrossBorderProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderProxiesResponse DescribeCrossBorderProxies(DescribeCrossBorderProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderProxies", DescribeCrossBorderProxiesResponse.class);
    }

    /**
     *本接口（DescribeCustomHeader）用于自定义header列表
     * @param req DescribeCustomHeaderRequest
     * @return DescribeCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomHeaderResponse DescribeCustomHeader(DescribeCustomHeaderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomHeader", DescribeCustomHeaderResponse.class);
    }

    /**
     *本接口（DescribeDestRegions）用于查询源站区域，即源站服务器所在区域。
     * @param req DescribeDestRegionsRequest
     * @return DescribeDestRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDestRegionsResponse DescribeDestRegions(DescribeDestRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDestRegions", DescribeDestRegionsResponse.class);
    }

    /**
     *查询目前定制域名的错误响应
     * @param req DescribeDomainErrorPageInfoRequest
     * @return DescribeDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoResponse DescribeDomainErrorPageInfo(DescribeDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainErrorPageInfo", DescribeDomainErrorPageInfoResponse.class);
    }

    /**
     *根据定制错误ID查询错误响应
     * @param req DescribeDomainErrorPageInfoByIdsRequest
     * @return DescribeDomainErrorPageInfoByIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoByIdsResponse DescribeDomainErrorPageInfoByIds(DescribeDomainErrorPageInfoByIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainErrorPageInfoByIds", DescribeDomainErrorPageInfoByIdsResponse.class);
    }

    /**
     *本接口（DescribeFirstLinkSession）用于查询接入段加速会话状态，包括会话状态，生效时长，加速套餐等信息。
     * @param req DescribeFirstLinkSessionRequest
     * @return DescribeFirstLinkSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirstLinkSessionResponse DescribeFirstLinkSession(DescribeFirstLinkSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirstLinkSession", DescribeFirstLinkSessionResponse.class);
    }

    /**
     *查询域名解析列表
     * @param req DescribeGlobalDomainDnsRequest
     * @return DescribeGlobalDomainDnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalDomainDnsResponse DescribeGlobalDomainDns(DescribeGlobalDomainDnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalDomainDns", DescribeGlobalDomainDnsResponse.class);
    }

    /**
     *查询域名列表
     * @param req DescribeGlobalDomainsRequest
     * @return DescribeGlobalDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalDomainsResponse DescribeGlobalDomains(DescribeGlobalDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalDomains", DescribeGlobalDomainsResponse.class);
    }

    /**
     *该接口为内部接口，用于查询可以获取统计数据的通道组和通道信息
     * @param req DescribeGroupAndStatisticsProxyRequest
     * @return DescribeGroupAndStatisticsProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupAndStatisticsProxyResponse DescribeGroupAndStatisticsProxy(DescribeGroupAndStatisticsProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupAndStatisticsProxy", DescribeGroupAndStatisticsProxyResponse.class);
    }

    /**
     *本接口（DescribeGroupDomainConfig）用于获取通道组域名解析配置详情。
     * @param req DescribeGroupDomainConfigRequest
     * @return DescribeGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupDomainConfigResponse DescribeGroupDomainConfig(DescribeGroupDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupDomainConfig", DescribeGroupDomainConfigResponse.class);
    }

    /**
     *该接口（DescribeHTTPListeners）用来查询HTTP监听器信息。
     * @param req DescribeHTTPListenersRequest
     * @return DescribeHTTPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPListenersResponse DescribeHTTPListeners(DescribeHTTPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHTTPListeners", DescribeHTTPListenersResponse.class);
    }

    /**
     *本接口（DescribeHTTPSListeners）用来查询HTTPS监听器信息。
     * @param req DescribeHTTPSListenersRequest
     * @return DescribeHTTPSListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPSListenersResponse DescribeHTTPSListeners(DescribeHTTPSListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHTTPSListeners", DescribeHTTPSListenersResponse.class);
    }

    /**
     *该接口（DescribeListenerRealServers）用于查询TCP/UDP监听器源站列表，包括该监听器已经绑定的源站列表以及可以绑定的源站列表。
     * @param req DescribeListenerRealServersRequest
     * @return DescribeListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerRealServersResponse DescribeListenerRealServers(DescribeListenerRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerRealServers", DescribeListenerRealServersResponse.class);
    }

    /**
     *该接口用于查询监听器统计数据，包括出入带宽，出入包量，并发数据。支持300秒, 3600秒和86400秒的细粒度，取值为细粒度范围内最大值。
     * @param req DescribeListenerStatisticsRequest
     * @return DescribeListenerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerStatisticsResponse DescribeListenerStatistics(DescribeListenerStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerStatistics", DescribeListenerStatisticsResponse.class);
    }

    /**
     *本接口（DescribeProxies）用于查询通道实例列表。
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxies", DescribeProxiesResponse.class);
    }

    /**
     *本接口（DescribeProxiesStatus）用于查询通道状态列表。
     * @param req DescribeProxiesStatusRequest
     * @return DescribeProxiesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesStatusResponse DescribeProxiesStatus(DescribeProxiesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxiesStatus", DescribeProxiesStatusResponse.class);
    }

    /**
     *该接口为内部接口，用于查询可以获取统计数据的通道和监听器信息
     * @param req DescribeProxyAndStatisticsListenersRequest
     * @return DescribeProxyAndStatisticsListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyAndStatisticsListenersResponse DescribeProxyAndStatisticsListeners(DescribeProxyAndStatisticsListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyAndStatisticsListeners", DescribeProxyAndStatisticsListenersResponse.class);
    }

    /**
     *本接口（DescribeProxyDetail）用于查询通道详情。
     * @param req DescribeProxyDetailRequest
     * @return DescribeProxyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyDetailResponse DescribeProxyDetail(DescribeProxyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyDetail", DescribeProxyDetailResponse.class);
    }

    /**
     *本接口（DescribeProxyGroupDetails）用于查询通道组详情。
     * @param req DescribeProxyGroupDetailsRequest
     * @return DescribeProxyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupDetailsResponse DescribeProxyGroupDetails(DescribeProxyGroupDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyGroupDetails", DescribeProxyGroupDetailsResponse.class);
    }

    /**
     *本接口（DescribeProxyGroupList）用于拉取通道组列表及各通道组基本信息。
     * @param req DescribeProxyGroupListRequest
     * @return DescribeProxyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupListResponse DescribeProxyGroupList(DescribeProxyGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyGroupList", DescribeProxyGroupListResponse.class);
    }

    /**
     *该接口用于查询监听器统计数据，包括出入带宽，出入包量，并发数据。支持300, 3600和86400的细粒度，取值为细粒度范围内最大值。
     * @param req DescribeProxyGroupStatisticsRequest
     * @return DescribeProxyGroupStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupStatisticsResponse DescribeProxyGroupStatistics(DescribeProxyGroupStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyGroupStatistics", DescribeProxyGroupStatisticsResponse.class);
    }

    /**
     *该接口用于查询监听器统计数据，包括出入带宽，出入包量，并发，丢包和时延数据。支持300, 3600和86400的细粒度，取值为细粒度范围内最大值。
     * @param req DescribeProxyStatisticsRequest
     * @return DescribeProxyStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyStatisticsResponse DescribeProxyStatistics(DescribeProxyStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxyStatistics", DescribeProxyStatisticsResponse.class);
    }

    /**
     *该接口（DescribeRealServerStatistics）用于查询源站健康检查结果的统计数据。源站状态展示位为1：正常或者0：异常。查询的源站需要在监听器或者规则上进行了绑定，查询时需指定绑定的监听器或者规则ID。该接口支持1分钟细粒度的源站状态统计数据展示。
     * @param req DescribeRealServerStatisticsRequest
     * @return DescribeRealServerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServerStatisticsResponse DescribeRealServerStatistics(DescribeRealServerStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealServerStatistics", DescribeRealServerStatisticsResponse.class);
    }

    /**
     *本接口（DescribeRealServers）用于查询源站信息，可以根据项目名查询所有的源站信息，此外支持指定IP或者域名的源站模糊查询。
     * @param req DescribeRealServersRequest
     * @return DescribeRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersResponse DescribeRealServers(DescribeRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealServers", DescribeRealServersResponse.class);
    }

    /**
     *本接口（DescribeRealServersStatus）用于查询源站是否已被规则或者监听器绑定
     * @param req DescribeRealServersStatusRequest
     * @return DescribeRealServersStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersStatusResponse DescribeRealServersStatus(DescribeRealServersStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRealServersStatus", DescribeRealServersStatusResponse.class);
    }

    /**
     *该接口（DescribeRegionAndPrice）用于获取源站区域和带宽梯度价格
     * @param req DescribeRegionAndPriceRequest
     * @return DescribeRegionAndPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionAndPriceResponse DescribeRegionAndPrice(DescribeRegionAndPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegionAndPrice", DescribeRegionAndPriceResponse.class);
    }

    /**
     *本接口（DescribeResourcesByTag）用于根据标签来查询对应的资源信息，包括通道，通道组和源站。
     * @param req DescribeResourcesByTagRequest
     * @return DescribeResourcesByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagResponse DescribeResourcesByTag(DescribeResourcesByTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourcesByTag", DescribeResourcesByTagResponse.class);
    }

    /**
     *本接口（DescribeRuleRealServers）用于查询转发规则相关的源站信息， 包括该规则可绑定的源站信息和已绑定的源站信息。
     * @param req DescribeRuleRealServersRequest
     * @return DescribeRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleRealServersResponse DescribeRuleRealServers(DescribeRuleRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleRealServers", DescribeRuleRealServersResponse.class);
    }

    /**
     *本接口（DescribeRules）用于查询监听器下的所有规则信息，包括规则域名，路径以及该规则下所绑定的源站列表。当通道版本为3.0时，该接口会返回该域名对应的高级认证配置信息。
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *本接口（DescribeRulesByRuleIds）用于根据规则ID拉取规则信息列表。支持一个或者多个规则信息的拉取。一次最多支持10个规则信息的拉取。
     * @param req DescribeRulesByRuleIdsRequest
     * @return DescribeRulesByRuleIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByRuleIdsResponse DescribeRulesByRuleIds(DescribeRulesByRuleIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRulesByRuleIds", DescribeRulesByRuleIdsResponse.class);
    }

    /**
     *获取安全策略详情
     * @param req DescribeSecurityPolicyDetailRequest
     * @return DescribeSecurityPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyDetailResponse DescribeSecurityPolicyDetail(DescribeSecurityPolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityPolicyDetail", DescribeSecurityPolicyDetailResponse.class);
    }

    /**
     *本接口（DescribeSecurityRules）用于根据安全规则ID查询安全规则详情列表。支持一个或多个安全规则的查询。一次最多支持20个安全规则的查询。
     * @param req DescribeSecurityRulesRequest
     * @return DescribeSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRulesResponse DescribeSecurityRules(DescribeSecurityRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityRules", DescribeSecurityRulesResponse.class);
    }

    /**
     *该接口（DescribeTCPListeners）用于查询单通道或者通道组下的TCP监听器信息。
     * @param req DescribeTCPListenersRequest
     * @return DescribeTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTCPListenersResponse DescribeTCPListeners(DescribeTCPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTCPListeners", DescribeTCPListenersResponse.class);
    }

    /**
     *查询异步任务执行状态
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *该接口（DescribeUDPListeners）用于查询单通道或者通道组下的UDP监听器信息
     * @param req DescribeUDPListenersRequest
     * @return DescribeUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUDPListenersResponse DescribeUDPListeners(DescribeUDPListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUDPListeners", DescribeUDPListenersResponse.class);
    }

    /**
     *本接口（DestroyProxies）用于销毁。通道销毁后，不再产生任何费用。
     * @param req DestroyProxiesRequest
     * @return DestroyProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyProxiesResponse DestroyProxies(DestroyProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyProxies", DestroyProxiesResponse.class);
    }

    /**
     *暂停域名解析
     * @param req DisableGlobalDomainRequest
     * @return DisableGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public DisableGlobalDomainResponse DisableGlobalDomain(DisableGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableGlobalDomain", DisableGlobalDomainResponse.class);
    }

    /**
     *开启域名解析
     * @param req EnableGlobalDomainRequest
     * @return EnableGlobalDomainResponse
     * @throws TencentCloudSDKException
     */
    public EnableGlobalDomainResponse EnableGlobalDomain(EnableGlobalDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableGlobalDomain", EnableGlobalDomainResponse.class);
    }

    /**
     *本接口（InquiryPriceCreateProxy）用于创建加速通道询价。
     * @param req InquiryPriceCreateProxyRequest
     * @return InquiryPriceCreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateProxyResponse InquiryPriceCreateProxy(InquiryPriceCreateProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateProxy", InquiryPriceCreateProxyResponse.class);
    }

    /**
     *本接口（ModifyCertificate）用于修改监听器下的域名对应的证书。该接口仅适用于version3.0的通道。
     * @param req ModifyCertificateRequest
     * @return ModifyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateResponse ModifyCertificate(ModifyCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificate", ModifyCertificateResponse.class);
    }

    /**
     *本接口（ModifyCertificateAttributes）用于修改证书，包括证书名字以及证书内容。
     * @param req ModifyCertificateAttributesRequest
     * @return ModifyCertificateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAttributesResponse ModifyCertificateAttributes(ModifyCertificateAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCertificateAttributes", ModifyCertificateAttributesResponse.class);
    }

    /**
     *本接口（ModifyDomain）用于监听器下的域名。当通道版本为3.0时，支持对该域名所对应的证书修改。
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomain", ModifyDomainResponse.class);
    }

    /**
     *修改域名属性
     * @param req ModifyGlobalDomainAttributeRequest
     * @return ModifyGlobalDomainAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalDomainAttributeResponse ModifyGlobalDomainAttribute(ModifyGlobalDomainAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalDomainAttribute", ModifyGlobalDomainAttributeResponse.class);
    }

    /**
     *修改域名解析记录
     * @param req ModifyGlobalDomainDnsRequest
     * @return ModifyGlobalDomainDnsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalDomainDnsResponse ModifyGlobalDomainDns(ModifyGlobalDomainDnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalDomainDns", ModifyGlobalDomainDnsResponse.class);
    }

    /**
     *本接口（ModifyGroupDomainConfig）用于配置通道组就近接入域名。
     * @param req ModifyGroupDomainConfigRequest
     * @return ModifyGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupDomainConfigResponse ModifyGroupDomainConfig(ModifyGroupDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroupDomainConfig", ModifyGroupDomainConfigResponse.class);
    }

    /**
     *该接口（ModifyHTTPListenerAttribute）用于修改通道的HTTP监听器配置信息，目前仅支持修改监听器的名称。
注意：通道组通道暂时不支持HTTP/HTTPS监听器。
     * @param req ModifyHTTPListenerAttributeRequest
     * @return ModifyHTTPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPListenerAttributeResponse ModifyHTTPListenerAttribute(ModifyHTTPListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHTTPListenerAttribute", ModifyHTTPListenerAttributeResponse.class);
    }

    /**
     *该接口（ModifyHTTPSListenerAttribute）用于修改HTTPS监听器配置，当前不支持通道组和v1版本通道。
     * @param req ModifyHTTPSListenerAttributeRequest
     * @return ModifyHTTPSListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPSListenerAttributeResponse ModifyHTTPSListenerAttribute(ModifyHTTPSListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHTTPSListenerAttribute", ModifyHTTPSListenerAttributeResponse.class);
    }

    /**
     *本接口（ModifyProxiesAttribute）用于修改实例的属性（目前只支持修改通道的名称）。
     * @param req ModifyProxiesAttributeRequest
     * @return ModifyProxiesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesAttributeResponse ModifyProxiesAttribute(ModifyProxiesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxiesAttribute", ModifyProxiesAttributeResponse.class);
    }

    /**
     *本接口（ModifyProxiesProject）用于修改通道所属项目。
     * @param req ModifyProxiesProjectRequest
     * @return ModifyProxiesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesProjectResponse ModifyProxiesProject(ModifyProxiesProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxiesProject", ModifyProxiesProjectResponse.class);
    }

    /**
     *本接口（ModifyProxyConfiguration）用于修改通道的配置。根据当前业务的容量需求，扩容或缩容相关通道的配置。仅支持Scalarable为1的通道,Scalarable可通过接口DescribeProxies获取。
     * @param req ModifyProxyConfigurationRequest
     * @return ModifyProxyConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyConfigurationResponse ModifyProxyConfiguration(ModifyProxyConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyConfiguration", ModifyProxyConfigurationResponse.class);
    }

    /**
     *本接口（ModifyProxyGroupAttribute）用于修改通道组属性，目前仅支持修改通道组名称。
     * @param req ModifyProxyGroupAttributeRequest
     * @return ModifyProxyGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyGroupAttributeResponse ModifyProxyGroupAttribute(ModifyProxyGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProxyGroupAttribute", ModifyProxyGroupAttributeResponse.class);
    }

    /**
     *本接口（ModifyRealServerName）用于修改源站的名称
     * @param req ModifyRealServerNameRequest
     * @return ModifyRealServerNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealServerNameResponse ModifyRealServerName(ModifyRealServerNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRealServerName", ModifyRealServerNameResponse.class);
    }

    /**
     *本接口（ModifyRuleAttribute）用于修改转发规则的信息，包括健康检查的配置以及转发策略。
     * @param req ModifyRuleAttributeRequest
     * @return ModifyRuleAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleAttributeResponse ModifyRuleAttribute(ModifyRuleAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleAttribute", ModifyRuleAttributeResponse.class);
    }

    /**
     *修改安全策略规则名
     * @param req ModifySecurityRuleRequest
     * @return ModifySecurityRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityRuleResponse ModifySecurityRule(ModifySecurityRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityRule", ModifySecurityRuleResponse.class);
    }

    /**
     *本接口（ModifyTCPListenerAttribute）用于修改通道实例下TCP监听器配置，包括健康检查的配置，调度策略。
     * @param req ModifyTCPListenerAttributeRequest
     * @return ModifyTCPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTCPListenerAttributeResponse ModifyTCPListenerAttribute(ModifyTCPListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTCPListenerAttribute", ModifyTCPListenerAttributeResponse.class);
    }

    /**
     *本接口（ModifyUDPListenerAttribute）用于修改通道实例下UDP监听器配置，包括监听器名称和调度策略的修改。
     * @param req ModifyUDPListenerAttributeRequest
     * @return ModifyUDPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUDPListenerAttributeResponse ModifyUDPListenerAttribute(ModifyUDPListenerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUDPListenerAttribute", ModifyUDPListenerAttributeResponse.class);
    }

    /**
     *该接口（OpenProxies）用于开启一条或者多条通道。
     * @param req OpenProxiesRequest
     * @return OpenProxiesResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxiesResponse OpenProxies(OpenProxiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenProxies", OpenProxiesResponse.class);
    }

    /**
     *该接口（OpenProxyGroup）用于开启一条通道组中的所有通道
     * @param req OpenProxyGroupRequest
     * @return OpenProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxyGroupResponse OpenProxyGroup(OpenProxyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenProxyGroup", OpenProxyGroupResponse.class);
    }

    /**
     *开启安全策略
     * @param req OpenSecurityPolicyRequest
     * @return OpenSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenSecurityPolicyResponse OpenSecurityPolicy(OpenSecurityPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenSecurityPolicy", OpenSecurityPolicyResponse.class);
    }

    /**
     *删除已添加的源站(服务器)IP或域名
     * @param req RemoveRealServersRequest
     * @return RemoveRealServersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveRealServersResponse RemoveRealServers(RemoveRealServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveRealServers", RemoveRealServersResponse.class);
    }

    /**
     *本接口（SetAuthentication）用于通道的高级认证配置，包括认证方式选择，以及各种认证方式对应的证书选择。仅支持Version3.0的通道。
     * @param req SetAuthenticationRequest
     * @return SetAuthenticationResponse
     * @throws TencentCloudSDKException
     */
    public SetAuthenticationResponse SetAuthentication(SetAuthenticationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAuthentication", SetAuthenticationResponse.class);
    }

    /**
     *设置监听器TLS配置
     * @param req SetTlsVersionRequest
     * @return SetTlsVersionResponse
     * @throws TencentCloudSDKException
     */
    public SetTlsVersionResponse SetTlsVersion(SetTlsVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTlsVersion", SetTlsVersionResponse.class);
    }

}
