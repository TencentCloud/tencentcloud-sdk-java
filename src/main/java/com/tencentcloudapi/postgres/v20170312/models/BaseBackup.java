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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseBackup extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 备份文件唯一标识。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 备份文件名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备份方式：物理备份、逻辑备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 备份模式：自动备份、手动备份。
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
    * 备份任务状态。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 备份集大小，单位bytes。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 备份的开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份的结束时间。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 备份的过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 实例ID。 
     * @return DBInstanceId 实例ID。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。
     * @param DBInstanceId 实例ID。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 备份文件唯一标识。 
     * @return Id 备份文件唯一标识。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 备份文件唯一标识。
     * @param Id 备份文件唯一标识。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 备份文件名称。 
     * @return Name 备份文件名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 备份文件名称。
     * @param Name 备份文件名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 备份方式：物理备份、逻辑备份。 
     * @return BackupMethod 备份方式：物理备份、逻辑备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式：物理备份、逻辑备份。
     * @param BackupMethod 备份方式：物理备份、逻辑备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份模式：自动备份、手动备份。 
     * @return BackupMode 备份模式：自动备份、手动备份。
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set 备份模式：自动备份、手动备份。
     * @param BackupMode 备份模式：自动备份、手动备份。
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    /**
     * Get 备份任务状态。 
     * @return State 备份任务状态。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 备份任务状态。
     * @param State 备份任务状态。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 备份集大小，单位bytes。 
     * @return Size 备份集大小，单位bytes。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 备份集大小，单位bytes。
     * @param Size 备份集大小，单位bytes。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 备份的开始时间。 
     * @return StartTime 备份的开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份的开始时间。
     * @param StartTime 备份的开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份的结束时间。 
     * @return FinishTime 备份的结束时间。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 备份的结束时间。
     * @param FinishTime 备份的结束时间。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 备份的过期时间。 
     * @return ExpireTime 备份的过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 备份的过期时间。
     * @param ExpireTime 备份的过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public BaseBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseBackup(BaseBackup source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupMode != null) {
            this.BackupMode = new String(source.BackupMode);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupMode", this.BackupMode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

