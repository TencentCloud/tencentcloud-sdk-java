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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel{

    /**
    * 指定定期快照策略的触发时间。单位为小时，取值范围：[0, 23]。00:00 ~ 23:00 共 24 个时间点可选，1表示 01:00，依此类推。
    */
    @SerializedName("Hour")
    @Expose
    private Long [] Hour;

    /**
    * 指定每周从周一到周日需要触发定期快照的日期，取值范围：[0, 6]。0表示周日触发，1-6分别表示周一至周六。
    */
    @SerializedName("DayOfWeek")
    @Expose
    private Long [] DayOfWeek;

    /**
    * 指定每月从月初到月底需要触发定期快照的日期,取值范围：[1, 31]，1-31分别表示每月的具体日期，比如5表示每月的5号。注：若设置29、30、31等部分月份不存在的日期，则对应不存在日期的月份会跳过不打定期快照。
    */
    @SerializedName("DayOfMonth")
    @Expose
    private Long [] DayOfMonth;

    /**
    * 指定创建定期快照的间隔天数，取值范围：[1, 365]，例如设置为5，则间隔5天即触发定期快照创建。注：当选择按天备份时，理论上第一次备份的时间为备份策略创建当天。如果当天备份策略创建的时间已经晚于设置的备份时间，那么将会等到第二个备份周期再进行第一次备份。
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get 指定定期快照策略的触发时间。单位为小时，取值范围：[0, 23]。00:00 ~ 23:00 共 24 个时间点可选，1表示 01:00，依此类推。 
     * @return Hour 指定定期快照策略的触发时间。单位为小时，取值范围：[0, 23]。00:00 ~ 23:00 共 24 个时间点可选，1表示 01:00，依此类推。
     */
    public Long [] getHour() {
        return this.Hour;
    }

    /**
     * Set 指定定期快照策略的触发时间。单位为小时，取值范围：[0, 23]。00:00 ~ 23:00 共 24 个时间点可选，1表示 01:00，依此类推。
     * @param Hour 指定定期快照策略的触发时间。单位为小时，取值范围：[0, 23]。00:00 ~ 23:00 共 24 个时间点可选，1表示 01:00，依此类推。
     */
    public void setHour(Long [] Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 指定每周从周一到周日需要触发定期快照的日期，取值范围：[0, 6]。0表示周日触发，1-6分别表示周一至周六。 
     * @return DayOfWeek 指定每周从周一到周日需要触发定期快照的日期，取值范围：[0, 6]。0表示周日触发，1-6分别表示周一至周六。
     */
    public Long [] getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 指定每周从周一到周日需要触发定期快照的日期，取值范围：[0, 6]。0表示周日触发，1-6分别表示周一至周六。
     * @param DayOfWeek 指定每周从周一到周日需要触发定期快照的日期，取值范围：[0, 6]。0表示周日触发，1-6分别表示周一至周六。
     */
    public void setDayOfWeek(Long [] DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get 指定每月从月初到月底需要触发定期快照的日期,取值范围：[1, 31]，1-31分别表示每月的具体日期，比如5表示每月的5号。注：若设置29、30、31等部分月份不存在的日期，则对应不存在日期的月份会跳过不打定期快照。 
     * @return DayOfMonth 指定每月从月初到月底需要触发定期快照的日期,取值范围：[1, 31]，1-31分别表示每月的具体日期，比如5表示每月的5号。注：若设置29、30、31等部分月份不存在的日期，则对应不存在日期的月份会跳过不打定期快照。
     */
    public Long [] getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set 指定每月从月初到月底需要触发定期快照的日期,取值范围：[1, 31]，1-31分别表示每月的具体日期，比如5表示每月的5号。注：若设置29、30、31等部分月份不存在的日期，则对应不存在日期的月份会跳过不打定期快照。
     * @param DayOfMonth 指定每月从月初到月底需要触发定期快照的日期,取值范围：[1, 31]，1-31分别表示每月的具体日期，比如5表示每月的5号。注：若设置29、30、31等部分月份不存在的日期，则对应不存在日期的月份会跳过不打定期快照。
     */
    public void setDayOfMonth(Long [] DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get 指定创建定期快照的间隔天数，取值范围：[1, 365]，例如设置为5，则间隔5天即触发定期快照创建。注：当选择按天备份时，理论上第一次备份的时间为备份策略创建当天。如果当天备份策略创建的时间已经晚于设置的备份时间，那么将会等到第二个备份周期再进行第一次备份。 
     * @return IntervalDays 指定创建定期快照的间隔天数，取值范围：[1, 365]，例如设置为5，则间隔5天即触发定期快照创建。注：当选择按天备份时，理论上第一次备份的时间为备份策略创建当天。如果当天备份策略创建的时间已经晚于设置的备份时间，那么将会等到第二个备份周期再进行第一次备份。
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set 指定创建定期快照的间隔天数，取值范围：[1, 365]，例如设置为5，则间隔5天即触发定期快照创建。注：当选择按天备份时，理论上第一次备份的时间为备份策略创建当天。如果当天备份策略创建的时间已经晚于设置的备份时间，那么将会等到第二个备份周期再进行第一次备份。
     * @param IntervalDays 指定创建定期快照的间隔天数，取值范围：[1, 365]，例如设置为5，则间隔5天即触发定期快照创建。注：当选择按天备份时，理论上第一次备份的时间为备份策略创建当天。如果当天备份策略创建的时间已经晚于设置的备份时间，那么将会等到第二个备份周期再进行第一次备份。
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Hour != null) {
            this.Hour = new Long[source.Hour.length];
            for (int i = 0; i < source.Hour.length; i++) {
                this.Hour[i] = new Long(source.Hour[i]);
            }
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new Long[source.DayOfWeek.length];
            for (int i = 0; i < source.DayOfWeek.length; i++) {
                this.DayOfWeek[i] = new Long(source.DayOfWeek[i]);
            }
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new Long[source.DayOfMonth.length];
            for (int i = 0; i < source.DayOfMonth.length; i++) {
                this.DayOfMonth[i] = new Long(source.DayOfMonth[i]);
            }
        }
        if (source.IntervalDays != null) {
            this.IntervalDays = new Long(source.IntervalDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Hour.", this.Hour);
        this.setParamArraySimple(map, prefix + "DayOfWeek.", this.DayOfWeek);
        this.setParamArraySimple(map, prefix + "DayOfMonth.", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

