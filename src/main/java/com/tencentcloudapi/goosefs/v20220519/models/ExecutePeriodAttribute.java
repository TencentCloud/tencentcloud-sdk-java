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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutePeriodAttribute extends AbstractModel {

    /**
    * <p>选择的周期类型</p><p>枚举值：</p><ul><li>DAY： 每天执行 </li><li>WEEK： 每周执行</li><li>MONTH： 每月执行</li></ul>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>选择每周执行时必填，需要选择周几,0-6 分别是周日到周六</p><p>取值范围：[0, 6]</p><p>默认值：0</p>
    */
    @SerializedName("StartWeekday")
    @Expose
    private Long StartWeekday;

    /**
    * <p>选择每月执行时必填，1-28日选择一天</p><p>取值范围：[1, 28]</p><p>默认值：1</p>
    */
    @SerializedName("StartDate")
    @Expose
    private Long StartDate;

    /**
    * <p>周期中的时间点，取值0~59</p><p>取值范围：[0, 59]</p>
    */
    @SerializedName("StartMinute")
    @Expose
    private Long StartMinute;

    /**
    * <p>24小时周期开始的小时数，取值0~23</p><p>取值范围：[0, 23]</p><p>默认值：1</p>
    */
    @SerializedName("StartHour")
    @Expose
    private Long StartHour;

    /**
     * Get <p>选择的周期类型</p><p>枚举值：</p><ul><li>DAY： 每天执行 </li><li>WEEK： 每周执行</li><li>MONTH： 每月执行</li></ul> 
     * @return PeriodType <p>选择的周期类型</p><p>枚举值：</p><ul><li>DAY： 每天执行 </li><li>WEEK： 每周执行</li><li>MONTH： 每月执行</li></ul>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>选择的周期类型</p><p>枚举值：</p><ul><li>DAY： 每天执行 </li><li>WEEK： 每周执行</li><li>MONTH： 每月执行</li></ul>
     * @param PeriodType <p>选择的周期类型</p><p>枚举值：</p><ul><li>DAY： 每天执行 </li><li>WEEK： 每周执行</li><li>MONTH： 每月执行</li></ul>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>选择每周执行时必填，需要选择周几,0-6 分别是周日到周六</p><p>取值范围：[0, 6]</p><p>默认值：0</p> 
     * @return StartWeekday <p>选择每周执行时必填，需要选择周几,0-6 分别是周日到周六</p><p>取值范围：[0, 6]</p><p>默认值：0</p>
     */
    public Long getStartWeekday() {
        return this.StartWeekday;
    }

    /**
     * Set <p>选择每周执行时必填，需要选择周几,0-6 分别是周日到周六</p><p>取值范围：[0, 6]</p><p>默认值：0</p>
     * @param StartWeekday <p>选择每周执行时必填，需要选择周几,0-6 分别是周日到周六</p><p>取值范围：[0, 6]</p><p>默认值：0</p>
     */
    public void setStartWeekday(Long StartWeekday) {
        this.StartWeekday = StartWeekday;
    }

    /**
     * Get <p>选择每月执行时必填，1-28日选择一天</p><p>取值范围：[1, 28]</p><p>默认值：1</p> 
     * @return StartDate <p>选择每月执行时必填，1-28日选择一天</p><p>取值范围：[1, 28]</p><p>默认值：1</p>
     */
    public Long getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>选择每月执行时必填，1-28日选择一天</p><p>取值范围：[1, 28]</p><p>默认值：1</p>
     * @param StartDate <p>选择每月执行时必填，1-28日选择一天</p><p>取值范围：[1, 28]</p><p>默认值：1</p>
     */
    public void setStartDate(Long StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>周期中的时间点，取值0~59</p><p>取值范围：[0, 59]</p> 
     * @return StartMinute <p>周期中的时间点，取值0~59</p><p>取值范围：[0, 59]</p>
     */
    public Long getStartMinute() {
        return this.StartMinute;
    }

    /**
     * Set <p>周期中的时间点，取值0~59</p><p>取值范围：[0, 59]</p>
     * @param StartMinute <p>周期中的时间点，取值0~59</p><p>取值范围：[0, 59]</p>
     */
    public void setStartMinute(Long StartMinute) {
        this.StartMinute = StartMinute;
    }

    /**
     * Get <p>24小时周期开始的小时数，取值0~23</p><p>取值范围：[0, 23]</p><p>默认值：1</p> 
     * @return StartHour <p>24小时周期开始的小时数，取值0~23</p><p>取值范围：[0, 23]</p><p>默认值：1</p>
     */
    public Long getStartHour() {
        return this.StartHour;
    }

    /**
     * Set <p>24小时周期开始的小时数，取值0~23</p><p>取值范围：[0, 23]</p><p>默认值：1</p>
     * @param StartHour <p>24小时周期开始的小时数，取值0~23</p><p>取值范围：[0, 23]</p><p>默认值：1</p>
     */
    public void setStartHour(Long StartHour) {
        this.StartHour = StartHour;
    }

    public ExecutePeriodAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutePeriodAttribute(ExecutePeriodAttribute source) {
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.StartWeekday != null) {
            this.StartWeekday = new Long(source.StartWeekday);
        }
        if (source.StartDate != null) {
            this.StartDate = new Long(source.StartDate);
        }
        if (source.StartMinute != null) {
            this.StartMinute = new Long(source.StartMinute);
        }
        if (source.StartHour != null) {
            this.StartHour = new Long(source.StartHour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "StartWeekday", this.StartWeekday);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "StartMinute", this.StartMinute);
        this.setParamSimple(map, prefix + "StartHour", this.StartHour);

    }
}

