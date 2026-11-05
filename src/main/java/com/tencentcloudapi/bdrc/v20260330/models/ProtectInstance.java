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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>客户端ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>客户端版本</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>客户端状态</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>最后心跳时间</p>
    */
    @SerializedName("LastHeartbeatTime")
    @Expose
    private String LastHeartbeatTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>最新备份点中记录的 CVM 基础信息</p>
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * <p>该实例可用备份点数量</p>
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>最近一次备份时间</p>
    */
    @SerializedName("LatestBackupTime")
    @Expose
    private String LatestBackupTime;

    /**
    * <p>离线原因</p>
    */
    @SerializedName("OfflineReason")
    @Expose
    private String OfflineReason;

    /**
    * <p>备份数据量，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>产品存储类型</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>客户端ID</p> 
     * @return AgentId <p>客户端ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>客户端ID</p>
     * @param AgentId <p>客户端ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>客户端版本</p> 
     * @return AgentVersion <p>客户端版本</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>客户端版本</p>
     * @param AgentVersion <p>客户端版本</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>客户端状态</p> 
     * @return AgentStatus <p>客户端状态</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>客户端状态</p>
     * @param AgentStatus <p>客户端状态</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>最后心跳时间</p> 
     * @return LastHeartbeatTime <p>最后心跳时间</p>
     */
    public String getLastHeartbeatTime() {
        return this.LastHeartbeatTime;
    }

    /**
     * Set <p>最后心跳时间</p>
     * @param LastHeartbeatTime <p>最后心跳时间</p>
     */
    public void setLastHeartbeatTime(String LastHeartbeatTime) {
        this.LastHeartbeatTime = LastHeartbeatTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>最新备份点中记录的 CVM 基础信息</p> 
     * @return ExtraInfo <p>最新备份点中记录的 CVM 基础信息</p>
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>最新备份点中记录的 CVM 基础信息</p>
     * @param ExtraInfo <p>最新备份点中记录的 CVM 基础信息</p>
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>该实例可用备份点数量</p> 
     * @return BackupCount <p>该实例可用备份点数量</p>
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set <p>该实例可用备份点数量</p>
     * @param BackupCount <p>该实例可用备份点数量</p>
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>最近一次备份时间</p> 
     * @return LatestBackupTime <p>最近一次备份时间</p>
     */
    public String getLatestBackupTime() {
        return this.LatestBackupTime;
    }

    /**
     * Set <p>最近一次备份时间</p>
     * @param LatestBackupTime <p>最近一次备份时间</p>
     */
    public void setLatestBackupTime(String LatestBackupTime) {
        this.LatestBackupTime = LatestBackupTime;
    }

    /**
     * Get <p>离线原因</p> 
     * @return OfflineReason <p>离线原因</p>
     */
    public String getOfflineReason() {
        return this.OfflineReason;
    }

    /**
     * Set <p>离线原因</p>
     * @param OfflineReason <p>离线原因</p>
     */
    public void setOfflineReason(String OfflineReason) {
        this.OfflineReason = OfflineReason;
    }

    /**
     * Get <p>备份数据量，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupSize <p>备份数据量，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>备份数据量，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupSize <p>备份数据量，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>产品存储类型</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductType <p>产品存储类型</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品存储类型</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductType <p>产品存储类型</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
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
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
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
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}

