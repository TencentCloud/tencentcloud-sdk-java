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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSpartaProtectionRequest extends AbstractModel {

    /**
    * <p>需要防护的域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>证书类型。<br>0：仅配置HTTP监听端口，没有证书<br>1：证书来源为自有证书<br>2：证书来源为托管证书</p>
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * <p>waf前是否部署有七层代理服务。<br>0：没有部署代理服务<br>1：有部署代理服务，waf将使用XFF获取客户端IP<br>2：有部署代理服务，waf将使用remote_addr获取客户端IP<br>3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * <p>回源类型。<br>0：通过IP回源<br>1：通过域名回源</p>
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * <p>是否开启WebSocket支持。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * <p>回源负载均衡策略。<br>0：轮询<br>1：IP hash<br>2：加权轮询</p>
    */
    @SerializedName("LoadBalance")
    @Expose
    private String LoadBalance;

    /**
    * <p>服务端口列表配置。<br>NginxServerId：新增域名时填&#39;0&#39;<br>Port：监听端口号<br>Protocol：端口协议<br>UpstreamPort：与Port相同<br>UpstreamProtocol：与Protocol相同</p>
    */
    @SerializedName("Ports")
    @Expose
    private PortItem [] Ports;

    /**
    * <p>必填项，是否开启长连接。<br>0： 短连接<br>1： 长连接</p>
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private String IsKeepAlive;

    /**
    * <p>必填项，域名所属实例id</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>是否开启HTTP强制跳转到HTTPS。0：不强制跳转1：开启强制跳转</p>
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * <p>是否开启HTTP2，需要开启HTTPS协议支持。0：关闭1：开启</p>
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * <p>是否开启主动健康检测。0：不开启1：开启</p>
    */
    @SerializedName("ActiveCheck")
    @Expose
    private Long ActiveCheck;

    /**
    * <p>加密套件模板。0：不支持选择，使用默认模板  1：通用型模板 2：安全型模板3：自定义模板</p>
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * <p>CertType为1时，需要填充此参数，表示自有证书的证书链</p>
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * <p>CertType为1时，需要填充此参数，表示自有证书的私钥</p>
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * <p>CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * <p>Waf的资源ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>IsCdn为3时，需要填此参数，表示自定义header</p>
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * <p>服务配置有HTTPS端口时，HTTPS的回源协议。<br>http：使用http协议回源，和HttpsUpstreamPort配合使用<br>https：使用https协议回源</p>
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * <p>HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段</p>
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * <p>是否开启灰度，0表示不开启灰度。</p>
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * <p>灰度的地区</p>
    */
    @SerializedName("GrayAreas")
    @Expose
    private String [] GrayAreas;

    /**
    * <p>域名回源时的回源域名。UpstreamType为1时，需要填充此字段</p>
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * <p>IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段</p>
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * <p>WAF实例类型。<br>sparta-waf：SAAS型WAF<br>clb-waf：负载均衡型WAF<br>cdn-waf：CDN上的Web防护能力</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>目前填0即可。anycast IP类型开关： 0 普通IP 1 Anycast IP</p>
    */
    @SerializedName("Anycast")
    @Expose
    private Long Anycast;

    /**
    * <p>回源IP列表各IP的权重，和SrcList一一对应。当且仅当UpstreamType为0，并且SrcList有多个IP，并且LoadBalance为2时需要填写，否则填 []</p>
    */
    @SerializedName("Weights")
    @Expose
    private Long [] Weights;

    /**
    * <p>TLS版本信息</p>
    */
    @SerializedName("TLSVersion")
    @Expose
    private Long TLSVersion;

    /**
    * <p>自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。</p>
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * <p>WAF与源站的连接超时，默认10s。</p>
    */
    @SerializedName("ProxyConnectTimeout")
    @Expose
    private Long ProxyConnectTimeout;

    /**
    * <p>WAF与源站的读超时时间，默认300s。</p>
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * <p>WAF与源站的写超时时间，默认300s。</p>
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * <p>WAF回源时的SNI类型。<br>0：关闭SNI，不配置client_hello中的server_name<br>1：开启SNI，client_hello中的server_name为防护域名<br>2：开启SNI，SNI为域名回源时的源站域名<br>3：开启SNI，SNI为自定义域名</p>
    */
    @SerializedName("SniType")
    @Expose
    private Long SniType;

    /**
    * <p>SniType为3时，需要填此参数，表示自定义的SNI；</p>
    */
    @SerializedName("SniHost")
    @Expose
    private String SniHost;

    /**
    * <p>是否开启XFF重置。0：关闭 1：开启</p>
    */
    @SerializedName("XFFReset")
    @Expose
    private Long XFFReset;

    /**
    * <p>域名备注信息</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。</p>
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * <p>是否开启缓存。 0：关闭 1：开启</p>
    */
    @SerializedName("ProxyBuffer")
    @Expose
    private Long ProxyBuffer;

    /**
    * <p>是否开启拨测。 0: 禁用拨测  1: 启用拨测。默认启用拨测</p>
    */
    @SerializedName("ProbeStatus")
    @Expose
    private Long ProbeStatus;

    /**
    * <p>国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问</p>
    */
    @SerializedName("GmType")
    @Expose
    private Long GmType;

    /**
    * <p>国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书</p>
    */
    @SerializedName("GmCertType")
    @Expose
    private Long GmCertType;

    /**
    * <p>GmCertType为1时，需要填充此参数，表示自有国密证书的证书链</p>
    */
    @SerializedName("GmCert")
    @Expose
    private String GmCert;

    /**
    * <p>GmCertType为1时，需要填充此参数，表示自有国密证书的私钥</p>
    */
    @SerializedName("GmPrivateKey")
    @Expose
    private String GmPrivateKey;

    /**
    * <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书</p>
    */
    @SerializedName("GmEncCert")
    @Expose
    private String GmEncCert;

    /**
    * <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥</p>
    */
    @SerializedName("GmEncPrivateKey")
    @Expose
    private String GmEncPrivateKey;

    /**
    * <p>GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
    */
    @SerializedName("GmSSLId")
    @Expose
    private String GmSSLId;

    /**
    * <p>回源策略，支持负载均衡回源和分流回源两种方式。0：默认值，负载均衡回源；1：分流回源</p>
    */
    @SerializedName("UpstreamPolicy")
    @Expose
    private Long UpstreamPolicy;

    /**
    * <p>分流回源时生效，分流回源的规则。</p>
    */
    @SerializedName("UpstreamRules")
    @Expose
    private UpstreamRule [] UpstreamRules;

    /**
    * <p>业务场景。0：默认值，表示常规业务场景 1：大模型业务场景</p>
    */
    @SerializedName("UseCase")
    @Expose
    private Long UseCase;

    /**
    * <p>gzip开关。0：关闭 1：默认值，打开。</p>
    */
    @SerializedName("Gzip")
    @Expose
    private Long Gzip;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>需要防护的域名</p> 
     * @return Domain <p>需要防护的域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>需要防护的域名</p>
     * @param Domain <p>需要防护的域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>证书类型。<br>0：仅配置HTTP监听端口，没有证书<br>1：证书来源为自有证书<br>2：证书来源为托管证书</p> 
     * @return CertType <p>证书类型。<br>0：仅配置HTTP监听端口，没有证书<br>1：证书来源为自有证书<br>2：证书来源为托管证书</p>
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set <p>证书类型。<br>0：仅配置HTTP监听端口，没有证书<br>1：证书来源为自有证书<br>2：证书来源为托管证书</p>
     * @param CertType <p>证书类型。<br>0：仅配置HTTP监听端口，没有证书<br>1：证书来源为自有证书<br>2：证书来源为托管证书</p>
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get <p>waf前是否部署有七层代理服务。<br>0：没有部署代理服务<br>1：有部署代理服务，waf将使用XFF获取客户端IP<br>2：有部署代理服务，waf将使用remote_addr获取客户端IP<br>3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p> 
     * @return IsCdn <p>waf前是否部署有七层代理服务。<br>0：没有部署代理服务<br>1：有部署代理服务，waf将使用XFF获取客户端IP<br>2：有部署代理服务，waf将使用remote_addr获取客户端IP<br>3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set <p>waf前是否部署有七层代理服务。<br>0：没有部署代理服务<br>1：有部署代理服务，waf将使用XFF获取客户端IP<br>2：有部署代理服务，waf将使用remote_addr获取客户端IP<br>3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
     * @param IsCdn <p>waf前是否部署有七层代理服务。<br>0：没有部署代理服务<br>1：有部署代理服务，waf将使用XFF获取客户端IP<br>2：有部署代理服务，waf将使用remote_addr获取客户端IP<br>3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get <p>回源类型。<br>0：通过IP回源<br>1：通过域名回源</p> 
     * @return UpstreamType <p>回源类型。<br>0：通过IP回源<br>1：通过域名回源</p>
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set <p>回源类型。<br>0：通过IP回源<br>1：通过域名回源</p>
     * @param UpstreamType <p>回源类型。<br>0：通过IP回源<br>1：通过域名回源</p>
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get <p>是否开启WebSocket支持。<br>0：关闭<br>1：开启</p> 
     * @return IsWebsocket <p>是否开启WebSocket支持。<br>0：关闭<br>1：开启</p>
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set <p>是否开启WebSocket支持。<br>0：关闭<br>1：开启</p>
     * @param IsWebsocket <p>是否开启WebSocket支持。<br>0：关闭<br>1：开启</p>
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get <p>回源负载均衡策略。<br>0：轮询<br>1：IP hash<br>2：加权轮询</p> 
     * @return LoadBalance <p>回源负载均衡策略。<br>0：轮询<br>1：IP hash<br>2：加权轮询</p>
     */
    public String getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set <p>回源负载均衡策略。<br>0：轮询<br>1：IP hash<br>2：加权轮询</p>
     * @param LoadBalance <p>回源负载均衡策略。<br>0：轮询<br>1：IP hash<br>2：加权轮询</p>
     */
    public void setLoadBalance(String LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get <p>服务端口列表配置。<br>NginxServerId：新增域名时填&#39;0&#39;<br>Port：监听端口号<br>Protocol：端口协议<br>UpstreamPort：与Port相同<br>UpstreamProtocol：与Protocol相同</p> 
     * @return Ports <p>服务端口列表配置。<br>NginxServerId：新增域名时填&#39;0&#39;<br>Port：监听端口号<br>Protocol：端口协议<br>UpstreamPort：与Port相同<br>UpstreamProtocol：与Protocol相同</p>
     */
    public PortItem [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>服务端口列表配置。<br>NginxServerId：新增域名时填&#39;0&#39;<br>Port：监听端口号<br>Protocol：端口协议<br>UpstreamPort：与Port相同<br>UpstreamProtocol：与Protocol相同</p>
     * @param Ports <p>服务端口列表配置。<br>NginxServerId：新增域名时填&#39;0&#39;<br>Port：监听端口号<br>Protocol：端口协议<br>UpstreamPort：与Port相同<br>UpstreamProtocol：与Protocol相同</p>
     */
    public void setPorts(PortItem [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>必填项，是否开启长连接。<br>0： 短连接<br>1： 长连接</p> 
     * @return IsKeepAlive <p>必填项，是否开启长连接。<br>0： 短连接<br>1： 长连接</p>
     */
    public String getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set <p>必填项，是否开启长连接。<br>0： 短连接<br>1： 长连接</p>
     * @param IsKeepAlive <p>必填项，是否开启长连接。<br>0： 短连接<br>1： 长连接</p>
     */
    public void setIsKeepAlive(String IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get <p>必填项，域名所属实例id</p> 
     * @return InstanceID <p>必填项，域名所属实例id</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>必填项，域名所属实例id</p>
     * @param InstanceID <p>必填项，域名所属实例id</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>是否开启HTTP强制跳转到HTTPS。0：不强制跳转1：开启强制跳转</p> 
     * @return HttpsRewrite <p>是否开启HTTP强制跳转到HTTPS。0：不强制跳转1：开启强制跳转</p>
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set <p>是否开启HTTP强制跳转到HTTPS。0：不强制跳转1：开启强制跳转</p>
     * @param HttpsRewrite <p>是否开启HTTP强制跳转到HTTPS。0：不强制跳转1：开启强制跳转</p>
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get <p>是否开启HTTP2，需要开启HTTPS协议支持。0：关闭1：开启</p> 
     * @return IsHttp2 <p>是否开启HTTP2，需要开启HTTPS协议支持。0：关闭1：开启</p>
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set <p>是否开启HTTP2，需要开启HTTPS协议支持。0：关闭1：开启</p>
     * @param IsHttp2 <p>是否开启HTTP2，需要开启HTTPS协议支持。0：关闭1：开启</p>
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get <p>是否开启主动健康检测。0：不开启1：开启</p> 
     * @return ActiveCheck <p>是否开启主动健康检测。0：不开启1：开启</p>
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set <p>是否开启主动健康检测。0：不开启1：开启</p>
     * @param ActiveCheck <p>是否开启主动健康检测。0：不开启1：开启</p>
     */
    public void setActiveCheck(Long ActiveCheck) {
        this.ActiveCheck = ActiveCheck;
    }

    /**
     * Get <p>加密套件模板。0：不支持选择，使用默认模板  1：通用型模板 2：安全型模板3：自定义模板</p> 
     * @return CipherTemplate <p>加密套件模板。0：不支持选择，使用默认模板  1：通用型模板 2：安全型模板3：自定义模板</p>
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set <p>加密套件模板。0：不支持选择，使用默认模板  1：通用型模板 2：安全型模板3：自定义模板</p>
     * @param CipherTemplate <p>加密套件模板。0：不支持选择，使用默认模板  1：通用型模板 2：安全型模板3：自定义模板</p>
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get <p>CertType为1时，需要填充此参数，表示自有证书的证书链</p> 
     * @return Cert <p>CertType为1时，需要填充此参数，表示自有证书的证书链</p>
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set <p>CertType为1时，需要填充此参数，表示自有证书的证书链</p>
     * @param Cert <p>CertType为1时，需要填充此参数，表示自有证书的证书链</p>
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get <p>CertType为1时，需要填充此参数，表示自有证书的私钥</p> 
     * @return PrivateKey <p>CertType为1时，需要填充此参数，表示自有证书的私钥</p>
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set <p>CertType为1时，需要填充此参数，表示自有证书的私钥</p>
     * @param PrivateKey <p>CertType为1时，需要填充此参数，表示自有证书的私钥</p>
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get <p>CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p> 
     * @return SSLId <p>CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set <p>CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
     * @param SSLId <p>CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get <p>Waf的资源ID。</p> 
     * @return ResourceId <p>Waf的资源ID。</p>
     * @deprecated
     */
    @Deprecated
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Waf的资源ID。</p>
     * @param ResourceId <p>Waf的资源ID。</p>
     * @deprecated
     */
    @Deprecated
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>IsCdn为3时，需要填此参数，表示自定义header</p> 
     * @return IpHeaders <p>IsCdn为3时，需要填此参数，表示自定义header</p>
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set <p>IsCdn为3时，需要填此参数，表示自定义header</p>
     * @param IpHeaders <p>IsCdn为3时，需要填此参数，表示自定义header</p>
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get <p>服务配置有HTTPS端口时，HTTPS的回源协议。<br>http：使用http协议回源，和HttpsUpstreamPort配合使用<br>https：使用https协议回源</p> 
     * @return UpstreamScheme <p>服务配置有HTTPS端口时，HTTPS的回源协议。<br>http：使用http协议回源，和HttpsUpstreamPort配合使用<br>https：使用https协议回源</p>
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set <p>服务配置有HTTPS端口时，HTTPS的回源协议。<br>http：使用http协议回源，和HttpsUpstreamPort配合使用<br>https：使用https协议回源</p>
     * @param UpstreamScheme <p>服务配置有HTTPS端口时，HTTPS的回源协议。<br>http：使用http协议回源，和HttpsUpstreamPort配合使用<br>https：使用https协议回源</p>
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get <p>HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段</p> 
     * @return HttpsUpstreamPort <p>HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段</p>
     * @deprecated
     */
    @Deprecated
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set <p>HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段</p>
     * @param HttpsUpstreamPort <p>HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段</p>
     * @deprecated
     */
    @Deprecated
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get <p>是否开启灰度，0表示不开启灰度。</p> 
     * @return IsGray <p>是否开启灰度，0表示不开启灰度。</p>
     * @deprecated
     */
    @Deprecated
    public Long getIsGray() {
        return this.IsGray;
    }

    /**
     * Set <p>是否开启灰度，0表示不开启灰度。</p>
     * @param IsGray <p>是否开启灰度，0表示不开启灰度。</p>
     * @deprecated
     */
    @Deprecated
    public void setIsGray(Long IsGray) {
        this.IsGray = IsGray;
    }

    /**
     * Get <p>灰度的地区</p> 
     * @return GrayAreas <p>灰度的地区</p>
     * @deprecated
     */
    @Deprecated
    public String [] getGrayAreas() {
        return this.GrayAreas;
    }

    /**
     * Set <p>灰度的地区</p>
     * @param GrayAreas <p>灰度的地区</p>
     * @deprecated
     */
    @Deprecated
    public void setGrayAreas(String [] GrayAreas) {
        this.GrayAreas = GrayAreas;
    }

    /**
     * Get <p>域名回源时的回源域名。UpstreamType为1时，需要填充此字段</p> 
     * @return UpstreamDomain <p>域名回源时的回源域名。UpstreamType为1时，需要填充此字段</p>
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set <p>域名回源时的回源域名。UpstreamType为1时，需要填充此字段</p>
     * @param UpstreamDomain <p>域名回源时的回源域名。UpstreamType为1时，需要填充此字段</p>
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get <p>IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段</p> 
     * @return SrcList <p>IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段</p>
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set <p>IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段</p>
     * @param SrcList <p>IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段</p>
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get <p>WAF实例类型。<br>sparta-waf：SAAS型WAF<br>clb-waf：负载均衡型WAF<br>cdn-waf：CDN上的Web防护能力</p> 
     * @return Edition <p>WAF实例类型。<br>sparta-waf：SAAS型WAF<br>clb-waf：负载均衡型WAF<br>cdn-waf：CDN上的Web防护能力</p>
     * @deprecated
     */
    @Deprecated
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>WAF实例类型。<br>sparta-waf：SAAS型WAF<br>clb-waf：负载均衡型WAF<br>cdn-waf：CDN上的Web防护能力</p>
     * @param Edition <p>WAF实例类型。<br>sparta-waf：SAAS型WAF<br>clb-waf：负载均衡型WAF<br>cdn-waf：CDN上的Web防护能力</p>
     * @deprecated
     */
    @Deprecated
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>目前填0即可。anycast IP类型开关： 0 普通IP 1 Anycast IP</p> 
     * @return Anycast <p>目前填0即可。anycast IP类型开关： 0 普通IP 1 Anycast IP</p>
     * @deprecated
     */
    @Deprecated
    public Long getAnycast() {
        return this.Anycast;
    }

    /**
     * Set <p>目前填0即可。anycast IP类型开关： 0 普通IP 1 Anycast IP</p>
     * @param Anycast <p>目前填0即可。anycast IP类型开关： 0 普通IP 1 Anycast IP</p>
     * @deprecated
     */
    @Deprecated
    public void setAnycast(Long Anycast) {
        this.Anycast = Anycast;
    }

    /**
     * Get <p>回源IP列表各IP的权重，和SrcList一一对应。当且仅当UpstreamType为0，并且SrcList有多个IP，并且LoadBalance为2时需要填写，否则填 []</p> 
     * @return Weights <p>回源IP列表各IP的权重，和SrcList一一对应。当且仅当UpstreamType为0，并且SrcList有多个IP，并且LoadBalance为2时需要填写，否则填 []</p>
     */
    public Long [] getWeights() {
        return this.Weights;
    }

    /**
     * Set <p>回源IP列表各IP的权重，和SrcList一一对应。当且仅当UpstreamType为0，并且SrcList有多个IP，并且LoadBalance为2时需要填写，否则填 []</p>
     * @param Weights <p>回源IP列表各IP的权重，和SrcList一一对应。当且仅当UpstreamType为0，并且SrcList有多个IP，并且LoadBalance为2时需要填写，否则填 []</p>
     */
    public void setWeights(Long [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get <p>TLS版本信息</p> 
     * @return TLSVersion <p>TLS版本信息</p>
     */
    public Long getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set <p>TLS版本信息</p>
     * @param TLSVersion <p>TLS版本信息</p>
     */
    public void setTLSVersion(Long TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    /**
     * Get <p>自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。</p> 
     * @return Ciphers <p>自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。</p>
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set <p>自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。</p>
     * @param Ciphers <p>自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。</p>
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get <p>WAF与源站的连接超时，默认10s。</p> 
     * @return ProxyConnectTimeout <p>WAF与源站的连接超时，默认10s。</p>
     */
    public Long getProxyConnectTimeout() {
        return this.ProxyConnectTimeout;
    }

    /**
     * Set <p>WAF与源站的连接超时，默认10s。</p>
     * @param ProxyConnectTimeout <p>WAF与源站的连接超时，默认10s。</p>
     */
    public void setProxyConnectTimeout(Long ProxyConnectTimeout) {
        this.ProxyConnectTimeout = ProxyConnectTimeout;
    }

    /**
     * Get <p>WAF与源站的读超时时间，默认300s。</p> 
     * @return ProxyReadTimeout <p>WAF与源站的读超时时间，默认300s。</p>
     */
    public Long getProxyReadTimeout() {
        return this.ProxyReadTimeout;
    }

    /**
     * Set <p>WAF与源站的读超时时间，默认300s。</p>
     * @param ProxyReadTimeout <p>WAF与源站的读超时时间，默认300s。</p>
     */
    public void setProxyReadTimeout(Long ProxyReadTimeout) {
        this.ProxyReadTimeout = ProxyReadTimeout;
    }

    /**
     * Get <p>WAF与源站的写超时时间，默认300s。</p> 
     * @return ProxySendTimeout <p>WAF与源站的写超时时间，默认300s。</p>
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set <p>WAF与源站的写超时时间，默认300s。</p>
     * @param ProxySendTimeout <p>WAF与源站的写超时时间，默认300s。</p>
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get <p>WAF回源时的SNI类型。<br>0：关闭SNI，不配置client_hello中的server_name<br>1：开启SNI，client_hello中的server_name为防护域名<br>2：开启SNI，SNI为域名回源时的源站域名<br>3：开启SNI，SNI为自定义域名</p> 
     * @return SniType <p>WAF回源时的SNI类型。<br>0：关闭SNI，不配置client_hello中的server_name<br>1：开启SNI，client_hello中的server_name为防护域名<br>2：开启SNI，SNI为域名回源时的源站域名<br>3：开启SNI，SNI为自定义域名</p>
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set <p>WAF回源时的SNI类型。<br>0：关闭SNI，不配置client_hello中的server_name<br>1：开启SNI，client_hello中的server_name为防护域名<br>2：开启SNI，SNI为域名回源时的源站域名<br>3：开启SNI，SNI为自定义域名</p>
     * @param SniType <p>WAF回源时的SNI类型。<br>0：关闭SNI，不配置client_hello中的server_name<br>1：开启SNI，client_hello中的server_name为防护域名<br>2：开启SNI，SNI为域名回源时的源站域名<br>3：开启SNI，SNI为自定义域名</p>
     */
    public void setSniType(Long SniType) {
        this.SniType = SniType;
    }

    /**
     * Get <p>SniType为3时，需要填此参数，表示自定义的SNI；</p> 
     * @return SniHost <p>SniType为3时，需要填此参数，表示自定义的SNI；</p>
     */
    public String getSniHost() {
        return this.SniHost;
    }

    /**
     * Set <p>SniType为3时，需要填此参数，表示自定义的SNI；</p>
     * @param SniHost <p>SniType为3时，需要填此参数，表示自定义的SNI；</p>
     */
    public void setSniHost(String SniHost) {
        this.SniHost = SniHost;
    }

    /**
     * Get <p>是否开启XFF重置。0：关闭 1：开启</p> 
     * @return XFFReset <p>是否开启XFF重置。0：关闭 1：开启</p>
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set <p>是否开启XFF重置。0：关闭 1：开启</p>
     * @param XFFReset <p>是否开启XFF重置。0：关闭 1：开启</p>
     */
    public void setXFFReset(Long XFFReset) {
        this.XFFReset = XFFReset;
    }

    /**
     * Get <p>域名备注信息</p> 
     * @return Note <p>域名备注信息</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>域名备注信息</p>
     * @param Note <p>域名备注信息</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。</p> 
     * @return UpstreamHost <p>自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。</p>
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set <p>自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。</p>
     * @param UpstreamHost <p>自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。</p>
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get <p>是否开启缓存。 0：关闭 1：开启</p> 
     * @return ProxyBuffer <p>是否开启缓存。 0：关闭 1：开启</p>
     */
    public Long getProxyBuffer() {
        return this.ProxyBuffer;
    }

    /**
     * Set <p>是否开启缓存。 0：关闭 1：开启</p>
     * @param ProxyBuffer <p>是否开启缓存。 0：关闭 1：开启</p>
     */
    public void setProxyBuffer(Long ProxyBuffer) {
        this.ProxyBuffer = ProxyBuffer;
    }

    /**
     * Get <p>是否开启拨测。 0: 禁用拨测  1: 启用拨测。默认启用拨测</p> 
     * @return ProbeStatus <p>是否开启拨测。 0: 禁用拨测  1: 启用拨测。默认启用拨测</p>
     */
    public Long getProbeStatus() {
        return this.ProbeStatus;
    }

    /**
     * Set <p>是否开启拨测。 0: 禁用拨测  1: 启用拨测。默认启用拨测</p>
     * @param ProbeStatus <p>是否开启拨测。 0: 禁用拨测  1: 启用拨测。默认启用拨测</p>
     */
    public void setProbeStatus(Long ProbeStatus) {
        this.ProbeStatus = ProbeStatus;
    }

    /**
     * Get <p>国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问</p> 
     * @return GmType <p>国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问</p>
     */
    public Long getGmType() {
        return this.GmType;
    }

    /**
     * Set <p>国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问</p>
     * @param GmType <p>国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问</p>
     */
    public void setGmType(Long GmType) {
        this.GmType = GmType;
    }

    /**
     * Get <p>国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书</p> 
     * @return GmCertType <p>国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书</p>
     */
    public Long getGmCertType() {
        return this.GmCertType;
    }

    /**
     * Set <p>国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书</p>
     * @param GmCertType <p>国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书</p>
     */
    public void setGmCertType(Long GmCertType) {
        this.GmCertType = GmCertType;
    }

    /**
     * Get <p>GmCertType为1时，需要填充此参数，表示自有国密证书的证书链</p> 
     * @return GmCert <p>GmCertType为1时，需要填充此参数，表示自有国密证书的证书链</p>
     */
    public String getGmCert() {
        return this.GmCert;
    }

    /**
     * Set <p>GmCertType为1时，需要填充此参数，表示自有国密证书的证书链</p>
     * @param GmCert <p>GmCertType为1时，需要填充此参数，表示自有国密证书的证书链</p>
     */
    public void setGmCert(String GmCert) {
        this.GmCert = GmCert;
    }

    /**
     * Get <p>GmCertType为1时，需要填充此参数，表示自有国密证书的私钥</p> 
     * @return GmPrivateKey <p>GmCertType为1时，需要填充此参数，表示自有国密证书的私钥</p>
     */
    public String getGmPrivateKey() {
        return this.GmPrivateKey;
    }

    /**
     * Set <p>GmCertType为1时，需要填充此参数，表示自有国密证书的私钥</p>
     * @param GmPrivateKey <p>GmCertType为1时，需要填充此参数，表示自有国密证书的私钥</p>
     */
    public void setGmPrivateKey(String GmPrivateKey) {
        this.GmPrivateKey = GmPrivateKey;
    }

    /**
     * Get <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书</p> 
     * @return GmEncCert <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书</p>
     */
    public String getGmEncCert() {
        return this.GmEncCert;
    }

    /**
     * Set <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书</p>
     * @param GmEncCert <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书</p>
     */
    public void setGmEncCert(String GmEncCert) {
        this.GmEncCert = GmEncCert;
    }

    /**
     * Get <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥</p> 
     * @return GmEncPrivateKey <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥</p>
     */
    public String getGmEncPrivateKey() {
        return this.GmEncPrivateKey;
    }

    /**
     * Set <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥</p>
     * @param GmEncPrivateKey <p>GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥</p>
     */
    public void setGmEncPrivateKey(String GmEncPrivateKey) {
        this.GmEncPrivateKey = GmEncPrivateKey;
    }

    /**
     * Get <p>GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p> 
     * @return GmSSLId <p>GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
     */
    public String getGmSSLId() {
        return this.GmSSLId;
    }

    /**
     * Set <p>GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
     * @param GmSSLId <p>GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id</p>
     */
    public void setGmSSLId(String GmSSLId) {
        this.GmSSLId = GmSSLId;
    }

    /**
     * Get <p>回源策略，支持负载均衡回源和分流回源两种方式。0：默认值，负载均衡回源；1：分流回源</p> 
     * @return UpstreamPolicy <p>回源策略，支持负载均衡回源和分流回源两种方式。0：默认值，负载均衡回源；1：分流回源</p>
     */
    public Long getUpstreamPolicy() {
        return this.UpstreamPolicy;
    }

    /**
     * Set <p>回源策略，支持负载均衡回源和分流回源两种方式。0：默认值，负载均衡回源；1：分流回源</p>
     * @param UpstreamPolicy <p>回源策略，支持负载均衡回源和分流回源两种方式。0：默认值，负载均衡回源；1：分流回源</p>
     */
    public void setUpstreamPolicy(Long UpstreamPolicy) {
        this.UpstreamPolicy = UpstreamPolicy;
    }

    /**
     * Get <p>分流回源时生效，分流回源的规则。</p> 
     * @return UpstreamRules <p>分流回源时生效，分流回源的规则。</p>
     */
    public UpstreamRule [] getUpstreamRules() {
        return this.UpstreamRules;
    }

    /**
     * Set <p>分流回源时生效，分流回源的规则。</p>
     * @param UpstreamRules <p>分流回源时生效，分流回源的规则。</p>
     */
    public void setUpstreamRules(UpstreamRule [] UpstreamRules) {
        this.UpstreamRules = UpstreamRules;
    }

    /**
     * Get <p>业务场景。0：默认值，表示常规业务场景 1：大模型业务场景</p> 
     * @return UseCase <p>业务场景。0：默认值，表示常规业务场景 1：大模型业务场景</p>
     */
    public Long getUseCase() {
        return this.UseCase;
    }

    /**
     * Set <p>业务场景。0：默认值，表示常规业务场景 1：大模型业务场景</p>
     * @param UseCase <p>业务场景。0：默认值，表示常规业务场景 1：大模型业务场景</p>
     */
    public void setUseCase(Long UseCase) {
        this.UseCase = UseCase;
    }

    /**
     * Get <p>gzip开关。0：关闭 1：默认值，打开。</p> 
     * @return Gzip <p>gzip开关。0：关闭 1：默认值，打开。</p>
     */
    public Long getGzip() {
        return this.Gzip;
    }

    /**
     * Set <p>gzip开关。0：关闭 1：默认值，打开。</p>
     * @param Gzip <p>gzip开关。0：关闭 1：默认值，打开。</p>
     */
    public void setGzip(Long Gzip) {
        this.Gzip = Gzip;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public AddSpartaProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSpartaProtectionRequest(AddSpartaProtectionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new Long(source.UpstreamType);
        }
        if (source.IsWebsocket != null) {
            this.IsWebsocket = new Long(source.IsWebsocket);
        }
        if (source.LoadBalance != null) {
            this.LoadBalance = new String(source.LoadBalance);
        }
        if (source.Ports != null) {
            this.Ports = new PortItem[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortItem(source.Ports[i]);
            }
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new String(source.IsKeepAlive);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new Long(source.HttpsRewrite);
        }
        if (source.IsHttp2 != null) {
            this.IsHttp2 = new Long(source.IsHttp2);
        }
        if (source.ActiveCheck != null) {
            this.ActiveCheck = new Long(source.ActiveCheck);
        }
        if (source.CipherTemplate != null) {
            this.CipherTemplate = new Long(source.CipherTemplate);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.IsGray != null) {
            this.IsGray = new Long(source.IsGray);
        }
        if (source.GrayAreas != null) {
            this.GrayAreas = new String[source.GrayAreas.length];
            for (int i = 0; i < source.GrayAreas.length; i++) {
                this.GrayAreas[i] = new String(source.GrayAreas[i]);
            }
        }
        if (source.UpstreamDomain != null) {
            this.UpstreamDomain = new String(source.UpstreamDomain);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Anycast != null) {
            this.Anycast = new Long(source.Anycast);
        }
        if (source.Weights != null) {
            this.Weights = new Long[source.Weights.length];
            for (int i = 0; i < source.Weights.length; i++) {
                this.Weights[i] = new Long(source.Weights[i]);
            }
        }
        if (source.TLSVersion != null) {
            this.TLSVersion = new Long(source.TLSVersion);
        }
        if (source.Ciphers != null) {
            this.Ciphers = new Long[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new Long(source.Ciphers[i]);
            }
        }
        if (source.ProxyConnectTimeout != null) {
            this.ProxyConnectTimeout = new Long(source.ProxyConnectTimeout);
        }
        if (source.ProxyReadTimeout != null) {
            this.ProxyReadTimeout = new Long(source.ProxyReadTimeout);
        }
        if (source.ProxySendTimeout != null) {
            this.ProxySendTimeout = new Long(source.ProxySendTimeout);
        }
        if (source.SniType != null) {
            this.SniType = new Long(source.SniType);
        }
        if (source.SniHost != null) {
            this.SniHost = new String(source.SniHost);
        }
        if (source.XFFReset != null) {
            this.XFFReset = new Long(source.XFFReset);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.UpstreamHost != null) {
            this.UpstreamHost = new String(source.UpstreamHost);
        }
        if (source.ProxyBuffer != null) {
            this.ProxyBuffer = new Long(source.ProxyBuffer);
        }
        if (source.ProbeStatus != null) {
            this.ProbeStatus = new Long(source.ProbeStatus);
        }
        if (source.GmType != null) {
            this.GmType = new Long(source.GmType);
        }
        if (source.GmCertType != null) {
            this.GmCertType = new Long(source.GmCertType);
        }
        if (source.GmCert != null) {
            this.GmCert = new String(source.GmCert);
        }
        if (source.GmPrivateKey != null) {
            this.GmPrivateKey = new String(source.GmPrivateKey);
        }
        if (source.GmEncCert != null) {
            this.GmEncCert = new String(source.GmEncCert);
        }
        if (source.GmEncPrivateKey != null) {
            this.GmEncPrivateKey = new String(source.GmEncPrivateKey);
        }
        if (source.GmSSLId != null) {
            this.GmSSLId = new String(source.GmSSLId);
        }
        if (source.UpstreamPolicy != null) {
            this.UpstreamPolicy = new Long(source.UpstreamPolicy);
        }
        if (source.UpstreamRules != null) {
            this.UpstreamRules = new UpstreamRule[source.UpstreamRules.length];
            for (int i = 0; i < source.UpstreamRules.length; i++) {
                this.UpstreamRules[i] = new UpstreamRule(source.UpstreamRules[i]);
            }
        }
        if (source.UseCase != null) {
            this.UseCase = new Long(source.UseCase);
        }
        if (source.Gzip != null) {
            this.Gzip = new Long(source.Gzip);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "ActiveCheck", this.ActiveCheck);
        this.setParamSimple(map, prefix + "CipherTemplate", this.CipherTemplate);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamArraySimple(map, prefix + "GrayAreas.", this.GrayAreas);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Anycast", this.Anycast);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "ProxyConnectTimeout", this.ProxyConnectTimeout);
        this.setParamSimple(map, prefix + "ProxyReadTimeout", this.ProxyReadTimeout);
        this.setParamSimple(map, prefix + "ProxySendTimeout", this.ProxySendTimeout);
        this.setParamSimple(map, prefix + "SniType", this.SniType);
        this.setParamSimple(map, prefix + "SniHost", this.SniHost);
        this.setParamSimple(map, prefix + "XFFReset", this.XFFReset);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamSimple(map, prefix + "ProxyBuffer", this.ProxyBuffer);
        this.setParamSimple(map, prefix + "ProbeStatus", this.ProbeStatus);
        this.setParamSimple(map, prefix + "GmType", this.GmType);
        this.setParamSimple(map, prefix + "GmCertType", this.GmCertType);
        this.setParamSimple(map, prefix + "GmCert", this.GmCert);
        this.setParamSimple(map, prefix + "GmPrivateKey", this.GmPrivateKey);
        this.setParamSimple(map, prefix + "GmEncCert", this.GmEncCert);
        this.setParamSimple(map, prefix + "GmEncPrivateKey", this.GmEncPrivateKey);
        this.setParamSimple(map, prefix + "GmSSLId", this.GmSSLId);
        this.setParamSimple(map, prefix + "UpstreamPolicy", this.UpstreamPolicy);
        this.setParamArrayObj(map, prefix + "UpstreamRules.", this.UpstreamRules);
        this.setParamSimple(map, prefix + "UseCase", this.UseCase);
        this.setParamSimple(map, prefix + "Gzip", this.Gzip);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

