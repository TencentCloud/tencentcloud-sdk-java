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

public class BackupSummary extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例日志备份数量。
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * 实例日志备份大小。
    */
    @SerializedName("LogBackupSize")
    @Expose
    private Long LogBackupSize;

    /**
    * 手动创建的实例基础备份数量。
    */
    @SerializedName("ManualBaseBackupCount")
    @Expose
    private Long ManualBaseBackupCount;

    /**
    * 手动创建的实例基础备份大小。
    */
    @SerializedName("ManualBaseBackupSize")
    @Expose
    private Long ManualBaseBackupSize;

    /**
    * 自动创建的实例基础备份数量。
    */
    @SerializedName("AutoBaseBackupCount")
    @Expose
    private Long AutoBaseBackupCount;

    /**
    * 自动创建的实例基础备份大小。
    */
    @SerializedName("AutoBaseBackupSize")
    @Expose
    private Long AutoBaseBackupSize;

    /**
    * 总备份数量
    */
    @SerializedName("TotalBackupCount")
    @Expose
    private Long TotalBackupCount;

    /**
    * 总备份大小
    */
    @SerializedName("TotalBackupSize")
    @Expose
    private Long TotalBackupSize;

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
     * Get 实例日志备份数量。 
     * @return LogBackupCount 实例日志备份数量。
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set 实例日志备份数量。
     * @param LogBackupCount 实例日志备份数量。
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get 实例日志备份大小。 
     * @return LogBackupSize 实例日志备份大小。
     */
    public Long getLogBackupSize() {
        return this.LogBackupSize;
    }

    /**
     * Set 实例日志备份大小。
     * @param LogBackupSize 实例日志备份大小。
     */
    public void setLogBackupSize(Long LogBackupSize) {
        this.LogBackupSize = LogBackupSize;
    }

    /**
     * Get 手动创建的实例基础备份数量。 
     * @return ManualBaseBackupCount 手动创建的实例基础备份数量。
     */
    public Long getManualBaseBackupCount() {
        return this.ManualBaseBackupCount;
    }

    /**
     * Set 手动创建的实例基础备份数量。
     * @param ManualBaseBackupCount 手动创建的实例基础备份数量。
     */
    public void setManualBaseBackupCount(Long ManualBaseBackupCount) {
        this.ManualBaseBackupCount = ManualBaseBackupCount;
    }

    /**
     * Get 手动创建的实例基础备份大小。 
     * @return ManualBaseBackupSize 手动创建的实例基础备份大小。
     */
    public Long getManualBaseBackupSize() {
        return this.ManualBaseBackupSize;
    }

    /**
     * Set 手动创建的实例基础备份大小。
     * @param ManualBaseBackupSize 手动创建的实例基础备份大小。
     */
    public void setManualBaseBackupSize(Long ManualBaseBackupSize) {
        this.ManualBaseBackupSize = ManualBaseBackupSize;
    }

    /**
     * Get 自动创建的实例基础备份数量。 
     * @return AutoBaseBackupCount 自动创建的实例基础备份数量。
     */
    public Long getAutoBaseBackupCount() {
        return this.AutoBaseBackupCount;
    }

    /**
     * Set 自动创建的实例基础备份数量。
     * @param AutoBaseBackupCount 自动创建的实例基础备份数量。
     */
    public void setAutoBaseBackupCount(Long AutoBaseBackupCount) {
        this.AutoBaseBackupCount = AutoBaseBackupCount;
    }

    /**
     * Get 自动创建的实例基础备份大小。 
     * @return AutoBaseBackupSize 自动创建的实例基础备份大小。
     */
    public Long getAutoBaseBackupSize() {
        return this.AutoBaseBackupSize;
    }

    /**
     * Set 自动创建的实例基础备份大小。
     * @param AutoBaseBackupSize 自动创建的实例基础备份大小。
     */
    public void setAutoBaseBackupSize(Long AutoBaseBackupSize) {
        this.AutoBaseBackupSize = AutoBaseBackupSize;
    }

    /**
     * Get 总备份数量 
     * @return TotalBackupCount 总备份数量
     */
    public Long getTotalBackupCount() {
        return this.TotalBackupCount;
    }

    /**
     * Set 总备份数量
     * @param TotalBackupCount 总备份数量
     */
    public void setTotalBackupCount(Long TotalBackupCount) {
        this.TotalBackupCount = TotalBackupCount;
    }

    /**
     * Get 总备份大小 
     * @return TotalBackupSize 总备份大小
     */
    public Long getTotalBackupSize() {
        return this.TotalBackupSize;
    }

    /**
     * Set 总备份大小
     * @param TotalBackupSize 总备份大小
     */
    public void setTotalBackupSize(Long TotalBackupSize) {
        this.TotalBackupSize = TotalBackupSize;
    }

    public BackupSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSummary(BackupSummary source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.LogBackupSize != null) {
            this.LogBackupSize = new Long(source.LogBackupSize);
        }
        if (source.ManualBaseBackupCount != null) {
            this.ManualBaseBackupCount = new Long(source.ManualBaseBackupCount);
        }
        if (source.ManualBaseBackupSize != null) {
            this.ManualBaseBackupSize = new Long(source.ManualBaseBackupSize);
        }
        if (source.AutoBaseBackupCount != null) {
            this.AutoBaseBackupCount = new Long(source.AutoBaseBackupCount);
        }
        if (source.AutoBaseBackupSize != null) {
            this.AutoBaseBackupSize = new Long(source.AutoBaseBackupSize);
        }
        if (source.TotalBackupCount != null) {
            this.TotalBackupCount = new Long(source.TotalBackupCount);
        }
        if (source.TotalBackupSize != null) {
            this.TotalBackupSize = new Long(source.TotalBackupSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSize", this.LogBackupSize);
        this.setParamSimple(map, prefix + "ManualBaseBackupCount", this.ManualBaseBackupCount);
        this.setParamSimple(map, prefix + "ManualBaseBackupSize", this.ManualBaseBackupSize);
        this.setParamSimple(map, prefix + "AutoBaseBackupCount", this.AutoBaseBackupCount);
        this.setParamSimple(map, prefix + "AutoBaseBackupSize", this.AutoBaseBackupSize);
        this.setParamSimple(map, prefix + "TotalBackupCount", this.TotalBackupCount);
        this.setParamSimple(map, prefix + "TotalBackupSize", this.TotalBackupSize);

    }
}

