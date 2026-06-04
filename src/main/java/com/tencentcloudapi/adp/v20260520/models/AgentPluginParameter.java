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

public class AgentPluginParameter extends AbstractModel {

    /**
    * <p>参数名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>是否必填</p>
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * <p>输入的值</p>
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get <p>参数名称</p> 
     * @return Name <p>参数名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>参数名称</p>
     * @param Name <p>参数名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>是否必填</p> 
     * @return IsRequired <p>是否必填</p>
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set <p>是否必填</p>
     * @param IsRequired <p>是否必填</p>
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get <p>输入的值</p> 
     * @return Input <p>输入的值</p>
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>输入的值</p>
     * @param Input <p>输入的值</p>
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public AgentPluginParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginParameter(AgentPluginParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

