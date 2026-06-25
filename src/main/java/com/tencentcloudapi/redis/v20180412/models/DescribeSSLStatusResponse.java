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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusResponse extends AbstractModel {

    /**
    * <p>SSL 证书下载地址。</p>
    */
    @SerializedName("CertDownloadUrl")
    @Expose
    private String CertDownloadUrl;

    /**
    * <p>证书下载链接到期时间。</p>
    */
    @SerializedName("UrlExpiredTime")
    @Expose
    private String UrlExpiredTime;

    /**
    * <p>标识实例开启 SSL 功能。</p><ul><li>true：开启 。</li><li>false：关闭。</li></ul>
    */
    @SerializedName("SSLConfig")
    @Expose
    private Boolean SSLConfig;

    /**
    * <p>标识实例是否支持 SSL特性。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
    */
    @SerializedName("FeatureSupport")
    @Expose
    private Boolean FeatureSupport;

    /**
    * <p>说明配置 SSL 的状态。</p><ul><li>1: 配置中。</li><li>2：配置成功。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>地址类型</p><p>枚举值：</p><ul><li>0： 不限</li><li>1： 内网IPv4</li><li>2： 内网IPv6</li><li>3： 外网</li><li>-1： 未指定</li></ul>
    */
    @SerializedName("AddressType")
    @Expose
    private Long AddressType;

    /**
    * <p>当前加密连接地址</p>
    */
    @SerializedName("EncryptAddress")
    @Expose
    private String EncryptAddress;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>SSL 证书下载地址。</p> 
     * @return CertDownloadUrl <p>SSL 证书下载地址。</p>
     */
    public String getCertDownloadUrl() {
        return this.CertDownloadUrl;
    }

    /**
     * Set <p>SSL 证书下载地址。</p>
     * @param CertDownloadUrl <p>SSL 证书下载地址。</p>
     */
    public void setCertDownloadUrl(String CertDownloadUrl) {
        this.CertDownloadUrl = CertDownloadUrl;
    }

    /**
     * Get <p>证书下载链接到期时间。</p> 
     * @return UrlExpiredTime <p>证书下载链接到期时间。</p>
     */
    public String getUrlExpiredTime() {
        return this.UrlExpiredTime;
    }

    /**
     * Set <p>证书下载链接到期时间。</p>
     * @param UrlExpiredTime <p>证书下载链接到期时间。</p>
     */
    public void setUrlExpiredTime(String UrlExpiredTime) {
        this.UrlExpiredTime = UrlExpiredTime;
    }

    /**
     * Get <p>标识实例开启 SSL 功能。</p><ul><li>true：开启 。</li><li>false：关闭。</li></ul> 
     * @return SSLConfig <p>标识实例开启 SSL 功能。</p><ul><li>true：开启 。</li><li>false：关闭。</li></ul>
     */
    public Boolean getSSLConfig() {
        return this.SSLConfig;
    }

    /**
     * Set <p>标识实例开启 SSL 功能。</p><ul><li>true：开启 。</li><li>false：关闭。</li></ul>
     * @param SSLConfig <p>标识实例开启 SSL 功能。</p><ul><li>true：开启 。</li><li>false：关闭。</li></ul>
     */
    public void setSSLConfig(Boolean SSLConfig) {
        this.SSLConfig = SSLConfig;
    }

    /**
     * Get <p>标识实例是否支持 SSL特性。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul> 
     * @return FeatureSupport <p>标识实例是否支持 SSL特性。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
     */
    public Boolean getFeatureSupport() {
        return this.FeatureSupport;
    }

    /**
     * Set <p>标识实例是否支持 SSL特性。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
     * @param FeatureSupport <p>标识实例是否支持 SSL特性。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
     */
    public void setFeatureSupport(Boolean FeatureSupport) {
        this.FeatureSupport = FeatureSupport;
    }

    /**
     * Get <p>说明配置 SSL 的状态。</p><ul><li>1: 配置中。</li><li>2：配置成功。</li></ul> 
     * @return Status <p>说明配置 SSL 的状态。</p><ul><li>1: 配置中。</li><li>2：配置成功。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>说明配置 SSL 的状态。</p><ul><li>1: 配置中。</li><li>2：配置成功。</li></ul>
     * @param Status <p>说明配置 SSL 的状态。</p><ul><li>1: 配置中。</li><li>2：配置成功。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地址类型</p><p>枚举值：</p><ul><li>0： 不限</li><li>1： 内网IPv4</li><li>2： 内网IPv6</li><li>3： 外网</li><li>-1： 未指定</li></ul> 
     * @return AddressType <p>地址类型</p><p>枚举值：</p><ul><li>0： 不限</li><li>1： 内网IPv4</li><li>2： 内网IPv6</li><li>3： 外网</li><li>-1： 未指定</li></ul>
     */
    public Long getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>地址类型</p><p>枚举值：</p><ul><li>0： 不限</li><li>1： 内网IPv4</li><li>2： 内网IPv6</li><li>3： 外网</li><li>-1： 未指定</li></ul>
     * @param AddressType <p>地址类型</p><p>枚举值：</p><ul><li>0： 不限</li><li>1： 内网IPv4</li><li>2： 内网IPv6</li><li>3： 外网</li><li>-1： 未指定</li></ul>
     */
    public void setAddressType(Long AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>当前加密连接地址</p> 
     * @return EncryptAddress <p>当前加密连接地址</p>
     */
    public String getEncryptAddress() {
        return this.EncryptAddress;
    }

    /**
     * Set <p>当前加密连接地址</p>
     * @param EncryptAddress <p>当前加密连接地址</p>
     */
    public void setEncryptAddress(String EncryptAddress) {
        this.EncryptAddress = EncryptAddress;
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
        if (source.AddressType != null) {
            this.AddressType = new Long(source.AddressType);
        }
        if (source.EncryptAddress != null) {
            this.EncryptAddress = new String(source.EncryptAddress);
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
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "EncryptAddress", this.EncryptAddress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

