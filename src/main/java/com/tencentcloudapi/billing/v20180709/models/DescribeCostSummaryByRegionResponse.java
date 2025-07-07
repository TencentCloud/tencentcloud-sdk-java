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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCostSummaryByRegionResponse extends AbstractModel {

    /**
    * 数据是否准备好，0未准备好，1准备好
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * 消耗详情
    */
    @SerializedName("Total")
    @Expose
    private ConsumptionSummaryTotal Total;

    /**
    * 消耗按地域汇总详情
    */
    @SerializedName("Data")
    @Expose
    private ConsumptionRegionSummaryDataItem [] Data;

    /**
    * 记录数量，NeedRecordNum为0时返回null
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据是否准备好，0未准备好，1准备好 
     * @return Ready 数据是否准备好，0未准备好，1准备好
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set 数据是否准备好，0未准备好，1准备好
     * @param Ready 数据是否准备好，0未准备好，1准备好
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get 消耗详情 
     * @return Total 消耗详情
     */
    public ConsumptionSummaryTotal getTotal() {
        return this.Total;
    }

    /**
     * Set 消耗详情
     * @param Total 消耗详情
     */
    public void setTotal(ConsumptionSummaryTotal Total) {
        this.Total = Total;
    }

    /**
     * Get 消耗按地域汇总详情 
     * @return Data 消耗按地域汇总详情
     */
    public ConsumptionRegionSummaryDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set 消耗按地域汇总详情
     * @param Data 消耗按地域汇总详情
     */
    public void setData(ConsumptionRegionSummaryDataItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get 记录数量，NeedRecordNum为0时返回null 
     * @return RecordNum 记录数量，NeedRecordNum为0时返回null
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set 记录数量，NeedRecordNum为0时返回null
     * @param RecordNum 记录数量，NeedRecordNum为0时返回null
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
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

    public DescribeCostSummaryByRegionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostSummaryByRegionResponse(DescribeCostSummaryByRegionResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.Total != null) {
            this.Total = new ConsumptionSummaryTotal(source.Total);
        }
        if (source.Data != null) {
            this.Data = new ConsumptionRegionSummaryDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ConsumptionRegionSummaryDataItem(source.Data[i]);
            }
        }
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamObj(map, prefix + "Total.", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RecordNum", this.RecordNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

