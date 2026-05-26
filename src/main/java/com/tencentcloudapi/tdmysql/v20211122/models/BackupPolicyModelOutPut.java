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

public class BackupPolicyModelOutPut extends AbstractModel {

    /**
    * <p>备份结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupEndTime")
    @Expose
    private String BackupEndTime;

    /**
    * <p>备份方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>备份开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStartTime")
    @Expose
    private String BackupStartTime;

    /**
    * <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>是否开启全量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableFull")
    @Expose
    private Long EnableFull;

    /**
    * <p>是否开启日志备份</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableLog")
    @Expose
    private Long EnableLog;

    /**
    * <p>预计下次备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectedNextBackupPeriod")
    @Expose
    private String ExpectedNextBackupPeriod;

    /**
    * <p>全备保留时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullRetentionPeriod")
    @Expose
    private Long FullRetentionPeriod;

    /**
    * <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志保留天数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogRetentionPeriod")
    @Expose
    private Long LogRetentionPeriod;

    /**
    * <p>一周的哪几天进行备份</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodTime")
    @Expose
    private String PeriodTime;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>备份周期类型  0:Weekly</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodType")
    @Expose
    private Long PeriodType;

    /**
     * Get <p>备份结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupEndTime <p>备份结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupEndTime() {
        return this.BackupEndTime;
    }

    /**
     * Set <p>备份结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupEndTime <p>备份结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupEndTime(String BackupEndTime) {
        this.BackupEndTime = BackupEndTime;
    }

    /**
     * Get <p>备份方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupMethod <p>备份方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupMethod <p>备份方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStartTime <p>备份开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupStartTime() {
        return this.BackupStartTime;
    }

    /**
     * Set <p>备份开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStartTime <p>备份开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStartTime(String BackupStartTime) {
        this.BackupStartTime = BackupStartTime;
    }

    /**
     * Get <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBType <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBType <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBVersion <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBVersion <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>是否开启全量备份</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableFull <p>是否开启全量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableFull() {
        return this.EnableFull;
    }

    /**
     * Set <p>是否开启全量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableFull <p>是否开启全量备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableFull(Long EnableFull) {
        this.EnableFull = EnableFull;
    }

    /**
     * Get <p>是否开启日志备份</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableLog <p>是否开启日志备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableLog() {
        return this.EnableLog;
    }

    /**
     * Set <p>是否开启日志备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableLog <p>是否开启日志备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableLog(Long EnableLog) {
        this.EnableLog = EnableLog;
    }

    /**
     * Get <p>预计下次备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectedNextBackupPeriod <p>预计下次备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpectedNextBackupPeriod() {
        return this.ExpectedNextBackupPeriod;
    }

    /**
     * Set <p>预计下次备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectedNextBackupPeriod <p>预计下次备份时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectedNextBackupPeriod(String ExpectedNextBackupPeriod) {
        this.ExpectedNextBackupPeriod = ExpectedNextBackupPeriod;
    }

    /**
     * Get <p>全备保留时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullRetentionPeriod <p>全备保留时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFullRetentionPeriod() {
        return this.FullRetentionPeriod;
    }

    /**
     * Set <p>全备保留时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullRetentionPeriod <p>全备保留时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullRetentionPeriod(Long FullRetentionPeriod) {
        this.FullRetentionPeriod = FullRetentionPeriod;
    }

    /**
     * Get <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志保留天数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogRetentionPeriod <p>日志保留天数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogRetentionPeriod() {
        return this.LogRetentionPeriod;
    }

    /**
     * Set <p>日志保留天数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogRetentionPeriod <p>日志保留天数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogRetentionPeriod(Long LogRetentionPeriod) {
        this.LogRetentionPeriod = LogRetentionPeriod;
    }

    /**
     * Get <p>一周的哪几天进行备份</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodTime <p>一周的哪几天进行备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodTime() {
        return this.PeriodTime;
    }

    /**
     * Set <p>一周的哪几天进行备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodTime <p>一周的哪几天进行备份</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodTime(String PeriodTime) {
        this.PeriodTime = PeriodTime;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>备份周期类型  0:Weekly</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodType <p>备份周期类型  0:Weekly</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>备份周期类型  0:Weekly</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodType <p>备份周期类型  0:Weekly</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodType(Long PeriodType) {
        this.PeriodType = PeriodType;
    }

    public BackupPolicyModelOutPut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPolicyModelOutPut(BackupPolicyModelOutPut source) {
        if (source.BackupEndTime != null) {
            this.BackupEndTime = new String(source.BackupEndTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStartTime != null) {
            this.BackupStartTime = new String(source.BackupStartTime);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.EnableFull != null) {
            this.EnableFull = new Long(source.EnableFull);
        }
        if (source.EnableLog != null) {
            this.EnableLog = new Long(source.EnableLog);
        }
        if (source.ExpectedNextBackupPeriod != null) {
            this.ExpectedNextBackupPeriod = new String(source.ExpectedNextBackupPeriod);
        }
        if (source.FullRetentionPeriod != null) {
            this.FullRetentionPeriod = new Long(source.FullRetentionPeriod);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new Long(source.PeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupEndTime", this.BackupEndTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStartTime", this.BackupStartTime);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "EnableFull", this.EnableFull);
        this.setParamSimple(map, prefix + "EnableLog", this.EnableLog);
        this.setParamSimple(map, prefix + "ExpectedNextBackupPeriod", this.ExpectedNextBackupPeriod);
        this.setParamSimple(map, prefix + "FullRetentionPeriod", this.FullRetentionPeriod);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogRetentionPeriod", this.LogRetentionPeriod);
        this.setParamSimple(map, prefix + "PeriodTime", this.PeriodTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);

    }
}

