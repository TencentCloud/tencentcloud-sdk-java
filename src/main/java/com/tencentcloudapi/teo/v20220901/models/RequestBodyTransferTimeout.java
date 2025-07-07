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

public class RequestBodyTransferTimeout extends AbstractModel {

    /**
    * 正文传输超时时长，取值 5 ~ 120，单位仅支持秒（s）。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private String IdleTimeout;

    /**
    * 正文传输超时时长是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get 正文传输超时时长，取值 5 ~ 120，单位仅支持秒（s）。 
     * @return IdleTimeout 正文传输超时时长，取值 5 ~ 120，单位仅支持秒（s）。
     */
    public String getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 正文传输超时时长，取值 5 ~ 120，单位仅支持秒（s）。
     * @param IdleTimeout 正文传输超时时长，取值 5 ~ 120，单位仅支持秒（s）。
     */
    public void setIdleTimeout(String IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get 正文传输超时时长是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 正文传输超时时长是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 正文传输超时时长是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 正文传输超时时长是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public RequestBodyTransferTimeout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestBodyTransferTimeout(RequestBodyTransferTimeout source) {
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new String(source.IdleTimeout);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

