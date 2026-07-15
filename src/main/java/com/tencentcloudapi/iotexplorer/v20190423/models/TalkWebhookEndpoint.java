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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkWebhookEndpoint extends AbstractModel {

    /**
    * <p>Webhook地址，仅支持 80 和 443 端口</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>超时时间，0~30 秒</p><p>取值范围：[0, 30]</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get <p>Webhook地址，仅支持 80 和 443 端口</p> 
     * @return Url <p>Webhook地址，仅支持 80 和 443 端口</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Webhook地址，仅支持 80 和 443 端口</p>
     * @param Url <p>Webhook地址，仅支持 80 和 443 端口</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>超时时间，0~30 秒</p><p>取值范围：[0, 30]</p> 
     * @return Timeout <p>超时时间，0~30 秒</p><p>取值范围：[0, 30]</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，0~30 秒</p><p>取值范围：[0, 30]</p>
     * @param Timeout <p>超时时间，0~30 秒</p><p>取值范围：[0, 30]</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public TalkWebhookEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkWebhookEndpoint(TalkWebhookEndpoint source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

