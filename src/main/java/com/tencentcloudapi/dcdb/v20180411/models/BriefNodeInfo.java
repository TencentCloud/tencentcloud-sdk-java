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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BriefNodeInfo extends AbstractModel{

    /**
    * DB节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * DB节点角色，取值为master或者slave
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 节点所属分片的分片ID
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
     * Get DB节点ID 
     * @return NodeId DB节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set DB节点ID
     * @param NodeId DB节点ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get DB节点角色，取值为master或者slave 
     * @return Role DB节点角色，取值为master或者slave
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set DB节点角色，取值为master或者slave
     * @param Role DB节点角色，取值为master或者slave
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 节点所属分片的分片ID 
     * @return ShardId 节点所属分片的分片ID
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 节点所属分片的分片ID
     * @param ShardId 节点所属分片的分片ID
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    public BriefNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BriefNodeInfo(BriefNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);

    }
}

