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
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份方式，0-自动备份，1-手动备份
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 备份名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 备份备注
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * 备份文件大小，单位KB
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 备份开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份状态，1-备份中，2-备份成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备份方法，0-逻辑备份，1-物理备份
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 备份记录id
    */
    @SerializedName("BackId")
    @Expose
    private Long BackId;

    /**
    * 备份删除时间
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * 异地备份地域
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份方式，0-自动备份，1-手动备份 
     * @return BackupType 备份方式，0-自动备份，1-手动备份
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份方式，0-自动备份，1-手动备份
     * @param BackupType 备份方式，0-自动备份，1-手动备份
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份名称 
     * @return BackupName 备份名称
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份名称
     * @param BackupName 备份名称
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 备份备注 
     * @return BackupDesc 备份备注
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set 备份备注
     * @param BackupDesc 备份备注
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get 备份文件大小，单位KB 
     * @return BackupSize 备份文件大小，单位KB
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 备份文件大小，单位KB
     * @param BackupSize 备份文件大小，单位KB
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
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
     * Get 备份结束时间 
     * @return EndTime 备份结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间
     * @param EndTime 备份结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份状态，1-备份中，2-备份成功 
     * @return Status 备份状态，1-备份中，2-备份成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份状态，1-备份中，2-备份成功
     * @param Status 备份状态，1-备份中，2-备份成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备份方法，0-逻辑备份，1-物理备份 
     * @return BackupMethod 备份方法，0-逻辑备份，1-物理备份
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方法，0-逻辑备份，1-物理备份
     * @param BackupMethod 备份方法，0-逻辑备份，1-物理备份
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份记录id 
     * @return BackId 备份记录id
     */
    public Long getBackId() {
        return this.BackId;
    }

    /**
     * Set 备份记录id
     * @param BackId 备份记录id
     */
    public void setBackId(Long BackId) {
        this.BackId = BackId;
    }

    /**
     * Get 备份删除时间 
     * @return DeleteTime 备份删除时间
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 备份删除时间
     * @param DeleteTime 备份删除时间
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 异地备份地域 
     * @return BackupRegion 异地备份地域
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set 异地备份地域
     * @param BackupRegion 异地备份地域
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
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

    }
}

