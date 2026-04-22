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

public class PodAffinityTerm extends AbstractModel {

    /**
    * <p>标签选择器</p>
    */
    @SerializedName("LabelSelector")
    @Expose
    private LabelSelector LabelSelector;

    /**
    * <p>命名空间列表</p>
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * <p>拓扑域键</p>
    */
    @SerializedName("TopologyKey")
    @Expose
    private String TopologyKey;

    /**
    * <p>命名空间选择器</p>
    */
    @SerializedName("NamespaceSelector")
    @Expose
    private LabelSelector NamespaceSelector;

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
     * Get <p>命名空间列表</p> 
     * @return Namespaces <p>命名空间列表</p>
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set <p>命名空间列表</p>
     * @param Namespaces <p>命名空间列表</p>
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
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
     * Get <p>命名空间选择器</p> 
     * @return NamespaceSelector <p>命名空间选择器</p>
     */
    public LabelSelector getNamespaceSelector() {
        return this.NamespaceSelector;
    }

    /**
     * Set <p>命名空间选择器</p>
     * @param NamespaceSelector <p>命名空间选择器</p>
     */
    public void setNamespaceSelector(LabelSelector NamespaceSelector) {
        this.NamespaceSelector = NamespaceSelector;
    }

    public PodAffinityTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodAffinityTerm(PodAffinityTerm source) {
        if (source.LabelSelector != null) {
            this.LabelSelector = new LabelSelector(source.LabelSelector);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.TopologyKey != null) {
            this.TopologyKey = new String(source.TopologyKey);
        }
        if (source.NamespaceSelector != null) {
            this.NamespaceSelector = new LabelSelector(source.NamespaceSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LabelSelector.", this.LabelSelector);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "TopologyKey", this.TopologyKey);
        this.setParamObj(map, prefix + "NamespaceSelector.", this.NamespaceSelector);

    }
}

