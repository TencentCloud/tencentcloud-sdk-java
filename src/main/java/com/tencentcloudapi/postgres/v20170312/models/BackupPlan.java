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

public class BackupPlan extends AbstractModel{

    /**
    * 备份周期
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String BackupPeriod;

    /**
    * 基础备份保留时长
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
     * Get 基础备份保留时长 
     * @return BaseBackupRetentionPeriod 基础备份保留时长
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set 基础备份保留时长
     * @param BaseBackupRetentionPeriod 基础备份保留时长
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPeriod", this.BackupPeriod);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);

    }
}

