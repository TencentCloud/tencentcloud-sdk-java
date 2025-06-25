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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainsPartInfo extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名唯一ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 域名所属实例唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 域名所属实例类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 域名所属实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 证书
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * 是否开启HTTP强制跳转到HTTPS。
0：不强制跳转
1：开启强制跳转
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * HTTPS回源端口
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * waf前是否部署有七层代理服务。
0：没有部署代理服务
1：有部署代理服务，waf将使用XFF获取客户端IP
2：有部署代理服务，waf将使用remote_addr获取客户端IP
3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 是否开启灰度。
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * 是否开启HTTP2，需要开启HTTPS协议支持。
0：关闭
1：开启
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * 是否开启WebSocket支持。
0：关闭
1：开启
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * 回源负载均衡策略。
0：轮询
1：IP hash
2：加权轮询
    */
    @SerializedName("LoadBalance")
    @Expose
    private Long LoadBalance;

    /**
    * 防护模式。
0：观察模式
1：拦截模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 自有证书的私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * 域名回源时的回源域名。UpstreamType为1时，需要填充此字段
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * 回源类型。
0：通过IP回源
1：通过域名回源
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * 域名端口配置
    */
    @SerializedName("Ports")
    @Expose
    private PortInfo [] Ports;

    /**
    * 证书类型。
0：仅配置HTTP监听端口，没有证书
1：证书来源为自有证书
2：证书来源为托管证书
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 服务配置有HTTPS端口时，HTTPS的回源协议。
http：使用http协议回源，和HttpsUpstreamPort配合使用
https：使用https协议回源
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * 日志包是否开启。
0：关闭
1：开启
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * 接入Cname，SaaS型域名使用此Cname进行接入
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 是否开启长连接。
0： 短连接
1： 长连接
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private Long IsKeepAlive;

    /**
    * 是否开启主动健康检测。
0：不开启
1：开启
    */
    @SerializedName("ActiveCheck")
    @Expose
    private Long ActiveCheck;

    /**
    * TLS版本信息
    */
    @SerializedName("TLSVersion")
    @Expose
    private Long TLSVersion;

    /**
    * 自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * 加密套件模板。
0：不支持选择，使用默认模板  
1：通用型模板 
2：安全型模板
3：自定义模板
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * WAF与源站的读超时时间，默认300s。
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * WAF与源站的写超时时间，默认300s。
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * WAF回源时的SNI类型。
0：关闭SNI，不配置client_hello中的server_name
1：开启SNI，client_hello中的server_name为防护域名
2：开启SNI，SNI为域名回源时的源站域名
3：开启SNI，SNI为自定义域名
    */
    @SerializedName("SniType")
    @Expose
    private Long SniType;

    /**
    * SniType为3时，需要填此参数，表示自定义的SNI；
    */
    @SerializedName("SniHost")
    @Expose
    private String SniHost;

    /**
    * 回源IP权重
    */
    @SerializedName("Weights")
    @Expose
    private String [] Weights;

    /**
    * IsCdn=3时，表示自定义header
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * 是否开启XFF重置。
0：关闭
1：开启
    */
    @SerializedName("XFFReset")
    @Expose
    private Long XFFReset;

    /**
    * 域名备注信息
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。
    */
    @SerializedName("UpstreamHost")
    @Expose
    private String UpstreamHost;

    /**
    * 防护规则
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 是否开启缓存 0-关闭 1-开启
    */
    @SerializedName("ProxyBuffer")
    @Expose
    private Long ProxyBuffer;

    /**
    * 国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问
    */
    @SerializedName("GmType")
    @Expose
    private Long GmType;

    /**
    * 国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
    */
    @SerializedName("GmCertType")
    @Expose
    private Long GmCertType;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
    */
    @SerializedName("GmCert")
    @Expose
    private String GmCert;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
    */
    @SerializedName("GmPrivateKey")
    @Expose
    private String GmPrivateKey;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
    */
    @SerializedName("GmEncCert")
    @Expose
    private String GmEncCert;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
    */
    @SerializedName("GmEncPrivateKey")
    @Expose
    private String GmEncPrivateKey;

    /**
    * GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
    */
    @SerializedName("GmSSLId")
    @Expose
    private String GmSSLId;

    /**
    * 域名标签
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 拨测状态。 0: 禁用拨测, 1: 启用拨测
    */
    @SerializedName("ProbeStatus")
    @Expose
    private Long ProbeStatus;

    /**
    * 回源策略。
0：负载均衡回源
1：分流回源
    */
    @SerializedName("UpstreamPolicy")
    @Expose
    private Long UpstreamPolicy;

    /**
    * 分流回源策略
    */
    @SerializedName("UpstreamRules")
    @Expose
    private UpstreamRule [] UpstreamRules;

    /**
    * 业务场景。0：默认值，表示常规业务场景 1：大模型业务场景
    */
    @SerializedName("UseCase")
    @Expose
    private Long UseCase;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名唯一ID 
     * @return DomainId 域名唯一ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名唯一ID
     * @param DomainId 域名唯一ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名所属实例唯一ID 
     * @return InstanceId 域名所属实例唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 域名所属实例唯一ID
     * @param InstanceId 域名所属实例唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 域名所属实例类型 
     * @return Edition 域名所属实例类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 域名所属实例类型
     * @param Edition 域名所属实例类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 域名所属实例名 
     * @return InstanceName 域名所属实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 域名所属实例名
     * @param InstanceName 域名所属实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 证书 
     * @return Cert 证书
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书
     * @param Cert 证书
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式 
     * @return Engine 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     * @param Engine 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 是否开启HTTP强制跳转到HTTPS。
