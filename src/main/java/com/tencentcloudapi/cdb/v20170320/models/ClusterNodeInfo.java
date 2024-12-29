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

public class ClusterNodeInfo extends AbstractModel {

    /**
    * 节点id。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点的角色。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 节点所在可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点的权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 节点状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 节点id。 
     * @return NodeId 节点id。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id。
     * @param NodeId 节点id。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点的角色。 
     * @return Role 节点的角色。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 节点的角色。
     * @param Role 节点的角色。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 节点所在可用区。 
     * @return Zone 节点所在可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在可用区。
     * @param Zone 节点所在可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点的权重 
     * @return Weight 节点的权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 节点的权重
     * @param Weight 节点的权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 节点状态。 
     * @return Status 节点状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态。
     * @param Status 节点状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ClusterNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNodeInfo(ClusterNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

