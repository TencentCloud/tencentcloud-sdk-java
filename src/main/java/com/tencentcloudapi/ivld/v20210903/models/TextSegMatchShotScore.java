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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextSegMatchShotScore extends AbstractModel {

    /**
    * 数组第 i 个值表示该文本摘要和第 i 个镜头的匹配度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScoreSet")
    @Expose
    private Float [] ScoreSet;

    /**
     * Get 数组第 i 个值表示该文本摘要和第 i 个镜头的匹配度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScoreSet 数组第 i 个值表示该文本摘要和第 i 个镜头的匹配度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getScoreSet() {
        return this.ScoreSet;
    }

    /**
     * Set 数组第 i 个值表示该文本摘要和第 i 个镜头的匹配度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScoreSet 数组第 i 个值表示该文本摘要和第 i 个镜头的匹配度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScoreSet(Float [] ScoreSet) {
        this.ScoreSet = ScoreSet;
    }

    public TextSegMatchShotScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextSegMatchShotScore(TextSegMatchShotScore source) {
        if (source.ScoreSet != null) {
            this.ScoreSet = new Float[source.ScoreSet.length];
            for (int i = 0; i < source.ScoreSet.length; i++) {
                this.ScoreSet[i] = new Float(source.ScoreSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScoreSet.", this.ScoreSet);

    }
}

