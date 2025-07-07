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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReservedInstanceUtilizationRateResponse extends AbstractModel {

    /**
    * 预留券使用率
    */
    @SerializedName("UtilizationRateSet")
    @Expose
    private ReservedInstanceUtilizationRate [] UtilizationRateSet;

    /**
    * 按量计费的 Pod 总数
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
    *  Pod 被预留券抵扣的抵扣率
    */
    @SerializedName("PodRate")
    @Expose
    private Float PodRate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预留券使用率 
     * @return UtilizationRateSet 预留券使用率
     */
    public ReservedInstanceUtilizationRate [] getUtilizationRateSet() {
        return this.UtilizationRateSet;
    }

    /**
     * Set 预留券使用率
     * @param UtilizationRateSet 预留券使用率
     */
    public void setUtilizationRateSet(ReservedInstanceUtilizationRate [] UtilizationRateSet) {
        this.UtilizationRateSet = UtilizationRateSet;
    }

    /**
     * Get 按量计费的 Pod 总数 
     * @return PodNum 按量计费的 Pod 总数
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set 按量计费的 Pod 总数
     * @param PodNum 按量计费的 Pod 总数
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    /**
     * Get  Pod 被预留券抵扣的抵扣率 
     * @return PodRate  Pod 被预留券抵扣的抵扣率
     */
    public Float getPodRate() {
        return this.PodRate;
    }

    /**
     * Set  Pod 被预留券抵扣的抵扣率
     * @param PodRate  Pod 被预留券抵扣的抵扣率
     */
    public void setPodRate(Float PodRate) {
        this.PodRate = PodRate;
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

    public DescribeReservedInstanceUtilizationRateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReservedInstanceUtilizationRateResponse(DescribeReservedInstanceUtilizationRateResponse source) {
        if (source.UtilizationRateSet != null) {
            this.UtilizationRateSet = new ReservedInstanceUtilizationRate[source.UtilizationRateSet.length];
            for (int i = 0; i < source.UtilizationRateSet.length; i++) {
                this.UtilizationRateSet[i] = new ReservedInstanceUtilizationRate(source.UtilizationRateSet[i]);
            }
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
        if (source.PodRate != null) {
            this.PodRate = new Float(source.PodRate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UtilizationRateSet.", this.UtilizationRateSet);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);
        this.setParamSimple(map, prefix + "PodRate", this.PodRate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

