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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPlan extends AbstractModel {

    /**
    * 备份周期
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String BackupPeriod;

    /**
    * 数据备份保留时长
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * 开始备份的最早时间
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * 开始备份的最晚时间
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * 备份计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 备份计划自定义名称。
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 日志备份保留时长。
    */
    @SerializedName("LogBackupRetentionPeriod")
    @Expose
    private Long LogBackupRetentionPeriod;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最近一次的修改时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 备份计划类型。系统默认创建的为default，自定义的为custom。
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * 备份周期类型。当前支持week、month。
    */
    @SerializedName("BackupPeriodType")
    @Expose
    private String BackupPeriodType;

    /**
     * Get 备份周期 
     * @return BackupPeriod 备份周期
     */
    public String getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set 备份周期
     * @param BackupPeriod 备份周期
     */
    public void setBackupPeriod(String BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get 数据备份保留时长 
     * @return BaseBackupRetentionPeriod 数据备份保留时长
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set 数据备份保留时长
     * @param BaseBackupRetentionPeriod 数据备份保留时长
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get 开始备份的最早时间 
     * @return MinBackupStartTime 开始备份的最早时间
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set 开始备份的最早时间
     * @param MinBackupStartTime 开始备份的最早时间
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get 开始备份的最晚时间 
     * @return MaxBackupStartTime 开始备份的最晚时间
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set 开始备份的最晚时间
     * @param MaxBackupStartTime 开始备份的最晚时间
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get 备份计划ID 
     * @return PlanId 备份计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 备份计划ID
     * @param PlanId 备份计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 备份计划自定义名称。 
     * @return PlanName 备份计划自定义名称。
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 备份计划自定义名称。
     * @param PlanName 备份计划自定义名称。
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 日志备份保留时长。 
     * @return LogBackupRetentionPeriod 日志备份保留时长。
     */
    public Long getLogBackupRetentionPeriod() {
        return this.LogBackupRetentionPeriod;
    }

    /**
     * Set 日志备份保留时长。
     * @param LogBackupRetentionPeriod 日志备份保留时长。
     */
    public void setLogBackupRetentionPeriod(Long LogBackupRetentionPeriod) {
        this.LogBackupRetentionPeriod = LogBackupRetentionPeriod;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最近一次的修改时间。 
     * @return UpdatedTime 最近一次的修改时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 最近一次的修改时间。
     * @param UpdatedTime 最近一次的修改时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 备份计划类型。系统默认创建的为default，自定义的为custom。 
     * @return PlanType 备份计划类型。系统默认创建的为default，自定义的为custom。
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 备份计划类型。系统默认创建的为default，自定义的为custom。
     * @param PlanType 备份计划类型。系统默认创建的为default，自定义的为custom。
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 备份周期类型。当前支持week、month。 
     * @return BackupPeriodType 备份周期类型。当前支持week、month。
     */
    public String getBackupPeriodType() {
        return this.BackupPeriodType;
    }

    /**
     * Set 备份周期类型。当前支持week、month。
     * @param BackupPeriodType 备份周期类型。当前支持week、month。
     */
    public void setBackupPeriodType(String BackupPeriodType) {
        this.BackupPeriodType = BackupPeriodType;
    }

    public BackupPlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPlan(BackupPlan source) {
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new String(source.BackupPeriod);
        }
        if (source.BaseBackupRetentionPeriod != null) {
            this.BaseBackupRetentionPeriod = new Long(source.BaseBackupRetentionPeriod);
        }
        if (source.MinBackupStartTime != null) {
            this.MinBackupStartTime = new String(source.MinBackupStartTime);
        }
        if (source.MaxBackupStartTime != null) {
            this.MaxBackupStartTime = new String(source.MaxBackupStartTime);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.LogBackupRetentionPeriod != null) {
            this.LogBackupRetentionPeriod = new Long(source.LogBackupRetentionPeriod);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.BackupPeriodType != null) {
            this.BackupPeriodType = new String(source.BackupPeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPeriod", this.BackupPeriod);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "LogBackupRetentionPeriod", this.LogBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "BackupPeriodType", this.BackupPeriodType);

    }
}

