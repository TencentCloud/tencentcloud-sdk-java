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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareQualityResult extends AbstractModel {

    /**
    * 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private CompareQualityResultItem [] Items;

    /**
    * 检测总行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRows")
    @Expose
    private Long TotalRows;

    /**
    * 检测通过行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassRows")
    @Expose
    private Long PassRows;

    /**
    * 检测不通过行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerRows")
    @Expose
    private Long TriggerRows;

    /**
    * 比较关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeExpression")
    @Expose
    private String ComputeExpression;

    /**
     * Get 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareQualityResultItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(CompareQualityResultItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 检测总行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRows 检测总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRows() {
        return this.TotalRows;
    }

    /**
     * Set 检测总行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRows 检测总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRows(Long TotalRows) {
        this.TotalRows = TotalRows;
    }

    /**
     * Get 检测通过行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassRows 检测通过行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPassRows() {
        return this.PassRows;
    }

    /**
     * Set 检测通过行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassRows 检测通过行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassRows(Long PassRows) {
        this.PassRows = PassRows;
    }

    /**
     * Get 检测不通过行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerRows 检测不通过行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerRows() {
        return this.TriggerRows;
    }

    /**
     * Set 检测不通过行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerRows 检测不通过行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerRows(Long TriggerRows) {
        this.TriggerRows = TriggerRows;
    }

    /**
     * Get 比较关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeExpression 比较关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeExpression() {
        return this.ComputeExpression;
    }

    /**
     * Set 比较关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeExpression 比较关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeExpression(String ComputeExpression) {
        this.ComputeExpression = ComputeExpression;
    }

    public CompareQualityResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareQualityResult(CompareQualityResult source) {
        if (source.Items != null) {
            this.Items = new CompareQualityResultItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CompareQualityResultItem(source.Items[i]);
            }
        }
        if (source.TotalRows != null) {
            this.TotalRows = new Long(source.TotalRows);
        }
        if (source.PassRows != null) {
            this.PassRows = new Long(source.PassRows);
        }
        if (source.TriggerRows != null) {
            this.TriggerRows = new Long(source.TriggerRows);
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
        this.setParamSimple(map, prefix + "TotalRows", this.TotalRows);
        this.setParamSimple(map, prefix + "PassRows", this.PassRows);
        this.setParamSimple(map, prefix + "TriggerRows", this.TriggerRows);
        this.setParamSimple(map, prefix + "ComputeExpression", this.ComputeExpression);

    }
}

