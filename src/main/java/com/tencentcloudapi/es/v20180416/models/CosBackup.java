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
    * <p>是否开启cos自动备份</p>
    */
    @SerializedName("IsAutoBackup")
    @Expose
    private Boolean IsAutoBackup;

    /**
    * <p>自动备份执行时间（精确到小时）, e.g. &quot;22:00&quot;</p>
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * <p>备份快照前缀</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>0 腾讯云仓库; 1 客户仓库</p>
    */
    @SerializedName("EsRepositoryType")
    @Expose
    private Long EsRepositoryType;

    /**
    * <p>托管快照仓库名称</p>
    */
    @SerializedName("PaasEsRepository")
    @Expose
    private String PaasEsRepository;

    /**
    * <p>客户快照仓库名称</p>
    */
    @SerializedName("UserEsRepository")
    @Expose
    private String UserEsRepository;

    /**
    * <p>cos存储文件夹目录</p>
    */
    @SerializedName("CosBasePath")
    @Expose
    private String CosBasePath;

    /**
    * <p>快照存储周期 单位天</p>
    */
    @SerializedName("StorageDuration")
    @Expose
    private Long StorageDuration;

    /**
    * <p>自动备份频率单位小时</p>
    */
    @SerializedName("AutoBackupInterval")
    @Expose
    private Long AutoBackupInterval;

    /**
    * <p>备份锁定 0 不锁定; 1 锁定</p>
    */
    @SerializedName("CosRetention")
    @Expose
    private Long CosRetention;

    /**
    * <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
    */
    @SerializedName("RetainUntilDate")
    @Expose
    private String RetainUntilDate;

    /**
    * <p>锁定宽限期</p>
    */
    @SerializedName("RetentionGraceTime")
    @Expose
    private Long RetentionGraceTime;

    /**
    * <p>跨地域备份 0 不跨地域; 1 跨地域</p>
    */
    @SerializedName("RemoteCos")
    @Expose
    private Long RemoteCos;

    /**
    * <p>跨地域备份地域名称 ap-guangzhou</p>
    */
    @SerializedName("RemoteCosRegion")
    @Expose
    private String RemoteCosRegion;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>备份索引列表，如果不填表示备份所有索引</p>
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
    */
    @SerializedName("MultiAz")
    @Expose
    private Long MultiAz;

    /**
    * <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
    */
    @SerializedName("MaxSnapshotPerSec")
    @Expose
    private String MaxSnapshotPerSec;

    /**
    * <p>每节点读取仓库的最大速度 max_restore_bytes_per_sec, 710前默认40m, 710及以后默认无限制</p>
    */
    @SerializedName("MaxRestorePerSec")
    @Expose
    private String MaxRestorePerSec;

    /**
    * <p>策略创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>是否开启cos自动备份</p> 
     * @return IsAutoBackup <p>是否开启cos自动备份</p>
     */
    public Boolean getIsAutoBackup() {
        return this.IsAutoBackup;
    }

    /**
     * Set <p>是否开启cos自动备份</p>
     * @param IsAutoBackup <p>是否开启cos自动备份</p>
     */
    public void setIsAutoBackup(Boolean IsAutoBackup) {
        this.IsAutoBackup = IsAutoBackup;
    }

    /**
     * Get <p>自动备份执行时间（精确到小时）, e.g. &quot;22:00&quot;</p> 
     * @return BackupTime <p>自动备份执行时间（精确到小时）, e.g. &quot;22:00&quot;</p>
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set <p>自动备份执行时间（精确到小时）, e.g. &quot;22:00&quot;</p>
     * @param BackupTime <p>自动备份执行时间（精确到小时）, e.g. &quot;22:00&quot;</p>
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get <p>备份快照前缀</p> 
     * @return SnapshotName <p>备份快照前缀</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>备份快照前缀</p>
     * @param SnapshotName <p>备份快照前缀</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>0 腾讯云仓库; 1 客户仓库</p> 
     * @return EsRepositoryType <p>0 腾讯云仓库; 1 客户仓库</p>
     */
    public Long getEsRepositoryType() {
        return this.EsRepositoryType;
    }

    /**
     * Set <p>0 腾讯云仓库; 1 客户仓库</p>
     * @param EsRepositoryType <p>0 腾讯云仓库; 1 客户仓库</p>
     */
    public void setEsRepositoryType(Long EsRepositoryType) {
        this.EsRepositoryType = EsRepositoryType;
    }

    /**
     * Get <p>托管快照仓库名称</p> 
     * @return PaasEsRepository <p>托管快照仓库名称</p>
     */
    public String getPaasEsRepository() {
        return this.PaasEsRepository;
    }

    /**
     * Set <p>托管快照仓库名称</p>
     * @param PaasEsRepository <p>托管快照仓库名称</p>
     */
    public void setPaasEsRepository(String PaasEsRepository) {
        this.PaasEsRepository = PaasEsRepository;
    }

    /**
     * Get <p>客户快照仓库名称</p> 
     * @return UserEsRepository <p>客户快照仓库名称</p>
     */
    public String getUserEsRepository() {
        return this.UserEsRepository;
    }

    /**
     * Set <p>客户快照仓库名称</p>
     * @param UserEsRepository <p>客户快照仓库名称</p>
     */
    public void setUserEsRepository(String UserEsRepository) {
        this.UserEsRepository = UserEsRepository;
    }

    /**
     * Get <p>cos存储文件夹目录</p> 
     * @return CosBasePath <p>cos存储文件夹目录</p>
     */
    public String getCosBasePath() {
        return this.CosBasePath;
    }

    /**
     * Set <p>cos存储文件夹目录</p>
     * @param CosBasePath <p>cos存储文件夹目录</p>
     */
    public void setCosBasePath(String CosBasePath) {
        this.CosBasePath = CosBasePath;
    }

    /**
     * Get <p>快照存储周期 单位天</p> 
     * @return StorageDuration <p>快照存储周期 单位天</p>
     */
    public Long getStorageDuration() {
        return this.StorageDuration;
    }

    /**
     * Set <p>快照存储周期 单位天</p>
     * @param StorageDuration <p>快照存储周期 单位天</p>
     */
    public void setStorageDuration(Long StorageDuration) {
        this.StorageDuration = StorageDuration;
    }

    /**
     * Get <p>自动备份频率单位小时</p> 
     * @return AutoBackupInterval <p>自动备份频率单位小时</p>
     */
    public Long getAutoBackupInterval() {
        return this.AutoBackupInterval;
    }

    /**
     * Set <p>自动备份频率单位小时</p>
     * @param AutoBackupInterval <p>自动备份频率单位小时</p>
     */
    public void setAutoBackupInterval(Long AutoBackupInterval) {
        this.AutoBackupInterval = AutoBackupInterval;
    }

    /**
     * Get <p>备份锁定 0 不锁定; 1 锁定</p> 
     * @return CosRetention <p>备份锁定 0 不锁定; 1 锁定</p>
     */
    public Long getCosRetention() {
        return this.CosRetention;
    }

    /**
     * Set <p>备份锁定 0 不锁定; 1 锁定</p>
     * @param CosRetention <p>备份锁定 0 不锁定; 1 锁定</p>
     */
    public void setCosRetention(Long CosRetention) {
        this.CosRetention = CosRetention;
    }

    /**
     * Get <p>锁定截止日期 2022-12-10T08:34:48.000Z</p> 
     * @return RetainUntilDate <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
     */
    public String getRetainUntilDate() {
        return this.RetainUntilDate;
    }

    /**
     * Set <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
     * @param RetainUntilDate <p>锁定截止日期 2022-12-10T08:34:48.000Z</p>
     */
    public void setRetainUntilDate(String RetainUntilDate) {
        this.RetainUntilDate = RetainUntilDate;
    }

    /**
     * Get <p>锁定宽限期</p> 
     * @return RetentionGraceTime <p>锁定宽限期</p>
     */
    public Long getRetentionGraceTime() {
        return this.RetentionGraceTime;
    }

    /**
     * Set <p>锁定宽限期</p>
     * @param RetentionGraceTime <p>锁定宽限期</p>
     */
    public void setRetentionGraceTime(Long RetentionGraceTime) {
        this.RetentionGraceTime = RetentionGraceTime;
    }

    /**
     * Get <p>跨地域备份 0 不跨地域; 1 跨地域</p> 
     * @return RemoteCos <p>跨地域备份 0 不跨地域; 1 跨地域</p>
     */
    public Long getRemoteCos() {
        return this.RemoteCos;
    }

    /**
     * Set <p>跨地域备份 0 不跨地域; 1 跨地域</p>
     * @param RemoteCos <p>跨地域备份 0 不跨地域; 1 跨地域</p>
     */
    public void setRemoteCos(Long RemoteCos) {
        this.RemoteCos = RemoteCos;
    }

    /**
     * Get <p>跨地域备份地域名称 ap-guangzhou</p> 
     * @return RemoteCosRegion <p>跨地域备份地域名称 ap-guangzhou</p>
     */
    public String getRemoteCosRegion() {
        return this.RemoteCosRegion;
    }

    /**
     * Set <p>跨地域备份地域名称 ap-guangzhou</p>
     * @param RemoteCosRegion <p>跨地域备份地域名称 ap-guangzhou</p>
     */
    public void setRemoteCosRegion(String RemoteCosRegion) {
        this.RemoteCosRegion = RemoteCosRegion;
    }

    /**
     * Get <p>策略名称</p> 
     * @return StrategyName <p>策略名称</p>
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>策略名称</p>
     * @param StrategyName <p>策略名称</p>
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>备份索引列表，如果不填表示备份所有索引</p> 
     * @return Indices <p>备份索引列表，如果不填表示备份所有索引</p>
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set <p>备份索引列表，如果不填表示备份所有索引</p>
     * @param Indices <p>备份索引列表，如果不填表示备份所有索引</p>
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get <p>cos多AZ备份 0 单AZ; 1 多AZ</p> 
     * @return MultiAz <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
     */
    public Long getMultiAz() {
        return this.MultiAz;
    }

    /**
     * Set <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
     * @param MultiAz <p>cos多AZ备份 0 单AZ; 1 多AZ</p>
     */
    public void setMultiAz(Long MultiAz) {
        this.MultiAz = MultiAz;
    }

    /**
     * Get <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p> 
     * @return MaxSnapshotPerSec <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
     */
    public String getMaxSnapshotPerSec() {
        return this.MaxSnapshotPerSec;
    }

    /**
     * Set <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
     * @param MaxSnapshotPerSec <p>每节点写入仓库的最大速度 max_snapshot_bytes_per_sec, 默认40m</p>
     */
    public void setMaxSnapshotPerSec(String MaxSnapshotPerSec) {
        this.MaxSnapshotPerSec = MaxSnapshotPerSec;
    }

    /**
     * Get <p>每节点读取仓库的最大速度 max_restore_bytes_per_sec, 710前默认40m, 710及以后默认无限制</p> 
     * @return MaxRestorePerSec <p>每节点读取仓库的最大速度 max_restore_bytes_per_sec, 710前默认40m, 710及以后默认无限制</p>
     */
    public String getMaxRestorePerSec() {
        return this.MaxRestorePerSec;
    }

    /**
     * Set <p>每节点读取仓库的最大速度 max_restore_bytes_per_sec, 710前默认40m, 710及以后默认无限制</p>
     * @param MaxRestorePerSec <p>每节点读取仓库的最大速度 max_restore_bytes_per_sec, 710前默认40m, 710及以后默认无限制</p>
     */
    public void setMaxRestorePerSec(String MaxRestorePerSec) {
        this.MaxRestorePerSec = MaxRestorePerSec;
    }

    /**
     * Get <p>策略创建时间</p> 
     * @return CreateTime <p>策略创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>策略创建时间</p>
     * @param CreateTime <p>策略创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
        if (source.MultiAz != null) {
            this.MultiAz = new Long(source.MultiAz);
        }
        if (source.MaxSnapshotPerSec != null) {
            this.MaxSnapshotPerSec = new String(source.MaxSnapshotPerSec);
        }
        if (source.MaxRestorePerSec != null) {
            this.MaxRestorePerSec = new String(source.MaxRestorePerSec);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "MultiAz", this.MultiAz);
        this.setParamSimple(map, prefix + "MaxSnapshotPerSec", this.MaxSnapshotPerSec);
        this.setParamSimple(map, prefix + "MaxRestorePerSec", this.MaxRestorePerSec);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

