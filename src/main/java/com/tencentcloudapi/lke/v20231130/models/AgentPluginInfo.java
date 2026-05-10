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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginInfo extends AbstractModel {

    /**
    * <p>插件id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>应用配置的插件header信息</p>
    */
    @SerializedName("Headers")
    @Expose
    private AgentPluginHeader [] Headers;

    /**
    * <p>插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private AgentModelInfo Model;

    /**
    * <p>插件信息类型; 0: 未指定类型; 1: 知识库问答插件</p>
    */
    @SerializedName("PluginInfoType")
    @Expose
    private Long PluginInfoType;

    /**
    * <p>知识库问答插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeQa")
    @Expose
    private AgentKnowledgeQAPlugin KnowledgeQa;

    /**
    * <p>是否使用一键授权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRoleAuth")
    @Expose
    private Boolean EnableRoleAuth;

    /**
    * <p>应用配置的插件query信息</p>
    */
    @SerializedName("Query")
    @Expose
    private AgentPluginQuery [] Query;

    /**
    * <p>MCP类型</p><p>枚举值：</p><ul><li>0： SSE 模式</li><li>1： Streamable Http 模式</li></ul>
    */
    @SerializedName("McpType")
    @Expose
    private Long McpType;

    /**
    * <p>OAuth授权主体</p><p>枚举值：</p><ul><li>0： 开发者授权</li><li>1： 使用者授权</li></ul>
    */
    @SerializedName("AuthMode")
    @Expose
    private Long AuthMode;

    /**
    * <p>授权方式</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： api key鉴权</li><li>2： 支持CAM授权</li><li>3： 支持Oauth2.0授权</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>授权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
    */
    @SerializedName("AuthConfigStatus")
    @Expose
    private Long AuthConfigStatus;

    /**
    * <p>插件用途类型</p><p>枚举值：</p><ul><li>0： 工具类</li><li>1： 连接器类</li></ul>
    */
    @SerializedName("PluginClass")
    @Expose
    private Long PluginClass;

    /**
    * <p>插件状态</p><p>枚举值：</p><ul><li>1： 成功</li><li>2： 不可用</li></ul>
    */
    @SerializedName("PluginStatus")
    @Expose
    private Long PluginStatus;

    /**
     * Get <p>插件id</p> 
     * @return PluginId <p>插件id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>插件id</p>
     * @param PluginId <p>插件id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>应用配置的插件header信息</p> 
     * @return Headers <p>应用配置的插件header信息</p>
     */
    public AgentPluginHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>应用配置的插件header信息</p>
     * @param Headers <p>应用配置的插件header信息</p>
     */
    public void setHeaders(AgentPluginHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model <p>插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentModelInfo getModel() {
        return this.Model;
    }

    /**
     * Set <p>插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model <p>插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(AgentModelInfo Model) {
        this.Model = Model;
    }

    /**
     * Get <p>插件信息类型; 0: 未指定类型; 1: 知识库问答插件</p> 
     * @return PluginInfoType <p>插件信息类型; 0: 未指定类型; 1: 知识库问答插件</p>
     */
    public Long getPluginInfoType() {
        return this.PluginInfoType;
    }

    /**
     * Set <p>插件信息类型; 0: 未指定类型; 1: 知识库问答插件</p>
     * @param PluginInfoType <p>插件信息类型; 0: 未指定类型; 1: 知识库问答插件</p>
     */
    public void setPluginInfoType(Long PluginInfoType) {
        this.PluginInfoType = PluginInfoType;
    }

    /**
     * Get <p>知识库问答插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeQa <p>知识库问答插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentKnowledgeQAPlugin getKnowledgeQa() {
        return this.KnowledgeQa;
    }

    /**
     * Set <p>知识库问答插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeQa <p>知识库问答插件配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeQa(AgentKnowledgeQAPlugin KnowledgeQa) {
        this.KnowledgeQa = KnowledgeQa;
    }

    /**
     * Get <p>是否使用一键授权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRoleAuth <p>是否使用一键授权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableRoleAuth() {
        return this.EnableRoleAuth;
    }

    /**
     * Set <p>是否使用一键授权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRoleAuth <p>是否使用一键授权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRoleAuth(Boolean EnableRoleAuth) {
        this.EnableRoleAuth = EnableRoleAuth;
    }

    /**
     * Get <p>应用配置的插件query信息</p> 
     * @return Query <p>应用配置的插件query信息</p>
     */
    public AgentPluginQuery [] getQuery() {
        return this.Query;
    }

    /**
     * Set <p>应用配置的插件query信息</p>
     * @param Query <p>应用配置的插件query信息</p>
     */
    public void setQuery(AgentPluginQuery [] Query) {
        this.Query = Query;
    }

    /**
     * Get <p>MCP类型</p><p>枚举值：</p><ul><li>0： SSE 模式</li><li>1： Streamable Http 模式</li></ul> 
     * @return McpType <p>MCP类型</p><p>枚举值：</p><ul><li>0： SSE 模式</li><li>1： Streamable Http 模式</li></ul>
     */
    public Long getMcpType() {
        return this.McpType;
    }

    /**
     * Set <p>MCP类型</p><p>枚举值：</p><ul><li>0： SSE 模式</li><li>1： Streamable Http 模式</li></ul>
     * @param McpType <p>MCP类型</p><p>枚举值：</p><ul><li>0： SSE 模式</li><li>1： Streamable Http 模式</li></ul>
     */
    public void setMcpType(Long McpType) {
        this.McpType = McpType;
    }

    /**
     * Get <p>OAuth授权主体</p><p>枚举值：</p><ul><li>0： 开发者授权</li><li>1： 使用者授权</li></ul> 
     * @return AuthMode <p>OAuth授权主体</p><p>枚举值：</p><ul><li>0： 开发者授权</li><li>1： 使用者授权</li></ul>
     */
    public Long getAuthMode() {
        return this.AuthMode;
    }

    /**
     * Set <p>OAuth授权主体</p><p>枚举值：</p><ul><li>0： 开发者授权</li><li>1： 使用者授权</li></ul>
     * @param AuthMode <p>OAuth授权主体</p><p>枚举值：</p><ul><li>0： 开发者授权</li><li>1： 使用者授权</li></ul>
     */
    public void setAuthMode(Long AuthMode) {
        this.AuthMode = AuthMode;
    }

    /**
     * Get <p>授权方式</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： api key鉴权</li><li>2： 支持CAM授权</li><li>3： 支持Oauth2.0授权</li></ul> 
     * @return AuthType <p>授权方式</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： api key鉴权</li><li>2： 支持CAM授权</li><li>3： 支持Oauth2.0授权</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>授权方式</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： api key鉴权</li><li>2： 支持CAM授权</li><li>3： 支持Oauth2.0授权</li></ul>
     * @param AuthType <p>授权方式</p><p>枚举值：</p><ul><li>0： 无鉴权</li><li>1： api key鉴权</li><li>2： 支持CAM授权</li><li>3： 支持Oauth2.0授权</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>授权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul> 
     * @return AuthConfigStatus <p>授权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
     */
    public Long getAuthConfigStatus() {
        return this.AuthConfigStatus;
    }

    /**
     * Set <p>授权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
     * @param AuthConfigStatus <p>授权配置状态</p><p>枚举值：</p><ul><li>0： 不需要授权</li><li>1： 未配置</li><li>2： 已配置</li></ul>
     */
    public void setAuthConfigStatus(Long AuthConfigStatus) {
        this.AuthConfigStatus = AuthConfigStatus;
    }

    /**
     * Get <p>插件用途类型</p><p>枚举值：</p><ul><li>0： 工具类</li><li>1： 连接器类</li></ul> 
     * @return PluginClass <p>插件用途类型</p><p>枚举值：</p><ul><li>0： 工具类</li><li>1： 连接器类</li></ul>
     */
    public Long getPluginClass() {
        return this.PluginClass;
    }

    /**
     * Set <p>插件用途类型</p><p>枚举值：</p><ul><li>0： 工具类</li><li>1： 连接器类</li></ul>
     * @param PluginClass <p>插件用途类型</p><p>枚举值：</p><ul><li>0： 工具类</li><li>1： 连接器类</li></ul>
     */
    public void setPluginClass(Long PluginClass) {
        this.PluginClass = PluginClass;
    }

    /**
     * Get <p>插件状态</p><p>枚举值：</p><ul><li>1： 成功</li><li>2： 不可用</li></ul> 
     * @return PluginStatus <p>插件状态</p><p>枚举值：</p><ul><li>1： 成功</li><li>2： 不可用</li></ul>
     */
    public Long getPluginStatus() {
        return this.PluginStatus;
    }

    /**
     * Set <p>插件状态</p><p>枚举值：</p><ul><li>1： 成功</li><li>2： 不可用</li></ul>
     * @param PluginStatus <p>插件状态</p><p>枚举值：</p><ul><li>1： 成功</li><li>2： 不可用</li></ul>
     */
    public void setPluginStatus(Long PluginStatus) {
        this.PluginStatus = PluginStatus;
    }

    public AgentPluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginInfo(AgentPluginInfo source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Headers != null) {
            this.Headers = new AgentPluginHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new AgentPluginHeader(source.Headers[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new AgentModelInfo(source.Model);
        }
        if (source.PluginInfoType != null) {
            this.PluginInfoType = new Long(source.PluginInfoType);
        }
        if (source.KnowledgeQa != null) {
            this.KnowledgeQa = new AgentKnowledgeQAPlugin(source.KnowledgeQa);
        }
        if (source.EnableRoleAuth != null) {
            this.EnableRoleAuth = new Boolean(source.EnableRoleAuth);
        }
        if (source.Query != null) {
            this.Query = new AgentPluginQuery[source.Query.length];
            for (int i = 0; i < source.Query.length; i++) {
                this.Query[i] = new AgentPluginQuery(source.Query[i]);
            }
        }
        if (source.McpType != null) {
            this.McpType = new Long(source.McpType);
        }
        if (source.AuthMode != null) {
            this.AuthMode = new Long(source.AuthMode);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.AuthConfigStatus != null) {
            this.AuthConfigStatus = new Long(source.AuthConfigStatus);
        }
        if (source.PluginClass != null) {
            this.PluginClass = new Long(source.PluginClass);
        }
        if (source.PluginStatus != null) {
            this.PluginStatus = new Long(source.PluginStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamSimple(map, prefix + "PluginInfoType", this.PluginInfoType);
        this.setParamObj(map, prefix + "KnowledgeQa.", this.KnowledgeQa);
        this.setParamSimple(map, prefix + "EnableRoleAuth", this.EnableRoleAuth);
        this.setParamArrayObj(map, prefix + "Query.", this.Query);
        this.setParamSimple(map, prefix + "McpType", this.McpType);
        this.setParamSimple(map, prefix + "AuthMode", this.AuthMode);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthConfigStatus", this.AuthConfigStatus);
        this.setParamSimple(map, prefix + "PluginClass", this.PluginClass);
        this.setParamSimple(map, prefix + "PluginStatus", this.PluginStatus);

    }
}

