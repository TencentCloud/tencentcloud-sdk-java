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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterTopology extends AbstractModel {

    /**
    * RW 节点拓扑。
    */
    @SerializedName("ReadWriteNode")
    @Expose
    private ReadWriteNode ReadWriteNode;

    /**
    * RO 节点拓扑。
    */
    @SerializedName("ReadOnlyNodes")
    @Expose
    private ReadonlyNode [] ReadOnlyNodes;

    /**
     * Get RW 节点拓扑。 
     * @return ReadWriteNode RW 节点拓扑。
     */
    public ReadWriteNode getReadWriteNode() {
        return this.ReadWriteNode;
    }

    /**
     * Set RW 节点拓扑。
     * @param ReadWriteNode RW 节点拓扑。
     */
    public void setReadWriteNode(ReadWriteNode ReadWriteNode) {
        this.ReadWriteNode = ReadWriteNode;
    }

    /**
     * Get RO 节点拓扑。 
     * @return ReadOnlyNodes RO 节点拓扑。
     */
    public ReadonlyNode [] getReadOnlyNodes() {
        return this.ReadOnlyNodes;
    }

    /**
     * Set RO 节点拓扑。
     * @param ReadOnlyNodes RO 节点拓扑。
     */
    public void setReadOnlyNodes(ReadonlyNode [] ReadOnlyNodes) {
        this.ReadOnlyNodes = ReadOnlyNodes;
    }

    public ClusterTopology() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterTopology(ClusterTopology source) {
        if (source.ReadWriteNode != null) {
            this.ReadWriteNode = new ReadWriteNode(source.ReadWriteNode);
        }
        if (source.ReadOnlyNodes != null) {
            this.ReadOnlyNodes = new ReadonlyNode[source.ReadOnlyNodes.length];
            for (int i = 0; i < source.ReadOnlyNodes.length; i++) {
                this.ReadOnlyNodes[i] = new ReadonlyNode(source.ReadOnlyNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ReadWriteNode.", this.ReadWriteNode);
        this.setParamArrayObj(map, prefix + "ReadOnlyNodes.", this.ReadOnlyNodes);

    }
}

