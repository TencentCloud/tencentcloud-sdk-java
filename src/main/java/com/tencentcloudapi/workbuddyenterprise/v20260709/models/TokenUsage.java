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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenUsage extends AbstractModel {

    /**
    * <p>输入Token</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>输出Token</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>总Token</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>统计口径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
     * Get <p>输入Token</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputTokens <p>输入Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputTokens <p>输入Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>输出Token</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputTokens <p>输出Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputTokens <p>输出Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>总Token</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalTokens <p>总Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>总Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalTokens <p>总Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>统计口径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope <p>统计口径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>统计口径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope <p>统计口径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public TokenUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenUsage(TokenUsage source) {
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

