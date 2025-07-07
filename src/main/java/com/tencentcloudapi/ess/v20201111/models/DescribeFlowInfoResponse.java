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

public class DescribeFlowInfoResponse extends AbstractModel {

    /**
    * 合同流程的详细信息。
如果查询的是合同组信息，则返回的是组内所有子合同流程的详细信息。
    */
    @SerializedName("FlowDetailInfos")
    @Expose
    private FlowDetailInfo [] FlowDetailInfos;

    /**
    * 合同组ID，只有在查询合同组信息时才会返回。
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 合同组名称，只有在查询合同组信息时才会返回。
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同流程的详细信息。
如果查询的是合同组信息，则返回的是组内所有子合同流程的详细信息。 
     * @return FlowDetailInfos 合同流程的详细信息。
如果查询的是合同组信息，则返回的是组内所有子合同流程的详细信息。
     */
    public FlowDetailInfo [] getFlowDetailInfos() {
        return this.FlowDetailInfos;
    }

    /**
     * Set 合同流程的详细信息。
如果查询的是合同组信息，则返回的是组内所有子合同流程的详细信息。
     * @param FlowDetailInfos 合同流程的详细信息。
如果查询的是合同组信息，则返回的是组内所有子合同流程的详细信息。
     */
    public void setFlowDetailInfos(FlowDetailInfo [] FlowDetailInfos) {
        this.FlowDetailInfos = FlowDetailInfos;
    }

    /**
     * Get 合同组ID，只有在查询合同组信息时才会返回。 
     * @return FlowGroupId 合同组ID，只有在查询合同组信息时才会返回。
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组ID，只有在查询合同组信息时才会返回。
     * @param FlowGroupId 合同组ID，只有在查询合同组信息时才会返回。
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 合同组名称，只有在查询合同组信息时才会返回。 
     * @return FlowGroupName 合同组名称，只有在查询合同组信息时才会返回。
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set 合同组名称，只有在查询合同组信息时才会返回。
     * @param FlowGroupName 合同组名称，只有在查询合同组信息时才会返回。
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
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

    public DescribeFlowInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowInfoResponse(DescribeFlowInfoResponse source) {
        if (source.FlowDetailInfos != null) {
            this.FlowDetailInfos = new FlowDetailInfo[source.FlowDetailInfos.length];
            for (int i = 0; i < source.FlowDetailInfos.length; i++) {
                this.FlowDetailInfos[i] = new FlowDetailInfo(source.FlowDetailInfos[i]);
            }
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.FlowGroupName != null) {
            this.FlowGroupName = new String(source.FlowGroupName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FlowDetailInfos.", this.FlowDetailInfos);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "FlowGroupName", this.FlowGroupName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

