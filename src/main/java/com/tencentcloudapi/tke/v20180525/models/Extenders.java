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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Extenders extends AbstractModel {

    /**
    * 过滤阶段接口
    */
    @SerializedName("FilterVerb")
    @Expose
    private String FilterVerb;

    /**
    * 打分阶段扩展接口
    */
    @SerializedName("PrioritizeVerb")
    @Expose
    private String PrioritizeVerb;

    /**
    * 打分阶段节点分数的权重,取值范围限定(0,2】
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 扩展调度器(Extender)管理的扩展资源
    */
    @SerializedName("ManagedResources")
    @Expose
    private ExtenderManagedResource [] ManagedResources;

    /**
    * extender客户端配置
    */
    @SerializedName("ExtenderClientConfig")
    @Expose
    private ExtenderClientConfig ExtenderClientConfig;

    /**
     * Get 过滤阶段接口 
     * @return FilterVerb 过滤阶段接口
     */
    public String getFilterVerb() {
        return this.FilterVerb;
    }

    /**
     * Set 过滤阶段接口
     * @param FilterVerb 过滤阶段接口
     */
    public void setFilterVerb(String FilterVerb) {
        this.FilterVerb = FilterVerb;
    }

    /**
     * Get 打分阶段扩展接口 
     * @return PrioritizeVerb 打分阶段扩展接口
     */
    public String getPrioritizeVerb() {
        return this.PrioritizeVerb;
    }

    /**
     * Set 打分阶段扩展接口
     * @param PrioritizeVerb 打分阶段扩展接口
     */
    public void setPrioritizeVerb(String PrioritizeVerb) {
        this.PrioritizeVerb = PrioritizeVerb;
    }

    /**
     * Get 打分阶段节点分数的权重,取值范围限定(0,2】 
     * @return Weight 打分阶段节点分数的权重,取值范围限定(0,2】
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 打分阶段节点分数的权重,取值范围限定(0,2】
     * @param Weight 打分阶段节点分数的权重,取值范围限定(0,2】
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 扩展调度器(Extender)管理的扩展资源 
     * @return ManagedResources 扩展调度器(Extender)管理的扩展资源
     */
    public ExtenderManagedResource [] getManagedResources() {
        return this.ManagedResources;
    }

    /**
     * Set 扩展调度器(Extender)管理的扩展资源
     * @param ManagedResources 扩展调度器(Extender)管理的扩展资源
     */
    public void setManagedResources(ExtenderManagedResource [] ManagedResources) {
        this.ManagedResources = ManagedResources;
    }

    /**
     * Get extender客户端配置 
     * @return ExtenderClientConfig extender客户端配置
     */
    public ExtenderClientConfig getExtenderClientConfig() {
        return this.ExtenderClientConfig;
    }

    /**
     * Set extender客户端配置
     * @param ExtenderClientConfig extender客户端配置
     */
    public void setExtenderClientConfig(ExtenderClientConfig ExtenderClientConfig) {
        this.ExtenderClientConfig = ExtenderClientConfig;
    }

    public Extenders() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Extenders(Extenders source) {
        if (source.FilterVerb != null) {
            this.FilterVerb = new String(source.FilterVerb);
        }
        if (source.PrioritizeVerb != null) {
            this.PrioritizeVerb = new String(source.PrioritizeVerb);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.ManagedResources != null) {
            this.ManagedResources = new ExtenderManagedResource[source.ManagedResources.length];
            for (int i = 0; i < source.ManagedResources.length; i++) {
                this.ManagedResources[i] = new ExtenderManagedResource(source.ManagedResources[i]);
            }
        }
        if (source.ExtenderClientConfig != null) {
            this.ExtenderClientConfig = new ExtenderClientConfig(source.ExtenderClientConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterVerb", this.FilterVerb);
        this.setParamSimple(map, prefix + "PrioritizeVerb", this.PrioritizeVerb);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArrayObj(map, prefix + "ManagedResources.", this.ManagedResources);
        this.setParamObj(map, prefix + "ExtenderClientConfig.", this.ExtenderClientConfig);

    }
}

