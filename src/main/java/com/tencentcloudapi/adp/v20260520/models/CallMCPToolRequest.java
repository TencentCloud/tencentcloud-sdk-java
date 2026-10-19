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

public class CallMCPToolRequest extends AbstractModel {

    /**
    * <p>能力边界：一次请求只能调该 plugin 上的工具</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>agent-exec 侧 thread</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>工具名，用于在 plugin 配置的 tool_list 中定位 tool_id</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>JSON：工具入参原文，原样透传给 MCP Server</p>
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
     * Get <p>能力边界：一次请求只能调该 plugin 上的工具</p> 
     * @return PluginId <p>能力边界：一次请求只能调该 plugin 上的工具</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>能力边界：一次请求只能调该 plugin 上的工具</p>
     * @param PluginId <p>能力边界：一次请求只能调该 plugin 上的工具</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>agent-exec 侧 thread</p> 
     * @return ThreadId <p>agent-exec 侧 thread</p>
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>agent-exec 侧 thread</p>
     * @param ThreadId <p>agent-exec 侧 thread</p>
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>工具名，用于在 plugin 配置的 tool_list 中定位 tool_id</p> 
     * @return ToolName <p>工具名，用于在 plugin 配置的 tool_list 中定位 tool_id</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>工具名，用于在 plugin 配置的 tool_list 中定位 tool_id</p>
     * @param ToolName <p>工具名，用于在 plugin 配置的 tool_list 中定位 tool_id</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>JSON：工具入参原文，原样透传给 MCP Server</p> 
     * @return Arguments <p>JSON：工具入参原文，原样透传给 MCP Server</p>
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set <p>JSON：工具入参原文，原样透传给 MCP Server</p>
     * @param Arguments <p>JSON：工具入参原文，原样透传给 MCP Server</p>
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    public CallMCPToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallMCPToolRequest(CallMCPToolRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);

    }
}

