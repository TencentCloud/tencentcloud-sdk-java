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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleEmbedTemplateItem extends AbstractModel {

    /**
    * 字幕压制模板唯一标识
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 字幕压制模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字幕压制模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 删除标记，0 未删除 1 删除
    */
    @SerializedName("DeleteTag")
    @Expose
    private Long DeleteTag;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 字幕压制模块配置
    */
    @SerializedName("SubtitleEmbedConfig")
    @Expose
    private SubtitleEmbedConfig SubtitleEmbedConfig;

    /**
    * 字幕压制模板英文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
     * Get 字幕压制模板唯一标识 
     * @return Definition 字幕压制模板唯一标识
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 字幕压制模板唯一标识
     * @param Definition 字幕压制模板唯一标识
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 字幕压制模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 字幕压制模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字幕压制模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 字幕压制模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字幕压制模板描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 字幕压制模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 字幕压制模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 字幕压制模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 删除标记，0 未删除 1 删除 
     * @return DeleteTag 删除标记，0 未删除 1 删除
     */
    public Long getDeleteTag() {
        return this.DeleteTag;
    }

    /**
     * Set 删除标记，0 未删除 1 删除
     * @param DeleteTag 删除标记，0 未删除 1 删除
     */
    public void setDeleteTag(Long DeleteTag) {
        this.DeleteTag = DeleteTag;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 字幕压制模块配置 
     * @return SubtitleEmbedConfig 字幕压制模块配置
     */
    public SubtitleEmbedConfig getSubtitleEmbedConfig() {
        return this.SubtitleEmbedConfig;
    }

    /**
     * Set 字幕压制模块配置
     * @param SubtitleEmbedConfig 字幕压制模块配置
     */
    public void setSubtitleEmbedConfig(SubtitleEmbedConfig SubtitleEmbedConfig) {
        this.SubtitleEmbedConfig = SubtitleEmbedConfig;
    }

    /**
     * Get 字幕压制模板英文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 字幕压制模板英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 字幕压制模板英文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 字幕压制模板英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    public SubtitleEmbedTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleEmbedTemplateItem(SubtitleEmbedTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DeleteTag != null) {
            this.DeleteTag = new Long(source.DeleteTag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SubtitleEmbedConfig != null) {
            this.SubtitleEmbedConfig = new SubtitleEmbedConfig(source.SubtitleEmbedConfig);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DeleteTag", this.DeleteTag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "SubtitleEmbedConfig.", this.SubtitleEmbedConfig);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);

    }
}

