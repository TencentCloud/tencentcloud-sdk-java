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

public class BackupInfo extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>备份方式。</p><ul><li>0：自动备份。</li><li>1：手动备份。</li></ul>
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * <p>备份文件名称。</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * <p>备份任务备注信息。</p>
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * <p>备份文件大小，单位：KB。</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>备份开始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>备份结束时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>备份状态。</p><ul><li>1：备份中。</li><li>2：备份成功。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明:</strong></li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * <p>备份记录 ID。</p>
    */
    @SerializedName("BackId")
    @Expose
    private Long BackId;

    /**
    * <p>备份删除时间。</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * <p>异地备份地域。</p>
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
    * <p>备份支持的回档时间。</p>
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>备份方式。</p><ul><li>0：自动备份。</li><li>1：手动备份。</li></ul> 
     * @return BackupType <p>备份方式。</p><ul><li>0：自动备份。</li><li>1：手动备份。</li></ul>
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>备份方式。</p><ul><li>0：自动备份。</li><li>1：手动备份。</li></ul>
     * @param BackupType <p>备份方式。</p><ul><li>0：自动备份。</li><li>1：手动备份。</li></ul>
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>备份文件名称。</p> 
     * @return BackupName <p>备份文件名称。</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>备份文件名称。</p>
     * @param BackupName <p>备份文件名称。</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get <p>备份任务备注信息。</p> 
     * @return BackupDesc <p>备份任务备注信息。</p>
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set <p>备份任务备注信息。</p>
     * @param BackupDesc <p>备份任务备注信息。</p>
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get <p>备份文件大小，单位：KB。</p> 
     * @return BackupSize <p>备份文件大小，单位：KB。</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>备份文件大小，单位：KB。</p>
     * @param BackupSize <p>备份文件大小，单位：KB。</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>备份开始时间。</p> 
     * @return StartTime <p>备份开始时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>备份开始时间。</p>
     * @param StartTime <p>备份开始时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>备份结束时间。</p> 
     * @return EndTime <p>备份结束时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>备份结束时间。</p>
     * @param EndTime <p>备份结束时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>备份状态。</p><ul><li>1：备份中。</li><li>2：备份成功。</li></ul> 
     * @return Status <p>备份状态。</p><ul><li>1：备份中。</li><li>2：备份成功。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份状态。</p><ul><li>1：备份中。</li><li>2：备份成功。</li></ul>
     * @param Status <p>备份状态。</p><ul><li>1：备份中。</li><li>2：备份成功。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明:</strong></li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul> 
     * @return BackupMethod <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明:</strong></li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明:</strong></li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     * @param BackupMethod <p>备份方式。</p><ul><li>0：逻辑备份。</li><li>1：物理备份。</li><li>3：快照备份。<br><strong>说明:</strong></li><li>通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。</li><li>实例开通存储加密，则备份方式不能为物理备份。</li></ul>
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份记录 ID。</p> 
     * @return BackId <p>备份记录 ID。</p>
     */
    public Long getBackId() {
        return this.BackId;
    }

    /**
     * Set <p>备份记录 ID。</p>
     * @param BackId <p>备份记录 ID。</p>
     */
    public void setBackId(Long BackId) {
        this.BackId = BackId;
    }

    /**
     * Get <p>备份删除时间。</p> 
     * @return DeleteTime <p>备份删除时间。</p>
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>备份删除时间。</p>
     * @param DeleteTime <p>备份删除时间。</p>
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>异地备份地域。</p> 
     * @return BackupRegion <p>异地备份地域。</p>
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set <p>异地备份地域。</p>
     * @param BackupRegion <p>异地备份地域。</p>
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    /**
     * Get <p>备份支持的回档时间。</p> 
     * @return RestoreTime <p>备份支持的回档时间。</p>
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set <p>备份支持的回档时间。</p>
     * @param RestoreTime <p>备份支持的回档时间。</p>
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupDesc != null) {
            this.BackupDesc = new String(source.BackupDesc);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackId != null) {
            this.BackId = new Long(source.BackId);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupDesc", this.BackupDesc);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackId", this.BackId);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);

    }
}

