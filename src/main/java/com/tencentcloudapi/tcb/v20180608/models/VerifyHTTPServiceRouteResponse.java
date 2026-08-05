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

public class VerifyHTTPServiceRouteResponse extends AbstractModel {

    /**
    * <p>前置校验总开关。所有启用的检查项均为 PASS 或 SKIPPED 时为 true，任一检查项为 FAIL 时为 false。当为 false 时，前端应根据各 CheckItem 的 Code 精确渲染错误提示和操作指引；当为 true 时可继续调用 CreateHTTPServiceRoute 完成创建。 示例值：false</p>
    */
    @SerializedName("Passed")
    @Expose
    private Boolean Passed;

    /**
    * <p>域名归属权校验结果</p>
    */
    @SerializedName("Ownership")
    @Expose
    private VerifyHTTPServiceRouteCheckItem Ownership;

    /**
    * <p>证书校验结果；CertId 为空时 Status=SKIPPED</p>
    */
    @SerializedName("Cert")
    @Expose
    private VerifyHTTPServiceRouteCheckItem Cert;

    /**
    * <p>域名/路径数量配额校验结果</p>
    */
    @SerializedName("Quota")
    @Expose
    private VerifyHTTPServiceRouteCheckItem Quota;

    /**
    * <p>同域名下路由路径冲突校验结果</p>
    */
    @SerializedName("RouteConflict")
    @Expose
    private VerifyHTTPServiceRouteCheckItem RouteConflict;

    /**
    * <p>域名被其他环境占用校验结果</p>
    */
    @SerializedName("DomainConflict")
    @Expose
    private VerifyHTTPServiceRouteCheckItem DomainConflict;

    /**
    * <p>内部域名且非内部账号校验结果</p>
    */
    @SerializedName("InternalAccount")
    @Expose
    private VerifyHTTPServiceRouteCheckItem InternalAccount;

    /**
    * <p>域名黑名单校验结果</p>
    */
    @SerializedName("Blacklist")
    @Expose
    private VerifyHTTPServiceRouteCheckItem Blacklist;

    /**
    * <p>AccessType=CDN 时 CDN 资源存在性 / 状态校验结果（含 ICP 未备案的提示）</p>
    */
    @SerializedName("CDNResource")
    @Expose
    private VerifyHTTPServiceRouteCheckItem CDNResource;

    /**
    * <p>AccessType=EO 时的 EdgeOne 预检结果（域名冲突/备案/归属权）</p>
    */
    @SerializedName("EO")
    @Expose
    private VerifyHTTPServiceRouteCheckItem EO;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>前置校验总开关。所有启用的检查项均为 PASS 或 SKIPPED 时为 true，任一检查项为 FAIL 时为 false。当为 false 时，前端应根据各 CheckItem 的 Code 精确渲染错误提示和操作指引；当为 true 时可继续调用 CreateHTTPServiceRoute 完成创建。 示例值：false</p> 
     * @return Passed <p>前置校验总开关。所有启用的检查项均为 PASS 或 SKIPPED 时为 true，任一检查项为 FAIL 时为 false。当为 false 时，前端应根据各 CheckItem 的 Code 精确渲染错误提示和操作指引；当为 true 时可继续调用 CreateHTTPServiceRoute 完成创建。 示例值：false</p>
     */
    public Boolean getPassed() {
        return this.Passed;
    }

    /**
     * Set <p>前置校验总开关。所有启用的检查项均为 PASS 或 SKIPPED 时为 true，任一检查项为 FAIL 时为 false。当为 false 时，前端应根据各 CheckItem 的 Code 精确渲染错误提示和操作指引；当为 true 时可继续调用 CreateHTTPServiceRoute 完成创建。 示例值：false</p>
     * @param Passed <p>前置校验总开关。所有启用的检查项均为 PASS 或 SKIPPED 时为 true，任一检查项为 FAIL 时为 false。当为 false 时，前端应根据各 CheckItem 的 Code 精确渲染错误提示和操作指引；当为 true 时可继续调用 CreateHTTPServiceRoute 完成创建。 示例值：false</p>
     */
    public void setPassed(Boolean Passed) {
        this.Passed = Passed;
    }

