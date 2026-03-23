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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpUrlObj extends AbstractModel {

    /**
    * sse访问URL
    */
    @SerializedName("SSEUrl")
    @Expose
    private String SSEUrl;

    /**
    * streamable访问URL
    */
    @SerializedName("StreamAbleUrl")
    @Expose
    private String StreamAbleUrl;

    /**
     * Get sse访问URL 
     * @return SSEUrl sse访问URL
     */
    public String getSSEUrl() {
        return this.SSEUrl;
    }

    /**
     * Set sse访问URL
     * @param SSEUrl sse访问URL
     */
    public void setSSEUrl(String SSEUrl) {
        this.SSEUrl = SSEUrl;
    }

    /**
     * Get streamable访问URL 
     * @return StreamAbleUrl streamable访问URL
     */
    public String getStreamAbleUrl() {
        return this.StreamAbleUrl;
    }

    /**
     * Set streamable访问URL
     * @param StreamAbleUrl streamable访问URL
     */
    public void setStreamAbleUrl(String StreamAbleUrl) {
        this.StreamAbleUrl = StreamAbleUrl;
    }

    public McpUrlObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpUrlObj(McpUrlObj source) {
        if (source.SSEUrl != null) {
            this.SSEUrl = new String(source.SSEUrl);
        }
        if (source.StreamAbleUrl != null) {
            this.StreamAbleUrl = new String(source.StreamAbleUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSEUrl", this.SSEUrl);
        this.setParamSimple(map, prefix + "StreamAbleUrl", this.StreamAbleUrl);

    }
}

