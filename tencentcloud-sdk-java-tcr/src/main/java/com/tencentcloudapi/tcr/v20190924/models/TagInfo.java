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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagInfo extends AbstractModel{

    /**
    * Tag名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 镜像Id
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * docker image 可以看到的id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 镜像的创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 镜像创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationDays")
    @Expose
    private String DurationDays;

    /**
    * 镜像的作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 次镜像建议运行的系统架构
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 创建此镜像的docker版本
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * 此镜像建议运行系统
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * SizeByte
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 镜像更新时间
    */
    @SerializedName("PushTime")
    @Expose
    private String PushTime;

    /**
     * Get Tag名称 
     * @return TagName Tag名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set Tag名称
     * @param TagName Tag名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 镜像Id 
     * @return TagId 镜像Id
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 镜像Id
     * @param TagId 镜像Id
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get docker image 可以看到的id 
     * @return ImageId docker image 可以看到的id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set docker image 可以看到的id
     * @param ImageId docker image 可以看到的id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 大小 
     * @return Size 大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 大小
     * @param Size 大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 镜像的创建时间 
     * @return CreationTime 镜像的创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 镜像的创建时间
     * @param CreationTime 镜像的创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 镜像创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationDays 镜像创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDurationDays() {
        return this.DurationDays;
    }

    /**
     * Set 镜像创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationDays 镜像创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationDays(String DurationDays) {
        this.DurationDays = DurationDays;
    }

    /**
     * Get 镜像的作者 
     * @return Author 镜像的作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 镜像的作者
     * @param Author 镜像的作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 次镜像建议运行的系统架构 
     * @return Architecture 次镜像建议运行的系统架构
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 次镜像建议运行的系统架构
     * @param Architecture 次镜像建议运行的系统架构
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 创建此镜像的docker版本 
     * @return DockerVersion 创建此镜像的docker版本
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set 创建此镜像的docker版本
     * @param DockerVersion 创建此镜像的docker版本
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get 此镜像建议运行系统 
     * @return OS 此镜像建议运行系统
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set 此镜像建议运行系统
     * @param OS 此镜像建议运行系统
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get SizeByte 
     * @return SizeByte SizeByte
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set SizeByte
     * @param SizeByte SizeByte
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get Id 
     * @return Id Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据更新时间 
     * @return UpdateTime 数据更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
     * @param UpdateTime 数据更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 镜像更新时间 
     * @return PushTime 镜像更新时间
     */
    public String getPushTime() {
        return this.PushTime;
    }

    /**
     * Set 镜像更新时间
     * @param PushTime 镜像更新时间
     */
    public void setPushTime(String PushTime) {
        this.PushTime = PushTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "DurationDays", this.DurationDays);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PushTime", this.PushTime);

    }
}

