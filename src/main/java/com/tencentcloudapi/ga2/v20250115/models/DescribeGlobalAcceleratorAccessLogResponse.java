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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalAcceleratorAccessLogResponse extends AbstractModel {

    /**
    * <p>返回日志任务详情</p>
    */
    @SerializedName("GlobalAcceleratorAccessLog")
    @Expose
    private GlobalAcceleratorAccessLog [] GlobalAcceleratorAccessLog;

    /**
    * <p>日志任务条数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>返回日志任务详情</p> 
     * @return GlobalAcceleratorAccessLog <p>返回日志任务详情</p>
     */
    public GlobalAcceleratorAccessLog [] getGlobalAcceleratorAccessLog() {
        return this.GlobalAcceleratorAccessLog;
    }

    /**
     * Set <p>返回日志任务详情</p>
     * @param GlobalAcceleratorAccessLog <p>返回日志任务详情</p>
     */
    public void setGlobalAcceleratorAccessLog(GlobalAcceleratorAccessLog [] GlobalAcceleratorAccessLog) {
        this.GlobalAcceleratorAccessLog = GlobalAcceleratorAccessLog;
    }

    /**
     * Get <p>日志任务条数。</p> 
     * @return TotalCount <p>日志任务条数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>日志任务条数。</p>
     * @param TotalCount <p>日志任务条数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeGlobalAcceleratorAccessLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalAcceleratorAccessLogResponse(DescribeGlobalAcceleratorAccessLogResponse source) {
        if (source.GlobalAcceleratorAccessLog != null) {
            this.GlobalAcceleratorAccessLog = new GlobalAcceleratorAccessLog[source.GlobalAcceleratorAccessLog.length];
            for (int i = 0; i < source.GlobalAcceleratorAccessLog.length; i++) {
                this.GlobalAcceleratorAccessLog[i] = new GlobalAcceleratorAccessLog(source.GlobalAcceleratorAccessLog[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GlobalAcceleratorAccessLog.", this.GlobalAcceleratorAccessLog);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

