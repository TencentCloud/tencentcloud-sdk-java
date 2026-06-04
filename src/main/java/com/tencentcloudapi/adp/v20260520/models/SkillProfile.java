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
    * 创建时间（Unix秒）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Skill 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Skill 展示描述
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * Skill 展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Skill 图标
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * Skill 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 更新时间（Unix秒）
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 创建时间（Unix秒） 
     * @return CreateTime 创建时间（Unix秒）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间（Unix秒）
     * @param CreateTime 创建时间（Unix秒）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建者 
     * @return Creator 创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
     * @param Creator 创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Skill 描述 
     * @return Description Skill 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Skill 描述
     * @param Description Skill 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Skill 展示描述 
     * @return DisplayDescription Skill 展示描述
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set Skill 展示描述
     * @param DisplayDescription Skill 展示描述
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
    }

    /**
     * Get Skill 展示名称 
     * @return DisplayName Skill 展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Skill 展示名称
     * @param DisplayName Skill 展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Skill 图标 
     * @return IconUrl Skill 图标
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set Skill 图标
     * @param IconUrl Skill 图标
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get Skill 名称 
     * @return Name Skill 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Skill 名称
     * @param Name Skill 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 更新时间（Unix秒） 
     * @return UpdateTime 更新时间（Unix秒）
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（Unix秒）
     * @param UpdateTime 更新时间（Unix秒）
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    }
}

