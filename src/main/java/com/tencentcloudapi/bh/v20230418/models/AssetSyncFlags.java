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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetSyncFlags extends AbstractModel {

    /**
    * 是否已完成角色授权
    */
    @SerializedName("RoleGranted")
    @Expose
    private Boolean RoleGranted;

    /**
    * 是否已开启自动资产同步
    */
    @SerializedName("AutoSync")
    @Expose
    private Boolean AutoSync;

    /**
     * Get 是否已完成角色授权 
     * @return RoleGranted 是否已完成角色授权
     */
    public Boolean getRoleGranted() {
        return this.RoleGranted;
    }

    /**
     * Set 是否已完成角色授权
     * @param RoleGranted 是否已完成角色授权
     */
    public void setRoleGranted(Boolean RoleGranted) {
        this.RoleGranted = RoleGranted;
    }

    /**
     * Get 是否已开启自动资产同步 
     * @return AutoSync 是否已开启自动资产同步
     */
    public Boolean getAutoSync() {
        return this.AutoSync;
    }

    /**
     * Set 是否已开启自动资产同步
     * @param AutoSync 是否已开启自动资产同步
     */
    public void setAutoSync(Boolean AutoSync) {
        this.AutoSync = AutoSync;
    }

    public AssetSyncFlags() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetSyncFlags(AssetSyncFlags source) {
        if (source.RoleGranted != null) {
            this.RoleGranted = new Boolean(source.RoleGranted);
        }
        if (source.AutoSync != null) {
            this.AutoSync = new Boolean(source.AutoSync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleGranted", this.RoleGranted);
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);

    }
}

