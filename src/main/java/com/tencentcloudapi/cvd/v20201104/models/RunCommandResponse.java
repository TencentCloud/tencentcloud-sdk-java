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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunCommandResponse extends AbstractModel {

    /**
    * <p>本次任务对应的任务ID。方便异步查询执行状态。</p>
    */
    @SerializedName("InvokeId")
    @Expose
    private String InvokeId;

    /**
    * <p>执行详细情况。WaitUntilDone为true，在接口返回时的执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private Invocation Detail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>本次任务对应的任务ID。方便异步查询执行状态。</p> 
     * @return InvokeId <p>本次任务对应的任务ID。方便异步查询执行状态。</p>
     */
    public String getInvokeId() {
        return this.InvokeId;
    }

    /**
     * Set <p>本次任务对应的任务ID。方便异步查询执行状态。</p>
     * @param InvokeId <p>本次任务对应的任务ID。方便异步查询执行状态。</p>
     */
    public void setInvokeId(String InvokeId) {
        this.InvokeId = InvokeId;
    }

    /**
     * Get <p>执行详细情况。WaitUntilDone为true，在接口返回时的执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail <p>执行详细情况。WaitUntilDone为true，在接口返回时的执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Invocation getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>执行详细情况。WaitUntilDone为true，在接口返回时的执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail <p>执行详细情况。WaitUntilDone为true，在接口返回时的执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(Invocation Detail) {
        this.Detail = Detail;
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

    public RunCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunCommandResponse(RunCommandResponse source) {
        if (source.InvokeId != null) {
            this.InvokeId = new String(source.InvokeId);
        }
        if (source.Detail != null) {
            this.Detail = new Invocation(source.Detail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeId", this.InvokeId);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

