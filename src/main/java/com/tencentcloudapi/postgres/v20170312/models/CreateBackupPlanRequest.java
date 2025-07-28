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

public class CreateBackupPlanRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 备份计划名称。
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 创建的备份计划类型，当前仅支持month创建。
    */
    @SerializedName("BackupPeriodType")
    @Expose
    private String BackupPeriodType;

    /**
    * 备份的日期，示例是每个月的2号开启备份。
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String [] BackupPeriod;

    /**
    * 备份开始时间，不传跟随默认备份计划。
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * 备份结束时间，不传跟随默认计划。
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * 数据备份保留时长，单位：天。取值范围为：[0,30000)
BackupPeriodType为week时默认是7,为month时默认为31。
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
     * Get 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 备份计划名称。 
     * @return PlanName 备份计划名称。
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 备份计划名称。
     * @param PlanName 备份计划名称。
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 创建的备份计划类型，当前仅支持month创建。 
     * @return BackupPeriodType 创建的备份计划类型，当前仅支持month创建。
     */
    public String getBackupPeriodType() {
        return this.BackupPeriodType;
    }

    /**
     * Set 创建的备份计划类型，当前仅支持month创建。
     * @param BackupPeriodType 创建的备份计划类型，当前仅支持month创建。
     */
    public void setBackupPeriodType(String BackupPeriodType) {
        this.BackupPeriodType = BackupPeriodType;
    }

    /**
     * Get 备份的日期，示例是每个月的2号开启备份。 
     * @return BackupPeriod 备份的日期，示例是每个月的2号开启备份。
     */
    public String [] getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set 备份的日期，示例是每个月的2号开启备份。
     * @param BackupPeriod 备份的日期，示例是每个月的2号开启备份。
     */
    public void setBackupPeriod(String [] BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get 备份开始时间，不传跟随默认备份计划。 
     * @return MinBackupStartTime 备份开始时间，不传跟随默认备份计划。
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set 备份开始时间，不传跟随默认备份计划。
     * @param MinBackupStartTime 备份开始时间，不传跟随默认备份计划。
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get 备份结束时间，不传跟随默认计划。 
     * @return MaxBackupStartTime 备份结束时间，不传跟随默认计划。
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set 备份结束时间，不传跟随默认计划。
     * @param MaxBackupStartTime 备份结束时间，不传跟随默认计划。
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get 数据备份保留时长，单位：天。取值范围为：[0,30000)
BackupPeriodType为week时默认是7,为month时默认为31。 
     * @return BaseBackupRetentionPeriod 数据备份保留时长，单位：天。取值范围为：[0,30000)
BackupPeriodType为week时默认是7,为month时默认为31。
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set 数据备份保留时长，单位：天。取值范围为：[0,30000)
BackupPeriodType为week时默认是7,为month时默认为31。
     * @param BaseBackupRetentionPeriod 数据备份保留时长，单位：天。取值范围为：[0,30000)
BackupPeriodType为week时默认是7,为month时默认为31。
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    public CreateBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupPlanRequest(CreateBackupPlanRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.BackupPeriodType != null) {
            this.BackupPeriodType = new String(source.BackupPeriodType);
        }
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new String[source.BackupPeriod.length];
            for (int i = 0; i < source.BackupPeriod.length; i++) {
                this.BackupPeriod[i] = new String(source.BackupPeriod[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "BackupPeriodType", this.BackupPeriodType);
        this.setParamArraySimple(map, prefix + "BackupPeriod.", this.BackupPeriod);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);

    }
}

