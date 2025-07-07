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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel {

    /**
    * id
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * cn
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * ip
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
     * Get id 
     * @return NodeId id
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set id
     * @param NodeId id
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get cn 
     * @return NodeType cn
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set cn
     * @param NodeType cn
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get ip 
     * @return NodeIp ip
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set ip
     * @param NodeIp ip
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);

    }
}

