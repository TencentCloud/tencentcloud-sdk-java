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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegularBackupPlanRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 定期备份保留天数 [90 - 3650]天，默认365天
    */
    @SerializedName("RegularBackupSaveDays")
    @Expose
    private Long RegularBackupSaveDays;

    /**
    * 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
    */
    @SerializedName("RegularBackupStrategy")
    @Expose
    private String RegularBackupStrategy;

    /**
    * 定期备份保留个数，默认1个
    */
    @SerializedName("RegularBackupCounts")
    @Expose
    private Long RegularBackupCounts;

    /**
    * 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
    */
    @SerializedName("RegularBackupStartTime")
    @Expose
    private String RegularBackupStartTime;

    /**
    * 常规备份周期
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 定期备份保留天数 [90 - 3650]天，默认365天 
     * @return RegularBackupSaveDays 定期备份保留天数 [90 - 3650]天，默认365天
     */
    public Long getRegularBackupSaveDays() {
        return this.RegularBackupSaveDays;
    }

    /**
     * Set 定期备份保留天数 [90 - 3650]天，默认365天
     * @param RegularBackupSaveDays 定期备份保留天数 [90 - 3650]天，默认365天
     */
    public void setRegularBackupSaveDays(Long RegularBackupSaveDays) {
        this.RegularBackupSaveDays = RegularBackupSaveDays;
    }

    /**
     * Get 定期备份策略 years-每年，quarters-每季度，months-每月，默认months 
     * @return RegularBackupStrategy 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
     */
    public String getRegularBackupStrategy() {
        return this.RegularBackupStrategy;
    }

    /**
     * Set 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
     * @param RegularBackupStrategy 定期备份策略 years-每年，quarters-每季度，months-每月，默认months
     */
    public void setRegularBackupStrategy(String RegularBackupStrategy) {
        this.RegularBackupStrategy = RegularBackupStrategy;
    }

    /**
     * Get 定期备份保留个数，默认1个 
     * @return RegularBackupCounts 定期备份保留个数，默认1个
     */
    public Long getRegularBackupCounts() {
        return this.RegularBackupCounts;
    }

    /**
     * Set 定期备份保留个数，默认1个
     * @param RegularBackupCounts 定期备份保留个数，默认1个
     */
    public void setRegularBackupCounts(Long RegularBackupCounts) {
        this.RegularBackupCounts = RegularBackupCounts;
    }

    /**
     * Get 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期 
     * @return RegularBackupStartTime 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     */
    public String getRegularBackupStartTime() {
        return this.RegularBackupStartTime;
    }

    /**
     * Set 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     * @param RegularBackupStartTime 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     */
    public void setRegularBackupStartTime(String RegularBackupStartTime) {
        this.RegularBackupStartTime = RegularBackupStartTime;
    }

    /**
     * Get 常规备份周期 
     * @return BackupCycle 常规备份周期
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set 常规备份周期
     * @param BackupCycle 常规备份周期
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    public DescribeRegularBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegularBackupPlanRequest(DescribeRegularBackupPlanRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RegularBackupSaveDays != null) {
            this.RegularBackupSaveDays = new Long(source.RegularBackupSaveDays);
        }
        if (source.RegularBackupStrategy != null) {
            this.RegularBackupStrategy = new String(source.RegularBackupStrategy);
        }
        if (source.RegularBackupCounts != null) {
            this.RegularBackupCounts = new Long(source.RegularBackupCounts);
        }
        if (source.RegularBackupStartTime != null) {
            this.RegularBackupStartTime = new String(source.RegularBackupStartTime);
        }
        if (source.BackupCycle != null) {
            this.BackupCycle = new Long[source.BackupCycle.length];
            for (int i = 0; i < source.BackupCycle.length; i++) {
                this.BackupCycle[i] = new Long(source.BackupCycle[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RegularBackupSaveDays", this.RegularBackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupStrategy", this.RegularBackupStrategy);
        this.setParamSimple(map, prefix + "RegularBackupCounts", this.RegularBackupCounts);
        this.setParamSimple(map, prefix + "RegularBackupStartTime", this.RegularBackupStartTime);
        this.setParamArraySimple(map, prefix + "BackupCycle.", this.BackupCycle);

    }
}

