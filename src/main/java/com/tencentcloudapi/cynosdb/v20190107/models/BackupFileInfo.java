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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFileInfo extends AbstractModel{

    /**
    * 快照文件ID，用于回滚
    */
    @SerializedName("SnapshotId")
    @Expose
    private Long SnapshotId;

    /**
    * 快照文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 快照文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 快照备份开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 快照备份完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 备份类型：snapshot，快照备份；timepoint，时间点备份
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份方式：auto，自动备份；manual，手动备份
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * 备份文件时间
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
     * Get 快照文件ID，用于回滚 
     * @return SnapshotId 快照文件ID，用于回滚
     */
    public Long getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照文件ID，用于回滚
     * @param SnapshotId 快照文件ID，用于回滚
     */
    public void setSnapshotId(Long SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 快照文件名 
     * @return FileName 快照文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 快照文件名
     * @param FileName 快照文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 快照文件大小 
     * @return FileSize 快照文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 快照文件大小
     * @param FileSize 快照文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 快照备份开始时间 
     * @return StartTime 快照备份开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 快照备份开始时间
     * @param StartTime 快照备份开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 快照备份完成时间 
     * @return FinishTime 快照备份完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 快照备份完成时间
     * @param FinishTime 快照备份完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 备份类型：snapshot，快照备份；timepoint，时间点备份 
     * @return BackupType 备份类型：snapshot，快照备份；timepoint，时间点备份
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型：snapshot，快照备份；timepoint，时间点备份
     * @param BackupType 备份类型：snapshot，快照备份；timepoint，时间点备份
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份方式：auto，自动备份；manual，手动备份 
     * @return BackupMethod 备份方式：auto，自动备份；manual，手动备份
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式：auto，自动备份；manual，手动备份
     * @param BackupMethod 备份方式：auto，自动备份；manual，手动备份
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中 
     * @return BackupStatus 备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set 备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中
     * @param BackupStatus 备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get 备份文件时间 
     * @return SnapshotTime 备份文件时间
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set 备份文件时间
     * @param SnapshotTime 备份文件时间
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    public BackupFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFileInfo(BackupFileInfo source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new Long(source.SnapshotId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);

    }
}

