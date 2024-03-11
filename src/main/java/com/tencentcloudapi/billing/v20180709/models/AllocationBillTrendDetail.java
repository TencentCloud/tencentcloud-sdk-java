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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationBillTrendDetail extends AbstractModel {

    /**
    * 账单月份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 账单月份展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
     * Get 账单月份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Month 账单月份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 账单月份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Month 账单月份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 账单月份展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 账单月份展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账单月份展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 账单月份展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalCost 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalCost 合计费用(折后总额)：分账单元总费用，归集费用(折后总额) + 分摊费用(折后总额)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    public AllocationBillTrendDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationBillTrendDetail(AllocationBillTrendDetail source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);

    }
}

