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
    * <p>域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
    * <p>自定义CNAME。对应AccessType: Custom</p>
    */
    @SerializedName("CustomCname")
    @Expose
    private String CustomCname;

    /**
    * <p>域名开启状态，不传默认开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个</p>
    */
    @SerializedName("Routes")
    @Expose
    private HTTPServiceRouteParam [] Routes;

    /**
    * <p>扩展字段，内部包含headers处理等</p>
    */
    @SerializedName("Extension")
    @Expose
    private HTTPServiceExtension Extension;

    /**
     * Get <p>域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败</p> 
     * @return Domain <p>域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败</p>
     * @param Domain <p>域名。全局唯一。如果域名在其他环境下占用或者腾讯云CDN占用，可能会导致创建失败</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get <p>自定义CNAME。对应AccessType: Custom</p> 
     * @return CustomCname <p>自定义CNAME。对应AccessType: Custom</p>
     */
    public String getCustomCname() {
        return this.CustomCname;
    }

    /**
     * Set <p>自定义CNAME。对应AccessType: Custom</p>
     * @param CustomCname <p>自定义CNAME。对应AccessType: Custom</p>
     */
    public void setCustomCname(String CustomCname) {
        this.CustomCname = CustomCname;
    }

    /**
     * Get <p>域名开启状态，不传默认开启</p> 
     * @return Enable <p>域名开启状态，不传默认开启</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>域名开启状态，不传默认开启</p>
     * @param Enable <p>域名开启状态，不传默认开启</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个</p> 
     * @return Routes <p>创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个</p>
     */
    public HTTPServiceRouteParam [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set <p>创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个</p>
     * @param Routes <p>创建/修改的HTTP访问服务路由列表。如果不传，仅创建或修改域名信息。列表最大支持传入20个</p>
     */
    public void setRoutes(HTTPServiceRouteParam [] Routes) {
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
        if (source.Extension != null) {
            this.Extension = new HTTPServiceExtension(source.Extension);
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
        this.setParamObj(map, prefix + "Extension.", this.Extension);

    }
}

