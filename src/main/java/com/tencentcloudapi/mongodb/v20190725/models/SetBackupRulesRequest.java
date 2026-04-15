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
    * <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * <p>设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。</p>
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * <p>指定每日自动备份频率。</p><ul><li>12: 每日备份2次，间隔约12小时。</li><li>24: 每日备份1次（默认），间隔约24小时。</li></ul>
    */
    @SerializedName("BackupFrequency")
    @Expose
    private Long BackupFrequency;

    /**
    * <p>设置自动备份发生错误时，是否发送失败告警。</p><ul><li>true：发送。</li><li>false：不发送。</li></ul>
    */
    @SerializedName("Notify")
    @Expose
    private Boolean Notify;

    /**
    * <p>指定备份数据保留时长。</p><ul><li>单位：天，默认为 7 天。</li><li>取值范围：[7,365]。</li></ul>
    */
    @SerializedName("BackupRetentionPeriod")
    @Expose
    private Long BackupRetentionPeriod;

    /**
    * <p>指定每周内执行自动备份的具体日期。</p><ul><li>格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。</li><li>示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。</li><li>默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。</li></ul>
    */
    @SerializedName("ActiveWeekdays")
    @Expose
    private String ActiveWeekdays;

    /**
    * <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。待废弃，使用LongTermInterval</p>
    */
    @SerializedName("LongTermUnit")
    @Expose
    private String LongTermUnit;

    /**
    * <p>指定用于长期保留的具体备份日期。此设置仅在 <strong>LongTermUnit</strong> 被设为<strong>weekly</strong> 或 <strong>monthly</strong> 时生效。</p><ul><li>按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。</li><li>按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。</li></ul>
    */
    @SerializedName("LongTermActiveDays")
    @Expose
    private String LongTermActiveDays;

    /**
    * <p>长期备份保留时长。取值范围[30,1075]。</p>
    */
    @SerializedName("LongTermExpiredDays")
    @Expose
    private Long LongTermExpiredDays;

    /**
    * <p>增量备份保留时长。</p><ul><li>单位：天。</li><li>默认值：7天。</li><li>取值范围：[7,365]。</li></ul>
    */
    @SerializedName("OplogExpiredDays")
    @Expose
    private Long OplogExpiredDays;

    /**
    * <p>指定备份版本。</p><ul><li>旧版本备份：0。</li><li>开启高级备份：1。</li></ul>
    */
    @SerializedName("BackupVersion")
    @Expose
    private Long BackupVersion;

    /**
    * <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。待废弃,使用AlertThreshold</p>
    */
    @SerializedName("AlarmWaterLevel")
    @Expose
    private Long AlarmWaterLevel;

    /**
    * <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。</p>
    */
    @SerializedName("LongTermInterval")
    @Expose
    private String LongTermInterval;

    /**
    * <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。</p>
    */
    @SerializedName("AlertThreshold")
    @Expose
    private Long AlertThreshold;

    /**
     * Get <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul> 
     * @return BackupMethod <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     * @param BackupMethod <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明</strong>:</li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。</p> 
     * @return BackupTime <p>设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。</p>
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set <p>设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。</p>
     * @param BackupTime <p>设置自动备份开始时间。取值范围为：[0,23]，例如：该参数设置为2，表示02:00开始备份。</p>
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get <p>指定每日自动备份频率。</p><ul><li>12: 每日备份2次，间隔约12小时。</li><li>24: 每日备份1次（默认），间隔约24小时。</li></ul> 
     * @return BackupFrequency <p>指定每日自动备份频率。</p><ul><li>12: 每日备份2次，间隔约12小时。</li><li>24: 每日备份1次（默认），间隔约24小时。</li></ul>
     */
    public Long getBackupFrequency() {
        return this.BackupFrequency;
    }

    /**
     * Set <p>指定每日自动备份频率。</p><ul><li>12: 每日备份2次，间隔约12小时。</li><li>24: 每日备份1次（默认），间隔约24小时。</li></ul>
     * @param BackupFrequency <p>指定每日自动备份频率。</p><ul><li>12: 每日备份2次，间隔约12小时。</li><li>24: 每日备份1次（默认），间隔约24小时。</li></ul>
     */
    public void setBackupFrequency(Long BackupFrequency) {
        this.BackupFrequency = BackupFrequency;
    }

    /**
     * Get <p>设置自动备份发生错误时，是否发送失败告警。</p><ul><li>true：发送。</li><li>false：不发送。</li></ul> 
     * @return Notify <p>设置自动备份发生错误时，是否发送失败告警。</p><ul><li>true：发送。</li><li>false：不发送。</li></ul>
     */
    public Boolean getNotify() {
        return this.Notify;
    }

    /**
     * Set <p>设置自动备份发生错误时，是否发送失败告警。</p><ul><li>true：发送。</li><li>false：不发送。</li></ul>
     * @param Notify <p>设置自动备份发生错误时，是否发送失败告警。</p><ul><li>true：发送。</li><li>false：不发送。</li></ul>
     */
    public void setNotify(Boolean Notify) {
        this.Notify = Notify;
    }

    /**
     * Get <p>指定备份数据保留时长。</p><ul><li>单位：天，默认为 7 天。</li><li>取值范围：[7,365]。</li></ul> 
     * @return BackupRetentionPeriod <p>指定备份数据保留时长。</p><ul><li>单位：天，默认为 7 天。</li><li>取值范围：[7,365]。</li></ul>
     */
    public Long getBackupRetentionPeriod() {
        return this.BackupRetentionPeriod;
    }

    /**
     * Set <p>指定备份数据保留时长。</p><ul><li>单位：天，默认为 7 天。</li><li>取值范围：[7,365]。</li></ul>
     * @param BackupRetentionPeriod <p>指定备份数据保留时长。</p><ul><li>单位：天，默认为 7 天。</li><li>取值范围：[7,365]。</li></ul>
     */
    public void setBackupRetentionPeriod(Long BackupRetentionPeriod) {
        this.BackupRetentionPeriod = BackupRetentionPeriod;
    }

    /**
     * Get <p>指定每周内执行自动备份的具体日期。</p><ul><li>格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。</li><li>示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。</li><li>默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。</li></ul> 
     * @return ActiveWeekdays <p>指定每周内执行自动备份的具体日期。</p><ul><li>格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。</li><li>示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。</li><li>默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。</li></ul>
     */
    public String getActiveWeekdays() {
        return this.ActiveWeekdays;
    }

    /**
     * Set <p>指定每周内执行自动备份的具体日期。</p><ul><li>格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。</li><li>示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。</li><li>默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。</li></ul>
     * @param ActiveWeekdays <p>指定每周内执行自动备份的具体日期。</p><ul><li>格式：请输入 0-6 之间的数字代表周日至周六（例如：1 代表周一），多个日期请用英文逗号 , 分隔。</li><li>示例：输入 1,3,5 表示系统将在每周的周一、周三、周五执行备份。</li><li>默认值：不设置，则默认为全周期 (0,1,2,3,4,5,6)，即每日执行备份。</li></ul>
     */
    public void setActiveWeekdays(String ActiveWeekdays) {
        this.ActiveWeekdays = ActiveWeekdays;
    }

    /**
     * Get <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。待废弃，使用LongTermInterval</p> 
     * @return LongTermUnit <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。待废弃，使用LongTermInterval</p>
     */
    public String getLongTermUnit() {
        return this.LongTermUnit;
    }

    /**
     * Set <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。待废弃，使用LongTermInterval</p>
     * @param LongTermUnit <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。待废弃，使用LongTermInterval</p>
     */
    public void setLongTermUnit(String LongTermUnit) {
        this.LongTermUnit = LongTermUnit;
    }

    /**
     * Get <p>指定用于长期保留的具体备份日期。此设置仅在 <strong>LongTermUnit</strong> 被设为<strong>weekly</strong> 或 <strong>monthly</strong> 时生效。</p><ul><li>按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。</li><li>按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。</li></ul> 
     * @return LongTermActiveDays <p>指定用于长期保留的具体备份日期。此设置仅在 <strong>LongTermUnit</strong> 被设为<strong>weekly</strong> 或 <strong>monthly</strong> 时生效。</p><ul><li>按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。</li><li>按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。</li></ul>
     */
    public String getLongTermActiveDays() {
        return this.LongTermActiveDays;
    }

    /**
     * Set <p>指定用于长期保留的具体备份日期。此设置仅在 <strong>LongTermUnit</strong> 被设为<strong>weekly</strong> 或 <strong>monthly</strong> 时生效。</p><ul><li>按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。</li><li>按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。</li></ul>
     * @param LongTermActiveDays <p>指定用于长期保留的具体备份日期。此设置仅在 <strong>LongTermUnit</strong> 被设为<strong>weekly</strong> 或 <strong>monthly</strong> 时生效。</p><ul><li>按周（weekly）保留：请输入 0-6 之间的数字来代表周日至周六。多个日期请用英文逗号分隔。</li><li>按月（monthly）保留：请输入 1-31 之间的数字来代表月份中的具体日期。多个日期请用英文逗号分隔。</li></ul>
     */
    public void setLongTermActiveDays(String LongTermActiveDays) {
        this.LongTermActiveDays = LongTermActiveDays;
    }

    /**
     * Get <p>长期备份保留时长。取值范围[30,1075]。</p> 
     * @return LongTermExpiredDays <p>长期备份保留时长。取值范围[30,1075]。</p>
     */
    public Long getLongTermExpiredDays() {
        return this.LongTermExpiredDays;
    }

    /**
     * Set <p>长期备份保留时长。取值范围[30,1075]。</p>
     * @param LongTermExpiredDays <p>长期备份保留时长。取值范围[30,1075]。</p>
     */
    public void setLongTermExpiredDays(Long LongTermExpiredDays) {
        this.LongTermExpiredDays = LongTermExpiredDays;
    }

    /**
     * Get <p>增量备份保留时长。</p><ul><li>单位：天。</li><li>默认值：7天。</li><li>取值范围：[7,365]。</li></ul> 
     * @return OplogExpiredDays <p>增量备份保留时长。</p><ul><li>单位：天。</li><li>默认值：7天。</li><li>取值范围：[7,365]。</li></ul>
     */
    public Long getOplogExpiredDays() {
        return this.OplogExpiredDays;
    }

    /**
     * Set <p>增量备份保留时长。</p><ul><li>单位：天。</li><li>默认值：7天。</li><li>取值范围：[7,365]。</li></ul>
     * @param OplogExpiredDays <p>增量备份保留时长。</p><ul><li>单位：天。</li><li>默认值：7天。</li><li>取值范围：[7,365]。</li></ul>
     */
    public void setOplogExpiredDays(Long OplogExpiredDays) {
        this.OplogExpiredDays = OplogExpiredDays;
    }

    /**
     * Get <p>指定备份版本。</p><ul><li>旧版本备份：0。</li><li>开启高级备份：1。</li></ul> 
     * @return BackupVersion <p>指定备份版本。</p><ul><li>旧版本备份：0。</li><li>开启高级备份：1。</li></ul>
     */
    public Long getBackupVersion() {
        return this.BackupVersion;
    }

    /**
     * Set <p>指定备份版本。</p><ul><li>旧版本备份：0。</li><li>开启高级备份：1。</li></ul>
     * @param BackupVersion <p>指定备份版本。</p><ul><li>旧版本备份：0。</li><li>开启高级备份：1。</li></ul>
     */
    public void setBackupVersion(Long BackupVersion) {
        this.BackupVersion = BackupVersion;
    }

    /**
     * Get <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。待废弃,使用AlertThreshold</p> 
     * @return AlarmWaterLevel <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。待废弃,使用AlertThreshold</p>
     */
    public Long getAlarmWaterLevel() {
        return this.AlarmWaterLevel;
    }

    /**
     * Set <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。待废弃,使用AlertThreshold</p>
     * @param AlarmWaterLevel <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。待废弃,使用AlertThreshold</p>
     */
    public void setAlarmWaterLevel(Long AlarmWaterLevel) {
        this.AlarmWaterLevel = AlarmWaterLevel;
    }

    /**
     * Get <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。</p> 
     * @return LongTermInterval <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。</p>
     */
    public String getLongTermInterval() {
        return this.LongTermInterval;
    }

    /**
     * Set <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。</p>
     * @param LongTermInterval <p>长期保留周期。支持按周或按月选择特定日期的备份（例如，每月1日、15日的备份数据），将其保留更长周期。- 不开启（默认）：不启用长期保留功能。- 按周保留： 指定为 weekly。- 按月保留： 指定为 monthly。</p>
     */
    public void setLongTermInterval(String LongTermInterval) {
        this.LongTermInterval = LongTermInterval;
    }

    /**
     * Get <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。</p> 
     * @return AlertThreshold <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。</p>
     */
    public Long getAlertThreshold() {
        return this.AlertThreshold;
    }

    /**
     * Set <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。</p>
     * @param AlertThreshold <p>设置备份数据集存储空间使用率的告警阈值。- 单位：%。-  默认值：100。- 取值范围：[50,300]。</p>
     */
    public void setAlertThreshold(Long AlertThreshold) {
        this.AlertThreshold = AlertThreshold;
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
        if (source.LongTermInterval != null) {
            this.LongTermInterval = new String(source.LongTermInterval);
        }
        if (source.AlertThreshold != null) {
            this.AlertThreshold = new Long(source.AlertThreshold);
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
        this.setParamSimple(map, prefix + "LongTermInterval", this.LongTermInterval);
        this.setParamSimple(map, prefix + "AlertThreshold", this.AlertThreshold);

    }
}

