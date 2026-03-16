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
    * 第三方节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 第三方节点所属节点池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 第三方IP地址
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 第三方地域
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 第三方节点状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 异常原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 是否封锁。true表示已封锁，false表示未封锁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
     * Get 第三方节点名称 
     * @return Name 第三方节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 第三方节点名称
     * @param Name 第三方节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 第三方节点所属节点池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePoolId 第三方节点所属节点池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 第三方节点所属节点池
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePoolId 第三方节点所属节点池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 第三方IP地址 
     * @return IP 第三方IP地址
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 第三方IP地址
     * @param IP 第三方IP地址
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 第三方地域 
     * @return Location 第三方地域
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 第三方地域
     * @param Location 第三方地域
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 第三方节点状态 
     * @return Status 第三方节点状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 第三方节点状态
     * @param Status 第三方节点状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 异常原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 是否封锁。true表示已封锁，false表示未封锁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unschedulable 是否封锁。true表示已封锁，false表示未封锁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set 是否封锁。true表示已封锁，false表示未封锁
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unschedulable 是否封锁。true表示已封锁，false表示未封锁
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

