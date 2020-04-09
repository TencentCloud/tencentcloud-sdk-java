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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialBasicInfo extends AbstractModel{

    /**
    * 素材 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 素材类型，取值为：音频（AUDIO）、视频（VIDEO）、图片（IMAGE）、链接（LINK）、字幕 （SUBTITLE）、转场（TRANSITION）、滤镜（FILTER）、文本文字（TEXT）、图文动效（TEXT_IMAGE）。
    */
    @SerializedName("MaterialType")
    @Expose
    private String MaterialType;

    /**
    * 素材归属实体。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 素材名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 素材文件的创建时间，使用 ISO 日期格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 素材文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 素材的分类目录路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 素材标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 素材媒体文件的预览图。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get 素材 Id。 
     * @return MaterialId 素材 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材 Id。
     * @param MaterialId 素材 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 素材类型，取值为：音频（AUDIO）、视频（VIDEO）、图片（IMAGE）、链接（LINK）、字幕 （SUBTITLE）、转场（TRANSITION）、滤镜（FILTER）、文本文字（TEXT）、图文动效（TEXT_IMAGE）。 
     * @return MaterialType 素材类型，取值为：音频（AUDIO）、视频（VIDEO）、图片（IMAGE）、链接（LINK）、字幕 （SUBTITLE）、转场（TRANSITION）、滤镜（FILTER）、文本文字（TEXT）、图文动效（TEXT_IMAGE）。
     */
    public String getMaterialType() {
        return this.MaterialType;
    }

    /**
     * Set 素材类型，取值为：音频（AUDIO）、视频（VIDEO）、图片（IMAGE）、链接（LINK）、字幕 （SUBTITLE）、转场（TRANSITION）、滤镜（FILTER）、文本文字（TEXT）、图文动效（TEXT_IMAGE）。
     * @param MaterialType 素材类型，取值为：音频（AUDIO）、视频（VIDEO）、图片（IMAGE）、链接（LINK）、字幕 （SUBTITLE）、转场（TRANSITION）、滤镜（FILTER）、文本文字（TEXT）、图文动效（TEXT_IMAGE）。
     */
    public void setMaterialType(String MaterialType) {
        this.MaterialType = MaterialType;
    }

    /**
     * Get 素材归属实体。 
     * @return Owner 素材归属实体。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 素材归属实体。
     * @param Owner 素材归属实体。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 素材名称。 
     * @return Name 素材名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 素材名称。
     * @param Name 素材名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 素材文件的创建时间，使用 ISO 日期格式。 
     * @return CreateTime 素材文件的创建时间，使用 ISO 日期格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 素材文件的创建时间，使用 ISO 日期格式。
     * @param CreateTime 素材文件的创建时间，使用 ISO 日期格式。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 素材文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。 
     * @return UpdateTime 素材文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 素材文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
     * @param UpdateTime 素材文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 素材的分类目录路径。 
     * @return ClassPath 素材的分类目录路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 素材的分类目录路径。
     * @param ClassPath 素材的分类目录路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 素材标签信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 素材标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 素材标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 素材标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 素材媒体文件的预览图。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewUrl 素材媒体文件的预览图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 素材媒体文件的预览图。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewUrl 素材媒体文件的预览图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "MaterialType", this.MaterialType);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

