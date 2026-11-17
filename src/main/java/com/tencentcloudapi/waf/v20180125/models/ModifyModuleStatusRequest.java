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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleStatusRequest extends AbstractModel {

    /**
    * <p>需要设置的domain</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Web 安全模块开关，0或1</p>
    */
    @SerializedName("WebSecurity")
    @Expose
    private Long WebSecurity;

    /**
    * <p>访问控制模块开关，0或者1</p>
    */
    @SerializedName("AccessControl")
    @Expose
    private Long AccessControl;

    /**
    * <p>CC模块开关，0或者1</p>
    */
    @SerializedName("CcProtection")
    @Expose
    private Long CcProtection;

    /**
    * <p>API安全模块开关，0或者1</p>
    */
    @SerializedName("ApiProtection")
    @Expose
    private Long ApiProtection;

    /**
    * <p>API安全检测开关，0关闭1开启</p>
    */
    @SerializedName("ApiDetect")
    @Expose
    private Long ApiDetect;

    /**
    * <p>防篡改模块开关，0或者1</p>
    */
    @SerializedName("AntiTamper")
    @Expose
    private Long AntiTamper;

    /**
    * <p>防泄漏模块开关，0或者1</p>
    */
    @SerializedName("AntiLeakage")
    @Expose
    private Long AntiLeakage;

    /**
    * <p>限流模块开关，0或1</p>
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
    * <p>gzip 开关</p>
    */
    @SerializedName("GzipAnalysis")
    @Expose
    private Long GzipAnalysis;

    /**
     * Get <p>需要设置的domain</p> 
     * @return Domain <p>需要设置的domain</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>需要设置的domain</p>
     * @param Domain <p>需要设置的domain</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Web 安全模块开关，0或1</p> 
     * @return WebSecurity <p>Web 安全模块开关，0或1</p>
     */
    public Long getWebSecurity() {
        return this.WebSecurity;
    }

    /**
     * Set <p>Web 安全模块开关，0或1</p>
     * @param WebSecurity <p>Web 安全模块开关，0或1</p>
     */
    public void setWebSecurity(Long WebSecurity) {
        this.WebSecurity = WebSecurity;
    }

    /**
     * Get <p>访问控制模块开关，0或者1</p> 
     * @return AccessControl <p>访问控制模块开关，0或者1</p>
     */
    public Long getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set <p>访问控制模块开关，0或者1</p>
     * @param AccessControl <p>访问控制模块开关，0或者1</p>
     */
    public void setAccessControl(Long AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get <p>CC模块开关，0或者1</p> 
     * @return CcProtection <p>CC模块开关，0或者1</p>
     */
    public Long getCcProtection() {
        return this.CcProtection;
    }

    /**
     * Set <p>CC模块开关，0或者1</p>
     * @param CcProtection <p>CC模块开关，0或者1</p>
     */
    public void setCcProtection(Long CcProtection) {
        this.CcProtection = CcProtection;
    }

    /**
     * Get <p>API安全模块开关，0或者1</p> 
     * @return ApiProtection <p>API安全模块开关，0或者1</p>
     */
    public Long getApiProtection() {
        return this.ApiProtection;
    }

    /**
     * Set <p>API安全模块开关，0或者1</p>
     * @param ApiProtection <p>API安全模块开关，0或者1</p>
     */
    public void setApiProtection(Long ApiProtection) {
        this.ApiProtection = ApiProtection;
    }

    /**
     * Get <p>API安全检测开关，0关闭1开启</p> 
     * @return ApiDetect <p>API安全检测开关，0关闭1开启</p>
     */
    public Long getApiDetect() {
        return this.ApiDetect;
    }

    /**
     * Set <p>API安全检测开关，0关闭1开启</p>
     * @param ApiDetect <p>API安全检测开关，0关闭1开启</p>
     */
    public void setApiDetect(Long ApiDetect) {
        this.ApiDetect = ApiDetect;
    }

    /**
     * Get <p>防篡改模块开关，0或者1</p> 
     * @return AntiTamper <p>防篡改模块开关，0或者1</p>
     */
    public Long getAntiTamper() {
        return this.AntiTamper;
    }

    /**
     * Set <p>防篡改模块开关，0或者1</p>
     * @param AntiTamper <p>防篡改模块开关，0或者1</p>
     */
    public void setAntiTamper(Long AntiTamper) {
        this.AntiTamper = AntiTamper;
    }

    /**
     * Get <p>防泄漏模块开关，0或者1</p> 
     * @return AntiLeakage <p>防泄漏模块开关，0或者1</p>
     */
    public Long getAntiLeakage() {
        return this.AntiLeakage;
    }

    /**
     * Set <p>防泄漏模块开关，0或者1</p>
     * @param AntiLeakage <p>防泄漏模块开关，0或者1</p>
     */
    public void setAntiLeakage(Long AntiLeakage) {
        this.AntiLeakage = AntiLeakage;
    }

    /**
     * Get <p>限流模块开关，0或1</p> 
     * @return RateLimit <p>限流模块开关，0或1</p>
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set <p>限流模块开关，0或1</p>
     * @param RateLimit <p>限流模块开关，0或1</p>
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Get <p>gzip 开关</p> 
     * @return GzipAnalysis <p>gzip 开关</p>
     */
    public Long getGzipAnalysis() {
        return this.GzipAnalysis;
    }

    /**
     * Set <p>gzip 开关</p>
     * @param GzipAnalysis <p>gzip 开关</p>
     */
    public void setGzipAnalysis(Long GzipAnalysis) {
        this.GzipAnalysis = GzipAnalysis;
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
        if (source.ApiDetect != null) {
            this.ApiDetect = new Long(source.ApiDetect);
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
        if (source.GzipAnalysis != null) {
            this.GzipAnalysis = new Long(source.GzipAnalysis);
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
        this.setParamSimple(map, prefix + "ApiDetect", this.ApiDetect);
        this.setParamSimple(map, prefix + "AntiTamper", this.AntiTamper);
        this.setParamSimple(map, prefix + "AntiLeakage", this.AntiLeakage);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "GzipAnalysis", this.GzipAnalysis);

    }
}

