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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupConfigResponse extends AbstractModel{

    /**
    * 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
    */
    @SerializedName("StartTimeMin")
    @Expose
    private Long StartTimeMin;

    /**
    * 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
    */
    @SerializedName("StartTimeMax")
    @Expose
    private Long StartTimeMax;

    /**
    * 备份文件保留时间，单位为天。
    */
    @SerializedName("BackupExpireDays")
    @Expose
    private Long BackupExpireDays;

    /**
    * 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * Binlog 文件保留时间，单位为天。
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * 实例自动备份的时间窗。
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段） 
     * @return StartTimeMin 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public Long getStartTimeMin() {
        return this.StartTimeMin;
    }

    /**
     * Set 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     * @param StartTimeMin 自动备份开始的最早时间点，单位为时刻。例如，2 - 凌晨 2:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public void setStartTimeMin(Long StartTimeMin) {
        this.StartTimeMin = StartTimeMin;
    }

    /**
     * Get 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段） 
     * @return StartTimeMax 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public Long getStartTimeMax() {
        return this.StartTimeMax;
    }

    /**
     * Set 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     * @param StartTimeMax 自动备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨 6:00。（该字段已废弃，建议使用 BackupTimeWindow 字段）
     */
    public void setStartTimeMax(Long StartTimeMax) {
        this.StartTimeMax = StartTimeMax;
    }

    /**
     * Get 备份文件保留时间，单位为天。 
     * @return BackupExpireDays 备份文件保留时间，单位为天。
     */
    public Long getBackupExpireDays() {
        return this.BackupExpireDays;
    }

    /**
     * Set 备份文件保留时间，单位为天。
     * @param BackupExpireDays 备份文件保留时间，单位为天。
     */
    public void setBackupExpireDays(Long BackupExpireDays) {
        this.BackupExpireDays = BackupExpireDays;
    }

    /**
     * Get 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。 
     * @return BackupMethod 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
     * @param BackupMethod 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Binlog 文件保留时间，单位为天。 
     * @return BinlogExpireDays Binlog 文件保留时间，单位为天。
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set Binlog 文件保留时间，单位为天。
     * @param BinlogExpireDays Binlog 文件保留时间，单位为天。
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get 实例自动备份的时间窗。 
     * @return BackupTimeWindow 实例自动备份的时间窗。
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set 实例自动备份的时间窗。
     * @param BackupTimeWindow 实例自动备份的时间窗。
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeMin", this.StartTimeMin);
        this.setParamSimple(map, prefix + "StartTimeMax", this.StartTimeMax);
        this.setParamSimple(map, prefix + "BackupExpireDays", this.BackupExpireDays);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);
        this.setParamObj(map, prefix + "BackupTimeWindow.", this.BackupTimeWindow);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

