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

public class KnowledgeQaPlugin extends AbstractModel {

    /**
    * 插件ID
注意：此字段可能返回 null，表示取不到有效值。
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
    * 插件图标
    */
    @SerializedName("PluginIcon")
    @Expose
    private String PluginIcon;

    /**
    * 工具ID
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
    * 工具输入参数
    */
    @SerializedName("Inputs")
    @Expose
    private PluginToolReqParam [] Inputs;

    /**
    * 插件是否和知识库绑定
    */
    @SerializedName("IsBindingKnowledge")
    @Expose
    private Boolean IsBindingKnowledge;

    /**
     * Get 插件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginId 插件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginId 插件ID
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 插件图标 
     * @return PluginIcon 插件图标
     */
    public String getPluginIcon() {
        return this.PluginIcon;
    }

    /**
     * Set 插件图标
     * @param PluginIcon 插件图标
     */
    public void setPluginIcon(String PluginIcon) {
        this.PluginIcon = PluginIcon;
    }

    /**
     * Get 工具ID 
     * @return ToolId 工具ID
     */
    public String getToolId() {
        return this.ToolId;
    }

    /**
     * Set 工具ID
     * @param ToolId 工具ID
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
     * Get 工具输入参数 
     * @return Inputs 工具输入参数
     */
    public PluginToolReqParam [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 工具输入参数
     * @param Inputs 工具输入参数
     */
    public void setInputs(PluginToolReqParam [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get 插件是否和知识库绑定 
     * @return IsBindingKnowledge 插件是否和知识库绑定
     */
    public Boolean getIsBindingKnowledge() {
        return this.IsBindingKnowledge;
    }

    /**
     * Set 插件是否和知识库绑定
     * @param IsBindingKnowledge 插件是否和知识库绑定
     */
    public void setIsBindingKnowledge(Boolean IsBindingKnowledge) {
        this.IsBindingKnowledge = IsBindingKnowledge;
    }

    public KnowledgeQaPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaPlugin(KnowledgeQaPlugin source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginIcon != null) {
            this.PluginIcon = new String(source.PluginIcon);
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
            this.Inputs = new PluginToolReqParam[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new PluginToolReqParam(source.Inputs[i]);
            }
        }
        if (source.IsBindingKnowledge != null) {
            this.IsBindingKnowledge = new Boolean(source.IsBindingKnowledge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginIcon", this.PluginIcon);
        this.setParamSimple(map, prefix + "ToolId", this.ToolId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolDesc", this.ToolDesc);
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);
        this.setParamSimple(map, prefix + "IsBindingKnowledge", this.IsBindingKnowledge);

    }
}

