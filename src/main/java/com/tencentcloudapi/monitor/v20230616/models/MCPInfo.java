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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MCPInfo extends AbstractModel {

    /**
    * <p>mcp的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCPId")
    @Expose
    private String MCPId;

    /**
    * <p>MCP 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>MCP 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>MCP URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>传输协议: sse / streamable_http / stdio</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transport")
    @Expose
    private String Transport;

    /**
    * <p>认证类型: none / bearer / basic / api_key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>认证密钥(响应时脱敏)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthSecret")
    @Expose
    private String AuthSecret;

    /**
    * <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>请求头 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private String Headers;

    /**
    * <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>mcp的ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCPId <p>mcp的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMCPId() {
        return this.MCPId;
    }

    /**
     * Set <p>mcp的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCPId <p>mcp的ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMCPId(String MCPId) {
        this.MCPId = MCPId;
    }

    /**
     * Get <p>MCP 名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>MCP 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>MCP 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>MCP 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>MCP 描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>MCP 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>MCP 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>MCP 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>MCP URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url <p>MCP URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>MCP URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url <p>MCP URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>传输协议: sse / streamable_http / stdio</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transport <p>传输协议: sse / streamable_http / stdio</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransport() {
        return this.Transport;
    }

    /**
     * Set <p>传输协议: sse / streamable_http / stdio</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transport <p>传输协议: sse / streamable_http / stdio</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    /**
     * Get <p>认证类型: none / bearer / basic / api_key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType <p>认证类型: none / bearer / basic / api_key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证类型: none / bearer / basic / api_key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType <p>认证类型: none / bearer / basic / api_key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>认证密钥(响应时脱敏)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthSecret <p>认证密钥(响应时脱敏)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthSecret() {
        return this.AuthSecret;
    }

    /**
     * Set <p>认证密钥(响应时脱敏)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthSecret <p>认证密钥(响应时脱敏)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthSecret(String AuthSecret) {
        this.AuthSecret = AuthSecret;
    }

    /**
     * Get <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryCount <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryCount <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>请求头 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers <p>请求头 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>请求头 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers <p>请求头 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public MCPInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPInfo(MCPInfo source) {
        if (source.MCPId != null) {
            this.MCPId = new String(source.MCPId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Transport != null) {
            this.Transport = new String(source.Transport);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.AuthSecret != null) {
            this.AuthSecret = new String(source.AuthSecret);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.Headers != null) {
            this.Headers = new String(source.Headers);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MCPId", this.MCPId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Transport", this.Transport);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthSecret", this.AuthSecret);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "Headers", this.Headers);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

