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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetBackupRulesRequest extends AbstractModel {

    /**
    * 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * 指定每日自动备份频率。
- 12: 每日备份2次，间隔约12小时。
- 24: 每日备份1次（默认），间隔约24小时。
    */
    @SerializedName("BackupFrequency")
    @Expose
    private Long BackupFrequency;

    /**
    * 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
    */
    @SerializedName("Notify")
    @Expose
    private Boolean Notify;

    /**
    * 指定备份数据保留时长。
- 单位：天，默认为 7 天。
- 取值范围：[7,365]。
    */
    @SerializedName("BackupRetentionPeriod")
    @Expose
    private Long BackupRetentionPeriod;

    /**
    * 指定每周内执行自动备份的具体日期。
- 格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。
- 示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。
- 默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。
    */
    @SerializedName("ActiveWeekdays")
    @Expose
    private String ActiveWeekdays;

    /**
    * 长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。
- 不开启（默认）：不启用长期保留功能。
- 按周保留： 指定为 weekly。
- 按月保留： 指定为 monthly。
    */
    @SerializedName("LongTermUnit")
    @Expose
    private String LongTermUnit;

    /**
    * 指定用于长期保留的具体备份日期。此设置仅在 **LongTermUnit** 被设为**weekly** 或 **monthly** 时生效。
- 按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。
- 按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。
    */
    @SerializedName("LongTermActiveDays")
    @Expose
    private String LongTermActiveDays;

    /**
    * 长期备份保留时长。取值范围[30,1075]。
    */
    @SerializedName("LongTermExpiredDays")
    @Expose
    private Long LongTermExpiredDays;

    /**
    * 增量备份保留时长。
- 单位：天。
- 默认值：7天。
- 取值范围：[7,365]。
    */
    @SerializedName("OplogExpiredDays")
    @Expose
    private Long OplogExpiredDays;

    /**
    * 指定备份版本。
- 旧版本备份：0。
- 开启高级备份：1。
    */
    @SerializedName("BackupVersion")
    @Expose
    private Long BackupVersion;

    /**
    * 设置备份数据集存储空间使用率的告警阈值。
- 单位：%。
-  默认值：100。
- 取值范围：[50,300]。
    */
    @SerializedName("AlarmWaterLevel")
    @Expose
    private Long AlarmWaterLevel;

    /**
     * Get 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。 
     * @return BackupMethod 备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
     * @param BackupMethod 备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。 
     * @return BackupTime 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
     * @param BackupTime 设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 指定每日自动备份频率。
- 12: 每日备份2次，间隔约12小时。
- 24: 每日备份1次（默认），间隔约24小时。 
     * @return BackupFrequency 指定每日自动备份频率。
- 12: 每日备份2次，间隔约12小时。
- 24: 每日备份1次（默认），间隔约24小时。
     */
    public Long getBackupFrequency() {
        return this.BackupFrequency;
    }

    /**
     * Set 指定每日自动备份频率。
- 12: 每日备份2次，间隔约12小时。
- 24: 每日备份1次（默认），间隔约24小时。
     * @param BackupFrequency 指定每日自动备份频率。
- 12: 每日备份2次，间隔约12小时。
- 24: 每日备份1次（默认），间隔约24小时。
     */
    public void setBackupFrequency(Long BackupFrequency) {
        this.BackupFrequency = BackupFrequency;
    }

    /**
     * Get 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。 
     * @return Notify 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
     */
    public Boolean getNotify() {
        return this.Notify;
    }

    /**
     * Set 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
     * @param Notify 设置自动备份发生错误时，是否发送失败告警。
- true：发送。
- false：不发送。
     */
    public void setNotify(Boolean Notify) {
        this.Notify = Notify;
    }

    /**
     * Get 指定备份数据保留时长。
- 单位：天，默认为 7 天。
- 取值范围：[7,365]。 
     * @return BackupRetentionPeriod 指定备份数据保留时长。
- 单位：天，默认为 7 天。
- 取值范围：[7,365]。
     */
    public Long getBackupRetentionPeriod() {
        return this.BackupRetentionPeriod;
    }

    /**
     * Set 指定备份数据保留时长。
- 单位：天，默认为 7 天。
- 取值范围：[7,365]。
     * @param BackupRetentionPeriod 指定备份数据保留时长。
- 单位：天，默认为 7 天。
- 取值范围：[7,365]。
     */
    public void setBackupRetentionPeriod(Long BackupRetentionPeriod) {
        this.BackupRetentionPeriod = BackupRetentionPeriod;
    }

    /**
     * Get 指定每周内执行自动备份的具体日期。
- 格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。
- 示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。
- 默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。 
     * @return ActiveWeekdays 指定每周内执行自动备份的具体日期。
- 格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。
- 示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。
- 默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。
     */
    public String getActiveWeekdays() {
        return this.ActiveWeekdays;
    }

    /**
     * Set 指定每周内执行自动备份的具体日期。
- 格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。
- 示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。
- 默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。
     * @param ActiveWeekdays 指定每周内执行自动备份的具体日期。
- 格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。
- 示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。
- 默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。
     */
    public void setActiveWeekdays(String ActiveWeekdays) {
        this.ActiveWeekdays = ActiveWeekdays;
    }

    /**
     * Get 长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。
- 不开启（默认）：不启用长期保留功能。
- 按周保留： 指定为 weekly。
- 按月保留： 指定为 monthly。 
     * @return LongTermUnit 长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。
- 不开启（默认）：不启用长期保留功能。
- 按周保留： 指定为 weekly。
- 按月保留： 指定为 monthly。
     */
    public String getLongTermUnit() {
        return this.LongTermUnit;
    }

    /**
     * Set 长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。
- 不开启（默认）：不启用长期保留功能。
- 按周保留： 指定为 weekly。
- 按月保留： 指定为 monthly。
     * @param LongTermUnit 长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。
- 不开启（默认）：不启用长期保留功能。
- 按周保留： 指定为 weekly。
- 按月保留： 指定为 monthly。
     */
    public void setLongTermUnit(String LongTermUnit) {
        this.LongTermUnit = LongTermUnit;
    }

    /**
     * Get 指定用于长期保留的具体备份日期。此设置仅在 **LongTermUnit** 被设为**weekly** 或 **monthly** 时生效。
- 按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。
- 按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。 
     * @return LongTermActiveDays 指定用于长期保留的具体备份日期。此设置仅在 **LongTermUnit** 被设为**weekly** 或 **monthly** 时生效。
- 按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。
- 按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。
     */
    public String getLongTermActiveDays() {
        return this.LongTermActiveDays;
    }

    /**
     * Set 指定用于长期保留的具体备份日期。此设置仅在 **LongTermUnit** 被设为**weekly** 或 **monthly** 时生效。
- 按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。
- 按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。
     * @param LongTermActiveDays 指定用于长期保留的具体备份日期。此设置仅在 **LongTermUnit** 被设为**weekly** 或 **monthly** 时生效。
- 按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。
- 按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。
     */
    public void setLongTermActiveDays(String LongTermActiveDays) {
        this.LongTermActiveDays = LongTermActiveDays;
    }

    /**
     * Get 长期备份保留时长。取值范围[30,1075]。 
     * @return LongTermExpiredDays 长期备份保留时长。取值范围[30,1075]。
     */
    public Long getLongTermExpiredDays() {
        return this.LongTermExpiredDays;
    }

    /**
     * Set 长期备份保留时长。取值范围[30,1075]。
     * @param LongTermExpiredDays 长期备份保留时长。取值范围[30,1075]。
     */
    public void setLongTermExpiredDays(Long LongTermExpiredDays) {
        this.LongTermExpiredDays = LongTermExpiredDays;
    }

    /**
     * Get 增量备份保留时长。
- 单位：天。
- 默认值：7天。
- 取值范围：[7,365]。 
     * @return OplogExpiredDays 增量备份保留时长。
- 单位：天。
- 默认值：7天。
- 取值范围：[7,365]。
     */
    public Long getOplogExpiredDays() {
        return this.OplogExpiredDays;
    }

    /**
     * Set 增量备份保留时长。
- 单位：天。
- 默认值：7天。
- 取值范围：[7,365]。
     * @param OplogExpiredDays 增量备份保留时长。
- 单位：天。
- 默认值：7天。
- 取值范围：[7,365]。
     */
    public void setOplogExpiredDays(Long OplogExpiredDays) {
        this.OplogExpiredDays = OplogExpiredDays;
    }

    /**
     * Get 指定备份版本。
- 旧版本备份：0。
- 开启高级备份：1。 
     * @return BackupVersion 指定备份版本。
- 旧版本备份：0。
- 开启高级备份：1。
     */
    public Long getBackupVersion() {
        return this.BackupVersion;
    }

    /**
     * Set 指定备份版本。
- 旧版本备份：0。
- 开启高级备份：1。
     * @param BackupVersion 指定备份版本。
- 旧版本备份：0。
- 开启高级备份：1。
     */
    public void setBackupVersion(Long BackupVersion) {
        this.BackupVersion = BackupVersion;
    }

    /**
     * Get 设置备份数据集存储空间使用率的告警阈值。
- 单位：%。
-  默认值：100。
- 取值范围：[50,300]。 
     * @return AlarmWaterLevel 设置备份数据集存储空间使用率的告警阈值。
- 单位：%。
-  默认值：100。
- 取值范围：[50,300]。
     */
    public Long getAlarmWaterLevel() {
        return this.AlarmWaterLevel;
    }

    /**
     * Set 设置备份数据集存储空间使用率的告警阈值。
- 单位：%。
-  默认值：100。
- 取值范围：[50,300]。
     * @param AlarmWaterLevel 设置备份数据集存储空间使用率的告警阈值。
- 单位：%。
-  默认值：100。
- 取值范围：[50,300]。
     */
    public void setAlarmWaterLevel(Long AlarmWaterLevel) {
        this.AlarmWaterLevel = AlarmWaterLevel;
    }

    public SetBackupRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetBackupRulesRequest(SetBackupRulesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new Long(source.BackupTime);
        }
        if (source.BackupFrequency != null) {
            this.BackupFrequency = new Long(source.BackupFrequency);
        }
        if (source.Notify != null) {
            this.Notify = new Boolean(source.Notify);
        }
        if (source.BackupRetentionPeriod != null) {
            this.BackupRetentionPeriod = new Long(source.BackupRetentionPeriod);
        }
        if (source.ActiveWeekdays != null) {
            this.ActiveWeekdays = new String(source.ActiveWeekdays);
        }
        if (source.LongTermUnit != null) {
            this.LongTermUnit = new String(source.LongTermUnit);
        }
        if (source.LongTermActiveDays != null) {
            this.LongTermActiveDays = new String(source.LongTermActiveDays);
        }
        if (source.LongTermExpiredDays != null) {
            this.LongTermExpiredDays = new Long(source.LongTermExpiredDays);
        }
        if (source.OplogExpiredDays != null) {
            this.OplogExpiredDays = new Long(source.OplogExpiredDays);
        }
        if (source.BackupVersion != null) {
            this.BackupVersion = new Long(source.BackupVersion);
        }
        if (source.AlarmWaterLevel != null) {
            this.AlarmWaterLevel = new Long(source.AlarmWaterLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupFrequency", this.BackupFrequency);
        this.setParamSimple(map, prefix + "Notify", this.Notify);
        this.setParamSimple(map, prefix + "BackupRetentionPeriod", this.BackupRetentionPeriod);
        this.setParamSimple(map, prefix + "ActiveWeekdays", this.ActiveWeekdays);
        this.setParamSimple(map, prefix + "LongTermUnit", this.LongTermUnit);
        this.setParamSimple(map, prefix + "LongTermActiveDays", this.LongTermActiveDays);
        this.setParamSimple(map, prefix + "LongTermExpiredDays", this.LongTermExpiredDays);
        this.setParamSimple(map, prefix + "OplogExpiredDays", this.OplogExpiredDays);
        this.setParamSimple(map, prefix + "BackupVersion", this.BackupVersion);
        this.setParamSimple(map, prefix + "AlarmWaterLevel", this.AlarmWaterLevel);

    }
}

