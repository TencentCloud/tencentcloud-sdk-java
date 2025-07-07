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
package com.tencentcloudapi.vtc.v20240223.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslateResult extends AbstractModel {

    /**
    * 翻译源文字。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * 翻译后文字。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
     * Get 翻译源文字。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceText 翻译源文字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set 翻译源文字。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceText 翻译源文字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get 翻译后文字。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetText 翻译后文字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 翻译后文字。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetText 翻译后文字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    public TranslateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslateResult(TranslateResult source) {
        if (source.SourceText != null) {
            this.SourceText = new String(source.SourceText);
        }
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);

    }
}

