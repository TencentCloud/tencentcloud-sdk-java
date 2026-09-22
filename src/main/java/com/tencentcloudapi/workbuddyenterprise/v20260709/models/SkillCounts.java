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

public class SkillCounts extends AbstractModel {

    /**
    * 内置技能数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Builtin")
    @Expose
    private Long Builtin;

    /**
    * 自建技能数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 内置技能数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Builtin 内置技能数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBuiltin() {
        return this.Builtin;
    }

    /**
     * Set 内置技能数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Builtin 内置技能数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuiltin(Long Builtin) {
        this.Builtin = Builtin;
    }

    /**
     * Get 自建技能数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Custom 自建技能数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * Set 自建技能数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Custom 自建技能数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public SkillCounts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillCounts(SkillCounts source) {
        if (source.Builtin != null) {
            this.Builtin = new Long(source.Builtin);
        }
        if (source.Custom != null) {
            this.Custom = new Long(source.Custom);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Builtin", this.Builtin);
        this.setParamSimple(map, prefix + "Custom", this.Custom);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

