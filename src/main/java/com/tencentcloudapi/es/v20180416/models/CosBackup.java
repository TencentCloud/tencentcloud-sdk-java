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
    * 备份快照前缀
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 0 腾讯云仓库; 1 客户仓库
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * 托管快照仓库名称
    */
    @SerializedName("PaasEsRepository")
    @Expose
    private String PaasEsRepository;

    /**
    * 客户快照仓库名称
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * cos存储文件夹目录
    */
    @SerializedName("CosBasePath")
    @Expose
    private String CosBasePath;

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
    * 备份锁定 0 不锁定; 1 锁定
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * 锁定截止日期 2022-12-10T08:34:48.000Z
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * 锁定宽限期
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * 跨地域备份 0 不跨地域; 1 跨地域
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * 跨地域备份地域名称 ap-guangzhou
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 备份索引列表，如果不填表示备份所有索引
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * 策略创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get 备份快照前缀 
     * @return SnapshotName 备份快照前缀
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 备份快照前缀
     * @param SnapshotName 备份快照前缀
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
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
     * Get 托管快照仓库名称 
     * @return PaasEsRepository 托管快照仓库名称
     */
    public String getPaasEsRepository() {
        return this.PaasEsRepository;
    }

    /**
     * Set 托管快照仓库名称
     * @param PaasEsRepository 托管快照仓库名称
     */
    public void setPaasEsRepository(String PaasEsRepository) {
        this.PaasEsRepository = PaasEsRepository;
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
     * Get cos存储文件夹目录 
     * @return CosBasePath cos存储文件夹目录
     */
    public String getCosBasePath() {
        return this.CosBasePath;
    }

    /**
     * Set cos存储文件夹目录
     * @param CosBasePath cos存储文件夹目录
     */
    public void setCosBasePath(String CosBasePath) {
        this.CosBasePath = CosBasePath;
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

    /**
     * Get 备份锁定 0 不锁定; 1 锁定 
     * @return CosRetention 备份锁定 0 不锁定; 1 锁定
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set 备份锁定 0 不锁定; 1 锁定
     * @param CosRetention 备份锁定 0 不锁定; 1 锁定
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get 锁定截止日期 2022-12-10T08:34:48.000Z 
     * @return RetainUntilDate 锁定截止日期 2022-12-10T08:34:48.000Z
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set 锁定截止日期 2022-12-10T08:34:48.000Z
     * @param RetainUntilDate 锁定截止日期 2022-12-10T08:34:48.000Z
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get 锁定宽限期 
     * @return RetentionGraceTime 锁定宽限期
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set 锁定宽限期
     * @param RetentionGraceTime 锁定宽限期
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get 跨地域备份 0 不跨地域; 1 跨地域 
     * @return RemoteCos 跨地域备份 0 不跨地域; 1 跨地域
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set 跨地域备份 0 不跨地域; 1 跨地域
     * @param RemoteCos 跨地域备份 0 不跨地域; 1 跨地域
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get 跨地域备份地域名称 ap-guangzhou 
     * @return RemoteCosRegion 跨地域备份地域名称 ap-guangzhou
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set 跨地域备份地域名称 ap-guangzhou
     * @param RemoteCosRegion 跨地域备份地域名称 ap-guangzhou
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 备份索引列表，如果不填表示备份所有索引 
     * @return Indices 备份索引列表，如果不填表示备份所有索引
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set 备份索引列表，如果不填表示备份所有索引
     * @param Indices 备份索引列表，如果不填表示备份所有索引
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get 策略创建时间 
     * @return CreateTime 策略创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 策略创建时间
     * @param CreateTime 策略创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.EsRepositoryType != null) {
            this.EsRepositoryType = new Long(source.EsRepositoryType);
        }
        if (source.PaasEsRepository != null) {
            this.PaasEsRepository = new String(source.PaasEsRepository);
        }
        if (source.UserEsRepository != null) {
            this.UserEsRepository = new String(source.UserEsRepository);
        }
        if (source.CosBasePath != null) {
            this.CosBasePath = new String(source.CosBasePath);
        }
        if (source.StorageDuration != null) {
            this.StorageDuration = new Long(source.StorageDuration);
        }
        if (source.AutoBackupInterval != null) {
            this.AutoBackupInterval = new Long(source.AutoBackupInterval);
        }
        if (source.CosRetention != null) {
            this.CosRetention = new Long(source.CosRetention);
        }
        if (source.RetainUntilDate != null) {
            this.RetainUntilDate = new String(source.RetainUntilDate);
        }
        if (source.RetentionGraceTime != null) {
            this.RetentionGraceTime = new Long(source.RetentionGraceTime);
        }
        if (source.RemoteCos != null) {
            this.RemoteCos = new Long(source.RemoteCos);
        }
        if (source.RemoteCosRegion != null) {
            this.RemoteCosRegion = new String(source.RemoteCosRegion);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Indices != null) {
            this.Indices = new String(source.Indices);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAutoBackup", this.IsAutoBackup);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "EsRepositoryType", this.EsRepositoryType);
        this.setParamSimple(map, prefix + "PaasEsRepository", this.PaasEsRepository);
        this.setParamSimple(map, prefix + "UserEsRepository", this.UserEsRepository);
        this.setParamSimple(map, prefix + "CosBasePath", this.CosBasePath);
        this.setParamSimple(map, prefix + "StorageDuration", this.StorageDuration);
        this.setParamSimple(map, prefix + "AutoBackupInterval", this.AutoBackupInterval);
        this.setParamSimple(map, prefix + "CosRetention", this.CosRetention);
        this.setParamSimple(map, prefix + "RetainUntilDate", this.RetainUntilDate);
        this.setParamSimple(map, prefix + "RetentionGraceTime", this.RetentionGraceTime);
        this.setParamSimple(map, prefix + "RemoteCos", this.RemoteCos);
        this.setParamSimple(map, prefix + "RemoteCosRegion", this.RemoteCosRegion);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "Indices", this.Indices);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

