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

public class NodeProperty extends AbstractModel{

    /**
    * 节点所在的可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点访问地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 角色。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 是否为Hidden节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * 节点状态，包括：ORMAL/STARTUP/RECOVERING/STARTUP2/UNKNOWN/DOWN/ROLLBACK/REMOVED等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 主从延迟，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveDelay")
    @Expose
    private Long SlaveDelay;

    /**
    * 节点优先级。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 节点投票权。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Votes")
    @Expose
    private Long Votes;

    /**
    * 节点标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private NodeTag [] Tags;

    /**
    * 副本集Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicateSetId")
    @Expose
    private String ReplicateSetId;

    /**
     * Get 节点所在的可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 节点所在的可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在的可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 节点所在的可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点访问地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 节点访问地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 节点访问地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 节点访问地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 角色。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role 角色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role 角色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 是否为Hidden节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hidden 是否为Hidden节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set 是否为Hidden节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hidden 是否为Hidden节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get 节点状态，包括：ORMAL/STARTUP/RECOVERING/STARTUP2/UNKNOWN/DOWN/ROLLBACK/REMOVED等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 节点状态，包括：ORMAL/STARTUP/RECOVERING/STARTUP2/UNKNOWN/DOWN/ROLLBACK/REMOVED等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态，包括：ORMAL/STARTUP/RECOVERING/STARTUP2/UNKNOWN/DOWN/ROLLBACK/REMOVED等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 节点状态，包括：ORMAL/STARTUP/RECOVERING/STARTUP2/UNKNOWN/DOWN/ROLLBACK/REMOVED等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 主从延迟，单位秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveDelay 主从延迟，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSlaveDelay() {
        return this.SlaveDelay;
    }

    /**
     * Set 主从延迟，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveDelay 主从延迟，单位秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveDelay(Long SlaveDelay) {
        this.SlaveDelay = SlaveDelay;
    }

    /**
     * Get 节点优先级。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 节点优先级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 节点优先级。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 节点优先级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 节点投票权。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Votes 节点投票权。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVotes() {
        return this.Votes;
    }

    /**
     * Set 节点投票权。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Votes 节点投票权。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVotes(Long Votes) {
        this.Votes = Votes;
    }

    /**
     * Get 节点标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 节点标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 节点标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 节点标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(NodeTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 副本集Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicateSetId 副本集Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplicateSetId() {
        return this.ReplicateSetId;
    }

    /**
     * Set 副本集Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicateSetId 副本集Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicateSetId(String ReplicateSetId) {
        this.ReplicateSetId = ReplicateSetId;
    }

    public NodeProperty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeProperty(NodeProperty source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Hidden != null) {
            this.Hidden = new Boolean(source.Hidden);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SlaveDelay != null) {
            this.SlaveDelay = new Long(source.SlaveDelay);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Votes != null) {
            this.Votes = new Long(source.Votes);
        }
        if (source.Tags != null) {
            this.Tags = new NodeTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new NodeTag(source.Tags[i]);
            }
        }
        if (source.ReplicateSetId != null) {
            this.ReplicateSetId = new String(source.ReplicateSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Hidden", this.Hidden);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SlaveDelay", this.SlaveDelay);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Votes", this.Votes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ReplicateSetId", this.ReplicateSetId);

    }
}

