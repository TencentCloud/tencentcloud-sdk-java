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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyRoute extends AbstractModel {

    /**
    * <p>路由指向的 PG 节点 ID（实例或只读节点 ID）</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点角色：master/slave/readonly</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>路由权重，取值范围 [0, 100]</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>路由状态：available/unavailable</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>路由指向的 PG 节点 ID（实例或只读节点 ID）</p> 
     * @return NodeId <p>路由指向的 PG 节点 ID（实例或只读节点 ID）</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>路由指向的 PG 节点 ID（实例或只读节点 ID）</p>
     * @param NodeId <p>路由指向的 PG 节点 ID（实例或只读节点 ID）</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点角色：master/slave/readonly</p> 
     * @return Role <p>节点角色：master/slave/readonly</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>节点角色：master/slave/readonly</p>
     * @param Role <p>节点角色：master/slave/readonly</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>路由权重，取值范围 [0, 100]</p> 
     * @return Weight <p>路由权重，取值范围 [0, 100]</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>路由权重，取值范围 [0, 100]</p>
     * @param Weight <p>路由权重，取值范围 [0, 100]</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>路由状态：available/unavailable</p> 
     * @return Status <p>路由状态：available/unavailable</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>路由状态：available/unavailable</p>
     * @param Status <p>路由状态：available/unavailable</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ProxyRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyRoute(ProxyRoute source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
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
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

