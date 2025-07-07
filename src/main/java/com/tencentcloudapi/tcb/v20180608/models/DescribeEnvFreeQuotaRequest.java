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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvFreeQuotaRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 资源类型：可选值：CDN, COS, FLEXDB, HOSTING, SCF
不传则返回全部资源指标
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 资源类型：可选值：CDN, COS, FLEXDB, HOSTING, SCF
不传则返回全部资源指标 
     * @return ResourceTypes 资源类型：可选值：CDN, COS, FLEXDB, HOSTING, SCF
不传则返回全部资源指标
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 资源类型：可选值：CDN, COS, FLEXDB, HOSTING, SCF
不传则返回全部资源指标
     * @param ResourceTypes 资源类型：可选值：CDN, COS, FLEXDB, HOSTING, SCF
不传则返回全部资源指标
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    public DescribeEnvFreeQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvFreeQuotaRequest(DescribeEnvFreeQuotaRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);

    }
}

