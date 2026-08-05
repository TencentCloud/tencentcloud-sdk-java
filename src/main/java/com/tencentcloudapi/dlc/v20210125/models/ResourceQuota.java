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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceQuota extends AbstractModel {

    /**
    * <p>可售卖资源规格</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private ResourceSpec ResourceSpec;

    /**
    * <p>配额数量</p><p>请注意，CPU类型计费项为32的整数倍，GPU类型计费项为1的整数倍。</p>
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get <p>可售卖资源规格</p> 
     * @return ResourceSpec <p>可售卖资源规格</p>
     */
    public ResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>可售卖资源规格</p>
     * @param ResourceSpec <p>可售卖资源规格</p>
     */
    public void setResourceSpec(ResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>配额数量</p><p>请注意，CPU类型计费项为32的整数倍，GPU类型计费项为1的整数倍。</p> 
     * @return Quota <p>配额数量</p><p>请注意，CPU类型计费项为32的整数倍，GPU类型计费项为1的整数倍。</p>
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set <p>配额数量</p><p>请注意，CPU类型计费项为32的整数倍，GPU类型计费项为1的整数倍。</p>
     * @param Quota <p>配额数量</p><p>请注意，CPU类型计费项为32的整数倍，GPU类型计费项为1的整数倍。</p>
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public ResourceQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceQuota(ResourceQuota source) {
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new ResourceSpec(source.ResourceSpec);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

