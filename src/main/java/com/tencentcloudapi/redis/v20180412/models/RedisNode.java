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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisNode extends AbstractModel {

    /**
    * Redis 节点上 Key 的个数。
    */
    @SerializedName("Keys")
    @Expose
    private Long Keys;

    /**
    * Redis 节点 Slot 分布范围。例如：0-5460。
    */
    @SerializedName("Slot")
    @Expose
    private String Slot;

    /**
    * 节点的序列 ID。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点的状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 节点角色。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get Redis 节点上 Key 的个数。 
     * @return Keys Redis 节点上 Key 的个数。
     */
    public Long getKeys() {
        return this.Keys;
    }

    /**
     * Set Redis 节点上 Key 的个数。
     * @param Keys Redis 节点上 Key 的个数。
     */
    public void setKeys(Long Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Redis 节点 Slot 分布范围。例如：0-5460。 
     * @return Slot Redis 节点 Slot 分布范围。例如：0-5460。
     */
    public String getSlot() {
        return this.Slot;
    }

    /**
     * Set Redis 节点 Slot 分布范围。例如：0-5460。
     * @param Slot Redis 节点 Slot 分布范围。例如：0-5460。
     */
    public void setSlot(String Slot) {
        this.Slot = Slot;
    }

    /**
     * Get 节点的序列 ID。 
     * @return NodeId 节点的序列 ID。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点的序列 ID。
     * @param NodeId 节点的序列 ID。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点的状态。 
     * @return Status 节点的状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点的状态。
     * @param Status 节点的状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 节点角色。 
     * @return Role 节点角色。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 节点角色。
     * @param Role 节点角色。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public RedisNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisNode(RedisNode source) {
        if (source.Keys != null) {
            this.Keys = new Long(source.Keys);
        }
        if (source.Slot != null) {
            this.Slot = new String(source.Slot);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "Slot", this.Slot);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

