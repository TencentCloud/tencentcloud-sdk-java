/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodePoolOption extends AbstractModel{

    /**
    * 是否加入节点池
    */
    @SerializedName("AddToNodePool")
    @Expose
    private Boolean AddToNodePool;

    /**
    * 节点池id
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 是否继承节点池相关配置
    */
    @SerializedName("InheritConfigurationFromNodePool")
    @Expose
    private Boolean InheritConfigurationFromNodePool;

    /**
     * Get 是否加入节点池 
     * @return AddToNodePool 是否加入节点池
     */
    public Boolean getAddToNodePool() {
        return this.AddToNodePool;
    }

    /**
     * Set 是否加入节点池
     * @param AddToNodePool 是否加入节点池
     */
    public void setAddToNodePool(Boolean AddToNodePool) {
        this.AddToNodePool = AddToNodePool;
    }

    /**
     * Get 节点池id 
     * @return NodePoolId 节点池id
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池id
     * @param NodePoolId 节点池id
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 是否继承节点池相关配置 
     * @return InheritConfigurationFromNodePool 是否继承节点池相关配置
     */
    public Boolean getInheritConfigurationFromNodePool() {
        return this.InheritConfigurationFromNodePool;
    }

    /**
     * Set 是否继承节点池相关配置
     * @param InheritConfigurationFromNodePool 是否继承节点池相关配置
     */
    public void setInheritConfigurationFromNodePool(Boolean InheritConfigurationFromNodePool) {
        this.InheritConfigurationFromNodePool = InheritConfigurationFromNodePool;
    }

    public NodePoolOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePoolOption(NodePoolOption source) {
        if (source.AddToNodePool != null) {
            this.AddToNodePool = new Boolean(source.AddToNodePool);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.InheritConfigurationFromNodePool != null) {
            this.InheritConfigurationFromNodePool = new Boolean(source.InheritConfigurationFromNodePool);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddToNodePool", this.AddToNodePool);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "InheritConfigurationFromNodePool", this.InheritConfigurationFromNodePool);

    }
}

