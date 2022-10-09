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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextLabelDistributionInfo extends AbstractModel{

    /**
    * 文本分类题目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Theme")
    @Expose
    private String Theme;

    /**
    * 一级标签分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassLabelList")
    @Expose
    private TextLabelDistributionDetailInfoFirstClass [] ClassLabelList;

    /**
     * Get 文本分类题目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Theme 文本分类题目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTheme() {
        return this.Theme;
    }

    /**
     * Set 文本分类题目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Theme 文本分类题目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    /**
     * Get 一级标签分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassLabelList 一级标签分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextLabelDistributionDetailInfoFirstClass [] getClassLabelList() {
        return this.ClassLabelList;
    }

    /**
     * Set 一级标签分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassLabelList 一级标签分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassLabelList(TextLabelDistributionDetailInfoFirstClass [] ClassLabelList) {
        this.ClassLabelList = ClassLabelList;
    }

    public TextLabelDistributionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextLabelDistributionInfo(TextLabelDistributionInfo source) {
        if (source.Theme != null) {
            this.Theme = new String(source.Theme);
        }
        if (source.ClassLabelList != null) {
            this.ClassLabelList = new TextLabelDistributionDetailInfoFirstClass[source.ClassLabelList.length];
            for (int i = 0; i < source.ClassLabelList.length; i++) {
                this.ClassLabelList[i] = new TextLabelDistributionDetailInfoFirstClass(source.ClassLabelList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Theme", this.Theme);
        this.setParamArrayObj(map, prefix + "ClassLabelList.", this.ClassLabelList);

    }
}

