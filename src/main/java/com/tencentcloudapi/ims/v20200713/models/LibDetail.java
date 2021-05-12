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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibDetail extends AbstractModel{

    /**
    * 序号
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 仅当Label为Custom自定义关键词时有效，表示自定义库id
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 仅当Label为Custom自定义关键词时有效，表示自定义库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 图片ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 命中的模型分值
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

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
     * Get 仅当Label为Custom自定义关键词时有效，表示自定义库id 
     * @return LibId 仅当Label为Custom自定义关键词时有效，表示自定义库id
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 仅当Label为Custom自定义关键词时有效，表示自定义库id
     * @param LibId 仅当Label为Custom自定义关键词时有效，表示自定义库id
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 仅当Label为Custom自定义关键词时有效，表示自定义库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibName 仅当Label为Custom自定义关键词时有效，表示自定义库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 仅当Label为Custom自定义关键词时有效，表示自定义库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibName 仅当Label为Custom自定义关键词时有效，表示自定义库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 图片ID 
     * @return ImageId 图片ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 图片ID
     * @param ImageId 图片ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 恶意标签，Normal：正常，Porn：色情，Abuse：谩骂，Ad：广告，Custom：自定义词库。
以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 自定义标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 命中的模型分值 
     * @return Score 命中的模型分值
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 命中的模型分值
     * @param Score 命中的模型分值
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public LibDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibDetail(LibDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

