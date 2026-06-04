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

public class AgentInput extends AbstractModel {

    /**
    * <p>输入来源类型：0 用户输入，3 自定义变量（API参数）</p>
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * <p>用户手写输入</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserInputValue")
    @Expose
    private AgentUserInputValue UserInputValue;

    /**
    * <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemVariable")
    @Expose
    private AgentSystemVariable SystemVariable;

    /**
    * <p>自定义变量（API参数）</p>
    */
    @SerializedName("CustomVariableId")
    @Expose
    private String CustomVariableId;

    /**
    * <p>环境变量参数</p>
    */
    @SerializedName("EnvVariableId")
    @Expose
    private String EnvVariableId;

    /**
    * <p>应用变量参数</p>
    */
    @SerializedName("AppVariableId")
    @Expose
    private String AppVariableId;

    /**
     * Get <p>输入来源类型：0 用户输入，3 自定义变量（API参数）</p> 
     * @return InputType <p>输入来源类型：0 用户输入，3 自定义变量（API参数）</p>
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>输入来源类型：0 用户输入，3 自定义变量（API参数）</p>
     * @param InputType <p>输入来源类型：0 用户输入，3 自定义变量（API参数）</p>
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>用户手写输入</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserInputValue <p>用户手写输入</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentUserInputValue getUserInputValue() {
        return this.UserInputValue;
    }

    /**
     * Set <p>用户手写输入</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserInputValue <p>用户手写输入</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserInputValue(AgentUserInputValue UserInputValue) {
        this.UserInputValue = UserInputValue;
    }

    /**
     * Get <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemVariable <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentSystemVariable getSystemVariable() {
        return this.SystemVariable;
    }

    /**
     * Set <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemVariable <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemVariable(AgentSystemVariable SystemVariable) {
        this.SystemVariable = SystemVariable;
    }

    /**
     * Get <p>自定义变量（API参数）</p> 
     * @return CustomVariableId <p>自定义变量（API参数）</p>
     */
    public String getCustomVariableId() {
        return this.CustomVariableId;
    }

    /**
     * Set <p>自定义变量（API参数）</p>
     * @param CustomVariableId <p>自定义变量（API参数）</p>
     */
    public void setCustomVariableId(String CustomVariableId) {
        this.CustomVariableId = CustomVariableId;
    }

    /**
     * Get <p>环境变量参数</p> 
     * @return EnvVariableId <p>环境变量参数</p>
     */
    public String getEnvVariableId() {
        return this.EnvVariableId;
    }

    /**
     * Set <p>环境变量参数</p>
     * @param EnvVariableId <p>环境变量参数</p>
     */
    public void setEnvVariableId(String EnvVariableId) {
        this.EnvVariableId = EnvVariableId;
    }

    /**
     * Get <p>应用变量参数</p> 
     * @return AppVariableId <p>应用变量参数</p>
     */
    public String getAppVariableId() {
        return this.AppVariableId;
    }

    /**
     * Set <p>应用变量参数</p>
     * @param AppVariableId <p>应用变量参数</p>
     */
    public void setAppVariableId(String AppVariableId) {
        this.AppVariableId = AppVariableId;
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
            this.UserInputValue = new AgentUserInputValue(source.UserInputValue);
        }
        if (source.SystemVariable != null) {
            this.SystemVariable = new AgentSystemVariable(source.SystemVariable);
        }
        if (source.CustomVariableId != null) {
            this.CustomVariableId = new String(source.CustomVariableId);
        }
        if (source.EnvVariableId != null) {
            this.EnvVariableId = new String(source.EnvVariableId);
        }
        if (source.AppVariableId != null) {
            this.AppVariableId = new String(source.AppVariableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamObj(map, prefix + "UserInputValue.", this.UserInputValue);
        this.setParamObj(map, prefix + "SystemVariable.", this.SystemVariable);
        this.setParamSimple(map, prefix + "CustomVariableId", this.CustomVariableId);
        this.setParamSimple(map, prefix + "EnvVariableId", this.EnvVariableId);
        this.setParamSimple(map, prefix + "AppVariableId", this.AppVariableId);

    }
}

