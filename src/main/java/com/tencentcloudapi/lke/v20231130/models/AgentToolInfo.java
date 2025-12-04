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
    * 插件id
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 插件名称
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 插件图标url
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 0 自定义插件
1 官方插件
2 第三方插件 目前用于第三方实现的mcp server
    */
    @SerializedName("PluginType")
    @Expose
    private Long PluginType;

    /**
    * 工具id
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * 工具名称
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * 工具描述
    */
    @SerializedName("ToolDesc")
    @Expose
    private String ToolDesc;

    /**
    * 输入参数
    */
    @SerializedName("Inputs")
    @Expose
    private AgentToolReqParam [] Inputs;

    /**
    * 输出参数
    */
    @SerializedName("Outputs")
    @Expose
    private AgentToolRspParam [] Outputs;

    /**
    * 创建方式，0:服务创建，1:代码创建，2:MCP创建	
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
    * MCP插件的配置信息
    */
    @SerializedName("McpServer")
    @Expose
    private AgentMCPServerInfo McpServer;

    /**
    * 该工具是否和知识库绑定
    */
    @SerializedName("IsBindingKnowledge")
    @Expose
    private Boolean IsBindingKnowledge;

    /**
    * 插件状态，1:可用，2:不可用	
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * header信息
    */
    @SerializedName("Headers")
    @Expose
    private AgentPluginHeader [] Headers;

    /**
    * NON_STREAMING: 非流式  STREAMIN: 流式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallingMethod")
    @Expose
    private String CallingMethod;

    /**
    * query信息
    */
    @SerializedName("Query")
    @Expose
    private AgentPluginQuery [] Query;

    /**
    * 工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）
    */
    @SerializedName("FinanceStatus")
    @Expose
    private Long FinanceStatus;

    /**
    * 工具来源: 0-来自插件，1-来自工作流
    */
    @SerializedName("ToolSource")
    @Expose
    private Long ToolSource;

    /**
    * 计费状态；0-不计费，1-限时免费，2-官方收费
    */
    @SerializedName("FinanceType")
    @Expose
    private Long FinanceType;

    /**
     * Get 插件id 
     * @return PluginId 插件id
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件id
     * @param PluginId 插件id
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 插件名称 
     * @return PluginName 插件名称
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 插件名称
     * @param PluginName 插件名称
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 插件图标url 
     * @return IconUrl 插件图标url
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 插件图标url
     * @param IconUrl 插件图标url
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 0 自定义插件
1 官方插件
2 第三方插件 目前用于第三方实现的mcp server 
     * @return PluginType 0 自定义插件
1 官方插件
2 第三方插件 目前用于第三方实现的mcp server
     */
    public Long getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 0 自定义插件
1 官方插件
2 第三方插件 目前用于第三方实现的mcp server
     * @param PluginType 0 自定义插件
