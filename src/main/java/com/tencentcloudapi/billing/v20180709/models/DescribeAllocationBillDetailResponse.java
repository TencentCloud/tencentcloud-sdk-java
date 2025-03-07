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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationBillDetailResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * 分账账单概览金额汇总
    */
    @SerializedName("Total")
    @Expose
    private AllocationOverviewTotal Total;

    /**
    * 分账账单明细
    */
    @SerializedName("Detail")
    @Expose
    private AllocationDetail [] Detail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return RecordNum 总条数
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set 总条数
     * @param RecordNum 总条数
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
    }

    /**
     * Get 分账账单概览金额汇总 
     * @return Total 分账账单概览金额汇总
     */
    public AllocationOverviewTotal getTotal() {
        return this.Total;
    }

    /**
     * Set 分账账单概览金额汇总
     * @param Total 分账账单概览金额汇总
     */
    public void setTotal(AllocationOverviewTotal Total) {
        this.Total = Total;
    }

    /**
     * Get 分账账单明细 
     * @return Detail 分账账单明细
     */
    public AllocationDetail [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 分账账单明细
     * @param Detail 分账账单明细
     */
    public void setDetail(AllocationDetail [] Detail) {
        this.Detail = Detail;
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

    public DescribeAllocationBillDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationBillDetailResponse(DescribeAllocationBillDetailResponse source) {
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.Total != null) {
            this.Total = new AllocationOverviewTotal(source.Total);
        }
        if (source.Detail != null) {
            this.Detail = new AllocationDetail[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new AllocationDetail(source.Detail[i]);
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
        this.setParamSimple(map, prefix + "RecordNum", this.RecordNum);
        this.setParamObj(map, prefix + "Total.", this.Total);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

