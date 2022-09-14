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
    * 快照文件ID，已废弃，请使用BackupId
    */
    @SerializedName("SnapshotId")
    @Expose
    private Long SnapshotId;

    /**
    * 备份文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 备份文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 备份开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 备份类型：snapshot，快照备份；logic，逻辑备份
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
    * 备份ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 快照类型，可选值：full，全量；increment，增量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapShotType")
    @Expose
    private String SnapShotType;

    /**
    * 备份文件备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get 快照文件ID，已废弃，请使用BackupId 
     * @return SnapshotId 快照文件ID，已废弃，请使用BackupId
     */
    public Long getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照文件ID，已废弃，请使用BackupId
     * @param SnapshotId 快照文件ID，已废弃，请使用BackupId
     */
    public void setSnapshotId(Long SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 备份文件名 
     * @return FileName 备份文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 备份文件名
     * @param FileName 备份文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 备份文件大小 
     * @return FileSize 备份文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 备份文件大小
     * @param FileSize 备份文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 备份开始时间 
     * @return StartTime 备份开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间
     * @param StartTime 备份开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份完成时间 
     * @return FinishTime 备份完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 备份完成时间
     * @param FinishTime 备份完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 备份类型：snapshot，快照备份；logic，逻辑备份 
     * @return BackupType 备份类型：snapshot，快照备份；logic，逻辑备份
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型：snapshot，快照备份；logic，逻辑备份
     * @param BackupType 备份类型：snapshot，快照备份；logic，逻辑备份
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

    /**
     * Get 备份ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupId 备份ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupId 备份ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 快照类型，可选值：full，全量；increment，增量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapShotType 快照类型，可选值：full，全量；increment，增量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapShotType() {
        return this.SnapShotType;
    }

    /**
     * Set 快照类型，可选值：full，全量；increment，增量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapShotType 快照类型，可选值：full，全量；increment，增量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapShotType(String SnapShotType) {
        this.SnapShotType = SnapShotType;
    }

    /**
     * Get 备份文件备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupName 备份文件备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份文件备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupName 备份文件备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
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
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.SnapShotType != null) {
            this.SnapShotType = new String(source.SnapShotType);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
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
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "SnapShotType", this.SnapShotType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

