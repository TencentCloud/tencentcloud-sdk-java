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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupProgress extends AbstractModel {

    /**
    * 全量备份状态。
    */
    @SerializedName("FullBackupStatus")
    @Expose
    private String FullBackupStatus;

    /**
    * 增量备份状态。
    */
    @SerializedName("IncrementBackupStatus")
    @Expose
    private String IncrementBackupStatus;

    /**
    * 上次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份时为空字符串。
    */
    @SerializedName("LastBackupTime")
    @Expose
    private String LastBackupTime;

    /**
    * 下次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。
    */
    @SerializedName("NextBackupTime")
    @Expose
    private String NextBackupTime;

    /**
    * 上次恢复时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复时为空字符串。
    */
    @SerializedName("LastRestoreTime")
    @Expose
    private String LastRestoreTime;

    /**
    * 上次恢复任务状态。
    */
    @SerializedName("LastRestoreStatus")
    @Expose
    private String LastRestoreStatus;

    /**
    * 当前备份作业状态。
    */
    @SerializedName("CurrentBackupJobStatus")
    @Expose
    private String CurrentBackupJobStatus;

    /**
     * Get 全量备份状态。 
     * @return FullBackupStatus 全量备份状态。
     */
    public String getFullBackupStatus() {
        return this.FullBackupStatus;
    }

    /**
     * Set 全量备份状态。
     * @param FullBackupStatus 全量备份状态。
     */
    public void setFullBackupStatus(String FullBackupStatus) {
        this.FullBackupStatus = FullBackupStatus;
    }

    /**
     * Get 增量备份状态。 
     * @return IncrementBackupStatus 增量备份状态。
     */
    public String getIncrementBackupStatus() {
        return this.IncrementBackupStatus;
    }

    /**
     * Set 增量备份状态。
     * @param IncrementBackupStatus 增量备份状态。
     */
    public void setIncrementBackupStatus(String IncrementBackupStatus) {
        this.IncrementBackupStatus = IncrementBackupStatus;
    }

    /**
     * Get 上次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份时为空字符串。 
     * @return LastBackupTime 上次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份时为空字符串。
     */
    public String getLastBackupTime() {
        return this.LastBackupTime;
    }

    /**
     * Set 上次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份时为空字符串。
     * @param LastBackupTime 上次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份时为空字符串。
     */
    public void setLastBackupTime(String LastBackupTime) {
        this.LastBackupTime = LastBackupTime;
    }

    /**
     * Get 下次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。 
     * @return NextBackupTime 下次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。
     */
    public String getNextBackupTime() {
        return this.NextBackupTime;
    }

    /**
     * Set 下次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。
     * @param NextBackupTime 下次备份执行时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。
     */
    public void setNextBackupTime(String NextBackupTime) {
        this.NextBackupTime = NextBackupTime;
    }

    /**
     * Get 上次恢复时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复时为空字符串。 
     * @return LastRestoreTime 上次恢复时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复时为空字符串。
     */
    public String getLastRestoreTime() {
        return this.LastRestoreTime;
    }

    /**
     * Set 上次恢复时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复时为空字符串。
     * @param LastRestoreTime 上次恢复时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复时为空字符串。
     */
    public void setLastRestoreTime(String LastRestoreTime) {
        this.LastRestoreTime = LastRestoreTime;
    }

    /**
     * Get 上次恢复任务状态。 
     * @return LastRestoreStatus 上次恢复任务状态。
     */
    public String getLastRestoreStatus() {
        return this.LastRestoreStatus;
    }

    /**
     * Set 上次恢复任务状态。
     * @param LastRestoreStatus 上次恢复任务状态。
     */
    public void setLastRestoreStatus(String LastRestoreStatus) {
        this.LastRestoreStatus = LastRestoreStatus;
    }

    /**
     * Get 当前备份作业状态。 
     * @return CurrentBackupJobStatus 当前备份作业状态。
     */
    public String getCurrentBackupJobStatus() {
        return this.CurrentBackupJobStatus;
    }

    /**
     * Set 当前备份作业状态。
     * @param CurrentBackupJobStatus 当前备份作业状态。
     */
    public void setCurrentBackupJobStatus(String CurrentBackupJobStatus) {
        this.CurrentBackupJobStatus = CurrentBackupJobStatus;
    }

    public BackupProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupProgress(BackupProgress source) {
        if (source.FullBackupStatus != null) {
            this.FullBackupStatus = new String(source.FullBackupStatus);
        }
        if (source.IncrementBackupStatus != null) {
            this.IncrementBackupStatus = new String(source.IncrementBackupStatus);
        }
        if (source.LastBackupTime != null) {
            this.LastBackupTime = new String(source.LastBackupTime);
        }
        if (source.NextBackupTime != null) {
            this.NextBackupTime = new String(source.NextBackupTime);
        }
        if (source.LastRestoreTime != null) {
            this.LastRestoreTime = new String(source.LastRestoreTime);
        }
        if (source.LastRestoreStatus != null) {
            this.LastRestoreStatus = new String(source.LastRestoreStatus);
        }
        if (source.CurrentBackupJobStatus != null) {
            this.CurrentBackupJobStatus = new String(source.CurrentBackupJobStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullBackupStatus", this.FullBackupStatus);
        this.setParamSimple(map, prefix + "IncrementBackupStatus", this.IncrementBackupStatus);
        this.setParamSimple(map, prefix + "LastBackupTime", this.LastBackupTime);
        this.setParamSimple(map, prefix + "NextBackupTime", this.NextBackupTime);
        this.setParamSimple(map, prefix + "LastRestoreTime", this.LastRestoreTime);
        this.setParamSimple(map, prefix + "LastRestoreStatus", this.LastRestoreStatus);
        this.setParamSimple(map, prefix + "CurrentBackupJobStatus", this.CurrentBackupJobStatus);

    }
}

