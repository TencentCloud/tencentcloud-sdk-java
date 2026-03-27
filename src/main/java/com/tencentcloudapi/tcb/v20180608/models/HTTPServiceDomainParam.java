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

public class HTTPServiceDomainParam extends AbstractModel {

    /**
    * 域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
    * 自定义CNAME。对应AccessType: Custom
    */
    @SerializedName("CustomCname")
    @Expose
    private String CustomCname;

    /**
    * 域名开启状态，不传默认开启
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个
    */
    @SerializedName("Routes")
    @Expose
    private HTTPServiceRouteParam [] Routes;

    /**
     * Get 域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败 
     * @return Domain 域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败
     * @param Domain 域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get 自定义CNAME。对应AccessType: Custom 
     * @return CustomCname 自定义CNAME。对应AccessType: Custom
     */
    public String getCustomCname() {
        return this.CustomCname;
    }

    /**
     * Set 自定义CNAME。对应AccessType: Custom
     * @param CustomCname 自定义CNAME。对应AccessType: Custom
     */
    public void setCustomCname(String CustomCname) {
        this.CustomCname = CustomCname;
    }

    /**
     * Get 域名开启状态，不传默认开启 
     * @return Enable 域名开启状态，不传默认开启
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 域名开启状态，不传默认开启
     * @param Enable 域名开启状态，不传默认开启
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个 
     * @return Routes 创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个
     */
    public HTTPServiceRouteParam [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set 创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个
     * @param Routes 创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个
     */
    public void setRoutes(HTTPServiceRouteParam [] Routes) {
        this.Routes = Routes;
    }

    public HTTPServiceDomainParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceDomainParam(HTTPServiceDomainParam source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
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
        if (source.CustomCname != null) {
            this.CustomCname = new String(source.CustomCname);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Routes != null) {
            this.Routes = new HTTPServiceRouteParam[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new HTTPServiceRouteParam(source.Routes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CustomCname", this.CustomCname);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