0：不强制跳转
1：开启强制跳转 
     * @return HttpsRewrite 是否开启HTTP强制跳转到HTTPS。
0：不强制跳转
1：开启强制跳转
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set 是否开启HTTP强制跳转到HTTPS。
0：不强制跳转
1：开启强制跳转
     * @param HttpsRewrite 是否开启HTTP强制跳转到HTTPS。
0：不强制跳转
1：开启强制跳转
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get HTTPS回源端口 
     * @return HttpsUpstreamPort HTTPS回源端口
     */
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set HTTPS回源端口
     * @param HttpsUpstreamPort HTTPS回源端口
     */
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get waf前是否部署有七层代理服务。
0：没有部署代理服务
1：有部署代理服务，waf将使用XFF获取客户端IP
2：有部署代理服务，waf将使用remote_addr获取客户端IP
3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP 
     * @return IsCdn waf前是否部署有七层代理服务。
0：没有部署代理服务
1：有部署代理服务，waf将使用XFF获取客户端IP
2：有部署代理服务，waf将使用remote_addr获取客户端IP
3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set waf前是否部署有七层代理服务。
0：没有部署代理服务
1：有部署代理服务，waf将使用XFF获取客户端IP
2：有部署代理服务，waf将使用remote_addr获取客户端IP
3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     * @param IsCdn waf前是否部署有七层代理服务。
0：没有部署代理服务
1：有部署代理服务，waf将使用XFF获取客户端IP
2：有部署代理服务，waf将使用remote_addr获取客户端IP
3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 是否开启灰度。 
     * @return IsGray 是否开启灰度。
     * @deprecated
     */
    @Deprecated
    public Long getIsGray() {
        return this.IsGray;
    }

    /**
     * Set 是否开启灰度。
     * @param IsGray 是否开启灰度。
     * @deprecated
     */
    @Deprecated
    public void setIsGray(Long IsGray) {
        this.IsGray = IsGray;
    }

    /**
     * Get 是否开启HTTP2，需要开启HTTPS协议支持。
0：关闭
1：开启 
     * @return IsHttp2 是否开启HTTP2，需要开启HTTPS协议支持。
0：关闭
1：开启
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set 是否开启HTTP2，需要开启HTTPS协议支持。
0：关闭
1：开启
     * @param IsHttp2 是否开启HTTP2，需要开启HTTPS协议支持。
0：关闭
1：开启
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get 是否开启WebSocket支持。
0：关闭
1：开启 
     * @return IsWebsocket 是否开启WebSocket支持。
0：关闭
1：开启
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set 是否开启WebSocket支持。
0：关闭
1：开启
     * @param IsWebsocket 是否开启WebSocket支持。
0：关闭
1：开启
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get 回源负载均衡策略。
0：轮询
1：IP hash
2：加权轮询 
     * @return LoadBalance 回源负载均衡策略。
0：轮询
1：IP hash
2：加权轮询
     */
    public Long getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set 回源负载均衡策略。
