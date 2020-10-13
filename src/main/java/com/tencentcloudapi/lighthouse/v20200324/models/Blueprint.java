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
    * 镜像 ID  ，是 blueprint 的唯一标识。
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
    * 镜像类型，如 APP_OS、PURE_OS。
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
    * 镜像所需系统盘大小
    */
    @SerializedName("RequiredSystemDiskSize")
    @Expose
    private Long RequiredSystemDiskSize;

    /**
    * 镜像状态，取值：ONLINE、OFFLINE
    */
    @SerializedName("BlueprintState")
    @Expose
    private String BlueprintState;

    /**
     * Get 镜像 ID  ，是 blueprint 的唯一标识。 
     * @return BlueprintId 镜像 ID  ，是 blueprint 的唯一标识。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像 ID  ，是 blueprint 的唯一标识。
     * @param BlueprintId 镜像 ID  ，是 blueprint 的唯一标识。
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
     * Get 镜像类型，如 APP_OS、PURE_OS。 
     * @return BlueprintType 镜像类型，如 APP_OS、PURE_OS。
     */
    public String getBlueprintType() {
        return this.BlueprintType;
    }

    /**
     * Set 镜像类型，如 APP_OS、PURE_OS。
     * @param BlueprintType 镜像类型，如 APP_OS、PURE_OS。
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
     * Get 镜像所需系统盘大小 
     * @return RequiredSystemDiskSize 镜像所需系统盘大小
     */
    public Long getRequiredSystemDiskSize() {
        return this.RequiredSystemDiskSize;
    }

    /**
     * Set 镜像所需系统盘大小
     * @param RequiredSystemDiskSize 镜像所需系统盘大小
     */
    public void setRequiredSystemDiskSize(Long RequiredSystemDiskSize) {
        this.RequiredSystemDiskSize = RequiredSystemDiskSize;
    }

    /**
     * Get 镜像状态，取值：ONLINE、OFFLINE 
     * @return BlueprintState 镜像状态，取值：ONLINE、OFFLINE
     */
    public String getBlueprintState() {
        return this.BlueprintState;
    }

    /**
     * Set 镜像状态，取值：ONLINE、OFFLINE
     * @param BlueprintState 镜像状态，取值：ONLINE、OFFLINE
     */
    public void setBlueprintState(String BlueprintState) {
        this.BlueprintState = BlueprintState;
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

    }
}

