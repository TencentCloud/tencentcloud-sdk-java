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
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调</p>
    */
    @SerializedName("DomainType")
    @Expose
    private String DomainType;

    /**
    * <p>绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>证书ID。当前账户下SSL平台的证书ID</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>是否是默认域名</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>域名开启状态</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FAIL： 失败</li><li>EO_PENDING_VERIFICATION： 待验证edgeone归属权</li><li>SUCCESS： 成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>DNS解析状态</p><p>枚举值：</p><ul><li>OK： 正常，命中目标 cname</li><li>EMPTY： 解析为空，域名尚未配置 CNAME 或未生效</li><li>INVALID： 异常，解析到其他非目标地址</li></ul>
    */
    @SerializedName("DNSStatus")
    @Expose
    private String DNSStatus;

    /**
    * <p>是否CNAME到平台任一网关入口，默认接入/CDN/EO，不含CustomCname</p><p>枚举值：</p><ul><li>EMPTY： 解析为空</li><li>OK： 命中</li><li>INVALID：  解析到其他非目标地址</li></ul>
    */
    @SerializedName("PlatformCnameDNSStatus")
    @Expose
    private String PlatformCnameDNSStatus;

    /**
    * <p>HTTP访问服务路由信息</p>
    */
    @SerializedName("Routes")
    @Expose
    private HTTPServiceRoute [] Routes;

    /**
    * <p>扩展字段，内部包含headers处理等</p>
    */
    @SerializedName("Extension")
    @Expose
    private HTTPServiceExtension Extension;

    /**
    * <p>域名创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>域名更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调</p> 
     * @return DomainType <p>域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调</p>
     */
    public String getDomainType() {
        return this.DomainType;
    }

    /**
     * Set <p>域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调</p>
     * @param DomainType <p>域名类型。 HTTPSERVICE: HTTP访问服务，CBR: 云托管服务，ANYSERVICE: 任意服务，AI_AGENT: AI agent，VM: 主机，INTEGRATION_CALLBACK: 集成回调</p>
     */
    public void setDomainType(String DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get <p>绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）</p> 
     * @return AccessType <p>绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）</p>
     * @param AccessType <p>绑定类型。默认DIRECT。DIRECT: 直连到HTTP访问服务， CDN: 接入云开发CDN，CUSTOM: 自定义接入类型（其他CDN或者WAF）</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>证书ID。当前账户下SSL平台的证书ID</p> 
     * @return CertId <p>证书ID。当前账户下SSL平台的证书ID</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>证书ID。当前账户下SSL平台的证书ID</p>
     * @param CertId <p>证书ID。当前账户下SSL平台的证书ID</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向</p> 
     * @return Protocol <p>协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向</p>
     * @param Protocol <p>协议类型。默认HTTP_AND_HTTPS。HTTP_AND_HTTPS: 同时开启http和https，HTTP_TO_HTTPS: http重定向成https，HTTPS_TO_HTTP: https重定向成http。如果未配置证书无法访问https或者进行重定向</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。</p> 
     * @return Cname <p>配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。</p>
     * @param Cname <p>配置DNS解析的CNAME。根据AccessType返回不同的CNAME值。</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>是否是默认域名</p> 
     * @return IsDefault <p>是否是默认域名</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否是默认域名</p>
     * @param IsDefault <p>是否是默认域名</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>域名开启状态</p> 
     * @return Enable <p>域名开启状态</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>域名开启状态</p>
     * @param Enable <p>域名开启状态</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FAIL： 失败</li><li>EO_PENDING_VERIFICATION： 待验证edgeone归属权</li><li>SUCCESS： 成功</li></ul> 
     * @return Status <p>状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FAIL： 失败</li><li>EO_PENDING_VERIFICATION： 待验证edgeone归属权</li><li>SUCCESS： 成功</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FAIL： 失败</li><li>EO_PENDING_VERIFICATION： 待验证edgeone归属权</li><li>SUCCESS： 成功</li></ul>
     * @param Status <p>状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FAIL： 失败</li><li>EO_PENDING_VERIFICATION： 待验证edgeone归属权</li><li>SUCCESS： 成功</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>DNS解析状态</p><p>枚举值：</p><ul><li>OK： 正常，命中目标 cname</li><li>EMPTY： 解析为空，域名尚未配置 CNAME 或未生效</li><li>INVALID： 异常，解析到其他非目标地址</li></ul> 
     * @return DNSStatus <p>DNS解析状态</p><p>枚举值：</p><ul><li>OK： 正常，命中目标 cname</li><li>EMPTY： 解析为空，域名尚未配置 CNAME 或未生效</li><li>INVALID： 异常，解析到其他非目标地址</li></ul>
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * Set <p>DNS解析状态</p><p>枚举值：</p><ul><li>OK： 正常，命中目标 cname</li><li>EMPTY： 解析为空，域名尚未配置 CNAME 或未生效</li><li>INVALID： 异常，解析到其他非目标地址</li></ul>
     * @param DNSStatus <p>DNS解析状态</p><p>枚举值：</p><ul><li>OK： 正常，命中目标 cname</li><li>EMPTY： 解析为空，域名尚未配置 CNAME 或未生效</li><li>INVALID： 异常，解析到其他非目标地址</li></ul>
     */
    public void setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
    }

    /**
     * Get <p>是否CNAME到平台任一网关入口，默认接入/CDN/EO，不含CustomCname</p><p>枚举值：</p><ul><li>EMPTY： 解析为空</li><li>OK： 命中</li><li>INVALID：  解析到其他非目标地址</li></ul> 
     * @return PlatformCnameDNSStatus <p>是否CNAME到平台任一网关入口，默认接入/CDN/EO，不含CustomCname</p><p>枚举值：</p><ul><li>EMPTY： 解析为空</li><li>OK： 命中</li><li>INVALID：  解析到其他非目标地址</li></ul>
     */
    public String getPlatformCnameDNSStatus() {
        return this.PlatformCnameDNSStatus;
    }

    /**
     * Set <p>是否CNAME到平台任一网关入口，默认接入/CDN/EO，不含CustomCname</p><p>枚举值：</p><ul><li>EMPTY： 解析为空</li><li>OK： 命中</li><li>INVALID：  解析到其他非目标地址</li></ul>
     * @param PlatformCnameDNSStatus <p>是否CNAME到平台任一网关入口，默认接入/CDN/EO，不含CustomCname</p><p>枚举值：</p><ul><li>EMPTY： 解析为空</li><li>OK： 命中</li><li>INVALID：  解析到其他非目标地址</li></ul>
     */
    public void setPlatformCnameDNSStatus(String PlatformCnameDNSStatus) {
        this.PlatformCnameDNSStatus = PlatformCnameDNSStatus;
    }

    /**
     * Get <p>HTTP访问服务路由信息</p> 
     * @return Routes <p>HTTP访问服务路由信息</p>
     */
    public HTTPServiceRoute [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set <p>HTTP访问服务路由信息</p>
     * @param Routes <p>HTTP访问服务路由信息</p>
     */
    public void setRoutes(HTTPServiceRoute [] Routes) {
        this.Routes = Routes;
    }

    /**
     * Get <p>扩展字段，内部包含headers处理等</p> 
     * @return Extension <p>扩展字段，内部包含headers处理等</p>
     */
    public HTTPServiceExtension getExtension() {
        return this.Extension;
    }

    /**
     * Set <p>扩展字段，内部包含headers处理等</p>
     * @param Extension <p>扩展字段，内部包含headers处理等</p>
     */
    public void setExtension(HTTPServiceExtension Extension) {
        this.Extension = Extension;
    }

    /**
     * Get <p>域名创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p> 
     * @return CreateTime <p>域名创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>域名创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     * @param CreateTime <p>域名创建时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>域名更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p> 
     * @return UpdateTime <p>域名更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>域名更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
     * @param UpdateTime <p>域名更新时间，格式  YYYY-MM-DDTHH:mm:ss±HH:mm，时区为 UTC+8</p>
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
        if (source.PlatformCnameDNSStatus != null) {
            this.PlatformCnameDNSStatus = new String(source.PlatformCnameDNSStatus);
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
        this.setParamSimple(map, prefix + "PlatformCnameDNSStatus", this.PlatformCnameDNSStatus);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);
        this.setParamObj(map, prefix + "Extension.", this.Extension);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

