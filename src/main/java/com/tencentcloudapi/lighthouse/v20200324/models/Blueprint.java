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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Blueprint extends AbstractModel {

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
注意：此字段可能返回 null，表示取不到有效值。
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
    * 镜像类型，如 APP_OS（应用镜像）, PURE_OS（系统镜像）, DOCKER（容器）, PRIVATE（私有镜像）, SHARED（共享镜像）, GAME_PORTAL（游戏专区镜像）。
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
    * 镜像状态，镜镜像状态，NORMAL（正常）、SYNCING（同步中）、OFFLINE（下线）、ISOLATED（已隔离）、CREATEFAILED（创建失败）、SYNCING_FAILED（目的地域同步失败）、ISOLATING（隔离中）、ISOLATED（已隔离）、DELETING（删除中）、DESTROYING（销毁中）。
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
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 官方网站Url。
    */
    @SerializedName("CommunityUrl")
    @Expose
    private String CommunityUrl;

    /**
    * 指导文章Url。
    */
    @SerializedName("GuideUrl")
    @Expose
    private String GuideUrl;

    /**
    * 镜像关联使用场景Id列表。
    */
    @SerializedName("SceneIdSet")
    @Expose
    private String [] SceneIdSet;

    /**
    * Docker版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * 镜像是否已共享。
    */
    @SerializedName("BlueprintShared")
    @Expose
    private Boolean BlueprintShared;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 镜像描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 镜像描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 镜像描述信息。
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 镜像类型，如 APP_OS（应用镜像）, PURE_OS（系统镜像）, DOCKER（容器）, PRIVATE（私有镜像）, SHARED（共享镜像）, GAME_PORTAL（游戏专区镜像）。 
     * @return BlueprintType 镜像类型，如 APP_OS（应用镜像）, PURE_OS（系统镜像）, DOCKER（容器）, PRIVATE（私有镜像）, SHARED（共享镜像）, GAME_PORTAL（游戏专区镜像）。
     */
    public String getBlueprintType() {
        return this.BlueprintType;
    }

    /**
     * Set 镜像类型，如 APP_OS（应用镜像）, PURE_OS（系统镜像）, DOCKER（容器）, PRIVATE（私有镜像）, SHARED（共享镜像）, GAME_PORTAL（游戏专区镜像）。
     * @param BlueprintType 镜像类型，如 APP_OS（应用镜像）, PURE_OS（系统镜像）, DOCKER（容器）, PRIVATE（私有镜像）, SHARED（共享镜像）, GAME_PORTAL（游戏专区镜像）。
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
     * Get 镜像状态，镜镜像状态，NORMAL（正常）、SYNCING（同步中）、OFFLINE（下线）、ISOLATED（已隔离）、CREATEFAILED（创建失败）、SYNCING_FAILED（目的地域同步失败）、ISOLATING（隔离中）、ISOLATED（已隔离）、DELETING（删除中）、DESTROYING（销毁中）。 
     * @return BlueprintState 镜像状态，镜镜像状态，NORMAL（正常）、SYNCING（同步中）、OFFLINE（下线）、ISOLATED（已隔离）、CREATEFAILED（创建失败）、SYNCING_FAILED（目的地域同步失败）、ISOLATING（隔离中）、ISOLATED（已隔离）、DELETING（删除中）、DESTROYING（销毁中）。
     */
    public String getBlueprintState() {
        return this.BlueprintState;
    }

    /**
     * Set 镜像状态，镜镜像状态，NORMAL（正常）、SYNCING（同步中）、OFFLINE（下线）、ISOLATED（已隔离）、CREATEFAILED（创建失败）、SYNCING_FAILED（目的地域同步失败）、ISOLATING（隔离中）、ISOLATED（已隔离）、DELETING（删除中）、DESTROYING（销毁中）。
     * @param BlueprintState 镜像状态，镜镜像状态，NORMAL（正常）、SYNCING（同步中）、OFFLINE（下线）、ISOLATED（已隔离）、CREATEFAILED（创建失败）、SYNCING_FAILED（目的地域同步失败）、ISOLATING（隔离中）、ISOLATED（已隔离）、DELETING（删除中）、DESTROYING（销毁中）。
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
     * @return ImageId CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
     * @param ImageId CVM镜像共享到轻量应用服务器轻量应用服务器后的CVM镜像ID。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 官方网站Url。 
     * @return CommunityUrl 官方网站Url。
     */
    public String getCommunityUrl() {
        return this.CommunityUrl;
    }

    /**
     * Set 官方网站Url。
     * @param CommunityUrl 官方网站Url。
     */
    public void setCommunityUrl(String CommunityUrl) {
        this.CommunityUrl = CommunityUrl;
    }

    /**
     * Get 指导文章Url。 
     * @return GuideUrl 指导文章Url。
     */
    public String getGuideUrl() {
        return this.GuideUrl;
    }

    /**
     * Set 指导文章Url。
     * @param GuideUrl 指导文章Url。
     */
    public void setGuideUrl(String GuideUrl) {
        this.GuideUrl = GuideUrl;
    }

    /**
     * Get 镜像关联使用场景Id列表。 
     * @return SceneIdSet 镜像关联使用场景Id列表。
     */
    public String [] getSceneIdSet() {
        return this.SceneIdSet;
    }

    /**
     * Set 镜像关联使用场景Id列表。
     * @param SceneIdSet 镜像关联使用场景Id列表。
     */
    public void setSceneIdSet(String [] SceneIdSet) {
        this.SceneIdSet = SceneIdSet;
    }

    /**
     * Get Docker版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DockerVersion Docker版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set Docker版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DockerVersion Docker版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get 镜像是否已共享。 
     * @return BlueprintShared 镜像是否已共享。
     */
    public Boolean getBlueprintShared() {
        return this.BlueprintShared;
    }

    /**
     * Set 镜像是否已共享。
     * @param BlueprintShared 镜像是否已共享。
     */
    public void setBlueprintShared(Boolean BlueprintShared) {
        this.BlueprintShared = BlueprintShared;
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
        if (source.CommunityUrl != null) {
            this.CommunityUrl = new String(source.CommunityUrl);
        }
        if (source.GuideUrl != null) {
            this.GuideUrl = new String(source.GuideUrl);
        }
        if (source.SceneIdSet != null) {
            this.SceneIdSet = new String[source.SceneIdSet.length];
            for (int i = 0; i < source.SceneIdSet.length; i++) {
                this.SceneIdSet[i] = new String(source.SceneIdSet[i]);
            }
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.BlueprintShared != null) {
            this.BlueprintShared = new Boolean(source.BlueprintShared);
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
        this.setParamSimple(map, prefix + "CommunityUrl", this.CommunityUrl);
        this.setParamSimple(map, prefix + "GuideUrl", this.GuideUrl);
        this.setParamArraySimple(map, prefix + "SceneIdSet.", this.SceneIdSet);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "BlueprintShared", this.BlueprintShared);

    }
}

