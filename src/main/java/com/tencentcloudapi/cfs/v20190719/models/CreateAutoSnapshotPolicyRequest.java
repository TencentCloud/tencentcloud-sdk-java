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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * 快照重复时间点,0-23，小时
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * 策略名称,限制64个字符数量仅支持输入中文、字母、数字、_或-
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 快照重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，IntervalDays 三者选一
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * 快照保留时长，单位天，默认永久0
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * 快照按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek，IntervalDays 三者选一
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * 间隔天数，与DayOfWeek，DayOfMonth 三者选一
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get 快照重复时间点,0-23，小时 
     * @return Hour 快照重复时间点,0-23，小时
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set 快照重复时间点,0-23，小时
     * @param Hour 快照重复时间点,0-23，小时
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 策略名称,限制64个字符数量仅支持输入中文、字母、数字、_或- 
     * @return PolicyName 策略名称,限制64个字符数量仅支持输入中文、字母、数字、_或-
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称,限制64个字符数量仅支持输入中文、字母、数字、_或-
     * @param PolicyName 策略名称,限制64个字符数量仅支持输入中文、字母、数字、_或-
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 快照重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，IntervalDays 三者选一 
     * @return DayOfWeek 快照重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，IntervalDays 三者选一
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 快照重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，IntervalDays 三者选一
     * @param DayOfWeek 快照重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，IntervalDays 三者选一
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get 快照保留时长，单位天，默认永久0 
     * @return AliveDays 快照保留时长，单位天，默认永久0
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set 快照保留时长，单位天，默认永久0
     * @param AliveDays 快照保留时长，单位天，默认永久0
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get 快照按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek，IntervalDays 三者选一 
     * @return DayOfMonth 快照按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek，IntervalDays 三者选一
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set 快照按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek，IntervalDays 三者选一
     * @param DayOfMonth 快照按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek，IntervalDays 三者选一
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get 间隔天数，与DayOfWeek，DayOfMonth 三者选一 
     * @return IntervalDays 间隔天数，与DayOfWeek，DayOfMonth 三者选一
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set 间隔天数，与DayOfWeek，DayOfMonth 三者选一
     * @param IntervalDays 间隔天数，与DayOfWeek，DayOfMonth 三者选一
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public CreateAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoSnapshotPolicyRequest(CreateAutoSnapshotPolicyRequest source) {
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.IntervalDays != null) {
            this.IntervalDays = new Long(source.IntervalDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

