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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandbyDBInstanceRelation extends AbstractModel {

    /**
    * 主实例 ID
    */
    @SerializedName("PrimaryInstanceId")
    @Expose
    private String PrimaryInstanceId;

    /**
    * 主实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrimaryInstanceName")
    @Expose
    private String PrimaryInstanceName;

    /**
    * 主实例地域
    */
    @SerializedName("PrimaryRegion")
    @Expose
    private String PrimaryRegion;

    /**
    * 主实例子网 IP
    */
    @SerializedName("PrimaryVip")
    @Expose
    private String PrimaryVip;

    /**
    * 主实例子网端口
    */
    @SerializedName("PrimaryVport")
    @Expose
    private Long PrimaryVport;

    /**
    * 主实例可用区
    */
    @SerializedName("PrimaryZones")
    @Expose
    private String [] PrimaryZones;

    /**
    * 主实例运行状态
    */
    @SerializedName("PrimaryStatus")
    @Expose
    private String PrimaryStatus;

    /**
    * 备实例 ID
    */
    @SerializedName("SecondaryInstanceId")
    @Expose
    private String SecondaryInstanceId;

    /**
    * 备实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryInstanceName")
    @Expose
    private String SecondaryInstanceName;

    /**
    * 备实例地域
    */
    @SerializedName("SecondaryRegion")
    @Expose
    private String SecondaryRegion;

    /**
    * 备实例子网 IP
    */
    @SerializedName("SecondaryVip")
    @Expose
    private String SecondaryVip;

    /**
    * 备实例子网端口
    */
    @SerializedName("SecondaryVport")
    @Expose
    private Long SecondaryVport;

    /**
    * 备实例可用区
    */
    @SerializedName("SecondaryZones")
    @Expose
    private String [] SecondaryZones;

    /**
    * 备实例运行状态
    */
    @SerializedName("SecondaryStatus")
    @Expose
    private String SecondaryStatus;

    /**
    * 连接类型，log_service 或 raft
    */
    @SerializedName("ConnType")
    @Expose
    private String ConnType;

    /**
    * 同步类型，sync 或 async
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * 同步状态，1: 正在同步；2: 同步异常
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * 同步状态描述，同步状态异常时的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncStatusDesc")
    @Expose
    private String SyncStatusDesc;

    /**
    * 灾备状态描述，"creating" "running" "modifying"，无灾备关系时为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandbyStatus")
    @Expose
    private String StandbyStatus;

    /**
    * 主实例版本
    */
    @SerializedName("PrimaryCreateVersion")
    @Expose
    private String PrimaryCreateVersion;

    /**
    * 备实例版本
    */
    @SerializedName("SecondaryCreateVersion")
    @Expose
    private String SecondaryCreateVersion;

    /**
    * 时延 单位为秒
    */
    @SerializedName("SyncDelay")
    @Expose
    private Long SyncDelay;

    /**
     * Get 主实例 ID 
     * @return PrimaryInstanceId 主实例 ID
     */
    public String getPrimaryInstanceId() {
        return this.PrimaryInstanceId;
    }

    /**
     * Set 主实例 ID
     * @param PrimaryInstanceId 主实例 ID
     */
    public void setPrimaryInstanceId(String PrimaryInstanceId) {
        this.PrimaryInstanceId = PrimaryInstanceId;
    }

    /**
     * Get 主实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrimaryInstanceName 主实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrimaryInstanceName() {
        return this.PrimaryInstanceName;
    }

    /**
     * Set 主实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrimaryInstanceName 主实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrimaryInstanceName(String PrimaryInstanceName) {
        this.PrimaryInstanceName = PrimaryInstanceName;
    }

    /**
     * Get 主实例地域 
     * @return PrimaryRegion 主实例地域
     */
    public String getPrimaryRegion() {
        return this.PrimaryRegion;
    }

    /**
     * Set 主实例地域
     * @param PrimaryRegion 主实例地域
     */
    public void setPrimaryRegion(String PrimaryRegion) {
        this.PrimaryRegion = PrimaryRegion;
    }

    /**
     * Get 主实例子网 IP 
     * @return PrimaryVip 主实例子网 IP
     */
    public String getPrimaryVip() {
        return this.PrimaryVip;
    }

    /**
     * Set 主实例子网 IP
     * @param PrimaryVip 主实例子网 IP
     */
    public void setPrimaryVip(String PrimaryVip) {
        this.PrimaryVip = PrimaryVip;
    }

    /**
     * Get 主实例子网端口 
     * @return PrimaryVport 主实例子网端口
     */
    public Long getPrimaryVport() {
        return this.PrimaryVport;
    }

    /**
     * Set 主实例子网端口
     * @param PrimaryVport 主实例子网端口
     */
    public void setPrimaryVport(Long PrimaryVport) {
        this.PrimaryVport = PrimaryVport;
    }

    /**
     * Get 主实例可用区 
     * @return PrimaryZones 主实例可用区
     */
    public String [] getPrimaryZones() {
        return this.PrimaryZones;
    }

    /**
     * Set 主实例可用区
     * @param PrimaryZones 主实例可用区
     */
    public void setPrimaryZones(String [] PrimaryZones) {
        this.PrimaryZones = PrimaryZones;
    }

    /**
     * Get 主实例运行状态 
     * @return PrimaryStatus 主实例运行状态
     */
    public String getPrimaryStatus() {
        return this.PrimaryStatus;
    }

    /**
     * Set 主实例运行状态
     * @param PrimaryStatus 主实例运行状态
     */
    public void setPrimaryStatus(String PrimaryStatus) {
        this.PrimaryStatus = PrimaryStatus;
    }

    /**
     * Get 备实例 ID 
     * @return SecondaryInstanceId 备实例 ID
     */
    public String getSecondaryInstanceId() {
        return this.SecondaryInstanceId;
    }

    /**
     * Set 备实例 ID
     * @param SecondaryInstanceId 备实例 ID
     */
    public void setSecondaryInstanceId(String SecondaryInstanceId) {
        this.SecondaryInstanceId = SecondaryInstanceId;
    }

    /**
     * Get 备实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryInstanceName 备实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondaryInstanceName() {
        return this.SecondaryInstanceName;
    }

    /**
     * Set 备实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryInstanceName 备实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryInstanceName(String SecondaryInstanceName) {
        this.SecondaryInstanceName = SecondaryInstanceName;
    }

    /**
     * Get 备实例地域 
     * @return SecondaryRegion 备实例地域
     */
    public String getSecondaryRegion() {
        return this.SecondaryRegion;
    }

    /**
     * Set 备实例地域
     * @param SecondaryRegion 备实例地域
     */
    public void setSecondaryRegion(String SecondaryRegion) {
        this.SecondaryRegion = SecondaryRegion;
    }

    /**
     * Get 备实例子网 IP 
     * @return SecondaryVip 备实例子网 IP
     */
    public String getSecondaryVip() {
        return this.SecondaryVip;
    }

    /**
     * Set 备实例子网 IP
     * @param SecondaryVip 备实例子网 IP
     */
    public void setSecondaryVip(String SecondaryVip) {
        this.SecondaryVip = SecondaryVip;
    }

    /**
     * Get 备实例子网端口 
     * @return SecondaryVport 备实例子网端口
     */
    public Long getSecondaryVport() {
        return this.SecondaryVport;
    }

    /**
     * Set 备实例子网端口
     * @param SecondaryVport 备实例子网端口
     */
    public void setSecondaryVport(Long SecondaryVport) {
        this.SecondaryVport = SecondaryVport;
    }

    /**
     * Get 备实例可用区 
     * @return SecondaryZones 备实例可用区
     */
    public String [] getSecondaryZones() {
        return this.SecondaryZones;
    }

    /**
     * Set 备实例可用区
     * @param SecondaryZones 备实例可用区
     */
    public void setSecondaryZones(String [] SecondaryZones) {
        this.SecondaryZones = SecondaryZones;
    }

    /**
     * Get 备实例运行状态 
     * @return SecondaryStatus 备实例运行状态
     */
    public String getSecondaryStatus() {
        return this.SecondaryStatus;
    }

    /**
     * Set 备实例运行状态
     * @param SecondaryStatus 备实例运行状态
     */
    public void setSecondaryStatus(String SecondaryStatus) {
        this.SecondaryStatus = SecondaryStatus;
    }

    /**
     * Get 连接类型，log_service 或 raft 
     * @return ConnType 连接类型，log_service 或 raft
     */
    public String getConnType() {
        return this.ConnType;
    }

    /**
     * Set 连接类型，log_service 或 raft
     * @param ConnType 连接类型，log_service 或 raft
     */
    public void setConnType(String ConnType) {
        this.ConnType = ConnType;
    }

    /**
     * Get 同步类型，sync 或 async 
     * @return SyncMode 同步类型，sync 或 async
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set 同步类型，sync 或 async
     * @param SyncMode 同步类型，sync 或 async
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get 同步状态，1: 正在同步；2: 同步异常 
     * @return SyncStatus 同步状态，1: 正在同步；2: 同步异常
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set 同步状态，1: 正在同步；2: 同步异常
     * @param SyncStatus 同步状态，1: 正在同步；2: 同步异常
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get 同步状态描述，同步状态异常时的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncStatusDesc 同步状态描述，同步状态异常时的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSyncStatusDesc() {
        return this.SyncStatusDesc;
    }

    /**
     * Set 同步状态描述，同步状态异常时的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncStatusDesc 同步状态描述，同步状态异常时的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncStatusDesc(String SyncStatusDesc) {
        this.SyncStatusDesc = SyncStatusDesc;
    }

    /**
     * Get 灾备状态描述，"creating" "running" "modifying"，无灾备关系时为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandbyStatus 灾备状态描述，"creating" "running" "modifying"，无灾备关系时为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandbyStatus() {
        return this.StandbyStatus;
    }

    /**
     * Set 灾备状态描述，"creating" "running" "modifying"，无灾备关系时为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandbyStatus 灾备状态描述，"creating" "running" "modifying"，无灾备关系时为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandbyStatus(String StandbyStatus) {
        this.StandbyStatus = StandbyStatus;
    }

    /**
     * Get 主实例版本 
     * @return PrimaryCreateVersion 主实例版本
     */
    public String getPrimaryCreateVersion() {
        return this.PrimaryCreateVersion;
    }

    /**
     * Set 主实例版本
     * @param PrimaryCreateVersion 主实例版本
     */
    public void setPrimaryCreateVersion(String PrimaryCreateVersion) {
        this.PrimaryCreateVersion = PrimaryCreateVersion;
    }

    /**
     * Get 备实例版本 
     * @return SecondaryCreateVersion 备实例版本
     */
    public String getSecondaryCreateVersion() {
        return this.SecondaryCreateVersion;
    }

    /**
     * Set 备实例版本
     * @param SecondaryCreateVersion 备实例版本
     */
    public void setSecondaryCreateVersion(String SecondaryCreateVersion) {
        this.SecondaryCreateVersion = SecondaryCreateVersion;
    }

    /**
     * Get 时延 单位为秒 
     * @return SyncDelay 时延 单位为秒
     */
    public Long getSyncDelay() {
        return this.SyncDelay;
    }

    /**
     * Set 时延 单位为秒
     * @param SyncDelay 时延 单位为秒
     */
    public void setSyncDelay(Long SyncDelay) {
        this.SyncDelay = SyncDelay;
    }

    public StandbyDBInstanceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandbyDBInstanceRelation(StandbyDBInstanceRelation source) {
        if (source.PrimaryInstanceId != null) {
            this.PrimaryInstanceId = new String(source.PrimaryInstanceId);
        }
        if (source.PrimaryInstanceName != null) {
            this.PrimaryInstanceName = new String(source.PrimaryInstanceName);
        }
        if (source.PrimaryRegion != null) {
            this.PrimaryRegion = new String(source.PrimaryRegion);
        }
        if (source.PrimaryVip != null) {
            this.PrimaryVip = new String(source.PrimaryVip);
        }
        if (source.PrimaryVport != null) {
            this.PrimaryVport = new Long(source.PrimaryVport);
        }
        if (source.PrimaryZones != null) {
            this.PrimaryZones = new String[source.PrimaryZones.length];
            for (int i = 0; i < source.PrimaryZones.length; i++) {
                this.PrimaryZones[i] = new String(source.PrimaryZones[i]);
            }
        }
        if (source.PrimaryStatus != null) {
            this.PrimaryStatus = new String(source.PrimaryStatus);
        }
        if (source.SecondaryInstanceId != null) {
            this.SecondaryInstanceId = new String(source.SecondaryInstanceId);
        }
        if (source.SecondaryInstanceName != null) {
            this.SecondaryInstanceName = new String(source.SecondaryInstanceName);
        }
        if (source.SecondaryRegion != null) {
            this.SecondaryRegion = new String(source.SecondaryRegion);
        }
        if (source.SecondaryVip != null) {
            this.SecondaryVip = new String(source.SecondaryVip);
        }
        if (source.SecondaryVport != null) {
            this.SecondaryVport = new Long(source.SecondaryVport);
        }
        if (source.SecondaryZones != null) {
            this.SecondaryZones = new String[source.SecondaryZones.length];
            for (int i = 0; i < source.SecondaryZones.length; i++) {
                this.SecondaryZones[i] = new String(source.SecondaryZones[i]);
            }
        }
        if (source.SecondaryStatus != null) {
            this.SecondaryStatus = new String(source.SecondaryStatus);
        }
        if (source.ConnType != null) {
            this.ConnType = new String(source.ConnType);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new Long(source.SyncStatus);
        }
        if (source.SyncStatusDesc != null) {
            this.SyncStatusDesc = new String(source.SyncStatusDesc);
        }
        if (source.StandbyStatus != null) {
            this.StandbyStatus = new String(source.StandbyStatus);
        }
        if (source.PrimaryCreateVersion != null) {
            this.PrimaryCreateVersion = new String(source.PrimaryCreateVersion);
        }
        if (source.SecondaryCreateVersion != null) {
            this.SecondaryCreateVersion = new String(source.SecondaryCreateVersion);
        }
        if (source.SyncDelay != null) {
            this.SyncDelay = new Long(source.SyncDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryInstanceId", this.PrimaryInstanceId);
        this.setParamSimple(map, prefix + "PrimaryInstanceName", this.PrimaryInstanceName);
        this.setParamSimple(map, prefix + "PrimaryRegion", this.PrimaryRegion);
        this.setParamSimple(map, prefix + "PrimaryVip", this.PrimaryVip);
        this.setParamSimple(map, prefix + "PrimaryVport", this.PrimaryVport);
        this.setParamArraySimple(map, prefix + "PrimaryZones.", this.PrimaryZones);
        this.setParamSimple(map, prefix + "PrimaryStatus", this.PrimaryStatus);
        this.setParamSimple(map, prefix + "SecondaryInstanceId", this.SecondaryInstanceId);
        this.setParamSimple(map, prefix + "SecondaryInstanceName", this.SecondaryInstanceName);
        this.setParamSimple(map, prefix + "SecondaryRegion", this.SecondaryRegion);
        this.setParamSimple(map, prefix + "SecondaryVip", this.SecondaryVip);
        this.setParamSimple(map, prefix + "SecondaryVport", this.SecondaryVport);
        this.setParamArraySimple(map, prefix + "SecondaryZones.", this.SecondaryZones);
        this.setParamSimple(map, prefix + "SecondaryStatus", this.SecondaryStatus);
        this.setParamSimple(map, prefix + "ConnType", this.ConnType);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncStatusDesc", this.SyncStatusDesc);
        this.setParamSimple(map, prefix + "StandbyStatus", this.StandbyStatus);
        this.setParamSimple(map, prefix + "PrimaryCreateVersion", this.PrimaryCreateVersion);
        this.setParamSimple(map, prefix + "SecondaryCreateVersion", this.SecondaryCreateVersion);
        this.setParamSimple(map, prefix + "SyncDelay", this.SyncDelay);

    }
}

