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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
    * <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ROFlag")
    @Expose
    private String ROFlag;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HAFlag")
    @Expose
    private String HAFlag;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>审计日志状态 ON, OFF, ERROR</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditLogStatus")
    @Expose
    private String AuditLogStatus;

    /**
    * <p>审计日志上报地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditLogHosts")
    @Expose
    private String [] AuditLogHosts;

    /**
    * <p>审计日志状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditLogStatusMessage")
    @Expose
    private String AuditLogStatusMessage;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>版本名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>地域id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>区id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Architecture <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Architecture <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ROFlag <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getROFlag() {
        return this.ROFlag;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ROFlag <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setROFlag(String ROFlag) {
        this.ROFlag = ROFlag;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HAFlag <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHAFlag() {
        return this.HAFlag;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HAFlag <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHAFlag(String HAFlag) {
        this.HAFlag = HAFlag;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>test</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>审计日志状态 ON, OFF, ERROR</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditLogStatus <p>审计日志状态 ON, OFF, ERROR</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuditLogStatus() {
        return this.AuditLogStatus;
    }

    /**
     * Set <p>审计日志状态 ON, OFF, ERROR</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditLogStatus <p>审计日志状态 ON, OFF, ERROR</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditLogStatus(String AuditLogStatus) {
        this.AuditLogStatus = AuditLogStatus;
    }

    /**
     * Get <p>审计日志上报地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditLogHosts <p>审计日志上报地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAuditLogHosts() {
        return this.AuditLogHosts;
    }

    /**
     * Set <p>审计日志上报地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditLogHosts <p>审计日志上报地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditLogHosts(String [] AuditLogHosts) {
        this.AuditLogHosts = AuditLogHosts;
    }

    /**
     * Get <p>审计日志状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditLogStatusMessage <p>审计日志状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuditLogStatusMessage() {
        return this.AuditLogStatusMessage;
    }

    /**
     * Set <p>审计日志状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditLogStatusMessage <p>审计日志状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditLogStatusMessage(String AuditLogStatusMessage) {
        this.AuditLogStatusMessage = AuditLogStatusMessage;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>版本名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName <p>版本名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>版本名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName <p>版本名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>地域id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId <p>地域id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId <p>地域id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>区id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId <p>区id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>区id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId <p>区id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.ROFlag != null) {
            this.ROFlag = new String(source.ROFlag);
        }
        if (source.HAFlag != null) {
            this.HAFlag = new String(source.HAFlag);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AuditLogStatus != null) {
            this.AuditLogStatus = new String(source.AuditLogStatus);
        }
        if (source.AuditLogHosts != null) {
            this.AuditLogHosts = new String[source.AuditLogHosts.length];
            for (int i = 0; i < source.AuditLogHosts.length; i++) {
                this.AuditLogHosts[i] = new String(source.AuditLogHosts[i]);
            }
        }
        if (source.AuditLogStatusMessage != null) {
            this.AuditLogStatusMessage = new String(source.AuditLogStatusMessage);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "ROFlag", this.ROFlag);
        this.setParamSimple(map, prefix + "HAFlag", this.HAFlag);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AuditLogStatus", this.AuditLogStatus);
        this.setParamArraySimple(map, prefix + "AuditLogHosts.", this.AuditLogHosts);
        this.setParamSimple(map, prefix + "AuditLogStatusMessage", this.AuditLogStatusMessage);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

