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

public class CreateFlowForwardsResponse extends AbstractModel {

    /**
    * 失败的合同id以及错误详情
    */
    @SerializedName("FailedFlows")
    @Expose
    private FlowForwardResult [] FailedFlows;

    /**
    * 成功的合同id
    */
    @SerializedName("SuccessFlows")
    @Expose
    private String [] SuccessFlows;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 失败的合同id以及错误详情 
     * @return FailedFlows 失败的合同id以及错误详情
     */
    public FlowForwardResult [] getFailedFlows() {
        return this.FailedFlows;
    }

    /**
     * Set 失败的合同id以及错误详情
     * @param FailedFlows 失败的合同id以及错误详情
     */
    public void setFailedFlows(FlowForwardResult [] FailedFlows) {
        this.FailedFlows = FailedFlows;
    }

    /**
     * Get 成功的合同id 
     * @return SuccessFlows 成功的合同id
     */
    public String [] getSuccessFlows() {
        return this.SuccessFlows;
    }

    /**
     * Set 成功的合同id
     * @param SuccessFlows 成功的合同id
     */
    public void setSuccessFlows(String [] SuccessFlows) {
        this.SuccessFlows = SuccessFlows;
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

    public CreateFlowForwardsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowForwardsResponse(CreateFlowForwardsResponse source) {
        if (source.FailedFlows != null) {
            this.FailedFlows = new FlowForwardResult[source.FailedFlows.length];
            for (int i = 0; i < source.FailedFlows.length; i++) {
                this.FailedFlows[i] = new FlowForwardResult(source.FailedFlows[i]);
            }
        }
        if (source.SuccessFlows != null) {
            this.SuccessFlows = new String[source.SuccessFlows.length];
            for (int i = 0; i < source.SuccessFlows.length; i++) {
                this.SuccessFlows[i] = new String(source.SuccessFlows[i]);
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
        this.setParamArrayObj(map, prefix + "FailedFlows.", this.FailedFlows);
        this.setParamArraySimple(map, prefix + "SuccessFlows.", this.SuccessFlows);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

