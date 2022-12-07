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
    * 制品的 ID
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
    * 制品的创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 制品创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationDays")
    @Expose
    private String DurationDays;

    /**
    * 标注的制品作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 标注的制品平台
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 创建制品的 Docker 版本
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * 标注的制品操作系统
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * 制品大小
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * 序号
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
    * 制品更新时间
    */
    @SerializedName("PushTime")
    @Expose
    private String PushTime;

    /**
    * 制品类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

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
     * Get 制品的 ID 
     * @return TagId 制品的 ID
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 制品的 ID
     * @param TagId 制品的 ID
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
     * Get 制品的创建时间 
     * @return CreationTime 制品的创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 制品的创建时间
     * @param CreationTime 制品的创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 制品创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationDays 制品创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDurationDays() {
        return this.DurationDays;
    }

    /**
     * Set 制品创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationDays 制品创建至今时间长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationDays(String DurationDays) {
        this.DurationDays = DurationDays;
    }

    /**
     * Get 标注的制品作者 
     * @return Author 标注的制品作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 标注的制品作者
     * @param Author 标注的制品作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 标注的制品平台 
     * @return Architecture 标注的制品平台
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 标注的制品平台
     * @param Architecture 标注的制品平台
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 创建制品的 Docker 版本 
     * @return DockerVersion 创建制品的 Docker 版本
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set 创建制品的 Docker 版本
     * @param DockerVersion 创建制品的 Docker 版本
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get 标注的制品操作系统 
     * @return OS 标注的制品操作系统
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set 标注的制品操作系统
     * @param OS 标注的制品操作系统
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get 制品大小 
     * @return SizeByte 制品大小
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set 制品大小
     * @param SizeByte 制品大小
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get 序号 
     * @return Id 序号
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 序号
     * @param Id 序号
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
     * Get 制品更新时间 
     * @return PushTime 制品更新时间
     */
    public String getPushTime() {
        return this.PushTime;
    }

    /**
     * Set 制品更新时间
     * @param PushTime 制品更新时间
     */
    public void setPushTime(String PushTime) {
        this.PushTime = PushTime;
    }

    /**
     * Get 制品类型 
     * @return Kind 制品类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 制品类型
     * @param Kind 制品类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public TagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagInfo(TagInfo source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.DurationDays != null) {
            this.DurationDays = new String(source.DurationDays);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.SizeByte != null) {
            this.SizeByte = new Long(source.SizeByte);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PushTime != null) {
            this.PushTime = new String(source.PushTime);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
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
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

