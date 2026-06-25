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
    * <p>备份周期</p>
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String BackupPeriod;

    /**
    * <p>数据备份保留时长。单位：天</p>
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * <p>开始备份的最早时间</p>
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * <p>开始备份的最晚时间</p>
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * <p>备份类型</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>备份计划ID</p>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>备份计划自定义名称。</p>
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * <p>日志备份保留时长。单位：天</p>
    */
    @SerializedName("LogBackupRetentionPeriod")
    @Expose
    private Long LogBackupRetentionPeriod;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>最近一次的修改时间。</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>备份计划类型。系统默认创建的为default，自定义的为custom。</p>
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * <p>备份周期类型。当前支持week、month。</p>
    */
    @SerializedName("BackupPeriodType")
    @Expose
    private String BackupPeriodType;

    /**
     * Get <p>备份周期</p> 
     * @return BackupPeriod <p>备份周期</p>
     */
    public String getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set <p>备份周期</p>
     * @param BackupPeriod <p>备份周期</p>
     */
    public void setBackupPeriod(String BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get <p>数据备份保留时长。单位：天</p> 
     * @return BaseBackupRetentionPeriod <p>数据备份保留时长。单位：天</p>
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set <p>数据备份保留时长。单位：天</p>
     * @param BaseBackupRetentionPeriod <p>数据备份保留时长。单位：天</p>
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get <p>开始备份的最早时间</p> 
     * @return MinBackupStartTime <p>开始备份的最早时间</p>
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set <p>开始备份的最早时间</p>
     * @param MinBackupStartTime <p>开始备份的最早时间</p>
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get <p>开始备份的最晚时间</p> 
     * @return MaxBackupStartTime <p>开始备份的最晚时间</p>
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set <p>开始备份的最晚时间</p>
     * @param MaxBackupStartTime <p>开始备份的最晚时间</p>
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get <p>备份类型</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul> 
     * @return BackupMethod <p>备份类型</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份类型</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
     * @param BackupMethod <p>备份类型</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份计划ID</p> 
     * @return PlanId <p>备份计划ID</p>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>备份计划ID</p>
     * @param PlanId <p>备份计划ID</p>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>备份计划自定义名称。</p> 
     * @return PlanName <p>备份计划自定义名称。</p>
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set <p>备份计划自定义名称。</p>
     * @param PlanName <p>备份计划自定义名称。</p>
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get <p>日志备份保留时长。单位：天</p> 
     * @return LogBackupRetentionPeriod <p>日志备份保留时长。单位：天</p>
     */
    public Long getLogBackupRetentionPeriod() {
        return this.LogBackupRetentionPeriod;
    }

    /**
     * Set <p>日志备份保留时长。单位：天</p>
     * @param LogBackupRetentionPeriod <p>日志备份保留时长。单位：天</p>
     */
    public void setLogBackupRetentionPeriod(Long LogBackupRetentionPeriod) {
        this.LogBackupRetentionPeriod = LogBackupRetentionPeriod;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>最近一次的修改时间。</p> 
     * @return UpdatedTime <p>最近一次的修改时间。</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>最近一次的修改时间。</p>
     * @param UpdatedTime <p>最近一次的修改时间。</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>备份计划类型。系统默认创建的为default，自定义的为custom。</p> 
     * @return PlanType <p>备份计划类型。系统默认创建的为default，自定义的为custom。</p>
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set <p>备份计划类型。系统默认创建的为default，自定义的为custom。</p>
     * @param PlanType <p>备份计划类型。系统默认创建的为default，自定义的为custom。</p>
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get <p>备份周期类型。当前支持week、month。</p> 
     * @return BackupPeriodType <p>备份周期类型。当前支持week、month。</p>
     */
    public String getBackupPeriodType() {
        return this.BackupPeriodType;
    }

    /**
     * Set <p>备份周期类型。当前支持week、month。</p>
     * @param BackupPeriodType <p>备份周期类型。当前支持week、month。</p>
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
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
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
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "LogBackupRetentionPeriod", this.LogBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "BackupPeriodType", this.BackupPeriodType);

    }
}

