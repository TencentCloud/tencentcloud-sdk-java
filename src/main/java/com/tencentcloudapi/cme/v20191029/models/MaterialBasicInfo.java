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
    * 媒体 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 媒体类型，取值为：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片;</li>
<li> LINK  :链接.</li>
<li> OTHER : 其他.</li>
    */
    @SerializedName("MaterialType")
    @Expose
    private String MaterialType;

    /**
    * 媒体归属实体。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 媒体名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体文件的创建时间，使用 ISO 日期格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 媒体的分类路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 预置标签列表。
    */
    @SerializedName("PresetTagSet")
    @Expose
    private PresetTagInfo [] PresetTagSet;

    /**
    * 人工标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 媒体文件的预览图。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 媒体绑定的标签信息列表 。
该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInfoSet")
    @Expose
    private MaterialTagInfo [] TagInfoSet;

    /**
     * Get 媒体 Id。 
     * @return MaterialId 媒体 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 媒体 Id。
     * @param MaterialId 媒体 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 媒体类型，取值为：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片;</li>
<li> LINK  :链接.</li>
<li> OTHER : 其他.</li> 
     * @return MaterialType 媒体类型，取值为：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片;</li>
<li> LINK  :链接.</li>
<li> OTHER : 其他.</li>
     */
    public String getMaterialType() {
        return this.MaterialType;
    }

    /**
     * Set 媒体类型，取值为：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片;</li>
<li> LINK  :链接.</li>
<li> OTHER : 其他.</li>
     * @param MaterialType 媒体类型，取值为：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片;</li>
<li> LINK  :链接.</li>
<li> OTHER : 其他.</li>
     */
    public void setMaterialType(String MaterialType) {
        this.MaterialType = MaterialType;
    }

    /**
     * Get 媒体归属实体。 
     * @return Owner 媒体归属实体。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 媒体归属实体。
     * @param Owner 媒体归属实体。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 媒体名称。 
     * @return Name 媒体名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体名称。
     * @param Name 媒体名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体文件的创建时间，使用 ISO 日期格式。 
     * @return CreateTime 媒体文件的创建时间，使用 ISO 日期格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 媒体文件的创建时间，使用 ISO 日期格式。
     * @param CreateTime 媒体文件的创建时间，使用 ISO 日期格式。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。 
     * @return UpdateTime 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
     * @param UpdateTime 媒体文件的最近更新时间（如修改视频属性、发起视频处理等会触发更新媒体文件信息的操作），使用 ISO 日期格式。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 媒体的分类路径。 
     * @return ClassPath 媒体的分类路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体的分类路径。
     * @param ClassPath 媒体的分类路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 预置标签列表。 
     * @return PresetTagSet 预置标签列表。
     */
    public PresetTagInfo [] getPresetTagSet() {
        return this.PresetTagSet;
    }

    /**
     * Set 预置标签列表。
     * @param PresetTagSet 预置标签列表。
     */
    public void setPresetTagSet(PresetTagInfo [] PresetTagSet) {
        this.PresetTagSet = PresetTagSet;
    }

    /**
     * Get 人工标签列表。 
     * @return TagSet 人工标签列表。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 人工标签列表。
     * @param TagSet 人工标签列表。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 媒体文件的预览图。 
     * @return PreviewUrl 媒体文件的预览图。
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 媒体文件的预览图。
     * @param PreviewUrl 媒体文件的预览图。
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 媒体绑定的标签信息列表 。
该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInfoSet 媒体绑定的标签信息列表 。
该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialTagInfo [] getTagInfoSet() {
        return this.TagInfoSet;
    }

    /**
     * Set 媒体绑定的标签信息列表 。
该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInfoSet 媒体绑定的标签信息列表 。
该字段已废弃。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInfoSet(MaterialTagInfo [] TagInfoSet) {
        this.TagInfoSet = TagInfoSet;
    }

    public MaterialBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialBasicInfo(MaterialBasicInfo source) {
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.MaterialType != null) {
            this.MaterialType = new String(source.MaterialType);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
        if (source.PresetTagSet != null) {
            this.PresetTagSet = new PresetTagInfo[source.PresetTagSet.length];
            for (int i = 0; i < source.PresetTagSet.length; i++) {
                this.PresetTagSet[i] = new PresetTagInfo(source.PresetTagSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.TagInfoSet != null) {
            this.TagInfoSet = new MaterialTagInfo[source.TagInfoSet.length];
            for (int i = 0; i < source.TagInfoSet.length; i++) {
                this.TagInfoSet[i] = new MaterialTagInfo(source.TagInfoSet[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "PresetTagSet.", this.PresetTagSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamArrayObj(map, prefix + "TagInfoSet.", this.TagInfoSet);

    }
}

