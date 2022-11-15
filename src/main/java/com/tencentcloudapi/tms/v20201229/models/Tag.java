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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel{

    /**
    * 该字段用于返回命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 该字段用于返回子标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该字段用于返回子标签对应的分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get 该字段用于返回命中的关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keyword 该字段用于返回命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 该字段用于返回命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keyword 该字段用于返回命中的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 该字段用于返回子标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubLabel 该字段用于返回子标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回子标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubLabel 该字段用于返回子标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 该字段用于返回子标签对应的分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 该字段用于返回子标签对应的分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回子标签对应的分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 该字段用于返回子标签对应的分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

