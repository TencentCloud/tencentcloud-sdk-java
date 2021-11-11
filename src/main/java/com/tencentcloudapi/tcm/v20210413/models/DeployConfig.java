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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployConfig extends AbstractModel{

    /**
    * 部署类型，取值范围：
- SPECIFIC：专有模式
- AUTO：普通模式
    */
    @SerializedName("NodeSelectType")
    @Expose
    private String NodeSelectType;

    /**
    * 指定的节点
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
     * Get 部署类型，取值范围：
- SPECIFIC：专有模式
- AUTO：普通模式 
     * @return NodeSelectType 部署类型，取值范围：
- SPECIFIC：专有模式
- AUTO：普通模式
     */
    public String getNodeSelectType() {
        return this.NodeSelectType;
    }

    /**
     * Set 部署类型，取值范围：
- SPECIFIC：专有模式
- AUTO：普通模式
     * @param NodeSelectType 部署类型，取值范围：
- SPECIFIC：专有模式
- AUTO：普通模式
     */
    public void setNodeSelectType(String NodeSelectType) {
        this.NodeSelectType = NodeSelectType;
    }

    /**
     * Get 指定的节点 
     * @return Nodes 指定的节点
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 指定的节点
     * @param Nodes 指定的节点
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    public DeployConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployConfig(DeployConfig source) {
        if (source.NodeSelectType != null) {
            this.NodeSelectType = new String(source.NodeSelectType);
        }
        if (source.Nodes != null) {
            this.Nodes = new String[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new String(source.Nodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeSelectType", this.NodeSelectType);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);

    }
}

