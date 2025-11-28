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
    * 实例id，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
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
    * 自动备份频率，内部展示，默认取值为24h。
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
    * 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
    */
    @SerializedName("BackupRetentionPeriod")
    @Expose
    private Long BackupRetentionPeriod;

    /**
    * 周几备份，0-6，逗号分割。仅对高级备份生效
    */
    @SerializedName("ActiveWeekdays")
    @Expose
    private String ActiveWeekdays;

    /**
    * 长期保留周期，周weekly，月monthly，空不开启
    */
    @SerializedName("LongTermUnit")
    @Expose
    private String LongTermUnit;

    /**
    * 长期保留哪些天的，周0-6，月1-31，逗号分割
    */
    @SerializedName("LongTermActiveDays")
    @Expose
    private String LongTermActiveDays;

    /**
    * 长期备份保留多少天
    */
    @SerializedName("LongTermExpiredDays")
    @Expose
    private Long LongTermExpiredDays;

    /**
    * 增量保留多少天
    */
    @SerializedName("OplogExpiredDays")
    @Expose
    private Long OplogExpiredDays;

    /**
    * 备份版本。旧版本备份为0，高级备份为1。开启高级备份此值传1
    */
    @SerializedName("BackupVersion")
    @Expose
    private Long BackupVersion;

    /**
    * 告警额度。50-300
    */
    @SerializedName("AlarmWaterLevel")
    @Expose
    private Long AlarmWaterLevel;

    /**
     * Get 实例id，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例id，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例id，例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
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
     * Get 自动备份频率，内部展示，默认取值为24h。 
     * @return BackupFrequency 自动备份频率，内部展示，默认取值为24h。
     */
    public Long getBackupFrequency() {
        return this.BackupFrequency;
    }

    /**
     * Set 自动备份频率，内部展示，默认取值为24h。
     * @param BackupFrequency 自动备份频率，内部展示，默认取值为24h。
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
     * Get 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。 
     * @return BackupRetentionPeriod 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
     */
    public Long getBackupRetentionPeriod() {
        return this.BackupRetentionPeriod;
    }

    /**
     * Set 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
     * @param BackupRetentionPeriod 指定备份数据保存天数。默认为 7 天，支持设置为7、30、90、180、365。
     */
    public void setBackupRetentionPeriod(Long BackupRetentionPeriod) {
        this.BackupRetentionPeriod = BackupRetentionPeriod;
    }

    /**
     * Get 周几备份，0-6，逗号分割。仅对高级备份生效 
     * @return ActiveWeekdays 周几备份，0-6，逗号分割。仅对高级备份生效
     */
    public String getActiveWeekdays() {
        return this.ActiveWeekdays;
    }

    /**
     * Set 周几备份，0-6，逗号分割。仅对高级备份生效
     * @param ActiveWeekdays 周几备份，0-6，逗号分割。仅对高级备份生效
     */
    public void setActiveWeekdays(String ActiveWeekdays) {
        this.ActiveWeekdays = ActiveWeekdays;
    }

    /**
     * Get 长期保留周期，周weekly，月monthly，空不开启 
     * @return LongTermUnit 长期保留周期，周weekly，月monthly，空不开启
     */
    public String getLongTermUnit() {
        return this.LongTermUnit;
    }

    /**
     * Set 长期保留周期，周weekly，月monthly，空不开启
     * @param LongTermUnit 长期保留周期，周weekly，月monthly，空不开启
     */
    public void setLongTermUnit(String LongTermUnit) {
        this.LongTermUnit = LongTermUnit;
    }

    /**
     * Get 长期保留哪些天的，周0-6，月1-31，逗号分割 
     * @return LongTermActiveDays 长期保留哪些天的，周0-6，月1-31，逗号分割
     */
    public String getLongTermActiveDays() {
        return this.LongTermActiveDays;
    }

    /**
     * Set 长期保留哪些天的，周0-6，月1-31，逗号分割
     * @param LongTermActiveDays 长期保留哪些天的，周0-6，月1-31，逗号分割
     */
    public void setLongTermActiveDays(String LongTermActiveDays) {
        this.LongTermActiveDays = LongTermActiveDays;
    }

    /**
     * Get 长期备份保留多少天 
     * @return LongTermExpiredDays 长期备份保留多少天
     */
    public Long getLongTermExpiredDays() {
        return this.LongTermExpiredDays;
    }

    /**
     * Set 长期备份保留多少天
     * @param LongTermExpiredDays 长期备份保留多少天
     */
    public void setLongTermExpiredDays(Long LongTermExpiredDays) {
        this.LongTermExpiredDays = LongTermExpiredDays;
    }

    /**
     * Get 增量保留多少天 
     * @return OplogExpiredDays 增量保留多少天
     */
    public Long getOplogExpiredDays() {
        return this.OplogExpiredDays;
    }

    /**
     * Set 增量保留多少天
     * @param OplogExpiredDays 增量保留多少天
     */
    public void setOplogExpiredDays(Long OplogExpiredDays) {
        this.OplogExpiredDays = OplogExpiredDays;
    }

    /**
     * Get 备份版本。旧版本备份为0，高级备份为1。开启高级备份此值传1 
     * @return BackupVersion 备份版本。旧版本备份为0，高级备份为1。开启高级备份此值传1
     */
    public Long getBackupVersion() {
        return this.BackupVersion;
    }

    /**
     * Set 备份版本。旧版本备份为0，高级备份为1。开启高级备份此值传1
     * @param BackupVersion 备份版本。旧版本备份为0，高级备份为1。开启高级备份此值传1
     */
    public void setBackupVersion(Long BackupVersion) {
        this.BackupVersion = BackupVersion;
    }

    /**
     * Get 告警额度。50-300 
     * @return AlarmWaterLevel 告警额度。50-300
     */
    public Long getAlarmWaterLevel() {
        return this.AlarmWaterLevel;
    }

    /**
     * Set 告警额度。50-300
     * @param AlarmWaterLevel 告警额度。50-300
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

