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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSimpleInfo extends AbstractModel{

    /**
    * 节点ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get 节点ID 
     * @return ID 节点ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 节点ID
     * @param ID 节点ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public NodeSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSimpleInfo(NodeSimpleInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

