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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncImageRegistryRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>是否同步全部仓库</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>待同步的镜像仓库Id列表</p>
    */
    @SerializedName("RegistryIds")
    @Expose
    private Long [] RegistryIds;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>是否同步全部仓库</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return All <p>是否同步全部仓库</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>是否同步全部仓库</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param All <p>是否同步全部仓库</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>待同步的镜像仓库Id列表</p> 
     * @return RegistryIds <p>待同步的镜像仓库Id列表</p>
     */
    public Long [] getRegistryIds() {
        return this.RegistryIds;
    }

    /**
     * Set <p>待同步的镜像仓库Id列表</p>
     * @param RegistryIds <p>待同步的镜像仓库Id列表</p>
     */
    public void setRegistryIds(Long [] RegistryIds) {
        this.RegistryIds = RegistryIds;
    }

    public SyncImageRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncImageRegistryRequest(SyncImageRegistryRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "RegistryIds.", this.RegistryIds);

    }
}

