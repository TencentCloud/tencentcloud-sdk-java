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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInstanceInfo extends AbstractModel {

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

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
    private Tag [] TagList;

    /**
    * <p>引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>是否支持审计。1代表支持，0代表不支持。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportAudit")
    @Expose
    private Long IsSupportAudit;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志类型</p><p>枚举值：</p><ul><li>complex： 精细审计</li><li>simple： 极速审计</li></ul>
    */
    @SerializedName("AuditType")
    @Expose
    private String AuditType;

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
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList <p>实例标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>引擎</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine <p>引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine <p>引擎</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersion <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersion <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>是否支持审计。1代表支持，0代表不支持。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportAudit <p>是否支持审计。1代表支持，0代表不支持。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSupportAudit() {
        return this.IsSupportAudit;
    }

    /**
     * Set <p>是否支持审计。1代表支持，0代表不支持。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportAudit <p>是否支持审计。1代表支持，0代表不支持。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportAudit(Long IsSupportAudit) {
        this.IsSupportAudit = IsSupportAudit;
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
     * Get <p>日志类型</p><p>枚举值：</p><ul><li>complex： 精细审计</li><li>simple： 极速审计</li></ul> 
     * @return AuditType <p>日志类型</p><p>枚举值：</p><ul><li>complex： 精细审计</li><li>simple： 极速审计</li></ul>
     */
    public String getAuditType() {
        return this.AuditType;
    }

    /**
     * Set <p>日志类型</p><p>枚举值：</p><ul><li>complex： 精细审计</li><li>simple： 极速审计</li></ul>
     * @param AuditType <p>日志类型</p><p>枚举值：</p><ul><li>complex： 精细审计</li><li>simple： 极速审计</li></ul>
     */
    public void setAuditType(String AuditType) {
        this.AuditType = AuditType;
    }

    public LogInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInstanceInfo(LogInstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.IsSupportAudit != null) {
            this.IsSupportAudit = new Long(source.IsSupportAudit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditType != null) {
            this.AuditType = new String(source.AuditType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "IsSupportAudit", this.IsSupportAudit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditType", this.AuditType);

    }
}

