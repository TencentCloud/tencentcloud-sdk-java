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

public class AgentToolInfo extends AbstractModel {

    /**
    * <p>插件id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>插件名称</p>
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * <p>插件图标url</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>0 自定义插件<br>1 官方插件<br>2 第三方插件 目前用于第三方实现的mcp server</p>
    */
    @SerializedName("PluginType")
    @Expose
    private Long PluginType;

    /**
    * <p>工具id</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>工具描述</p>
    */
    @SerializedName("ToolDesc")
    @Expose
    private String ToolDesc;

    /**
    * <p>输入参数</p>
    */
    @SerializedName("Inputs")
    @Expose
    private AgentToolReqParam [] Inputs;

    /**
    * <p>输出参数</p>
    */
    @SerializedName("Outputs")
    @Expose
    private AgentToolRspParam [] Outputs;

    /**
    * <p>创建方式，0:服务创建，1:代码创建，2:MCP创建</p>
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
    * <p>MCP插件的配置信息</p>
    */
    @SerializedName("McpServer")
    @Expose
    private AgentMCPServerInfo McpServer;

    /**
    * <p>该工具是否和知识库绑定</p>
    */
    @SerializedName("IsBindingKnowledge")
    @Expose
    private Boolean IsBindingKnowledge;

    /**
    * <p>插件状态，1:可用，2:不可用</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>header信息</p>
    */
    @SerializedName("Headers")
    @Expose
    private AgentPluginHeader [] Headers;

    /**
    * <p>NON_STREAMING: 非流式  STREAMIN: 流式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallingMethod")
    @Expose
    private String CallingMethod;

    /**
    * <p>query信息</p>
    */
    @SerializedName("Query")
    @Expose
    private AgentPluginQuery [] Query;

    /**
    * <p>工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）</p>
    */
    @SerializedName("FinanceStatus")
    @Expose
    private Long FinanceStatus;

    /**
    * <p>工具来源: 0-来自插件，1-来自工作流</p>
    */
    @SerializedName("ToolSource")
    @Expose
    private Long ToolSource;

    /**
    * <p>计费状态；0-不计费，1-限时免费，2-官方收费</p>
    */
    @SerializedName("FinanceType")
    @Expose
    private Long FinanceType;

    /**
    * <p>工具高级设置</p>
    */
    @SerializedName("ToolAdvanceConfig")
    @Expose
    private ToolAdvanceConfig ToolAdvanceConfig;

    /**
    * <p>授权模式； 0-开发者授权；1-使用者授权</p>
    */
    @SerializedName("AuthMode")
    @Expose
    private Long AuthMode;

    /**
    * <p>授权类型; 0-无鉴权；1-APIKey；2-CAM授权；3-Oauth2.0授权；</p>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>工具授权配置状态；0：不需要授权，1：需要授权-未配置，2：需要授权-已配置</p>
    */
    @SerializedName("AuthConfigStatus")
    @Expose
    private Long AuthConfigStatus;

    /**
    * <p>连接器工具 API 类型</p><p>枚举值：</p><ul><li>1： 只读</li><li>2： 写/删除</li></ul>
    */
    @SerializedName("ToolAccessMode")
    @Expose
    private Long ToolAccessMode;

    /**
    * <p>是否禁用该工具</p>
    */
    @SerializedName("IsDisabled")
    @Expose
    private Boolean IsDisabled;

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
     * Get <p>插件名称</p> 
     * @return PluginName <p>插件名称</p>
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set <p>插件名称</p>
     * @param PluginName <p>插件名称</p>
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get <p>插件图标url</p> 
     * @return IconUrl <p>插件图标url</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>插件图标url</p>
     * @param IconUrl <p>插件图标url</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>0 自定义插件<br>1 官方插件<br>2 第三方插件 目前用于第三方实现的mcp server</p> 
     * @return PluginType <p>0 自定义插件<br>1 官方插件<br>2 第三方插件 目前用于第三方实现的mcp server</p>
     */
    public Long getPluginType() {
        return this.PluginType;
    }

