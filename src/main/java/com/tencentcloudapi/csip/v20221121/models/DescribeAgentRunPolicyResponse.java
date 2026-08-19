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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentRunPolicyResponse extends AbstractModel {

    /**
    * <p>基础运行策略</p>
    */
    @SerializedName("BasicPolicy")
    @Expose
    private AgentRunModePolicy BasicPolicy;

    /**
    * <p>高级运行策略</p>
    */
    @SerializedName("AdvancePolicy")
    @Expose
    private AgentRunModePolicy AdvancePolicy;

    /**
    * <p>自定义运行策略</p>
    */
    @SerializedName("CustomPolicy")
    @Expose
    private AgentRunModePolicy CustomPolicy;

    /**
    * <p>自定义模式关联的机器instance_id列表</p>
    */
    @SerializedName("CustomModeInstanceIDs")
    @Expose
    private String [] CustomModeInstanceIDs;

    /**
    * <p>高级模式关联的机器instance_id列表</p>
    */
    @SerializedName("AdvanceModeInstanceIDs")
    @Expose
    private String [] AdvanceModeInstanceIDs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>基础运行策略</p> 
     * @return BasicPolicy <p>基础运行策略</p>
     */
    public AgentRunModePolicy getBasicPolicy() {
        return this.BasicPolicy;
    }

    /**
     * Set <p>基础运行策略</p>
     * @param BasicPolicy <p>基础运行策略</p>
     */
    public void setBasicPolicy(AgentRunModePolicy BasicPolicy) {
        this.BasicPolicy = BasicPolicy;
    }

    /**
     * Get <p>高级运行策略</p> 
     * @return AdvancePolicy <p>高级运行策略</p>
     */
    public AgentRunModePolicy getAdvancePolicy() {
        return this.AdvancePolicy;
    }

    /**
     * Set <p>高级运行策略</p>
     * @param AdvancePolicy <p>高级运行策略</p>
     */
    public void setAdvancePolicy(AgentRunModePolicy AdvancePolicy) {
        this.AdvancePolicy = AdvancePolicy;
    }

    /**
     * Get <p>自定义运行策略</p> 
     * @return CustomPolicy <p>自定义运行策略</p>
     */
    public AgentRunModePolicy getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set <p>自定义运行策略</p>
     * @param CustomPolicy <p>自定义运行策略</p>
     */
    public void setCustomPolicy(AgentRunModePolicy CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get <p>自定义模式关联的机器instance_id列表</p> 
     * @return CustomModeInstanceIDs <p>自定义模式关联的机器instance_id列表</p>
     */
    public String [] getCustomModeInstanceIDs() {
        return this.CustomModeInstanceIDs;
    }

    /**
     * Set <p>自定义模式关联的机器instance_id列表</p>
     * @param CustomModeInstanceIDs <p>自定义模式关联的机器instance_id列表</p>
     */
    public void setCustomModeInstanceIDs(String [] CustomModeInstanceIDs) {
        this.CustomModeInstanceIDs = CustomModeInstanceIDs;
    }

    /**
     * Get <p>高级模式关联的机器instance_id列表</p> 
     * @return AdvanceModeInstanceIDs <p>高级模式关联的机器instance_id列表</p>
     */
    public String [] getAdvanceModeInstanceIDs() {
        return this.AdvanceModeInstanceIDs;
    }

    /**
     * Set <p>高级模式关联的机器instance_id列表</p>
     * @param AdvanceModeInstanceIDs <p>高级模式关联的机器instance_id列表</p>
     */
    public void setAdvanceModeInstanceIDs(String [] AdvanceModeInstanceIDs) {
        this.AdvanceModeInstanceIDs = AdvanceModeInstanceIDs;
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

    public DescribeAgentRunPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentRunPolicyResponse(DescribeAgentRunPolicyResponse source) {
        if (source.BasicPolicy != null) {
            this.BasicPolicy = new AgentRunModePolicy(source.BasicPolicy);
        }
        if (source.AdvancePolicy != null) {
            this.AdvancePolicy = new AgentRunModePolicy(source.AdvancePolicy);
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new AgentRunModePolicy(source.CustomPolicy);
        }
        if (source.CustomModeInstanceIDs != null) {
            this.CustomModeInstanceIDs = new String[source.CustomModeInstanceIDs.length];
            for (int i = 0; i < source.CustomModeInstanceIDs.length; i++) {
                this.CustomModeInstanceIDs[i] = new String(source.CustomModeInstanceIDs[i]);
            }
        }
        if (source.AdvanceModeInstanceIDs != null) {
            this.AdvanceModeInstanceIDs = new String[source.AdvanceModeInstanceIDs.length];
            for (int i = 0; i < source.AdvanceModeInstanceIDs.length; i++) {
                this.AdvanceModeInstanceIDs[i] = new String(source.AdvanceModeInstanceIDs[i]);
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
        this.setParamObj(map, prefix + "BasicPolicy.", this.BasicPolicy);
        this.setParamObj(map, prefix + "AdvancePolicy.", this.AdvancePolicy);
        this.setParamObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamArraySimple(map, prefix + "CustomModeInstanceIDs.", this.CustomModeInstanceIDs);
        this.setParamArraySimple(map, prefix + "AdvanceModeInstanceIDs.", this.AdvanceModeInstanceIDs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

