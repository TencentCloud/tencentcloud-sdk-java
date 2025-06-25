/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentMCPServerInfo extends AbstractModel {

    /**
    * mcp server URL地址
    */
    @SerializedName("McpServerUrl")
    @Expose
    private String McpServerUrl;

    /**
    * mcp server header信息
    */
    @SerializedName("Headers")
    @Expose
    private AgentPluginHeader [] Headers;

    /**
    * 超时时间，单位秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * sse服务超时时间，单位秒
    */
    @SerializedName("SseReadTimeout")
    @Expose
    private Long SseReadTimeout;

    /**
     * Get mcp server URL地址 
     * @return McpServerUrl mcp server URL地址
     */
    public String getMcpServerUrl() {
        return this.McpServerUrl;
    }

    /**
     * Set mcp server URL地址
     * @param McpServerUrl mcp server URL地址
     */
    public void setMcpServerUrl(String McpServerUrl) {
        this.McpServerUrl = McpServerUrl;
    }

    /**
     * Get mcp server header信息 
     * @return Headers mcp server header信息
     */
    public AgentPluginHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set mcp server header信息
     * @param Headers mcp server header信息
     */
    public void setHeaders(AgentPluginHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 超时时间，单位秒 
     * @return Timeout 超时时间，单位秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，单位秒
     * @param Timeout 超时时间，单位秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get sse服务超时时间，单位秒 
     * @return SseReadTimeout sse服务超时时间，单位秒
     */
    public Long getSseReadTimeout() {
        return this.SseReadTimeout;
    }

    /**
     * Set sse服务超时时间，单位秒
     * @param SseReadTimeout sse服务超时时间，单位秒
     */
    public void setSseReadTimeout(Long SseReadTimeout) {
        this.SseReadTimeout = SseReadTimeout;
    }

    public AgentMCPServerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentMCPServerInfo(AgentMCPServerInfo source) {
        if (source.McpServerUrl != null) {
            this.McpServerUrl = new String(source.McpServerUrl);
        }
        if (source.Headers != null) {
            this.Headers = new AgentPluginHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new AgentPluginHeader(source.Headers[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.SseReadTimeout != null) {
            this.SseReadTimeout = new Long(source.SseReadTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "McpServerUrl", this.McpServerUrl);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "SseReadTimeout", this.SseReadTimeout);

    }
}

