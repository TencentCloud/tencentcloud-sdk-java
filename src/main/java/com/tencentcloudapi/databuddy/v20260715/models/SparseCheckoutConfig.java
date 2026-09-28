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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparseCheckoutConfig extends AbstractModel {

    /**
    * <p>是否启用稀疏检出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>是否使用 cone 模式（推荐 true，按目录匹配更高效）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConeMode")
    @Expose
    private Boolean ConeMode;

    /**
    * <p>稀疏检出路径列表（如 [&quot;src/module-a/&quot;, &quot;docs/&quot;]）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Patterns")
    @Expose
    private String [] Patterns;

    /**
     * Get <p>是否启用稀疏检出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled <p>是否启用稀疏检出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用稀疏检出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled <p>是否启用稀疏检出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>是否使用 cone 模式（推荐 true，按目录匹配更高效）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConeMode <p>是否使用 cone 模式（推荐 true，按目录匹配更高效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConeMode() {
        return this.ConeMode;
    }

    /**
     * Set <p>是否使用 cone 模式（推荐 true，按目录匹配更高效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConeMode <p>是否使用 cone 模式（推荐 true，按目录匹配更高效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConeMode(Boolean ConeMode) {
        this.ConeMode = ConeMode;
    }

    /**
     * Get <p>稀疏检出路径列表（如 [&quot;src/module-a/&quot;, &quot;docs/&quot;]）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Patterns <p>稀疏检出路径列表（如 [&quot;src/module-a/&quot;, &quot;docs/&quot;]）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPatterns() {
        return this.Patterns;
    }

    /**
     * Set <p>稀疏检出路径列表（如 [&quot;src/module-a/&quot;, &quot;docs/&quot;]）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Patterns <p>稀疏检出路径列表（如 [&quot;src/module-a/&quot;, &quot;docs/&quot;]）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPatterns(String [] Patterns) {
        this.Patterns = Patterns;
    }

    public SparseCheckoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparseCheckoutConfig(SparseCheckoutConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ConeMode != null) {
            this.ConeMode = new Boolean(source.ConeMode);
        }
        if (source.Patterns != null) {
            this.Patterns = new String[source.Patterns.length];
            for (int i = 0; i < source.Patterns.length; i++) {
                this.Patterns[i] = new String(source.Patterns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ConeMode", this.ConeMode);
        this.setParamArraySimple(map, prefix + "Patterns.", this.Patterns);

    }
}

