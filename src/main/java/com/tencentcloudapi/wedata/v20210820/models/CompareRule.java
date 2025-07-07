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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareRule extends AbstractModel {

    /**
    * 比较条件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private CompareRuleItem [] Items;

    /**
    * 周期性模板默认周期，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * o 表示 或，a 表示 且，数字表示items下标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeExpression")
    @Expose
    private String ComputeExpression;

    /**
     * Get 比较条件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 比较条件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareRuleItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 比较条件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 比较条件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(CompareRuleItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 周期性模板默认周期，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep 周期性模板默认周期，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 周期性模板默认周期，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep 周期性模板默认周期，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get o 表示 或，a 表示 且，数字表示items下标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeExpression o 表示 或，a 表示 且，数字表示items下标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeExpression() {
        return this.ComputeExpression;
    }

    /**
     * Set o 表示 或，a 表示 且，数字表示items下标
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeExpression o 表示 或，a 表示 且，数字表示items下标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeExpression(String ComputeExpression) {
        this.ComputeExpression = ComputeExpression;
    }

    public CompareRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareRule(CompareRule source) {
        if (source.Items != null) {
            this.Items = new CompareRuleItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CompareRuleItem(source.Items[i]);
            }
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.ComputeExpression != null) {
            this.ComputeExpression = new String(source.ComputeExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "ComputeExpression", this.ComputeExpression);

    }
}