    /**
     * Set <p>0 自定义插件<br>1 官方插件<br>2 第三方插件 目前用于第三方实现的mcp server</p>
     * @param PluginType <p>0 自定义插件<br>1 官方插件<br>2 第三方插件 目前用于第三方实现的mcp server</p>
     */
    public void setPluginType(Long PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get <p>工具id</p> 
     * @return ToolId <p>工具id</p>
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set <p>工具id</p>
     * @param ToolId <p>工具id</p>
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get <p>工具名称</p> 
     * @return ToolName <p>工具名称</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>工具名称</p>
     * @param ToolName <p>工具名称</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>工具描述</p> 
     * @return ToolDesc <p>工具描述</p>
     */
    public String getToolDesc() {
        return this.ToolDesc;
    }

    /**
     * Set <p>工具描述</p>
     * @param ToolDesc <p>工具描述</p>
     */
    public void setToolDesc(String ToolDesc) {
        this.ToolDesc = ToolDesc;
    }

    /**
     * Get <p>输入参数</p> 
     * @return Inputs <p>输入参数</p>
     */
    public AgentToolReqParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set <p>输入参数</p>
     * @param Inputs <p>输入参数</p>
     */
    public void setInputs(AgentToolReqParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get <p>输出参数</p> 
     * @return Outputs <p>输出参数</p>
     */
    public AgentToolRspParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>输出参数</p>
     * @param Outputs <p>输出参数</p>
     */
    public void setOutputs(AgentToolRspParam [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>创建方式，0:服务创建，1:代码创建，2:MCP创建</p> 
     * @return CreateType <p>创建方式，0:服务创建，1:代码创建，2:MCP创建</p>
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set <p>创建方式，0:服务创建，1:代码创建，2:MCP创建</p>
     * @param CreateType <p>创建方式，0:服务创建，1:代码创建，2:MCP创建</p>
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get <p>MCP插件的配置信息</p> 
     * @return McpServer <p>MCP插件的配置信息</p>
     */
    public AgentMCPServerInfo getMcpServer() {
        return this.McpServer;
    }

    /**
     * Set <p>MCP插件的配置信息</p>
     * @param McpServer <p>MCP插件的配置信息</p>
     */
    public void setMcpServer(AgentMCPServerInfo McpServer) {
        this.McpServer = McpServer;
    }

    /**
     * Get <p>该工具是否和知识库绑定</p> 
     * @return IsBindingKnowledge <p>该工具是否和知识库绑定</p>
     */
    public Boolean getIsBindingKnowledge() {
        return this.IsBindingKnowledge;
    }

    /**
     * Set <p>该工具是否和知识库绑定</p>
     * @param IsBindingKnowledge <p>该工具是否和知识库绑定</p>
     */
    public void setIsBindingKnowledge(Boolean IsBindingKnowledge) {
        this.IsBindingKnowledge = IsBindingKnowledge;
    }

    /**
     * Get <p>插件状态，1:可用，2:不可用</p> 
     * @return Status <p>插件状态，1:可用，2:不可用</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>插件状态，1:可用，2:不可用</p>
     * @param Status <p>插件状态，1:可用，2:不可用</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>header信息</p> 
     * @return Headers <p>header信息</p>
     */
    public AgentPluginHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>header信息</p>
     * @param Headers <p>header信息</p>
     */
    public void setHeaders(AgentPluginHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>NON_STREAMING: 非流式  STREAMIN: 流式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallingMethod <p>NON_STREAMING: 非流式  STREAMIN: 流式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallingMethod() {
        return this.CallingMethod;
    }

    /**
     * Set <p>NON_STREAMING: 非流式  STREAMIN: 流式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallingMethod <p>NON_STREAMING: 非流式  STREAMIN: 流式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallingMethod(String CallingMethod) {
        this.CallingMethod = CallingMethod;
    }

    /**
     * Get <p>query信息</p> 
     * @return Query <p>query信息</p>
     */
    public AgentPluginQuery [] getQuery() {
        return this.Query;
    }

    /**
     * Set <p>query信息</p>
     * @param Query <p>query信息</p>
     */
    public void setQuery(AgentPluginQuery [] Query) {
        this.Query = Query;
    }

    /**
     * Get <p>工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）</p> 
     * @return FinanceStatus <p>工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）</p>
     */
    public Long getFinanceStatus() {
        return this.FinanceStatus;
    }

    /**
     * Set <p>工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）</p>
     * @param FinanceStatus <p>工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）</p>
     */
    public void setFinanceStatus(Long FinanceStatus) {
        this.FinanceStatus = FinanceStatus;
    }

    /**
     * Get <p>工具来源: 0-来自插件，1-来自工作流</p> 
     * @return ToolSource <p>工具来源: 0-来自插件，1-来自工作流</p>
     */
    public Long getToolSource() {
        return this.ToolSource;
    }

    /**
     * Set <p>工具来源: 0-来自插件，1-来自工作流</p>
     * @param ToolSource <p>工具来源: 0-来自插件，1-来自工作流</p>
     */
    public void setToolSource(Long ToolSource) {
        this.ToolSource = ToolSource;
    }

    /**
     * Get <p>计费状态；0-不计费，1-限时免费，2-官方收费</p> 
     * @return FinanceType <p>计费状态；0-不计费，1-限时免费，2-官方收费</p>
     */
    public Long getFinanceType() {
        return this.FinanceType;
    }

    /**
     * Set <p>计费状态；0-不计费，1-限时免费，2-官方收费</p>
     * @param FinanceType <p>计费状态；0-不计费，1-限时免费，2-官方收费</p>
     */
    public void setFinanceType(Long FinanceType) {
        this.FinanceType = FinanceType;
    }

    /**
     * Get <p>工具高级设置</p> 
     * @return ToolAdvanceConfig <p>工具高级设置</p>
     */
    public ToolAdvanceConfig getToolAdvanceConfig() {
        return this.ToolAdvanceConfig;
    }

    /**
     * Set <p>工具高级设置</p>
     * @param ToolAdvanceConfig <p>工具高级设置</p>
     */
    public void setToolAdvanceConfig(ToolAdvanceConfig ToolAdvanceConfig) {
        this.ToolAdvanceConfig = ToolAdvanceConfig;
    }

    /**
     * Get <p>授权模式； 0-开发者授权；1-使用者授权</p> 
     * @return AuthMode <p>授权模式； 0-开发者授权；1-使用者授权</p>
     */
    public Long getAuthMode() {
        return this.AuthMode;
    }

    /**
     * Set <p>授权模式； 0-开发者授权；1-使用者授权</p>
     * @param AuthMode <p>授权模式； 0-开发者授权；1-使用者授权</p>
     */
    public void setAuthMode(Long AuthMode) {
        this.AuthMode = AuthMode;
    }

    /**
     * Get <p>授权类型; 0-无鉴权；1-APIKey；2-CAM授权；3-Oauth2.0授权；</p> 
     * @return AuthType <p>授权类型; 0-无鉴权；1-APIKey；2-CAM授权；3-Oauth2.0授权；</p>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>授权类型; 0-无鉴权；1-APIKey；2-CAM授权；3-Oauth2.0授权；</p>
     * @param AuthType <p>授权类型; 0-无鉴权；1-APIKey；2-CAM授权；3-Oauth2.0授权；</p>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>工具授权配置状态；0：不需要授权，1：需要授权-未配置，2：需要授权-已配置</p> 
     * @return AuthConfigStatus <p>工具授权配置状态；0：不需要授权，1：需要授权-未配置，2：需要授权-已配置</p>
     */
    public Long getAuthConfigStatus() {
        return this.AuthConfigStatus;
    }

    /**
     * Set <p>工具授权配置状态；0：不需要授权，1：需要授权-未配置，2：需要授权-已配置</p>
     * @param AuthConfigStatus <p>工具授权配置状态；0：不需要授权，1：需要授权-未配置，2：需要授权-已配置</p>
     */
    public void setAuthConfigStatus(Long AuthConfigStatus) {
        this.AuthConfigStatus = AuthConfigStatus;
    }

    /**
     * Get <p>连接器工具 API 类型</p><p>枚举值：</p><ul><li>1： 只读</li><li>2： 写/删除</li></ul> 
     * @return ToolAccessMode <p>连接器工具 API 类型</p><p>枚举值：</p><ul><li>1： 只读</li><li>2： 写/删除</li></ul>
     */
    public Long getToolAccessMode() {
        return this.ToolAccessMode;
    }

    /**
     * Set <p>连接器工具 API 类型</p><p>枚举值：</p><ul><li>1： 只读</li><li>2： 写/删除</li></ul>
     * @param ToolAccessMode <p>连接器工具 API 类型</p><p>枚举值：</p><ul><li>1： 只读</li><li>2： 写/删除</li></ul>
     */
    public void setToolAccessMode(Long ToolAccessMode) {
        this.ToolAccessMode = ToolAccessMode;
    }

    /**
     * Get <p>是否禁用该工具</p> 
     * @return IsDisabled <p>是否禁用该工具</p>
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set <p>是否禁用该工具</p>
     * @param IsDisabled <p>是否禁用该工具</p>
     */
    public void setIsDisabled(Boolean IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    public AgentToolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolInfo(AgentToolInfo source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.PluginType != null) {
            this.PluginType = new Long(source.PluginType);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ToolDesc != null) {
            this.ToolDesc = new String(source.ToolDesc);
        }
        if (source.Inputs != null) {
            this.Inputs = new AgentToolReqParam[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new AgentToolReqParam(source.Inputs[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new AgentToolRspParam[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new AgentToolRspParam(source.Outputs[i]);
            }
        }
        if (source.CreateType != null) {
            this.CreateType = new Long(source.CreateType);
        }
        if (source.McpServer != null) {
            this.McpServer = new AgentMCPServerInfo(source.McpServer);
        }
        if (source.IsBindingKnowledge != null) {
            this.IsBindingKnowledge = new Boolean(source.IsBindingKnowledge);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Headers != null) {
            this.Headers = new AgentPluginHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new AgentPluginHeader(source.Headers[i]);
            }
        }
        if (source.CallingMethod != null) {
            this.CallingMethod = new String(source.CallingMethod);
        }
        if (source.Query != null) {
            this.Query = new AgentPluginQuery[source.Query.length];
            for (int i = 0; i < source.Query.length; i++) {
                this.Query[i] = new AgentPluginQuery(source.Query[i]);
            }
        }
        if (source.FinanceStatus != null) {
            this.FinanceStatus = new Long(source.FinanceStatus);
        }
        if (source.ToolSource != null) {
            this.ToolSource = new Long(source.ToolSource);
        }
        if (source.FinanceType != null) {
            this.FinanceType = new Long(source.FinanceType);
        }
        if (source.ToolAdvanceConfig != null) {
            this.ToolAdvanceConfig = new ToolAdvanceConfig(source.ToolAdvanceConfig);
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
        if (source.ToolAccessMode != null) {
            this.ToolAccessMode = new Long(source.ToolAccessMode);
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Boolean(source.IsDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolDesc", this.ToolDesc);
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);
        this.setParamObj(map, prefix + "McpServer.", this.McpServer);
        this.setParamSimple(map, prefix + "IsBindingKnowledge", this.IsBindingKnowledge);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "CallingMethod", this.CallingMethod);
        this.setParamArrayObj(map, prefix + "Query.", this.Query);
        this.setParamSimple(map, prefix + "FinanceStatus", this.FinanceStatus);
        this.setParamSimple(map, prefix + "ToolSource", this.ToolSource);
        this.setParamSimple(map, prefix + "FinanceType", this.FinanceType);
        this.setParamObj(map, prefix + "ToolAdvanceConfig.", this.ToolAdvanceConfig);
        this.setParamSimple(map, prefix + "AuthMode", this.AuthMode);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthConfigStatus", this.AuthConfigStatus);
        this.setParamSimple(map, prefix + "ToolAccessMode", this.ToolAccessMode);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);

    }
}