    /**
     * Get <p>域名归属权校验结果</p> 
     * @return Ownership <p>域名归属权校验结果</p>
     */
    public VerifyHTTPServiceRouteCheckItem getOwnership() {
        return this.Ownership;
    }

    /**
     * Set <p>域名归属权校验结果</p>
     * @param Ownership <p>域名归属权校验结果</p>
     */
    public void setOwnership(VerifyHTTPServiceRouteCheckItem Ownership) {
        this.Ownership = Ownership;
    }

    /**
     * Get <p>证书校验结果；CertId 为空时 Status=SKIPPED</p> 
     * @return Cert <p>证书校验结果；CertId 为空时 Status=SKIPPED</p>
     */
    public VerifyHTTPServiceRouteCheckItem getCert() {
        return this.Cert;
    }

    /**
     * Set <p>证书校验结果；CertId 为空时 Status=SKIPPED</p>
     * @param Cert <p>证书校验结果；CertId 为空时 Status=SKIPPED</p>
     */
    public void setCert(VerifyHTTPServiceRouteCheckItem Cert) {
        this.Cert = Cert;
    }

    /**
     * Get <p>域名/路径数量配额校验结果</p> 
     * @return Quota <p>域名/路径数量配额校验结果</p>
     */
    public VerifyHTTPServiceRouteCheckItem getQuota() {
        return this.Quota;
    }

    /**
     * Set <p>域名/路径数量配额校验结果</p>
     * @param Quota <p>域名/路径数量配额校验结果</p>
     */
    public void setQuota(VerifyHTTPServiceRouteCheckItem Quota) {
        this.Quota = Quota;
    }

    /**
     * Get <p>同域名下路由路径冲突校验结果</p> 
     * @return RouteConflict <p>同域名下路由路径冲突校验结果</p>
     */
    public VerifyHTTPServiceRouteCheckItem getRouteConflict() {
        return this.RouteConflict;
    }

    /**
     * Set <p>同域名下路由路径冲突校验结果</p>
     * @param RouteConflict <p>同域名下路由路径冲突校验结果</p>
     */
    public void setRouteConflict(VerifyHTTPServiceRouteCheckItem RouteConflict) {
        this.RouteConflict = RouteConflict;
    }

    /**
     * Get <p>域名被其他环境占用校验结果</p> 
     * @return DomainConflict <p>域名被其他环境占用校验结果</p>
     */
    public VerifyHTTPServiceRouteCheckItem getDomainConflict() {
        return this.DomainConflict;
    }

    /**
     * Set <p>域名被其他环境占用校验结果</p>
     * @param DomainConflict <p>域名被其他环境占用校验结果</p>
     */
    public void setDomainConflict(VerifyHTTPServiceRouteCheckItem DomainConflict) {
        this.DomainConflict = DomainConflict;
    }

    /**
     * Get <p>内部域名且非内部账号校验结果</p> 
     * @return InternalAccount <p>内部域名且非内部账号校验结果</p>
     */
    public VerifyHTTPServiceRouteCheckItem getInternalAccount() {
        return this.InternalAccount;
    }

    /**
     * Set <p>内部域名且非内部账号校验结果</p>
     * @param InternalAccount <p>内部域名且非内部账号校验结果</p>
     */
    public void setInternalAccount(VerifyHTTPServiceRouteCheckItem InternalAccount) {
        this.InternalAccount = InternalAccount;
    }

    /**
     * Get <p>域名黑名单校验结果</p> 
     * @return Blacklist <p>域名黑名单校验结果</p>
     */
    public VerifyHTTPServiceRouteCheckItem getBlacklist() {
        return this.Blacklist;
    }

