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

public class DescribeSecurityPolicyCapabilitiesResponse extends AbstractModel {

    /**
    * 安全策略配置能力列表。返回当前地域支持的所有 TLS 版本及其对应的加密套件信息。

**返回内容包含：**
- 支持的 TLS 协议版本（如 TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3）。
- 每个 TLS 版本支持的加密套件列表。

**使用场景：**
- 在创建安全策略（CreateSecurityPolicy）前，调用此接口获取可选的加密套件。
- 在修改安全策略（ModifySecurityPolicyAttributes）前，确认新配置的有效性。

    */
    @SerializedName("SecurityPolicyCapabilities")
    @Expose
    private SecurityPolicyCapability [] SecurityPolicyCapabilities;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安全策略配置能力列表。返回当前地域支持的所有 TLS 版本及其对应的加密套件信息。

**返回内容包含：**
- 支持的 TLS 协议版本（如 TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3）。
- 每个 TLS 版本支持的加密套件列表。

**使用场景：**
- 在创建安全策略（CreateSecurityPolicy）前，调用此接口获取可选的加密套件。
- 在修改安全策略（ModifySecurityPolicyAttributes）前，确认新配置的有效性。
 
     * @return SecurityPolicyCapabilities 安全策略配置能力列表。返回当前地域支持的所有 TLS 版本及其对应的加密套件信息。

**返回内容包含：**
- 支持的 TLS 协议版本（如 TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3）。
- 每个 TLS 版本支持的加密套件列表。

**使用场景：**
- 在创建安全策略（CreateSecurityPolicy）前，调用此接口获取可选的加密套件。
- 在修改安全策略（ModifySecurityPolicyAttributes）前，确认新配置的有效性。

     */
    public SecurityPolicyCapability [] getSecurityPolicyCapabilities() {
        return this.SecurityPolicyCapabilities;
    }

    /**
     * Set 安全策略配置能力列表。返回当前地域支持的所有 TLS 版本及其对应的加密套件信息。

**返回内容包含：**
- 支持的 TLS 协议版本（如 TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3）。
- 每个 TLS 版本支持的加密套件列表。

**使用场景：**
- 在创建安全策略（CreateSecurityPolicy）前，调用此接口获取可选的加密套件。
- 在修改安全策略（ModifySecurityPolicyAttributes）前，确认新配置的有效性。

     * @param SecurityPolicyCapabilities 安全策略配置能力列表。返回当前地域支持的所有 TLS 版本及其对应的加密套件信息。

**返回内容包含：**
- 支持的 TLS 协议版本（如 TLSv1.0、TLSv1.1、TLSv1.2、TLSv1.3）。
- 每个 TLS 版本支持的加密套件列表。

**使用场景：**
- 在创建安全策略（CreateSecurityPolicy）前，调用此接口获取可选的加密套件。
- 在修改安全策略（ModifySecurityPolicyAttributes）前，确认新配置的有效性。

     */
    public void setSecurityPolicyCapabilities(SecurityPolicyCapability [] SecurityPolicyCapabilities) {
        this.SecurityPolicyCapabilities = SecurityPolicyCapabilities;
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

    public DescribeSecurityPolicyCapabilitiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyCapabilitiesResponse(DescribeSecurityPolicyCapabilitiesResponse source) {
        if (source.SecurityPolicyCapabilities != null) {
            this.SecurityPolicyCapabilities = new SecurityPolicyCapability[source.SecurityPolicyCapabilities.length];
            for (int i = 0; i < source.SecurityPolicyCapabilities.length; i++) {
                this.SecurityPolicyCapabilities[i] = new SecurityPolicyCapability(source.SecurityPolicyCapabilities[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SecurityPolicyCapabilities.", this.SecurityPolicyCapabilities);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

