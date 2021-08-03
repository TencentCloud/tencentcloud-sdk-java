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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaBasicInfo extends AbstractModel{

    /**
    * 媒体文件名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体文件描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 媒体文件的分类 ID。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 媒体文件的分类名称。
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 媒体文件的封面图片地址。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 媒体文件的封装格式，例如 mp4、flv 等。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 原始媒体文件的 URL 地址。
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceInfo")
    @Expose
    private MediaSourceData SourceInfo;

    /**
    * 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 媒体文件的标签信息。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 直播录制文件的唯一标识。
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * 文件类型：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 文件状态：Normal：正常，Forbidden：封禁。

*注意：此字段暂不支持。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 媒体文件的存储类别：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
     * Get 媒体文件名称。 
     * @return Name 媒体文件名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体文件名称。
     * @param Name 媒体文件名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体文件描述。 
     * @return Description 媒体文件描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 媒体文件描述。
     * @param Description 媒体文件描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。 
     * @return ExpireTime 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
     * @param ExpireTime 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 媒体文件的分类 ID。 
     * @return ClassId 媒体文件的分类 ID。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 媒体文件的分类 ID。
     * @param ClassId 媒体文件的分类 ID。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 媒体文件的分类名称。 
     * @return ClassName 媒体文件的分类名称。
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 媒体文件的分类名称。
     * @param ClassName 媒体文件的分类名称。
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。 
     * @return ClassPath 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
     * @param ClassPath 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 媒体文件的封面图片地址。 
     * @return CoverUrl 媒体文件的封面图片地址。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 媒体文件的封面图片地址。
     * @param CoverUrl 媒体文件的封面图片地址。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 媒体文件的封装格式，例如 mp4、flv 等。 
     * @return Type 媒体文件的封装格式，例如 mp4、flv 等。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 媒体文件的封装格式，例如 mp4、flv 等。
     * @param Type 媒体文件的封装格式，例如 mp4、flv 等。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 原始媒体文件的 URL 地址。 
     * @return MediaUrl 原始媒体文件的 URL 地址。
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set 原始媒体文件的 URL 地址。
     * @param MediaUrl 原始媒体文件的 URL 地址。
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceInfo 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSourceData getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceInfo 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceInfo(MediaSourceData SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。 
     * @return StorageRegion 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
     * @param StorageRegion 媒体文件存储地区，如 ap-chongqing，参见[地域列表](https://cloud.tencent.com/document/product/266/9760#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 媒体文件的标签信息。 
     * @return TagSet 媒体文件的标签信息。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 媒体文件的标签信息。
     * @param TagSet 媒体文件的标签信息。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 直播录制文件的唯一标识。 
     * @return Vid 直播录制文件的唯一标识。
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set 直播录制文件的唯一标识。
     * @param Vid 直播录制文件的唯一标识。
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get 文件类型：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li> 
     * @return Category 文件类型：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 文件类型：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
     * @param Category 文件类型：
<li>Video: 视频文件</li>
<li>Audio: 音频文件</li>
<li>Image: 图片文件</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 文件状态：Normal：正常，Forbidden：封禁。

*注意：此字段暂不支持。 
     * @return Status 文件状态：Normal：正常，Forbidden：封禁。

*注意：此字段暂不支持。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 文件状态：Normal：正常，Forbidden：封禁。

*注意：此字段暂不支持。
     * @param Status 文件状态：Normal：正常，Forbidden：封禁。

*注意：此字段暂不支持。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 媒体文件的存储类别：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li> 
     * @return StorageClass 媒体文件的存储类别：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set 媒体文件的存储类别：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     * @param StorageClass 媒体文件的存储类别：
<li> STANDARD：标准存储。</li>
<li> STANDARD_IA：低频存储。</li>
<li> ARCHIVE：归档存储。</li>
<li> DEEP_ARCHIVE：深度归档存储。</li>
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    public MediaBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaBasicInfo(MediaBasicInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MediaUrl != null) {
            this.MediaUrl = new String(source.MediaUrl);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new MediaSourceData(source.SourceInfo);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.Vid != null) {
            this.Vid = new String(source.Vid);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);

    }
}

