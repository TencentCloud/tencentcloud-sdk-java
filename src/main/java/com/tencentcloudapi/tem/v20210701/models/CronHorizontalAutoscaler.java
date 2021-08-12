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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronHorizontalAutoscaler extends AbstractModel{

    /**
    * 定时伸缩策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略周期
* * *，三个范围，第一个是天，第二个是月，第三个是周，中间用空格隔开
例子：
* * * （每天）
* * 0-3 （每周日到周三）
1,11,21 * *（每个月1号，11号，21号）
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 定时伸缩策略明细
    */
    @SerializedName("Schedules")
    @Expose
    private CronHorizontalAutoscalerSchedule [] Schedules;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 策略优先级，值越大优先级越高，0为最小值
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 定时伸缩策略名称 
     * @return Name 定时伸缩策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 定时伸缩策略名称
     * @param Name 定时伸缩策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略周期
* * *，三个范围，第一个是天，第二个是月，第三个是周，中间用空格隔开
例子：
* * * （每天）
* * 0-3 （每周日到周三）
1,11,21 * *（每个月1号，11号，21号） 
     * @return Period 策略周期
* * *，三个范围，第一个是天，第二个是月，第三个是周，中间用空格隔开
例子：
* * * （每天）
* * 0-3 （每周日到周三）
1,11,21 * *（每个月1号，11号，21号）
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 策略周期
* * *，三个范围，第一个是天，第二个是月，第三个是周，中间用空格隔开
例子：
* * * （每天）
* * 0-3 （每周日到周三）
1,11,21 * *（每个月1号，11号，21号）
     * @param Period 策略周期
* * *，三个范围，第一个是天，第二个是月，第三个是周，中间用空格隔开
例子：
* * * （每天）
* * 0-3 （每周日到周三）
1,11,21 * *（每个月1号，11号，21号）
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 定时伸缩策略明细 
     * @return Schedules 定时伸缩策略明细
     */
    public CronHorizontalAutoscalerSchedule [] getSchedules() {
        return this.Schedules;
    }

    /**
     * Set 定时伸缩策略明细
     * @param Schedules 定时伸缩策略明细
     */
    public void setSchedules(CronHorizontalAutoscalerSchedule [] Schedules) {
        this.Schedules = Schedules;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 策略优先级，值越大优先级越高，0为最小值 
     * @return Priority 策略优先级，值越大优先级越高，0为最小值
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 策略优先级，值越大优先级越高，0为最小值
     * @param Priority 策略优先级，值越大优先级越高，0为最小值
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CronHorizontalAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronHorizontalAutoscaler(CronHorizontalAutoscaler source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.Schedules != null) {
            this.Schedules = new CronHorizontalAutoscalerSchedule[source.Schedules.length];
            for (int i = 0; i < source.Schedules.length; i++) {
                this.Schedules[i] = new CronHorizontalAutoscalerSchedule(source.Schedules[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "Schedules.", this.Schedules);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

