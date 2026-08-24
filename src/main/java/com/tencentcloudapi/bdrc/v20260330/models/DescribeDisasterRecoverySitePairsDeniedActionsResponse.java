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

public class DescribeDisasterRecoverySitePairsDeniedActionsResponse extends AbstractModel {

    /**
    * 每个容灾策略对应的禁止操作集合，返回顺序与入参 SitePairIds 一致
    */
    @SerializedName("SitePairDeniedActionSet")
    @Expose
    private SitePairDeniedAction [] SitePairDeniedActionSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 每个容灾策略对应的禁止操作集合，返回顺序与入参 SitePairIds 一致 
     * @return SitePairDeniedActionSet 每个容灾策略对应的禁止操作集合，返回顺序与入参 SitePairIds 一致
     */
    public SitePairDeniedAction [] getSitePairDeniedActionSet() {
        return this.SitePairDeniedActionSet;
    }

    /**
     * Set 每个容灾策略对应的禁止操作集合，返回顺序与入参 SitePairIds 一致
     * @param SitePairDeniedActionSet 每个容灾策略对应的禁止操作集合，返回顺序与入参 SitePairIds 一致
     */
    public void setSitePairDeniedActionSet(SitePairDeniedAction [] SitePairDeniedActionSet) {
        this.SitePairDeniedActionSet = SitePairDeniedActionSet;
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

    public DescribeDisasterRecoverySitePairsDeniedActionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisasterRecoverySitePairsDeniedActionsResponse(DescribeDisasterRecoverySitePairsDeniedActionsResponse source) {
        if (source.SitePairDeniedActionSet != null) {
            this.SitePairDeniedActionSet = new SitePairDeniedAction[source.SitePairDeniedActionSet.length];
            for (int i = 0; i < source.SitePairDeniedActionSet.length; i++) {
                this.SitePairDeniedActionSet[i] = new SitePairDeniedAction(source.SitePairDeniedActionSet[i]);
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
        this.setParamArrayObj(map, prefix + "SitePairDeniedActionSet.", this.SitePairDeniedActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

