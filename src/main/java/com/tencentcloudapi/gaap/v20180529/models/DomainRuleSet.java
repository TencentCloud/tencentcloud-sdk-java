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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainRuleSet extends AbstractModel {

    /**
    * 转发规则域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 该域名对应的转发规则列表。
    */
    @SerializedName("RuleSet")
    @Expose
    private RuleInfo [] RuleSet;

    /**
    * 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 该域名对应服务器证书名称。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * 该域名对应客户端证书名称。
    */
    @SerializedName("ClientCertificateAlias")
    @Expose
    private String ClientCertificateAlias;

    /**
    * 该域名对应基础认证配置ID。
    */
    @SerializedName("BasicAuthConfId")
    @Expose
    private String BasicAuthConfId;

    /**
    * 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
    */
    @SerializedName("BasicAuth")
    @Expose
    private Long BasicAuth;

    /**
    * 该域名对应基础认证配置名称。
    */
    @SerializedName("BasicAuthConfAlias")
    @Expose
    private String BasicAuthConfAlias;

    /**
    * 该域名对应源站认证证书ID。
    */
    @SerializedName("RealServerCertificateId")
    @Expose
    private String RealServerCertificateId;

    /**
    * 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
    */
    @SerializedName("RealServerAuth")
    @Expose
    private Long RealServerAuth;

    /**
    * 该域名对应源站认证证书名称。
    */
    @SerializedName("RealServerCertificateAlias")
    @Expose
    private String RealServerCertificateAlias;

    /**
    * 该域名对应通道认证证书ID。
    */
    @SerializedName("GaapCertificateId")
    @Expose
    private String GaapCertificateId;

    /**
    * 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
    */
    @SerializedName("GaapAuth")
    @Expose
    private Long GaapAuth;

    /**
    * 该域名对应通道认证证书名称。
    */
    @SerializedName("GaapCertificateAlias")
    @Expose
    private String GaapCertificateAlias;

    /**
    * 源站认证域名。
    */
    @SerializedName("RealServerCertificateDomain")
    @Expose
    private String RealServerCertificateDomain;

    /**
    * 多客户端证书时，返回多个证书的id和别名
    */
    @SerializedName("PolyClientCertificateAliasInfo")
    @Expose
    private CertificateAliasInfo [] PolyClientCertificateAliasInfo;

    /**
    * 多源站证书时，返回多个证书的id和别名
    */
    @SerializedName("PolyRealServerCertificateAliasInfo")
    @Expose
    private CertificateAliasInfo [] PolyRealServerCertificateAliasInfo;

    /**
    * 域名的状态。
0表示运行中，
1表示变更中，
2表示删除中。
    */
    @SerializedName("DomainStatus")
    @Expose
    private Long DomainStatus;

    /**
    * 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
    */
    @SerializedName("BanStatus")
    @Expose
    private String BanStatus;

    /**
    * Http3特性标识，其中：
0表示关闭；
1表示启用。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
    * 是否为默认域名
    */
    @SerializedName("IsDefaultServer")
    @Expose
    private Boolean IsDefaultServer;

    /**
    * TLS套件包
    */
    @SerializedName("TLSCiphers")
    @Expose
    private String TLSCiphers;

    /**
    * TLS版本
    */
    @SerializedName("TLSSupportVersion")
    @Expose
    private String [] TLSSupportVersion;

    /**
     * Get 转发规则域名。 
     * @return Domain 转发规则域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则域名。
     * @param Domain 转发规则域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 该域名对应的转发规则列表。 
     * @return RuleSet 该域名对应的转发规则列表。
     */
    public RuleInfo [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * Set 该域名对应的转发规则列表。
     * @param RuleSet 该域名对应的转发规则列表。
     */
    public void setRuleSet(RuleInfo [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    /**
     * Get 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。 
     * @return CertificateId 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
     * @param CertificateId 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 该域名对应服务器证书名称。 
     * @return CertificateAlias 该域名对应服务器证书名称。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set 该域名对应服务器证书名称。
     * @param CertificateAlias 该域名对应服务器证书名称。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。 
     * @return ClientCertificateId 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
     * @param ClientCertificateId 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get 该域名对应客户端证书名称。 
     * @return ClientCertificateAlias 该域名对应客户端证书名称。
     */
    public String getClientCertificateAlias() {
        return this.ClientCertificateAlias;
    }

    /**
     * Set 该域名对应客户端证书名称。
     * @param ClientCertificateAlias 该域名对应客户端证书名称。
     */
    public void setClientCertificateAlias(String ClientCertificateAlias) {
        this.ClientCertificateAlias = ClientCertificateAlias;
    }

    /**
     * Get 该域名对应基础认证配置ID。 
     * @return BasicAuthConfId 该域名对应基础认证配置ID。
     */
    public String getBasicAuthConfId() {
        return this.BasicAuthConfId;
    }

    /**
     * Set 该域名对应基础认证配置ID。
     * @param BasicAuthConfId 该域名对应基础认证配置ID。
     */
    public void setBasicAuthConfId(String BasicAuthConfId) {
        this.BasicAuthConfId = BasicAuthConfId;
    }

    /**
     * Get 基础认证开关，其中：
0，表示未开启；
1，表示已开启。 
     * @return BasicAuth 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
     */
    public Long getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
     * @param BasicAuth 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
     */
    public void setBasicAuth(Long BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get 该域名对应基础认证配置名称。 
     * @return BasicAuthConfAlias 该域名对应基础认证配置名称。
     */
    public String getBasicAuthConfAlias() {
        return this.BasicAuthConfAlias;
    }

    /**
     * Set 该域名对应基础认证配置名称。
     * @param BasicAuthConfAlias 该域名对应基础认证配置名称。
     */
    public void setBasicAuthConfAlias(String BasicAuthConfAlias) {
        this.BasicAuthConfAlias = BasicAuthConfAlias;
    }

    /**
     * Get 该域名对应源站认证证书ID。 
     * @return RealServerCertificateId 该域名对应源站认证证书ID。
     */
    public String getRealServerCertificateId() {
        return this.RealServerCertificateId;
    }

    /**
     * Set 该域名对应源站认证证书ID。
     * @param RealServerCertificateId 该域名对应源站认证证书ID。
     */
    public void setRealServerCertificateId(String RealServerCertificateId) {
        this.RealServerCertificateId = RealServerCertificateId;
    }

    /**
     * Get 源站认证开关，其中：
0，表示未开启；
1，表示已开启。 
     * @return RealServerAuth 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
     */
    public Long getRealServerAuth() {
        return this.RealServerAuth;
    }

    /**
     * Set 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
     * @param RealServerAuth 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
     */
    public void setRealServerAuth(Long RealServerAuth) {
        this.RealServerAuth = RealServerAuth;
    }

    /**
     * Get 该域名对应源站认证证书名称。 
     * @return RealServerCertificateAlias 该域名对应源站认证证书名称。
     */
    public String getRealServerCertificateAlias() {
        return this.RealServerCertificateAlias;
    }

    /**
     * Set 该域名对应源站认证证书名称。
     * @param RealServerCertificateAlias 该域名对应源站认证证书名称。
     */
    public void setRealServerCertificateAlias(String RealServerCertificateAlias) {
        this.RealServerCertificateAlias = RealServerCertificateAlias;
    }

    /**
     * Get 该域名对应通道认证证书ID。 
     * @return GaapCertificateId 该域名对应通道认证证书ID。
     */
    public String getGaapCertificateId() {
        return this.GaapCertificateId;
    }

    /**
     * Set 该域名对应通道认证证书ID。
     * @param GaapCertificateId 该域名对应通道认证证书ID。
     */
    public void setGaapCertificateId(String GaapCertificateId) {
        this.GaapCertificateId = GaapCertificateId;
    }

    /**
     * Get 通道认证开关，其中：
0，表示未开启；
1，表示已开启。 
     * @return GaapAuth 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
     */
    public Long getGaapAuth() {
        return this.GaapAuth;
    }

    /**
     * Set 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
     * @param GaapAuth 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
     */
    public void setGaapAuth(Long GaapAuth) {
        this.GaapAuth = GaapAuth;
    }

    /**
     * Get 该域名对应通道认证证书名称。 
     * @return GaapCertificateAlias 该域名对应通道认证证书名称。
     */
    public String getGaapCertificateAlias() {
        return this.GaapCertificateAlias;
    }

    /**
     * Set 该域名对应通道认证证书名称。
     * @param GaapCertificateAlias 该域名对应通道认证证书名称。
     */
    public void setGaapCertificateAlias(String GaapCertificateAlias) {
        this.GaapCertificateAlias = GaapCertificateAlias;
    }

    /**
     * Get 源站认证域名。 
     * @return RealServerCertificateDomain 源站认证域名。
     */
    public String getRealServerCertificateDomain() {
        return this.RealServerCertificateDomain;
    }

    /**
     * Set 源站认证域名。
     * @param RealServerCertificateDomain 源站认证域名。
     */
    public void setRealServerCertificateDomain(String RealServerCertificateDomain) {
        this.RealServerCertificateDomain = RealServerCertificateDomain;
    }

    /**
     * Get 多客户端证书时，返回多个证书的id和别名 
     * @return PolyClientCertificateAliasInfo 多客户端证书时，返回多个证书的id和别名
     */
    public CertificateAliasInfo [] getPolyClientCertificateAliasInfo() {
        return this.PolyClientCertificateAliasInfo;
    }

    /**
     * Set 多客户端证书时，返回多个证书的id和别名
     * @param PolyClientCertificateAliasInfo 多客户端证书时，返回多个证书的id和别名
     */
    public void setPolyClientCertificateAliasInfo(CertificateAliasInfo [] PolyClientCertificateAliasInfo) {
        this.PolyClientCertificateAliasInfo = PolyClientCertificateAliasInfo;
    }

    /**
     * Get 多源站证书时，返回多个证书的id和别名 
     * @return PolyRealServerCertificateAliasInfo 多源站证书时，返回多个证书的id和别名
     */
    public CertificateAliasInfo [] getPolyRealServerCertificateAliasInfo() {
        return this.PolyRealServerCertificateAliasInfo;
    }

    /**
     * Set 多源站证书时，返回多个证书的id和别名
     * @param PolyRealServerCertificateAliasInfo 多源站证书时，返回多个证书的id和别名
     */
    public void setPolyRealServerCertificateAliasInfo(CertificateAliasInfo [] PolyRealServerCertificateAliasInfo) {
        this.PolyRealServerCertificateAliasInfo = PolyRealServerCertificateAliasInfo;
    }

    /**
     * Get 域名的状态。
0表示运行中，
1表示变更中，
2表示删除中。 
     * @return DomainStatus 域名的状态。
0表示运行中，
1表示变更中，
2表示删除中。
     */
    public Long getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 域名的状态。
0表示运行中，
1表示变更中，
2表示删除中。
     * @param DomainStatus 域名的状态。
0表示运行中，
1表示变更中，
2表示删除中。
     */
    public void setDomainStatus(Long DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。 
     * @return BanStatus 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
     */
    public String getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
     * @param BanStatus 封禁解封状态：BANNED表示已封禁，RECOVER表示已解封或未封禁，BANNING表示封禁中，RECOVERING表示解封中，BAN_FAILED表示封禁失败，RECOVER_FAILED表示解封失败。
     */
    public void setBanStatus(String BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get Http3特性标识，其中：
0表示关闭；
1表示启用。 
     * @return Http3Supported Http3特性标识，其中：
0表示关闭；
1表示启用。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Http3特性标识，其中：
0表示关闭；
1表示启用。
     * @param Http3Supported Http3特性标识，其中：
0表示关闭；
1表示启用。
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    /**
     * Get 是否为默认域名 
     * @return IsDefaultServer 是否为默认域名
     */
    public Boolean getIsDefaultServer() {
        return this.IsDefaultServer;
    }

    /**
     * Set 是否为默认域名
     * @param IsDefaultServer 是否为默认域名
     */
    public void setIsDefaultServer(Boolean IsDefaultServer) {
        this.IsDefaultServer = IsDefaultServer;
    }

    /**
     * Get TLS套件包 
     * @return TLSCiphers TLS套件包
     */
    public String getTLSCiphers() {
        return this.TLSCiphers;
    }

    /**
     * Set TLS套件包
     * @param TLSCiphers TLS套件包
     */
    public void setTLSCiphers(String TLSCiphers) {
        this.TLSCiphers = TLSCiphers;
    }

    /**
     * Get TLS版本 
     * @return TLSSupportVersion TLS版本
     */
    public String [] getTLSSupportVersion() {
        return this.TLSSupportVersion;
    }

    /**
     * Set TLS版本
     * @param TLSSupportVersion TLS版本
     */
    public void setTLSSupportVersion(String [] TLSSupportVersion) {
        this.TLSSupportVersion = TLSSupportVersion;
    }

    public DomainRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainRuleSet(DomainRuleSet source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleSet != null) {
            this.RuleSet = new RuleInfo[source.RuleSet.length];
            for (int i = 0; i < source.RuleSet.length; i++) {
                this.RuleSet[i] = new RuleInfo(source.RuleSet[i]);
            }
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.ClientCertificateId != null) {
            this.ClientCertificateId = new String(source.ClientCertificateId);
        }
        if (source.ClientCertificateAlias != null) {
            this.ClientCertificateAlias = new String(source.ClientCertificateAlias);
        }
        if (source.BasicAuthConfId != null) {
            this.BasicAuthConfId = new String(source.BasicAuthConfId);
        }
        if (source.BasicAuth != null) {
            this.BasicAuth = new Long(source.BasicAuth);
        }
        if (source.BasicAuthConfAlias != null) {
            this.BasicAuthConfAlias = new String(source.BasicAuthConfAlias);
        }
        if (source.RealServerCertificateId != null) {
            this.RealServerCertificateId = new String(source.RealServerCertificateId);
        }
        if (source.RealServerAuth != null) {
            this.RealServerAuth = new Long(source.RealServerAuth);
        }
        if (source.RealServerCertificateAlias != null) {
            this.RealServerCertificateAlias = new String(source.RealServerCertificateAlias);
        }
        if (source.GaapCertificateId != null) {
            this.GaapCertificateId = new String(source.GaapCertificateId);
        }
        if (source.GaapAuth != null) {
            this.GaapAuth = new Long(source.GaapAuth);
        }
        if (source.GaapCertificateAlias != null) {
            this.GaapCertificateAlias = new String(source.GaapCertificateAlias);
        }
        if (source.RealServerCertificateDomain != null) {
            this.RealServerCertificateDomain = new String(source.RealServerCertificateDomain);
        }
        if (source.PolyClientCertificateAliasInfo != null) {
            this.PolyClientCertificateAliasInfo = new CertificateAliasInfo[source.PolyClientCertificateAliasInfo.length];
            for (int i = 0; i < source.PolyClientCertificateAliasInfo.length; i++) {
                this.PolyClientCertificateAliasInfo[i] = new CertificateAliasInfo(source.PolyClientCertificateAliasInfo[i]);
            }
        }
        if (source.PolyRealServerCertificateAliasInfo != null) {
            this.PolyRealServerCertificateAliasInfo = new CertificateAliasInfo[source.PolyRealServerCertificateAliasInfo.length];
            for (int i = 0; i < source.PolyRealServerCertificateAliasInfo.length; i++) {
                this.PolyRealServerCertificateAliasInfo[i] = new CertificateAliasInfo(source.PolyRealServerCertificateAliasInfo[i]);
            }
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new Long(source.DomainStatus);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new String(source.BanStatus);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
        if (source.IsDefaultServer != null) {
            this.IsDefaultServer = new Boolean(source.IsDefaultServer);
        }
        if (source.TLSCiphers != null) {
            this.TLSCiphers = new String(source.TLSCiphers);
        }
        if (source.TLSSupportVersion != null) {
            this.TLSSupportVersion = new String[source.TLSSupportVersion.length];
            for (int i = 0; i < source.TLSSupportVersion.length; i++) {
                this.TLSSupportVersion[i] = new String(source.TLSSupportVersion[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "RuleSet.", this.RuleSet);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateAlias", this.ClientCertificateAlias);
        this.setParamSimple(map, prefix + "BasicAuthConfId", this.BasicAuthConfId);
        this.setParamSimple(map, prefix + "BasicAuth", this.BasicAuth);
        this.setParamSimple(map, prefix + "BasicAuthConfAlias", this.BasicAuthConfAlias);
        this.setParamSimple(map, prefix + "RealServerCertificateId", this.RealServerCertificateId);
        this.setParamSimple(map, prefix + "RealServerAuth", this.RealServerAuth);
        this.setParamSimple(map, prefix + "RealServerCertificateAlias", this.RealServerCertificateAlias);
        this.setParamSimple(map, prefix + "GaapCertificateId", this.GaapCertificateId);
        this.setParamSimple(map, prefix + "GaapAuth", this.GaapAuth);
        this.setParamSimple(map, prefix + "GaapCertificateAlias", this.GaapCertificateAlias);
        this.setParamSimple(map, prefix + "RealServerCertificateDomain", this.RealServerCertificateDomain);
        this.setParamArrayObj(map, prefix + "PolyClientCertificateAliasInfo.", this.PolyClientCertificateAliasInfo);
        this.setParamArrayObj(map, prefix + "PolyRealServerCertificateAliasInfo.", this.PolyRealServerCertificateAliasInfo);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);
        this.setParamSimple(map, prefix + "IsDefaultServer", this.IsDefaultServer);
        this.setParamSimple(map, prefix + "TLSCiphers", this.TLSCiphers);
        this.setParamArraySimple(map, prefix + "TLSSupportVersion.", this.TLSSupportVersion);

    }
}

