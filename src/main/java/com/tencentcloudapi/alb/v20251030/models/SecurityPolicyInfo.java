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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyInfo extends AbstractModel {

    /**
    * 支持的加密套件列表。
支持的加密套件，具体依赖 TLSVersions 的取值。
Cipher 只要被任何一个传入的 TLSVersions 支持即可。

说明：若选择了 TLSv1.3，那么 Cipher 列表必须包含 TLSv1.3 支持的 Cipher。

请调用 DescribeSecurityPolicyCapabilities 接口获取支持的加密套件列表。
    */
    @SerializedName("Ciphers")
    @Expose
    private String [] Ciphers;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 安全策略 ID，格式为 tls- 后接 8 位字母数字。
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * 安全策略名称。长度为2~128个英文或中文字符，必须以字母或中文开头，可包含数字、半角句号（.）、下划线（_）和短划线（-）。
    */
    @SerializedName("SecurityPolicyName")
    @Expose
    private String SecurityPolicyName;

    /**
    * 安全策略状态。当前接口最常返回 Active，表示安全策略处于可用状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 支持的 TLS 协议版本列表。可选值包括：TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3。
    */
    @SerializedName("TLSVersions")
    @Expose
    private String [] TLSVersions;

    /**
    * 标签信息。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 支持的加密套件列表。
支持的加密套件，具体依赖 TLSVersions 的取值。
Cipher 只要被任何一个传入的 TLSVersions 支持即可。

说明：若选择了 TLSv1.3，那么 Cipher 列表必须包含 TLSv1.3 支持的 Cipher。

请调用 DescribeSecurityPolicyCapabilities 接口获取支持的加密套件列表。 
     * @return Ciphers 支持的加密套件列表。
支持的加密套件，具体依赖 TLSVersions 的取值。
Cipher 只要被任何一个传入的 TLSVersions 支持即可。

说明：若选择了 TLSv1.3，那么 Cipher 列表必须包含 TLSv1.3 支持的 Cipher。

请调用 DescribeSecurityPolicyCapabilities 接口获取支持的加密套件列表。
     */
    public String [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set 支持的加密套件列表。
支持的加密套件，具体依赖 TLSVersions 的取值。
Cipher 只要被任何一个传入的 TLSVersions 支持即可。

说明：若选择了 TLSv1.3，那么 Cipher 列表必须包含 TLSv1.3 支持的 Cipher。

请调用 DescribeSecurityPolicyCapabilities 接口获取支持的加密套件列表。
     * @param Ciphers 支持的加密套件列表。
支持的加密套件，具体依赖 TLSVersions 的取值。
Cipher 只要被任何一个传入的 TLSVersions 支持即可。

说明：若选择了 TLSv1.3，那么 Cipher 列表必须包含 TLSv1.3 支持的 Cipher。

请调用 DescribeSecurityPolicyCapabilities 接口获取支持的加密套件列表。
     */
    public void setCiphers(String [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 安全策略 ID，格式为 tls- 后接 8 位字母数字。 
     * @return SecurityPolicyId 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     * @param SecurityPolicyId 安全策略 ID，格式为 tls- 后接 8 位字母数字。
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get 安全策略名称。长度为2~128个英文或中文字符，必须以字母或中文开头，可包含数字、半角句号（.）、下划线（_）和短划线（-）。 
     * @return SecurityPolicyName 安全策略名称。长度为2~128个英文或中文字符，必须以字母或中文开头，可包含数字、半角句号（.）、下划线（_）和短划线（-）。
     */
    public String getSecurityPolicyName() {
        return this.SecurityPolicyName;
    }

    /**
     * Set 安全策略名称。长度为2~128个英文或中文字符，必须以字母或中文开头，可包含数字、半角句号（.）、下划线（_）和短划线（-）。
     * @param SecurityPolicyName 安全策略名称。长度为2~128个英文或中文字符，必须以字母或中文开头，可包含数字、半角句号（.）、下划线（_）和短划线（-）。
     */
    public void setSecurityPolicyName(String SecurityPolicyName) {
        this.SecurityPolicyName = SecurityPolicyName;
    }

    /**
     * Get 安全策略状态。当前接口最常返回 Active，表示安全策略处于可用状态。 
     * @return Status 安全策略状态。当前接口最常返回 Active，表示安全策略处于可用状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 安全策略状态。当前接口最常返回 Active，表示安全策略处于可用状态。
     * @param Status 安全策略状态。当前接口最常返回 Active，表示安全策略处于可用状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 支持的 TLS 协议版本列表。可选值包括：TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3。 
     * @return TLSVersions 支持的 TLS 协议版本列表。可选值包括：TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3。
     */
    public String [] getTLSVersions() {
        return this.TLSVersions;
    }

    /**
     * Set 支持的 TLS 协议版本列表。可选值包括：TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3。
     * @param TLSVersions 支持的 TLS 协议版本列表。可选值包括：TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3。
     */
    public void setTLSVersions(String [] TLSVersions) {
        this.TLSVersions = TLSVersions;
    }

    /**
     * Get 标签信息。 
     * @return Tags 标签信息。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息。
     * @param Tags 标签信息。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public SecurityPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyInfo(SecurityPolicyInfo source) {
        if (source.Ciphers != null) {
            this.Ciphers = new String[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new String(source.Ciphers[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SecurityPolicyId != null) {
            this.SecurityPolicyId = new String(source.SecurityPolicyId);
        }
        if (source.SecurityPolicyName != null) {
            this.SecurityPolicyName = new String(source.SecurityPolicyName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TLSVersions != null) {
            this.TLSVersions = new String[source.TLSVersions.length];
            for (int i = 0; i < source.TLSVersions.length; i++) {
                this.TLSVersions[i] = new String(source.TLSVersions[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamSimple(map, prefix + "SecurityPolicyName", this.SecurityPolicyName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "TLSVersions.", this.TLSVersions);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

