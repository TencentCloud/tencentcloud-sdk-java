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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel {

    /**
    * 用户IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 节点角色名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 组件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 节点角色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 节点上次重启的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRestartTime")
    @Expose
    private String LastRestartTime;

    /**
    * 节点所在可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 用户IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 用户IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 用户IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 用户IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 节点角色名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点角色名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点角色名
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点角色名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 组件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentName 组件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 组件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentName 组件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 节点角色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeRole 节点角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set 节点角色
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeRole 节点角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get 节点上次重启的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRestartTime 节点上次重启的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastRestartTime() {
        return this.LastRestartTime;
    }

    /**
     * Set 节点上次重启的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRestartTime 节点上次重启的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRestartTime(String LastRestartTime) {
        this.LastRestartTime = LastRestartTime;
    }

    /**
     * Get 节点所在可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 节点所在可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 节点所在可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.LastRestartTime != null) {
            this.LastRestartTime = new String(source.LastRestartTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "LastRestartTime", this.LastRestartTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

