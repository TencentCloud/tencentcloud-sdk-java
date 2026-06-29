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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MCPPluginConfig extends AbstractModel {

    /**
    * <p>MCP插件外部访问地址</p>
    */
    @SerializedName("ExternalMCPServerUrl")
    @Expose
    private String ExternalMCPServerUrl;

    /**
    * <p>MCP server地址</p>
    */
    @SerializedName("MCPServerUrl")
    @Expose
    private String MCPServerUrl;

    /**
    * <p>MCP传输类型: SSE/Streamable<br>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | SSE + HTTP 模式 |<br>| 1 | Streamable HTTP 模式 |</p>
    */
    @SerializedName("MCPTransport")
    @Expose
    private Long MCPTransport;

    /**
    * <p>MCP插件的header参数</p>
    */
    @SerializedName("PluginHeader")
    @Expose
    private PluginParam [] PluginHeader;

    /**
    * <p>MCP插件的query参数</p>
    */
    @SerializedName("PluginQuery")
    @Expose
    private PluginParam [] PluginQuery;

    /**
    * <p>SSE长连接超时时间，单位秒</p>
    */
    @SerializedName("SSEReadTimeout")
    @Expose
    private Long SSEReadTimeout;

    /**
    * <p>请求超时时间，单位秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>授权信息</p>
    */
    @SerializedName("AuthConfig")
    @Expose
    private AuthConfig AuthConfig;

    /**
     * Get <p>MCP插件外部访问地址</p> 
     * @return ExternalMCPServerUrl <p>MCP插件外部访问地址</p>
     */
    public String getExternalMCPServerUrl() {
        return this.ExternalMCPServerUrl;
    }

    /**
     * Set <p>MCP插件外部访问地址</p>
     * @param ExternalMCPServerUrl <p>MCP插件外部访问地址</p>
     */
    public void setExternalMCPServerUrl(String ExternalMCPServerUrl) {
        this.ExternalMCPServerUrl = ExternalMCPServerUrl;
    }

    /**
     * Get <p>MCP server地址</p> 
     * @return MCPServerUrl <p>MCP server地址</p>
     */
    public String getMCPServerUrl() {
        return this.MCPServerUrl;
    }

    /**
     * Set <p>MCP server地址</p>
     * @param MCPServerUrl <p>MCP server地址</p>
     */
    public void setMCPServerUrl(String MCPServerUrl) {
        this.MCPServerUrl = MCPServerUrl;
    }

    /**
     * Get <p>MCP传输类型: SSE/Streamable<br>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | SSE + HTTP 模式 |<br>| 1 | Streamable HTTP 模式 |</p> 
     * @return MCPTransport <p>MCP传输类型: SSE/Streamable<br>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | SSE + HTTP 模式 |<br>| 1 | Streamable HTTP 模式 |</p>
     */
    public Long getMCPTransport() {
        return this.MCPTransport;
    }

    /**
     * Set <p>MCP传输类型: SSE/Streamable<br>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | SSE + HTTP 模式 |<br>| 1 | Streamable HTTP 模式 |</p>
     * @param MCPTransport <p>MCP传输类型: SSE/Streamable<br>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | SSE + HTTP 模式 |<br>| 1 | Streamable HTTP 模式 |</p>
     */
    public void setMCPTransport(Long MCPTransport) {
        this.MCPTransport = MCPTransport;
    }

    /**
     * Get <p>MCP插件的header参数</p> 
     * @return PluginHeader <p>MCP插件的header参数</p>
     */
    public PluginParam [] getPluginHeader() {
        return this.PluginHeader;
    }

    /**
     * Set <p>MCP插件的header参数</p>
     * @param PluginHeader <p>MCP插件的header参数</p>
     */
    public void setPluginHeader(PluginParam [] PluginHeader) {
        this.PluginHeader = PluginHeader;
    }

    /**
     * Get <p>MCP插件的query参数</p> 
     * @return PluginQuery <p>MCP插件的query参数</p>
     */
    public PluginParam [] getPluginQuery() {
        return this.PluginQuery;
    }

    /**
     * Set <p>MCP插件的query参数</p>
     * @param PluginQuery <p>MCP插件的query参数</p>
     */
    public void setPluginQuery(PluginParam [] PluginQuery) {
        this.PluginQuery = PluginQuery;
    }

    /**
     * Get <p>SSE长连接超时时间，单位秒</p> 
     * @return SSEReadTimeout <p>SSE长连接超时时间，单位秒</p>
     */
    public Long getSSEReadTimeout() {
        return this.SSEReadTimeout;
    }

    /**
     * Set <p>SSE长连接超时时间，单位秒</p>
     * @param SSEReadTimeout <p>SSE长连接超时时间，单位秒</p>
     */
    public void setSSEReadTimeout(Long SSEReadTimeout) {
        this.SSEReadTimeout = SSEReadTimeout;
    }

    /**
     * Get <p>请求超时时间，单位秒</p> 
     * @return Timeout <p>请求超时时间，单位秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>请求超时时间，单位秒</p>
     * @param Timeout <p>请求超时时间，单位秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>授权信息</p> 
     * @return AuthConfig <p>授权信息</p>
     */
    public AuthConfig getAuthConfig() {
        return this.AuthConfig;
    }

    /**
     * Set <p>授权信息</p>
     * @param AuthConfig <p>授权信息</p>
     */
    public void setAuthConfig(AuthConfig AuthConfig) {
        this.AuthConfig = AuthConfig;
    }

    public MCPPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPPluginConfig(MCPPluginConfig source) {
        if (source.ExternalMCPServerUrl != null) {
            this.ExternalMCPServerUrl = new String(source.ExternalMCPServerUrl);
        }
        if (source.MCPServerUrl != null) {
            this.MCPServerUrl = new String(source.MCPServerUrl);
        }
        if (source.MCPTransport != null) {
            this.MCPTransport = new Long(source.MCPTransport);
        }
        if (source.PluginHeader != null) {
            this.PluginHeader = new PluginParam[source.PluginHeader.length];
            for (int i = 0; i < source.PluginHeader.length; i++) {
                this.PluginHeader[i] = new PluginParam(source.PluginHeader[i]);
            }
        }
        if (source.PluginQuery != null) {
            this.PluginQuery = new PluginParam[source.PluginQuery.length];
            for (int i = 0; i < source.PluginQuery.length; i++) {
                this.PluginQuery[i] = new PluginParam(source.PluginQuery[i]);
            }
        }
        if (source.SSEReadTimeout != null) {
            this.SSEReadTimeout = new Long(source.SSEReadTimeout);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.AuthConfig != null) {
            this.AuthConfig = new AuthConfig(source.AuthConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalMCPServerUrl", this.ExternalMCPServerUrl);
        this.setParamSimple(map, prefix + "MCPServerUrl", this.MCPServerUrl);
        this.setParamSimple(map, prefix + "MCPTransport", this.MCPTransport);
        this.setParamArrayObj(map, prefix + "PluginHeader.", this.PluginHeader);
        this.setParamArrayObj(map, prefix + "PluginQuery.", this.PluginQuery);
        this.setParamSimple(map, prefix + "SSEReadTimeout", this.SSEReadTimeout);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamObj(map, prefix + "AuthConfig.", this.AuthConfig);

    }
}

