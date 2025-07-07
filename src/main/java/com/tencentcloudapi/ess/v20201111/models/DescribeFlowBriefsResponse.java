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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowBriefsResponse extends AbstractModel {

    /**
    * 合同流程基础信息列表，包含流程的名称、状态、创建日期等基本信息。 
注：`与入参 FlowIds 的顺序可能存在不一致的情况。`
    */
    @SerializedName("FlowBriefs")
    @Expose
    private FlowBrief [] FlowBriefs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同流程基础信息列表，包含流程的名称、状态、创建日期等基本信息。 
注：`与入参 FlowIds 的顺序可能存在不一致的情况。` 
     * @return FlowBriefs 合同流程基础信息列表，包含流程的名称、状态、创建日期等基本信息。 
注：`与入参 FlowIds 的顺序可能存在不一致的情况。`
     */
    public FlowBrief [] getFlowBriefs() {
        return this.FlowBriefs;
    }

    /**
     * Set 合同流程基础信息列表，包含流程的名称、状态、创建日期等基本信息。 
注：`与入参 FlowIds 的顺序可能存在不一致的情况。`
     * @param FlowBriefs 合同流程基础信息列表，包含流程的名称、状态、创建日期等基本信息。 
注：`与入参 FlowIds 的顺序可能存在不一致的情况。`
     */
    public void setFlowBriefs(FlowBrief [] FlowBriefs) {
        this.FlowBriefs = FlowBriefs;
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

    public DescribeFlowBriefsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowBriefsResponse(DescribeFlowBriefsResponse source) {
        if (source.FlowBriefs != null) {
            this.FlowBriefs = new FlowBrief[source.FlowBriefs.length];
            for (int i = 0; i < source.FlowBriefs.length; i++) {
                this.FlowBriefs[i] = new FlowBrief(source.FlowBriefs[i]);
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
        this.setParamArrayObj(map, prefix + "FlowBriefs.", this.FlowBriefs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

