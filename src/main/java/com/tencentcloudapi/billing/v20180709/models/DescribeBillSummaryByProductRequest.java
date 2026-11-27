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

public class DescribeBillSummaryByProductRequest extends AbstractModel {

    /**
    * <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>查询账单数据的用户UIN</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * <p>款项类别，与L0账单上的汇总类别对应。 此参数自账单3.0（即2021-01）之后开始生效。</p><p>枚举值：</p><ul><li>consume： 消费</li><li>refund： 退款</li><li>adjustment： 调账</li></ul>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
     * Get <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p> 
     * @return BeginTime <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
     * @param BeginTime <p>目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p> 
     * @return EndTime <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
     * @param EndTime <p>目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2026-11，EndTime 为 2026-11，查询结果是 2026 年 11 月数据。格式为yyyy-mm，不能早于2021-01</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>查询账单数据的用户UIN</p> 
     * @return PayerUin <p>查询账单数据的用户UIN</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>查询账单数据的用户UIN</p>
     * @param PayerUin <p>查询账单数据的用户UIN</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get <p>款项类别，与L0账单上的汇总类别对应。 此参数自账单3.0（即2021-01）之后开始生效。</p><p>枚举值：</p><ul><li>consume： 消费</li><li>refund： 退款</li><li>adjustment： 调账</li></ul> 
     * @return PayType <p>款项类别，与L0账单上的汇总类别对应。 此参数自账单3.0（即2021-01）之后开始生效。</p><p>枚举值：</p><ul><li>consume： 消费</li><li>refund： 退款</li><li>adjustment： 调账</li></ul>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>款项类别，与L0账单上的汇总类别对应。 此参数自账单3.0（即2021-01）之后开始生效。</p><p>枚举值：</p><ul><li>consume： 消费</li><li>refund： 退款</li><li>adjustment： 调账</li></ul>
     * @param PayType <p>款项类别，与L0账单上的汇总类别对应。 此参数自账单3.0（即2021-01）之后开始生效。</p><p>枚举值：</p><ul><li>consume： 消费</li><li>refund： 退款</li><li>adjustment： 调账</li></ul>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    public DescribeBillSummaryByProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByProductRequest(DescribeBillSummaryByProductRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "PayType", this.PayType);

    }
}

