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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LemmaInfo extends AbstractModel{

    /**
    * 词条
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LemmaTitle")
    @Expose
    private String LemmaTitle;

    /**
    * 词条描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LemmaAbstract")
    @Expose
    private String LemmaAbstract;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 词条
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LemmaTitle 词条
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLemmaTitle() {
        return this.LemmaTitle;
    }

    /**
     * Set 词条
注意：此字段可能返回 null，表示取不到有效值。
     * @param LemmaTitle 词条
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLemmaTitle(String LemmaTitle) {
        this.LemmaTitle = LemmaTitle;
    }

    /**
     * Get 词条描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LemmaAbstract 词条描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLemmaAbstract() {
        return this.LemmaAbstract;
    }

    /**
     * Set 词条描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param LemmaAbstract 词条描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLemmaAbstract(String LemmaAbstract) {
        this.LemmaAbstract = LemmaAbstract;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public LemmaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LemmaInfo(LemmaInfo source) {
        if (source.LemmaTitle != null) {
            this.LemmaTitle = new String(source.LemmaTitle);
        }
        if (source.LemmaAbstract != null) {
            this.LemmaAbstract = new String(source.LemmaAbstract);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LemmaTitle", this.LemmaTitle);
        this.setParamSimple(map, prefix + "LemmaAbstract", this.LemmaAbstract);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

