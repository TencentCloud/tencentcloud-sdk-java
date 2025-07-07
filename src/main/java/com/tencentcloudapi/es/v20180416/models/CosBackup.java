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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBackup extends AbstractModel {

    /**
    * 是否开启cos自动备份
    */
    @SerializedName("IsAutoBackup")
    @Expose
    private Boolean IsAutoBackup;

    /**
    * 自动备份执行时间（精确到小时）, e.g. "22:00"
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * 0 腾讯云仓库; 1 客户仓库
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * 客户快照仓库名称
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * 快照存储周期 单位天
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * 自动备份频率单位小时
    */
    @SerializedName("AutoBackupInterval")
    @Expose
    private Long AutoBackupInterval;

    /**
     * Get 是否开启cos自动备份 
     * @return IsAutoBackup 是否开启cos自动备份
     */
    public Boolean getIsAutoBackup() {
        return this.IsAutoBackup;
    }

    /**
     * Set 是否开启cos自动备份
     * @param IsAutoBackup 是否开启cos自动备份
     */
    public void setIsAutoBackup(Boolean IsAutoBackup) {
        this.IsAutoBackup = IsAutoBackup;
    }

    /**
     * Get 自动备份执行时间（精确到小时）, e.g. "22:00" 
     * @return BackupTime 自动备份执行时间（精确到小时）, e.g. "22:00"
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 自动备份执行时间（精确到小时）, e.g. "22:00"
     * @param BackupTime 自动备份执行时间（精确到小时）, e.g. "22:00"
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 0 腾讯云仓库; 1 客户仓库 
     * @return EsRepositoryType 0 腾讯云仓库; 1 客户仓库
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set 0 腾讯云仓库; 1 客户仓库
     * @param EsRepositoryType 0 腾讯云仓库; 1 客户仓库
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get 客户快照仓库名称 
     * @return UserEsRepository 客户快照仓库名称
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set 客户快照仓库名称
     * @param UserEsRepository 客户快照仓库名称
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get 快照存储周期 单位天 
     * @return StorageDuration 快照存储周期 单位天
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set 快照存储周期 单位天
     * @param StorageDuration 快照存储周期 单位天
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get 自动备份频率单位小时 
     * @return AutoBackupInterval 自动备份频率单位小时
     */
    public Long getAutoBackupInterval() {
        return this.AutoBackupInterval;
    }

    /**
     * Set 自动备份频率单位小时
     * @param AutoBackupInterval 自动备份频率单位小时
     */
    public void setAutoBackupInterval(Long AutoBackupInterval) {
        this.AutoBackupInterval = AutoBackupInterval;
    }

    public CosBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBackup(CosBackup source) {
        if (source.IsAutoBackup != null) {
            this.IsAutoBackup = new Boolean(source.IsAutoBackup);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.EsRepositoryType != null) {
            this.EsRepositoryType = new Long(source.EsRepositoryType);
        }
        if (source.UserEsRepository != null) {
            this.UserEsRepository = new String(source.UserEsRepository);
        }
        if (source.StorageDuration != null) {
            this.StorageDuration = new Long(source.StorageDuration);
        }
        if (source.AutoBackupInterval != null) {
            this.AutoBackupInterval = new Long(source.AutoBackupInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAutoBackup", this.IsAutoBackup);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "EsRepositoryType", this.EsRepositoryType);
        this.setParamSimple(map, prefix + "UserEsRepository", this.UserEsRepository);
        this.setParamSimple(map, prefix + "StorageDuration", this.StorageDuration);
        this.setParamSimple(map, prefix + "AutoBackupInterval", this.AutoBackupInterval);

    }
}

