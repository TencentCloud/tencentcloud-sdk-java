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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAgent extends AbstractModel {

    /**
    * <p>Agent 名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Agent IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4")
    @Expose
    private String Ipv4;

    /**
    * <p>心跳时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeartbeatTime")
    @Expose
    private String HeartbeatTime;

    /**
    * <p>最近一次错误</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastError")
    @Expose
    private String LastError;

    /**
    * <p>Agent 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>Agent 状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>Agent 名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>Agent 名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent 名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>Agent 名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Agent ID</p> 
     * @return AgentId <p>Agent ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID</p>
     * @param AgentId <p>Agent ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Agent IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4 <p>Agent IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpv4() {
        return this.Ipv4;
    }

    /**
     * Set <p>Agent IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4 <p>Agent IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4(String Ipv4) {
        this.Ipv4 = Ipv4;
    }

    /**
     * Get <p>心跳时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeartbeatTime <p>心跳时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeartbeatTime() {
        return this.HeartbeatTime;
    }

    /**
     * Set <p>心跳时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeartbeatTime <p>心跳时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeartbeatTime(String HeartbeatTime) {
        this.HeartbeatTime = HeartbeatTime;
    }

    /**
     * Get <p>最近一次错误</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastError <p>最近一次错误</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastError() {
        return this.LastError;
    }

    /**
     * Set <p>最近一次错误</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastError <p>最近一次错误</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastError(String LastError) {
        this.LastError = LastError;
    }

    /**
     * Get <p>Agent 版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentVersion <p>Agent 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>Agent 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentVersion <p>Agent 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>Agent 状态</p> 
     * @return Status <p>Agent 状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Agent 状态</p>
     * @param Status <p>Agent 状态</p>
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

