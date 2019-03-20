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

public class MediaBasicInfo  extends AbstractModel{

    /**
    * 媒体文件名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体文件描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 媒体文件的分类 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 媒体文件的分类名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 媒体文件的封面图片地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 媒体文件的封装格式，例如 mp4、flv 等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 原始媒体文件的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
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
    * 媒体文件存储地区，如 ap-guangzhou，参见[地域列表](https://cloud.tencent.com/document/api/213/15692#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 媒体文件的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 直播录制文件的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
     * 获取媒体文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Name 媒体文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置媒体文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 媒体文件名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取媒体文件描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Description 媒体文件描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置媒体文件描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 媒体文件描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CreateTime 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 媒体文件的创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return UpdateTime 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ExpireTime 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 媒体文件的过期时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。“9999-12-31T23:59:59Z”表示永不过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 获取媒体文件的分类 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClassId 媒体文件的分类 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * 设置媒体文件的分类 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassId 媒体文件的分类 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * 获取媒体文件的分类名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClassName 媒体文件的分类名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * 设置媒体文件的分类名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassName 媒体文件的分类名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * 获取媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClassPath 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * 设置媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassPath 媒体文件的分类路径，分类间以“-”分隔，如“新的一级分类 - 新的二级分类”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * 获取媒体文件的封面图片地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CoverUrl 媒体文件的封面图片地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * 设置媒体文件的封面图片地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverUrl 媒体文件的封面图片地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * 获取媒体文件的封装格式，例如 mp4、flv 等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Type 媒体文件的封装格式，例如 mp4、flv 等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置媒体文件的封装格式，例如 mp4、flv 等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 媒体文件的封装格式，例如 mp4、flv 等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取原始媒体文件的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MediaUrl 原始媒体文件的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * 设置原始媒体文件的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaUrl 原始媒体文件的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * 获取该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SourceInfo 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSourceData getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * 设置该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceInfo 该媒体文件的来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceInfo(MediaSourceData SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * 获取媒体文件存储地区，如 ap-guangzhou，参见[地域列表](https://cloud.tencent.com/document/api/213/15692#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return StorageRegion 媒体文件存储地区，如 ap-guangzhou，参见[地域列表](https://cloud.tencent.com/document/api/213/15692#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * 设置媒体文件存储地区，如 ap-guangzhou，参见[地域列表](https://cloud.tencent.com/document/api/213/15692#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageRegion 媒体文件存储地区，如 ap-guangzhou，参见[地域列表](https://cloud.tencent.com/document/api/213/15692#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * 获取媒体文件的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TagSet 媒体文件的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置媒体文件的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 媒体文件的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 获取直播录制文件的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @return Vid 直播录制文件的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * 设置直播录制文件的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vid 直播录制文件的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

