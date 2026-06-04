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

public class AgentAdvancedConfig extends AbstractModel {

    /**
    * <p>最大推理轮数</p>
    */
    @SerializedName("MaxReasoningRound")
    @Expose
    private Long MaxReasoningRound;

    /**
     * Get <p>最大推理轮数</p> 
     * @return MaxReasoningRound <p>最大推理轮数</p>
     */
    public Long getMaxReasoningRound() {
        return this.MaxReasoningRound;
    }

    /**
     * Set <p>最大推理轮数</p>
     * @param MaxReasoningRound <p>最大推理轮数</p>
     */
    public void setMaxReasoningRound(Long MaxReasoningRound) {
        this.MaxReasoningRound = MaxReasoningRound;
    }

    public AgentAdvancedConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentAdvancedConfig(AgentAdvancedConfig source) {
        if (source.MaxReasoningRound != null) {
            this.MaxReasoningRound = new Long(source.MaxReasoningRound);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxReasoningRound", this.MaxReasoningRound);

    }
}

