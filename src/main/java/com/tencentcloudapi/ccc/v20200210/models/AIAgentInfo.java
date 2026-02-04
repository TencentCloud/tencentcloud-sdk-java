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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAgentInfo extends AbstractModel {

    /**
    * 智能体ID
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

    /**
    * 智能体名称
    */
    @SerializedName("AIAgentName")
    @Expose
    private String AIAgentName;

    /**
    * 智能体变量名列表
    */
    @SerializedName("VariableNames")
    @Expose
    private String [] VariableNames;

    /**
     * Get 智能体ID 
     * @return AIAgentId 智能体ID
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set 智能体ID
     * @param AIAgentId 智能体ID
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
    }

    /**
     * Get 智能体名称 
     * @return AIAgentName 智能体名称
     */
    public String getAIAgentName() {
        return this.AIAgentName;
    }

    /**
     * Set 智能体名称
     * @param AIAgentName 智能体名称
     */
    public void setAIAgentName(String AIAgentName) {
        this.AIAgentName = AIAgentName;
    }

    /**
     * Get 智能体变量名列表 
     * @return VariableNames 智能体变量名列表
     */
    public String [] getVariableNames() {
        return this.VariableNames;
    }

    /**
     * Set 智能体变量名列表
     * @param VariableNames 智能体变量名列表
     */
    public void setVariableNames(String [] VariableNames) {
        this.VariableNames = VariableNames;
    }

    public AIAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentInfo(AIAgentInfo source) {
        if (source.AIAgentId != null) {
            this.AIAgentId = new Long(source.AIAgentId);
        }
        if (source.AIAgentName != null) {
            this.AIAgentName = new String(source.AIAgentName);
        }
        if (source.VariableNames != null) {
            this.VariableNames = new String[source.VariableNames.length];
            for (int i = 0; i < source.VariableNames.length; i++) {
                this.VariableNames[i] = new String(source.VariableNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AIAgentId", this.AIAgentId);
        this.setParamSimple(map, prefix + "AIAgentName", this.AIAgentName);
        this.setParamArraySimple(map, prefix + "VariableNames.", this.VariableNames);

    }
}

