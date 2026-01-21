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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileContent extends AbstractModel {

    /**
    * 对象键。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对象最后修改时间，为 ISO8601格式，例如2019-05-24T10:56:40Z。
    */
    @SerializedName("LastModified")
    @Expose
    private String LastModified;

    /**
    * 对象的实体标签（Entity Tag），是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化。
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * 对象大小，单位为Byte。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 枚举值请参见[存储类型](https://cloud.tencent.com/document/product/436/33417)文档，例如 STANDARD_IA，ARCHIVE。
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * 此文件对应的媒体文件的唯一标识。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件分类： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> <li>Other: 其他文件</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 可选值有：
 - OriginalFiles：原文件
- TranscodeFiles：转码文件
- AdaptiveDynamicStreamingFiles：转自适应码流文件
- SubtitleFiles：字幕文件
- SampleSnapshotFiles：采样截图文件
- ImageSpriteFiles：雪碧图截图文件
- SnapshotByTimeOffsetFiles：时间点截图文件

    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 视频模板号，模板定义参见转码模板。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 字幕ID。
仅当FileType=SubtitleFiles时有值。
    */
    @SerializedName("SubtitleID")
    @Expose
    private String SubtitleID;

    /**
     * Get 对象键。 
     * @return Key 对象键。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 对象键。
     * @param Key 对象键。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对象最后修改时间，为 ISO8601格式，例如2019-05-24T10:56:40Z。 
     * @return LastModified 对象最后修改时间，为 ISO8601格式，例如2019-05-24T10:56:40Z。
     */
    public String getLastModified() {
        return this.LastModified;
    }

    /**
     * Set 对象最后修改时间，为 ISO8601格式，例如2019-05-24T10:56:40Z。
     * @param LastModified 对象最后修改时间，为 ISO8601格式，例如2019-05-24T10:56:40Z。
     */
    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    /**
     * Get 对象的实体标签（Entity Tag），是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化。 
     * @return ETag 对象的实体标签（Entity Tag），是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化。
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set 对象的实体标签（Entity Tag），是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化。
     * @param ETag 对象的实体标签（Entity Tag），是对象被创建时标识对象内容的信息标签，可用于检查对象的内容是否发生变化。
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get 对象大小，单位为Byte。 
     * @return Size 对象大小，单位为Byte。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 对象大小，单位为Byte。
     * @param Size 对象大小，单位为Byte。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 枚举值请参见[存储类型](https://cloud.tencent.com/document/product/436/33417)文档，例如 STANDARD_IA，ARCHIVE。 
     * @return StorageClass 枚举值请参见[存储类型](https://cloud.tencent.com/document/product/436/33417)文档，例如 STANDARD_IA，ARCHIVE。
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set 枚举值请参见[存储类型](https://cloud.tencent.com/document/product/436/33417)文档，例如 STANDARD_IA，ARCHIVE。
     * @param StorageClass 枚举值请参见[存储类型](https://cloud.tencent.com/document/product/436/33417)文档，例如 STANDARD_IA，ARCHIVE。
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get 此文件对应的媒体文件的唯一标识。 
     * @return FileId 此文件对应的媒体文件的唯一标识。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 此文件对应的媒体文件的唯一标识。
     * @param FileId 此文件对应的媒体文件的唯一标识。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件分类： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> <li>Other: 其他文件</li> 
     * @return Category 文件分类： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> <li>Other: 其他文件</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 文件分类： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> <li>Other: 其他文件</li>
     * @param Category 文件分类： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> <li>Other: 其他文件</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 可选值有：
 - OriginalFiles：原文件
- TranscodeFiles：转码文件
- AdaptiveDynamicStreamingFiles：转自适应码流文件
- SubtitleFiles：字幕文件
- SampleSnapshotFiles：采样截图文件
- ImageSpriteFiles：雪碧图截图文件
- SnapshotByTimeOffsetFiles：时间点截图文件
 
     * @return FileType 可选值有：
 - OriginalFiles：原文件
- TranscodeFiles：转码文件
- AdaptiveDynamicStreamingFiles：转自适应码流文件
- SubtitleFiles：字幕文件
- SampleSnapshotFiles：采样截图文件
- ImageSpriteFiles：雪碧图截图文件
- SnapshotByTimeOffsetFiles：时间点截图文件

     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 可选值有：
 - OriginalFiles：原文件
- TranscodeFiles：转码文件
- AdaptiveDynamicStreamingFiles：转自适应码流文件
- SubtitleFiles：字幕文件
- SampleSnapshotFiles：采样截图文件
- ImageSpriteFiles：雪碧图截图文件
- SnapshotByTimeOffsetFiles：时间点截图文件

     * @param FileType 可选值有：
 - OriginalFiles：原文件
- TranscodeFiles：转码文件
- AdaptiveDynamicStreamingFiles：转自适应码流文件
- SubtitleFiles：字幕文件
- SampleSnapshotFiles：采样截图文件
- ImageSpriteFiles：雪碧图截图文件
- SnapshotByTimeOffsetFiles：时间点截图文件

     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 视频模板号，模板定义参见转码模板。 
     * @return Definition 视频模板号，模板定义参见转码模板。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 视频模板号，模板定义参见转码模板。
     * @param Definition 视频模板号，模板定义参见转码模板。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 字幕ID。
仅当FileType=SubtitleFiles时有值。 
     * @return SubtitleID 字幕ID。
仅当FileType=SubtitleFiles时有值。
     */
    public String getSubtitleID() {
        return this.SubtitleID;
    }

    /**
     * Set 字幕ID。
仅当FileType=SubtitleFiles时有值。
     * @param SubtitleID 字幕ID。
仅当FileType=SubtitleFiles时有值。
     */
    public void setSubtitleID(String SubtitleID) {
        this.SubtitleID = SubtitleID;
    }

    public FileContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileContent(FileContent source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.LastModified != null) {
            this.LastModified = new String(source.LastModified);
        }
        if (source.ETag != null) {
            this.ETag = new String(source.ETag);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubtitleID != null) {
            this.SubtitleID = new String(source.SubtitleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "LastModified", this.LastModified);
        this.setParamSimple(map, prefix + "ETag", this.ETag);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubtitleID", this.SubtitleID);

    }
}

