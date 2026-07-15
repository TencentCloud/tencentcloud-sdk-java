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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTWeTalkAgentRequest extends AbstractModel {

    /**
    * <p>智能体ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
     * Get <p>智能体ID</p> 
     * @return AgentId <p>智能体ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>智能体ID</p>
     * @param AgentId <p>智能体ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    public DeleteTWeTalkAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTWeTalkAgentRequest(DeleteTWeTalkAgentRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);

    }
}

