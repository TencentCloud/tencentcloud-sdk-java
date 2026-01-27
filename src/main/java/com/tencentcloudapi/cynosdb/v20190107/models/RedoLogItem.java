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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedoLogItem extends AbstractModel {

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 备份时间
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * redoLogId
    */
    @SerializedName("RedoLogId")
    @Expose
    private Long RedoLogId;

    /**
    * 跨地域信息
    */
    @SerializedName("RedoCrossRegions")
    @Expose
    private BackupRegionAndIds [] RedoCrossRegions;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小 
     * @return FileSize 文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 备份时间 
     * @return BackupTime 备份时间
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间
     * @param BackupTime 备份时间
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get redoLogId 
     * @return RedoLogId redoLogId
     */
    public Long getRedoLogId() {
        return this.RedoLogId;
    }

    /**
     * Set redoLogId
     * @param RedoLogId redoLogId
     */
    public void setRedoLogId(Long RedoLogId) {
        this.RedoLogId = RedoLogId;
    }

    /**
     * Get 跨地域信息 
     * @return RedoCrossRegions 跨地域信息
     */
    public BackupRegionAndIds [] getRedoCrossRegions() {
        return this.RedoCrossRegions;
    }

    /**
     * Set 跨地域信息
     * @param RedoCrossRegions 跨地域信息
     */
    public void setRedoCrossRegions(BackupRegionAndIds [] RedoCrossRegions) {
        this.RedoCrossRegions = RedoCrossRegions;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 完成时间 
     * @return FinishTime 完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 完成时间
     * @param FinishTime 完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public RedoLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedoLogItem(RedoLogItem source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.RedoLogId != null) {
            this.RedoLogId = new Long(source.RedoLogId);
        }
        if (source.RedoCrossRegions != null) {
            this.RedoCrossRegions = new BackupRegionAndIds[source.RedoCrossRegions.length];
            for (int i = 0; i < source.RedoCrossRegions.length; i++) {
                this.RedoCrossRegions[i] = new BackupRegionAndIds(source.RedoCrossRegions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "RedoLogId", this.RedoLogId);
        this.setParamArrayObj(map, prefix + "RedoCrossRegions.", this.RedoCrossRegions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

