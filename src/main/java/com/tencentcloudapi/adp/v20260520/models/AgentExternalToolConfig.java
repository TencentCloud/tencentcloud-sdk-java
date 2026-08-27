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

public class AgentExternalToolConfig extends AbstractModel {

    /**
    * <p>工具类型</p><p>入参限制：目前仅支持 &quot;function&quot;</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>工具描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工具入参定义</p>
    */
    @SerializedName("Parameters")
    @Expose
    private RequestParam [] Parameters;

    /**
     * Get <p>工具类型</p><p>入参限制：目前仅支持 &quot;function&quot;</p> 
     * @return Type <p>工具类型</p><p>入参限制：目前仅支持 &quot;function&quot;</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>工具类型</p><p>入参限制：目前仅支持 &quot;function&quot;</p>
     * @param Type <p>工具类型</p><p>入参限制：目前仅支持 &quot;function&quot;</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

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
     * Get <p>工具描述</p> 
     * @return Description <p>工具描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工具描述</p>
     * @param Description <p>工具描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工具入参定义</p> 
     * @return Parameters <p>工具入参定义</p>
     */
    public RequestParam [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>工具入参定义</p>
     * @param Parameters <p>工具入参定义</p>
     */
    public void setParameters(RequestParam [] Parameters) {
        this.Parameters = Parameters;
    }

    public AgentExternalToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentExternalToolConfig(AgentExternalToolConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Parameters != null) {
            this.Parameters = new RequestParam[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RequestParam(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

