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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextData extends AbstractModel{

    /**
    * 文本内容信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 文本概要信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 文本标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextTagSet")
    @Expose
    private MultiLevelTag TextTagSet;

    /**
     * Get 文本内容信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 文本内容信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 文本内容信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 文本概要信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 文本概要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 文本概要信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 文本概要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 文本标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextTagSet 文本标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiLevelTag getTextTagSet() {
        return this.TextTagSet;
    }

    /**
     * Set 文本标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextTagSet 文本标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextTagSet(MultiLevelTag TextTagSet) {
        this.TextTagSet = TextTagSet;
    }

    public TextData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextData(TextData source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.TextTagSet != null) {
            this.TextTagSet = new MultiLevelTag(source.TextTagSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamObj(map, prefix + "TextTagSet.", this.TextTagSet);

    }
}

