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

public class CopyBackupToVaultRequest extends AbstractModel {

    /**
    * 目标保险箱ID，备份文件将复制到此保险箱
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 备份文件ID列表，支持批量复制多个备份文件
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
     * Get 目标保险箱ID，备份文件将复制到此保险箱 
     * @return VaultId 目标保险箱ID，备份文件将复制到此保险箱
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 目标保险箱ID，备份文件将复制到此保险箱
     * @param VaultId 目标保险箱ID，备份文件将复制到此保险箱
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 备份文件ID列表，支持批量复制多个备份文件 
     * @return BackupIds 备份文件ID列表，支持批量复制多个备份文件
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set 备份文件ID列表，支持批量复制多个备份文件
     * @param BackupIds 备份文件ID列表，支持批量复制多个备份文件
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    public CopyBackupToVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyBackupToVaultRequest(CopyBackupToVaultRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);

    }
}

