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

public class ModifyVaultRequest extends AbstractModel {

    /**
    * 保险箱ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 保险箱名称，最大255字符
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 保险箱描述，最大1024字符
    */
    @SerializedName("VaultDescribe")
    @Expose
    private String VaultDescribe;

    /**
    * 备份保留时长（秒），范围: (0, 632448000]
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * 加密密钥ID，最大36字符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥类型，可选值: cloud、custom
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 密钥所在地域，最大32字符
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * 是否锁定保险箱
    */
    @SerializedName("IsLock")
    @Expose
    private Boolean IsLock;

    /**
    * 锁定到期时间，格式: 2006-01-02 15:04:05，锁定时间距当前最多15天
    */
    @SerializedName("LockedTime")
    @Expose
    private String LockedTime;

    /**
    * 是否加密
    */
    @SerializedName("IsEncryption")
    @Expose
    private Boolean IsEncryption;

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
     * Get 保险箱名称，最大255字符 
     * @return VaultName 保险箱名称，最大255字符
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 保险箱名称，最大255字符
     * @param VaultName 保险箱名称，最大255字符
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 保险箱描述，最大1024字符 
     * @return VaultDescribe 保险箱描述，最大1024字符
     */
    public String getVaultDescribe() {
        return this.VaultDescribe;
    }

    /**
     * Set 保险箱描述，最大1024字符
     * @param VaultDescribe 保险箱描述，最大1024字符
     */
    public void setVaultDescribe(String VaultDescribe) {
        this.VaultDescribe = VaultDescribe;
    }

    /**
     * Get 备份保留时长（秒），范围: (0, 632448000] 
     * @return BackupSaveSeconds 备份保留时长（秒），范围: (0, 632448000]
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set 备份保留时长（秒），范围: (0, 632448000]
     * @param BackupSaveSeconds 备份保留时长（秒），范围: (0, 632448000]
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    /**
     * Get 加密密钥ID，最大36字符 
     * @return KeyId 加密密钥ID，最大36字符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 加密密钥ID，最大36字符
     * @param KeyId 加密密钥ID，最大36字符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥类型，可选值: cloud、custom 
     * @return KeyType 密钥类型，可选值: cloud、custom
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 密钥类型，可选值: cloud、custom
     * @param KeyType 密钥类型，可选值: cloud、custom
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 密钥所在地域，最大32字符 
     * @return KeyRegion 密钥所在地域，最大32字符
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set 密钥所在地域，最大32字符
     * @param KeyRegion 密钥所在地域，最大32字符
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get 是否锁定保险箱 
     * @return IsLock 是否锁定保险箱
     */
    public Boolean getIsLock() {
        return this.IsLock;
    }

    /**
     * Set 是否锁定保险箱
     * @param IsLock 是否锁定保险箱
     */
    public void setIsLock(Boolean IsLock) {
        this.IsLock = IsLock;
    }

    /**
     * Get 锁定到期时间，格式: 2006-01-02 15:04:05，锁定时间距当前最多15天 
     * @return LockedTime 锁定到期时间，格式: 2006-01-02 15:04:05，锁定时间距当前最多15天
     */
    public String getLockedTime() {
        return this.LockedTime;
    }

    /**
     * Set 锁定到期时间，格式: 2006-01-02 15:04:05，锁定时间距当前最多15天
     * @param LockedTime 锁定到期时间，格式: 2006-01-02 15:04:05，锁定时间距当前最多15天
     */
    public void setLockedTime(String LockedTime) {
        this.LockedTime = LockedTime;
    }

    /**
     * Get 是否加密 
     * @return IsEncryption 是否加密
     */
    public Boolean getIsEncryption() {
        return this.IsEncryption;
    }

    /**
     * Set 是否加密
     * @param IsEncryption 是否加密
     */
    public void setIsEncryption(Boolean IsEncryption) {
        this.IsEncryption = IsEncryption;
    }

    public ModifyVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVaultRequest(ModifyVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.VaultDescribe != null) {
            this.VaultDescribe = new String(source.VaultDescribe);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.IsLock != null) {
            this.IsLock = new Boolean(source.IsLock);
        }
        if (source.LockedTime != null) {
            this.LockedTime = new String(source.LockedTime);
        }
        if (source.IsEncryption != null) {
            this.IsEncryption = new Boolean(source.IsEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "VaultDescribe", this.VaultDescribe);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "IsLock", this.IsLock);
        this.setParamSimple(map, prefix + "LockedTime", this.LockedTime);
        this.setParamSimple(map, prefix + "IsEncryption", this.IsEncryption);

    }
}

