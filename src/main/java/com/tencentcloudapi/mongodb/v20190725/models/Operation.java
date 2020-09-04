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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operation extends AbstractModel{

    /**
    * 操作所在的分片名
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * 操作所在的节点名
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 操作序号
    */
    @SerializedName("OpId")
    @Expose
    private Long OpId;

    /**
     * Get 操作所在的分片名 
     * @return ReplicaSetName 操作所在的分片名
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set 操作所在的分片名
     * @param ReplicaSetName 操作所在的分片名
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get 操作所在的节点名 
     * @return NodeName 操作所在的节点名
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 操作所在的节点名
     * @param NodeName 操作所在的节点名
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 操作序号 
     * @return OpId 操作序号
     */
    public Long getOpId() {
        return this.OpId;
    }

    /**
     * Set 操作序号
     * @param OpId 操作序号
     */
    public void setOpId(Long OpId) {
        this.OpId = OpId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "OpId", this.OpId);

    }
}

