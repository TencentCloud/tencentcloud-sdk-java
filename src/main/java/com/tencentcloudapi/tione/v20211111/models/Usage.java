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

public class Usage extends AbstractModel{

    /**
    * 生成的token数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletionTokens")
    @Expose
    private Long CompletionTokens;

    /**
    * 输入的token数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptTokens")
    @Expose
    private Long PromptTokens;

    /**
    * 总共token数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get 生成的token数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletionTokens 生成的token数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompletionTokens() {
        return this.CompletionTokens;
    }

    /**
     * Set 生成的token数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletionTokens 生成的token数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletionTokens(Long CompletionTokens) {
        this.CompletionTokens = CompletionTokens;
    }

    /**
     * Get 输入的token数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptTokens 输入的token数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPromptTokens() {
        return this.PromptTokens;
    }

    /**
     * Set 输入的token数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptTokens 输入的token数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptTokens(Long PromptTokens) {
        this.PromptTokens = PromptTokens;
    }

    /**
     * Get 总共token数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTokens 总共token数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 总共token数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTokens 总共token数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public Usage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Usage(Usage source) {
        if (source.CompletionTokens != null) {
            this.CompletionTokens = new Long(source.CompletionTokens);
        }
        if (source.PromptTokens != null) {
            this.PromptTokens = new Long(source.PromptTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompletionTokens", this.CompletionTokens);
        this.setParamSimple(map, prefix + "PromptTokens", this.PromptTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

