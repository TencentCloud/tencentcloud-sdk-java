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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleElasticityConf extends AbstractModel {

    /**
    * 是否开启弹性伸缩：true/false
    */
    @SerializedName("ScheduledElasticityEnabled")
    @Expose
    private Boolean ScheduledElasticityEnabled;

    /**
    * 调度类型：ONCE（一次性调度），DAILY（每日调度），WEEKLY（每周调度），MONTHLY（每月调度）
    */
    @SerializedName("ScheduleType")
    @Expose
    private String ScheduleType;

    /**
    * 调度日期：WEEKLY传：1~7； MONTHLY传:1~31；其它类型不传
    */
    @SerializedName("ScheduleDays")
    @Expose
    private Long [] ScheduleDays;

    /**
    * 调度时区
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 弹性伸缩计划
    */
    @SerializedName("ElasticPlans")
    @Expose
    private ElasticPlan [] ElasticPlans;

    /**
     * Get 是否开启弹性伸缩：true/false 
     * @return ScheduledElasticityEnabled 是否开启弹性伸缩：true/false
     */
    public Boolean getScheduledElasticityEnabled() {
        return this.ScheduledElasticityEnabled;
    }

    /**
     * Set 是否开启弹性伸缩：true/false
     * @param ScheduledElasticityEnabled 是否开启弹性伸缩：true/false
     */
    public void setScheduledElasticityEnabled(Boolean ScheduledElasticityEnabled) {
        this.ScheduledElasticityEnabled = ScheduledElasticityEnabled;
    }

    /**
     * Get 调度类型：ONCE（一次性调度），DAILY（每日调度），WEEKLY（每周调度），MONTHLY（每月调度） 
     * @return ScheduleType 调度类型：ONCE（一次性调度），DAILY（每日调度），WEEKLY（每周调度），MONTHLY（每月调度）
     */
    public String getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 调度类型：ONCE（一次性调度），DAILY（每日调度），WEEKLY（每周调度），MONTHLY（每月调度）
     * @param ScheduleType 调度类型：ONCE（一次性调度），DAILY（每日调度），WEEKLY（每周调度），MONTHLY（每月调度）
     */
    public void setScheduleType(String ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get 调度日期：WEEKLY传：1~7； MONTHLY传:1~31；其它类型不传 
     * @return ScheduleDays 调度日期：WEEKLY传：1~7； MONTHLY传:1~31；其它类型不传
     */
    public Long [] getScheduleDays() {
        return this.ScheduleDays;
    }

    /**
     * Set 调度日期：WEEKLY传：1~7； MONTHLY传:1~31；其它类型不传
     * @param ScheduleDays 调度日期：WEEKLY传：1~7； MONTHLY传:1~31；其它类型不传
     */
    public void setScheduleDays(Long [] ScheduleDays) {
        this.ScheduleDays = ScheduleDays;
    }

    /**
     * Get 调度时区 
     * @return TimeZone 调度时区
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 调度时区
     * @param TimeZone 调度时区
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 弹性伸缩计划 
     * @return ElasticPlans 弹性伸缩计划
     */
    public ElasticPlan [] getElasticPlans() {
        return this.ElasticPlans;
    }

    /**
     * Set 弹性伸缩计划
     * @param ElasticPlans 弹性伸缩计划
     */
    public void setElasticPlans(ElasticPlan [] ElasticPlans) {
        this.ElasticPlans = ElasticPlans;
    }

    public ScheduleElasticityConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleElasticityConf(ScheduleElasticityConf source) {
        if (source.ScheduledElasticityEnabled != null) {
            this.ScheduledElasticityEnabled = new Boolean(source.ScheduledElasticityEnabled);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new String(source.ScheduleType);
        }
        if (source.ScheduleDays != null) {
            this.ScheduleDays = new Long[source.ScheduleDays.length];
            for (int i = 0; i < source.ScheduleDays.length; i++) {
                this.ScheduleDays[i] = new Long(source.ScheduleDays[i]);
            }
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.ElasticPlans != null) {
            this.ElasticPlans = new ElasticPlan[source.ElasticPlans.length];
            for (int i = 0; i < source.ElasticPlans.length; i++) {
                this.ElasticPlans[i] = new ElasticPlan(source.ElasticPlans[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledElasticityEnabled", this.ScheduledElasticityEnabled);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamArraySimple(map, prefix + "ScheduleDays.", this.ScheduleDays);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArrayObj(map, prefix + "ElasticPlans.", this.ElasticPlans);

    }
}

