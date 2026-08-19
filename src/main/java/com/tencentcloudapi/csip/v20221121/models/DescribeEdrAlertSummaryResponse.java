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

public class DescribeEdrAlertSummaryResponse extends AbstractModel {

    /**
    * <p>严重+高危待处理数（Level IN CRITICAL,HIGH，DB 内部值 1,5）</p>
    */
    @SerializedName("CriticalPendingCount")
    @Expose
    private Long CriticalPendingCount;

    /**
    * <p>全部待处理数</p>
    */
    @SerializedName("TotalPendingCount")
    @Expose
    private Long TotalPendingCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>严重+高危待处理数（Level IN CRITICAL,HIGH，DB 内部值 1,5）</p> 
     * @return CriticalPendingCount <p>严重+高危待处理数（Level IN CRITICAL,HIGH，DB 内部值 1,5）</p>
     */
    public Long getCriticalPendingCount() {
        return this.CriticalPendingCount;
    }

    /**
     * Set <p>严重+高危待处理数（Level IN CRITICAL,HIGH，DB 内部值 1,5）</p>
     * @param CriticalPendingCount <p>严重+高危待处理数（Level IN CRITICAL,HIGH，DB 内部值 1,5）</p>
     */
    public void setCriticalPendingCount(Long CriticalPendingCount) {
        this.CriticalPendingCount = CriticalPendingCount;
    }

    /**
     * Get <p>全部待处理数</p> 
     * @return TotalPendingCount <p>全部待处理数</p>
     */
    public Long getTotalPendingCount() {
        return this.TotalPendingCount;
    }

    /**
     * Set <p>全部待处理数</p>
     * @param TotalPendingCount <p>全部待处理数</p>
     */
    public void setTotalPendingCount(Long TotalPendingCount) {
        this.TotalPendingCount = TotalPendingCount;
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

    public DescribeEdrAlertSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertSummaryResponse(DescribeEdrAlertSummaryResponse source) {
        if (source.CriticalPendingCount != null) {
            this.CriticalPendingCount = new Long(source.CriticalPendingCount);
        }
        if (source.TotalPendingCount != null) {
            this.TotalPendingCount = new Long(source.TotalPendingCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CriticalPendingCount", this.CriticalPendingCount);
        this.setParamSimple(map, prefix + "TotalPendingCount", this.TotalPendingCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

