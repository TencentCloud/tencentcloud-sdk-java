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

public class ResourceUsage extends AbstractModel {

    /**
    * <p>资源规格</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private ResourceSpec ResourceSpec;

    /**
    * <p>最小用量</p>
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * <p>最大用量</p>
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
     * Get <p>资源规格</p> 
     * @return ResourceSpec <p>资源规格</p>
     */
    public ResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>资源规格</p>
     * @param ResourceSpec <p>资源规格</p>
     */
    public void setResourceSpec(ResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>最小用量</p> 
     * @return Min <p>最小用量</p>
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set <p>最小用量</p>
     * @param Min <p>最小用量</p>
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get <p>最大用量</p> 
     * @return Max <p>最大用量</p>
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set <p>最大用量</p>
     * @param Max <p>最大用量</p>
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    public ResourceUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceUsage(ResourceUsage source) {
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new ResourceSpec(source.ResourceSpec);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

