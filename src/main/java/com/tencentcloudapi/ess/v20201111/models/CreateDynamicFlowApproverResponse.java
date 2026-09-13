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

public class CreateDynamicFlowApproverResponse extends AbstractModel {

    /**
    * <p>合同流程ID，为32位字符串</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>补充动态合同签署人的结果数组</p>
    */
    @SerializedName("DynamicFlowApproverList")
    @Expose
    private DynamicFlowApproverResult [] DynamicFlowApproverList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>合同流程ID，为32位字符串</p> 
     * @return FlowId <p>合同流程ID，为32位字符串</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串</p>
     * @param FlowId <p>合同流程ID，为32位字符串</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>补充动态合同签署人的结果数组</p> 
     * @return DynamicFlowApproverList <p>补充动态合同签署人的结果数组</p>
     */
    public DynamicFlowApproverResult [] getDynamicFlowApproverList() {
        return this.DynamicFlowApproverList;
    }

    /**
     * Set <p>补充动态合同签署人的结果数组</p>
     * @param DynamicFlowApproverList <p>补充动态合同签署人的结果数组</p>
     */
    public void setDynamicFlowApproverList(DynamicFlowApproverResult [] DynamicFlowApproverList) {
        this.DynamicFlowApproverList = DynamicFlowApproverList;
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

    public CreateDynamicFlowApproverResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDynamicFlowApproverResponse(CreateDynamicFlowApproverResponse source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.DynamicFlowApproverList != null) {
            this.DynamicFlowApproverList = new DynamicFlowApproverResult[source.DynamicFlowApproverList.length];
            for (int i = 0; i < source.DynamicFlowApproverList.length; i++) {
                this.DynamicFlowApproverList[i] = new DynamicFlowApproverResult(source.DynamicFlowApproverList[i]);
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
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "DynamicFlowApproverList.", this.DynamicFlowApproverList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

