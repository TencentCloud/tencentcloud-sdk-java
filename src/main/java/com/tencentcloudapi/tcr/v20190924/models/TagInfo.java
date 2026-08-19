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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagInfo extends AbstractModel {

    /**
    * <p>Tag名称</p>
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * <p>制品的 ID</p>
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * <p>docker image 可以看到的id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>大小</p>
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * <p>制品的创建时间</p>
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <p>制品创建至今时间长度</p>
    */
    @SerializedName("DurationDays")
    @Expose
    private String DurationDays;

    /**
    * <p>标注的制品作者</p>
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * <p>标注的制品平台</p>
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>创建制品的 Docker 版本</p>
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * <p>标注的制品操作系统</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>制品大小，单位：Byte</p>
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
    * <p>序号</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>数据更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>制品更新时间</p>
    */
    @SerializedName("PushTime")
    @Expose
    private String PushTime;

    /**
    * <p>制品类型</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
     * Get <p>Tag名称</p> 
     * @return TagName <p>Tag名称</p>
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set <p>Tag名称</p>
     * @param TagName <p>Tag名称</p>
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get <p>制品的 ID</p> 
     * @return TagId <p>制品的 ID</p>
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set <p>制品的 ID</p>
     * @param TagId <p>制品的 ID</p>
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get <p>docker image 可以看到的id</p> 
     * @return ImageId <p>docker image 可以看到的id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>docker image 可以看到的id</p>
     * @param ImageId <p>docker image 可以看到的id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>大小</p> 
     * @return Size <p>大小</p>
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set <p>大小</p>
     * @param Size <p>大小</p>
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get <p>制品的创建时间</p> 
     * @return CreationTime <p>制品的创建时间</p>
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <p>制品的创建时间</p>
     * @param CreationTime <p>制品的创建时间</p>
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <p>制品创建至今时间长度</p> 
     * @return DurationDays <p>制品创建至今时间长度</p>
     */
    public String getDurationDays() {
        return this.DurationDays;
    }

    /**
     * Set <p>制品创建至今时间长度</p>
     * @param DurationDays <p>制品创建至今时间长度</p>
     */
    public void setDurationDays(String DurationDays) {
        this.DurationDays = DurationDays;
    }

    /**
     * Get <p>标注的制品作者</p> 
     * @return Author <p>标注的制品作者</p>
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set <p>标注的制品作者</p>
     * @param Author <p>标注的制品作者</p>
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get <p>标注的制品平台</p> 
     * @return Architecture <p>标注的制品平台</p>
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>标注的制品平台</p>
     * @param Architecture <p>标注的制品平台</p>
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>创建制品的 Docker 版本</p> 
     * @return DockerVersion <p>创建制品的 Docker 版本</p>
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set <p>创建制品的 Docker 版本</p>
     * @param DockerVersion <p>创建制品的 Docker 版本</p>
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get <p>标注的制品操作系统</p> 
     * @return OS <p>标注的制品操作系统</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>标注的制品操作系统</p>
     * @param OS <p>标注的制品操作系统</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>制品大小，单位：Byte</p> 
     * @return SizeByte <p>制品大小，单位：Byte</p>
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * Set <p>制品大小，单位：Byte</p>
     * @param SizeByte <p>制品大小，单位：Byte</p>
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * Get <p>序号</p> 
     * @return Id <p>序号</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>序号</p>
     * @param Id <p>序号</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>数据更新时间</p> 
     * @return UpdateTime <p>数据更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>数据更新时间</p>
     * @param UpdateTime <p>数据更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>制品更新时间</p> 
     * @return PushTime <p>制品更新时间</p>
     */
    public String getPushTime() {
        return this.PushTime;
    }

    /**
     * Set <p>制品更新时间</p>
     * @param PushTime <p>制品更新时间</p>
     */
    public void setPushTime(String PushTime) {
        this.PushTime = PushTime;
    }

    /**
     * Get <p>制品类型</p> 
     * @return Kind <p>制品类型</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>制品类型</p>
     * @param Kind <p>制品类型</p>
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

