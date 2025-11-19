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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * 审计日志保存时长。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditLogExpireDay")
    @Expose
    private Long AuditLogExpireDay;

    /**
    * 审计状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例角色。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 数据库版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongodbVersion")
    @Expose
    private String MongodbVersion;

    /**
    * 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否支持审计。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportAudit")
    @Expose
    private Boolean SupportAudit;

    /**
    * 可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
     * Get 审计日志保存时长。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditLogExpireDay 审计日志保存时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuditLogExpireDay() {
        return this.AuditLogExpireDay;
    }

    /**
     * Set 审计日志保存时长。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditLogExpireDay 审计日志保存时长。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditLogExpireDay(Long AuditLogExpireDay) {
        this.AuditLogExpireDay = AuditLogExpireDay;
    }

    /**
     * Get 审计状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditStatus 审计状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审计状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditStatus 审计状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例角色。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRole 实例角色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例角色。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRole 实例角色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 实例类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 数据库版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongodbVersion 数据库版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMongodbVersion() {
        return this.MongodbVersion;
    }

    /**
     * Set 数据库版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongodbVersion 数据库版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongodbVersion(String MongodbVersion) {
        this.MongodbVersion = MongodbVersion;
    }

    /**
     * Get 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否支持审计。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportAudit 是否支持审计。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportAudit() {
        return this.SupportAudit;
    }

    /**
     * Set 是否支持审计。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportAudit 是否支持审计。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportAudit(Boolean SupportAudit) {
        this.SupportAudit = SupportAudit;
    }

    /**
     * Get 可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.AuditLogExpireDay != null) {
            this.AuditLogExpireDay = new Long(source.AuditLogExpireDay);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MongodbVersion != null) {
            this.MongodbVersion = new String(source.MongodbVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SupportAudit != null) {
            this.SupportAudit = new Boolean(source.SupportAudit);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditLogExpireDay", this.AuditLogExpireDay);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MongodbVersion", this.MongodbVersion);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SupportAudit", this.SupportAudit);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

