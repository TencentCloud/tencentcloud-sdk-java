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

public class ModifyBackupPlanRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例最早开始备份时间
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * 实例最晚开始备份时间
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * 实例备份保留时长，取值范围为3-7，单位是天
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * 实例备份周期，按照星期维度，格式为小写星期英文单词
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String [] BackupPeriod;

    /**
     * Get 实例ID 
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例最早开始备份时间 
     * @return MinBackupStartTime 实例最早开始备份时间
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set 实例最早开始备份时间
     * @param MinBackupStartTime 实例最早开始备份时间
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get 实例最晚开始备份时间 
     * @return MaxBackupStartTime 实例最晚开始备份时间
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set 实例最晚开始备份时间
     * @param MaxBackupStartTime 实例最晚开始备份时间
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get 实例备份保留时长，取值范围为3-7，单位是天 
     * @return BaseBackupRetentionPeriod 实例备份保留时长，取值范围为3-7，单位是天
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set 实例备份保留时长，取值范围为3-7，单位是天
     * @param BaseBackupRetentionPeriod 实例备份保留时长，取值范围为3-7，单位是天
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get 实例备份周期，按照星期维度，格式为小写星期英文单词 
     * @return BackupPeriod 实例备份周期，按照星期维度，格式为小写星期英文单词
     */
    public String [] getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set 实例备份周期，按照星期维度，格式为小写星期英文单词
     * @param BackupPeriod 实例备份周期，按照星期维度，格式为小写星期英文单词
     */
    public void setBackupPeriod(String [] BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
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

    }
}

