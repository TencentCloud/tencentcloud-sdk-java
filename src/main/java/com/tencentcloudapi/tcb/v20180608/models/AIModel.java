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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIModel extends AbstractModel {

    /**
    * 模型名
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 是否开启MCP
    */
    @SerializedName("EnableMCP")
    @Expose
    private Boolean EnableMCP;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 模型名 
     * @return Model 模型名
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名
     * @param Model 模型名
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 是否开启MCP 
     * @return EnableMCP 是否开启MCP
     */
    public Boolean getEnableMCP() {
        return this.EnableMCP;
    }

    /**
     * Set 是否开启MCP
     * @param EnableMCP 是否开启MCP
     */
    public void setEnableMCP(Boolean EnableMCP) {
        this.EnableMCP = EnableMCP;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public AIModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIModel(AIModel source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.EnableMCP != null) {
            this.EnableMCP = new Boolean(source.EnableMCP);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "EnableMCP", this.EnableMCP);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

