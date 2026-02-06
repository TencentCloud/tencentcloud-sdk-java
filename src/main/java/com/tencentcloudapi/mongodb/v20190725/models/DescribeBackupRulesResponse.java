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

public class DescribeBackupRulesResponse extends AbstractModel {

    /**
    * 备份数据保留期限。单位为：天。
    */
    @SerializedName("BackupSaveTime")
    @Expose
    private Long BackupSaveTime;

    /**
    * 备份频率。备份时间间隔，单位小时。取值12，24
    */
    @SerializedName("BackupFrequency")
    @Expose
    private Long BackupFrequency;

    /**
    * 自动备份开始时间。
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

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
    * 周几备份，0-6，逗号分割
    */
    @SerializedName("ActiveWeekdays")
    @Expose
    private String ActiveWeekdays;

    /**
    * 长期备份周期。weekly-按周，monthly-按月，空不开启。
    */
    @SerializedName("LongTermInterval")
    @Expose
    private String LongTermInterval;

    /**
    * 长期备份的日期，周0-6，月1-31
    */
    @SerializedName("LongTermActiveDays")
    @Expose
    private String LongTermActiveDays;

    /**
    * 长期备份保留时间
    */
    @SerializedName("LongTermExpiredDays")
    @Expose
    private Long LongTermExpiredDays;

    /**
    * 增量备份保留时间
    */
    @SerializedName("OplogExpiredDays")
    @Expose
    private Long OplogExpiredDays;

    /**
    * 备份版本号。0-旧备份方式，1-高级备份
    */
    @SerializedName("BackupVersion")
    @Expose
    private Long BackupVersion;

    /**
    * 备份大小
    */
    @SerializedName("BackupTotalSize")
    @Expose
    private BackupTotalSize BackupTotalSize;

    /**
    * 告警额度
    */
    @SerializedName("AlertThreshold")
    @Expose
    private Long AlertThreshold;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份数据保留期限。单位为：天。 
     * @return BackupSaveTime 备份数据保留期限。单位为：天。
     */
    public Long getBackupSaveTime() {
        return this.BackupSaveTime;
    }

    /**
     * Set 备份数据保留期限。单位为：天。
     * @param BackupSaveTime 备份数据保留期限。单位为：天。
     */
    public void setBackupSaveTime(Long BackupSaveTime) {
        this.BackupSaveTime = BackupSaveTime;
    }

    /**
     * Get 备份频率。备份时间间隔，单位小时。取值12，24 
     * @return BackupFrequency 备份频率。备份时间间隔，单位小时。取值12，24
     */
    public Long getBackupFrequency() {
        return this.BackupFrequency;
    }

    /**
     * Set 备份频率。备份时间间隔，单位小时。取值12，24
     * @param BackupFrequency 备份频率。备份时间间隔，单位小时。取值12，24
     */
    public void setBackupFrequency(Long BackupFrequency) {
        this.BackupFrequency = BackupFrequency;
    }

    /**
     * Get 自动备份开始时间。 
     * @return BackupTime 自动备份开始时间。
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 自动备份开始时间。
     * @param BackupTime 自动备份开始时间。
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
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
     * Get 周几备份，0-6，逗号分割 
     * @return ActiveWeekdays 周几备份，0-6，逗号分割
     */
    public String getActiveWeekdays() {
        return this.ActiveWeekdays;
    }

    /**
     * Set 周几备份，0-6，逗号分割
     * @param ActiveWeekdays 周几备份，0-6，逗号分割
     */
    public void setActiveWeekdays(String ActiveWeekdays) {
        this.ActiveWeekdays = ActiveWeekdays;
    }

    /**
     * Get 长期备份周期。weekly-按周，monthly-按月，空不开启。 
     * @return LongTermInterval 长期备份周期。weekly-按周，monthly-按月，空不开启。
     */
    public String getLongTermInterval() {
        return this.LongTermInterval;
    }

    /**
     * Set 长期备份周期。weekly-按周，monthly-按月，空不开启。
     * @param LongTermInterval 长期备份周期。weekly-按周，monthly-按月，空不开启。
     */
    public void setLongTermInterval(String LongTermInterval) {
        this.LongTermInterval = LongTermInterval;
    }

    /**
     * Get 长期备份的日期，周0-6，月1-31 
     * @return LongTermActiveDays 长期备份的日期，周0-6，月1-31
     */
    public String getLongTermActiveDays() {
        return this.LongTermActiveDays;
    }

