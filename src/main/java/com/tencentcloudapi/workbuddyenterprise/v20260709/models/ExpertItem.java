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

public class ExpertItem extends AbstractModel {

    /**
    * <p>专家来源：builtin、custom</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

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
    * <p>更新时间</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>启停状态：enabled、disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>专家标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpertId")
    @Expose
    private String ExpertId;

    /**
    * <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpertVersion")
    @Expose
    private String ExpertVersion;

    /**
     * Get <p>专家来源：builtin、custom</p> 
     * @return Source <p>专家来源：builtin、custom</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>专家来源：builtin、custom</p>
     * @param Source <p>专家来源：builtin、custom</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
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
     * Get <p>更新时间</p> 
     * @return ModifiedTime <p>更新时间</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param ModifiedTime <p>更新时间</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>启停状态：enabled、disabled</p> 
     * @return Status <p>启停状态：enabled、disabled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>启停状态：enabled、disabled</p>
     * @param Status <p>启停状态：enabled、disabled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>专家标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpertId <p>专家标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpertId() {
        return this.ExpertId;
    }

    /**
     * Set <p>专家标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpertId <p>专家标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpertId(String ExpertId) {
        this.ExpertId = ExpertId;
    }

    /**
     * Get <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpertVersion <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpertVersion() {
        return this.ExpertVersion;
    }

    /**
     * Set <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpertVersion <p>当前生效版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpertVersion(String ExpertVersion) {
        this.ExpertVersion = ExpertVersion;
    }

    public ExpertItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpertItem(ExpertItem source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
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
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpertId != null) {
            this.ExpertId = new String(source.ExpertId);
        }
        if (source.ExpertVersion != null) {
            this.ExpertVersion = new String(source.ExpertVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpertId", this.ExpertId);
        this.setParamSimple(map, prefix + "ExpertVersion", this.ExpertVersion);

    }
}

