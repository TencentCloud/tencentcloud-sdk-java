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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupVaultAttributeRequest extends AbstractModel {

    /**
    * 备份库ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 备份库名称
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 备份库描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 备份库ID 
     * @return VaultId 备份库ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 备份库ID
     * @param VaultId 备份库ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 备份库名称 
     * @return VaultName 备份库名称
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 备份库名称
     * @param VaultName 备份库名称
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 备份库描述 
     * @return Description 备份库描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备份库描述
     * @param Description 备份库描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyBackupVaultAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupVaultAttributeRequest(ModifyBackupVaultAttributeRequest source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

