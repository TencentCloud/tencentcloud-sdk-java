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
    * <p>API工具配置信息</p>
    */
    @SerializedName("ApiToolConfig")
    @Expose
    private ApiToolConfig ApiToolConfig;

    /**
    * <p>应用配置信息</p>
    */
    @SerializedName("AppToolConfig")
    @Expose
    private AppToolConfig AppToolConfig;

    /**
    * <p>代码工具配置信息</p>
    */
    @SerializedName("CodeToolConfig")
    @Expose
    private CodeToolConfig CodeToolConfig;

    /**
    * <p>MCP工具配置信息</p>
    */
    @SerializedName("MCPToolConfig")
    @Expose
    private MCPToolConfig MCPToolConfig;

    /**
     * Get <p>API工具配置信息</p> 
     * @return ApiToolConfig <p>API工具配置信息</p>
     */
    public ApiToolConfig getApiToolConfig() {
        return this.ApiToolConfig;
    }

    /**
     * Set <p>API工具配置信息</p>
     * @param ApiToolConfig <p>API工具配置信息</p>
     */
    public void setApiToolConfig(ApiToolConfig ApiToolConfig) {
        this.ApiToolConfig = ApiToolConfig;
    }

    /**
     * Get <p>应用配置信息</p> 
     * @return AppToolConfig <p>应用配置信息</p>
     */
    public AppToolConfig getAppToolConfig() {
        return this.AppToolConfig;
    }

    /**
     * Set <p>应用配置信息</p>
     * @param AppToolConfig <p>应用配置信息</p>
     */
    public void setAppToolConfig(AppToolConfig AppToolConfig) {
        this.AppToolConfig = AppToolConfig;
    }

    /**
     * Get <p>代码工具配置信息</p> 
     * @return CodeToolConfig <p>代码工具配置信息</p>
     */
    public CodeToolConfig getCodeToolConfig() {
        return this.CodeToolConfig;
    }

    /**
     * Set <p>代码工具配置信息</p>
     * @param CodeToolConfig <p>代码工具配置信息</p>
     */
    public void setCodeToolConfig(CodeToolConfig CodeToolConfig) {
        this.CodeToolConfig = CodeToolConfig;
    }

    /**
     * Get <p>MCP工具配置信息</p> 
     * @return MCPToolConfig <p>MCP工具配置信息</p>
     */
    public MCPToolConfig getMCPToolConfig() {
        return this.MCPToolConfig;
    }

    /**
     * Set <p>MCP工具配置信息</p>
     * @param MCPToolConfig <p>MCP工具配置信息</p>
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

