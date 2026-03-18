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

public class CreateVaultRequest extends AbstractModel {

    /**
    * 保险箱名称，长度必须大于0
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 备份保留时长（秒），必须大于0
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
    * 保险箱描述
    */
    @SerializedName("VaultDescribe")
    @Expose
    private String VaultDescribe;

    /**
    * KMS密钥ID，长度0-36字符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥类型，可选值：cloud（云托管密钥）、custom（自定义密钥）
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 密钥所在地域，长度0-32字符
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * 锁定时间，格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("LockedTime")
    @Expose
    private String LockedTime;

    /**
     * Get 保险箱名称，长度必须大于0 
     * @return VaultName 保险箱名称，长度必须大于0
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 保险箱名称，长度必须大于0
     * @param VaultName 保险箱名称，长度必须大于0
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 备份保留时长（秒），必须大于0 
     * @return BackupSaveSeconds 备份保留时长（秒），必须大于0
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set 备份保留时长（秒），必须大于0
     * @param BackupSaveSeconds 备份保留时长（秒），必须大于0
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
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
     * Get KMS密钥ID，长度0-36字符 
     * @return KeyId KMS密钥ID，长度0-36字符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set KMS密钥ID，长度0-36字符
     * @param KeyId KMS密钥ID，长度0-36字符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥类型，可选值：cloud（云托管密钥）、custom（自定义密钥） 
     * @return KeyType 密钥类型，可选值：cloud（云托管密钥）、custom（自定义密钥）
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 密钥类型，可选值：cloud（云托管密钥）、custom（自定义密钥）
     * @param KeyType 密钥类型，可选值：cloud（云托管密钥）、custom（自定义密钥）
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 密钥所在地域，长度0-32字符 
     * @return KeyRegion 密钥所在地域，长度0-32字符
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set 密钥所在地域，长度0-32字符
     * @param KeyRegion 密钥所在地域，长度0-32字符
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get 锁定时间，格式：YYYY-MM-DD HH:mm:ss 
     * @return LockedTime 锁定时间，格式：YYYY-MM-DD HH:mm:ss
     */
    public String getLockedTime() {
        return this.LockedTime;
    }

    /**
     * Set 锁定时间，格式：YYYY-MM-DD HH:mm:ss
     * @param LockedTime 锁定时间，格式：YYYY-MM-DD HH:mm:ss
     */
    public void setLockedTime(String LockedTime) {
        this.LockedTime = LockedTime;
    }

    public CreateVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVaultRequest(CreateVaultRequest source) {
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
        if (source.VaultDescribe != null) {
            this.VaultDescribe = new String(source.VaultDescribe);
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
        if (source.LockedTime != null) {
            this.LockedTime = new String(source.LockedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);
        this.setParamSimple(map, prefix + "VaultDescribe", this.VaultDescribe);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "LockedTime", this.LockedTime);

    }
}

