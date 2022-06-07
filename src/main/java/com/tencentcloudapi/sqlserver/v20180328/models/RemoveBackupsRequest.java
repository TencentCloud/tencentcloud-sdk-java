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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveBackupsRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 待删除的备份名称，备份名称可通过DescribeBackups接口的FileName字段获得。单次请求批量删除备份数不能超过10个。
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * 批量删除手动备份起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 批量删除手动备份截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 实例ID，形如mssql-j8kv137v 
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 待删除的备份名称，备份名称可通过DescribeBackups接口的FileName字段获得。单次请求批量删除备份数不能超过10个。 
     * @return BackupNames 待删除的备份名称，备份名称可通过DescribeBackups接口的FileName字段获得。单次请求批量删除备份数不能超过10个。
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set 待删除的备份名称，备份名称可通过DescribeBackups接口的FileName字段获得。单次请求批量删除备份数不能超过10个。
     * @param BackupNames 待删除的备份名称，备份名称可通过DescribeBackups接口的FileName字段获得。单次请求批量删除备份数不能超过10个。
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get 批量删除手动备份起始时间 
     * @return StartTime 批量删除手动备份起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 批量删除手动备份起始时间
     * @param StartTime 批量删除手动备份起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 批量删除手动备份截止时间 
     * @return EndTime 批量删除手动备份截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 批量删除手动备份截止时间
     * @param EndTime 批量删除手动备份截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public RemoveBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveBackupsRequest(RemoveBackupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupNames != null) {
            this.BackupNames = new String[source.BackupNames.length];
            for (int i = 0; i < source.BackupNames.length; i++) {
                this.BackupNames[i] = new String(source.BackupNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

