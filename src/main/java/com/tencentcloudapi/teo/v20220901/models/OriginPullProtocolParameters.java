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

public class OriginPullProtocolParameters extends AbstractModel {

    /**
    * 回源协议配置，取值有：
<li>http：使用 HTTP 协议回源；</li>
<li>https：使用 HTTPS 协议回源；</li>
<li>follow：协议跟随。</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 回源协议配置，取值有：
<li>http：使用 HTTP 协议回源；</li>
<li>https：使用 HTTPS 协议回源；</li>
<li>follow：协议跟随。</li> 
     * @return Protocol 回源协议配置，取值有：
<li>http：使用 HTTP 协议回源；</li>
<li>https：使用 HTTPS 协议回源；</li>
<li>follow：协议跟随。</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 回源协议配置，取值有：
<li>http：使用 HTTP 协议回源；</li>
<li>https：使用 HTTPS 协议回源；</li>
<li>follow：协议跟随。</li>
     * @param Protocol 回源协议配置，取值有：
<li>http：使用 HTTP 协议回源；</li>
<li>https：使用 HTTPS 协议回源；</li>
<li>follow：协议跟随。</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public OriginPullProtocolParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginPullProtocolParameters(OriginPullProtocolParameters source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

