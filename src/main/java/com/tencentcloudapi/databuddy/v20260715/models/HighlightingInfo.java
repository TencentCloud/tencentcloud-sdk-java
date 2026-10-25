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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightingInfo extends AbstractModel {

    /**
    * <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>代码片段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeFragments")
    @Expose
    private Fragment [] CodeFragments;

    /**
    * <p>文本片段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextFragments")
    @Expose
    private Fragment [] TextFragments;

    /**
    * <p>标签(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagFragments")
    @Expose
    private TagInfo [] TagFragments;

    /**
    * <p>别名高亮片段列表。使用场景：资产别名命中关键词时，返回带 <em></em> 标签的高亮片段供前端渲染</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasFragments")
    @Expose
    private String [] AliasFragments;

    /**
     * Get <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName <p>资产名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullName <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullName <p>资产全名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>代码片段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeFragments <p>代码片段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Fragment [] getCodeFragments() {
        return this.CodeFragments;
    }

    /**
     * Set <p>代码片段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeFragments <p>代码片段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeFragments(Fragment [] CodeFragments) {
        this.CodeFragments = CodeFragments;
    }

    /**
     * Get <p>文本片段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextFragments <p>文本片段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Fragment [] getTextFragments() {
        return this.TextFragments;
    }

    /**
     * Set <p>文本片段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextFragments <p>文本片段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextFragments(Fragment [] TextFragments) {
        this.TextFragments = TextFragments;
    }

    /**
     * Get <p>标签(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签(废弃)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagFragments <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTagFragments() {
        return this.TagFragments;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagFragments <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagFragments(TagInfo [] TagFragments) {
        this.TagFragments = TagFragments;
    }

    /**
     * Get <p>别名高亮片段列表。使用场景：资产别名命中关键词时，返回带 <em></em> 标签的高亮片段供前端渲染</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasFragments <p>别名高亮片段列表。使用场景：资产别名命中关键词时，返回带 <em></em> 标签的高亮片段供前端渲染</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAliasFragments() {
        return this.AliasFragments;
    }

    /**
     * Set <p>别名高亮片段列表。使用场景：资产别名命中关键词时，返回带 <em></em> 标签的高亮片段供前端渲染</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasFragments <p>别名高亮片段列表。使用场景：资产别名命中关键词时，返回带 <em></em> 标签的高亮片段供前端渲染</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasFragments(String [] AliasFragments) {
        this.AliasFragments = AliasFragments;
    }

    public HighlightingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightingInfo(HighlightingInfo source) {
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CodeFragments != null) {
            this.CodeFragments = new Fragment[source.CodeFragments.length];
            for (int i = 0; i < source.CodeFragments.length; i++) {
                this.CodeFragments[i] = new Fragment(source.CodeFragments[i]);
            }
        }
        if (source.TextFragments != null) {
            this.TextFragments = new Fragment[source.TextFragments.length];
            for (int i = 0; i < source.TextFragments.length; i++) {
                this.TextFragments[i] = new Fragment(source.TextFragments[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TagFragments != null) {
            this.TagFragments = new TagInfo[source.TagFragments.length];
            for (int i = 0; i < source.TagFragments.length; i++) {
                this.TagFragments[i] = new TagInfo(source.TagFragments[i]);
            }
        }
        if (source.AliasFragments != null) {
            this.AliasFragments = new String[source.AliasFragments.length];
            for (int i = 0; i < source.AliasFragments.length; i++) {
                this.AliasFragments[i] = new String(source.AliasFragments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "CodeFragments.", this.CodeFragments);
        this.setParamArrayObj(map, prefix + "TextFragments.", this.TextFragments);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "TagFragments.", this.TagFragments);
        this.setParamArraySimple(map, prefix + "AliasFragments.", this.AliasFragments);

    }
}

