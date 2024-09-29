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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupConfigsResponse extends AbstractModel {

    /**
    * 实例 ID。
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
    private BackupConfig [] BackupConfigSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
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
    public BackupConfig [] getBackupConfigSet() {
        return this.BackupConfigSet;
    }

    /**
     * Set 超期备份配置。
     * @param BackupConfigSet 超期备份配置。
     */
    public void setBackupConfigSet(BackupConfig [] BackupConfigSet) {
        this.BackupConfigSet = BackupConfigSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupConfigsResponse(DescribeBackupConfigsResponse source) {
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
            this.BackupConfigSet = new BackupConfig[source.BackupConfigSet.length];
            for (int i = 0; i < source.BackupConfigSet.length; i++) {
                this.BackupConfigSet[i] = new BackupConfig(source.BackupConfigSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

