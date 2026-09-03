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

public class ConversationMcpApp extends AbstractModel {

    /**
    * <p>能力边界：一次请求只能读该 plugin 的资源</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>ui:// 资源，前端据此调 ReadMCPResource 拉 HTML</p>
    */
    @SerializedName("ResourceUri")
    @Expose
    private String ResourceUri;

    /**
    * <p>agent-exec 侧 thread</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>JSON：完整 CallToolResult 原文，供历史会话重建时重放</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolResult")
    @Expose
    private String ToolResult;

    /**
     * Get <p>能力边界：一次请求只能读该 plugin 的资源</p> 
     * @return PluginId <p>能力边界：一次请求只能读该 plugin 的资源</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>能力边界：一次请求只能读该 plugin 的资源</p>
     * @param PluginId <p>能力边界：一次请求只能读该 plugin 的资源</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>ui:// 资源，前端据此调 ReadMCPResource 拉 HTML</p> 
     * @return ResourceUri <p>ui:// 资源，前端据此调 ReadMCPResource 拉 HTML</p>
     */
    public String getResourceUri() {
        return this.ResourceUri;
    }

    /**
     * Set <p>ui:// 资源，前端据此调 ReadMCPResource 拉 HTML</p>
     * @param ResourceUri <p>ui:// 资源，前端据此调 ReadMCPResource 拉 HTML</p>
     */
    public void setResourceUri(String ResourceUri) {
        this.ResourceUri = ResourceUri;
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
     * Get <p>JSON：完整 CallToolResult 原文，供历史会话重建时重放</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolResult <p>JSON：完整 CallToolResult 原文，供历史会话重建时重放</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToolResult() {
        return this.ToolResult;
    }

    /**
     * Set <p>JSON：完整 CallToolResult 原文，供历史会话重建时重放</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolResult <p>JSON：完整 CallToolResult 原文，供历史会话重建时重放</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolResult(String ToolResult) {
        this.ToolResult = ToolResult;
    }

    public ConversationMcpApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationMcpApp(ConversationMcpApp source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ResourceUri != null) {
            this.ResourceUri = new String(source.ResourceUri);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.ToolResult != null) {
            this.ToolResult = new String(source.ToolResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ResourceUri", this.ResourceUri);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "ToolResult", this.ToolResult);

    }
}

