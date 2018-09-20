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

public class DescribeBillResourceSummaryRequest  extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 数量，最大值为1000
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 周期类型，byUsedTime按计费周期/byPayTime按扣费周期
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 月份，格式为yyyy-mm
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取数量，最大值为1000
     * @return Limit 数量，最大值为1000
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置数量，最大值为1000
     * @param Limit 数量，最大值为1000
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取周期类型，byUsedTime按计费周期/byPayTime按扣费周期
     * @return PeriodType 周期类型，byUsedTime按计费周期/byPayTime按扣费周期
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * 设置周期类型，byUsedTime按计费周期/byPayTime按扣费周期
     * @param PeriodType 周期类型，byUsedTime按计费周期/byPayTime按扣费周期
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * 获取月份，格式为yyyy-mm
     * @return Month 月份，格式为yyyy-mm
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * 设置月份，格式为yyyy-mm
     * @param Month 月份，格式为yyyy-mm
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

