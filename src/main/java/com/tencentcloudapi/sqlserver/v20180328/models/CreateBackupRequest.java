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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupRequest extends AbstractModel {

    /**
    * 备份策略(0-实例备份 1-多库备份)
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 需要备份库名的列表(多库备份才填写)
    */
    @SerializedName("DBNames")
    @Expose
    private String [] DBNames;

    /**
    * 实例ID，形如mssql-i1z41iwd
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份名称，若不填则自动生成“实例ID_备份开始时间戳”
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线，默认取值0
    */
    @SerializedName("StorageStrategy")
    @Expose
    private Long StorageStrategy;

    /**
     * Get 备份策略(0-实例备份 1-多库备份) 
     * @return Strategy 备份策略(0-实例备份 1-多库备份)
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 备份策略(0-实例备份 1-多库备份)
     * @param Strategy 备份策略(0-实例备份 1-多库备份)
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 需要备份库名的列表(多库备份才填写) 
     * @return DBNames 需要备份库名的列表(多库备份才填写)
     */
    public String [] getDBNames() {
        return this.DBNames;
    }

    /**
     * Set 需要备份库名的列表(多库备份才填写)
     * @param DBNames 需要备份库名的列表(多库备份才填写)
     */
    public void setDBNames(String [] DBNames) {
        this.DBNames = DBNames;
    }

    /**
     * Get 实例ID，形如mssql-i1z41iwd 
     * @return InstanceId 实例ID，形如mssql-i1z41iwd
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-i1z41iwd
     * @param InstanceId 实例ID，形如mssql-i1z41iwd
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份名称，若不填则自动生成“实例ID_备份开始时间戳” 
     * @return BackupName 备份名称，若不填则自动生成“实例ID_备份开始时间戳”
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份名称，若不填则自动生成“实例ID_备份开始时间戳”
     * @param BackupName 备份名称，若不填则自动生成“实例ID_备份开始时间戳”
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线，默认取值0 
     * @return StorageStrategy 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线，默认取值0
     */
    public Long getStorageStrategy() {
        return this.StorageStrategy;
    }

    /**
     * Set 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线，默认取值0
     * @param StorageStrategy 备份存储策略 0-跟随自定义备份保留策略 1-跟随实例生命周期直到实例下线，默认取值0
     */
    public void setStorageStrategy(Long StorageStrategy) {
        this.StorageStrategy = StorageStrategy;
    }

    public CreateBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupRequest(CreateBackupRequest source) {
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.DBNames != null) {
            this.DBNames = new String[source.DBNames.length];
            for (int i = 0; i < source.DBNames.length; i++) {
                this.DBNames[i] = new String(source.DBNames[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.StorageStrategy != null) {
            this.StorageStrategy = new Long(source.StorageStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamArraySimple(map, prefix + "DBNames.", this.DBNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "StorageStrategy", this.StorageStrategy);

    }
}

