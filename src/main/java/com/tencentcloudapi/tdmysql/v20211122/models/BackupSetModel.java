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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupSetModel extends AbstractModel {

    /**
    * 备份集耗时，单位 sec
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupDuration")
    @Expose
    private Long BackupDuration;

    /**
    * 备份方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 备份备注名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 备份集进度百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupProgress")
    @Expose
    private Float BackupProgress;

    /**
    * 备份集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupSetId")
    @Expose
    private Long BackupSetId;

    /**
    * 备份集状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * 备份集类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 事务commit结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTrxTime")
    @Expose
    private String EndTrxTime;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 备份过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 备份文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 备份集文件大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份触发，0 - autobackup, 1 - manual
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackup")
    @Expose
    private Long ManualBackup;

    /**
    * 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 备份集耗时，单位 sec
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupDuration 备份集耗时，单位 sec
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupDuration() {
        return this.BackupDuration;
    }

    /**
     * Set 备份集耗时，单位 sec
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupDuration 备份集耗时，单位 sec
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupDuration(Long BackupDuration) {
        this.BackupDuration = BackupDuration;
    }

    /**
     * Get 备份方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupMethod 备份方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupMethod 备份方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份备注名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupName 备份备注名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份备注名
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupName 备份备注名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 备份集进度百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupProgress 备份集进度百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBackupProgress() {
        return this.BackupProgress;
    }

    /**
     * Set 备份集进度百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupProgress 备份集进度百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupProgress(Float BackupProgress) {
        this.BackupProgress = BackupProgress;
    }

    /**
     * Get 备份集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupSetId 备份集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set 备份集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupSetId 备份集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupSetId(Long BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get 备份集状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStatus 备份集状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set 备份集状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStatus 备份集状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get 备份集类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupType 备份集类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份集类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupType 备份集类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 实例版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBVersion 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBVersion 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事务commit结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTrxTime 事务commit结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTrxTime() {
        return this.EndTrxTime;
    }

    /**
     * Set 事务commit结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTrxTime 事务commit结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTrxTime(String EndTrxTime) {
        this.EndTrxTime = EndTrxTime;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 备份过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 备份过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 备份过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 备份过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 备份文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 备份文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 备份文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 备份文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 备份集文件大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 备份集文件大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 备份集文件大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 备份集文件大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份触发，0 - autobackup, 1 - manual
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackup 备份触发，0 - autobackup, 1 - manual
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getManualBackup() {
        return this.ManualBackup;
    }

    /**
     * Set 备份触发，0 - autobackup, 1 - manual
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackup 备份触发，0 - autobackup, 1 - manual
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackup(Long ManualBackup) {
        this.ManualBackup = ManualBackup;
    }

    /**
     * Get 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public BackupSetModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSetModel(BackupSetModel source) {
        if (source.BackupDuration != null) {
            this.BackupDuration = new Long(source.BackupDuration);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupProgress != null) {
            this.BackupProgress = new Float(source.BackupProgress);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new Long(source.BackupSetId);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EndTrxTime != null) {
            this.EndTrxTime = new String(source.EndTrxTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ManualBackup != null) {
            this.ManualBackup = new Long(source.ManualBackup);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupDuration", this.BackupDuration);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupProgress", this.BackupProgress);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EndTrxTime", this.EndTrxTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ManualBackup", this.ManualBackup);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

