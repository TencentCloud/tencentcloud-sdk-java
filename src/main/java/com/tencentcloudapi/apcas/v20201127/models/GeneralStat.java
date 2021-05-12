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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralStat extends AbstractModel{

    /**
    * 今日调用量
    */
    @SerializedName("TodayAmount")
    @Expose
    private Long TodayAmount;

    /**
    * 本周调用量
    */
    @SerializedName("WeekAmount")
    @Expose
    private Long WeekAmount;

    /**
    * 本月调用量
    */
    @SerializedName("MonthAmount")
    @Expose
    private Long MonthAmount;

    /**
    * 总调用量
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
     * Get 今日调用量 
     * @return TodayAmount 今日调用量
     */
    public Long getTodayAmount() {
        return this.TodayAmount;
    }

    /**
     * Set 今日调用量
     * @param TodayAmount 今日调用量
     */
    public void setTodayAmount(Long TodayAmount) {
        this.TodayAmount = TodayAmount;
    }

    /**
     * Get 本周调用量 
     * @return WeekAmount 本周调用量
     */
    public Long getWeekAmount() {
        return this.WeekAmount;
    }

    /**
     * Set 本周调用量
     * @param WeekAmount 本周调用量
     */
    public void setWeekAmount(Long WeekAmount) {
        this.WeekAmount = WeekAmount;
    }

    /**
     * Get 本月调用量 
     * @return MonthAmount 本月调用量
     */
    public Long getMonthAmount() {
        return this.MonthAmount;
    }

    /**
     * Set 本月调用量
     * @param MonthAmount 本月调用量
     */
    public void setMonthAmount(Long MonthAmount) {
        this.MonthAmount = MonthAmount;
    }

    /**
     * Get 总调用量 
     * @return TotalAmount 总调用量
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 总调用量
     * @param TotalAmount 总调用量
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public GeneralStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralStat(GeneralStat source) {
        if (source.TodayAmount != null) {
            this.TodayAmount = new Long(source.TodayAmount);
        }
        if (source.WeekAmount != null) {
            this.WeekAmount = new Long(source.WeekAmount);
        }
        if (source.MonthAmount != null) {
            this.MonthAmount = new Long(source.MonthAmount);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TodayAmount", this.TodayAmount);
        this.setParamSimple(map, prefix + "WeekAmount", this.WeekAmount);
        this.setParamSimple(map, prefix + "MonthAmount", this.MonthAmount);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);

    }
}

