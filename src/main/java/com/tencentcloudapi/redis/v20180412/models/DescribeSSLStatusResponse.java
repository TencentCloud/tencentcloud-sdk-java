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
    * <p>密钥来源</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 自定义证书</li></ul>
    */
    @SerializedName("CertSource")
    @Expose
    private Long CertSource;

    /**
    * <p>证书有效性</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 即将过期（30天内）</li><li>2： 已过期</li><li>404： 证书已被删除</li><li>500： 查询异常</li></ul>
    */
    @SerializedName("CertStatus")
    @Expose
    private Long CertStatus;

    /**
    * <p>SSL 证书服务的证书 ID，CertSource=1 时必填</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>证书别名</p>
    */
    @SerializedName("CertAlias")
    @Expose
    private String CertAlias;

    /**
    * <p>证书到期时间</p><p>参数格式：时间格式YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * <p>证书关联域名（SAN）</p><p>包括了IP</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>最低 TLS 版本</p><p>枚举值：</p><ul><li>TLSv1.0： TLSv1.0</li><li>TLSv1.1： TLSv1.1</li><li>TLSv1.2： TLSv1.2</li></ul>
    */
    @SerializedName("SSLMinVersion")
    @Expose
    private String SSLMinVersion;

    /**
    * <p>当前加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
    */
    @SerializedName("EncryptionMode")
    @Expose
    private String EncryptionMode;

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
     * Get <p>密钥来源</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 自定义证书</li></ul> 
     * @return CertSource <p>密钥来源</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 自定义证书</li></ul>
     */
    public Long getCertSource() {
        return this.CertSource;
    }

    /**
     * Set <p>密钥来源</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 自定义证书</li></ul>
     * @param CertSource <p>密钥来源</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 自定义证书</li></ul>
     */
    public void setCertSource(Long CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get <p>证书有效性</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 即将过期（30天内）</li><li>2： 已过期</li><li>404： 证书已被删除</li><li>500： 查询异常</li></ul> 
     * @return CertStatus <p>证书有效性</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 即将过期（30天内）</li><li>2： 已过期</li><li>404： 证书已被删除</li><li>500： 查询异常</li></ul>
     */
    public Long getCertStatus() {
        return this.CertStatus;
    }

    /**
     * Set <p>证书有效性</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 即将过期（30天内）</li><li>2： 已过期</li><li>404： 证书已被删除</li><li>500： 查询异常</li></ul>
     * @param CertStatus <p>证书有效性</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 即将过期（30天内）</li><li>2： 已过期</li><li>404： 证书已被删除</li><li>500： 查询异常</li></ul>
     */
    public void setCertStatus(Long CertStatus) {
        this.CertStatus = CertStatus;
    }

    /**
     * Get <p>SSL 证书服务的证书 ID，CertSource=1 时必填</p> 
     * @return CertId <p>SSL 证书服务的证书 ID，CertSource=1 时必填</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>SSL 证书服务的证书 ID，CertSource=1 时必填</p>
     * @param CertId <p>SSL 证书服务的证书 ID，CertSource=1 时必填</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>证书别名</p> 
     * @return CertAlias <p>证书别名</p>
     */
    public String getCertAlias() {
        return this.CertAlias;
    }

    /**
     * Set <p>证书别名</p>
     * @param CertAlias <p>证书别名</p>
     */
    public void setCertAlias(String CertAlias) {
        this.CertAlias = CertAlias;
    }

    /**
     * Get <p>证书到期时间</p><p>参数格式：时间格式YYYY-MM-DD hh:mm:ss</p> 
     * @return CertExpireTime <p>证书到期时间</p><p>参数格式：时间格式YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set <p>证书到期时间</p><p>参数格式：时间格式YYYY-MM-DD hh:mm:ss</p>
     * @param CertExpireTime <p>证书到期时间</p><p>参数格式：时间格式YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get <p>证书关联域名（SAN）</p><p>包括了IP</p> 
     * @return Domain <p>证书关联域名（SAN）</p><p>包括了IP</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>证书关联域名（SAN）</p><p>包括了IP</p>
     * @param Domain <p>证书关联域名（SAN）</p><p>包括了IP</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>最低 TLS 版本</p><p>枚举值：</p><ul><li>TLSv1.0： TLSv1.0</li><li>TLSv1.1： TLSv1.1</li><li>TLSv1.2： TLSv1.2</li></ul> 
     * @return SSLMinVersion <p>最低 TLS 版本</p><p>枚举值：</p><ul><li>TLSv1.0： TLSv1.0</li><li>TLSv1.1： TLSv1.1</li><li>TLSv1.2： TLSv1.2</li></ul>
     */
    public String getSSLMinVersion() {
        return this.SSLMinVersion;
    }

    /**
     * Set <p>最低 TLS 版本</p><p>枚举值：</p><ul><li>TLSv1.0： TLSv1.0</li><li>TLSv1.1： TLSv1.1</li><li>TLSv1.2： TLSv1.2</li></ul>
     * @param SSLMinVersion <p>最低 TLS 版本</p><p>枚举值：</p><ul><li>TLSv1.0： TLSv1.0</li><li>TLSv1.1： TLSv1.1</li><li>TLSv1.2： TLSv1.2</li></ul>
     */
    public void setSSLMinVersion(String SSLMinVersion) {
        this.SSLMinVersion = SSLMinVersion;
    }

    /**
     * Get <p>当前加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul> 
     * @return EncryptionMode <p>当前加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
     */
    public String getEncryptionMode() {
        return this.EncryptionMode;
    }

    /**
     * Set <p>当前加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
     * @param EncryptionMode <p>当前加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
     */
    public void setEncryptionMode(String EncryptionMode) {
        this.EncryptionMode = EncryptionMode;
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
        if (source.CertSource != null) {
            this.CertSource = new Long(source.CertSource);
        }
        if (source.CertStatus != null) {
            this.CertStatus = new Long(source.CertStatus);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertAlias != null) {
            this.CertAlias = new String(source.CertAlias);
        }
        if (source.CertExpireTime != null) {
            this.CertExpireTime = new String(source.CertExpireTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SSLMinVersion != null) {
            this.SSLMinVersion = new String(source.SSLMinVersion);
        }
        if (source.EncryptionMode != null) {
            this.EncryptionMode = new String(source.EncryptionMode);
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
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "CertStatus", this.CertStatus);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertAlias", this.CertAlias);
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SSLMinVersion", this.SSLMinVersion);
        this.setParamSimple(map, prefix + "EncryptionMode", this.EncryptionMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

