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

public class DescribeCostExplorerSummaryResponse extends AbstractModel {

    /**
    * <p>数据条数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>表头信息</p>
    */
    @SerializedName("Header")
    @Expose
    private AnalyseHeaderDetail Header;

    /**
    * <p>数据明细</p>
    */
    @SerializedName("Detail")
    @Expose
    private AnalyseDetail [] Detail;

    /**
    * <p>数据总计</p>
    */
    @SerializedName("TotalDetail")
    @Expose
    private AnalyseDetail TotalDetail;

    /**
    * <p>筛选框</p>
    */
    @SerializedName("ConditionValue")
    @Expose
    private AnalyseConditionDetail ConditionValue;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>数据条数</p> 
     * @return Total <p>数据条数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>数据条数</p>
     * @param Total <p>数据条数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>表头信息</p> 
     * @return Header <p>表头信息</p>
     */
    public AnalyseHeaderDetail getHeader() {
        return this.Header;
    }

    /**
     * Set <p>表头信息</p>
     * @param Header <p>表头信息</p>
     */
    public void setHeader(AnalyseHeaderDetail Header) {
        this.Header = Header;
    }

    /**
     * Get <p>数据明细</p> 
     * @return Detail <p>数据明细</p>
     */
    public AnalyseDetail [] getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>数据明细</p>
     * @param Detail <p>数据明细</p>
     */
    public void setDetail(AnalyseDetail [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>数据总计</p> 
     * @return TotalDetail <p>数据总计</p>
     */
    public AnalyseDetail getTotalDetail() {
        return this.TotalDetail;
    }

    /**
     * Set <p>数据总计</p>
     * @param TotalDetail <p>数据总计</p>
     */
    public void setTotalDetail(AnalyseDetail TotalDetail) {
        this.TotalDetail = TotalDetail;
    }

    /**
     * Get <p>筛选框</p> 
     * @return ConditionValue <p>筛选框</p>
     */
    public AnalyseConditionDetail getConditionValue() {
        return this.ConditionValue;
    }

    /**
     * Set <p>筛选框</p>
     * @param ConditionValue <p>筛选框</p>
     */
    public void setConditionValue(AnalyseConditionDetail ConditionValue) {
        this.ConditionValue = ConditionValue;
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

    public DescribeCostExplorerSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostExplorerSummaryResponse(DescribeCostExplorerSummaryResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Header != null) {
            this.Header = new AnalyseHeaderDetail(source.Header);
        }
        if (source.Detail != null) {
            this.Detail = new AnalyseDetail[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new AnalyseDetail(source.Detail[i]);
            }
        }
        if (source.TotalDetail != null) {
            this.TotalDetail = new AnalyseDetail(source.TotalDetail);
        }
        if (source.ConditionValue != null) {
            this.ConditionValue = new AnalyseConditionDetail(source.ConditionValue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamObj(map, prefix + "TotalDetail.", this.TotalDetail);
        this.setParamObj(map, prefix + "ConditionValue.", this.ConditionValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

