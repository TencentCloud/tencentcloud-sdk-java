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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamObj(map, prefix + "UserInputValue.", this.UserInputValue);
        this.setParamSimple(map, prefix + "CustomVarId", this.CustomVarId);

    }
}

