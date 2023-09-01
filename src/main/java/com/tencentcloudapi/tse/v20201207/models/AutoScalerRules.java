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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalerRules extends AbstractModel{

    /**
    * 稳定窗口时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StabilizationWindowSeconds")
    @Expose
    private Long StabilizationWindowSeconds;

    /**
    * 选择策略依据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectPolicy")
    @Expose
    private String SelectPolicy;

    /**
    * 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policies")
    @Expose
    private AutoScalerPolicy [] Policies;

    /**
     * Get 稳定窗口时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StabilizationWindowSeconds 稳定窗口时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStabilizationWindowSeconds() {
        return this.StabilizationWindowSeconds;
    }

    /**
     * Set 稳定窗口时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StabilizationWindowSeconds 稳定窗口时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStabilizationWindowSeconds(Long StabilizationWindowSeconds) {
        this.StabilizationWindowSeconds = StabilizationWindowSeconds;
    }

    /**
     * Get 选择策略依据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectPolicy 选择策略依据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelectPolicy() {
        return this.SelectPolicy;
    }

    /**
     * Set 选择策略依据
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectPolicy 选择策略依据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectPolicy(String SelectPolicy) {
        this.SelectPolicy = SelectPolicy;
    }

    /**
     * Get 扩容策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policies 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoScalerPolicy [] getPolicies() {
        return this.Policies;
    }

    /**
     * Set 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policies 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicies(AutoScalerPolicy [] Policies) {
        this.Policies = Policies;
    }

    public AutoScalerRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalerRules(AutoScalerRules source) {
        if (source.StabilizationWindowSeconds != null) {
            this.StabilizationWindowSeconds = new Long(source.StabilizationWindowSeconds);
        }
        if (source.SelectPolicy != null) {
            this.SelectPolicy = new String(source.SelectPolicy);
        }
        if (source.Policies != null) {
            this.Policies = new AutoScalerPolicy[source.Policies.length];
            for (int i = 0; i < source.Policies.length; i++) {
                this.Policies[i] = new AutoScalerPolicy(source.Policies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StabilizationWindowSeconds", this.StabilizationWindowSeconds);
        this.setParamSimple(map, prefix + "SelectPolicy", this.SelectPolicy);
        this.setParamArrayObj(map, prefix + "Policies.", this.Policies);

    }
}

