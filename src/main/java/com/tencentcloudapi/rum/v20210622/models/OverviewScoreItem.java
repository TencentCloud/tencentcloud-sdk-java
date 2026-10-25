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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewScoreItem extends AbstractModel {

    /**
    * <p>计分项，如 crash / anr / lag</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>单项 0-100，缺失省略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>原始值（率为小数、耗时为 ms）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get <p>计分项，如 crash / anr / lag</p> 
     * @return Key <p>计分项，如 crash / anr / lag</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>计分项，如 crash / anr / lag</p>
     * @param Key <p>计分项，如 crash / anr / lag</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>单项 0-100，缺失省略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score <p>单项 0-100，缺失省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>单项 0-100，缺失省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score <p>单项 0-100，缺失省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>原始值（率为小数、耗时为 ms）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>原始值（率为小数、耗时为 ms）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set <p>原始值（率为小数、耗时为 ms）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>原始值（率为小数、耗时为 ms）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public OverviewScoreItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewScoreItem(OverviewScoreItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

