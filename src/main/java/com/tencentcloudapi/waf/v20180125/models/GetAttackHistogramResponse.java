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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAttackHistogramResponse extends AbstractModel {

    /**
    * 统计详情
    */
    @SerializedName("Data")
    @Expose
    private LogHistogramInfo [] Data;

    /**
    * 时间段大小
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 统计的条目数
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
     * Get 统计详情 
     * @return Data 统计详情
     */
    public LogHistogramInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 统计详情
     * @param Data 统计详情
     */
    public void setData(LogHistogramInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 时间段大小 
     * @return Period 时间段大小
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 时间段大小
     * @param Period 时间段大小
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 统计的条目数 
     * @return TotalCount 统计的条目数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 统计的条目数
     * @param TotalCount 统计的条目数
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

    public GetAttackHistogramResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAttackHistogramResponse(GetAttackHistogramResponse source) {
        if (source.Data != null) {
            this.Data = new LogHistogramInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new LogHistogramInfo(source.Data[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

