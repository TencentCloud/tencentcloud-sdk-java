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
    * <p>过滤阶段接口</p>
    */
    @SerializedName("FilterVerb")
    @Expose
    private String FilterVerb;

    /**
    * <p>打分阶段扩展接口</p>
    */
    @SerializedName("PrioritizeVerb")
    @Expose
    private String PrioritizeVerb;

    /**
    * <p>打分阶段节点分数的权重,取值范围限定(0,2】</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>扩展调度器(Extender)管理的扩展资源</p>
    */
    @SerializedName("ManagedResources")
    @Expose
    private ExtenderManagedResource [] ManagedResources;

    /**
    * <p>extender客户端配置</p>
    */
    @SerializedName("ExtenderClientConfig")
    @Expose
    private ExtenderClientConfig ExtenderClientConfig;

    /**
    * <p>抢占接口</p>
    */
    @SerializedName("PreemptVerb")
    @Expose
    private String PreemptVerb;

    /**
    * <p>节点缓存能力</p>
    */
    @SerializedName("NodeCacheCapable")
    @Expose
    private Boolean NodeCacheCapable;

    /**
     * Get <p>过滤阶段接口</p> 
     * @return FilterVerb <p>过滤阶段接口</p>
     */
    public String getFilterVerb() {
        return this.FilterVerb;
    }

    /**
     * Set <p>过滤阶段接口</p>
     * @param FilterVerb <p>过滤阶段接口</p>
     */
    public void setFilterVerb(String FilterVerb) {
        this.FilterVerb = FilterVerb;
    }

    /**
     * Get <p>打分阶段扩展接口</p> 
     * @return PrioritizeVerb <p>打分阶段扩展接口</p>
     */
    public String getPrioritizeVerb() {
        return this.PrioritizeVerb;
    }

    /**
     * Set <p>打分阶段扩展接口</p>
     * @param PrioritizeVerb <p>打分阶段扩展接口</p>
     */
    public void setPrioritizeVerb(String PrioritizeVerb) {
        this.PrioritizeVerb = PrioritizeVerb;
    }

    /**
     * Get <p>打分阶段节点分数的权重,取值范围限定(0,2】</p> 
     * @return Weight <p>打分阶段节点分数的权重,取值范围限定(0,2】</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>打分阶段节点分数的权重,取值范围限定(0,2】</p>
     * @param Weight <p>打分阶段节点分数的权重,取值范围限定(0,2】</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>扩展调度器(Extender)管理的扩展资源</p> 
     * @return ManagedResources <p>扩展调度器(Extender)管理的扩展资源</p>
     */
    public ExtenderManagedResource [] getManagedResources() {
        return this.ManagedResources;
    }

    /**
     * Set <p>扩展调度器(Extender)管理的扩展资源</p>
     * @param ManagedResources <p>扩展调度器(Extender)管理的扩展资源</p>
     */
    public void setManagedResources(ExtenderManagedResource [] ManagedResources) {
        this.ManagedResources = ManagedResources;
    }

    /**
     * Get <p>extender客户端配置</p> 
     * @return ExtenderClientConfig <p>extender客户端配置</p>
     */
    public ExtenderClientConfig getExtenderClientConfig() {
        return this.ExtenderClientConfig;
    }

    /**
     * Set <p>extender客户端配置</p>
     * @param ExtenderClientConfig <p>extender客户端配置</p>
     */
    public void setExtenderClientConfig(ExtenderClientConfig ExtenderClientConfig) {
        this.ExtenderClientConfig = ExtenderClientConfig;
    }

    /**
     * Get <p>抢占接口</p> 
     * @return PreemptVerb <p>抢占接口</p>
     */
    public String getPreemptVerb() {
        return this.PreemptVerb;
    }

    /**
     * Set <p>抢占接口</p>
     * @param PreemptVerb <p>抢占接口</p>
     */
    public void setPreemptVerb(String PreemptVerb) {
        this.PreemptVerb = PreemptVerb;
    }

    /**
     * Get <p>节点缓存能力</p> 
     * @return NodeCacheCapable <p>节点缓存能力</p>
     */
    public Boolean getNodeCacheCapable() {
        return this.NodeCacheCapable;
    }

    /**
     * Set <p>节点缓存能力</p>
     * @param NodeCacheCapable <p>节点缓存能力</p>
     */
    public void setNodeCacheCapable(Boolean NodeCacheCapable) {
        this.NodeCacheCapable = NodeCacheCapable;
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
        if (source.PreemptVerb != null) {
            this.PreemptVerb = new String(source.PreemptVerb);
        }
        if (source.NodeCacheCapable != null) {
            this.NodeCacheCapable = new Boolean(source.NodeCacheCapable);
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
        this.setParamSimple(map, prefix + "PreemptVerb", this.PreemptVerb);
        this.setParamSimple(map, prefix + "NodeCacheCapable", this.NodeCacheCapable);

    }
}

