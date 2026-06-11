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

public class ModifyBackupPlanRequest extends AbstractModel {

    /**
    * <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>实例最早开始备份时间</p>
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * <p>实例最晚开始备份时间</p>
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * <p>实例备份保留时长，取值范围为7-1830，单位是天</p>
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * <p>实例备份周期，若是星期维度，格式为小写星期英文单词，且至少设置两天备份；若是按月维度，格式为数字字符，如[&quot;1&quot;,&quot;2&quot;]。</p>
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String [] BackupPeriod;

    /**
    * <p>实例日志备份保留时长，取值范围为7-1830，单位是天</p>
    */
    @SerializedName("LogBackupRetentionPeriod")
    @Expose
    private Long LogBackupRetentionPeriod;

    /**
    * <p>备份计划ID，用于指明要修改哪个备份计划，不传则是修改默认备份计划。</p>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>要修改的备份计划名称。</p>
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * <p>备份方式</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
     * Get <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>实例最早开始备份时间</p> 
     * @return MinBackupStartTime <p>实例最早开始备份时间</p>
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set <p>实例最早开始备份时间</p>
     * @param MinBackupStartTime <p>实例最早开始备份时间</p>
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get <p>实例最晚开始备份时间</p> 
     * @return MaxBackupStartTime <p>实例最晚开始备份时间</p>
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set <p>实例最晚开始备份时间</p>
     * @param MaxBackupStartTime <p>实例最晚开始备份时间</p>
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get <p>实例备份保留时长，取值范围为7-1830，单位是天</p> 
     * @return BaseBackupRetentionPeriod <p>实例备份保留时长，取值范围为7-1830，单位是天</p>
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set <p>实例备份保留时长，取值范围为7-1830，单位是天</p>
     * @param BaseBackupRetentionPeriod <p>实例备份保留时长，取值范围为7-1830，单位是天</p>
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get <p>实例备份周期，若是星期维度，格式为小写星期英文单词，且至少设置两天备份；若是按月维度，格式为数字字符，如[&quot;1&quot;,&quot;2&quot;]。</p> 
     * @return BackupPeriod <p>实例备份周期，若是星期维度，格式为小写星期英文单词，且至少设置两天备份；若是按月维度，格式为数字字符，如[&quot;1&quot;,&quot;2&quot;]。</p>
     */
    public String [] getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set <p>实例备份周期，若是星期维度，格式为小写星期英文单词，且至少设置两天备份；若是按月维度，格式为数字字符，如[&quot;1&quot;,&quot;2&quot;]。</p>
     * @param BackupPeriod <p>实例备份周期，若是星期维度，格式为小写星期英文单词，且至少设置两天备份；若是按月维度，格式为数字字符，如[&quot;1&quot;,&quot;2&quot;]。</p>
     */
    public void setBackupPeriod(String [] BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get <p>实例日志备份保留时长，取值范围为7-1830，单位是天</p> 
     * @return LogBackupRetentionPeriod <p>实例日志备份保留时长，取值范围为7-1830，单位是天</p>
     */
    public Long getLogBackupRetentionPeriod() {
        return this.LogBackupRetentionPeriod;
    }

    /**
     * Set <p>实例日志备份保留时长，取值范围为7-1830，单位是天</p>
     * @param LogBackupRetentionPeriod <p>实例日志备份保留时长，取值范围为7-1830，单位是天</p>
     */
    public void setLogBackupRetentionPeriod(Long LogBackupRetentionPeriod) {
        this.LogBackupRetentionPeriod = LogBackupRetentionPeriod;
    }

    /**
     * Get <p>备份计划ID，用于指明要修改哪个备份计划，不传则是修改默认备份计划。</p> 
     * @return PlanId <p>备份计划ID，用于指明要修改哪个备份计划，不传则是修改默认备份计划。</p>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>备份计划ID，用于指明要修改哪个备份计划，不传则是修改默认备份计划。</p>
     * @param PlanId <p>备份计划ID，用于指明要修改哪个备份计划，不传则是修改默认备份计划。</p>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>要修改的备份计划名称。</p> 
     * @return PlanName <p>要修改的备份计划名称。</p>
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set <p>要修改的备份计划名称。</p>
     * @param PlanName <p>要修改的备份计划名称。</p>
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get <p>备份方式</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul> 
     * @return BackupMethod <p>备份方式</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
     * @param BackupMethod <p>备份方式</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>logical： 逻辑备份</li><li>snapshot： 快照备份</li></ul>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    public ModifyBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupPlanRequest(ModifyBackupPlanRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.MinBackupStartTime != null) {
            this.MinBackupStartTime = new String(source.MinBackupStartTime);
        }
        if (source.MaxBackupStartTime != null) {
            this.MaxBackupStartTime = new String(source.MaxBackupStartTime);
        }
        if (source.BaseBackupRetentionPeriod != null) {
            this.BaseBackupRetentionPeriod = new Long(source.BaseBackupRetentionPeriod);
        }
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new String[source.BackupPeriod.length];
            for (int i = 0; i < source.BackupPeriod.length; i++) {
                this.BackupPeriod[i] = new String(source.BackupPeriod[i]);
            }
        }
        if (source.LogBackupRetentionPeriod != null) {
            this.LogBackupRetentionPeriod = new Long(source.LogBackupRetentionPeriod);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);
        this.setParamArraySimple(map, prefix + "BackupPeriod.", this.BackupPeriod);
        this.setParamSimple(map, prefix + "LogBackupRetentionPeriod", this.LogBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);

    }
}

