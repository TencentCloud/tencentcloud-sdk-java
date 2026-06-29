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

public class PluginConfig extends AbstractModel {

    /**
    * API插件配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiPluginConfig")
    @Expose
    private ApiPluginConfig ApiPluginConfig;

    /**
    * 应用插件配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppPluginConfig")
    @Expose
    private AppPluginConfig AppPluginConfig;

    /**
    * mcp插件配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCPPluginConfig")
    @Expose
    private MCPPluginConfig MCPPluginConfig;

    /**
     * Get API插件配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiPluginConfig API插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiPluginConfig getApiPluginConfig() {
        return this.ApiPluginConfig;
    }

    /**
     * Set API插件配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiPluginConfig API插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiPluginConfig(ApiPluginConfig ApiPluginConfig) {
        this.ApiPluginConfig = ApiPluginConfig;
    }

    /**
     * Get 应用插件配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppPluginConfig 应用插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppPluginConfig getAppPluginConfig() {
        return this.AppPluginConfig;
    }

    /**
     * Set 应用插件配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppPluginConfig 应用插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppPluginConfig(AppPluginConfig AppPluginConfig) {
        this.AppPluginConfig = AppPluginConfig;
    }

    /**
     * Get mcp插件配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCPPluginConfig mcp插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MCPPluginConfig getMCPPluginConfig() {
        return this.MCPPluginConfig;
    }

    /**
     * Set mcp插件配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCPPluginConfig mcp插件配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMCPPluginConfig(MCPPluginConfig MCPPluginConfig) {
        this.MCPPluginConfig = MCPPluginConfig;
    }

    public PluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginConfig(PluginConfig source) {
        if (source.ApiPluginConfig != null) {
            this.ApiPluginConfig = new ApiPluginConfig(source.ApiPluginConfig);
        }
        if (source.AppPluginConfig != null) {
            this.AppPluginConfig = new AppPluginConfig(source.AppPluginConfig);
        }
        if (source.MCPPluginConfig != null) {
            this.MCPPluginConfig = new MCPPluginConfig(source.MCPPluginConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ApiPluginConfig.", this.ApiPluginConfig);
        this.setParamObj(map, prefix + "AppPluginConfig.", this.AppPluginConfig);
        this.setParamObj(map, prefix + "MCPPluginConfig.", this.MCPPluginConfig);

    }
}

