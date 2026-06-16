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

public class CreateFlowGroupRemindsResponse extends AbstractModel {

    /**
    * <p>合同组催办接口返回的详细信息。</p>
    */
    @SerializedName("RemindFlowGroupRecords")
    @Expose
    private RemindFlowGroupRecord [] RemindFlowGroupRecords;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>合同组催办接口返回的详细信息。</p> 
     * @return RemindFlowGroupRecords <p>合同组催办接口返回的详细信息。</p>
     */
    public RemindFlowGroupRecord [] getRemindFlowGroupRecords() {
        return this.RemindFlowGroupRecords;
    }

    /**
     * Set <p>合同组催办接口返回的详细信息。</p>
     * @param RemindFlowGroupRecords <p>合同组催办接口返回的详细信息。</p>
     */
    public void setRemindFlowGroupRecords(RemindFlowGroupRecord [] RemindFlowGroupRecords) {
        this.RemindFlowGroupRecords = RemindFlowGroupRecords;
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

    public CreateFlowGroupRemindsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowGroupRemindsResponse(CreateFlowGroupRemindsResponse source) {
        if (source.RemindFlowGroupRecords != null) {
            this.RemindFlowGroupRecords = new RemindFlowGroupRecord[source.RemindFlowGroupRecords.length];
            for (int i = 0; i < source.RemindFlowGroupRecords.length; i++) {
                this.RemindFlowGroupRecords[i] = new RemindFlowGroupRecord(source.RemindFlowGroupRecords[i]);
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
        this.setParamArrayObj(map, prefix + "RemindFlowGroupRecords.", this.RemindFlowGroupRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

