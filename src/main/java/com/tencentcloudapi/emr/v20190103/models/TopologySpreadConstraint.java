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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologySpreadConstraint extends AbstractModel {

    /**
    * <p>最大偏差值</p>
    */
    @SerializedName("MaxSkew")
    @Expose
    private Long MaxSkew;

    /**
    * <p>拓扑域键</p>
    */
    @SerializedName("TopologyKey")
    @Expose
    private String TopologyKey;

    /**
    * <p>不满足约束时的处理策略</p>
    */
    @SerializedName("WhenUnsatisfiable")
    @Expose
    private String WhenUnsatisfiable;

    /**
    * <p>标签选择器</p>
    */
    @SerializedName("LabelSelector")
    @Expose
    private LabelSelector LabelSelector;

    /**
    * <p>最小拓扑域数量</p>
    */
    @SerializedName("MinDomains")
    @Expose
    private Long MinDomains;

    /**
    * <p>节点亲和性策略</p>
    */
    @SerializedName("NodeAffinityPolicy")
    @Expose
    private String NodeAffinityPolicy;

    /**
    * <p>节点污点策略</p>
    */
    @SerializedName("NodeTaintsPolicy")
    @Expose
    private String NodeTaintsPolicy;

    /**
    * <p>匹配标签键列表</p>
    */
    @SerializedName("MatchLabelKeys")
    @Expose
    private String [] MatchLabelKeys;

    /**
     * Get <p>最大偏差值</p> 
     * @return MaxSkew <p>最大偏差值</p>
     */
    public Long getMaxSkew() {
        return this.MaxSkew;
    }

    /**
     * Set <p>最大偏差值</p>
     * @param MaxSkew <p>最大偏差值</p>
     */
    public void setMaxSkew(Long MaxSkew) {
        this.MaxSkew = MaxSkew;
    }

    /**
     * Get <p>拓扑域键</p> 
     * @return TopologyKey <p>拓扑域键</p>
     */
    public String getTopologyKey() {
        return this.TopologyKey;
    }

    /**
     * Set <p>拓扑域键</p>
     * @param TopologyKey <p>拓扑域键</p>
     */
    public void setTopologyKey(String TopologyKey) {
        this.TopologyKey = TopologyKey;
    }

    /**
     * Get <p>不满足约束时的处理策略</p> 
     * @return WhenUnsatisfiable <p>不满足约束时的处理策略</p>
     */
    public String getWhenUnsatisfiable() {
        return this.WhenUnsatisfiable;
    }

    /**
     * Set <p>不满足约束时的处理策略</p>
     * @param WhenUnsatisfiable <p>不满足约束时的处理策略</p>
     */
    public void setWhenUnsatisfiable(String WhenUnsatisfiable) {
        this.WhenUnsatisfiable = WhenUnsatisfiable;
    }

    /**
     * Get <p>标签选择器</p> 
     * @return LabelSelector <p>标签选择器</p>
     */
    public LabelSelector getLabelSelector() {
        return this.LabelSelector;
    }

    /**
     * Set <p>标签选择器</p>
     * @param LabelSelector <p>标签选择器</p>
     */
    public void setLabelSelector(LabelSelector LabelSelector) {
        this.LabelSelector = LabelSelector;
    }

    /**
     * Get <p>最小拓扑域数量</p> 
     * @return MinDomains <p>最小拓扑域数量</p>
     */
    public Long getMinDomains() {
        return this.MinDomains;
    }

    /**
     * Set <p>最小拓扑域数量</p>
     * @param MinDomains <p>最小拓扑域数量</p>
     */
    public void setMinDomains(Long MinDomains) {
        this.MinDomains = MinDomains;
    }

    /**
     * Get <p>节点亲和性策略</p> 
     * @return NodeAffinityPolicy <p>节点亲和性策略</p>
     */
    public String getNodeAffinityPolicy() {
        return this.NodeAffinityPolicy;
    }

    /**
     * Set <p>节点亲和性策略</p>
     * @param NodeAffinityPolicy <p>节点亲和性策略</p>
     */
    public void setNodeAffinityPolicy(String NodeAffinityPolicy) {
        this.NodeAffinityPolicy = NodeAffinityPolicy;
    }

    /**
     * Get <p>节点污点策略</p> 
     * @return NodeTaintsPolicy <p>节点污点策略</p>
     */
    public String getNodeTaintsPolicy() {
        return this.NodeTaintsPolicy;
    }

    /**
     * Set <p>节点污点策略</p>
     * @param NodeTaintsPolicy <p>节点污点策略</p>
     */
    public void setNodeTaintsPolicy(String NodeTaintsPolicy) {
        this.NodeTaintsPolicy = NodeTaintsPolicy;
    }

    /**
     * Get <p>匹配标签键列表</p> 
     * @return MatchLabelKeys <p>匹配标签键列表</p>
     */
    public String [] getMatchLabelKeys() {
        return this.MatchLabelKeys;
    }

    /**
     * Set <p>匹配标签键列表</p>
     * @param MatchLabelKeys <p>匹配标签键列表</p>
     */
    public void setMatchLabelKeys(String [] MatchLabelKeys) {
        this.MatchLabelKeys = MatchLabelKeys;
    }

    public TopologySpreadConstraint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologySpreadConstraint(TopologySpreadConstraint source) {
        if (source.MaxSkew != null) {
            this.MaxSkew = new Long(source.MaxSkew);
        }
        if (source.TopologyKey != null) {
            this.TopologyKey = new String(source.TopologyKey);
        }
        if (source.WhenUnsatisfiable != null) {
            this.WhenUnsatisfiable = new String(source.WhenUnsatisfiable);
        }
        if (source.LabelSelector != null) {
            this.LabelSelector = new LabelSelector(source.LabelSelector);
        }
        if (source.MinDomains != null) {
            this.MinDomains = new Long(source.MinDomains);
        }
        if (source.NodeAffinityPolicy != null) {
            this.NodeAffinityPolicy = new String(source.NodeAffinityPolicy);
        }
        if (source.NodeTaintsPolicy != null) {
            this.NodeTaintsPolicy = new String(source.NodeTaintsPolicy);
        }
        if (source.MatchLabelKeys != null) {
            this.MatchLabelKeys = new String[source.MatchLabelKeys.length];
            for (int i = 0; i < source.MatchLabelKeys.length; i++) {
                this.MatchLabelKeys[i] = new String(source.MatchLabelKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxSkew", this.MaxSkew);
        this.setParamSimple(map, prefix + "TopologyKey", this.TopologyKey);
        this.setParamSimple(map, prefix + "WhenUnsatisfiable", this.WhenUnsatisfiable);
        this.setParamObj(map, prefix + "LabelSelector.", this.LabelSelector);
        this.setParamSimple(map, prefix + "MinDomains", this.MinDomains);
        this.setParamSimple(map, prefix + "NodeAffinityPolicy", this.NodeAffinityPolicy);
        this.setParamSimple(map, prefix + "NodeTaintsPolicy", this.NodeTaintsPolicy);
        this.setParamArraySimple(map, prefix + "MatchLabelKeys.", this.MatchLabelKeys);

    }
}

