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

public class ModelChatCompletionUsage extends AbstractModel {

    /**
    * <p>输入 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptTokens")
    @Expose
    private Long PromptTokens;

    /**
    * <p>输出 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletionTokens")
    @Expose
    private Long CompletionTokens;

    /**
    * <p>总 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get <p>输入 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptTokens <p>输入 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPromptTokens() {
        return this.PromptTokens;
    }

    /**
     * Set <p>输入 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptTokens <p>输入 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptTokens(Long PromptTokens) {
        this.PromptTokens = PromptTokens;
    }

    /**
     * Get <p>输出 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletionTokens <p>输出 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompletionTokens() {
        return this.CompletionTokens;
    }

    /**
     * Set <p>输出 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletionTokens <p>输出 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletionTokens(Long CompletionTokens) {
        this.CompletionTokens = CompletionTokens;
    }

    /**
     * Get <p>总 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTokens <p>总 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>总 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTokens <p>总 token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public ModelChatCompletionUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatCompletionUsage(ModelChatCompletionUsage source) {
        if (source.PromptTokens != null) {
            this.PromptTokens = new Long(source.PromptTokens);
        }
        if (source.CompletionTokens != null) {
            this.CompletionTokens = new Long(source.CompletionTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptTokens", this.PromptTokens);
        this.setParamSimple(map, prefix + "CompletionTokens", this.CompletionTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

