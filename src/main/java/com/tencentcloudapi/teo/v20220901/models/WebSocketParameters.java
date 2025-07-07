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

public class WebSocketParameters extends AbstractModel {

    /**
    * WebSocket 超时时间配置开关，取值有：
<li>on：使用 Timeout 作为 WebSocket 超时时间；</li>
<li>off：平台仍支持 WebSocket 连接，此时使用系统默认的 15 秒为超时时间。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 超时时间，单位为秒，最大超时时间 120 秒。<br>注意：当 Switch 为 on 时，此字段必填，否则此字段不生效。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get WebSocket 超时时间配置开关，取值有：
<li>on：使用 Timeout 作为 WebSocket 超时时间；</li>
<li>off：平台仍支持 WebSocket 连接，此时使用系统默认的 15 秒为超时时间。</li> 
     * @return Switch WebSocket 超时时间配置开关，取值有：
<li>on：使用 Timeout 作为 WebSocket 超时时间；</li>
<li>off：平台仍支持 WebSocket 连接，此时使用系统默认的 15 秒为超时时间。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set WebSocket 超时时间配置开关，取值有：
<li>on：使用 Timeout 作为 WebSocket 超时时间；</li>
<li>off：平台仍支持 WebSocket 连接，此时使用系统默认的 15 秒为超时时间。</li>
     * @param Switch WebSocket 超时时间配置开关，取值有：
<li>on：使用 Timeout 作为 WebSocket 超时时间；</li>
<li>off：平台仍支持 WebSocket 连接，此时使用系统默认的 15 秒为超时时间。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 超时时间，单位为秒，最大超时时间 120 秒。<br>注意：当 Switch 为 on 时，此字段必填，否则此字段不生效。 
     * @return Timeout 超时时间，单位为秒，最大超时时间 120 秒。<br>注意：当 Switch 为 on 时，此字段必填，否则此字段不生效。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，单位为秒，最大超时时间 120 秒。<br>注意：当 Switch 为 on 时，此字段必填，否则此字段不生效。
     * @param Timeout 超时时间，单位为秒，最大超时时间 120 秒。<br>注意：当 Switch 为 on 时，此字段必填，否则此字段不生效。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public WebSocketParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSocketParameters(WebSocketParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

