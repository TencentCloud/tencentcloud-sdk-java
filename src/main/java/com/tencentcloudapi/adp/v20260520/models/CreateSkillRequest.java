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

public class CreateSkillRequest extends AbstractModel {

    /**
    * <p>Skill 创建方式，必填；仅允许</p><p>枚举值：</p><ul><li>1： FILE_UPLOAD（文件上传）</li><li>3： AIGC（AIGC生成）</li></ul>
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
    * <p>skill包文件地址（zip）；FILE_UPLOAD / AIGC 均必填</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>skill展示描述</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>skill展示名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>图标地址</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>skill业务唯一标识名（同企业下唯一）；未传时从skill包解析</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>版本号</p>
    */
    @SerializedName("SkillVersion")
    @Expose
    private String SkillVersion;

    /**
    * <p>版本变更说明</p>
    */
    @SerializedName("UpdateDescription")
    @Expose
    private String UpdateDescription;

    /**
     * Get <p>Skill 创建方式，必填；仅允许</p><p>枚举值：</p><ul><li>1： FILE_UPLOAD（文件上传）</li><li>3： AIGC（AIGC生成）</li></ul> 
     * @return CreateType <p>Skill 创建方式，必填；仅允许</p><p>枚举值：</p><ul><li>1： FILE_UPLOAD（文件上传）</li><li>3： AIGC（AIGC生成）</li></ul>
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set <p>Skill 创建方式，必填；仅允许</p><p>枚举值：</p><ul><li>1： FILE_UPLOAD（文件上传）</li><li>3： AIGC（AIGC生成）</li></ul>
     * @param CreateType <p>Skill 创建方式，必填；仅允许</p><p>枚举值：</p><ul><li>1： FILE_UPLOAD（文件上传）</li><li>3： AIGC（AIGC生成）</li></ul>
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get <p>skill包文件地址（zip）；FILE_UPLOAD / AIGC 均必填</p> 
     * @return FileUrl <p>skill包文件地址（zip）；FILE_UPLOAD / AIGC 均必填</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>skill包文件地址（zip）；FILE_UPLOAD / AIGC 均必填</p>
     * @param FileUrl <p>skill包文件地址（zip）；FILE_UPLOAD / AIGC 均必填</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>空间ID</p> 
     * @return SpaceId <p>空间ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间ID</p>
     * @param SpaceId <p>空间ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>skill展示描述</p> 
     * @return DisplayDescription <p>skill展示描述</p>
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set <p>skill展示描述</p>
     * @param DisplayDescription <p>skill展示描述</p>
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
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
     * Get <p>图标地址</p> 
     * @return IconUrl <p>图标地址</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>图标地址</p>
     * @param IconUrl <p>图标地址</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>skill业务唯一标识名（同企业下唯一）；未传时从skill包解析</p> 
     * @return Name <p>skill业务唯一标识名（同企业下唯一）；未传时从skill包解析</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>skill业务唯一标识名（同企业下唯一）；未传时从skill包解析</p>
     * @param Name <p>skill业务唯一标识名（同企业下唯一）；未传时从skill包解析</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>版本号</p> 
     * @return SkillVersion <p>版本号</p>
     */
    public String getSkillVersion() {
        return this.SkillVersion;
    }

    /**
     * Set <p>版本号</p>
     * @param SkillVersion <p>版本号</p>
     */
    public void setSkillVersion(String SkillVersion) {
        this.SkillVersion = SkillVersion;
    }

    /**
     * Get <p>版本变更说明</p> 
     * @return UpdateDescription <p>版本变更说明</p>
     */
    public String getUpdateDescription() {
        return this.UpdateDescription;
    }

    /**
     * Set <p>版本变更说明</p>
     * @param UpdateDescription <p>版本变更说明</p>
     */
    public void setUpdateDescription(String UpdateDescription) {
        this.UpdateDescription = UpdateDescription;
    }

    public CreateSkillRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSkillRequest(CreateSkillRequest source) {
        if (source.CreateType != null) {
            this.CreateType = new Long(source.CreateType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
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
        if (source.SkillVersion != null) {
            this.SkillVersion = new String(source.SkillVersion);
        }
        if (source.UpdateDescription != null) {
            this.UpdateDescription = new String(source.UpdateDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SkillVersion", this.SkillVersion);
        this.setParamSimple(map, prefix + "UpdateDescription", this.UpdateDescription);

    }
}

