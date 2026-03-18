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

public class DescribeVaultsItem extends AbstractModel {

    /**
    * 保险箱ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 保险箱名称
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 保险箱描述
    */
    @SerializedName("VaultDescribe")
    @Expose
    private String VaultDescribe;

    /**
    * 加密密钥ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥所在地域
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * 密钥类型
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 备份文件数量
    */
    @SerializedName("BackupFileCount")
    @Expose
    private Long BackupFileCount;

    /**
    * 备份文件总大小（字节）
    */
    @SerializedName("BackupFileSize")
    @Expose
    private Long BackupFileSize;

    /**
    * Binlog文件数量
    */
    @SerializedName("BinlogFileCount")
    @Expose
    private Long BinlogFileCount;

    /**
    * Binlog文件总大小（字节）
    */
    @SerializedName("BinlogFileSize")
    @Expose
    private Long BinlogFileSize;

    /**
    * RedoLog文件数量
    */
    @SerializedName("RedoLogFileCount")
    @Expose
    private Long RedoLogFileCount;

    /**
    * RedoLog文件总大小（字节）
    */
    @SerializedName("RedoLogFileSize")
    @Expose
    private Long RedoLogFileSize;

    /**
    * 保险箱状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 备份保留时长（秒）
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * 锁定时间
    */
    @SerializedName("LockedTime")
    @Expose
    private String LockedTime;

    /**
    * 关联任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 保险箱所在地域
    */
    @SerializedName("VaultRegion")
    @Expose
    private String VaultRegion;

    /**
    * 自动投递关系
    */
    @SerializedName("AutoCopyConfigs")
    @Expose
    private AutoCopyConfig [] AutoCopyConfigs;

    /**
     * Get 保险箱ID 
     * @return VaultId 保险箱ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 保险箱ID
     * @param VaultId 保险箱ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 保险箱名称 
     * @return VaultName 保险箱名称
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 保险箱名称
     * @param VaultName 保险箱名称
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 保险箱描述 
     * @return VaultDescribe 保险箱描述
     */
    public String getVaultDescribe() {
        return this.VaultDescribe;
    }

    /**
     * Set 保险箱描述
     * @param VaultDescribe 保险箱描述
     */
    public void setVaultDescribe(String VaultDescribe) {
        this.VaultDescribe = VaultDescribe;
    }

    /**
     * Get 加密密钥ID 
     * @return KeyId 加密密钥ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 加密密钥ID
     * @param KeyId 加密密钥ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥所在地域 
     * @return KeyRegion 密钥所在地域
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set 密钥所在地域
     * @param KeyRegion 密钥所在地域
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get 密钥类型 
     * @return KeyType 密钥类型
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 密钥类型
     * @param KeyType 密钥类型
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 备份文件数量 
     * @return BackupFileCount 备份文件数量
     */
    public Long getBackupFileCount() {
        return this.BackupFileCount;
    }

    /**
     * Set 备份文件数量
     * @param BackupFileCount 备份文件数量
     */
    public void setBackupFileCount(Long BackupFileCount) {
        this.BackupFileCount = BackupFileCount;
    }

    /**
     * Get 备份文件总大小（字节） 
     * @return BackupFileSize 备份文件总大小（字节）
     */
    public Long getBackupFileSize() {
        return this.BackupFileSize;
    }

    /**
     * Set 备份文件总大小（字节）
     * @param BackupFileSize 备份文件总大小（字节）
     */
    public void setBackupFileSize(Long BackupFileSize) {
        this.BackupFileSize = BackupFileSize;
    }

    /**
     * Get Binlog文件数量 
     * @return BinlogFileCount Binlog文件数量
     */
    public Long getBinlogFileCount() {
        return this.BinlogFileCount;
    }

    /**
     * Set Binlog文件数量
     * @param BinlogFileCount Binlog文件数量
     */
    public void setBinlogFileCount(Long BinlogFileCount) {
        this.BinlogFileCount = BinlogFileCount;
    }

    /**
     * Get Binlog文件总大小（字节） 
     * @return BinlogFileSize Binlog文件总大小（字节）
     */
    public Long getBinlogFileSize() {
        return this.BinlogFileSize;
    }

    /**
     * Set Binlog文件总大小（字节）
     * @param BinlogFileSize Binlog文件总大小（字节）
     */
    public void setBinlogFileSize(Long BinlogFileSize) {
        this.BinlogFileSize = BinlogFileSize;
    }

    /**
     * Get RedoLog文件数量 
     * @return RedoLogFileCount RedoLog文件数量
     */
    public Long getRedoLogFileCount() {
        return this.RedoLogFileCount;
    }

