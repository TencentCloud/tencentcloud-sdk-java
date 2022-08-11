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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayNode extends AbstractModel{

    /**
    * 云原生网关节点 id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点 ip
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
     * Get 云原生网关节点 id 
     * @return NodeId 云原生网关节点 id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 云原生网关节点 id
     * @param NodeId 云原生网关节点 id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点 ip 
     * @return NodeIp 节点 ip
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 节点 ip
     * @param NodeIp 节点 ip
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    public CloudNativeAPIGatewayNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayNode(CloudNativeAPIGatewayNode source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
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
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);

    }
}

