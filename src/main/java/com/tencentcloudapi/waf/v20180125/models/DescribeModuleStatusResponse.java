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

public class DescribeModuleStatusResponse extends AbstractModel {

    /**
    * WEB安全规则是否开启
    */
    @SerializedName("WebSecurity")
    @Expose
    private Long WebSecurity;

    /**
    * 访问控制规则是否开启
    */
    @SerializedName("AccessControl")
    @Expose
    private Long AccessControl;

    /**
    * CC防护是否开启
    */
    @SerializedName("CcProtection")
    @Expose
    private Long CcProtection;

    /**
    * 网页防篡改是否开启
    */
    @SerializedName("AntiTamper")
    @Expose
    private Long AntiTamper;

    /**
    * 信息防泄漏是否开启
    */
    @SerializedName("AntiLeakage")
    @Expose
    private Long AntiLeakage;

    /**
    * API安全是否开启
    */
    @SerializedName("ApiProtection")
    @Expose
    private Long ApiProtection;

    /**
    * 限流模块开关
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
    * gzip 开关
    */
    @SerializedName("GzipAnalysis")
    @Expose
    private Long GzipAnalysis;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get WEB安全规则是否开启 
     * @return WebSecurity WEB安全规则是否开启
     */
    public Long getWebSecurity() {
        return this.WebSecurity;
    }

    /**
     * Set WEB安全规则是否开启
     * @param WebSecurity WEB安全规则是否开启
     */
    public void setWebSecurity(Long WebSecurity) {
        this.WebSecurity = WebSecurity;
    }

    /**
     * Get 访问控制规则是否开启 
     * @return AccessControl 访问控制规则是否开启
     */
    public Long getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 访问控制规则是否开启
     * @param AccessControl 访问控制规则是否开启
     */
    public void setAccessControl(Long AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get CC防护是否开启 
     * @return CcProtection CC防护是否开启
     */
    public Long getCcProtection() {
        return this.CcProtection;
    }

    /**
     * Set CC防护是否开启
     * @param CcProtection CC防护是否开启
     */
    public void setCcProtection(Long CcProtection) {
        this.CcProtection = CcProtection;
    }

    /**
     * Get 网页防篡改是否开启 
     * @return AntiTamper 网页防篡改是否开启
     */
    public Long getAntiTamper() {
        return this.AntiTamper;
    }

    /**
     * Set 网页防篡改是否开启
     * @param AntiTamper 网页防篡改是否开启
     */
    public void setAntiTamper(Long AntiTamper) {
        this.AntiTamper = AntiTamper;
    }

    /**
     * Get 信息防泄漏是否开启 
     * @return AntiLeakage 信息防泄漏是否开启
     */
    public Long getAntiLeakage() {
        return this.AntiLeakage;
    }

    /**
     * Set 信息防泄漏是否开启
     * @param AntiLeakage 信息防泄漏是否开启
     */
    public void setAntiLeakage(Long AntiLeakage) {
        this.AntiLeakage = AntiLeakage;
    }

    /**
     * Get API安全是否开启 
     * @return ApiProtection API安全是否开启
     */
    public Long getApiProtection() {
        return this.ApiProtection;
    }

    /**
     * Set API安全是否开启
     * @param ApiProtection API安全是否开启
     */
    public void setApiProtection(Long ApiProtection) {
        this.ApiProtection = ApiProtection;
    }

    /**
     * Get 限流模块开关 
     * @return RateLimit 限流模块开关
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set 限流模块开关
     * @param RateLimit 限流模块开关
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Get gzip 开关 
     * @return GzipAnalysis gzip 开关
     */
    public Long getGzipAnalysis() {
        return this.GzipAnalysis;
    }

    /**
     * Set gzip 开关
     * @param GzipAnalysis gzip 开关
     */
    public void setGzipAnalysis(Long GzipAnalysis) {
        this.GzipAnalysis = GzipAnalysis;
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

    public DescribeModuleStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModuleStatusResponse(DescribeModuleStatusResponse source) {
        if (source.WebSecurity != null) {
            this.WebSecurity = new Long(source.WebSecurity);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new Long(source.AccessControl);
        }
        if (source.CcProtection != null) {
            this.CcProtection = new Long(source.CcProtection);
        }
        if (source.AntiTamper != null) {
            this.AntiTamper = new Long(source.AntiTamper);
        }
        if (source.AntiLeakage != null) {
            this.AntiLeakage = new Long(source.AntiLeakage);
        }
        if (source.ApiProtection != null) {
            this.ApiProtection = new Long(source.ApiProtection);
        }
        if (source.RateLimit != null) {
            this.RateLimit = new Long(source.RateLimit);
        }
        if (source.GzipAnalysis != null) {
            this.GzipAnalysis = new Long(source.GzipAnalysis);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebSecurity", this.WebSecurity);
        this.setParamSimple(map, prefix + "AccessControl", this.AccessControl);
        this.setParamSimple(map, prefix + "CcProtection", this.CcProtection);
        this.setParamSimple(map, prefix + "AntiTamper", this.AntiTamper);
        this.setParamSimple(map, prefix + "AntiLeakage", this.AntiLeakage);
        this.setParamSimple(map, prefix + "ApiProtection", this.ApiProtection);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "GzipAnalysis", this.GzipAnalysis);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

