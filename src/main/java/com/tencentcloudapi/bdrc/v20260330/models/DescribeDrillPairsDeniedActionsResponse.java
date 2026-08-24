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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDrillPairsDeniedActionsResponse extends AbstractModel {

    /**
    * 演练对操作掩码列表，返回每个演练对被禁止执行的操作
    */
    @SerializedName("DrillPairDeniedActionSet")
    @Expose
    private DrillPairDeniedAction [] DrillPairDeniedActionSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 演练对操作掩码列表，返回每个演练对被禁止执行的操作 
     * @return DrillPairDeniedActionSet 演练对操作掩码列表，返回每个演练对被禁止执行的操作
     */
    public DrillPairDeniedAction [] getDrillPairDeniedActionSet() {
        return this.DrillPairDeniedActionSet;
    }

    /**
     * Set 演练对操作掩码列表，返回每个演练对被禁止执行的操作
     * @param DrillPairDeniedActionSet 演练对操作掩码列表，返回每个演练对被禁止执行的操作
     */
    public void setDrillPairDeniedActionSet(DrillPairDeniedAction [] DrillPairDeniedActionSet) {
        this.DrillPairDeniedActionSet = DrillPairDeniedActionSet;
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

    public DescribeDrillPairsDeniedActionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDrillPairsDeniedActionsResponse(DescribeDrillPairsDeniedActionsResponse source) {
        if (source.DrillPairDeniedActionSet != null) {
            this.DrillPairDeniedActionSet = new DrillPairDeniedAction[source.DrillPairDeniedActionSet.length];
            for (int i = 0; i < source.DrillPairDeniedActionSet.length; i++) {
                this.DrillPairDeniedActionSet[i] = new DrillPairDeniedAction(source.DrillPairDeniedActionSet[i]);
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
        this.setParamArrayObj(map, prefix + "DrillPairDeniedActionSet.", this.DrillPairDeniedActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

