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

public class DescribeBillAdjustInfoRequest extends AbstractModel {

    /**
    * 格式：yyyy-MM
账单月份，month和timeFrom&timeTo必传一个，如果有传timeFrom&timeTo则month字段无效
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 格式：yyyy-MM-dd
开始时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * 格式：yyyy-MM-dd
截止时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
     * Get 格式：yyyy-MM
账单月份，month和timeFrom&timeTo必传一个，如果有传timeFrom&timeTo则month字段无效 
     * @return Month 格式：yyyy-MM
账单月份，month和timeFrom&timeTo必传一个，如果有传timeFrom&timeTo则month字段无效
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 格式：yyyy-MM
账单月份，month和timeFrom&timeTo必传一个，如果有传timeFrom&timeTo则month字段无效
     * @param Month 格式：yyyy-MM
账单月份，month和timeFrom&timeTo必传一个，如果有传timeFrom&timeTo则month字段无效
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 格式：yyyy-MM-dd
开始时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据 
     * @return TimeFrom 格式：yyyy-MM-dd
开始时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set 格式：yyyy-MM-dd
开始时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
     * @param TimeFrom 格式：yyyy-MM-dd
开始时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get 格式：yyyy-MM-dd
截止时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据 
     * @return TimeTo 格式：yyyy-MM-dd
截止时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set 格式：yyyy-MM-dd
截止时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
     * @param TimeTo 格式：yyyy-MM-dd
截止时间，month和timeFrom&timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    public DescribeBillAdjustInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillAdjustInfoRequest(DescribeBillAdjustInfoRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TimeFrom != null) {
            this.TimeFrom = new String(source.TimeFrom);
        }
        if (source.TimeTo != null) {
            this.TimeTo = new String(source.TimeTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "TimeFrom", this.TimeFrom);
        this.setParamSimple(map, prefix + "TimeTo", this.TimeTo);

    }
}

