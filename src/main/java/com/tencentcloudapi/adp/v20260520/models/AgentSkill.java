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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentSkill extends AbstractModel {

    /**
    * <p>skillId</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>skill名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>技能描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>skill展示名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>技能展示描述</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>skill图标url</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Skill来源</p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>Skill版本</p>
    */
    @SerializedName("CurrentVersion")
    @Expose
    private String CurrentVersion;

    /**
     * Get <p>skillId</p> 
     * @return SkillId <p>skillId</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>skillId</p>
     * @param SkillId <p>skillId</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>skill名称</p> 
     * @return Name <p>skill名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>skill名称</p>
     * @param Name <p>skill名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>技能描述</p> 
     * @return Description <p>技能描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>技能描述</p>
     * @param Description <p>技能描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>skill展示名称</p> 
     * @return DisplayName <p>skill展示名称</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>skill展示名称</p>
     * @param DisplayName <p>skill展示名称</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>技能展示描述</p> 
     * @return DisplayDescription <p>技能展示描述</p>
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set <p>技能展示描述</p>
     * @param DisplayDescription <p>技能展示描述</p>
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
    }

    /**
     * Get <p>skill图标url</p> 
     * @return IconUrl <p>skill图标url</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>skill图标url</p>
     * @param IconUrl <p>skill图标url</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Skill来源</p> 
     * @return SourceType <p>Skill来源</p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Skill来源</p>
     * @param SourceType <p>Skill来源</p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Skill版本</p> 
     * @return CurrentVersion <p>Skill版本</p>
     */
    public String getCurrentVersion() {
        return this.CurrentVersion;
    }

    /**
     * Set <p>Skill版本</p>
     * @param CurrentVersion <p>Skill版本</p>
     */
    public void setCurrentVersion(String CurrentVersion) {
        this.CurrentVersion = CurrentVersion;
    }

    public AgentSkill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSkill(AgentSkill source) {
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.DisplayDescription != null) {
            this.DisplayDescription = new String(source.DisplayDescription);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.CurrentVersion != null) {
            this.CurrentVersion = new String(source.CurrentVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CurrentVersion", this.CurrentVersion);

    }
}

