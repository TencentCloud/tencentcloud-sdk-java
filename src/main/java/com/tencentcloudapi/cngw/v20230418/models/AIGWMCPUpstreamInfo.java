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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWMCPUpstreamInfo extends AbstractModel {

    /**
    * <p>注册中心来源ID</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>MCP服务 id</p>
    */
    @SerializedName("MCPServerId")
    @Expose
    private String MCPServerId;

    /**
    * <p>协议，UpstreamType是Registry 时必传</p><ul><li>http</li><li>https</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>域名或ip</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>服务 id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>服务分组</p>
    */
    @SerializedName("ServiceGroup")
    @Expose
    private String ServiceGroup;

    /**
    * <p>mcp endpoint</p>
    */
    @SerializedName("MCPEndpoint")
    @Expose
    private String MCPEndpoint;

    /**
    * <p>message端点路径，SSE协议时配置</p>
    */
    @SerializedName("MessageEndpoint")
    @Expose
    private String MessageEndpoint;

    /**
     * Get <p>注册中心来源ID</p> 
     * @return SourceId <p>注册中心来源ID</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>注册中心来源ID</p>
     * @param SourceId <p>注册中心来源ID</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>MCP服务 id</p> 
     * @return MCPServerId <p>MCP服务 id</p>
     */
    public String getMCPServerId() {
        return this.MCPServerId;
    }

    /**
     * Set <p>MCP服务 id</p>
     * @param MCPServerId <p>MCP服务 id</p>
     */
    public void setMCPServerId(String MCPServerId) {
        this.MCPServerId = MCPServerId;
    }

    /**
     * Get <p>协议，UpstreamType是Registry 时必传</p><ul><li>http</li><li>https</li></ul> 
     * @return Protocol <p>协议，UpstreamType是Registry 时必传</p><ul><li>http</li><li>https</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议，UpstreamType是Registry 时必传</p><ul><li>http</li><li>https</li></ul>
     * @param Protocol <p>协议，UpstreamType是Registry 时必传</p><ul><li>http</li><li>https</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>域名或ip</p> 
     * @return Host <p>域名或ip</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>域名或ip</p>
     * @param Host <p>域名或ip</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>服务 id</p> 
     * @return ServiceId <p>服务 id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务 id</p>
     * @param ServiceId <p>服务 id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>服务分组</p> 
     * @return ServiceGroup <p>服务分组</p>
     */
    public String getServiceGroup() {
        return this.ServiceGroup;
    }

    /**
     * Set <p>服务分组</p>
     * @param ServiceGroup <p>服务分组</p>
     */
    public void setServiceGroup(String ServiceGroup) {
        this.ServiceGroup = ServiceGroup;
    }

    /**
     * Get <p>mcp endpoint</p> 
     * @return MCPEndpoint <p>mcp endpoint</p>
     */
    public String getMCPEndpoint() {
        return this.MCPEndpoint;
    }

    /**
     * Set <p>mcp endpoint</p>
     * @param MCPEndpoint <p>mcp endpoint</p>
     */
    public void setMCPEndpoint(String MCPEndpoint) {
        this.MCPEndpoint = MCPEndpoint;
    }

    /**
     * Get <p>message端点路径，SSE协议时配置</p> 
     * @return MessageEndpoint <p>message端点路径，SSE协议时配置</p>
     */
    public String getMessageEndpoint() {
        return this.MessageEndpoint;
    }

    /**
     * Set <p>message端点路径，SSE协议时配置</p>
     * @param MessageEndpoint <p>message端点路径，SSE协议时配置</p>
     */
    public void setMessageEndpoint(String MessageEndpoint) {
        this.MessageEndpoint = MessageEndpoint;
    }

    public AIGWMCPUpstreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPUpstreamInfo(AIGWMCPUpstreamInfo source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MCPServerId != null) {
            this.MCPServerId = new String(source.MCPServerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceGroup != null) {
            this.ServiceGroup = new String(source.ServiceGroup);
        }
        if (source.MCPEndpoint != null) {
            this.MCPEndpoint = new String(source.MCPEndpoint);
        }
        if (source.MessageEndpoint != null) {
            this.MessageEndpoint = new String(source.MessageEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MCPServerId", this.MCPServerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceGroup", this.ServiceGroup);
        this.setParamSimple(map, prefix + "MCPEndpoint", this.MCPEndpoint);
        this.setParamSimple(map, prefix + "MessageEndpoint", this.MessageEndpoint);

    }
}

