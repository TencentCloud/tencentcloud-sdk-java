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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTime extends AbstractModel {

    /**
    * <p>执行周期， 可选值：<code>Period</code>、<code>Fixed</code>、<code>Cron</code>。</p><ul><li>Period：固定频率</li><li>Fixed：固定时间</li><li>Cron：Cron表达式</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。<br>当type为<code>Period</code>,<code>Fixed</code>时，time字段生效。</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>执行的周期cron表达式。示例：<code>0/1 * * * *</code> 从左到右每个field的含义 Minutes field(分钟), Hours field(小时),Day of month field(日期),Month field(月份),Day of week field(星期)， 不支持秒级别。当type为<code>Cron</code>时，CronExpression字段生效。</p>
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
     * Get <p>执行周期， 可选值：<code>Period</code>、<code>Fixed</code>、<code>Cron</code>。</p><ul><li>Period：固定频率</li><li>Fixed：固定时间</li><li>Cron：Cron表达式</li></ul> 
     * @return Type <p>执行周期， 可选值：<code>Period</code>、<code>Fixed</code>、<code>Cron</code>。</p><ul><li>Period：固定频率</li><li>Fixed：固定时间</li><li>Cron：Cron表达式</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>执行周期， 可选值：<code>Period</code>、<code>Fixed</code>、<code>Cron</code>。</p><ul><li>Period：固定频率</li><li>Fixed：固定时间</li><li>Cron：Cron表达式</li></ul>
     * @param Type <p>执行周期， 可选值：<code>Period</code>、<code>Fixed</code>、<code>Cron</code>。</p><ul><li>Period：固定频率</li><li>Fixed：固定时间</li><li>Cron：Cron表达式</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。<br>当type为<code>Period</code>,<code>Fixed</code>时，time字段生效。</p> 
     * @return Time <p>执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。<br>当type为<code>Period</code>,<code>Fixed</code>时，time字段生效。</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。<br>当type为<code>Period</code>,<code>Fixed</code>时，time字段生效。</p>
     * @param Time <p>执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。<br>当type为<code>Period</code>,<code>Fixed</code>时，time字段生效。</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>执行的周期cron表达式。示例：<code>0/1 * * * *</code> 从左到右每个field的含义 Minutes field(分钟), Hours field(小时),Day of month field(日期),Month field(月份),Day of week field(星期)， 不支持秒级别。当type为<code>Cron</code>时，CronExpression字段生效。</p> 
     * @return CronExpression <p>执行的周期cron表达式。示例：<code>0/1 * * * *</code> 从左到右每个field的含义 Minutes field(分钟), Hours field(小时),Day of month field(日期),Month field(月份),Day of week field(星期)， 不支持秒级别。当type为<code>Cron</code>时，CronExpression字段生效。</p>
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set <p>执行的周期cron表达式。示例：<code>0/1 * * * *</code> 从左到右每个field的含义 Minutes field(分钟), Hours field(小时),Day of month field(日期),Month field(月份),Day of week field(星期)， 不支持秒级别。当type为<code>Cron</code>时，CronExpression字段生效。</p>
     * @param CronExpression <p>执行的周期cron表达式。示例：<code>0/1 * * * *</code> 从左到右每个field的含义 Minutes field(分钟), Hours field(小时),Day of month field(日期),Month field(月份),Day of week field(星期)， 不支持秒级别。当type为<code>Cron</code>时，CronExpression字段生效。</p>
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    public MonitorTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorTime(MonitorTime source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);

    }
}

