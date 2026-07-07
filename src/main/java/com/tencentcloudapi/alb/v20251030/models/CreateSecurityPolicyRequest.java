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

public class CreateSecurityPolicyRequest extends AbstractModel {

    /**
    * 安全策略支持的加密套件列表。加密套件用于协商客户端与服务端之间的加密算法。

**配置说明：**
- 加密套件的可选范围取决于所选的 TLS 协议版本（TLSVersions 参数）。
- 只要加密套件被任意一个已选 TLS 版本支持，即可添加到列表中。
- 若 TLSVersions 包含 TLSv1.3：可不指定 TLSv1.3 专属加密套件（系统将自动补全全部 TLSv1.3 套件）；若指定，则必须包含全部 TLSv1.3 专属加密套件，不支持仅指定部分。

**获取可用加密套件：**
请调用 [DescribeSecurityPolicyCapabilities](https://cloud.tencent.com/document/api/xxx) 接口查询各 TLS 版本支持的加密套件列表。

    */
    @SerializedName("Ciphers")
    @Expose
    private String [] Ciphers;

    /**
    * 安全策略支持的 TLS 协议版本列表。TLS（Transport Layer Security）协议用于保障客户端与负载均衡之间的通信安全。

**可选值：**
- **TLSv1.0**：兼容性最好，但安全性较低，不推荐在生产环境使用。
- **TLSv1.1**：安全性略优于 TLSv1.0，但仍不推荐。
- **TLSv1.2**：目前主流的安全协议版本，兼顾安全性与兼容性。
- **TLSv1.3**：最新版本，安全性最高，性能更优，推荐优先使用。

**建议：** 生产环境建议至少选择 TLSv1.2，若客户端支持，优先启用 TLSv1.3。

    */
    @SerializedName("TLSVersions")
    @Expose
    private String [] TLSVersions;

    /**
    * 客户端幂等性令牌。

用于保证请求的幂等性，防止因网络超时或客户端重试导致的重复创建。建议使用 UUID 作为令牌值。相同的 ClientToken 在有效期内重复请求时，服务端将返回相同的结果。

    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际创建资源。预检请求将验证参数格式、权限及资源配额等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接创建安全策略。

    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 安全策略名称。用于标识和区分不同的安全策略。

**命名规则：**
- 长度为 2~128 个字符。
- 必须以英文字母或中文开头。
- 可包含英文字母、中文、数字、半角句号（.）、下划线（_）和短划线（-）。

**建议：** 使用具有业务含义的名称，例如 "prod-high-security" 或 "测试环境策略"。

    */
    @SerializedName("SecurityPolicyName")
    @Expose
    private String SecurityPolicyName;

