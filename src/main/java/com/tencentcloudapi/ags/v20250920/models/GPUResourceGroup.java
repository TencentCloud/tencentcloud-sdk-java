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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUResourceGroup extends AbstractModel {

    /**
    * GPU 资源组 ID。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源组固定规格；已下架规格的已购组仍可查询。
    */
    @SerializedName("Spec")
    @Expose
    private GPUResourceGroupSpec Spec;

    /**
    * 当前资源统计。
    */
    @SerializedName("Statistics")
    @Expose
    private GPUResourceGroupStatistics Statistics;

    /**
     * Get GPU 资源组 ID。 
     * @return ResourceGroupId GPU 资源组 ID。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set GPU 资源组 ID。
     * @param ResourceGroupId GPU 资源组 ID。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组名称。 
     * @return Name 资源组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源组名称。
     * @param Name 资源组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源组固定规格；已下架规格的已购组仍可查询。 
     * @return Spec 资源组固定规格；已下架规格的已购组仍可查询。
     */
    public GPUResourceGroupSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set 资源组固定规格；已下架规格的已购组仍可查询。
     * @param Spec 资源组固定规格；已下架规格的已购组仍可查询。
     */
    public void setSpec(GPUResourceGroupSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 当前资源统计。 
     * @return Statistics 当前资源统计。
     */
    public GPUResourceGroupStatistics getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 当前资源统计。
     * @param Statistics 当前资源统计。
     */
    public void setStatistics(GPUResourceGroupStatistics Statistics) {
        this.Statistics = Statistics;
    }

    public GPUResourceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUResourceGroup(GPUResourceGroup source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new GPUResourceGroupSpec(source.Spec);
        }
        if (source.Statistics != null) {
            this.Statistics = new GPUResourceGroupStatistics(source.Statistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);

    }
}

