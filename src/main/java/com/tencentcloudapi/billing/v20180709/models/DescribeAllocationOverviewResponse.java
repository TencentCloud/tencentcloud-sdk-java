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

public class DescribeAllocationOverviewResponse extends AbstractModel {

    /**
    * <p>总条数</p>
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * <p>分账账单概览金额汇总</p>
    */
    @SerializedName("Total")
    @Expose
    private AllocationOverviewTotal Total;

    /**
    * <p>分账概览明细</p>
    */
    @SerializedName("Detail")
    @Expose
    private AllocationOverviewDetail [] Detail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总条数</p> 
     * @return RecordNum <p>总条数</p>
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set <p>总条数</p>
     * @param RecordNum <p>总条数</p>
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
    }

    /**
     * Get <p>分账账单概览金额汇总</p> 
     * @return Total <p>分账账单概览金额汇总</p>
     */
    public AllocationOverviewTotal getTotal() {
        return this.Total;
    }

    /**
     * Set <p>分账账单概览金额汇总</p>
     * @param Total <p>分账账单概览金额汇总</p>
     */
    public void setTotal(AllocationOverviewTotal Total) {
        this.Total = Total;
    }

    /**
     * Get <p>分账概览明细</p> 
     * @return Detail <p>分账概览明细</p>
     */
    public AllocationOverviewDetail [] getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>分账概览明细</p>
     * @param Detail <p>分账概览明细</p>
     */
    public void setDetail(AllocationOverviewDetail [] Detail) {
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

    public DescribeAllocationOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationOverviewResponse(DescribeAllocationOverviewResponse source) {
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.Total != null) {
            this.Total = new AllocationOverviewTotal(source.Total);
        }
        if (source.Detail != null) {
            this.Detail = new AllocationOverviewDetail[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new AllocationOverviewDetail(source.Detail[i]);
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

