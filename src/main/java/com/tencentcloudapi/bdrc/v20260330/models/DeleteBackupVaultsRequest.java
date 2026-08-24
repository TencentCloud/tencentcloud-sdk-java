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

public class DeleteBackupVaultsRequest extends AbstractModel {

    /**
    * 备份库 ID 列表
    */
    @SerializedName("VaultIds")
    @Expose
    private String [] VaultIds;

    /**
     * Get 备份库 ID 列表 
     * @return VaultIds 备份库 ID 列表
     */
    public String [] getVaultIds() {
        return this.VaultIds;
    }

    /**
     * Set 备份库 ID 列表
     * @param VaultIds 备份库 ID 列表
     */
    public void setVaultIds(String [] VaultIds) {
        this.VaultIds = VaultIds;
    }

    public DeleteBackupVaultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupVaultsRequest(DeleteBackupVaultsRequest source) {
        if (source.VaultIds != null) {
            this.VaultIds = new String[source.VaultIds.length];
            for (int i = 0; i < source.VaultIds.length; i++) {
                this.VaultIds[i] = new String(source.VaultIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VaultIds.", this.VaultIds);

    }
}

