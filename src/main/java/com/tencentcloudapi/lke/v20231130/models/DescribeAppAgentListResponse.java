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

public class DescribeAppAgentListResponse extends AbstractModel {

    /**
    * 入口启动AgentID
    */
    @SerializedName("StaringAgentId")
    @Expose
    private String StaringAgentId;

    /**
    * 应用Agent信息列表
    */
    @SerializedName("Agents")
    @Expose
    private Agent [] Agents;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 入口启动AgentID 
     * @return StaringAgentId 入口启动AgentID
     */
    public String getStaringAgentId() {
        return this.StaringAgentId;
    }

    /**
     * Set 入口启动AgentID
     * @param StaringAgentId 入口启动AgentID
     */
    public void setStaringAgentId(String StaringAgentId) {
        this.StaringAgentId = StaringAgentId;
    }

    /**
     * Get 应用Agent信息列表 
     * @return Agents 应用Agent信息列表
     */
    public Agent [] getAgents() {
        return this.Agents;
    }

    /**
     * Set 应用Agent信息列表
     * @param Agents 应用Agent信息列表
     */
    public void setAgents(Agent [] Agents) {
        this.Agents = Agents;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAppAgentListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppAgentListResponse(DescribeAppAgentListResponse source) {
        if (source.StaringAgentId != null) {
            this.StaringAgentId = new String(source.StaringAgentId);
        }
        if (source.Agents != null) {
            this.Agents = new Agent[source.Agents.length];
            for (int i = 0; i < source.Agents.length; i++) {
                this.Agents[i] = new Agent(source.Agents[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaringAgentId", this.StaringAgentId);
        this.setParamArrayObj(map, prefix + "Agents.", this.Agents);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

