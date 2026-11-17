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

public class AgentBuiltinToolConfig extends AbstractModel {

    /**
    * <p>工具名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>是否禁用该内置工具</p>
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
     * Get <p>工具名称</p> 
     * @return Name <p>工具名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工具名称</p>
     * @param Name <p>工具名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>是否禁用该内置工具</p> 
     * @return Disabled <p>是否禁用该内置工具</p>
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set <p>是否禁用该内置工具</p>
     * @param Disabled <p>是否禁用该内置工具</p>
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    public AgentBuiltinToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentBuiltinToolConfig(AgentBuiltinToolConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

