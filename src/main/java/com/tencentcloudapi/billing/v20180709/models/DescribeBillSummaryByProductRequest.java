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

public class DescribeBillSummaryByProductRequest extends AbstractModel{

    /**
    * 查询账单数据的用户UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 目前只支持传当月开始，且必须和EndTime为相同月份，例 2018-09-01 00:00:00
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 目前只支持传当月结束，且必须和BeginTime为相同月份，例 2018-09-30 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
     * Get 目前只支持传当月开始，且必须和EndTime为相同月份，例 2018-09-01 00:00:00 
     * @return BeginTime 目前只支持传当月开始，且必须和EndTime为相同月份，例 2018-09-01 00:00:00
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 目前只支持传当月开始，且必须和EndTime为相同月份，例 2018-09-01 00:00:00
     * @param BeginTime 目前只支持传当月开始，且必须和EndTime为相同月份，例 2018-09-01 00:00:00
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 目前只支持传当月结束，且必须和BeginTime为相同月份，例 2018-09-30 23:59:59 
     * @return EndTime 目前只支持传当月结束，且必须和BeginTime为相同月份，例 2018-09-30 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 目前只支持传当月结束，且必须和BeginTime为相同月份，例 2018-09-30 23:59:59
     * @param EndTime 目前只支持传当月结束，且必须和BeginTime为相同月份，例 2018-09-30 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

