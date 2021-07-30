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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Blueprint extends AbstractModel{

    /**
    * 镜像 ID  ，是 Blueprint 的唯一标识。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 镜像对外展示标题。
    */
    @SerializedName("DisplayTitle")
    @Expose
    private String DisplayTitle;

    /**
    * 镜像对外展示版本。
    */
    @SerializedName("DisplayVersion")
    @Expose
    private String DisplayVersion;

    /**
    * 镜像描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 操作系统名称。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 操作系统平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
    */
    @SerializedName("PlatformType")
    @Expose
    private String PlatformType;

    /**
    * 镜像类型，如 APP_OS、PURE_OS、PRIVATE。
    */
    @SerializedName("BlueprintType")
    @Expose
    private String BlueprintType;

    /**
    * 镜像图片 URL。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 镜像所需系统盘大小，单位 GB。
    */
    @SerializedName("RequiredSystemDiskSize")
    @Expose
    private Long RequiredSystemDiskSize;

    /**
    * 镜像状态。
    */
    @SerializedName("BlueprintState")
    @Expose
    private String BlueprintState;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 镜像名称。
    */
    @SerializedName("BlueprintName")
    @Expose
    private String BlueprintName;

    /**
    * 镜像是否支持自动化助手。
    */
    @SerializedName("SupportAutomationTools")
    @Expose
    private Boolean SupportAutomationTools;

    /**
    * 镜像所需内存大小, 单位: GB
    */
    @SerializedName("RequiredMemorySize")
    @Expose
    private Long RequiredMemorySize;

    /**
    * CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get 镜像 ID  ，是 Blueprint 的唯一标识。 
     * @return BlueprintId 镜像 ID  ，是 Blueprint 的唯一标识。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像 ID  ，是 Blueprint 的唯一标识。
     * @param BlueprintId 镜像 ID  ，是 Blueprint 的唯一标识。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 镜像对外展示标题。 
     * @return DisplayTitle 镜像对外展示标题。
     */
    public String getDisplayTitle() {
        return this.DisplayTitle;
    }

    /**
     * Set 镜像对外展示标题。
     * @param DisplayTitle 镜像对外展示标题。
     */
    public void setDisplayTitle(String DisplayTitle) {
        this.DisplayTitle = DisplayTitle;
    }

    /**
     * Get 镜像对外展示版本。 
     * @return DisplayVersion 镜像对外展示版本。
     */
    public String getDisplayVersion() {
        return this.DisplayVersion;
    }

    /**
     * Set 镜像对外展示版本。
     * @param DisplayVersion 镜像对外展示版本。
     */
    public void setDisplayVersion(String DisplayVersion) {
        this.DisplayVersion = DisplayVersion;
    }

    /**
     * Get 镜像描述信息。 
     * @return Description 镜像描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 镜像描述信息。
     * @param Description 镜像描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 操作系统名称。 
     * @return OsName 操作系统名称。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称。
     * @param OsName 操作系统名称。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 操作系统平台。 
     * @return Platform 操作系统平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 操作系统平台。
     * @param Platform 操作系统平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 操作系统平台类型，如 LINUX_UNIX、WINDOWS。 
     * @return PlatformType 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
     */
    public String getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
     * @param PlatformType 操作系统平台类型，如 LINUX_UNIX、WINDOWS。
     */
    public void setPlatformType(String PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 镜像类型，如 APP_OS、PURE_OS、PRIVATE。 
     * @return BlueprintType 镜像类型，如 APP_OS、PURE_OS、PRIVATE。
     */
    public String getBlueprintType() {
        return this.BlueprintType;
    }

    /**
     * Set 镜像类型，如 APP_OS、PURE_OS、PRIVATE。
     * @param BlueprintType 镜像类型，如 APP_OS、PURE_OS、PRIVATE。
     */
    public void setBlueprintType(String BlueprintType) {
        this.BlueprintType = BlueprintType;
    }

    /**
     * Get 镜像图片 URL。 
     * @return ImageUrl 镜像图片 URL。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像图片 URL。
     * @param ImageUrl 镜像图片 URL。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 镜像所需系统盘大小，单位 GB。 
     * @return RequiredSystemDiskSize 镜像所需系统盘大小，单位 GB。
     */
    public Long getRequiredSystemDiskSize() {
        return this.RequiredSystemDiskSize;
    }

    /**
     * Set 镜像所需系统盘大小，单位 GB。
     * @param RequiredSystemDiskSize 镜像所需系统盘大小，单位 GB。
     */
    public void setRequiredSystemDiskSize(Long RequiredSystemDiskSize) {
        this.RequiredSystemDiskSize = RequiredSystemDiskSize;
    }

    /**
     * Get 镜像状态。 
     * @return BlueprintState 镜像状态。
     */
    public String getBlueprintState() {
        return this.BlueprintState;
    }

    /**
     * Set 镜像状态。
     * @param BlueprintState 镜像状态。
     */
    public void setBlueprintState(String BlueprintState) {
        this.BlueprintState = BlueprintState;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 镜像名称。 
     * @return BlueprintName 镜像名称。
     */
    public String getBlueprintName() {
        return this.BlueprintName;
    }

    /**
     * Set 镜像名称。
     * @param BlueprintName 镜像名称。
     */
    public void setBlueprintName(String BlueprintName) {
        this.BlueprintName = BlueprintName;
    }

    /**
     * Get 镜像是否支持自动化助手。 
     * @return SupportAutomationTools 镜像是否支持自动化助手。
     */
    public Boolean getSupportAutomationTools() {
        return this.SupportAutomationTools;
    }

    /**
     * Set 镜像是否支持自动化助手。
     * @param SupportAutomationTools 镜像是否支持自动化助手。
     */
    public void setSupportAutomationTools(Boolean SupportAutomationTools) {
        this.SupportAutomationTools = SupportAutomationTools;
    }

    /**
     * Get 镜像所需内存大小, 单位: GB 
     * @return RequiredMemorySize 镜像所需内存大小, 单位: GB
     */
    public Long getRequiredMemorySize() {
        return this.RequiredMemorySize;
    }

    /**
     * Set 镜像所需内存大小, 单位: GB
     * @param RequiredMemorySize 镜像所需内存大小, 单位: GB
     */
    public void setRequiredMemorySize(Long RequiredMemorySize) {
        this.RequiredMemorySize = RequiredMemorySize;
    }

    /**
     * Get CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public Blueprint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Blueprint(Blueprint source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.DisplayTitle != null) {
            this.DisplayTitle = new String(source.DisplayTitle);
        }
        if (source.DisplayVersion != null) {
            this.DisplayVersion = new String(source.DisplayVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.PlatformType != null) {
            this.PlatformType = new String(source.PlatformType);
        }
        if (source.BlueprintType != null) {
            this.BlueprintType = new String(source.BlueprintType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.RequiredSystemDiskSize != null) {
            this.RequiredSystemDiskSize = new Long(source.RequiredSystemDiskSize);
        }
        if (source.BlueprintState != null) {
            this.BlueprintState = new String(source.BlueprintState);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.BlueprintName != null) {
            this.BlueprintName = new String(source.BlueprintName);
        }
        if (source.SupportAutomationTools != null) {
            this.SupportAutomationTools = new Boolean(source.SupportAutomationTools);
        }
        if (source.RequiredMemorySize != null) {
            this.RequiredMemorySize = new Long(source.RequiredMemorySize);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamSimple(map, prefix + "DisplayTitle", this.DisplayTitle);
        this.setParamSimple(map, prefix + "DisplayVersion", this.DisplayVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "BlueprintType", this.BlueprintType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RequiredSystemDiskSize", this.RequiredSystemDiskSize);
        this.setParamSimple(map, prefix + "BlueprintState", this.BlueprintState);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "BlueprintName", this.BlueprintName);
        this.setParamSimple(map, prefix + "SupportAutomationTools", this.SupportAutomationTools);
        this.setParamSimple(map, prefix + "RequiredMemorySize", this.RequiredMemorySize);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

