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

public class VaultInfo extends AbstractModel {

    /**
    * 保险箱id
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 保险箱name
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 保险箱地域
    */
    @SerializedName("VaultRegion")
    @Expose
    private String VaultRegion;

    /**
    * 保险箱状态
    */
    @SerializedName("VaultStatus")
    @Expose
    private String VaultStatus;

    /**
    * 备份保留时间
    */
    @SerializedName("BackupSaveSeconds")
    @Expose
    private Long BackupSaveSeconds;

    /**
     * Get 保险箱id 
     * @return VaultId 保险箱id
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 保险箱id
     * @param VaultId 保险箱id
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 保险箱name 
     * @return VaultName 保险箱name
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 保险箱name
     * @param VaultName 保险箱name
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 保险箱地域 
     * @return VaultRegion 保险箱地域
     */
    public String getVaultRegion() {
        return this.VaultRegion;
    }

    /**
     * Set 保险箱地域
     * @param VaultRegion 保险箱地域
     */
    public void setVaultRegion(String VaultRegion) {
        this.VaultRegion = VaultRegion;
    }

    /**
     * Get 保险箱状态 
     * @return VaultStatus 保险箱状态
     */
    public String getVaultStatus() {
        return this.VaultStatus;
    }

    /**
     * Set 保险箱状态
     * @param VaultStatus 保险箱状态
     */
    public void setVaultStatus(String VaultStatus) {
        this.VaultStatus = VaultStatus;
    }

    /**
     * Get 备份保留时间 
     * @return BackupSaveSeconds 备份保留时间
     */
    public Long getBackupSaveSeconds() {
        return this.BackupSaveSeconds;
    }

    /**
     * Set 备份保留时间
     * @param BackupSaveSeconds 备份保留时间
     */
    public void setBackupSaveSeconds(Long BackupSaveSeconds) {
        this.BackupSaveSeconds = BackupSaveSeconds;
    }

    public VaultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VaultInfo(VaultInfo source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.VaultRegion != null) {
            this.VaultRegion = new String(source.VaultRegion);
        }
        if (source.VaultStatus != null) {
            this.VaultStatus = new String(source.VaultStatus);
        }
        if (source.BackupSaveSeconds != null) {
            this.BackupSaveSeconds = new Long(source.BackupSaveSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "VaultRegion", this.VaultRegion);
        this.setParamSimple(map, prefix + "VaultStatus", this.VaultStatus);
        this.setParamSimple(map, prefix + "BackupSaveSeconds", this.BackupSaveSeconds);

    }
}

