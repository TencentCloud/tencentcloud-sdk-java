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

public class ModifySkillRequest extends AbstractModel {

    /**
    * <p>SkillId</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>skill描述</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>skill名称</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>skill包文件地址（zip）；传入则触发新版本生成，需与SkillVersion、UpdateDescription配套传入</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>图标地址</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>skill版本号（与FileUrl配套传入）</p>
    */
    @SerializedName("SkillVersion")
    @Expose
    private String SkillVersion;

    /**
    * <p>版本变更说明（与FileUrl配套传入）</p>
    */
    @SerializedName("UpdateDescription")
    @Expose
    private String UpdateDescription;

    /**
     * Get <p>SkillId</p> 
     * @return SkillId <p>SkillId</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>SkillId</p>
     * @param SkillId <p>SkillId</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
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
     * Get <p>skill描述</p> 
     * @return DisplayDescription <p>skill描述</p>
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set <p>skill描述</p>
     * @param DisplayDescription <p>skill描述</p>
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
    }

    /**
     * Get <p>skill名称</p> 
     * @return DisplayName <p>skill名称</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>skill名称</p>
     * @param DisplayName <p>skill名称</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>skill包文件地址（zip）；传入则触发新版本生成，需与SkillVersion、UpdateDescription配套传入</p> 
     * @return FileUrl <p>skill包文件地址（zip）；传入则触发新版本生成，需与SkillVersion、UpdateDescription配套传入</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>skill包文件地址（zip）；传入则触发新版本生成，需与SkillVersion、UpdateDescription配套传入</p>
     * @param FileUrl <p>skill包文件地址（zip）；传入则触发新版本生成，需与SkillVersion、UpdateDescription配套传入</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
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
     * Get <p>skill版本号（与FileUrl配套传入）</p> 
     * @return SkillVersion <p>skill版本号（与FileUrl配套传入）</p>
     */
    public String getSkillVersion() {
        return this.SkillVersion;
    }

    /**
     * Set <p>skill版本号（与FileUrl配套传入）</p>
     * @param SkillVersion <p>skill版本号（与FileUrl配套传入）</p>
     */
    public void setSkillVersion(String SkillVersion) {
        this.SkillVersion = SkillVersion;
    }

    /**
     * Get <p>版本变更说明（与FileUrl配套传入）</p> 
     * @return UpdateDescription <p>版本变更说明（与FileUrl配套传入）</p>
     */
    public String getUpdateDescription() {
        return this.UpdateDescription;
    }

    /**
     * Set <p>版本变更说明（与FileUrl配套传入）</p>
     * @param UpdateDescription <p>版本变更说明（与FileUrl配套传入）</p>
     */
    public void setUpdateDescription(String UpdateDescription) {
        this.UpdateDescription = UpdateDescription;
    }

    public ModifySkillRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySkillRequest(ModifySkillRequest source) {
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
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
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
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
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "SkillVersion", this.SkillVersion);
        this.setParamSimple(map, prefix + "UpdateDescription", this.UpdateDescription);

    }
}

