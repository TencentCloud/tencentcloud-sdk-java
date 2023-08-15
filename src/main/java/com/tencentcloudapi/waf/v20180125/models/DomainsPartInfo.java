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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainsPartInfo extends AbstractModel{

    /**
    * 是否开启httpRewrite
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * https回源端口
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * 是否是cdn
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 是否开启gray
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * 是否是http2
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * 是否开启websocket
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * 负载均衡
    */
    @SerializedName("LoadBalance")
    @Expose
    private Long LoadBalance;

    /**
    * 防御模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * ssl id
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * 回源域名
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * 回源类型
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * 回源ip
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * 服务端口配置
    */
    @SerializedName("Ports")
    @Expose
    private PortInfo [] Ports;

    /**
    * 证书类型
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 回源方式
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * 日志包
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * 一级cname
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 是否长连接
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private Long IsKeepAlive;

    /**
    * 是否开启主动健康检测，1表示开启，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveCheck")
    @Expose
    private Long ActiveCheck;

    /**
    * TLS版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TLSVersion")
    @Expose
    private Long TLSVersion;

    /**
    * 加密套件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * 模版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * 300s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * 300s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SniType")
    @Expose
    private Long SniType;

    /**
    * SniType=3时，需要填此参数，表示自定义的host；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SniHost")
    @Expose
    private String SniHost;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weights")
    @Expose
    private String [] Weights;

    /**
    * IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * 0:关闭xff重置；1:开启xff重置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XFFReset")
    @Expose
    private Long XFFReset;

    /**
     * Get 是否开启httpRewrite 
     * @return HttpsRewrite 是否开启httpRewrite
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set 是否开启httpRewrite
     * @param HttpsRewrite 是否开启httpRewrite
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get https回源端口 
     * @return HttpsUpstreamPort https回源端口
     */
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set https回源端口
     * @param HttpsUpstreamPort https回源端口
     */
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get 是否是cdn 
     * @return IsCdn 是否是cdn
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set 是否是cdn
     * @param IsCdn 是否是cdn
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 是否开启gray 
     * @return IsGray 是否开启gray
     */
    public Long getIsGray() {
        return this.IsGray;
    }

    /**
     * Set 是否开启gray
     * @param IsGray 是否开启gray
     */
    public void setIsGray(Long IsGray) {
        this.IsGray = IsGray;
    }

    /**
     * Get 是否是http2 
     * @return IsHttp2 是否是http2
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set 是否是http2
     * @param IsHttp2 是否是http2
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get 是否开启websocket 
     * @return IsWebsocket 是否开启websocket
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set 是否开启websocket
     * @param IsWebsocket 是否开启websocket
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get 负载均衡 
     * @return LoadBalance 负载均衡
     */
    public Long getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set 负载均衡
     * @param LoadBalance 负载均衡
     */
    public void setLoadBalance(Long LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get 防御模式 
     * @return Mode 防御模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 防御模式
     * @param Mode 防御模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 私钥 
     * @return PrivateKey 私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私钥
     * @param PrivateKey 私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get ssl id 
     * @return SSLId ssl id
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set ssl id
     * @param SSLId ssl id
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get 回源域名 
     * @return UpstreamDomain 回源域名
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set 回源域名
     * @param UpstreamDomain 回源域名
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get 回源类型 
     * @return UpstreamType 回源类型
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 回源类型
     * @param UpstreamType 回源类型
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get 回源ip 
     * @return SrcList 回源ip
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set 回源ip
     * @param SrcList 回源ip
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get 服务端口配置 
     * @return Ports 服务端口配置
     */
    public PortInfo [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 服务端口配置
     * @param Ports 服务端口配置
     */
    public void setPorts(PortInfo [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 证书类型 
     * @return CertType 证书类型
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型
     * @param CertType 证书类型
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 回源方式 
     * @return UpstreamScheme 回源方式
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set 回源方式
     * @param UpstreamScheme 回源方式
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get 日志包 
     * @return Cls 日志包
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set 日志包
     * @param Cls 日志包
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get 一级cname 
     * @return Cname 一级cname
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 一级cname
     * @param Cname 一级cname
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 是否长连接 
     * @return IsKeepAlive 是否长连接
     */
    public Long getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set 是否长连接
     * @param IsKeepAlive 是否长连接
     */
    public void setIsKeepAlive(Long IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get 是否开启主动健康检测，1表示开启，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveCheck 是否开启主动健康检测，1表示开启，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set 是否开启主动健康检测，1表示开启，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveCheck 是否开启主动健康检测，1表示开启，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveCheck(Long ActiveCheck) {
        this.ActiveCheck = ActiveCheck;
    }

    /**
     * Get TLS版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TLSVersion TLS版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set TLS版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TLSVersion TLS版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTLSVersion(Long TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    /**
     * Get 加密套件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ciphers 加密套件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set 加密套件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ciphers 加密套件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get 模版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CipherTemplate 模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set 模版
注意：此字段可能返回 null，表示取不到有效值。
     * @param CipherTemplate 模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get 300s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyReadTimeout 300s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyReadTimeout() {
        return this.ProxyReadTimeout;
    }

    /**
     * Set 300s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyReadTimeout 300s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyReadTimeout(Long ProxyReadTimeout) {
        this.ProxyReadTimeout = ProxyReadTimeout;
    }

    /**
     * Get 300s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxySendTimeout 300s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set 300s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxySendTimeout 300s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SniType 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
注意：此字段可能返回 null，表示取不到有效值。
     * @param SniType 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSniType(Long SniType) {
        this.SniType = SniType;
    }

    /**
     * Get SniType=3时，需要填此参数，表示自定义的host；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SniHost SniType=3时，需要填此参数，表示自定义的host；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSniHost() {
        return this.SniHost;
    }

    /**
     * Set SniType=3时，需要填此参数，表示自定义的host；
注意：此字段可能返回 null，表示取不到有效值。
     * @param SniHost SniType=3时，需要填此参数，表示自定义的host；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSniHost(String SniHost) {
        this.SniHost = SniHost;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weights 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getWeights() {
        return this.Weights;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weights 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeights(String [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpHeaders IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpHeaders IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get 0:关闭xff重置；1:开启xff重置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XFFReset 0:关闭xff重置；1:开启xff重置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set 0:关闭xff重置；1:开启xff重置
注意：此字段可能返回 null，表示取不到有效值。
     * @param XFFReset 0:关闭xff重置；1:开启xff重置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXFFReset(Long XFFReset) {
        this.XFFReset = XFFReset;
    }

    public DomainsPartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainsPartInfo(DomainsPartInfo source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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

    }
}

