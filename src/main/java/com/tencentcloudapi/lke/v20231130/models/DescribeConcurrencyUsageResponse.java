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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrencyUsageResponse extends AbstractModel {

    /**
    * 可用并发数上限
    */
    @SerializedName("AvailableConcurrency")
    @Expose
    private Long AvailableConcurrency;

    /**
    * 并发峰值
    */
    @SerializedName("ConcurrencyPeak")
    @Expose
    private Long ConcurrencyPeak;

    /**
    * 超出可用并发数上限的次数
    */
    @SerializedName("ExceedUsageTime")
    @Expose
    private Long ExceedUsageTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可用并发数上限 
     * @return AvailableConcurrency 可用并发数上限
     */
    public Long getAvailableConcurrency() {
        return this.AvailableConcurrency;
    }

    /**
     * Set 可用并发数上限
     * @param AvailableConcurrency 可用并发数上限
     */
    public void setAvailableConcurrency(Long AvailableConcurrency) {
        this.AvailableConcurrency = AvailableConcurrency;
    }

    /**
     * Get 并发峰值 
     * @return ConcurrencyPeak 并发峰值
     */
    public Long getConcurrencyPeak() {
        return this.ConcurrencyPeak;
    }

    /**
     * Set 并发峰值
     * @param ConcurrencyPeak 并发峰值
     */
    public void setConcurrencyPeak(Long ConcurrencyPeak) {
        this.ConcurrencyPeak = ConcurrencyPeak;
    }

    /**
     * Get 超出可用并发数上限的次数 
     * @return ExceedUsageTime 超出可用并发数上限的次数
     */
    public Long getExceedUsageTime() {
        return this.ExceedUsageTime;
    }

    /**
     * Set 超出可用并发数上限的次数
     * @param ExceedUsageTime 超出可用并发数上限的次数
     */
    public void setExceedUsageTime(Long ExceedUsageTime) {
        this.ExceedUsageTime = ExceedUsageTime;
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

    public DescribeConcurrencyUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrencyUsageResponse(DescribeConcurrencyUsageResponse source) {
        if (source.AvailableConcurrency != null) {
            this.AvailableConcurrency = new Long(source.AvailableConcurrency);
        }
        if (source.ConcurrencyPeak != null) {
            this.ConcurrencyPeak = new Long(source.ConcurrencyPeak);
        }
        if (source.ExceedUsageTime != null) {
            this.ExceedUsageTime = new Long(source.ExceedUsageTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvailableConcurrency", this.AvailableConcurrency);
        this.setParamSimple(map, prefix + "ConcurrencyPeak", this.ConcurrencyPeak);
        this.setParamSimple(map, prefix + "ExceedUsageTime", this.ExceedUsageTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

