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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainRuleSet  extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 该域名对应服务器证书名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * 该域名对应客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertificateAlias")
    @Expose
    private String ClientCertificateAlias;

    /**
    * 该域名对应基础认证配置ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicAuthConfId")
    @Expose
    private String BasicAuthConfId;

    /**
    * 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicAuth")
    @Expose
    private Long BasicAuth;

    /**
    * 该域名对应基础认证配置名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicAuthConfAlias")
    @Expose
    private String BasicAuthConfAlias;

    /**
    * 该域名对应源站认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerCertificateId")
    @Expose
    private String RealServerCertificateId;

    /**
    * 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerAuth")
    @Expose
    private Long RealServerAuth;

    /**
    * 该域名对应源站认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerCertificateAlias")
    @Expose
    private String RealServerCertificateAlias;

    /**
    * 该域名对应通道认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GaapCertificateId")
    @Expose
    private String GaapCertificateId;

    /**
    * 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GaapAuth")
    @Expose
    private Long GaapAuth;

    /**
    * 该域名对应通道认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GaapCertificateAlias")
    @Expose
    private String GaapCertificateAlias;

    /**
    * 源站认证域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealServerCertificateDomain")
    @Expose
    private String RealServerCertificateDomain;

    /**
     * 获取转发规则域名。
     * @return Domain 转发规则域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置转发规则域名。
     * @param Domain 转发规则域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取该域名对应的转发规则列表。
     * @return RuleSet 该域名对应的转发规则列表。
     */
    public RuleInfo [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * 设置该域名对应的转发规则列表。
     * @param RuleSet 该域名对应的转发规则列表。
     */
    public void setRuleSet(RuleInfo [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    /**
     * 获取该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CertificateId 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * 设置该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateId 该域名对应的服务器证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * 获取该域名对应服务器证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CertificateAlias 该域名对应服务器证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * 设置该域名对应服务器证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateAlias 该域名对应服务器证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * 获取该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClientCertificateId 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * 设置该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertificateId 该域名对应的客户端证书ID，值为default时，表示使用默认证书（监听器配置的证书）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * 获取该域名对应客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClientCertificateAlias 该域名对应客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientCertificateAlias() {
        return this.ClientCertificateAlias;
    }

    /**
     * 设置该域名对应客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertificateAlias 该域名对应客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertificateAlias(String ClientCertificateAlias) {
        this.ClientCertificateAlias = ClientCertificateAlias;
    }

    /**
     * 获取该域名对应基础认证配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return BasicAuthConfId 该域名对应基础认证配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBasicAuthConfId() {
        return this.BasicAuthConfId;
    }

    /**
     * 设置该域名对应基础认证配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicAuthConfId 该域名对应基础认证配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicAuthConfId(String BasicAuthConfId) {
        this.BasicAuthConfId = BasicAuthConfId;
    }

    /**
     * 获取基础认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @return BasicAuth 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * 设置基础认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicAuth 基础认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicAuth(Long BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * 获取该域名对应基础认证配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return BasicAuthConfAlias 该域名对应基础认证配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBasicAuthConfAlias() {
        return this.BasicAuthConfAlias;
    }

    /**
     * 设置该域名对应基础认证配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicAuthConfAlias 该域名对应基础认证配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicAuthConfAlias(String BasicAuthConfAlias) {
        this.BasicAuthConfAlias = BasicAuthConfAlias;
    }

    /**
     * 获取该域名对应源站认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return RealServerCertificateId 该域名对应源站认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealServerCertificateId() {
        return this.RealServerCertificateId;
    }

    /**
     * 设置该域名对应源站认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerCertificateId 该域名对应源站认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerCertificateId(String RealServerCertificateId) {
        this.RealServerCertificateId = RealServerCertificateId;
    }

    /**
     * 获取源站认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @return RealServerAuth 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealServerAuth() {
        return this.RealServerAuth;
    }

    /**
     * 设置源站认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerAuth 源站认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerAuth(Long RealServerAuth) {
        this.RealServerAuth = RealServerAuth;
    }

    /**
     * 获取该域名对应源站认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return RealServerCertificateAlias 该域名对应源站认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealServerCertificateAlias() {
        return this.RealServerCertificateAlias;
    }

    /**
     * 设置该域名对应源站认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerCertificateAlias 该域名对应源站认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerCertificateAlias(String RealServerCertificateAlias) {
        this.RealServerCertificateAlias = RealServerCertificateAlias;
    }

    /**
     * 获取该域名对应通道认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return GaapCertificateId 该域名对应通道认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGaapCertificateId() {
        return this.GaapCertificateId;
    }

    /**
     * 设置该域名对应通道认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GaapCertificateId 该域名对应通道认证证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGaapCertificateId(String GaapCertificateId) {
        this.GaapCertificateId = GaapCertificateId;
    }

    /**
     * 获取通道认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @return GaapAuth 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGaapAuth() {
        return this.GaapAuth;
    }

    /**
     * 设置通道认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GaapAuth 通道认证开关，其中：
0，表示未开启；
1，表示已开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGaapAuth(Long GaapAuth) {
        this.GaapAuth = GaapAuth;
    }

    /**
     * 获取该域名对应通道认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return GaapCertificateAlias 该域名对应通道认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGaapCertificateAlias() {
        return this.GaapCertificateAlias;
    }

    /**
     * 设置该域名对应通道认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GaapCertificateAlias 该域名对应通道认证证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGaapCertificateAlias(String GaapCertificateAlias) {
        this.GaapCertificateAlias = GaapCertificateAlias;
    }

    /**
     * 获取源站认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @return RealServerCertificateDomain 源站认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealServerCertificateDomain() {
        return this.RealServerCertificateDomain;
    }

    /**
     * 设置源站认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealServerCertificateDomain 源站认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealServerCertificateDomain(String RealServerCertificateDomain) {
        this.RealServerCertificateDomain = RealServerCertificateDomain;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

