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

public class AgentInput extends AbstractModel {

    /**
    * 输入来源类型：0 用户输入，3 自定义变量（API参数）
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * 用户手写输入
    */
    @SerializedName("UserInputValue")
    @Expose
    private AgentInputUserInputValue UserInputValue;

    /**
    * 自定义变量（API参数）
    */
    @SerializedName("CustomVarId")
    @Expose
    private String CustomVarId;

    /**
    * 环境变量参数
    */
    @SerializedName("EnvVarId")
    @Expose
    private String EnvVarId;

    /**
    * 应用变量参数
    */
    @SerializedName("AppVarId")
    @Expose
    private String AppVarId;

    /**
    * 系统参数
    */
    @SerializedName("SystemVariable")
    @Expose
    private AgentInputSystemVariable SystemVariable;

    /**
    * 工具参数
    */
    @SerializedName("ToolParam")
    @Expose
    private String ToolParam;

    /**
     * Get 输入来源类型：0 用户输入，3 自定义变量（API参数） 
     * @return InputType 输入来源类型：0 用户输入，3 自定义变量（API参数）
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set 输入来源类型：0 用户输入，3 自定义变量（API参数）
     * @param InputType 输入来源类型：0 用户输入，3 自定义变量（API参数）
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 用户手写输入 
     * @return UserInputValue 用户手写输入
     */
    public AgentInputUserInputValue getUserInputValue() {
        return this.UserInputValue;
    }

    /**
     * Set 用户手写输入
     * @param UserInputValue 用户手写输入
     */
    public void setUserInputValue(AgentInputUserInputValue UserInputValue) {
        this.UserInputValue = UserInputValue;
    }

    /**
     * Get 自定义变量（API参数） 
     * @return CustomVarId 自定义变量（API参数）
     */
    public String getCustomVarId() {
        return this.CustomVarId;
    }

    /**
     * Set 自定义变量（API参数）
     * @param CustomVarId 自定义变量（API参数）
     */
    public void setCustomVarId(String CustomVarId) {
        this.CustomVarId = CustomVarId;
    }

    /**
     * Get 环境变量参数 
     * @return EnvVarId 环境变量参数
     */
    public String getEnvVarId() {
        return this.EnvVarId;
    }

    /**
     * Set 环境变量参数
     * @param EnvVarId 环境变量参数
     */
    public void setEnvVarId(String EnvVarId) {
        this.EnvVarId = EnvVarId;
    }

    /**
     * Get 应用变量参数 
     * @return AppVarId 应用变量参数
     */
    public String getAppVarId() {
        return this.AppVarId;
    }

    /**
     * Set 应用变量参数
     * @param AppVarId 应用变量参数
     */
    public void setAppVarId(String AppVarId) {
        this.AppVarId = AppVarId;
    }

    /**
     * Get 系统参数 
     * @return SystemVariable 系统参数
     */
    public AgentInputSystemVariable getSystemVariable() {
        return this.SystemVariable;
    }

    /**
     * Set 系统参数
     * @param SystemVariable 系统参数
     */
    public void setSystemVariable(AgentInputSystemVariable SystemVariable) {
        this.SystemVariable = SystemVariable;
    }

    /**
     * Get 工具参数 
     * @return ToolParam 工具参数
     */
    public String getToolParam() {
        return this.ToolParam;
    }

    /**
     * Set 工具参数
     * @param ToolParam 工具参数
     */
    public void setToolParam(String ToolParam) {
        this.ToolParam = ToolParam;
    }

    public AgentInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentInput(AgentInput source) {
        if (source.InputType != null) {
            this.InputType = new Long(source.InputType);
        }
        if (source.UserInputValue != null) {
            this.UserInputValue = new AgentInputUserInputValue(source.UserInputValue);
        }
        if (source.CustomVarId != null) {
            this.CustomVarId = new String(source.CustomVarId);
        }
        if (source.EnvVarId != null) {
            this.EnvVarId = new String(source.EnvVarId);
        }
        if (source.AppVarId != null) {
            this.AppVarId = new String(source.AppVarId);
        }
        if (source.SystemVariable != null) {
            this.SystemVariable = new AgentInputSystemVariable(source.SystemVariable);
        }
        if (source.ToolParam != null) {
            this.ToolParam = new String(source.ToolParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamObj(map, prefix + "UserInputValue.", this.UserInputValue);
        this.setParamSimple(map, prefix + "CustomVarId", this.CustomVarId);
        this.setParamSimple(map, prefix + "EnvVarId", this.EnvVarId);
        this.setParamSimple(map, prefix + "AppVarId", this.AppVarId);
        this.setParamObj(map, prefix + "SystemVariable.", this.SystemVariable);
        this.setParamSimple(map, prefix + "ToolParam", this.ToolParam);

    }
}

