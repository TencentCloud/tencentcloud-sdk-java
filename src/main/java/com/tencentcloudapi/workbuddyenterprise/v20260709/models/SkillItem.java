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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillItem extends AbstractModel {

    /**
    * 技能来源：BUILTIN（内置）/ CUSTOM（自建）/ AUTHORIZED（企业授权）
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>slug（仅 custom 返回）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>展示名</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>图标 URL</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>下载 URL</p>
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * <p>技能标识</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillVersion")
    @Expose
    private String SkillVersion;

    /**
    * 创建时间，RFC3339 UTC 格式（如 2026-08-11T09:23:10Z）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，RFC3339 UTC 格式（如 2026-09-15T06:51:26Z）
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 技能来源：BUILTIN（内置）/ CUSTOM（自建）/ AUTHORIZED（企业授权） 
     * @return Source 技能来源：BUILTIN（内置）/ CUSTOM（自建）/ AUTHORIZED（企业授权）
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 技能来源：BUILTIN（内置）/ CUSTOM（自建）/ AUTHORIZED（企业授权）
     * @param Source 技能来源：BUILTIN（内置）/ CUSTOM（自建）/ AUTHORIZED（企业授权）
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>slug（仅 custom 返回）</p> 
     * @return Name <p>slug（仅 custom 返回）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>slug（仅 custom 返回）</p>
     * @param Name <p>slug（仅 custom 返回）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>展示名</p> 
     * @return DisplayName <p>展示名</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>展示名</p>
     * @param DisplayName <p>展示名</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>图标 URL</p> 
     * @return Icon <p>图标 URL</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>图标 URL</p>
     * @param Icon <p>图标 URL</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>是否启用</p> 
     * @return Enabled <p>是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enabled <p>是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>下载 URL</p> 
     * @return DownloadUrl <p>下载 URL</p>
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set <p>下载 URL</p>
     * @param DownloadUrl <p>下载 URL</p>
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get <p>技能标识</p> 
     * @return SkillId <p>技能标识</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>技能标识</p>
     * @param SkillId <p>技能标识</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillVersion <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkillVersion() {
        return this.SkillVersion;
    }

    /**
     * Set <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillVersion <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillVersion(String SkillVersion) {
        this.SkillVersion = SkillVersion;
    }

    /**
     * Get 创建时间，RFC3339 UTC 格式（如 2026-08-11T09:23:10Z） 
     * @return CreateTime 创建时间，RFC3339 UTC 格式（如 2026-08-11T09:23:10Z）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，RFC3339 UTC 格式（如 2026-08-11T09:23:10Z）
     * @param CreateTime 创建时间，RFC3339 UTC 格式（如 2026-08-11T09:23:10Z）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，RFC3339 UTC 格式（如 2026-09-15T06:51:26Z） 
     * @return UpdateTime 更新时间，RFC3339 UTC 格式（如 2026-09-15T06:51:26Z）
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，RFC3339 UTC 格式（如 2026-09-15T06:51:26Z）
     * @param UpdateTime 更新时间，RFC3339 UTC 格式（如 2026-09-15T06:51:26Z）
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SkillItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillItem(SkillItem source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.SkillVersion != null) {
            this.SkillVersion = new String(source.SkillVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "SkillVersion", this.SkillVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

