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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAgent extends AbstractModel{

    /**
    * Agent 名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Agent ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4")
    @Expose
    private String Ipv4;

    /**
    * 心跳时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeartbeatTime")
    @Expose
    private String HeartbeatTime;

    /**
    * 最近一次错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastError")
    @Expose
    private String LastError;

    /**
    * Agent 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * Agent 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Agent 名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Agent 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Agent 名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Agent 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Agent ID 
     * @return AgentId Agent ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent ID
     * @param AgentId Agent ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4 Agent IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpv4() {
        return this.Ipv4;
    }

    /**
     * Set Agent IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4 Agent IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4(String Ipv4) {
        this.Ipv4 = Ipv4;
    }

    /**
     * Get 心跳时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeartbeatTime 心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeartbeatTime() {
        return this.HeartbeatTime;
    }

    /**
     * Set 心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeartbeatTime 心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeartbeatTime(String HeartbeatTime) {
        this.HeartbeatTime = HeartbeatTime;
    }

    /**
     * Get 最近一次错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastError 最近一次错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastError() {
        return this.LastError;
    }

    /**
     * Set 最近一次错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastError 最近一次错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastError(String LastError) {
        this.LastError = LastError;
    }

    /**
     * Get Agent 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentVersion Agent 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set Agent 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentVersion Agent 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get Agent 状态 
     * @return Status Agent 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Agent 状态
     * @param Status Agent 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public PrometheusAgent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAgent(PrometheusAgent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ipv4 != null) {
            this.Ipv4 = new String(source.Ipv4);
        }
        if (source.HeartbeatTime != null) {
            this.HeartbeatTime = new String(source.HeartbeatTime);
        }
        if (source.LastError != null) {
            this.LastError = new String(source.LastError);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ipv4", this.Ipv4);
        this.setParamSimple(map, prefix + "HeartbeatTime", this.HeartbeatTime);
        this.setParamSimple(map, prefix + "LastError", this.LastError);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