    /**
     * Set RedoLog文件数量
     * @param RedoLogFileCount RedoLog文件数量
     */
    public void setRedoLogFileCount(Long RedoLogFileCount) {
        this.RedoLogFileCount = RedoLogFileCount;
    }

    /**
     * Get RedoLog文件总大小（字节） 
     * @return RedoLogFileSize RedoLog文件总大小（字节）
     */
    public Long getRedoLogFileSize() {
        return this.RedoLogFileSize;
    }

    /**
     * Set RedoLog文件总大小（字节）
     * @param RedoLogFileSize RedoLog文件总大小（字节）
     */
    public void setRedoLogFileSize(Long RedoLogFileSize) {
        this.RedoLogFileSize = RedoLogFileSize;
    }

    /**
     * Get 保险箱状态 
     * @return Status 保险箱状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 保险箱状态
     * @param Status 保险箱状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 备份保留时长（秒） 
     * @return BackupSaveSeconds 备份保留时长（秒）
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set 备份保留时长（秒）
     * @param BackupSaveSeconds 备份保留时长（秒）
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    /**
     * Get 锁定时间 
     * @return LockedTime 锁定时间
     */
    public String getLockedTime() {
        return this.LockedTime;
    }

    /**
     * Set 锁定时间
     * @param LockedTime 锁定时间
     */
    public void setLockedTime(String LockedTime) {
        this.LockedTime = LockedTime;
    }

    /**
     * Get 关联任务列表 
     * @return Tasks 关联任务列表
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 关联任务列表
     * @param Tasks 关联任务列表
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 保险箱所在地域 
     * @return VaultRegion 保险箱所在地域
     */
    public String getVaultRegion() {
        return this.VaultRegion;
    }

    /**
     * Set 保险箱所在地域
     * @param VaultRegion 保险箱所在地域
     */
    public void setVaultRegion(String VaultRegion) {
        this.VaultRegion = VaultRegion;
    }

    /**
     * Get 自动投递关系 
     * @return AutoCopyConfigs 自动投递关系
     */
    public AutoCopyConfig [] getAutoCopyConfigs() {
        return this.AutoCopyConfigs;
    }

    /**
     * Set 自动投递关系
     * @param AutoCopyConfigs 自动投递关系
     */
    public void setAutoCopyConfigs(AutoCopyConfig [] AutoCopyConfigs) {
        this.AutoCopyConfigs = AutoCopyConfigs;
    }

    public DescribeVaultsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVaultsItem(DescribeVaultsItem source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.VaultDescribe != null) {
            this.VaultDescribe = new String(source.VaultDescribe);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.BackupFileCount != null) {
            this.BackupFileCount = new Long(source.BackupFileCount);
        }
        if (source.BackupFileSize != null) {
            this.BackupFileSize = new Long(source.BackupFileSize);
        }
        if (source.BinlogFileCount != null) {
            this.BinlogFileCount = new Long(source.BinlogFileCount);
        }
        if (source.BinlogFileSize != null) {
            this.BinlogFileSize = new Long(source.BinlogFileSize);
        }
        if (source.RedoLogFileCount != null) {
            this.RedoLogFileCount = new Long(source.RedoLogFileCount);
        }
        if (source.RedoLogFileSize != null) {
            this.RedoLogFileSize = new Long(source.RedoLogFileSize);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.LockedTime != null) {
            this.LockedTime = new String(source.LockedTime);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.VaultRegion != null) {
            this.VaultRegion = new String(source.VaultRegion);
        }
        if (source.AutoCopyConfigs != null) {
            this.AutoCopyConfigs = new AutoCopyConfig[source.AutoCopyConfigs.length];
            for (int i = 0; i < source.AutoCopyConfigs.length; i++) {
                this.AutoCopyConfigs[i] = new AutoCopyConfig(source.AutoCopyConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "VaultDescribe", this.VaultDescribe);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "BackupFileCount", this.BackupFileCount);
        this.setParamSimple(map, prefix + "BackupFileSize", this.BackupFileSize);
        this.setParamSimple(map, prefix + "BinlogFileCount", this.BinlogFileCount);
        this.setParamSimple(map, prefix + "BinlogFileSize", this.BinlogFileSize);
        this.setParamSimple(map, prefix + "RedoLogFileCount", this.RedoLogFileCount);
        this.setParamSimple(map, prefix + "RedoLogFileSize", this.RedoLogFileSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "LockedTime", this.LockedTime);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "VaultRegion", this.VaultRegion);
        this.setParamArrayObj(map, prefix + "AutoCopyConfigs.", this.AutoCopyConfigs);

    }
}

