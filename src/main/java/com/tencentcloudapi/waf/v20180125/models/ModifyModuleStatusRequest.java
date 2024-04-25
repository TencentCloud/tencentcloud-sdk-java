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

public class ModifyModuleStatusRequest extends AbstractModel {

    /**
    * 需要设置的domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Web 安全模块开关，0或1
    */
    @SerializedName("WebSecurity")
    @Expose
    private Long WebSecurity;

    /**
    * 访问控制模块开关，0或者1
    */
    @SerializedName("AccessControl")
    @Expose
    private Long AccessControl;

    /**
    * CC模块开关，0或者1
    */
    @SerializedName("CcProtection")
    @Expose
    private Long CcProtection;

    /**
    * API安全模块开关，0或者1
    */
    @SerializedName("ApiProtection")
    @Expose
    private Long ApiProtection;

    /**
    * 防篡改模块开关，0或者1
    */
    @SerializedName("AntiTamper")
    @Expose
    private Long AntiTamper;

    /**
    * 防泄漏模块开关，0或者1
    */
    @SerializedName("AntiLeakage")
    @Expose
    private Long AntiLeakage;

    /**
    * 限流模块开关，0或1
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
     * Get 需要设置的domain 
     * @return Domain 需要设置的domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要设置的domain
     * @param Domain 需要设置的domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Web 安全模块开关，0或1 
     * @return WebSecurity Web 安全模块开关，0或1
     */
    public Long getWebSecurity() {
        return this.WebSecurity;
    }

    /**
     * Set Web 安全模块开关，0或1
     * @param WebSecurity Web 安全模块开关，0或1
     */
    public void setWebSecurity(Long WebSecurity) {
        this.WebSecurity = WebSecurity;
    }

    /**
     * Get 访问控制模块开关，0或者1 
     * @return AccessControl 访问控制模块开关，0或者1
     */
    public Long getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 访问控制模块开关，0或者1
     * @param AccessControl 访问控制模块开关，0或者1
     */
    public void setAccessControl(Long AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get CC模块开关，0或者1 
     * @return CcProtection CC模块开关，0或者1
     */
    public Long getCcProtection() {
        return this.CcProtection;
    }

    /**
     * Set CC模块开关，0或者1
     * @param CcProtection CC模块开关，0或者1
     */
    public void setCcProtection(Long CcProtection) {
        this.CcProtection = CcProtection;
    }

    /**
     * Get API安全模块开关，0或者1 
     * @return ApiProtection API安全模块开关，0或者1
     */
    public Long getApiProtection() {
        return this.ApiProtection;
    }

    /**
     * Set API安全模块开关，0或者1
     * @param ApiProtection API安全模块开关，0或者1
     */
    public void setApiProtection(Long ApiProtection) {
        this.ApiProtection = ApiProtection;
    }

    /**
     * Get 防篡改模块开关，0或者1 
     * @return AntiTamper 防篡改模块开关，0或者1
     */
    public Long getAntiTamper() {
        return this.AntiTamper;
    }

    /**
     * Set 防篡改模块开关，0或者1
     * @param AntiTamper 防篡改模块开关，0或者1
     */
    public void setAntiTamper(Long AntiTamper) {
        this.AntiTamper = AntiTamper;
    }

    /**
     * Get 防泄漏模块开关，0或者1 
     * @return AntiLeakage 防泄漏模块开关，0或者1
     */
    public Long getAntiLeakage() {
        return this.AntiLeakage;
    }

    /**
     * Set 防泄漏模块开关，0或者1
     * @param AntiLeakage 防泄漏模块开关，0或者1
     */
    public void setAntiLeakage(Long AntiLeakage) {
        this.AntiLeakage = AntiLeakage;
    }

    /**
     * Get 限流模块开关，0或1 
     * @return RateLimit 限流模块开关，0或1
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set 限流模块开关，0或1
     * @param RateLimit 限流模块开关，0或1
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    public ModifyModuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleStatusRequest(ModifyModuleStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.WebSecurity != null) {
            this.WebSecurity = new Long(source.WebSecurity);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new Long(source.AccessControl);
        }
        if (source.CcProtection != null) {
            this.CcProtection = new Long(source.CcProtection);
        }
        if (source.ApiProtection != null) {
            this.ApiProtection = new Long(source.ApiProtection);
        }
        if (source.AntiTamper != null) {
            this.AntiTamper = new Long(source.AntiTamper);
        }
        if (source.AntiLeakage != null) {
            this.AntiLeakage = new Long(source.AntiLeakage);
        }
        if (source.RateLimit != null) {
            this.RateLimit = new Long(source.RateLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "WebSecurity", this.WebSecurity);
        this.setParamSimple(map, prefix + "AccessControl", this.AccessControl);
        this.setParamSimple(map, prefix + "CcProtection", this.CcProtection);
        this.setParamSimple(map, prefix + "ApiProtection", this.ApiProtection);
        this.setParamSimple(map, prefix + "AntiTamper", this.AntiTamper);
        this.setParamSimple(map, prefix + "AntiLeakage", this.AntiLeakage);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);

    }
}

