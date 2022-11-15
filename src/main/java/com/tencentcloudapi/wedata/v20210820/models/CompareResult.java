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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareResult extends AbstractModel{

    /**
    * 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private CompareResultItem [] Items;

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
     * Get 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareResultItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 对比结果项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(CompareResultItem [] Items) {
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

    public CompareResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareResult(CompareResult source) {
        if (source.Items != null) {
            this.Items = new CompareResultItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CompareResultItem(source.Items[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalRows", this.TotalRows);
        this.setParamSimple(map, prefix + "PassRows", this.PassRows);
        this.setParamSimple(map, prefix + "TriggerRows", this.TriggerRows);

    }
}