    /**
     * Set <p>域名黑名单校验结果</p>
     * @param Blacklist <p>域名黑名单校验结果</p>
     */
    public void setBlacklist(VerifyHTTPServiceRouteCheckItem Blacklist) {
        this.Blacklist = Blacklist;
    }

    /**
     * Get <p>AccessType=CDN 时 CDN 资源存在性 / 状态校验结果（含 ICP 未备案的提示）</p> 
     * @return CDNResource <p>AccessType=CDN 时 CDN 资源存在性 / 状态校验结果（含 ICP 未备案的提示）</p>
     */
    public VerifyHTTPServiceRouteCheckItem getCDNResource() {
        return this.CDNResource;
    }

    /**
     * Set <p>AccessType=CDN 时 CDN 资源存在性 / 状态校验结果（含 ICP 未备案的提示）</p>
     * @param CDNResource <p>AccessType=CDN 时 CDN 资源存在性 / 状态校验结果（含 ICP 未备案的提示）</p>
     */
    public void setCDNResource(VerifyHTTPServiceRouteCheckItem CDNResource) {
        this.CDNResource = CDNResource;
    }

    /**
     * Get <p>AccessType=EO 时的 EdgeOne 预检结果（域名冲突/备案/归属权）</p> 
     * @return EO <p>AccessType=EO 时的 EdgeOne 预检结果（域名冲突/备案/归属权）</p>
     */
    public VerifyHTTPServiceRouteCheckItem getEO() {
        return this.EO;
    }

    /**
     * Set <p>AccessType=EO 时的 EdgeOne 预检结果（域名冲突/备案/归属权）</p>
     * @param EO <p>AccessType=EO 时的 EdgeOne 预检结果（域名冲突/备案/归属权）</p>
     */
    public void setEO(VerifyHTTPServiceRouteCheckItem EO) {
        this.EO = EO;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VerifyHTTPServiceRouteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyHTTPServiceRouteResponse(VerifyHTTPServiceRouteResponse source) {
        if (source.Passed != null) {
            this.Passed = new Boolean(source.Passed);
        }
        if (source.Ownership != null) {
            this.Ownership = new VerifyHTTPServiceRouteCheckItem(source.Ownership);
        }
        if (source.Cert != null) {
            this.Cert = new VerifyHTTPServiceRouteCheckItem(source.Cert);
        }
        if (source.Quota != null) {
            this.Quota = new VerifyHTTPServiceRouteCheckItem(source.Quota);
        }
        if (source.RouteConflict != null) {
            this.RouteConflict = new VerifyHTTPServiceRouteCheckItem(source.RouteConflict);
        }
        if (source.DomainConflict != null) {
            this.DomainConflict = new VerifyHTTPServiceRouteCheckItem(source.DomainConflict);
        }
        if (source.InternalAccount != null) {
            this.InternalAccount = new VerifyHTTPServiceRouteCheckItem(source.InternalAccount);
        }
        if (source.Blacklist != null) {
            this.Blacklist = new VerifyHTTPServiceRouteCheckItem(source.Blacklist);
        }
        if (source.CDNResource != null) {
            this.CDNResource = new VerifyHTTPServiceRouteCheckItem(source.CDNResource);
        }
        if (source.EO != null) {
            this.EO = new VerifyHTTPServiceRouteCheckItem(source.EO);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamObj(map, prefix + "Ownership.", this.Ownership);
        this.setParamObj(map, prefix + "Cert.", this.Cert);
        this.setParamObj(map, prefix + "Quota.", this.Quota);
        this.setParamObj(map, prefix + "RouteConflict.", this.RouteConflict);
        this.setParamObj(map, prefix + "DomainConflict.", this.DomainConflict);
        this.setParamObj(map, prefix + "InternalAccount.", this.InternalAccount);
        this.setParamObj(map, prefix + "Blacklist.", this.Blacklist);
        this.setParamObj(map, prefix + "CDNResource.", this.CDNResource);
        this.setParamObj(map, prefix + "EO.", this.EO);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

