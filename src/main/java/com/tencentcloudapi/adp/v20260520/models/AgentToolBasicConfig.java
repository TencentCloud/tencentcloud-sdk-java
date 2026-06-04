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

public class AgentToolBasicConfig extends AbstractModel {

    /**
    * <p>插件id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>工具id</p>
    */
    @SerializedName("ToolId")
    @Expose
    private String ToolId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工具输入参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputList")
    @Expose
    private AgentToolInputParameter [] InputList;

    /**
    * <p>工具输出参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputList")
    @Expose
    private AgentToolOutputParameter [] OutputList;

    /**
    * <p>工具Header参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderParameterList")
    @Expose
    private AgentPluginParameter [] HeaderParameterList;

    /**
    * <p>工具Query参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryParameterList")
    @Expose
    private AgentPluginParameter [] QueryParameterList;

    /**
    * <p>工具来源: 0-来自插件，1-来自工作流</p>
    */
    @SerializedName("ToolSource")
    @Expose
    private Long ToolSource;

    /**
    * <p>是否禁用</p>
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
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工具输入参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputList <p>工具输入参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentToolInputParameter [] getInputList() {
        return this.InputList;
    }

    /**
     * Set <p>工具输入参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputList <p>工具输入参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputList(AgentToolInputParameter [] InputList) {
        this.InputList = InputList;
    }

    /**
     * Get <p>工具输出参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputList <p>工具输出参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentToolOutputParameter [] getOutputList() {
        return this.OutputList;
    }

    /**
     * Set <p>工具输出参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputList <p>工具输出参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputList(AgentToolOutputParameter [] OutputList) {
        this.OutputList = OutputList;
    }

    /**
     * Get <p>工具Header参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderParameterList <p>工具Header参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentPluginParameter [] getHeaderParameterList() {
        return this.HeaderParameterList;
    }

    /**
     * Set <p>工具Header参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderParameterList <p>工具Header参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderParameterList(AgentPluginParameter [] HeaderParameterList) {
        this.HeaderParameterList = HeaderParameterList;
    }

    /**
     * Get <p>工具Query参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryParameterList <p>工具Query参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentPluginParameter [] getQueryParameterList() {
        return this.QueryParameterList;
    }

    /**
     * Set <p>工具Query参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryParameterList <p>工具Query参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryParameterList(AgentPluginParameter [] QueryParameterList) {
        this.QueryParameterList = QueryParameterList;
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
     * Get <p>是否禁用</p> 
     * @return IsDisabled <p>是否禁用</p>
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set <p>是否禁用</p>
     * @param IsDisabled <p>是否禁用</p>
     */
    public void setIsDisabled(Boolean IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    public AgentToolBasicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolBasicConfig(AgentToolBasicConfig source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ToolId != null) {
            this.ToolId = new String(source.ToolId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputList != null) {
            this.InputList = new AgentToolInputParameter[source.InputList.length];
            for (int i = 0; i < source.InputList.length; i++) {
                this.InputList[i] = new AgentToolInputParameter(source.InputList[i]);
            }
        }
        if (source.OutputList != null) {
            this.OutputList = new AgentToolOutputParameter[source.OutputList.length];
            for (int i = 0; i < source.OutputList.length; i++) {
                this.OutputList[i] = new AgentToolOutputParameter(source.OutputList[i]);
            }
        }
        if (source.HeaderParameterList != null) {
            this.HeaderParameterList = new AgentPluginParameter[source.HeaderParameterList.length];
            for (int i = 0; i < source.HeaderParameterList.length; i++) {
                this.HeaderParameterList[i] = new AgentPluginParameter(source.HeaderParameterList[i]);
            }
        }
        if (source.QueryParameterList != null) {
            this.QueryParameterList = new AgentPluginParameter[source.QueryParameterList.length];
            for (int i = 0; i < source.QueryParameterList.length; i++) {
                this.QueryParameterList[i] = new AgentPluginParameter(source.QueryParameterList[i]);
            }
        }
        if (source.ToolSource != null) {
            this.ToolSource = new Long(source.ToolSource);
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
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "InputList.", this.InputList);
        this.setParamArrayObj(map, prefix + "OutputList.", this.OutputList);
        this.setParamArrayObj(map, prefix + "HeaderParameterList.", this.HeaderParameterList);
        this.setParamArrayObj(map, prefix + "QueryParameterList.", this.QueryParameterList);
        this.setParamSimple(map, prefix + "ToolSource", this.ToolSource);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);

    }
}