0：轮询
1：IP hash
2：加权轮询
     * @param LoadBalance 回源负载均衡策略。
0：轮询
1：IP hash
2：加权轮询
     */
    public void setLoadBalance(Long LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get 防护模式。
0：观察模式
1：拦截模式 
     * @return Mode 防护模式。
0：观察模式
1：拦截模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 防护模式。
0：观察模式
1：拦截模式
     * @param Mode 防护模式。
0：观察模式
1：拦截模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 自有证书的私钥 
     * @return PrivateKey 自有证书的私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 自有证书的私钥
     * @param PrivateKey 自有证书的私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id 
     * @return SSLId CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     * @param SSLId CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get 域名回源时的回源域名。UpstreamType为1时，需要填充此字段 
     * @return UpstreamDomain 域名回源时的回源域名。UpstreamType为1时，需要填充此字段
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set 域名回源时的回源域名。UpstreamType为1时，需要填充此字段
     * @param UpstreamDomain 域名回源时的回源域名。UpstreamType为1时，需要填充此字段
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get 回源类型。
0：通过IP回源
1：通过域名回源 
     * @return UpstreamType 回源类型。
0：通过IP回源
1：通过域名回源
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 回源类型。
0：通过IP回源
1：通过域名回源
     * @param UpstreamType 回源类型。
0：通过IP回源
1：通过域名回源
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段 
     * @return SrcList IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段
     * @param SrcList IP回源时的回源IP列表。UpstreamType为0时，需要填充此字段
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get 域名端口配置 
     * @return Ports 域名端口配置
     */
    public PortInfo [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 域名端口配置
     * @param Ports 域名端口配置
     */
    public void setPorts(PortInfo [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 证书类型。
0：仅配置HTTP监听端口，没有证书
1：证书来源为自有证书
2：证书来源为托管证书 
     * @return CertType 证书类型。
0：仅配置HTTP监听端口，没有证书
1：证书来源为自有证书
2：证书来源为托管证书
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型。
0：仅配置HTTP监听端口，没有证书
1：证书来源为自有证书
2：证书来源为托管证书
     * @param CertType 证书类型。
0：仅配置HTTP监听端口，没有证书
1：证书来源为自有证书
2：证书来源为托管证书
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 服务配置有HTTPS端口时，HTTPS的回源协议。
http：使用http协议回源，和HttpsUpstreamPort配合使用
https：使用https协议回源 
     * @return UpstreamScheme 服务配置有HTTPS端口时，HTTPS的回源协议。
http：使用http协议回源，和HttpsUpstreamPort配合使用
https：使用https协议回源
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set 服务配置有HTTPS端口时，HTTPS的回源协议。
http：使用http协议回源，和HttpsUpstreamPort配合使用
https：使用https协议回源
     * @param UpstreamScheme 服务配置有HTTPS端口时，HTTPS的回源协议。
http：使用http协议回源，和HttpsUpstreamPort配合使用
https：使用https协议回源
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get 日志包是否开启。
0：关闭
1：开启 
     * @return Cls 日志包是否开启。
0：关闭
1：开启
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set 日志包是否开启。
0：关闭
1：开启
     * @param Cls 日志包是否开启。
0：关闭
1：开启
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get 接入Cname，SaaS型域名使用此Cname进行接入 
     * @return Cname 接入Cname，SaaS型域名使用此Cname进行接入
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 接入Cname，SaaS型域名使用此Cname进行接入
     * @param Cname 接入Cname，SaaS型域名使用此Cname进行接入
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 是否开启长连接。
0： 短连接
1： 长连接 
     * @return IsKeepAlive 是否开启长连接。
0： 短连接
1： 长连接
     */
    public Long getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set 是否开启长连接。
0： 短连接
1： 长连接
     * @param IsKeepAlive 是否开启长连接。
0： 短连接
1： 长连接
     */
    public void setIsKeepAlive(Long IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get 是否开启主动健康检测。
0：不开启
1：开启 
     * @return ActiveCheck 是否开启主动健康检测。
0：不开启
1：开启
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set 是否开启主动健康检测。
0：不开启
1：开启
     * @param ActiveCheck 是否开启主动健康检测。
0：不开启
1：开启
     */
    public void setActiveCheck(Long ActiveCheck) {
        this.ActiveCheck = ActiveCheck;
    }

    /**
     * Get TLS版本信息 
     * @return TLSVersion TLS版本信息
     */
    public Long getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set TLS版本信息
     * @param TLSVersion TLS版本信息
     */
    public void setTLSVersion(Long TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    /**
     * Get 自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。 
     * @return Ciphers 自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set 自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。
     * @param Ciphers 自定义的加密套件列表。CipherTemplate为3时需要填此字段，表示自定义的加密套件，值通过DescribeCiphersDetail接口获取。
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get 加密套件模板。
0：不支持选择，使用默认模板  
1：通用型模板 
2：安全型模板
3：自定义模板 
     * @return CipherTemplate 加密套件模板。
0：不支持选择，使用默认模板  
1：通用型模板 
2：安全型模板
3：自定义模板
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set 加密套件模板。
0：不支持选择，使用默认模板  
1：通用型模板 
2：安全型模板
3：自定义模板
     * @param CipherTemplate 加密套件模板。
0：不支持选择，使用默认模板  
1：通用型模板 
2：安全型模板
3：自定义模板
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get WAF与源站的读超时时间，默认300s。 
     * @return ProxyReadTimeout WAF与源站的读超时时间，默认300s。
     */
    public Long getProxyReadTimeout() {
        return this.ProxyReadTimeout;
    }

    /**
     * Set WAF与源站的读超时时间，默认300s。
     * @param ProxyReadTimeout WAF与源站的读超时时间，默认300s。
     */
    public void setProxyReadTimeout(Long ProxyReadTimeout) {
        this.ProxyReadTimeout = ProxyReadTimeout;
    }

    /**
     * Get WAF与源站的写超时时间，默认300s。 
     * @return ProxySendTimeout WAF与源站的写超时时间，默认300s。
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set WAF与源站的写超时时间，默认300s。
     * @param ProxySendTimeout WAF与源站的写超时时间，默认300s。
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get WAF回源时的SNI类型。
0：关闭SNI，不配置client_hello中的server_name
1：开启SNI，client_hello中的server_name为防护域名
2：开启SNI，SNI为域名回源时的源站域名
3：开启SNI，SNI为自定义域名 
     * @return SniType WAF回源时的SNI类型。
0：关闭SNI，不配置client_hello中的server_name
1：开启SNI，client_hello中的server_name为防护域名
2：开启SNI，SNI为域名回源时的源站域名
3：开启SNI，SNI为自定义域名
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set WAF回源时的SNI类型。
0：关闭SNI，不配置client_hello中的server_name
1：开启SNI，client_hello中的server_name为防护域名
2：开启SNI，SNI为域名回源时的源站域名
3：开启SNI，SNI为自定义域名
     * @param SniType WAF回源时的SNI类型。
0：关闭SNI，不配置client_hello中的server_name
1：开启SNI，client_hello中的server_name为防护域名
2：开启SNI，SNI为域名回源时的源站域名
3：开启SNI，SNI为自定义域名
     */
    public void setSniType(Long SniType) {
        this.SniType = SniType;
    }

    /**
     * Get SniType为3时，需要填此参数，表示自定义的SNI； 
     * @return SniHost SniType为3时，需要填此参数，表示自定义的SNI；
     */
    public String getSniHost() {
        return this.SniHost;
    }

    /**
     * Set SniType为3时，需要填此参数，表示自定义的SNI；
     * @param SniHost SniType为3时，需要填此参数，表示自定义的SNI；
     */
    public void setSniHost(String SniHost) {
        this.SniHost = SniHost;
    }

    /**
     * Get 回源IP权重 
     * @return Weights 回源IP权重
     */
    public String [] getWeights() {
        return this.Weights;
    }

    /**
     * Set 回源IP权重
     * @param Weights 回源IP权重
     */
    public void setWeights(String [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get IsCdn=3时，表示自定义header 
     * @return IpHeaders IsCdn=3时，表示自定义header
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，表示自定义header
     * @param IpHeaders IsCdn=3时，表示自定义header
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get 是否开启XFF重置。
0：关闭
1：开启 
     * @return XFFReset 是否开启XFF重置。
0：关闭
1：开启
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set 是否开启XFF重置。
0：关闭
1：开启
     * @param XFFReset 是否开启XFF重置。
0：关闭
1：开启
     */
    public void setXFFReset(Long XFFReset) {
        this.XFFReset = XFFReset;
    }

    /**
     * Get 域名备注信息 
     * @return Note 域名备注信息
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 域名备注信息
     * @param Note 域名备注信息
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。 
     * @return UpstreamHost 自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。
     */
    public String getUpstreamHost() {
        return this.UpstreamHost;
    }

    /**
     * Set 自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。
     * @param UpstreamHost 自定义回源Host。默认为空字符串，表示使用防护域名作为回源Host。
     */
    public void setUpstreamHost(String UpstreamHost) {
        this.UpstreamHost = UpstreamHost;
    }

    /**
     * Get 防护规则 
     * @return Level 防护规则
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 防护规则
     * @param Level 防护规则
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 是否开启缓存 0-关闭 1-开启 
     * @return ProxyBuffer 是否开启缓存 0-关闭 1-开启
     */
    public Long getProxyBuffer() {
        return this.ProxyBuffer;
    }

    /**
     * Set 是否开启缓存 0-关闭 1-开启
     * @param ProxyBuffer 是否开启缓存 0-关闭 1-开启
     */
    public void setProxyBuffer(Long ProxyBuffer) {
        this.ProxyBuffer = ProxyBuffer;
    }

    /**
     * Get 国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问 
     * @return GmType 国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问
     */
    public Long getGmType() {
        return this.GmType;
    }

    /**
     * Set 国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问
     * @param GmType 国密选项。0：不开启国密 1：在原有TLS选项的基础上追加支持国密 2：开启国密并仅支持国密客户端访问
     */
    public void setGmType(Long GmType) {
        this.GmType = GmType;
    }

    /**
     * Get 国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书 
     * @return GmCertType 国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
     */
    public Long getGmCertType() {
        return this.GmCertType;
    }

    /**
     * Set 国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
     * @param GmCertType 国密证书类型。0：无国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
     */
    public void setGmCertType(Long GmCertType) {
        this.GmCertType = GmCertType;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的证书链 
     * @return GmCert GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
     */
    public String getGmCert() {
        return this.GmCert;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
     * @param GmCert GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
     */
    public void setGmCert(String GmCert) {
        this.GmCert = GmCert;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的私钥 
     * @return GmPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
     */
    public String getGmPrivateKey() {
        return this.GmPrivateKey;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
     * @param GmPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
     */
    public void setGmPrivateKey(String GmPrivateKey) {
        this.GmPrivateKey = GmPrivateKey;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书 
     * @return GmEncCert GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
     */
    public String getGmEncCert() {
        return this.GmEncCert;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
     * @param GmEncCert GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
     */
    public void setGmEncCert(String GmEncCert) {
        this.GmEncCert = GmEncCert;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥 
     * @return GmEncPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
     */
    public String getGmEncPrivateKey() {
        return this.GmEncPrivateKey;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
     * @param GmEncPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
     */
    public void setGmEncPrivateKey(String GmEncPrivateKey) {
        this.GmEncPrivateKey = GmEncPrivateKey;
    }

    /**
     * Get GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id 
     * @return GmSSLId GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public String getGmSSLId() {
        return this.GmSSLId;
    }

    /**
     * Set GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     * @param GmSSLId GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public void setGmSSLId(String GmSSLId) {
        this.GmSSLId = GmSSLId;
    }

    /**
     * Get 域名标签 
     * @return Labels 域名标签
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 域名标签
     * @param Labels 域名标签
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 拨测状态。 0: 禁用拨测, 1: 启用拨测 
     * @return ProbeStatus 拨测状态。 0: 禁用拨测, 1: 启用拨测
     */
    public Long getProbeStatus() {
        return this.ProbeStatus;
    }

    /**
     * Set 拨测状态。 0: 禁用拨测, 1: 启用拨测
     * @param ProbeStatus 拨测状态。 0: 禁用拨测, 1: 启用拨测
     */
    public void setProbeStatus(Long ProbeStatus) {
        this.ProbeStatus = ProbeStatus;
    }

    /**
     * Get 回源策略。
0：负载均衡回源
1：分流回源 
     * @return UpstreamPolicy 回源策略。
0：负载均衡回源
1：分流回源
     */
    public Long getUpstreamPolicy() {
        return this.UpstreamPolicy;
    }

    /**
     * Set 回源策略。
0：负载均衡回源
1：分流回源
     * @param UpstreamPolicy 回源策略。
0：负载均衡回源
1：分流回源
     */
    public void setUpstreamPolicy(Long UpstreamPolicy) {
        this.UpstreamPolicy = UpstreamPolicy;
    }

    /**
     * Get 分流回源策略 
     * @return UpstreamRules 分流回源策略
     */
    public UpstreamRule [] getUpstreamRules() {
        return this.UpstreamRules;
    }

    /**
     * Set 分流回源策略
     * @param UpstreamRules 分流回源策略
     */
    public void setUpstreamRules(UpstreamRule [] UpstreamRules) {
        this.UpstreamRules = UpstreamRules;
    }

    /**
     * Get 业务场景。0：默认值，表示常规业务场景 1：大模型业务场景 
     * @return UseCase 业务场景。0：默认值，表示常规业务场景 1：大模型业务场景
     */
    public Long getUseCase() {
        return this.UseCase;
    }

    /**
     * Set 业务场景。0：默认值，表示常规业务场景 1：大模型业务场景
     * @param UseCase 业务场景。0：默认值，表示常规业务场景 1：大模型业务场景
     */
    public void setUseCase(Long UseCase) {
        this.UseCase = UseCase;
    }

    public DomainsPartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainsPartInfo(DomainsPartInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new Long(source.HttpsRewrite);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.IsGray != null) {
            this.IsGray = new Long(source.IsGray);
        }
        if (source.IsHttp2 != null) {
            this.IsHttp2 = new Long(source.IsHttp2);
        }
        if (source.IsWebsocket != null) {
            this.IsWebsocket = new Long(source.IsWebsocket);
        }
        if (source.LoadBalance != null) {
            this.LoadBalance = new Long(source.LoadBalance);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.UpstreamDomain != null) {
            this.UpstreamDomain = new String(source.UpstreamDomain);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new Long(source.UpstreamType);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new PortInfo[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortInfo(source.Ports[i]);
            }
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new Long(source.IsKeepAlive);
        }
        if (source.ActiveCheck != null) {
            this.ActiveCheck = new Long(source.ActiveCheck);
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
        if (source.CipherTemplate != null) {
            this.CipherTemplate = new Long(source.CipherTemplate);
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
        if (source.Weights != null) {
            this.Weights = new String[source.Weights.length];
            for (int i = 0; i < source.Weights.length; i++) {
                this.Weights[i] = new String(source.Weights[i]);
            }
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
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
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.ProxyBuffer != null) {
            this.ProxyBuffer = new Long(source.ProxyBuffer);
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
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.ProbeStatus != null) {
            this.ProbeStatus = new Long(source.ProbeStatus);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "Cls", this.Cls);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "ActiveCheck", this.ActiveCheck);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "CipherTemplate", this.CipherTemplate);
        this.setParamSimple(map, prefix + "ProxyReadTimeout", this.ProxyReadTimeout);
        this.setParamSimple(map, prefix + "ProxySendTimeout", this.ProxySendTimeout);
        this.setParamSimple(map, prefix + "SniType", this.SniType);
        this.setParamSimple(map, prefix + "SniHost", this.SniHost);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "XFFReset", this.XFFReset);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "UpstreamHost", this.UpstreamHost);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ProxyBuffer", this.ProxyBuffer);
        this.setParamSimple(map, prefix + "GmType", this.GmType);
        this.setParamSimple(map, prefix + "GmCertType", this.GmCertType);
        this.setParamSimple(map, prefix + "GmCert", this.GmCert);
        this.setParamSimple(map, prefix + "GmPrivateKey", this.GmPrivateKey);
        this.setParamSimple(map, prefix + "GmEncCert", this.GmEncCert);
        this.setParamSimple(map, prefix + "GmEncPrivateKey", this.GmEncPrivateKey);
        this.setParamSimple(map, prefix + "GmSSLId", this.GmSSLId);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "ProbeStatus", this.ProbeStatus);
        this.setParamSimple(map, prefix + "UpstreamPolicy", this.UpstreamPolicy);
        this.setParamArrayObj(map, prefix + "UpstreamRules.", this.UpstreamRules);
        this.setParamSimple(map, prefix + "UseCase", this.UseCase);

    }
}

