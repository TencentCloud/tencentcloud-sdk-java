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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeeWiDBNode extends AbstractModel {

    /**
    * 节点的序列ID。
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
     * Get 节点的序列ID。 
     * @return NodeId 节点的序列ID。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点的序列ID。
     * @param NodeId 节点的序列ID。
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

    public KeeWiDBNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeeWiDBNode(KeeWiDBNode source) {
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
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

