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

public class NodeDistribution extends AbstractModel {

    /**
    * 主实例Master节点所在主机ID或者只读实例所在主机ID
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
    * 主实例第一Slave节点所在主机ID
    */
    @SerializedName("SlaveNodeOne")
    @Expose
    private String SlaveNodeOne;

    /**
    * 主实例第二Slave节点所在主机ID
    */
    @SerializedName("SlaveNodeTwo")
    @Expose
    private String SlaveNodeTwo;

    /**
     * Get 主实例Master节点所在主机ID或者只读实例所在主机ID 
     * @return Node 主实例Master节点所在主机ID或者只读实例所在主机ID
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set 主实例Master节点所在主机ID或者只读实例所在主机ID
     * @param Node 主实例Master节点所在主机ID或者只读实例所在主机ID
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    /**
     * Get 主实例第一Slave节点所在主机ID 
     * @return SlaveNodeOne 主实例第一Slave节点所在主机ID
     */
    public String getSlaveNodeOne() {
        return this.SlaveNodeOne;
    }

    /**
     * Set 主实例第一Slave节点所在主机ID
     * @param SlaveNodeOne 主实例第一Slave节点所在主机ID
     */
    public void setSlaveNodeOne(String SlaveNodeOne) {
        this.SlaveNodeOne = SlaveNodeOne;
    }

    /**
     * Get 主实例第二Slave节点所在主机ID 
     * @return SlaveNodeTwo 主实例第二Slave节点所在主机ID
     */
    public String getSlaveNodeTwo() {
        return this.SlaveNodeTwo;
    }

    /**
     * Set 主实例第二Slave节点所在主机ID
     * @param SlaveNodeTwo 主实例第二Slave节点所在主机ID
     */
    public void setSlaveNodeTwo(String SlaveNodeTwo) {
        this.SlaveNodeTwo = SlaveNodeTwo;
    }

    public NodeDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeDistribution(NodeDistribution source) {
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
        if (source.SlaveNodeOne != null) {
            this.SlaveNodeOne = new String(source.SlaveNodeOne);
        }
        if (source.SlaveNodeTwo != null) {
            this.SlaveNodeTwo = new String(source.SlaveNodeTwo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Node", this.Node);
        this.setParamSimple(map, prefix + "SlaveNodeOne", this.SlaveNodeOne);
        this.setParamSimple(map, prefix + "SlaveNodeTwo", this.SlaveNodeTwo);

    }
}

