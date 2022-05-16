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
        JsonResponseModel<AddRealServersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindListenerRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindListenerRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindRuleRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindRuleRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckProxyCreateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckProxyCreate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CloseProxyGroup）用于关闭通道组。通道组关闭后，不再产生流量，但每天仍然收取通道基础配置费用。
     * @param req CloseProxyGroupRequest
     * @return CloseProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public CloseProxyGroupResponse CloseProxyGroup(CloseProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProxyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CloseSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCustomHeader）用于创建HTTP/HTTPS监听器的自定义header，客户端请求通过访问该监听器时，会将监听器中配置的header信息发送到源站。
     * @param req CreateCustomHeaderRequest
     * @return CreateCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomHeaderResponse CreateCustomHeader(CreateCustomHeaderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomHeaderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomHeaderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomHeader");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainErrorPageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainErrorPageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateFirstLinkSession）用于创建接入段加速会话，创建有可能成功，也可能失败，需要通过返回码来进行判断。
     * @param req CreateFirstLinkSessionRequest
     * @return CreateFirstLinkSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirstLinkSessionResponse CreateFirstLinkSession(CreateFirstLinkSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFirstLinkSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFirstLinkSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFirstLinkSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHTTPListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHTTPSListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHTTPSListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxyGroupDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxyGroupDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTCPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTCPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUDPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUDPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainErrorPageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainErrorPageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteFirstLinkSession）用于删除接入段加速会话，删除加速会话后会停止加速。
     * @param req DeleteFirstLinkSessionRequest
     * @return DeleteFirstLinkSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirstLinkSessionResponse DeleteFirstLinkSession(DeleteFirstLinkSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFirstLinkSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFirstLinkSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFirstLinkSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccessRegionsByDestRegion）根据源站区域查询可用的加速区域列表。
     * @param req DescribeAccessRegionsByDestRegionRequest
     * @return DescribeAccessRegionsByDestRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsByDestRegionResponse DescribeAccessRegionsByDestRegion(DescribeAccessRegionsByDestRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRegionsByDestRegionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRegionsByDestRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessRegionsByDestRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBlackHeader）用于查询禁用的自定义header 名称
     * @param req DescribeBlackHeaderRequest
     * @return DescribeBlackHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackHeaderResponse DescribeBlackHeader(DescribeBlackHeaderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlackHeaderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlackHeaderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlackHeader");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificateDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCountryAreaMappingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCountryAreaMapping");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCustomHeader）用于自定义header列表
     * @param req DescribeCustomHeaderRequest
     * @return DescribeCustomHeaderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomHeaderResponse DescribeCustomHeader(DescribeCustomHeaderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomHeaderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomHeaderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomHeader");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDestRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDestRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainErrorPageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainErrorPageInfoByIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainErrorPageInfoByIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFirstLinkSession）用于查询接入段加速会话状态，包括会话状态，生效时长，加速套餐等信息。
     * @param req DescribeFirstLinkSessionRequest
     * @return DescribeFirstLinkSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirstLinkSessionResponse DescribeFirstLinkSession(DescribeFirstLinkSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirstLinkSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirstLinkSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirstLinkSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupAndStatisticsProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupAndStatisticsProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHTTPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHTTPSListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHTTPSListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListenerRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListenerStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxiesStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxiesStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyAndStatisticsListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyAndStatisticsListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyGroupDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyGroupStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyGroupStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxyStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxyStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（DescribeRealServerStatistics）用于查询源站健康检查结果的统计数据。源站状态展示位为1：正常或者0：异常。查询的源站需要在监听器或者规则上进行了绑定，查询时需指定绑定的监听器或者规则ID。该接口支持1分钟细粒度的源站状态统计数据展示。
     * @param req DescribeRealServerStatisticsRequest
     * @return DescribeRealServerStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServerStatisticsResponse DescribeRealServerStatistics(DescribeRealServerStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServerStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServerStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealServerStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRealServers）用于查询源站信息，可以根据项目名查询所有的源站信息，此外支持指定IP或者域名的源站模糊查询。
     * @param req DescribeRealServersRequest
     * @return DescribeRealServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealServersResponse DescribeRealServers(DescribeRealServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealServersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealServersStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealServersStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionAndPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegionAndPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourcesByTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesByRuleIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRulesByRuleIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTCPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTCPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUDPListenersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUDPListeners");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCertificateAttributes）用于修改证书，包括证书名字以及证书内容。
     * @param req ModifyCertificateAttributesRequest
     * @return ModifyCertificateAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAttributesResponse ModifyCertificateAttributes(ModifyCertificateAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificateAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGroupDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHTTPListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHTTPSListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHTTPSListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxiesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxiesProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxiesProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxyConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProxyGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProxyGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRealServerNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRealServerName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRuleAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTCPListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTCPListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUDPListenerAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUDPListenerAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口（OpenProxyGroup）用于开启一条通道组中的所有通道
     * @param req OpenProxyGroupRequest
     * @return OpenProxyGroupResponse
     * @throws TencentCloudSDKException
     */
    public OpenProxyGroupResponse OpenProxyGroup(OpenProxyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenProxyGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenProxyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenProxyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OpenSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OpenSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveRealServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveRealServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetAuthenticationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAuthentication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
