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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceDomain extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调
    */
    @SerializedName("DomainType")
    @Expose
    private String DomainType;

    /**
    * 绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 证书ID。当前账户下SSL平台的证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 是否是默认域名
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 域名开启状态
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 状态。PROCESSING、FAIL，SUCCESS。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * DNS解析状态。OK： 解析正常，INVALID：解析不正确，域名未解析到当前Cname域名。
    */
    @SerializedName("DNSStatus")
    @Expose
    private String DNSStatus;

    /**
    * HTTP访问服务路由信息
    */
    @SerializedName("Routes")
    @Expose
    private HTTPServiceRoute [] Routes;

    /**
    * 扩展字段，内部包含headers处理等
    */
    @SerializedName("Extension")
    @Expose
    private HTTPServiceExtension Extension;

    /**
    * 域名创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 域名更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get 域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调 
     * @return DomainType 域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调
     */
    public String getDomainType() {
        return this.DomainType;
    }

    /**
     * Set 域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调
     * @param DomainType 域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调
     */
    public void setDomainType(String DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get 绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF） 
     * @return AccessType 绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）
     * @param AccessType 绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 证书ID。当前账户下SSL平台的证书ID 
     * @return CertId 证书ID。当前账户下SSL平台的证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID。当前账户下SSL平台的证书ID
     * @param CertId 证书ID。当前账户下SSL平台的证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向 
     * @return Protocol 协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向
     * @param Protocol 协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。 
     * @return Cname 配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。
     * @param Cname 配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 是否是默认域名 
     * @return IsDefault 是否是默认域名
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认域名
     * @param IsDefault 是否是默认域名
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 域名开启状态 
     * @return Enable 域名开启状态
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 域名开启状态
     * @param Enable 域名开启状态
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 状态。PROCESSING、FAIL，SUCCESS。 
     * @return Status 状态。PROCESSING、FAIL，SUCCESS。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。PROCESSING、FAIL，SUCCESS。
     * @param Status 状态。PROCESSING、FAIL，SUCCESS。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get DNS解析状态。OK： 解析正常，INVALID：解析不正确，域名未解析到当前Cname域名。 
     * @return DNSStatus DNS解析状态。OK： 解析正常，INVALID：解析不正确，域名未解析到当前Cname域名。
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * Set DNS解析状态。OK： 解析正常，INVALID：解析不正确，域名未解析到当前Cname域名。
     * @param DNSStatus DNS解析状态。OK： 解析正常，INVALID：解析不正确，域名未解析到当前Cname域名。
     */
    public void setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
    }

    /**
     * Get HTTP访问服务路由信息 
     * @return Routes HTTP访问服务路由信息
     */
    public HTTPServiceRoute [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set HTTP访问服务路由信息
     * @param Routes HTTP访问服务路由信息
     */
    public void setRoutes(HTTPServiceRoute [] Routes) {
        this.Routes = Routes;
    }

    /**
     * Get 扩展字段，内部包含headers处理等 
     * @return Extension 扩展字段，内部包含headers处理等
     */
    public HTTPServiceExtension getExtension() {
        return this.Extension;
    }

    /**
     * Set 扩展字段，内部包含headers处理等
     * @param Extension 扩展字段，内部包含headers处理等
     */
    public void setExtension(HTTPServiceExtension Extension) {
        this.Extension = Extension;
    }

    /**
     * Get 域名创建时间 
     * @return CreateTime 域名创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 域名创建时间
     * @param CreateTime 域名创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 域名更新时间 
     * @return UpdateTime 域名更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 域名更新时间
     * @param UpdateTime 域名更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public HTTPServiceDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceDomain(HTTPServiceDomain source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainType != null) {
            this.DomainType = new String(source.DomainType);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DNSStatus != null) {
            this.DNSStatus = new String(source.DNSStatus);
        }
        if (source.Routes != null) {
            this.Routes = new HTTPServiceRoute[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new HTTPServiceRoute(source.Routes[i]);
            }
        }
        if (source.Extension != null) {
            this.Extension = new HTTPServiceExtension(source.Extension);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DNSStatus", this.DNSStatus);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);
        this.setParamObj(map, prefix + "Extension.", this.Extension);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

