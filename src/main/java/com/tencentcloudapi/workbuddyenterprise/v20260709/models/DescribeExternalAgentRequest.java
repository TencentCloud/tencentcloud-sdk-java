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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExternalAgentRequest extends AbstractModel {

    /**
    * <p>TMA managed agent 业务 ID（CloudAgentID）</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>已绑定的外部 A2A agent ID</p>
    */
    @SerializedName("A2AAgentId")
    @Expose
    private String A2AAgentId;

    /**
     * Get <p>TMA managed agent 业务 ID（CloudAgentID）</p> 
     * @return AgentId <p>TMA managed agent 业务 ID（CloudAgentID）</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>TMA managed agent 业务 ID（CloudAgentID）</p>
     * @param AgentId <p>TMA managed agent 业务 ID（CloudAgentID）</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>已绑定的外部 A2A agent ID</p> 
     * @return A2AAgentId <p>已绑定的外部 A2A agent ID</p>
     */
    public String getA2AAgentId() {
        return this.A2AAgentId;
    }

    /**
     * Set <p>已绑定的外部 A2A agent ID</p>
     * @param A2AAgentId <p>已绑定的外部 A2A agent ID</p>
     */
    public void setA2AAgentId(String A2AAgentId) {
        this.A2AAgentId = A2AAgentId;
    }

    public DescribeExternalAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalAgentRequest(DescribeExternalAgentRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.A2AAgentId != null) {
            this.A2AAgentId = new String(source.A2AAgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "A2AAgentId", this.A2AAgentId);

    }
}

