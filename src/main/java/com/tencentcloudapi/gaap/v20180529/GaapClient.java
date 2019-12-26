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
        JsonResponseModel<AddRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindListenerRealServers）用于TCP/UDP监听器绑定解绑源站。
注意：本接口会解绑之前绑定的源站，绑定本次调用所选择的源站。例如：原来绑定的源站为A，B，C，本次调用的选择绑定的源站为C，D，E，那么调用后所绑定的源站为C，D，E。
     * @param req BindListenerRealServersRequest
     * @return BindListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindListenerRealServersResponse BindListenerRealServers(BindListenerRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindListenerRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindListenerRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindListenerRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于7层监听器的转发规则绑定源站。注意：本接口会解绑之前绑定的源站，绑定本次调用所选择的源站。
     * @param req BindRuleRealServersRequest
     * @return BindRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public BindRuleRealServersResponse BindRuleRealServers(BindRuleRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindRuleRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindRuleRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindRuleRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CheckProxyCreate)用于查询能否创建指定配置的加速通道。
     * @param req CheckProxyCreateRequest
     * @return CheckProxyCreateResponse
     * @throws TencentCloudSDKException
     */
    public CheckProxyCreateResponse CheckProxyCreate(CheckProxyCreateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckProxyCreateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckProxyCreateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckProxyCreate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CloseProxies）用于关闭通道。通道关闭后，不再产生流量，但每天仍然收取通道基础配置费用。
     * @param req CloseProxiesRequest
     * @return CloseProxiesResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxiesResponse CloseProxies(CloseProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭安全策略
     * @param req CloseSecurityPolicyRequest
     * @return CloseSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CloseSecurityPolicyResponse CloseSecurityPolicy(CloseSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCertificate）用于创建Gaap相关证书和配置文件，包括基础认证配置文件，客户端CA证书，服务器SSL证书，Gaap SSL证书以及源站CA证书。
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCertificateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDomain）用于创建HTTP/HTTPS监听器的访问域名，客户端请求通过访问该域名来请求后端业务。
该接口仅支持version3.0的通道。
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *定制域名指定错误码的错误响应
     * @param req CreateDomainErrorPageInfoRequest
     * @return CreateDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainErrorPageInfoResponse CreateDomainErrorPageInfo(CreateDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainErrorPageInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainErrorPageInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDomainErrorPageInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateHTTPListener）用于在通道实例下创建HTTP协议类型的监听器。
     * @param req CreateHTTPListenerRequest
     * @return CreateHTTPListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPListenerResponse CreateHTTPListener(CreateHTTPListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHTTPListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHTTPListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateHTTPSListener）用于在通道实例下创建HTTPS协议类型的监听器。
     * @param req CreateHTTPSListenerRequest
     * @return CreateHTTPSListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateHTTPSListenerResponse CreateHTTPSListener(CreateHTTPSListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHTTPSListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPSListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHTTPSListener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateProxy）用于创建/复制一个指定配置的加速通道。当复制通道时，需要设置新通道的基本配置参数，并设置ClonedProxyId来指定被复制的通道。
     * @param req CreateProxyRequest
     * @return CreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyResponse CreateProxy(CreateProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProxy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateProxyGroup）用于创建通道组。
     * @param req CreateProxyGroupRequest
     * @return CreateProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupResponse CreateProxyGroup(CreateProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProxyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateProxyGroupDomain）用于创建通道组域名，并开启域名解析。
     * @param req CreateProxyGroupDomainRequest
     * @return CreateProxyGroupDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxyGroupDomainResponse CreateProxyGroupDomain(CreateProxyGroupDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxyGroupDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProxyGroupDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateRule）用于创建HTTP/HTTPS监听器转发规则。
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建安全策略
     * @param req CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityPolicyResponse CreateSecurityPolicy(CreateSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加安全策略规则
     * @param req CreateSecurityRulesRequest
     * @return CreateSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityRulesResponse CreateSecurityRules(CreateSecurityRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateTCPListeners）用于批量创建单通道或者通道组的TCP协议类型的监听器。
     * @param req CreateTCPListenersRequest
     * @return CreateTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateTCPListenersResponse CreateTCPListeners(CreateTCPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTCPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTCPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTCPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（CreateUDPListeners）用于批量创建单通道或者通道组的UDP协议类型的监听器。
     * @param req CreateUDPListenersRequest
     * @return CreateUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateUDPListenersResponse CreateUDPListeners(CreateUDPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUDPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUDPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUDPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCertificate）用于删除证书。
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCertificateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDomain）仅适用于7层监听器，用于删除该监听器下对应域名及域名下的所有规则，所有已绑定源站的规则将自动解绑。
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名的定制错误
     * @param req DeleteDomainErrorPageInfoRequest
     * @return DeleteDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainErrorPageInfoResponse DeleteDomainErrorPageInfo(DeleteDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainErrorPageInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainErrorPageInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDomainErrorPageInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DeleteListeners）用于批量删除通道或通道组的监听器，包括4/7层监听器。
     * @param req DeleteListenersRequest
     * @return DeleteListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenersResponse DeleteListeners(DeleteListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteProxyGroup）用于删除通道组。
     * @param req DeleteProxyGroupRequest
     * @return DeleteProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProxyGroupResponse DeleteProxyGroup(DeleteProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProxyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProxyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProxyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DeleteRule）用于删除HTTP/HTTPS监听器的转发规则。
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除安全策略
     * @param req DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityPolicyResponse DeleteSecurityPolicy(DeleteSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除安全策略规则
     * @param req DeleteSecurityRulesRequest
     * @return DeleteSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityRulesResponse DeleteSecurityRules(DeleteSecurityRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccessRegions）用于查询加速区域，即客户端接入区域。
     * @param req DescribeAccessRegionsRequest
     * @return DescribeAccessRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsResponse DescribeAccessRegions(DescribeAccessRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRegionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccessRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccessRegionsByDestRegion）根据源站区域查询可用的加速区域列表
     * @param req DescribeAccessRegionsByDestRegionRequest
     * @return DescribeAccessRegionsByDestRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsByDestRegionResponse DescribeAccessRegionsByDestRegion(DescribeAccessRegionsByDestRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRegionsByDestRegionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsByDestRegionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccessRegionsByDestRegion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCertificateDetail）用于查询证书详情，包括证书ID，证书名字，证书类型，证书内容以及密钥等信息。
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificateDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificateDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCertificates）用来查询可以使用的证书列表。
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCountryAreaMapping）用于获取国家地区编码映射表。
     * @param req DescribeCountryAreaMappingRequest
     * @return DescribeCountryAreaMappingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCountryAreaMappingResponse DescribeCountryAreaMapping(DescribeCountryAreaMappingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCountryAreaMappingResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCountryAreaMappingResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCountryAreaMapping"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDestRegions）用于查询源站区域，即源站服务器所在区域。
     * @param req DescribeDestRegionsRequest
     * @return DescribeDestRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDestRegionsResponse DescribeDestRegions(DescribeDestRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDestRegionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDestRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDestRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询目前定制域名的错误响应
     * @param req DescribeDomainErrorPageInfoRequest
     * @return DescribeDomainErrorPageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoResponse DescribeDomainErrorPageInfo(DescribeDomainErrorPageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainErrorPageInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomainErrorPageInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据定制错误ID查询错误响应
     * @param req DescribeDomainErrorPageInfoByIdsRequest
     * @return DescribeDomainErrorPageInfoByIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainErrorPageInfoByIdsResponse DescribeDomainErrorPageInfoByIds(DescribeDomainErrorPageInfoByIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainErrorPageInfoByIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoByIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomainErrorPageInfoByIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为内部接口，用于查询可以获取统计数据的通道组和通道信息
     * @param req DescribeGroupAndStatisticsProxyRequest
     * @return DescribeGroupAndStatisticsProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupAndStatisticsProxyResponse DescribeGroupAndStatisticsProxy(DescribeGroupAndStatisticsProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupAndStatisticsProxyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupAndStatisticsProxyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupAndStatisticsProxy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGroupDomainConfig）用于获取通道组域名解析配置详情。
     * @param req DescribeGroupDomainConfigRequest
     * @return DescribeGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupDomainConfigResponse DescribeGroupDomainConfig(DescribeGroupDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupDomainConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupDomainConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGroupDomainConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeHTTPListeners）用来查询HTTP监听器信息。
     * @param req DescribeHTTPListenersRequest
     * @return DescribeHTTPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPListenersResponse DescribeHTTPListeners(DescribeHTTPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHTTPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHTTPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeHTTPSListeners）用来查询HTTPS监听器信息。
     * @param req DescribeHTTPSListenersRequest
     * @return DescribeHTTPSListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHTTPSListenersResponse DescribeHTTPSListeners(DescribeHTTPSListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHTTPSListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPSListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHTTPSListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeListenerRealServers）用于查询TCP/UDP监听器源站列表，包括该监听器已经绑定的源站列表以及可以绑定的源站列表。
     * @param req DescribeListenerRealServersRequest
     * @return DescribeListenerRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerRealServersResponse DescribeListenerRealServers(DescribeListenerRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListenerRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeListenerRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询监听器统计数据，包括出入带宽，出入包量，并发数据。支持300秒, 3600秒和86400秒的细粒度，取值为细粒度范围内最大值。
     * @param req DescribeListenerStatisticsRequest
     * @return DescribeListenerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerStatisticsResponse DescribeListenerStatistics(DescribeListenerStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListenerStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeListenerStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProxies）用于查询通道实例列表。
     * @param req DescribeProxiesRequest
     * @return DescribeProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesResponse DescribeProxies(DescribeProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProxiesStatus）用于查询通道状态列表。
     * @param req DescribeProxiesStatusRequest
     * @return DescribeProxiesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxiesStatusResponse DescribeProxiesStatus(DescribeProxiesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxiesStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxiesStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为内部接口，用于查询可以获取统计数据的通道和监听器信息
     * @param req DescribeProxyAndStatisticsListenersRequest
     * @return DescribeProxyAndStatisticsListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyAndStatisticsListenersResponse DescribeProxyAndStatisticsListeners(DescribeProxyAndStatisticsListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyAndStatisticsListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyAndStatisticsListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyAndStatisticsListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProxyDetail）用于查询通道详情。
     * @param req DescribeProxyDetailRequest
     * @return DescribeProxyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyDetailResponse DescribeProxyDetail(DescribeProxyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProxyGroupDetails）用于查询通道组详情。
     * @param req DescribeProxyGroupDetailsRequest
     * @return DescribeProxyGroupDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupDetailsResponse DescribeProxyGroupDetails(DescribeProxyGroupDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyGroupDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyGroupDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeProxyGroupList）用于拉取通道组列表及各通道组基本信息。
     * @param req DescribeProxyGroupListRequest
     * @return DescribeProxyGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupListResponse DescribeProxyGroupList(DescribeProxyGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询监听器统计数据，包括出入带宽，出入包量，并发数据。支持300, 3600和86400的细粒度，取值为细粒度范围内最大值。
     * @param req DescribeProxyGroupStatisticsRequest
     * @return DescribeProxyGroupStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyGroupStatisticsResponse DescribeProxyGroupStatistics(DescribeProxyGroupStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyGroupStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyGroupStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询监听器统计数据，包括出入带宽，出入包量，并发，丢包和时延数据。支持300, 3600和86400的细粒度，取值为细粒度范围内最大值。
     * @param req DescribeProxyStatisticsRequest
     * @return DescribeProxyStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxyStatisticsResponse DescribeProxyStatistics(DescribeProxyStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxyStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProxyStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeRealServerStatistics）用于查询源站健康检查结果的统计数据。源站状态展示位为1：正常或者0：异常。查询的源站需要在监听器或者规则上进行了绑定，查询时需指定绑定的监听器或者规则ID。该接口支持最近1，3，6，12，24小时内1分钟细粒度的源站状态统计数据展示。
     * @param req DescribeRealServerStatisticsRequest
     * @return DescribeRealServerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServerStatisticsResponse DescribeRealServerStatistics(DescribeRealServerStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServerStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServerStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealServerStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRealServers）用于查询源站信息，可以根据项目名查询所有的源站信息，此外支持指定IP机或者域名的源站模糊查询。
     * @param req DescribeRealServersRequest
     * @return DescribeRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersResponse DescribeRealServers(DescribeRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRealServersStatus）用于查询源站是否已被规则或者监听器绑定
     * @param req DescribeRealServersStatusRequest
     * @return DescribeRealServersStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersStatusResponse DescribeRealServersStatus(DescribeRealServersStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServersStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealServersStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeRegionAndPrice）用于获取源站区域和带宽梯度价格
     * @param req DescribeRegionAndPriceRequest
     * @return DescribeRegionAndPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionAndPriceResponse DescribeRegionAndPrice(DescribeRegionAndPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionAndPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionAndPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRegionAndPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeResourcesByTag）用于根据标签来查询对应的资源信息，包括通道，通道组和源站。
     * @param req DescribeResourcesByTagRequest
     * @return DescribeResourcesByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagResponse DescribeResourcesByTag(DescribeResourcesByTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesByTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourcesByTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRuleRealServers）用于查询转发规则相关的源站信息， 包括该规则可绑定的源站信息和已绑定的源站信息。
     * @param req DescribeRuleRealServersRequest
     * @return DescribeRuleRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleRealServersResponse DescribeRuleRealServers(DescribeRuleRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRuleRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRules）用于查询监听器下的所有规则信息，包括规则域名，路径以及该规则下所绑定的源站列表。当通道版本为3.0时，该接口会返回该域名对应的高级认证配置信息。
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRulesByRuleIds）用于根据规则ID拉取规则信息列表。支持一个或者多个规则信息的拉取。一次最多支持10个规则信息的拉取。
     * @param req DescribeRulesByRuleIdsRequest
     * @return DescribeRulesByRuleIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesByRuleIdsResponse DescribeRulesByRuleIds(DescribeRulesByRuleIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesByRuleIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesByRuleIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRulesByRuleIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全策略详情
     * @param req DescribeSecurityPolicyDetailRequest
     * @return DescribeSecurityPolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyDetailResponse DescribeSecurityPolicyDetail(DescribeSecurityPolicyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityPolicyDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityRules）用于根据安全规则ID查询安全规则详情列表。支持一个或多个安全规则的查询。一次最多支持20个安全规则的查询。
     * @param req DescribeSecurityRulesRequest
     * @return DescribeSecurityRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRulesResponse DescribeSecurityRules(DescribeSecurityRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeTCPListeners）用于查询单通道或者通道组下的TCP监听器信息。
     * @param req DescribeTCPListenersRequest
     * @return DescribeTCPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTCPListenersResponse DescribeTCPListeners(DescribeTCPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTCPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTCPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTCPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeUDPListeners）用于查询单通道或者通道组下的UDP监听器信息
     * @param req DescribeUDPListenersRequest
     * @return DescribeUDPListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUDPListenersResponse DescribeUDPListeners(DescribeUDPListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUDPListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUDPListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUDPListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DestroyProxies）用于销毁。通道销毁后，不再产生任何费用。
     * @param req DestroyProxiesRequest
     * @return DestroyProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyProxiesResponse DestroyProxies(DestroyProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceCreateProxy）用于创建加速通道询价。
     * @param req InquiryPriceCreateProxyRequest
     * @return InquiryPriceCreateProxyResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateProxyResponse InquiryPriceCreateProxy(InquiryPriceCreateProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateProxyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateProxyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateProxy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCertificate）用于修改监听器下的域名对应的证书。该接口仅适用于version3.0的通道。
     * @param req ModifyCertificateRequest
     * @return ModifyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateResponse ModifyCertificate(ModifyCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCertificateAttributes）用于修改证书，包括证明名字以及证书内容。
     * @param req ModifyCertificateAttributesRequest
     * @return ModifyCertificateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAttributesResponse ModifyCertificateAttributes(ModifyCertificateAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCertificateAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDomain）用于监听器下的域名。当通道版本为3.0时，支持对该域名所对应的证书修改。
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyGroupDomainConfig）用于配置通道组就近接入域名。
     * @param req ModifyGroupDomainConfigRequest
     * @return ModifyGroupDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupDomainConfigResponse ModifyGroupDomainConfig(ModifyGroupDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupDomainConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupDomainConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGroupDomainConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（ModifyHTTPListenerAttribute）用于修改通道的HTTP监听器配置信息，目前仅支持修改监听器的名称。
注意：通道组通道暂时不支持HTTP/HTTPS监听器。
     * @param req ModifyHTTPListenerAttributeRequest
     * @return ModifyHTTPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPListenerAttributeResponse ModifyHTTPListenerAttribute(ModifyHTTPListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHTTPListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHTTPListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（ModifyHTTPSListenerAttribute）用于修改HTTPS监听器配置，当前不支持通道组和v1版本通道。
     * @param req ModifyHTTPSListenerAttributeRequest
     * @return ModifyHTTPSListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHTTPSListenerAttributeResponse ModifyHTTPSListenerAttribute(ModifyHTTPSListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHTTPSListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPSListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHTTPSListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyProxiesAttribute）用于修改实例的属性（目前只支持修改通道的名称）。
     * @param req ModifyProxiesAttributeRequest
     * @return ModifyProxiesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesAttributeResponse ModifyProxiesAttribute(ModifyProxiesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxiesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxiesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyProxiesProject）用于修改通道所属项目。
     * @param req ModifyProxiesProjectRequest
     * @return ModifyProxiesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxiesProjectResponse ModifyProxiesProject(ModifyProxiesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxiesProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxiesProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyProxyConfiguration）用于修改通道的配置。根据当前业务的容量需求，扩容或缩容相关通道的配置。仅支持Scalarable为1的通道,Scalarable可通过接口DescribeProxies获取。
     * @param req ModifyProxyConfigurationRequest
     * @return ModifyProxyConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyConfigurationResponse ModifyProxyConfiguration(ModifyProxyConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxyConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxyConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyProxyGroupAttribute）用于修改通道组属性，目前仅支持修改通道组名称。
     * @param req ModifyProxyGroupAttributeRequest
     * @return ModifyProxyGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProxyGroupAttributeResponse ModifyProxyGroupAttribute(ModifyProxyGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProxyGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProxyGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyRealServerName）用于修改源站的名称
     * @param req ModifyRealServerNameRequest
     * @return ModifyRealServerNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRealServerNameResponse ModifyRealServerName(ModifyRealServerNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRealServerNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRealServerNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRealServerName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyRuleAttribute）用于修改转发规则的信息，包括健康检查的配置以及转发策略。
     * @param req ModifyRuleAttributeRequest
     * @return ModifyRuleAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleAttributeResponse ModifyRuleAttribute(ModifyRuleAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRuleAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改安全策略规则名
     * @param req ModifySecurityRuleRequest
     * @return ModifySecurityRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityRuleResponse ModifySecurityRule(ModifySecurityRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySecurityRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyTCPListenerAttribute）用于修改通道实例下TCP监听器配置，包括健康检查的配置，调度策略。
     * @param req ModifyTCPListenerAttributeRequest
     * @return ModifyTCPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTCPListenerAttributeResponse ModifyTCPListenerAttribute(ModifyTCPListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTCPListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTCPListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTCPListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyUDPListenerAttribute）用于修改通道实例下UDP监听器配置，包括监听器名称和调度策略的修改。
     * @param req ModifyUDPListenerAttributeRequest
     * @return ModifyUDPListenerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUDPListenerAttributeResponse ModifyUDPListenerAttribute(ModifyUDPListenerAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUDPListenerAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUDPListenerAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUDPListenerAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（OpenProxies）用于开启一条或者多条通道。
     * @param req OpenProxiesRequest
     * @return OpenProxiesResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxiesResponse OpenProxies(OpenProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProxiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProxiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenProxies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启安全策略
     * @param req OpenSecurityPolicyRequest
     * @return OpenSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public OpenSecurityPolicyResponse OpenSecurityPolicy(OpenSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenSecurityPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OpenSecurityPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OpenSecurityPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除已添加的源站(服务器)IP或域名
     * @param req RemoveRealServersRequest
     * @return RemoveRealServersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveRealServersResponse RemoveRealServers(RemoveRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveRealServersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveRealServersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveRealServers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetAuthentication）用于通道的高级认证配置，包括认证方式选择，以及各种认证方式对应的证书选择。仅支持Version3.0的通道。
     * @param req SetAuthenticationRequest
     * @return SetAuthenticationResponse
     * @throws TencentCloudSDKException
     */
    public SetAuthenticationResponse SetAuthentication(SetAuthenticationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAuthenticationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetAuthenticationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetAuthentication"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
