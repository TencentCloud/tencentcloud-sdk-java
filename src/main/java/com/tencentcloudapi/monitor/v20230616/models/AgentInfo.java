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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentInfo extends AbstractModel {

    /**
    * <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Agent 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Agent 分类</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>状态: draft/configured/running/standby/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillIds")
    @Expose
    private String [] SkillIds;

    /**
    * <p>关联的资源地图 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>关联的mcp id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCPIds")
    @Expose
    private String [] MCPIds;

    /**
    * <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CamTags")
    @Expose
    private Tag [] CamTags;

    /**
    * <p>agent运行时所需环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
     * Get <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Agent 描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>Agent 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Agent 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>Agent 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Agent 分类</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category <p>Agent 分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Agent 分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category <p>Agent 分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>状态: draft/configured/running/standby/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态: draft/configured/running/standby/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态: draft/configured/running/standby/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态: draft/configured/running/standby/disabled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillIds <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSkillIds() {
        return this.SkillIds;
    }

    /**
     * Set <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillIds <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillIds(String [] SkillIds) {
        this.SkillIds = SkillIds;
    }

    /**
     * Get <p>关联的资源地图 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceMapId <p>关联的资源地图 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>关联的资源地图 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceMapId <p>关联的资源地图 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>关联的mcp id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCPIds <p>关联的mcp id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>关联的mcp id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCPIds <p>关联的mcp id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMCPIds(String [] MCPIds) {
        this.MCPIds = MCPIds;
    }

    /**
     * Get <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CamTags <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getCamTags() {
        return this.CamTags;
    }

    /**
     * Set <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CamTags <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCamTags(Tag [] CamTags) {
        this.CamTags = CamTags;
    }

    /**
     * Get <p>agent运行时所需环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvVars <p>agent运行时所需环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>agent运行时所需环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvVars <p>agent运行时所需环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    public AgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentInfo(AgentInfo source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SkillIds != null) {
            this.SkillIds = new String[source.SkillIds.length];
            for (int i = 0; i < source.SkillIds.length; i++) {
                this.SkillIds[i] = new String(source.SkillIds[i]);
            }
        }
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
        }
        if (source.MCPIds != null) {
            this.MCPIds = new String[source.MCPIds.length];
            for (int i = 0; i < source.MCPIds.length; i++) {
                this.MCPIds[i] = new String(source.MCPIds[i]);
            }
        }
        if (source.CamTags != null) {
            this.CamTags = new Tag[source.CamTags.length];
            for (int i = 0; i < source.CamTags.length; i++) {
                this.CamTags[i] = new Tag(source.CamTags[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new EnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvVar(source.EnvVars[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamArraySimple(map, prefix + "MCPIds.", this.MCPIds);
        this.setParamArrayObj(map, prefix + "CamTags.", this.CamTags);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);

    }
}

