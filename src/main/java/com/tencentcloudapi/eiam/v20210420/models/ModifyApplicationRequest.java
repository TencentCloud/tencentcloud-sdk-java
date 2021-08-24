/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationRequest extends AbstractModel{

    /**
    * 应用ID，是应用的全局唯一标识。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 安全级别。
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
    * 应用展示名称，长度限制：32个字符。 默认与应用名字相同。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 应用状态，true表示启用，false表示禁用。
    */
    @SerializedName("AppStatus")
    @Expose
    private Boolean AppStatus;

    /**
    * 应用图标图片访问地址。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 描述。长度不超过128。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 应用ID，是应用的全局唯一标识。 
     * @return ApplicationId 应用ID，是应用的全局唯一标识。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，是应用的全局唯一标识。
     * @param ApplicationId 应用ID，是应用的全局唯一标识。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 安全级别。 
     * @return SecureLevel 安全级别。
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set 安全级别。
     * @param SecureLevel 安全级别。
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    /**
     * Get 应用展示名称，长度限制：32个字符。 默认与应用名字相同。 
     * @return DisplayName 应用展示名称，长度限制：32个字符。 默认与应用名字相同。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 应用展示名称，长度限制：32个字符。 默认与应用名字相同。
     * @param DisplayName 应用展示名称，长度限制：32个字符。 默认与应用名字相同。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 应用状态，true表示启用，false表示禁用。 
     * @return AppStatus 应用状态，true表示启用，false表示禁用。
     */
    public Boolean getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态，true表示启用，false表示禁用。
     * @param AppStatus 应用状态，true表示启用，false表示禁用。
     */
    public void setAppStatus(Boolean AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get 应用图标图片访问地址。 
     * @return IconUrl 应用图标图片访问地址。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 应用图标图片访问地址。
     * @param IconUrl 应用图标图片访问地址。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 描述。长度不超过128。 
     * @return Description 描述。长度不超过128。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。长度不超过128。
     * @param Description 描述。长度不超过128。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationRequest(ModifyApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.SecureLevel != null) {
            this.SecureLevel = new String(source.SecureLevel);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Boolean(source.AppStatus);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SecureLevel", this.SecureLevel);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

