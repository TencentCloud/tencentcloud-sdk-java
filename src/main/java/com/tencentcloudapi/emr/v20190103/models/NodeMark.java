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

public class NodeMark extends AbstractModel {

    /**
    * 节点类型：master,core,task,router
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点标记信息，目前只提供给tf平台使用，作为入参区分同类型节点信息
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 可用区名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 节点类型：master,core,task,router 
     * @return NodeType 节点类型：master,core,task,router
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型：master,core,task,router
     * @param NodeType 节点类型：master,core,task,router
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点标记信息，目前只提供给tf平台使用，作为入参区分同类型节点信息 
     * @return NodeNames 节点标记信息，目前只提供给tf平台使用，作为入参区分同类型节点信息
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 节点标记信息，目前只提供给tf平台使用，作为入参区分同类型节点信息
     * @param NodeNames 节点标记信息，目前只提供给tf平台使用，作为入参区分同类型节点信息
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 可用区名称 
     * @return Zone 可用区名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称
     * @param Zone 可用区名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public NodeMark() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeMark(NodeMark source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

