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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessURLRedirectPort extends AbstractModel {

    /**
    * <p>目标端口配置</p><p>枚举值：</p><ul><li>FollowProtocol： 使用目标协议的默认端口。重定向地址中不显式指定端口，由目标协议使用默认端口，HTTP 使用 80，HTTPS 使用 443。</li><li>FollowRequest： 跟随客户端请求的目标端口。请求地址显式携带端口时沿用该端口；未显式携带时，重定向地址中不携带端口。</li><li>Custom： 使用指定的自定义端口。</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>自定义目标端口。</p><p>取值范围：[1, 65535]</p><p>当 Action 为 Custom 时，此字段必填；当 Action 为 FollowProtocol 或 FollowRequest 时，此字段不生效。</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>目标端口配置</p><p>枚举值：</p><ul><li>FollowProtocol： 使用目标协议的默认端口。重定向地址中不显式指定端口，由目标协议使用默认端口，HTTP 使用 80，HTTPS 使用 443。</li><li>FollowRequest： 跟随客户端请求的目标端口。请求地址显式携带端口时沿用该端口；未显式携带时，重定向地址中不携带端口。</li><li>Custom： 使用指定的自定义端口。</li></ul> 
     * @return Action <p>目标端口配置</p><p>枚举值：</p><ul><li>FollowProtocol： 使用目标协议的默认端口。重定向地址中不显式指定端口，由目标协议使用默认端口，HTTP 使用 80，HTTPS 使用 443。</li><li>FollowRequest： 跟随客户端请求的目标端口。请求地址显式携带端口时沿用该端口；未显式携带时，重定向地址中不携带端口。</li><li>Custom： 使用指定的自定义端口。</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>目标端口配置</p><p>枚举值：</p><ul><li>FollowProtocol： 使用目标协议的默认端口。重定向地址中不显式指定端口，由目标协议使用默认端口，HTTP 使用 80，HTTPS 使用 443。</li><li>FollowRequest： 跟随客户端请求的目标端口。请求地址显式携带端口时沿用该端口；未显式携带时，重定向地址中不携带端口。</li><li>Custom： 使用指定的自定义端口。</li></ul>
     * @param Action <p>目标端口配置</p><p>枚举值：</p><ul><li>FollowProtocol： 使用目标协议的默认端口。重定向地址中不显式指定端口，由目标协议使用默认端口，HTTP 使用 80，HTTPS 使用 443。</li><li>FollowRequest： 跟随客户端请求的目标端口。请求地址显式携带端口时沿用该端口；未显式携带时，重定向地址中不携带端口。</li><li>Custom： 使用指定的自定义端口。</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>自定义目标端口。</p><p>取值范围：[1, 65535]</p><p>当 Action 为 Custom 时，此字段必填；当 Action 为 FollowProtocol 或 FollowRequest 时，此字段不生效。</p> 
     * @return Value <p>自定义目标端口。</p><p>取值范围：[1, 65535]</p><p>当 Action 为 Custom 时，此字段必填；当 Action 为 FollowProtocol 或 FollowRequest 时，此字段不生效。</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>自定义目标端口。</p><p>取值范围：[1, 65535]</p><p>当 Action 为 Custom 时，此字段必填；当 Action 为 FollowProtocol 或 FollowRequest 时，此字段不生效。</p>
     * @param Value <p>自定义目标端口。</p><p>取值范围：[1, 65535]</p><p>当 Action 为 Custom 时，此字段必填；当 Action 为 FollowProtocol 或 FollowRequest 时，此字段不生效。</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public AccessURLRedirectPort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessURLRedirectPort(AccessURLRedirectPort source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

