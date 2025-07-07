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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncAssetImageRegistryAssetRequest extends AbstractModel {

    /**
    * 是否同步所有镜像仓库
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 需要同步的部分镜像仓库
    */
    @SerializedName("RegistryIds")
    @Expose
    private Long [] RegistryIds;

    /**
     * Get 是否同步所有镜像仓库 
     * @return All 是否同步所有镜像仓库
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否同步所有镜像仓库
     * @param All 是否同步所有镜像仓库
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 需要同步的部分镜像仓库 
     * @return RegistryIds 需要同步的部分镜像仓库
     */
    public Long [] getRegistryIds() {
        return this.RegistryIds;
    }

    /**
     * Set 需要同步的部分镜像仓库
     * @param RegistryIds 需要同步的部分镜像仓库
     */
    public void setRegistryIds(Long [] RegistryIds) {
        this.RegistryIds = RegistryIds;
    }

    public SyncAssetImageRegistryAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncAssetImageRegistryAssetRequest(SyncAssetImageRegistryAssetRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.RegistryIds != null) {
            this.RegistryIds = new Long[source.RegistryIds.length];
            for (int i = 0; i < source.RegistryIds.length; i++) {
                this.RegistryIds[i] = new Long(source.RegistryIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "RegistryIds.", this.RegistryIds);

    }
}

