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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeProperty extends AbstractModel {

    /**
    * 节点所在的可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点名称。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点访问地址。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 节点公网访问外网地址(IP或域名，示例为IP方式)。
    */
    @SerializedName("WanServiceAddress")
    @Expose
    private String WanServiceAddress;

    /**
    * 节点角色。
- PRIMARY：主节点。
- SECONDARY：从节点。
- READONLY：只读节点。
- ARBITER：仲裁节点。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 节点是否为 Hidden 节点。
- true：Hidden 节点。
- false：非 Hidden 节点。
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * 节点状态。
- NORMAL：正常运行中。
- STARTUP：正在启动。
- STARTUP2：正在启动，处理中间数据。
- RECOVERING：恢复中，暂不可用。
- DOWN：已掉线。
- UNKNOWN：未知状态。
- ROLLBACK：回滚中。
- REMOVED：已移除。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 主从同步延迟时间，单位：秒。
    */
    @SerializedName("SlaveDelay")
    @Expose
    private Long SlaveDelay;

    /**
    * 节点优先级。其取值范围为[0,100]，数值越高，优先级越高。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 节点投票权。
- 1：具有投票权。
- 0：无投票权。
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
    * 副本集 ID。
    */
    @SerializedName("ReplicateSetId")
    @Expose
    private String ReplicateSetId;

    /**
     * Get 节点所在的可用区。 
     * @return Zone 节点所在的可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在的可用区。
     * @param Zone 节点所在的可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点名称。 
     * @return NodeName 节点名称。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称。
     * @param NodeName 节点名称。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点访问地址。 
     * @return Address 节点访问地址。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 节点访问地址。
     * @param Address 节点访问地址。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 节点公网访问外网地址(IP或域名，示例为IP方式)。 
     * @return WanServiceAddress 节点公网访问外网地址(IP或域名，示例为IP方式)。
     */
    public String getWanServiceAddress() {
        return this.WanServiceAddress;
    }

    /**
     * Set 节点公网访问外网地址(IP或域名，示例为IP方式)。
     * @param WanServiceAddress 节点公网访问外网地址(IP或域名，示例为IP方式)。
     */
    public void setWanServiceAddress(String WanServiceAddress) {
        this.WanServiceAddress = WanServiceAddress;
    }

    /**
     * Get 节点角色。
- PRIMARY：主节点。
- SECONDARY：从节点。
- READONLY：只读节点。
- ARBITER：仲裁节点。 
     * @return Role 节点角色。
- PRIMARY：主节点。
- SECONDARY：从节点。
- READONLY：只读节点。
- ARBITER：仲裁节点。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 节点角色。
- PRIMARY：主节点。
- SECONDARY：从节点。
- READONLY：只读节点。
- ARBITER：仲裁节点。
     * @param Role 节点角色。
- PRIMARY：主节点。
- SECONDARY：从节点。
- READONLY：只读节点。
- ARBITER：仲裁节点。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 节点是否为 Hidden 节点。
- true：Hidden 节点。
- false：非 Hidden 节点。 
     * @return Hidden 节点是否为 Hidden 节点。
- true：Hidden 节点。
- false：非 Hidden 节点。
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set 节点是否为 Hidden 节点。
- true：Hidden 节点。
- false：非 Hidden 节点。
     * @param Hidden 节点是否为 Hidden 节点。
- true：Hidden 节点。
- false：非 Hidden 节点。
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get 节点状态。
- NORMAL：正常运行中。
- STARTUP：正在启动。
- STARTUP2：正在启动，处理中间数据。
- RECOVERING：恢复中，暂不可用。
- DOWN：已掉线。
- UNKNOWN：未知状态。
- ROLLBACK：回滚中。
- REMOVED：已移除。 
     * @return Status 节点状态。
- NORMAL：正常运行中。
- STARTUP：正在启动。
- STARTUP2：正在启动，处理中间数据。
- RECOVERING：恢复中，暂不可用。
- DOWN：已掉线。
- UNKNOWN：未知状态。
- ROLLBACK：回滚中。
- REMOVED：已移除。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态。
- NORMAL：正常运行中。
- STARTUP：正在启动。
- STARTUP2：正在启动，处理中间数据。
- RECOVERING：恢复中，暂不可用。
- DOWN：已掉线。
- UNKNOWN：未知状态。
- ROLLBACK：回滚中。
- REMOVED：已移除。
     * @param Status 节点状态。
- NORMAL：正常运行中。
- STARTUP：正在启动。
- STARTUP2：正在启动，处理中间数据。
- RECOVERING：恢复中，暂不可用。
- DOWN：已掉线。
- UNKNOWN：未知状态。
- ROLLBACK：回滚中。
- REMOVED：已移除。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 主从同步延迟时间，单位：秒。 
     * @return SlaveDelay 主从同步延迟时间，单位：秒。
     */
    public Long getSlaveDelay() {
        return this.SlaveDelay;
    }

    /**
     * Set 主从同步延迟时间，单位：秒。
     * @param SlaveDelay 主从同步延迟时间，单位：秒。
     */
    public void setSlaveDelay(Long SlaveDelay) {
        this.SlaveDelay = SlaveDelay;
    }

    /**
     * Get 节点优先级。其取值范围为[0,100]，数值越高，优先级越高。 
     * @return Priority 节点优先级。其取值范围为[0,100]，数值越高，优先级越高。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 节点优先级。其取值范围为[0,100]，数值越高，优先级越高。
     * @param Priority 节点优先级。其取值范围为[0,100]，数值越高，优先级越高。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 节点投票权。
- 1：具有投票权。
- 0：无投票权。 
     * @return Votes 节点投票权。
- 1：具有投票权。
- 0：无投票权。
     */
    public Long getVotes() {
        return this.Votes;
    }

    /**
     * Set 节点投票权。
- 1：具有投票权。
- 0：无投票权。
     * @param Votes 节点投票权。
- 1：具有投票权。
- 0：无投票权。
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
     * Get 副本集 ID。 
     * @return ReplicateSetId 副本集 ID。
     */
    public String getReplicateSetId() {
        return this.ReplicateSetId;
    }

    /**
     * Set 副本集 ID。
     * @param ReplicateSetId 副本集 ID。
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
        if (source.WanServiceAddress != null) {
            this.WanServiceAddress = new String(source.WanServiceAddress);
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
        this.setParamSimple(map, prefix + "WanServiceAddress", this.WanServiceAddress);
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

