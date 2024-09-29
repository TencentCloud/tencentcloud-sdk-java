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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupConfigsRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 常规备份存储时长，范围[1, 3650]。
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00。
    */
    @SerializedName("StartBackupTime")
    @Expose
    private String StartBackupTime;

    /**
    * 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:59。
    */
    @SerializedName("EndBackupTime")
    @Expose
    private String EndBackupTime;

    /**
    * 执行备份周期，枚举值：Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * 沉降到归档存储时长，-1表示关闭归档设置。
    */
    @SerializedName("ArchiveDays")
    @Expose
    private Long ArchiveDays;

    /**
    * 超期备份配置。
    */
    @SerializedName("BackupConfigSet")
    @Expose
    private NewBackupConfig [] BackupConfigSet;

    /**
     * Get 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：tdsql-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 常规备份存储时长，范围[1, 3650]。 
     * @return Days 常规备份存储时长，范围[1, 3650]。
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set 常规备份存储时长，范围[1, 3650]。
     * @param Days 常规备份存储时长，范围[1, 3650]。
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00。 
     * @return StartBackupTime 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00。
     */
    public String getStartBackupTime() {
        return this.StartBackupTime;
    }

    /**
     * Set 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00。
     * @param StartBackupTime 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00。
     */
    public void setStartBackupTime(String StartBackupTime) {
        this.StartBackupTime = StartBackupTime;
    }

    /**
     * Get 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:59。 
     * @return EndBackupTime 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:59。
     */
    public String getEndBackupTime() {
        return this.EndBackupTime;
    }

    /**
     * Set 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:59。
     * @param EndBackupTime 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:59。
     */
    public void setEndBackupTime(String EndBackupTime) {
        this.EndBackupTime = EndBackupTime;
    }

    /**
     * Get 执行备份周期，枚举值：Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday 
     * @return WeekDays 执行备份周期，枚举值：Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 执行备份周期，枚举值：Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
     * @param WeekDays 执行备份周期，枚举值：Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 沉降到归档存储时长，-1表示关闭归档设置。 
     * @return ArchiveDays 沉降到归档存储时长，-1表示关闭归档设置。
     */
    public Long getArchiveDays() {
        return this.ArchiveDays;
    }

    /**
     * Set 沉降到归档存储时长，-1表示关闭归档设置。
     * @param ArchiveDays 沉降到归档存储时长，-1表示关闭归档设置。
     */
    public void setArchiveDays(Long ArchiveDays) {
        this.ArchiveDays = ArchiveDays;
    }

    /**
     * Get 超期备份配置。 
     * @return BackupConfigSet 超期备份配置。
     */
    public NewBackupConfig [] getBackupConfigSet() {
        return this.BackupConfigSet;
    }

    /**
     * Set 超期备份配置。
     * @param BackupConfigSet 超期备份配置。
     */
    public void setBackupConfigSet(NewBackupConfig [] BackupConfigSet) {
        this.BackupConfigSet = BackupConfigSet;
    }

    public ModifyBackupConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupConfigsRequest(ModifyBackupConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.StartBackupTime != null) {
            this.StartBackupTime = new String(source.StartBackupTime);
        }
        if (source.EndBackupTime != null) {
            this.EndBackupTime = new String(source.EndBackupTime);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
        if (source.ArchiveDays != null) {
            this.ArchiveDays = new Long(source.ArchiveDays);
        }
        if (source.BackupConfigSet != null) {
            this.BackupConfigSet = new NewBackupConfig[source.BackupConfigSet.length];
            for (int i = 0; i < source.BackupConfigSet.length; i++) {
                this.BackupConfigSet[i] = new NewBackupConfig(source.BackupConfigSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "StartBackupTime", this.StartBackupTime);
        this.setParamSimple(map, prefix + "EndBackupTime", this.EndBackupTime);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "ArchiveDays", this.ArchiveDays);
        this.setParamArrayObj(map, prefix + "BackupConfigSet.", this.BackupConfigSet);

    }
}

