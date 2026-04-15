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

public class ArchiveLogModel extends AbstractModel {

    /**
    * 归档日志ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArchiveLogId")
    @Expose
    private Long ArchiveLogId;

    /**
    * 备份耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupDuration")
    @Expose
    private Long BackupDuration;

    /**
    * 备份集状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 过期时间
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
    * 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 归档日志ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArchiveLogId 归档日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getArchiveLogId() {
        return this.ArchiveLogId;
    }

    /**
     * Set 归档日志ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArchiveLogId 归档日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchiveLogId(Long ArchiveLogId) {
        this.ArchiveLogId = ArchiveLogId;
    }

    /**
     * Get 备份耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupDuration 备份耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupDuration() {
        return this.BackupDuration;
    }

    /**
     * Set 备份耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupDuration 备份耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupDuration(Long BackupDuration) {
        this.BackupDuration = BackupDuration;
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
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 过期时间
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

    public ArchiveLogModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArchiveLogModel(ArchiveLogModel source) {
        if (source.ArchiveLogId != null) {
            this.ArchiveLogId = new Long(source.ArchiveLogId);
        }
        if (source.BackupDuration != null) {
            this.BackupDuration = new Long(source.BackupDuration);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArchiveLogId", this.ArchiveLogId);
        this.setParamSimple(map, prefix + "BackupDuration", this.BackupDuration);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

