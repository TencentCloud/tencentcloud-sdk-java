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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalNode extends AbstractModel {

    /**
    * <p>注册节点名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>注册节点所属节点池</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * <p>注册节点IP地址</p>
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>注册节点地域</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>注册节点状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>Failed： 异常状态</li><li>Terminating： 删除中</li><li>Draining： 驱逐中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>是否封锁。true表示已封锁，false表示未封锁</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
     * Get <p>注册节点名称</p> 
     * @return Name <p>注册节点名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>注册节点名称</p>
     * @param Name <p>注册节点名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>注册节点所属节点池</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePoolId <p>注册节点所属节点池</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set <p>注册节点所属节点池</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePoolId <p>注册节点所属节点池</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get <p>注册节点IP地址</p> 
     * @return IP <p>注册节点IP地址</p>
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>注册节点IP地址</p>
     * @param IP <p>注册节点IP地址</p>
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>注册节点地域</p> 
     * @return Location <p>注册节点地域</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>注册节点地域</p>
     * @param Location <p>注册节点地域</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>注册节点状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>Failed： 异常状态</li><li>Terminating： 删除中</li><li>Draining： 驱逐中</li></ul> 
     * @return Status <p>注册节点状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>Failed： 异常状态</li><li>Terminating： 删除中</li><li>Draining： 驱逐中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>注册节点状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>Failed： 异常状态</li><li>Terminating： 删除中</li><li>Draining： 驱逐中</li></ul>
     * @param Status <p>注册节点状态</p><p>枚举值：</p><ul><li>Running： 运行中</li><li>Failed： 异常状态</li><li>Terminating： 删除中</li><li>Draining： 驱逐中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason <p>异常原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>是否封锁。true表示已封锁，false表示未封锁</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unschedulable <p>是否封锁。true表示已封锁，false表示未封锁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set <p>是否封锁。true表示已封锁，false表示未封锁</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unschedulable <p>是否封锁。true表示已封锁，false表示未封锁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    public ExternalNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalNode(ExternalNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Boolean(source.Unschedulable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);

    }
}