    /**
    * 安全策略的标签列表。标签用于对资源进行分类和管理，便于按业务、环境、部门等维度筛选和组织资源。

每个标签由键值对（Key-Value）组成，同一资源下标签键不可重复。

    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 安全策略支持的加密套件列表。加密套件用于协商客户端与服务端之间的加密算法。

**配置说明：**
- 加密套件的可选范围取决于所选的 TLS 协议版本（TLSVersions 参数）。
- 只要加密套件被任意一个已选 TLS 版本支持，即可添加到列表中。
- 若 TLSVersions 包含 TLSv1.3：可不指定 TLSv1.3 专属加密套件（系统将自动补全全部 TLSv1.3 套件）；若指定，则必须包含全部 TLSv1.3 专属加密套件，不支持仅指定部分。

**获取可用加密套件：**
请调用 [DescribeSecurityPolicyCapabilities](https://cloud.tencent.com/document/api/xxx) 接口查询各 TLS 版本支持的加密套件列表。
 
     * @return Ciphers 安全策略支持的加密套件列表。加密套件用于协商客户端与服务端之间的加密算法。

**配置说明：**
- 加密套件的可选范围取决于所选的 TLS 协议版本（TLSVersions 参数）。
- 只要加密套件被任意一个已选 TLS 版本支持，即可添加到列表中。
- 若 TLSVersions 包含 TLSv1.3：可不指定 TLSv1.3 专属加密套件（系统将自动补全全部 TLSv1.3 套件）；若指定，则必须包含全部 TLSv1.3 专属加密套件，不支持仅指定部分。

**获取可用加密套件：**
请调用 [DescribeSecurityPolicyCapabilities](https://cloud.tencent.com/document/api/xxx) 接口查询各 TLS 版本支持的加密套件列表。

     */
    public String [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set 安全策略支持的加密套件列表。加密套件用于协商客户端与服务端之间的加密算法。

**配置说明：**
- 加密套件的可选范围取决于所选的 TLS 协议版本（TLSVersions 参数）。
- 只要加密套件被任意一个已选 TLS 版本支持，即可添加到列表中。
- 若 TLSVersions 包含 TLSv1.3：可不指定 TLSv1.3 专属加密套件（系统将自动补全全部 TLSv1.3 套件）；若指定，则必须包含全部 TLSv1.3 专属加密套件，不支持仅指定部分。

**获取可用加密套件：**
请调用 [DescribeSecurityPolicyCapabilities](https://cloud.tencent.com/document/api/xxx) 接口查询各 TLS 版本支持的加密套件列表。

     * @param Ciphers 安全策略支持的加密套件列表。加密套件用于协商客户端与服务端之间的加密算法。

**配置说明：**
- 加密套件的可选范围取决于所选的 TLS 协议版本（TLSVersions 参数）。
- 只要加密套件被任意一个已选 TLS 版本支持，即可添加到列表中。
- 若 TLSVersions 包含 TLSv1.3：可不指定 TLSv1.3 专属加密套件（系统将自动补全全部 TLSv1.3 套件）；若指定，则必须包含全部 TLSv1.3 专属加密套件，不支持仅指定部分。

**获取可用加密套件：**
请调用 [DescribeSecurityPolicyCapabilities](https://cloud.tencent.com/document/api/xxx) 接口查询各 TLS 版本支持的加密套件列表。

     */
    public void setCiphers(String [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get 安全策略支持的 TLS 协议版本列表。TLS（Transport Layer Security）协议用于保障客户端与负载均衡之间的通信安全。

**可选值：**
- **TLSv1.0**：兼容性最好，但安全性较低，不推荐在生产环境使用。
- **TLSv1.1**：安全性略优于 TLSv1.0，但仍不推荐。
- **TLSv1.2**：目前主流的安全协议版本，兼顾安全性与兼容性。
- **TLSv1.3**：最新版本，安全性最高，性能更优，推荐优先使用。

**建议：** 生产环境建议至少选择 TLSv1.2，若客户端支持，优先启用 TLSv1.3。
 
     * @return TLSVersions 安全策略支持的 TLS 协议版本列表。TLS（Transport Layer Security）协议用于保障客户端与负载均衡之间的通信安全。

**可选值：**
- **TLSv1.0**：兼容性最好，但安全性较低，不推荐在生产环境使用。
- **TLSv1.1**：安全性略优于 TLSv1.0，但仍不推荐。
- **TLSv1.2**：目前主流的安全协议版本，兼顾安全性与兼容性。
- **TLSv1.3**：最新版本，安全性最高，性能更优，推荐优先使用。

**建议：** 生产环境建议至少选择 TLSv1.2，若客户端支持，优先启用 TLSv1.3。

     */
    public String [] getTLSVersions() {
        return this.TLSVersions;
    }

    /**
     * Set 安全策略支持的 TLS 协议版本列表。TLS（Transport Layer Security）协议用于保障客户端与负载均衡之间的通信安全。

**可选值：**
- **TLSv1.0**：兼容性最好，但安全性较低，不推荐在生产环境使用。
- **TLSv1.1**：安全性略优于 TLSv1.0，但仍不推荐。
- **TLSv1.2**：目前主流的安全协议版本，兼顾安全性与兼容性。
- **TLSv1.3**：最新版本，安全性最高，性能更优，推荐优先使用。

**建议：** 生产环境建议至少选择 TLSv1.2，若客户端支持，优先启用 TLSv1.3。

     * @param TLSVersions 安全策略支持的 TLS 协议版本列表。TLS（Transport Layer Security）协议用于保障客户端与负载均衡之间的通信安全。

**可选值：**
- **TLSv1.0**：兼容性最好，但安全性较低，不推荐在生产环境使用。
- **TLSv1.1**：安全性略优于 TLSv1.0，但仍不推荐。
- **TLSv1.2**：目前主流的安全协议版本，兼顾安全性与兼容性。
- **TLSv1.3**：最新版本，安全性最高，性能更优，推荐优先使用。

**建议：** 生产环境建议至少选择 TLSv1.2，若客户端支持，优先启用 TLSv1.3。

     */
    public void setTLSVersions(String [] TLSVersions) {
        this.TLSVersions = TLSVersions;
    }

    /**
     * Get 客户端幂等性令牌。

用于保证请求的幂等性，防止因网络超时或客户端重试导致的重复创建。建议使用 UUID 作为令牌值。相同的 ClientToken 在有效期内重复请求时，服务端将返回相同的结果。
 
     * @return ClientToken 客户端幂等性令牌。

用于保证请求的幂等性，防止因网络超时或客户端重试导致的重复创建。建议使用 UUID 作为令牌值。相同的 ClientToken 在有效期内重复请求时，服务端将返回相同的结果。

     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端幂等性令牌。

用于保证请求的幂等性，防止因网络超时或客户端重试导致的重复创建。建议使用 UUID 作为令牌值。相同的 ClientToken 在有效期内重复请求时，服务端将返回相同的结果。

     * @param ClientToken 客户端幂等性令牌。

用于保证请求的幂等性，防止因网络超时或客户端重试导致的重复创建。建议使用 UUID 作为令牌值。相同的 ClientToken 在有效期内重复请求时，服务端将返回相同的结果。

     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际创建资源。预检请求将验证参数格式、权限及资源配额等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接创建安全策略。
 
     * @return DryRun 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际创建资源。预检请求将验证参数格式、权限及资源配额等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接创建安全策略。

     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际创建资源。预检请求将验证参数格式、权限及资源配额等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接创建安全策略。

     * @param DryRun 是否仅执行预检请求。取值：
- **true**：仅执行预检请求，不实际创建资源。预检请求将验证参数格式、权限及资源配额等，帮助您在正式操作前发现潜在问题。
- **false**（默认）：执行正常请求，通过预检后将直接创建安全策略。

     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 安全策略名称。用于标识和区分不同的安全策略。

**命名规则：**
- 长度为 2~128 个字符。
- 必须以英文字母或中文开头。
- 可包含英文字母、中文、数字、半角句号（.）、下划线（_）和短划线（-）。

**建议：** 使用具有业务含义的名称，例如 "prod-high-security" 或 "测试环境策略"。
 
     * @return SecurityPolicyName 安全策略名称。用于标识和区分不同的安全策略。

**命名规则：**
- 长度为 2~128 个字符。
- 必须以英文字母或中文开头。
- 可包含英文字母、中文、数字、半角句号（.）、下划线（_）和短划线（-）。

**建议：** 使用具有业务含义的名称，例如 "prod-high-security" 或 "测试环境策略"。

     */
    public String getSecurityPolicyName() {
        return this.SecurityPolicyName;
    }

    /**
     * Set 安全策略名称。用于标识和区分不同的安全策略。

**命名规则：**
- 长度为 2~128 个字符。
- 必须以英文字母或中文开头。
- 可包含英文字母、中文、数字、半角句号（.）、下划线（_）和短划线（-）。

**建议：** 使用具有业务含义的名称，例如 "prod-high-security" 或 "测试环境策略"。

     * @param SecurityPolicyName 安全策略名称。用于标识和区分不同的安全策略。

**命名规则：**
- 长度为 2~128 个字符。
- 必须以英文字母或中文开头。
- 可包含英文字母、中文、数字、半角句号（.）、下划线（_）和短划线（-）。

**建议：** 使用具有业务含义的名称，例如 "prod-high-security" 或 "测试环境策略"。

     */
    public void setSecurityPolicyName(String SecurityPolicyName) {
        this.SecurityPolicyName = SecurityPolicyName;
    }

    /**
     * Get 安全策略的标签列表。标签用于对资源进行分类和管理，便于按业务、环境、部门等维度筛选和组织资源。

每个标签由键值对（Key-Value）组成，同一资源下标签键不可重复。
 
     * @return Tags 安全策略的标签列表。标签用于对资源进行分类和管理，便于按业务、环境、部门等维度筛选和组织资源。

每个标签由键值对（Key-Value）组成，同一资源下标签键不可重复。

     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 安全策略的标签列表。标签用于对资源进行分类和管理，便于按业务、环境、部门等维度筛选和组织资源。

每个标签由键值对（Key-Value）组成，同一资源下标签键不可重复。

     * @param Tags 安全策略的标签列表。标签用于对资源进行分类和管理，便于按业务、环境、部门等维度筛选和组织资源。

每个标签由键值对（Key-Value）组成，同一资源下标签键不可重复。

     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityPolicyRequest(CreateSecurityPolicyRequest source) {
        if (source.Ciphers != null) {
            this.Ciphers = new String[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new String(source.Ciphers[i]);
            }
        }
        if (source.TLSVersions != null) {
            this.TLSVersions = new String[source.TLSVersions.length];
            for (int i = 0; i < source.TLSVersions.length; i++) {
                this.TLSVersions[i] = new String(source.TLSVersions[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.SecurityPolicyName != null) {
            this.SecurityPolicyName = new String(source.SecurityPolicyName);
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
        this.setParamArraySimple(map, prefix + "TLSVersions.", this.TLSVersions);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "SecurityPolicyName", this.SecurityPolicyName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

