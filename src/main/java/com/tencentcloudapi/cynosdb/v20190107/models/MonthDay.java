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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonthDay extends AbstractModel {

    /**
    * 月份信息
    */
    @SerializedName("Month")
    @Expose
    private Long Month;

    /**
    * 日期信息
    */
    @SerializedName("Day")
    @Expose
    private Long Day;

    /**
     * Get 月份信息 
     * @return Month 月份信息
     */
    public Long getMonth() {
        return this.Month;
    }

    /**
     * Set 月份信息
     * @param Month 月份信息
     */
    public void setMonth(Long Month) {
        this.Month = Month;
    }

    /**
     * Get 日期信息 
     * @return Day 日期信息
     */
    public Long getDay() {
        return this.Day;
    }

    /**
     * Set 日期信息
     * @param Day 日期信息
     */
    public void setDay(Long Day) {
        this.Day = Day;
    }

    public MonthDay() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonthDay(MonthDay source) {
        if (source.Month != null) {
            this.Month = new Long(source.Month);
        }
        if (source.Day != null) {
            this.Day = new Long(source.Day);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "Day", this.Day);

    }
}

