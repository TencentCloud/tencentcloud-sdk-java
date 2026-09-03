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
    * <p>节点所在的可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>节点名称。</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点访问地址。</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>节点公网访问外网地址(IP或域名，示例为IP方式)。</p>
    */
    @SerializedName("WanServiceAddress")
    @Expose
    private String WanServiceAddress;

    /**
    * <p>节点角色。</p><ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>节点是否为 Hidden 节点。</p><ul><li>true：Hidden 节点。</li><li>false：非 Hidden 节点。</li></ul>
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * <p>节点状态。</p><ul><li>NORMAL：正常运行中。</li><li>STARTUP：正在启动。</li><li>STARTUP2：正在启动，处理中间数据。</li><li>RECOVERING：恢复中，暂不可用。</li><li>DOWN：已掉线。</li><li>UNKNOWN：未知状态。</li><li>ROLLBACK：回滚中。</li><li>REMOVED：已移除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>主从同步延迟时间，单位：秒。</p>
    */
    @SerializedName("SlaveDelay")
    @Expose
    private Long SlaveDelay;

    /**
    * <p>节点优先级。其取值范围为[0,100]，数值越高，优先级越高。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>节点投票权。</p><ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
    */
    @SerializedName("Votes")
    @Expose
    private Long Votes;

    /**
    * <p>节点标签。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private NodeTag [] Tags;

    /**
    * <p>副本集 ID。</p>
    */
    @SerializedName("ReplicateSetId")
    @Expose
    private String ReplicateSetId;

    /**
     * Get <p>节点所在的可用区。</p> 
     * @return Zone <p>节点所在的可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>节点所在的可用区。</p>
     * @param Zone <p>节点所在的可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>节点名称。</p> 
     * @return NodeName <p>节点名称。</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称。</p>
     * @param NodeName <p>节点名称。</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点访问地址。</p> 
     * @return Address <p>节点访问地址。</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>节点访问地址。</p>
     * @param Address <p>节点访问地址。</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>节点公网访问外网地址(IP或域名，示例为IP方式)。</p> 
     * @return WanServiceAddress <p>节点公网访问外网地址(IP或域名，示例为IP方式)。</p>
     */
    public String getWanServiceAddress() {
        return this.WanServiceAddress;
    }

    /**
     * Set <p>节点公网访问外网地址(IP或域名，示例为IP方式)。</p>
     * @param WanServiceAddress <p>节点公网访问外网地址(IP或域名，示例为IP方式)。</p>
     */
    public void setWanServiceAddress(String WanServiceAddress) {
        this.WanServiceAddress = WanServiceAddress;
    }

    /**
     * Get <p>节点角色。</p><ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul> 
     * @return Role <p>节点角色。</p><ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>节点角色。</p><ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
     * @param Role <p>节点角色。</p><ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>节点是否为 Hidden 节点。</p><ul><li>true：Hidden 节点。</li><li>false：非 Hidden 节点。</li></ul> 
     * @return Hidden <p>节点是否为 Hidden 节点。</p><ul><li>true：Hidden 节点。</li><li>false：非 Hidden 节点。</li></ul>
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set <p>节点是否为 Hidden 节点。</p><ul><li>true：Hidden 节点。</li><li>false：非 Hidden 节点。</li></ul>
     * @param Hidden <p>节点是否为 Hidden 节点。</p><ul><li>true：Hidden 节点。</li><li>false：非 Hidden 节点。</li></ul>
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get <p>节点状态。</p><ul><li>NORMAL：正常运行中。</li><li>STARTUP：正在启动。</li><li>STARTUP2：正在启动，处理中间数据。</li><li>RECOVERING：恢复中，暂不可用。</li><li>DOWN：已掉线。</li><li>UNKNOWN：未知状态。</li><li>ROLLBACK：回滚中。</li><li>REMOVED：已移除。</li></ul> 
     * @return Status <p>节点状态。</p><ul><li>NORMAL：正常运行中。</li><li>STARTUP：正在启动。</li><li>STARTUP2：正在启动，处理中间数据。</li><li>RECOVERING：恢复中，暂不可用。</li><li>DOWN：已掉线。</li><li>UNKNOWN：未知状态。</li><li>ROLLBACK：回滚中。</li><li>REMOVED：已移除。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节点状态。</p><ul><li>NORMAL：正常运行中。</li><li>STARTUP：正在启动。</li><li>STARTUP2：正在启动，处理中间数据。</li><li>RECOVERING：恢复中，暂不可用。</li><li>DOWN：已掉线。</li><li>UNKNOWN：未知状态。</li><li>ROLLBACK：回滚中。</li><li>REMOVED：已移除。</li></ul>
     * @param Status <p>节点状态。</p><ul><li>NORMAL：正常运行中。</li><li>STARTUP：正在启动。</li><li>STARTUP2：正在启动，处理中间数据。</li><li>RECOVERING：恢复中，暂不可用。</li><li>DOWN：已掉线。</li><li>UNKNOWN：未知状态。</li><li>ROLLBACK：回滚中。</li><li>REMOVED：已移除。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>主从同步延迟时间，单位：秒。</p> 
     * @return SlaveDelay <p>主从同步延迟时间，单位：秒。</p>
     */
    public Long getSlaveDelay() {
        return this.SlaveDelay;
    }

    /**
     * Set <p>主从同步延迟时间，单位：秒。</p>
     * @param SlaveDelay <p>主从同步延迟时间，单位：秒。</p>
     */
    public void setSlaveDelay(Long SlaveDelay) {
        this.SlaveDelay = SlaveDelay;
    }

    /**
     * Get <p>节点优先级。其取值范围为[0,100]，数值越高，优先级越高。</p> 
     * @return Priority <p>节点优先级。其取值范围为[0,100]，数值越高，优先级越高。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>节点优先级。其取值范围为[0,100]，数值越高，优先级越高。</p>
     * @param Priority <p>节点优先级。其取值范围为[0,100]，数值越高，优先级越高。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>节点投票权。</p><ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul> 
     * @return Votes <p>节点投票权。</p><ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
     */
    public Long getVotes() {
        return this.Votes;
    }

    /**
     * Set <p>节点投票权。</p><ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
     * @param Votes <p>节点投票权。</p><ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
     */
    public void setVotes(Long Votes) {
        this.Votes = Votes;
    }

    /**
     * Get <p>节点标签。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>节点标签。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>节点标签。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>节点标签。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(NodeTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>副本集 ID。</p> 
     * @return ReplicateSetId <p>副本集 ID。</p>
     */
    public String getReplicateSetId() {
        return this.ReplicateSetId;
    }

    /**
     * Set <p>副本集 ID。</p>
     * @param ReplicateSetId <p>副本集 ID。</p>
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

