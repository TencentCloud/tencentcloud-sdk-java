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

public class SetAuthenticationRequest extends AbstractModel{

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 需要进行高级配置的域名，该域名为监听器下的转发规则的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 基础认证开关，其中：
0，关闭基础认证；
1，开启基础认证。
默认为0。
    */
    @SerializedName("BasicAuth")
    @Expose
    private Long BasicAuth;

    /**
    * 通道认证开关，用于源站对Gaap的认证，其中：
0，关闭通道认证；
1，开启通道认证。
默认为0。
    */
    @SerializedName("GaapAuth")
    @Expose
    private Long GaapAuth;

    /**
    * 源站认证开关，用于Gaap对服务器的认证，其中：
0，关闭源站认证；
1，开启源站认证。
默认为0。
    */
    @SerializedName("RealServerAuth")
    @Expose
    private Long RealServerAuth;

    /**
    * 基础认证配置ID，从证书管理页获取。
    */
    @SerializedName("BasicAuthConfId")
    @Expose
    private String BasicAuthConfId;

    /**
    * 通道SSL证书ID，从证书管理页获取。
    */
    @SerializedName("GaapCertificateId")
    @Expose
    private String GaapCertificateId;

    /**
    * 源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
    */
    @SerializedName("RealServerCertificateId")
    @Expose
    private String RealServerCertificateId;

    /**
    * 源站证书域名。
    */
    @SerializedName("RealServerCertificateDomain")
    @Expose
    private String RealServerCertificateDomain;

    /**
    * 多源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
    */
    @SerializedName("PolyRealServerCertificateIds")
    @Expose
    private String [] PolyRealServerCertificateIds;

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 需要进行高级配置的域名，该域名为监听器下的转发规则的域名。 
     * @return Domain 需要进行高级配置的域名，该域名为监听器下的转发规则的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要进行高级配置的域名，该域名为监听器下的转发规则的域名。
     * @param Domain 需要进行高级配置的域名，该域名为监听器下的转发规则的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 基础认证开关，其中：
0，关闭基础认证；
1，开启基础认证。
默认为0。 
     * @return BasicAuth 基础认证开关，其中：
0，关闭基础认证；
1，开启基础认证。
默认为0。
     */
    public Long getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set 基础认证开关，其中：
0，关闭基础认证；
1，开启基础认证。
默认为0。
     * @param BasicAuth 基础认证开关，其中：
0，关闭基础认证；
1，开启基础认证。
默认为0。
     */
    public void setBasicAuth(Long BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get 通道认证开关，用于源站对Gaap的认证，其中：
0，关闭通道认证；
1，开启通道认证。
默认为0。 
     * @return GaapAuth 通道认证开关，用于源站对Gaap的认证，其中：
0，关闭通道认证；
1，开启通道认证。
默认为0。
     */
    public Long getGaapAuth() {
        return this.GaapAuth;
    }

    /**
     * Set 通道认证开关，用于源站对Gaap的认证，其中：
0，关闭通道认证；
1，开启通道认证。
默认为0。
     * @param GaapAuth 通道认证开关，用于源站对Gaap的认证，其中：
0，关闭通道认证；
1，开启通道认证。
默认为0。
     */
    public void setGaapAuth(Long GaapAuth) {
        this.GaapAuth = GaapAuth;
    }

    /**
     * Get 源站认证开关，用于Gaap对服务器的认证，其中：
0，关闭源站认证；
1，开启源站认证。
默认为0。 
     * @return RealServerAuth 源站认证开关，用于Gaap对服务器的认证，其中：
0，关闭源站认证；
1，开启源站认证。
默认为0。
     */
    public Long getRealServerAuth() {
        return this.RealServerAuth;
    }

    /**
     * Set 源站认证开关，用于Gaap对服务器的认证，其中：
0，关闭源站认证；
1，开启源站认证。
默认为0。
     * @param RealServerAuth 源站认证开关，用于Gaap对服务器的认证，其中：
0，关闭源站认证；
1，开启源站认证。
默认为0。
     */
    public void setRealServerAuth(Long RealServerAuth) {
        this.RealServerAuth = RealServerAuth;
    }

    /**
     * Get 基础认证配置ID，从证书管理页获取。 
     * @return BasicAuthConfId 基础认证配置ID，从证书管理页获取。
     */
    public String getBasicAuthConfId() {
        return this.BasicAuthConfId;
    }

    /**
     * Set 基础认证配置ID，从证书管理页获取。
     * @param BasicAuthConfId 基础认证配置ID，从证书管理页获取。
     */
    public void setBasicAuthConfId(String BasicAuthConfId) {
        this.BasicAuthConfId = BasicAuthConfId;
    }

    /**
     * Get 通道SSL证书ID，从证书管理页获取。 
     * @return GaapCertificateId 通道SSL证书ID，从证书管理页获取。
     */
    public String getGaapCertificateId() {
        return this.GaapCertificateId;
    }

    /**
     * Set 通道SSL证书ID，从证书管理页获取。
     * @param GaapCertificateId 通道SSL证书ID，从证书管理页获取。
     */
    public void setGaapCertificateId(String GaapCertificateId) {
        this.GaapCertificateId = GaapCertificateId;
    }

    /**
     * Get 源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数 
     * @return RealServerCertificateId 源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
     */
    public String getRealServerCertificateId() {
        return this.RealServerCertificateId;
    }

    /**
     * Set 源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
     * @param RealServerCertificateId 源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
     */
    public void setRealServerCertificateId(String RealServerCertificateId) {
        this.RealServerCertificateId = RealServerCertificateId;
    }

    /**
     * Get 源站证书域名。 
     * @return RealServerCertificateDomain 源站证书域名。
     */
    public String getRealServerCertificateDomain() {
        return this.RealServerCertificateDomain;
    }

    /**
     * Set 源站证书域名。
     * @param RealServerCertificateDomain 源站证书域名。
     */
    public void setRealServerCertificateDomain(String RealServerCertificateDomain) {
        this.RealServerCertificateDomain = RealServerCertificateDomain;
    }

    /**
     * Get 多源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数 
     * @return PolyRealServerCertificateIds 多源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
     */
    public String [] getPolyRealServerCertificateIds() {
        return this.PolyRealServerCertificateIds;
    }

    /**
     * Set 多源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
     * @param PolyRealServerCertificateIds 多源站CA证书ID，从证书管理页获取。源站认证时，填写该参数或RealServerCertificateId参数
     */
    public void setPolyRealServerCertificateIds(String [] PolyRealServerCertificateIds) {
        this.PolyRealServerCertificateIds = PolyRealServerCertificateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "BasicAuth", this.BasicAuth);
        this.setParamSimple(map, prefix + "GaapAuth", this.GaapAuth);
        this.setParamSimple(map, prefix + "RealServerAuth", this.RealServerAuth);
        this.setParamSimple(map, prefix + "BasicAuthConfId", this.BasicAuthConfId);
        this.setParamSimple(map, prefix + "GaapCertificateId", this.GaapCertificateId);
        this.setParamSimple(map, prefix + "RealServerCertificateId", this.RealServerCertificateId);
        this.setParamSimple(map, prefix + "RealServerCertificateDomain", this.RealServerCertificateDomain);
        this.setParamArraySimple(map, prefix + "PolyRealServerCertificateIds.", this.PolyRealServerCertificateIds);

    }
}

