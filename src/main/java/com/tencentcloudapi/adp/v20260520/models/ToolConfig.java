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

public class ToolConfig extends AbstractModel {

    /**
    * API插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiToolConfig")
    @Expose
    private ApiToolConfig ApiToolConfig;

    /**
    * 应用插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppToolConfig")
    @Expose
    private AppToolConfig AppToolConfig;

    /**
    * 代码插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeToolConfig")
    @Expose
    private CodeToolConfig CodeToolConfig;

    /**
    * mcp插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCPToolConfig")
    @Expose
    private MCPToolConfig MCPToolConfig;

    /**
     * Get API插件工具配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiToolConfig API插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiToolConfig getApiToolConfig() {
        return this.ApiToolConfig;
    }

    /**
     * Set API插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiToolConfig API插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiToolConfig(ApiToolConfig ApiToolConfig) {
        this.ApiToolConfig = ApiToolConfig;
    }

    /**
     * Get 应用插件工具配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppToolConfig 应用插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppToolConfig getAppToolConfig() {
        return this.AppToolConfig;
    }

    /**
     * Set 应用插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppToolConfig 应用插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppToolConfig(AppToolConfig AppToolConfig) {
        this.AppToolConfig = AppToolConfig;
    }

    /**
     * Get 代码插件工具配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeToolConfig 代码插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodeToolConfig getCodeToolConfig() {
        return this.CodeToolConfig;
    }

    /**
     * Set 代码插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeToolConfig 代码插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeToolConfig(CodeToolConfig CodeToolConfig) {
        this.CodeToolConfig = CodeToolConfig;
    }

    /**
     * Get mcp插件工具配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCPToolConfig mcp插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MCPToolConfig getMCPToolConfig() {
        return this.MCPToolConfig;
    }

    /**
     * Set mcp插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCPToolConfig mcp插件工具配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMCPToolConfig(MCPToolConfig MCPToolConfig) {
        this.MCPToolConfig = MCPToolConfig;
    }

    public ToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolConfig(ToolConfig source) {
        if (source.ApiToolConfig != null) {
            this.ApiToolConfig = new ApiToolConfig(source.ApiToolConfig);
        }
        if (source.AppToolConfig != null) {
            this.AppToolConfig = new AppToolConfig(source.AppToolConfig);
        }
        if (source.CodeToolConfig != null) {
            this.CodeToolConfig = new CodeToolConfig(source.CodeToolConfig);
        }
        if (source.MCPToolConfig != null) {
            this.MCPToolConfig = new MCPToolConfig(source.MCPToolConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ApiToolConfig.", this.ApiToolConfig);
        this.setParamObj(map, prefix + "AppToolConfig.", this.AppToolConfig);
        this.setParamObj(map, prefix + "CodeToolConfig.", this.CodeToolConfig);
        this.setParamObj(map, prefix + "MCPToolConfig.", this.MCPToolConfig);

    }
}

