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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadWriteNode extends AbstractModel {

    /**
    * RW 节点所在可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 升级集群版实例时，如果要调整只读节点可用区，需要指定节点id。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get RW 节点所在可用区。 
     * @return Zone RW 节点所在可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set RW 节点所在可用区。
     * @param Zone RW 节点所在可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 升级集群版实例时，如果要调整只读节点可用区，需要指定节点id。 
     * @return NodeId 升级集群版实例时，如果要调整只读节点可用区，需要指定节点id。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 升级集群版实例时，如果要调整只读节点可用区，需要指定节点id。
     * @param NodeId 升级集群版实例时，如果要调整只读节点可用区，需要指定节点id。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public ReadWriteNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadWriteNode(ReadWriteNode source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

