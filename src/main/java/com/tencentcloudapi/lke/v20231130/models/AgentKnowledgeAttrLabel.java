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

public class AgentKnowledgeAttrLabel extends AbstractModel {

    /**
    * 属性ID
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * 标签值，标签值之间是或的关系，只有匹配的，才会进行知识检索，否则报检索不到
    */
    @SerializedName("Inputs")
    @Expose
    private AgentInput [] Inputs;

    /**
     * Get 属性ID 
     * @return AttributeBizId 属性ID
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set 属性ID
     * @param AttributeBizId 属性ID
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get 标签值，标签值之间是或的关系，只有匹配的，才会进行知识检索，否则报检索不到 
     * @return Inputs 标签值，标签值之间是或的关系，只有匹配的，才会进行知识检索，否则报检索不到
     */
    public AgentInput [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 标签值，标签值之间是或的关系，只有匹配的，才会进行知识检索，否则报检索不到
     * @param Inputs 标签值，标签值之间是或的关系，只有匹配的，才会进行知识检索，否则报检索不到
     */
    public void setInputs(AgentInput [] Inputs) {
        this.Inputs = Inputs;
    }

    public AgentKnowledgeAttrLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentKnowledgeAttrLabel(AgentKnowledgeAttrLabel source) {
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.Inputs != null) {
            this.Inputs = new AgentInput[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new AgentInput(source.Inputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);

    }
}

