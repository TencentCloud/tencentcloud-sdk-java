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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFileInfo extends AbstractModel {

    /**
    * <p>快照文件ID，已废弃，请使用BackupId</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private Long SnapshotId;

    /**
    * <p>备份文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>备份文件大小</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>备份开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>备份完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>备份类型：snapshot，快照备份；logic，逻辑备份</p>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>备份方式：auto，自动备份；manual，手动备份</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中</p>
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * <p>备份文件时间</p>
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * <p>备份ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * <p>快照类型，可选值：full，全量；increment，增量</p>
    */
    @SerializedName("SnapShotType")
    @Expose
    private String SnapShotType;

    /**
    * <p>备份文件备注</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * <p>投递状态</p>
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * <p>秘钥id</p>
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * <p>秘钥地域</p>
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
    * <p>保险箱信息</p>
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * <p>备份周期策略</p>
    */
    @SerializedName("BackupPeriodStrategy")
    @Expose
    private String BackupPeriodStrategy;

    /**
     * Get <p>快照文件ID，已废弃，请使用BackupId</p> 
     * @return SnapshotId <p>快照文件ID，已废弃，请使用BackupId</p>
     */
    public Long getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照文件ID，已废弃，请使用BackupId</p>
     * @param SnapshotId <p>快照文件ID，已废弃，请使用BackupId</p>
     */
    public void setSnapshotId(Long SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>备份文件名</p> 
     * @return FileName <p>备份文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>备份文件名</p>
     * @param FileName <p>备份文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>备份文件大小</p> 
     * @return FileSize <p>备份文件大小</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>备份文件大小</p>
     * @param FileSize <p>备份文件大小</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>备份开始时间</p> 
     * @return StartTime <p>备份开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>备份开始时间</p>
     * @param StartTime <p>备份开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>备份完成时间</p> 
     * @return FinishTime <p>备份完成时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>备份完成时间</p>
     * @param FinishTime <p>备份完成时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>备份类型：snapshot，快照备份；logic，逻辑备份</p> 
     * @return BackupType <p>备份类型：snapshot，快照备份；logic，逻辑备份</p>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>备份类型：snapshot，快照备份；logic，逻辑备份</p>
     * @param BackupType <p>备份类型：snapshot，快照备份；logic，逻辑备份</p>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>备份方式：auto，自动备份；manual，手动备份</p> 
     * @return BackupMethod <p>备份方式：auto，自动备份；manual，手动备份</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式：auto，自动备份；manual，手动备份</p>
     * @param BackupMethod <p>备份方式：auto，自动备份；manual，手动备份</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中</p> 
     * @return BackupStatus <p>备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中</p>
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set <p>备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中</p>
     * @param BackupStatus <p>备份文件状态：success：备份成功；fail：备份失败；creating：备份文件创建中；deleting：备份文件删除中</p>
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get <p>备份文件时间</p> 
     * @return SnapshotTime <p>备份文件时间</p>
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set <p>备份文件时间</p>
     * @param SnapshotTime <p>备份文件时间</p>
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get <p>备份ID</p> 
     * @return BackupId <p>备份ID</p>
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份ID</p>
     * @param BackupId <p>备份ID</p>
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>快照类型，可选值：full，全量；increment，增量</p> 
     * @return SnapShotType <p>快照类型，可选值：full，全量；increment，增量</p>
     */
    public String getSnapShotType() {
        return this.SnapShotType;
    }

    /**
     * Set <p>快照类型，可选值：full，全量；increment，增量</p>
     * @param SnapShotType <p>快照类型，可选值：full，全量；increment，增量</p>
     */
    public void setSnapShotType(String SnapShotType) {
        this.SnapShotType = SnapShotType;
    }

    /**
     * Get <p>备份文件备注</p> 
     * @return BackupName <p>备份文件备注</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>备份文件备注</p>
     * @param BackupName <p>备份文件备注</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get <p>投递状态</p> 
     * @return CopyStatus <p>投递状态</p>
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set <p>投递状态</p>
     * @param CopyStatus <p>投递状态</p>
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get <p>秘钥id</p> 
     * @return EncryptKeyId <p>秘钥id</p>
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set <p>秘钥id</p>
     * @param EncryptKeyId <p>秘钥id</p>
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get <p>秘钥地域</p> 
     * @return EncryptRegion <p>秘钥地域</p>
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set <p>秘钥地域</p>
     * @param EncryptRegion <p>秘钥地域</p>
     */
    public void setEncryptRegion(String EncryptRegion) {
        this.EncryptRegion = EncryptRegion;
    }

    /**
     * Get <p>保险箱信息</p> 
     * @return VaultInfos <p>保险箱信息</p>
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set <p>保险箱信息</p>
     * @param VaultInfos <p>保险箱信息</p>
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get <p>备份周期策略</p> 
     * @return BackupPeriodStrategy <p>备份周期策略</p>
     */
    public String getBackupPeriodStrategy() {
        return this.BackupPeriodStrategy;
    }

    /**
     * Set <p>备份周期策略</p>
     * @param BackupPeriodStrategy <p>备份周期策略</p>
     */
    public void setBackupPeriodStrategy(String BackupPeriodStrategy) {
        this.BackupPeriodStrategy = BackupPeriodStrategy;
    }

    public BackupFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFileInfo(BackupFileInfo source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new Long(source.SnapshotId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.SnapShotType != null) {
            this.SnapShotType = new String(source.SnapShotType);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.CopyStatus != null) {
            this.CopyStatus = new String(source.CopyStatus);
        }
        if (source.EncryptKeyId != null) {
            this.EncryptKeyId = new String(source.EncryptKeyId);
        }
        if (source.EncryptRegion != null) {
            this.EncryptRegion = new String(source.EncryptRegion);
        }
        if (source.VaultInfos != null) {
            this.VaultInfos = new VaultInfo[source.VaultInfos.length];
            for (int i = 0; i < source.VaultInfos.length; i++) {
                this.VaultInfos[i] = new VaultInfo(source.VaultInfos[i]);
            }
        }
        if (source.BackupPeriodStrategy != null) {
            this.BackupPeriodStrategy = new String(source.BackupPeriodStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "SnapShotType", this.SnapShotType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "CopyStatus", this.CopyStatus);
        this.setParamSimple(map, prefix + "EncryptKeyId", this.EncryptKeyId);
        this.setParamSimple(map, prefix + "EncryptRegion", this.EncryptRegion);
        this.setParamArrayObj(map, prefix + "VaultInfos.", this.VaultInfos);
        this.setParamSimple(map, prefix + "BackupPeriodStrategy", this.BackupPeriodStrategy);

    }
}

