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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeOverview extends AbstractModel{

    /**
    * 节点实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点所在可用区信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点状态。<br><li>SUBMITTED：已完成提交。<br><li>CREATING：创建中。<br><li>CREATED：完成创建。<br><li>INITING：初始化中。<br><li>INIT_FAILED：初始化失败。<br><li>RUNNING：运行中。<br><li>DELETING：销毁中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeState")
    @Expose
    private String NodeState;

    /**
    * 镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 节点所属队列名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 节点角色。<br><li>Manager：管控节点。<br><li>Compute：计算节点。<br><li>Login：登录节点。<br><li>ManagerBackup：备用管控节点。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 节点类型。<br><li>STATIC：静态节点。<br><li>DYNAMIC：弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get 节点实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 节点实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 节点实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 节点实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点所在可用区信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 节点所在可用区信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 节点所在可用区信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 节点所在可用区信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点状态。<br><li>SUBMITTED：已完成提交。<br><li>CREATING：创建中。<br><li>CREATED：完成创建。<br><li>INITING：初始化中。<br><li>INIT_FAILED：初始化失败。<br><li>RUNNING：运行中。<br><li>DELETING：销毁中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeState 节点状态。<br><li>SUBMITTED：已完成提交。<br><li>CREATING：创建中。<br><li>CREATED：完成创建。<br><li>INITING：初始化中。<br><li>INIT_FAILED：初始化失败。<br><li>RUNNING：运行中。<br><li>DELETING：销毁中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeState() {
        return this.NodeState;
    }

    /**
     * Set 节点状态。<br><li>SUBMITTED：已完成提交。<br><li>CREATING：创建中。<br><li>CREATED：完成创建。<br><li>INITING：初始化中。<br><li>INIT_FAILED：初始化失败。<br><li>RUNNING：运行中。<br><li>DELETING：销毁中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeState 节点状态。<br><li>SUBMITTED：已完成提交。<br><li>CREATING：创建中。<br><li>CREATED：完成创建。<br><li>INITING：初始化中。<br><li>INIT_FAILED：初始化失败。<br><li>RUNNING：运行中。<br><li>DELETING：销毁中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeState(String NodeState) {
        this.NodeState = NodeState;
    }

    /**
     * Get 镜像ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 节点所属队列名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueName 节点所属队列名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 节点所属队列名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueName 节点所属队列名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 节点角色。<br><li>Manager：管控节点。<br><li>Compute：计算节点。<br><li>Login：登录节点。<br><li>ManagerBackup：备用管控节点。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeRole 节点角色。<br><li>Manager：管控节点。<br><li>Compute：计算节点。<br><li>Login：登录节点。<br><li>ManagerBackup：备用管控节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set 节点角色。<br><li>Manager：管控节点。<br><li>Compute：计算节点。<br><li>Login：登录节点。<br><li>ManagerBackup：备用管控节点。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeRole 节点角色。<br><li>Manager：管控节点。<br><li>Compute：计算节点。<br><li>Login：登录节点。<br><li>ManagerBackup：备用管控节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get 节点类型。<br><li>STATIC：静态节点。<br><li>DYNAMIC：弹性节点。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型。<br><li>STATIC：静态节点。<br><li>DYNAMIC：弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型。<br><li>STATIC：静态节点。<br><li>DYNAMIC：弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型。<br><li>STATIC：静态节点。<br><li>DYNAMIC：弹性节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public NodeOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeOverview(NodeOverview source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeState != null) {
            this.NodeState = new String(source.NodeState);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeState", this.NodeState);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

