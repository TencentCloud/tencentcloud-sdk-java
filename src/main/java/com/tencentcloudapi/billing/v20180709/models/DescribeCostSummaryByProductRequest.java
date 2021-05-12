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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCostSummaryByProductRequest extends AbstractModel{

    /**
    * 目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 每次获取数据量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询账单数据的用户UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 是否需要返回记录数量，0不需要，1需要，默认不需要
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
     * Get 目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。 
     * @return BeginTime 目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
     * @param BeginTime 目前必须和EndTime相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。 
     * @return EndTime 目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
     * @param EndTime 目前必须和BeginTime为相同月份，不支持跨月查询，且查询结果是整月数据，例如 BeginTime为2018-09，EndTime 为 2018-09，查询结果是 2018 年 9 月数据。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 每次获取数据量 
     * @return Limit 每次获取数据量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次获取数据量
     * @param Limit 每次获取数据量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询账单数据的用户UIN 
     * @return PayerUin 查询账单数据的用户UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 查询账单数据的用户UIN
     * @param PayerUin 查询账单数据的用户UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 是否需要返回记录数量，0不需要，1需要，默认不需要 
     * @return NeedRecordNum 是否需要返回记录数量，0不需要，1需要，默认不需要
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set 是否需要返回记录数量，0不需要，1需要，默认不需要
     * @param NeedRecordNum 是否需要返回记录数量，0不需要，1需要，默认不需要
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    public DescribeCostSummaryByProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostSummaryByProductRequest(DescribeCostSummaryByProductRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);

    }
}

