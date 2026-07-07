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

public class StickySessionConfig extends AbstractModel {

    /**
    * 是否开启会话保持。
- **true**：开启。
- **false**：不开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StickySessionEnabled")
    @Expose
    private Boolean StickySessionEnabled;

    /**
    * 自定义 Cookie 名称。
长度为 1~255 个字符，只能包含英文字母和数字字符，且不能为`tgw_l7_tg_route`，该字段为目标组间会话保持Cookie保留字段。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
    * 会话保持时间。
取值范围：**1-86400**，单位：**秒**。
默认值：**1000**。
>仅当 **StickySessionEnabled** 为 **true**时，该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CookieTimeout")
    @Expose
    private Long CookieTimeout;

    /**
    * 会话保持类型（处理Cookie的方式）。
- **Insert**（默认值）：植入 Cookie。 客户端第一次访问后端服务时，应用型负载均衡会在返回请求中植入 Cookie。下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
- **Rewrite**：重写 Cookie。 负载均衡会对用户自定义的 Cookie 进行重写，下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StickySessionType")
    @Expose
    private String StickySessionType;

    /**
     * Get 是否开启会话保持。
- **true**：开启。
- **false**：不开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StickySessionEnabled 是否开启会话保持。
- **true**：开启。
- **false**：不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStickySessionEnabled() {
        return this.StickySessionEnabled;
    }

    /**
     * Set 是否开启会话保持。
- **true**：开启。
- **false**：不开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StickySessionEnabled 是否开启会话保持。
- **true**：开启。
- **false**：不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStickySessionEnabled(Boolean StickySessionEnabled) {
        this.StickySessionEnabled = StickySessionEnabled;
    }

    /**
     * Get 自定义 Cookie 名称。
长度为 1~255 个字符，只能包含英文字母和数字字符，且不能为`tgw_l7_tg_route`，该字段为目标组间会话保持Cookie保留字段。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。 
     * @return Cookie 自定义 Cookie 名称。
长度为 1~255 个字符，只能包含英文字母和数字字符，且不能为`tgw_l7_tg_route`，该字段为目标组间会话保持Cookie保留字段。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set 自定义 Cookie 名称。
长度为 1~255 个字符，只能包含英文字母和数字字符，且不能为`tgw_l7_tg_route`，该字段为目标组间会话保持Cookie保留字段。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
     * @param Cookie 自定义 Cookie 名称。
长度为 1~255 个字符，只能包含英文字母和数字字符，且不能为`tgw_l7_tg_route`，该字段为目标组间会话保持Cookie保留字段。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get 会话保持时间。
取值范围：**1-86400**，单位：**秒**。
默认值：**1000**。
>仅当 **StickySessionEnabled** 为 **true**时，该参数生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CookieTimeout 会话保持时间。
取值范围：**1-86400**，单位：**秒**。
默认值：**1000**。
>仅当 **StickySessionEnabled** 为 **true**时，该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCookieTimeout() {
        return this.CookieTimeout;
    }

    /**
     * Set 会话保持时间。
取值范围：**1-86400**，单位：**秒**。
默认值：**1000**。
>仅当 **StickySessionEnabled** 为 **true**时，该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CookieTimeout 会话保持时间。
取值范围：**1-86400**，单位：**秒**。
默认值：**1000**。
>仅当 **StickySessionEnabled** 为 **true**时，该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCookieTimeout(Long CookieTimeout) {
        this.CookieTimeout = CookieTimeout;
    }

    /**
     * Get 会话保持类型（处理Cookie的方式）。
- **Insert**（默认值）：植入 Cookie。 客户端第一次访问后端服务时，应用型负载均衡会在返回请求中植入 Cookie。下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
- **Rewrite**：重写 Cookie。 负载均衡会对用户自定义的 Cookie 进行重写，下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StickySessionType 会话保持类型（处理Cookie的方式）。
- **Insert**（默认值）：植入 Cookie。 客户端第一次访问后端服务时，应用型负载均衡会在返回请求中植入 Cookie。下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
- **Rewrite**：重写 Cookie。 负载均衡会对用户自定义的 Cookie 进行重写，下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStickySessionType() {
        return this.StickySessionType;
    }

    /**
     * Set 会话保持类型（处理Cookie的方式）。
- **Insert**（默认值）：植入 Cookie。 客户端第一次访问后端服务时，应用型负载均衡会在返回请求中植入 Cookie。下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
- **Rewrite**：重写 Cookie。 负载均衡会对用户自定义的 Cookie 进行重写，下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StickySessionType 会话保持类型（处理Cookie的方式）。
- **Insert**（默认值）：植入 Cookie。 客户端第一次访问后端服务时，应用型负载均衡会在返回请求中植入 Cookie。下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
- **Rewrite**：重写 Cookie。 负载均衡会对用户自定义的 Cookie 进行重写，下次客户端请求时携带该 Cookie，负载均衡将请求转发到上次请求的相同后端服务。
>仅当 **StickySessionEnabled** 为 **true** 时该参数生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStickySessionType(String StickySessionType) {
        this.StickySessionType = StickySessionType;
    }

    public StickySessionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StickySessionConfig(StickySessionConfig source) {
        if (source.StickySessionEnabled != null) {
            this.StickySessionEnabled = new Boolean(source.StickySessionEnabled);
        }
        if (source.Cookie != null) {
            this.Cookie = new String(source.Cookie);
        }
        if (source.CookieTimeout != null) {
            this.CookieTimeout = new Long(source.CookieTimeout);
        }
        if (source.StickySessionType != null) {
            this.StickySessionType = new String(source.StickySessionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StickySessionEnabled", this.StickySessionEnabled);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);
        this.setParamSimple(map, prefix + "CookieTimeout", this.CookieTimeout);
        this.setParamSimple(map, prefix + "StickySessionType", this.StickySessionType);

    }
}

