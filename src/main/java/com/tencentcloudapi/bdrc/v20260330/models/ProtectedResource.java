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

public class ProtectedResource extends AbstractModel {

    /**
    * 资源类型（与请求 SitePairType 一致，如 DISK/CFS/INSTANCE）
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 该类型下被保护的源端资源ID列表（DISK:disk-xxx / CFS:cfs-xxx / INSTANCE:ins-xxx）
    */
    @SerializedName("ResourceIdSet")
    @Expose
    private String [] ResourceIdSet;

    /**
     * Get 资源类型（与请求 SitePairType 一致，如 DISK/CFS/INSTANCE） 
     * @return ResourceType 资源类型（与请求 SitePairType 一致，如 DISK/CFS/INSTANCE）
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型（与请求 SitePairType 一致，如 DISK/CFS/INSTANCE）
     * @param ResourceType 资源类型（与请求 SitePairType 一致，如 DISK/CFS/INSTANCE）
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 该类型下被保护的源端资源ID列表（DISK:disk-xxx / CFS:cfs-xxx / INSTANCE:ins-xxx） 
     * @return ResourceIdSet 该类型下被保护的源端资源ID列表（DISK:disk-xxx / CFS:cfs-xxx / INSTANCE:ins-xxx）
     */
    public String [] getResourceIdSet() {
        return this.ResourceIdSet;
    }

    /**
     * Set 该类型下被保护的源端资源ID列表（DISK:disk-xxx / CFS:cfs-xxx / INSTANCE:ins-xxx）
     * @param ResourceIdSet 该类型下被保护的源端资源ID列表（DISK:disk-xxx / CFS:cfs-xxx / INSTANCE:ins-xxx）
     */
    public void setResourceIdSet(String [] ResourceIdSet) {
        this.ResourceIdSet = ResourceIdSet;
    }

    public ProtectedResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectedResource(ProtectedResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceIdSet != null) {
            this.ResourceIdSet = new String[source.ResourceIdSet.length];
            for (int i = 0; i < source.ResourceIdSet.length; i++) {
                this.ResourceIdSet[i] = new String(source.ResourceIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ResourceIdSet.", this.ResourceIdSet);

    }
}

