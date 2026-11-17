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

public class DescribeLLMHourBillDetailResponse extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询日期，归一化为YYYY-MM-DD格式
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 当日账单预估总额（元，扣减免费额度后的净费用）
    */
    @SerializedName("EstimatedTotalFee")
    @Expose
    private String EstimatedTotalFee;

    /**
    * 当日按计费项拆分的费用
    */
    @SerializedName("ItemFees")
    @Expose
    private LLMBillItemFee ItemFees;

    /**
    * 24小时账单趋势，固定24条，无数据补0
    */
    @SerializedName("HourlyTrend")
    @Expose
    private LLMHourBillTrendItem [] HourlyTrend;

    /**
    * 24小时账单明细，固定24条，无数据补0
    */
    @SerializedName("HourlyDetail")
    @Expose
    private LLMHourBillDetailItem [] HourlyDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询日期，归一化为YYYY-MM-DD格式 
     * @return Date 查询日期，归一化为YYYY-MM-DD格式
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 查询日期，归一化为YYYY-MM-DD格式
     * @param Date 查询日期，归一化为YYYY-MM-DD格式
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 当日账单预估总额（元，扣减免费额度后的净费用） 
     * @return EstimatedTotalFee 当日账单预估总额（元，扣减免费额度后的净费用）
     */
    public String getEstimatedTotalFee() {
        return this.EstimatedTotalFee;
    }

    /**
     * Set 当日账单预估总额（元，扣减免费额度后的净费用）
     * @param EstimatedTotalFee 当日账单预估总额（元，扣减免费额度后的净费用）
     */
    public void setEstimatedTotalFee(String EstimatedTotalFee) {
        this.EstimatedTotalFee = EstimatedTotalFee;
    }

    /**
     * Get 当日按计费项拆分的费用 
     * @return ItemFees 当日按计费项拆分的费用
     */
    public LLMBillItemFee getItemFees() {
        return this.ItemFees;
    }

    /**
     * Set 当日按计费项拆分的费用
     * @param ItemFees 当日按计费项拆分的费用
     */
    public void setItemFees(LLMBillItemFee ItemFees) {
        this.ItemFees = ItemFees;
    }

    /**
     * Get 24小时账单趋势，固定24条，无数据补0 
     * @return HourlyTrend 24小时账单趋势，固定24条，无数据补0
     */
    public LLMHourBillTrendItem [] getHourlyTrend() {
        return this.HourlyTrend;
    }

    /**
     * Set 24小时账单趋势，固定24条，无数据补0
     * @param HourlyTrend 24小时账单趋势，固定24条，无数据补0
     */
    public void setHourlyTrend(LLMHourBillTrendItem [] HourlyTrend) {
        this.HourlyTrend = HourlyTrend;
    }

    /**
     * Get 24小时账单明细，固定24条，无数据补0 
     * @return HourlyDetail 24小时账单明细，固定24条，无数据补0
     */
    public LLMHourBillDetailItem [] getHourlyDetail() {
        return this.HourlyDetail;
    }

    /**
     * Set 24小时账单明细，固定24条，无数据补0
     * @param HourlyDetail 24小时账单明细，固定24条，无数据补0
     */
    public void setHourlyDetail(LLMHourBillDetailItem [] HourlyDetail) {
        this.HourlyDetail = HourlyDetail;
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

    public DescribeLLMHourBillDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMHourBillDetailResponse(DescribeLLMHourBillDetailResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.EstimatedTotalFee != null) {
            this.EstimatedTotalFee = new String(source.EstimatedTotalFee);
        }
        if (source.ItemFees != null) {
            this.ItemFees = new LLMBillItemFee(source.ItemFees);
        }
        if (source.HourlyTrend != null) {
            this.HourlyTrend = new LLMHourBillTrendItem[source.HourlyTrend.length];
            for (int i = 0; i < source.HourlyTrend.length; i++) {
                this.HourlyTrend[i] = new LLMHourBillTrendItem(source.HourlyTrend[i]);
            }
        }
        if (source.HourlyDetail != null) {
            this.HourlyDetail = new LLMHourBillDetailItem[source.HourlyDetail.length];
            for (int i = 0; i < source.HourlyDetail.length; i++) {
                this.HourlyDetail[i] = new LLMHourBillDetailItem(source.HourlyDetail[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "EstimatedTotalFee", this.EstimatedTotalFee);
        this.setParamObj(map, prefix + "ItemFees.", this.ItemFees);
        this.setParamArrayObj(map, prefix + "HourlyTrend.", this.HourlyTrend);
        this.setParamArrayObj(map, prefix + "HourlyDetail.", this.HourlyDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

