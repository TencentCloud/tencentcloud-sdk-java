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

public class SkillProfile extends AbstractModel {

    /**
    * <p>创建时间（Unix秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>创建者</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>Skill 描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Skill 展示描述</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>Skill 展示名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>Skill 图标</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Skill 名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>更新时间（Unix秒）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>空间</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>创建时间（Unix秒）</p> 
     * @return CreateTime <p>创建时间（Unix秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix秒）</p>
     * @param CreateTime <p>创建时间（Unix秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>创建者</p> 
     * @return Creator <p>创建者</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者</p>
     * @param Creator <p>创建者</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>Skill 描述</p> 
     * @return Description <p>Skill 描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Skill 描述</p>
     * @param Description <p>Skill 描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Skill 展示描述</p> 
     * @return DisplayDescription <p>Skill 展示描述</p>
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set <p>Skill 展示描述</p>
     * @param DisplayDescription <p>Skill 展示描述</p>
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
    }

    /**
     * Get <p>Skill 展示名称</p> 
     * @return DisplayName <p>Skill 展示名称</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>Skill 展示名称</p>
     * @param DisplayName <p>Skill 展示名称</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>Skill 图标</p> 
     * @return IconUrl <p>Skill 图标</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>Skill 图标</p>
     * @param IconUrl <p>Skill 图标</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Skill 名称</p> 
     * @return Name <p>Skill 名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Skill 名称</p>
     * @param Name <p>Skill 名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>更新时间（Unix秒）</p> 
     * @return UpdateTime <p>更新时间（Unix秒）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix秒）</p>
     * @param UpdateTime <p>更新时间（Unix秒）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>空间</p> 
     * @return SpaceId <p>空间</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间</p>
     * @param SpaceId <p>空间</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public SkillProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillProfile(SkillProfile source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DisplayDescription != null) {
            this.DisplayDescription = new String(source.DisplayDescription);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

