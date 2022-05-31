/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCallInfoResponse extends AbstractModel{

    /**
    * 呼出套餐包消耗分钟数
    */
    @SerializedName("TelCallOutCount")
    @Expose
    private Long TelCallOutCount;

    /**
    * 呼入套餐包消耗分钟数
    */
    @SerializedName("TelCallInCount")
    @Expose
    private Long TelCallInCount;

    /**
    * 坐席使用统计个数
    */
    @SerializedName("SeatUsedCount")
    @Expose
    private Long SeatUsedCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 呼出套餐包消耗分钟数 
     * @return TelCallOutCount 呼出套餐包消耗分钟数
     */
    public Long getTelCallOutCount() {
        return this.TelCallOutCount;
    }

    /**
     * Set 呼出套餐包消耗分钟数
     * @param TelCallOutCount 呼出套餐包消耗分钟数
     */
    public void setTelCallOutCount(Long TelCallOutCount) {
        this.TelCallOutCount = TelCallOutCount;
    }

    /**
     * Get 呼入套餐包消耗分钟数 
     * @return TelCallInCount 呼入套餐包消耗分钟数
     */
    public Long getTelCallInCount() {
        return this.TelCallInCount;
    }

    /**
     * Set 呼入套餐包消耗分钟数
     * @param TelCallInCount 呼入套餐包消耗分钟数
     */
    public void setTelCallInCount(Long TelCallInCount) {
        this.TelCallInCount = TelCallInCount;
    }

    /**
     * Get 坐席使用统计个数 
     * @return SeatUsedCount 坐席使用统计个数
     */
    public Long getSeatUsedCount() {
        return this.SeatUsedCount;
    }

    /**
     * Set 坐席使用统计个数
     * @param SeatUsedCount 坐席使用统计个数
     */
    public void setSeatUsedCount(Long SeatUsedCount) {
        this.SeatUsedCount = SeatUsedCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTelCallInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelCallInfoResponse(DescribeTelCallInfoResponse source) {
        if (source.TelCallOutCount != null) {
            this.TelCallOutCount = new Long(source.TelCallOutCount);
        }
        if (source.TelCallInCount != null) {
            this.TelCallInCount = new Long(source.TelCallInCount);
        }
        if (source.SeatUsedCount != null) {
            this.SeatUsedCount = new Long(source.SeatUsedCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TelCallOutCount", this.TelCallOutCount);
        this.setParamSimple(map, prefix + "TelCallInCount", this.TelCallInCount);
        this.setParamSimple(map, prefix + "SeatUsedCount", this.SeatUsedCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

