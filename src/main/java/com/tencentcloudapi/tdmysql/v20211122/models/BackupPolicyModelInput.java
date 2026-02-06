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

public class BackupPolicyModelInput extends AbstractModel {

    /**
    * <p>备份结束时间</p>
    */
    @SerializedName("BackupEndTime")
    @Expose
    private String BackupEndTime;

    /**
    * <p>备份方式  physical 物理备份 snapshot 快照备份</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>备份开始时间</p>
    */
    @SerializedName("BackupStartTime")
    @Expose
    private String BackupStartTime;

    /**
    * <p>是否开启全量备份</p>
    */
    @SerializedName("EnableFull")
    @Expose
    private Long EnableFull;

    /**
    * <p>是否开启日志备份</p>
    */
    @SerializedName("EnableLog")
    @Expose
    private Long EnableLog;

    /**
    * <p>全备保留时间,目前只能设置7天</p>
    */
    @SerializedName("FullRetentionPeriod")
    @Expose
    private Long FullRetentionPeriod;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志保留天数，目前只能设置保留7天</p>
    */
    @SerializedName("LogRetentionPeriod")
    @Expose
    private Long LogRetentionPeriod;

    /**
    * <p>一周的哪几天进行备份</p>
    */
    @SerializedName("PeriodTime")
    @Expose
    private String PeriodTime;

    /**
    * <p>存储类型:COS,SNAPSHOT</p>枚举值：<ul><li> COS： COS存储</li><li> SNAPSHOT： 云盘快照</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>备份结束时间</p> 
     * @return BackupEndTime <p>备份结束时间</p>
     */
    public String getBackupEndTime() {
        return this.BackupEndTime;
    }

    /**
     * Set <p>备份结束时间</p>
     * @param BackupEndTime <p>备份结束时间</p>
     */
    public void setBackupEndTime(String BackupEndTime) {
        this.BackupEndTime = BackupEndTime;
    }

    /**
     * Get <p>备份方式  physical 物理备份 snapshot 快照备份</p> 
     * @return BackupMethod <p>备份方式  physical 物理备份 snapshot 快照备份</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式  physical 物理备份 snapshot 快照备份</p>
     * @param BackupMethod <p>备份方式  physical 物理备份 snapshot 快照备份</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份开始时间</p> 
     * @return BackupStartTime <p>备份开始时间</p>
     */
    public String getBackupStartTime() {
        return this.BackupStartTime;
    }

    /**
     * Set <p>备份开始时间</p>
     * @param BackupStartTime <p>备份开始时间</p>
     */
    public void setBackupStartTime(String BackupStartTime) {
        this.BackupStartTime = BackupStartTime;
    }

    /**
     * Get <p>是否开启全量备份</p> 
     * @return EnableFull <p>是否开启全量备份</p>
     */
    public Long getEnableFull() {
        return this.EnableFull;
    }

    /**
     * Set <p>是否开启全量备份</p>
     * @param EnableFull <p>是否开启全量备份</p>
     */
    public void setEnableFull(Long EnableFull) {
        this.EnableFull = EnableFull;
    }

    /**
     * Get <p>是否开启日志备份</p> 
     * @return EnableLog <p>是否开启日志备份</p>
     */
    public Long getEnableLog() {
        return this.EnableLog;
    }

    /**
     * Set <p>是否开启日志备份</p>
     * @param EnableLog <p>是否开启日志备份</p>
     */
    public void setEnableLog(Long EnableLog) {
        this.EnableLog = EnableLog;
    }

    /**
     * Get <p>全备保留时间,目前只能设置7天</p> 
     * @return FullRetentionPeriod <p>全备保留时间,目前只能设置7天</p>
     */
    public Long getFullRetentionPeriod() {
        return this.FullRetentionPeriod;
    }

    /**
     * Set <p>全备保留时间,目前只能设置7天</p>
     * @param FullRetentionPeriod <p>全备保留时间,目前只能设置7天</p>
     */
    public void setFullRetentionPeriod(Long FullRetentionPeriod) {
        this.FullRetentionPeriod = FullRetentionPeriod;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志保留天数，目前只能设置保留7天</p> 
     * @return LogRetentionPeriod <p>日志保留天数，目前只能设置保留7天</p>
     */
    public Long getLogRetentionPeriod() {
        return this.LogRetentionPeriod;
    }

    /**
     * Set <p>日志保留天数，目前只能设置保留7天</p>
     * @param LogRetentionPeriod <p>日志保留天数，目前只能设置保留7天</p>
     */
    public void setLogRetentionPeriod(Long LogRetentionPeriod) {
        this.LogRetentionPeriod = LogRetentionPeriod;
    }

    /**
     * Get <p>一周的哪几天进行备份</p> 
     * @return PeriodTime <p>一周的哪几天进行备份</p>
     */
    public String getPeriodTime() {
        return this.PeriodTime;
    }

    /**
     * Set <p>一周的哪几天进行备份</p>
     * @param PeriodTime <p>一周的哪几天进行备份</p>
     */
    public void setPeriodTime(String PeriodTime) {
        this.PeriodTime = PeriodTime;
    }

    /**
     * Get <p>存储类型:COS,SNAPSHOT</p>枚举值：<ul><li> COS： COS存储</li><li> SNAPSHOT： 云盘快照</li></ul> 
     * @return StorageType <p>存储类型:COS,SNAPSHOT</p>枚举值：<ul><li> COS： COS存储</li><li> SNAPSHOT： 云盘快照</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型:COS,SNAPSHOT</p>枚举值：<ul><li> COS： COS存储</li><li> SNAPSHOT： 云盘快照</li></ul>
     * @param StorageType <p>存储类型:COS,SNAPSHOT</p>枚举值：<ul><li> COS： COS存储</li><li> SNAPSHOT： 云盘快照</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public BackupPolicyModelInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPolicyModelInput(BackupPolicyModelInput source) {
        if (source.BackupEndTime != null) {
            this.BackupEndTime = new String(source.BackupEndTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStartTime != null) {
            this.BackupStartTime = new String(source.BackupStartTime);
        }
        if (source.EnableFull != null) {
            this.EnableFull = new Long(source.EnableFull);
        }
        if (source.EnableLog != null) {
            this.EnableLog = new Long(source.EnableLog);
        }
        if (source.FullRetentionPeriod != null) {
            this.FullRetentionPeriod = new Long(source.FullRetentionPeriod);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogRetentionPeriod != null) {
            this.LogRetentionPeriod = new Long(source.LogRetentionPeriod);
        }
        if (source.PeriodTime != null) {
            this.PeriodTime = new String(source.PeriodTime);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupEndTime", this.BackupEndTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStartTime", this.BackupStartTime);
        this.setParamSimple(map, prefix + "EnableFull", this.EnableFull);
        this.setParamSimple(map, prefix + "EnableLog", this.EnableLog);
        this.setParamSimple(map, prefix + "FullRetentionPeriod", this.FullRetentionPeriod);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogRetentionPeriod", this.LogRetentionPeriod);
        this.setParamSimple(map, prefix + "PeriodTime", this.PeriodTime);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

