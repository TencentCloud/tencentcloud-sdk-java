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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusResponse extends AbstractModel{

    /**
    * SSL 证书下载地址。
    */
    @SerializedName("CertDownloadUrl")
    @Expose
    private String CertDownloadUrl;

    /**
    * 证书下载链接到期时间。
    */
    @SerializedName("UrlExpiredTime")
    @Expose
    private String UrlExpiredTime;

    /**
    * 标识实例开启 SSL 功能。
- true：开启 。
- false：关闭。
    */
    @SerializedName("SSLConfig")
    @Expose
    private Boolean SSLConfig;

    /**
    * 标识实例是否支持 SSL特性。
- true：支持。
- false：不支持。
    */
    @SerializedName("FeatureSupport")
    @Expose
    private Boolean FeatureSupport;

    /**
    * 说明配置 SSL 的状态。
- 1: 配置中。
- 2：配置成功。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SSL 证书下载地址。 
     * @return CertDownloadUrl SSL 证书下载地址。
     */
    public String getCertDownloadUrl() {
        return this.CertDownloadUrl;
    }

    /**
     * Set SSL 证书下载地址。
     * @param CertDownloadUrl SSL 证书下载地址。
     */
    public void setCertDownloadUrl(String CertDownloadUrl) {
        this.CertDownloadUrl = CertDownloadUrl;
    }

    /**
     * Get 证书下载链接到期时间。 
     * @return UrlExpiredTime 证书下载链接到期时间。
     */
    public String getUrlExpiredTime() {
        return this.UrlExpiredTime;
    }

    /**
     * Set 证书下载链接到期时间。
     * @param UrlExpiredTime 证书下载链接到期时间。
     */
    public void setUrlExpiredTime(String UrlExpiredTime) {
        this.UrlExpiredTime = UrlExpiredTime;
    }

    /**
     * Get 标识实例开启 SSL 功能。
- true：开启 。
- false：关闭。 
     * @return SSLConfig 标识实例开启 SSL 功能。
- true：开启 。
- false：关闭。
     */
    public Boolean getSSLConfig() {
        return this.SSLConfig;
    }

    /**
     * Set 标识实例开启 SSL 功能。
- true：开启 。
- false：关闭。
     * @param SSLConfig 标识实例开启 SSL 功能。
- true：开启 。
- false：关闭。
     */
    public void setSSLConfig(Boolean SSLConfig) {
        this.SSLConfig = SSLConfig;
    }

    /**
     * Get 标识实例是否支持 SSL特性。
- true：支持。
- false：不支持。 
     * @return FeatureSupport 标识实例是否支持 SSL特性。
- true：支持。
- false：不支持。
     */
    public Boolean getFeatureSupport() {
        return this.FeatureSupport;
    }

    /**
     * Set 标识实例是否支持 SSL特性。
- true：支持。
- false：不支持。
     * @param FeatureSupport 标识实例是否支持 SSL特性。
- true：支持。
- false：不支持。
     */
    public void setFeatureSupport(Boolean FeatureSupport) {
        this.FeatureSupport = FeatureSupport;
    }

    /**
     * Get 说明配置 SSL 的状态。
- 1: 配置中。
- 2：配置成功。 
     * @return Status 说明配置 SSL 的状态。
- 1: 配置中。
- 2：配置成功。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 说明配置 SSL 的状态。
- 1: 配置中。
- 2：配置成功。
     * @param Status 说明配置 SSL 的状态。
- 1: 配置中。
- 2：配置成功。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSSLStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSSLStatusResponse(DescribeSSLStatusResponse source) {
        if (source.CertDownloadUrl != null) {
            this.CertDownloadUrl = new String(source.CertDownloadUrl);
        }
        if (source.UrlExpiredTime != null) {
            this.UrlExpiredTime = new String(source.UrlExpiredTime);
        }
        if (source.SSLConfig != null) {
            this.SSLConfig = new Boolean(source.SSLConfig);
        }
        if (source.FeatureSupport != null) {
            this.FeatureSupport = new Boolean(source.FeatureSupport);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertDownloadUrl", this.CertDownloadUrl);
        this.setParamSimple(map, prefix + "UrlExpiredTime", this.UrlExpiredTime);
        this.setParamSimple(map, prefix + "SSLConfig", this.SSLConfig);
        this.setParamSimple(map, prefix + "FeatureSupport", this.FeatureSupport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

