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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoBackupConfigResponse extends AbstractModel{

    /**
    * 增量备份文件保存天数。
    */
    @SerializedName("BackupStorageDays")
    @Expose
    private Long BackupStorageDays;

    /**
    * 全量备份文件保存天数。
    */
    @SerializedName("BinlogStorageDays")
    @Expose
    private Long BinlogStorageDays;

    /**
    * 备份时间段。
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * 备份周期。Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 增量备份文件保存天数。 
     * @return BackupStorageDays 增量备份文件保存天数。
     */
    public Long getBackupStorageDays() {
        return this.BackupStorageDays;
    }

    /**
     * Set 增量备份文件保存天数。
     * @param BackupStorageDays 增量备份文件保存天数。
     */
    public void setBackupStorageDays(Long BackupStorageDays) {
        this.BackupStorageDays = BackupStorageDays;
    }

    /**
     * Get 全量备份文件保存天数。 
     * @return BinlogStorageDays 全量备份文件保存天数。
     */
    public Long getBinlogStorageDays() {
        return this.BinlogStorageDays;
    }

    /**
     * Set 全量备份文件保存天数。
     * @param BinlogStorageDays 全量备份文件保存天数。
     */
    public void setBinlogStorageDays(Long BinlogStorageDays) {
        this.BinlogStorageDays = BinlogStorageDays;
    }

    /**
     * Get 备份时间段。 
     * @return TimePeriod 备份时间段。
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set 备份时间段。
     * @param TimePeriod 备份时间段。
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    /**
     * Get 备份周期。Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。 
     * @return WeekDays 备份周期。Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 备份周期。Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     * @param WeekDays 备份周期。Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday。
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
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

    public ModifyAutoBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoBackupConfigResponse(ModifyAutoBackupConfigResponse source) {
        if (source.BackupStorageDays != null) {
            this.BackupStorageDays = new Long(source.BackupStorageDays);
        }
        if (source.BinlogStorageDays != null) {
            this.BinlogStorageDays = new Long(source.BinlogStorageDays);
        }
        if (source.TimePeriod != null) {
            this.TimePeriod = new String(source.TimePeriod);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
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
        this.setParamSimple(map, prefix + "BackupStorageDays", this.BackupStorageDays);
        this.setParamSimple(map, prefix + "BinlogStorageDays", this.BinlogStorageDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

