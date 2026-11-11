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

public class UpdateSSLCertRequest extends AbstractModel {

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 用户自定义KMS</li></ul>
    */
    @SerializedName("CertSource")
    @Expose
    private Long CertSource;

    /**
    * <p>切换时间。（该参数废弃，不再生效）</p><p>枚举值：</p><ul><li>1： 维护时间窗操作：指开启SSL加密在设置的维护时间窗内执行。请通过接口DescribeMaintenanceWindow查询设置的维护时间窗时间段</li><li>2： 立即操作：操作将立即执行，无需等待维护时间窗。系统默认设置为立即操作。</li></ul>
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
    * <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0： 不限。</li><li>1： 内网IPv4。</li><li>2： 内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul>
    */
    @SerializedName("AddressType")
    @Expose
    private Long AddressType;

    /**
    * <p>KMS的密钥ID。（该参数废弃，不再生效）</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>KMS地域信息。（该参数废弃，不再生效）</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * <p>SSL 证书服务的证书 ID，CertSource=1 时必填</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>最低 TLS 版本</p><p>枚举值：</p><ul><li>TLSv1.0： TLSv1.0</li><li>TLSv1.1： TLSv1.1</li><li>TLSv1.2： TLSv1.2</li></ul>
    */
    @SerializedName("SSLMinVersion")
    @Expose
    private String SSLMinVersion;

    /**
    * <p>目标加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
    */
    @SerializedName("EncryptionMode")
    @Expose
    private String EncryptionMode;

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 用户自定义KMS</li></ul> 
     * @return CertSource <p>密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 用户自定义KMS</li></ul>
     */
    public Long getCertSource() {
        return this.CertSource;
    }

    /**
     * Set <p>密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 用户自定义KMS</li></ul>
     * @param CertSource <p>密钥类型。</p><p>枚举值：</p><ul><li>0： 腾讯云提供</li><li>1： 用户自定义KMS</li></ul>
     */
    public void setCertSource(Long CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get <p>切换时间。（该参数废弃，不再生效）</p><p>枚举值：</p><ul><li>1： 维护时间窗操作：指开启SSL加密在设置的维护时间窗内执行。请通过接口DescribeMaintenanceWindow查询设置的维护时间窗时间段</li><li>2： 立即操作：操作将立即执行，无需等待维护时间窗。系统默认设置为立即操作。</li></ul> 
     * @return SwitchOption <p>切换时间。（该参数废弃，不再生效）</p><p>枚举值：</p><ul><li>1： 维护时间窗操作：指开启SSL加密在设置的维护时间窗内执行。请通过接口DescribeMaintenanceWindow查询设置的维护时间窗时间段</li><li>2： 立即操作：操作将立即执行，无需等待维护时间窗。系统默认设置为立即操作。</li></ul>
     * @deprecated
     */
    @Deprecated
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set <p>切换时间。（该参数废弃，不再生效）</p><p>枚举值：</p><ul><li>1： 维护时间窗操作：指开启SSL加密在设置的维护时间窗内执行。请通过接口DescribeMaintenanceWindow查询设置的维护时间窗时间段</li><li>2： 立即操作：操作将立即执行，无需等待维护时间窗。系统默认设置为立即操作。</li></ul>
     * @param SwitchOption <p>切换时间。（该参数废弃，不再生效）</p><p>枚举值：</p><ul><li>1： 维护时间窗操作：指开启SSL加密在设置的维护时间窗内执行。请通过接口DescribeMaintenanceWindow查询设置的维护时间窗时间段</li><li>2： 立即操作：操作将立即执行，无需等待维护时间窗。系统默认设置为立即操作。</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    /**
     * Get <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0： 不限。</li><li>1： 内网IPv4。</li><li>2： 内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul> 
     * @return AddressType <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0： 不限。</li><li>1： 内网IPv4。</li><li>2： 内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul>
     */
    public Long getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0： 不限。</li><li>1： 内网IPv4。</li><li>2： 内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul>
     * @param AddressType <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0： 不限。</li><li>1： 内网IPv4。</li><li>2： 内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul>
     */
    public void setAddressType(Long AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>KMS的密钥ID。（该参数废弃，不再生效）</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p> 
     * @return KmsKeyId <p>KMS的密钥ID。（该参数废弃，不再生效）</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     * @deprecated
     */
    @Deprecated
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS的密钥ID。（该参数废弃，不再生效）</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     * @param KmsKeyId <p>KMS的密钥ID。（该参数废弃，不再生效）</p><p>参数格式：xxxxxxx-xxxx-xxxx-xxxx-xxxxxxx</p>
     * @deprecated
     */
    @Deprecated
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>KMS地域信息。（该参数废弃，不再生效）</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p> 
     * @return KmsRegion <p>KMS地域信息。（该参数废弃，不再生效）</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
     * @deprecated
     */
    @Deprecated
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set <p>KMS地域信息。（该参数废弃，不再生效）</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
     * @param KmsRegion <p>KMS地域信息。（该参数废弃，不再生效）</p><p>参数格式：ap-xxxx</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/573/34406#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">KMS支持的地域列表</a></p>
     * @deprecated
     */
    @Deprecated
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
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
     * Get <p>目标加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul> 
     * @return EncryptionMode <p>目标加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
     */
    public String getEncryptionMode() {
        return this.EncryptionMode;
    }

    /**
     * Set <p>目标加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
     * @param EncryptionMode <p>目标加密模式</p><p>枚举值：</p><ul><li>required： 强制加密</li><li>flexible： 兼容模式</li></ul>
     */
    public void setEncryptionMode(String EncryptionMode) {
        this.EncryptionMode = EncryptionMode;
    }

    public UpdateSSLCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSSLCertRequest(UpdateSSLCertRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CertSource != null) {
            this.CertSource = new Long(source.CertSource);
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
        if (source.AddressType != null) {
            this.AddressType = new Long(source.AddressType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.SSLMinVersion != null) {
            this.SSLMinVersion = new String(source.SSLMinVersion);
        }
        if (source.EncryptionMode != null) {
            this.EncryptionMode = new String(source.EncryptionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "SSLMinVersion", this.SSLMinVersion);
        this.setParamSimple(map, prefix + "EncryptionMode", this.EncryptionMode);

    }
}

