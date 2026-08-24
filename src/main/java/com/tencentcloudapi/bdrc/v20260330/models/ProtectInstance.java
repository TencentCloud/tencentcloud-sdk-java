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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectInstance extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 客户端ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 客户端版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 客户端状态
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * 最后心跳时间
    */
    @SerializedName("LastHeartbeatTime")
    @Expose
    private String LastHeartbeatTime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最新备份点中记录的 CVM 基础信息
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 该实例可用备份点数量
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 最近一次备份时间
    */
    @SerializedName("LatestBackupTime")
    @Expose
    private String LatestBackupTime;

    /**
    * 离线原因
    */
    @SerializedName("OfflineReason")
    @Expose
    private String OfflineReason;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 客户端ID 
     * @return AgentId 客户端ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 客户端ID
     * @param AgentId 客户端ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 客户端版本 
     * @return AgentVersion 客户端版本
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set 客户端版本
     * @param AgentVersion 客户端版本
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get 客户端状态 
     * @return AgentStatus 客户端状态
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set 客户端状态
     * @param AgentStatus 客户端状态
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 最后心跳时间 
     * @return LastHeartbeatTime 最后心跳时间
     */
    public String getLastHeartbeatTime() {
        return this.LastHeartbeatTime;
    }

    /**
     * Set 最后心跳时间
     * @param LastHeartbeatTime 最后心跳时间
     */
    public void setLastHeartbeatTime(String LastHeartbeatTime) {
        this.LastHeartbeatTime = LastHeartbeatTime;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最新备份点中记录的 CVM 基础信息 
     * @return ExtraInfo 最新备份点中记录的 CVM 基础信息
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 最新备份点中记录的 CVM 基础信息
     * @param ExtraInfo 最新备份点中记录的 CVM 基础信息
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 该实例可用备份点数量 
     * @return BackupCount 该实例可用备份点数量
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 该实例可用备份点数量
     * @param BackupCount 该实例可用备份点数量
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 最近一次备份时间 
     * @return LatestBackupTime 最近一次备份时间
     */
    public String getLatestBackupTime() {
        return this.LatestBackupTime;
    }

    /**
     * Set 最近一次备份时间
     * @param LatestBackupTime 最近一次备份时间
     */
    public void setLatestBackupTime(String LatestBackupTime) {
        this.LatestBackupTime = LatestBackupTime;
    }

    /**
     * Get 离线原因 
     * @return OfflineReason 离线原因
     */
    public String getOfflineReason() {
        return this.OfflineReason;
    }

    /**
     * Set 离线原因
     * @param OfflineReason 离线原因
     */
    public void setOfflineReason(String OfflineReason) {
        this.OfflineReason = OfflineReason;
    }

    public ProtectInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectInstance(ProtectInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.LastHeartbeatTime != null) {
            this.LastHeartbeatTime = new String(source.LastHeartbeatTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.LatestBackupTime != null) {
            this.LatestBackupTime = new String(source.LatestBackupTime);
        }
        if (source.OfflineReason != null) {
            this.OfflineReason = new String(source.OfflineReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "LastHeartbeatTime", this.LastHeartbeatTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "LatestBackupTime", this.LatestBackupTime);
        this.setParamSimple(map, prefix + "OfflineReason", this.OfflineReason);

    }
}