    /**
     * Set 长期备份的日期，周0-6，月1-31
     * @param LongTermActiveDays 长期备份的日期，周0-6，月1-31
     */
    public void setLongTermActiveDays(String LongTermActiveDays) {
        this.LongTermActiveDays = LongTermActiveDays;
    }

    /**
     * Get 长期备份保留时间 
     * @return LongTermExpiredDays 长期备份保留时间
     */
    public Long getLongTermExpiredDays() {
        return this.LongTermExpiredDays;
    }

    /**
     * Set 长期备份保留时间
     * @param LongTermExpiredDays 长期备份保留时间
     */
    public void setLongTermExpiredDays(Long LongTermExpiredDays) {
        this.LongTermExpiredDays = LongTermExpiredDays;
    }

    /**
     * Get 增量备份保留时间 
     * @return OplogExpiredDays 增量备份保留时间
     */
    public Long getOplogExpiredDays() {
        return this.OplogExpiredDays;
    }

    /**
     * Set 增量备份保留时间
     * @param OplogExpiredDays 增量备份保留时间
     */
    public void setOplogExpiredDays(Long OplogExpiredDays) {
        this.OplogExpiredDays = OplogExpiredDays;
    }

    /**
     * Get 备份版本号。0-旧备份方式，1-高级备份 
     * @return BackupVersion 备份版本号。0-旧备份方式，1-高级备份
     */
    public Long getBackupVersion() {
        return this.BackupVersion;
    }

    /**
     * Set 备份版本号。0-旧备份方式，1-高级备份
     * @param BackupVersion 备份版本号。0-旧备份方式，1-高级备份
     */
    public void setBackupVersion(Long BackupVersion) {
        this.BackupVersion = BackupVersion;
    }

    /**
     * Get 备份大小 
     * @return BackupTotalSize 备份大小
     */
    public BackupTotalSize getBackupTotalSize() {
        return this.BackupTotalSize;
    }

    /**
     * Set 备份大小
     * @param BackupTotalSize 备份大小
     */
    public void setBackupTotalSize(BackupTotalSize BackupTotalSize) {
        this.BackupTotalSize = BackupTotalSize;
    }

    /**
     * Get 告警额度 
     * @return AlertThreshold 告警额度
     */
    public Long getAlertThreshold() {
        return this.AlertThreshold;
    }

    /**
     * Set 告警额度
     * @param AlertThreshold 告警额度
     */
    public void setAlertThreshold(Long AlertThreshold) {
        this.AlertThreshold = AlertThreshold;
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

    public DescribeBackupRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupRulesResponse(DescribeBackupRulesResponse source) {
        if (source.BackupSaveTime != null) {
            this.BackupSaveTime = new Long(source.BackupSaveTime);
        }
        if (source.BackupFrequency != null) {
            this.BackupFrequency = new Long(source.BackupFrequency);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new Long(source.BackupTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.ActiveWeekdays != null) {
            this.ActiveWeekdays = new String(source.ActiveWeekdays);
        }
        if (source.LongTermInterval != null) {
            this.LongTermInterval = new String(source.LongTermInterval);
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
        if (source.BackupTotalSize != null) {
            this.BackupTotalSize = new BackupTotalSize(source.BackupTotalSize);
        }
        if (source.AlertThreshold != null) {
            this.AlertThreshold = new Long(source.AlertThreshold);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupSaveTime", this.BackupSaveTime);
        this.setParamSimple(map, prefix + "BackupFrequency", this.BackupFrequency);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "ActiveWeekdays", this.ActiveWeekdays);
        this.setParamSimple(map, prefix + "LongTermInterval", this.LongTermInterval);
        this.setParamSimple(map, prefix + "LongTermActiveDays", this.LongTermActiveDays);
        this.setParamSimple(map, prefix + "LongTermExpiredDays", this.LongTermExpiredDays);
        this.setParamSimple(map, prefix + "OplogExpiredDays", this.OplogExpiredDays);
        this.setParamSimple(map, prefix + "BackupVersion", this.BackupVersion);
        this.setParamObj(map, prefix + "BackupTotalSize.", this.BackupTotalSize);
        this.setParamSimple(map, prefix + "AlertThreshold", this.AlertThreshold);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

