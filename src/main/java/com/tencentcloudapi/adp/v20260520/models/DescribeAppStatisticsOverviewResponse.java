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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppStatisticsOverviewResponse extends AbstractModel {

    /**
    * <p>首 tokens 平均耗时（毫秒）</p>
    */
    @SerializedName("AvgFirstTokenTime")
    @Expose
    private String AvgFirstTokenTime;

    /**
    * <p>总 tokens 平均耗时（毫秒）</p>
    */
    @SerializedName("AvgTotalTokenTime")
    @Expose
    private String AvgTotalTokenTime;

    /**
    * <p>应用调用成功率（百分比，0~100）</p>
    */
    @SerializedName("CallSuccessRate")
    @Expose
    private Float CallSuccessRate;

    /**
    * <p>回复类型分布列表；按 app_type 统计，已补全所有回复方式并按固定顺序返回，无数据的回复方式 call_count 为 0</p>
    */
    @SerializedName("ReplyTypeDistributionList")
    @Expose
    private Distribution [] ReplyTypeDistributionList;

    /**
    * <p>总调用次数</p>
    */
    @SerializedName("TotalCallCount")
    @Expose
    private String TotalCallCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>首 tokens 平均耗时（毫秒）</p> 
     * @return AvgFirstTokenTime <p>首 tokens 平均耗时（毫秒）</p>
     */
    public String getAvgFirstTokenTime() {
        return this.AvgFirstTokenTime;
    }

    /**
     * Set <p>首 tokens 平均耗时（毫秒）</p>
     * @param AvgFirstTokenTime <p>首 tokens 平均耗时（毫秒）</p>
     */
    public void setAvgFirstTokenTime(String AvgFirstTokenTime) {
        this.AvgFirstTokenTime = AvgFirstTokenTime;
    }

    /**
     * Get <p>总 tokens 平均耗时（毫秒）</p> 
     * @return AvgTotalTokenTime <p>总 tokens 平均耗时（毫秒）</p>
     */
    public String getAvgTotalTokenTime() {
        return this.AvgTotalTokenTime;
    }

    /**
     * Set <p>总 tokens 平均耗时（毫秒）</p>
     * @param AvgTotalTokenTime <p>总 tokens 平均耗时（毫秒）</p>
     */
    public void setAvgTotalTokenTime(String AvgTotalTokenTime) {
        this.AvgTotalTokenTime = AvgTotalTokenTime;
    }

    /**
     * Get <p>应用调用成功率（百分比，0~100）</p> 
     * @return CallSuccessRate <p>应用调用成功率（百分比，0~100）</p>
     */
    public Float getCallSuccessRate() {
        return this.CallSuccessRate;
    }

    /**
     * Set <p>应用调用成功率（百分比，0~100）</p>
     * @param CallSuccessRate <p>应用调用成功率（百分比，0~100）</p>
     */
    public void setCallSuccessRate(Float CallSuccessRate) {
        this.CallSuccessRate = CallSuccessRate;
    }

    /**
     * Get <p>回复类型分布列表；按 app_type 统计，已补全所有回复方式并按固定顺序返回，无数据的回复方式 call_count 为 0</p> 
     * @return ReplyTypeDistributionList <p>回复类型分布列表；按 app_type 统计，已补全所有回复方式并按固定顺序返回，无数据的回复方式 call_count 为 0</p>
     */
    public Distribution [] getReplyTypeDistributionList() {
        return this.ReplyTypeDistributionList;
    }

    /**
     * Set <p>回复类型分布列表；按 app_type 统计，已补全所有回复方式并按固定顺序返回，无数据的回复方式 call_count 为 0</p>
     * @param ReplyTypeDistributionList <p>回复类型分布列表；按 app_type 统计，已补全所有回复方式并按固定顺序返回，无数据的回复方式 call_count 为 0</p>
     */
    public void setReplyTypeDistributionList(Distribution [] ReplyTypeDistributionList) {
        this.ReplyTypeDistributionList = ReplyTypeDistributionList;
    }

    /**
     * Get <p>总调用次数</p> 
     * @return TotalCallCount <p>总调用次数</p>
     */
    public String getTotalCallCount() {
        return this.TotalCallCount;
    }

    /**
     * Set <p>总调用次数</p>
     * @param TotalCallCount <p>总调用次数</p>
     */
    public void setTotalCallCount(String TotalCallCount) {
        this.TotalCallCount = TotalCallCount;
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

    public DescribeAppStatisticsOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppStatisticsOverviewResponse(DescribeAppStatisticsOverviewResponse source) {
        if (source.AvgFirstTokenTime != null) {
            this.AvgFirstTokenTime = new String(source.AvgFirstTokenTime);
        }
        if (source.AvgTotalTokenTime != null) {
            this.AvgTotalTokenTime = new String(source.AvgTotalTokenTime);
        }
        if (source.CallSuccessRate != null) {
            this.CallSuccessRate = new Float(source.CallSuccessRate);
        }
        if (source.ReplyTypeDistributionList != null) {
            this.ReplyTypeDistributionList = new Distribution[source.ReplyTypeDistributionList.length];
            for (int i = 0; i < source.ReplyTypeDistributionList.length; i++) {
                this.ReplyTypeDistributionList[i] = new Distribution(source.ReplyTypeDistributionList[i]);
            }
        }
        if (source.TotalCallCount != null) {
            this.TotalCallCount = new String(source.TotalCallCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvgFirstTokenTime", this.AvgFirstTokenTime);
        this.setParamSimple(map, prefix + "AvgTotalTokenTime", this.AvgTotalTokenTime);
        this.setParamSimple(map, prefix + "CallSuccessRate", this.CallSuccessRate);
        this.setParamArrayObj(map, prefix + "ReplyTypeDistributionList.", this.ReplyTypeDistributionList);
        this.setParamSimple(map, prefix + "TotalCallCount", this.TotalCallCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

