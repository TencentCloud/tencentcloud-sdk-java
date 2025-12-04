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

public class AgentHandoffAdvancedSetting extends AbstractModel {

    /**
    * 对话流转策略；0-由上一轮回复用户的 Agent 继续发起，1- 回到主Agent
    */
    @SerializedName("ConversationPolicy")
    @Expose
    private Long ConversationPolicy;

    /**
     * Get 对话流转策略；0-由上一轮回复用户的 Agent 继续发起，1- 回到主Agent 
     * @return ConversationPolicy 对话流转策略；0-由上一轮回复用户的 Agent 继续发起，1- 回到主Agent
     */
    public Long getConversationPolicy() {
        return this.ConversationPolicy;
    }

    /**
     * Set 对话流转策略；0-由上一轮回复用户的 Agent 继续发起，1- 回到主Agent
     * @param ConversationPolicy 对话流转策略；0-由上一轮回复用户的 Agent 继续发起，1- 回到主Agent
     */
    public void setConversationPolicy(Long ConversationPolicy) {
        this.ConversationPolicy = ConversationPolicy;
    }

    public AgentHandoffAdvancedSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentHandoffAdvancedSetting(AgentHandoffAdvancedSetting source) {
        if (source.ConversationPolicy != null) {
            this.ConversationPolicy = new Long(source.ConversationPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConversationPolicy", this.ConversationPolicy);

    }
}

