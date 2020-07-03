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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像状态
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * 镜像类型
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 操作系统名称
    */
    @SerializedName("ImageOsName")
    @Expose
    private String ImageOsName;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 镜像导入时间
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * 操作系统位数
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 操作系统类型
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 操作系统版本
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * 操作系统平台
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 镜像所有者
    */
    @SerializedName("ImageOwner")
    @Expose
    private Long ImageOwner;

    /**
    * 镜像大小。单位：GB
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 镜像来源信息
    */
    @SerializedName("SrcImage")
    @Expose
    private SrcImage SrcImage;

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像状态 
     * @return ImageState 镜像状态
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set 镜像状态
     * @param ImageState 镜像状态
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get 镜像类型 
     * @return ImageType 镜像类型
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型
     * @param ImageType 镜像类型
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 操作系统名称 
     * @return ImageOsName 操作系统名称
     */
    public String getImageOsName() {
        return this.ImageOsName;
    }

    /**
     * Set 操作系统名称
     * @param ImageOsName 操作系统名称
     */
    public void setImageOsName(String ImageOsName) {
        this.ImageOsName = ImageOsName;
    }

    /**
     * Get 镜像描述 
     * @return ImageDescription 镜像描述
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述
     * @param ImageDescription 镜像描述
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 镜像导入时间 
     * @return ImageCreateTime 镜像导入时间
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set 镜像导入时间
     * @param ImageCreateTime 镜像导入时间
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get 操作系统位数 
     * @return Architecture 操作系统位数
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 操作系统位数
     * @param Architecture 操作系统位数
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 操作系统类型 
     * @return OsType 操作系统类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 操作系统类型
     * @param OsType 操作系统类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 操作系统版本 
     * @return OsVersion 操作系统版本
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 操作系统版本
     * @param OsVersion 操作系统版本
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get 操作系统平台 
     * @return Platform 操作系统平台
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 操作系统平台
     * @param Platform 操作系统平台
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 镜像所有者 
     * @return ImageOwner 镜像所有者
     */
    public Long getImageOwner() {
        return this.ImageOwner;
    }

    /**
     * Set 镜像所有者
     * @param ImageOwner 镜像所有者
     */
    public void setImageOwner(Long ImageOwner) {
        this.ImageOwner = ImageOwner;
    }

    /**
     * Get 镜像大小。单位：GB 
     * @return ImageSize 镜像大小。单位：GB
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小。单位：GB
     * @param ImageSize 镜像大小。单位：GB
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 镜像来源信息 
     * @return SrcImage 镜像来源信息
     */
    public SrcImage getSrcImage() {
        return this.SrcImage;
    }

    /**
     * Set 镜像来源信息
     * @param SrcImage 镜像来源信息
     */
    public void setSrcImage(SrcImage SrcImage) {
        this.SrcImage = SrcImage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageOsName", this.ImageOsName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ImageOwner", this.ImageOwner);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamObj(map, prefix + "SrcImage.", this.SrcImage);

    }
}

