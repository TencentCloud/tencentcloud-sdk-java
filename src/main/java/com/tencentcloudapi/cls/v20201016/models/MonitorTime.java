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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorTime extends AbstractModel {

    /**
    * 执行周期， 可选值：`Period`、`Fixed`、`Cron`。

- Period：固定频率
- Fixed：固定时间
- Cron：Cron表达式
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。
当type为`Period`,`Fixed`时，time字段生效。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 执行的周期cron表达式。示例：`"* /1 * * * *"` 从左到右每个field的含义 Minutes field, Hours field,Day of month field,Month field,Day of week field， 不支持秒级别。
当type为`Cron`时，CronExpression字段生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
     * Get 执行周期， 可选值：`Period`、`Fixed`、`Cron`。

- Period：固定频率
- Fixed：固定时间
- Cron：Cron表达式 
     * @return Type 执行周期， 可选值：`Period`、`Fixed`、`Cron`。

- Period：固定频率
- Fixed：固定时间
- Cron：Cron表达式
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 执行周期， 可选值：`Period`、`Fixed`、`Cron`。

- Period：固定频率
- Fixed：固定时间
- Cron：Cron表达式
     * @param Type 执行周期， 可选值：`Period`、`Fixed`、`Cron`。

- Period：固定频率
- Fixed：固定时间
- Cron：Cron表达式
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。
当type为`Period`,`Fixed`时，time字段生效。 
     * @return Time 执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。
当type为`Period`,`Fixed`时，time字段生效。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。
当type为`Period`,`Fixed`时，time字段生效。
     * @param Time 执行的周期，或者定制执行的时间节点。单位为分钟，取值范围为1~1440。
当type为`Period`,`Fixed`时，time字段生效。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 执行的周期cron表达式。示例：`"* /1 * * * *"` 从左到右每个field的含义 Minutes field, Hours field,Day of month field,Month field,Day of week field， 不支持秒级别。
当type为`Cron`时，CronExpression字段生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronExpression 执行的周期cron表达式。示例：`"* /1 * * * *"` 从左到右每个field的含义 Minutes field, Hours field,Day of month field,Month field,Day of week field， 不支持秒级别。
当type为`Cron`时，CronExpression字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set 执行的周期cron表达式。示例：`"* /1 * * * *"` 从左到右每个field的含义 Minutes field, Hours field,Day of month field,Month field,Day of week field， 不支持秒级别。
当type为`Cron`时，CronExpression字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronExpression 执行的周期cron表达式。示例：`"* /1 * * * *"` 从左到右每个field的含义 Minutes field, Hours field,Day of month field,Month field,Day of week field， 不支持秒级别。
当type为`Cron`时，CronExpression字段生效。
注意：此字段可能返回 null，表示取不到有效值。
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