1 官方插件
2 第三方插件 目前用于第三方实现的mcp server
     */
    public void setPluginType(Long PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get 工具id 
     * @return ToolId 工具id
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 工具id
     * @param ToolId 工具id
     */
    public void setToolId(String ToolId) {
        this.ToolId = ToolId;
    }

    /**
     * Get 工具名称 
     * @return ToolName 工具名称
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set 工具名称
     * @param ToolName 工具名称
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get 工具描述 
     * @return ToolDesc 工具描述
     */
    public String getToolDesc() {
        return this.ToolDesc;
    }

    /**
     * Set 工具描述
     * @param ToolDesc 工具描述
     */
    public void setToolDesc(String ToolDesc) {
        this.ToolDesc = ToolDesc;
    }

    /**
     * Get 输入参数 
     * @return Inputs 输入参数
     */
    public AgentToolReqParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 输入参数
     * @param Inputs 输入参数
     */
    public void setInputs(AgentToolReqParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get 输出参数 
     * @return Outputs 输出参数
     */
    public AgentToolRspParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 输出参数
     * @param Outputs 输出参数
     */
    public void setOutputs(AgentToolRspParam [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get 创建方式，0:服务创建，1:代码创建，2:MCP创建	 
     * @return CreateType 创建方式，0:服务创建，1:代码创建，2:MCP创建	
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set 创建方式，0:服务创建，1:代码创建，2:MCP创建	
     * @param CreateType 创建方式，0:服务创建，1:代码创建，2:MCP创建	
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get MCP插件的配置信息 
     * @return McpServer MCP插件的配置信息
     */
    public AgentMCPServerInfo getMcpServer() {
        return this.McpServer;
    }

    /**
     * Set MCP插件的配置信息
     * @param McpServer MCP插件的配置信息
     */
    public void setMcpServer(AgentMCPServerInfo McpServer) {
        this.McpServer = McpServer;
    }

    /**
     * Get 该工具是否和知识库绑定 
     * @return IsBindingKnowledge 该工具是否和知识库绑定
     */
    public Boolean getIsBindingKnowledge() {
        return this.IsBindingKnowledge;
    }

    /**
     * Set 该工具是否和知识库绑定
     * @param IsBindingKnowledge 该工具是否和知识库绑定
     */
    public void setIsBindingKnowledge(Boolean IsBindingKnowledge) {
        this.IsBindingKnowledge = IsBindingKnowledge;
    }

    /**
     * Get 插件状态，1:可用，2:不可用	 
     * @return Status 插件状态，1:可用，2:不可用	
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 插件状态，1:可用，2:不可用	
     * @param Status 插件状态，1:可用，2:不可用	
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get header信息 
     * @return Headers header信息
     */
    public AgentPluginHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set header信息
     * @param Headers header信息
     */
    public void setHeaders(AgentPluginHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get NON_STREAMING: 非流式  STREAMIN: 流式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallingMethod NON_STREAMING: 非流式  STREAMIN: 流式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallingMethod() {
        return this.CallingMethod;
    }

    /**
     * Set NON_STREAMING: 非流式  STREAMIN: 流式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallingMethod NON_STREAMING: 非流式  STREAMIN: 流式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallingMethod(String CallingMethod) {
        this.CallingMethod = CallingMethod;
    }

    /**
     * Get query信息 
     * @return Query query信息
     */
    public AgentPluginQuery [] getQuery() {
        return this.Query;
    }

    /**
     * Set query信息
     * @param Query query信息
     */
    public void setQuery(AgentPluginQuery [] Query) {
        this.Query = Query;
    }

    /**
     * Get 工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等） 
     * @return FinanceStatus 工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）
     */
    public Long getFinanceStatus() {
        return this.FinanceStatus;
    }

    /**
     * Set 工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）
     * @param FinanceStatus 工具计费状态 0-不计费 1-可用 2-不可用（欠费、无资源等）
     */
    public void setFinanceStatus(Long FinanceStatus) {
        this.FinanceStatus = FinanceStatus;
    }

    /**
     * Get 工具来源: 0-来自插件，1-来自工作流 
     * @return ToolSource 工具来源: 0-来自插件，1-来自工作流
     */
    public Long getToolSource() {
        return this.ToolSource;
    }

    /**
     * Set 工具来源: 0-来自插件，1-来自工作流
     * @param ToolSource 工具来源: 0-来自插件，1-来自工作流
     */
    public void setToolSource(Long ToolSource) {
        this.ToolSource = ToolSource;
    }

    /**
     * Get 计费状态；0-不计费，1-限时免费，2-官方收费 
     * @return FinanceType 计费状态；0-不计费，1-限时免费，2-官方收费
     */
    public Long getFinanceType() {
        return this.FinanceType;
    }

    /**
     * Set 计费状态；0-不计费，1-限时免费，2-官方收费
     * @param FinanceType 计费状态；0-不计费，1-限时免费，2-官方收费
     */
    public void setFinanceType(Long FinanceType) {
        this.FinanceType = FinanceType;
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

    }
}

